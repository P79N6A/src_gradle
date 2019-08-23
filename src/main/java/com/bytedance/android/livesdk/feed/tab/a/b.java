package com.bytedance.android.livesdk.feed.tab.a;

import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.l.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14395a;
    private static final String n = com.bytedance.android.livesdk.feed.b.b.c().i().b();

    /* renamed from: b  reason: collision with root package name */
    String[] f14396b = {"直播"};

    /* renamed from: c  reason: collision with root package name */
    String[] f14397c = {"https://" + n + "/webcast/feed/"};

    /* renamed from: d  reason: collision with root package name */
    String[] f14398d = {"live"};

    /* renamed from: e  reason: collision with root package name */
    String[] f14399e = {"live"};

    /* renamed from: f  reason: collision with root package name */
    int[] f14400f = {1};
    int[] g = {1};
    int[] h = {1};
    int[] i = {1};
    int[] j = {1001};
    int[] k = {0};
    boolean[] l = {false};
    int[] m = {0};

    public final List<g> a() {
        if (PatchProxy.isSupport(new Object[0], this, f14395a, false, 8907, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f14395a, false, 8907, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList(1);
        for (int i2 = 0; i2 < this.f14396b.length; i2++) {
            g gVar = new g();
            gVar.f14080b = (long) this.i[i2];
            gVar.h = this.f14398d[i2];
            gVar.f14081c = this.f14396b[i2];
            gVar.f14083e = this.f14397c[i2];
            gVar.f14082d = this.f14400f[i2];
            gVar.f14084f = this.g[i2];
            gVar.g = this.h[i2];
            gVar.i = this.j[i2];
            gVar.j = this.k[i2];
            arrayList.add(gVar);
        }
        return arrayList;
    }

    public b() {
        if (c.d()) {
            this.f14397c = new String[]{"https://" + n + "/webcast/feed/?content_type=0&style=1&type=live&tab_id=4&channel_id=60487708007"};
            return;
        }
        if (c.e()) {
            this.f14397c = new String[]{"https://" + n + "/webcast/feed/?content_type=0&style=2&channel_id=21"};
            this.f14396b[0] = "Top LIVEs";
            this.g[0] = 2;
        }
    }
}
