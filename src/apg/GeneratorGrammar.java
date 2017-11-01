package apg;

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

public class GeneratorGrammar extends Grammar{

    // public API
    /** Called to get a singleton instance of this class.
     * @return a singleton instance of this class, cast as the base class, Grammar. */
    public static Grammar getInstance(){
        if(factoryInstance == null){
            factoryInstance = new GeneratorGrammar(getRules(), getUdts(), getOpcodes());
        }
        return factoryInstance;
    }

    // rule name enum
    /** The number of rules in the grammar */
    public static int ruleCount = 49;
    /** This enum provides easy to remember enum constants for locating the rule identifiers and names.
     * The enum constants have the same spelling as the rule names rendered in all caps with underscores replacing hyphens. */
    public enum RuleNames{
        /** id = <code>39</code>, name = <code>"alphanum"</code> */
        ALPHANUM("alphanum", 39, 193, 10),
        /** id = <code>4</code>, name = <code>"Alternation"</code> */
        ALTERNATION("Alternation", 4, 23, 6),
        /** id = <code>19</code>, name = <code>"AltOp"</code> */
        ALTOP("AltOp", 19, 100, 3),
        /** id = <code>22</code>, name = <code>"AndOp"</code> */
        ANDOP("AndOp", 22, 105, 1),
        /** id = <code>35</code>, name = <code>"Bin"</code> */
        BIN("Bin", 35, 181, 3),
        /** id = <code>1</code>, name = <code>"BlankLine"</code> */
        BLANKLINE("BlankLine", 1, 5, 4),
        /** id = <code>37</code>, name = <code>"bnum"</code> */
        BNUM("bnum", 37, 186, 2),
        /** id = <code>20</code>, name = <code>"CatOp"</code> */
        CATOP("CatOp", 20, 103, 1),
        /** id = <code>47</code>, name = <code>"chineseChar"</code> */
        CHINESECHAR("chineseChar", 47, 231, 1),
        /** id = <code>48</code>, name = <code>"chineseWord"</code> */
        CHINESEWORD("chineseWord", 48, 232, 2),
        /** id = <code>44</code>, name = <code>"comment"</code> */
        COMMENT("comment", 44, 216, 6),
        /** id = <code>5</code>, name = <code>"Concatenation"</code> */
        CONCATENATION("Concatenation", 5, 29, 7),
        /** id = <code>33</code>, name = <code>"Dec"</code> */
        DEC("Dec", 33, 175, 3),
        /** id = <code>15</code>, name = <code>"DefinedAs"</code> */
        DEFINEDAS("DefinedAs", 15, 92, 1),
        /** id = <code>36</code>, name = <code>"dnum"</code> */
        DNUM("dnum", 36, 184, 2),
        /** id = <code>10</code>, name = <code>"Element"</code> */
        ELEMENT("Element", 10, 61, 10),
        /** id = <code>0</code>, name = <code>"File"</code> */
        FILE("File", 0, 0, 5),
        /** id = <code>41</code>, name = <code>"fsp"</code> */
        FSP("fsp", 41, 207, 5),
        /** id = <code>11</code>, name = <code>"Group"</code> */
        GROUP("Group", 11, 71, 6),
        /** id = <code>34</code>, name = <code>"Hex"</code> */
        HEX("Hex", 34, 178, 3),
        /** id = <code>16</code>, name = <code>"IncAlt"</code> */
        INCALT("IncAlt", 16, 93, 1),
        /** id = <code>46</code>, name = <code>"LineContinue"</code> */
        LINECONTINUE("LineContinue", 46, 226, 5),
        /** id = <code>45</code>, name = <code>"LineEnd"</code> */
        LINEEND("LineEnd", 45, 222, 4),
        /** id = <code>14</code>, name = <code>"NameDef"</code> */
        NAMEDEF("NameDef", 14, 91, 1),
        /** id = <code>23</code>, name = <code>"NotOp"</code> */
        NOTOP("NotOp", 23, 106, 1),
        /** id = <code>12</code>, name = <code>"Option"</code> */
        OPTION("Option", 12, 77, 6),
        /** id = <code>42</code>, name = <code>"owsp"</code> */
        OWSP("owsp", 42, 212, 2),
        /** id = <code>8</code>, name = <code>"Predicate"</code> */
        PREDICATE("Predicate", 8, 43, 5),
        /** id = <code>13</code>, name = <code>"ProsVal"</code> */
        PROSVAL("ProsVal", 13, 83, 8),
        /** id = <code>9</code>, name = <code>"Rep"</code> */
        REP("Rep", 9, 48, 13),
        /** id = <code>30</code>, name = <code>"rep-max"</code> */
        REP_MAX("rep-max", 30, 135, 2),
        /** id = <code>28</code>, name = <code>"rep-min"</code> */
        REP_MIN("rep-min", 28, 131, 2),
        /** id = <code>29</code>, name = <code>"rep-min-max"</code> */
        REP_MIN_MAX("rep-min-max", 29, 133, 2),
        /** id = <code>7</code>, name = <code>"Repeat"</code> */
        REPEAT("Repeat", 7, 40, 3),
        /** id = <code>6</code>, name = <code>"Repetition"</code> */
        REPETITION("Repetition", 6, 36, 4),
        /** id = <code>17</code>, name = <code>"RnmOp"</code> */
        RNMOP("RnmOp", 17, 94, 1),
        /** id = <code>2</code>, name = <code>"Rule"</code> */
        RULE("Rule", 2, 9, 10),
        /** id = <code>3</code>, name = <code>"RuleError"</code> */
        RULEERROR("RuleError", 3, 19, 4),
        /** id = <code>40</code>, name = <code>"sp"</code> */
        SP("sp", 40, 203, 4),
        /** id = <code>21</code>, name = <code>"StarOp"</code> */
        STAROP("StarOp", 21, 104, 1),
        /** id = <code>25</code>, name = <code>"TbsOp"</code> */
        TBSOP("TbsOp", 25, 110, 3),
        /** id = <code>32</code>, name = <code>"TbsString"</code> */
        TBSSTRING("TbsString", 32, 153, 22),
        /** id = <code>27</code>, name = <code>"TcsOp"</code> */
        TCSOP("TcsOp", 27, 122, 9),
        /** id = <code>26</code>, name = <code>"TlsOp"</code> */
        TLSOP("TlsOp", 26, 113, 9),
        /** id = <code>24</code>, name = <code>"TrgOp"</code> */
        TRGOP("TrgOp", 24, 107, 3),
        /** id = <code>31</code>, name = <code>"TrgRange"</code> */
        TRGRANGE("TrgRange", 31, 137, 16),
        /** id = <code>18</code>, name = <code>"UdtOp"</code> */
        UDTOP("UdtOp", 18, 95, 5),
        /** id = <code>43</code>, name = <code>"wsp"</code> */
        WSP("wsp", 43, 214, 2),
        /** id = <code>38</code>, name = <code>"xnum"</code> */
        XNUM("xnum", 38, 188, 5);
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
    private static GeneratorGrammar factoryInstance = null;
    private GeneratorGrammar(Rule[] rules, Udt[] udts, Opcode[] opcodes){
        super(rules, udts, opcodes);
    }

    private static Rule[] getRules(){
        Rule[] rules = new Rule[49];
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
        Opcode[] op = new Opcode[234];
        op[0] = getOpcodeRep((char)0, Character.MAX_VALUE, 1);
        {int[] a = {2,3,4}; op[1] = getOpcodeAlt(a);}
        op[2] = getOpcodeRnm(1, 5); // BlankLine
        op[3] = getOpcodeRnm(2, 9); // Rule
        op[4] = getOpcodeRnm(3, 19); // RuleError
        {int[] a = {6,8}; op[5] = getOpcodeCat(a);}
        op[6] = getOpcodeRep((char)0, Character.MAX_VALUE, 7);
        op[7] = getOpcodeRnm(40, 203); // sp
        op[8] = getOpcodeRnm(45, 222); // LineEnd
        {int[] a = {10,11,12,15,16,17,18}; op[9] = getOpcodeCat(a);}
        op[10] = getOpcodeRnm(14, 91); // NameDef
        op[11] = getOpcodeRnm(42, 212); // owsp
        {int[] a = {13,14}; op[12] = getOpcodeAlt(a);}
        op[13] = getOpcodeRnm(16, 93); // IncAlt
        op[14] = getOpcodeRnm(15, 92); // DefinedAs
        op[15] = getOpcodeRnm(42, 212); // owsp
        op[16] = getOpcodeRnm(4, 23); // Alternation
        op[17] = getOpcodeRnm(42, 212); // owsp
        op[18] = getOpcodeRnm(45, 222); // LineEnd
        {int[] a = {20,22}; op[19] = getOpcodeCat(a);}
        op[20] = getOpcodeRep((char)0, Character.MAX_VALUE, 21);
        op[21] = getOpcodeRnm(41, 207); // fsp
        op[22] = getOpcodeRnm(45, 222); // LineEnd
        {int[] a = {24,25}; op[23] = getOpcodeCat(a);}
        op[24] = getOpcodeRnm(5, 29); // Concatenation
        op[25] = getOpcodeRep((char)0, Character.MAX_VALUE, 26);
        {int[] a = {27,28}; op[26] = getOpcodeCat(a);}
        op[27] = getOpcodeRnm(19, 100); // AltOp
        op[28] = getOpcodeRnm(5, 29); // Concatenation
        {int[] a = {30,31,32}; op[29] = getOpcodeCat(a);}
        op[30] = getOpcodeRnm(42, 212); // owsp
        op[31] = getOpcodeRnm(6, 36); // Repetition
        op[32] = getOpcodeRep((char)0, Character.MAX_VALUE, 33);
        {int[] a = {34,35}; op[33] = getOpcodeCat(a);}
        op[34] = getOpcodeRnm(20, 103); // CatOp
        op[35] = getOpcodeRnm(6, 36); // Repetition
        {int[] a = {37,38,39}; op[36] = getOpcodeAlt(a);}
        op[37] = getOpcodeRnm(7, 40); // Repeat
        op[38] = getOpcodeRnm(8, 43); // Predicate
        op[39] = getOpcodeRnm(10, 61); // Element
        {int[] a = {41,42}; op[40] = getOpcodeCat(a);}
        op[41] = getOpcodeRnm(9, 48); // Rep
        op[42] = getOpcodeRnm(10, 61); // Element
        {int[] a = {44,47}; op[43] = getOpcodeCat(a);}
        {int[] a = {45,46}; op[44] = getOpcodeAlt(a);}
        op[45] = getOpcodeRnm(22, 105); // AndOp
        op[46] = getOpcodeRnm(23, 106); // NotOp
        op[47] = getOpcodeRnm(10, 61); // Element
        {int[] a = {49,53,56,59,60}; op[48] = getOpcodeAlt(a);}
        {int[] a = {50,51,52}; op[49] = getOpcodeCat(a);}
        op[50] = getOpcodeRnm(28, 131); // rep-min
        op[51] = getOpcodeRnm(21, 104); // StarOp
        op[52] = getOpcodeRnm(30, 135); // rep-max
        {int[] a = {54,55}; op[53] = getOpcodeCat(a);}
        op[54] = getOpcodeRnm(28, 131); // rep-min
        op[55] = getOpcodeRnm(21, 104); // StarOp
        {int[] a = {57,58}; op[56] = getOpcodeCat(a);}
        op[57] = getOpcodeRnm(21, 104); // StarOp
        op[58] = getOpcodeRnm(30, 135); // rep-max
        op[59] = getOpcodeRnm(21, 104); // StarOp
        op[60] = getOpcodeRnm(29, 133); // rep-min-max
        {int[] a = {62,63,64,65,66,67,68,69,70}; op[61] = getOpcodeAlt(a);}
        op[62] = getOpcodeRnm(24, 107); // TrgOp
        op[63] = getOpcodeRnm(25, 110); // TbsOp
        op[64] = getOpcodeRnm(26, 113); // TlsOp
        op[65] = getOpcodeRnm(27, 122); // TcsOp
        op[66] = getOpcodeRnm(18, 95); // UdtOp
        op[67] = getOpcodeRnm(17, 94); // RnmOp
        op[68] = getOpcodeRnm(11, 71); // Group
        op[69] = getOpcodeRnm(12, 77); // Option
        op[70] = getOpcodeRnm(13, 83); // ProsVal
        {int[] a = {72,73,74,75,76}; op[71] = getOpcodeCat(a);}
        {char[] a = {40}; op[72] = getOpcodeTbs(a);}
        op[73] = getOpcodeRnm(42, 212); // owsp
        op[74] = getOpcodeRnm(4, 23); // Alternation
        op[75] = getOpcodeRnm(42, 212); // owsp
        {char[] a = {41}; op[76] = getOpcodeTbs(a);}
        {int[] a = {78,79,80,81,82}; op[77] = getOpcodeCat(a);}
        {char[] a = {91}; op[78] = getOpcodeTbs(a);}
        op[79] = getOpcodeRnm(42, 212); // owsp
        op[80] = getOpcodeRnm(4, 23); // Alternation
        op[81] = getOpcodeRnm(42, 212); // owsp
        {char[] a = {93}; op[82] = getOpcodeTbs(a);}
        {int[] a = {84,85,90}; op[83] = getOpcodeCat(a);}
        {char[] a = {60}; op[84] = getOpcodeTbs(a);}
        op[85] = getOpcodeRep((char)0, Character.MAX_VALUE, 86);
        {int[] a = {87,88,89}; op[86] = getOpcodeAlt(a);}
        op[87] = getOpcodeTrg((char)32, (char)61);
        op[88] = getOpcodeTrg((char)63, (char)127);
        {char[] a = {9}; op[89] = getOpcodeTbs(a);}
        {char[] a = {62}; op[90] = getOpcodeTbs(a);}
        op[91] = getOpcodeRnm(39, 193); // alphanum
        {char[] a = {61}; op[92] = getOpcodeTbs(a);}
        {char[] a = {61,47}; op[93] = getOpcodeTbs(a);}
        op[94] = getOpcodeRnm(39, 193); // alphanum
        {int[] a = {96,99}; op[95] = getOpcodeCat(a);}
        {int[] a = {97,98}; op[96] = getOpcodeAlt(a);}
        {char[] a = {117,95}; op[97] = getOpcodeTbs(a);}
        {char[] a = {101,95}; op[98] = getOpcodeTbs(a);}
        op[99] = getOpcodeRnm(39, 193); // alphanum
        {int[] a = {101,102}; op[100] = getOpcodeCat(a);}
        op[101] = getOpcodeRnm(42, 212); // owsp
        {char[] a = {47}; op[102] = getOpcodeTbs(a);}
        op[103] = getOpcodeRnm(43, 214); // wsp
        {char[] a = {42}; op[104] = getOpcodeTbs(a);}
        {char[] a = {38}; op[105] = getOpcodeTbs(a);}
        {char[] a = {33}; op[106] = getOpcodeTbs(a);}
        {int[] a = {108,109}; op[107] = getOpcodeCat(a);}
        {char[] a = {37}; op[108] = getOpcodeTbs(a);}
        op[109] = getOpcodeRnm(31, 137); // TrgRange
        {int[] a = {111,112}; op[110] = getOpcodeCat(a);}
        {char[] a = {37}; op[111] = getOpcodeTbs(a);}
        op[112] = getOpcodeRnm(32, 153); // TbsString
        {int[] a = {114,115,121}; op[113] = getOpcodeCat(a);}
        {char[] a = {34}; op[114] = getOpcodeTbs(a);}
        op[115] = getOpcodeRep((char)0, Character.MAX_VALUE, 116);
        {int[] a = {117,118,119,120}; op[116] = getOpcodeAlt(a);}
        op[117] = getOpcodeTrg((char)32, (char)33);
        op[118] = getOpcodeTrg((char)35, (char)127);
        {char[] a = {9}; op[119] = getOpcodeTbs(a);}
        op[120] = getOpcodeTrg((char)19968, (char)40895);
        {char[] a = {34}; op[121] = getOpcodeTbs(a);}
        {int[] a = {123,124,130}; op[122] = getOpcodeCat(a);}
        {char[] a = {39}; op[123] = getOpcodeTbs(a);}
        op[124] = getOpcodeRep((char)0, Character.MAX_VALUE, 125);
        {int[] a = {126,127,128,129}; op[125] = getOpcodeAlt(a);}
        op[126] = getOpcodeTrg((char)32, (char)38);
        op[127] = getOpcodeTrg((char)40, (char)127);
        {char[] a = {9}; op[128] = getOpcodeTbs(a);}
        op[129] = getOpcodeTrg((char)19968, (char)40895);
        {char[] a = {39}; op[130] = getOpcodeTbs(a);}
        op[131] = getOpcodeRep((char)1, Character.MAX_VALUE, 132);
        op[132] = getOpcodeTrg((char)48, (char)57);
        op[133] = getOpcodeRep((char)1, Character.MAX_VALUE, 134);
        op[134] = getOpcodeTrg((char)48, (char)57);
        op[135] = getOpcodeRep((char)1, Character.MAX_VALUE, 136);
        op[136] = getOpcodeTrg((char)48, (char)57);
        {int[] a = {138,143,148}; op[137] = getOpcodeAlt(a);}
        {int[] a = {139,140,141,142}; op[138] = getOpcodeCat(a);}
        op[139] = getOpcodeRnm(33, 175); // Dec
        op[140] = getOpcodeRnm(36, 184); // dnum
        {char[] a = {45}; op[141] = getOpcodeTbs(a);}
        op[142] = getOpcodeRnm(36, 184); // dnum
        {int[] a = {144,145,146,147}; op[143] = getOpcodeCat(a);}
        op[144] = getOpcodeRnm(34, 178); // Hex
        op[145] = getOpcodeRnm(38, 188); // xnum
        {char[] a = {45}; op[146] = getOpcodeTbs(a);}
        op[147] = getOpcodeRnm(38, 188); // xnum
        {int[] a = {149,150,151,152}; op[148] = getOpcodeCat(a);}
        op[149] = getOpcodeRnm(35, 181); // Bin
        op[150] = getOpcodeRnm(37, 186); // bnum
        {char[] a = {45}; op[151] = getOpcodeTbs(a);}
        op[152] = getOpcodeRnm(37, 186); // bnum
        {int[] a = {154,161,168}; op[153] = getOpcodeAlt(a);}
        {int[] a = {155,156,157}; op[154] = getOpcodeCat(a);}
        op[155] = getOpcodeRnm(33, 175); // Dec
        op[156] = getOpcodeRnm(36, 184); // dnum
        op[157] = getOpcodeRep((char)0, Character.MAX_VALUE, 158);
        {int[] a = {159,160}; op[158] = getOpcodeCat(a);}
        {char[] a = {46}; op[159] = getOpcodeTbs(a);}
        op[160] = getOpcodeRnm(36, 184); // dnum
        {int[] a = {162,163,164}; op[161] = getOpcodeCat(a);}
        op[162] = getOpcodeRnm(34, 178); // Hex
        op[163] = getOpcodeRnm(38, 188); // xnum
        op[164] = getOpcodeRep((char)0, Character.MAX_VALUE, 165);
        {int[] a = {166,167}; op[165] = getOpcodeCat(a);}
        {char[] a = {46}; op[166] = getOpcodeTbs(a);}
        op[167] = getOpcodeRnm(38, 188); // xnum
        {int[] a = {169,170,171}; op[168] = getOpcodeCat(a);}
        op[169] = getOpcodeRnm(35, 181); // Bin
        op[170] = getOpcodeRnm(37, 186); // bnum
        op[171] = getOpcodeRep((char)0, Character.MAX_VALUE, 172);
        {int[] a = {173,174}; op[172] = getOpcodeCat(a);}
        {char[] a = {46}; op[173] = getOpcodeTbs(a);}
        op[174] = getOpcodeRnm(37, 186); // bnum
        {int[] a = {176,177}; op[175] = getOpcodeAlt(a);}
        {char[] a = {68}; op[176] = getOpcodeTbs(a);}
        {char[] a = {100}; op[177] = getOpcodeTbs(a);}
        {int[] a = {179,180}; op[178] = getOpcodeAlt(a);}
        {char[] a = {88}; op[179] = getOpcodeTbs(a);}
        {char[] a = {120}; op[180] = getOpcodeTbs(a);}
        {int[] a = {182,183}; op[181] = getOpcodeAlt(a);}
        {char[] a = {66}; op[182] = getOpcodeTbs(a);}
        {char[] a = {98}; op[183] = getOpcodeTbs(a);}
        op[184] = getOpcodeRep((char)1, Character.MAX_VALUE, 185);
        op[185] = getOpcodeTrg((char)48, (char)57);
        op[186] = getOpcodeRep((char)1, Character.MAX_VALUE, 187);
        op[187] = getOpcodeTrg((char)48, (char)49);
        op[188] = getOpcodeRep((char)1, Character.MAX_VALUE, 189);
        {int[] a = {190,191,192}; op[189] = getOpcodeAlt(a);}
        op[190] = getOpcodeTrg((char)48, (char)57);
        op[191] = getOpcodeTrg((char)65, (char)70);
        op[192] = getOpcodeTrg((char)97, (char)102);
        {int[] a = {194,197}; op[193] = getOpcodeCat(a);}
        {int[] a = {195,196}; op[194] = getOpcodeAlt(a);}
        op[195] = getOpcodeTrg((char)97, (char)122);
        op[196] = getOpcodeTrg((char)65, (char)90);
        op[197] = getOpcodeRep((char)0, Character.MAX_VALUE, 198);
        {int[] a = {199,200,201,202}; op[198] = getOpcodeAlt(a);}
        op[199] = getOpcodeTrg((char)97, (char)122);
        op[200] = getOpcodeTrg((char)65, (char)90);
        op[201] = getOpcodeTrg((char)48, (char)57);
        {char[] a = {45}; op[202] = getOpcodeTbs(a);}
        {int[] a = {204,205,206}; op[203] = getOpcodeAlt(a);}
        {char[] a = {32}; op[204] = getOpcodeTbs(a);}
        {char[] a = {9}; op[205] = getOpcodeTbs(a);}
        op[206] = getOpcodeRnm(44, 216); // comment
        {int[] a = {208,209,210,211}; op[207] = getOpcodeAlt(a);}
        {char[] a = {32}; op[208] = getOpcodeTbs(a);}
        {char[] a = {9}; op[209] = getOpcodeTbs(a);}
        op[210] = getOpcodeRnm(44, 216); // comment
        op[211] = getOpcodeRnm(46, 226); // LineContinue
        op[212] = getOpcodeRep((char)0, Character.MAX_VALUE, 213);
        op[213] = getOpcodeRnm(41, 207); // fsp
        op[214] = getOpcodeRep((char)1, Character.MAX_VALUE, 215);
        op[215] = getOpcodeRnm(41, 207); // fsp
        {int[] a = {217,218}; op[216] = getOpcodeCat(a);}
        {char[] a = {59}; op[217] = getOpcodeTbs(a);}
        op[218] = getOpcodeRep((char)0, Character.MAX_VALUE, 219);
        {int[] a = {220,221}; op[219] = getOpcodeAlt(a);}
        op[220] = getOpcodeTrg((char)32, (char)127);
        {char[] a = {9}; op[221] = getOpcodeTbs(a);}
        {int[] a = {223,224,225}; op[222] = getOpcodeAlt(a);}
        {char[] a = {13,10}; op[223] = getOpcodeTbs(a);}
        {char[] a = {10}; op[224] = getOpcodeTbs(a);}
        {char[] a = {13}; op[225] = getOpcodeTbs(a);}
        {int[] a = {227,228}; op[226] = getOpcodeCat(a);}
        op[227] = getOpcodeRnm(45, 222); // LineEnd
        {int[] a = {229,230}; op[228] = getOpcodeAlt(a);}
        {char[] a = {32}; op[229] = getOpcodeTbs(a);}
        {char[] a = {9}; op[230] = getOpcodeTbs(a);}
        op[231] = getOpcodeTrg((char)19968, (char)40895);
        op[232] = getOpcodeRep((char)0, Character.MAX_VALUE, 233);
        op[233] = getOpcodeTrg((char)19968, (char)40895);
        return op;
    }

    /** Displays the original SABNF grammar on the output device.
     * @param out the output device to display on.*/
    public static void display(PrintStream out){
        out.println(";");
        out.println("; apg.GeneratorGrammar");
        out.println(";");
        out.println(";********************************************************************");
        out.println(";  APG - an ABNF Parser Generator");
        out.println(";  Copyright (C) 2011 Lowell D. Thomas, all rights reserved");
        out.println(";");
        out.println(";    author: Lowell D. Thomas");
        out.println(";            lowell@coasttocoastresearch.com");
        out.println(";            http://www.coasttocoastresearch.com");
        out.println(";");
        out.println(";   purpose: ABNF for SABNF");
        out.println(";");
        out.println(";*********************************************************************");
        out.println("; symbol alphabet is ASCII");
        out.println("; code points: 9, 10, 13, 32-126");
        out.println(";");
        out.println("File          = *(BlankLine/Rule/RuleError)");
        out.println("BlankLine     = *sp LineEnd");
        out.println("Rule          = NameDef owsp (IncAlt/DefinedAs) owsp Alternation owsp LineEnd");
        out.println("RuleError     = *fsp LineEnd");
        out.println("Alternation   = Concatenation *(AltOp Concatenation)");
        out.println("Concatenation = owsp Repetition *(CatOp Repetition)");
        out.println("Repetition    = Repeat / Predicate / Element");
        out.println("Repeat        = Rep Element");
        out.println("Predicate     = (AndOp / NotOp) Element");
        out.println("Rep           = (rep-min StarOp rep-max) /");
        out.println("                (rep-min StarOp)         /");
        out.println("                (StarOp rep-max)         /");
        out.println("                 StarOp                  /");
        out.println("                 rep-min-max");
        out.println("Element       = TrgOp   /");
        out.println("                TbsOp   /");
        out.println("                TlsOp   /");
        out.println("                TcsOp   /");
        out.println("                UdtOp   /");
        out.println("                RnmOp   /");
        out.println("                Group   /");
        out.println("                Option  /");
        out.println("                ProsVal");
        out.println("Group         = %d40 owsp  Alternation owsp %d41");
        out.println("Option        = %d91 owsp Alternation owsp %d93");
        out.println("ProsVal       = %d60 *(%d32-61/%d63-127/%d9) %d62");
        out.println("");
        out.println("NameDef       = alphanum");
        out.println("DefinedAs     = %d61");
        out.println("IncAlt        = %d61.47");
        out.println("RnmOp         = alphanum");
        out.println("UdtOp         = (%d117.95/%d101.95) alphanum");
        out.println("AltOp         = owsp %d47");
        out.println("CatOp         = wsp");
        out.println("StarOp        = %d42");
        out.println("AndOp         = %d38");
        out.println("NotOp         = %d33");
        out.println("TrgOp         = %d37 TrgRange");
        out.println("TbsOp         = %d37 TbsString");
        out.println("TlsOp         = %d34 *(%d32-33/%d35-127/%d9/%x4e00-9fbf) %d34");
        out.println("TcsOp         = %d39 *(%d32-38/%d40-127/%d9/%x4e00-9fbf) %d39");
        out.println("");
        out.println("");
        out.println("rep-min       = 1*(%d48-57)");
        out.println("rep-min-max   = 1*(%d48-57)");
        out.println("rep-max       = 1*(%d48-57)");
        out.println("TrgRange      = (Dec dnum %d45 dnum) / (Hex xnum %d45 xnum) / (Bin bnum %d45 bnum)");
        out.println("TbsString     = (Dec dnum *(%d46 dnum)) / (Hex xnum *(%d46 xnum)) / (Bin bnum *(%d46 bnum))");
        out.println("Dec           = (%d68/%d100)");
        out.println("Hex           = (%d88/%d120)");
        out.println("Bin           = (%d66/%d98)");
        out.println("dnum          = 1*(%d48-57)");
        out.println("bnum          = 1*%d48-49");
        out.println("xnum          = 1*(%d48-57 / %d65-70 / %d97-102)");
        out.println("");
        out.println("; Basics");
        out.println("alphanum      = (%d97-122/%d65-90) *(%d97-122/%d65-90/%d48-57/%d45)");
        out.println("sp            = %d32    /");
        out.println("                %d9     /");
        out.println("                comment");
        out.println("fsp           = %d32    /");
        out.println("                %d9     /");
        out.println("                comment /");
        out.println("                LineContinue");
        out.println("owsp          = *fsp");
        out.println("wsp           = 1*fsp");
        out.println("comment       = %d59 *(%d32-127 / %d9)");
        out.println("LineEnd       = %d13.10 / %d10 /%d13");
        out.println("LineContinue  = LineEnd (%d32/%d9)");
        out.println("");
        out.println(";addition");
        out.println("chineseChar   = %x4e00-9fbf");
        out.println("chineseWord   = *(%x4e00-9fbf)");
    }
}
