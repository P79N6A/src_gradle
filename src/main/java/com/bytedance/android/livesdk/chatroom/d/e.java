package com.bytedance.android.livesdk.chatroom.d;

import android.os.AsyncTask;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class e extends AsyncTask<String, Void, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9893a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f9894b = "e";

    /* renamed from: c  reason: collision with root package name */
    private Handler f9895c;

    /* renamed from: d  reason: collision with root package name */
    private int f9896d = 0;

    public void onPostExecute(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9893a, false, 5355, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9893a, false, 5355, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f9895c.obtainMessage(this.f9896d, obj).sendToTarget();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.String... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f9893a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r5 = 0
            r6 = 5354(0x14ea, float:7.503E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f9893a
            r13 = 0
            r14 = 5354(0x14ea, float:7.503E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0037:
            if (r0 == 0) goto L_0x011a
            int r2 = r0.length
            if (r2 <= 0) goto L_0x011a
            r2 = r0[r9]
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0046
            goto L_0x011a
        L_0x0046:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "huoshan_record_"
            r2.<init>(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r3 = ".mp4"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.Context r3 = com.bytedance.android.live.core.utils.ac.e()
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r3
            r10[r1] = r2
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r13 = 1
            r14 = 5348(0x14e4, float:7.494E-42)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r15[r9] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r15[r1] = r5
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r6 = 0
            if (r5 == 0) goto L_0x00a1
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r3
            r10[r1] = r2
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r13 = 1
            r14 = 5348(0x14e4, float:7.494E-42)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r15[r1] = r2
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00ff
        L_0x00a1:
            java.lang.String r1 = com.bytedance.android.livesdk.chatroom.d.c.f9889b
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00e0
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            if (r1 != 0) goto L_0x00b0
            goto L_0x00ff
        L_0x00b0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r1.getAbsolutePath()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            r1 = 2131563947(0x7f0d15ab, float:1.8753365E38)
            java.lang.String r1 = r3.getString(r1)
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            r1 = 2131563952(0x7f0d15b0, float:1.8753376E38)
            java.lang.String r1 = r3.getString(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.bytedance.android.livesdk.chatroom.d.c.f9889b = r1
        L_0x00e0:
            java.lang.String r1 = com.bytedance.android.livesdk.chatroom.d.c.f9889b
            boolean r1 = com.bytedance.android.livesdk.chatroom.d.c.a((java.lang.String) r1)
            if (r1 != 0) goto L_0x00e9
            goto L_0x00ff
        L_0x00e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = com.bytedance.android.livesdk.chatroom.d.c.f9889b
            r1.append(r3)
            java.lang.String r3 = java.io.File.separator
            r1.append(r3)
            r1.append(r2)
            java.lang.String r6 = r1.toString()
        L_0x00ff:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L_0x0108
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0108:
            java.io.File r1 = new java.io.File     // Catch:{ d -> 0x0118 }
            r1.<init>(r6)     // Catch:{ d -> 0x0118 }
            java.io.File r2 = new java.io.File     // Catch:{ d -> 0x0118 }
            r0 = r0[r9]     // Catch:{ d -> 0x0118 }
            r2.<init>(r0)     // Catch:{ d -> 0x0118 }
            com.facebook.common.b.c.a(r2, r1)     // Catch:{ d -> 0x0118 }
            return r1
        L_0x0118:
            r0 = move-exception
            return r0
        L_0x011a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.d.e.doInBackground(java.lang.String[]):java.lang.Object");
    }

    public e(Handler handler, int i) {
        this.f9895c = handler;
    }
}
