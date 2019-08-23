package com.ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76930a;

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f76931d = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public boolean f76932b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f76933c;

    public boolean isChecked() {
        return this.f76933c;
    }

    public View getTagView() {
        if (!PatchProxy.isSupport(new Object[0], this, f76930a, false, 90144, new Class[0], View.class)) {
            return getChildAt(0);
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f76930a, false, 90144, new Class[0], View.class);
    }

    public void toggle() {
        if (PatchProxy.isSupport(new Object[0], this, f76930a, false, 90147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76930a, false, 90147, new Class[0], Void.TYPE);
            return;
        }
        setChecked(!this.f76933c);
    }

    public void setAllowSelect(boolean z) {
        this.f76932b = z;
    }

    public c(Context context) {
        super(context);
    }

    public int[] onCreateDrawableState(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76930a, false, 90145, new Class[]{Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76930a, false, 90145, new Class[]{Integer.TYPE}, int[].class);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f76931d);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76930a, false, 90146, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76930a, false, 90146, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f76933c != z) {
            this.f76933c = z;
            refreshDrawableState();
        }
    }
}
