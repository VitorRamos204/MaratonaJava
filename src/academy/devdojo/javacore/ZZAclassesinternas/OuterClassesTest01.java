package academy.devdojo.javacore.ZZAclassesinternas;

public class OuterClassesTest01 {
    // Nested
    private String name = "Monkey D. Luffy";
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        inner.printOuterClassAttribute();
    }
}
