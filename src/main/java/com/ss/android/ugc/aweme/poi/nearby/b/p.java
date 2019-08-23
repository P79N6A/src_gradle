package com.ss.android.ugc.aweme.poi.nearby.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.poi.model.au;
import java.util.List;

public final class p implements c<SimplePoiInfoStruct> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60035a;

    /* renamed from: b  reason: collision with root package name */
    private o f60036b;

    /* renamed from: c  reason: collision with root package name */
    private a f60037c;

    public interface a {
        void a(List<SimplePoiInfoStruct> list);

        void e(Exception exc);

        void s();
    }

    public final void b(List<SimplePoiInfoStruct> list, boolean z) {
    }

    public final void c(Exception exc) {
    }

    public final void c(List<SimplePoiInfoStruct> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void n_() {
    }

    public final void s_() {
    }

    public final void z_() {
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f60035a, false, 65254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60035a, false, 65254, new Class[0], Void.TYPE);
            return;
        }
        if (this.f60037c != null) {
            this.f60037c.s();
        }
    }

    public p(a aVar) {
        this.f60037c = aVar;
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60035a, false, 65253, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60035a, false, 65253, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f60037c != null) {
            this.f60037c.e(exc);
        }
    }

    public final void a(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60035a, false, 65252, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60035a, false, 65252, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60036b == null) {
            this.f60036b = new o();
            this.f60036b.a(this);
            this.f60036b.a(new au());
        }
        if (TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.c.a())) {
            str = com.ss.android.ugc.aweme.feed.c.d();
        } else {
            str = com.ss.android.ugc.aweme.feed.c.a();
        }
        this.f60036b.a(1, 10, "", "", "", str, Integer.valueOf(i), "", 0);
    }

    public final void a(List<SimplePoiInfoStruct> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60035a, false, 65255, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f60035a, false, 65255, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60037c != null) {
            this.f60037c.a(list);
        }
    }
}
