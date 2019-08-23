package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.a.c;
import com.bytedance.android.livesdk.message.proto.LinkMicBattleFinish;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class ai extends c<LinkMicBattleFinish> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16452a;
    @SerializedName("battle_settings")

    /* renamed from: b  reason: collision with root package name */
    public c f16453b;

    public ai() {
        this.type = a.LINK_MIC_BATTLE_FINISH;
    }

    public final /* synthetic */ c wrap(Message message) {
        LinkMicBattleFinish linkMicBattleFinish = (LinkMicBattleFinish) message;
        if (PatchProxy.isSupport(new Object[]{linkMicBattleFinish}, this, f16452a, false, 11059, new Class[]{LinkMicBattleFinish.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{linkMicBattleFinish}, this, f16452a, false, 11059, new Class[]{LinkMicBattleFinish.class}, c.class);
        }
        ai aiVar = new ai();
        if (linkMicBattleFinish.battle_settings != null) {
            aiVar.f16453b = new c();
            aiVar.f16453b.f11032e = ((Long) Wire.get(linkMicBattleFinish.battle_settings.battle_id, 0L)).longValue();
            aiVar.f16453b.f11029b = ((Long) Wire.get(linkMicBattleFinish.battle_settings.duration, 0L)).intValue();
            aiVar.f16453b.f11028a = ((Long) Wire.get(linkMicBattleFinish.battle_settings.channel_id, 0L)).longValue();
            aiVar.f16453b.f11031d = ((Long) Wire.get(linkMicBattleFinish.battle_settings.start_time_ms, 0L)).longValue();
            aiVar.f16453b.f11030c = (String) Wire.get(linkMicBattleFinish.battle_settings.theme, "");
            aiVar.f16453b.f11033f = ((Long) Wire.get(linkMicBattleFinish.battle_settings.match_type, 0L)).longValue();
        }
        return aiVar;
    }
}
