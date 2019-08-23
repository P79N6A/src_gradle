package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.relay.a.a;
import com.bytedance.android.livesdk.message.proto.FreeCellGiftMessage;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class y extends c<FreeCellGiftMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16708a;
    @SerializedName("gift_id")

    /* renamed from: b  reason: collision with root package name */
    public long f16709b;
    @SerializedName("fan_ticket_count")

    /* renamed from: c  reason: collision with root package name */
    public long f16710c;
    @SerializedName("group_count")

    /* renamed from: d  reason: collision with root package name */
    public long f16711d;
    @SerializedName("repeat_count")

    /* renamed from: e  reason: collision with root package name */
    public long f16712e;
    @SerializedName("combo_count")

    /* renamed from: f  reason: collision with root package name */
    public long f16713f;
    @SerializedName("user")
    public User g;
    @SerializedName("to_user")
    public User h;
    public a i;
    public boolean j;

    public y() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.FREE_CELL_GIFT_MESSAGE;
    }

    public boolean canText() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public static ab a(y yVar) {
        y yVar2 = yVar;
        if (PatchProxy.isSupport(new Object[]{yVar2}, null, f16708a, true, 11049, new Class[]{y.class}, ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[]{yVar2}, null, f16708a, true, 11049, new Class[]{y.class}, ab.class);
        } else if (yVar2 == null) {
            return null;
        } else {
            ab abVar = new ab();
            abVar.o = yVar2.j;
            abVar.baseMessage = yVar2.baseMessage;
            abVar.f16432d = yVar2.f16709b;
            abVar.f16434f = (int) yVar2.f16710c;
            abVar.j = (int) yVar2.f16711d;
            abVar.f16433e = (int) yVar2.f16712e;
            abVar.i = (int) yVar2.f16713f;
            abVar.f16430b = yVar2.g;
            abVar.f16431c = yVar2.h;
            abVar.h = 0;
            return abVar;
        }
    }

    public /* synthetic */ c wrap(Message message) {
        a aVar;
        FreeCellGiftMessage freeCellGiftMessage = (FreeCellGiftMessage) message;
        if (PatchProxy.isSupport(new Object[]{freeCellGiftMessage}, this, f16708a, false, 11048, new Class[]{FreeCellGiftMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{freeCellGiftMessage}, this, f16708a, false, 11048, new Class[]{FreeCellGiftMessage.class}, c.class);
        }
        y yVar = new y();
        yVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(freeCellGiftMessage.common);
        yVar.f16709b = ((Long) Wire.get(freeCellGiftMessage.gift_id, 0L)).longValue();
        yVar.f16710c = ((Long) Wire.get(freeCellGiftMessage.fan_ticket_count, 0L)).longValue();
        yVar.f16711d = ((Long) Wire.get(freeCellGiftMessage.group_count, 0L)).longValue();
        yVar.f16712e = ((Long) Wire.get(freeCellGiftMessage.repeat_count, 0L)).longValue();
        yVar.f16713f = ((Long) Wire.get(freeCellGiftMessage.combo_count, 0L)).longValue();
        yVar.g = com.bytedance.android.livesdk.message.a.a.a(freeCellGiftMessage.user);
        yVar.h = com.bytedance.android.livesdk.message.a.a.a(freeCellGiftMessage.to_user);
        FreeCellGiftMessage.FreeCellData freeCellData = freeCellGiftMessage.free_cell;
        if (PatchProxy.isSupport(new Object[]{freeCellData}, null, a.f15429a, true, 10124, new Class[]{FreeCellGiftMessage.FreeCellData.class}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{freeCellData}, null, a.f15429a, true, 10124, new Class[]{FreeCellGiftMessage.FreeCellData.class}, a.class);
        } else {
            a aVar2 = new a();
            aVar2.f15431c = ((Long) Wire.get(freeCellData.time_now_ms, 0L)).longValue();
            aVar2.f15432d = ((Long) Wire.get(freeCellData.time_start_ms, 0L)).longValue();
            aVar2.f15433e = ((Long) Wire.get(freeCellData.time_freeze_end_ms, 0L)).longValue();
            aVar2.f15434f = ((Long) Wire.get(freeCellData.time_double_end_ms, 0L)).longValue();
            aVar2.g = ((Long) Wire.get(freeCellData.time_end_ms, 0L)).longValue();
            aVar2.h = ((Long) Wire.get(freeCellData.free_cell_length, 0L)).longValue();
            aVar2.i = ((Boolean) Wire.get(freeCellData.is_freeze, Boolean.FALSE)).booleanValue();
            aVar2.j = ((Boolean) Wire.get(freeCellData.is_double, Boolean.FALSE)).booleanValue();
            aVar2.k = com.bytedance.android.livesdk.message.a.a.a(freeCellData.contribute_most_user);
            aVar2.l = ((Long) Wire.get(freeCellData.contribute_most_coins, 0L)).longValue();
            aVar2.m = ((Long) Wire.get(freeCellData.distance_from_previous_one, 0L)).longValue();
            aVar2.n = ((Long) Wire.get(freeCellData.index_in_day_ranklist, 0L)).longValue();
            aVar = aVar2;
        }
        yVar.i = aVar;
        return yVar;
    }
}
