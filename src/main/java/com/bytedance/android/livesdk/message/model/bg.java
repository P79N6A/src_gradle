package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.RoomUserSeqMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.List;

public final class bg extends c<RoomUserSeqMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16560a;
    @SerializedName("total")

    /* renamed from: b  reason: collision with root package name */
    public long f16561b;
    @SerializedName("ranks")

    /* renamed from: c  reason: collision with root package name */
    public List<i> f16562c;
    @SerializedName("pop_str")

    /* renamed from: d  reason: collision with root package name */
    public String f16563d;
    @SerializedName("seats")

    /* renamed from: e  reason: collision with root package name */
    public List<i> f16564e;

    public bg() {
        this.type = a.USER_SEQ;
    }

    public final /* synthetic */ c wrap(Message message) {
        RoomUserSeqMessage roomUserSeqMessage = (RoomUserSeqMessage) message;
        if (PatchProxy.isSupport(new Object[]{roomUserSeqMessage}, this, f16560a, false, 11095, new Class[]{RoomUserSeqMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{roomUserSeqMessage}, this, f16560a, false, 11095, new Class[]{RoomUserSeqMessage.class}, c.class);
        } else if (roomUserSeqMessage == null) {
            return null;
        } else {
            bg bgVar = new bg();
            bgVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(roomUserSeqMessage.common);
            bgVar.f16561b = ((Long) Wire.get(roomUserSeqMessage.total, 0L)).longValue();
            List<RoomUserSeqMessage.Contributor> list = roomUserSeqMessage.ranks;
            if (!CollectionUtils.isEmpty(list)) {
                ArrayList arrayList = new ArrayList();
                for (RoomUserSeqMessage.Contributor next : list) {
                    if (next != null) {
                        i iVar = new i();
                        iVar.f16633b = ((Long) Wire.get(next.score, 0L)).longValue();
                        iVar.f16632a = com.bytedance.android.livesdk.message.a.a.a(next.user);
                        iVar.f16634c = ((Long) Wire.get(next.rank, 0L)).longValue();
                        iVar.f16635d = ((Long) Wire.get(next.delta, 0L)).longValue();
                        arrayList.add(iVar);
                    }
                }
                bgVar.f16562c = arrayList;
                bgVar.f16563d = (String) Wire.get(roomUserSeqMessage.pop_str, "");
            }
            if (!CollectionUtils.isEmpty(roomUserSeqMessage.seats)) {
                ArrayList arrayList2 = new ArrayList();
                for (RoomUserSeqMessage.Contributor next2 : roomUserSeqMessage.seats) {
                    if (next2 != null) {
                        i iVar2 = new i();
                        iVar2.f16633b = ((Long) Wire.get(next2.score, 0L)).longValue();
                        iVar2.f16632a = com.bytedance.android.livesdk.message.a.a.a(next2.user);
                        iVar2.f16634c = ((Long) Wire.get(next2.rank, 0L)).longValue();
                        iVar2.f16635d = ((Long) Wire.get(next2.delta, 0L)).longValue();
                        arrayList2.add(iVar2);
                    }
                }
                bgVar.f16564e = arrayList2;
            }
            return bgVar;
        }
    }
}
