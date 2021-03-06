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

public class Ipv4 extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new Ipv4(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 3;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>1</code>, name = <code>"byte"</code> */
        BYTE("byte", 1, 6, 2),
        /** id = <code>2</code>, name = <code>"digit"</code> */
        DIGIT("digit", 2, 8, 1),
        /** id = <code>0</code>, name = <code>"ipv4"</code> */
        IPV4("ipv4", 0, 0, 6);
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
    private static Ipv4 factoryInstance = null;
    private Ipv4(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
    	Rule[] rules = new Rule[3];
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
    	Opcode[] op = new Opcode[9];
        {int[] a = {1,2}; op[0] = getOpcodeCat(a);}
        op[1] = getOpcodeRnm(1, 6); // byte
        op[2] = getOpcodeRep((char)3, (char)3, 3);
        {int[] a = {4,5}; op[3] = getOpcodeCat(a);}
        {char[] a = {46}; op[4] = getOpcodeTls(a);}
        op[5] = getOpcodeRnm(1, 6); // byte
        op[6] = getOpcodeRep((char)1, (char)3, 7);
        op[7] = getOpcodeRnm(2, 8); // digit
        op[8] = getOpcodeTrg((char)48, (char)57);
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; examples.ChineseTestDemo.Ipv4");
        out.println(";");
        out.println(";");
        out.println("; IPv4 address");
        out.println(";");
        out.println("ipv4  = byte 3(\".\" byte)");
        out.println("byte  = 1*3digit");
        out.println("digit = %d48-57");
    }
}
