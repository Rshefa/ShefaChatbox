public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot bot1 = new ChatBot("Debbie", 8);

        // Void methods
        bot1.greeting("Raisa");
        bot1.weather();
        bot1.favoriteNumber(12);
        bot1.favAnimal("panda");//created this

        //Return/non-void methods
        double meters = bot1.convertFeetToMeters(10);
        System.out.println("There are " + meters + " in 10 feet");

        int sub = bot1.subNumbers(22, 2);//created
        System.out.println("The difference is " + sub);

        int sum = bot1.addNumbers(12,11,10);
        System.out.println("The sum is " + sum);

        String message = bot1.goodbye();
        System.out.println(message);

    }
}