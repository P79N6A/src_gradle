package com.ss.android.ugc.aweme.profile.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ah implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62459a;

    /* renamed from: b  reason: collision with root package name */
    static final TextView.OnEditorActionListener f62460b = new ah();

    private ah() {
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (!PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f62459a, false, 68145, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return keyEvent != null && keyEvent.getKeyCode() == 66;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f62459a, false, 68145, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
    }
}
