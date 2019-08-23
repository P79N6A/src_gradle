package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.bytedance.android.livesdk.popup.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class di implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13160a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget.a f13161b;

    /* renamed from: c  reason: collision with root package name */
    private final d f13162c;

    /* renamed from: d  reason: collision with root package name */
    private final View f13163d;

    di(LiveShareWidget.a aVar, d dVar, View view) {
        this.f13161b = aVar;
        this.f13162c = dVar;
        this.f13163d = view;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13160a, false, 7262, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13160a, false, 7262, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveShareWidget.a aVar = this.f13161b;
        d dVar = this.f13162c;
        View view2 = this.f13163d;
        dVar.dismiss();
        aVar.onClick(view2);
    }
}
