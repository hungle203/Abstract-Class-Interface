//package thuchanh;
//
//
//import hinhhoc.hinhhoc2.Circle;
//import hinhhoc.CircleComparator;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class ComparableCircle {
//    public static void main(String[] args) {
//        hinhhoc2.Circle[] circles = new hinhhoc2.Circle[3];
//        circles[0] = new hinhhoc2.Circle(3);
//        circles[1] = new hinhhoc2.Circle();
//        circles[2] = new hinhhoc2.Circle("indigo", false,3.7);
//
//        System.out.println("Pre-sorted");
//        for (hinhhoc2.Circle circle: circles) {
//            System.out.println(circle);
//        }
//
//        Comparator circleComparator = new CircleComparator();
//        Arrays.sort(circles,circleComparator);
//
//        System.out.println("After-sorted: ");
//        for (hinhhoc2.Circle circle: circles) {
//            System.out.println(circle);
//
//        }
//
//    }
//}
