package com.facebook.cache.disk;

import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.cache.disk.c;
import com.facebook.common.b.c;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DefaultDiskStorage implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f23429a = DefaultDiskStorage.class;

    /* renamed from: b  reason: collision with root package name */
    static final long f23430b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c  reason: collision with root package name */
    public final File f23431c;

    /* renamed from: d  reason: collision with root package name */
    public final File f23432d;

    /* renamed from: e  reason: collision with root package name */
    public final com.facebook.cache.common.a f23433e;

    /* renamed from: f  reason: collision with root package name */
    public final com.facebook.common.time.a f23434f;
    private final boolean g;

    public @interface FileType {
    }

    class a implements com.facebook.common.b.b {

        /* renamed from: b  reason: collision with root package name */
        private final List<c.C0253c> f23436b;

        public final void a(File file) {
        }

        public final void c(File file) {
        }

        public final List<c.C0253c> a() {
            return Collections.unmodifiableList(this.f23436b);
        }

        private a() {
            this.f23436b = new ArrayList();
        }

        public final void b(File file) {
            c a2 = DefaultDiskStorage.this.a(file);
            if (a2 != null && a2.f23441a == ".cnt") {
                this.f23436b.add(new b(a2.f23442b, file, (byte) 0));
            }
        }

        /* synthetic */ a(DefaultDiskStorage defaultDiskStorage, byte b2) {
            this();
        }
    }

    @VisibleForTesting
    static class b implements c.C0253c {

        /* renamed from: a  reason: collision with root package name */
        public final FileBinaryResource f23437a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23438b;

        /* renamed from: c  reason: collision with root package name */
        private long f23439c;

        /* renamed from: d  reason: collision with root package name */
        private long f23440d;

        public final String a() {
            return this.f23438b;
        }

        public final long b() {
            if (this.f23440d < 0) {
                this.f23440d = this.f23437a.getFile().lastModified();
            }
            return this.f23440d;
        }

        public final long c() {
            if (this.f23439c < 0) {
                this.f23439c = this.f23437a.size();
            }
            return this.f23439c;
        }

        private b(String str, File file) {
            Preconditions.checkNotNull(file);
            this.f23438b = (String) Preconditions.checkNotNull(str);
            this.f23437a = FileBinaryResource.createOrNull(file);
            this.f23439c = -1;
            this.f23440d = -1;
        }

        /* synthetic */ b(String str, File file, byte b2) {
            this(str, file);
        }
    }

    static class c {
        @FileType

        /* renamed from: a  reason: collision with root package name */
        public final String f23441a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23442b;

        public final String toString() {
            return this.f23441a + "(" + this.f23442b + ")";
        }

        c(@FileType String str, String str2) {
            this.f23441a = str;
            this.f23442b = str2;
        }

        /* synthetic */ c(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    static class d extends IOException {
        public final long actual;
        public final long expected;

        public d(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.expected = j;
            this.actual = j2;
        }
    }

    @VisibleForTesting
    class e implements c.d {
        @VisibleForTesting

        /* renamed from: a  reason: collision with root package name */
        final File f23443a;

        /* renamed from: c  reason: collision with root package name */
        private final String f23445c;

        public final boolean b() {
            if (!this.f23443a.exists() || this.f23443a.delete()) {
                return true;
            }
            return false;
        }

        public final BinaryResource a() throws IOException {
            File a2 = DefaultDiskStorage.this.a(this.f23445c);
            try {
                com.facebook.common.b.c.a(this.f23443a, a2);
                if (a2.exists()) {
                    a2.setLastModified(DefaultDiskStorage.this.f23434f.a());
                }
                return FileBinaryResource.createOrNull(a2);
            } catch (c.d e2) {
                e2.getCause();
                throw e2;
            }
        }

        /* JADX INFO: finally extract failed */
        public final void a(com.facebook.cache.common.f fVar) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f23443a);
                try {
                    com.facebook.common.internal.d dVar = new com.facebook.common.internal.d(fileOutputStream);
                    fVar.write(dVar);
                    dVar.flush();
                    long j = dVar.f23530a;
                    fileOutputStream.close();
                    if (this.f23443a.length() != j) {
                        throw new d(j, this.f23443a.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                throw e2;
            }
        }

        public e(String str, File file) {
            this.f23445c = str;
            this.f23443a = file;
        }
    }

    class f implements com.facebook.common.b.b {

        /* renamed from: b  reason: collision with root package name */
        private boolean f23447b;

        private f() {
        }

        public final void a(File file) {
            if (!this.f23447b && file.equals(DefaultDiskStorage.this.f23432d)) {
                this.f23447b = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
            if (r10.lastModified() > (r9.f23446a.f23434f.a() - com.facebook.cache.disk.DefaultDiskStorage.f23430b)) goto L_0x0034;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(java.io.File r10) {
            /*
                r9 = this;
                boolean r0 = r9.f23447b
                if (r0 == 0) goto L_0x0036
                com.facebook.cache.disk.DefaultDiskStorage r0 = com.facebook.cache.disk.DefaultDiskStorage.this
                com.facebook.cache.disk.DefaultDiskStorage$c r0 = r0.a((java.io.File) r10)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r1 = 0
                goto L_0x0034
            L_0x0010:
                java.lang.String r3 = r0.f23441a
                java.lang.String r4 = ".tmp"
                if (r3 != r4) goto L_0x002a
                long r3 = r10.lastModified()
                com.facebook.cache.disk.DefaultDiskStorage r0 = com.facebook.cache.disk.DefaultDiskStorage.this
                com.facebook.common.time.a r0 = r0.f23434f
                long r5 = r0.a()
                long r7 = com.facebook.cache.disk.DefaultDiskStorage.f23430b
                long r5 = r5 - r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x000e
                goto L_0x0034
            L_0x002a:
                java.lang.String r0 = r0.f23441a
                java.lang.String r3 = ".cnt"
                if (r0 != r3) goto L_0x0031
                r2 = 1
            L_0x0031:
                com.facebook.common.internal.Preconditions.checkState(r2)
            L_0x0034:
                if (r1 != 0) goto L_0x0039
            L_0x0036:
                r10.delete()
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.f.b(java.io.File):void");
        }

        public final void c(File file) {
            if (!DefaultDiskStorage.this.f23431c.equals(file) && !this.f23447b) {
                file.delete();
            }
            if (this.f23447b && file.equals(DefaultDiskStorage.this.f23432d)) {
                this.f23447b = false;
            }
        }

        /* synthetic */ f(DefaultDiskStorage defaultDiskStorage, byte b2) {
            this();
        }
    }

    public final boolean a() {
        return true;
    }

    public final boolean b() {
        return this.g;
    }

    public final void d() {
        com.facebook.common.b.a.a(this.f23431c);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public List<c.C0253c> f() throws IOException {
        a aVar = new a(this, (byte) 0);
        com.facebook.common.b.a.a(this.f23432d, aVar);
        return aVar.a();
    }

    public final void c() {
        com.facebook.common.b.a.a(this.f23431c, new f(this, (byte) 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.cache.disk.c.a e() throws java.io.IOException {
        /*
            r12 = this;
            java.util.List r0 = r12.f()
            com.facebook.cache.disk.c$a r1 = new com.facebook.cache.disk.c$a
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00de
            java.lang.Object r2 = r0.next()
            com.facebook.cache.disk.c$c r2 = (com.facebook.cache.disk.c.C0253c) r2
            com.facebook.cache.disk.DefaultDiskStorage$b r2 = (com.facebook.cache.disk.DefaultDiskStorage.b) r2
            java.lang.String r3 = ""
            com.facebook.binaryresource.FileBinaryResource r4 = r2.f23437a
            byte[] r4 = r4.read()
            int r5 = r4.length
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 < r6) goto L_0x0062
            byte r5 = r4[r8]
            r9 = -1
            if (r5 != r9) goto L_0x0037
            byte r5 = r4[r7]
            r9 = -40
            if (r5 != r9) goto L_0x0037
            java.lang.String r5 = "jpg"
            goto L_0x0064
        L_0x0037:
            byte r5 = r4[r8]
            r9 = -119(0xffffffffffffff89, float:NaN)
            if (r5 != r9) goto L_0x0046
            byte r5 = r4[r7]
            r9 = 80
            if (r5 != r9) goto L_0x0046
            java.lang.String r5 = "png"
            goto L_0x0064
        L_0x0046:
            byte r5 = r4[r8]
            r9 = 82
            r10 = 73
            if (r5 != r9) goto L_0x0055
            byte r5 = r4[r7]
            if (r5 != r10) goto L_0x0055
            java.lang.String r5 = "webp"
            goto L_0x0064
        L_0x0055:
            byte r5 = r4[r8]
            r9 = 71
            if (r5 != r9) goto L_0x0062
            byte r5 = r4[r7]
            if (r5 != r10) goto L_0x0062
            java.lang.String r5 = "gif"
            goto L_0x0064
        L_0x0062:
            java.lang.String r5 = "undefined"
        L_0x0064:
            java.lang.String r9 = "undefined"
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x009a
            int r9 = r4.length
            r10 = 4
            if (r9 < r10) goto L_0x009a
            r3 = 0
            java.lang.String r9 = "0x%02X 0x%02X 0x%02X 0x%02X"
            java.lang.Object[] r10 = new java.lang.Object[r10]
            byte r11 = r4[r8]
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            r10[r8] = r11
            byte r11 = r4[r7]
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            r10[r7] = r11
            byte r11 = r4[r6]
            java.lang.Byte r11 = java.lang.Byte.valueOf(r11)
            r10[r6] = r11
            r6 = 3
            byte r4 = r4[r6]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r10[r6] = r4
            java.lang.String r3 = java.lang.String.format(r3, r9, r10)
        L_0x009a:
            com.facebook.binaryresource.FileBinaryResource r4 = r2.f23437a
            java.io.File r4 = r4.getFile()
            java.lang.String r4 = r4.getPath()
            com.facebook.cache.disk.c$b r6 = new com.facebook.cache.disk.c$b
            long r9 = r2.c()
            float r2 = (float) r9
            r6.<init>(r4, r5, r2, r3)
            java.lang.String r2 = r6.f23465b
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.f23463b
            boolean r3 = r3.containsKey(r2)
            if (r3 != 0) goto L_0x00c1
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.f23463b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.put(r2, r4)
        L_0x00c1:
            java.util.Map<java.lang.String, java.lang.Integer> r3 = r1.f23463b
            java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.f23463b
            java.lang.Object r4 = r4.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = r4 + r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.put(r2, r4)
            java.util.List<com.facebook.cache.disk.c$b> r2 = r1.f23462a
            r2.add(r6)
            goto L_0x000d
        L_0x00de:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.e():com.facebook.cache.disk.c$a");
    }

    private File d(String str) {
        return new File(c(str));
    }

    public final long a(c.C0253c cVar) {
        return b(((b) cVar).f23437a.getFile());
    }

    public final long b(String str) {
        return b(a(str));
    }

    private static long b(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1;
    }

    private String c(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        return this.f23432d + File.separator + valueOf;
    }

    public final c a(File file) {
        c cVar;
        String str;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            if (".cnt".equals(substring)) {
                str = ".cnt";
            } else if (".tmp".equals(substring)) {
                str = ".tmp";
            } else {
                str = null;
            }
            if (str != null) {
                String substring2 = name.substring(0, lastIndexOf);
                if (str.equals(".tmp")) {
                    int lastIndexOf2 = substring2.lastIndexOf(46);
                    if (lastIndexOf2 > 0) {
                        substring2 = substring2.substring(0, lastIndexOf2);
                    }
                }
                cVar = new c(str, substring2);
                if (cVar == null && d(cVar.f23442b).equals(file.getParentFile())) {
                    return cVar;
                }
                return null;
            }
        }
        cVar = null;
        if (cVar == null) {
            return null;
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final File a(String str) {
        c cVar = new c(".cnt", str, (byte) 0);
        String c2 = c(cVar.f23442b);
        return new File(c2 + File.separator + cVar.f23442b + cVar.f23441a);
    }

    public final boolean c(String str, Object obj) {
        return a(str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        new java.lang.StringBuilder("failed to read folder to check if external: ").append(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r1, com.facebook.cache.common.a r2) {
        /*
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x001e }
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x001e }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0013 }
            boolean r2 = r1.contains(r2)     // Catch:{ IOException -> 0x0014 }
            goto L_0x001f
        L_0x0013:
            r1 = 0
        L_0x0014:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x001e }
            java.lang.String r0 = "failed to read folder to check if external: "
            r2.<init>(r0)     // Catch:{ Exception -> 0x001e }
            r2.append(r1)     // Catch:{ Exception -> 0x001e }
        L_0x001e:
            r2 = 0
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cache.disk.DefaultDiskStorage.a(java.io.File, com.facebook.cache.common.a):boolean");
    }

    public final boolean d(String str, Object obj) {
        return a(str, true);
    }

    private boolean a(String str, boolean z) {
        File a2 = a(str);
        boolean exists = a2.exists();
        if (z && exists) {
            a2.setLastModified(this.f23434f.a());
        }
        return exists;
    }

    public final BinaryResource b(String str, Object obj) {
        File a2 = a(str);
        if (!a2.exists()) {
            return null;
        }
        a2.setLastModified(this.f23434f.a());
        return FileBinaryResource.createOrNull(a2);
    }

    public final c.d a(String str, Object obj) throws IOException {
        c cVar = new c(".tmp", str, (byte) 0);
        File d2 = d(cVar.f23442b);
        if (!d2.exists()) {
            try {
                com.facebook.common.b.c.a(d2);
            } catch (c.a e2) {
                throw e2;
            }
        }
        try {
            return new e(str, File.createTempFile(cVar.f23442b + ClassUtils.PACKAGE_SEPARATOR, ".tmp", d2));
        } catch (IOException e3) {
            throw e3;
        }
    }

    public DefaultDiskStorage(File file, int i, com.facebook.cache.common.a aVar) {
        Preconditions.checkNotNull(file);
        this.f23431c = file;
        this.g = a(file, aVar);
        boolean z = true;
        this.f23432d = new File(this.f23431c, String.format(null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i)}));
        this.f23433e = aVar;
        if (this.f23431c.exists()) {
            if (!this.f23432d.exists()) {
                com.facebook.common.b.a.b(this.f23431c);
            } else {
                z = false;
            }
        }
        if (z) {
            try {
                com.facebook.common.b.c.a(this.f23432d);
            } catch (c.a unused) {
                new StringBuilder("version directory could not be created: ").append(this.f23432d);
            }
        }
        this.f23434f = com.facebook.common.time.c.b();
    }
}
