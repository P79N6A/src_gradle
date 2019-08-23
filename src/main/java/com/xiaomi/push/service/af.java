package com.xiaomi.push.service;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.xiaomi.push.az;
import com.xiaomi.push.y;
import com.xiaomi.push.z;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class af {

    /* renamed from: a  reason: collision with root package name */
    private static long f82488a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f82489a;

        /* renamed from: a  reason: collision with other field name */
        byte[] f923a;

        public a(byte[] bArr, int i) {
            this.f923a = bArr;
            this.f82489a = i;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f82490a;

        /* renamed from: a  reason: collision with other field name */
        public Bitmap f924a;

        public b(Bitmap bitmap, long j) {
            this.f924a = bitmap;
            this.f82490a = j;
        }
    }

    private static int a(Context context, InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            com.xiaomi.channel.commonutils.logger.b.a("decode dimension failed for bitmap.");
            return 1;
        }
        int round = Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * 48.0f);
        if (options.outWidth <= round || options.outHeight <= round) {
            return 1;
        }
        return Math.min(options.outWidth / round, options.outHeight / round);
    }

    public static Bitmap a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        IOException e2;
        InputStream inputStream2;
        int a2;
        Uri parse = Uri.parse(str);
        InputStream inputStream3 = null;
        try {
            inputStream = context.getContentResolver().openInputStream(parse);
            try {
                a2 = a(context, inputStream);
                inputStream2 = context.getContentResolver().openInputStream(parse);
            } catch (IOException e3) {
                e2 = e3;
                inputStream2 = null;
                try {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                    z.a((Closeable) inputStream2);
                    z.a((Closeable) inputStream);
                    return null;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    InputStream inputStream4 = inputStream2;
                    th = th3;
                    inputStream = inputStream;
                    inputStream3 = inputStream4;
                    z.a((Closeable) inputStream3);
                    z.a((Closeable) inputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                z.a((Closeable) inputStream3);
                z.a((Closeable) inputStream);
                throw th;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = a2;
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream2, null, options);
                z.a((Closeable) inputStream2);
                z.a((Closeable) inputStream);
                return decodeStream;
            } catch (IOException e4) {
                e2 = e4;
                com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                z.a((Closeable) inputStream2);
                z.a((Closeable) inputStream);
                return null;
            }
        } catch (IOException e5) {
            e2 = e5;
            inputStream2 = null;
            inputStream = null;
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
            z.a((Closeable) inputStream2);
            z.a((Closeable) inputStream);
            return null;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            z.a((Closeable) inputStream3);
            z.a((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e0 */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:61:0x00e0=Splitter:B:61:0x00e0, B:55:0x00d4=Splitter:B:55:0x00d4} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.service.af.a a(java.lang.String r10, boolean r11) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x00de, IOException -> 0x00d1, all -> 0x00cd }
            r1.<init>(r10)     // Catch:{ SocketTimeoutException -> 0x00de, IOException -> 0x00d1, all -> 0x00cd }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ SocketTimeoutException -> 0x00de, IOException -> 0x00d1, all -> 0x00cd }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ SocketTimeoutException -> 0x00de, IOException -> 0x00d1, all -> 0x00cd }
            r2 = 8000(0x1f40, float:1.121E-41)
            r1.setConnectTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r2 = 20000(0x4e20, float:2.8026E-41)
            r1.setReadTimeout(r2)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r1.connect()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            int r2 = r1.getContentLength()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r3 = 102400(0x19000, float:1.43493E-40)
            if (r11 == 0) goto L_0x004a
            if (r2 <= r3) goto L_0x004a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.lang.String r3 = "Bitmap size is too big, max size is 102400  contentLen size is "
            r11.append(r3)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.lang.String r2 = " from url "
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r11.append(r10)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.lang.String r11 = r11.toString()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r11)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            com.xiaomi.push.z.a((java.io.Closeable) r0)
            if (r1 == 0) goto L_0x00fb
        L_0x0045:
            r1.disconnect()
            goto L_0x00fb
        L_0x004a:
            int r2 = r1.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r2 == r4) goto L_0x0071
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.lang.String r3 = "Invalid Http Response Code "
            r11.append(r3)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.lang.String r2 = " received"
            r11.append(r2)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.lang.String r11 = r11.toString()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r11)     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            com.xiaomi.push.z.a((java.io.Closeable) r0)
            if (r1 == 0) goto L_0x00fb
            goto L_0x0045
        L_0x0071:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ SocketTimeoutException -> 0x00cb, IOException -> 0x00c8, all -> 0x00c5 }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            r4.<init>()     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            if (r11 == 0) goto L_0x0080
            r11 = 102400(0x19000, float:1.43493E-40)
            goto L_0x0083
        L_0x0080:
            r11 = 2048000(0x1f4000, float:2.869859E-39)
        L_0x0083:
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r5]     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
        L_0x0087:
            if (r11 <= 0) goto L_0x0097
            r7 = 0
            int r8 = r2.read(r6, r7, r5)     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            r9 = -1
            if (r8 != r9) goto L_0x0092
            goto L_0x0097
        L_0x0092:
            int r11 = r11 - r8
            r4.write(r6, r7, r8)     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            goto L_0x0087
        L_0x0097:
            if (r11 > 0) goto L_0x00ad
            java.lang.String r11 = "length 102400 exhausted."
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r11)     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            com.xiaomi.push.service.af$a r11 = new com.xiaomi.push.service.af$a     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            r11.<init>(r0, r3)     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x00ab
            r1.disconnect()
        L_0x00ab:
            r0 = r11
            goto L_0x00fb
        L_0x00ad:
            byte[] r11 = r4.toByteArray()     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            com.xiaomi.push.service.af$a r3 = new com.xiaomi.push.service.af$a     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            int r4 = r11.length     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            r3.<init>(r11, r4)     // Catch:{ SocketTimeoutException -> 0x00e0, IOException -> 0x00c3 }
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x00bf
            r1.disconnect()
        L_0x00bf:
            r0 = r3
            goto L_0x00fb
        L_0x00c1:
            r10 = move-exception
            goto L_0x00fc
        L_0x00c3:
            r10 = move-exception
            goto L_0x00d4
        L_0x00c5:
            r10 = move-exception
            r2 = r0
            goto L_0x00fc
        L_0x00c8:
            r10 = move-exception
            r2 = r0
            goto L_0x00d4
        L_0x00cb:
            r2 = r0
            goto L_0x00e0
        L_0x00cd:
            r10 = move-exception
            r1 = r0
            r2 = r1
            goto L_0x00fc
        L_0x00d1:
            r10 = move-exception
            r1 = r0
            r2 = r1
        L_0x00d4:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r10)     // Catch:{ all -> 0x00c1 }
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x00fb
            goto L_0x0045
        L_0x00de:
            r1 = r0
            r2 = r1
        L_0x00e0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c1 }
            r11.<init>()     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "Connect timeout to "
            r11.append(r3)     // Catch:{ all -> 0x00c1 }
            r11.append(r10)     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = r11.toString()     // Catch:{ all -> 0x00c1 }
            com.xiaomi.channel.commonutils.logger.b.d(r10)     // Catch:{ all -> 0x00c1 }
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x00fb
            goto L_0x0045
        L_0x00fb:
            return r0
        L_0x00fc:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            if (r1 == 0) goto L_0x0104
            r1.disconnect()
        L_0x0104:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.af.a(java.lang.String, boolean):com.xiaomi.push.service.af$a");
    }

    public static b a(Context context, String str, boolean z) {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        b bVar = new b(null, 0);
        Bitmap b2 = b(context, str);
        if (b2 != null) {
            bVar.f924a = b2;
        } else {
            try {
                a a2 = a(str, z);
                if (a2 != null) {
                    bVar.f82490a = (long) a2.f82489a;
                    byte[] bArr = a2.f923a;
                    if (bArr != null) {
                        if (z) {
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                            try {
                                int a3 = a(context, (InputStream) byteArrayInputStream);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inSampleSize = a3;
                                bVar.f924a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                                a(context, a2.f923a, str);
                                z.a((Closeable) byteArrayInputStream);
                            } catch (Exception e2) {
                                e = e2;
                                byteArrayInputStream2 = byteArrayInputStream;
                            } catch (Throwable th) {
                                th = th;
                                byteArrayInputStream2 = byteArrayInputStream;
                                z.a((Closeable) byteArrayInputStream2);
                                throw th;
                            }
                        } else {
                            bVar.f924a = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                        }
                    }
                    byteArrayInputStream = null;
                    a(context, a2.f923a, str);
                    z.a((Closeable) byteArrayInputStream);
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e);
                    z.a((Closeable) byteArrayInputStream2);
                    return bVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            z.a((Closeable) byteArrayInputStream2);
        }
        return bVar;
    }

    private static void a(Context context) {
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon");
        if (file.exists()) {
            if (f82488a == 0) {
                f82488a = y.a(file);
            }
            if (f82488a > 15728640) {
                try {
                    File[] listFiles = file.listFiles();
                    for (int i = 0; i < listFiles.length; i++) {
                        if (!listFiles[i].isDirectory() && Math.abs(System.currentTimeMillis() - listFiles[i].lastModified()) > 1209600) {
                            listFiles[i].delete();
                        }
                    }
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                }
                f82488a = 0;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r4, byte[] r5, java.lang.String r6) {
        /*
            if (r5 != 0) goto L_0x0009
            java.lang.String r4 = "cannot save small icon cause bitmap is null"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r4)
            goto L_0x00ad
        L_0x0009:
            a(r4)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = r4.getCacheDir()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "mipush_icon"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0038
            r0.mkdirs()
        L_0x0038:
            java.io.File r1 = new java.io.File
            java.lang.String r6 = com.xiaomi.push.az.a((java.lang.String) r6)
            r1.<init>(r0, r6)
            r6 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            if (r0 != 0) goto L_0x004b
            r1.createNewFile()     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
        L_0x004b:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x006c, all -> 0x0069 }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0067 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0067 }
            r2.write(r5)     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            r2.flush()     // Catch:{ Exception -> 0x0062, all -> 0x005f }
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            goto L_0x0074
        L_0x005f:
            r4 = move-exception
            r6 = r2
            goto L_0x00ae
        L_0x0062:
            r5 = move-exception
            r6 = r2
            goto L_0x006e
        L_0x0065:
            r4 = move-exception
            goto L_0x00ae
        L_0x0067:
            r5 = move-exception
            goto L_0x006e
        L_0x0069:
            r4 = move-exception
            r0 = r6
            goto L_0x00ae
        L_0x006c:
            r5 = move-exception
            r0 = r6
        L_0x006e:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r5)     // Catch:{ all -> 0x0065 }
            com.xiaomi.push.z.a((java.io.Closeable) r6)
        L_0x0074:
            com.xiaomi.push.z.a((java.io.Closeable) r0)
            long r5 = f82488a
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00ad
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r4 = r4.getCacheDir()
            java.lang.String r4 = r4.getPath()
            r6.append(r4)
            java.lang.String r4 = java.io.File.separator
            r6.append(r4)
            java.lang.String r4 = "mipush_icon"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            long r4 = com.xiaomi.push.y.a(r5)
            long r0 = r1.length()
            long r4 = r4 + r0
            f82488a = r4
        L_0x00ad:
            return
        L_0x00ae:
            com.xiaomi.push.z.a((java.io.Closeable) r6)
            com.xiaomi.push.z.a((java.io.Closeable) r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.af.a(android.content.Context, byte[], java.lang.String):void");
    }

    private static Bitmap b(Context context, String str) {
        Throwable th;
        FileInputStream fileInputStream;
        Bitmap bitmap;
        Exception e2;
        File file = new File(context.getCacheDir().getPath() + File.separator + "mipush_icon", az.a(str));
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                bitmap = BitmapFactory.decodeStream(fileInputStream);
                try {
                    file.setLastModified(System.currentTimeMillis());
                } catch (Exception e3) {
                    e2 = e3;
                }
            } catch (Exception e4) {
                bitmap = null;
                e2 = e4;
                try {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                    z.a((Closeable) fileInputStream);
                    return bitmap;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    fileInputStream2 = fileInputStream;
                    th = th3;
                    z.a((Closeable) fileInputStream2);
                    throw th;
                }
            }
        } catch (Exception e5) {
            bitmap = null;
            e2 = e5;
            fileInputStream = null;
            com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
            z.a((Closeable) fileInputStream);
            return bitmap;
        } catch (Throwable th4) {
            th = th4;
            z.a((Closeable) fileInputStream2);
            throw th;
        }
        z.a((Closeable) fileInputStream);
        return bitmap;
    }
}
