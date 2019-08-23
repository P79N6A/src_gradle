package com.ss.android.common.applog;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.taobao.android.dexposed.ClassUtils;
import org.json.JSONObject;

public class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28053a;
    private static a m;

    /* renamed from: b  reason: collision with root package name */
    v f28054b;

    /* renamed from: c  reason: collision with root package name */
    Handler f28055c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f28056d = true;

    /* renamed from: e  reason: collision with root package name */
    boolean f28057e = true;

    /* renamed from: f  reason: collision with root package name */
    final Object f28058f = new Object();
    int g = 0;
    volatile int h;
    long i;
    long j;
    private long k;
    private long l;

    /* access modifiers changed from: package-private */
    public String b() {
        if (PatchProxy.isSupport(new Object[0], this, f28053a, false, 15251, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f28053a, false, 15251, new Class[0], String.class);
        }
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.getClassName());
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
        }
        return sb.toString();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f28053a, false, 15247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28053a, false, 15247, new Class[0], Void.TYPE);
            return;
        }
        this.f28056d = true;
        if (this.f28057e) {
            this.f28057e = false;
            synchronized (this.f28058f) {
                this.f28058f.notify();
            }
        }
        if (this.l <= 0) {
            this.l = System.currentTimeMillis();
        }
    }

    private a(v vVar) {
        this.f28054b = vVar;
        new Thread("ANRMonitor-Thread") {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f28059a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f28059a, false, 15252, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28059a, false, 15252, new Class[0], Void.TYPE);
                    return;
                }
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f28053a, false, 15250, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f28053a, false, 15250, new Class[0], Void.TYPE);
                    return;
                }
                while (true) {
                    if (aVar.f28057e) {
                        try {
                            synchronized (aVar.f28058f) {
                                aVar.f28058f.wait();
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        if (!aVar.f28056d) {
                            if (System.currentTimeMillis() - aVar.i > 3000) {
                                aVar.f28057e = true;
                            }
                        }
                        aVar.g++;
                        long currentTimeMillis = System.currentTimeMillis();
                        aVar.f28055c.obtainMessage(1, aVar.g, 0).sendToTarget();
                        aVar.a(2000);
                        int i = aVar.h;
                        if (i != aVar.g) {
                            aVar.a(1000);
                            i = aVar.h;
                            if (i != aVar.g) {
                                aVar.a(500);
                                i = aVar.h;
                            }
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        Logger.debug();
                        if (i != aVar.g && currentTimeMillis2 - aVar.j >= 60000) {
                            aVar.j = currentTimeMillis2;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("send_msg_id", aVar.g);
                            jSONObject.put("get_msg_id", i);
                            jSONObject.put("send_msg_time", currentTimeMillis);
                            jSONObject.put("check_msg_time", currentTimeMillis2);
                            String b2 = aVar.b();
                            if (b2 != null) {
                                jSONObject.put("data", b2);
                            }
                            jSONObject.put("remote_process", 1);
                            jSONObject.put("is_anr", 1);
                            aVar.f28054b.b(jSONObject);
                            Logger.debug();
                        }
                    }
                }
            }
        }.start();
    }

    public static synchronized a a(v vVar) {
        v vVar2 = vVar;
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[]{vVar2}, null, f28053a, true, 15245, new Class[]{v.class}, a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[]{vVar2}, null, f28053a, true, 15245, new Class[]{v.class}, a.class);
                return aVar;
            }
            if (m == null) {
                m = new a(vVar2);
            }
            a aVar2 = m;
            return aVar2;
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f28053a, false, 15248, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f28053a, false, 15248, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (message != null && message.what == 1) {
            this.h = message.arg1;
            this.k = currentTimeMillis;
        }
        if ((this.l <= 0 || currentTimeMillis - this.l > 60000) && !AppLog.isInForeground()) {
            this.f28056d = false;
            this.f28057e = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f28053a, false, 15249, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f28053a, false, 15249, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        try {
            Thread.sleep(j2);
        } catch (Exception unused) {
        }
    }
}
