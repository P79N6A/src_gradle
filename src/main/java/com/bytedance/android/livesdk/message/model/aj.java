package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.chatroom.model.a.a;
import com.bytedance.android.livesdk.chatroom.model.a.c;
import com.bytedance.android.livesdk.chatroom.model.a.d;
import com.bytedance.android.livesdk.message.proto.LinkMicBattle;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public class aj extends c<LinkMicBattle> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16454a;
    @SerializedName("battle_settings")

    /* renamed from: b  reason: collision with root package name */
    public c f16455b;
    @SerializedName("battle_mode")

    /* renamed from: c  reason: collision with root package name */
    public a f16456c;
    @SerializedName("battle_task")

    /* renamed from: d  reason: collision with root package name */
    public d f16457d;

    public aj() {
        this.type = com.bytedance.android.livesdkapi.depend.f.a.LINK_MIC_BATTLE;
    }

    public /* synthetic */ c wrap(Message message) {
        LinkMicBattle linkMicBattle = (LinkMicBattle) message;
        if (PatchProxy.isSupport(new Object[]{linkMicBattle}, this, f16454a, false, 11060, new Class[]{LinkMicBattle.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{linkMicBattle}, this, f16454a, false, 11060, new Class[]{LinkMicBattle.class}, c.class);
        }
        aj ajVar = new aj();
        ajVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(linkMicBattle.common);
        if (linkMicBattle.battle_settings != null) {
            c cVar = new c();
            cVar.f11032e = ((Long) Wire.get(linkMicBattle.battle_settings.battle_id, 0L)).longValue();
            cVar.f11028a = ((Long) Wire.get(linkMicBattle.battle_settings.channel_id, 0L)).longValue();
            cVar.f11029b = ((Long) Wire.get(linkMicBattle.battle_settings.duration, 0L)).intValue();
            cVar.f11031d = ((Long) Wire.get(linkMicBattle.battle_settings.start_time_ms, 0L)).longValue();
            cVar.f11030c = linkMicBattle.battle_settings.theme;
            cVar.f11033f = ((Long) Wire.get(linkMicBattle.battle_settings.match_type, 0L)).longValue();
            ajVar.f16455b = cVar;
        }
        if (linkMicBattle.battle_mode != null) {
            a aVar = new a();
            aVar.f11018a = ((Integer) Wire.get(linkMicBattle.battle_mode.mode, 0)).intValue();
            if (linkMicBattle.battle_mode.steal_tower_data != null) {
                a.C0090a aVar2 = new a.C0090a();
                aVar2.i = ((Long) Wire.get(linkMicBattle.battle_mode.steal_tower_data.trigger_time, 0L)).intValue();
                aVar.f11019b = aVar2;
            }
            ajVar.f16456c = aVar;
        }
        if (linkMicBattle.battle_task != null) {
            d dVar = new d();
            dVar.f11034a = ((Boolean) Wire.get(linkMicBattle.battle_task.enable_task, Boolean.FALSE)).booleanValue();
            ajVar.f16457d = dVar;
        }
        return ajVar;
    }
}
