import java.util.Random;

class Main
  {
    public static void main(String[] args)
    {
        int[][] tablica = new int[10][10];  //rozmiar
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablica[i][j] = rand.nextInt(51);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
