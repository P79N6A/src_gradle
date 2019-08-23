package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.c.fl;
import com.bytedance.android.livesdk.chatroom.interact.c.fx;
import com.bytedance.android.livesdk.chatroom.interact.c.fy;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public final /* synthetic */ class ci implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13077a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13078b;

    ci(LinkPKWidget linkPKWidget) {
        this.f13078b = linkPKWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13077a, false, 7156, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13077a, false, 7156, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkPKWidget linkPKWidget = this.f13078b;
        HashMap hashMap = new HashMap();
        hashMap.put("selection", "reject");
        a.a().a("pk_oncemore_invited", hashMap, Room.class, new j().b("live").f("other").a("live_detail"), new g().a(linkPKWidget.f12608c.getOwner().getId()).b(linkPKWidget.f12607b.f9032f), LinkCrossRoomDataHolder.a().b());
        if (((LinkCrossRoomDataHolder.d) LinkCrossRoomDataHolder.a().get("data_pk_state")) == LinkCrossRoomDataHolder.d.PK) {
            ai.a((int) C0906R.string.d5z);
        }
        fl flVar = linkPKWidget.n;
        if (PatchProxy.isSupport(new Object[0], flVar, fl.f10687a, false, 4947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], flVar, fl.f10687a, false, 4947, new Class[0], Void.TYPE);
        } else if (flVar.b() != null) {
            ((ab) com.bytedance.android.livesdk.v.j.q().d().b().battleReject(flVar.f10690d.f9030d).as(flVar.p())).a(new fx(flVar), new fy(flVar));
        }
        dialogInterface.dismiss();
    }
}
