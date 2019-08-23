package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.an.a.a;
import com.ss.android.ugc.aweme.an.a.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;

public class DelayedBaceSpeedMethodTestTask implements LegoTask {
    private static final String TAG = "DelayedBaceSpeedMethodTestTask";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int testCount;
    private Timer timer;

    public interface TestIdc {
        @GET("/aweme/v1/testidc/")
        Call<a> testIdc();
    }

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 55249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 55249, new Class[0], Void.TYPE);
            return;
        }
        try {
            final b bVar = ((a) ((TestIdc) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(TestIdc.class)).testIdc().execute().body()).f33308a;
            if (!(bVar == null || bVar.f33311c == null)) {
                if (!bVar.f33311c.isEmpty()) {
                    if (this.timer != null) {
                        this.timer.cancel();
                        this.timer = null;
                    }
                    this.timer = new Timer("test_speed_1");
                    if (bVar.f33309a > 100) {
                        bVar.f33309a = 100;
                    }
                    this.timer.schedule(new TimerTask() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f53122a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f53122a, false, 55250, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f53122a, false, 55250, new Class[0], Void.TYPE);
                                return;
                            }
                            DelayedBaceSpeedMethodTestTask.this.dealWithTest(bVar);
                        }
                    }, 0, (long) (bVar.f33310b * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                }
            }
        } catch (Exception unused) {
        }
    }

    public void run(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 55247, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 55247, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a(TAG);
        run();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dealWithTest(com.ss.android.ugc.aweme.an.a.b r30) {
        /*
            r29 = this;
            r7 = r29
            r8 = r30
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.an.a.b> r1 = com.ss.android.ugc.aweme.an.a.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 55248(0xd7d0, float:7.7419E-41)
            r1 = r29
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 55248(0xd7d0, float:7.7419E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.an.a.b> r1 = com.ss.android.ugc.aweme.an.a.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r29
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = r7.testCount
            int r1 = r8.f33309a
            if (r0 <= r1) goto L_0x004b
            java.util.Timer r0 = r7.timer
            if (r0 == 0) goto L_0x004a
            java.util.Timer r0 = r7.timer
            r0.cancel()
            r0 = 0
            r7.timer = r0
        L_0x004a:
            return
        L_0x004b:
            int r0 = r7.testCount
            int r0 = r0 + r9
            r7.testCount = r0
            java.util.List<com.ss.android.ugc.aweme.an.a.c> r0 = r8.f33311c
            java.util.Iterator r0 = r0.iterator()
        L_0x0056:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ac
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.an.a.c r1 = (com.ss.android.ugc.aweme.an.a.c) r1
            java.lang.String r2 = r1.f33312a
            if (r2 == 0) goto L_0x0056
            java.lang.String r2 = r1.f33315d
            if (r2 == 0) goto L_0x0056
            boolean r2 = r1.f33314c
            com.ss.android.common.http.b r11 = com.ss.android.common.http.a.a()
            java.lang.String r3 = "get"
            java.lang.String r4 = r1.f33315d
            java.lang.String r4 = r4.toLowerCase()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0091
            r12 = 0
            r13 = 0
            java.lang.String r14 = r1.f33312a     // Catch:{ Exception -> 0x008f }
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r17 = r2
            r11.a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x008f }
            goto L_0x0056
        L_0x008f:
            goto L_0x0056
        L_0x0091:
            java.lang.String r2 = "post"
            java.lang.String r3 = r1.f33315d
            java.lang.String r3 = r3.toLowerCase()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0056
            com.google.gson.JsonObject r2 = r1.f33316e
            if (r2 == 0) goto L_0x00aa
            com.google.gson.JsonObject r2 = r1.f33316e
            java.lang.String r2 = r2.toString()
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r2 = ""
        L_0x00ac:
            java.lang.String r3 = "application/json"
            java.util.Map<java.lang.String, java.lang.String> r4 = r1.f33313b
            if (r4 == 0) goto L_0x00c6
            java.util.Map<java.lang.String, java.lang.String> r4 = r1.f33313b
            java.lang.String r5 = "Content-Type"
            java.lang.Object r4 = r4.get(r5)
            if (r4 == 0) goto L_0x00c6
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f33313b
            java.lang.String r4 = "Content-Type"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
        L_0x00c6:
            java.lang.String r13 = r1.f33312a     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "utf8"
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = "utf8"
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f33313b     // Catch:{ Exception -> 0x008f }
            r5 = 7
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x008f }
            r14[r10] = r6     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x008f }
            r14[r9] = r6     // Catch:{ Exception -> 0x008f }
            r6 = 2
            r14[r6] = r13     // Catch:{ Exception -> 0x008f }
            r8 = 3
            r14[r8] = r2     // Catch:{ Exception -> 0x008f }
            r11 = 4
            r14[r11] = r4     // Catch:{ Exception -> 0x008f }
            r12 = 5
            r14[r12] = r3     // Catch:{ Exception -> 0x008f }
            r21 = 6
            r14[r21] = r1     // Catch:{ Exception -> 0x008f }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.an.a.f33306a     // Catch:{ Exception -> 0x008f }
            r17 = 1
            r18 = 86722(0x152c2, float:1.21523E-40)
            java.lang.Class[] r15 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x008f }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x008f }
            r15[r10] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class r19 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x008f }
            r15[r9] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r15[r6] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class<byte[]> r19 = byte[].class
            r15[r8] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r15[r11] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r15[r12] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.util.Map> r19 = java.util.Map.class
            r15[r21] = r19     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r15
            r15 = 0
            boolean r14 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x008f }
            if (r14 == 0) goto L_0x016e
            java.lang.Object[] r14 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x008f }
            r14[r10] = r15     // Catch:{ Exception -> 0x008f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x008f }
            r14[r9] = r15     // Catch:{ Exception -> 0x008f }
            r14[r6] = r13     // Catch:{ Exception -> 0x008f }
            r14[r8] = r2     // Catch:{ Exception -> 0x008f }
            r14[r11] = r4     // Catch:{ Exception -> 0x008f }
            r14[r12] = r3     // Catch:{ Exception -> 0x008f }
            r14[r21] = r1     // Catch:{ Exception -> 0x008f }
            r23 = 0
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.an.a.f33306a     // Catch:{ Exception -> 0x008f }
            r25 = 1
            r26 = 86722(0x152c2, float:1.21523E-40)
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x008f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x008f }
            r1[r10] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x008f }
            r1[r9] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r6] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class<byte[]> r2 = byte[].class
            r1[r8] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r12] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r1[r21] = r2     // Catch:{ Exception -> 0x008f }
            java.lang.Class<java.lang.String> r28 = java.lang.String.class
            r22 = r14
            r27 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x008f }
            goto L_0x0056
        L_0x016e:
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x008f }
            r4.<init>()     // Catch:{ Exception -> 0x008f }
            okhttp3.Request$Builder r14 = r4.url((java.lang.String) r13)     // Catch:{ Exception -> 0x008f }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Exception -> 0x008f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x008f }
        L_0x017f:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x008f }
            if (r4 == 0) goto L_0x019b
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x008f }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x008f }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Exception -> 0x008f }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x008f }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x008f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x008f }
            r14.addHeader(r5, r4)     // Catch:{ Exception -> 0x008f }
            goto L_0x017f
        L_0x019b:
            okhttp3.MediaType r1 = okhttp3.MediaType.parse(r3)     // Catch:{ Exception -> 0x008f }
            okhttp3.RequestBody r15 = okhttp3.RequestBody.create((okhttp3.MediaType) r1, (byte[]) r2)     // Catch:{ Exception -> 0x008f }
            r11 = 0
            r12 = 0
            r16 = 0
            com.ss.android.ugc.aweme.an.a.a(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x008f }
            goto L_0x0056
        L_0x01ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask.dealWithTest(com.ss.android.ugc.aweme.an.a.b):void");
    }
}
