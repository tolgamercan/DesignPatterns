package org.example;

import org.example.Instance;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Instance instance=Instance.getInstance();
        }
    }
}