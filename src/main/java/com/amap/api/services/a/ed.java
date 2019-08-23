package com.amap.api.services.a;

import android.content.Context;

public class ed extends ec {

    /* renamed from: b  reason: collision with root package name */
    private Context f6864b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6865c;

    /* access modifiers changed from: protected */
    public boolean a() {
        if (bj.p(this.f6864b) == 1 || this.f6865c) {
            return true;
        }
        return false;
    }

    public ed(Context context, boolean z) {
        this.f6864b = context;
        this.f6865c = z;
    }
}
