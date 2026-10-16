package Day6;

public class switches {
//    public static String getDayType(int day) {
//        String type;
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                type = "Weekday";
//                break;
//            case 6:
//            case 7:
//                type = "Weekend";
//                break;
//            default:
//                type = "Not a valid case";
//                break;
//        }
//            return type;
//    }
//
//    public static void main(String[] args) {
//        int day = 6;
//        String result = getDayType(day);
//        System.out.println("Day" + day + "is :" + result);
//    now this is by using switch expression

    public static void main(String[] args) {
        int day = 4;
        String dayType = switch (day){
            case 1, 2, 3, 4, 5 -> "Weekdays";
            case 6 , 7 , 8 -> "Weekend";
            default -> "Invalid case";
    };
        System.out.println(dayType);
    }
}
