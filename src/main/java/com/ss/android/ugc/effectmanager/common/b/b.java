package com.ss.android.ugc.effectmanager.common.b;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final File f77296a;

    /* renamed from: b  reason: collision with root package name */
    private final File f77297b;

    /* renamed from: c  reason: collision with root package name */
    private final File f77298c;

    /* renamed from: d  reason: collision with root package name */
    private Writer f77299d;

    /* renamed from: e  reason: collision with root package name */
    private int f77300e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedHashMap<String, String> f77301f = new LinkedHashMap<>(0, 0.75f, true);

    private void a() throws IOException {
        if (this.f77299d == null) {
            throw new IllegalStateException("map file is closed");
        } else if (!this.f77296a.exists()) {
            c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|(1:18)(1:19)|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7.f77300e = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r0.b() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        r7.f77299d = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r7.f77296a, true), com.ss.android.ugc.effectmanager.common.b.d.f77308a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0067 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0034=Splitter:B:9:0x0034, B:22:0x008d=Splitter:B:22:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() throws java.io.IOException {
        /*
            r7 = this;
            com.ss.android.ugc.effectmanager.common.b.c r0 = new com.ss.android.ugc.effectmanager.common.b.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r7.f77296a
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.ss.android.ugc.effectmanager.common.b.d.f77308a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = r0.a()     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r0.a()     // Catch:{ all -> 0x00b6 }
            java.lang.String r4 = "id.to.effectid"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r3)     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x008d
            r1 = 0
            r2 = 0
        L_0x0034:
            java.lang.String r3 = r0.a()     // Catch:{ EOFException -> 0x0067 }
            r4 = 32
            int r4 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x0067 }
            r5 = -1
            if (r4 == r5) goto L_0x0053
            java.lang.String r5 = r3.substring(r1, r4)     // Catch:{ EOFException -> 0x0067 }
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x0067 }
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r7.f77301f     // Catch:{ EOFException -> 0x0067 }
            r4.put(r5, r3)     // Catch:{ EOFException -> 0x0067 }
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0053:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ EOFException -> 0x0067 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0067 }
            java.lang.String r5 = "unexpected Map line: "
            r4.<init>(r5)     // Catch:{ EOFException -> 0x0067 }
            r4.append(r3)     // Catch:{ EOFException -> 0x0067 }
            java.lang.String r3 = r4.toString()     // Catch:{ EOFException -> 0x0067 }
            r1.<init>(r3)     // Catch:{ EOFException -> 0x0067 }
            throw r1     // Catch:{ EOFException -> 0x0067 }
        L_0x0067:
            r7.f77300e = r2     // Catch:{ all -> 0x00b6 }
            boolean r1 = r0.b()     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x0073
            r7.c()     // Catch:{ all -> 0x00b6 }
            goto L_0x0089
        L_0x0073:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00b6 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00b6 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b6 }
            java.io.File r4 = r7.f77296a     // Catch:{ all -> 0x00b6 }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00b6 }
            java.nio.charset.Charset r4 = com.ss.android.ugc.effectmanager.common.b.d.f77308a     // Catch:{ all -> 0x00b6 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00b6 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b6 }
            r7.f77299d = r1     // Catch:{ all -> 0x00b6 }
        L_0x0089:
            com.ss.android.ugc.effectmanager.common.b.d.a((java.io.Closeable) r0)
            return
        L_0x008d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            java.lang.String r6 = "unexpected Map header: ["
            r5.<init>(r6)     // Catch:{ all -> 0x00b6 }
            r5.append(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = ", "
            r5.append(r1)     // Catch:{ all -> 0x00b6 }
            r5.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = ", "
            r5.append(r1)     // Catch:{ all -> 0x00b6 }
            r5.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "]"
            r5.append(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00b6 }
            r4.<init>(r1)     // Catch:{ all -> 0x00b6 }
            throw r4     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r1 = move-exception
            com.ss.android.ugc.effectmanager.common.b.d.a((java.io.Closeable) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.b.b.b():void");
    }

    /* JADX INFO: finally extract failed */
    private synchronized void c() throws IOException {
        if (this.f77299d != null) {
            this.f77299d.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f77297b), d.f77308a));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.f77300e = 0;
            for (Map.Entry next : this.f77301f.entrySet()) {
                bufferedWriter.write(((String) next.getKey()) + ' ' + ((String) next.getValue()) + 10);
                this.f77300e = this.f77300e + 1;
            }
            bufferedWriter.close();
            if (this.f77296a.exists()) {
                a(this.f77296a, this.f77298c, true);
            }
            a(this.f77297b, this.f77296a, false);
            this.f77298c.delete();
            this.f77299d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f77296a, true), d.f77308a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final String a(String str) {
        return this.f77301f.get(str);
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public b(File file) {
        this.f77296a = new File(file, "effectidmap");
        this.f77297b = new File(file, "effectidmap.tmp");
        this.f77298c = new File(file, "effectidmap.bak");
        try {
            if (this.f77298c.exists()) {
                if (this.f77296a.exists()) {
                    this.f77298c.delete();
                } else {
                    a(this.f77298c, this.f77296a, false);
                }
            }
            if (this.f77296a.exists()) {
                b();
            } else {
                c();
            }
        } catch (IOException e2) {
            PrintStream printStream = System.out;
            printStream.println("EffectIdMapFile " + file + " is corrupt: " + e2.getMessage() + ", removing");
            this.f77296a.delete();
        }
    }

    public final void a(String str, String str2) {
        if (!this.f77301f.containsKey(str)) {
            this.f77301f.put(str, str2);
            try {
                a();
                Writer writer = this.f77299d;
                writer.write(str + ' ' + str2 + 10);
                this.f77299d.flush();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
