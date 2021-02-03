package Lesson2;

public class Lesson2 {

        public static void main(String[] args) {
            doChangeNums();
            createArr();
            doIncreaseNums();
            doTableArr();
            doMinMaxArr();
        }

        // task 1

        public static void doChangeNums() {
            int[] nums = {1, 0, 0, 0, 1, 1, 0};
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    nums[i] = 0;
                } else {
                    nums[i] = 1;
                }
                System.out.print(nums[i]);
            }
            System.out.println();
        }


        // task 2

        public static void createArr() {
            int[] arr = new int[8];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }




        // task 3

        public static void doIncreaseNums() {
            int[] nums2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] < 6) {
                    nums2[i] = nums2[i] * 2;

                    System.out.println(nums2[i]);
                }
            }
        }


        // task 4

        public static void doTableArr() {

            int num = 4;
            int[][] table = new int[num][];
            for (int i = 0; i < num; i++) {
                table[i] = new int[num];
                for (int j = 0; j < num; j++) {
                    if(i==j || num-i == j+1){
                        table[i][j] = table[i][num-i-1] = 1;
                    } else{
                        table[i][j] = 0;
                    }
                    System.out.print(table[i][j] + "\t");
                }
                System.out.println();
            }
        }


        // task 5

        public static void doMinMaxArr() {

            int[] nums3 = {17, 146, 85, 0, -96, 15};
            int min, max;
            min = max = nums3[0];

            for (int i = 0; i < nums3.length; i++) {
                if (nums3[i] < min)
                    min = nums3[i];
                if (nums3[i] > max)
                    max = nums3[i];
            }
            System.out.println("Минимальный элемент массива: " + min);
            System.out.println("Максимальный элемент массива: " + max);
        }
    }

