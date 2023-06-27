public class SheepCounter {
    public static int countSheep(Boolean[] sheepArray) {
        int count = 0;

        for (Boolean sheep : sheepArray) {
            if (sheep != null && sheep) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Boolean[] sheepArray = {true, true, true, false, true, true, true, true,
                true, false, true, false, true, false, false, true,
                true, true, true, true, false, false, true, true};

        int sheepCount = countSheep(sheepArray);
        System.out.println(sheepCount);
    }
}
