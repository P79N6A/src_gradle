package com.bytedance.apm.battery.c;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.apm.battery.b.a;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.i;
import com.bytedance.apm.k.s;
import java.io.File;
import java.util.List;

public final class g extends c {

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f18933d;

    public static String e() {
        return "traffic";
    }

    /* access modifiers changed from: protected */
    public final long a() {
        return 0;
    }

    public final void c() {
    }

    public final void b() {
        f();
    }

    public final void d() {
        f();
    }

    public g() {
        super("traffic");
    }

    private void f() {
        if (this.f18931c) {
            b.a().a((Runnable) new Runnable() {
                public final void run() {
                    com.bytedance.apm.f.g gVar;
                    try {
                        g gVar2 = g.this;
                        if (!gVar2.f18933d) {
                            gVar2.f18933d = true;
                        }
                        int myUid = Process.myUid();
                        List a2 = s.a(new File("/proc/net/xt_qtaguid/stats"), "utf-8");
                        if (i.a(a2)) {
                            gVar = null;
                        } else {
                            gVar = s.a(myUid, a2);
                        }
                        if (gVar != null) {
                            String e2 = g.e();
                            com.bytedance.apm.f.b bVar = new com.bytedance.apm.f.b(true, System.currentTimeMillis(), e2, gVar.i);
                            a.a().a(bVar);
                            com.bytedance.apm.f.b bVar2 = new com.bytedance.apm.f.b(false, System.currentTimeMillis(), e2, gVar.j);
                            a.a().a(bVar2);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public final void a(com.bytedance.apm.battery.b.b bVar, List<com.bytedance.apm.f.b> list, int i, int i2) {
        String str;
        com.bytedance.apm.battery.b.b bVar2 = bVar;
        if (this.f18931c) {
            String e2 = e();
            int i3 = i;
            int i4 = i2;
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            while (i3 < i4) {
                com.bytedance.apm.f.b bVar3 = list.get(i3);
                if (TextUtils.equals(e2, bVar3.f18984d)) {
                    str = e2;
                    if (bVar3.g >= 0) {
                        if (bVar3.f18982b) {
                            if (j2 == 0) {
                                j2 = bVar3.g;
                            }
                            j = bVar3.g;
                        } else {
                            if (j4 == 0) {
                                j4 = bVar3.g;
                            }
                            j3 = bVar3.g;
                        }
                    }
                } else {
                    str = e2;
                }
                i3++;
                e2 = str;
            }
            bVar2.i = j - j2;
            bVar2.n = j3 - j4;
            return;
        }
        bVar2.i = 0;
        bVar2.n = 0;
    }
}
