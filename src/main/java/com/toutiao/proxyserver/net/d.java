package com.toutiao.proxyserver.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80145a;

    /* renamed from: b  reason: collision with root package name */
    public final String f80146b;

    /* renamed from: c  reason: collision with root package name */
    public final String f80147c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c> f80148d;

    /* renamed from: e  reason: collision with root package name */
    public final long f80149e;

    /* renamed from: f  reason: collision with root package name */
    public final long f80150f;
    public final long g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80151a;

        /* renamed from: b  reason: collision with root package name */
        public String f80152b;

        /* renamed from: c  reason: collision with root package name */
        public String f80153c;

        /* renamed from: d  reason: collision with root package name */
        public final List<c> f80154d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public long f80155e;

        /* renamed from: f  reason: collision with root package name */
        public long f80156f;
        public long g;

        public final a a(long j) {
            this.f80155e = j;
            return this;
        }

        public final a b(long j) {
            this.f80156f = j;
            return this;
        }

        public final a c(long j) {
            this.g = j;
            return this;
        }

        public final a a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f80151a, false, 91820, new Class[]{String.class, String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f80151a, false, 91820, new Class[]{String.class, String.class}, a.class);
            } else if (str == null || str2 == null) {
                return this;
            } else {
                this.f80154d.add(new c(str, str2));
                return this;
            }
        }
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f80145a, false, 91817, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80145a, false, 91817, new Class[0], String.class);
        }
        return "HttpRequest{url='" + this.f80146b + '\'' + ", method='" + this.f80147c + '\'' + ", headers=" + this.f80148d + ", connectTimeout=" + this.f80149e + ", readTimeout=" + this.f80150f + ", writeTimeout=" + this.g + '}';
    }

    private d(a aVar) {
        this.f80146b = aVar.f80152b;
        this.f80147c = aVar.f80153c;
        this.f80148d = aVar.f80154d;
        this.f80149e = aVar.f80155e;
        this.f80150f = aVar.f80156f;
        this.g = aVar.g;
    }

    public final String a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f80145a, false, 91815, new Class[]{String.class}, String.class)) {
            return a(str2, null);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f80145a, false, 91815, new Class[]{String.class}, String.class);
    }

    public /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }

    private String a(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, null}, this, f80145a, false, 91816, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, null}, this, f80145a, false, 91816, new Class[]{String.class, String.class}, String.class);
        }
        for (c next : this.f80148d) {
            if (next.f80143b.equalsIgnoreCase(str3)) {
                return next.f80144c;
            }
        }
        return null;
    }
}
