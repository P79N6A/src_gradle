package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.f;

public final class b implements f {
    public final int a(int i, com.ss.android.socialbase.downloader.network.f fVar) {
        if (fVar.ordinal() <= com.ss.android.socialbase.downloader.network.f.MODERATE.ordinal()) {
            return 1;
        }
        if (fVar == com.ss.android.socialbase.downloader.network.f.GOOD) {
            return i - 1;
        }
        return i;
    }
}
