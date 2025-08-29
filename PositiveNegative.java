// // public class PositiveNegative {
// //     public static void main(String[] args) {
// //         int num = 5;
// //         if (num > 0) {
// //             System.out.println("Positive");
// //         } else if (num < 0) {
// //             System.out.println("Negative");
// //         } else {
// //             System.out.println("Zero");
// //         }
// //     }
// // }

// public class PositiveNegative {
//     public static void main(String[] args) {
//         int num = 7;
//         if (num >= 0) {
//             if (num == 0) 
//                 System.out.println("Zero");
//             else
//                 System.out.println("Positive");
//         } else {
//             System.out.println("Negative");
//         }
//     }
// }

public class PositiveNegative {
    public static void main(String[] args) {
        int num = 0;
        if (num == 0) {
            System.out.println("Zero");
        } else {
            String result = (num > 0) ? "Positive" : "Negative";
            System.out.println(result);
        }
    }
}