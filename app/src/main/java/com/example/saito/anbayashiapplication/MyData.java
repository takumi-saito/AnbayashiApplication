package com.example.saito.anbayashiapplication;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by saito on 2016/02/14.
 */
public class MyData {

    public static int DATACOUNT = 80;

    private ArrayList<Integer> createdNumber;
    private ArrayList<String> createComment;
    private ArrayList<Integer> createAddition;

    public MyData() {

        this.createdNumber = CreateNumber();
        this.createComment = CreateComment(createdNumber);
        this.createAddition = CreateAddition(createdNumber);
    }

    public ArrayList<Integer> getCreatedNumber() {
        return createdNumber;
    }

    public ArrayList<String> getCreateComment() {
        return createComment;
    }

    public ArrayList<Integer> getCreateAddition() {
        return createAddition;
    }

    /**
     *あんばやしのルーレット数値を作成
     * @return
     */
    private ArrayList<Integer> CreateNumber(){

        Random rnd = new Random();
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        for (int i = 0; i <DATACOUNT; i++) {
            numberArray.add(rnd.nextInt(21));
        }
        return numberArray;
    }

    private ArrayList<String> CreateComment(ArrayList<Integer> createdNumber){

        ArrayList<String> commentArray = new ArrayList<String>();
        for (Integer number: createdNumber) {
            if (number.intValue() > 14) {
                commentArray.add("Dude!!");
            }
            else if (number.intValue() > 9) {
                commentArray.add("soso");
            }
            else {
                commentArray.add("F*ck!");
            }
        }
        return commentArray;
    }

    private ArrayList<Integer> CreateAddition(ArrayList<Integer> createNumber){
        ArrayList<Integer> commentAddition = new ArrayList<Integer>();
        for (Integer number: createdNumber) {
            if (number.intValue() > 14) {
                commentAddition.add(1);
            }
            else if (number.intValue() > 9) {
                commentAddition.add(2);
            }
            else {
                commentAddition.add(3);
            }
        }
        return commentAddition;
    }
}
