package com.bytedance.android.livesdk.chatroom.interact.viewholder;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11010a;

    /* renamed from: b  reason: collision with root package name */
    private final PKUserViewHolder f11011b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f11012c;

    a(PKUserViewHolder pKUserViewHolder, Room room) {
        this.f11011b = pKUserViewHolder;
        this.f11012c = room;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11010a, false, 5022, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11010a, false, 5022, new Class[]{View.class}, Void.TYPE);
            return;
        }
        PKUserViewHolder pKUserViewHolder = this.f11011b;
        pKUserViewHolder.f11005b.a(this.f11012c, pKUserViewHolder.f11006c);
    }
}
