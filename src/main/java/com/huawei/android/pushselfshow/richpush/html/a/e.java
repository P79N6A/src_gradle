package com.huawei.android.pushselfshow.richpush.html.a;

import android.os.Build;
import android.widget.Toast;
import com.ss.android.ugc.aweme.utils.eq;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class e extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f25287a;

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

    e(d dVar) {
        this.f25287a = dVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0049 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            android.os.Looper.prepare()     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            com.huawei.android.pushselfshow.richpush.html.a.d r0 = r4.f25287a     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            android.app.Activity r0 = r0.f25286f     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            com.huawei.android.pushselfshow.richpush.html.a.d r1 = r4.f25287a     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            android.app.Activity r1 = r1.f25286f     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            java.lang.String r2 = "手机上没有安装应用市场，建议安装智汇云应用市场"
            java.lang.String r3 = "Not Found App Market"
            java.lang.String r1 = com.huawei.android.pushselfshow.utils.a.a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            com.huawei.android.pushselfshow.richpush.html.a.e._lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(r0)     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            android.os.Looper.loop()     // Catch:{ Exception -> 0x0049, all -> 0x0035 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x002a }
            r0.quit()     // Catch:{ Exception -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.String r2 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r0)
            return
        L_0x0035:
            r0 = move-exception
            android.os.Looper r1 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x003e }
            r1.quit()     // Catch:{ Exception -> 0x003e }
            goto L_0x0048
        L_0x003e:
            r1 = move-exception
            java.lang.String r2 = r1.toString()
            java.lang.String r3 = "PushSelfShowLog"
            com.huawei.android.pushagent.utils.a.e.c(r3, r2, r1)
        L_0x0048:
            throw r0
        L_0x0049:
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x002a }
            r0.quit()     // Catch:{ Exception -> 0x002a }
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.richpush.html.a.e.run():void");
    }
}
