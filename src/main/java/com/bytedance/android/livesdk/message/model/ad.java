package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.GuideMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class ad extends c<GuideMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16437a;
    @SerializedName("guide_type")

    /* renamed from: b  reason: collision with root package name */
    public long f16438b;
    @SerializedName("gift_id")

    /* renamed from: c  reason: collision with root package name */
    public long f16439c;
    @SerializedName("description")

    /* renamed from: d  reason: collision with root package name */
    public String f16440d;

    public ad() {
        this.type = a.GUIDE_MESSAGE;
    }

    public /* synthetic */ c wrap(Message message) {
        GuideMessage guideMessage = (GuideMessage) message;
        if (PatchProxy.isSupport(new Object[]{guideMessage}, this, f16437a, false, 11055, new Class[]{GuideMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{guideMessage}, this, f16437a, false, 11055, new Class[]{GuideMessage.class}, c.class);
        }
        ad adVar = new ad();
        adVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(guideMessage.common);
        adVar.f16438b = ((Long) Wire.get(guideMessage.guide_type, 0L)).longValue();
        adVar.f16439c = ((Long) Wire.get(guideMessage.gift_id, 0L)).longValue();
        adVar.f16440d = (String) Wire.get(guideMessage.description, "");
        return adVar;
    }
}
