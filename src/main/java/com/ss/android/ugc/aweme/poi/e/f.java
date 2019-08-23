package com.ss.android.ugc.aweme.poi.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.poi.c.a;
import com.ss.android.ugc.aweme.poi.model.o;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59785a;

    /* renamed from: b  reason: collision with root package name */
    private long f59786b = -1;

    /* renamed from: c  reason: collision with root package name */
    private o f59787c;

    /* renamed from: d  reason: collision with root package name */
    private a f59788d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59785a, false, 66819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59785a, false, 66819, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59786b == -1) {
            this.f59786b = System.currentTimeMillis();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59785a, false, 66820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59785a, false, 66820, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59786b != -1) {
            a(System.currentTimeMillis() - this.f59786b);
            this.f59786b = -1;
        }
    }

    private void a(long j) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f59785a, false, 66821, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f59785a, false, 66821, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.f59787c != null) {
            d a2 = d.a().a("enter_from", "poi_page");
            if (this.f59788d != null) {
                str = this.f59788d.f59759e;
            } else {
                str = "";
            }
            d a3 = a2.a("previous_page", str);
            if (this.f59788d != null) {
                str2 = this.f59788d.f59756b;
            } else {
                str2 = "";
            }
            d a4 = a3.a("poi_id", str2);
            if (this.f59788d != null) {
                str3 = this.f59788d.m;
            } else {
                str3 = "";
            }
            h.a(this.f59788d, "outer_section_stay_time", a4.a("poi_channel", str3).a("duration", String.valueOf(j)));
        }
    }

    public f(o oVar, a aVar) {
        this.f59787c = oVar;
        this.f59788d = aVar;
    }
}
