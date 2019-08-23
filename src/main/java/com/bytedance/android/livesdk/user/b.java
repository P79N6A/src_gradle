package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdk.user.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    String f17432b;

    /* renamed from: c  reason: collision with root package name */
    String f17433c;

    /* renamed from: d  reason: collision with root package name */
    String f17434d;

    /* renamed from: e  reason: collision with root package name */
    long f17435e;

    /* renamed from: f  reason: collision with root package name */
    String f17436f;

    public static abstract class a<T extends a<T>> extends a.C0123a<a<T>> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f17437c;

        /* renamed from: d  reason: collision with root package name */
        String f17438d = "";

        /* renamed from: e  reason: collision with root package name */
        String f17439e = "";

        /* renamed from: f  reason: collision with root package name */
        String f17440f = "";
        long g;
        String h = "";

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T a();

        public final T a(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f17437c, false, 13518, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f17437c, false, 13518, new Class[]{String.class}, a.class);
            }
            this.f17438d = str2;
            return a();
        }

        public final T b(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f17437c, false, 13519, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f17437c, false, 13519, new Class[]{String.class}, a.class);
            }
            this.f17439e = str2;
            return a();
        }

        public final T c(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f17437c, false, 13520, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f17437c, false, 13520, new Class[]{String.class}, a.class);
            }
            this.f17440f = str2;
            return a();
        }

        public final T d(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f17437c, false, 13522, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f17437c, false, 13522, new Class[]{String.class}, a.class);
            }
            this.h = str2;
            return a();
        }

        public final T b(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17437c, false, 13521, new Class[]{Long.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17437c, false, 13521, new Class[]{Long.TYPE}, a.class);
            }
            this.g = j2;
            return a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.user.b$b  reason: collision with other inner class name */
    public static final class C0124b<T extends a<T>> extends a<T> {
        public static ChangeQuickRedirect i;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final T a() {
            return this;
        }

        C0124b() {
        }

        public final b c() {
            if (!PatchProxy.isSupport(new Object[0], this, i, false, 13523, new Class[0], b.class)) {
                return new b(this);
            }
            return (b) PatchProxy.accessDispatch(new Object[0], this, i, false, 13523, new Class[0], b.class);
        }
    }

    b(a aVar) {
        super(aVar);
        this.f17432b = aVar.f17438d;
        this.f17433c = aVar.f17439e;
        this.f17434d = aVar.f17440f;
        this.f17435e = aVar.g;
        this.f17436f = aVar.h;
    }
}
