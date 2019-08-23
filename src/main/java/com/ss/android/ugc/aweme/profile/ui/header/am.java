package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class am implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62860a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62861b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62862c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62863d;

    am(aa aaVar, View view, boolean z) {
        this.f62861b = aaVar;
        this.f62862c = view;
        this.f62863d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62860a, false, 69599, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62860a, false, 69599, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62861b.a(this.f62862c, this.f62863d);
    }
}
