package com.mapbox.android.gestures;

import android.util.Pair;

public final class h extends Pair<Integer, Integer> {
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if ((((Integer) this.first).equals(hVar.first) && ((Integer) this.second).equals(hVar.second)) || (((Integer) this.first).equals(hVar.second) && ((Integer) this.second).equals(hVar.first))) {
                return true;
            }
        }
        return false;
    }

    public h(Integer num, Integer num2) {
        super(num, num2);
    }
}
