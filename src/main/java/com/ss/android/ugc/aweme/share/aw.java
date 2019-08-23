package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.ColorInt;
import android.support.v4.app.Fragment;
import android.widget.LinearLayout;

public abstract class aw extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f3870a;

    public abstract void a();

    public abstract void a(int i, int i2, Intent intent);

    public abstract String b();

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i);

    public abstract void setSyncShareViewTextColor(@ColorInt int i);

    public abstract void setSyncShareViewTextSize(float f2);

    public void setSyncShareViewTitle(String str) {
    }

    public Fragment getFragment() {
        return this.f3870a;
    }

    public aw(Context context) {
        super(context);
    }
}
