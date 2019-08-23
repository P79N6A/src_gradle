package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.am;
import java.util.ArrayList;

public final class hw extends am.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f82208a;

    hw(Context context) {
        this.f82208a = context;
    }

    public final void b() {
        ArrayList arrayList;
        synchronized (hv.a()) {
            arrayList = new ArrayList(hv.a());
            hv.a().clear();
        }
        hv.b(this.f82208a, arrayList);
    }
}
