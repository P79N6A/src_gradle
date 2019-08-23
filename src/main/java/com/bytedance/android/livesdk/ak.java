package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ak implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9015a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomFragment.a f9016b;

    ak(LiveRoomFragment.a aVar) {
        this.f9016b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9015a, false, 2746, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9015a, false, 2746, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        l.a(LiveRoomFragment.this.getContext(), (Throwable) obj);
    }
}
