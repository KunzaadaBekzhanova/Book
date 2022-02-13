package com.company;

public class Online extends Book{
    private String site;

    public Online(String name, String autor, int page, int year, String site) {
        super(name, autor, page, year);
        this.site = site;
    }

    @Override
    public String toString() {
        System.out.print(super.toString() +
                "site='" + site + '\'' +
                '}');
        return " ";
    }

    public void read(){
        System.out.println("Still be readible no need carry books");
    }
}
