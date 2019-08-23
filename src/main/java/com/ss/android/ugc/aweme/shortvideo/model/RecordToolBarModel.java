package com.ss.android.ugc.aweme.shortvideo.model;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;

public class RecordToolBarModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @StringRes
    public int descId = -1;
    public boolean enabled = true;
    public boolean needsNotify;
    public OnAnimateListener onAnimateListener;
    public RecordToolBarClickListener onClickListener;
    @DrawableRes
    public int resId;
    public boolean shouldAnimate;
    public int status;

    public interface OnAnimateListener {
        void onAnimate(View view);
    }

    public RecordToolBarModel notifyStateChanged() {
        this.needsNotify = true;
        return this;
    }

    public void setNeedsNotifyFalse() {
        this.needsNotify = false;
    }

    public RecordToolBarModel(int i, RecordToolBarClickListener recordToolBarClickListener) {
        this.resId = i;
        this.onClickListener = recordToolBarClickListener;
        this.status = 4;
    }

    public RecordToolBarModel(int i, RecordToolBarClickListener recordToolBarClickListener, int i2) {
        this.resId = i;
        this.onClickListener = recordToolBarClickListener;
        this.descId = i2;
        this.status = 4;
    }
}
