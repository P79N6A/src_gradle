package com.ss.ttm.player;

import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import java.lang.Thread;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class TTExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mPath;

    public class _lancet {
        public static ChangeQuickRedirect changeQuickRedirect;

        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90763, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90763, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                int i2 = i;
                System.exit(i);
                return;
            }
            throw new RuntimeException("Process killed, status is " + i);
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90762, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 90762, new Class[]{Integer.TYPE}, Void.TYPE);
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

    public TTExceptionHandler(String str) {
        this.mPath = str;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{thread, th2}, this, changeQuickRedirect, false, 90761, new Class[]{Thread.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{thread, th2}, this, changeQuickRedirect, false, 90761, new Class[]{Thread.class, Throwable.class}, Void.TYPE);
            return;
        }
        TTPlayerConfiger.getValue(5, false);
        TTCrashUtil.saveException(th2, this.mPath);
        _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
        _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(0);
    }
}
