package com.bytedance.android.livesdk.schema;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.schema.a.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17191a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomActionHandler f17192b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f17193c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f17194d;

    j(RoomActionHandler roomActionHandler, Room room, b.a aVar) {
        this.f17192b = roomActionHandler;
        this.f17193c = room;
        this.f17194d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17191a, false, 13173, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17191a, false, 13173, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f17192b.lambda$handleEnterRoom$4$RoomActionHandler(this.f17193c, this.f17194d, dialogInterface, i);
    }
}
