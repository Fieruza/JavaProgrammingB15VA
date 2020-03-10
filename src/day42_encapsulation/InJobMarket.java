package day42_encapsulation;

import day41_encapsulation.JobOffer;
import jdk.swing.interop.SwingInterOpUtils;

public class InJobMarket {
    public static void main(String[] args) {
        JobOffer fannie = new JobOffer();
        fannie.setHourlyPay(55);
        fannie.setLocation("Arlington, VA");
        System.out.println();
        System.out.println();

    }
}
