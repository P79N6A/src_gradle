package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.UserStatsMessage;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class bm extends c<UserStatsMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16592a;
    @SerializedName("extra")

    /* renamed from: b  reason: collision with root package name */
    public bn f16593b;

    public bm() {
        this.type = a.USER_STATS;
    }

    public final /* synthetic */ c wrap(Message message) {
        UserStatsMessage userStatsMessage = (UserStatsMessage) message;
        if (PatchProxy.isSupport(new Object[]{userStatsMessage}, this, f16592a, false, 11102, new Class[]{UserStatsMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{userStatsMessage}, this, f16592a, false, 11102, new Class[]{UserStatsMessage.class}, c.class);
        }
        bm bmVar = new bm();
        bmVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(userStatsMessage.common);
        bn bnVar = new bn();
        bnVar.f16596c = ((Long) Wire.get(userStatsMessage.action_type, 0L)).longValue();
        bnVar.f16594a = userStatsMessage.content;
        bnVar.f16595b = ((Long) Wire.get(userStatsMessage.user_id, 0L)).longValue();
        bmVar.f16593b = bnVar;
        return bmVar;
    }
}
