package com.ss.android.ugc.aweme.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.io.IOUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class ey {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75855a;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[SYNTHETIC, Splitter:B:19:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75855a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 88689(0x15a71, float:1.2428E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f75855a
            r13 = 1
            r14 = 88689(0x15a71, float:1.2428E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x006a, all -> 0x0062 }
            int r0 = r2.read()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            int r0 = r0 << 8
            int r1 = r2.read()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r0 = r0 ^ r1
            int r0 = r0 << 8
            int r1 = r2.read()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r0 = r0 ^ r1
            int r0 = r0 << 8
            int r1 = r2.read()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r0 = r0 ^ r1
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r2.close()     // Catch:{ IOException -> 0x005d }
        L_0x005d:
            return r0
        L_0x005e:
            r0 = move-exception
            goto L_0x0064
        L_0x0060:
            r1 = r2
            goto L_0x006a
        L_0x0062:
            r0 = move-exception
            r2 = r1
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            throw r0
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ey.a(java.lang.String):java.lang.String");
    }

    public static List<String> b(String str) throws IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75855a, true, 88691, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f75855a, true, 88691, new Class[]{String.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(new File(str2)));
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        IOUtils.close((Closeable) bufferedReader2);
                        return arrayList;
                    } else if (!StringUtils.isEmpty(readLine)) {
                        arrayList.add(readLine);
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedReader = bufferedReader2;
                    try {
                        throw new IOException(e);
                    } catch (Throwable th) {
                        th = th;
                        IOUtils.close((Closeable) bufferedReader);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    IOUtils.close((Closeable) bufferedReader);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            throw new IOException(e);
        }
    }

    public static String a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f75855a, true, 88684, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f75855a, true, 88684, new Class[]{Integer.TYPE}, String.class);
        }
        int i2 = i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return String.format(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return String.format(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    public static boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f75855a, true, 88688, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f75855a, true, 88688, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null || Build.VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void b(String str, Context context, String str2) {
        String str3 = str;
        Context context2 = context;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, context2, str4}, null, f75855a, true, 88686, new Class[]{String.class, Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, context2, str4}, null, f75855a, true, 88686, new Class[]{String.class, Context.class, String.class}, Void.TYPE);
            return;
        }
        ((ClipboardManager) context2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str3, str4));
    }

    public static void a(String str, Context context, String str2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str, context2, str2}, null, f75855a, true, 88685, new Class[]{String.class, Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, context2, str2}, null, f75855a, true, 88685, new Class[]{String.class, Context.class, String.class}, Void.TYPE);
            return;
        }
        b(str, context, str2);
        a.a(context2, (int) C0906R.string.ao3).a();
    }
}
