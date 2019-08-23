package com.ss.ugc.live.b.a;

import android.os.Handler;
import android.os.Looper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ugc.live.b.a.e.a;
import com.ss.ugc.live.b.a.e.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class f implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static f f78665a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Long, g> f78666b;

    /* renamed from: c  reason: collision with root package name */
    public final e f78667c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f78668d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    final Handler f78669e;

    /* renamed from: f  reason: collision with root package name */
    public int f78670f = 0;
    private final Queue<c> g = new ArrayDeque();

    public static f a() {
        if (f78665a != null) {
            return f78665a;
        }
        throw new IllegalStateException("GiftResourceManager is not initialized");
    }

    public final void b() {
        if (this.f78670f < this.f78667c.f78657e && !this.g.isEmpty()) {
            this.f78670f++;
            c(this.g.poll());
        }
    }

    public final void a(c cVar) {
        a(cVar, (d) null);
    }

    public final void c(c cVar) {
        this.f78667c.f78654b.a(cVar, this.f78667c).a(cVar, this);
    }

    public f(e eVar) {
        this.f78667c = eVar;
        this.f78666b = new HashMap();
        this.f78669e = new Handler(Looper.getMainLooper());
    }

    public String d(c cVar) {
        String a2 = b.a(this.f78667c.f78653a.a(cVar));
        if (!cVar.f78638e) {
            try {
                return a2 + a.a(cVar.a());
            } catch (Exception unused) {
            }
        }
        return a2;
    }

    public final boolean b(c cVar) {
        if (cVar == null) {
            return false;
        }
        String a2 = b.a(this.f78667c.f78653a.a(cVar));
        return new File(a2 + ".fetched").exists();
    }

    public final void a(final c cVar, final int i) {
        this.f78669e.post(new Runnable() {
            public final void run() {
                g gVar = f.this.f78666b.get(Long.valueOf(cVar.f78634a));
                if (gVar != null) {
                    for (d a2 : gVar.f78681a) {
                        a2.a(i);
                    }
                }
            }
        });
    }

    public final void a(final c cVar, final com.ss.ugc.live.b.a.c.a aVar) {
        this.f78669e.post(new Runnable() {
            public final void run() {
                g gVar = f.this.f78666b.get(Long.valueOf(cVar.f78634a));
                if (gVar != null) {
                    if (cVar.f78639f < Math.max(cVar.f78635b.length, f.this.f78667c.f78655c) - 1) {
                        f fVar = f.this;
                        fVar.f78669e.postDelayed(new Runnable(cVar) {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ c f78676a;

                            public final void run() {
                                this.f78676a.c();
                                f.this.c(this.f78676a);
                            }

                            {
                                this.f78676a = r2;
                            }
                        }, (long) (fVar.f78667c.f78656d * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                        return;
                    }
                    for (d a2 : gVar.f78681a) {
                        a2.a((Throwable) aVar);
                    }
                }
                f.this.f78666b.remove(Long.valueOf(cVar.f78634a));
                for (b a3 : f.this.f78668d) {
                    a3.a(aVar);
                }
                f fVar2 = f.this;
                fVar2.f78670f--;
                f.this.b();
            }
        });
    }

    public final void a(c cVar, d dVar) {
        if (cVar != null) {
            if (!b(cVar)) {
                long j = cVar.f78634a;
                if (!this.f78666b.containsKey(Long.valueOf(j))) {
                    g gVar = new g(cVar);
                    if (dVar != null) {
                        gVar.a(dVar);
                    }
                    this.f78666b.put(Long.valueOf(j), gVar);
                    cVar.c();
                    this.g.add(cVar);
                    b();
                } else if (dVar != null) {
                    this.f78666b.get(Long.valueOf(j)).a(dVar);
                }
            } else if (dVar != null) {
                dVar.a(cVar.f78634a, d(cVar));
            }
        }
    }

    public final /* synthetic */ void a(final c cVar, Object obj) {
        String a2 = b.a(this.f78667c.f78653a.a(cVar));
        try {
            new File(a2 + ".fetched").createNewFile();
        } catch (IOException unused) {
        }
        this.f78669e.post(new Runnable() {
            public final void run() {
                f fVar = f.this;
                c cVar = cVar;
                long j = cVar.f78634a;
                String d2 = fVar.d(cVar);
                g gVar = fVar.f78666b.get(Long.valueOf(j));
                if (gVar != null) {
                    for (d a2 : gVar.f78681a) {
                        a2.a(cVar.f78634a, d2);
                    }
                }
                fVar.f78666b.remove(Long.valueOf(j));
                for (b a3 : fVar.f78668d) {
                    a3.a(cVar.f78634a, cVar);
                }
                fVar.f78670f--;
                fVar.b();
            }
        });
    }
}
