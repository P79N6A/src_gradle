package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.ae;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class a extends bx<C0093a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11194a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11195b;

    /* renamed from: c  reason: collision with root package name */
    public Room f11196c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.presenter.a$a  reason: collision with other inner class name */
    public interface C0093a extends al {
        void a(ae aeVar);
    }

    public final void a(C0093a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11194a, false, 5126, new Class[]{C0093a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11194a, false, 5126, new Class[]{C0093a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        if (PatchProxy.isSupport(new Object[]{iMessage2}, this, f11194a, false, 5127, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage2}, this, f11194a, false, 5127, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        if (b() != null && (iMessage2 instanceof ae)) {
            ae aeVar = (ae) iMessage2;
            if (aeVar.f16443c == 1) {
                ((C0093a) b()).a(aeVar);
            }
        }
    }

    public a(Room room, boolean z) {
        this.f11196c = room;
        this.f11195b = z;
    }
}
