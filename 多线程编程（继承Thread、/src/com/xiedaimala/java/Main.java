package com.xiedaimala.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadDemo T1 = new ThreadDemo("Tread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}
