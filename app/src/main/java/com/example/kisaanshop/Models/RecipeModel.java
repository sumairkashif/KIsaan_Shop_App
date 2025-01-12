package com.example.kisaanshop.Models;

public class RecipeModel {
    int pic;
    String txt;
    String txt1;

    public RecipeModel(int pic, String txt, String txt1) {
        this.pic = pic;
        this.txt = txt;
        this.txt1 = txt1;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
}
