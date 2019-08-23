package com.tt.miniapphost;

import android.content.Context;
import com.tt.miniapphost.entity.PreLoadAppEntity;
import com.tt.miniapphost.entity.PreloadExtSrcEntity;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.HostProcess;
import java.util.List;

public class MiniappOpenTool {
    private static AppbrandOpener sAppbrandOpener;

    public interface AppbrandOpener {
        @AnyProcess
        void openAppbrand(Context context, String str);

        @AnyProcess
        void openAppbrand(Context context, String str, boolean z);

        @AnyProcess
        void openAppbrand(Context context, String str, boolean z, boolean z2);

        @HostProcess
        void preloadMiniApp(List<PreLoadAppEntity> list, List<PreloadExtSrcEntity> list2);
    }

    @AnyProcess
    static void inject() {
        if (sAppbrandOpener == null) {
            try {
                Class<?> cls = Class.forName("com.tt.miniapp.AppbrandOpenImpl");
                if (cls != null) {
                    sAppbrandOpener = (AppbrandOpener) cls.newInstance();
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "MiniappOpenTool", e2.getStackTrace());
            }
        }
    }

    @AnyProcess
    public static void openAppbrand(Context context, String str) {
        inject();
        if (sAppbrandOpener != null) {
            sAppbrandOpener.openAppbrand(context, str);
        }
    }

    @HostProcess
    public static void preloadMiniApp(List<PreLoadAppEntity> list, List<PreloadExtSrcEntity> list2) {
        inject();
        if (sAppbrandOpener != null) {
            sAppbrandOpener.preloadMiniApp(list, list2);
        }
    }

    @AnyProcess
    public static void openAppbrand(Context context, String str, Boolean bool) {
        inject();
        if (sAppbrandOpener != null) {
            sAppbrandOpener.openAppbrand(context, str, bool.booleanValue());
        }
    }

    @AnyProcess
    public static void openAppbrand(Context context, String str, boolean z, boolean z2) {
        inject();
        if (sAppbrandOpener != null) {
            sAppbrandOpener.openAppbrand(context, str, z, z2);
        }
    }
}
