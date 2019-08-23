package com.bytedance.android.livesdk.feed.live;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14271a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLiveViewHolder f14272b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f14273c;

    h(BaseLiveViewHolder baseLiveViewHolder, Room room) {
        this.f14272b = baseLiveViewHolder;
        this.f14273c = room;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14271a, false, 8726, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14271a, false, 8726, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f14272b.b(this.f14273c);
    }
}
