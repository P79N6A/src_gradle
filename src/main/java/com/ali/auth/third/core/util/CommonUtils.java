package com.ali.auth.third.core.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.text.format.Formatter;
import com.ali.auth.third.core.broadcast.LoginAction;
import com.ali.auth.third.core.callback.FailureCallback;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.message.Message;
import com.ali.auth.third.core.model.ResultCode;
import com.ali.auth.third.core.task.InitWaitTask;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

public class CommonUtils {

    /* renamed from: a  reason: collision with root package name */
    private static String f4985a = "\\u";

    /* renamed from: b  reason: collision with root package name */
    private static String f4986b;
    public static String mAppLabel;
    public static String mAppVersion;

    public static String getAndroidAppVersion() {
        return "android_" + getAppVersion();
    }

    public static String getAndroidId() {
        return Settings.Secure.getString(KernelContext.getApplicationContext().getContentResolver(), "android_id");
    }

    public static String getAppLabel() {
        if (mAppLabel == null) {
            try {
                PackageManager packageManager = KernelContext.getApplicationContext().getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(KernelContext.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    mAppVersion = packageInfo.versionName;
                    mAppLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                }
            } catch (Throwable unused) {
            }
        }
        return mAppLabel;
    }

    public static String getAppVersion() {
        if (mAppVersion == null) {
            try {
                PackageManager packageManager = KernelContext.getApplicationContext().getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(KernelContext.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    mAppVersion = packageInfo.versionName;
                    mAppLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                }
            } catch (PackageManager.NameNotFoundException | Exception unused) {
            }
        }
        return mAppVersion;
    }

    public static String getAvailMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) KernelContext.getApplicationContext().getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
        return Formatter.formatFileSize(KernelContext.getApplicationContext(), memoryInfo.availMem);
    }

    public static String getCurrentProcessName() {
        if (KernelContext.context == null) {
            return null;
        }
        if (f4986b != null) {
            return f4986b;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) KernelContext.context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return null;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.pid == myPid) {
                    f4986b = next.processName;
                    return next.processName;
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public static String getHashString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Integer.toHexString((b2 >> 4) & 15));
            sb.append(Integer.toHexString(b2 & 15));
        }
        return sb.toString();
    }

    public static String getLocalIPAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            return nextElement.getHostAddress().toString();
                        }
                    }
                }
            }
        } catch (SocketException unused) {
        }
        return null;
    }

    public static String getSDCardSize() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return Formatter.formatFileSize(KernelContext.getApplicationContext(), ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()));
    }

    public static String getSystemSize() {
        StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
        return Formatter.formatFileSize(KernelContext.getApplicationContext(), ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount()));
    }

    public static String getTotalMemory() {
        long j;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            j = (long) Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue();
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            j = 0;
        }
        return j + " KB";
    }

    public static int isApplicationDefaultProcess() {
        if (KernelContext.context == null) {
            return -1;
        }
        String currentProcessName = getCurrentProcessName();
        if (currentProcessName == null) {
            return -1;
        }
        return currentProcessName.equals(KernelContext.context.getPackageName()) ? 1 : 0;
    }

    public static boolean isNetworkAvailable() {
        if (KernelContext.context == null) {
            return true;
        }
        return isNetworkAvailable(KernelContext.context);
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        boolean z = false;
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        int length = allNetworkInfo.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            NetworkInfo networkInfo = allNetworkInfo[i];
            if (networkInfo == null || !(networkInfo.getState() == NetworkInfo.State.CONNECTED || networkInfo.getState() == NetworkInfo.State.CONNECTING)) {
                i++;
            }
        }
        z = true;
        return z;
    }

    public static void onFailure(FailureCallback failureCallback, int i, String str) {
        KernelContext.executorService.postUITask(new c(failureCallback, i, str));
    }

    public static void onFailure(FailureCallback failureCallback, Message message) {
        KernelContext.executorService.postUITask(new a(failureCallback, message));
    }

    public static void onFailure(FailureCallback failureCallback, ResultCode resultCode) {
        KernelContext.executorService.postUITask(new b(failureCallback, resultCode));
    }

    public static void sendBroadcast(LoginAction loginAction) {
        Intent intent = new Intent();
        intent.setAction(loginAction.name());
        intent.setPackage(KernelContext.getApplicationContext().getPackageName());
        KernelContext.getApplicationContext().sendBroadcast(intent);
    }

    public static void startInitWaitTask(Activity activity, FailureCallback failureCallback, Runnable runnable, String str) {
        new InitWaitTask(activity, failureCallback, runnable, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static String toString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        a.a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void toast(String str) {
        KernelContext.executorService.postUITask(new d(str));
    }

    public static void toastSystemException() {
        toast("com_taobao_tae_sdk_system_exception");
    }
}
