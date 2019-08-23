package com.bytedance.android.livesdk.chatroom.d;

import android.media.Image;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@RequiresApi(api = 21)
public class f extends AsyncTask<Image, Void, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9897a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f9898b = "f";

    /* renamed from: c  reason: collision with root package name */
    private Handler f9899c;

    /* renamed from: d  reason: collision with root package name */
    private int f9900d = 0;

    /* renamed from: e  reason: collision with root package name */
    private DisplayMetrics f9901e;

    public void onPostExecute(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9897a, false, 5357, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9897a, false, 5357, new Class[]{Object.class}, Void.TYPE);
        } else if (this.f9899c != null) {
            Message obtainMessage = this.f9899c.obtainMessage(this.f9900d);
            obtainMessage.obj = obj;
            obtainMessage.sendToTarget();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(android.media.Image... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f9897a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.media.Image[]> r3 = android.media.Image[].class
            r7[r9] = r3
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r5 = 0
            r6 = 5356(0x14ec, float:7.505E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f9897a
            r13 = 0
            r14 = 5356(0x14ec, float:7.505E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.media.Image[]> r0 = android.media.Image[].class
            r15[r9] = r0
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0037:
            if (r0 == 0) goto L_0x01aa
            int r2 = r0.length
            if (r2 <= 0) goto L_0x01aa
            r2 = r0[r9]
            if (r2 != 0) goto L_0x0042
            goto L_0x01aa
        L_0x0042:
            android.content.Context r2 = com.bytedance.android.live.core.utils.ac.e()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "huoshan_screenshot_"
            r3.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r4 = ".jpg"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r2
            r10[r1] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r13 = 1
            r14 = 5347(0x14e3, float:7.493E-42)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r15[r9] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r15[r1] = r5
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r6 = 0
            if (r5 == 0) goto L_0x009d
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r9] = r2
            r10[r1] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a
            r13 = 1
            r14 = 5347(0x14e3, float:7.493E-42)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r15[r9] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r15[r1] = r2
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00fb
        L_0x009d:
            java.lang.String r5 = com.bytedance.android.livesdk.chatroom.d.c.f9890c
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x00dc
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()
            if (r5 != 0) goto L_0x00ac
            goto L_0x00fb
        L_0x00ac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r5 = r5.getAbsolutePath()
            r7.append(r5)
            java.lang.String r5 = java.io.File.separator
            r7.append(r5)
            r5 = 2131563947(0x7f0d15ab, float:1.8753365E38)
            java.lang.String r5 = r2.getString(r5)
            r7.append(r5)
            java.lang.String r5 = java.io.File.separator
            r7.append(r5)
            r5 = 2131563955(0x7f0d15b3, float:1.8753382E38)
            java.lang.String r2 = r2.getString(r5)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.bytedance.android.livesdk.chatroom.d.c.f9890c = r2
        L_0x00dc:
            java.lang.String r2 = com.bytedance.android.livesdk.chatroom.d.c.f9890c
            boolean r2 = com.bytedance.android.livesdk.chatroom.d.c.a((java.lang.String) r2)
            if (r2 != 0) goto L_0x00e5
            goto L_0x00fb
        L_0x00e5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = com.bytedance.android.livesdk.chatroom.d.c.f9890c
            r2.append(r5)
            java.lang.String r5 = java.io.File.separator
            r2.append(r5)
            r2.append(r3)
            java.lang.String r6 = r2.toString()
        L_0x00fb:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0109
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Can not get file path for screenshot"
            r0.<init>(r1)
            return r0
        L_0x0109:
            r0 = r0[r9]     // Catch:{ IOException -> 0x01a6 }
            r2 = r17
            android.util.DisplayMetrics r3 = r2.f9901e     // Catch:{ IOException -> 0x01a4 }
            r5 = 3
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x01a4 }
            r10[r9] = r0     // Catch:{ IOException -> 0x01a4 }
            r10[r1] = r3     // Catch:{ IOException -> 0x01a4 }
            r10[r4] = r6     // Catch:{ IOException -> 0x01a4 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a     // Catch:{ IOException -> 0x01a4 }
            r13 = 1
            r14 = 5351(0x14e7, float:7.498E-42)
            java.lang.Class[] r15 = new java.lang.Class[r5]     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class<android.media.Image> r7 = android.media.Image.class
            r15[r9] = r7     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class<android.util.DisplayMetrics> r7 = android.util.DisplayMetrics.class
            r15[r1] = r7     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r15[r4] = r7     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ IOException -> 0x01a4 }
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x01a4 }
            if (r7 == 0) goto L_0x0156
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x01a4 }
            r10[r9] = r0     // Catch:{ IOException -> 0x01a4 }
            r10[r1] = r3     // Catch:{ IOException -> 0x01a4 }
            r10[r4] = r6     // Catch:{ IOException -> 0x01a4 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.chatroom.d.c.f9888a     // Catch:{ IOException -> 0x01a4 }
            r13 = 1
            r14 = 5351(0x14e7, float:7.498E-42)
            java.lang.Class[] r15 = new java.lang.Class[r5]     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class<android.media.Image> r0 = android.media.Image.class
            r15[r9] = r0     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class<android.util.DisplayMetrics> r0 = android.util.DisplayMetrics.class
            r15[r1] = r0     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r4] = r0     // Catch:{ IOException -> 0x01a4 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ IOException -> 0x01a4 }
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ IOException -> 0x01a4 }
            goto L_0x01a3
        L_0x0156:
            android.media.Image$Plane[] r1 = r0.getPlanes()     // Catch:{ IOException -> 0x01a4 }
            r4 = r1[r9]     // Catch:{ IOException -> 0x01a4 }
            java.nio.ByteBuffer r4 = r4.getBuffer()     // Catch:{ IOException -> 0x01a4 }
            r5 = r1[r9]     // Catch:{ IOException -> 0x01a4 }
            int r5 = r5.getPixelStride()     // Catch:{ IOException -> 0x01a4 }
            r1 = r1[r9]     // Catch:{ IOException -> 0x01a4 }
            int r1 = r1.getRowStride()     // Catch:{ IOException -> 0x01a4 }
            int r7 = r3.widthPixels     // Catch:{ IOException -> 0x01a4 }
            int r7 = r7 * r5
            int r1 = r1 - r7
            int r1 = r1 / r5
            int r5 = r3.widthPixels     // Catch:{ IOException -> 0x01a4 }
            int r5 = r5 + r1
            int r1 = r3.heightPixels     // Catch:{ IOException -> 0x01a4 }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ IOException -> 0x01a4 }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r1, r7)     // Catch:{ IOException -> 0x01a4 }
            r1.copyPixelsFromBuffer(r4)     // Catch:{ IOException -> 0x01a4 }
            r4.clear()     // Catch:{ IOException -> 0x01a4 }
            r0.close()     // Catch:{ IOException -> 0x01a4 }
            int r0 = r3.widthPixels     // Catch:{ IOException -> 0x01a4 }
            int r3 = r3.heightPixels     // Catch:{ IOException -> 0x01a4 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r9, r9, r0, r3)     // Catch:{ IOException -> 0x01a4 }
            com.bytedance.android.livesdk.chatroom.d.c.a(r0, r6)     // Catch:{ IOException -> 0x01a4 }
            boolean r3 = r1.isRecycled()     // Catch:{ IOException -> 0x01a4 }
            if (r3 != 0) goto L_0x019a
            r1.recycle()     // Catch:{ IOException -> 0x01a4 }
        L_0x019a:
            boolean r1 = r0.isRecycled()     // Catch:{ IOException -> 0x01a4 }
            if (r1 != 0) goto L_0x01a3
            r0.recycle()     // Catch:{ IOException -> 0x01a4 }
        L_0x01a3:
            return r6
        L_0x01a4:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a6:
            r0 = move-exception
            r2 = r17
        L_0x01a9:
            return r0
        L_0x01aa:
            r2 = r17
            java.security.InvalidParameterException r0 = new java.security.InvalidParameterException
            java.lang.String r1 = "Image is null"
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.d.f.doInBackground(android.media.Image[]):java.lang.Object");
    }

    public f(DisplayMetrics displayMetrics, Handler handler, int i) {
        this.f9901e = displayMetrics;
        this.f9899c = handler;
    }
}
