public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("constructor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set name.");
        this.name = name;
    }

    public void sayHi() {
        System.out.println(this.getName());
    }
}
