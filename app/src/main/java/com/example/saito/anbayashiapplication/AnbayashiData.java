package com.example.saito.anbayashiapplication;

/**
 * Created by saito on 2016/02/14.
 */
public class AnbayashiData {

    // あんばやしの本数
    private int number;
    // おまけの本数
    private int addition;
    // コメント「あたり」、「まあまあ」、「残念」
    private String comment;

    public AnbayashiData(int number, int addition, String comment) {
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public int getAddition() {
        return addition;
    }

    public String getComment() {
        return comment;
    }
}
