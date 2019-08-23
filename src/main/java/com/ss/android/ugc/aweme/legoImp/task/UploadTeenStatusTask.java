package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class UploadTeenStatusTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55326, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55326, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("UploadTeenStatusTask");
        TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
        if (userSetting != null) {
            if (userSetting.isTimeLockOn()) {
                str = "on";
            } else {
                str = "off";
            }
            if (userSetting.isContentFilterOn()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            r.a("time_lock_status", (Map) d.a().a("status", str).f34114b);
            r.a("teen_mode_status", (Map) d.a().a("status", str2).f34114b);
        }
    }
}
