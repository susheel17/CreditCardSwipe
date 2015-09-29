package com.swipe.susheel.creditcardswipe.audio.decoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Susheel on 9/25/2015.
 */
public class SwipeData {


    public String content;
    public List<Integer> badCharIndices;
    public boolean badRead;
    public List<Integer> raw;

    public SwipeData() {
        content = "";
        badRead = false;
        badCharIndices = new ArrayList<Integer>();
        raw = new ArrayList<Integer>(); // placeholder.
    }

    public void setContent(String text) {
        this.content = text;
    }

    public void addBadCharIndex(int i) {
        badCharIndices.add(i);
    }

    public void setBadRead() {
        badRead = true;
    }

    public boolean isBadRead() {
        return badRead;
    }

    public List<Integer> getBadCharIndices() {
        return this.badCharIndices;
    }


}
