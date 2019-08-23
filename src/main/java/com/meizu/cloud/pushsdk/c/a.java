package com.meizu.cloud.pushsdk.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.b.c;
import com.meizu.cloud.pushsdk.c.b.f;
import com.meizu.cloud.pushsdk.c.e.b;
import com.meizu.cloud.pushsdk.c.e.c;
import com.meizu.cloud.pushsdk.c.f.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static c f27083a;

    /* renamed from: b  reason: collision with root package name */
    private static BroadcastReceiver f27084b;

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f27085c = new AtomicBoolean(false);

    private static b a(Context context) {
        return new b.a().a(context).a();
    }

    public static c a(Context context, com.meizu.cloud.pushsdk.b.c.a aVar, f fVar) {
        if (f27083a == null) {
            synchronized (a.class) {
                if (f27083a == null) {
                    f27083a = a(b(context, aVar, fVar), (b) null, context);
                }
                if (f27085c.compareAndSet(false, true)) {
                    a(context, f27083a);
                }
            }
        }
        return f27083a;
    }

    public static c a(Context context, f fVar) {
        return a(context, (com.meizu.cloud.pushsdk.b.c.a) null, fVar);
    }

    public static c a(Context context, boolean z) {
        if (f27083a == null) {
            synchronized (a.class) {
                if (f27083a == null) {
                    f27083a = a(b(context, null, null), (b) null, context);
                }
            }
        }
        DebugLogger.i("PushAndroidTracker", "can upload subject " + z);
        if (z) {
            f27083a.a(a(context));
        }
        return f27083a;
    }

    private static c a(com.meizu.cloud.pushsdk.c.b.c cVar, b bVar, Context context) {
        c.a aVar = new c.a(cVar, "PushAndroidTracker", context.getPackageCodePath(), context, com.meizu.cloud.pushsdk.c.e.a.a.class);
        return new com.meizu.cloud.pushsdk.c.e.a.a(aVar.a(com.meizu.cloud.pushsdk.c.f.b.VERBOSE).a(Boolean.FALSE).a(bVar).a(4));
    }

    private static String a() {
        if (MzSystemUtils.isInternational() || MzSystemUtils.isIndiaLocal()) {
            return "push-statics.in.meizu.com";
        }
        DebugLogger.e("QuickTracker", "current statics domain is " + "push-statics.meizu.com");
        return "push-statics.meizu.com";
    }

    private static void a(Context context, final c cVar) {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        AnonymousClass1 r1 = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (e.a(context)) {
                    com.meizu.cloud.pushsdk.c.f.c.a("QuickTracker", "restart track event: %s", "online true");
                    cVar.a();
                }
            }
        };
        f27084b = r1;
        context.registerReceiver(r1, intentFilter);
    }

    private static com.meizu.cloud.pushsdk.c.b.c b(Context context, com.meizu.cloud.pushsdk.b.c.a aVar, f fVar) {
        return new com.meizu.cloud.pushsdk.c.b.a.a(new c.a(a(), context, com.meizu.cloud.pushsdk.c.b.a.a.class).a(fVar).a(aVar).a(1).a(com.meizu.cloud.pushsdk.c.b.a.DefaultGroup).b(com.meizu.cloud.pushsdk.c.b.a.DefaultGroup.a()).c(2));
    }
}
