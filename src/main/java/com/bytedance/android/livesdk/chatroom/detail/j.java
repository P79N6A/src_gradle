package com.bytedance.android.livesdk.chatroom.detail;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;

public final class j extends b {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f9956e;

    /* renamed from: f  reason: collision with root package name */
    private final long f9957f;

    /* access modifiers changed from: package-private */
    public final Observable<d<Room>> c() {
        if (!PatchProxy.isSupport(new Object[0], this, f9956e, false, 4117, new Class[0], Observable.class)) {
            return ((RoomRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(RoomRetrofitApi.class)).fetchUserRoom(this.f9957f, TTLiveSDKContext.getHostService().k().a(this.f9957f));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f9956e, false, 4117, new Class[0], Observable.class);
    }

    public j(@NonNull b.a aVar, long j) {
        super(aVar);
        this.f9957f = j;
    }
}
