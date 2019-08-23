package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.proto.InRoomBannerRedPoint;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.wire.Message;
import com.squareup.wire.Wire;

public final class b extends c<InRoomBannerRedPoint> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16533a;

    /* renamed from: b  reason: collision with root package name */
    private int f16534b;

    /* renamed from: c  reason: collision with root package name */
    private long f16535c;

    /* renamed from: d  reason: collision with root package name */
    private int f16536d;

    public b() {
        this.type = a.BANNER_RED_POINT;
    }

    public final /* synthetic */ c wrap(Message message) {
        InRoomBannerRedPoint inRoomBannerRedPoint = (InRoomBannerRedPoint) message;
        if (PatchProxy.isSupport(new Object[]{inRoomBannerRedPoint}, this, f16533a, false, 11020, new Class[]{InRoomBannerRedPoint.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{inRoomBannerRedPoint}, this, f16533a, false, 11020, new Class[]{InRoomBannerRedPoint.class}, c.class);
        }
        b bVar = new b();
        bVar.baseMessage = com.bytedance.android.livesdk.message.a.a.a(inRoomBannerRedPoint.common);
        bVar.f16535c = ((Long) Wire.get(inRoomBannerRedPoint.banner_id, 0L)).longValue();
        bVar.f16534b = (int) ((Long) Wire.get(inRoomBannerRedPoint.count, 0L)).longValue();
        bVar.f16536d = (int) ((Long) Wire.get(inRoomBannerRedPoint.show_type, -1L)).longValue();
        return bVar;
    }
}
