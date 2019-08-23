package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.crash.i.a;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static int f19498a = 11;

    /* renamed from: b  reason: collision with root package name */
    static int f19499b = 6;

    /* renamed from: c  reason: collision with root package name */
    static int f19500c = 8;

    /* renamed from: d  reason: collision with root package name */
    static int f19501d = 4;

    /* renamed from: e  reason: collision with root package name */
    static int f19502e = 7;

    /* renamed from: f  reason: collision with root package name */
    static int f19503f = 5;
    static int g = 13;
    static String h = "SIGSEGV";
    static String i = "SIGABRT";
    static String j = "SIGFPE";
    static String k = "SIGILL";
    static String l = "SIGBUS";
    static String m = "SIGTRAP";
    static String n = "SIGPIPE";

    public static void a(final Context context, final int i2) {
        try {
            AnonymousClass1 r0 = new Thread() {
                public final void run() {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    SharedPreferences sharedPreferences;
                    Object obj;
                    try {
                        Context context = context;
                        int i = i2;
                        Random random = new Random();
                        String d2 = a.d(context);
                        if (d2 == null || d2.equals("")) {
                            d2 = "unknownPROC:unknownSUB";
                        }
                        int lastIndexOf = d2.lastIndexOf(":");
                        if (lastIndexOf != -1) {
                            str = d2.substring(lastIndexOf + 1);
                        } else {
                            str = d2;
                        }
                        String str5 = "_" + d2;
                        String str6 = "_" + str;
                        String str7 = "_" + i;
                        int i2 = 7;
                        int[] iArr = {d.f19498a, d.f19499b, d.f19500c, d.f19501d, d.f19502e, d.f19503f, d.g};
                        String[] strArr = {d.h, d.i, d.j, d.k, d.l, d.m, d.n};
                        SharedPreferences a2 = c.a(context, "NativeCrashHandlerChecker" + str6, 0);
                        SharedPreferences.Editor edit = a2.edit();
                        Object obj2 = null;
                        if (!a2.getBoolean("installed_on_device", false) && MonitorUtils.getServiceNameSwitch("NativeCrashHandlerChecker")) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("installed_on_device" + str5, true);
                            MonitorUtils.monitorEvent("NativeCrashHandlerChecker", jSONObject, null, null);
                            edit.putBoolean("installed_on_device", true);
                            edit.apply();
                        }
                        long[] jArr = {100, 500, 1000, 5000, 10000, 20000, 30000, 60000, 120000, 300000, 600000, 1200000, 1800000};
                        int i3 = 0;
                        while (true) {
                            int i4 = 0;
                            while (i4 < i2) {
                                int i5 = iArr[i4];
                                String str8 = strArr[i4] + str7;
                                String str9 = str8 + "suspended";
                                Set<String> stringSet = a2.getStringSet(str8, new HashSet());
                                Set<String> stringSet2 = a2.getStringSet(str9, new HashSet());
                                if (!NativeCrashMonitor.f19488a) {
                                    str2 = "";
                                } else {
                                    str2 = NativeCrashMonitor.doGetSignalHandler(i5);
                                }
                                if (!stringSet.contains(str2) && !stringSet2.contains(str2)) {
                                    stringSet2.add(str2);
                                }
                                if (MonitorUtils.getServiceNameSwitch("NativeCrashHandlerChecker")) {
                                    for (String next : stringSet2) {
                                        SharedPreferences sharedPreferences2 = a2;
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(str8 + str5, next);
                                        MonitorUtils.monitorEvent("NativeCrashHandlerChecker", jSONObject2, null, null);
                                        stringSet.add(next);
                                        a2 = sharedPreferences2;
                                        str7 = str7;
                                        str5 = str5;
                                    }
                                    sharedPreferences = a2;
                                    str4 = str7;
                                    str3 = str5;
                                    obj = null;
                                    stringSet2.clear();
                                } else {
                                    sharedPreferences = a2;
                                    str4 = str7;
                                    str3 = str5;
                                    obj = null;
                                }
                                edit.putStringSet(str9, stringSet2);
                                edit.putStringSet(str8, stringSet);
                                edit.apply();
                                i4++;
                                obj2 = obj;
                                a2 = sharedPreferences;
                                str7 = str4;
                                str5 = str3;
                                i2 = 7;
                            }
                            SharedPreferences sharedPreferences3 = a2;
                            String str10 = str7;
                            String str11 = str5;
                            Object obj3 = obj2;
                            long j = 1800000;
                            if (i3 < 13) {
                                j = jArr[i3] + ((long) random.nextInt(com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f));
                                i3++;
                            }
                            SystemClock.sleep(j);
                            obj2 = obj3;
                            a2 = sharedPreferences3;
                            str7 = str10;
                            str5 = str11;
                            i2 = 7;
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            r0.setPriority(1);
            r0.start();
        } catch (Throwable unused) {
        }
    }
}
