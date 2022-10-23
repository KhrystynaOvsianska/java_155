public class main {
    public static void main(String[] args)
    {
        Nyctereutes nyctereutes=new Nyctereutes("brown");
        nyctereutes.setVkr(8);
        nyctereutes.setName("Васька");
        nyctereutes.sayHello();
        nyctereutes.Vkrav();
        OtocyonMegalotis otocyonMegalotis=new OtocyonMegalotis("grey");
        otocyonMegalotis.setVl("first");
        otocyonMegalotis.setName("Тася");
        otocyonMegalotis.sayHello();
        otocyonMegalotis.Voice();
        OtocyonMegalotis otocyonMegalotis2=new OtocyonMegalotis("ginger");
        otocyonMegalotis2.setVl("tenth");
        otocyonMegalotis2.setName("Ді");
        otocyonMegalotis2.sayHello();
        otocyonMegalotis2.Voice();
    }
}
