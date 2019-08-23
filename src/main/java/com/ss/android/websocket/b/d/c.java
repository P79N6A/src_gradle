package com.ss.android.websocket.b.d;

import android.content.Context;
import com.ss.android.websocket.b.b.e;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private int f78222a;

    /* renamed from: b  reason: collision with root package name */
    private int f78223b;

    public final void a() {
        super.a();
        this.f78223b = 0;
    }

    public c(Context context) {
        this(context, 3);
    }

    public final long a(e eVar) {
        long j;
        if (this.f78223b < this.f78222a) {
            j = super.a(eVar);
        } else {
            j = -1;
        }
        if (j != -1) {
            this.f78223b++;
        }
        return j;
    }

    private c(Context context, int i) {
        super(context);
        this.f78222a = 3;
    }
}
