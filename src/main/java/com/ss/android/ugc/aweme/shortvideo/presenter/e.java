package com.ss.android.ugc.aweme.shortvideo.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.PlanC;
import com.ss.android.ugc.aweme.shortvideo.fh;
import java.lang.ref.SoftReference;
import java.util.Map;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68840a;

    /* renamed from: b  reason: collision with root package name */
    private PlanC f68841b;

    /* renamed from: c  reason: collision with root package name */
    private fh f68842c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68840a, false, 78198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68840a, false, 78198, new Class[0], Void.TYPE);
        } else if (this.f68842c != null) {
            r.a("enter_multi_shoot_page", (Map) d.a().a("creation_id", this.f68842c.q).a("shoot_way", this.f68842c.r).a("enter_from", "multi_shoot_page").f34114b);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68840a, false, 78199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68840a, false, 78199, new Class[0], Void.TYPE);
            return;
        }
        r.a("enter_video_shoot_page", (Map) d.a().a("creation_id", this.f68842c.q).a("shoot_way", this.f68842c.r).a("enter_from", "multi_shoot_page").f34114b);
    }

    public final void a(int i) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68840a, false, 78201, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68840a, false, 78201, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (i == 0) {
            str = "single_content";
        } else {
            str = "mutiple_content";
        }
        d a3 = a2.a("upload_type", str).a("content_type", "video").a("previous_page", this.f68842c.al).a("shoot_way", this.f68842c.r);
        if (this.f68841b.z) {
            str2 = "upload_page";
        } else {
            str2 = "multi_shoot_page";
        }
        r.a("enter_upload_cropping_page", (Map) a3.a("enter_from", str2).a("creation_id", this.f68842c.q).f34114b);
    }

    public final void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68840a, false, 78200, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68840a, false, 78200, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("creation_id", this.f68842c.q).a("shoot_way", this.f68842c.r);
        if (z) {
            str = "video_shoot_page";
        } else {
            str = "multi_shoot_page";
        }
        r.a("enter_upload_page", (Map) a2.a("enter_from", str).f34114b);
    }

    public e(PlanC planC, fh fhVar) {
        this.f68841b = (PlanC) new SoftReference(planC).get();
        this.f68842c = fhVar;
    }
}
