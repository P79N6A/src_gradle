package com.umeng.commonsdk.internal.utils;

import android.os.Process;
import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f80780a = "\n";

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f80781b = "\nexit\n".getBytes();

    /* renamed from: c  reason: collision with root package name */
    private static byte[] f80782c = new byte[32];

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r1.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.Process r1) {
        /*
            int r0 = b(r1)
            if (r0 == 0) goto L_0x000e
            com.umeng.commonsdk.internal.utils.g._lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(r0)     // Catch:{ Exception -> 0x000a }
            return
        L_0x000a:
            r1.destroy()     // Catch:{ Exception -> 0x000e }
            return
        L_0x000e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.g.a(java.lang.Process):void");
    }

    private static void c(Process process) {
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    a(process);
                }
            } catch (IllegalThreadStateException unused) {
                a(process);
            }
        }
    }

    private static int b(Process process) {
        String obj = process.toString();
        try {
            return Integer.parseInt(obj.substring(obj.indexOf("=") + 1, obj.indexOf("]")));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v48, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.io.BufferedReader} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r9 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        c(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r0 = th;
        r1 = r1;
        r3 = r3;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        r7 = null;
        r1 = r1;
        r3 = r3;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        r7 = null;
        r1 = r1;
        r3 = r3;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00cb, code lost:
        if (r9 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00d8, code lost:
        if (r9 != null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00db, code lost:
        if (r7 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00dd, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00e2, code lost:
        return r7.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:13:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String... r9) {
        /*
            r0 = 0
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x00ce, Exception -> 0x00c1, all -> 0x00b0 }
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ IOException -> 0x00ce, Exception -> 0x00c1, all -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00ce, Exception -> 0x00c1, all -> 0x00b0 }
            java.lang.ProcessBuilder r9 = r1.command(r9)     // Catch:{ IOException -> 0x00ce, Exception -> 0x00c1, all -> 0x00b0 }
            java.lang.Process r9 = r9.start()     // Catch:{ IOException -> 0x00ce, Exception -> 0x00c1, all -> 0x00b0 }
            java.io.OutputStream r1 = r9.getOutputStream()     // Catch:{ IOException -> 0x00ae, Exception -> 0x00ac, all -> 0x00a4 }
            java.io.InputStream r2 = r9.getInputStream()     // Catch:{ IOException -> 0x00a2, Exception -> 0x00a0, all -> 0x0099 }
            java.io.InputStream r3 = r9.getErrorStream()     // Catch:{ IOException -> 0x0096, Exception -> 0x0094, all -> 0x008e }
            byte[] r4 = f80781b     // Catch:{ IOException -> 0x008b, Exception -> 0x0088, all -> 0x0082 }
            r1.write(r4)     // Catch:{ IOException -> 0x008b, Exception -> 0x0088, all -> 0x0082 }
            r1.flush()     // Catch:{ IOException -> 0x008b, Exception -> 0x0088, all -> 0x0082 }
            r9.waitFor()     // Catch:{ IOException -> 0x008b, Exception -> 0x0088, all -> 0x0082 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x008b, Exception -> 0x0088, all -> 0x0082 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x008b, Exception -> 0x0088, all -> 0x0082 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x007f, Exception -> 0x007c, all -> 0x0076 }
            r5.<init>(r4)     // Catch:{ IOException -> 0x007f, Exception -> 0x007c, all -> 0x0076 }
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x0073, Exception -> 0x0070, all -> 0x006d }
            if (r6 == 0) goto L_0x005a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0073, Exception -> 0x0070, all -> 0x006d }
            r7.<init>()     // Catch:{ IOException -> 0x0073, Exception -> 0x0070, all -> 0x006d }
            r7.append(r6)     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            java.lang.String r6 = f80780a     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            r7.append(r6)     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
        L_0x0045:
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            if (r6 == 0) goto L_0x005b
            r7.append(r6)     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            java.lang.String r6 = f80780a     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            r7.append(r6)     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            goto L_0x0045
        L_0x0054:
            goto L_0x00c8
        L_0x0057:
            goto L_0x00d5
        L_0x005a:
            r7 = r0
        L_0x005b:
            byte[] r6 = f80782c     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            int r6 = r3.read(r6)     // Catch:{ IOException -> 0x0057, Exception -> 0x0054, all -> 0x006d }
            if (r6 > 0) goto L_0x005b
            a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00db
        L_0x0068:
            c(r9)
            goto L_0x00db
        L_0x006d:
            r0 = move-exception
            goto L_0x00b8
        L_0x0070:
            r7 = r0
            goto L_0x00c8
        L_0x0073:
            r7 = r0
            goto L_0x00d5
        L_0x0076:
            r5 = move-exception
            r8 = r5
            r5 = r0
            r0 = r8
            goto L_0x00b8
        L_0x007c:
            r5 = r0
            goto L_0x00c7
        L_0x007f:
            r5 = r0
            goto L_0x00d4
        L_0x0082:
            r4 = move-exception
            r5 = r0
            r0 = r4
            r4 = r5
            goto L_0x00b8
        L_0x0088:
            r4 = r0
            goto L_0x00c6
        L_0x008b:
            r4 = r0
            goto L_0x00d3
        L_0x008e:
            r3 = move-exception
            r4 = r0
            r5 = r4
            r0 = r3
            r3 = r5
            goto L_0x00b8
        L_0x0094:
            r3 = r0
            goto L_0x00c5
        L_0x0096:
            r3 = r0
            goto L_0x00d2
        L_0x0099:
            r2 = move-exception
            r3 = r0
            r4 = r3
            r5 = r4
            r0 = r2
            r2 = r5
            goto L_0x00b8
        L_0x00a0:
            r2 = r0
            goto L_0x00c4
        L_0x00a2:
            r2 = r0
            goto L_0x00d1
        L_0x00a4:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r0 = r1
            r1 = r5
            goto L_0x00b8
        L_0x00ac:
            r1 = r0
            goto L_0x00c3
        L_0x00ae:
            r1 = r0
            goto L_0x00d0
        L_0x00b0:
            r9 = move-exception
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r0 = r9
            r9 = r5
        L_0x00b8:
            a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00c0
            c(r9)
        L_0x00c0:
            throw r0
        L_0x00c1:
            r9 = r0
            r1 = r9
        L_0x00c3:
            r2 = r1
        L_0x00c4:
            r3 = r2
        L_0x00c5:
            r4 = r3
        L_0x00c6:
            r5 = r4
        L_0x00c7:
            r7 = r5
        L_0x00c8:
            a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00db
            goto L_0x0068
        L_0x00ce:
            r9 = r0
            r1 = r9
        L_0x00d0:
            r2 = r1
        L_0x00d1:
            r3 = r2
        L_0x00d2:
            r4 = r3
        L_0x00d3:
            r5 = r4
        L_0x00d4:
            r7 = r5
        L_0x00d5:
            a(r1, r3, r2, r4, r5)
            if (r9 == 0) goto L_0x00db
            goto L_0x0068
        L_0x00db:
            if (r7 != 0) goto L_0x00de
            return r0
        L_0x00de:
            java.lang.String r9 = r7.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.g.a(java.lang.String[]):java.lang.String");
    }

    private static void a(OutputStream outputStream, InputStream inputStream, InputStream inputStream2, InputStreamReader inputStreamReader, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        if (inputStreamReader != null) {
            try {
                inputStreamReader.close();
            } catch (IOException unused4) {
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
        }
    }
}
