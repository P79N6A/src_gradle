package com.ss.android.ugc.aweme.poi.ui;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.util.g;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.adapter.a;
import com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.aa;
import com.ss.android.ugc.aweme.poi.model.l;
import java.util.List;

public class i extends FlowFeedViewHolder<PoiAwemeFeedAdapter, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60800a;

    /* renamed from: b  reason: collision with root package name */
    protected String f60801b;

    /* renamed from: c  reason: collision with root package name */
    protected String f60802c;

    /* renamed from: d  reason: collision with root package name */
    public c f60803d;

    /* renamed from: e  reason: collision with root package name */
    protected h f60804e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f60805f;
    protected long g = 9999;
    protected String h = "";
    protected String p = "";
    protected AbsPoiAwemeFeedFragment q;
    public PoiDetailHeaderInfoPresenter.a r;

    public final void R_() {
    }

    public final void c() {
    }

    public a f() {
        return null;
    }

    public void a(List<b> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60800a, false, 65988, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f60800a, false, 65988, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.mLoadingStatusView.b();
            if (!this.f60805f) {
                this.f60805f = !Lists.isEmpty(list);
            }
            if (this.j != null) {
                ((PoiAwemeFeedAdapter) this.j).setData(list);
            }
            c(z);
        }
    }

    public void a(boolean z, String str, String str2, boolean z2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str4, str5, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60800a, false, 65991, new Class[]{Boolean.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str4, str5, Byte.valueOf(z2)}, this, f60800a, false, 65991, new Class[]{Boolean.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60804e != null) {
            if (TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.c.a())) {
                str3 = com.ss.android.ugc.aweme.feed.c.d();
            } else {
                str3 = com.ss.android.ugc.aweme.feed.c.a();
            }
            long j = 0;
            try {
                if (!TextUtils.isEmpty(str3)) {
                    j = Long.parseLong(str3);
                }
            } catch (Exception unused) {
            }
            h hVar = this.f60804e;
            Object[] objArr = new Object[2];
            objArr[0] = 1;
            b.a d2 = new b.a().b(3).a(this.f60801b).b(str4).c(str5).a(z ? 1 : 0).a(j).d(this.f60802c);
            d2.m = z2;
            if (this.q != null) {
                z3 = this.q.g();
            }
            objArr[1] = d2.a(z3).e(this.q != null ? this.q.j() : "").a();
            hVar.a(objArr);
        }
    }

    public final void a(boolean z, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aweme}, this, f60800a, false, 65996, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aweme}, this, f60800a, false, 65996, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        super.a(z, aweme);
        if (this.q != null) {
            this.q.s = false;
        }
    }

    public final int g() {
        if (this.j != null) {
            return ((PoiAwemeFeedAdapter) this.j).E;
        }
        return 0;
    }

    public final com.ss.android.ugc.aweme.forward.a.a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f60800a, false, 65981, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class)) {
            return new com.ss.android.ugc.aweme.forward.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60806a;

                public final String e() {
                    return "key_container_poi";
                }

                public final Object a() {
                    return i.this.j;
                }

                public final boolean b() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f60806a, false, 65999, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60806a, false, 65999, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (i.this.l != null && i.this.l.isViewValid()) {
                        z = true;
                    }
                    return z;
                }

                public final Context d() {
                    if (PatchProxy.isSupport(new Object[0], this, f60806a, false, 66001, new Class[0], Context.class)) {
                        return (Context) PatchProxy.accessDispatch(new Object[0], this, f60806a, false, 66001, new Class[0], Context.class);
                    } else if (i.this.l != null) {
                        return i.this.l.getActivity();
                    } else {
                        return i.this.mRecyclerView.getContext();
                    }
                }

                public final boolean c() {
                    if (PatchProxy.isSupport(new Object[0], this, f60806a, false, 66000, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60806a, false, 66000, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (i.this.l == null || !i.this.l.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED) || !i.this.l.getUserVisibleHint()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
        }
        return (com.ss.android.ugc.aweme.forward.a.a) PatchProxy.accessDispatch(new Object[0], this, f60800a, false, 65981, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class);
    }

    public final /* synthetic */ FeedAdapter d() {
        g gVar;
        if (PatchProxy.isSupport(new Object[0], this, f60800a, false, 65982, new Class[0], PoiAwemeFeedAdapter.class)) {
            return (PoiAwemeFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, f60800a, false, 65982, new Class[0], PoiAwemeFeedAdapter.class);
        }
        NestedScrollingRecyclerView nestedScrollingRecyclerView = this.mRecyclerView;
        d dVar = this.f60804e.g;
        if (PatchProxy.isSupport(new Object[0], this, f60800a, false, 65983, new Class[0], g.class)) {
            gVar = (g) PatchProxy.accessDispatch(new Object[0], this, f60800a, false, 65983, new Class[0], g.class);
        } else {
            gVar = this.q.H();
        }
        this.j = new PoiAwemeFeedAdapter(nestedScrollingRecyclerView, dVar, gVar);
        ((PoiAwemeFeedAdapter) this.j).z = this.l;
        ((PoiAwemeFeedAdapter) this.j).C = this.r;
        ((PoiAwemeFeedAdapter) this.j).h = this.f60803d;
        ((PoiAwemeFeedAdapter) this.j).A = f();
        ((PoiAwemeFeedAdapter) this.j).D = this.q.G();
        return (PoiAwemeFeedAdapter) this.j;
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f60800a, false, 65990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60800a, false, 65990, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f60804e.i() != null && ((!(this.f60804e.i() instanceof com.ss.android.ugc.aweme.common.f.a) || !((com.ss.android.ugc.aweme.common.f.a) this.f60804e.i()).isDataEmpty()) && ((aa) this.f60804e.i()).isHasMore() && this.f60804e != null)) {
            h hVar = this.f60804e;
            b.a a2 = new b.a().b(3).a(this.f60801b);
            a2.l = this.g;
            hVar.a(4, a2.b(this.h).c(this.p).d(this.f60802c).a());
        }
    }

    public final void a(PoiDetail poiDetail) {
        if (PatchProxy.isSupport(new Object[]{poiDetail}, this, f60800a, false, 65987, new Class[]{PoiDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiDetail}, this, f60800a, false, 65987, new Class[]{PoiDetail.class}, Void.TYPE);
            return;
        }
        long defaultPoiClassCode = poiDetail.getDefaultPoiClassCode();
        if (defaultPoiClassCode > 0) {
            this.g = defaultPoiClassCode;
        }
    }

    public final c a(l lVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (PatchProxy.isSupport(new Object[]{lVar}, this, f60800a, false, 65979, new Class[]{l.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{lVar}, this, f60800a, false, 65979, new Class[]{l.class}, c.class);
        }
        if (lVar != null) {
            str = lVar.poiId;
        } else {
            str = "";
        }
        this.f60801b = str;
        if (lVar != null) {
            str2 = lVar.awemeid;
        } else {
            str2 = "";
        }
        this.f60802c = str2;
        c.a aVar = new c.a();
        if (lVar != null) {
            str3 = lVar.poiId;
        } else {
            str3 = "";
        }
        c.a a2 = aVar.a(str3);
        if (lVar != null) {
            str4 = lVar.poiType;
        } else {
            str4 = "";
        }
        c.a b2 = a2.b(str4);
        b2.f59752d = com.ss.android.ugc.aweme.u.aa.b();
        if (lVar != null) {
            str5 = lVar.from;
        } else {
            str5 = "";
        }
        b2.g = str5;
        if (lVar != null) {
            str6 = lVar.awemeid;
        } else {
            str6 = "";
        }
        c.a c2 = b2.c(str6);
        if (lVar != null) {
            str7 = lVar.activityId;
        } else {
            str7 = "";
        }
        c2.f59753e = str7;
        if (lVar != null) {
            str8 = lVar.backendType;
        } else {
            str8 = "";
        }
        c.a d2 = c2.d(str8);
        if (lVar != null) {
            str9 = lVar.cityCode;
        } else {
            str9 = "";
        }
        this.f60803d = d2.e(str9).a();
        return this.f60803d;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f60800a, false, 65986, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f60800a, false, 65986, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            PoiAwemeFeedAdapter poiAwemeFeedAdapter = (PoiAwemeFeedAdapter) this.j;
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, poiAwemeFeedAdapter, PoiAwemeFeedAdapter.f59416f, false, 64748, new Class[]{Float.TYPE}, Void.TYPE)) {
                PoiAwemeFeedAdapter poiAwemeFeedAdapter2 = poiAwemeFeedAdapter;
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, poiAwemeFeedAdapter2, PoiAwemeFeedAdapter.f59416f, false, 64748, new Class[]{Float.TYPE}, Void.TYPE);
            } else if (poiAwemeFeedAdapter.g != null) {
                poiAwemeFeedAdapter.g.a(f2);
            }
        }
    }

    public void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60800a, false, 65989, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60800a, false, 65989, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            switch (i) {
                case 1:
                    a((List<D>) null);
                    if (!this.f60805f) {
                        this.mLoadingStatusView.f();
                    } else {
                        this.mLoadingStatusView.b();
                    }
                    if (this.j != null) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 2:
                    if (!this.f60805f) {
                        this.mLoadingStatusView.d();
                        return;
                    }
                    break;
                case 3:
                    if (!this.f60805f) {
                        this.mLoadingStatusView.e();
                    } else {
                        this.mLoadingStatusView.b();
                    }
                    a((List<D>) null);
                    if (this.j != null) {
                        ((PoiAwemeFeedAdapter) this.j).showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 4:
                    this.mLoadingStatusView.b();
                    break;
            }
        }
    }

    public void a(AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment, View view, h hVar, com.ss.android.ugc.aweme.newfollow.b.a aVar) {
        AbsPoiAwemeFeedFragment absPoiAwemeFeedFragment2 = absPoiAwemeFeedFragment;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{absPoiAwemeFeedFragment2, view, hVar2, aVar}, this, f60800a, false, 65980, new Class[]{AbsPoiAwemeFeedFragment.class, View.class, h.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absPoiAwemeFeedFragment2, view, hVar2, aVar}, this, f60800a, false, 65980, new Class[]{AbsPoiAwemeFeedFragment.class, View.class, h.class, com.ss.android.ugc.aweme.newfollow.b.a.class}, Void.TYPE);
            return;
        }
        this.q = absPoiAwemeFeedFragment2;
        this.f60804e = hVar2;
        super.a(absPoiAwemeFeedFragment, view, hVar, aVar, absPoiAwemeFeedFragment2.n, absPoiAwemeFeedFragment.e(), absPoiAwemeFeedFragment.n());
    }
}
