package com.ss.android.ugc.aweme.splash;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71605a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f71606b;

    j(Context context) {
        this.f71606b = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71605a, false, 81852, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2, Integer.valueOf(i)}, this, f71605a, false, 81852, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ToolUtils.installShortcut(this.f71606b, this.f71606b.getPackageName());
    }
}
