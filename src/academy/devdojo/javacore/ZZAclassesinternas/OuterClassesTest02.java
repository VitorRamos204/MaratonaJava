package academy.devdojo.javacore.ZZAclassesinternas;

public class OuterClassesTest02 {
    private String firstName = "Son";
    void print() {
         final String LAST_NAME  = "Goku";
        class LocalClass {
            public void printLocal() {
                System.out.println(firstName + " " + LAST_NAME);
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }
    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print();
    }
}
