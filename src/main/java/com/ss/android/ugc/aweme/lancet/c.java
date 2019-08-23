package com.ss.android.ugc.aweme.lancet;

import android.text.TextUtils;
import android.util.Patterns;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52938a;

    public static void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f52938a, true, 54941, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f52938a, true, 54941, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            b(str);
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "H5UrlCheckLancet checkError");
        }
    }

    private static void b(String str) {
        int i;
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52938a, true, 54942, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52938a, true, 54942, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.equals("about:blank", str2)) {
            if (!Patterns.WEB_URL.matcher(str2).matches()) {
                n.a("h5_invalid_url", com.ss.android.ugc.aweme.app.d.c.a().a("errorDesc", str2).b());
                return;
            }
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            char c2 = '0';
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                char charAt = str2.charAt(i2);
                if (charAt == '?') {
                    i = 1;
                } else {
                    i = 0;
                }
                i3 += i;
                if (i3 > 1 || (charAt == c2 && (charAt == '&' || charAt == '?' || charAt == '='))) {
                    break;
                }
                i2++;
                c2 = charAt;
            }
            if (z) {
                n.a("h5_invalid_url", com.ss.android.ugc.aweme.app.d.c.a().a("errorDesc", str2).b());
            }
        }
    }
}
