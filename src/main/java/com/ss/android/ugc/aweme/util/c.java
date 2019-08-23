package com.ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import java.io.File;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75419a;

    public static void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f75419a, true, 87774, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, f75419a, true, 87774, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a.a(str);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f75419a, true, 87775, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f75419a, true, 87775, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                a.a("  logFile is null :" + str3);
                return;
            }
            new File(str4);
            a.a(str3 + "   filePath:" + r2.getAbsolutePath() + "         exist:" + r2.exists() + "        fileSize:" + r2.length());
        } catch (Exception unused) {
        }
    }
}
