public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int tempMin = args[0];
        for (int i = 1; i < args.length; i++) {
            if (args[i] < tempMin) {
                tempMin = args[i];
            }
        }
        return tempMin;
    }
}