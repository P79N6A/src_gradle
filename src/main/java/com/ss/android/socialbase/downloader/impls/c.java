package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.g;

public final class c implements g {
    public final int a(long j) {
        if (j < 10485760) {
            return 1;
        }
        if (j < 52428800) {
            return 2;
        }
        return j < 104857600 ? 3 : 4;
    }
}
