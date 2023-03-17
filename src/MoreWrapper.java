public class MoreWrapper {
    public static void main(String[] args) {
//        long normalStart, normalEnd, wrapperStart, wrapperEnd;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Int: ");
//        int number = scanner.nextByte();
//        Integer wrapperNumber = number;
//
//        normalStart = System.nanoTime();
//        System.out.println("Normal number: " + number);
//        normalEnd = System.nanoTime();
//
//        wrapperStart = System.nanoTime();
//        System.out.println("Wrapper number: " + wrapperNumber);
//        wrapperEnd = System.nanoTime();
//
//        System.out.println("Time taken for the primitive data type: " + TimeUnit.NANOSECONDS.toMicros(normalEnd - normalStart));
//        System.out.println("Time taken for wrapper class: " + TimeUnit.NANOSECONDS.toMicros(wrapperEnd - wrapperStart));

        int x = 5;  //|x -> 5|
        int y = 5;  //|y -> 5|

        String name = "Joel";
        String anotherName = "Joel";
        String aThirdName = new String("Joel");

        if(name == aThirdName)
        {
            System.out.println("Both names match");
        }
    }
}
