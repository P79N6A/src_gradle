package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.ugc.aweme.shortvideo.ea;

public final class j implements p {
    public final long a(int i, int i2) {
        if (i == 1) {
            return 3000;
        }
        if (i == 2) {
            return ea.f66827f;
        }
        if (i == 3) {
            return 30000;
        }
        return i > 3 ? 300000 : 0;
    }
}
