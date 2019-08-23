package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.GiftMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class ab extends c<GiftMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16429a;
    @SerializedName("user")

    /* renamed from: b  reason: collision with root package name */
    public User f16430b;
    @SerializedName("to_user")

    /* renamed from: c  reason: collision with root package name */
    public User f16431c;
    @SerializedName("gift_id")

    /* renamed from: d  reason: collision with root package name */
    public long f16432d;
    @SerializedName("repeat_count")

    /* renamed from: e  reason: collision with root package name */
    public int f16433e;
    @SerializedName("fan_ticket_count")

    /* renamed from: f  reason: collision with root package name */
    public int f16434f;
    @SerializedName("room_fan_ticket_count")
    public long g;
    @SerializedName("repeat_end")
    public int h;
    @SerializedName("combo_count")
    public int i;
    @SerializedName("group_count")
    public int j;
    @SerializedName("group_id")
    public long k;
    @SerializedName("text_effect")
    public bk l;
    @SerializedName("income_taskgifts")
    public long m;
    public boolean n;
    @IgnoreStyleCheck
    public transient boolean o;

    public ab() {
        this.type = a.GIFT;
    }

    public boolean canText() {
        if (this.f16430b != null) {
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
        long j2;
        if (PatchProxy.isSupport(new Object[0], this, f16429a, false, 11053, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f16429a, false, 11053, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder("GiftMessage{fromUserId=");
        sb.append(this.f16430b);
        sb.append(", toUserId=");
        if (this.f16431c != null) {
            j2 = this.f16431c.getId();
        } else {
            j2 = 0;
        }
        sb.append(j2);
        sb.append(", giftId=");
        sb.append(this.f16432d);
        sb.append(", repeatCount=");
        sb.append(this.f16433e);
        sb.append(", fanTicketCount=");
        sb.append(this.f16434f);
        sb.append(", repeatEnd=");
        sb.append(this.h);
        sb.append(", comboCount=");
        sb.append(this.i);
        sb.append(", groupCount=");
        sb.append(this.j);
        sb.append(", groupId=");
        sb.append(this.k);
        sb.append(", textEffect=");
        sb.append(com.bytedance.android.live.a.a().toJson((Object) this.l));
        sb.append(", incomeTaskgifts=");
        sb.append(this.m);
        sb.append(", isUrgent=");
        sb.append(this.n);
        sb.append(", isLocal=");
        sb.append(this.o);
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ c wrap(Message message) {
        bk bkVar;
        GiftMessage giftMessage = (GiftMessage) message;
        if (PatchProxy.isSupport(new Object[]{giftMessage}, this, f16429a, false, 11052, new Class[]{GiftMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{giftMessage}, this, f16429a, false, 11052, new Class[]{GiftMessage.class}, c.class);
        }
        ab abVar = new ab();
        abVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(giftMessage.common);
        abVar.i = (int) ((Long) Wire.get(giftMessage.combo_count, 0L)).longValue();
        abVar.f16434f = (int) ((Long) Wire.get(giftMessage.fan_ticket_count, 0L)).longValue();
        abVar.f16432d = ((Long) Wire.get(giftMessage.gift_id, 0L)).longValue();
        abVar.j = (int) ((Long) Wire.get(giftMessage.group_count, 0L)).longValue();
        abVar.k = ((Long) Wire.get(giftMessage.group_id, 0L)).longValue();
        abVar.f16433e = (int) ((Long) Wire.get(giftMessage.repeat_count, 0L)).longValue();
        abVar.h = ((Integer) Wire.get(giftMessage.repeat_end, 0)).intValue();
        abVar.f16430b = com.bytedance.android.livesdk.message.a.a.a(giftMessage.user);
        abVar.f16431c = com.bytedance.android.livesdk.message.a.a.a(giftMessage.to_user);
        GiftMessage.TextEffect textEffect = giftMessage.text_effect;
        if (PatchProxy.isSupport(new Object[]{textEffect}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10979, new Class[]{GiftMessage.TextEffect.class}, bk.class)) {
            bkVar = (bk) PatchProxy.accessDispatch(new Object[]{textEffect}, null, com.bytedance.android.livesdk.message.a.a.f16388a, true, 10979, new Class[]{GiftMessage.TextEffect.class}, bk.class);
        } else if (textEffect == null) {
            bkVar = null;
        } else {
            bkVar = new bk();
            bkVar.f16579a = com.bytedance.android.livesdk.message.a.a.a(textEffect.portrait);
            bkVar.f16580b = com.bytedance.android.livesdk.message.a.a.a(textEffect.landscape);
        }
        abVar.l = bkVar;
        abVar.m = ((Long) Wire.get(giftMessage.income_taskgifts, 0L)).longValue();
        abVar.g = ((Long) Wire.get(giftMessage.room_fan_ticket_count, 0L)).longValue();
        return abVar;
    }
}
