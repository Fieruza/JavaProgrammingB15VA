package day53_review_poly_intro;

public class AppleStore {
    public static void main(String[] args) {
        //create object from appleDevice
        AppleWatch iWatch = new AppleWatch();
        iWatch.name ="Apple Watch";
        iWatch.series = 5;
        iWatch.use();
        iWatch.wear();
        iWatch.countSteps();

        IPhone myPhone = new IPhone();
        myPhone.name ="iphone";
        myPhone.model = "11 Pro";
        myPhone.navigate();
        myPhone.use();
        myPhone.wear();
        myPhone.code();

        MacPro myMacPro = new MacPro();
        myMacPro.name = "MacPro";
        myMacPro.model = "Cheese Grater";
        myMacPro.use();
        myMacPro.code();
        myMacPro.useAsServer();
        System.out.println(myMacPro.hashCode());




    }

}
