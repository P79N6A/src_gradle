package com.ss.android.ugc.aweme.music.ui;

import android.os.Build;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56663a;

    @TargetClass
    @Proxy
    static void a(Toast toast) {
        if (PatchProxy.isSupport(new Object[]{toast}, null, f56663a, true, 60103, new Class[]{Toast.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{toast}, null, f56663a, true, 60103, new Class[]{Toast.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT == 25) {
            eq.a(toast);
        }
        toast.show();
    }
}
