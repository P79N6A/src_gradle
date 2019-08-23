package com.ss.android.ugc.aweme.shortvideo.record.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.shortvideo.i.m;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import java.util.ArrayList;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69084a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f69085b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static int f69086c = 1;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<m> f69087d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    VideoRecordNewActivity f69088e;

    /* renamed from: f  reason: collision with root package name */
    int f69089f;
    int g;
    int h;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00af A[SYNTHETIC, Splitter:B:22:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5 A[SYNTHETIC, Splitter:B:28:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x013b A[SYNTHETIC, Splitter:B:48:0x013b] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0143 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f69084a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 78440(0x13268, float:1.09918E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f69084a
            r5 = 0
            r6 = 78440(0x13268, float:1.09918E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            r1 = 0
        L_0x0026:
            int r2 = f69086c
            r3 = 0
            r4 = 120(0x78, float:1.68E-43)
            r5 = 100
            if (r1 >= r2) goto L_0x00bc
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            android.app.Application r6 = com.ss.android.ugc.aweme.port.in.a.f61119b     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.lang.String r8 = "reaction_mask_rectangular"
            r7.<init>(r8)     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            r7.append(r8)     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.lang.String r8 = ".png"
            r7.append(r8)     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            r2.<init>(r6, r7)     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            r6.<init>(r2)     // Catch:{ IOException -> 0x00b3, all -> 0x00ab }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            if (r3 == 0) goto L_0x005f
            r2.createNewFile()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
        L_0x005f:
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r3 = r10.f69088e     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r7 = r10.f69088e     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r8 = 2131034131(0x7f050013, float:1.767877E38)
            android.content.res.TypedArray r7 = r7.obtainTypedArray(r8)     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            int r7 = r7.getResourceId(r1, r0)     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeResource(r3, r7)     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r3.compress(r7, r5, r6)     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r6.flush()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r6.close()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            com.ss.android.ugc.aweme.shortvideo.i.l r3 = new com.ss.android.ugc.aweme.shortvideo.i.l     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            int r7 = r10.g     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            int r8 = r10.h     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r3.<init>(r2, r7, r8)     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r3.defaultWidthDP = r4     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r2 = 180(0xb4, float:2.52E-43)
            r3.defaultHeightDP = r2     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r3.minWidthDP = r5     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r2 = 150(0x96, float:2.1E-43)
            r3.minHeightDP = r2     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.i.m> r2 = r10.f69087d     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r2.add(r3)     // Catch:{ IOException -> 0x00a9, all -> 0x00a7 }
            r6.close()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x00b8
        L_0x00a7:
            r0 = move-exception
            goto L_0x00ad
        L_0x00a9:
            r3 = r6
            goto L_0x00b3
        L_0x00ab:
            r0 = move-exception
            r6 = r3
        L_0x00ad:
            if (r6 == 0) goto L_0x00b2
            r6.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            throw r0
        L_0x00b3:
            if (r3 == 0) goto L_0x00b8
            r3.close()     // Catch:{ IOException -> 0x00b8 }
        L_0x00b8:
            int r1 = r1 + 1
            goto L_0x0026
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            int r2 = f69085b
            if (r1 >= r2) goto L_0x0147
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            android.app.Application r6 = com.ss.android.ugc.aweme.port.in.a.f61119b     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.lang.String r8 = "reaction_mask_circle"
            r7.<init>(r8)     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            r7.append(r8)     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.lang.String r8 = ".png"
            r7.append(r8)     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            r2.<init>(r6, r7)     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x013f, all -> 0x0137 }
            boolean r7 = r2.exists()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            if (r7 == 0) goto L_0x00f1
            r2.createNewFile()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
        L_0x00f1:
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r7 = r10.f69088e     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r8 = r10.f69088e     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r9 = 2131034130(0x7f050012, float:1.7678769E38)
            android.content.res.TypedArray r8 = r8.obtainTypedArray(r9)     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            int r8 = r8.getResourceId(r1, r0)     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r7, r8)     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r7.compress(r8, r5, r6)     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r6.flush()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r6.close()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            com.ss.android.ugc.aweme.shortvideo.i.j r7 = new com.ss.android.ugc.aweme.shortvideo.i.j     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            int r8 = r10.g     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            int r9 = r10.h     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r7.<init>(r2, r8, r9)     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r7.defaultWidthDP = r4     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r7.defaultHeightDP = r4     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r7.minWidthDP = r5     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r7.minHeightDP = r5     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.i.m> r2 = r10.f69087d     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
            r2.add(r7)     // Catch:{ IOException -> 0x0140, all -> 0x0135 }
        L_0x0131:
            r6.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x0143
        L_0x0135:
            r0 = move-exception
            goto L_0x0139
        L_0x0137:
            r0 = move-exception
            r6 = r3
        L_0x0139:
            if (r6 == 0) goto L_0x013e
            r6.close()     // Catch:{ IOException -> 0x013e }
        L_0x013e:
            throw r0
        L_0x013f:
            r6 = r3
        L_0x0140:
            if (r6 == 0) goto L_0x0143
            goto L_0x0131
        L_0x0143:
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.record.a.i.a():void");
    }

    public i(VideoRecordNewActivity videoRecordNewActivity, int i, int i2) {
        this.f69088e = videoRecordNewActivity;
        this.f69089f = 0;
        this.h = i2;
        this.g = i;
        a();
    }
}
