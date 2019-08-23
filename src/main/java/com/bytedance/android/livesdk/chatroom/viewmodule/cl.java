package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.w.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cl implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13083a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkPKWidget f13084b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkCrossRoomDataHolder.d f13085c;

    cl(LinkPKWidget linkPKWidget, LinkCrossRoomDataHolder.d dVar) {
        this.f13084b = linkPKWidget;
        this.f13085c = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13083a, false, 7159, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13083a, false, 7159, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinkPKWidget linkPKWidget = this.f13084b;
        LinkCrossRoomDataHolder.d dVar = this.f13085c;
        if (linkPKWidget.isViewValid()) {
            if (dVar == LinkCrossRoomDataHolder.d.PK) {
                c<Integer> cVar = b.aw;
                cVar.a(Integer.valueOf(((Integer) cVar.a()).intValue() - 1));
                b.k.a(ah.b(System.currentTimeMillis()));
                if (linkPKWidget.n != null) {
                    linkPKWidget.n.a(true);
                }
            } else {
                linkPKWidget.f12607b.lambda$put$1$DataCenter("data_pk_result", LinkCrossRoomDataHolder.c.RIGHT_WON).lambda$put$1$DataCenter("cmd_stop_interact", Boolean.FALSE);
            }
            dialogInterface.dismiss();
        }
    }
}
