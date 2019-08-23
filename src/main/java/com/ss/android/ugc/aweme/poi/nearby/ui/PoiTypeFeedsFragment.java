package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.b.b;
import com.ss.android.ugc.aweme.feed.h.ad;
import com.ss.android.ugc.aweme.feed.h.ae;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.h.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.NearByFragment;
import com.ss.android.ugc.aweme.poi.nearby.a.a;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;

public class PoiTypeFeedsFragment extends NearByFragment {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f60072f;
    private int g;

    public final int e() {
        return 11;
    }

    public final String f() {
        return "timeline_list";
    }

    public final int j() {
        return 1;
    }

    @NonNull
    public final String k() {
        return "from_poi_categorized";
    }

    public final String l() {
        return "homepage_fresh";
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60072f, false, 65322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60072f, false, 65322, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.f3192d.a((RecyclerView.OnScrollListener) new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60073a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f60073a, false, 65329, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f60073a, false, 65329, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    AwemeAppData.p().ai = false;
                }
            }
        });
    }

    public final g c() {
        if (!PatchProxy.isSupport(new Object[0], this, f60072f, false, 65325, new Class[0], g.class)) {
            return new ae(20, this.g);
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, f60072f, false, 65325, new Class[0], g.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60072f, false, 65320, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60072f, false, 65320, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        aa.f75005b = "";
    }

    public final CellFeedFragmentPanel a() {
        if (PatchProxy.isSupport(new Object[0], this, f60072f, false, 65321, new Class[0], CellFeedFragmentPanel.class)) {
            return (CellFeedFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f60072f, false, 65321, new Class[0], CellFeedFragmentPanel.class);
        }
        if (this.f3192d == null) {
            this.f3192d = new a("categorized_city_poi", this, this, e());
        }
        this.f3192d.f(true);
        return this.f3192d;
    }

    public final m g() {
        if (PatchProxy.isSupport(new Object[0], this, f60072f, false, 65326, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], this, f60072f, false, 65326, new Class[0], m.class);
        }
        ad adVar = new ad();
        if (this.f3192d != null && (this.f3192d instanceof a)) {
            a aVar = (a) this.f3192d;
            int i = this.g;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, aVar, a.q, false, 65220, new Class[]{Integer.TYPE}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, a.q, false, 65220, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                aVar.s = i;
                aVar.r.setPoiClassCode(i);
                aVar.q();
                aVar.r();
            }
        }
        return adVar;
    }

    public final boolean d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60072f, false, 65327, new Class[]{Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60072f, false, 65327, new Class[]{Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.f3192d != null && (this.f3192d instanceof a)) {
            a aVar = (a) this.f3192d;
            aVar.q();
            aVar.r();
        }
        return super.d(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60072f, false, 65319, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60072f, false, 65319, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra("poi_class_code")) {
            this.g = intent.getIntExtra("poi_class_code", 0);
            aa.f75005b = String.valueOf(this.g);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f60072f, false, 65324, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f60072f, false, 65324, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        view2.findViewById(C0906R.id.cp1).setVisibility(8);
        view2.findViewById(C0906R.id.cp0).setVisibility(8);
        view2.findViewById(C0906R.id.dqw).setVisibility(8);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60072f, false, 65323, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.qz, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f60072f, false, 65323, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public final void a(View view, Aweme aweme, String str) {
        String str2;
        View view2 = view;
        Aweme aweme2 = aweme;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme2, str3}, this, f60072f, false, 65328, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme2, str3}, this, f60072f, false, 65328, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (aweme2 != null && getActivity() != null) {
                if (aweme.isLive()) {
                    MobClick value = MobClick.obtain().setEventName("enter_detail").setLabelName("live_aud").setValue(aweme.getAuthorUid());
                    if (aweme.getAuthor() == null) {
                        str2 = "";
                    } else {
                        str2 = String.valueOf(aweme.getAuthor().roomId);
                    }
                    r.onEvent(value.setExtValueString(str2).setJsonObject(new c().a("author_id", aweme.getAuthorUid()).a("page_name", str3).a("position", str3).a("request_id", aa.a(aweme2, e())).b()));
                    Bundle bundle = new Bundle();
                    bundle.putInt("live.intent.extra.ENTER_LIVE_ORDER", aweme2.awemePosition);
                    com.ss.android.ugc.aweme.story.live.c.a((Context) getActivity(), aweme.getAuthor(), "homepage_fresh", bundle);
                    return;
                }
                com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.f3191c.i();
                h a2 = h.a();
                FragmentActivity activity = getActivity();
                a2.a((Activity) activity, j.a("aweme://aweme/detail/" + aweme.getAid()).a("refer", str3).a("video_from", k()).a("profile_enterprise_type", aweme.getEnterpriseType()).a("page_type", e()).a(), view2);
                b.a(aweme);
                r.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(l()).setValue(aweme.getAid()).setJsonObject(com.ss.android.ugc.aweme.feed.a.a().b(aweme2, e())));
                r.a("feed_enter", (Map) d.a().a("enter_from", str3).a("group_id", aa.m(aweme)).a("author_id", aa.a(aweme)).a("poi_id", aa.e(aweme)).a("city_info", aa.a()).f34114b);
            }
        }
    }
}
