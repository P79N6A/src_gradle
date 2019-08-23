package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.friends.adapter.DouyinInviteMoreAdapter;
import com.ss.android.ugc.aweme.friends.d.h;
import com.ss.android.ugc.aweme.friends.d.i;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.friends.model.InviteMoreUnregisteredFriendsModel;
import com.ss.android.ugc.aweme.friends.model.UnRegisteredUser;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public class InviteMoreFriendsActivity extends AmeSSActivity implements LoadMoreRecyclerViewAdapter.a, ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49310a;

    /* renamed from: b  reason: collision with root package name */
    h f49311b;

    /* renamed from: c  reason: collision with root package name */
    DouyinInviteMoreAdapter f49312c;

    /* renamed from: d  reason: collision with root package name */
    public i f49313d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f49314e = false;

    /* renamed from: f  reason: collision with root package name */
    private InviteContactFriendsModel f49315f = new InviteContactFriendsModel("contact");
    @BindView(2131494847)
    TextView mInviteSelectedTv;
    @BindView(2131495411)
    RecyclerView mListView;
    @BindView(2131496683)
    SwipeRefreshLayout mRefreshLayout;
    @BindView(2131497340)
    DmtStatusView mStatusView;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public final void c(Exception exc) {
    }

    public final void c(List<UnRegisteredUser> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47373, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteMoreFriendsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteMoreFriendsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49310a, false, 47374, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49310a, false, 47374, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteMoreFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void z_() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47366, new Class[0], Void.TYPE);
            return;
        }
        f();
        this.f49312c.notifyDataSetChanged();
    }

    public final List<UnRegisteredUser> g() {
        if (!PatchProxy.isSupport(new Object[0], this, f49310a, false, 47369, new Class[0], List.class)) {
            return this.f49312c.getData();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47369, new Class[0], List.class);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47372, new Class[0], Void.TYPE);
            return;
        }
        this.f49313d.a(4);
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47361, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47370, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f49312c.showLoadMoreLoading();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47368, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void f() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47367, new Class[0], Void.TYPE);
            return;
        }
        int c2 = this.f49313d.c();
        if (c2 > 0) {
            this.mInviteSelectedTv.setText(getString(C0906R.string.b2f, new Object[]{Integer.valueOf(c2)}));
        } else {
            this.mInviteSelectedTv.setText(getString(C0906R.string.b2e));
        }
        TextView textView = this.mInviteSelectedTv;
        if (c2 > 0) {
            z = true;
        } else {
            z = false;
        }
        textView.setEnabled(z);
        UIUtils.setViewVisibility(this.mInviteSelectedTv, 0);
        DmtTextView endText = this.mTitleBar.getEndText();
        if (c2 > 0) {
            z2 = true;
        }
        endText.setEnabled(z2);
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47363, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f49312c.setData(null);
            this.f49312c.b();
            this.f49312c.resetLoadMoreState();
            this.mStatusView.setVisibility(0);
            this.mStatusView.e();
            UIUtils.setViewVisibility(this.mInviteSelectedTv, 8);
            a(false);
        }
    }

    public final void a(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49310a, false, 47365, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49310a, false, 47365, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        DmtTextView endText = this.mTitleBar.getEndText();
        if (!z) {
            i = 8;
        }
        UIUtils.setViewVisibility(endText, i);
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f49310a, false, 47362, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f49310a, false, 47362, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (this.f49312c.getData() == null) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.e();
                a(false);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49310a, false, 47358, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49310a, false, 47358, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteMoreFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c1);
        this.f49311b = new h(this.f49315f, null);
        this.f49313d = new i();
        this.f49313d.a(this);
        this.f49313d.a(new InviteMoreUnregisteredFriendsModel());
        if (PatchProxy.isSupport(new Object[0], this, f49310a, false, 47359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49310a, false, 47359, new Class[0], Void.TYPE);
        } else {
            this.mTitleBar.setTitle(getText(C0906R.string.clo));
            this.mTitleBar.setTitleColor(getResources().getColor(C0906R.color.anp));
            this.mTitleBar.setEndTextColor(getResources().getColor(C0906R.color.anp));
            this.mTitleBar.getEndText().setTypeface(Typeface.defaultFromStyle(0));
            this.mTitleBar.getEndText().setTextColor(getResources().getColorStateList(C0906R.color.rv));
            this.mTitleBar.getEndText().setText(C0906R.string.pm);
            this.mTitleBar.setOnTitleBarClickListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49316a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49316a, false, 47377, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49316a, false, 47377, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    InviteMoreFriendsActivity.this.onBackPressed();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49316a, false, 47378, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49316a, false, 47378, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    i iVar = InviteMoreFriendsActivity.this.f49313d;
                    if (PatchProxy.isSupport(new Object[0], iVar, i.f48860a, false, 46688, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], iVar, i.f48860a, false, 46688, new Class[0], Void.TYPE);
                        return;
                    }
                    iVar.f48861b.clear();
                    iVar.g.b();
                }
            });
            this.mInviteSelectedTv.setOnClickListener(new ae(this));
            this.mStatusView.setBuilder(DmtStatusView.a.a((Context) this).a(new c.a(this).b((int) C0906R.string.b5r).c(C0906R.string.aah).a(2130840145).f20493a));
            this.f49312c = new DouyinInviteMoreAdapter(0, this.f49313d);
            this.f49312c.setLoadMoreListener(this);
            this.f49312c.mTextColor = getResources().getColor(C0906R.color.zx);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
            wrapLinearLayoutManager.setOrientation(1);
            this.mListView.setLayoutManager(wrapLinearLayoutManager);
            this.mListView.setOverScrollMode(2);
            this.mListView.setAdapter(this.f49312c);
            this.mRefreshLayout.setOnRefreshListener(new af(this));
            this.mStatusView.d();
            this.f49313d.a(1);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteMoreFriendsActivity", "onCreate", false);
    }

    public final void a(List<UnRegisteredUser> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49310a, false, 47364, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49310a, false, 47364, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (list == null) {
                this.mStatusView.setVisibility(0);
                UIUtils.setViewVisibility(this.mInviteSelectedTv, 8);
                a(false);
                return;
            }
            this.f49312c.resetLoadMoreState();
            this.f49312c.setData(list);
            this.mStatusView.setVisibility(4);
            if (!z) {
                this.f49312c.showLoadMoreEmpty();
                this.f49312c.setLoadMoreListener(null);
            } else {
                this.f49312c.resetLoadMoreState();
                this.f49312c.setLoadMoreListener(this);
            }
            this.f49313d.d();
            a(true);
        }
    }

    public final void b(List<UnRegisteredUser> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49310a, false, 47371, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49310a, false, 47371, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f49312c.resetLoadMoreState();
            this.f49312c.setDataAfterLoadMore(list);
            this.mStatusView.setVisibility(4);
            if (!z) {
                this.f49312c.showLoadMoreEmpty();
                this.f49312c.setLoadMoreListener(null);
                return;
            }
            this.f49312c.resetLoadMoreState();
            this.f49312c.setLoadMoreListener(this);
        }
    }
}
