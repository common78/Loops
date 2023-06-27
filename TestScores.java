public class TestScores {
    public static boolean isBetterThanAverage(int[] scores, int yourScore) {
        int sum = yourScore;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / (scores.length + 1);

        return yourScore > average;
    }

    public static void main(String[] args) {
        int[] classScores = {80, 75, 90, 85};
        int yourScore = 95;

        boolean betterThanAverage = isBetterThanAverage(classScores, yourScore);
        System.out.println(betterThanAverage); // true
    }
}
