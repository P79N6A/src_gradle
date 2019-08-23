package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.j;
import com.ss.android.socialbase.downloader.e.d;

public final class i implements j {
    public final int a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String b2 = d.b(String.format("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(b2)) {
            return 0;
        }
        return b2.hashCode();
    }
}
