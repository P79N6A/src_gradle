package com.ali.auth.third.core.util;

import android.os.Build;
import android.widget.Toast;
import com.ali.auth.third.core.context.KernelContext;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5003a;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    d(String str) {
        this.f5003a = str;
    }

    public final void run() {
        _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(KernelContext.getApplicationContext(), ResourceUtils.getString(this.f5003a), 0));
    }
}
