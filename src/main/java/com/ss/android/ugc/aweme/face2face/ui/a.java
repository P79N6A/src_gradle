package com.ss.android.ugc.aweme.face2face.ui;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.follow.f;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.h;
import com.ss.android.ugc.aweme.profile.presenter.m;
import com.ss.android.ugc.aweme.utils.bg;

public final class a extends com.ss.android.ugc.aweme.account.c.a<com.ss.android.ugc.aweme.common.a<FollowStatus>, m> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f44055b;

    /* renamed from: c  reason: collision with root package name */
    public String f44056c;

    /* renamed from: com.ss.android.ugc.aweme.face2face.ui.a$a  reason: collision with other inner class name */
    public static final class C0551a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44059a;

        /* renamed from: b  reason: collision with root package name */
        h f44060b = new h();
    }

    public a() {
        if (PatchProxy.isSupport(new Object[0], this, f44055b, false, 39199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44055b, false, 39199, new Class[0], Void.TYPE);
            return;
        }
        a(new com.ss.android.ugc.aweme.common.a<FollowStatus>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44057a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 7) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f44057a, false, 39206, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f44057a, false, 39206, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    a.this.f44056c = objArr[0];
                    com.ss.android.ugc.aweme.base.m.a().a(this.mHandler, new b(objArr), 0);
                    return true;
                }
            }
        });
    }

    public final void b() {
        FollowStatus followStatus;
        if (PatchProxy.isSupport(new Object[0], this, f44055b, false, 39203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44055b, false, 39203, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            followStatus = null;
        } else {
            followStatus = (FollowStatus) this.f2978e.getData();
        }
        if (followStatus != null) {
            followStatus.userId = this.f44056c;
        }
        if (followStatus != null && followStatus.followStatus == 1) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("mus_af_follow", null);
        }
        if (followStatus != null) {
            if (this.f2979f != null) {
                ((m) this.f2979f).onFollowSuccess(followStatus);
                bg.a(followStatus);
                f.a().b().postValue(followStatus);
            }
            User user = new User();
            user.setUid(followStatus.userId);
            user.setFollowStatus(followStatus.followStatus);
            b.a().updateIMUserFollowStatus(b.a(user));
            if (PatchProxy.isSupport(new Object[]{followStatus}, this, f44055b, false, 39205, new Class[]{FollowStatus.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followStatus}, this, f44055b, false, 39205, new Class[]{FollowStatus.class}, Void.TYPE);
            } else if (com.ss.android.g.a.b() && followStatus != null && followStatus.followStatus == 0) {
                bg.a(followStatus.cpoyToWatchStatus());
            }
        }
    }

    public final boolean a(Object... objArr) {
        if (!PatchProxy.isSupport(new Object[]{objArr}, this, f44055b, false, 39200, new Class[]{Object[].class}, Boolean.TYPE)) {
            return super.a(objArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f44055b, false, 39200, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(@Nullable h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f44055b, false, 39201, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f44055b, false, 39201, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        }
        if (hVar2 != null) {
            if (super.a(hVar2.f61625a, Integer.valueOf(hVar2.f61627c), Integer.valueOf(hVar2.f61628d), hVar2.f61630f, hVar2.g, Integer.valueOf(hVar2.f61629e), hVar2.f61626b)) {
                return true;
            }
        }
        return false;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f44055b, false, 39202, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f44055b, false, 39202, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((m) this.f2979f).onFollowFail(exc);
            String str = this.f44056c;
            if (PatchProxy.isSupport(new Object[]{str}, this, f44055b, false, 39204, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f44055b, false, 39204, new Class[]{String.class}, Void.TYPE);
                return;
            }
            FollowStatus followStatus = new FollowStatus();
            followStatus.userId = str;
            followStatus.followStatus = 0;
            followStatus.isFollowSucess = false;
            bg.a(followStatus);
            f.a().b().postValue(followStatus);
        }
    }
}
