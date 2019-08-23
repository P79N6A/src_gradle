package com.umeng.commonsdk;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.b;
import com.umeng.commonsdk.statistics.common.ULog;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f80732a;

    public static synchronized void a(final Context context) {
        synchronized (a.class) {
            if (context != null) {
                try {
                    if (!f80732a) {
                        new Thread(new Runnable() {
                            public final void run() {
                                try {
                                    String currentProcessName = UMFrUtils.getCurrentProcessName(context);
                                    String packageName = context.getPackageName();
                                    if (!TextUtils.isEmpty(currentProcessName) && !TextUtils.isEmpty(packageName) && currentProcessName.equals(packageName)) {
                                        try {
                                            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                                                UMWorkDispatch.sendEvent(context, 32777, b.a(context).a(), null);
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                            }
                        }).start();
                        f80732a = true;
                    }
                } catch (Throwable th) {
                    ULog.e("internal", "e is " + th.getMessage());
                }
            }
        }
    }
}
