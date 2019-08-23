package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.a.a;

public final /* synthetic */ class bd implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52569a;

    /* renamed from: b  reason: collision with root package name */
    private final a f52570b;

    private bd(a aVar) {
        this.f52570b = aVar;
    }

    static DialogInterface.OnCancelListener a(a aVar) {
        a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, null, f52569a, true, 53838, new Class[]{a.class}, DialogInterface.OnCancelListener.class)) {
            return new bd(aVar2);
        }
        return (DialogInterface.OnCancelListener) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f52569a, true, 53838, new Class[]{a.class}, DialogInterface.OnCancelListener.class);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface dialogInterface2 = dialogInterface;
        if (PatchProxy.isSupport(new Object[]{dialogInterface2}, this, f52569a, false, 53839, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface2}, this, f52569a, false, 53839, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f52570b.c(dialogInterface2);
    }
}
