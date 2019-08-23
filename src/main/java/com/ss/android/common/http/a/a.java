package com.ss.android.common.http.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28292a;

    /* renamed from: b  reason: collision with root package name */
    public Set<c> f28293b = new HashSet();

    /* renamed from: com.ss.android.common.http.a.a$a  reason: collision with other inner class name */
    public class C0332a implements c {

        /* renamed from: a  reason: collision with root package name */
        String f28294a;

        /* renamed from: b  reason: collision with root package name */
        byte[] f28295b;

        /* renamed from: c  reason: collision with root package name */
        public String f28296c;

        public final String a() {
            return this.f28294a;
        }

        public final Object b() {
            return this.f28295b;
        }

        public C0332a(String str, byte[] bArr, String str2) {
            this.f28294a = str;
            this.f28295b = bArr;
            this.f28296c = str2;
        }
    }

    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        String f28298a;

        /* renamed from: b  reason: collision with root package name */
        File f28299b;

        public final String a() {
            return this.f28298a;
        }

        public final Object b() {
            return this.f28299b;
        }

        public b(String str, File file) {
            this.f28298a = str;
            this.f28299b = file;
        }
    }

    public interface c {
        String a();

        Object b();
    }

    public class d implements c {

        /* renamed from: a  reason: collision with root package name */
        String f28301a;

        /* renamed from: b  reason: collision with root package name */
        String f28302b;

        public final String a() {
            return this.f28301a;
        }

        public final Object b() {
            return this.f28302b;
        }

        public d(String str, String str2) {
            this.f28301a = str;
            this.f28302b = str2;
        }
    }

    public final void a(String str, File file) {
        if (PatchProxy.isSupport(new Object[]{str, file}, this, f28292a, false, 15788, new Class[]{String.class, File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, file}, this, f28292a, false, 15788, new Class[]{String.class, File.class}, Void.TYPE);
            return;
        }
        this.f28293b.add(new b(str, file));
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f28292a, false, 15786, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f28292a, false, 15786, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f28293b.add(new d(str, str2));
    }
}
