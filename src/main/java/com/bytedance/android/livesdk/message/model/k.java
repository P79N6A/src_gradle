package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.aw;
import com.bytedance.android.livesdk.message.proto.CreateRedPacketMessage;
import com.bytedance.android.livesdk.message.proto.RedPacket;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.List;

public final class k extends c<CreateRedPacketMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16646a;
    @SerializedName("red_packets")

    /* renamed from: b  reason: collision with root package name */
    public List<aw> f16647b;

    public k() {
        this.type = a.CREATE_RED_PACKET;
    }

    public final /* synthetic */ c wrap(Message message) {
        aw awVar;
        CreateRedPacketMessage createRedPacketMessage = (CreateRedPacketMessage) message;
        if (PatchProxy.isSupport(new Object[]{createRedPacketMessage}, this, f16646a, false, 11030, new Class[]{CreateRedPacketMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{createRedPacketMessage}, this, f16646a, false, 11030, new Class[]{CreateRedPacketMessage.class}, c.class);
        }
        k kVar = new k();
        kVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(createRedPacketMessage.common);
        kVar.f16647b = new ArrayList();
        for (RedPacket next : createRedPacketMessage.red_packets) {
            List<aw> list = kVar.f16647b;
            if (PatchProxy.isSupport(new Object[]{next}, null, aw.f16510a, true, 11087, new Class[]{RedPacket.class}, aw.class)) {
                awVar = (aw) PatchProxy.accessDispatch(new Object[]{next}, null, aw.f16510a, true, 11087, new Class[]{RedPacket.class}, aw.class);
            } else {
                aw awVar2 = new aw();
                awVar2.f16511b = ((Long) Wire.get(next.red_packet_group_id, 0L)).longValue();
                awVar2.f16512c = ((Long) Wire.get(next.bonus_type, 0L)).longValue();
                awVar2.f16513d = ((Long) Wire.get(next.combo_count, 0L)).longValue();
                awVar2.f16514e = ((Long) Wire.get(next.bonus_count, 0L)).longValue();
                awVar2.f16515f = ((Long) Wire.get(next.count_down, 0L)).longValue();
                awVar2.g = ((Long) Wire.get(next.rush_time, 0L)).longValue();
                awVar2.h = next.icon_url;
                awVar2.i = ((Long) Wire.get(next.disappear_time, 0L)).longValue();
                User a2 = com.bytedance.android.livesdk.message.a.a.a(next.owner);
                if (a2 != null) {
                    aw.a aVar = new aw.a();
                    aVar.f16516a = a2.getId();
                    ImageModel avatarThumb = a2.getAvatarThumb();
                    if (!(avatarThumb == null || avatarThumb.getUrls() == null || avatarThumb.getUrls().size() <= 0)) {
                        aVar.f16518c = avatarThumb.getUrls().get(0);
                    }
                    aVar.f16517b = a2.getNickName();
                    awVar2.j = aVar;
                }
                awVar2.k = ((Long) Wire.get(next.total_count_down, 0L)).longValue();
                awVar2.l = next.red_packet_source;
                awVar = awVar2;
            }
            list.add(awVar);
        }
        return kVar;
    }
}
