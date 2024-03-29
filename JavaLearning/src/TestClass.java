public class TestClass {
    private int value;
    private String name;
    private boolean flag;

    public TestClass(int value, String name, boolean flag) { 
        this.value = value;
        this.name = name;
        this.flag = flag;
    }

    public TestClass(int value, String name) {
        this(value, name, false);
    }

    public TestClass(int value) {
        this(value, "ValueFor");
    }

    public TestClass() {
        this(0);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
        
    }
    @Override
    public String toString() {
        return "TestClass{" +
                "value=" + value +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}
