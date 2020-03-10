package day42_encapsulation;
/*
name should not be empty
age can only be positive number 0
 */
public class Person {
       //encaspsulate below variable
        private String name;  //null
        private int age;    //0

public int getAge(){
    return age;
}
public void setAge(int newAge){
    if(newAge >0 && newAge <=170)
     age = newAge;
//}else{
        System.out.println("ERROR: Invalid age - "+ newAge);
    }
    //getter/setter for name
    //read only
    public String getName(){
        return name;
    }
    //setter- write only
    public void setName(String newName){
        if(!newName.isEmpty()) {
            name = newName;
        }else{
            System.out.println("ERROR:name cannot be empty");
        }
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

