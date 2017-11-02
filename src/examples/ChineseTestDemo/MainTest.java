package examples.ChineseTestDemo;


import apg.Ast;
import apg.Parser;
import apg.Trace;
import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static java.lang.System.out;

/**
 * @Author: Alex.Z
 * @DATE: 2017/10/31
 * @Description:
 */
public class MainTest {


    @Test
    public void parseCall() throws Exception {


//      启动一个编译器
        Parser parser = new Parser(Call.getInstance());

//      设置编译器
        parser.setStartRule(Call.RuleNames.CALL.ruleID());
        Ast ast = parser.enableAst(true);

//      set abstract syntax tree
        int len = Call.RuleNames.values().length;
        ast.enableRuleNode(Call.RuleNames.CONTACT.ruleID(), true);



//      inputs:
        String inputString = "打给alex 1";
        parser.setInputString(inputString);

        Parser.Result result = parser.parse();
        if(result.success()){
            ast.display(out);
            out.println();
        } else{
            out.println("not success");
            Trace trace = parser.enableTrace(true);
            trace.setOut(out);

            parser.parse();
            out.println();

        }
    }
//
//
//    @Test
//    public void outputUtf8() throws UnsupportedEncodingException {
//        String str= new String("我喜欢你".getBytes(), "UTF-8");
//        System.out.println(str);
//    }
}
