package com.ss.android.ugc.effectmanager;

import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f77472a;

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.effectmanager.b.a f77473b;

    static class a extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        long f77474a;

        public a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void write(int i) throws IOException {
            super.write(i);
            this.f77474a++;
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            super.write(bArr, i, i2);
            this.f77474a += (long) i2;
        }
    }

    private static String b(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c2 = charArray[i];
            if (!(c2 == '_' || c2 == '-' || ((c2 >= 'a' && c2 <= 'z') || (c2 >= '0' && c2 <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.effectmanager.model.LocalModelInfo a(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r6 = b(r6)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r5.f77473b     // Catch:{ IOException -> 0x005e }
            java.util.Set r1 = r1.d()     // Catch:{ IOException -> 0x005e }
            java.util.Iterator r1 = r1.iterator()
        L_0x000f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = com.ss.android.ugc.effectmanager.common.c.a(r2)
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x000f
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            if (r2 != 0) goto L_0x002a
            return r0
        L_0x002a:
            com.ss.android.ugc.effectmanager.b.a r6 = r5.f77473b     // Catch:{ IOException -> 0x0057, all -> 0x004d }
            com.ss.android.ugc.effectmanager.b.a$c r6 = r6.a((java.lang.String) r2)     // Catch:{ IOException -> 0x0057, all -> 0x004d }
            if (r6 != 0) goto L_0x0038
            if (r6 == 0) goto L_0x0037
            r6.close()
        L_0x0037:
            return r0
        L_0x0038:
            java.io.File[] r1 = r6.f77237a     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            r2 = 0
            r1 = r1[r2]     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            com.ss.android.ugc.effectmanager.model.LocalModelInfo r1 = com.ss.android.ugc.effectmanager.model.LocalModelInfo.fromFile(r1)     // Catch:{ IOException -> 0x0058, all -> 0x004b }
            if (r6 == 0) goto L_0x004a
            r6.close()
        L_0x004a:
            return r1
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x0051:
            if (r6 == 0) goto L_0x0056
            r6.close()
        L_0x0056:
            throw r0
        L_0x0057:
            r6 = r0
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            r6.close()
        L_0x005d:
            return r0
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.f.a(java.lang.String):com.ss.android.ugc.effectmanager.model.LocalModelInfo");
    }

    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    f(String str, String str2) {
        try {
            com.ss.android.ugc.effectmanager.b.a aVar = new com.ss.android.ugc.effectmanager.b.a(new File(str), str2.hashCode(), 1, Long.MAX_VALUE);
            this.f77473b = aVar;
            this.f77472a = str;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(java.lang.String r7, java.io.InputStream r8, java.security.MessageDigest r9, java.lang.String r10) {
        /*
            r6 = this;
            java.lang.String r7 = b(r7)
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r1 = r6.f77473b     // Catch:{ IOException -> 0x0064 }
            r2 = -1
            com.ss.android.ugc.effectmanager.b.a$a r7 = r1.a((java.lang.String) r7, (long) r2)     // Catch:{ IOException -> 0x0064 }
            com.ss.android.ugc.effectmanager.f$a r0 = new com.ss.android.ugc.effectmanager.f$a     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.security.DigestOutputStream r1 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r4 = 0
            java.io.OutputStream r5 = r7.a(r4)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r1.<init>(r5, r9)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            a(r8, r0)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r0.close()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            byte[] r8 = r9.digest()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.lang.String r8 = com.ss.android.ugc.effectmanager.common.f.e.b(r8)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            boolean r8 = r8.equals(r10)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r8 == 0) goto L_0x0053
            boolean r8 = r7.f77227c     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r9 = 1
            if (r8 == 0) goto L_0x0044
            com.ss.android.ugc.effectmanager.b.a r8 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r8.a((com.ss.android.ugc.effectmanager.b.a.C0807a) r7, (boolean) r4)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            com.ss.android.ugc.effectmanager.b.a r8 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            com.ss.android.ugc.effectmanager.b.a$b r10 = r7.f77225a     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            java.lang.String r10 = r10.f77231a     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r8.b(r10)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            goto L_0x0049
        L_0x0044:
            com.ss.android.ugc.effectmanager.b.a r8 = com.ss.android.ugc.effectmanager.b.a.this     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            r8.a((com.ss.android.ugc.effectmanager.b.a.C0807a) r7, (boolean) r9)     // Catch:{ IOException -> 0x005e, all -> 0x005c }
        L_0x0049:
            r7.f77228d = r9     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            long r8 = r0.f77474a     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r7 == 0) goto L_0x0052
            r7.b()
        L_0x0052:
            return r8
        L_0x0053:
            r7.a()     // Catch:{ IOException -> 0x005e, all -> 0x005c }
            if (r7 == 0) goto L_0x005b
            r7.b()
        L_0x005b:
            return r2
        L_0x005c:
            r8 = move-exception
            goto L_0x006b
        L_0x005e:
            r8 = move-exception
            r0 = r7
            goto L_0x0065
        L_0x0061:
            r8 = move-exception
            r7 = r0
            goto L_0x006b
        L_0x0064:
            r8 = move-exception
        L_0x0065:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x0061 }
            r7.<init>(r8)     // Catch:{ all -> 0x0061 }
            throw r7     // Catch:{ all -> 0x0061 }
        L_0x006b:
            if (r7 == 0) goto L_0x0070
            r7.b()
        L_0x0070:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.f.a(java.lang.String, java.io.InputStream, java.security.MessageDigest, java.lang.String):long");
    }
}
