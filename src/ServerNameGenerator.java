public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"Amazing",
                "Spectacular",
                "Incredible",
                "Fantastic",
                "Outstanding",
                "Magnificent",
                "Phenomenal",
                "Impressive",
                "Extraordinary",
                "Exceptional"};

        String[] nouns = {"Dream",
                "Adventure",
                "Wonder",
                "Miracle",
                "Treasure",
                "Success",
                "Triumph",
                "Inspiration",
                "Legacy",
                "Victory"};

        String randomName = ServerNameGenerator.nameGenerator(adjectives, nouns);
        System.out.println("Here is your server name:");
        System.out.println(randomName);
    }

    public static int getRandomNum (int min, int max){
        return (int)(Math.random()*9)+1;
    }

    public static String nameGenerator(String[] adj, String[] nouns){
        String randomNoun = nouns[getRandomNum(0,9)];
        String randomAdj = adj[getRandomNum(0,9)];
        return randomAdj + "-" + randomNoun;
    }


}
