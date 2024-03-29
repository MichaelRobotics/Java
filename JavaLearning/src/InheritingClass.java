public class InheritingClass extends TestClass {

    private int value2;
    private String name2;

    public InheritingClass(String name, boolean flag, int value2, int value, String name2) {
        super(3, "Inheriting", true);
        this.value2 = value2;
        this.name2 = name2;
    }
    
    @Override
    public String toString() {
        return "InheritingClass{" +
                "value=" + getValue() +
                ", name='" + getName() + '\'' +
                ", flag=" + isFlag() +
                ", value2=" + value2 +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
