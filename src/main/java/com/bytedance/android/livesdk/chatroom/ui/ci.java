package com.bytedance.android.livesdk.chatroom.ui;

import android.view.KeyEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ci implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12011a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveInputDialogFragment f12012b;

    ci(LiveInputDialogFragment liveInputDialogFragment) {
        this.f12012b = liveInputDialogFragment;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f12011a, false, 5975, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), keyEvent}, this, f12011a, false, 5975, new Class[]{View.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        LiveInputDialogFragment liveInputDialogFragment = this.f12012b;
        if (66 != i || 1 != keyEvent.getAction()) {
            return false;
        }
        liveInputDialogFragment.f11582e.performClick();
        return true;
    }
}
