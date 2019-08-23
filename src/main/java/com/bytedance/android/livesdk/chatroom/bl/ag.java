package com.bytedance.android.livesdk.chatroom.bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.core.network.response.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ag implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9775a;

    /* renamed from: b  reason: collision with root package name */
    private final h f9776b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f9777c;

    public ag(h hVar, Handler handler) {
        this.f9776b = hVar;
        this.f9777c = handler;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9775a, false, 4036, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9775a, false, 4036, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        h hVar = this.f9776b;
        Handler handler = this.f9777c;
        b bVar = (b) obj;
        if (handler != null) {
            j jVar = new j();
            jVar.f11127a = (Room) bVar.f7871b;
            jVar.f11128b = (EnterRoomExtra) bVar.f7872c;
            jVar.f11127a.nowTime = ((EnterRoomExtra) bVar.f7872c).now / 1000;
            hVar.f9799b = TTLiveSDKContext.getHostService().k().c();
            Message obtainMessage = handler.obtainMessage(4);
            obtainMessage.obj = jVar;
            handler.sendMessage(obtainMessage);
        }
    }
}
