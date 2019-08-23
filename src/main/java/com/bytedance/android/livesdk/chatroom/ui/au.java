package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class au implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11890a;

    /* renamed from: b  reason: collision with root package name */
    private final at f11891b;

    au(at atVar) {
        this.f11891b = atVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11890a, false, 5722, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11890a, false, 5722, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        at atVar = this.f11891b;
        dialogInterface.dismiss();
        atVar.f();
        if (PatchProxy.isSupport(new Object[0], atVar, at.f11868a, false, 5719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], atVar, at.f11868a, false, 5719, new Class[0], Void.TYPE);
            return;
        }
        a.a().a("first_recharge_popup_click", Room.class, new j().a("live_detail").c("popup").b("live").f("click"));
    }
}
