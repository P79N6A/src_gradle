package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;

public class SharePreferencePreloadTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public f type() {
        return f.BACKGROUND;
    }

    @MeasureFunction
    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55307, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55307, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("SharePreferencePreloadTask");
        preloadSharedPreferences(context, "live_plugin_enable", 0);
        preloadSharedPreferences(context, "splash_ad_sp", 0);
        preloadSharedPreferences(context, "awesome_splash", 0);
        preloadSharedPreferences(context, "default_config", 0);
        preloadSharedPreferences(context, "applog_stats", 0);
        preloadSharedPreferences(context, "custom_channels", 0);
        preloadSharedPreferences(context, "aweme-app", 0);
        preloadSharedPreferences(context, "KEY_NEED_UPLOAD_LAUNCHLOG", 0);
        preloadSharedPreferences(context, "aweme_user", 0);
        preloadSharedPreferences(context, "com.ss.spipe_setting", 0);
        preloadSharedPreferences(context, "av_ab.xml", 0);
        preloadSharedPreferences(context, "av_settings.xml", 0);
        preloadSharedPreferences(context, "x2c_error", 0);
        preloadSharedPreferences(context, "guide", 0);
        preloadSharedPreferences(context, "ai_music", 0);
        preloadSharedPreferences(context, "local_ab_test_config", 0);
        preloadSharedPreferences(context, "MainTabPreferences", 0);
        preloadSharedPreferences(context, "is_go_profile", 0);
        preloadSharedPreferences(context, "enable_douyidou_and_shake", 0);
        preloadSharedPreferences(context, "red_point_count", 0);
        preloadSharedPreferences(context, "search", 0);
        preloadSharedPreferences(context, "share_theme_data", 0);
        preloadSharedPreferences(context, "aweme_local_video", 0);
        preloadSharedPreferences(context, "live-app-core-sdk", 0);
        preloadSharedPreferences(context, "is_upload_pre_info", 0);
        preloadSharedPreferences(context, "aweme-userupdate-hooker", 0);
    }

    private void preloadKeva(Context context, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55308, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55308, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Keva.getRepoFromSp(context, str, i);
    }

    private void preloadSharedPreferences(Context context, String str, int i) {
        if (PatchProxy.isSupport(new Object[]{context, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55309, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 55309, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c.a(context, str, i).getAll();
    }
}
