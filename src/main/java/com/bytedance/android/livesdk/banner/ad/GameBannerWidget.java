package com.bytedance.android.livesdk.banner.ad;

import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.livesdk.banner.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public class GameBannerWidget extends LiveRecyclableWidget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9113a;

    /* renamed from: b  reason: collision with root package name */
    b f9114b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9115c;

    /* renamed from: d  reason: collision with root package name */
    private Room f9116d;

    public void onInit(Object... objArr) {
    }

    public void onUnload() {
        this.f9114b = null;
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f9113a, false, 3203, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f9113a, false, 3203, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f9116d = (Room) this.dataCenter.get("data_room");
        this.f9115c = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        a aVar = (a) this.dataCenter.get("data_in_room_banner_manager", null);
        if (aVar != null) {
            ((ab) aVar.a(Long.valueOf(this.f9116d.getId())).as(autoDispose())).a((Consumer<? super T>) new d<Object>(this));
        }
    }
}
