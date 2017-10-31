package examples.ChineseTestDemo;

import apg.Grammar;
import java.io.PrintStream;
/** This class has been generated automatically from an SABNF grammer by
 * Java APG, the {@link apg.Generator} class.<br>
 * It is an extension of the {@link apg.Grammar}
 * class containing additional members and enums not found
 * in the base class.<br>
 * The function {@link #getInstance()} will return a reference to a static,
 * singleton instance of the class.
 * <p>For more information visit <a href="http://www.coasttocoastresearch.com" target="_blank">http://www.coasttocoastresearch.com</a>. */

public class Call extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new Call(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 5;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>3</code>, name = <code>"contact"</code> */
        CONTACT("contact", 3, 7, 4),
        /** id = <code>4</code>, name = <code>"main"</code> */
        MAIN("main", 4, 11, 4),
        /** id = <code>0</code>, name = <code>"sp"</code> */
        SP("sp", 0, 0, 1),
        /** id = <code>1</code>, name = <code>"telephoneaction1"</code> */
        TELEPHONEACTION1("telephoneaction1", 1, 1, 3),
        /** id = <code>2</code>, name = <code>"telephoneaction2"</code> */
        TELEPHONEACTION2("telephoneaction2", 2, 4, 3);
        private String name;
        private int id;
        private int offset;
        private int count;
        RuleNames(String string, int id, int offset, int count){
            this.name = string;
            this.id = id;
            this.offset = offset;
            this.count = count;
        }
        /** Associates the enum with the original grammar name of the rule it represents.
        * @return the original grammar rule name. */
        public  String ruleName(){return name;}
        /** Associates the enum with an identifier for the grammar rule it represents.
        * @return the rule name identifier. */
        public  int    ruleID(){return id;}
        private int    opcodeOffset(){return offset;}
        private int    opcodeCount(){return count;}
    }

    // UDT name enum
    /** The number of UDTs in the grammar */
    public static int udtCount = 0;
    /** This enum provides easy to remember enum constants for locating the UDT identifiers and names.
     * The enum constants have the same spelling as the UDT names rendered in all caps with underscores replacing hyphens. */
    public enum UdtNames{
    }

    // private
    private static Call factoryInstance = null;
    private Call(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[5];
        for(RuleNames r : RuleNames.values()){
            rules[r.ruleID()] = getRule(r.ruleID(), r.ruleName(), r.opcodeOffset(), r.opcodeCount());
        }
        return rules;
    }

    private static Udt[] getUdts(){
    	Udt[] udts = new Udt[0];
        return udts;
    }

        // opcodes
    private static Opcode[] getOpcodes(){
    	Opcode[] op = new Opcode[15];
        {char[] a = {32}; op[0] = getOpcodeTls(a);}
        {int[] a = {2,3}; op[1] = getOpcodeAlt(a);}
        {char[] a = {99,97,108,108}; op[2] = getOpcodeTls(a);}
        {char[] a = {112,104,111,110,101}; op[3] = getOpcodeTls(a);}
        {int[] a = {5,6}; op[4] = getOpcodeAlt(a);}
        {char[] a = {115,101,97,114,99,104}; op[5] = getOpcodeTls(a);}
        {char[] a = {102,105,110,100}; op[6] = getOpcodeTls(a);}
        {int[] a = {8,9,10}; op[7] = getOpcodeAlt(a);}
        {char[] a = {97,108,101,120}; op[8] = getOpcodeTls(a);}
        {char[] a = {112,101,116,101,114}; op[9] = getOpcodeTls(a);}
        {char[] a = {115,116,111,110,101}; op[10] = getOpcodeTls(a);}
        {int[] a = {12,13,14}; op[11] = getOpcodeCat(a);}
        op[12] = getOpcodeRnm(1, 1); // telephoneaction1
        op[13] = getOpcodeRnm(0, 0); // sp
        op[14] = getOpcodeRnm(3, 7); // contact
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; examples.ChineseTestDemo.Call");
        out.println(";");
        out.println(";");
        out.println(";");
        out.println("; telephone call test");
        out.println(";");
        out.println(";");
        out.println("sp = \" \"");
        out.println("telephoneaction1 = \"call\" / \"phone\";");
        out.println("telephoneaction2 = \"search\" / \"find\";");
        out.println("contact = \"alex\" / \"peter\" / \"stone\";");
        out.println("main = telephoneaction1 sp contact");
    }
}
