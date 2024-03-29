public class Module7 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        TestClass testClass = new TestClass();
        testClass.setValue(5);
        System.out.println(testClass.getValue());
        LPATestClass lpaTestClass = new LPATestClass(5, "Test", true);
        System.out.println(lpaTestClass);
        System.out.println(testClass);
        InheritingClass inheritingClass = new InheritingClass("Inheriting", true, 5, 3, "Inheriting2");
        System.out.println(inheritingClass);
        System.out.println(inheritingClass.getName());
    }
}