package com.bytedance.android.livesdk;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.live.api.DislikeApi;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;

public final /* synthetic */ class ag implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9005a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomFragment f9006b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f9007c;

    /* renamed from: d  reason: collision with root package name */
    private final PopupWindow f9008d;

    ag(LiveRoomFragment liveRoomFragment, Room room, PopupWindow popupWindow) {
        this.f9006b = liveRoomFragment;
        this.f9007c = room;
        this.f9008d = popupWindow;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9005a, false, 2725, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9005a, false, 2725, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveRoomFragment liveRoomFragment = this.f9006b;
        Room room = this.f9007c;
        PopupWindow popupWindow = this.f9008d;
        LiveRoomFragment.a aVar = liveRoomFragment.p;
        if (PatchProxy.isSupport(new Object[]{room}, aVar, LiveRoomFragment.a.f8828a, false, 2743, new Class[]{Room.class}, Void.TYPE)) {
            LiveRoomFragment.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{room}, aVar2, LiveRoomFragment.a.f8828a, false, 2743, new Class[]{Room.class}, Void.TYPE);
        } else {
            aVar.a();
            long id = room.getId();
            long id2 = room.getOwner().getId();
            String requestId = room.getRequestId();
            String str = aVar.f8829b;
            aVar.f8830c = ((DislikeApi) j.q().d().a(DislikeApi.class)).dislikeRoom(id, id2, requestId, str, aVar.f8829b, room.getLog_pb()).observeOn(AndroidSchedulers.mainThread()).subscribe(new aj(aVar, id), new ak(aVar));
            LiveRoomFragment.this.a(aVar.f8830c);
        }
        al.a(popupWindow);
        a.a().a("live_dislike", new com.bytedance.android.livesdk.j.c.j().f("core").b("live_interact").a("live_detail").c("live"), new k(), Room.class);
    }
}
