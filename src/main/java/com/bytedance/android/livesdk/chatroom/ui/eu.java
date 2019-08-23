package com.bytedance.android.livesdk.chatroom.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class eu implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12234a;

    /* renamed from: b  reason: collision with root package name */
    private final SimpleInputDialogFragment f12235b;

    eu(SimpleInputDialogFragment simpleInputDialogFragment) {
        this.f12235b = simpleInputDialogFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f12234a, false, 6435, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return this.f12235b.a(i);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f12234a, false, 6435, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
