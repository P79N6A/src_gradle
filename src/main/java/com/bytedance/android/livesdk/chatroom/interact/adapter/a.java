package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10328a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomAudioGuestAdapter.AudioGuestViewHolder f10329b;

    a(LinkInRoomAudioGuestAdapter.AudioGuestViewHolder audioGuestViewHolder) {
        this.f10329b = audioGuestViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10328a, false, 4459, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10328a, false, 4459, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LinkInRoomAudioGuestAdapter.AudioGuestViewHolder audioGuestViewHolder = this.f10329b;
        LinkInRoomAudioGuestAdapter.this.f10290d.a(audioGuestViewHolder.i);
    }
}
