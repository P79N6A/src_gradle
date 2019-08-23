package com.ss.android.ugc.aweme.im.sdk.module.stranger.c;

import android.app.Activity;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.im.sdk.d.b;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.module.session.SessionListAdapter;
import com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public final class a implements c<com.ss.android.ugc.aweme.im.service.session.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3397a;

    /* renamed from: b  reason: collision with root package name */
    public final SessionListAdapter f3398b;

    /* renamed from: c  reason: collision with root package name */
    public DmtStatusView f3399c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f3400d;

    /* renamed from: e  reason: collision with root package name */
    public b f3401e = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51967a;

        public final void b(final com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51967a, false, 52553, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51967a, false, 52553, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            if (a.this.f3400d != null && !a.this.f3400d.isFinishing()) {
                a.this.f3400d.runOnUiThread(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51969a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f51969a, false, 52554, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f51969a, false, 52554, new Class[0], Void.TYPE);
                            return;
                        }
                        a.this.a(bVar.getConversationId());
                        a.this.f3398b.notifyDataSetChanged();
                        if (a.this.f3398b.getData() == null || a.this.f3398b.getData().isEmpty()) {
                            a.this.f3399c.e();
                        }
                    }
                });
            }
        }
    };

    public final void c(List<com.ss.android.ugc.aweme.im.service.session.a> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void z_() {
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3397a, false, 52543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3397a, false, 52543, new Class[0], Void.TYPE);
            return;
        }
        this.f3399c.d();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3397a, false, 52547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3397a, false, 52547, new Class[0], Void.TYPE);
            return;
        }
        this.f3398b.showLoadMoreLoading();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3397a, false, 52552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3397a, false, 52552, new Class[0], Void.TYPE);
            return;
        }
        if (!m.a() && (this.f3400d instanceof StrangerListActivity)) {
            DmtTextView rightTexView = ((StrangerListActivity) this.f3400d).f51936d.getRightTexView();
            if (rightTexView != null) {
                rightTexView.setTextColor(this.f3400d.getResources().getColor(C0906R.color.rq));
                rightTexView.setEnabled(false);
                rightTexView.setClickable(false);
            }
            ((StrangerListActivity) this.f3400d).f51936d.getRightView().setEnabled(false);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3397a, false, 52545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3397a, false, 52545, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3398b.mShowFooter) {
            this.f3398b.setShowFooter(false);
            this.f3398b.clearData();
            this.f3398b.showLoadMoreEmpty();
        }
        if (this.f3398b.getItemCount() == 0) {
            b();
            this.f3399c.e();
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3397a, false, 52548, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3397a, false, 52548, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f3398b.showLoadMoreError();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3397a, false, 52542, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3397a, false, 52542, new Class[]{String.class}, Void.TYPE);
            return;
        }
        List data = this.f3398b.getData();
        if (data != null) {
            Iterator it2 = data.iterator();
            while (it2.hasNext()) {
                if (str2.equals(((com.ss.android.ugc.aweme.im.service.session.a) it2.next()).O_())) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    @Subscribe
    public final void onEvent(com.ss.android.ugc.aweme.im.sdk.module.stranger.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3397a, false, 52550, new Class[]{com.ss.android.ugc.aweme.im.sdk.module.stranger.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3397a, false, 52550, new Class[]{com.ss.android.ugc.aweme.im.sdk.module.stranger.a.class}, Void.TYPE);
            return;
        }
        if (aVar.f51949a == 0) {
            a(aVar.f51950b);
            this.f3398b.notifyDataSetChanged();
            if (this.f3398b.getData().isEmpty()) {
                this.f3399c.e();
                b();
                k.a().a("stranger_1");
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3397a, false, 52544, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3397a, false, 52544, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f3398b.mShowFooter) {
            this.f3398b.setShowFooter(false);
            this.f3398b.notifyDataSetChanged();
        }
        if (this.f3398b.getItemCount() == 0) {
            b();
            this.f3399c.f();
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.im.service.session.a> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3397a, false, 52546, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3397a, false, 52546, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f3398b.setShowFooter(com.ss.android.ugc.aweme.im.sdk.d.a.b().needSessionListShowMore());
        if (!z) {
            this.f3398b.showLoadMoreEmpty();
        } else {
            this.f3398b.resetLoadMoreState();
        }
        this.f3398b.setData(list);
        if (list.isEmpty()) {
            b();
            this.f3399c.e();
            return;
        }
        this.f3399c.b();
    }

    public final void b(List<com.ss.android.ugc.aweme.im.service.session.a> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3397a, false, 52549, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3397a, false, 52549, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            z2 = z;
        }
        if (!z2) {
            this.f3398b.showLoadMoreEmpty();
        } else {
            this.f3398b.resetLoadMoreState();
        }
        this.f3398b.setDataAfterLoadMore(list);
    }

    public a(Activity activity, SessionListAdapter sessionListAdapter, DmtStatusView dmtStatusView) {
        this.f3400d = activity;
        this.f3398b = sessionListAdapter;
        this.f3399c = dmtStatusView;
        this.f3399c.d();
        this.f3398b.setShowFooter(true);
        if (!org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().a((Object) this);
        }
        d.a().a((g) this.f3401e);
    }
}
