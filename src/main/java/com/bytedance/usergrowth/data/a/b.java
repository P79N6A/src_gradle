package com.bytedance.usergrowth.data.a;

import android.content.Context;
import com.bytedance.usergrowth.data.a.a.c;
import com.bytedance.usergrowth.data.a.a.h;
import java.util.ArrayList;

public final class b implements com.bytedance.usergrowth.data.a.a.b, c, h {
    b() {
    }

    public final void a(Context context) {
        ArrayList arrayList;
        if (d.f2329a.values() == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(d.f2329a.values());
        }
        for (Object next : arrayList) {
            if ((next instanceof c) && !(next instanceof b)) {
                try {
                    ((c) next).a(context);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
