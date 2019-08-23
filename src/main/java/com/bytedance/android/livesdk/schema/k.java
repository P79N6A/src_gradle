package com.bytedance.android.livesdk.schema;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.schema.a.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17195a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomActionHandler f17196b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f17197c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f17198d;

    k(RoomActionHandler roomActionHandler, Room room, b.a aVar) {
        this.f17196b = roomActionHandler;
        this.f17197c = room;
        this.f17198d = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17195a, false, 13174, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17195a, false, 13174, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f17196b.lambda$handleEnterRoom$5$RoomActionHandler(this.f17197c, this.f17198d, dialogInterface, i);
    }
}
