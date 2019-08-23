package com.bytedance.android.livesdk.chatroom.model.a;

import com.bytedance.android.livesdk.chatroom.model.a.a;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.message.proto.BattleModeMessage;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class h extends c<BattleModeMessage> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11042a;
    @SerializedName("battle_mode")

    /* renamed from: b  reason: collision with root package name */
    public a f11043b;
    @SerializedName("extra")

    /* renamed from: c  reason: collision with root package name */
    public a f11044c;

    public static class a {
        @SerializedName("now")

        /* renamed from: a  reason: collision with root package name */
        public long f11045a;
    }

    public h() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.BATTLE_MODE;
    }

    public final /* synthetic */ c wrap(Message message) {
        BattleModeMessage battleModeMessage = (BattleModeMessage) message;
        if (PatchProxy.isSupport(new Object[]{battleModeMessage}, this, f11042a, false, 5124, new Class[]{BattleModeMessage.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{battleModeMessage}, this, f11042a, false, 5124, new Class[]{BattleModeMessage.class}, c.class);
        }
        h hVar = new h();
        hVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(battleModeMessage.common);
        a aVar = new a();
        aVar.f11018a = ((Long) Wire.get(battleModeMessage.mode, 0L)).intValue();
        if (battleModeMessage.steal_tower_data != null) {
            a.C0090a aVar2 = new a.C0090a();
            aVar2.f11025f = ((Long) Wire.get(battleModeMessage.steal_tower_data.attacker_id, 0L)).longValue();
            aVar2.f11022c = ((Long) Wire.get(battleModeMessage.steal_tower_data.duration, 0L)).intValue();
            aVar2.f11021b = ((Long) Wire.get(battleModeMessage.steal_tower_data.finish_time, 0L)).longValue();
            aVar2.h = ((Long) Wire.get(battleModeMessage.steal_tower_data.win, 0L)).intValue();
            aVar2.f11020a = ((Long) Wire.get(battleModeMessage.steal_tower_data.start_time, 0L)).longValue();
            aVar2.g = ((Boolean) Wire.get(battleModeMessage.steal_tower_data.finish, Boolean.FALSE)).booleanValue();
            aVar2.f11024e = ((Long) Wire.get(battleModeMessage.steal_tower_data.target_score, 0L)).intValue();
            aVar2.j = ((Long) Wire.get(battleModeMessage.steal_tower_data.count, 0L)).intValue();
            aVar2.f11023d = ((Long) Wire.get(battleModeMessage.steal_tower_data.open_score, 0L)).intValue();
            aVar.f11019b = aVar2;
        }
        hVar.f11043b = aVar;
        a aVar3 = new a();
        aVar3.f11045a = ((Long) Wire.get(battleModeMessage.now, 0L)).longValue();
        hVar.f11044c = aVar3;
        return hVar;
    }
}
