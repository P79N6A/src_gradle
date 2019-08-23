package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bi;
import dmt.av.video.b.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71119a;

    /* renamed from: b  reason: collision with root package name */
    private static b f71120b = new b();

    /* renamed from: c  reason: collision with root package name */
    private List<Long> f71121c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d  reason: collision with root package name */
    private bi f71122d;

    public static b a() {
        return f71120b;
    }

    private b() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71119a, false, 80838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71119a, false, 80838, new Class[0], Void.TYPE);
            return;
        }
        synchronized (f71120b) {
            this.f71122d = bi.a();
        }
        this.f71121c.clear();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71119a, false, 80839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71119a, false, 80839, new Class[0], Void.TYPE);
            return;
        }
        this.f71121c.add(Long.valueOf(System.currentTimeMillis()));
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71119a, false, 80840, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f71119a, false, 80840, new Class[]{String.class}, Void.TYPE);
            return;
        }
        synchronized (f71120b) {
            if (this.f71122d == null) {
                this.f71121c.clear();
                return;
            }
            int size = this.f71121c.size();
            if (size > 1) {
                int i = 0;
                while (i < size - 1) {
                    bi biVar = this.f71122d;
                    StringBuilder sb = new StringBuilder("step");
                    int i2 = i + 1;
                    sb.append(i2);
                    biVar.a(sb.toString(), Long.valueOf(this.f71121c.get(i2).longValue() - this.f71121c.get(i).longValue()));
                    i = i2;
                }
                this.f71122d.a("totaltime", Long.valueOf(this.f71121c.get(this.f71121c.size() - 1).longValue() - this.f71121c.get(0).longValue()));
                this.f71122d.a("useVERecoder", Boolean.valueOf(n.a()));
                com.ss.android.ugc.aweme.base.n.a(str2, this.f71122d.b());
                this.f71122d = null;
                this.f71121c.clear();
            }
        }
    }
}
