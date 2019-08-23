package org.android.spdy;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Method;

public class SoInstallMgrSdk {
    static Context mContext;

    private static String _cpuType() {
        String _getFieldReflectively = _getFieldReflectively(new Build(), "CPU_ABI");
        if (_getFieldReflectively == null || _getFieldReflectively.length() == 0 || _getFieldReflectively.equals("Unknown")) {
            _getFieldReflectively = "armeabi";
        }
        return _getFieldReflectively.toLowerCase();
    }

    public static void init(Context context) {
        mContext = context;
    }

    public static boolean initSo(String str, int i) {
        return initSo(str, i, null);
    }

    static boolean isExist(String str, int i) {
        return new File(_targetSoFile(str, i)).exists();
    }

    private static String _getFieldReflectively(Build build, String str) {
        try {
            return Build.class.getField(str).get(build).toString();
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    static void removeSoIfExit(String str, int i) {
        File file = new File(_targetSoFile(str, i));
        if (file.exists()) {
            file.delete();
        }
    }

    static String _targetSoFile(String str, int i) {
        Context context = mContext;
        if (context == null) {
            return "";
        }
        String str2 = "/data/data/" + context.getPackageName() + "/files";
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            str2 = filesDir.getPath();
        }
        return str2 + "/lib" + str + "bk" + i + ".so";
    }

    static boolean _loadUnzipSo(String str, int i, ClassLoader classLoader) {
        try {
            if (isExist(str, i)) {
                if (classLoader == null) {
                    System.load(_targetSoFile(str, i));
                } else {
                    Runtime runtime = Runtime.getRuntime();
                    Method declaredMethod = Runtime.class.getDeclaredMethod("load", new Class[]{String.class, ClassLoader.class});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(runtime, new Object[]{_targetSoFile(str, i), classLoader});
                }
            }
            return true;
        } catch (Error | Exception | UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: Error | Exception | UnsatisfiedLinkError (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean initSo(java.lang.String r7, int r8, java.lang.ClassLoader r9) {
        /*
            r0 = 1
            r1 = 0
            if (r9 != 0) goto L_0x0008
            java.lang.System.loadLibrary(r7)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            goto L_0x002d
        L_0x0008:
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            java.lang.Class<java.lang.ClassLoader> r5 = java.lang.ClassLoader.class
            r4[r0] = r5     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            java.lang.Class<java.lang.Runtime> r5 = java.lang.Runtime.class
            java.lang.String r6 = "loadLibrary"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            r4.setAccessible(r0)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            r3[r1] = r7     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            r3[r0] = r9     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            r4.invoke(r2, r3)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 != 0) goto L_0x0059
            boolean r2 = isExist(r7, r8)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x005a }
            if (r2 == 0) goto L_0x003f
            boolean r2 = _loadUnzipSo(r7, r8, r9)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x005a }
            if (r2 == 0) goto L_0x003c
            return r2
        L_0x003c:
            removeSoIfExit(r7, r8)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x005a }
        L_0x003f:
            java.lang.String r2 = _cpuType()     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x005a }
            java.lang.String r3 = "mips"
            boolean r3 = r2.equalsIgnoreCase(r3)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x005a }
            if (r3 != 0) goto L_0x0059
            java.lang.String r3 = "x86"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ Error | Exception | UnsatisfiedLinkError -> 0x005a }
            if (r2 != 0) goto L_0x0059
            boolean r7 = unZipSelectedFiles(r7, r8, r9)     // Catch:{ IOException | ZipException -> 0x0059, Error | Exception | UnsatisfiedLinkError -> 0x005a, Error | Exception | UnsatisfiedLinkError -> 0x005a }
            r1 = r7
            goto L_0x005a
        L_0x0059:
            r1 = r0
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SoInstallMgrSdk.initSo(java.lang.String, int, java.lang.ClassLoader):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:21|22|23|24|25|26|27|28|29|(2:30|(2:32|33)(1:80))|(2:35|36)|(2:39|40)|(2:43|44)|45|46|(2:48|49)(1:50)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:54|55|(0)|(0)|(0)|69|70|71) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7 A[Catch:{ IOException -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca A[SYNTHETIC, Splitter:B:59:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d1 A[SYNTHETIC, Splitter:B:63:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d8 A[SYNTHETIC, Splitter:B:67:0x00d8] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x00b2=Splitter:B:45:0x00b2, B:69:0x00db=Splitter:B:69:0x00db} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean unZipSelectedFiles(java.lang.String r9, int r10, java.lang.ClassLoader r11) throws java.util.zip.ZipException, java.io.IOException {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lib/armeabi/lib"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ".so"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String r2 = ""
            android.content.Context r3 = mContext     // Catch:{ IOException -> 0x00e0 }
            if (r3 != 0) goto L_0x001b
            return r1
        L_0x001b:
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()     // Catch:{ IOException -> 0x00e0 }
            if (r4 == 0) goto L_0x0023
            java.lang.String r2 = r4.sourceDir     // Catch:{ IOException -> 0x00e0 }
        L_0x0023:
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00e0 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00e0 }
            java.util.Enumeration r2 = r4.entries()     // Catch:{ IOException -> 0x00e0 }
        L_0x002c:
            boolean r5 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00e0 }
            if (r5 == 0) goto L_0x00e0
            java.lang.Object r5 = r2.nextElement()     // Catch:{ IOException -> 0x00e0 }
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r6 = r5.getName()     // Catch:{ IOException -> 0x00e0 }
            java.lang.String r7 = ".."
            boolean r7 = r6.contains(r7)     // Catch:{ IOException -> 0x00e0 }
            if (r7 != 0) goto L_0x00df
            java.lang.String r7 = "\\"
            boolean r7 = r6.contains(r7)     // Catch:{ IOException -> 0x00e0 }
            if (r7 != 0) goto L_0x00df
            java.lang.String r7 = "%"
            boolean r6 = r6.contains(r7)     // Catch:{ IOException -> 0x00e0 }
            if (r6 == 0) goto L_0x0056
            goto L_0x00df
        L_0x0056:
            java.lang.String r6 = r5.getName()     // Catch:{ IOException -> 0x00e0 }
            boolean r6 = r6.startsWith(r0)     // Catch:{ IOException -> 0x00e0 }
            if (r6 == 0) goto L_0x002c
            r0 = 0
            removeSoIfExit(r9, r10)     // Catch:{ all -> 0x00c5 }
            java.io.InputStream r2 = r4.getInputStream(r5)     // Catch:{ all -> 0x00c5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "lib"
            r5.<init>(r6)     // Catch:{ all -> 0x00c2 }
            r5.append(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "bk"
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            r5.append(r10)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = ".so"
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c2 }
            java.io.FileOutputStream r3 = r3.openFileOutput(r5, r1)     // Catch:{ all -> 0x00c2 }
            java.nio.channels.FileChannel r5 = r3.getChannel()     // Catch:{ all -> 0x00c0 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00bd }
            r6 = 0
        L_0x0090:
            int r7 = r2.read(r0)     // Catch:{ all -> 0x00bd }
            if (r7 <= 0) goto L_0x009f
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r0, r1, r7)     // Catch:{ all -> 0x00bd }
            r5.write(r8)     // Catch:{ all -> 0x00bd }
            int r6 = r6 + r7
            goto L_0x0090
        L_0x009f:
            if (r2 == 0) goto L_0x00a6
            r2.close()     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
        L_0x00a6:
            if (r5 == 0) goto L_0x00ad
            r5.close()     // Catch:{ Exception -> 0x00ac }
            goto L_0x00ad
        L_0x00ac:
        L_0x00ad:
            if (r3 == 0) goto L_0x00b2
            r3.close()     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            r4.close()     // Catch:{ IOException -> 0x00e0 }
            if (r6 <= 0) goto L_0x00bc
            boolean r9 = _loadUnzipSo(r9, r10, r11)     // Catch:{ IOException -> 0x00e0 }
            return r9
        L_0x00bc:
            return r1
        L_0x00bd:
            r9 = move-exception
            r0 = r5
            goto L_0x00c8
        L_0x00c0:
            r9 = move-exception
            goto L_0x00c8
        L_0x00c2:
            r9 = move-exception
            r3 = r0
            goto L_0x00c8
        L_0x00c5:
            r9 = move-exception
            r2 = r0
            r3 = r2
        L_0x00c8:
            if (r2 == 0) goto L_0x00cf
            r2.close()     // Catch:{ Exception -> 0x00ce }
            goto L_0x00cf
        L_0x00ce:
        L_0x00cf:
            if (r0 == 0) goto L_0x00d6
            r0.close()     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            if (r3 == 0) goto L_0x00db
            r3.close()     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            r4.close()     // Catch:{ IOException -> 0x00e0 }
            throw r9     // Catch:{ IOException -> 0x00e0 }
        L_0x00df:
            return r1
        L_0x00e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SoInstallMgrSdk.unZipSelectedFiles(java.lang.String, int, java.lang.ClassLoader):boolean");
    }
}
