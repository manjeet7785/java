
public class LinearSearchRecipe {

    public static String lRecipe(String Fav[], String Key) {
        for (int i = 0; i <= Fav.length; i++) {
            if (Fav[i] == Key) {
                return Fav[i];
            }
        }
        return "nothing";
    }

    public static void main(String[] args) {
        String Fav[] = {"Chhola", "Samosha", "Aallo", "chola"};
        String Key = "chola";
        String Result = lRecipe(Fav, Key);

        System.out.println("The Fav Value is Here" + " " + Result + " ");
    }
}
