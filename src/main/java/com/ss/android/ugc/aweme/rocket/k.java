package com.ss.android.ugc.aweme.rocket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.rocket.android.commonsdk.wschannel.FFWsMsg;
import com.ss.android.g.a;
import com.ss.android.websocket.b.b;
import com.ss.android.websocket.b.b.c;
import com.ss.android.websocket.b.b.g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nH\u0007J\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/rocket/FlipChatWebSocketManager;", "", "()V", "FLIP_CHAT_METHOD", "", "FLIP_CHAT_SERVICE", "onEvent", "", "event", "Lcom/ss/android/websocket/ws/output/ReceivedMsgEvent;", "Lcom/ss/android/websocket/ws/output/WSStatusChangeEvent;", "registerWSEvent", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3848a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f3849b = new k();

    private k() {
    }

    @Subscribe
    public final void onEvent(@NotNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3848a, false, 70904, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3848a, false, 70904, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "event");
        if (!a.a() && cVar2.f78211d == 1 && cVar2.f78212e == 1010 && (cVar2.f78210c instanceof c)) {
            Object obj = cVar2.f78210c;
            if (obj != null) {
                c cVar3 = (c) obj;
                FusionFuelSdk.onReceiverWsMsg(new FFWsMsg.Builder(1).setMethod(cVar2.f78211d).setService(cVar2.f78212e).setPayload(cVar2.f78209b).setPayloadType(cVar3.f63648d).setPayloadEncoding(cVar3.f63649e).build());
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.rocket.FlipChatChannelMsg");
            }
        }
    }

    @Subscribe
    public final void onEvent(@NotNull g gVar) {
        g gVar2 = gVar;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f3848a, false, 70905, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2}, this, f3848a, false, 70905, new Class[]{g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar2, "event");
        if (!a.a()) {
            b.a aVar = gVar2.f78219b;
            if (PatchProxy.isSupport(new Object[]{aVar}, null, i.f63662a, true, 70902, new Class[]{b.a.class}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{aVar}, null, i.f63662a, true, 70902, new Class[]{b.a.class}, Integer.TYPE)).intValue();
            } else {
                if (aVar != null) {
                    switch (j.f63664a[aVar.ordinal()]) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            break;
                        case 3:
                            i = 2;
                            break;
                        case 4:
                            i = 3;
                            break;
                    }
                }
                i = 4;
            }
            FusionFuelSdk.onReceiveConnectEvent(i, new JSONObject());
        }
    }
}
