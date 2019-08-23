package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.presenter.n;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public final /* synthetic */ class aw implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11894a;

    /* renamed from: b  reason: collision with root package name */
    private final at f11895b;

    aw(at atVar) {
        this.f11895b = atVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11894a, false, 5724, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11894a, false, 5724, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        at atVar = this.f11895b;
        n nVar = atVar.f11872e;
        if (PatchProxy.isSupport(new Object[0], nVar, n.f11374a, false, 5180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], nVar, n.f11374a, false, 5180, new Class[0], Void.TYPE);
        } else {
            nVar.f11377d = false;
            b.L.a(Long.valueOf(nVar.f11376c.f15105d));
        }
        dialogInterface.dismiss();
        atVar.e();
        HashMap hashMap = new HashMap();
        hashMap.put("button_type", "send");
        a.a().a("shortcut_popup_click", hashMap, Room.class, j.class);
    }
}
