package com.company;

public class Audio extends Book{
    private int minute;

    public Audio(String name, String autor, int page, int year, int minute) {
        super(name, autor, page, year);
        this.minute = minute;
    }

    @Override
    public String toString() {
        return super.toString() +
                "minute=" + minute +
                "} " ;
    }

    public void listen(){
        System.out.println("Audio book is convient to listen on the road");
    }
}
