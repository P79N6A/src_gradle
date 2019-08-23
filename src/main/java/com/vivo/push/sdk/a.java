package com.vivo.push.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.vivo.push.aa;
import com.vivo.push.util.o;
import java.lang.reflect.Method;
import java.util.List;

public final class a extends aa {

    /* renamed from: b  reason: collision with root package name */
    private static a f81639b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f81640c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private String f81641d;

    public final void b() {
        this.f81641d = null;
    }

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f81639b == null) {
                f81639b = new a();
            }
            aVar = f81639b;
        }
        return aVar;
    }

    public final void a(Intent intent) {
        if (intent == null || this.f81480a == null) {
            o.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f81480a);
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        a(obtain);
    }

    public final void b(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent == null || this.f81480a == null) {
            o.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f81480a);
            return;
        }
        String action = intent.getAction();
        String packageName = this.f81480a.getPackageName();
        if (TextUtils.isEmpty(this.f81641d)) {
            this.f81641d = a(this.f81480a, packageName, action);
            if (TextUtils.isEmpty(this.f81641d)) {
                o.d("CommandWorker", " reflectReceiver error: receiver for: " + action + " not found, package: " + packageName);
                intent.setPackage(packageName);
                this.f81480a.sendBroadcast(intent);
                return;
            }
        }
        try {
            Class<?> cls = Class.forName(this.f81641d);
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Method method = cls.getMethod("onReceive", new Class[]{Context.class, Intent.class});
            intent.setClassName(packageName, this.f81641d);
            this.f81640c.post(new b(this, method, newInstance, new Object[]{this.f81480a.getApplicationContext(), intent}));
        } catch (Exception e2) {
            o.b("CommandWorker", "reflect e: ", e2);
        }
    }

    private static String a(Context context, String str, String str2) {
        String str3 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                str3 = queryBroadcastReceivers.get(0).activityInfo.name;
            }
            return str3;
        } catch (Exception e2) {
            o.a("CommandWorker", "error  " + e2.getMessage());
        }
    }
}
