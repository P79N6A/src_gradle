package com.bytedance.android.livesdk.schema;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.schema.a.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17185a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomActionHandler f17186b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f17187c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f17188d;

    h(RoomActionHandler roomActionHandler, Room room, b.a aVar) {
        this.f17186b = roomActionHandler;
        this.f17187c = room;
        this.f17188d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17185a, false, 13171, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17185a, false, 13171, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f17186b.lambda$handleEnterRoom$2$RoomActionHandler(this.f17187c, this.f17188d, dialogInterface, i);
    }
}
