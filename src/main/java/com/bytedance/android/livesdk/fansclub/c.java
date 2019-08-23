package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.chatroom.presenter.bx;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdk.message.model.v;
import com.bytedance.android.livesdk.message.model.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class c extends bx<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13873a;

    public interface a extends al {
        void a(FansclubStatisticMessage fansclubStatisticMessage);

        void a(v vVar);

        void a(w wVar);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f13873a, false, 8291, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f13873a, false, 8291, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB_STATISTICS.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB.getIntType(), this);
        this.y.addMessageListener(com.bytedance.android.livesdkapi.depend.f.a.FANS_CLUB_REVIEW.getIntType(), this);
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f13873a, false, 8292, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f13873a, false, 8292, new Class[]{IMessage.class}, Void.TYPE);
        } else if (b() != null) {
            switch (((com.bytedance.android.livesdk.message.model.c) iMessage).getMessageType()) {
                case FANS_CLUB_STATISTICS:
                    ((a) b()).a((FansclubStatisticMessage) iMessage);
                    return;
                case FANS_CLUB:
                    v vVar = (v) iMessage;
                    if (vVar.f16691b == 2) {
                        ((a) b()).a(vVar);
                        return;
                    }
                    break;
                case FANS_CLUB_REVIEW:
                    ((a) b()).a((w) iMessage);
                    break;
            }
        }
    }
}
