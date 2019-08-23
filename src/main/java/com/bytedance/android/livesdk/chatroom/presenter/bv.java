package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.bm;
import com.bytedance.android.livesdk.message.model.bn;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.ies.a.a;
import com.bytedance.ies.a.b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.SingleObserver;

public final class bv extends b<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11328a;

    /* renamed from: b  reason: collision with root package name */
    private IMessageManager f11329b;

    /* renamed from: c  reason: collision with root package name */
    private DataCenter f11330c;

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11328a, false, 5328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11328a, false, 5328, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.f11329b.removeMessageListener(this);
    }

    public bv(DataCenter dataCenter) {
        this.f11330c = dataCenter;
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11328a, false, 5327, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11328a, false, 5327, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f11329b = (IMessageManager) this.f11330c.get("data_message_manager");
        this.f11329b.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.USER_STATS.getIntType(), this);
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11328a, false, 5329, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11328a, false, 5329, new Class[]{IMessage.class}, Void.TYPE);
        } else if (iMessage != null) {
            bn bnVar = ((bm) iMessage).f16593b;
            if (bnVar == null || bnVar.f16595b != TTLiveSDKContext.getHostService().k().b()) {
                return;
            }
            if (1 == bnVar.f16596c) {
                TTLiveSDKContext.getHostService().k().e().subscribe((SingleObserver<? super T>) new g<Object>());
                this.f11330c.lambda$put$1$DataCenter("cmd_refresh_user_in_room", new Object());
            }
        }
    }
}
