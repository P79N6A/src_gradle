package com.bytedance.android.livesdk.user;

import android.app.Activity;
import com.bytedance.android.livesdk.user.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d extends b {
    Activity g;
    String h;
    String i;

    public static abstract class a<T extends b.a<T>> extends b.a<T> {
        public static ChangeQuickRedirect i;
        Activity j;
        String k;
        String l;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T a();

        public final T a(Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, i, false, 13524, new Class[]{Activity.class}, b.a.class)) {
                return (b.a) PatchProxy.accessDispatch(new Object[]{activity2}, this, i, false, 13524, new Class[]{Activity.class}, b.a.class);
            }
            this.j = activity2;
            return a();
        }

        public final T e(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 13525, new Class[]{String.class}, b.a.class)) {
                return (b.a) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 13525, new Class[]{String.class}, b.a.class);
            }
            this.k = str2;
            return a();
        }

        public final T f(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, i, false, 13526, new Class[]{String.class}, b.a.class)) {
                return (b.a) PatchProxy.accessDispatch(new Object[]{str2}, this, i, false, 13526, new Class[]{String.class}, b.a.class);
            }
            this.l = str2;
            return a();
        }
    }

    public static final class b<T extends a<T>> extends a<T> {
        public static ChangeQuickRedirect m;

        /* access modifiers changed from: private */
        /* renamed from: d */
        public T b() {
            return this;
        }

        b() {
        }

        public final d c() {
            if (!PatchProxy.isSupport(new Object[0], this, m, false, 13527, new Class[0], d.class)) {
                return new d(this, (byte) 0);
            }
            return (d) PatchProxy.accessDispatch(new Object[0], this, m, false, 13527, new Class[0], d.class);
        }
    }

    private d(a aVar) {
        super(aVar);
        this.g = aVar.j;
        this.h = aVar.k;
        this.i = aVar.l;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
