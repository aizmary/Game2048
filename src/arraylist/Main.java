package arraylist;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rmd = new Random();

        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(124);
        myArrayList.add(234);
        myArrayList.add(567);

        System.out.println(myArrayList);
    }
}
