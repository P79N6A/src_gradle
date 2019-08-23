package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import java.util.concurrent.Callable;

public final class zzk implements Callable<SharedPreferences> {
    private /* synthetic */ Context zztH;

    zzk(Context context) {
        this.zztH = context;
    }

    public final /* synthetic */ Object call() throws Exception {
        return c.a(this.zztH, "google_sdk_flags", 0);
    }
}
