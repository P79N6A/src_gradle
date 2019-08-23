package com.tt.miniapphost;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.tt.miniapphost.log.MiniProcessMonitorStub;
import com.tt.miniapphost.preload.PreloadManager;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.util.ProcessUtil;
import java.io.File;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

@MiniAppProcess
public class MiniappHostService extends Service {

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                System.exit(i);
                return;
            }
            throw new RuntimeException("Process killed, status is " + i);
        }
    }

    public void onCreate() {
        super.onCreate();
        PreloadManager.getInst().preloadWebViewOnProcessInit();
        AppBrandLogger.d("MiniappHostService", "onCreate preload WebView");
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        String processCommunicationPermission = AppbrandContext.getInst().getProcessCommunicationPermission();
        if (TextUtils.isEmpty(processCommunicationPermission) || checkCallingOrSelfPermission(processCommunicationPermission) != -1) {
            return new MiniProcessMonitorStub().asBinder();
        }
        AppBrandLogger.e("MiniappHostService", "do not have processCommunicationPermission");
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        AppBrandLogger.d("MiniappHostService", "onStartCommand: ", intent, " flags: ", Integer.valueOf(i), " startId: ", Integer.valueOf(i2));
        if (intent != null) {
            String stringExtra = intent.getStringExtra("command");
            AppBrandLogger.d("MiniappHostService", "onStartCommand command ", stringExtra);
            if (!TextUtils.isEmpty(stringExtra)) {
                char c2 = 65535;
                int hashCode = stringExtra.hashCode();
                if (hashCode != -1946785984) {
                    if (hashCode != -1508200356) {
                        if (hashCode != -410224827) {
                            if (hashCode == -248532251 && stringExtra.equals("stopForeground")) {
                                c2 = 3;
                            }
                        } else if (stringExtra.equals("startForeground")) {
                            c2 = 2;
                        }
                    } else if (stringExtra.equals("finishSticky")) {
                        c2 = 1;
                    }
                } else if (stringExtra.equals("finishActivityAndService")) {
                    c2 = 0;
                }
                switch (c2) {
                    case 0:
                        String stringExtra2 = intent.getStringExtra("processName");
                        ProcessUtil.finishMiniAppActivities();
                        File file = new File(getFilesDir(), stringExtra2);
                        if (file.exists()) {
                            file.delete();
                        }
                        stopSelf();
                        try {
                            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(0);
                            break;
                        } catch (Exception e2) {
                            AppBrandLogger.stacktrace(6, "MiniappHostService", e2.getStackTrace());
                            break;
                        }
                    case 2:
                        int intExtra = intent.getIntExtra("foregroundNotificationId", 0);
                        if (intExtra != 0) {
                            startForeground(intExtra, (Notification) intent.getParcelableExtra("foregroundNotification"));
                            break;
                        }
                        break;
                    case 3:
                        stopForeground(true);
                        break;
                }
                return 2;
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
