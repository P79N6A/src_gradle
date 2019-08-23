package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.PushRoomAdCard;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class at extends c<PushRoomAdCard> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16496a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public au f16497b;

    public final boolean canText() {
        return true;
    }

    public at() {
        this.type = a.PROMOTION_CARD_MESSAGE;
    }

    public final /* synthetic */ c wrap(Message message) {
        PushRoomAdCard pushRoomAdCard = (PushRoomAdCard) message;
        if (PatchProxy.isSupport(new Object[]{pushRoomAdCard}, this, f16496a, false, 11083, new Class[]{PushRoomAdCard.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{pushRoomAdCard}, this, f16496a, false, 11083, new Class[]{PushRoomAdCard.class}, c.class);
        }
        at atVar = new at();
        atVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(pushRoomAdCard.common);
        au auVar = new au();
        auVar.f16500c = (int) ((Long) Wire.get(pushRoomAdCard.target_num, 0L)).longValue();
        auVar.f16501d = (int) ((Long) Wire.get(pushRoomAdCard.show_num, 0L)).longValue();
        auVar.f16502e = ((Boolean) Wire.get(pushRoomAdCard.is_finished, Boolean.FALSE)).booleanValue();
        auVar.f16499b = pushRoomAdCard.content;
        auVar.f16498a = pushRoomAdCard.action_content;
        auVar.f16503f = ((Integer) Wire.get(pushRoomAdCard.adcard_type, 1)).intValue();
        auVar.g = ((Integer) Wire.get(pushRoomAdCard.hotvalue, 0)).intValue();
        atVar.f16497b = auVar;
        return atVar;
    }
}
