package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class el implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12164a;

    /* renamed from: b  reason: collision with root package name */
    private final PortraitInteractionFragment f12165b;

    /* renamed from: c  reason: collision with root package name */
    private final View f12166c;

    /* renamed from: d  reason: collision with root package name */
    private final View f12167d;

    public el(PortraitInteractionFragment portraitInteractionFragment, View view, View view2) {
        this.f12165b = portraitInteractionFragment;
        this.f12166c = view;
        this.f12167d = view2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12164a, false, 6327, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12164a, false, 6327, new Class[]{View.class}, Void.TYPE);
            return;
        }
        PortraitInteractionFragment portraitInteractionFragment = this.f12165b;
        View view2 = this.f12166c;
        View view3 = this.f12167d;
        portraitInteractionFragment.T.setVisibility(8);
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (view3 != null) {
            view3.setVisibility(8);
        }
        portraitInteractionFragment.T.setClickable(false);
    }
}
