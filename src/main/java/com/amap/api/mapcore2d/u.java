package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Environment;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.File;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private Context f6279a;

    /* renamed from: b  reason: collision with root package name */
    private ba f6280b;

    /* renamed from: c  reason: collision with root package name */
    private String f6281c = "/sdcard/Amap/RMap";

    /* renamed from: d  reason: collision with root package name */
    private final int f6282d = SearchJediMixFeedAdapter.f42517f;

    public void a(ba baVar) {
        this.f6280b = baVar;
    }

    public static void a(final String str) {
        new Thread(new Runnable() {
            public final void run() {
                try {
                    u.b(str);
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    private void a(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            byte b2 = bArr[0];
            bArr[0] = bArr[3];
            bArr[3] = b2;
            byte b3 = bArr[1];
            bArr[1] = bArr[2];
            bArr[2] = b3;
        }
    }

    public static boolean b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return c(str);
        }
        return d(str);
    }

    public static boolean c(String str) {
        File file = new File(str);
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        file.delete();
        return true;
    }

    private int b(byte[] bArr) {
        return ((bArr[3] << 24) & -16777216) | (bArr[0] & 255) | ((bArr[1] << 8) & 65280) | ((bArr[2] << 16) & 16711680);
    }

    private byte[] a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((65280 & i) >> 8), (byte) ((16711680 & i) >> 16), (byte) ((i & -16777216) >> 24)};
    }

    public static boolean d(String str) {
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return false;
        }
        File[] listFiles = file.listFiles();
        boolean z = true;
        for (int i = 0; i < listFiles.length; i++) {
            if (!listFiles[i].isFile()) {
                z = d(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            } else {
                z = c(listFiles[i].getAbsolutePath());
                if (!z) {
                    break;
                }
            }
        }
        if (z && file.delete()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:98:0x00e1 A[Catch:{ FileNotFoundException -> 0x0046, Throwable -> 0x00fc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00e2 A[Catch:{ FileNotFoundException -> 0x0046, Throwable -> 0x00fc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(com.amap.api.mapcore2d.bs r13) {
        /*
            r12 = this;
            java.lang.String r0 = "getTileFromCach"
            r1 = 1
            r2 = -1
            java.lang.String[] r3 = r12.a((com.amap.api.mapcore2d.bs) r13, (boolean) r1)     // Catch:{ Throwable -> 0x00fc }
            if (r3 == 0) goto L_0x00fb
            int r4 = r3.length     // Catch:{ Throwable -> 0x00fc }
            r5 = 2
            if (r4 != r5) goto L_0x00fb
            r4 = 0
            r5 = r3[r4]     // Catch:{ Throwable -> 0x00fc }
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x00fc }
            if (r5 != 0) goto L_0x00fb
            int r5 = r3.length     // Catch:{ Throwable -> 0x00fc }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Throwable -> 0x00fc }
            boolean r5 = java.util.Arrays.equals(r3, r5)     // Catch:{ Throwable -> 0x00fc }
            if (r5 == 0) goto L_0x0024
            goto L_0x00fb
        L_0x0024:
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x00fc }
            r6 = r3[r4]     // Catch:{ Throwable -> 0x00fc }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x00fc }
            boolean r6 = r5.exists()     // Catch:{ Throwable -> 0x00fc }
            if (r6 != 0) goto L_0x0032
            return r2
        L_0x0032:
            int r6 = r13.f5777b     // Catch:{ Throwable -> 0x00fc }
            int r7 = r13.f5778c     // Catch:{ Throwable -> 0x00fc }
            int r6 = r12.a((int) r6, (int) r7)     // Catch:{ Throwable -> 0x00fc }
            if (r6 >= 0) goto L_0x003d
            return r2
        L_0x003d:
            r7 = 0
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0046 }
            java.lang.String r9 = "r"
            r8.<init>(r5, r9)     // Catch:{ FileNotFoundException -> 0x0046 }
            goto L_0x004d
        L_0x0046:
            r5 = move-exception
            java.lang.String r8 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r5, r8, r0)     // Catch:{ Throwable -> 0x00fc }
            r8 = r7
        L_0x004d:
            if (r8 != 0) goto L_0x0050
            return r2
        L_0x0050:
            r5 = 4
            int r6 = r6 * 4
            long r9 = (long) r6
            r8.seek(r9)     // Catch:{ IOException -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r6 = move-exception
            java.lang.String r9 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r6, r9, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x005e:
            byte[] r6 = new byte[r5]     // Catch:{ Throwable -> 0x00fc }
            r8.read(r6, r4, r5)     // Catch:{ IOException -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            r9 = move-exception
            java.lang.String r10 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r9, r10, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x006a:
            r12.a((byte[]) r6)     // Catch:{ Throwable -> 0x00fc }
            int r9 = r12.b((byte[]) r6)     // Catch:{ Throwable -> 0x00fc }
            r8.close()     // Catch:{ Throwable -> 0x0075 }
            goto L_0x007b
        L_0x0075:
            r8 = move-exception
            java.lang.String r10 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r8, r10, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x007b:
            if (r9 >= 0) goto L_0x007e
            return r2
        L_0x007e:
            java.io.File r8 = new java.io.File     // Catch:{ Throwable -> 0x00fc }
            r1 = r3[r1]     // Catch:{ Throwable -> 0x00fc }
            r8.<init>(r1)     // Catch:{ Throwable -> 0x00fc }
            boolean r1 = r8.exists()     // Catch:{ Throwable -> 0x00fc }
            if (r1 != 0) goto L_0x008c
            return r2
        L_0x008c:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0094 }
            java.lang.String r3 = "r"
            r1.<init>(r8, r3)     // Catch:{ FileNotFoundException -> 0x0094 }
            goto L_0x009b
        L_0x0094:
            r1 = move-exception
            java.lang.String r3 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r1, r3, r0)     // Catch:{ Throwable -> 0x00fc }
            r1 = r7
        L_0x009b:
            if (r1 != 0) goto L_0x009e
            return r2
        L_0x009e:
            long r8 = (long) r9
            r1.seek(r8)     // Catch:{ IOException -> 0x00a3 }
            goto L_0x00a9
        L_0x00a3:
            r3 = move-exception
            java.lang.String r8 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r3, r8, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x00a9:
            r1.read(r6, r4, r5)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b3
        L_0x00ad:
            r3 = move-exception
            java.lang.String r5 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r3, r5, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x00b3:
            r12.a((byte[]) r6)     // Catch:{ Throwable -> 0x00fc }
            int r3 = r12.b((byte[]) r6)     // Catch:{ Throwable -> 0x00fc }
            if (r3 <= 0) goto L_0x00f0
            r5 = 204800(0x32000, float:2.86986E-40)
            if (r3 <= r5) goto L_0x00c2
            goto L_0x00f0
        L_0x00c2:
            byte[] r5 = new byte[r3]     // Catch:{ Throwable -> 0x00cb }
            r1.read(r5, r4, r3)     // Catch:{ Throwable -> 0x00c9 }
        L_0x00c7:
            r7 = r5
            goto L_0x00d3
        L_0x00c9:
            r3 = move-exception
            goto L_0x00cd
        L_0x00cb:
            r3 = move-exception
            r5 = r7
        L_0x00cd:
            java.lang.String r4 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r3, r4, r0)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x00c7
        L_0x00d3:
            r1.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00dd
        L_0x00d7:
            r1 = move-exception
            java.lang.String r3 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r1, r3, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x00dd:
            com.amap.api.mapcore2d.ba r1 = r12.f6280b     // Catch:{ Throwable -> 0x00fc }
            if (r1 != 0) goto L_0x00e2
            return r2
        L_0x00e2:
            com.amap.api.mapcore2d.ba r6 = r12.f6280b     // Catch:{ Throwable -> 0x00fc }
            r8 = 0
            r9 = 1
            r10 = 0
            java.lang.String r11 = r13.c()     // Catch:{ Throwable -> 0x00fc }
            int r13 = r6.a(r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x00fc }
            goto L_0x0103
        L_0x00f0:
            r1.close()     // Catch:{ IOException -> 0x00f4 }
            goto L_0x00fa
        L_0x00f4:
            r13 = move-exception
            java.lang.String r1 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r13, r1, r0)     // Catch:{ Throwable -> 0x00fc }
        L_0x00fa:
            return r2
        L_0x00fb:
            return r2
        L_0x00fc:
            r13 = move-exception
            java.lang.String r1 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r13, r1, r0)
            r13 = -1
        L_0x0103:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.u.a(com.amap.api.mapcore2d.bs):int");
    }

    private int a(int i, int i2) {
        int i3 = i % SearchJediMixFeedAdapter.f42517f;
        return (i3 * SearchJediMixFeedAdapter.f42517f) + (i2 % SearchJediMixFeedAdapter.f42517f);
    }

    private String[] a(bs bsVar, boolean z) {
        int i = (bsVar.f5777b / SearchJediMixFeedAdapter.f42517f) / 10;
        int i2 = (bsVar.f5778c / SearchJediMixFeedAdapter.f42517f) / 10;
        String[] strArr = new String[2];
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6281c);
            sb.append("/");
            sb.append(bsVar.f5779d);
            sb.append("/");
            sb.append(i);
            sb.append("/");
            sb.append(i2);
            sb.append("/");
            if (!z) {
                File file = new File(sb.toString());
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            sb.append(bsVar.c());
            strArr[0] = sb.toString() + ".idx";
            strArr[1] = sb.toString() + ".dat";
        } catch (Throwable th) {
            cm.a(th, "CachManager", "getCachFileName");
        }
        return strArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x012e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(byte[] r14, com.amap.api.mapcore2d.bs r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            java.lang.String r0 = "addDataToCach"
            r1 = 0
            if (r14 != 0) goto L_0x0008
            monitor-exit(r13)
            return r1
        L_0x0008:
            int r2 = r14.length     // Catch:{ all -> 0x0137 }
            if (r2 > 0) goto L_0x000d
            monitor-exit(r13)
            return r1
        L_0x000d:
            r3 = 1
            java.lang.String[] r4 = r13.a((com.amap.api.mapcore2d.bs) r15, (boolean) r1)     // Catch:{ Throwable -> 0x012f }
            if (r4 == 0) goto L_0x012d
            int r5 = r4.length     // Catch:{ Throwable -> 0x012f }
            r6 = 2
            if (r5 != r6) goto L_0x012d
            r5 = r4[r1]     // Catch:{ Throwable -> 0x012f }
            java.lang.String r6 = ""
            boolean r5 = r5.equals(r6)     // Catch:{ Throwable -> 0x012f }
            if (r5 != 0) goto L_0x012d
            int r5 = r4.length     // Catch:{ Throwable -> 0x012f }
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Throwable -> 0x012f }
            boolean r5 = java.util.Arrays.equals(r4, r5)     // Catch:{ Throwable -> 0x012f }
            if (r5 == 0) goto L_0x002d
            goto L_0x012d
        L_0x002d:
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x012f }
            r6 = r4[r3]     // Catch:{ Throwable -> 0x012f }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x012f }
            boolean r6 = r5.exists()     // Catch:{ Throwable -> 0x012f }
            if (r6 != 0) goto L_0x004a
            boolean r6 = r5.createNewFile()     // Catch:{ Throwable -> 0x003f }
            goto L_0x0046
        L_0x003f:
            r6 = move-exception
            java.lang.String r7 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r6, r7, r0)     // Catch:{ Throwable -> 0x012f }
            r6 = 0
        L_0x0046:
            if (r6 != 0) goto L_0x004a
            monitor-exit(r13)
            return r1
        L_0x004a:
            r6 = 0
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x0053 }
            java.lang.String r8 = "rws"
            r7.<init>(r5, r8)     // Catch:{ Throwable -> 0x0053 }
            goto L_0x005a
        L_0x0053:
            r5 = move-exception
            java.lang.String r7 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r5, r7, r0)     // Catch:{ Throwable -> 0x012f }
            r7 = r6
        L_0x005a:
            if (r7 != 0) goto L_0x005e
            monitor-exit(r13)
            return r1
        L_0x005e:
            byte[] r2 = r13.a((int) r2)     // Catch:{ Throwable -> 0x012f }
            r13.a((byte[]) r2)     // Catch:{ Throwable -> 0x012f }
            r8 = 0
            long r10 = r7.length()     // Catch:{ Throwable -> 0x006c }
            goto L_0x0073
        L_0x006c:
            r5 = move-exception
            java.lang.String r10 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r5, r10, r0)     // Catch:{ Throwable -> 0x012f }
            r10 = r8
        L_0x0073:
            r7.seek(r10)     // Catch:{ Throwable -> 0x0077 }
            goto L_0x007d
        L_0x0077:
            r5 = move-exception
            java.lang.String r12 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r5, r12, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x007d:
            r7.write(r2)     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0087
        L_0x0081:
            r2 = move-exception
            java.lang.String r5 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r2, r5, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x0087:
            r7.write(r14)     // Catch:{ Throwable -> 0x008b }
            goto L_0x0091
        L_0x008b:
            r14 = move-exception
            java.lang.String r2 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r2, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x0091:
            r7.close()     // Catch:{ Throwable -> 0x0095 }
            goto L_0x009b
        L_0x0095:
            r14 = move-exception
            java.lang.String r2 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r2, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x009b:
            java.io.File r14 = new java.io.File     // Catch:{ Throwable -> 0x012f }
            r2 = r4[r1]     // Catch:{ Throwable -> 0x012f }
            r14.<init>(r2)     // Catch:{ Throwable -> 0x012f }
            boolean r2 = r14.exists()     // Catch:{ Throwable -> 0x012f }
            if (r2 != 0) goto L_0x00b8
            boolean r2 = r14.createNewFile()     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b4
        L_0x00ad:
            r2 = move-exception
            java.lang.String r4 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r2, r4, r0)     // Catch:{ Throwable -> 0x012f }
            r2 = 0
        L_0x00b4:
            if (r2 != 0) goto L_0x00b8
            monitor-exit(r13)
            return r1
        L_0x00b8:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x00c0 }
            java.lang.String r4 = "rws"
            r2.<init>(r14, r4)     // Catch:{ Throwable -> 0x00c0 }
            goto L_0x00c7
        L_0x00c0:
            r14 = move-exception
            java.lang.String r2 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r2, r0)     // Catch:{ Throwable -> 0x012f }
            r2 = r6
        L_0x00c7:
            if (r2 != 0) goto L_0x00cb
            monitor-exit(r13)
            return r1
        L_0x00cb:
            long r4 = r2.length()     // Catch:{ Throwable -> 0x00d0 }
            goto L_0x00d7
        L_0x00d0:
            r14 = move-exception
            java.lang.String r4 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r4, r0)     // Catch:{ Throwable -> 0x012f }
            r4 = r8
        L_0x00d7:
            int r14 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r14 != 0) goto L_0x00ed
            r14 = 65536(0x10000, float:9.18355E-41)
            byte[] r14 = new byte[r14]     // Catch:{ Throwable -> 0x00e7 }
            r4 = -1
            java.util.Arrays.fill(r14, r4)     // Catch:{ Throwable -> 0x00e7 }
            r2.write(r14)     // Catch:{ Throwable -> 0x00e7 }
            goto L_0x00ed
        L_0x00e7:
            r14 = move-exception
            java.lang.String r4 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r4, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x00ed:
            int r14 = r15.f5777b     // Catch:{ Throwable -> 0x012f }
            int r15 = r15.f5778c     // Catch:{ Throwable -> 0x012f }
            int r14 = r13.a((int) r14, (int) r15)     // Catch:{ Throwable -> 0x012f }
            if (r14 >= 0) goto L_0x0103
            r2.close()     // Catch:{ Throwable -> 0x00fb }
            goto L_0x0101
        L_0x00fb:
            r14 = move-exception
            java.lang.String r15 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r15, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x0101:
            monitor-exit(r13)
            return r1
        L_0x0103:
            int r14 = r14 * 4
            long r14 = (long) r14
            r2.seek(r14)     // Catch:{ Throwable -> 0x010a }
            goto L_0x0110
        L_0x010a:
            r14 = move-exception
            java.lang.String r15 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r15, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x0110:
            int r14 = (int) r10     // Catch:{ Throwable -> 0x012f }
            byte[] r14 = r13.a((int) r14)     // Catch:{ Throwable -> 0x012f }
            r13.a((byte[]) r14)     // Catch:{ Throwable -> 0x012f }
            r2.write(r14)     // Catch:{ Throwable -> 0x011c }
            goto L_0x0122
        L_0x011c:
            r14 = move-exception
            java.lang.String r15 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r15, r0)     // Catch:{ Throwable -> 0x012f }
        L_0x0122:
            r2.close()     // Catch:{ Throwable -> 0x0126 }
            goto L_0x0135
        L_0x0126:
            r14 = move-exception
            java.lang.String r15 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r15, r0)     // Catch:{ Throwable -> 0x012f }
            goto L_0x0135
        L_0x012d:
            monitor-exit(r13)
            return r1
        L_0x012f:
            r14 = move-exception
            java.lang.String r15 = "CachManager"
            com.amap.api.mapcore2d.cm.a(r14, r15, r0)     // Catch:{ all -> 0x0137 }
        L_0x0135:
            monitor-exit(r13)
            return r3
        L_0x0137:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.u.a(byte[], com.amap.api.mapcore2d.bs):boolean");
    }

    public static String a(Context context, String str, an anVar) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return context.getFilesDir().getPath();
        }
        File file = new File(cm.b(context), anVar.f5598b);
        if (!file.exists()) {
            file.mkdir();
        }
        return file.toString() + "/";
    }

    public u(Context context, boolean z, an anVar) {
        this.f6279a = context;
        if (anVar != null) {
            if (z) {
                this.f6281c = context.getFilesDir().getPath();
            } else {
                boolean z2 = false;
                if (anVar.m != null && !anVar.m.equals("")) {
                    File file = new File(anVar.m);
                    boolean exists = file.exists();
                    if (!exists) {
                        z2 = file.mkdirs();
                    } else {
                        z2 = exists;
                    }
                    this.f6281c = anVar.m;
                }
                if (!z2) {
                    this.f6281c = a(this.f6279a, this.f6281c, anVar);
                }
            }
            bg.a().b("cache_path", this.f6281c);
        }
    }
}
