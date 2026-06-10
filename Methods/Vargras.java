public class Vargras {

    public static void main(String[] args) {

        languages("java", "python", "c++");
    }

    public static void languages(String... lang) {

        for (String s : lang) {
            System.out.println(s);
        }
    }
}