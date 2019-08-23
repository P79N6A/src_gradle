package com.ss.android.pushmanager.app;

import android.content.Context;
import android.util.Base64;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30515a;

    public static String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f30515a, true, 19014, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f30515a, true, 19014, new Class[]{Context.class}, String.class);
        } else if (context == null) {
            return null;
        } else {
            File filesDir = context.getFilesDir();
            if (filesDir == null || !filesDir.exists()) {
                return null;
            }
            File parentFile = filesDir.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                return null;
            }
            return parentFile.getAbsolutePath();
        }
    }

    public static JSONObject a(byte[] bArr, boolean z) throws DataFormatException, IOException {
        String str;
        JSONObject jSONObject;
        byte[] bArr2 = bArr;
        if (PatchProxy.isSupport(new Object[]{bArr2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f30515a, true, 19011, new Class[]{byte[].class, Boolean.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{bArr2, Byte.valueOf(z)}, null, f30515a, true, 19011, new Class[]{byte[].class, Boolean.TYPE}, JSONObject.class);
        }
        byte[] bArr3 = new byte[65536];
        char c2 = (char) bArr2[0];
        if (c2 == 'a') {
            Logger.debug();
            str = new String(bArr2, 1, bArr2.length - 1);
        } else if (c2 == 'c') {
            Inflater inflater = new Inflater();
            if (z) {
                inflater.setInput(Base64.decode(bArr2, 1, bArr2.length - 1, 0));
            } else {
                inflater.setInput(bArr2, 1, bArr2.length - 1);
            }
            Logger.debug();
            synchronized (bArr3) {
                int inflate = inflater.inflate(bArr3);
                inflater.end();
                if (inflate <= 0 || inflate >= 65536) {
                    str = null;
                } else {
                    str = new String(bArr3, 0, inflate, "UTF-8");
                }
            }
        } else {
            Logger.debug();
            str = null;
        }
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                Logger.debug();
            }
            return jSONObject;
        }
        jSONObject = null;
        return jSONObject;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r19, java.lang.String[] r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f30515a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 19013(0x4a45, float:2.6643E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0041
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f30515a
            r15 = 1
            r16 = 19013(0x4a45, float:2.6643E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0041:
            if (r19 != 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.String r0 = a(r19)     // Catch:{ Exception -> 0x0076 }
            if (r0 != 0) goto L_0x004b
            return
        L_0x004b:
            int r2 = r1.length     // Catch:{ Exception -> 0x0076 }
        L_0x004c:
            if (r10 >= r2) goto L_0x0075
            r3 = r1[r10]     // Catch:{ Exception -> 0x0076 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0076 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076 }
            r5.<init>()     // Catch:{ Exception -> 0x0076 }
            r5.append(r0)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r6 = "/files/"
            r5.append(r6)     // Catch:{ Exception -> 0x0076 }
            r5.append(r3)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0076 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x0076 }
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x0076 }
            if (r3 == 0) goto L_0x0072
            r4.delete()     // Catch:{ Exception -> 0x0076 }
        L_0x0072:
            int r10 = r10 + 1
            goto L_0x004c
        L_0x0075:
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.app.f.a(android.content.Context, java.lang.String[]):void");
    }
}
