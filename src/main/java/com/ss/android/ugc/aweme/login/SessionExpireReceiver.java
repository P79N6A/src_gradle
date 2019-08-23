package com.ss.android.ugc.aweme.login;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.login.loginlog.a;
import com.ss.android.ugc.aweme.app.n;

public class SessionExpireReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53738a;

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f53738a, false, 56378, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f53738a, false, 56378, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        c.b().logout("expired_logout");
        a.a().a("session_expire", "", false, "user_login_out", d.a().isLogin());
        n.a("aweme_user_logout", "", com.ss.android.ugc.aweme.app.d.c.a().a("errorDesc", "session_expire").b());
    }
}
