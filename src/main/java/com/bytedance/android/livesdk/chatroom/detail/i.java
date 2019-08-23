package com.bytedance.android.livesdk.chatroom.detail;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import java.util.HashMap;

public final class i extends b {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f9954e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9955f;
    private final long g;

    /* access modifiers changed from: package-private */
    public final Observable<d<Room>> c() {
        if (PatchProxy.isSupport(new Object[0], this, f9954e, false, 4115, new Class[0], Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[0], this, f9954e, false, 4115, new Class[0], Observable.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.g));
        hashMap.put("pack_level", PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION);
        return ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).fetchRoom(hashMap);
    }

    public i(@NonNull b.a aVar, long j) {
        super(aVar);
        this.g = j;
    }
}
