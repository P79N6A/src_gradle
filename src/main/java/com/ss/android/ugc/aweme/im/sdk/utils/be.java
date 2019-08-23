package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.a.a;

public final /* synthetic */ class be implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52571a;

    /* renamed from: b  reason: collision with root package name */
    private final a f52572b;

    private be(a aVar) {
        this.f52572b = aVar;
    }

    static DialogInterface.OnDismissListener a(a aVar) {
        a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, null, f52571a, true, 53840, new Class[]{a.class}, DialogInterface.OnDismissListener.class)) {
            return new be(aVar2);
        }
        return (DialogInterface.OnDismissListener) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f52571a, true, 53840, new Class[]{a.class}, DialogInterface.OnDismissListener.class);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f52571a, false, 53841, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f52571a, false, 53841, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f52572b.b(dialogInterface2);
    }
}
