package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14267a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseLiveViewHolder f14268b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f14269c;

    /* renamed from: d  reason: collision with root package name */
    private final PopupWindow f14270d;

    g(BaseLiveViewHolder baseLiveViewHolder, Room room, PopupWindow popupWindow) {
        this.f14268b = baseLiveViewHolder;
        this.f14269c = room;
        this.f14270d = popupWindow;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14267a, false, 8725, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14267a, false, 8725, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f14268b.a(this.f14269c, this.f14270d);
    }
}
