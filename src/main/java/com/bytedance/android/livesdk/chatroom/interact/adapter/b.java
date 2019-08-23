package com.bytedance.android.livesdk.chatroom.interact.adapter;

import android.view.View;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioGuestAdapter;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10330a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkInRoomAudioGuestAdapter.EmptyStubViewHolder f10331b;

    b(LinkInRoomAudioGuestAdapter.EmptyStubViewHolder emptyStubViewHolder) {
        this.f10331b = emptyStubViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10330a, false, 4461, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10330a, false, 4461, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LinkInRoomAudioGuestAdapter.EmptyStubViewHolder emptyStubViewHolder = this.f10331b;
        if (LinkInRoomAudioGuestAdapter.this.f10289c == null || LinkInRoomAudioGuestAdapter.this.f10289c.size() == 0) {
            LinkInRoomAudioGuestAdapter.this.f10290d.b(emptyStubViewHolder.f10299c);
            return;
        }
        long b2 = TTLiveSDKContext.getHostService().k().b();
        Iterator<j> it2 = LinkInRoomAudioGuestAdapter.this.f10289c.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (b2 == it2.next().f11052e.getId()) {
                    break;
                }
            } else {
                LinkInRoomAudioGuestAdapter.this.f10290d.b(emptyStubViewHolder.f10299c);
                break;
            }
        }
    }
}
