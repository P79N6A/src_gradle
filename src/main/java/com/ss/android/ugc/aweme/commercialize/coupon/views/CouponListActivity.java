package com.ss.android.ugc.aweme.commercialize.coupon.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.commercialize.PoiCouponInputActivity;
import com.ss.android.ugc.aweme.commercialize.coupon.a.d;
import com.ss.android.ugc.aweme.commercialize.coupon.adapter.CouponListAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.e;
import java.util.List;
import java.util.Map;

public class CouponListActivity extends AmeSSActivity implements c<com.ss.android.ugc.aweme.commercialize.coupon.model.c>, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38619a;

    /* renamed from: b  reason: collision with root package name */
    private d f38620b;

    /* renamed from: c  reason: collision with root package name */
    private CouponListAdapter f38621c;

    /* renamed from: d  reason: collision with root package name */
    private LoadMoreAdapter f38622d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f38623e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38624f = true;
    @BindView(2131495411)
    RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131495760)
    TextView merchantTv;
    @BindView(2131497590)
    DmtTextView title;

    public final void c(List<com.ss.android.ugc.aweme.commercialize.coupon.model.c> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30522, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38619a, false, 30523, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38619a, false, 30523, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void z_() {
    }

    public final boolean d() {
        if (this.f38622d.f41676b != 0) {
            return true;
        }
        return false;
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30518, new Class[0], Void.TYPE);
            return;
        }
        this.f38620b.a(4);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30506, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusView.c(true)) {
            this.f38620b.a(1);
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30521, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (isTaskRoot()) {
            h.a().a((Activity) this, "aweme://main");
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30509, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && !this.mStatusView.f20470b) {
            this.mStatusView.d();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30508, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30508, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f38620b != null) {
            this.f38620b.j();
            this.f38620b.k();
        }
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30514, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f38622d.a(1);
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30507, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30507, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30511, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30511, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.e();
            a((com.ss.android.ugc.aweme.commercialize.coupon.a.c) this.f38620b.i());
        }
    }

    private void a(com.ss.android.ugc.aweme.commercialize.coupon.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f38619a, false, 30513, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f38619a, false, 30513, new Class[]{com.ss.android.ugc.aweme.commercialize.coupon.a.c.class}, Void.TYPE);
        } else if (cVar == null) {
            this.merchantTv.setVisibility(8);
        } else if (cVar.f38546b) {
            if (!this.f38623e) {
                r.a("show_im_seller", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "card_bag").f34114b);
                this.f38623e = true;
            }
            this.merchantTv.setVisibility(0);
        } else {
            this.merchantTv.setVisibility(8);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f38619a, false, 30510, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f38619a, false, 30510, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.f();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f38619a, false, 30515, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f38619a, false, 30515, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f38621c.f38563d = false;
            this.f38622d.a(2);
        }
    }

    @OnClick({2131493215, 2131495760})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38619a, false, 30519, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38619a, false, 30519, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.iz) {
            finish();
            return;
        }
        if (id == C0906R.id.bmm) {
            r.a("click_im_seller", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "card_bag").a("previous_page", "card_bag").f34114b);
            startActivity(new Intent(this, PoiCouponInputActivity.class));
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38619a, false, 30517, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38619a, false, 30517, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f38622d.a(z ? 1 : 0);
    }

    public void onCreate(Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f38619a, false, 30503, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f38619a, false, 30503, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c2);
        ButterKnife.bind((Activity) this);
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30504, new Class[0], Void.TYPE);
        } else {
            y.a(false);
            if (getIntent() != null && getIntent().hasExtra("is_coupon_valid")) {
                this.f38624f = getIntent().getBooleanExtra("is_coupon_valid", true);
            }
            if (this.f38624f) {
                i = C0906R.string.a2h;
            } else {
                i = C0906R.string.b1z;
            }
            this.title.setText(i);
            com.bytedance.ies.dmt.ui.widget.c a2 = e.a(this, new c(this));
            DmtDefaultView dmtDefaultView = new DmtDefaultView(this);
            dmtDefaultView.setSupportDelayVisible(true);
            dmtDefaultView.setStatus(a2);
            DmtStatusView.a a3 = DmtStatusView.a.a((Context) this);
            if (this.f38624f) {
                View inflate = LayoutInflater.from(this).inflate(C0906R.layout.aqj, null);
                inflate.findViewById(C0906R.id.y9).setOnClickListener(new d(this));
                a3.b(inflate);
            } else {
                a3.a((int) C0906R.string.a2p);
            }
            a3.c((View) dmtDefaultView);
            this.mStatusView.setBuilder(a3);
            this.mStatusView.setUseScreenHeight(getResources().getDimensionPixelSize(C0906R.dimen.lj));
            this.mListView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
            this.f38621c = new CouponListAdapter(this);
            this.f38621c.f38564e = this.f38624f;
            this.f38622d = LoadMoreAdapter.a((RecyclerView.Adapter<VH>) this.f38621c);
            this.mListView.setAdapter(this.f38622d);
            this.mListView.setOnFlingListener(new OnRecyclerViewFlingListener(this.mListView, this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f38619a, false, 30505, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38619a, false, 30505, new Class[0], Void.TYPE);
        } else {
            this.f38620b = new d();
            this.f38620b.a(new com.ss.android.ugc.aweme.commercialize.coupon.a.c(this.f38624f));
            this.f38620b.a(this);
        }
        b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity", "onCreate", false);
    }

    public final void a(List<com.ss.android.ugc.aweme.commercialize.coupon.model.c> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f38619a, false, 30512, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f38619a, false, 30512, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.b(true);
            this.f38622d.a(z ? 1 : 0);
            this.f38621c.f38563d = z;
            this.f38621c.a(list);
            a((com.ss.android.ugc.aweme.commercialize.coupon.a.c) this.f38620b.i());
        }
    }

    public final void b(List<com.ss.android.ugc.aweme.commercialize.coupon.model.c> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f38619a, false, 30516, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f38619a, false, 30516, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f38621c.f38563d = z;
            this.f38621c.a(list);
            this.f38622d.a(z ? 1 : 0);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f38619a, false, 30520, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f38619a, false, 30520, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            d dVar = this.f38620b;
            int intExtra = intent2.getIntExtra("coupon_list_position", 0);
            com.ss.android.ugc.aweme.commercialize.coupon.model.c cVar = (com.ss.android.ugc.aweme.commercialize.coupon.model.c) intent2.getSerializableExtra("coupon_info");
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra), cVar}, dVar, d.f38554a, false, 30461, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE)) {
                d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra), cVar}, dVar2, d.f38554a, false, 30461, new Class[]{Integer.TYPE, com.ss.android.ugc.aweme.commercialize.coupon.model.c.class}, Void.TYPE);
            } else {
                ((com.ss.android.ugc.aweme.commercialize.coupon.a.c) dVar.f2978e).getItems().set(intExtra, cVar);
            }
            this.f38622d.notifyItemChanged(intent2.getIntExtra("coupon_list_position", 0), new Object());
        }
    }
}
