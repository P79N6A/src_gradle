package com.ss.android.ugc.aweme.mobile;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;

public final /* synthetic */ class b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56090a;

    /* renamed from: b  reason: collision with root package name */
    private final DatePicker f56091b;

    b(DatePicker datePicker) {
        this.f56091b = datePicker;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56090a, false, 59686, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f56090a, false, 59686, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f56091b.setEnabled(!z);
    }
}
