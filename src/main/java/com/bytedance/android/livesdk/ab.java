package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ab implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8897a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomFragment f8898b;

    ab(LiveRoomFragment liveRoomFragment) {
        this.f8898b = liveRoomFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8897a, false, 2719, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8897a, false, 2719, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f8898b.j.a(((Room) obj).getId());
    }
}
