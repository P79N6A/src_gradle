package com.ss.android.ugc.aweme.story.live;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.m;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73134a;

    public static void a(Context context, User user, String str) {
        Context context2 = context;
        User user2 = user;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, user2, str2}, null, f73134a, true, 84725, new Class[]{Context.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user2, str2}, null, f73134a, true, 84725, new Class[]{Context.class, User.class, String.class}, Void.TYPE);
        } else if (context2 != null && user2 != null) {
            b.a(context, str, user.getRequestId(), user.getUid(), user2.roomId);
            new g(context2).a(user2, str2);
        }
    }

    public static void a(Context context, User user, boolean z, m mVar) {
        Context context2 = context;
        User user2 = user;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{context2, user2, (byte) 0, mVar2}, null, f73134a, true, 84723, new Class[]{Context.class, User.class, Boolean.TYPE, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, user2, (byte) 0, mVar2}, null, f73134a, true, 84723, new Class[]{Context.class, User.class, Boolean.TYPE, m.class}, Void.TYPE);
        } else if (context2 != null && user2 != null) {
            b.a(context, false, 1, user.getRequestId(), user.getUid(), user2.roomId);
            new g(context2).a(user2, mVar2);
        }
    }
}
