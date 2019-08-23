package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.chatroom.model.ac;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class bk extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11294a;

    /* renamed from: b  reason: collision with root package name */
    private Room f11295b;

    public interface a extends al {
        void a(ac acVar, long j, boolean z);

        void b();
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11294a, false, 5289, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11294a, false, 5289, new Class[]{IMessage.class}, Void.TYPE);
            return;
        }
        a(true);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f11294a, false, 5290, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f11294a, false, 5290, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((ab) j.q().d().d().getCurrentMedal(this.f11295b.getOwner().getId()).compose(((a) b()).getAutoUnbindTransformer()).as(p())).a(new bl(this, z), new bm(this));
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f11294a, false, 5288, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f11294a, false, 5288, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.f11295b = (Room) this.x.get("data_room");
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE_FINISH.getIntType(), this);
        a(false);
    }
}
