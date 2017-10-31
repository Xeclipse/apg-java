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
    public static int ruleCount = 4;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>2</code>, name = <code>"contact"</code> */
        CONTACT("contact", 2, 7, 3),
        /** id = <code>3</code>, name = <code>"main"</code> */
        MAIN("main", 3, 10, 16),
        /** id = <code>0</code>, name = <code>"telephoneaction1"</code> */
        TELEPHONEACTION1("telephoneaction1", 0, 0, 3),
        /** id = <code>1</code>, name = <code>"telephoneaction2"</code> */
        TELEPHONEACTION2("telephoneaction2", 1, 3, 4);
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
    	Rule[] rules = new Rule[4];
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
    	Opcode[] op = new Opcode[26];
        {int[] a = {1,2}; op[0] = getOpcodeAlt(a);}
        {char[] a = {19968}; op[1] = getOpcodeTbs(a);}
        {char[] a = {19969}; op[2] = getOpcodeTbs(a);}
        {int[] a = {4,5,6}; op[3] = getOpcodeAlt(a);}
        {char[] a = {103}; op[4] = getOpcodeTbs(a);}
        {char[] a = {104}; op[5] = getOpcodeTbs(a);}
        {char[] a = {105}; op[6] = getOpcodeTbs(a);}
        {int[] a = {8,9}; op[7] = getOpcodeCat(a);}
        {char[] a = {1}; op[8] = getOpcodeTbs(a);}
        {char[] a = {2}; op[9] = getOpcodeTbs(a);}
        {int[] a = {11,16,22}; op[10] = getOpcodeAlt(a);}
        {int[] a = {12,14,15}; op[11] = getOpcodeCat(a);}
        op[12] = getOpcodeRep((char)0, (char)1, 13);
        {char[] a = {3}; op[13] = getOpcodeTbs(a);}
        op[14] = getOpcodeRnm(0, 0); // telephoneaction1
        op[15] = getOpcodeRnm(2, 7); // contact
        {int[] a = {17,19,20,21}; op[16] = getOpcodeCat(a);}
        op[17] = getOpcodeRep((char)0, (char)1, 18);
        {char[] a = {3}; op[18] = getOpcodeTbs(a);}
        op[19] = getOpcodeRnm(1, 3); // telephoneaction2
        {char[] a = {4}; op[20] = getOpcodeTbs(a);}
        op[21] = getOpcodeRnm(2, 7); // contact
        {int[] a = {23,24,25}; op[22] = getOpcodeCat(a);}
        {char[] a = {4}; op[23] = getOpcodeTbs(a);}
        op[24] = getOpcodeRnm(2, 7); // contact
        op[25] = getOpcodeRnm(1, 3); // telephoneaction2
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
        out.println("telephoneaction1 = %x4e00 / %x4e01 ;");
        out.println("telephoneaction2 = %d103 / %d104 / %d105;");
        out.println("contact = %d1 %d2 ;");
        out.println("main = [ %d3 ] telephoneaction1 contact / [ %d3 ] telephoneaction2 %d4 contact / %d4 contact telephoneaction2;");
    }
}
