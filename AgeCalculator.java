public class AgeCalculator {
    public static int[] calculateAges(int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears += 15;
                dogYears += 15;
            } else if (i == 2) {
                catYears += 9;
                dogYears += 9;
            } else {
                catYears += 4;
                dogYears += 5;
            }
        }

        return new int[]{humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {
        int humanYears = 5;
        int[] ages = calculateAges(humanYears);
        System.out.println("Human Years: " + ages[0]);
        System.out.println("Cat Years: " + ages[1]);
        System.out.println("Dog Years: " + ages[2]);
    }
}
