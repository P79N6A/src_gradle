package com.bytedance.android.livesdk.chatroom.d;

import android.os.AsyncTask;
import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends AsyncTask<String, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9882a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f9883b = "a";

    /* renamed from: c  reason: collision with root package name */
    private Handler f9884c;

    /* renamed from: d  reason: collision with root package name */
    private int f9885d = 2;

    public /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f9882a, false, 5343, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f9882a, false, 5343, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f9884c.obtainMessage(this.f9885d, str).sendToTarget();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String doInBackground(java.lang.String... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f9882a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 5342(0x14de, float:7.486E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f9882a
            r13 = 0
            r14 = 5342(0x14de, float:7.486E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r2 = 0
            if (r0 == 0) goto L_0x0108
            int r3 = r0.length
            if (r3 <= 0) goto L_0x0108
            r3 = r0[r9]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0047
            goto L_0x0108
        L_0x0047:
            r0 = r0[r9]
            r3 = 320(0x140, float:4.48E-43)
            android.graphics.Bitmap r3 = android.media.ThumbnailUtils.createVideoThumbnail(r0, r3)
            if (r3 != 0) goto L_0x0052
            return r2
        L_0x0052:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r0.append(r4)
            java.lang.String r4 = ".png"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.content.Context r4 = com.bytedance.android.live.core.utils.ac.e()
            r5 = 2
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r13 = 1
            r14 = 5349(0x14e5, float:7.496E-42)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r15[r9] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r15[r1] = r6
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x00a9
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            r10[r1] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r13 = 1
            r14 = 5349(0x14e5, float:7.496E-42)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r1] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00e2
        L_0x00a9:
            java.lang.String r1 = com.bytedance.android.livesdk.chatroom.d.c.a((android.content.Context) r4)
            if (r1 != 0) goto L_0x00b1
        L_0x00af:
            r0 = r2
            goto L_0x00e2
        L_0x00b1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = "thumbnail"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            boolean r4 = com.bytedance.android.livesdk.chatroom.d.c.a((java.lang.String) r1)
            if (r4 != 0) goto L_0x00ce
            goto L_0x00af
        L_0x00ce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x00e2:
            if (r0 != 0) goto L_0x00e5
            return r2
        L_0x00e5:
            com.bytedance.android.livesdk.chatroom.d.c.a(r3, r0)     // Catch:{ IOException -> 0x00fe, all -> 0x00f2 }
            boolean r1 = r3.isRecycled()
            if (r1 != 0) goto L_0x00f1
            r3.recycle()
        L_0x00f1:
            return r0
        L_0x00f2:
            r0 = move-exception
            r1 = r0
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L_0x00fd
            r3.recycle()
        L_0x00fd:
            throw r1
        L_0x00fe:
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L_0x0107
            r3.recycle()
        L_0x0107:
            return r2
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.d.a.doInBackground(java.lang.String[]):java.lang.String");
    }

    public a(Handler handler, int i) {
        this.f9884c = handler;
    }
}
