package com.bytedance.android.livesdk.share;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.h.a;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.host.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Single;
import io.reactivex.subjects.SingleSubject;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17211a;

    /* renamed from: b  reason: collision with root package name */
    public SingleSubject<Object> f17212b;

    /* renamed from: c  reason: collision with root package name */
    public SingleSubject<String> f17213c;

    /* renamed from: d  reason: collision with root package name */
    private j f17214d;

    /* renamed from: e  reason: collision with root package name */
    private a f17215e = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17217a;

        public final void a(Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f17217a, false, 13275, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f17217a, false, 13275, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            if (d.this.f17212b != null) {
                d.this.f17212b.onError(th);
                d.this.f17212b = null;
            }
        }

        public final void a(String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, str2}, this, f17217a, false, 13274, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2}, this, f17217a, false, 13274, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            if (d.this.f17212b != null) {
                d.this.f17212b.onSuccess(new Object());
                d.this.f17212b = null;
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private j.a f17216f = new j.a() {
    };

    public d(j jVar) {
        this.f17214d = jVar;
    }

    public final Single<String> a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f17211a, false, 13273, new Class[]{String.class}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{str}, this, f17211a, false, 13273, new Class[]{String.class}, Single.class);
        }
        this.f17213c = SingleSubject.create();
        return this.f17213c;
    }

    public final Single<Object> a(Activity activity, b bVar) {
        if (PatchProxy.isSupport(new Object[]{activity, bVar}, this, f17211a, false, 13271, new Class[]{Activity.class, b.class}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{activity, bVar}, this, f17211a, false, 13271, new Class[]{Activity.class, b.class}, Single.class);
        }
        this.f17214d.b(activity, bVar, this.f17215e);
        this.f17212b = SingleSubject.create();
        return this.f17212b;
    }

    public final boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{activity2, str2}, this, f17211a, false, 13269, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return this.f17214d.a(str2, activity2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f17211a, false, 13269, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(Activity activity, b bVar, a aVar) {
        Activity activity2 = activity;
        b bVar2 = bVar;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, bVar2, aVar2}, this, f17211a, false, 13270, new Class[]{Activity.class, b.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bVar2, aVar2}, this, f17211a, false, 13270, new Class[]{Activity.class, b.class, a.class}, Void.TYPE);
            return;
        }
        this.f17214d.a(activity2, bVar2, aVar2);
    }

    public final void a(Activity activity, b bVar, String str) {
        Activity activity2 = activity;
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, bVar2, str2}, this, f17211a, false, 13272, new Class[]{Activity.class, b.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bVar2, str2}, this, f17211a, false, 13272, new Class[]{Activity.class, b.class, String.class}, Void.TYPE);
            return;
        }
        this.f17214d.a(activity2, bVar2, str2);
    }
}
