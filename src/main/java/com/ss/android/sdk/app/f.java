package com.ss.android.sdk.app;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<c> f30677a;

    public f(c cVar) {
        this.f30677a = new WeakReference<>(cVar);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        c cVar = (c) this.f30677a.get();
        if (cVar != null) {
            cVar.onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        c cVar = (c) this.f30677a.get();
        if (cVar != null) {
            cVar.onDismiss(dialogInterface);
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        c cVar = (c) this.f30677a.get();
        if (cVar != null) {
            cVar.onShow(dialogInterface);
        }
    }
}
