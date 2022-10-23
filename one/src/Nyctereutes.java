public class Nyctereutes extends Vulpes {
    public int vkr;

    Nyctereutes(String color) {
        super(color);
    }

    public void setVkr(int vkr)
    {
        this.vkr=vkr;
    }

    public void Vkrav() {
        System.out.println("I stole "+ vkr+ " things from people");
    }
}