package com.ss.android.ugc.aweme.hotsearch.view;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.NonRecurrNumberPickerForString;

public final /* synthetic */ class g implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49889a;

    /* renamed from: b  reason: collision with root package name */
    private final d f49890b;

    /* renamed from: c  reason: collision with root package name */
    private final NonRecurrNumberPickerForString f49891c;

    g(d dVar, NonRecurrNumberPickerForString nonRecurrNumberPickerForString) {
        this.f49890b = dVar;
        this.f49891c = nonRecurrNumberPickerForString;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f49889a, false, 49852, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f49889a, false, 49852, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        d dVar = this.f49890b;
        dVar.c(this.f49891c.getCurrentNumber());
        if (dVar.f49877c != null) {
            dVar.f49877c.b(dVar.i);
        }
    }
}
