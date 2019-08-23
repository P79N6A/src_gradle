package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.DoodleGiftMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class q extends c<DoodleGiftMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16670a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16671b;
    @SerializedName("to_user")

    /* renamed from: c  reason: collision with root package name */
    public User f16672c;
    @SerializedName("gift_id")

    /* renamed from: d  reason: collision with root package name */
    public long f16673d;
    @SerializedName("repeat_count")

    /* renamed from: e  reason: collision with root package name */
    public int f16674e;
    @SerializedName("fan_ticket_count")

    /* renamed from: f  reason: collision with root package name */
    public long f16675f;
    @SerializedName("room_fan_ticket_count")
    public long g;
    @SerializedName("compose")
    public r h;

    public q() {
        this.type = a.DOODLE_GIFT;
    }

    public boolean canText() {
        if (this.f16671b != null) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.j == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f16670a, false, 11039, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16670a, false, 11039, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder("DoodleGiftMessage{fromUserId=");
        sb.append(this.f16671b.getId());
        sb.append(", toUserId=");
        if (this.f16672c != null) {
            j = this.f16672c.getId();
        } else {
            j = 0;
        }
        sb.append(j);
        sb.append(", giftId=");
        sb.append(this.f16673d);
        sb.append(", repeatCount=");
        sb.append(this.f16674e);
        sb.append(", fanTicketCount=");
        sb.append(this.f16675f);
        sb.append(", compose=");
        sb.append(com.bytedance.android.live.a.a().toJson((Object) this.h));
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ c wrap(Message message) {
        DoodleGiftMessage doodleGiftMessage = (DoodleGiftMessage) message;
        if (PatchProxy.isSupport(new Object[]{doodleGiftMessage}, this, f16670a, false, 11038, new Class[]{DoodleGiftMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{doodleGiftMessage}, this, f16670a, false, 11038, new Class[]{DoodleGiftMessage.class}, c.class);
        }
        q qVar = new q();
        qVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(doodleGiftMessage.common);
        qVar.f16673d = ((Long) Wire.get(doodleGiftMessage.gift_id, 0L)).longValue();
        qVar.f16675f = ((Long) Wire.get(doodleGiftMessage.fan_ticket_count, 0L)).longValue();
        qVar.f16671b = com.bytedance.android.livesdk.message.a.a.a(doodleGiftMessage.user);
        qVar.f16672c = com.bytedance.android.livesdk.message.a.a.a(doodleGiftMessage.to_user);
        qVar.h = (r) com.bytedance.android.live.a.a().fromJson(doodleGiftMessage.compose, r.class);
        qVar.g = ((Long) Wire.get(doodleGiftMessage.room_fan_ticket_count, 0L)).longValue();
        return qVar;
    }
}
