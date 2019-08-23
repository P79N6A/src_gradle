package com.ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.d.j;
import com.tt.miniapphost.entity.MediaEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55864a;

    /* renamed from: b  reason: collision with root package name */
    j f55865b;

    /* renamed from: c  reason: collision with root package name */
    Activity f55866c;

    public final int a(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f55864a, false, 59470, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f55864a, false, 59470, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str2).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
        } catch (IOException unused) {
        }
        return i;
    }

    public final List<MediaEntity> a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f55864a, false, 59469, new Class[]{Intent.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{intent2}, this, f55864a, false, 59469, new Class[]{Intent.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        List<String> stringArrayListExtra = intent2.getStringArrayListExtra("extra_result_selection_path");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new LinkedList<>();
        }
        for (String mediaEntity : stringArrayListExtra) {
            MediaEntity mediaEntity2 = new MediaEntity(mediaEntity, "", 0, 0, 0, 0, "");
            arrayList.add(mediaEntity2);
        }
        return arrayList;
    }

    public a(Activity activity, Fragment fragment) {
        this.f55866c = activity;
        this.f55865b = new j(activity, fragment, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e4 A[SYNTHETIC, Splitter:B:34:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4 A[SYNTHETIC, Splitter:B:45:0x00f4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r20, android.graphics.Bitmap r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f55864a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6 = 0
            r7 = 59473(0xe851, float:8.334E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f55864a
            r15 = 0
            r16 = 59473(0xe851, float:8.334E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0048:
            if (r1 != 0) goto L_0x004d
            java.lang.String r0 = ""
            return r0
        L_0x004d:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r19
            com.ss.android.ugc.aweme.profile.d.j r4 = r3.f55865b
            java.lang.String r4 = r4.f61428e
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f55864a
            r14 = 1
            r15 = 59472(0xe850, float:8.3338E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x008d
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f55864a
            r14 = 1
            r15 = 59472(0xe850, float:8.3338E-41)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r16 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0095
        L_0x008d:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
        L_0x0095:
            r2.append(r4)
            java.lang.String r4 = ".jpg"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            r2 = 0
            boolean r4 = r0.exists()     // Catch:{ IOException -> 0x00e8, all -> 0x00d8 }
            if (r4 != 0) goto L_0x00b5
            java.io.File r4 = r0.getParentFile()     // Catch:{ IOException -> 0x00e8, all -> 0x00d8 }
            r4.mkdirs()     // Catch:{ IOException -> 0x00e8, all -> 0x00d8 }
            r0.createNewFile()     // Catch:{ IOException -> 0x00e8, all -> 0x00d8 }
        L_0x00b5:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e8, all -> 0x00d8 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x00e8, all -> 0x00d8 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x00e9, all -> 0x00d5 }
            r6 = 100
            r1.compress(r5, r6, r4)     // Catch:{ IOException -> 0x00e9, all -> 0x00d5 }
            r4.flush()     // Catch:{ IOException -> 0x00e9, all -> 0x00d5 }
            boolean r2 = r21.isRecycled()
            if (r2 != 0) goto L_0x00cd
            r21.recycle()
        L_0x00cd:
            r4.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L_0x00d5:
            r0 = move-exception
            r2 = r4
            goto L_0x00d9
        L_0x00d8:
            r0 = move-exception
        L_0x00d9:
            boolean r4 = r21.isRecycled()
            if (r4 != 0) goto L_0x00e2
            r21.recycle()
        L_0x00e2:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ IOException -> 0x00e7 }
        L_0x00e7:
            throw r0
        L_0x00e8:
            r4 = r2
        L_0x00e9:
            boolean r0 = r21.isRecycled()
            if (r0 != 0) goto L_0x00f2
            r21.recycle()
        L_0x00f2:
            if (r4 == 0) goto L_0x00f7
            r4.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.media.a.a(android.content.Context, android.graphics.Bitmap):java.lang.String");
    }
}
