package com.ss.android.ugc.aweme.account.activity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;

public final /* synthetic */ class d implements NumberPicker.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31665a;

    /* renamed from: b  reason: collision with root package name */
    private final FillProfileActivity f31666b;

    d(FillProfileActivity fillProfileActivity) {
        this.f31666b = fillProfileActivity;
    }

    public final void a(NumberPicker numberPicker, int i, int i2) {
        NumberPicker numberPicker2 = numberPicker;
        if (PatchProxy.isSupport(new Object[]{numberPicker2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f31665a, false, 19563, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{numberPicker2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f31665a, false, 19563, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f31666b.a(numberPicker2.i(i2));
    }
}
