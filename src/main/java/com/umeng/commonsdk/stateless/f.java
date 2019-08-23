package com.umeng.commonsdk.stateless;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static int f80913a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f80914b = {10, 1, 11, 5, 4, 15, 7, 9, 23, 3, 1, 6, 8, 12, 13, 91};

    /* renamed from: c  reason: collision with root package name */
    private static Object f80915c = new Object();

    public static boolean a(long j, long j2) {
        return j > j2;
    }

    public static byte[] b(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            return instance.digest();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte valueOf : bArr) {
            stringBuffer.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
        }
        return stringBuffer.toString().toLowerCase(Locale.US);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(byte[] r5) throws java.io.IOException {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x0046
            int r1 = r5.length
            if (r1 > 0) goto L_0x0007
            goto L_0x0046
        L_0x0007:
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
            r1.setInput(r5)
            r1.finish()
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]
            r2 = 0
            f80913a = r2
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003e }
            r3.<init>()     // Catch:{ all -> 0x003e }
        L_0x001e:
            boolean r0 = r1.finished()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0031
            int r0 = r1.deflate(r5)     // Catch:{ all -> 0x003c }
            int r4 = f80913a     // Catch:{ all -> 0x003c }
            int r4 = r4 + r0
            f80913a = r4     // Catch:{ all -> 0x003c }
            r3.write(r5, r2, r0)     // Catch:{ all -> 0x003c }
            goto L_0x001e
        L_0x0031:
            r1.end()     // Catch:{ all -> 0x003c }
            r3.close()
            byte[] r5 = r3.toByteArray()
            return r5
        L_0x003c:
            r5 = move-exception
            goto L_0x0040
        L_0x003e:
            r5 = move-exception
            r3 = r0
        L_0x0040:
            if (r3 == 0) goto L_0x0045
            r3.close()
        L_0x0045:
            throw r5
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.f.a(byte[]):byte[]");
    }

    public static File a(Context context) {
        File file = null;
        try {
            synchronized (f80915c) {
                try {
                    ULog.i("walle", "get last envelope begin, thread is " + Thread.currentThread());
                    if (!(context == null || context.getApplicationContext() == null)) {
                        String str = context.getApplicationContext().getFilesDir() + "/stateless";
                        if (!TextUtils.isEmpty(str)) {
                            File file2 = new File(str);
                            if (file2.isDirectory()) {
                                File[] listFiles = file2.listFiles();
                                if (listFiles != null && listFiles.length > 0) {
                                    File file3 = null;
                                    int i = 0;
                                    while (i < listFiles.length) {
                                        try {
                                            File file4 = listFiles[i];
                                            if (file4 != null && file4.isDirectory()) {
                                                File[] listFiles2 = file4.listFiles();
                                                if (listFiles2 != null && listFiles2.length > 0) {
                                                    Arrays.sort(listFiles2, new Comparator<File>() {
                                                        /* renamed from: a */
                                                        public final int compare(File file, File file2) {
                                                            long lastModified = file.lastModified() - file2.lastModified();
                                                            if (lastModified > 0) {
                                                                return 1;
                                                            }
                                                            if (lastModified == 0) {
                                                                return 0;
                                                            }
                                                            return -1;
                                                        }
                                                    });
                                                    File file5 = listFiles2[0];
                                                    if (file5 != null && (file3 == null || file3.lastModified() > file5.lastModified())) {
                                                        file3 = file5;
                                                    }
                                                }
                                            }
                                            i++;
                                        } catch (Throwable th) {
                                            th = th;
                                            file = file3;
                                            throw th;
                                        }
                                    }
                                    file = file3;
                                }
                            }
                        }
                    }
                    ULog.i("walle", "get last envelope end, thread is " + Thread.currentThread());
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            UMCrashManager.reportCrash(context, th3);
        }
        return file;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:28|(2:30|31)|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|8|9|(1:11)|12|(2:14|15)|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00a9 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6 A[SYNTHETIC, Splitter:B:30:0x00a6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x00a9=Splitter:B:32:0x00a9, B:16:0x007a=Splitter:B:16:0x007a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r13) throws java.io.IOException {
        /*
            java.lang.Object r0 = f80915c
            monitor-enter(r0)
            java.lang.String r1 = "walle"
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00aa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            java.lang.String r5 = "[stateless] begin read envelope, thread is "
            r4.<init>(r5)     // Catch:{ all -> 0x00aa }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00aa }
            r4.append(r5)     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00aa }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x00aa }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r1, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00aa }
            r1 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0083, all -> 0x007e }
            java.lang.String r4 = "r"
            r3.<init>(r13, r4)     // Catch:{ IOException -> 0x0083, all -> 0x007e }
            java.nio.channels.FileChannel r13 = r3.getChannel()     // Catch:{ IOException -> 0x0083, all -> 0x007e }
            java.nio.channels.FileChannel$MapMode r7 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ IOException -> 0x007c }
            r8 = 0
            long r10 = r13.size()     // Catch:{ IOException -> 0x007c }
            r6 = r13
            java.nio.MappedByteBuffer r1 = r6.map(r7, r8, r10)     // Catch:{ IOException -> 0x007c }
            java.nio.MappedByteBuffer r1 = r1.load()     // Catch:{ IOException -> 0x007c }
            java.io.PrintStream r3 = java.lang.System.out     // Catch:{ IOException -> 0x007c }
            boolean r4 = r1.isLoaded()     // Catch:{ IOException -> 0x007c }
            r3.println(r4)     // Catch:{ IOException -> 0x007c }
            long r3 = r13.size()     // Catch:{ IOException -> 0x007c }
            int r3 = (int) r3     // Catch:{ IOException -> 0x007c }
            byte[] r3 = new byte[r3]     // Catch:{ IOException -> 0x007c }
            int r4 = r1.remaining()     // Catch:{ IOException -> 0x007c }
            if (r4 <= 0) goto L_0x005a
            int r4 = r1.remaining()     // Catch:{ IOException -> 0x007c }
            r1.get(r3, r5, r4)     // Catch:{ IOException -> 0x007c }
        L_0x005a:
            java.lang.String r1 = "walle"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x007c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x007c }
            java.lang.String r7 = "[stateless] end read envelope, thread id "
            r6.<init>(r7)     // Catch:{ IOException -> 0x007c }
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x007c }
            r6.append(r7)     // Catch:{ IOException -> 0x007c }
            java.lang.String r6 = r6.toString()     // Catch:{ IOException -> 0x007c }
            r4[r5] = r6     // Catch:{ IOException -> 0x007c }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r1, (java.lang.Object[]) r4)     // Catch:{ IOException -> 0x007c }
            if (r13 == 0) goto L_0x007a
            r13.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            return r3
        L_0x007c:
            r1 = move-exception
            goto L_0x0087
        L_0x007e:
            r13 = move-exception
            r12 = r1
            r1 = r13
            r13 = r12
            goto L_0x00a4
        L_0x0083:
            r13 = move-exception
            r12 = r1
            r1 = r13
            r13 = r12
        L_0x0087:
            java.lang.String r3 = "walle"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00a3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = "[stateless] write envelope, e is "
            r4.<init>(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.String r6 = r1.getMessage()     // Catch:{ all -> 0x00a3 }
            r4.append(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00a3 }
            r2[r5] = r4     // Catch:{ all -> 0x00a3 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r3, (java.lang.Object[]) r2)     // Catch:{ all -> 0x00a3 }
            throw r1     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            if (r13 == 0) goto L_0x00a9
            r13.close()     // Catch:{ IOException -> 0x00a9 }
        L_0x00a9:
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00aa }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.f.a(java.lang.String):byte[]");
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
        instance.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(f80914b));
        return instance.doFinal(bArr);
    }

    public static void a(Context context, String str, int i) {
        if (str == null) {
            try {
                ULog.i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        } else {
            File file = new File(str);
            if (!file.isDirectory()) {
                ULog.i("AmapLBS", "[lbs-build] fileDir not exist, thread is " + Thread.currentThread());
                return;
            }
            synchronized (f80915c) {
                File[] listFiles = file.listFiles();
                ULog.i("AmapLBS", "[lbs-build] delete file begin " + listFiles.length + ", thread is " + Thread.currentThread());
                if (listFiles == null || listFiles.length < i) {
                    ULog.i("AmapLBS", "[lbs-build] file size < max");
                } else {
                    ULog.i("AmapLBS", "[lbs-build] file size >= max");
                    ArrayList arrayList = new ArrayList();
                    for (File file2 : listFiles) {
                        if (file2 != null) {
                            arrayList.add(file2);
                        }
                    }
                    if (arrayList.size() >= i) {
                        Collections.sort(arrayList, new Comparator<File>() {
                            /* renamed from: a */
                            public final int compare(File file, File file2) {
                                if (file != null && file2 != null && file.lastModified() < file2.lastModified()) {
                                    return -1;
                                }
                                if (file == null || file2 == null || file.lastModified() != file2.lastModified()) {
                                    return 1;
                                }
                                return 0;
                            }
                        });
                        if (ULog.DEBUG) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                ULog.i("AmapLBS", "[lbs-build] overrun native file is " + ((File) arrayList.get(i2)).getPath());
                            }
                        }
                        for (int i3 = 0; i3 <= arrayList.size() - i; i3++) {
                            if (arrayList.get(i3) != null) {
                                ULog.i("AmapLBS", "[lbs-build] overrun remove file is " + ((File) arrayList.get(i3)).getPath());
                                try {
                                    ((File) arrayList.get(i3)).delete();
                                    arrayList.remove(i3);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                ULog.i("AmapLBS", "[lbs-build] delete file end " + listFiles.length + ", thread is " + Thread.currentThread());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c6, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        r9 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f1 A[SYNTHETIC, Splitter:B:43:0x00f1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10, byte[] r11) {
        /*
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L_0x016f
            r2 = 0
            java.lang.Object r3 = f80915c     // Catch:{ IOException -> 0x010d, Throwable -> 0x00cf }
            monitor-enter(r3)     // Catch:{ IOException -> 0x010d, Throwable -> 0x00cf }
            java.lang.String r4 = "walle"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "[stateless] begin write envelope, thread is "
            r6.<init>(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c2 }
            r6.append(r7)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00c2 }
            r5[r1] = r6     // Catch:{ all -> 0x00c2 }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r4, (java.lang.Object[]) r5)     // Catch:{ all -> 0x00c2 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r5.<init>()     // Catch:{ all -> 0x00c2 }
            java.io.File r6 = r8.getFilesDir()     // Catch:{ all -> 0x00c2 }
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "/stateless"
            r5.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c2 }
            r4.<init>(r5)     // Catch:{ all -> 0x00c2 }
            boolean r5 = r4.isDirectory()     // Catch:{ all -> 0x00c2 }
            if (r5 != 0) goto L_0x0046
            r4.mkdir()     // Catch:{ all -> 0x00c2 }
        L_0x0046:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r6.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r4 = r4.getPath()     // Catch:{ all -> 0x00c2 }
            r6.append(r4)     // Catch:{ all -> 0x00c2 }
            java.lang.String r4 = "/"
            r6.append(r4)     // Catch:{ all -> 0x00c2 }
            r6.append(r9)     // Catch:{ all -> 0x00c2 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x00c2 }
            r5.<init>(r9)     // Catch:{ all -> 0x00c2 }
            boolean r9 = r5.isDirectory()     // Catch:{ all -> 0x00c2 }
            if (r9 != 0) goto L_0x006c
            r5.mkdir()     // Catch:{ all -> 0x00c2 }
        L_0x006c:
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00c2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r4.<init>()     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x00c2 }
            r4.append(r5)     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ all -> 0x00c2 }
            r4.append(r10)     // Catch:{ all -> 0x00c2 }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x00c2 }
            r9.<init>(r10)     // Catch:{ all -> 0x00c2 }
            boolean r10 = r9.exists()     // Catch:{ all -> 0x00c2 }
            if (r10 != 0) goto L_0x0092
            r9.createNewFile()     // Catch:{ all -> 0x00c2 }
        L_0x0092:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c2 }
            r10.<init>(r9)     // Catch:{ all -> 0x00c2 }
            r10.write(r11)     // Catch:{ all -> 0x00bf }
            r10.close()     // Catch:{ all -> 0x00bf }
            monitor-exit(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r8 = "walle"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "[stateless] end write envelope, thread id "
            r10.<init>(r11)
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9[r1] = r10
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r8, (java.lang.Object[]) r9)
            r10 = 1
            goto L_0x0170
        L_0x00bc:
            r9 = move-exception
            r10 = 1
            goto L_0x00c4
        L_0x00bf:
            r9 = move-exception
            r2 = r10
            goto L_0x00c3
        L_0x00c2:
            r9 = move-exception
        L_0x00c3:
            r10 = 0
        L_0x00c4:
            monitor-exit(r3)     // Catch:{ all -> 0x00ca }
            throw r9     // Catch:{ IOException -> 0x00c8, Throwable -> 0x00c6 }
        L_0x00c6:
            r9 = move-exception
            goto L_0x00d1
        L_0x00c8:
            r9 = move-exception
            goto L_0x010f
        L_0x00ca:
            r9 = move-exception
            goto L_0x00c4
        L_0x00cc:
            r8 = move-exception
            goto L_0x014e
        L_0x00cf:
            r9 = move-exception
            r10 = 0
        L_0x00d1:
            java.lang.String r11 = "walle"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = "[stateless] write envelope, e is "
            r4.<init>(r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = r9.getMessage()     // Catch:{ all -> 0x00cc }
            r4.append(r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00cc }
            r3[r1] = r4     // Catch:{ all -> 0x00cc }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r11, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00cc }
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r8, r9)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x00f4
            r2.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            java.lang.String r8 = "walle"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "[stateless] end write envelope, thread id "
            r11.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r9[r1] = r11
            goto L_0x014a
        L_0x010d:
            r9 = move-exception
            r10 = 0
        L_0x010f:
            java.lang.String r11 = "walle"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x00cc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = "[stateless] write envelope, e is "
            r4.<init>(r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r5 = r9.getMessage()     // Catch:{ all -> 0x00cc }
            r4.append(r5)     // Catch:{ all -> 0x00cc }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00cc }
            r3[r1] = r4     // Catch:{ all -> 0x00cc }
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r11, (java.lang.Object[]) r3)     // Catch:{ all -> 0x00cc }
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r8, r9)     // Catch:{ all -> 0x00cc }
            if (r2 == 0) goto L_0x0132
            r2.close()     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            java.lang.String r8 = "walle"
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "[stateless] end write envelope, thread id "
            r11.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r9[r1] = r11
        L_0x014a:
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r8, (java.lang.Object[]) r9)
            goto L_0x0170
        L_0x014e:
            if (r2 == 0) goto L_0x0153
            r2.close()     // Catch:{ IOException -> 0x0153 }
        L_0x0153:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "[stateless] end write envelope, thread id "
            r10.<init>(r11)
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9[r1] = r10
            java.lang.String r10 = "walle"
            com.umeng.commonsdk.statistics.common.ULog.i((java.lang.String) r10, (java.lang.Object[]) r9)
            throw r8
        L_0x016f:
            r10 = 0
        L_0x0170:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.stateless.f.a(android.content.Context, java.lang.String, java.lang.String, byte[]):boolean");
    }
}
