package com.ss.ugc.live.b.a.d;

import com.ss.ugc.live.b.a.a;
import com.ss.ugc.live.b.a.c;

public final class f implements a<String>, d<String> {

    /* renamed from: a  reason: collision with root package name */
    private d<String> f78651a;

    /* renamed from: b  reason: collision with root package name */
    private a<String> f78652b;

    public f(d dVar) {
        this.f78651a = dVar;
    }

    public final void a(c cVar, a<String> aVar) {
        this.f78652b = aVar;
        this.f78651a.a(cVar, this);
    }

    public final void a(c cVar, int i) {
        if (this.f78652b != null) {
            this.f78652b.a(cVar, i);
        }
    }

    public final void a(c cVar, com.ss.ugc.live.b.a.c.a aVar) {
        if (this.f78652b != null) {
            this.f78652b.a(cVar, aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.ss.ugc.live.b.a.c r8, java.lang.Object r9) {
        /*
            r7 = this;
            java.lang.String r9 = (java.lang.String) r9
            r0 = 0
            java.lang.String r1 = "/"
            int r1 = r9.lastIndexOf(r1)     // Catch:{ Exception -> 0x00ae }
            r2 = 0
            java.lang.String r1 = r9.substring(r2, r1)     // Catch:{ Exception -> 0x00ae }
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00ac }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ac }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00ac }
            r4.<init>(r9)     // Catch:{ Exception -> 0x00ac }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ac }
            r0.<init>(r3)     // Catch:{ Exception -> 0x00ac }
        L_0x001d:
            java.util.zip.ZipEntry r3 = r0.getNextEntry()     // Catch:{ Exception -> 0x00ac }
            if (r3 == 0) goto L_0x0097
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x00ac }
            boolean r3 = r3.isDirectory()     // Catch:{ Exception -> 0x00ac }
            if (r3 == 0) goto L_0x004a
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00ac }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac }
            r5.<init>()     // Catch:{ Exception -> 0x00ac }
            r5.append(r1)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x00ac }
            r5.append(r6)     // Catch:{ Exception -> 0x00ac }
            r5.append(r4)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00ac }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ac }
            r3.mkdirs()     // Catch:{ Exception -> 0x00ac }
            goto L_0x001d
        L_0x004a:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00ac }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ac }
            r5.<init>()     // Catch:{ Exception -> 0x00ac }
            r5.append(r1)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r6 = java.io.File.separator     // Catch:{ Exception -> 0x00ac }
            r5.append(r6)     // Catch:{ Exception -> 0x00ac }
            r5.append(r4)     // Catch:{ Exception -> 0x00ac }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00ac }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00ac }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00ac }
            if (r4 == 0) goto L_0x006d
            r3.delete()     // Catch:{ Exception -> 0x00ac }
            goto L_0x0074
        L_0x006d:
            java.io.File r4 = r3.getParentFile()     // Catch:{ Exception -> 0x00ac }
            r4.mkdirs()     // Catch:{ Exception -> 0x00ac }
        L_0x0074:
            r3.createNewFile()     // Catch:{ Exception -> 0x00ac }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00ac }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00ac }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00ac }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00ac }
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00ac }
        L_0x0085:
            int r5 = r0.read(r3)     // Catch:{ Exception -> 0x00ac }
            r6 = -1
            if (r5 == r6) goto L_0x0090
            r4.write(r3, r2, r5)     // Catch:{ Exception -> 0x00ac }
            goto L_0x0085
        L_0x0090:
            r4.flush()     // Catch:{ Exception -> 0x00ac }
            r4.close()     // Catch:{ Exception -> 0x00ac }
            goto L_0x001d
        L_0x0097:
            r0.close()     // Catch:{ Exception -> 0x00ac }
            com.ss.ugc.live.b.a.a<java.lang.String> r0 = r7.f78652b     // Catch:{ Exception -> 0x00ac }
            if (r0 == 0) goto L_0x00a3
            com.ss.ugc.live.b.a.a<java.lang.String> r0 = r7.f78652b     // Catch:{ Exception -> 0x00ac }
            r0.a((com.ss.ugc.live.b.a.c) r8, r1)     // Catch:{ Exception -> 0x00ac }
        L_0x00a3:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00ac }
            r0.<init>(r9)     // Catch:{ Exception -> 0x00ac }
            r0.delete()     // Catch:{ Exception -> 0x00ac }
            return
        L_0x00ac:
            r9 = move-exception
            goto L_0x00b0
        L_0x00ae:
            r9 = move-exception
            r1 = r0
        L_0x00b0:
            com.ss.ugc.live.b.a.c.d r0 = new com.ss.ugc.live.b.a.c.d
            java.lang.String r2 = "unzip exception"
            r0.<init>(r2, r9, r8)
            r7.a((com.ss.ugc.live.b.a.c) r8, (com.ss.ugc.live.b.a.c.a) r0)
            if (r1 == 0) goto L_0x00c4
            java.io.File r8 = new java.io.File
            r8.<init>(r1)
            com.ss.ugc.live.b.a.e.b.a((java.io.File) r8)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.b.a.d.f.a(com.ss.ugc.live.b.a.c, java.lang.Object):void");
    }
}
