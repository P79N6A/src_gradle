package com.ss.android.ugc.aweme.profile.ui;

import android.os.Parcelable;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BubbleCountView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61756a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f61757b;

    public Parcelable onSaveInstanceState() {
        if (!PatchProxy.isSupport(new Object[0], this, f61756a, false, 67904, new Class[0], Parcelable.class)) {
            return super.onSaveInstanceState();
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f61756a, false, 67904, new Class[0], Parcelable.class);
    }

    public void setShouldAnimOut(boolean z) {
        this.f61757b = z;
    }
}
