package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.PushMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class be extends c<PushMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16552a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public bf f16553b;

    public be() {
        this.type = a.ROOM_PUSH;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        PushMessage pushMessage = (PushMessage) message;
        if (PatchProxy.isSupport(new Object[]{pushMessage}, this, f16552a, false, 11094, new Class[]{PushMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{pushMessage}, this, f16552a, false, 11094, new Class[]{PushMessage.class}, c.class);
        }
        be beVar = new be();
        beVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(pushMessage.common);
        bf bfVar = new bf();
        bfVar.f16558e = pushMessage.action_content;
        bfVar.f16559f = String.valueOf(((Long) Wire.get(pushMessage.action_type, 0L)).longValue());
        bfVar.f16555b = pushMessage.color;
        bfVar.f16554a = pushMessage.content;
        bfVar.g = ((Long) Wire.get(pushMessage.push_message_display_time, 0L)).longValue();
        bfVar.f16556c = pushMessage.traceid;
        bfVar.f16557d = com.bytedance.android.livesdk.message.a.a.a(pushMessage.icon);
        bfVar.h = com.bytedance.android.livesdk.message.a.a.a(pushMessage.background_image);
        bfVar.i = com.bytedance.android.livesdk.message.a.a.a(pushMessage.new_background_image);
        bfVar.j = com.bytedance.android.livesdk.message.a.a.a(pushMessage.action_icon);
        beVar.f16553b = bfVar;
        return beVar;
    }
}
