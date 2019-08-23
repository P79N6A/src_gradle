package com.tt.miniapphost;

import android.support.annotation.Nullable;
import com.tt.miniapphost.dynamic.IBundleManager;
import com.tt.miniapphost.dynamic.IProcessManager;
import com.tt.miniapphost.dynamic.IStorageManager;

public class AppbrandHostConstants {
    public static IBundleManager iBundleManager;
    public static IProcessManager iProcessManager;
    public static IStorageManager iStorageManager;

    public static class ActivityLifeCycle {
    }

    public static class ApiResult {
    }

    public static class DependClazz {
    }

    public static class DownloadOperateType {
    }

    public static class DownloadStatus {
    }

    public static class Event_Param {
    }

    public static class GamePayType {
    }

    public static class Global_Data {
    }

    public static class HostControl {
    }

    public static class MicroAppCloseReason {
    }

    public static class MiniAppLifecycle {
    }

    public static class Mirco_Type {
    }

    public static class OpenApi {
    }

    public static class RequestCode {
    }

    public static class ResultCode {
    }

    public static class Schema_Host {
    }

    public static class Schema_Meta {
    }

    public static class SharePreferences {
    }

    public static IBundleManager getBundleManager() {
        if (iBundleManager == null) {
            iBundleManager = new BundleManager();
        }
        return iBundleManager;
    }

    public static IStorageManager getStorageManager() {
        if (iStorageManager == null) {
            iStorageManager = new StorageManager();
        }
        return iStorageManager;
    }

    @Nullable
    public static IProcessManager getProcessManager() {
        if (iProcessManager == null || (iProcessManager instanceof ProcessBaseManager)) {
            try {
                Class<?> cls = Class.forName("com.tt.miniapp.manager.AppProcessManager");
                if (cls != null) {
                    iProcessManager = (IProcessManager) cls.newInstance();
                } else if (iProcessManager == null) {
                    iProcessManager = new ProcessBaseManager();
                }
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "getProcessManager", e2.getStackTrace());
            }
        }
        return iProcessManager;
    }
}
