package com.ss.android.pushmanager.a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.e.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30473a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile AtomicBoolean f30474b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static long f30475c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile AtomicBoolean f30476d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private static WeakHandler.IHandler f30477e = new WeakHandler.IHandler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30479a;

        public final void handleMsg(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f30479a, false, 19101, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f30479a, false, 19101, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{message2}, null, b.f30473a, true, 19100, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, null, b.f30473a, true, 19100, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (message2 != null) {
                switch (message2.what) {
                    case 1:
                        b.a(1, System.currentTimeMillis() - b.f30475c);
                        return;
                    case 2:
                        b.a(2, System.currentTimeMillis() - b.f30475c);
                        break;
                }
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static Handler f30478f;

    public static Handler a() {
        if (PatchProxy.isSupport(new Object[0], null, f30473a, true, 19095, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], null, f30473a, true, 19095, new Class[0], Handler.class);
        }
        if (f30478f == null) {
            f30478f = new WeakHandler(c.b(), f30477e);
        }
        return f30478f;
    }

    public static void a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f30473a, true, 19097, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f30473a, true, 19097, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        b(i, j);
        if (a.a() && i == 2) {
            throw new com.ss.android.pushmanager.a.a.b("Push 初始化超时");
        }
    }

    private static void b(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f30473a, true, 19098, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f30473a, true, 19098, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j2);
        } catch (JSONException unused2) {
        }
        c.a("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
    }
}
