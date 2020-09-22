public class Selections {
    public static void main(String[] args) {
//        Eksempel.metode();

        int hour = 0;
        int minute = 59;

        //If
        if (hour >= 9) {
            if (hour <= 15) {
                System.out.println("Du er i skole");
            } else {
                System.out.println("Du er ikke i skole");
            }
        }else {
            System.out.println("Du er ikke i skole");
        }

        //// or equal to this

        if((hour >= 9) && (hour < 15)){
            System.out.println("Du er i skole");
        }else{
            System.out.println("Du er ikke i skole");
        }

        /// or this
        if(hour == 0) System.out.println("Det midnat");


        //Switch - flere muligheder end 2

        String color = "Lilla";
 /*       switch (color){
            case "Red":
                System.out.println("En rød sportsvogn");
                break;
            case "Green":
                System.out.println("En grøn offroader");
                break;
            default:
                System.out.println("En eller anden random bil");
        }

*/ //Overstående omskrevet fra switch til if statement
        if(color.equals("Red")){
            System.out.println("En rød sportsvogn");
        }else if(color.equals("Green")){
            System.out.println("En grøn offroader");
        }else{
            System.out.println("En eller anden random bil");
        }
    }
}
