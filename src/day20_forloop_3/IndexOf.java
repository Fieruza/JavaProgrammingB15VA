package day20_forloop_3;

public class IndexOf {
    public static void main(String[] args) {

        String word = "Java is fun";
        //lets not convert to lowercase
        char letter = 'a';//we will look for this letter in the word
        //position of a letter - assume not there and assign -1
        int index = -1;
        //loop from first char until last
        for(int i = 0; i < word.length(); ++i){
            //System.out.println(word.charAt(i));
            if(word.charAt(i) == letter){
                index = i;
                break; //exit the loop here. no need to read other chars
                //System.out.println(letter +" found at " + i);
            }
        }
        System.out.println(letter +" was found at index #"+index);
    }
}

/*

//convert everything to lowercase
char letter = 'a';
int index = -1;//assume not there and assign -1
loop through the word
and compare each character to letter.
if it matches assign that loop variable value into index
outside the loop:
"a was found at index 1"
 */