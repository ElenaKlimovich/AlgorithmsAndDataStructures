public class MinStops {
    public static void main(String[] args) {

        int[] stations = {0, 250, 385, 540, 780, 950};
        int capasity = 450;
        System.out.println(minStops(stations, capasity));
    }

    private static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;

            while (nextStop < stations.length - 1
                    && stations[nextStop + 1] - stations[currentStop] < capacity) {
                nextStop++;
            }

            if (currentStop == nextStop)
                return -1;

            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }

        return result;
    }
}
