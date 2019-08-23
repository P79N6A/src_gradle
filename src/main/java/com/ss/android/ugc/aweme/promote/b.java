package com.ss.android.ugc.aweme.promote;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63236a;

    /* renamed from: b  reason: collision with root package name */
    public static PromoteProgramDialog f63237b;

    /* renamed from: c  reason: collision with root package name */
    private static SharedPreferences f63238c;

    public static SharedPreferences a() {
        if (PatchProxy.isSupport(new Object[0], null, f63236a, true, 70169, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f63236a, true, 70169, new Class[0], SharedPreferences.class);
        }
        if (f63238c == null) {
            f63238c = c.a(k.a(), "aweme-promote-dialog", 0);
        }
        return f63238c;
    }
}
