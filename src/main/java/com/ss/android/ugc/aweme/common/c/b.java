package com.ss.android.ugc.aweme.common.c;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.Set;

public final class b extends com.ss.android.image.b {
    public static ChangeQuickRedirect n;
    private final String o = (f29225c + "images/");
    private final String p = "AppShareIcon.jpg";
    private final String q = "ProfileShareIcon.jpg";

    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, n, false, 33438, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, n, false, 33438, new Class[0], String.class);
        }
        String str = com.ss.android.ugc.aweme.video.b.b() + File.separator + this.p;
        if (new File(str).exists()) {
            return str;
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = n
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3 = 0
            r4 = 33436(0x829c, float:4.6854E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x002c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = n
            r3 = 0
            r4 = 33436(0x829c, float:4.6854E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x002c:
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            r9 = 0
            if (r0 != 0) goto L_0x003a
            return r9
        L_0x003a:
            java.lang.String r0 = r16.f()
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00dd
            android.content.Context r0 = r7.l
            if (r0 != 0) goto L_0x0049
            return r9
        L_0x0049:
            android.content.Context r0 = r7.l
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.bytedance.ies.framework.R$drawable.icon
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r0, (int) r1)
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L_0x00d9
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r10 = r0.getBitmap()
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            r12 = 3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r10
            r13 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14 = 1
            r0[r14] = r1
            r15 = 2
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = n
            r3 = 0
            r4 = 33440(0x82a0, float:4.686E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r1 = android.graphics.Bitmap.CompressFormat.class
            r5[r15] = r1
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00bc
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r14] = r1
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = n
            r3 = 0
            r4 = 33440(0x82a0, float:4.686E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r1 = android.graphics.Bitmap.CompressFormat.class
            r5[r15] = r1
            java.lang.Class<java.io.InputStream> r6 = java.io.InputStream.class
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r9 = r0
            java.io.InputStream r9 = (java.io.InputStream) r9
            goto L_0x00d0
        L_0x00bc:
            if (r10 != 0) goto L_0x00bf
            goto L_0x00d0
        L_0x00bf:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r10.compress(r11, r13, r0)
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r9.<init>(r0)
        L_0x00d0:
            java.lang.String r0 = com.ss.android.ugc.aweme.video.b.b()
            java.lang.String r1 = r7.p
            com.bytedance.common.utility.io.FileUtils.saveInputStream(r9, r0, r1)
        L_0x00d9:
            java.lang.String r0 = r16.f()
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.c.b.e():java.lang.String");
    }

    public b(Context context) {
        super(context);
    }

    private static void a(String str, Set<String> set) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, null}, null, n, true, 33433, new Class[]{String.class, Set.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, null}, null, n, true, 33433, new Class[]{String.class, Set.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    a.a(listFiles[i].getAbsolutePath(), null);
                } else if (listFiles[i].isFile()) {
                    listFiles[i].getName();
                    listFiles[i].delete();
                }
            }
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, n, false, 33432, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, n, false, 33432, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i, i2);
        try {
            a(this.o, (Set<String>) null);
        } catch (Exception unused) {
        }
    }
}
