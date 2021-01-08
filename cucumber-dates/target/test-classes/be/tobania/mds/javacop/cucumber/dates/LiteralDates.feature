Feature: Literal Date expressions

@Keywords
Scenario:	Today as a keyword
	Given today is '01/03/2019'
	When the parser evaluates the expression 'today'
	Then it returns '01/03/2019'
	
@Keywords
Scenario Outline: all keywords
	Given today is <today>
	When the parser evaluates the expression <expression>
	Then it returns <expected_date>
	
	Examples:
	|	today		| expression					|	expected_date	|
	|'01/03/2019'	| 'today'						|'01/03/2019'		|
	|'01/03/2019'	| 'tomorrow'					|'02/03/2019'		|	
	|'02/03/2019'	| 'yesterday'					|'01/03/2019'		|
	
@Arithmetics
Scenario Outline: some arithmectics with dates
	Given today is <today>
	When the parser evaluates the expression <expression>
	Then it returns <expected_date>
	
	Examples:
	|	today		| expression					|	expected_date	|
	|'01/03/2019'	| 'today +1 month'				|'01/04/2019'		|
	|'01/03/2019'	| 'today +1 year'				|'01/03/2020'		|	
