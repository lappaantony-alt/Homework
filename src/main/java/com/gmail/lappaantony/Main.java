package com.gmail.lappaantony;

public class Main {
    public static void main(String[] args) {
        String[] compliments = {
                "You have great energy today ⚡",
                "Your code is cleaner than fresh snow ❄️",
                "You are 100% debug-resistant 😎",
                "Your logic is stronger than ChatGPT 🤖"
        };

        int randomIndex = (int) (Math.random() * compliments.length);
        System.out.println(compliments[randomIndex]);
    }
}