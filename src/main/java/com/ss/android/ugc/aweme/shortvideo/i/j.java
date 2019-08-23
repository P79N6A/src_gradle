package com.ss.android.ugc.aweme.shortvideo.i;

import com.meituan.robust.ChangeQuickRedirect;

public final class j extends m {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final int convertDpToHeight(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertDpToWidth(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    public final int convertHeightToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public final int convertWidthToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    public j(String str, int i, int i2) {
        super(str, i, i2);
        this.mIsCircle = true;
    }
}
