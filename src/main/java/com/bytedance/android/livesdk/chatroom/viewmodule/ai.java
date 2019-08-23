package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ai implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12975a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftWidget f12976b;

    ai(GiftWidget giftWidget) {
        this.f12976b = giftWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12975a, false, 6906, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f12975a, false, 6906, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        GiftWidget giftWidget = this.f12976b;
        f.a(giftWidget.context);
        f.a(giftWidget.context);
        ((IHostApp) b.a(IHostApp.class)).a((Activity) giftWidget.context);
        dialogInterface.dismiss();
    }
}
