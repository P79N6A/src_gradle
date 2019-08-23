package com.bytedance.android.livesdk.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    long f17429a;

    /* renamed from: com.bytedance.android.livesdk.user.a$a  reason: collision with other inner class name */
    public static abstract class C0123a<T extends C0123a<T>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17430a;

        /* renamed from: b  reason: collision with root package name */
        long f17431b;

        /* access modifiers changed from: package-private */
        public abstract T a();

        public final T a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f17430a, false, 13517, new Class[]{Long.TYPE}, C0123a.class)) {
                return (C0123a) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f17430a, false, 13517, new Class[]{Long.TYPE}, C0123a.class);
            }
            this.f17431b = j2;
            return a();
        }
    }

    a(C0123a aVar) {
        this.f17429a = aVar.f17431b;
    }
}
