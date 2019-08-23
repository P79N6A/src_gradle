package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.bm;

public final /* synthetic */ class y implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62941a;

    /* renamed from: b  reason: collision with root package name */
    private final bm f62942b;

    y(bm bmVar) {
        this.f62942b = bmVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62941a, false, 69482, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62941a, false, 69482, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62942b.n(true);
        r.a(i.a().getContext(), "position", "allow_off", (String) null, 0);
    }
}
