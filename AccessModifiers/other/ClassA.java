package AccessModifiers.other;

public class ClassA {
    int mark = 10; // default and can be used only
    // protected can be referenced in ClassB of this package not in the Demo class outside this package
    protected  int extraMarks=8;
}
