package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.base.model.user.l;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eu implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13247a;

    /* renamed from: b  reason: collision with root package name */
    private final UserPermissionCheckWidget f13248b;

    eu(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f13248b = userPermissionCheckWidget;
    }

    public final void accept(Object obj) {
        Observable<b<Room, EnterRoomExtra>> observable;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13247a, false, 7548, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13247a, false, 7548, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        UserPermissionCheckWidget userPermissionCheckWidget = this.f13248b;
        l lVar = (l) obj;
        if (lVar != null && lVar.f7776a == i.a.Login) {
            if (PatchProxy.isSupport(new Object[0], userPermissionCheckWidget, UserPermissionCheckWidget.f12853a, false, 7545, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], userPermissionCheckWidget, UserPermissionCheckWidget.f12853a, false, 7545, new Class[0], Void.TYPE);
            } else if (userPermissionCheckWidget.f12854b != null && userPermissionCheckWidget.f12854b.getId() > 0) {
                h a2 = h.a();
                long id = userPermissionCheckWidget.f12854b.getId();
                String requestId = userPermissionCheckWidget.f12854b.getRequestId();
                String str = userPermissionCheckWidget.f12855c;
                String str2 = userPermissionCheckWidget.f12856d;
                String str3 = userPermissionCheckWidget.f12857e;
                String str4 = str3;
                String str5 = str2;
                String str6 = str;
                if (PatchProxy.isSupport(new Object[]{new Long(id), requestId, str, str2, str3}, a2, h.f9797a, false, 3989, new Class[]{Long.TYPE, String.class, String.class, String.class, String.class}, Observable.class)) {
                    observable = (Observable) PatchProxy.accessDispatch(new Object[]{new Long(id), requestId, str6, str5, str4}, a2, h.f9797a, false, 3989, new Class[]{Long.TYPE, String.class, String.class, String.class, String.class}, Observable.class);
                } else {
                    observable = ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).enterRoom(id, 1, TTLiveSDKContext.getHostService().k().c() ? 1 : 0, new o().a("common_label_list", str5).a("enter_source", str4).a("request_id", requestId).a("enter_type", str6).f17622b);
                }
                ((ab) observable.compose(com.bytedance.android.live.core.rxutils.i.a()).as(userPermissionCheckWidget.autoDispose())).a(ev.f13250b, new ew(userPermissionCheckWidget));
            }
        }
    }
}
