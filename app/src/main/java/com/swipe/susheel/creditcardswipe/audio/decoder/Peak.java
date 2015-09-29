package com.swipe.susheel.creditcardswipe.audio.decoder;

/**
 * Created by Susheel on 9/25/2015.
 */
public class Peak {


    // index into samples where this peak was detected
    public int index;

    // sample value
    public int value;

    public Peak() {
        this(0, 0);
    }

    public Peak(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean sameSign(Peak other) {
        return (this.isPositive() && other.isPositive())
                || (!this.isPositive() && !other.isPositive());
    }

    public String toString() {
        return "[idx: " + index + ", " + "value: " + value + "]";
    }




}
