package day43_constructor;
public class Pet {
    private String type;
    private String name;



    public void speak(){
        System.out.print(name +" is saying ");
        switch (type) {
            case "dog":
                System.out.println("gav gav");
                break;
            case "cat":
                System.out.println("meow meow");
                break;
            case "fish":
                System.out.println("...");
                break;
            case "bird":
                System.out.println("chrek chrek");
                break;
            case "lion":
                System.out.println("rooaarr rooaarr");
                break;
            default:
                System.out.println("java java");
        }
    }
    public void setPetInfo(String type, String name){
        this.type = type;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}