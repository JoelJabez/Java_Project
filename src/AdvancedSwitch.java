public class AdvancedSwitch {
    public static void main(String[] args) {
        int day = 1;

        switch(day){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }


//        String answer = switch(day){
//            case 1:
//                yield "It's Monday";
//            case 2:
//                yield "It's Tuesday";
//            case 3:
//                yield "It's Wednesday";
//            case 4:
//                yield "It's Thursday";
//            case 5:
//                yield "It's Friday";
//            case 6:
//                yield "It's Saturday";
//            case 7:
//                yield "It's Sunday";
//            default:
//                yield "Unknown day";
//        };

//        String answer = switch(day){
//            case 1 -> "It's Monday";
//            case 2 -> "It's Tuesday";
//            case 3 -> "It's Wednesday";
//            case 4 -> "It's Thursday";
//            case 5 -> "It's Friday";
//            case 6 -> "It's Saturday";
//            case 7 -> "It's Sunday";
//            default -> "Unknown day";
//        };

        switch(day){
            case 1 -> System.out.println("It's Monday");
            case 2 -> System.out.println("It's Tuesday");
            case 3 -> System.out.println("It's Wednesday");
            case 4 -> System.out.println("It's Thursday");
            case 5 -> System.out.println("It's Friday");
            case 6 -> System.out.println("It's Saturday");
            case 7 -> System.out.println("It's Sunday");
            default -> System.out.println("Unknown day");
        };

    }
}
