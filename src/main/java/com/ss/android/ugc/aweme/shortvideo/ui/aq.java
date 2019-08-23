package com.ss.android.ugc.aweme.shortvideo.ui;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class aq implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70776a;

    /* renamed from: b  reason: collision with root package name */
    static final CompoundButton.OnCheckedChangeListener f70777b = new aq();

    private aq() {
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f70776a, false, 80481, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f70776a, false, 80481, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.o.b().a(Boolean.valueOf(z));
    }
}
