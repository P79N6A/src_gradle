package com.bytedance.android.livesdk.user;

import android.app.Activity;
import com.bytedance.android.livesdk.user.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class k extends a {

    /* renamed from: b  reason: collision with root package name */
    int f17457b;

    /* renamed from: c  reason: collision with root package name */
    String f17458c;

    /* renamed from: d  reason: collision with root package name */
    Activity f17459d;

    /* renamed from: e  reason: collision with root package name */
    long f17460e;

    public static abstract class a<T extends a<T>> extends a.C0123a<T> {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f17461c;

        /* renamed from: d  reason: collision with root package name */
        int f17462d;

        /* renamed from: e  reason: collision with root package name */
        String f17463e = "";

        /* renamed from: f  reason: collision with root package name */
        public Activity f17464f;
        public long g;

        /* renamed from: b */
        public abstract T a();

        public final T a(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f17461c, false, 13539, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f17461c, false, 13539, new Class[]{String.class}, a.class);
            }
            this.f17463e = str2;
            return a();
        }

        public final T a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f17461c, false, 13540, new Class[]{Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f17461c, false, 13540, new Class[]{Integer.TYPE}, a.class);
            }
            this.f17462d = i;
            return a();
        }
    }

    public static final class b<T extends b<T>> extends a<T> {
        public static ChangeQuickRedirect h;

        /* access modifiers changed from: private */
        /* renamed from: d */
        public T b() {
            return this;
        }

        b() {
        }

        public final k c() {
            if (!PatchProxy.isSupport(new Object[0], this, h, false, 13543, new Class[0], k.class)) {
                return new k(this);
            }
            return (k) PatchProxy.accessDispatch(new Object[0], this, h, false, 13543, new Class[0], k.class);
        }
    }

    k(a aVar) {
        super(aVar);
        this.f17458c = aVar.f17463e;
        this.f17457b = aVar.f17462d;
        this.f17459d = aVar.f17464f;
        this.f17460e = aVar.g;
    }
}
