public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("x: ");
//        float name = scanner.nextFloat();
//
//        System.out.println(name);
//
//        scanner.close();


//        Food myFood1 = new Food("Pizza");
//        Food myFood2 = new Food("Burger", 2);
//        Food myFood3 = new Food();
//
//        System.out.println(myFood1.nameOfFood);
//        System.out.println(myFood2.nameOfFood + " " + myFood2.quantity);
//        System.out.println(myFood3.nameOfFood + " " + myFood3.quantity);
//
//        System.out.println(Food.add(2, 3));
//
//        System.out.println(Food.add(4, 5));
//
//        myFood3.hello();

//        Name name1 = new Name("Joel", "Jabez");
//        Name name2 = new Name("Charlie", "Bob");
//        Name name3 = new Name("David", "Echo");
//
//        Name[] names = new Name[3];
//
//        names[0] = name1;
//        names[1] = name2;
//        names[2] = name3;
//
//        for (Name name: names){
//            System.out.println(name);
//            Food.bought(name);
//        }

//       Charlie charlie = new Charlie("Charlie");
//
//       charlie.hello();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//
//        cat.speak();
//        dog.speak();

//       ByTwo byTwo = new ByTwo();
//       ByThree byThree = new ByThree();
//
//       byThree.printMessage();

//       Series obj;
//
//       for (int i = 0; i < 5; i++){
//           obj = byTwo;
//           System.out.println("By Twos: " + obj.getNext());
//
//           obj = byThree;
//           System.out.println("By Threes: " + byThree.getNext());
//       }

//        Name name1 = new Name();
//
//
//        name1.setName("Joel");
//        name1.setAge(19);
//
//        Name name2 = new Name(name1);
//
//        System.out.println(name1);
//        System.out.println(name1.getName() + " " + name1.getAge());
//        System.out.println();
//        System.out.println(name2);
//        System.out.println(name2.getName() + " " + name2.getAge());

//       Dog myDog = new Dog();
//
//        myDog.speak();

//        Animal animal;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Cat or Dog");
//        String answer = scanner.nextLine();
//
//        switch (answer.toLowerCase()){
//            case "cat" -> animal = new Cat();
//            case "dog" -> animal = new Dog();
//            default -> animal = new Animal();
//        }
//
//        animal.speak();

        /*
        A
        P
        I
        E
         */
//        Scanner scanner = new Scanner(System.in);
//        try {
//            int number = scanner.nextInt();
//            System.out.println(number);
//        } catch (Exception e) {
//            throw new InputMismatchException("Please enter an integer");
//        } finally {
//            scanner.close();
//            System.out.println("Scanner has been closed");
//        }


//       File file = new File("/home/joel/Codes");


//        FileWriter fileWriter = new FileWriter("hello.txt");
//
//        fileWriter.write("Hello world\n\t");
//        fileWriter.write("This is a test");
//
//        fileWriter.close();


//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//
//        System.out.println("Array List: " + numbers);


//        HashSet<Integer> numbers = new HashSet<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//
//        System.out.println(numbers);
//
//
//        HashMap<String, String> phoneBook = new HashMap<>();
//
//        phoneBook.put("Alice", "+6012-345-6789");
//        phoneBook.put("Bob", "+6012-354-6789");
//
//        System.out.println(phoneBook);

//        FileReader fileReader = new FileReader("NCR-2902-1126235507.TXT");
//        int read = fileReader.read();
//
//        while (read != -1) {
//            if (read == 13) {
//                System.out.println();
//            } else {
//                System.out.print((char) read);
//            }
//            read = fileReader.read();
//        }
//
//        fileReader.close();


//       int[] numbers = {100, 2, 5, 8, 4, 6, 7, 1, 3, 9, 10, 0, 100};
//       SortingAlgorithms.MergeSort.sort(numbers);


//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(7, 5, 3, 8, 4, 1, 9, 6, 0, 2));
//
//        long start = System.nanoTime();
//        SortingAlgorithms.BubbleSort.sort(numbers);
//        long end = System.nanoTime();
//
//        System.out.println(numbers);
//        System.out.println(TimeUnit.NANOSECONDS.toMicros(end - start));

        // Function<Name, Name> name = Name::new;
        // name.apply(new Name("Joel"));

    }
}
