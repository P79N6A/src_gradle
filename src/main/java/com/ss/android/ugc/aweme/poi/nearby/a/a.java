package com.ss.android.ugc.aweme.poi.nearby.a;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.ss.android.ugc.aweme.feed.adapter.NearByAdapter;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankBannerResponse;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.feed.panel.t;
import com.ss.android.ugc.aweme.poi.e.o;
import com.ss.android.ugc.aweme.poi.model.ao;
import com.ss.android.ugc.aweme.poi.nearby.b.g;
import com.ss.android.ugc.aweme.poi.nearby.b.h;
import com.ss.android.ugc.aweme.poi.nearby.b.p;
import com.ss.android.ugc.aweme.poi.nearby.widget.c;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import java.util.ArrayList;
import java.util.List;

public final class a extends t implements h, p.a {
    public static ChangeQuickRedirect q;
    private boolean A;
    private String B = PushConstants.PUSH_TYPE_NOTIFY;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private long H;
    private boolean I;
    private boolean J;
    public c r;
    public int s;
    private p t;
    private g u;
    private List<Aweme> v;
    private List<PoiClassRankBannerStruct> w;
    private List<SimplePoiInfoStruct> x;
    private boolean y;
    private boolean z;

    public final boolean i() {
        return false;
    }

    public final void ay() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65234, new Class[0], Void.TYPE);
            return;
        }
        super.ay();
        if (this.r != null) {
            this.r.a(false);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65233, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (this.r != null) {
            this.r.a(true);
        }
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65227, new Class[0], Void.TYPE);
            return;
        }
        this.z = true;
        this.B = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        this.F = System.currentTimeMillis();
        this.r.a();
        t();
        u();
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65230, new Class[0], Void.TYPE);
        } else if (this.y && this.z && this.A) {
            if (CollectionUtils.isEmpty(this.v) && CollectionUtils.isEmpty(this.x) && CollectionUtils.isEmpty(this.w)) {
                this.r.setAwemeListEmptyVisibility(8);
                if (this.mStatusView != null) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.e();
                }
            } else if (this.mStatusView != null) {
                this.mStatusView.b();
                this.mStatusView.setVisibility(8);
            }
        }
    }

    private void u() {
        long j;
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65235, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65235, new Class[0], Void.TYPE);
        } else if (this.y && this.z && this.A && !this.I) {
            this.I = true;
            long j3 = 0;
            if (this.C > 0) {
                j = this.D - this.C;
            } else {
                j = 0;
            }
            if (this.E > 0) {
                j2 = this.F - this.E;
            } else {
                j2 = 0;
            }
            if (this.G > 0) {
                j3 = this.H - this.G;
            }
            if (j <= j2) {
                j = j2;
            }
            if (j <= j3) {
                j = j3;
            }
            o.a("poi_secondary", j, this.B);
        }
    }

    @NonNull
    public final CellFeedAdapter g() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65218, new Class[0], CellFeedAdapter.class)) {
            return (CellFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, q, false, 65218, new Class[0], CellFeedAdapter.class);
        } else if (this.f3161e != null) {
            return this.f3161e;
        } else {
            Bundle bs = bs();
            if (bs != null && bs.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0) == 0) {
                int v2 = AbTestManager.a().v();
                if (v2 == 1) {
                    i = 1;
                } else if (v2 == 2) {
                    i = 2;
                }
            }
            if (this.n == 11) {
                i = AbTestManager.a().E();
            }
            NearByAdapter nearByAdapter = new NearByAdapter(this, this.l, this.f3158b, this, i, this.n);
            return nearByAdapter;
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65217, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (!this.J) {
                this.i.setRefreshing(false);
                this.mStatusView.setVisibility(0);
                this.mStatusView.d();
                return;
            }
            this.i.setRefreshing(true);
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65222, new Class[0], Void.TYPE);
        } else if (NetworkUtils.b(this.ar)) {
            if (this.t == null) {
                this.t = new p(this);
            }
            this.E = System.currentTimeMillis();
            this.G = System.currentTimeMillis();
            this.t.a(this.s);
        }
    }

    public final void q() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65221, new Class[0], Void.TYPE);
        } else if (NetworkUtils.b(this.ar) && CollectionUtils.isEmpty(this.w)) {
            if (this.u == null) {
                this.u = new g();
                this.u.a(this);
                this.u.a(new ao());
            }
            this.C = System.currentTimeMillis();
            if (TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.c.a())) {
                str = com.ss.android.ugc.aweme.feed.c.d();
            } else {
                str = com.ss.android.ugc.aweme.feed.c.a();
            }
            this.u.a("", "", "", str, Integer.valueOf(this.s), "");
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65228, new Class[0], Void.TYPE);
        } else if (bc()) {
            this.A = true;
            this.H = System.currentTimeMillis();
            this.B = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            this.i.setRefreshing(false);
            if (this.f3161e != null) {
                this.f3161e.resetLoadMoreState();
            }
            this.r.setAwemeListEmptyVisibility(0);
            t();
            u();
            if (PatchProxy.isSupport(new Object[0], this, q, false, 65236, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, q, false, 65236, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
            a2.a("citycode", aa.a());
            a2.a("poichannel", aa.f75005b);
            o.a("poi_empty_aweme_secondary", a2.b());
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, q, false, 65229, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, q, false, 65229, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.A = true;
            this.H = System.currentTimeMillis();
            this.B = PushConstants.PUSH_TYPE_NOTIFY;
            this.i.setRefreshing(false);
            if (this.f3161e != null) {
                this.f3161e.resetLoadMoreState();
            }
            if (this.o) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.bgf).a();
            } else if (!NetworkUtils.b(this.ar)) {
                this.mStatusView.f();
            } else {
                this.r.setAwemeListEmptyVisibility(0);
                t();
            }
            u();
        }
    }

    public final void e(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, q, false, 65226, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, q, false, 65226, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.z = true;
        this.F = System.currentTimeMillis();
        this.B = PushConstants.PUSH_TYPE_NOTIFY;
        this.r.a();
        t();
        u();
    }

    public final void a(PoiRankBannerResponse poiRankBannerResponse) {
        if (PatchProxy.isSupport(new Object[]{poiRankBannerResponse}, this, q, false, 65223, new Class[]{PoiRankBannerResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiRankBannerResponse}, this, q, false, 65223, new Class[]{PoiRankBannerResponse.class}, Void.TYPE);
            return;
        }
        this.y = true;
        this.D = System.currentTimeMillis();
        this.B = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        if (poiRankBannerResponse != null) {
            this.w = poiRankBannerResponse.poiClassRankBannerStructList;
            if (PatchProxy.isSupport(new Object[0], this, q, false, 65231, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, q, false, 65231, new Class[0], Void.TYPE);
            } else if (!CollectionUtils.isEmpty(this.w)) {
                this.r.setBannerData(this.w);
                if (this.z) {
                    if (this.mStatusView != null) {
                        this.mStatusView.b();
                        this.mStatusView.setVisibility(8);
                    }
                    if (!this.A && this.f3161e != null) {
                        this.f3161e.showLoadMoreLoading();
                    }
                }
            }
            u();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, q, false, 65224, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, q, false, 65224, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.y = true;
        this.B = PushConstants.PUSH_TYPE_NOTIFY;
        this.D = System.currentTimeMillis();
        t();
        c cVar = this.r;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f60109a, false, 65365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f60109a, false, 65365, new Class[0], Void.TYPE);
        } else {
            cVar.f60111c.setVisibility(8);
        }
        u();
    }

    public final void a(List<SimplePoiInfoStruct> list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, q, false, 65225, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, q, false, 65225, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.z = true;
        this.F = System.currentTimeMillis();
        this.B = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        this.x = list;
        if (PatchProxy.isSupport(new Object[0], this, q, false, 65232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 65232, new Class[0], Void.TYPE);
        } else {
            List<SimplePoiInfoStruct> list2 = this.x;
            if (!CollectionUtils.isEmpty(list2)) {
                int size = list2.size() / 3;
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    ArrayList arrayList2 = new ArrayList();
                    int i2 = i * 3;
                    i++;
                    arrayList2.addAll(list2.subList(i2, i * 3));
                    arrayList.add(arrayList2);
                }
                this.r.setData(arrayList);
                if (this.y) {
                    if (this.mStatusView != null) {
                        this.mStatusView.b();
                        this.mStatusView.setVisibility(8);
                    }
                    if (!this.A && this.f3161e != null) {
                        this.f3161e.showLoadMoreLoading();
                    }
                }
            }
        }
        u();
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, q, false, 65216, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, q, false, 65216, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        this.mListView.setHasFixedSize(true);
        this.r = new c(this.ar);
        this.f3161e.a(this.r);
        com.ss.android.ugc.aweme.feed.c.a(false);
        com.ss.android.ugc.aweme.feed.c.b(false);
    }

    public final void a(List<Aweme> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, q, false, 65219, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, q, false, 65219, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            this.H = System.currentTimeMillis();
            this.A = true;
            this.v = list;
            this.r.setAwemeListEmptyVisibility(8);
            this.i.setRefreshing(false);
            this.o = true;
            this.f3161e.resetLoadMoreState();
            this.f3161e.setData(list);
            a(z2);
            if (this.j != null) {
                this.j.p();
            }
            t();
            b(true);
            ((StaggeredGridLayoutManager) this.mListView.getLayoutManager()).scrollToPosition(0);
            if (!this.J && !Lists.isEmpty(list)) {
                this.J = true;
            }
            u();
        }
    }

    public a(String str, d dVar, m mVar, int i) {
        super(str, dVar, mVar, i);
    }
}
