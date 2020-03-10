package day09_multibranch_switch;

public class LanguagesV2 {
    public static void main(String[] args) {
        String language = "";
        String greeting = "";
        int option =5;

        if (option == 1) {
            language = "English";
            greeting = "Hello";
        } else if (option == 2) {
            language = "Espanol";
            greeting = "Hola";
        } else if (option == 3) {
            language = "Francais";
            greeting = "Bonjour";
        } else if (option == 4) {
            language = "Arabiya";
            greeting = "Salam";
        } else if (option == 5) {
        language = "Ruskiy";
        greeting = "Privet";
    } else if (option == 6) {
            language = "Turkce";
            greeting = "Merhaba";
        }else{
            language="L'italitano";
            greeting="Ciao";
        }
        System.out.println(language +" : " + greeting);

        }

    }
