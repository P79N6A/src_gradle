package com.ss.android.ugc.aweme.feed.panel;

import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.ss.android.ugc.aweme.feed.adapter.NearByAdapter;
import com.ss.android.ugc.aweme.feed.adapter.t;
import com.ss.android.ugc.aweme.feed.adapter.z;
import com.ss.android.ugc.aweme.feed.ak;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.f.d;
import com.ss.android.ugc.aweme.feed.h.ad;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.h.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassInfoStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiOpTabStruct;
import com.ss.android.ugc.aweme.feed.model.poi.PoiVerticalEntranceStruct;
import com.ss.android.ugc.aweme.poi.model.s;
import com.ss.android.ugc.aweme.poi.nearby.b.e;
import com.ss.android.ugc.aweme.poi.nearby.b.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public class u extends t implements ad.a, f {
    public static ChangeQuickRedirect q;
    private boolean A;
    private boolean B;
    private boolean C;
    public m r;
    public String s;
    public e t;
    public int[] u = new int[2];
    boolean v;
    public boolean w;
    private t x;
    private List<PoiClassRankBannerStruct> y;
    private boolean z;

    public final boolean h() {
        return true;
    }

    public final void a(List<Aweme> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, q, false, 41912, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, q, false, 41912, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.C = false;
        this.A = false;
        super.a(list, z2);
        if (!(this.r == null || this.r.i() == null || this.x == null || ((g) this.r.i()).getData() == null)) {
            List<PoiOpTabStruct> list2 = ((FeedItemList) ((g) this.r.i()).getData()).poiOpTabStructs;
            this.x.setData(a(((FeedItemList) ((g) this.r.i()).getData()).poiClassInfoStructList, list2));
            if (com.ss.android.ugc.aweme.poi.e.e.h()) {
                b((FeedItemList) ((g) this.r.i()).getData());
            }
        }
        ((StaggeredGridLayoutManager) this.mListView.getLayoutManager()).scrollToPosition(0);
        if (!this.z && !Lists.isEmpty(list)) {
            this.z = true;
        }
        CellFeedAdapter cellFeedAdapter = this.f3161e;
        if (PatchProxy.isSupport(new Object[0], cellFeedAdapter, CellFeedAdapter.f44660f, false, 40324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cellFeedAdapter, CellFeedAdapter.f44660f, false, 40324, new Class[0], Void.TYPE);
            return;
        }
        if (cellFeedAdapter.g != null) {
            z zVar = cellFeedAdapter.g;
            if (PatchProxy.isSupport(new Object[0], zVar, z.f44975a, false, 40647, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], zVar, z.f44975a, false, 40647, new Class[0], Void.TYPE);
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44983a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f44983a, false, 40651, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f44983a, false, 40651, new Class[0], Void.TYPE);
                        return;
                    }
                    z.this.c();
                }
            }, 1000);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, q, false, 41915, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, q, false, 41915, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.poi.e.e.h()) {
            if (this.C) {
                return;
            }
        }
        super.a(z2);
    }

    public final void a(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, q, false, 41924, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, q, false, 41924, new Class[]{s.class}, Void.TYPE);
        } else if (sVar != null) {
            this.y = sVar.f59943b;
            if (this.x != null) {
                this.x.setBannerData(this.y);
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, q, false, 41925, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, q, false, 41925, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.x != null) {
            t tVar = this.x;
            if (PatchProxy.isSupport(new Object[0], tVar, t.f44958a, false, 40585, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], tVar, t.f44958a, false, 40585, new Class[0], Void.TYPE);
                return;
            }
            tVar.f44961d.setVisibility(8);
        }
    }

    public final void ay() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 41929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 41929, new Class[0], Void.TYPE);
            return;
        }
        super.ay();
        if (this.x != null) {
            this.x.a(false);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 41928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 41928, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        if (this.x != null) {
            this.x.a(true);
        }
    }

    public final void bt() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 41930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 41930, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3161e != null) {
            CellFeedAdapter cellFeedAdapter = this.f3161e;
            if (PatchProxy.isSupport(new Object[0], cellFeedAdapter, CellFeedAdapter.f44660f, false, 40326, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cellFeedAdapter, CellFeedAdapter.f44660f, false, 40326, new Class[0], Void.TYPE);
            } else if (cellFeedAdapter.g != null) {
                cellFeedAdapter.g.c();
            }
        }
    }

    @NonNull
    public final CellFeedAdapter g() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, q, false, 41910, new Class[0], CellFeedAdapter.class)) {
            return (CellFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, q, false, 41910, new Class[0], CellFeedAdapter.class);
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
            if (this.n == 7) {
                i = AbTestManager.a().E();
            }
            NearByAdapter nearByAdapter = new NearByAdapter(this, this.l, this.f3158b, this, i, this.n);
            return nearByAdapter;
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, q, false, 41909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, q, false, 41909, new Class[0], Void.TYPE);
        } else if (bc()) {
            if (!this.z) {
                this.i.setRefreshing(false);
                this.mStatusView.setVisibility(0);
                this.mStatusView.d();
                return;
            }
            this.i.setRefreshing(true);
        }
    }

    public final void b(NearbyCities.CityBean cityBean) {
        NearbyCities.CityBean cityBean2 = cityBean;
        if (PatchProxy.isSupport(new Object[]{cityBean2}, this, q, false, 41920, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cityBean2}, this, q, false, 41920, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
            return;
        }
        ((NearByAdapter) this.f3161e).a(cityBean2, true);
    }

    private void b(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, this, q, false, 41916, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, this, q, false, 41916, new Class[]{FeedItemList.class}, Void.TYPE);
        } else if (feedItemList2 != null) {
            i.a((Callable<TResult>) new x<TResult>(this, feedItemList2));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) throws Exception {
        if (iVar.b() && bc()) {
            FeedItemList feedItemList = (FeedItemList) iVar.e();
            if (feedItemList == null || !feedItemList.isCurrentCity(c.d())) {
                this.w = false;
                if (this.A) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.f();
                }
                return null;
            }
            this.x.setData(a(feedItemList.poiClassInfoStructList, feedItemList.poiOpTabStructs));
            this.f3161e.setData(feedItemList.items);
            if (!(this.r == null || this.r.i() == null)) {
                g gVar = (g) this.r.i();
                if (feedItemList != null) {
                    gVar.mData = feedItemList;
                }
            }
            this.z = true;
            this.C = true;
            this.f3161e.showLoadMoreLoading();
            b(true);
            this.mStatusView.b();
            this.mStatusView.setVisibility(8);
        }
        this.w = false;
        return null;
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, q, false, 41911, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, q, false, 41911, new Class[]{Exception.class}, Void.TYPE);
        } else if (bc()) {
            this.A = true;
            if (com.ss.android.ugc.aweme.poi.e.e.h()) {
                this.i.setRefreshing(false);
                if (this.o || this.C) {
                    a.b((Context) this.ar, (int) C0906R.string.bgf).a();
                } else if (!this.w) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.f();
                }
            } else {
                super.b(exc);
            }
        }
    }

    public final void f(boolean z2) {
        boolean z3 = z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, q, false, 41927, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, q, false, 41927, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.f(z2);
        if (this.f3161e != null) {
            CellFeedAdapter cellFeedAdapter = this.f3161e;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, cellFeedAdapter, CellFeedAdapter.f44660f, false, 40325, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                CellFeedAdapter cellFeedAdapter2 = cellFeedAdapter;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, cellFeedAdapter2, CellFeedAdapter.f44660f, false, 40325, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (cellFeedAdapter.g != null) {
                cellFeedAdapter.g.f44979e = z3;
                if (z3) {
                    cellFeedAdapter.g.d();
                } else {
                    cellFeedAdapter.g.e();
                }
            }
        }
        if (this.x != null) {
            this.x.a(z3);
        }
    }

    @Subscribe
    public void onEvent(com.bytedance.android.live.base.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, q, false, 41922, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, q, false, 41922, new Class[]{com.bytedance.android.live.base.a.a.class}, Void.TYPE);
            return;
        }
        if (aVar.f7687d) {
            String valueOf = String.valueOf(aVar.f7686c);
            if (PatchProxy.isSupport(new Object[]{valueOf}, this, q, false, 41921, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueOf}, this, q, false, 41921, new Class[]{String.class}, Void.TYPE);
            } else if (!TextUtils.isEmpty(valueOf) && this.f3161e != null) {
                for (Aweme aweme : this.f3161e.mItems) {
                    if (aweme != null && aweme.isLive() && valueOf.equals(aweme.getAuthorUid())) {
                        a(aweme.getAid());
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(FeedItemList feedItemList) throws Exception {
        FeedItemList feedItemList2;
        FeedItemList feedItemList3 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList3}, this, q, false, 41917, new Class[]{FeedItemList.class}, FeedItemList.class)) {
            feedItemList2 = (FeedItemList) PatchProxy.accessDispatch(new Object[]{feedItemList3}, this, q, false, 41917, new Class[]{FeedItemList.class}, FeedItemList.class);
        } else if (feedItemList3 == null || feedItemList.size() == 0) {
            feedItemList2 = null;
        } else {
            FeedItemList feedItemList4 = new FeedItemList();
            String a2 = c.a();
            String d2 = c.d();
            if (TextUtils.isEmpty(a2)) {
                a2 = d2;
            }
            feedItemList4.setCityCode(a2);
            feedItemList4.maxCursor = feedItemList3.maxCursor;
            feedItemList4.minCursor = feedItemList3.minCursor;
            feedItemList4.cursor = feedItemList3.cursor;
            feedItemList4.hasMore = 1;
            feedItemList4.poiClassInfoStructList = feedItemList3.poiClassInfoStructList;
            feedItemList4.poiOpTabStructs = feedItemList3.poiOpTabStructs;
            ArrayList arrayList = new ArrayList();
            for (Aweme next : feedItemList3.items) {
                if (!next.isLive()) {
                    arrayList.add(next);
                }
            }
            feedItemList4.items = arrayList;
            feedItemList2 = feedItemList4;
        }
        if (feedItemList2 != null) {
            b.b().a((Context) this.ar, "nearby_aweme", (Object) feedItemList2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface) {
        this.v = true;
        c.a(true);
        NearByAdapter nearByAdapter = (NearByAdapter) this.f3161e;
        NearbyCities.CityBean c2 = c.c();
        if (PatchProxy.isSupport(new Object[]{c2}, nearByAdapter, NearByAdapter.i, false, 40573, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
            NearByAdapter nearByAdapter2 = nearByAdapter;
            PatchProxy.accessDispatch(new Object[]{c2}, nearByAdapter2, NearByAdapter.i, false, 40573, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
        } else if (c2 != null) {
            t tVar = (t) nearByAdapter.f35105d;
            if (PatchProxy.isSupport(new Object[]{c2}, tVar, t.f44958a, false, 40579, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
                t tVar2 = tVar;
                PatchProxy.accessDispatch(new Object[]{c2}, tVar2, t.f44958a, false, 40579, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
            } else {
                tVar.f44960c.setText(C0906R.string.a3o);
                tVar.f44959b.setText(c2.name);
            }
        }
        dialogInterface.dismiss();
    }

    public final void a(NearbyCities.CityBean cityBean) {
        if (PatchProxy.isSupport(new Object[]{cityBean}, this, q, false, 41918, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cityBean}, this, q, false, 41918, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
            return;
        }
        if (c.b() == null && !this.v) {
            ((NearByAdapter) this.f3161e).a(cityBean, false);
        }
        if (c.c() == null) {
            bg.a(new d(cityBean, true, false));
            return;
        }
        if (af.b((Context) this.ar)) {
            c.b(cityBean);
        }
        if (c.b() == null && !TextUtils.equals(c.d(), cityBean.code) && !af.b((Context) this.ar) && !this.B) {
            this.B = true;
            if (PatchProxy.isSupport(new Object[]{cityBean}, this, q, false, 41919, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cityBean}, this, q, false, 41919, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.ar);
            builder.setMessage((CharSequence) this.ar.getResources().getString(C0906R.string.a3l, new Object[]{cityBean.name}));
            builder.setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new y(this)).setPositiveButton((int) C0906R.string.cgm, (DialogInterface.OnClickListener) new z(this, cityBean)).show();
        }
    }

    private List<PoiVerticalEntranceStruct> a(List<PoiClassInfoStruct> list, List<PoiOpTabStruct> list2) {
        if (PatchProxy.isSupport(new Object[]{list, list2}, this, q, false, 41926, new Class[]{List.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, list2}, this, q, false, 41926, new Class[]{List.class, List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list2)) {
            for (PoiOpTabStruct next : list2) {
                PoiVerticalEntranceStruct poiVerticalEntranceStruct = new PoiVerticalEntranceStruct();
                poiVerticalEntranceStruct.type = 0;
                poiVerticalEntranceStruct.code = next.activityId;
                poiVerticalEntranceStruct.iconUrl = next.iconUrl;
                poiVerticalEntranceStruct.name = next.title;
                poiVerticalEntranceStruct.url = next.url;
                arrayList.add(poiVerticalEntranceStruct);
            }
        }
        if (!CollectionUtils.isEmpty(list)) {
            for (PoiClassInfoStruct next2 : list) {
                PoiVerticalEntranceStruct poiVerticalEntranceStruct2 = new PoiVerticalEntranceStruct();
                poiVerticalEntranceStruct2.type = 1;
                poiVerticalEntranceStruct2.name = next2.name;
                poiVerticalEntranceStruct2.code = next2.code;
                poiVerticalEntranceStruct2.iconUrl = next2.iconUrl;
                arrayList.add(poiVerticalEntranceStruct2);
            }
        }
        return arrayList;
    }

    public final void b(List<Aweme> list, boolean z2) {
        List<Aweme> list2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, q, false, 41913, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, q, false, 41913, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (bc()) {
            super.b(list, z2);
            if (com.ss.android.ugc.aweme.poi.e.e.h()) {
                int size = list.size();
                if (!(this.r == null || this.r.i() == null)) {
                    FeedItemList feedItemList = (FeedItemList) ((g) this.r.i()).getData();
                    if (feedItemList != null) {
                        FeedItemList feedItemList2 = new FeedItemList();
                        feedItemList2.poiClassInfoStructList = feedItemList.poiClassInfoStructList;
                        if (size > 20) {
                            list2 = list.subList(size - 20, size);
                        } else {
                            list2 = list;
                        }
                        feedItemList2.items = list2;
                        b(feedItemList2);
                    }
                }
            }
        }
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, q, false, 41908, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, q, false, 41908, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        this.mListView.addOnScrollListener(new StaggeredNearbyFeedFragmentPanel$1(this));
        this.mListView.setHasFixedSize(true);
        this.x = new t(this.ar);
        this.f3161e.a(this.x);
        this.mStatusView.setBuilder(this.mStatusView.a().b((View) new ak(this.ar)));
        c.a(false);
        c.b(false);
    }

    public u(String str, com.ss.android.ugc.aweme.challenge.d dVar, com.ss.android.ugc.aweme.feed.listener.m mVar, int i) {
        super(str, dVar, mVar, i);
    }
}
