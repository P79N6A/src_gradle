package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class t implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13294a;

    /* renamed from: b  reason: collision with root package name */
    private final DailyRankWidget f13295b;

    t(DailyRankWidget dailyRankWidget) {
        this.f13295b = dailyRankWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13294a, false, 6695, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13294a, false, 6695, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13295b.a("https://hotsoon.snssdk.com/falcon/live_inroom/page/guard/index.html?charge=1&room_id=%s&anchor_id=%s&user_id=%s&source=%s");
        dialogInterface.dismiss();
    }
}
