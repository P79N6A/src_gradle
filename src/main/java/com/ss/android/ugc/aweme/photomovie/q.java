package com.ss.android.ugc.aweme.photomovie;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59023a;

    /* renamed from: b  reason: collision with root package name */
    static final CompoundButton.OnCheckedChangeListener f59024b = new q();

    private q() {
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f59023a, false, 64034, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f59023a, false, 64034, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a.o.b().a(Boolean.valueOf(z));
    }
}
