package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;

public final /* synthetic */ class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66514a;

    /* renamed from: b  reason: collision with root package name */
    private final a f66515b;

    s(a aVar) {
        this.f66515b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f66514a, false, 75458, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f66514a, false, 75458, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f66515b;
        if (aVar != null) {
            aVar.run(null);
        }
    }
}
