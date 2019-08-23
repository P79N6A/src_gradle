package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.services.IAVService;
import com.tencent.bugly.crashreport.CrashReport;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class BuglyTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55243, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55243, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("BuglyTask");
        if (!com.ss.android.ugc.aweme.g.a.a() && !com.ss.android.g.a.b()) {
            if (!com.ss.android.g.a.a()) {
                String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
                if (!TextUtils.isEmpty(str) && !str.startsWith("gray_")) {
                    return;
                }
            }
            CrashReport.UserStrategy userStrategy = new CrashReport.UserStrategy(k.a());
            userStrategy.setUploadProcess(true);
            userStrategy.setDeviceID(AppLog.getServerDeviceId());
            CrashReport.initCrashReport(k.a(), "ff33feb715", com.ss.android.ugc.aweme.g.a.a());
            try {
                IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
                HashMap hashMap = new HashMap();
                hashMap.put("git_sha", "70269d3c718");
                hashMap.put("git_branch", "HEAD");
                hashMap.put("process", ToolUtils.getCurProcessName(k.a()));
                hashMap.put("ABI", System.getProperty("os.arch"));
                hashMap.put("veSdk", iAVService.getVESDKVersion());
                hashMap.put("effectSdk", iAVService.getEffectSDKVersion());
                hashMap.put("device_id", AppLog.getServerDeviceId());
                hashMap.put("channel", i.a().getChannel());
                if (!TextUtils.isEmpty(d.a().getCurUserId())) {
                    hashMap.put("userid", d.a().getCurUserId());
                    if (d.a().getCurUser() != null) {
                        hashMap.put("nickname", d.a().getCurUser().getNickname());
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    CrashReport.putUserData(k.a(), (String) entry.getKey(), (String) entry.getValue());
                }
                CrashReport.setUserId(AppLog.getServerDeviceId());
            } catch (Exception e2) {
                if (com.ss.android.ugc.aweme.g.a.a()) {
                    throw e2;
                }
            }
        }
    }
}
