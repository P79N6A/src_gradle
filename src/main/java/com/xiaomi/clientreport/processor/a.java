package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.push.ad;
import com.xiaomi.push.az;
import com.xiaomi.push.bf;
import com.xiaomi.push.i;
import com.xiaomi.push.z;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class a implements IEventProcessor {

    /* renamed from: a  reason: collision with root package name */
    protected Context f81726a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f70a;

    public a(Context context) {
        a(context);
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r8 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.lang.String> a(java.lang.String r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r1]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0069 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0069 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0069 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0069 }
        L_0x0015:
            int r8 = r5.read(r2)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r4 = -1
            if (r8 != r4) goto L_0x001d
            goto L_0x005d
        L_0x001d:
            if (r8 == r1) goto L_0x0025
            java.lang.String r8 = "eventData read from cache file failed because magicNumber error"
        L_0x0021:
            com.xiaomi.channel.commonutils.logger.b.d(r8)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            goto L_0x005d
        L_0x0025:
            int r8 = com.xiaomi.push.ad.a((byte[]) r2)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r6 = -573785174(0xffffffffddccbbaa, float:-1.84407149E18)
            if (r8 == r6) goto L_0x0031
            java.lang.String r8 = "eventData read from cache file failed because magicNumber error"
            goto L_0x0021
        L_0x0031:
            int r8 = r5.read(r3)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            if (r8 == r4) goto L_0x005d
            if (r8 == r1) goto L_0x003c
            java.lang.String r8 = "eventData read from cache file failed cause lengthBuffer error"
            goto L_0x0021
        L_0x003c:
            int r8 = com.xiaomi.push.ad.a((byte[]) r3)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            if (r8 <= 0) goto L_0x005a
            r4 = 4096(0x1000, float:5.74E-42)
            if (r8 <= r4) goto L_0x0047
            goto L_0x005a
        L_0x0047:
            byte[] r4 = new byte[r8]     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            int r6 = r5.read(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            if (r6 == r8) goto L_0x0052
            java.lang.String r8 = "eventData read from cache file failed cause buffer size not equal length"
            goto L_0x0021
        L_0x0052:
            java.lang.String r8 = r7.bytesToString(r4)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            r0.add(r8)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            goto L_0x0015
        L_0x005a:
            java.lang.String r8 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K"
            goto L_0x0021
        L_0x005d:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
            goto L_0x0070
        L_0x0061:
            r8 = move-exception
            r4 = r5
            goto L_0x0071
        L_0x0064:
            r8 = move-exception
            r4 = r5
            goto L_0x006a
        L_0x0067:
            r8 = move-exception
            goto L_0x0071
        L_0x0069:
            r8 = move-exception
        L_0x006a:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x0067 }
            com.xiaomi.push.z.a((java.io.Closeable) r4)
        L_0x0070:
            return r0
        L_0x0071:
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.a.a(java.lang.String):java.util.List");
    }

    private void a(com.xiaomi.clientreport.data.a[] aVarArr, String str) {
        if (aVarArr != null && aVarArr.length > 0 && !TextUtils.isEmpty(str)) {
            File file = new File(str);
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, true));
                try {
                    for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                        if (aVar != null) {
                            byte[] stringToBytes = stringToBytes(aVar.toJsonString());
                            if (stringToBytes != null && stringToBytes.length > 0) {
                                if (stringToBytes.length <= 4096) {
                                    bufferedOutputStream2.write(ad.a(-573785174));
                                    bufferedOutputStream2.write(ad.a(stringToBytes.length));
                                    bufferedOutputStream2.write(stringToBytes);
                                    bufferedOutputStream2.flush();
                                }
                            }
                            b.d("event data throw a invalid item ");
                        }
                    }
                    z.a((Closeable) bufferedOutputStream2);
                } catch (Exception e2) {
                    e = e2;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        b.a("event data write to cache file failed cause exception", (Throwable) e);
                        z.a((Closeable) bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        z.a((Closeable) bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedOutputStream = bufferedOutputStream2;
                    z.a((Closeable) bufferedOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                b.a("event data write to cache file failed cause exception", (Throwable) e);
                z.a((Closeable) bufferedOutputStream);
            }
        }
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        File externalFilesDir = this.f81726a.getExternalFilesDir("event");
        String a2 = a(aVar);
        if (externalFilesDir == null) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + a2;
        for (int i = 0; i < 100; i++) {
            String str2 = str + i;
            if (bf.a(this.f81726a, str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ba, code lost:
        if (r8 != null) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r12 = this;
            android.content.Context r0 = r12.f81726a
            java.lang.String r1 = "event"
            java.lang.String r2 = "eventUploading"
            com.xiaomi.push.bf.a(r0, r1, r2)
            android.content.Context r0 = r12.f81726a
            java.lang.String r1 = "eventUploading"
            java.io.File[] r0 = com.xiaomi.push.bf.a((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x00df
            int r1 = r0.length
            if (r1 > 0) goto L_0x0018
            goto L_0x00df
        L_0x0018:
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x001d:
            if (r2 >= r1) goto L_0x00df
            r6 = r0[r2]
            if (r6 != 0) goto L_0x003d
            if (r3 == 0) goto L_0x0033
            boolean r6 = r3.isValid()
            if (r6 == 0) goto L_0x0033
            r3.release()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r6)
        L_0x0033:
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            if (r5 == 0) goto L_0x00c0
            r5.delete()
            goto L_0x00c0
        L_0x003d:
            java.lang.String r7 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            r9.<init>()     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            r9.append(r7)     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            java.lang.String r10 = ".lock"
            r9.append(r10)     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            r8.<init>(r9)     // Catch:{ Exception -> 0x009f, all -> 0x009b }
            com.xiaomi.push.z.a((java.io.File) r8)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r9 = "rw"
            r5.<init>(r8, r9)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.nio.channels.FileChannel r4 = r5.getChannel()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            java.nio.channels.FileLock r4 = r4.lock()     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            java.util.List r3 = r12.a((java.lang.String) r7)     // Catch:{ Exception -> 0x008a }
            r12.a((java.util.List<java.lang.String>) r3)     // Catch:{ Exception -> 0x008a }
            r6.delete()     // Catch:{ Exception -> 0x008a }
            if (r4 == 0) goto L_0x0083
            boolean r3 = r4.isValid()
            if (r3 == 0) goto L_0x0083
            r4.release()     // Catch:{ IOException -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r3 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)
        L_0x0083:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
        L_0x0086:
            r8.delete()
            goto L_0x00bd
        L_0x008a:
            r3 = move-exception
            goto L_0x00a4
        L_0x008c:
            r0 = move-exception
            goto L_0x00c6
        L_0x008e:
            r4 = move-exception
            r11 = r4
            r4 = r3
            r3 = r11
            goto L_0x00a4
        L_0x0093:
            r0 = move-exception
            goto L_0x009d
        L_0x0095:
            r5 = move-exception
            r11 = r4
            r4 = r3
            r3 = r5
            r5 = r11
            goto L_0x00a4
        L_0x009b:
            r0 = move-exception
            r8 = r5
        L_0x009d:
            r5 = r4
            goto L_0x00c6
        L_0x009f:
            r6 = move-exception
            r8 = r5
            r5 = r4
            r4 = r3
            r3 = r6
        L_0x00a4:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)     // Catch:{ all -> 0x00c4 }
            if (r4 == 0) goto L_0x00b7
            boolean r3 = r4.isValid()
            if (r3 == 0) goto L_0x00b7
            r4.release()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r3 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r3)
        L_0x00b7:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
            if (r8 == 0) goto L_0x00bd
            goto L_0x0086
        L_0x00bd:
            r3 = r4
            r4 = r5
            r5 = r8
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x00c4:
            r0 = move-exception
            r3 = r4
        L_0x00c6:
            if (r3 == 0) goto L_0x00d6
            boolean r1 = r3.isValid()
            if (r1 == 0) goto L_0x00d6
            r3.release()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r1)
        L_0x00d6:
            com.xiaomi.push.z.a((java.io.Closeable) r5)
            if (r8 == 0) goto L_0x00de
            r8.delete()
        L_0x00de:
            throw r0
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.a.a():void");
    }

    public void a(Context context) {
        this.f81726a = context;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m25a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof EventClientReport) && this.f70a != null) {
            EventClientReport eventClientReport = (EventClientReport) aVar;
            String a2 = a((com.xiaomi.clientreport.data.a) eventClientReport);
            ArrayList arrayList = this.f70a.get(a2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(eventClientReport);
            this.f70a.put(a2, arrayList);
        }
    }

    public void a(List<String> list) {
        bf.a(this.f81726a, list);
    }

    public void a(com.xiaomi.clientreport.data.a[] aVarArr) {
        RandomAccessFile randomAccessFile;
        FileLock lock;
        if (aVarArr != null && aVarArr.length > 0) {
            if (aVarArr[0] != null) {
                String b2 = b(aVarArr[0]);
                if (!TextUtils.isEmpty(b2)) {
                    FileLock fileLock = null;
                    try {
                        File file = new File(b2 + ".lock");
                        z.a(file);
                        randomAccessFile = new RandomAccessFile(file, "rw");
                        try {
                            lock = randomAccessFile.getChannel().lock();
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                b.a((Throwable) e);
                                try {
                                    fileLock.release();
                                } catch (IOException e3) {
                                    b.a((Throwable) e3);
                                }
                                z.a((Closeable) randomAccessFile);
                            } catch (Throwable th) {
                                th = th;
                                if (fileLock != null && fileLock.isValid()) {
                                    try {
                                        fileLock.release();
                                    } catch (IOException e4) {
                                        b.a((Throwable) e4);
                                    }
                                }
                                z.a((Closeable) randomAccessFile);
                                throw th;
                            }
                        }
                        try {
                            for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                                if (aVar != null) {
                                    a(aVarArr, b2);
                                }
                            }
                            if (lock != null && lock.isValid()) {
                                try {
                                    lock.release();
                                } catch (IOException e5) {
                                    b.a((Throwable) e5);
                                }
                            }
                            z.a((Closeable) randomAccessFile);
                        } catch (Exception e6) {
                            e = e6;
                            fileLock = lock;
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = lock;
                            fileLock.release();
                            z.a((Closeable) randomAccessFile);
                            throw th;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        randomAccessFile = null;
                        b.a((Throwable) e);
                        if (fileLock != null && fileLock.isValid()) {
                            fileLock.release();
                        }
                        z.a((Closeable) randomAccessFile);
                    } catch (Throwable th3) {
                        th = th3;
                        randomAccessFile = null;
                        fileLock.release();
                        z.a((Closeable) randomAccessFile);
                        throw th;
                    }
                }
            }
        }
    }

    public void b() {
        if (this.f70a != null) {
            if (this.f70a.size() > 0) {
                for (String str : this.f70a.keySet()) {
                    ArrayList arrayList = this.f70a.get(str);
                    if (arrayList != null && arrayList.size() > 0) {
                        com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[arrayList.size()];
                        arrayList.toArray(aVarArr);
                        a(aVarArr);
                    }
                }
            }
            this.f70a.clear();
        }
    }

    public String bytesToString(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.a.a(this.f81726a).a().isEventEncrypted()) {
            return az.a(bArr);
        }
        String a2 = bf.a(this.f81726a);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        byte[] a3 = bf.a(a2);
        if (a3 == null || a3.length <= 0) {
            return null;
        }
        try {
            return az.a(Base64.decode(i.a(a3, bArr), 2));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            b.a(e2);
            return null;
        }
    }

    public void setEventMap(HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap) {
        this.f70a = hashMap;
    }

    public byte[] stringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.a.a(this.f81726a).a().isEventEncrypted()) {
            return az.a(str);
        }
        String a2 = bf.a(this.f81726a);
        byte[] a3 = az.a(str);
        if (TextUtils.isEmpty(a2) || a3 == null || a3.length <= 1) {
            return null;
        }
        byte[] a4 = bf.a(a2);
        if (a4 == null) {
            return null;
        }
        try {
            if (a4.length > 1) {
                return i.b(a4, Base64.encode(a3, 2));
            }
            return null;
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return null;
        }
    }
}
