package com.ss.android.ugc.aweme.followrequest;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.followrequest.a.c;
import com.ss.android.ugc.aweme.followrequest.a.e;
import com.ss.android.ugc.aweme.followrequest.adapter.FollowRequestAdapter;
import com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.j;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FollowRequestActivity extends AmeBaseActivity implements LoadMoreRecyclerViewAdapter.a, e, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48223a;

    /* renamed from: b  reason: collision with root package name */
    c f48224b;

    /* renamed from: c  reason: collision with root package name */
    private FollowRequestAdapter f48225c;
    @BindView(2131494359)
    DmtStatusView mListStatusView;
    @BindView(2131496717)
    RecyclerView mRecyclerView;
    @BindView(2131497328)
    View mStatusView;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public final int a() {
        return C0906R.layout.bh;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48223a, false, 45297, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48223a, false, 45297, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f48223a, false, 45290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48223a, false, 45290, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48223a, false, 45289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48223a, false, 45289, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onResume", true);
        super.onResume();
        this.f48224b.c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onResume", false);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f48223a, false, 45294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48223a, false, 45294, new Class[0], Void.TYPE);
            return;
        }
        if (this.f48225c.mShowFooter) {
            this.f48225c.setShowFooter(false);
            this.f48225c.notifyDataSetChanged();
            this.f48225c.showLoadMoreEmpty();
        }
        if (this.mListStatusView != null) {
            this.mListStatusView.e();
        }
    }

    public void loadMore() {
        long j;
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f48223a, false, 45291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48223a, false, 45291, new Class[0], Void.TYPE);
            return;
        }
        c cVar = this.f48224b;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f48242a, false, 45327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f48242a, false, 45327, new Class[0], Void.TYPE);
            return;
        }
        j jVar = (j) cVar.f2978e;
        if (jVar != null) {
            if (PatchProxy.isSupport(new Object[0], jVar, j.f61640a, false, 67589, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], jVar, j.f61640a, false, 67589, new Class[0], Void.TYPE);
            } else {
                FollowRequestResponse followRequestResponse = (FollowRequestResponse) jVar.getData();
                if (followRequestResponse != null) {
                    j = followRequestResponse.maxTime;
                } else {
                    j = System.currentTimeMillis() / 1000;
                }
                jVar.f61642b = j;
                FollowRequestResponse followRequestResponse2 = (FollowRequestResponse) jVar.getData();
                if (followRequestResponse2 != null) {
                    j2 = followRequestResponse2.minTime;
                } else {
                    j2 = 1;
                }
                jVar.f61643c = j2;
                jVar.f61645e = false;
                jVar.f61644d = true;
                jVar.a(jVar.f61642b, jVar.f61643c, 20);
            }
        }
        cVar.n_();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48223a, false, 45296, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48223a, false, 45296, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f48225c.showLoadMoreLoading();
        } else {
            if (this.mListStatusView != null) {
                this.mListStatusView.d();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48223a, false, 45286, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48223a, false, 45286, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f48223a, false, 45287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48223a, false, 45287, new Class[0], Void.TYPE);
        } else {
            this.mTitleBar.setTitle((int) C0906R.string.agm);
            this.mTitleBar.setOnTitleBarClickListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48226a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f48226a, false, 45299, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f48226a, false, 45299, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    FollowRequestActivity.this.finish();
                }
            });
            v.b((Activity) this);
            if (com.ss.android.g.a.b()) {
                v.c((Activity) this);
            }
            this.f48225c = new FollowRequestAdapter(this);
            this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
            this.mRecyclerView.setAdapter(this.f48225c);
            this.f48225c.setLoadMoreListener(this);
            this.f48225c.setShowFooter(true);
            if (PatchProxy.isSupport(new Object[0], this, f48223a, false, 45288, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48223a, false, 45288, new Class[0], Void.TYPE);
            } else {
                this.mListStatusView.setBuilder(DmtStatusView.a.a((Context) this).a((int) C0906R.string.brb, (int) C0906R.string.bra).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new a(this)));
                this.mListStatusView.d();
            }
            this.f48224b = new c();
            this.f48224b.a(new j());
            this.f48224b.a(this);
            if (Build.VERSION.SDK_INT >= 19) {
                this.mStatusView.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.followrequest.FollowRequestActivity", "onCreate", false);
    }

    public final void a(@Nullable Exception exc, boolean z) {
        if (PatchProxy.isSupport(new Object[]{exc, Byte.valueOf(z ? (byte) 1 : 0)}, this, f48223a, false, 45295, new Class[]{Exception.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Byte.valueOf(z)}, this, f48223a, false, 45295, new Class[]{Exception.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f48225c.showLoadMoreError();
        } else {
            if (this.f48225c.mShowFooter) {
                this.f48225c.setShowFooter(false);
                this.f48225c.notifyDataSetChanged();
            }
            if (this.mListStatusView != null) {
                this.mListStatusView.f();
            }
        }
    }

    public final void a(@NotNull List<User> list, boolean z, boolean z2) {
        List<User> list2 = list;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f48223a, false, 45293, new Class[]{List.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f48223a, false, 45293, new Class[]{List.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            if (list2 != null && !list.isEmpty()) {
                z3 = z2;
            }
            if (!z3) {
                this.f48225c.showLoadMoreEmpty();
            } else {
                this.f48225c.resetLoadMoreState();
            }
            this.f48225c.setDataAfterLoadMore(list);
        } else {
            this.f48225c.setShowFooter(true);
            if (!z2) {
                this.f48225c.showLoadMoreEmpty();
            } else {
                this.f48225c.resetLoadMoreState();
            }
            this.f48225c.setData(list);
            if (this.mListStatusView != null) {
                this.mListStatusView.b();
            }
        }
    }
}
