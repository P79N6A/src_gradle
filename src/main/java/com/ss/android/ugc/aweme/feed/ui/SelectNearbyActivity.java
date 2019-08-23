package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.CityListAdapter;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.f.d;
import com.ss.android.ugc.aweme.feed.h.e;
import com.ss.android.ugc.aweme.feed.h.f;
import com.ss.android.ugc.aweme.feed.i.a;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.StickyRecyclerHeadersDecoration;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.StickyRecyclerHeadersTouchListener;
import com.ss.android.ugc.aweme.login.ui.b;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SelectNearbyActivity extends AmeSSActivity implements f, aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46283a;

    /* renamed from: b  reason: collision with root package name */
    public CityListAdapter f46284b;

    /* renamed from: c  reason: collision with root package name */
    public e f46285c;

    /* renamed from: d  reason: collision with root package name */
    a f46286d;

    /* renamed from: e  reason: collision with root package name */
    private NearbyCities f46287e;
    @BindView(2131493574)
    View ivClose;
    @BindView(2131496668)
    RecyclerView mRecyclerView;
    @BindView(2131497155)
    b mSlideBar;
    @BindView(2131497340)
    DmtStatusView mStatusView;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f46283a, false, 42998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46283a, false, 42998, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.ui.SelectNearbyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.ui.SelectNearbyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46283a, false, 42999, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46283a, false, 42999, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.ui.SelectNearbyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f46283a, false, 42996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46283a, false, 42996, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.s);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f46283a, false, 42990, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46283a, false, 42990, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.a25));
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f46283a, false, 42995, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f46283a, false, 42995, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.mStatusView.f();
    }

    public final void a(NearbyCities.CityBean cityBean) {
        List list;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{cityBean}, this, f46283a, false, 42997, new Class[]{NearbyCities.CityBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cityBean}, this, f46283a, false, 42997, new Class[]{NearbyCities.CityBean.class}, Void.TYPE);
            return;
        }
        NearbyCities.CityBean cityBean2 = null;
        try {
            list = (List) new Gson().fromJson(this.f46286d.a(null), new TypeToken<List<NearbyCities.CityBean>>() {
            }.getType());
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.size() == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(cityBean);
            str = new Gson().toJson((Object) arrayList);
        } else {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NearbyCities.CityBean cityBean3 = (NearbyCities.CityBean) it2.next();
                if (TextUtils.equals(cityBean3.code, cityBean.code)) {
                    cityBean2 = cityBean3;
                    break;
                }
            }
            if (cityBean2 != null) {
                list.remove(cityBean2);
            }
            list.add(0, cityBean);
            if (list.size() > 5) {
                str = new Gson().toJson((Object) list.subList(0, 5));
            } else {
                str = new Gson().toJson((Object) list);
            }
        }
        this.f46286d.b(str);
        if (this.f46287e.current == null) {
            str2 = "";
        } else {
            str2 = this.f46287e.current.code;
        }
        c.b(true);
        bg.a(new d(cityBean, TextUtils.equals(cityBean.code, str2)));
        r.a("homepage_fresh_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("click_method", "change").a("city_info", aa.a()).f34114b);
        finish();
    }

    public final void a(NearbyCities nearbyCities) {
        List<NearbyCities.CityBean> list;
        NearbyCities nearbyCities2 = nearbyCities;
        if (PatchProxy.isSupport(new Object[]{nearbyCities2}, this, f46283a, false, 42994, new Class[]{NearbyCities.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nearbyCities2}, this, f46283a, false, 42994, new Class[]{NearbyCities.class}, Void.TYPE);
        } else if (nearbyCities2 != null && nearbyCities2.all != null) {
            this.f46287e = nearbyCities2;
            Collections.sort(this.f46287e.all);
            try {
                list = (List) new Gson().fromJson(this.f46286d.a(null), new TypeToken<List<NearbyCities.CityBean>>() {
                }.getType());
            } catch (Exception unused) {
                list = null;
            }
            if (list != null && list.size() > 0) {
                this.f46287e.old = list;
            }
            CityListAdapter cityListAdapter = this.f46284b;
            NearbyCities nearbyCities3 = this.f46287e;
            if (PatchProxy.isSupport(new Object[]{nearbyCities3}, cityListAdapter, CityListAdapter.f44669a, false, 40331, new Class[]{NearbyCities.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{nearbyCities3}, cityListAdapter, CityListAdapter.f44669a, false, 40331, new Class[]{NearbyCities.class}, Void.TYPE);
            } else {
                cityListAdapter.f44670b = nearbyCities3;
                cityListAdapter.notifyDataSetChanged();
            }
            this.mStatusView.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f46283a, false, 42991, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f46283a, false, 42991, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.ui.SelectNearbyActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.ds);
        this.f46286d = (a) com.ss.android.ugc.aweme.base.sharedpref.c.a(this, a.class);
        if (PatchProxy.isSupport(new Object[0], this, f46283a, false, 42992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46283a, false, 42992, new Class[0], Void.TYPE);
        } else {
            this.ivClose.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46288a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f46288a, false, 43000, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f46288a, false, 43000, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    SelectNearbyActivity.this.finish();
                }
            });
            this.f46284b = new CityListAdapter(this);
            this.mRecyclerView.setAdapter(this.f46284b);
            this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
            final StickyRecyclerHeadersDecoration stickyRecyclerHeadersDecoration = new StickyRecyclerHeadersDecoration(this.f46284b);
            this.mRecyclerView.addItemDecoration(stickyRecyclerHeadersDecoration);
            StickyRecyclerHeadersTouchListener stickyRecyclerHeadersTouchListener = new StickyRecyclerHeadersTouchListener(this.mRecyclerView, stickyRecyclerHeadersDecoration);
            stickyRecyclerHeadersTouchListener.f46910d = new StickyRecyclerHeadersTouchListener.a() {
            };
            this.mRecyclerView.addOnItemTouchListener(stickyRecyclerHeadersTouchListener);
            this.f46284b.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46291a;

                public void onChanged() {
                    if (PatchProxy.isSupport(new Object[0], this, f46291a, false, 43001, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46291a, false, 43001, new Class[0], Void.TYPE);
                        return;
                    }
                    StickyRecyclerHeadersDecoration stickyRecyclerHeadersDecoration = stickyRecyclerHeadersDecoration;
                    if (PatchProxy.isSupport(new Object[0], stickyRecyclerHeadersDecoration, StickyRecyclerHeadersDecoration.f46901a, false, 43564, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], stickyRecyclerHeadersDecoration, StickyRecyclerHeadersDecoration.f46901a, false, 43564, new Class[0], Void.TYPE);
                        return;
                    }
                    stickyRecyclerHeadersDecoration.f46903c.a();
                    stickyRecyclerHeadersDecoration.f46902b.clear();
                }
            });
            this.mSlideBar.setOnSelectIndexItemListener(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46294a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f46294a, false, 43002, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f46294a, false, 43002, new Class[]{String.class}, Void.TYPE);
                    } else if (SelectNearbyActivity.this.f46284b.f44670b != null) {
                        if ("◷".equals(str)) {
                            ((LinearLayoutManager) SelectNearbyActivity.this.mRecyclerView.getLayoutManager()).scrollToPositionWithOffset(0, 0);
                            return;
                        }
                        for (int i = 0; i < SelectNearbyActivity.this.f46284b.f44670b.all.size(); i++) {
                            if (TextUtils.equals(String.valueOf(SelectNearbyActivity.this.f46284b.f44670b.all.get(i).en.charAt(0)), str)) {
                                ((LinearLayoutManager) SelectNearbyActivity.this.mRecyclerView.getLayoutManager()).scrollToPositionWithOffset(i + 1, 0);
                                return;
                            }
                        }
                    }
                }
            });
            this.mSlideBar.setTextColor(getResources().getColor(C0906R.color.a0g));
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46296a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f46296a, false, 43003, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f46296a, false, 43003, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    SelectNearbyActivity.this.mStatusView.d();
                    SelectNearbyActivity.this.f46285c.a(new Object[0]);
                }
            }));
        }
        if (PatchProxy.isSupport(new Object[0], this, f46283a, false, 42993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46283a, false, 42993, new Class[0], Void.TYPE);
        } else {
            this.f46285c = new e();
            this.f46285c.a(new com.ss.android.ugc.aweme.feed.h.d());
            this.f46285c.a(this);
            this.mStatusView.setVisibility(0);
            this.mStatusView.d();
            this.f46285c.a(new Object[0]);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.ui.SelectNearbyActivity", "onCreate", false);
    }
}
