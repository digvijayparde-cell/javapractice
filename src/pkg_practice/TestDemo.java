package pkg_practice;

import pkg_testing.Demo;

public class TestDemo {

    public static void main(String[] args) {
        int sum = Demo.add(50, 50);
        System.out.println(sum);

        Demo obj = new Demo();
        obj.minus(100, 30);
    }
}