package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.a;

public final class ev {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75852a;

    public static Uri a() {
        if (PatchProxy.isSupport(new Object[0], null, f75852a, true, 88645, new Class[0], Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[0], null, f75852a, true, 88645, new Class[0], Uri.class);
        }
        return Uri.parse(a.D);
    }
}
