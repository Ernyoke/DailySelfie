package com.sapientia.ernyoke.dailyselfie;

import android.widget.SlidingDrawer;

import java.util.Comparator;

/**
 * Created by Ernyoke on 11/17/2014.
 */
public class SelfieComparator implements Comparator {
    @Override
    public int compare(Object o, Object o2) {
        Selfie first = (Selfie)o;
        Selfie second = (Selfie)o2;
        return first.compareTo(second);
    }
}
