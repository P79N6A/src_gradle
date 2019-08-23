package com.baidu.android.pushservice;

import android.content.BroadcastReceiver;

public class RegistrationReceiver extends BroadcastReceiver {
    /* JADX WARNING: Can't wrap try/catch for region: R(8:8|9|(1:11)|12|(1:14)|15|16|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r1, android.content.Intent r2) {
        /*
            r0 = this;
            com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x002b }
            boolean r2 = r2.k()     // Catch:{ Throwable -> 0x002b }
            if (r2 == 0) goto L_0x000f
            com.ss.android.message.b.b.a(r1)     // Catch:{ Throwable -> 0x000e }
            return
        L_0x000e:
            return
        L_0x000f:
            com.ss.android.pushmanager.app.d$a r2 = com.ss.android.pushmanager.app.d.a()     // Catch:{ Exception -> 0x0023 }
            if (r2 == 0) goto L_0x0018
            r2.a(r1)     // Catch:{ Exception -> 0x0023 }
        L_0x0018:
            com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Exception -> 0x0023 }
            boolean r2 = r2.f()     // Catch:{ Exception -> 0x0023 }
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x002a }
            com.ss.android.message.h.d(r1)     // Catch:{ Exception -> 0x002a }
            goto L_0x002b
        L_0x002a:
            return
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.android.pushservice.RegistrationReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
