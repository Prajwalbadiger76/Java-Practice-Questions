//import java.util.Arrays;
//
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {4, 4, 2, 3, 2, 1, 3};
//        Arrays.sort(arr);
//        for(int num: arr) {
//        	 System.out.print(num + " "); // 1 2 2 3 3 4 4 4
//        }
//
//        int j = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                arr[j++] = arr[i];   // 1 2 3
//            }
//        }
//
//        arr[j++] = arr[arr.length - 1];
//        
//        System.out.println("After removing duplicates:");
//        for (int i = 0; i < j; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}


import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "abcdefa";
        HashSet<Character> set = new HashSet<>();

        boolean unique = true;
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                unique = false;
                break;
            }
        }
        System.out.println(unique);
        System.out.println(unique ? "All unique characters" : "Contains duplicates");
    }
}
