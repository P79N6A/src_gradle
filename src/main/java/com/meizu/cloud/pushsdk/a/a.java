package com.meizu.cloud.pushsdk.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.a.a.b;
import com.meizu.cloud.pushsdk.a.c;
import com.meizu.cloud.pushsdk.base.f;
import com.meizu.cloud.pushsdk.c.a.c;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26829a = "a";

    public static c a(Context context) {
        c cVar = new c();
        c c2 = c(context);
        Map a2 = c2.a();
        Map b2 = c2.b();
        Map c3 = c2.c();
        Map d2 = c2.d();
        if (a2.size() > 0) {
            cVar.a(b.f26843a, (Object) a2);
        }
        if (b2.size() > 0) {
            cVar.a(b.f26848f, (Object) b2);
        }
        if (c3.size() > 0) {
            cVar.a(b.o, (Object) c3);
        }
        if (d2.size() > 0) {
            cVar.a(b.v, (Object) d2);
        }
        return cVar;
    }

    public static void b(final Context context) {
        f.a().execute(new Runnable() {
            public final void run() {
                b.a(context).a("POST", null, a.a(context).toString());
            }
        });
    }

    private static c c(Context context) {
        return new c.a().a(context).a();
    }
}
