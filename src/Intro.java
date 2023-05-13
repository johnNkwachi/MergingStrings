public class Intro {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        int[]num = {1,2,3,4,5,6,7,8,9};
        System.out.println(sort(num));
    }

    public static int sort(int[]num){
        int largest = num[0];
        for (int j : num) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }
}
