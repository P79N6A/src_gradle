package com.bytedance.apm.a.c;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static String f18883a;

    @Nullable
    private static String a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        a.a(bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable th) {
                BufferedReader bufferedReader3 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader3;
                a.a(bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a.a(bufferedReader2);
            throw th;
        }
    }

    @Nullable
    public static String a(Context context) {
        String str = f18883a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        String str2 = next.processName;
                        f18883a = str2;
                        return str2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a2 = a();
        f18883a = a2;
        if (a2 == null) {
            return "";
        }
        return f18883a;
    }
}
