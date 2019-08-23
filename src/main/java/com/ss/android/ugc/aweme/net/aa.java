package com.ss.android.ugc.aweme.net;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okio.ByteString;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56881a;

    public static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f56881a, true, 60785, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f56881a, true, 60785, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return ByteString.encodeUtf8(str).md5().hex();
        }
    }
}
