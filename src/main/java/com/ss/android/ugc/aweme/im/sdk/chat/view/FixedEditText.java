package com.ss.android.ugc.aweme.im.sdk.chat.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FixedEditText extends MentionEditText {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51018a;

    /* renamed from: f  reason: collision with root package name */
    private View.OnKeyListener f51019f;

    public static String getManufacturer() {
        if (PatchProxy.isSupport(new Object[0], null, f51018a, true, 51380, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f51018a, true, 51380, new Class[0], String.class);
        }
        if (Build.MANUFACTURER == null) {
            return "";
        }
        return Build.MANUFACTURER.trim();
    }

    public FixedEditText(Context context) {
        super(context);
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        View.OnKeyListener onKeyListener2 = onKeyListener;
        if (PatchProxy.isSupport(new Object[]{onKeyListener2}, this, f51018a, false, 51374, new Class[]{View.OnKeyListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onKeyListener2}, this, f51018a, false, 51374, new Class[]{View.OnKeyListener.class}, Void.TYPE);
            return;
        }
        this.f51019f = onKeyListener2;
        super.setOnKeyListener(onKeyListener);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (!PatchProxy.isSupport(new Object[]{callback}, this, f51018a, false, 51375, new Class[]{ActionMode.Callback.class}, ActionMode.class)) {
            return super.startActionMode(callback);
        }
        return (ActionMode) PatchProxy.accessDispatch(new Object[]{callback}, this, f51018a, false, 51375, new Class[]{ActionMode.Callback.class}, ActionMode.class);
    }

    public boolean onTextContextMenuItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f51018a, false, 51377, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f51018a, false, 51377, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        } else {
            boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
            if (onTextContextMenuItem && getText().length() <= 1024) {
                g.a((TextView) this);
            }
            return onTextContextMenuItem;
        }
    }

    public FixedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f51018a, false, 51378, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f51018a, false, 51378, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f51019f != null) {
            return this.f51019f.onKey(this, i, keyEvent);
        } else {
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        if (!PatchProxy.isSupport(new Object[]{callback, Integer.valueOf(i)}, this, f51018a, false, 51376, new Class[]{ActionMode.Callback.class, Integer.TYPE}, ActionMode.class)) {
            return super.startActionMode(callback, i);
        }
        return (ActionMode) PatchProxy.accessDispatch(new Object[]{callback, Integer.valueOf(i)}, this, f51018a, false, 51376, new Class[]{ActionMode.Callback.class, Integer.TYPE}, ActionMode.class);
    }

    public FixedEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
