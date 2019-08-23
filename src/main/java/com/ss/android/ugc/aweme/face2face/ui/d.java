package com.ss.android.ugc.aweme.face2face.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.follow.f;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ad;

public final class d implements Observer<FollowStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44065a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.following.ui.view.c f44066b;

    /* renamed from: c  reason: collision with root package name */
    public FragmentActivity f44067c;

    /* renamed from: d  reason: collision with root package name */
    public b f44068d;

    /* renamed from: e  reason: collision with root package name */
    public User f44069e;

    /* renamed from: f  reason: collision with root package name */
    public a f44070f;

    public interface a {
        void a();

        void a(FollowStatus followStatus);

        void a(Exception exc);
    }

    public interface b {
        String a();

        void a(int i);

        String b();
    }

    public static class c implements b {
        public String a() {
            return "";
        }

        public void a(int i) {
        }

        public String b() {
            return "";
        }
    }

    public final void a(final User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f44065a, false, 39219, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f44065a, false, 39219, new Class[]{User.class}, Void.TYPE);
            return;
        }
        this.f44069e = user;
        int followStatus = user.getFollowStatus();
        if (TextUtils.equals(user.getUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
            this.f44066b.setFollowStatus(3);
            return;
        }
        this.f44066b.setFollowStatus(followStatus);
        f.a().b().observe(this.f44066b.getLifeCycleOwner(), this);
        this.f44066b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44073a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44073a, false, 39225, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44073a, false, 39225, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view, 300)) {
                    if (!NetworkUtils.isNetworkAvailable(k.a())) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), (int) C0906R.string.bgf).a();
                    } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                        e.a((Activity) d.this.f44067c, d.this.f44068d.a(), d.this.f44068d.b(), ad.a().a("login_title", d.this.f44067c.getResources().getString(C0906R.string.afr)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new f(this, user));
                    } else {
                        if (d.this.f44070f != null) {
                            d.this.f44070f.a();
                        }
                        d.this.b(user);
                    }
                }
            }
        });
    }

    public final void b(User user) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, f44065a, false, 39220, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f44065a, false, 39220, new Class[]{User.class}, Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        FragmentActivity fragmentActivity = this.f44067c;
        if (user.getFollowStatus() != 2) {
            z = false;
        }
        a2.wrapperSyncXAlert(fragmentActivity, 2, z, new e(this, user));
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f44065a, false, 39218, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f44065a, false, 39218, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (followStatus != null && TextUtils.equals(followStatus.userId, this.f44069e.getUid())) {
            this.f44066b.setFollowStatus(followStatus.followStatus);
            this.f44069e.setFollowStatus(followStatus.followStatus);
        }
    }

    public d(com.ss.android.ugc.aweme.following.ui.view.c cVar, b bVar) {
        this.f44066b = cVar;
        this.f44067c = (FragmentActivity) v.a(cVar.getContext());
        this.f44068d = bVar;
        if (PatchProxy.isSupport(new Object[0], this, f44065a, false, 39217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44065a, false, 39217, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44066b instanceof View) {
            ((View) this.f44066b).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44071a;

                public final void onViewAttachedToWindow(View view) {
                }

                public final void onViewDetachedFromWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f44071a, false, 39224, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f44071a, false, 39224, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ((View) d.this.f44066b).removeOnAttachStateChangeListener(this);
                    if (d.this.f44069e != null) {
                        f.a().b().removeObserver(d.this);
                    }
                }
            });
        }
    }
}
