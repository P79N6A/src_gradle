package com.ss.android.vesdk;

import android.support.annotation.RestrictTo;
import com.bef.effectsdk.b;
import com.ss.android.medialib.VideoSdkCore;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {
    public static void a(b bVar) {
        VideoSdkCore.setResourceFinder(bVar);
    }
}
