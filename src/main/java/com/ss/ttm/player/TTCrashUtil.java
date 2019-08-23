package com.ss.ttm.player;

import android.content.Context;
import android.os.Environment;
import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class TTCrashUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getBase64SampleCrash(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 90734, new Class[]{String.class}, String.class)) {
            return Base64.encodeToString(str.getBytes(), 0);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 90734, new Class[]{String.class}, String.class);
    }

    public static void checkLogDir(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 90760, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 90760, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(String.format("%s/ttplayer_logs", new Object[]{str}));
        if (!file.exists()) {
            file.mkdir();
        } else if (file.isDirectory()) {
            for (File delete : file.listFiles()) {
                delete.delete();
            }
            file.delete();
        }
    }

    public static void checkTrackDir(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, changeQuickRedirect, true, 90757, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, changeQuickRedirect, true, 90757, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(String.format("%s/ttplayer_logs", new Object[]{str}));
        if (!file.exists()) {
            file.mkdir();
        }
    }

    private static void deleteTrackFile(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90752, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90752, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (file.exists()) {
            file.delete();
        }
    }

    public static final String existsCrashFilePath(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, changeQuickRedirect, true, 90733, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, changeQuickRedirect, true, 90733, new Class[]{Context.class}, String.class);
        } else if (TTPlayerConfiger.getValue(18, 1) == 1) {
            String appCrashFilePath = TTPlayerConfiger.getAppCrashFilePath(context);
            if (appCrashFilePath == null || !new File(appCrashFilePath).exists()) {
                return null;
            }
            return appCrashFilePath;
        } else {
            String appCrashFilePath2 = TTPlayerConfiger.getAppCrashFilePath2(context);
            if (appCrashFilePath2 != null && new File(appCrashFilePath2).exists()) {
                return appCrashFilePath2;
            }
            String plugerCrashFilePath = TTPlayerConfiger.getPlugerCrashFilePath(context);
            if (plugerCrashFilePath != null && new File(plugerCrashFilePath).exists()) {
                return plugerCrashFilePath;
            }
            String externalStorageDirectoryCrashFilePath = TTPlayerConfiger.getExternalStorageDirectoryCrashFilePath();
            if (externalStorageDirectoryCrashFilePath != null && !new File(externalStorageDirectoryCrashFilePath).exists()) {
                externalStorageDirectoryCrashFilePath = null;
            }
            return externalStorageDirectoryCrashFilePath;
        }
    }

    public static void compress(InputStream inputStream, OutputStream outputStream) throws Exception {
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2, outputStream2}, null, changeQuickRedirect, true, 90736, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inputStream2, outputStream2}, null, changeQuickRedirect, true, 90736, new Class[]{InputStream.class, OutputStream.class}, Void.TYPE);
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream2);
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream2.read(bArr, 0, 10240);
            if (read != -1) {
                gZIPOutputStream.write(bArr, 0, read);
            } else {
                gZIPOutputStream.flush();
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                return;
            }
        }
    }

    public static void deleteCrashFile(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 90731, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 90731, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (TTPlayerConfiger.getValue(6, false)) {
            copyFile(Environment.getExternalStorageDirectory() + "/ttplayer.dump", str2, true, true);
        } else {
            File file = new File(str2);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void deleteDebugTrackFile(long j, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90753, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90753, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        deleteTrackFile(getDebugTrackFilePath(j, str));
    }

    public static void deleteTrackFile(long j, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90754, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90754, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        deleteTrackFile(getTrackFilePath(j, str));
    }

    public static boolean existsCrashFile(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, changeQuickRedirect, true, 90732, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, changeQuickRedirect, true, 90732, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null && str2 == null) {
            return false;
        } else {
            return new File(str2).exists();
        }
    }

    public static boolean existsTrackFile(long j, String str) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90755, new Class[]{Long.TYPE, String.class}, Boolean.TYPE)) {
            return new File(getTrackFilePath(j, str)).exists();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90755, new Class[]{Long.TYPE, String.class}, Boolean.TYPE)).booleanValue();
    }

    private static String getDebugTrackFilePath(long j, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90750, new Class[]{Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90750, new Class[]{Long.TYPE, String.class}, String.class);
        }
        return String.format("%s/ttplayer_logs/%d_d.log", new Object[]{str, Long.valueOf(j)});
    }

    public static String getTrackFilePath(long j, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90751, new Class[]{Long.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90751, new Class[]{Long.TYPE, String.class}, String.class);
        }
        return String.format("%s/ttplayer_logs/%d.log", new Object[]{str, Long.valueOf(j)});
    }

    public static boolean existLogsFile(long j, String str) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90758, new Class[]{Long.TYPE, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str}, null, changeQuickRedirect, true, 90758, new Class[]{Long.TYPE, String.class}, Boolean.TYPE)).booleanValue();
        }
        String valueOf = String.valueOf(j);
        File file = new File(String.format("%s/ttplayer_logs", new Object[]{str}));
        if (file.exists() && file.isDirectory()) {
            for (File name : file.listFiles()) {
                String name2 = name.getName();
                if (name2 != null && !name2.startsWith(valueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[SYNTHETIC, Splitter:B:20:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getTrackFileInfos(java.io.File r19, java.lang.StringBuilder r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.File> r4 = java.io.File.class
            r8[r10] = r4
            java.lang.Class<java.lang.StringBuilder> r4 = java.lang.StringBuilder.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 90746(0x1627a, float:1.27162E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 90746(0x1627a, float:1.27162E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r0[r10] = r1
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004c:
            r2 = 0
            boolean r3 = r19.exists()     // Catch:{ Throwable -> 0x006f }
            if (r3 != 0) goto L_0x0054
            return r10
        L_0x0054:
            r3 = 1024(0x400, float:1.435E-42)
            char[] r4 = new char[r3]     // Catch:{ Throwable -> 0x006f }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ Throwable -> 0x006f }
            r5.<init>(r0)     // Catch:{ Throwable -> 0x006f }
        L_0x005d:
            int r0 = r5.read(r4)     // Catch:{ Throwable -> 0x006c }
            if (r0 <= 0) goto L_0x0068
            r1.append(r4, r10, r0)     // Catch:{ Throwable -> 0x006c }
            if (r0 >= r3) goto L_0x005d
        L_0x0068:
            r5.close()     // Catch:{ Throwable -> 0x006c }
            goto L_0x0086
        L_0x006c:
            r0 = move-exception
            r2 = r5
            goto L_0x0070
        L_0x006f:
            r0 = move-exception
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            java.lang.String r2 = "track message:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = "\r\n"
            r1.append(r0)
        L_0x0086:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.getTrackFileInfos(java.io.File, java.lang.StringBuilder):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084 A[SYNTHETIC, Splitter:B:33:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090 A[SYNTHETIC, Splitter:B:42:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void saveException(java.lang.Throwable r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 90739(0x16273, float:1.27152E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 90739(0x16273, float:1.27152E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return
        L_0x0048:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 == 0) goto L_0x0054
            return
        L_0x0054:
            r1 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0088, all -> 0x007b }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0088, all -> 0x007b }
            java.io.PrintStream r2 = new java.io.PrintStream     // Catch:{ Exception -> 0x0079, all -> 0x0077 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0079, all -> 0x0077 }
            java.lang.String r1 = "EXCE"
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r2.write(r1)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r0, (java.io.PrintStream) r2)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r2.close()
            r3.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            return
        L_0x0072:
            r0 = move-exception
            r1 = r2
            goto L_0x007d
        L_0x0075:
            r1 = r2
            goto L_0x0089
        L_0x0077:
            r0 = move-exception
            goto L_0x007d
        L_0x0079:
            goto L_0x0089
        L_0x007b:
            r0 = move-exception
            r3 = r1
        L_0x007d:
            if (r1 == 0) goto L_0x0082
            r1.close()
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.close()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            throw r0
        L_0x0088:
            r3 = r1
        L_0x0089:
            if (r1 == 0) goto L_0x008e
            r1.close()
        L_0x008e:
            if (r3 == 0) goto L_0x0094
            r3.close()     // Catch:{ Exception -> 0x0093 }
        L_0x0093:
            return
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.saveException(java.lang.Throwable, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c A[SYNTHETIC, Splitter:B:22:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[SYNTHETIC, Splitter:B:28:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveLowMemoryInfo(int r18, java.lang.String r19) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r9 = 0
            r2[r9] = r3
            r10 = 1
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 90740(0x16274, float:1.27154E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004b
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r11[r9] = r2
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect
            r14 = 1
            r15 = 90740(0x16274, float:1.27154E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x004b:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0057
            return
        L_0x0057:
            r2 = 0
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x0080, all -> 0x0078 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0080, all -> 0x0078 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r1 = "LOWM\r\nrecv low memory warring info.level:"
            r0.<init>(r1)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r1 = r18
            r0.append(r1)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r3.write(r0)     // Catch:{ IOException -> 0x0076, all -> 0x0074 }
            r3.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            return
        L_0x0074:
            r0 = move-exception
            goto L_0x007a
        L_0x0076:
            r2 = r3
            goto L_0x0080
        L_0x0078:
            r0 = move-exception
            r3 = r2
        L_0x007a:
            if (r3 == 0) goto L_0x007f
            r3.close()     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            throw r0
        L_0x0080:
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            return
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.saveLowMemoryInfo(int, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085 A[SYNTHETIC, Splitter:B:21:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[SYNTHETIC, Splitter:B:27:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveStopInfo(java.lang.String r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 90741(0x16275, float:1.27155E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0045
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 90741(0x16275, float:1.27155E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0045:
            r2 = 0
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0052
            return
        L_0x0052:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ IOException -> 0x0089, all -> 0x0081 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0089, all -> 0x0081 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.lang.String r2 = "STOP recv stop info:"
            r0.<init>(r2)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            r0.append(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.lang.String r1 = ".time:"
            r0.append(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.lang.String r1 = com.ss.ttm.utils.AVTime.getFormatNow()     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            r0.append(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.lang.String r1 = "\r\n"
            r0.append(r1)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            r4.write(r0)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            r4.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            return
        L_0x007d:
            r0 = move-exception
            goto L_0x0083
        L_0x007f:
            r2 = r4
            goto L_0x0089
        L_0x0081:
            r0 = move-exception
            r4 = r2
        L_0x0083:
            if (r4 == 0) goto L_0x0088
            r4.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            throw r0
        L_0x0089:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ IOException -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.saveStopInfo(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084 A[SYNTHETIC, Splitter:B:21:0x0084] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getTrackFileInfos(java.lang.String r19, java.lang.StringBuilder r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.StringBuilder> r4 = java.lang.StringBuilder.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 90747(0x1627b, float:1.27164E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 90747(0x1627b, float:1.27164E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004c:
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0081 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x0081 }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x0081 }
            if (r4 != 0) goto L_0x0066
            java.lang.String r3 = "path"
            r1.append(r3)     // Catch:{ Throwable -> 0x0081 }
            r1.append(r0)     // Catch:{ Throwable -> 0x0081 }
            java.lang.String r0 = " not exists.\r\n"
            r1.append(r0)     // Catch:{ Throwable -> 0x0081 }
            return r10
        L_0x0066:
            r0 = 1024(0x400, float:1.435E-42)
            char[] r4 = new char[r0]     // Catch:{ Throwable -> 0x0081 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ Throwable -> 0x0081 }
            r5.<init>(r3)     // Catch:{ Throwable -> 0x0081 }
        L_0x006f:
            int r2 = r5.read(r4)     // Catch:{ Throwable -> 0x007e }
            if (r2 <= 0) goto L_0x007a
            r1.append(r4, r10, r2)     // Catch:{ Throwable -> 0x007e }
            if (r2 >= r0) goto L_0x006f
        L_0x007a:
            r5.close()     // Catch:{ Throwable -> 0x007e }
            goto L_0x0098
        L_0x007e:
            r0 = move-exception
            r2 = r5
            goto L_0x0082
        L_0x0081:
            r0 = move-exception
        L_0x0082:
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            java.lang.String r2 = "track message:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = "\r\n"
            r1.append(r0)
        L_0x0098:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.getTrackFileInfos(java.lang.String, java.lang.StringBuilder):boolean");
    }

    public static void addTrackInfo(long j, String str, String str2) {
        long j2 = j;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str, str3}, null, changeQuickRedirect, true, 90743, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str, str3}, null, changeQuickRedirect, true, 90743, new Class[]{Long.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        appendTrackInfo(getTrackFilePath(j, str), true, str3);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0075 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void appendTrackInfo(java.lang.String r20, boolean r21, java.lang.String r22) {
        /*
            r0 = r20
            r1 = r22
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Byte r4 = java.lang.Byte.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r11] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 90742(0x16276, float:1.27157E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005b
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)
            r13[r11] = r0
            r13[r12] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
            r16 = 1
            r17 = 90742(0x16276, float:1.27157E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005b:
            r2 = 0
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ Exception -> 0x0075, all -> 0x0070 }
            r4 = r21
            r3.<init>(r0, r4)     // Catch:{ Exception -> 0x0075, all -> 0x0070 }
            r3.write(r1)     // Catch:{ Exception -> 0x006e, all -> 0x006b }
            r3.close()     // Catch:{ Exception -> 0x006a }
            return
        L_0x006a:
            return
        L_0x006b:
            r0 = move-exception
            r2 = r3
            goto L_0x0071
        L_0x006e:
            r2 = r3
            goto L_0x0075
        L_0x0070:
            r0 = move-exception
        L_0x0071:
            r2.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            throw r0
        L_0x0075:
            r2.close()     // Catch:{ Exception -> 0x0079 }
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.appendTrackInfo(java.lang.String, boolean, java.lang.String):void");
    }

    public static final boolean moveFile(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90738, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return copyFile(str3, str4, z, true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z)}, null, changeQuickRedirect, true, 90738, new Class[]{String.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public static boolean readDebugTrackInfos(long j, String str, StringBuilder sb) {
        long j2 = j;
        StringBuilder sb2 = sb;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), str, sb2}, null, changeQuickRedirect, true, 90749, new Class[]{Long.TYPE, String.class, StringBuilder.class}, Boolean.TYPE)) {
            return getTrackFileInfos(getDebugTrackFilePath(j, str), sb2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str, sb2}, null, changeQuickRedirect, true, 90749, new Class[]{Long.TYPE, String.class, StringBuilder.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean readTrackInfos(long j, String str, StringBuilder sb) {
        long j2 = j;
        StringBuilder sb2 = sb;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2), str, sb2}, null, changeQuickRedirect, true, 90748, new Class[]{Long.TYPE, String.class, StringBuilder.class}, Boolean.TYPE)) {
            return getTrackFileInfos(getTrackFilePath(j, str), sb2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str, sb2}, null, changeQuickRedirect, true, 90748, new Class[]{Long.TYPE, String.class, StringBuilder.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:23|(0)|29|30|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00af */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ac A[SYNTHETIC, Splitter:B:27:0x00ac] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getCrashFileContext(android.content.Context r21, java.lang.String r22, java.lang.StringBuilder r23) {
        /*
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r21
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = changeQuickRedirect
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r12] = r5
            java.lang.Class<java.lang.StringBuilder> r5 = java.lang.StringBuilder.class
            r9[r13] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = 0
            r7 = 1
            r8 = 90735(0x1626f, float:1.27147E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0056
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r21
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 90735(0x1626f, float:1.27147E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0056:
            r3 = 0
            if (r21 != 0) goto L_0x0061
            if (r1 != 0) goto L_0x0061
            java.lang.String r0 = "context or path is null.\r\n"
            r2.append(r0)
            return r3
        L_0x0061:
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x007a
            java.lang.String r0 = "file not exist.path:"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "\r\n"
            r2.append(r0)
            return r3
        L_0x007a:
            long r4 = r0.length()
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x008a
            java.lang.String r0 = "file size is zore.\r\n"
            r2.append(r0)
            return r3
        L_0x008a:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a8 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00a8 }
            compress(r4, r1)     // Catch:{ Exception -> 0x00a6 }
            r4.close()     // Catch:{ Exception -> 0x00a6 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x00a6 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r11)     // Catch:{ Exception -> 0x00a6 }
            r1.close()     // Catch:{ Exception -> 0x00a6 }
            return r0
        L_0x00a6:
            r0 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r0 = move-exception
            r4 = r3
        L_0x00aa:
            if (r4 == 0) goto L_0x00af
            r4.close()     // Catch:{ IOException -> 0x00af }
        L_0x00af:
            r1.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            java.lang.String r1 = "gzip file is error.error:"
            r2.append(r1)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.getCrashFileContext(android.content.Context, java.lang.String, java.lang.StringBuilder):java.lang.String");
    }

    public static boolean moveTrackFile(long j, long j2, String str) {
        long j3 = j;
        long j4 = j2;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str2}, null, changeQuickRedirect, true, 90756, new Class[]{Long.TYPE, Long.TYPE, String.class}, Boolean.TYPE)) {
            return new File(getTrackFilePath(j3, str2)).renameTo(new File(getTrackFilePath(j2, str)));
        }
        Object[] objArr = {new Long(j3), new Long(j4), str2};
        return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, 90756, new Class[]{Long.TYPE, Long.TYPE, String.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean readLogsInfo(long j, String str, StringBuilder sb) {
        long j2 = j;
        StringBuilder sb2 = sb;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str, sb2}, null, changeQuickRedirect, true, 90759, new Class[]{Long.TYPE, String.class, StringBuilder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2), str, sb2}, null, changeQuickRedirect, true, 90759, new Class[]{Long.TYPE, String.class, StringBuilder.class}, Boolean.TYPE)).booleanValue();
        }
        String valueOf = String.valueOf(j);
        File file = new File(String.format("%s/ttplayer_logs", new Object[]{str}));
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                String name = file2.getName();
                if (name == null || name.startsWith(valueOf) || !getTrackFileInfos(file2, sb2)) {
                    i++;
                } else {
                    file2.delete();
                    return true;
                }
            }
        }
        return false;
    }

    public static void addDebugTrackInfo(long j, String str, String str2, boolean z) {
        long j2 = j;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str, str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90745, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), str, str3, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 90745, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        appendTrackInfo(getDebugTrackFilePath(j, str), z, str3);
    }

    public static void addTrackInfo(long j, String str, String str2, boolean z) {
        long j2 = j;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str, str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 90744, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j2), str, str3, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, 90744, new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        appendTrackInfo(getTrackFilePath(j, str), z, str3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e8 A[SYNTHETIC, Splitter:B:46:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed A[Catch:{ IOException -> 0x00f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f4 A[SYNTHETIC, Splitter:B:56:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f9 A[Catch:{ IOException -> 0x00fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0100 A[SYNTHETIC, Splitter:B:66:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0105 A[Catch:{ IOException -> 0x0108 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean copyFile(java.lang.String r21, java.lang.String r22, boolean r23, boolean r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = 4
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            java.lang.Byte r4 = java.lang.Byte.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r24)
            r13 = 3
            r3[r13] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r12] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r8[r13] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 90737(0x16271, float:1.2715E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0077
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r0
            r14[r11] = r1
            java.lang.Byte r0 = java.lang.Byte.valueOf(r23)
            r14[r12] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = changeQuickRedirect
            r17 = 1
            r18 = 90737(0x16271, float:1.2715E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0077:
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x0083
            return r10
        L_0x0083:
            boolean r1 = r2.isFile()
            if (r1 != 0) goto L_0x008a
            return r10
        L_0x008a:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x00a0
            if (r23 == 0) goto L_0x00b5
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            r3.delete()
            goto L_0x00b5
        L_0x00a0:
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00b5
            java.io.File r0 = r1.getParentFile()
            boolean r0 = r0.mkdirs()
            if (r0 != 0) goto L_0x00b5
            return r10
        L_0x00b5:
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00fd, IOException -> 0x00f1, all -> 0x00e4 }
            r4.<init>(r2)     // Catch:{ FileNotFoundException -> 0x00fd, IOException -> 0x00f1, all -> 0x00e4 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00fe, IOException -> 0x00f2, all -> 0x00e2 }
            r5.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00fe, IOException -> 0x00f2, all -> 0x00e2 }
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00de, all -> 0x00db }
        L_0x00c4:
            int r1 = r4.read(r0)     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00de, all -> 0x00db }
            r3 = -1
            if (r1 == r3) goto L_0x00cf
            r5.write(r0, r10, r1)     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00de, all -> 0x00db }
            goto L_0x00c4
        L_0x00cf:
            if (r24 == 0) goto L_0x00d4
            r2.delete()     // Catch:{ FileNotFoundException -> 0x00e0, IOException -> 0x00de, all -> 0x00db }
        L_0x00d4:
            r5.close()     // Catch:{ IOException -> 0x00da }
            r4.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r11
        L_0x00db:
            r0 = move-exception
            r3 = r5
            goto L_0x00e6
        L_0x00de:
            r3 = r5
            goto L_0x00f2
        L_0x00e0:
            r3 = r5
            goto L_0x00fe
        L_0x00e2:
            r0 = move-exception
            goto L_0x00e6
        L_0x00e4:
            r0 = move-exception
            r4 = r3
        L_0x00e6:
            if (r3 == 0) goto L_0x00eb
            r3.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00eb:
            if (r4 == 0) goto L_0x00f0
            r4.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            throw r0
        L_0x00f1:
            r4 = r3
        L_0x00f2:
            if (r3 == 0) goto L_0x00f7
            r3.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00f7:
            if (r4 == 0) goto L_0x00fc
            r4.close()     // Catch:{ IOException -> 0x00fc }
        L_0x00fc:
            return r10
        L_0x00fd:
            r4 = r3
        L_0x00fe:
            if (r3 == 0) goto L_0x0103
            r3.close()     // Catch:{ IOException -> 0x0108 }
        L_0x0103:
            if (r4 == 0) goto L_0x0108
            r4.close()     // Catch:{ IOException -> 0x0108 }
        L_0x0108:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttm.player.TTCrashUtil.copyFile(java.lang.String, java.lang.String, boolean, boolean):boolean");
    }
}
