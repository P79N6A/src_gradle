package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.aj;
import com.xiaomi.push.at;
import com.xiaomi.push.az;
import com.xiaomi.push.ip;
import com.xiaomi.push.s;
import com.xiaomi.push.service.ag;
import java.lang.Thread;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class x implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f81810a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static final String[] f136a = {"com.xiaomi.channel.commonutils", "com.xiaomi.common.logger", "com.xiaomi.measite.smack", "com.xiaomi.metoknlp", "com.xiaomi.mipush.sdk", "com.xiaomi.network", "com.xiaomi.push", "com.xiaomi.slim", "com.xiaomi.smack", "com.xiaomi.stats", "com.xiaomi.tinyData", "com.xiaomi.xmpush.thrift", "com.xiaomi.clientreport"};

    /* renamed from: a  reason: collision with other field name */
    private Context f137a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f138a;

    /* renamed from: a  reason: collision with other field name */
    private Thread.UncaughtExceptionHandler f139a;

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

    public x(Context context) {
        this(context, Thread.getDefaultUncaughtExceptionHandler());
    }

    public x(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f137a = context;
        this.f139a = uncaughtExceptionHandler;
    }

    private String a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(3, stackTrace.length); i++) {
            sb.append(stackTrace[i].toString() + "\r\n");
        }
        String sb2 = sb.toString();
        return TextUtils.isEmpty(sb2) ? "" : az.a(sb2);
    }

    private void a() {
        aj.a(this.f137a).a((Runnable) new y(this));
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m78a(Throwable th) {
        String b2 = b(th);
        if (!TextUtils.isEmpty(b2)) {
            String a2 = a(th);
            if (!TextUtils.isEmpty(a2)) {
                u.a(this.f137a).a(b2, a2);
                if (a()) {
                    a();
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m79a() {
        this.f138a = c.a(this.f137a, "mipush_extra", 4);
        if (at.e(this.f137a)) {
            if (!ag.a(this.f137a).a(ip.Crash4GUploadSwitch.a(), true)) {
                return false;
            }
            if (((float) Math.abs((System.currentTimeMillis() / 1000) - this.f138a.getLong("last_crash_upload_time_stamp", 0))) < ((float) Math.max(3600, ag.a(this.f137a).a(ip.Crash4GUploadFrequency.a(), 3600))) * 0.9f) {
                return false;
            }
        } else if (at.d(this.f137a)) {
            if (Math.abs((System.currentTimeMillis() / 1000) - this.f138a.getLong("last_crash_upload_time_stamp", 0)) < ((long) Math.max(60, ag.a(this.f137a).a(ip.CrashWIFIUploadFrequency.a(), 1800)))) {
                return false;
            }
        }
        return true;
    }

    private boolean a(boolean z, String str) {
        for (String contains : f136a) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return z;
    }

    private String b(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder(th.toString());
        sb.append("\r\n");
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            String stackTraceElement2 = stackTraceElement.toString();
            z = a(z, stackTraceElement2);
            sb.append(stackTraceElement2);
            sb.append("\r\n");
        }
        return z ? sb.toString() : "";
    }

    private void b() {
        this.f138a = c.a(this.f137a, "mipush_extra", 4);
        SharedPreferences.Editor edit = this.f138a.edit();
        edit.putLong("last_crash_upload_time_stamp", System.currentTimeMillis() / 1000);
        s.a(edit);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        synchronized (f81810a) {
            try {
                f81810a.wait(3000);
            } catch (InterruptedException e2) {
                b.a((Throwable) e2);
            }
        }
        if (this.f139a != null) {
            this.f139a.uncaughtException(thread, th);
            return;
        }
        _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
        _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(1);
    }
}
