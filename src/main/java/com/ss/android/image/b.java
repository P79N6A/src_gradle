package com.ss.android.image;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.io.FileUtils;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f29223a = "joke_essay";

    /* renamed from: b  reason: collision with root package name */
    protected static String f29224b;

    /* renamed from: c  reason: collision with root package name */
    protected static String f29225c;

    /* renamed from: d  reason: collision with root package name */
    protected static String f29226d;

    /* renamed from: e  reason: collision with root package name */
    protected static String f29227e;

    /* renamed from: f  reason: collision with root package name */
    protected static String f29228f;
    protected static boolean g;
    protected static String h;
    protected static String i;
    protected static volatile boolean m;
    private static String n;
    protected final int j;
    protected final int k;
    protected final Context l;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f29233a;

        /* renamed from: b  reason: collision with root package name */
        public long f29234b;

        /* renamed from: c  reason: collision with root package name */
        public String f29235c;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.image.b$b  reason: collision with other inner class name */
    static class C0352b implements com.facebook.common.b.b {

        /* renamed from: a  reason: collision with root package name */
        final List<a> f29236a;

        public final void a(File file) {
        }

        public final void c(File file) {
        }

        private C0352b() {
            this.f29236a = new ArrayList();
        }

        /* synthetic */ C0352b(byte b2) {
            this();
        }

        public final void b(File file) {
            a aVar = new a((byte) 0);
            aVar.f29233a = file.lastModified();
            aVar.f29234b = file.length();
            aVar.f29235c = file.getAbsolutePath();
            this.f29236a.add(aVar);
        }
    }

    public static String a() {
        return f29227e;
    }

    public final void a(Context context, String str, String str2) {
        boolean z;
        File file;
        String str3;
        String str4;
        if (!e()) {
            a(context, 2130838336, C0906R.string.cmu, true);
            return;
        }
        try {
            String str5 = null;
            if (!StringUtils.isEmpty(str)) {
                str3 = d(str);
                file = new File(str3);
                z = file.isFile();
                if (!z) {
                    str3 = f(str);
                    file = new File(str3);
                    z = file.isFile();
                }
            } else {
                str3 = null;
                file = null;
                z = false;
            }
            if (z || StringUtils.isEmpty(null)) {
                str5 = str2;
            } else {
                String d2 = d(null);
                File file2 = new File(d2);
                boolean isFile = file2.isFile();
                if (!isFile) {
                    d2 = f(null);
                    file2 = new File(d2);
                    isFile = file2.isFile();
                }
                str = null;
            }
            if (!z) {
                a(context, 2130838336, C0906R.string.cmt, true);
                return;
            }
            String a2 = a(str3, str5);
            String str6 = str + a2;
            String str7 = i;
            if (str7.endsWith("/")) {
                str4 = str7 + str6;
            } else {
                str4 = str7 + "/" + str6;
            }
            File file3 = new File(str4);
            if (file3.isFile() && file.length() == file3.length()) {
                a(context, 2130838576, C0906R.string.cmv, true);
            } else if (!FileUtils.saveInputStream(FileUtils.getInputStream(str3), str7, str6)) {
                a(context, 2130838336, C0906R.string.cms, true);
            } else {
                l.a(context, str4);
                a(context, 2130838576, C0906R.string.cmv, true);
            }
        } catch (Exception unused) {
            a(context, 2130838336, C0906R.string.cms, true);
        }
    }

    private static boolean e() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            Logger.debug();
            return false;
        }
    }

    public static long d() {
        try {
            return 0 + e.a(new File(f29225c), false);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final void b() {
        try {
            if (!StringUtils.isEmpty(f29228f)) {
                e.a(f29228f, (Set<String>) null);
            }
            if (e()) {
                e.a(f29226d, (Set<String>) null);
            }
        } catch (Exception unused) {
        }
    }

    public final void c() {
        if (!m && d() >= 62914560) {
            h.f29255a.f29257b = System.currentTimeMillis();
            m = true;
            new ThreadPlus("ClearCache") {
                public final void run() {
                    Process.setThreadPriority(10);
                    System.currentTimeMillis();
                    try {
                        System.currentTimeMillis();
                        b.this.a(20971520);
                    } catch (Exception unused) {
                    }
                    System.currentTimeMillis();
                    b.m = false;
                    try {
                        h.f29255a.a(b.this);
                    } catch (Exception unused2) {
                    }
                }
            }.start();
        }
        if (!m) {
            long j2 = h.f29255a.f29257b;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j2 < 86400000) {
                try {
                    h.f29255a.a(this);
                } catch (Exception unused) {
                }
            } else {
                h.f29255a.f29257b = currentTimeMillis;
                m = true;
                new ThreadPlus("ClearCache") {
                    public final void run() {
                        Process.setThreadPriority(10);
                        System.currentTimeMillis();
                        try {
                            Thread.sleep(10000);
                            System.currentTimeMillis();
                            b.this.a(b.this.j, b.this.k);
                        } catch (Exception unused) {
                        }
                        System.currentTimeMillis();
                        b.m = false;
                        try {
                            h.f29255a.a(b.this);
                        } catch (Exception unused2) {
                        }
                    }
                }.start();
            }
        }
    }

    public b(Context context) {
        this(context, 5);
    }

    public final boolean a(String str) {
        return new File(d(str)).exists();
    }

    public static String c(String str) {
        return str + ".dat";
    }

    public final String b(String str) {
        return f29226d + g(str);
    }

    public final String e(String str) {
        if (StringUtils.isEmpty(f29228f)) {
            return null;
        }
        return f29228f + g(str);
    }

    private static String g(String str) {
        if (str == null || str.length() < 2) {
            return "__";
        }
        String substring = str.substring(0, 2);
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        if (!Character.isLetterOrDigit(charAt) || !Character.isLetterOrDigit(charAt2)) {
            return "__";
        }
        return substring;
    }

    public final String d(String str) {
        return f29226d + g(str) + "/" + str + ".dat";
    }

    public final String f(String str) {
        if (StringUtils.isEmpty(f29228f)) {
            return null;
        }
        return f29228f + g(str) + "/" + str + ".dat";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:12|13|14|15|16|17|18|19|20|(1:22)(1:23)|24|(6:26|(1:28)|29|(1:31)|32|(1:34))|(3:35|36|(2:38|39)(3:40|41|(1:43)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(android.content.Context r3) {
        /*
            java.lang.Class<com.ss.android.image.b> r0 = com.ss.android.image.b.class
            monitor-enter(r0)
            boolean r1 = g     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.String r1 = r3.getPackageName()     // Catch:{ all -> 0x0122 }
            f29224b = r1     // Catch:{ all -> 0x0122 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return
        L_0x0017:
            r1 = 1
            g = r1     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = r2.getPath()     // Catch:{ all -> 0x0122 }
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "/Android/data/"
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = f29224b     // Catch:{ all -> 0x0122 }
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "/cache/"
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0122 }
            f29225c = r1     // Catch:{ all -> 0x0122 }
            r1 = 0
            java.lang.String r3 = com.ss.android.image.e.a((android.content.Context) r3)     // Catch:{ Exception -> 0x0047 }
            h = r3     // Catch:{ Exception -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            h = r1     // Catch:{ all -> 0x0122 }
        L_0x0049:
            java.lang.String r3 = h     // Catch:{ all -> 0x0122 }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ all -> 0x0122 }
            if (r3 != 0) goto L_0x0067
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = h     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/hashedimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f29228f = r3     // Catch:{ all -> 0x0122 }
            goto L_0x0069
        L_0x0067:
            f29228f = r1     // Catch:{ all -> 0x0122 }
        L_0x0069:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f29225c     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "hashedimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f29226d = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f29225c     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "tmpimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f29227e = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/Android/data/com.ss.spipe/cache/avatar"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            n = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f29223a     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            i = r3     // Catch:{ all -> 0x0122 }
            boolean r3 = e()     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x0104
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f29225c     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00e4
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x00e4:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f29226d     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00f4
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x00f4:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f29227e     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x0104
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x0104:
            java.lang.String r3 = f29228f     // Catch:{ Exception -> 0x0120 }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0120 }
            if (r3 == 0) goto L_0x010e
            monitor-exit(r0)
            return
        L_0x010e:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0120 }
            java.lang.String r1 = f29228f     // Catch:{ Exception -> 0x0120 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0120 }
            boolean r1 = r3.exists()     // Catch:{ Exception -> 0x0120 }
            if (r1 != 0) goto L_0x011e
            r3.mkdirs()     // Catch:{ Exception -> 0x0120 }
        L_0x011e:
            monitor-exit(r0)
            return
        L_0x0120:
            monitor-exit(r0)
            return
        L_0x0122:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.image.b.a(android.content.Context):void");
    }

    public final void a(long j2) {
        try {
            e.a(f29227e);
        } catch (Exception unused) {
        }
        if (d() > 20971520) {
            long a2 = a(20971520, f29226d, (Set<String>) null);
            if (a2 < 20971520) {
                a(20971520 - a2, f29228f, (Set<String>) null);
            }
        }
    }

    private b(Context context, int i2) {
        this.j = 5;
        this.k = 1;
        this.l = context.getApplicationContext();
        if (!g) {
            a(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (com.bytedance.common.utility.io.FileUtils.ImageType.UNKNOWN.equals(r3) != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r3 = android.net.Uri.parse(r4).getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r3 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r4 = r3.lastIndexOf(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r4 <= 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if ((r4 + 1) >= r3.length()) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r3 = r3.substring(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r3.equalsIgnoreCase(".jpg") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r3.equalsIgnoreCase(".jpeg") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r3.equalsIgnoreCase(".png") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r3.equalsIgnoreCase(".gif") != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (r3.equalsIgnoreCase(".bmp") == false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = ".jpg"
            if (r4 != 0) goto L_0x0007
            if (r3 != 0) goto L_0x0007
            return r0
        L_0x0007:
            com.bytedance.common.utility.io.FileUtils$ImageType r3 = com.bytedance.common.utility.io.FileUtils.getImageType((java.lang.String) r3)     // Catch:{ Exception -> 0x0071 }
            int[] r1 = com.ss.android.image.b.AnonymousClass4.f29232a     // Catch:{ Exception -> 0x0071 }
            int r2 = r3.ordinal()     // Catch:{ Exception -> 0x0071 }
            r1 = r1[r2]     // Catch:{ Exception -> 0x0071 }
            switch(r1) {
                case 1: goto L_0x001d;
                case 2: goto L_0x001a;
                case 3: goto L_0x0017;
                default: goto L_0x0016;
            }     // Catch:{ Exception -> 0x0071 }
        L_0x0016:
            goto L_0x0020
        L_0x0017:
            java.lang.String r1 = ".gif"
            goto L_0x001f
        L_0x001a:
            java.lang.String r1 = ".png"
            goto L_0x001f
        L_0x001d:
            java.lang.String r1 = ".jpg"
        L_0x001f:
            r0 = r1
        L_0x0020:
            com.bytedance.common.utility.io.FileUtils$ImageType r1 = com.bytedance.common.utility.io.FileUtils.ImageType.UNKNOWN     // Catch:{ Exception -> 0x0071 }
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x0071 }
            if (r3 != 0) goto L_0x0029
            return r0
        L_0x0029:
            android.net.Uri r3 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x0071 }
            if (r3 != 0) goto L_0x0034
            return r0
        L_0x0034:
            r4 = 46
            int r4 = r3.lastIndexOf(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 <= 0) goto L_0x0071
            int r1 = r4 + 1
            int r2 = r3.length()     // Catch:{ Exception -> 0x0071 }
            if (r1 >= r2) goto L_0x0071
            java.lang.String r3 = r3.substring(r4)     // Catch:{ Exception -> 0x0071 }
            java.lang.String r4 = ".jpg"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".jpeg"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".png"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".gif"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 != 0) goto L_0x0072
            java.lang.String r4 = ".bmp"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0071 }
            if (r4 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r3 = r0
        L_0x0072:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.image.b.a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3) {
        try {
            e.a(f29227e);
        } catch (Exception unused) {
        }
        a(i2, new File(f29226d), (Set<String>) null);
        b(i2, new File(n), null);
        if (!StringUtils.isEmpty(f29228f)) {
            a(i3, new File(f29228f), (Set<String>) null);
        }
    }

    private void a(int i2, File file, Set<String> set) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        b(i2, file2, set);
                    }
                }
            }
        }
    }

    private long a(long j2, String str, Set<String> set) {
        C0352b bVar = new C0352b((byte) 0);
        com.facebook.common.b.a.a(new File(str), bVar);
        ArrayList<a> arrayList = new ArrayList<>(Collections.unmodifiableList(bVar.f29236a));
        Collections.sort(arrayList, new Comparator<a>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar.f29233a == aVar2.f29233a) {
                    return 0;
                }
                if (aVar.f29233a > aVar2.f29233a) {
                    return -1;
                }
                return 1;
            }
        });
        long j3 = 0;
        for (a aVar : arrayList) {
            j3 += aVar.f29234b;
            if (j3 > j2) {
                File file = new File(aVar.f29235c);
                String name = file.getName();
                if (set == null || !set.contains(name)) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return j3;
    }

    private static void b(int i2, File file, Set<String> set) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = ((long) (i2 * 24 * 3600)) * 1000;
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        if (set == null || !set.contains(name)) {
                            try {
                                if (currentTimeMillis - file2.lastModified() > j2) {
                                    file2.delete();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    private static void a(Context context, int i2, int i3, boolean z) {
        if (z) {
            UIUtils.displayToastWithIcon(context, i2, i3);
        }
    }
}
