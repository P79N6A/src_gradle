package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.RoomImgMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class ba extends c<RoomImgMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16537a;
    @SerializedName("action")

    /* renamed from: b  reason: collision with root package name */
    public long f16538b;
    @SerializedName("bg_img_url")

    /* renamed from: c  reason: collision with root package name */
    public String f16539c;
    @SerializedName("content")

    /* renamed from: d  reason: collision with root package name */
    public String f16540d;

    public ba() {
        this.type = a.ROOM_IMG_MESSAGE;
    }

    public final /* synthetic */ c wrap(Message message) {
        RoomImgMessage roomImgMessage = (RoomImgMessage) message;
        if (PatchProxy.isSupport(new Object[]{roomImgMessage}, this, f16537a, false, 11090, new Class[]{RoomImgMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{roomImgMessage}, this, f16537a, false, 11090, new Class[]{RoomImgMessage.class}, c.class);
        }
        ba baVar = new ba();
        baVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(roomImgMessage.common);
        baVar.f16538b = ((Long) Wire.get(roomImgMessage.action, 0L)).longValue();
        baVar.f16539c = roomImgMessage.bg_img_url;
        baVar.f16540d = roomImgMessage.content;
        return baVar;
    }
}
