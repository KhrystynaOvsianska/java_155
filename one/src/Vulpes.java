public abstract class Vulpes{
    String name;
    private String color;
    Vulpes (String color) {
        this.color=color;
    }
    public void setName(String v)
    {
        name=v;
    }

    public String getColor() {
        return color;
    }
    final int legs=4;
    public void sayHello()
    {
        System.out.println("Hello, my name is "+name+". I am "+ color+". I have "+ legs+" legs");
    }

}
