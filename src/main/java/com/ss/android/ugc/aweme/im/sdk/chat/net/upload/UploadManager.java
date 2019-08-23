package com.ss.android.ugc.aweme.im.sdk.chat.net.upload;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.ttuploader.TTImageUploader;
import com.ss.ttuploader.TTVideoUploader;

public class UploadManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50992a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile UploadManager f50993c;

    /* renamed from: b  reason: collision with root package name */
    public int f50994b;

    public @interface ErrorCode {
    }

    public @interface ImageType {
    }

    private UploadManager() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        if (a(r0) != false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(final java.lang.String r15, com.ss.android.ugc.aweme.im.sdk.chat.net.a.a r16, boolean r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50992a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.a.a> r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.a.a.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 51331(0xc883, float:7.193E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0058
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50992a
            r3 = 0
            r4 = 51331(0xc883, float:7.193E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.a.a> r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.a.a.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0058:
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x00cb }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "102"
            r9.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x0064:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00cb }
            r0.<init>(r15)     // Catch:{ Exception -> 0x00cb }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x00cb }
            if (r1 == 0) goto L_0x00c5
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00cb }
            if (r0 != 0) goto L_0x0076
            goto L_0x00c5
        L_0x0076:
            if (r17 != 0) goto L_0x0094
            com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = r0.e()     // Catch:{ Exception -> 0x00cb }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00cb }
            if (r1 != 0) goto L_0x0094
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b> r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r0, r1)     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b r0 = (com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b) r0     // Catch:{ Exception -> 0x00cb }
            boolean r1 = r14.a((com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b) r0)     // Catch:{ Exception -> 0x00cb }
            if (r1 == 0) goto L_0x009e
        L_0x0094:
            com.google.common.util.concurrent.q r0 = r14.b()     // Catch:{ Exception -> 0x00cb }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00cb }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b r0 = (com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b) r0     // Catch:{ Exception -> 0x00cb }
        L_0x009e:
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "103"
            r9.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x00a6:
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.c r0 = r0.getPublicImageConfig()     // Catch:{ Exception -> 0x00cb }
            com.ss.ttuploader.TTVideoUploader r0 = r14.a((com.ss.android.ugc.aweme.im.sdk.chat.net.upload.c) r0)     // Catch:{ Exception -> 0x00cb }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "104"
            r9.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x00b6:
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager$2 r1 = new com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager$2     // Catch:{ Exception -> 0x00cb }
            r1.<init>(r9, r15)     // Catch:{ Exception -> 0x00cb }
            r0.setListener(r1)     // Catch:{ Exception -> 0x00cb }
            r0.setPathName(r15)     // Catch:{ Exception -> 0x00cb }
            r0.start()     // Catch:{ Exception -> 0x00cb }
            return
        L_0x00c5:
            java.lang.String r0 = "101"
            r9.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00cb }
            return
        L_0x00cb:
            java.lang.String r0 = "100"
            r9.a((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager.a(java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.net.a.a, boolean):void");
    }

    public static UploadManager a() {
        if (PatchProxy.isSupport(new Object[0], null, f50992a, true, 51328, new Class[0], UploadManager.class)) {
            return (UploadManager) PatchProxy.accessDispatch(new Object[0], null, f50992a, true, 51328, new Class[0], UploadManager.class);
        }
        if (f50993c == null) {
            synchronized (UploadManager.class) {
                if (f50993c == null) {
                    f50993c = new UploadManager();
                }
            }
        }
        return f50993c;
    }

    private q<b> b() {
        q<b> qVar;
        if (PatchProxy.isSupport(new Object[0], this, f50992a, false, 51329, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], this, f50992a, false, 51329, new Class[0], q.class);
        }
        if (PatchProxy.isSupport(new Object[0], null, r.f52611a, true, 53464, new Class[0], q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[0], null, r.f52611a, true, 53464, new Class[0], q.class);
        } else {
            qVar = r.f52612b.getUploadAuthKeyConfig();
        }
        l.a(qVar, new k<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50995a;

            public final void onFailure(@NonNull Throwable th) {
            }

            public final /* synthetic */ void onSuccess(@NonNull Object obj) {
                b bVar = (b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f50995a, false, 51336, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f50995a, false, 51336, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                o a2 = o.a();
                String a3 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(bVar);
                if (PatchProxy.isSupport(new Object[]{a3}, a2, o.f52605a, false, 53413, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{a3}, a2, o.f52605a, false, 53413, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                a2.f52608b.edit().putString("upload_image_auth_key", a3).commit();
            }
        }, v.a());
        return qVar;
    }

    private TTVideoUploader a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f50992a, false, 51333, new Class[]{c.class}, TTVideoUploader.class)) {
            return (TTVideoUploader) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f50992a, false, 51333, new Class[]{c.class}, TTVideoUploader.class);
        }
        try {
            this.f50994b = 0;
            TTVideoUploader tTVideoUploader = new TTVideoUploader(1);
            tTVideoUploader.setSocketNum(cVar2.socketNumber);
            tTVideoUploader.setVideoUploadDomain(cVar2.imageHostName);
            tTVideoUploader.setMaxFailTime(cVar2.maxFailTime);
            tTVideoUploader.setFileUploadDomain(cVar2.fileHostName);
            tTVideoUploader.setFileRetryCount(cVar2.fileRetryCount);
            tTVideoUploader.setUserKey(cVar2.appKey);
            tTVideoUploader.setAuthorization(cVar2.authorization);
            return tTVideoUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f50992a, false, 51334, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f50992a, false, 51334, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        } else if (SystemClock.uptimeMillis() > Math.min(bVar.getInnerImageConfig().expireAt, bVar.getPublicImageConfig().expireAt)) {
            return true;
        } else {
            return false;
        }
    }

    private TTImageUploader a(int i, c cVar) {
        c cVar2 = cVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar2}, this, f50992a, false, 51332, new Class[]{Integer.TYPE, c.class}, TTImageUploader.class)) {
            return (TTImageUploader) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cVar2}, this, f50992a, false, 51332, new Class[]{Integer.TYPE, c.class}, TTImageUploader.class);
        }
        try {
            this.f50994b = 0;
            if (i == 0) {
                i2 = 1;
            }
            TTImageUploader tTImageUploader = new TTImageUploader(i2);
            tTImageUploader.setSocketNum(cVar2.socketNumber);
            tTImageUploader.setImageUploadDomain(cVar2.imageHostName);
            tTImageUploader.setMaxFailTime(cVar2.maxFailTime);
            tTImageUploader.setFileUploadDomain(cVar2.fileHostName);
            tTImageUploader.setFileRetryCount(cVar2.fileRetryCount);
            tTImageUploader.setUserKey(cVar2.appKey);
            tTImageUploader.setAuthorization(cVar2.authorization);
            return tTImageUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ad, code lost:
        if (a(r0) != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r17, @com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager.ImageType int r18, com.ss.android.ugc.aweme.im.sdk.chat.net.x r19, boolean r20) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = 4
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 1
            r0[r13] = r1
            r14 = 2
            r0[r14] = r10
            java.lang.Byte r1 = java.lang.Byte.valueOf(r20)
            r15 = 3
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50992a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.x> r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.x.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 51330(0xc882, float:7.1929E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0073
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            r0[r14] = r10
            java.lang.Byte r1 = java.lang.Byte.valueOf(r20)
            r0[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f50992a
            r3 = 0
            r4 = 51330(0xc882, float:7.1929E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.x> r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.x.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0073:
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ Exception -> 0x00f1 }
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "96"
            r10.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00f1 }
            return
        L_0x007f:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00f1 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00f1 }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x00f1 }
            if (r1 == 0) goto L_0x00eb
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00f1 }
            if (r0 != 0) goto L_0x0091
            goto L_0x00eb
        L_0x0091:
            if (r20 != 0) goto L_0x00af
            com.ss.android.ugc.aweme.im.sdk.utils.o r0 = com.ss.android.ugc.aweme.im.sdk.utils.o.a()     // Catch:{ Exception -> 0x00f1 }
            java.lang.String r0 = r0.e()     // Catch:{ Exception -> 0x00f1 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00f1 }
            if (r1 != 0) goto L_0x00af
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b> r1 = com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.im.sdk.utils.l.a(r0, r1)     // Catch:{ Exception -> 0x00f1 }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b r0 = (com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b) r0     // Catch:{ Exception -> 0x00f1 }
            boolean r1 = r7.a((com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b) r0)     // Catch:{ Exception -> 0x00f1 }
            if (r1 == 0) goto L_0x00b9
        L_0x00af:
            com.google.common.util.concurrent.q r0 = r16.b()     // Catch:{ Exception -> 0x00f1 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00f1 }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b r0 = (com.ss.android.ugc.aweme.im.sdk.chat.net.upload.b) r0     // Catch:{ Exception -> 0x00f1 }
        L_0x00b9:
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "97"
            r10.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00f1 }
            return
        L_0x00c1:
            if (r9 != r13) goto L_0x00c8
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.c r0 = r0.getInnerImageConfig()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00cc
        L_0x00c8:
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.c r0 = r0.getPublicImageConfig()     // Catch:{ Exception -> 0x00f1 }
        L_0x00cc:
            com.ss.ttuploader.TTImageUploader r0 = r7.a(r9, r0)     // Catch:{ Exception -> 0x00f1 }
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "98"
            r10.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00f1 }
            return
        L_0x00d8:
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.e r1 = new com.ss.android.ugc.aweme.im.sdk.chat.net.upload.e     // Catch:{ Exception -> 0x00f1 }
            r1.<init>(r7, r10, r9, r8)     // Catch:{ Exception -> 0x00f1 }
            r0.setListener(r1)     // Catch:{ Exception -> 0x00f1 }
            java.lang.String[] r1 = new java.lang.String[r13]     // Catch:{ Exception -> 0x00f1 }
            r1[r12] = r8     // Catch:{ Exception -> 0x00f1 }
            r0.setFilePath(r13, r1)     // Catch:{ Exception -> 0x00f1 }
            r0.start()     // Catch:{ Exception -> 0x00f1 }
            return
        L_0x00eb:
            java.lang.String r0 = "95"
            r10.a((java.lang.String) r0)     // Catch:{ Exception -> 0x00f1 }
            return
        L_0x00f1:
            java.lang.String r0 = "100"
            r10.a((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager.a(java.lang.String, int, com.ss.android.ugc.aweme.im.sdk.chat.net.x, boolean):void");
    }
}
