public class TwiceAsOld {
    public static int calculateTwiceAsOld(int fatherAge, int sonAge) {
        int twiceSonAge = sonAge * 2;

        if (fatherAge >= twiceSonAge) {
            return fatherAge - twiceSonAge;
        } else {
            return twiceSonAge - fatherAge;
        }
    }

    public static void main(String[] args) {
        int fatherAge = 40;
        int sonAge = 15;
        int result = calculateTwiceAsOld(fatherAge, sonAge);
        System.out.println(result);
    }
}
