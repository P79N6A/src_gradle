package com.ss.android.ugc.aweme.miniapp.b.a;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55518a;

    public interface a {
    }

    public static int a(@NonNull Context context, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f55518a, true, 59300, new Class[]{Context.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f55518a, true, 59300, new Class[]{Context.class, String.class}, Integer.TYPE)).intValue();
        } else if (str2 != null) {
            try {
                return context2.checkPermission(str2, Process.myPid(), Process.myUid());
            } catch (Throwable unused) {
                if (Build.VERSION.SDK_INT >= 23) {
                    return -1;
                }
                return 0;
            }
        } else {
            throw new IllegalArgumentException("permission is null");
        }
    }
}
