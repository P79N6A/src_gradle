package com.ss.android.ugc.aweme.poi.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.a.a;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.aa;
import com.ss.android.ugc.aweme.poi.model.h;
import com.ss.android.ugc.aweme.u.ao;

public class PoiPureAwemeFeedFragment extends AbsPoiAwemeFeedFragment {
    public static ChangeQuickRedirect t;
    private a u;
    private String v = "";

    public final boolean a(PoiDetail poiDetail) {
        return false;
    }

    public final int k() {
        return C0906R.layout.p1;
    }

    public final int l() {
        return 65440;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 66112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 66112, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.m == -1) {
            this.m = System.currentTimeMillis();
        }
    }

    public final h w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 66110, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, t, false, 66110, new Class[0], h.class);
        }
        if (this.f3751c == null) {
            this.f3751c = new v(this);
        }
        return this.f3751c;
    }

    public final i x() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 66111, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, t, false, 66111, new Class[0], i.class);
        }
        if (this.f3750b == null) {
            this.f3750b = new w(this.u, this.v);
        }
        return this.f3750b;
    }

    public final aa y() {
        if (!PatchProxy.isSupport(new Object[0], this, t, false, 66115, new Class[0], aa.class)) {
            return new h(l());
        }
        return (aa) PatchProxy.accessDispatch(new Object[0], this, t, false, 66115, new Class[0], aa.class);
    }

    public final void L_() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 66113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 66113, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.m != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.m;
            if (currentTimeMillis > 0) {
                com.ss.android.b.a.a.a.a(new u(this, currentTimeMillis));
            }
            this.m = -1;
        }
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, t, false, 66109, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, t, false, 66109, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.a(bundle);
        if (bundle != null) {
            this.u = (a) bundle.getSerializable("EXTRA_POI_AWEME_POSITION");
            this.v = bundle.getString("aweme_id", "");
        }
    }

    public final void b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, t, false, 66114, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, t, false, 66114, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        new ao().a(String.valueOf(j)).b(this.n).f(this.f3754f).e("poi_video").e();
    }
}
