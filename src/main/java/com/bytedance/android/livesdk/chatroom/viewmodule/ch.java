package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public final /* synthetic */ class ch implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13075a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13076b;

    ch(LinkPKWidget linkPKWidget) {
        this.f13076b = linkPKWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13075a, false, 7155, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13075a, false, 7155, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkPKWidget linkPKWidget = this.f13076b;
        if (((LinkCrossRoomDataHolder.d) LinkCrossRoomDataHolder.a().get("data_pk_state")) == LinkCrossRoomDataHolder.d.PK) {
            ai.a((int) C0906R.string.d5z);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("selection", "accept");
        a.a().a("pk_oncemore_invited", hashMap, Room.class, new j().b("live").f("other").a("live_detail"), new g().a(linkPKWidget.f12608c.getOwner().getId()), LinkCrossRoomDataHolder.a().b());
        linkPKWidget.n.c();
        dialogInterface.dismiss();
    }
}
