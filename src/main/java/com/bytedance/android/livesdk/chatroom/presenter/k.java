package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.livesdk.utils.b.c;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.ies.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public final class k extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11369a;

    public interface a extends com.bytedance.ies.a.a {
        void a();

        void a(Throwable th);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f11369a, false, 5173, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f11369a, false, 5173, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((com.bytedance.android.livesdk.utils.b.b) j.q().d().e().setPreferFansClub(str).as(c.a())).a(3).compose(i.a()).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io()).subscribe(new l(this), new m(this));
    }
}
