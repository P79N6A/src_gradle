package com.ss.android.ugc.aweme.profile.presenter;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final class u extends x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61650a;

    /* renamed from: b  reason: collision with root package name */
    public String f61651b;

    public u() {
        a(new a<UserResponse>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61652a;

            public final boolean checkParams(Object... objArr) {
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f61652a, false, 67596, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f61652a, false, 67596, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                }
                e.a().a((Handler) this.mHandler);
                e.a().f61337b = u.this.f61651b;
                return true;
            }
        });
    }

    public final void b() {
        User user;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f61650a, false, 67594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61650a, false, 67594, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null || this.f2978e.getData() == null) {
            user = null;
        } else {
            user = ((UserResponse) this.f2978e.getData()).getUser();
        }
        if (user == null || d.a().isUserEmpty(user)) {
            com.ss.android.ugc.aweme.app.d.d dVar = new com.ss.android.ugc.aweme.app.d.d();
            if (user != null) {
                str = user.getUid();
            } else {
                str = "";
            }
            r.a("profile_request_response", (Map) dVar.a("to_user_id", str).a("enter_from", "personal_homepage").a("is_success", 0).a("fail_info", "user_is_empty").f34114b);
            return;
        }
        if (com.ss.android.g.a.b()) {
            r.a("profile_request_response", (Map) new com.ss.android.ugc.aweme.app.d.d().a("to_user_id", user.getUid()).a("enter_from", "personal_homepage").a("is_success", 1).f34114b);
        }
        d.a().updateCurUser(user);
        if (this.f2979f != null) {
            ((n) this.f2979f).a(user);
            a(user);
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f61650a, false, 67595, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f61650a, false, 67595, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = new com.ss.android.ugc.aweme.app.d.d().a("to_user_id", d.a().getCurUserId()).a("enter_from", "personal_homepage").a("is_success", 0).a("fail_info", exc.getMessage());
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            a2.a("response", ((com.ss.android.ugc.aweme.base.api.a.b.a) exc2).getResponse());
        }
        r.a("profile_request_response", (Map) a2.f34114b);
        super.a(exc);
    }
}
