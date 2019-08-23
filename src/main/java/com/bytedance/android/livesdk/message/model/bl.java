package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.proto.TurntableBurstMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class bl extends c<TurntableBurstMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16587a;
    @SerializedName("burst_time_remain_seconds")

    /* renamed from: b  reason: collision with root package name */
    public long f16588b;
    @SerializedName("multiple")

    /* renamed from: c  reason: collision with root package name */
    public long f16589c;
    @SerializedName("property_icon")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f16590d;
    @SerializedName("property_definition_id")

    /* renamed from: e  reason: collision with root package name */
    public long f16591e;

    public bl() {
        this.type = a.TURN_TABLE_BURST;
    }

    public final /* synthetic */ c wrap(Message message) {
        TurntableBurstMessage turntableBurstMessage = (TurntableBurstMessage) message;
        if (PatchProxy.isSupport(new Object[]{turntableBurstMessage}, this, f16587a, false, 11101, new Class[]{TurntableBurstMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{turntableBurstMessage}, this, f16587a, false, 11101, new Class[]{TurntableBurstMessage.class}, c.class);
        }
        bl blVar = new bl();
        blVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(turntableBurstMessage.common);
        blVar.f16588b = ((Long) Wire.get(turntableBurstMessage.burst_time_remain_seconds, 0L)).longValue();
        blVar.f16589c = ((Long) Wire.get(turntableBurstMessage.multiple, 0L)).longValue();
        blVar.f16591e = ((Long) Wire.get(turntableBurstMessage.property_definition_id, 0L)).longValue();
        blVar.f16590d = com.bytedance.android.livesdk.message.a.a.a(turntableBurstMessage.property_icon);
        return blVar;
    }
}
