package com.ss.android.message.b;

import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29967a;

    @TargetClass
    @Proxy
    static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f29967a, true, 18136, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f29967a, true, 18136, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = a.b().f3304b;
        if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
            int i2 = i;
            Process.killProcess(i);
            return;
        }
        throw new RuntimeException("Process killed, pid is " + i);
    }
}
