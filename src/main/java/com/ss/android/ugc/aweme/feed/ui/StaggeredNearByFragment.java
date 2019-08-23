package com.ss.android.ugc.aweme.feed.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity;
import com.ss.android.ugc.aweme.feed.b.b;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.f.y;
import com.ss.android.ugc.aweme.feed.h.ad;
import com.ss.android.ugc.aweme.feed.h.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.u;
import com.ss.android.ugc.aweme.feed.panel.v;
import com.ss.android.ugc.aweme.feed.panel.w;
import com.ss.android.ugc.aweme.poi.model.ai;
import com.ss.android.ugc.aweme.poi.nearby.b.e;
import com.ss.android.ugc.aweme.qrcode.a.a;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public class StaggeredNearByFragment extends NearByFragment {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f3208f;

    public final int e() {
        return 7;
    }

    public final String f() {
        return "timeline_list";
    }

    public final int j() {
        return 1;
    }

    @NonNull
    public final String k() {
        return "from_nearby";
    }

    public final String l() {
        return "homepage_fresh";
    }

    public final CellFeedFragmentPanel a() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43052, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43052, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f3192d == null) {
            this.f3192d = new u("homepage_fresh", this, this, e());
        }
        return this.f3192d;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43056, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        c.a((NearbyCities.CityBean) null);
        this.f3192d.a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46319a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46319a, false, 43071, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46319a, false, 43071, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    AwemeAppData.p().ai = false;
                }
            }
        });
    }

    public final m g() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43059, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43059, new Class[0], m.class);
        }
        ad adVar = new ad();
        if (this.f3192d != null && (this.f3192d instanceof u)) {
            ((u) this.f3192d).r = adVar;
        }
        return adVar;
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43069, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3192d != null) {
            this.f3192d.f(true);
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43070, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3192d != null) {
            this.f3192d.f(false);
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43067, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (!(this.f3192d == null || this.f3192d.p() == null)) {
            this.f3192d.p().e();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43065, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!(this.f3192d == null || this.f3192d.p() == null)) {
            this.f3192d.p().d();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43064, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!(this.f3192d == null || this.f3192d.p() == null)) {
            this.f3192d.p().B_();
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43066, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (!(this.f3192d == null || this.f3192d.p() == null)) {
            this.f3192d.p().M_();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3208f, false, 43053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3208f, false, 43053, new Class[0], Void.TYPE);
            return;
        }
        r.a("homepage_fresh_click", (Map) d.a().a("click_method", "refresh").a("city_info", aa.a()).f34114b);
    }

    @Subscribe
    public void onChangeNetwork(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3208f, false, 43063, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3208f, false, 43063, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f3192d != null) {
            this.f3192d.bt();
        }
    }

    @Subscribe
    public void onNearbyTabRefreshEvent(y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f3208f, false, 43055, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f3208f, false, 43055, new Class[]{y.class}, Void.TYPE);
            return;
        }
        d(false);
    }

    @Subscribe
    public void onChangeCityEvent(com.ss.android.ugc.aweme.feed.f.d dVar) {
        com.ss.android.ugc.aweme.feed.f.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3208f, false, 43062, new Class[]{com.ss.android.ugc.aweme.feed.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3208f, false, 43062, new Class[]{com.ss.android.ugc.aweme.feed.f.d.class}, Void.TYPE);
            return;
        }
        ((u) this.f3192d).b(dVar2.f45298a);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3208f, false, 43068, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3208f, false, 43068, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f3192d != null) {
            this.f3192d.f(z);
        }
    }

    public final boolean d(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3208f, false, 43054, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3208f, false, 43054, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f3192d != null && (this.f3192d instanceof u)) {
            u uVar = (u) this.f3192d;
            if (PatchProxy.isSupport(new Object[0], uVar, u.q, false, 41923, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], uVar, u.q, false, 41923, new Class[0], Void.TYPE);
            } else if (NetworkUtils.b(uVar.ar)) {
                if (TextUtils.isEmpty(c.a())) {
                    str = c.d();
                } else {
                    str = c.a();
                }
                if (TextUtils.isEmpty(uVar.s) || !uVar.s.equals(str)) {
                    uVar.s = str;
                    if (uVar.t == null) {
                        uVar.t = new e();
                        uVar.t.a(uVar);
                        uVar.t.a(new ai());
                    }
                    uVar.t.a(uVar.s);
                }
            }
        }
        return super.d(z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3208f, false, 43058, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3208f, false, 43058, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view2.findViewById(C0906R.id.cp0).setVisibility(8);
        view2.findViewById(C0906R.id.dqw).setVisibility(8);
        if (this.f3191c instanceof ad) {
            ((ad) this.f3191c).i = (u) this.f3192d;
        }
        if (this.f3192d != null && (this.f3192d instanceof u)) {
            u uVar = (u) this.f3192d;
            if (PatchProxy.isSupport(new Object[0], uVar, u.q, false, 41914, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], uVar, u.q, false, 41914, new Class[0], Void.TYPE);
            } else if (com.ss.android.ugc.aweme.poi.e.e.h()) {
                uVar.w = true;
                i.a((Callable<TResult>) new v<TResult>(uVar)).a((g<TResult, TContinuationResult>) new w<TResult,TContinuationResult>(uVar), i.f1052b);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3208f, false, 43057, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qz, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3208f, false, 43057, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    private void a(Aweme aweme, String str, View view) {
        String str2 = str;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{aweme, str2, view2}, this, f3208f, false, 43061, new Class[]{Aweme.class, String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2, view2}, this, f3208f, false, 43061, new Class[]{Aweme.class, String.class, View.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f3191c.i();
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        bundle.putString("refer", str2);
        bundle.putString("video_from", k());
        bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
        bundle.putInt("page_type", e());
        if (com.ss.android.ugc.aweme.poi.e.e.e()) {
            LiveDetailActivity.b(getActivity(), bundle, view2);
        } else {
            DetailActivity.a((Activity) getActivity(), bundle, view2);
        }
    }

    public final void a(View view, Aweme aweme, String str) {
        String str2;
        View view2 = view;
        Aweme aweme2 = aweme;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme2, str3}, this, f3208f, false, 43060, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme2, str3}, this, f3208f, false, 43060, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f3191c.i();
            if (!(aweme2 == null || getActivity() == null)) {
                if (aweme.isLive()) {
                    MobClick value = MobClick.obtain().setEventName("enter_detail").setLabelName("live_aud").setValue(aweme.getAuthorUid());
                    if (aweme.getAuthor() == null) {
                        str2 = "";
                    } else {
                        str2 = String.valueOf(aweme.getAuthor().roomId);
                    }
                    r.onEvent(value.setExtValueString(str2).setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("author_id", aweme.getAuthorUid()).a("page_name", str3).a("position", str3).a("request_id", aa.a(aweme2, e())).b()));
                    if (com.ss.android.ugc.aweme.poi.e.e.e()) {
                        a(aweme2, str3, view2);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("live.intent.extra.REQUEST_ID", aa.a(aweme2, e()));
                    bundle.putInt("live.intent.extra.ENTER_LIVE_ORDER", aweme2.awemePosition);
                    bundle.putString("enter_method", "live_cover");
                    com.ss.android.ugc.aweme.story.live.c.a((Context) getActivity(), aweme.getAuthor(), "homepage_fresh", bundle);
                    return;
                }
                a(aweme2, str3, view2);
                b.a(aweme);
                r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(l()).setValue(aweme.getAid()).setJsonObject(com.ss.android.ugc.aweme.feed.a.a().b(aweme2, e())));
                r.a("feed_enter", (Map) d.a().a("enter_from", str3).a("group_id", aa.m(aweme)).a("author_id", aa.a(aweme)).a("poi_id", aa.e(aweme)).a("city_info", aa.a()).f34114b);
            }
        }
    }
}
