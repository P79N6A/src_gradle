package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class ay {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43153a;

    public static String a(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f43153a, true, 38082, new Class[]{Context.class}, String.class)) {
            return context.getResources().getString(C0906R.string.jr);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f43153a, true, 38082, new Class[]{Context.class}, String.class);
    }

    public static String b(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f43153a, true, 38083, new Class[]{Context.class}, String.class)) {
            return context.getResources().getString(C0906R.string.ad_);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f43153a, true, 38083, new Class[]{Context.class}, String.class);
    }

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f43153a, true, 38084, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f43153a, true, 38084, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return true;
        } else {
            return TextUtils.isEmpty(str.trim());
        }
    }
}
