package com.ss.optimizer.live.sdk.a;

import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f78408a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f78409b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final a f78410c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.optimizer.live.sdk.a.a.a f78411d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78412e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f78413f = 0;
    private final f g;

    public interface a {
        void a(com.ss.optimizer.live.sdk.a.a.a aVar);
    }

    public final void a() {
        if (!this.f78412e) {
            this.f78412e = true;
            this.g.a(new Runnable() {
                public final void run() {
                    final com.ss.optimizer.live.sdk.a.a.a aVar;
                    try {
                        a aVar2 = e.this.f78410c;
                        aVar = new com.ss.optimizer.live.sdk.a.a.a(new JSONObject(aVar2.f78386b.a(a.a(aVar2.f78385a + "/video/live/qos/v2/ipSettings", aVar2.f78387c))));
                    } catch (Exception unused) {
                        aVar = null;
                    }
                    e.this.f78409b.post(new Runnable() {
                        public final void run() {
                            e.this.f78412e = false;
                            if (aVar == null) {
                                e eVar = e.this;
                                int i = eVar.f78413f + 1;
                                eVar.f78413f = i;
                                if (i <= 5) {
                                    e eVar2 = e.this;
                                    eVar2.f78409b.removeCallbacksAndMessages(null);
                                    eVar2.f78409b.postDelayed(new Runnable() {
                                        public final void run() {
                                            e.this.a();
                                        }
                                    }, 10000);
                                    return;
                                }
                                return;
                            }
                            e.this.f78413f = 0;
                            e.this.f78411d = aVar;
                            for (a a2 : e.this.f78408a) {
                                a2.a(e.this.f78411d);
                            }
                        }
                    });
                }
            });
        }
    }

    e(f fVar, a aVar) {
        this.g = fVar;
        this.f78410c = aVar;
    }
}
