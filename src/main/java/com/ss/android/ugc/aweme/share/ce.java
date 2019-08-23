package com.ss.android.ugc.aweme.share;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ce implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64928a;

    /* renamed from: b  reason: collision with root package name */
    private final ShareDialog f64929b;

    ce(ShareDialog shareDialog) {
        this.f64929b = shareDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64928a, false, 73303, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64928a, false, 73303, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ShareDialog shareDialog = this.f64929b;
        shareDialog.mActionHandler.onAction(shareDialog.mShareStruct, "copy");
    }
}
