package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.q.c;
import org.jetbrains.annotations.NotNull;

public class SharePreferencePreloadForAllProcessTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55305, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55305, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("SharePreferencePreloadForAllProcessTask");
        preloadSharedPreferences(context, "app_setting", 0);
        preloadSharedPreferences(context, "use_https", 0);
        preloadSharedPreferences(context, "update_params", 0);
        preloadSharedPreferences(context, "is_allow_oppo_push", 0);
        preloadSharedPreferences(context, "push_setting", 0);
        preloadSharedPreferences(context, "push_multi_process_config", 4);
        preloadSharedPreferences(context, "applog_stats", 0);
    }

    private void preloadSharedPreferences(Context context, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55306, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55306, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c.a(context, str, i).getAll();
    }
}
