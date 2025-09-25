package AccessModifiers.other;

public class ClassB {
    public int marks = 52;

    public void protectedVarAccessors() {
        ClassA obj = new ClassA();
        System.out.println(
                "Protected member of ClassB is accessible in here, since ClassB and ClassA are of same package "
                        + obj.extraMarks);
    }
}
