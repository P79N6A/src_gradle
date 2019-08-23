package com.ss.android.ugc.aweme.lancet;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.c;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52959a;

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52959a, true, 54995, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52959a, true, 54995, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && str2.startsWith("aweme://user/profile/")) {
            Uri parse = Uri.parse(str);
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                c.a(pathSegments.get(1), parse);
            }
        }
    }
}
