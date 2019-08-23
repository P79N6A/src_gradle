package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.InRoomBannerMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;

public class ae extends c<InRoomBannerMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16441a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public JsonObject f16442b;
    @SerializedName("position")

    /* renamed from: c  reason: collision with root package name */
    public int f16443c;

    public ae() {
        this.type = a.IN_ROOM_BANNER_MESSAGE;
    }

    public /* synthetic */ c wrap(Message message) {
        InRoomBannerMessage inRoomBannerMessage = (InRoomBannerMessage) message;
        if (PatchProxy.isSupport(new Object[]{inRoomBannerMessage}, this, f16441a, false, 11056, new Class[]{InRoomBannerMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{inRoomBannerMessage}, this, f16441a, false, 11056, new Class[]{InRoomBannerMessage.class}, c.class);
        }
        ae aeVar = new ae();
        aeVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(inRoomBannerMessage.common);
        if (inRoomBannerMessage.extra != null) {
            aeVar.f16442b = new JsonParser().parse(inRoomBannerMessage.extra).getAsJsonObject();
        }
        if (inRoomBannerMessage.position == InRoomBannerMessage.PositionType.TOP_RIGHT) {
            aeVar.f16443c = 2;
        } else {
            aeVar.f16443c = 1;
        }
        return aeVar;
    }
}
