package com.ss.android.message.b;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29952a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f29953b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public String f29954c;

    /* renamed from: d  reason: collision with root package name */
    public String f29955d;

    /* renamed from: e  reason: collision with root package name */
    public String f29956e;

    /* renamed from: f  reason: collision with root package name */
    public String f29957f;

    /* renamed from: com.ss.android.message.b.a$a  reason: collision with other inner class name */
    public static class C0361a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29960a;

        /* renamed from: b  reason: collision with root package name */
        public a f29961b;

        public final C0361a a(String str) {
            this.f29961b.f29955d = str;
            return this;
        }

        public final C0361a b(String str) {
            this.f29961b.f29956e = str;
            return this;
        }

        public final C0361a c(String str) {
            this.f29961b.f29957f = str;
            return this;
        }

        private C0361a(String str) {
            this.f29961b = new a(str);
        }

        public static C0361a d(String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2}, null, f29960a, true, 18129, new Class[]{String.class}, C0361a.class)) {
                return new C0361a(str2);
            }
            return (C0361a) PatchProxy.accessDispatch(new Object[]{str2}, null, f29960a, true, 18129, new Class[]{String.class}, C0361a.class);
        }

        public final C0361a a(b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f29960a, false, 18128, new Class[]{b.class}, C0361a.class)) {
                return (C0361a) PatchProxy.accessDispatch(new Object[]{bVar}, this, f29960a, false, 18128, new Class[]{b.class}, C0361a.class);
            }
            this.f29961b.f29953b.add(bVar);
            return this;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29962a;

        /* renamed from: b  reason: collision with root package name */
        List<String> f29963b;

        /* renamed from: c  reason: collision with root package name */
        List<String> f29964c;

        /* renamed from: d  reason: collision with root package name */
        Uri f29965d;

        public int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[0], this, f29962a, false, 18132, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29962a, false, 18132, new Class[0], Integer.TYPE)).intValue();
            }
            if (this.f29963b != null) {
                i = this.f29963b.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            if (this.f29964c != null) {
                i2 = this.f29964c.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            if (this.f29965d != null) {
                i3 = this.f29965d.hashCode();
            }
            return i5 + i3;
        }

        public String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f29962a, false, 18131, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f29962a, false, 18131, new Class[0], String.class);
            }
            return "IntentFilter{actions=" + this.f29963b + ", categories=" + this.f29964c + ", data=" + this.f29965d + '}';
        }

        public b(List<String> list) {
            this(list, null);
        }

        public boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f29962a, false, 18130, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f29962a, false, 18130, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f29963b == null ? bVar.f29963b != null : !this.f29963b.equals(bVar.f29963b)) {
                    return false;
                }
                if (this.f29964c == null ? bVar.f29964c != null : !this.f29964c.equals(bVar.f29964c)) {
                    return false;
                }
                if (this.f29965d != null) {
                    return this.f29965d.equals(bVar.f29965d);
                }
                if (bVar.f29965d == null) {
                    return true;
                }
                return false;
            }
        }

        public b(List<String> list, List<String> list2) {
            this.f29963b = list;
            this.f29964c = list2;
        }

        public b(List<String> list, List<String> list2, Uri uri) {
            this.f29963b = list;
            this.f29964c = null;
            this.f29965d = uri;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f29952a, false, 18125, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29952a, false, 18125, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f29953b != null) {
            i = this.f29953b.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f29954c != null) {
            i2 = this.f29954c.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f29955d != null) {
            i3 = this.f29955d.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f29956e != null) {
            i4 = this.f29956e.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f29957f != null) {
            i5 = this.f29957f.hashCode();
        }
        return i9 + i5;
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f29952a, false, 18126, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f29952a, false, 18126, new Class[0], String.class);
        }
        return "Component{name='" + this.f29954c + '\'' + ", intentFilter=" + this.f29953b + ", processName='" + this.f29955d + '\'' + ", permission='" + this.f29956e + '\'' + ", authorities='" + this.f29957f + '\'' + '}';
    }

    public a(String str) {
        this.f29954c = str;
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f29952a, false, 18124, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f29952a, false, 18124, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f29953b == null ? aVar.f29953b != null : !this.f29953b.equals(aVar.f29953b)) {
                return false;
            }
            if (this.f29954c == null ? aVar.f29954c != null : !this.f29954c.equals(aVar.f29954c)) {
                return false;
            }
            if (this.f29955d == null ? aVar.f29955d != null : !this.f29955d.equals(aVar.f29955d)) {
                return false;
            }
            if (this.f29956e == null ? aVar.f29956e != null : !this.f29956e.equals(aVar.f29956e)) {
                return false;
            }
            if (this.f29957f == null ? aVar.f29957f == null : this.f29957f.equals(aVar.f29957f)) {
                return true;
            }
            return false;
        }
    }
}
