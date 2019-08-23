package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.disk.c;
import com.facebook.common.b.c;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import javax.annotation.Nullable;

public class e implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f23481b = e.class;
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    volatile a f23482a = new a(null, null);

    /* renamed from: c  reason: collision with root package name */
    private final int f23483c;

    /* renamed from: d  reason: collision with root package name */
    private final Supplier<File> f23484d;

    /* renamed from: e  reason: collision with root package name */
    private final String f23485e;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.cache.common.a f23486f;

    @VisibleForTesting
    static class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final c f23487a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final File f23488b;

        @VisibleForTesting
        a(@Nullable File file, @Nullable c cVar) {
            this.f23487a = cVar;
            this.f23488b = file;
        }
    }

    public final void d() throws IOException {
        g().d();
    }

    public final c.a e() throws IOException {
        return g().e();
    }

    public final Collection<c.C0253c> f() throws IOException {
        return g().f();
    }

    public final void c() {
        try {
            g().c();
        } catch (IOException e2) {
            FLog.e(f23481b, "purgeUnexpectedResources", (Throwable) e2);
        }
    }

    public final boolean b() {
        try {
            return g().b();
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0019  */
    @com.facebook.common.internal.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.cache.disk.c g() throws java.io.IOException {
        /*
            r4 = this;
            monitor-enter(r4)
            com.facebook.cache.disk.e$a r0 = r4.f23482a     // Catch:{ all -> 0x005a }
            com.facebook.cache.disk.c r1 = r0.f23487a     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0016
            java.io.File r1 = r0.f23488b     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x0016
            java.io.File r0 = r0.f23488b     // Catch:{ all -> 0x005a }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x004e
            com.facebook.cache.disk.e$a r0 = r4.f23482a     // Catch:{ all -> 0x005a }
            com.facebook.cache.disk.c r0 = r0.f23487a     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x002c
            com.facebook.cache.disk.e$a r0 = r4.f23482a     // Catch:{ all -> 0x005a }
            java.io.File r0 = r0.f23488b     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x002c
            com.facebook.cache.disk.e$a r0 = r4.f23482a     // Catch:{ all -> 0x005a }
            java.io.File r0 = r0.f23488b     // Catch:{ all -> 0x005a }
            com.facebook.common.b.a.b(r0)     // Catch:{ all -> 0x005a }
        L_0x002c:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x005a }
            com.facebook.common.internal.Supplier<java.io.File> r1 = r4.f23484d     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005a }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x005a }
            java.lang.String r2 = r4.f23485e     // Catch:{ all -> 0x005a }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x005a }
            r4.a((java.io.File) r0)     // Catch:{ all -> 0x005a }
            com.facebook.cache.disk.DefaultDiskStorage r1 = new com.facebook.cache.disk.DefaultDiskStorage     // Catch:{ all -> 0x005a }
            int r2 = r4.f23483c     // Catch:{ all -> 0x005a }
            com.facebook.cache.common.a r3 = r4.f23486f     // Catch:{ all -> 0x005a }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x005a }
            com.facebook.cache.disk.e$a r2 = new com.facebook.cache.disk.e$a     // Catch:{ all -> 0x005a }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x005a }
            r4.f23482a = r2     // Catch:{ all -> 0x005a }
        L_0x004e:
            com.facebook.cache.disk.e$a r0 = r4.f23482a     // Catch:{ all -> 0x005a }
            com.facebook.cache.disk.c r0 = r0.f23487a     // Catch:{ all -> 0x005a }
            java.lang.Object r0 = com.facebook.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x005a }
            com.facebook.cache.disk.c r0 = (com.facebook.cache.disk.c) r0     // Catch:{ all -> 0x005a }
            monitor-exit(r4)
            return r0
        L_0x005a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.e.g():com.facebook.cache.disk.c");
    }

    public final boolean a() {
        try {
            return g().a();
        } catch (IOException unused) {
            return false;
        }
    }

    public final long a(c.C0253c cVar) throws IOException {
        return g().a(cVar);
    }

    public final long b(String str) throws IOException {
        return g().b(str);
    }

    @VisibleForTesting
    private void a(File file) throws IOException {
        try {
            com.facebook.common.b.c.a(file);
            FLog.d(f23481b, "Created cache directory %s", (Object) file.getAbsolutePath());
        } catch (c.a e2) {
            throw e2;
        }
    }

    public final boolean c(String str, Object obj) throws IOException {
        return g().c(str, obj);
    }

    public final boolean d(String str, Object obj) throws IOException {
        return g().d(str, obj);
    }

    public final BinaryResource b(String str, Object obj) throws IOException {
        return g().b(str, obj);
    }

    public final c.d a(String str, Object obj) throws IOException {
        return g().a(str, obj);
    }

    public e(int i, Supplier<File> supplier, String str, com.facebook.cache.common.a aVar) {
        this.f23483c = i;
        this.f23486f = aVar;
        this.f23484d = supplier;
        this.f23485e = str;
    }
}
