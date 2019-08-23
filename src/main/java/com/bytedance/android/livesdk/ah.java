package com.bytedance.android.livesdk;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Map;

public final /* synthetic */ class ah implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9009a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomFragment f9010b;

    ah(LiveRoomFragment liveRoomFragment) {
        this.f9010b = liveRoomFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9009a, false, 2726, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9009a, false, 2726, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveRoomFragment liveRoomFragment = this.f9010b;
        Map map = (Map) obj;
        if (PatchProxy.isSupport(new Object[]{map}, liveRoomFragment, LiveRoomFragment.f8782a, false, 2673, new Class[]{Map.class}, Void.TYPE)) {
            LiveRoomFragment liveRoomFragment2 = liveRoomFragment;
            PatchProxy.accessDispatch(new Object[]{map}, liveRoomFragment2, LiveRoomFragment.f8782a, false, 2673, new Class[]{Map.class}, Void.TYPE);
        } else if (liveRoomFragment.j != null && liveRoomFragment.j.d() != null) {
            Observable.fromIterable(new ArrayList(liveRoomFragment.j.d())).filter(new aa(map)).subscribe(new ab(liveRoomFragment), ac.f8900b);
            liveRoomFragment.j();
        }
    }
}
