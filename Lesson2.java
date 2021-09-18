package L2;
public class Lesson2 {
   // public static void main(String[] args) {
        String nameletter = "Olga";
                if (nameletter == "Olga") {
                    System.out.println("Send letetr to Olga");
        } else if (nameletter == "Boris") {
            System.out.println("Send letter to Boris");
        } else if (nameletter == "Maria") {
            System.out.println("Send letter to Maria");
        } else if (nameletter == "Alex") {
            System.out.println("Send letter to Alex");
    }
        System.out.println ("********");
        switch (nameletter) {
            case "Olga":
                System.out.println("Send letetr to Olga");
                break;
            case "Boris":
                System.out.println("Send letetr to Boris");
                break;
            case "Maria":
                System.out.println("Send letetr to Maria");
                break;
            case "Alex":
                System.out.println("Send letetr to Alex");
                break;
            default:
                System.out.println("Go to office");
                break;
        }
                }//

}
