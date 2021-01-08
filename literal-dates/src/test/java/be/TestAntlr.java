package be;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.gui.TreeViewer;
import org.junit.Test;

/*
 * Copyright 2003-2009 LCM-ANMC, Inc. All rights reserved.
 * This source code is the property of LCM-ANMC, Direction
 * Informatique and cannot be copied or distributed without
 * the formal permission of LCM-ANMC.
 */

/**
 * TODO Document this class.
 * 
 * @author 7518379 [YourFullNameHere]
 */
public class TestAntlr {

    @Test
    public void test_TODAY_PLUS_1WEEK() throws Exception {

        testExpression("TODAY + 1W");

    }

    @Test
    public void test_today_PLUS_1week() throws Exception {

        testExpression("today + 1w");
    }

    @Test
    public void test_yesterday_PLUS_1year() throws Exception {

        testExpression("yesterday + 2 years");

    }

    @Test
    public void test_tomorrow_PLUS_1month() throws Exception {

        testExpression("tomorrow + 1 MONTH");

    }

    @Test
    public void test_01_02_1917_PLUS_1week_MINUS_1day() throws Exception {

        testExpression("[01-02-1917] + 1 week -1d");

    }

    @Test
    public void test_01_slash_02_slash_1917_PLUS_1week_MINUS_1day() throws Exception {

        testExpression("[01/02/1917] + 1 week -1d");

    }

    @Test
    public void test_PLUS_1day() throws Exception {

        testExpression("1d");

    }
    
    @Test
    public void test_explicitPLUS_1day() throws Exception {

        testExpression("+1d");

    }


    @Test
    public void test_MINUS_1day() throws Exception {

        testExpression("-1d");

    }

    @Test
    public void test_explicitPLUS_1day_PLUS_2weeks() throws Exception {

        testExpression("+1d +2weeks");

    }
    
    
    @Test
    public void test_BIRTHDATE_PLUS_1week_MINUS_1day() throws Exception {

        testExpression("{BIRTHDATE} ->  [28-12-1979]");

        testExpression("{BIRTHDATE} + 1 week -1d");

    }

    protected long computeDateExpression(String dateExpression) throws Exception {

        ANTLRInputStream in = new ANTLRInputStream(new StringReader(dateExpression));
        DateExpressionLexer lexer = new DateExpressionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DateExpressionParser parser = new DateExpressionParser(tokens);

        return parser.eval().value;
    }

    private void testExpression(String expression) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");

        long value = computeDateExpression(expression);

        System.out.println(expression + " and result is " + sdf.format(new Date(value)));
    }

    /**
     * This will show the AST graph.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String... args) throws Exception {

        ANTLRInputStream in = new ANTLRInputStream(new StringReader("[01-02-1917] + 1 week"));
        DateExpressionLexer lexer = new DateExpressionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DateExpressionParser parser = new DateExpressionParser(tokens);
        ParseTree tree = parser.eval();
        // show AST in GUI
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewr.setScale(1.5);// scale a little
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
