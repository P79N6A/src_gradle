package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.List;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39829a = null;

    /* renamed from: b  reason: collision with root package name */
    public static ContentResolver f39830b = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f39831d = "u";

    /* renamed from: e  reason: collision with root package name */
    private static u f39832e;

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, String> f39833f;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f39834c;
    private String g;
    private String h;
    private String i;

    public final String c() {
        if (this.i == null) {
            this.i = "content://com.ss.android.ugc.aweme.helpers.sharedPref.MainSharedPrefProvider/";
        }
        return this.i;
    }

    private u() {
        HashMap<String, String> hashMap = new HashMap<>();
        f39833f = hashMap;
        hashMap.put("com.ss.android.ugc.aweme", "main_settings");
        f39833f.put("com.ss.android.ugc.aweme:remote", "remote_settings");
        f39833f.put("com.ss.android.ugc.aweme:nice_service", "service_settings");
        f39830b = k.a().getContentResolver();
    }

    public static synchronized u a() {
        synchronized (u.class) {
            if (PatchProxy.isSupport(new Object[0], null, f39829a, true, 32445, new Class[0], u.class)) {
                u uVar = (u) PatchProxy.accessDispatch(new Object[0], null, f39829a, true, 32445, new Class[0], u.class);
                return uVar;
            }
            if (f39832e == null) {
                f39832e = new u();
            }
            u uVar2 = f39832e;
            return uVar2;
        }
    }

    public synchronized SharedPreferences b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f39829a, false, 32470, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, f39829a, false, 32470, new Class[0], SharedPreferences.class);
        }
        if (this.h == null || this.h.length() == 0) {
            if (this.g == null || this.g.length() == 0) {
                if (PatchProxy.isSupport(new Object[0], null, f39829a, true, 32446, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], null, f39829a, true, 32446, new Class[0], String.class);
                } else {
                    ActivityManager activityManager = (ActivityManager) k.a().getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                    if (activityManager != null) {
                        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                        int myPid = Process.myPid();
                        if (runningAppProcesses != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= runningAppProcesses.size()) {
                                    break;
                                } else if (runningAppProcesses.get(i2).pid == myPid) {
                                    str = runningAppProcesses.get(i2).processName;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    str = "com.ss.android.ugc.aweme";
                }
                this.g = str;
            }
            if (f39833f.containsKey(this.g)) {
                this.h = f39833f.get(this.g);
            } else {
                this.h = "main_settings";
            }
        }
        return c.a(k.a(), this.h, 0);
    }

    public boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39829a, false, 32462, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f39829a, false, 32462, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null || str.length() == 0) {
            return false;
        } else {
            for (String equals : ae.f39677a) {
                if (str2.equals(equals)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final int a(String str, int i2) {
        String str2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{str, -1}, this, f39829a, false, 32451, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, -1}, this, f39829a, false, 32451, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (a(str)) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f39829a, false, 32463, new Class[]{String.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{str}, this, f39829a, false, 32463, new Class[]{String.class}, String.class);
            } else {
                Uri parse = Uri.parse(c() + str);
                if (PatchProxy.isSupport(new Object[]{parse}, this, f39829a, false, 32472, new Class[]{Uri.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{parse}, this, f39829a, false, 32472, new Class[]{Uri.class}, String.class);
                } else {
                    str2 = f39830b.getType(parse);
                }
            }
            if (str2 == null) {
                return -1;
            }
            try {
                i3 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            return i3;
        } else {
            this.f39834c = b();
            return this.f39834c.getInt(str, -1);
        }
    }
}
