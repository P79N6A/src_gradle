package com.ss.android.ugc.aweme.feed.share;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46058a;

    public final String a() {
        return "com.tencent.mm";
    }

    public final String b() {
        return "微信";
    }

    public final String a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f46058a, false, 42141, new Class[]{Context.class}, String.class)) {
            return context2.getString(C0906R.string.dtl);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f46058a, false, 42141, new Class[]{Context.class}, String.class);
    }
}