package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.core.utils.aa;
import com.bytedance.android.livesdk.utils.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10980a;

    /* renamed from: b  reason: collision with root package name */
    String f10981b;

    /* renamed from: c  reason: collision with root package name */
    String f10982c;

    /* renamed from: d  reason: collision with root package name */
    float f10983d;

    /* renamed from: e  reason: collision with root package name */
    long f10984e;

    /* renamed from: f  reason: collision with root package name */
    int f10985f;
    int g;
    int h;
    int i;
    private Disposable j;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10980a, false, 4421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10980a, false, 4421, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null && !this.j.isDisposed()) {
            this.j.dispose();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10980a, false, 4420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10980a, false, 4420, new Class[0], Void.TYPE);
            return;
        }
        this.f10983d = ((float) aa.a()) / 1024.0f;
        this.j = b.a(5000, TimeUnit.MILLISECONDS).observeOn(Schedulers.io()).map(new o(this)).flatMap(p.f10989b).observeOn(AndroidSchedulers.mainThread()).subscribe(q.f10991b, r.f10993b);
    }

    public n(String str, String str2, long j2, int i2, int i3, int i4, int i5) {
        this.f10981b = str;
        this.f10982c = str2;
        this.f10984e = j2;
        this.f10985f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }
}
