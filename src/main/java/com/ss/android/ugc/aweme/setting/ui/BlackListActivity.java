package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.adapter.BlackListAdapter;
import com.ss.android.ugc.aweme.setting.d.a;
import com.ss.android.ugc.aweme.setting.d.b;
import com.ss.android.ugc.aweme.utils.di;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class BlackListActivity extends AmeBaseActivity implements LoadMoreRecyclerViewAdapter.a, c<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64113a;

    /* renamed from: b  reason: collision with root package name */
    b f64114b;

    /* renamed from: c  reason: collision with root package name */
    private int f64115c;

    /* renamed from: d  reason: collision with root package name */
    private int f64116d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f64117e;

    /* renamed from: f  reason: collision with root package name */
    private BlackListAdapter f64118f;
    @BindView(2131493213)
    ImageView mBack;
    @BindView(2131493299)
    RecyclerView mRecyclerView;
    @BindView(2131496858)
    LinearLayout mRootView;
    @BindView(2131493300)
    DmtStatusView mStatusView;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131497613)
    ButtonTitleBar mTitleBar;

    public final int a() {
        return C0906R.layout.ai;
    }

    public final void c(List<User> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64113a, false, 72422, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64113a, false, 72422, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void z_() {
    }

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72411, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72421, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.da);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72412, new Class[0], Void.TYPE);
            return;
        }
        this.f64114b.a(4);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72413, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusView != null) {
            this.mStatusView.d();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72417, new Class[0], Void.TYPE);
            return;
        }
        this.f64118f.showLoadMoreLoading();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72406, new Class[0], Void.TYPE);
            return;
        }
        v.b((Activity) this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72410, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onResume", true);
        super.onResume();
        this.f64118f.setData(new ArrayList());
        this.f64114b.a(1);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onResume", false);
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72415, new Class[0], Void.TYPE);
            return;
        }
        if (this.f64118f.mShowFooter) {
            this.f64118f.setShowFooter(false);
            this.f64118f.notifyDataSetChanged();
            this.f64118f.showLoadMoreEmpty();
        }
        if (this.mStatusView != null) {
            this.mStatusView.e();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f64113a, false, 72418, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f64113a, false, 72418, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f64118f.showLoadMoreError();
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f64113a, false, 72414, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f64113a, false, 72414, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f64118f.mShowFooter) {
            this.f64118f.setShowFooter(false);
            this.f64118f.notifyDataSetChanged();
        }
        if (this.mStatusView != null) {
            this.mStatusView.f();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64113a, false, 72404, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64113a, false, 72404, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onCreate", true);
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72405, new Class[0], Void.TYPE);
        } else {
            this.f64115c = getIntent().getIntExtra("block_type", 0);
            this.f64116d = getIntent().getIntExtra("theme_mode", 0);
            if (this.f64115c == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f64117e = z;
        }
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.cz, 0);
        if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72407, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72408, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72408, new Class[0], Void.TYPE);
            } else if (this.f64116d != 0) {
                this.mRootView.setBackgroundColor(getResources().getColor(C0906R.color.a7l));
                this.mTitleBar.setBackgroundResource(2130838333);
                this.mTitleBar.setColorMode(0);
                this.mTitle.setTextColor(getResources().getColor(C0906R.color.a17));
                this.mRecyclerView.setBackgroundColor(getResources().getColor(C0906R.color.ao4));
                this.mStatusView.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64119a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f64119a, false, 72424, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64119a, false, 72424, new Class[0], Void.TYPE);
                            return;
                        }
                        BlackListActivity.this.mStatusView.onColorModeChange(0);
                    }
                });
            }
            TextView textView = this.mTitle;
            if (this.f64117e) {
                i = C0906R.string.ce8;
            } else {
                i = C0906R.string.ne;
            }
            textView.setText(i);
            this.f64118f = new BlackListAdapter(this, this.f64115c, this.f64116d);
            this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
            di.b(this.mRecyclerView);
            this.mRecyclerView.setAdapter(this.f64118f);
            this.f64118f.setLoadMoreListener(this);
            this.f64118f.setShowFooter(true);
            if (PatchProxy.isSupport(new Object[0], this, f64113a, false, 72409, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64113a, false, 72409, new Class[0], Void.TYPE);
            } else {
                DmtStatusView.a a2 = DmtStatusView.a.a((Context) this);
                if (this.f64117e) {
                    i2 = C0906R.string.nf;
                } else {
                    i2 = C0906R.string.nd;
                }
                this.mStatusView.setBuilder(a2.a(i2).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new c(this)));
                this.mStatusView.d();
            }
            this.f64114b = new b();
            this.f64114b.a(new a(this.f64115c));
            this.f64114b.a(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.BlackListActivity", "onCreate", false);
    }

    public final void a(List<User> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64113a, false, 72416, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f64113a, false, 72416, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f64118f.setShowFooter(true);
        if (!z) {
            this.f64118f.showLoadMoreEmpty();
        } else {
            this.f64118f.resetLoadMoreState();
        }
        this.f64118f.setData(list);
        if (this.mStatusView != null) {
            this.mStatusView.b();
        }
    }

    public final void b(List<User> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64113a, false, 72419, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f64113a, false, 72419, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z2 = z;
        }
        if (!z2) {
            this.f64118f.showLoadMoreEmpty();
        } else {
            this.f64118f.resetLoadMoreState();
        }
        this.f64118f.setDataAfterLoadMore(list);
    }
}
