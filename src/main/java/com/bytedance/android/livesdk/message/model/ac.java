package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.GiftUpdateMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class ac extends c<GiftUpdateMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16435a;
    @SerializedName("update_type")

    /* renamed from: b  reason: collision with root package name */
    public int f16436b;

    public ac() {
        this.type = a.GIFT_UPDATE;
    }

    public final /* synthetic */ c wrap(Message message) {
        GiftUpdateMessage giftUpdateMessage = (GiftUpdateMessage) message;
        if (PatchProxy.isSupport(new Object[]{giftUpdateMessage}, this, f16435a, false, 11054, new Class[]{GiftUpdateMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{giftUpdateMessage}, this, f16435a, false, 11054, new Class[]{GiftUpdateMessage.class}, c.class);
        }
        ac acVar = new ac();
        acVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(giftUpdateMessage.common);
        acVar.f16436b = ((Integer) Wire.get(giftUpdateMessage.update_type, 0)).intValue();
        return acVar;
    }
}
