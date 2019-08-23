package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ig {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f82227a;

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f82228a;

        /* renamed from: a  reason: collision with other field name */
        private ij f529a;

        public a(Context context, ij ijVar) {
            this.f529a = ijVar;
            this.f82228a = context;
        }

        public void run() {
            ig.c(this.f82228a, this.f529a);
        }
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void a(Context context, ij ijVar) {
        aj.a(context).a((Runnable) new a(context, ijVar));
    }

    private static void a(Context context, ij ijVar, File file, byte[] bArr) {
        String str;
        int a2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            loop0:
            while (true) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    try {
                        int read = bufferedInputStream2.read(bArr2);
                        if (read == -1) {
                            break loop0;
                        } else if (read != 4) {
                            str = "TinyData read from cache file failed cause lengthBuffer error. size:" + read;
                            break loop0;
                        } else {
                            a2 = ad.a(bArr2);
                            if (a2 <= 0) {
                                break loop0;
                            } else if (a2 > 10240) {
                                break loop0;
                            } else {
                                byte[] bArr3 = new byte[a2];
                                if (bufferedInputStream2.read(bArr3) != a2) {
                                    str = "TinyData read from cache file failed cause buffer size not equal length. size:" + r10 + "__length:" + a2;
                                    break loop0;
                                }
                                byte[] a3 = i.a(bArr, bArr3);
                                if (a3 != null) {
                                    if (a3.length != 0) {
                                        io ioVar = new io();
                                        ju.a(ioVar, a3);
                                        arrayList.add(ioVar);
                                        i++;
                                        i2 += a3.length;
                                        if (i >= 8 || i2 >= 10240) {
                                            b.a("TinyData readTinyDataFromFile upload tiny data by part. items:" + arrayList.size() + " ts:" + System.currentTimeMillis());
                                            ih.a(context, ijVar, (List<io>) arrayList);
                                            arrayList = new ArrayList();
                                        }
                                    }
                                }
                                b.d("TinyData read from cache file failed cause decrypt fail");
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            b.a((Throwable) e);
                            z.a((Closeable) bufferedInputStream);
                        } catch (Throwable th) {
                            th = th;
                            z.a((Closeable) bufferedInputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        z.a((Closeable) bufferedInputStream);
                        throw th;
                    }
                }
            }
            str = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + a2;
            b.d(str);
            ih.a(context, ijVar, (List<io>) arrayList);
            b.a("TinyData readTinyDataFromFile upload tiny data at last. items:" + arrayList.size() + " ts:" + System.currentTimeMillis());
            if (file != null && file.exists() && !file.delete()) {
                b.a("TinyData delete reading temp file failed");
            }
            z.a((Closeable) bufferedInputStream2);
        } catch (Exception e3) {
            e = e3;
            b.a((Throwable) e);
            z.a((Closeable) bufferedInputStream);
        }
    }

    private static void b(Context context) {
        SharedPreferences.Editor edit = c.a(context, "mipush_extra", 4).edit();
        edit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r7, com.xiaomi.push.ij r8) {
        /*
            boolean r0 = f82227a
            if (r0 != 0) goto L_0x00e3
            r0 = 1
            f82227a = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r7.getFilesDir()
            java.lang.String r2 = "tiny_data.data"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x001e
            java.lang.String r7 = "TinyData no ready file to get data."
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r7)
            return
        L_0x001e:
            a(r7)
            byte[] r1 = com.xiaomi.push.service.bf.a((android.content.Context) r7)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.File r4 = r7.getFilesDir()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.String r5 = "tiny_data.lock"
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            com.xiaomi.push.z.a((java.io.File) r3)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.lang.String r5 = "rw"
            r4.<init>(r3, r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ Exception -> 0x0079 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x0079 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            r5.<init>()     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            java.io.File r6 = r7.getFilesDir()     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            r5.append(r6)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            java.lang.String r6 = "/tdReadTemp/"
            r5.append(r6)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            java.lang.String r6 = "tiny_data.data"
            r5.append(r6)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            r0.renameTo(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0073 }
            if (r3 == 0) goto L_0x0093
            boolean r0 = r3.isValid()
            if (r0 == 0) goto L_0x0093
            r3.release()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0093
        L_0x0071:
            r0 = move-exception
            goto L_0x0090
        L_0x0073:
            r7 = move-exception
            r2 = r3
            goto L_0x00cf
        L_0x0076:
            r0 = move-exception
            r2 = r3
            goto L_0x0080
        L_0x0079:
            r0 = move-exception
            goto L_0x0080
        L_0x007b:
            r7 = move-exception
            r4 = r2
            goto L_0x00cf
        L_0x007e:
            r0 = move-exception
            r4 = r2
        L_0x0080:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x0093
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L_0x0093
            r2.release()     // Catch:{ IOException -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
        L_0x0093:
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r7.getFilesDir()
            r2.append(r3)
            java.lang.String r3 = "/tdReadTemp/"
            r2.append(r3)
            java.lang.String r3 = "tiny_data.data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x00c1
            java.lang.String r7 = "TinyData no ready file to get data."
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r7)
            return
        L_0x00c1:
            a(r7, r8, r0, r1)
            r8 = 0
            com.xiaomi.push.Cif.a((boolean) r8)
            b(r7)
            f82227a = r8
            return
        L_0x00ce:
            r7 = move-exception
        L_0x00cf:
            if (r2 == 0) goto L_0x00df
            boolean r8 = r2.isValid()
            if (r8 == 0) goto L_0x00df
            r2.release()     // Catch:{ IOException -> 0x00db }
            goto L_0x00df
        L_0x00db:
            r8 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)
        L_0x00df:
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            throw r7
        L_0x00e3:
            java.lang.String r7 = "TinyData extractTinyData is running"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ig.c(android.content.Context, com.xiaomi.push.ij):void");
    }
}
