package com.ss.android.ugc.aweme.shortvideo.i;

import com.meituan.robust.ChangeQuickRedirect;

public final class l extends m {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final int convertDpToWidth(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertWidthToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public final int convertDpToHeight(int i) {
        double d2 = (double) ((((float) i) / 375.0f) * ((float) this.outputVideoWidth));
        double d3 = (double) this.outputVideoWidth;
        Double.isNaN(d3);
        Double.isNaN(d2);
        return (int) (d2 + (d3 * 0.010666666666666666d));
    }

    public final int convertHeightToDp(int i) {
        double d2 = (double) i;
        double d3 = (double) this.outputVideoWidth;
        Double.isNaN(d3);
        Double.isNaN(d2);
        double d4 = d2 - (d3 * 0.010666666666666666d);
        double d5 = (double) this.outputVideoWidth;
        Double.isNaN(d5);
        return (int) ((d4 / d5) * 375.0d);
    }

    public l(String str, int i, int i2) {
        super(str, i, i2);
    }
}
