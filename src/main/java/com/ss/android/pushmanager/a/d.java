package com.ss.android.pushmanager.a;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.e.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.pushmanager.a.a.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30484a;

    /* renamed from: b  reason: collision with root package name */
    private static WeakHandler.IHandler f30485b = new WeakHandler.IHandler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30488a;

        public final void handleMsg(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f30488a, false, 19116, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f30488a, false, 19116, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{message2}, null, d.f30484a, true, 19115, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, null, d.f30484a, true, 19115, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (message2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", message2.obj);
                } catch (JSONException unused) {
                }
                if (message2.what == 1001) {
                    c.a("push_monitor_register_result", jSONObject, null, null);
                    if (a.a()) {
                        throw new c(" 通道" + message2.obj + "注册timeout");
                    }
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static Handler f30486c = new WeakHandler(c.b(), f30485b);
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d  reason: collision with root package name */
    private static final Map<Integer, Boolean> f30487d = new ConcurrentHashMap(2);

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f30484a, true, 19111, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f30484a, true, 19111, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (c.a()) {
            synchronized (f30487d) {
                if (f30487d.get(Integer.valueOf(i)) == null) {
                    f30487d.put(Integer.valueOf(i), Boolean.TRUE);
                    f30486c.sendMessageDelayed(f30486c.obtainMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1));
                }
            }
        }
    }

    private static void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f30484a, true, 19114, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f30484a, true, 19114, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f30486c.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        c(r16);
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.put("status", 0);
        r0.put("pushType", r16);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r16) {
        /*
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f30484a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = 0
            r4 = 1
            r5 = 19113(0x4aa9, float:2.6783E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r9[r8] = r1
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = f30484a
            r12 = 1
            r13 = 19113(0x4aa9, float:2.6783E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r14[r8] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0038:
            boolean r0 = com.ss.android.pushmanager.a.c.a()
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f30487d
            monitor-enter(r1)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = f30487d     // Catch:{ all -> 0x0080 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0080 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0057
            goto L_0x007e
        L_0x0057:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = f30487d     // Catch:{ all -> 0x0080 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0080 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0080 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0080 }
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            c(r16)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "status"
            r0.put(r1, r8)     // Catch:{ JSONException -> 0x0077 }
            java.lang.String r1 = "pushType"
            r2 = r16
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0077 }
        L_0x0077:
            java.lang.String r1 = "push_monitor_register_result"
            r2 = 0
            com.ss.android.pushmanager.a.c.a(r1, r0, r2, r2)
            return
        L_0x007e:
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0080 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.a.d.b(int):void");
    }

    public static void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f30484a, true, 19107, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f30484a, true, 19107, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (c.a()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log", str2);
            } catch (JSONException unused) {
            }
            a(i, jSONObject);
        }
    }

    public static void a(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), jSONObject2}, null, f30484a, true, 19109, new Class[]{Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), jSONObject2}, null, f30484a, true, 19109, new Class[]{Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("status", i);
        } catch (JSONException unused) {
        }
        c.a("push_monitor_update_sender", jSONObject3, null, jSONObject2);
    }

    public static void a(boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str2}, null, f30484a, true, 19110, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str2}, null, f30484a, true, 19110, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
        } else if (c.a() && !z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 107);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("sender", str2);
            } catch (JSONException unused2) {
            }
            c.a("push_monitor_register_result", jSONObject, null, jSONObject2);
            if (a.a()) {
                throw new c("Server下发无可用通道或者注册失败");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        c(r22);
        r3 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.put("pushType", r0);
        r3.put("status", r23);
        r3.put("3rd_code", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r22, int r23, java.lang.String r24, java.lang.String r25) {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r11 = 0
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r12 = 1
            r4[r12] = r5
            r13 = 2
            r4[r13] = r1
            r14 = 3
            r4[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f30484a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r12] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r14] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 19112(0x4aa8, float:2.6782E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0071
            java.lang.Object[] r15 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r15[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r15[r12] = r0
            r15[r13] = r1
            r15[r14] = r2
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f30484a
            r18 = 1
            r19 = 19112(0x4aa8, float:2.6782E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class r21 = java.lang.Void.TYPE
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0071:
            boolean r3 = com.ss.android.pushmanager.a.c.a()
            if (r3 != 0) goto L_0x0078
            return
        L_0x0078:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r3 = f30487d
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r4 = f30487d     // Catch:{ all -> 0x00ea }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x00ea }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00ea }
            if (r4 == 0) goto L_0x00e8
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00ea }
            if (r4 != 0) goto L_0x0090
            goto L_0x00e8
        L_0x0090:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r4 = f30487d     // Catch:{ all -> 0x00ea }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x00ea }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00ea }
            r4.put(r5, r6)     // Catch:{ all -> 0x00ea }
            monitor-exit(r3)     // Catch:{ all -> 0x00ea }
            c(r22)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "pushType"
            r3.put(r4, r0)     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r4 = "status"
            r5 = r23
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r4 = "3rd_code"
            r3.put(r4, r1)     // Catch:{ JSONException -> 0x00b5 }
        L_0x00b5:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r4 = "msg"
            r1.put(r4, r2)     // Catch:{ JSONException -> 0x00bf }
        L_0x00bf:
            java.lang.String r4 = "push_monitor_register_result"
            r5 = 0
            com.ss.android.pushmanager.a.c.a(r4, r3, r5, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = " 通道"
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = "注册失败，原因 : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            boolean r1 = com.bytedance.e.a.a.a()
            if (r1 != 0) goto L_0x00e2
            return
        L_0x00e2:
            com.ss.android.pushmanager.a.a.c r1 = new com.ss.android.pushmanager.a.a.c
            r1.<init>(r0)
            throw r1
        L_0x00e8:
            monitor-exit(r3)     // Catch:{ all -> 0x00ea }
            return
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ea }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.a.d.a(int, int, java.lang.String, java.lang.String):void");
    }
}
