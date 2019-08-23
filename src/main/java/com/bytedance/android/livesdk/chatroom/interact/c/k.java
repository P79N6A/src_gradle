package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogButtonContract;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public final class k extends InteractDialogButtonContract.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f10793e;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() throws Exception {
        ((InteractDialogButtonContract.View) this.f10831c).b();
    }

    public k(InteractDialogButtonContract.View view) {
        super(view);
    }

    public final void a(long j) {
        Consumer consumer;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f10793e, false, 4638, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f10793e, false, 4638, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Observable observeOn = j.q().d().a().checkPermissionV3(j2).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        l lVar = new l(this);
        InteractDialogButtonContract.View view = (InteractDialogButtonContract.View) this.f10831c;
        view.getClass();
        if (PatchProxy.isSupport(new Object[]{view}, null, m.f10796a, true, 4640, new Class[]{InteractDialogButtonContract.View.class}, Consumer.class)) {
            consumer = (Consumer) PatchProxy.accessDispatch(new Object[]{view}, null, m.f10796a, true, 4640, new Class[]{InteractDialogButtonContract.View.class}, Consumer.class);
        } else {
            consumer = new m(view);
        }
        observeOn.subscribe(lVar, consumer);
    }
}
