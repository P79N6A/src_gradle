package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.SpecialPushMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class ay extends c<SpecialPushMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16525a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public az f16526b;

    public boolean canText() {
        return true;
    }

    public ay() {
        this.type = a.ROOM_RICH_CHAT_MESSAGE;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ c wrap(Message message) {
        SpecialPushMessage specialPushMessage = (SpecialPushMessage) message;
        if (PatchProxy.isSupport(new Object[]{specialPushMessage}, this, f16525a, false, 11089, new Class[]{SpecialPushMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{specialPushMessage}, this, f16525a, false, 11089, new Class[]{SpecialPushMessage.class}, c.class);
        }
        ay ayVar = new ay();
        ayVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(specialPushMessage.common);
        az azVar = new az();
        azVar.f16531e = specialPushMessage.action_content;
        azVar.f16532f = String.valueOf(((Long) Wire.get(specialPushMessage.action_type, 0L)).longValue());
        azVar.f16528b = specialPushMessage.color;
        azVar.f16527a = specialPushMessage.content;
        azVar.f16530d = com.bytedance.android.livesdk.message.a.a.a(specialPushMessage.icon);
        azVar.g = ((Long) Wire.get(specialPushMessage.push_message_display_time, 0L)).longValue();
        azVar.f16529c = specialPushMessage.traceid;
        ayVar.f16526b = azVar;
        return ayVar;
    }
}
