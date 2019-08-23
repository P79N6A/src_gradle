package com.ss.android.ugc.aweme.account.activity;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;

public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31654a;

    /* renamed from: b  reason: collision with root package name */
    private final DatePicker f31655b;

    a(DatePicker datePicker) {
        this.f31655b = datePicker;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f31654a, false, 19560, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f31654a, false, 19560, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f31655b.setEnabled(!z);
    }
}
