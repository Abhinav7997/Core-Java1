package coreJavaPrograms;

public class swappingVariables {
    public static void swapWithoutTemp(int a ,int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b );
    }
}