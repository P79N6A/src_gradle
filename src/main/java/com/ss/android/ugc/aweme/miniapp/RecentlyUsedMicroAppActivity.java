package com.ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.e;
import java.util.List;

public class RecentlyUsedMicroAppActivity extends AmeSSActivity implements c<f>, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55396a;

    /* renamed from: b  reason: collision with root package name */
    private b<v> f55397b;

    /* renamed from: c  reason: collision with root package name */
    private RecentlyMicroAppListAdapter f55398c;

    /* renamed from: d  reason: collision with root package name */
    private LoadMoreAdapter f55399d;
    @BindView(2131495411)
    RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    TextTitleBar mTextTitleBar;

    public final void c(List<f> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59109, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55396a, false, 59110, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55396a, false, 59110, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void z_() {
    }

    public final boolean d() {
        if (this.f55399d.f41676b != 0) {
            return true;
        }
        return false;
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59107, new Class[0], Void.TYPE);
            return;
        }
        this.f55397b.a(4);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59097, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusView.c(true)) {
            this.f55397b.a(1);
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59108, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.cx, C0906R.anim.da);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59099, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && !this.mStatusView.f20470b) {
            this.mStatusView.d();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59098, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f55397b != null) {
            this.f55397b.j();
            this.f55397b.k();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59103, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f55399d.a(1);
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59094, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59101, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.e();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f55396a, false, 59100, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f55396a, false, 59100, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.f();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f55396a, false, 59104, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f55396a, false, 59104, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f55399d.a(2);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55396a, false, 59106, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55396a, false, 59106, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f55399d.a(z ? 1 : 0);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55396a, false, 59093, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55396a, false, 59093, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c3);
        ButterKnife.bind((Activity) this);
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59095, new Class[0], Void.TYPE);
        } else {
            com.bytedance.ies.dmt.ui.widget.c a2 = e.a(this, new w(this));
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
            dmtDefaultView.setSupportDelayVisible(true);
            dmtDefaultView.setStatus(a2);
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).b(LayoutInflater.from(this).inflate(C0906R.layout.ar7, null)).c((View) dmtDefaultView));
            this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(C0906R.dimen.lj));
            this.mListView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
            this.f55398c = new RecentlyMicroAppListAdapter(0);
            this.f55399d = LoadMoreAdapter.a((RecyclerView.Adapter<VH>) this.f55398c);
            this.mListView.setAdapter(this.f55399d);
            this.mListView.setOnFlingListener(new OnRecyclerViewFlingListener(this.mListView, this));
            String str = (String) SharePrefCache.inst().getMiniAppLabelTitle().c();
            if (!TextUtils.isEmpty(str)) {
                this.mTextTitleBar.setTitle((CharSequence) str);
            }
            this.mTextTitleBar.setOnTitleBarClickListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55400a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f55400a, false, 59112, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f55400a, false, 59112, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    RecentlyUsedMicroAppActivity.this.finish();
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f55396a, false, 59096, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55396a, false, 59096, new Class[0], Void.TYPE);
        } else {
            this.f55397b = new b<>();
            this.f55397b.a(new v());
            this.f55397b.a(this);
        }
        b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity", "onCreate", false);
    }

    public final void a(List<f> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55396a, false, 59102, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f55396a, false, 59102, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.b(true);
            this.f55399d.a(z ? 1 : 0);
            this.f55398c.a(list);
        }
    }

    public final void b(List<f> list, boolean z) {
        List<f> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55396a, false, 59105, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f55396a, false, 59105, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (!CollectionUtils.isEmpty(list)) {
                if (AbTestManager.a().d().useRecyclerPartialUpdate) {
                    RecentlyMicroAppListAdapter recentlyMicroAppListAdapter = this.f55398c;
                    if (PatchProxy.isSupport(new Object[]{list2}, recentlyMicroAppListAdapter, RecentlyMicroAppListAdapter.f55453a, false, 59170, new Class[]{List.class}, Void.TYPE)) {
                        RecentlyMicroAppListAdapter recentlyMicroAppListAdapter2 = recentlyMicroAppListAdapter;
                        PatchProxy.accessDispatch(new Object[]{list2}, recentlyMicroAppListAdapter2, RecentlyMicroAppListAdapter.f55453a, false, 59170, new Class[]{List.class}, Void.TYPE);
                    } else {
                        int size = recentlyMicroAppListAdapter.f55454b.size();
                        recentlyMicroAppListAdapter.f55454b.clear();
                        recentlyMicroAppListAdapter.f55454b.addAll(list2);
                        recentlyMicroAppListAdapter.notifyItemRangeInserted(size, recentlyMicroAppListAdapter.f55454b.size());
                    }
                } else {
                    this.f55398c.a(list2);
                }
            }
            this.f55399d.a(z ? 1 : 0);
        }
    }
}
