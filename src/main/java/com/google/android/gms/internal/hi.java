package com.google.android.gms.internal;

import android.database.ContentObserver;
import android.os.Handler;

public final class hi extends ContentObserver {
    hi(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        hh.zzbUb.set(true);
    }
}
