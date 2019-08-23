package com.ss.android.ugc.aweme.ttopenapi;

import android.text.TextUtils;
import com.bytedance.sdk.account.b.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.SoftReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74998a;

    /* renamed from: b  reason: collision with root package name */
    public static SoftReference<C0784a> f74999b;

    /* renamed from: com.ss.android.ugc.aweme.ttopenapi.a$a  reason: collision with other inner class name */
    public interface C0784a {
        void a(boolean z, String str, int i, String str2);
    }

    public static void a(c.b bVar) {
        c.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f74998a, true, 87322, new Class[]{c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f74998a, true, 87322, new Class[]{c.b.class}, Void.TYPE);
        } else if (bVar2 == null) {
            a(false, null, -10001, "");
        } else {
            int i = bVar2.errorCode;
            String str = bVar2.f22265a;
            if (i == 0) {
                try {
                    if (!TextUtils.isEmpty(str)) {
                        a(true, str, i, bVar2.errorMsg);
                        return;
                    }
                } catch (Exception unused) {
                }
                a(false, str, i, bVar2.errorMsg);
                return;
            }
            a(false, str, i, bVar2.errorMsg);
        }
    }

    private static void a(boolean z, String str, int i, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, Integer.valueOf(i), str4}, null, f74998a, true, 87323, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, Integer.valueOf(i), str4}, null, f74998a, true, 87323, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (!(f74999b == null || f74999b.get() == null)) {
            f74999b.get().a(z, str3, i, str4);
        }
        f74999b = null;
    }
}
