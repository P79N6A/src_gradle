package com.ss.android.ugc.aweme.legoImp.task;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.j.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.q.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class SetAppTrackTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55302, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55302, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("SetAppTrackTask");
        setAppTrack(context);
    }

    @TargetApi(9)
    @RequiresApi(api = 8)
    private static void setAppTrack(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 55303, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 55303, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        try {
            String a2 = b.a(context.getPackageCodePath());
            if (!TextUtils.isEmpty(a2)) {
                AppLog.setAppTrack(new JSONObject(a2));
                SharedPreferences.Editor edit = c.a(context2, "applog_stats", 0).edit();
                edit.putString("app_track", a2);
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }
}
