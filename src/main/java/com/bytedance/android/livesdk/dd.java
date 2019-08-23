package com.bytedance.android.livesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public final /* synthetic */ class dd implements ObservableOnSubscribe {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13677a;

    /* renamed from: b  reason: collision with root package name */
    static final ObservableOnSubscribe f13678b = new dd();

    private dd() {
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        if (PatchProxy.isSupport(new Object[]{observableEmitter}, this, f13677a, false, 3035, new Class[]{ObservableEmitter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observableEmitter}, this, f13677a, false, 3035, new Class[]{ObservableEmitter.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getLiveService().a();
    }
}
