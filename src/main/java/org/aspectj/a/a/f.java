package org.aspectj.a.a;

import java.lang.ref.SoftReference;
import java.util.StringTokenizer;
import org.aspectj.lang.d;

public abstract class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f84054a = true;
    static String[] k = new String[0];
    static Class[] l = new Class[0];

    /* renamed from: b  reason: collision with root package name */
    private String f84055b;

    /* renamed from: e  reason: collision with root package name */
    int f84056e = -1;

    /* renamed from: f  reason: collision with root package name */
    String f84057f;
    String g;
    Class h;
    a i;
    public ClassLoader j;

    interface a {
        String a(int i);

        void a(int i, String str);
    }

    static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private SoftReference f84058a;

        public b() {
            b();
        }

        private String[] a() {
            return (String[]) this.f84058a.get();
        }

        private String[] b() {
            String[] strArr = new String[3];
            this.f84058a = new SoftReference(strArr);
            return strArr;
        }

        public final String a(int i) {
            String[] a2 = a();
            if (a2 == null) {
                return null;
            }
            return a2[i];
        }

        public final void a(int i, String str) {
            String[] a2 = a();
            if (a2 == null) {
                a2 = b();
            }
            a2[i] = str;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String a(h hVar);

    public final String toString() {
        return b(h.k);
    }

    public final Class c() {
        if (this.h == null) {
            this.h = b(2);
        }
        return this.h;
    }

    private ClassLoader a() {
        if (this.j == null) {
            this.j = getClass().getClassLoader();
        }
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final Class b(int i2) {
        return b.a(a(i2), a());
    }

    /* access modifiers changed from: package-private */
    public final String a(int i2) {
        int indexOf = this.f84055b.indexOf(45);
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            i3 = indexOf + 1;
            indexOf = this.f84055b.indexOf(45, i3);
            i2 = i4;
        }
        if (indexOf == -1) {
            indexOf = this.f84055b.length();
        }
        return this.f84055b.substring(i3, indexOf);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(org.aspectj.a.a.h r3) {
        /*
            r2 = this;
            boolean r0 = f84054a
            if (r0 == 0) goto L_0x001d
            org.aspectj.a.a.f$a r0 = r2.i
            if (r0 != 0) goto L_0x0014
            org.aspectj.a.a.f$b r0 = new org.aspectj.a.a.f$b     // Catch:{ Throwable -> 0x0010 }
            r0.<init>()     // Catch:{ Throwable -> 0x0010 }
            r2.i = r0     // Catch:{ Throwable -> 0x0010 }
            goto L_0x001d
        L_0x0010:
            r0 = 0
            f84054a = r0
            goto L_0x001d
        L_0x0014:
            org.aspectj.a.a.f$a r0 = r2.i
            int r1 = r3.i
            java.lang.String r0 = r0.a(r1)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = r2.a((org.aspectj.a.a.h) r3)
        L_0x0024:
            boolean r1 = f84054a
            if (r1 == 0) goto L_0x002f
            org.aspectj.a.a.f$a r1 = r2.i
            int r3 = r3.i
            r1.a(r3, r0)
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.aspectj.a.a.f.b(org.aspectj.a.a.h):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final Class[] c(int i2) {
        StringTokenizer stringTokenizer = new StringTokenizer(a(i2), ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i3 = 0; i3 < countTokens; i3++) {
            clsArr[i3] = b.a(stringTokenizer.nextToken(), a());
        }
        return clsArr;
    }

    f(int i2, String str, Class cls) {
        this.f84056e = i2;
        this.f84057f = str;
        this.h = cls;
    }
}
