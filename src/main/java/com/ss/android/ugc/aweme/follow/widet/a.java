package com.ss.android.ugc.aweme.follow.widet;

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
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.follow.f;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.utils.ad;

public final class a implements Observer<FollowStatus> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47848a;

    /* renamed from: b  reason: collision with root package name */
    public FragmentActivity f47849b;

    /* renamed from: c  reason: collision with root package name */
    public b f47850c;

    /* renamed from: d  reason: collision with root package name */
    public C0572a f47851d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.c f47852e;

    /* renamed from: f  reason: collision with root package name */
    private User f47853f;

    /* renamed from: com.ss.android.ugc.aweme.follow.widet.a$a  reason: collision with other inner class name */
    public interface C0572a {
        void a(FollowStatus followStatus);
    }

    public interface b {
        String a();

        void a(int i, User user);

        String b();

        int c();
    }

    public static class c implements b {
        public String a() {
            return "";
        }

        public void a(int i, User user) {
        }

        public String b() {
            return "";
        }

        public int c() {
            return 0;
        }
    }

    public final void b(User user) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, f47848a, false, 44762, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f47848a, false, 44762, new Class[]{User.class}, Void.TYPE);
            return;
        }
        IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
        FragmentActivity fragmentActivity = this.f47849b;
        if (user.getFollowStatus() != 2) {
            z = false;
        }
        a2.wrapperSyncXAlert(fragmentActivity, 2, z, new b(this, user));
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f47848a, false, 44760, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f47848a, false, 44760, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (followStatus != null && TextUtils.equals(followStatus.userId, this.f47853f.getUid())) {
            this.f47853f.setFollowStatus(followStatus.followStatus);
            com.ss.android.ugc.aweme.following.ui.view.c cVar = this.f47852e;
            int i2 = followStatus.followStatus;
            if (this.f47853f.getFollowerStatus() != 1) {
                i = 0;
            }
            cVar.a(i2, i);
            if (this.f47851d != null) {
                this.f47851d.a(followStatus);
            }
        }
    }

    public final void a(final User user) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{user}, this, f47848a, false, 44761, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f47848a, false, 44761, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (this.f47853f != null) {
            f.a().b().removeObserver(this);
        }
        this.f47853f = user;
        int followStatus = user.getFollowStatus();
        if (TextUtils.equals(user.getUid(), d.a().getCurUserId())) {
            com.ss.android.ugc.aweme.following.ui.view.c cVar = this.f47852e;
            if (this.f47853f.getFollowerStatus() != 1) {
                i = 0;
            }
            cVar.a(3, i);
            return;
        }
        com.ss.android.ugc.aweme.following.ui.view.c cVar2 = this.f47852e;
        if (this.f47853f.getFollowerStatus() != 1) {
            i = 0;
        }
        cVar2.a(followStatus, i);
        f.a().b().observe(this.f47852e.getLifeCycleOwner(), this);
        this.f47852e.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47854a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f47854a, false, 44768, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f47854a, false, 44768, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (!com.ss.android.ugc.aweme.c.a.a.a(view, 300)) {
                    if (!NetworkUtils.isNetworkAvailable(k.a())) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), (int) C0906R.string.bgf).a();
                    } else if (!d.a().isLogin()) {
                        e.a((Activity) a.this.f47849b, a.this.f47850c.a(), a.this.f47850c.b(), ad.a().a("login_title", a.this.f47849b.getResources().getString(C0906R.string.afr)).f75487b, (com.ss.android.ugc.aweme.base.component.f) new c(this, user));
                    } else {
                        a.this.b(user);
                    }
                }
            }
        });
    }

    public a(com.ss.android.ugc.aweme.following.ui.view.c cVar, b bVar) {
        this.f47852e = cVar;
        this.f47849b = (FragmentActivity) v.a(cVar.getContext());
        this.f47850c = bVar;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, User user) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), user}, this, f47848a, false, 44765, new Class[]{Integer.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), user}, this, f47848a, false, 44765, new Class[]{Integer.TYPE, User.class}, Void.TYPE);
            return;
        }
        if (user.getFollowStatus() == 0) {
            i2 = 1;
        }
        if (this.f47850c != null) {
            this.f47850c.a(i2, user);
        }
        a(user.getUid(), user.getSecUid(), i2);
    }

    private void a(String str, String str2, int i) {
        String str3;
        String str4 = str;
        String str5 = str2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i)}, this, f47848a, false, 44766, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i)}, this, f47848a, false, 44766, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        final i iVar = new i();
        i.a a2 = new i.a().a(str).b(str5).a(i);
        if (this.f47850c == null) {
            str3 = "";
        } else {
            str3 = this.f47850c.a();
        }
        i.a c2 = a2.c(str3);
        if (this.f47850c != null) {
            i2 = this.f47850c.c();
        }
        iVar.a(c2.b(i2).a());
        this.f47852e.getLifeCycleOwner().getLifecycle().addObserver(new FollowUserBlock$2(this, iVar));
        iVar.a(new m() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47857a;

            public final void onFollowSuccess(FollowStatus followStatus) {
            }

            public final void onFollowFail(final Exception exc) {
                if (PatchProxy.isSupport(new Object[]{exc}, this, f47857a, false, 44772, new Class[]{Exception.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc}, this, f47857a, false, 44772, new Class[]{Exception.class}, Void.TYPE);
                } else if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                    com.ss.android.ugc.aweme.captcha.c.b.a(a.this.f47849b.getSupportFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f47860a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f47860a, false, 44773, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f47860a, false, 44773, new Class[0], Void.TYPE);
                                return;
                            }
                            iVar.a();
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f47860a, false, 44774, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f47860a, false, 44774, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.app.api.a.a.a(a.this.f47849b, exc, C0906R.string.afx);
                        }
                    });
                } else {
                    com.ss.android.ugc.aweme.app.api.a.a.a(a.this.f47849b, exc, C0906R.string.afx);
                }
            }
        });
    }
}
