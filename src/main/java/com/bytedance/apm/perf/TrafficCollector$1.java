package com.bytedance.apm.perf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.c;

class TrafficCollector$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f19050a;

    TrafficCollector$1(f fVar) {
        this.f19050a = fVar;
    }

    public void onReceive(final Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            final String a2 = f.a(context);
            if (!TextUtils.isEmpty(a2)) {
                b.a().a((Runnable) new Runnable() {
                    public final void run() {
                        f fVar = TrafficCollector$1.this.f19050a;
                        Context context = context;
                        String str = a2;
                        if (TextUtils.isEmpty(fVar.f2074a)) {
                            fVar.f2074a = str;
                            fVar.f2075d = 0;
                            fVar.f2076e = 0;
                            fVar.f2077f = c.a(context);
                            f.a(context, fVar.f2074a, fVar.f2075d, fVar.f2076e, fVar.f2077f, 1);
                            return;
                        }
                        if (!str.equals(fVar.f2074a)) {
                            if ("WIFI".equals(fVar.f2074a)) {
                                fVar.f2076e += c.a(context) - fVar.f2077f;
                            } else {
                                fVar.f2075d += c.a(context) - fVar.f2077f;
                            }
                            fVar.f2074a = str;
                            fVar.f2077f = c.a(context);
                            f.a(context, fVar.f2074a, fVar.f2075d, fVar.f2076e, fVar.f2077f, 1);
                        }
                    }
                });
            }
        }
    }
}
