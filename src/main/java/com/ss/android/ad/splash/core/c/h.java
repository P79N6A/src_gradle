package com.ss.android.ad.splash.core.c;

import android.text.TextUtils;

public class h {
    public String B;

    public h() {
    }

    public String w() {
        return this.B;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(w())) {
            return super.hashCode();
        }
        return w().hashCode();
    }

    public h(String str) {
        this.B = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof h) && !TextUtils.isEmpty(w())) {
            h hVar = (h) obj;
            if (!TextUtils.isEmpty(hVar.w())) {
                return TextUtils.equals(w(), hVar.w());
            }
        }
        return false;
    }
}
