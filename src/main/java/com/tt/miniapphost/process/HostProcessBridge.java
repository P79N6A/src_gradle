package com.tt.miniapphost.process;

import android.app.Activity;
import android.os.Looper;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.storage.async.Action;
import com.storage.async.Observable;
import com.storage.async.Scheduler;
import com.storage.async.Schedulers;
import com.storage.async.Subscriber;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.ParamManager;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

public class HostProcessBridge {
    @Nullable
    @WorkerThread
    @MiniAppProcess
    public static CrossProcessDataEntity getUserInfo() {
        return ProcessCallControlBridge.callHostProcessSync("getUserInfo", null);
    }

    @Nullable
    @WorkerThread
    @MiniAppProcess
    public static String getLoginCookie() {
        CrossProcessDataEntity callHostProcessSync = ProcessCallControlBridge.callHostProcessSync("getLoginCookie", null);
        if (callHostProcessSync != null) {
            return callHostProcessSync.getString("loginCookie");
        }
        return null;
    }

    @Nullable
    @WorkerThread
    @MiniAppProcess
    public static JSONObject getNetCommonParams() {
        CrossProcessDataEntity callHostProcessSync = ProcessCallControlBridge.callHostProcessSync("getNetCommonParams", null);
        if (callHostProcessSync != null) {
            return callHostProcessSync.getJSONObject("netCommonParams");
        }
        return null;
    }

    @WorkerThread
    @MiniAppProcess
    public static boolean isReportPerformance() {
        CrossProcessDataEntity callHostProcessSync = ProcessCallControlBridge.callHostProcessSync("reportPerformanceEnable", null);
        if (callHostProcessSync != null) {
            return callHostProcessSync.getBoolean("reportPerformance");
        }
        return false;
    }

    @AnyThread
    @MiniAppProcess
    public static boolean isDataHandlerExist(String str) {
        return AppbrandContext.getInst().isDataHandlerExist(str);
    }

    @AnyThread
    @MiniAppProcess
    public static void callHostLifecycleAction(@NonNull final Activity activity, @NonNull final String str) {
        runOnWorkThread(new Action() {
            public final void act() {
                String str;
                if (activity.getComponentName() != null) {
                    str = activity.getComponentName().getClassName();
                } else {
                    str = null;
                }
                CrossProcessDataEntity build = CrossProcessDataEntity.Builder.create().put("activityLifecycle", str).put("activityName", str).put("hashcode", Integer.valueOf(activity.hashCode())).build();
                AppBrandLogger.d("HostProcessBridge", "callHostLifecycleAction ", build);
                ProcessCallControlBridge.callHostProcessSync("tmaLifecycle", build);
            }
        }, Schedulers.shortIO());
    }

    @AnyThread
    @MiniAppProcess
    public static void logEvent(final String str, final JSONObject jSONObject) {
        runOnWorkThread(new Action() {
            public final void act() {
                ProcessCallControlBridge.callHostProcessSync("actionLog", CrossProcessDataEntity.Builder.create().put("logEventName", str).put("logEventData", jSONObject).build());
            }
        }, Schedulers.shortIO());
    }

    @Nullable
    @WorkerThread
    @MiniAppProcess
    public static CrossProcessDataEntity hostActionSync(@NonNull String str, @Nullable CrossProcessDataEntity crossProcessDataEntity) {
        return ProcessCallControlBridge.callHostProcessSync("hostActionSync", CrossProcessDataEntity.Builder.create().put("hostActionType", str).putCrossProcessDataEntity("hostActionData", crossProcessDataEntity).build());
    }

    private static void runOnWorkThread(@NonNull Action action, @NonNull Scheduler scheduler) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Observable.create(action).schudleOn(scheduler).subscribe(new Subscriber() {
                public final void onSuccess() {
                }

                public final void onSuccess(@Nullable Object obj) {
                }

                public final void onError(@NonNull Throwable th) {
                    AppBrandLogger.eWithThrowable("HostProcessBridge", "runOnWorkThread", th);
                }
            });
        } else {
            action.act();
        }
    }

    @AnyThread
    @MiniAppProcess
    public static void onMiniAppStart(AppInfoEntity appInfoEntity, boolean z, @Nullable Integer num) {
        onMiniAppLifeCycleChange("open", appInfoEntity, z, num, null);
    }

    @AnyThread
    @MiniAppProcess
    public static void operateDownload(@Nullable String str, @NonNull String str2, @Nullable IpcCallback ipcCallback) {
        operateDownload(str, str2, null, null, ipcCallback);
    }

    @AnyThread
    @MiniAppProcess
    public static void mpMonitor(@NonNull final String str, @NonNull final String str2, @Nullable final JSONObject jSONObject) {
        runOnWorkThread(new Action() {
            public final void act() {
                ProcessCallControlBridge.callHostProcessSync("appBrandMonitor", CrossProcessDataEntity.Builder.create().put("mpMonitorServiceName", str).put("mpMonitorStatusCode", str2).put("mpMonitorData", ParamManager.getCommonParams(jSONObject, AppbrandApplication.getInst().getAppInfo())).build());
            }
        }, Schedulers.shortIO());
    }

    @AnyThread
    @MiniAppProcess
    public static void hostActionAsync(@NonNull String str, @Nullable CrossProcessDataEntity crossProcessDataEntity, @Nullable IpcCallback ipcCallback) {
        ProcessCallControlBridge.callHostProcessAsync("hostActionAsync", CrossProcessDataEntity.Builder.create().put("hostActionType", str).putCrossProcessDataEntity("hostActionData", crossProcessDataEntity).build(), ipcCallback);
    }

    @AnyThread
    @MiniAppProcess
    public static void uploadFeedback(@NonNull String str, @NonNull JSONObject jSONObject, @NonNull IpcCallback ipcCallback) {
        ProcessCallControlBridge.callHostProcessAsync("uploadFeedback", CrossProcessDataEntity.Builder.create().put("feedbackLogType", str).put("feedbackPath", jSONObject).build(), ipcCallback);
    }

    @AnyThread
    @MiniAppProcess
    public static void handleUserRelation(String str, String str2, IpcCallback ipcCallback) {
        CrossProcessDataEntity build = CrossProcessDataEntity.Builder.create().put("apiData", str).put("ttId", str2).build();
        AppBrandLogger.d("HostProcessBridge", "handleUserRelation", build);
        ProcessCallControlBridge.callHostProcessAsync("handleUserRelation", build, ipcCallback);
    }

    @AnyThread
    @MiniAppProcess
    public static void onMiniAppStop(AppInfoEntity appInfoEntity, boolean z, @Nullable Integer num, String str) {
        onMiniAppLifeCycleChange("close", appInfoEntity, z, num, str);
    }

    @AnyThread
    @MiniAppProcess
    private static void onMiniAppLifeCycleChange(String str, AppInfoEntity appInfoEntity, boolean z, @Nullable Integer num, String str2) {
        if (appInfoEntity == null) {
            AppBrandLogger.e("HostProcessBridge", "onMiniAppLifeCycleChange appInfo == null");
            return;
        }
        final String str3 = str;
        final boolean z2 = z;
        final AppInfoEntity appInfoEntity2 = appInfoEntity;
        final Integer num2 = num;
        final String str4 = str2;
        AnonymousClass4 r0 = new Action() {
            public final void act() {
                CrossProcessDataEntity build = CrossProcessDataEntity.Builder.create().put("miniAppLifecycle", str3).put("isGame", Boolean.valueOf(z2)).put("miniAppId", appInfoEntity2.appId).put("miniAppIcon", appInfoEntity2.icon).put("miniAppName", appInfoEntity2.appName).put("miniAppType", Integer.valueOf(appInfoEntity2.type)).put("miniAppLaunchFrom", appInfoEntity2.launchFrom).put("miniAppScene", appInfoEntity2.scene).put("miniAppSubScene", appInfoEntity2.subScene).put("shareTicket", appInfoEntity2.shareTicket).put("ttId", appInfoEntity2.ttId).put("miniAppOrientation", num2).put("miniAppStopReason", str4).build();
                AppBrandLogger.d("HostProcessBridge", "onMiniAppLifeCycleChange ", build);
                ProcessCallControlBridge.callHostProcessSync("miniAppLifecycle", build);
            }
        };
        runOnWorkThread(r0, Schedulers.shortIO());
    }

    @AnyThread
    @MiniAppProcess
    public static void operateDownload(@Nullable String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable IpcCallback ipcCallback) {
        ProcessCallControlBridge.callHostProcessAsync("IDownload", CrossProcessDataEntity.Builder.create().put("downloadUrl", str).put("downloadOperateType", str2).put("packageName", str4).put("appName", str3).build(), ipcCallback);
    }
}
