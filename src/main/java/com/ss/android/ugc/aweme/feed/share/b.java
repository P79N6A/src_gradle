package com.ss.android.ugc.aweme.feed.share;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45859a;

    public final String a() {
        return "com.tencent.mobileqq";
    }

    public final String b() {
        return "QQ空间";
    }

    public final String a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f45859a, false, 42101, new Class[]{Context.class}, String.class)) {
            return context2.getString(C0906R.string.bu8);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context2}, this, f45859a, false, 42101, new Class[]{Context.class}, String.class);
    }
}