package com.ss.android.download;

import android.os.Build;
import android.widget.Toast;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class c {
    @TargetClass
    @Proxy
    static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            eq.a(toast);
        }
        toast.show();
    }
}
