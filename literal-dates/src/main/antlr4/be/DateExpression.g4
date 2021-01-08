grammar DateExpression;

/**

Expressions to calculate dates from an initial date plus or minus several periods.

support for adding time periods as years, months, weeks and days.
support for initial date as today, tomorrow, yesterday, fixed value in the format dd/MM/yyyy or dd-MM-yyyy 
and variables set in the context.
exemples :


 
tomorrow + 1 month - 2 years

today + 6 day

[17-05-2011] + 8 weeks

- I set a variable in the context
{MyBirthdate} = [28/12/1979]
- Use my variable as initial date
{MyBirhtdate} + 34 years


returned value is time in millisec.

**/

compileUnit
    :   eval EOF
    ;
    
eval returns [long value]
    :    exp = timeExp {$value = $exp.value;}
   
    ;


assignExp returns [long value]
	: 	v=variable assignOp l=dateExp {$value = DateHelper.addVariable($v.text.substring(1, $v.text.length()-1), $l.value);}
	;



assignOp 
	:	'->'	
	
;
timeExp returns [long value]
    :    m1=dateExp       {$value =  $m1.value;} 
         ( '+' m2=PeriodExp {$value = DateHelper.addPeriod($value,$m2.text,true);} 
         | '-' m2=PeriodExp {$value = DateHelper.addPeriod($value,$m2.text,false);}
         )* 
    | exp = assignExp {$value = $exp.value;}
    | ('+')? p1=PeriodExp       {$value =  DateHelper.addPeriod(DateHelper.today(),$p1.text,true);} 
         ( '+' p2=PeriodExp {$value = DateHelper.addPeriod($value,$p2.text,true);} 
         | '-' p2=PeriodExp {$value = DateHelper.addPeriod($value,$p2.text,false);}
         )*
 	| '-' p1=PeriodExp       {$value =  DateHelper.addPeriod(DateHelper.today(),$p1.text,false);} 
         ( '+' p2=PeriodExp {$value = DateHelper.addPeriod($value,$p2.text,true);} 
         | '-' p2=PeriodExp {$value = DateHelper.addPeriod($value,$p2.text,false);}
         )*
 
    ;



dateExp returns [long value]
	:	n=literal {$value = DateHelper.parseDate($n.text.substring(1, $n.text.length()-1));}
	|	v=variable {$value = DateHelper.getVariable($v.text.substring(1, $v.text.length()-1));}
	|	('TODAY'|'today') {$value =  DateHelper.today();}
	|	('YESTERDAY'|'yesterday') {$value =  DateHelper.yesterday();}
	|	('TOMORROW'|'tomorrow') {$value =  DateHelper.tomorrow();}
	;
	
PeriodExp
	:	Year
	|	Month
	|	Week
	|	Day
	;
	
Year 
	: INT[1yY]?
	| INT (' ' | '\t')?  ('year' | 'YEAR' ) ('s'|'S')?
	;

Month 
	: INT[1mM]?
	| INT (' ' | '\t')? ('month' | 'MONTH' ) ('s'|'S')?
	;
    
Week 
	: INT[1wW]?
	| INT (' ' | '\t')? ('week' | 'WEEK' ) ('s'|'S')?
	;

Day 
	: INT[1dD]?
	| INT (' ' | '\t')? ('day' | 'DAY' ) ('s'|'S')?
	;
	
	
	
WS  
    :   (' ' | '\t' | '\r'| '\n') -> channel(HIDDEN)
    ;

variable 
	: '{' JavaLetter* '}'
	;    
	
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;
literal 
	: '[' DATE ']'
	;


fragment DIGIT : [0-9];

DATE    :       ('0'..'3')? DIGIT ('/'|'-') ('0'..'1')? DIGIT ('/'|'-') DIGIT DIGIT DIGIT DIGIT ;

number : INT | INT4 ;

INT4 : DIGIT DIGIT DIGIT DIGIT;
INT2 : DIGIT DIGIT;
INT : DIGIT+;

JAN : [Jj][Aa][Nn] ;
FEB : [Ff][Ee][Bb] ;
MAR : [Mm][Aa][Rr] ;
APR : [Aa][Pp][Rr] ;
MAY : [Mm][Aa][Yy] ; 
JUN : [Jj][Uu][Nn] ;
JUL : [Jj][Uu][Ll] ;
AUG : [Aa][Uu][Gg] ;
SEP : [Ss][Ee][Pp] ; 
OCT : [Oo][Cc][Tt] ; 
NOV : [Nn][Oo][Vv] ;
DEC : [Dd][Ee][Cc] ;

month : JAN | FEB | MAR | APR | MAY | JUN | JUL | AUG | SEP | OCT | NOV | DEC ;
