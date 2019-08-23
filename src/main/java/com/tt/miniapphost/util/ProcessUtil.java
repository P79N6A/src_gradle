package com.tt.miniapphost.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.q.c;
import com.tt.miniapphost.ActivityContainer;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.MiniappHostStackBase;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.annotation.AnyProcess;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.callback.IpcCallbackManagerProxy;
import com.tt.miniapphost.process.data.CrossProcessInformation;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import java.lang.ref.WeakReference;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONException;
import org.json.JSONObject;

@AnyProcess
public class ProcessUtil {
    private static String sCurProcessName;

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

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    @AnyProcess
    public static String getProcessFlag() {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        String miniProcessFlag = getMiniProcessFlag(getCurProcessName(applicationContext));
        if (!TextUtils.isEmpty(miniProcessFlag) || !isMainProcess(applicationContext)) {
            return miniProcessFlag;
        }
        return "hostProcess";
    }

    @AnyProcess
    public static boolean isMiniAppRunningForeground() {
        try {
            if (getCurProcessName(AppbrandContext.getInst().getApplicationContext()).contains("miniapp")) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            AppBrandLogger.e("ProcessUtil", e2);
        }
    }

    @MiniAppProcess
    public static void killCurrentMiniAppProcess() {
        AppBrandLogger.d("ProcessUtil", "killCurrentMiniAppProcess");
        try {
            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
            _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(0);
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "ProcessUtil", e2.getStackTrace());
        }
    }

    @MiniAppProcess
    public static void finishMiniAppActivities() {
        AppBrandLogger.d("ProcessUtil", "finishActivities");
        for (WeakReference weakReference : ActivityContainer.getInst().getActivitys()) {
            MiniappHostBase miniappHostBase = (MiniappHostBase) weakReference.get();
            if (miniappHostBase != null) {
                if (miniappHostBase instanceof MiniappHostStackBase) {
                    AppBrandLogger.d("ProcessUtil", "finish Host Stack Activity");
                    miniappHostBase.finish();
                } else {
                    AppBrandLogger.d("ProcessUtil", "finishAndRemoveTask");
                    miniappHostBase.finishAndRemoveTask();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A[SYNTHETIC, Splitter:B:18:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[SYNTHETIC, Splitter:B:27:0x007b] */
    @com.tt.miniapphost.process.annotation.AnyProcess
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getCurProcessNameFromProc() {
        /*
            r0 = 0
            r1 = 6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r6 = "/proc/"
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            int r6 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            r5.append(r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r6 = "/cmdline"
            r5.append(r6)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.String r5 = "iso-8859-1"
            r3.<init>(r4, r5)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0078, all -> 0x0066 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r3.<init>()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
        L_0x002f:
            int r4 = r2.read()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            if (r4 <= 0) goto L_0x003a
            char r4 = (char) r4     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            goto L_0x002f
        L_0x003a:
            java.lang.String r4 = "Process"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r6 = 0
            java.lang.String r7 = "get processName = "
            r5[r6] = r7     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r6 = 1
            java.lang.String r7 = r3.toString()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r5[r6] = r7     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            com.tt.miniapphost.AppBrandLogger.d(r4, r5)     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0079, all -> 0x0061 }
            r2.close()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            java.lang.String r2 = "ProcessUtil"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r2, r0)
        L_0x0060:
            return r3
        L_0x0061:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
            goto L_0x0067
        L_0x0066:
            r2 = move-exception
        L_0x0067:
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ Exception -> 0x006d }
            goto L_0x0077
        L_0x006d:
            r0 = move-exception
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r3 = "ProcessUtil"
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r0)
        L_0x0077:
            throw r2
        L_0x0078:
            r2 = r0
        L_0x0079:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ Exception -> 0x007f }
            goto L_0x0089
        L_0x007f:
            r2 = move-exception
            java.lang.String r3 = "ProcessUtil"
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r1, r3, r2)
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapphost.util.ProcessUtil.getCurProcessNameFromProc():java.lang.String");
    }

    @AnyProcess
    public static boolean isMainProcess(Context context) {
        String curProcessName = getCurProcessName(context);
        if ((curProcessName == null || !curProcessName.contains(":")) && curProcessName != null && curProcessName.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    @Nullable
    @AnyProcess
    public static AsyncIpcHandler generateAsyncIpcHandlerFromBundle(@NonNull Bundle bundle) {
        String string = bundle.getString("ma_callerProcessIdentify");
        int i = bundle.getInt("ma_callbackId", 0);
        if (!TextUtils.isEmpty(string) && i != 0) {
            return new AsyncIpcHandler(new CrossProcessInformation.CallerProcess(string, i));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromBundle error. processIdentify: " + string + " callbackId: " + i);
        return null;
    }

    @Nullable
    @AnyProcess
    public static AsyncIpcHandler generateAsyncIpcHandlerFromIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("ma_callerProcessIdentify");
        int intExtra = intent.getIntExtra("ma_callbackId", 0);
        if (!TextUtils.isEmpty(stringExtra) && intExtra != 0) {
            return new AsyncIpcHandler(new CrossProcessInformation.CallerProcess(stringExtra, intExtra));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromIntent error. processIdentify: " + stringExtra + " callbackId: " + intExtra);
        return null;
    }

    @Nullable
    @AnyProcess
    public static AsyncIpcHandler generateAsyncIpcHandlerFromJSONObject(@NonNull JSONObject jSONObject) {
        String optString = jSONObject.optString("ma_callerProcessIdentify");
        int optInt = jSONObject.optInt("ma_callbackId", 0);
        if (!TextUtils.isEmpty(optString) && optInt != 0) {
            return new AsyncIpcHandler(new CrossProcessInformation.CallerProcess(optString, optInt));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromIntent error. processIdentify: " + optString + " callbackId: " + optInt);
        return null;
    }

    @Nullable
    @AnyProcess
    public static AsyncIpcHandler generateAsyncIpcHandlerFromUri(Uri uri) {
        int i;
        String queryParameter = uri.getQueryParameter("ma_callerProcessIdentify");
        try {
            i = Integer.valueOf(uri.getQueryParameter("ma_callbackId")).intValue();
        } catch (Exception e2) {
            AppBrandLogger.e("ProcessUtil", "generateAsyncIpcHandlerFromUri", e2);
            i = 0;
        }
        if (!TextUtils.isEmpty(queryParameter) && i != 0) {
            return new AsyncIpcHandler(new CrossProcessInformation.CallerProcess(queryParameter, i));
        }
        DebugUtil.outputError("ProcessUtil", "generateAsyncIpcHandlerFromIntent error. processIdentify: " + queryParameter + " callbackId: " + i);
        return null;
    }

    @AnyProcess
    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    AppBrandLogger.d("Process", "processName = ", next.processName);
                    String str2 = next.processName;
                    sCurProcessName = str2;
                    return str2;
                }
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, "ProcessUtil", e2.getStackTrace());
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }

    public static String getMiniProcessFlag(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.endsWith(HostDependManager.getInst().replaceProcessName(":miniapp0"))) {
            return "miniapp0";
        }
        if (str.endsWith(HostDependManager.getInst().replaceProcessName(":miniapp1"))) {
            return "miniapp1";
        }
        if (str.endsWith(HostDependManager.getInst().replaceProcessName(":miniapp2"))) {
            return "miniapp2";
        }
        if (str.endsWith(HostDependManager.getInst().replaceProcessName(":miniapp3"))) {
            return "miniapp3";
        }
        if (str.endsWith(HostDependManager.getInst().replaceProcessName(":miniapp4"))) {
            return "miniapp4";
        }
        return "";
    }

    @AnyProcess
    public static void fillCrossProcessCallbackIntent(@NonNull Intent intent, @NonNull IpcCallback ipcCallback) {
        IpcCallbackManagerProxy.getInstance().registerIpcCallback(ipcCallback);
        intent.putExtra("ma_callerProcessIdentify", getProcessFlag());
        intent.putExtra("ma_callbackId", ipcCallback.getCallbackId());
    }

    @AnyProcess
    public static void fillCrossProcessCallbackUri(@NonNull Uri.Builder builder, @NonNull IpcCallback ipcCallback) {
        IpcCallbackManagerProxy.getInstance().registerIpcCallback(ipcCallback);
        builder.appendQueryParameter("ma_callerProcessIdentify", getProcessFlag());
        builder.appendQueryParameter("ma_callbackId", String.valueOf(ipcCallback.getCallbackId()));
    }

    public static void transferAsyncIpcHandlerInIntent(@NonNull AsyncIpcHandler asyncIpcHandler, @NonNull Intent intent) {
        CrossProcessInformation.CallerProcess callerProcess = asyncIpcHandler.getCallerProcess();
        if (callerProcess != null) {
            intent.putExtra("ma_callerProcessIdentify", callerProcess.getCallerProcessIdentify());
            intent.putExtra("ma_callbackId", callerProcess.getCallerProcessCallbackId());
        }
    }

    @AnyProcess
    public static void fillCrossProcessCallbackJSONObject(@NonNull JSONObject jSONObject, @NonNull IpcCallback ipcCallback) {
        IpcCallbackManagerProxy.getInstance().registerIpcCallback(ipcCallback);
        try {
            jSONObject.put("ma_callerProcessIdentify", getProcessFlag());
            jSONObject.put("ma_callbackId", ipcCallback.getCallbackId());
        } catch (JSONException e2) {
            AppBrandLogger.e("ProcessUtil", "fillCrossProcessCallbackInformation fail", e2);
        }
    }

    public static void transferAsyncIpcHandlerInJSONObject(@NonNull AsyncIpcHandler asyncIpcHandler, @NonNull JSONObject jSONObject) {
        CrossProcessInformation.CallerProcess callerProcess = asyncIpcHandler.getCallerProcess();
        if (callerProcess != null) {
            try {
                jSONObject.put("ma_callerProcessIdentify", callerProcess.getCallerProcessIdentify());
                jSONObject.put("ma_callbackId", callerProcess.getCallerProcessCallbackId());
            } catch (JSONException e2) {
                AppBrandLogger.e("ProcessUtil", "transferAsyncIpcHandlerInJSONObject fail", e2);
            }
        }
    }

    public static boolean jumpLittleApp(@NonNull Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String string = c.a(AppbrandContext.getInst().getApplicationContext(), "appLaunchClassFlag", 0).getString(str.trim(), "");
            AppBrandLogger.d("ProcessUtil", "littleAppClassName ", string);
            if (!TextUtils.isEmpty(string)) {
                Intent intent = new Intent();
                intent.setClassName(context, string);
                intent.setFlags(131072);
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            }
        }
        return false;
    }
}
