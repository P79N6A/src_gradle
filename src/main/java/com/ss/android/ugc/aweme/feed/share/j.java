package com.ss.android.ugc.aweme.feed.share;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class j implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46056a;

    public final String a() {
        return "com.sina.weibo";
    }

    public final String b() {
        return "微博";
    }

    public final String a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f46056a, false, 42139, new Class[]{Context.class}, String.class)) {
            return context2.getString(C0906R.string.dt_);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f46056a, false, 42139, new Class[]{Context.class}, String.class);
    }
}
