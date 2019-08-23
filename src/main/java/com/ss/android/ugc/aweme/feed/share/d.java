package com.ss.android.ugc.aweme.feed.share;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46045a;

    public final String a() {
        return "com.feiliao.flipchat.android";
    }

    public final String b() {
        return "飞聊动态";
    }

    public final String a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f46045a, false, 42103, new Class[]{Context.class}, String.class)) {
            return context2.getString(C0906R.string.c0i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f46045a, false, 42103, new Class[]{Context.class}, String.class);
    }
}
