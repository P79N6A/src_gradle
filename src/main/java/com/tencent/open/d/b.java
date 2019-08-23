package com.tencent.open.d;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final i f79730a = new i(101010256);

    /* renamed from: b  reason: collision with root package name */
    private static final j f79731b = new j(38651);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        Properties f79732a;

        /* renamed from: b  reason: collision with root package name */
        byte[] f79733b;

        private a() {
            this.f79732a = new Properties();
        }

        public final String toString() {
            return "ApkExternalInfo [p=" + this.f79732a + ", otherData=" + Arrays.toString(this.f79733b) + "]";
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static byte[] a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        i iVar = f79730a;
        boolean z = false;
        byte[] bArr = {(byte) ((int) (iVar.f79762a & 255)), (byte) ((int) ((iVar.f79762a & 65280) >> 8)), (byte) ((int) ((iVar.f79762a & 16711680) >> 16)), (byte) ((int) ((iVar.f79762a & 4278190080L) >> 24))};
        int read = randomAccessFile.read();
        while (true) {
            if (read != -1) {
                if (read == bArr[0] && randomAccessFile.read() == bArr[1] && randomAccessFile.read() == bArr[2] && randomAccessFile.read() == bArr[3]) {
                    z = true;
                    break;
                }
                length--;
                randomAccessFile.seek(length);
                read = randomAccessFile.read();
            } else {
                break;
            }
        }
        if (z) {
            randomAccessFile.seek(length + 16 + 4);
            byte[] bArr2 = new byte[2];
            randomAccessFile.readFully(bArr2);
            int i = new j(bArr2).f79763a;
            if (i == 0) {
                return null;
            }
            byte[] bArr3 = new byte[i];
            randomAccessFile.read(bArr3);
            return bArr3;
        }
        throw new ZipException("archive is not a ZIP archive");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r8, java.lang.String r9) throws java.io.IOException {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x008e }
            java.lang.String r2 = "r"
            r1.<init>(r8, r2)     // Catch:{ all -> 0x008e }
            byte[] r8 = a(r1)     // Catch:{ all -> 0x008c }
            if (r8 != 0) goto L_0x0012
            r1.close()
            return r0
        L_0x0012:
            com.tencent.open.d.b$a r0 = new com.tencent.open.d.b$a     // Catch:{ all -> 0x008c }
            r2 = 0
            r0.<init>(r2)     // Catch:{ all -> 0x008c }
            if (r8 != 0) goto L_0x001b
            goto L_0x0065
        L_0x001b:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r8)     // Catch:{ all -> 0x008c }
            r3 = 2
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x008c }
            r2.get(r4)     // Catch:{ all -> 0x008c }
            com.tencent.open.d.j r5 = f79731b     // Catch:{ all -> 0x008c }
            com.tencent.open.d.j r6 = new com.tencent.open.d.j     // Catch:{ all -> 0x008c }
            r6.<init>((byte[]) r4)     // Catch:{ all -> 0x008c }
            boolean r4 = r5.equals(r6)     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x006f
            int r4 = r8.length     // Catch:{ all -> 0x008c }
            int r4 = r4 - r3
            if (r4 <= r3) goto L_0x0065
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x008c }
            r2.get(r4)     // Catch:{ all -> 0x008c }
            com.tencent.open.d.j r5 = new com.tencent.open.d.j     // Catch:{ all -> 0x008c }
            r5.<init>((byte[]) r4)     // Catch:{ all -> 0x008c }
            int r4 = r5.f79763a     // Catch:{ all -> 0x008c }
            int r5 = r8.length     // Catch:{ all -> 0x008c }
            int r5 = r5 - r3
            int r5 = r5 - r3
            if (r5 < r4) goto L_0x0065
            byte[] r5 = new byte[r4]     // Catch:{ all -> 0x008c }
            r2.get(r5)     // Catch:{ all -> 0x008c }
            java.util.Properties r6 = r0.f79732a     // Catch:{ all -> 0x008c }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x008c }
            r7.<init>(r5)     // Catch:{ all -> 0x008c }
            r6.load(r7)     // Catch:{ all -> 0x008c }
            int r8 = r8.length     // Catch:{ all -> 0x008c }
            int r8 = r8 - r3
            int r8 = r8 - r4
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x0065
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x008c }
            r0.f79733b = r8     // Catch:{ all -> 0x008c }
            byte[] r8 = r0.f79733b     // Catch:{ all -> 0x008c }
            r2.get(r8)     // Catch:{ all -> 0x008c }
        L_0x0065:
            java.util.Properties r8 = r0.f79732a     // Catch:{ all -> 0x008c }
            java.lang.String r8 = r8.getProperty(r9)     // Catch:{ all -> 0x008c }
            r1.close()
            return r8
        L_0x006f:
            java.net.ProtocolException r9 = new java.net.ProtocolException     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "unknow protocl ["
            r0.<init>(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch:{ all -> 0x008c }
            r0.append(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = "]"
            r0.append(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x008c }
            r9.<init>(r8)     // Catch:{ all -> 0x008c }
            throw r9     // Catch:{ all -> 0x008c }
        L_0x008c:
            r8 = move-exception
            goto L_0x0090
        L_0x008e:
            r8 = move-exception
            r1 = r0
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.close()
        L_0x0095:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.b.a(java.io.File, java.lang.String):java.lang.String");
    }
}
