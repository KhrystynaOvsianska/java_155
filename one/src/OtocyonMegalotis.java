public class OtocyonMegalotis extends Vulpes
{
    public String vl ;

    OtocyonMegalotis (String color) {
        super(color);
    }

    public void setVl(String vl)
    {
        this.vl=vl;
    }
    public void Voice() {
        System.out.println("My voice level is "+ vl);
    }
}