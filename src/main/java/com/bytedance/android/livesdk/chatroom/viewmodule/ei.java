package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.bl.c;
import com.bytedance.android.livesdk.message.model.ay;
import com.bytedance.android.livesdk.message.model.az;
import com.bytedance.android.livesdk.message.model.be;
import com.bytedance.android.livesdkapi.h.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ei implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13219a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomPushWidget f13220b;

    /* renamed from: c  reason: collision with root package name */
    private final be f13221c;

    ei(RoomPushWidget roomPushWidget, be beVar) {
        this.f13220b = roomPushWidget;
        this.f13221c = beVar;
    }

    public final void accept(Object obj) {
        ay ayVar;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13219a, false, 7470, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13219a, false, 7470, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RoomPushWidget roomPushWidget = this.f13220b;
        be beVar = this.f13221c;
        roomPushWidget.contentView.setVisibility(8);
        roomPushWidget.f12794c = false;
        CharSequence text = roomPushWidget.f12795d.getText();
        if (PatchProxy.isSupport(new Object[]{beVar, text}, roomPushWidget, RoomPushWidget.f12792a, false, 7464, new Class[]{be.class, CharSequence.class}, Void.TYPE)) {
            Object[] objArr = {beVar, text};
            RoomPushWidget roomPushWidget2 = roomPushWidget;
            ChangeQuickRedirect changeQuickRedirect = RoomPushWidget.f12792a;
            PatchProxy.accessDispatch(objArr, roomPushWidget2, changeQuickRedirect, false, 7464, new Class[]{be.class, CharSequence.class}, Void.TYPE);
        } else if (!PushConstants.PUSH_TYPE_NOTIFY.equals(beVar.f16553b.f16559f)) {
            long id = roomPushWidget.f12796e.getId();
            if (PatchProxy.isSupport(new Object[]{new Long(id), text, beVar}, null, c.f9787a, true, 3960, new Class[]{Long.TYPE, CharSequence.class, be.class}, ay.class)) {
                ayVar = (ay) PatchProxy.accessDispatch(new Object[]{new Long(id), text, beVar}, null, c.f9787a, true, 3960, new Class[]{Long.TYPE, CharSequence.class, be.class}, ay.class);
            } else {
                ay ayVar2 = new ay();
                b bVar = new b();
                bVar.f18776c = id;
                ayVar2.baseMessage = bVar;
                az azVar = new az();
                azVar.f16530d = beVar.f16553b.f16557d;
                azVar.f16529c = beVar.f16553b.f16556c;
                azVar.g = beVar.f16553b.a();
                azVar.f16527a = text.toString();
                azVar.j = text;
                azVar.f16528b = beVar.f16553b.f16555b;
                azVar.f16532f = beVar.f16553b.f16559f;
                azVar.f16531e = beVar.f16553b.f16558e;
                azVar.i = beVar.f16553b.i;
                azVar.h = beVar.f16553b.j;
                azVar.k = beVar.f16553b.k;
                ayVar2.f16526b = azVar;
                ayVar = ayVar2;
            }
            ((IMessageManager) roomPushWidget.dataCenter.get("data_message_manager")).insertMessage(ayVar, true);
        }
        if (roomPushWidget.f12793b != null) {
            roomPushWidget.f12793b.a();
        }
    }
}
