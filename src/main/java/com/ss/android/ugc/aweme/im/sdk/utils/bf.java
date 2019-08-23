package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.a.a;

public final /* synthetic */ class bf implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52573a;

    /* renamed from: b  reason: collision with root package name */
    private final a f52574b;

    private bf(a aVar) {
        this.f52574b = aVar;
    }

    static DialogInterface.OnShowListener a(a aVar) {
        a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, null, f52573a, true, 53842, new Class[]{a.class}, DialogInterface.OnShowListener.class)) {
            return new bf(aVar2);
        }
        return (DialogInterface.OnShowListener) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f52573a, true, 53842, new Class[]{a.class}, DialogInterface.OnShowListener.class);
    }

    public final void onShow(DialogInterface dialogInterface) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f52573a, false, 53843, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f52573a, false, 53843, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f52574b.a(dialogInterface2);
    }
}
