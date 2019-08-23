package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.proto.DutyGiftMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class u extends c<DutyGiftMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16684a;
    @SerializedName("speedy_gift_id")

    /* renamed from: b  reason: collision with root package name */
    public int f16685b;
    @SerializedName("target_score")

    /* renamed from: c  reason: collision with root package name */
    public int f16686c;
    @SerializedName("stage_count")

    /* renamed from: d  reason: collision with root package name */
    public int f16687d;
    @SerializedName("status")

    /* renamed from: e  reason: collision with root package name */
    public int f16688e;
    @SerializedName("score")

    /* renamed from: f  reason: collision with root package name */
    public int f16689f;
    @SerializedName("contribute_most")
    public User g;
    @SerializedName("duty_id")
    public long h;

    public u() {
        this.type = a.DUTY_GIFT_MESSAGE;
    }

    public /* synthetic */ c wrap(Message message) {
        DutyGiftMessage dutyGiftMessage = (DutyGiftMessage) message;
        if (PatchProxy.isSupport(new Object[]{dutyGiftMessage}, this, f16684a, false, 11041, new Class[]{DutyGiftMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{dutyGiftMessage}, this, f16684a, false, 11041, new Class[]{DutyGiftMessage.class}, c.class);
        }
        u uVar = new u();
        uVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(dutyGiftMessage.common);
        uVar.f16685b = ((Integer) Wire.get(dutyGiftMessage.speedy_gift_id, 0)).intValue();
        uVar.f16686c = ((Integer) Wire.get(dutyGiftMessage.target_score, 0)).intValue();
        uVar.f16687d = ((Integer) Wire.get(dutyGiftMessage.stage_count, 0)).intValue();
        uVar.f16688e = ((Integer) Wire.get(dutyGiftMessage.status, 0)).intValue();
        uVar.f16689f = ((Integer) Wire.get(dutyGiftMessage.score, 0)).intValue();
        if (dutyGiftMessage.contribute_most != null) {
            uVar.g = com.bytedance.android.livesdk.message.a.a.a(dutyGiftMessage.contribute_most);
        }
        uVar.h = ((Long) Wire.get(dutyGiftMessage.duty_id, 0L)).longValue();
        return uVar;
    }
}
