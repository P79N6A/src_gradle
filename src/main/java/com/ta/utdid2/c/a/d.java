package com.ta.utdid2.c.a;

import com.ta.utdid2.c.a.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f78863c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private File f78864a;

    /* renamed from: a  reason: collision with other field name */
    private HashMap<File, a> f52a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final Object f78865b = new Object();

    static final class a implements b {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f78866d = new Object();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<b.C0846b, Object> f78867a;

        /* renamed from: b  reason: collision with root package name */
        private final File f78868b;

        /* renamed from: c  reason: collision with root package name */
        private final int f78869c;

        /* renamed from: c  reason: collision with other field name */
        private final File f53c;

        /* renamed from: c  reason: collision with other field name */
        private Map f54c;
        private boolean k;

        /* renamed from: com.ta.utdid2.c.a.d$a$a  reason: collision with other inner class name */
        public final class C0847a implements b.a {

            /* renamed from: d  reason: collision with root package name */
            private final Map<String, Object> f78871d = new HashMap();
            private boolean l = false;

            public final b.a b() {
                synchronized (this) {
                    this.l = true;
                }
                return this;
            }

            public final boolean commit() {
                boolean z;
                ArrayList arrayList;
                HashSet<b.C0846b> hashSet;
                boolean a2;
                synchronized (d.a()) {
                    if (a.a(a.this).size() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList = null;
                    if (z) {
                        arrayList = new ArrayList();
                        hashSet = new HashSet<>(a.a(a.this).keySet());
                    } else {
                        hashSet = null;
                    }
                    synchronized (this) {
                        if (this.l) {
                            a.a(a.this).clear();
                            this.l = false;
                        }
                        for (Map.Entry next : this.f78871d.entrySet()) {
                            String str = (String) next.getKey();
                            Object value = next.getValue();
                            if (value == this) {
                                a.a(a.this).remove(str);
                            } else {
                                a.a(a.this).put(str, value);
                            }
                            if (z) {
                                arrayList.add(str);
                            }
                        }
                        this.f78871d.clear();
                    }
                    a2 = a.a(a.this);
                    if (a2) {
                        a.this.a(true);
                    }
                }
                if (z) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        String str2 = (String) arrayList.get(size);
                        for (b.C0846b bVar : hashSet) {
                            if (bVar != null) {
                                bVar.a(a.this, str2);
                            }
                        }
                    }
                }
                return a2;
            }

            public C0847a() {
            }

            public final b.a a(String str) {
                synchronized (this) {
                    this.f78871d.put(str, this);
                }
                return this;
            }

            public final b.a a(String str, float f2) {
                synchronized (this) {
                    this.f78871d.put(str, Float.valueOf(f2));
                }
                return this;
            }

            public final b.a a(String str, int i) {
                synchronized (this) {
                    this.f78871d.put(str, Integer.valueOf(i));
                }
                return this;
            }

            public final b.a a(String str, long j) {
                synchronized (this) {
                    this.f78871d.put(str, Long.valueOf(j));
                }
                return this;
            }

            public final b.a a(String str, String str2) {
                synchronized (this) {
                    this.f78871d.put(str, str2);
                }
                return this;
            }

            public final b.a a(String str, boolean z) {
                synchronized (this) {
                    this.f78871d.put(str, Boolean.valueOf(z));
                }
                return this;
            }
        }

        public final boolean c() {
            boolean z;
            synchronized (this) {
                z = this.k;
            }
            return z;
        }

        public final Map<String, ?> getAll() {
            HashMap hashMap;
            synchronized (this) {
                hashMap = new HashMap(this.f54c);
            }
            return hashMap;
        }

        public final b.a a() {
            return new C0847a();
        }

        private boolean d() {
            if (this.f78868b.exists()) {
                if (this.f53c.exists()) {
                    this.f78868b.delete();
                } else if (!this.f78868b.renameTo(this.f53c)) {
                    return false;
                }
            }
            try {
                FileOutputStream a2 = a(this.f78868b);
                if (a2 == null) {
                    return false;
                }
                e.a(this.f54c, (OutputStream) a2);
                a2.close();
                this.f53c.delete();
                return true;
            } catch (IOException | XmlPullParserException unused) {
                if (this.f78868b.exists()) {
                    this.f78868b.delete();
                }
                return false;
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public final boolean m20a() {
            if (this.f78868b == null || !new File(this.f78868b.getAbsolutePath()).exists()) {
                return false;
            }
            return true;
        }

        private FileOutputStream a(File file) {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
                if (!file.getParentFile().mkdir()) {
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                } catch (FileNotFoundException unused2) {
                    fileOutputStream = null;
                }
            }
            return fileOutputStream;
        }

        public final void a(Map map) {
            if (map != null) {
                synchronized (this) {
                    this.f54c = map;
                }
            }
        }

        public final void a(boolean z) {
            synchronized (this) {
                this.k = z;
            }
        }

        public final long getLong(String str, long j) {
            synchronized (this) {
                Long l = (Long) this.f54c.get(str);
                if (l != null) {
                    j = l.longValue();
                }
            }
            return j;
        }

        public final String getString(String str, String str2) {
            String str3;
            synchronized (this) {
                str3 = (String) this.f54c.get(str);
                if (str3 == null) {
                    str3 = str2;
                }
            }
            return str3;
        }

        a(File file, int i, Map map) {
            this.f78868b = file;
            this.f53c = d.a(file);
            this.f78869c = i;
            this.f54c = map == null ? new HashMap() : map;
            this.f78867a = new WeakHashMap<>();
        }
    }

    private File a() {
        File file;
        synchronized (this.f78865b) {
            file = this.f78864a;
        }
        return file;
    }

    /* access modifiers changed from: private */
    public static File a(File file) {
        return new File(String.valueOf(file.getPath()) + ".bak");
    }

    private File b(String str) {
        File a2 = a();
        return a(a2, String.valueOf(str) + ".xml");
    }

    public d(String str) {
        if (str == null || str.length() <= 0) {
            throw new RuntimeException("Directory can not be empty");
        }
        this.f78864a = new File(str);
    }

    private File a(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:67|68|(0)|78|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0.exists() == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r9.delete();
        r0.renameTo(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r9.exists() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r9.canRead();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r9.exists() == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if (r9.canRead() == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = new java.io.FileInputStream(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3 = com.ta.utdid2.c.a.e.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0056, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0058, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005a, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0063, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0064, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0066, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0067, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006f, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0072, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0073, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0076, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r3 = new java.io.FileInputStream(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r0 = new byte[r3.available()];
        r3.read(r0);
        new java.lang.String(r0, 0, r0.length, "UTF-8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0093, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0095, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0097, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0098, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x009a, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x009c, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x009e, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x009f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00a0, code lost:
        if (r2 != null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00a6, code lost:
        if (r0 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00ae, code lost:
        if (r0 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00b1, code lost:
        if (r0 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00b6, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00b7, code lost:
        if (r0 != null) goto L_0x0069;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x00a5 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005a A[ExcHandler: all (th java.lang.Throwable), PHI: r0 
      PHI: (r0v28 java.io.FileInputStream) = (r0v11 java.io.FileInputStream), (r0v11 java.io.FileInputStream), (r0v29 java.io.FileInputStream), (r0v29 java.io.FileInputStream), (r0v29 java.io.FileInputStream) binds: [B:82:0x00a8, B:83:?, B:22:0x0045, B:24:0x0049, B:25:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:22:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00a2 A[SYNTHETIC, Splitter:B:76:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00b3 A[SYNTHETIC, Splitter:B:88:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ta.utdid2.c.a.b a(java.lang.String r9, int r10) {
        /*
            r8 = this;
            java.io.File r9 = r8.b((java.lang.String) r9)
            java.lang.Object r0 = f78863c
            monitor-enter(r0)
            java.util.HashMap<java.io.File, com.ta.utdid2.c.a.d$a> r1 = r8.f52a     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x00de }
            com.ta.utdid2.c.a.d$a r1 = (com.ta.utdid2.c.a.d.a) r1     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x0019
            boolean r2 = r1.c()     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            return r1
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            java.io.File r0 = a(r9)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x002a
            r9.delete()
            r0.renameTo(r9)
        L_0x002a:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x0033
            r9.canRead()
        L_0x0033:
            boolean r0 = r9.exists()
            r2 = 0
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r9.canRead()
            if (r0 == 0) goto L_0x00ba
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ XmlPullParserException -> 0x0076, FileNotFoundException -> 0x0072, IOException -> 0x006e, Exception -> 0x0066 }
            r0.<init>(r9)     // Catch:{ XmlPullParserException -> 0x0076, FileNotFoundException -> 0x0072, IOException -> 0x006e, Exception -> 0x0066 }
            java.util.HashMap r3 = com.ta.utdid2.c.a.e.a(r0)     // Catch:{ XmlPullParserException -> 0x0077, FileNotFoundException -> 0x0061, IOException -> 0x005f, Exception -> 0x005d, all -> 0x005a }
            r0.close()     // Catch:{ XmlPullParserException -> 0x0058, FileNotFoundException -> 0x0056, IOException -> 0x0054, Exception -> 0x0052, all -> 0x005a }
            r0.close()     // Catch:{ Throwable -> 0x004f }
        L_0x004f:
            r2 = r3
            goto L_0x00ba
        L_0x0052:
            r2 = r3
            goto L_0x0067
        L_0x0054:
            r2 = r3
            goto L_0x006f
        L_0x0056:
            r2 = r3
            goto L_0x0073
        L_0x0058:
            r2 = r3
            goto L_0x0077
        L_0x005a:
            r9 = move-exception
            goto L_0x00b1
        L_0x005d:
            goto L_0x0067
        L_0x005f:
            goto L_0x006f
        L_0x0061:
            goto L_0x0073
        L_0x0063:
            r9 = move-exception
            r0 = r2
            goto L_0x00b1
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 == 0) goto L_0x00ba
        L_0x0069:
            r0.close()     // Catch:{ Throwable -> 0x00ba }
            goto L_0x00ba
        L_0x006e:
            r0 = r2
        L_0x006f:
            if (r0 == 0) goto L_0x00ba
            goto L_0x0069
        L_0x0072:
            r0 = r2
        L_0x0073:
            if (r0 == 0) goto L_0x00ba
            goto L_0x0069
        L_0x0076:
            r0 = r2
        L_0x0077:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ae, IOException -> 0x00a6, all -> 0x009e }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00ae, IOException -> 0x00a6, all -> 0x009e }
            int r0 = r3.available()     // Catch:{ FileNotFoundException -> 0x009c, IOException -> 0x009a, all -> 0x0097 }
            byte[] r0 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x009c, IOException -> 0x009a, all -> 0x0097 }
            r3.read(r0)     // Catch:{ FileNotFoundException -> 0x009c, IOException -> 0x009a, all -> 0x0097 }
            java.lang.String r4 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x009c, IOException -> 0x009a, all -> 0x0097 }
            r5 = 0
            int r6 = r0.length     // Catch:{ FileNotFoundException -> 0x009c, IOException -> 0x009a, all -> 0x0097 }
            java.lang.String r7 = "UTF-8"
            r4.<init>(r0, r5, r6, r7)     // Catch:{ FileNotFoundException -> 0x009c, IOException -> 0x009a, all -> 0x0097 }
            r3.close()     // Catch:{ Throwable -> 0x0095, all -> 0x0092 }
            goto L_0x0095
        L_0x0092:
            r9 = move-exception
            r0 = r3
            goto L_0x00b1
        L_0x0095:
            r0 = r3
            goto L_0x00b7
        L_0x0097:
            r9 = move-exception
            r2 = r3
            goto L_0x00a0
        L_0x009a:
            r0 = r3
            goto L_0x00a6
        L_0x009c:
            r0 = r3
            goto L_0x00ae
        L_0x009e:
            r9 = move-exception
            r2 = r0
        L_0x00a0:
            if (r2 == 0) goto L_0x00a5
            r2.close()     // Catch:{ Throwable -> 0x00a5 }
        L_0x00a5:
            throw r9     // Catch:{ all -> 0x0063 }
        L_0x00a6:
            if (r0 == 0) goto L_0x00b7
        L_0x00a8:
            r0.close()     // Catch:{ Throwable -> 0x00ac, all -> 0x005a }
            goto L_0x00b7
        L_0x00ac:
            goto L_0x00b7
        L_0x00ae:
            if (r0 == 0) goto L_0x00b7
            goto L_0x00a8
        L_0x00b1:
            if (r0 == 0) goto L_0x00b6
            r0.close()     // Catch:{ Throwable -> 0x00b6 }
        L_0x00b6:
            throw r9
        L_0x00b7:
            if (r0 == 0) goto L_0x00ba
            goto L_0x0069
        L_0x00ba:
            java.lang.Object r3 = f78863c
            monitor-enter(r3)
            if (r1 == 0) goto L_0x00c5
            r1.a((java.util.Map) r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00da
        L_0x00c3:
            r9 = move-exception
            goto L_0x00dc
        L_0x00c5:
            java.util.HashMap<java.io.File, com.ta.utdid2.c.a.d$a> r0 = r8.f52a     // Catch:{ all -> 0x00c3 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00c3 }
            r1 = r0
            com.ta.utdid2.c.a.d$a r1 = (com.ta.utdid2.c.a.d.a) r1     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x00da
            com.ta.utdid2.c.a.d$a r1 = new com.ta.utdid2.c.a.d$a     // Catch:{ all -> 0x00c3 }
            r1.<init>(r9, r10, r2)     // Catch:{ all -> 0x00c3 }
            java.util.HashMap<java.io.File, com.ta.utdid2.c.a.d$a> r10 = r8.f52a     // Catch:{ all -> 0x00c3 }
            r10.put(r9, r1)     // Catch:{ all -> 0x00c3 }
        L_0x00da:
            monitor-exit(r3)     // Catch:{ all -> 0x00c3 }
            return r1
        L_0x00dc:
            monitor-exit(r3)     // Catch:{ all -> 0x00c3 }
            throw r9
        L_0x00de:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.c.a.d.a(java.lang.String, int):com.ta.utdid2.c.a.b");
    }
}
