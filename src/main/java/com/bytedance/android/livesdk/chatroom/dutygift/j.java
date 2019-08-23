package com.bytedance.android.livesdk.chatroom.dutygift;

import android.text.TextUtils;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9998a;

    /* renamed from: b  reason: collision with root package name */
    private final DutyGiftControlWidget f9999b;

    j(DutyGiftControlWidget dutyGiftControlWidget) {
        this.f9999b = dutyGiftControlWidget;
    }

    public final void accept(Object obj) {
        m mVar;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9998a, false, 4164, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9998a, false, 4164, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        DutyGiftControlWidget dutyGiftControlWidget = this.f9999b;
        dutyGiftControlWidget.g = (String) obj;
        if (PatchProxy.isSupport(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4136, new Class[0], Void.TYPE);
            return;
        }
        a.c("DutyGiftControlWidget", "startGame mSticker: " + dutyGiftControlWidget.f9960c + ", mDutyGiftInfo: " + dutyGiftControlWidget.f9962e + ", mGiftPath: " + dutyGiftControlWidget.g);
        if (!(dutyGiftControlWidget.f9960c == null || dutyGiftControlWidget.f9962e == null || TextUtils.isEmpty(dutyGiftControlWidget.g))) {
            if (dutyGiftControlWidget.f9961d != null) {
                dutyGiftControlWidget.f9961d.a("gift_icon", dutyGiftControlWidget.g, false);
                n nVar = dutyGiftControlWidget.f9961d;
                if (PatchProxy.isSupport(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4143, new Class[0], m.class)) {
                    mVar = (m) PatchProxy.accessDispatch(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4143, new Class[0], m.class);
                } else if (dutyGiftControlWidget.f9962e != null) {
                    mVar = new m();
                    mVar.f10005a = 4097;
                    mVar.f10006b = ((Integer) b.aU.a()).intValue();
                    mVar.f10007c = (int) dutyGiftControlWidget.f9962e.getStageCount();
                } else {
                    mVar = null;
                }
                nVar.a(mVar);
            }
            dutyGiftControlWidget.a(dutyGiftControlWidget.a((int) dutyGiftControlWidget.f9962e.getTargetScore(), 0));
            if (PatchProxy.isSupport(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4159, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dutyGiftControlWidget, DutyGiftControlWidget.f9958a, false, 4159, new Class[0], Void.TYPE);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(dutyGiftControlWidget.f9963f.getId()));
                hashMap.put("anchor_id", String.valueOf(dutyGiftControlWidget.f9963f.getOwner().getId()));
                if (dutyGiftControlWidget.f9962e != null) {
                    hashMap.put("effectgame_id", String.valueOf(dutyGiftControlWidget.f9962e.getDutyId()));
                    hashMap.put("effectgame_gift_id", String.valueOf(dutyGiftControlWidget.f9962e.getGiftId()));
                }
                com.bytedance.android.livesdk.j.a.a().a("effect_game_start", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_detail"));
            }
            dutyGiftControlWidget.h = System.currentTimeMillis();
        }
    }
}
