public class BinarySearchNumber {
    public static void main(String[] args) {

        int[] sortedArr = {-4, -1, 0, 2, 4, 7, 11, 28, 37};
        int key = 37;
        System.out.println(binarySearchNumber(sortedArr, key));
    }

    //  O(log(n))
    private static int binarySearchNumber(int[] sortedArr, int key) {
        int lowIndex = 0;
        int highIndex = sortedArr.length - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;

            if (key < sortedArr[middleIndex])
                highIndex = middleIndex - 1;
            else if (key > sortedArr[middleIndex])
                lowIndex = middleIndex + 1;
            else return middleIndex;
        }
        return -1;
    }
}
