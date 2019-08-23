package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class bh extends c<RoomVerifyMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16565a;
    @SerializedName("action")

    /* renamed from: b  reason: collision with root package name */
    public int f16566b;
    @SerializedName("content")

    /* renamed from: c  reason: collision with root package name */
    String f16567c;

    public bh() {
        this.type = a.ROOM_VERIFY;
    }

    public final /* synthetic */ c wrap(Message message) {
        RoomVerifyMessage roomVerifyMessage = (RoomVerifyMessage) message;
        if (PatchProxy.isSupport(new Object[]{roomVerifyMessage}, this, f16565a, false, 11096, new Class[]{RoomVerifyMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{roomVerifyMessage}, this, f16565a, false, 11096, new Class[]{RoomVerifyMessage.class}, c.class);
        } else if (roomVerifyMessage == null) {
            return null;
        } else {
            bh bhVar = new bh();
            bhVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(roomVerifyMessage.common);
            bhVar.f16567c = (String) Wire.get(roomVerifyMessage.content, "");
            bhVar.f16566b = ((Integer) Wire.get(roomVerifyMessage.action, 0)).intValue();
            return bhVar;
        }
    }
}
