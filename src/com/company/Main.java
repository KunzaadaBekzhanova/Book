package com.company;

public class Main {

    public static void main(String[] args) {
    Audio audio = new Audio("Kak?","Deil Karnegi",52,2009,5);
    System.out.println(audio);
    audio.listen();
    Online online = new Online("How","Jenny Edition",64,1997,"edx.org");
    System.out.println(online);
    online.read();
    }
}
