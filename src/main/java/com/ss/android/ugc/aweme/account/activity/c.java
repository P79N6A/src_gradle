package com.ss.android.ugc.aweme.account.activity;

import android.content.DialogInterface;
import android.support.v7.widget.SwitchCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import java.util.GregorianCalendar;

public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31660a;

    /* renamed from: b  reason: collision with root package name */
    private final FillProfileActivity f31661b;

    /* renamed from: c  reason: collision with root package name */
    private final SwitchCompat f31662c;

    /* renamed from: d  reason: collision with root package name */
    private final DatePicker f31663d;

    /* renamed from: e  reason: collision with root package name */
    private final GregorianCalendar f31664e;

    c(FillProfileActivity fillProfileActivity, SwitchCompat switchCompat, DatePicker datePicker, GregorianCalendar gregorianCalendar) {
        this.f31661b = fillProfileActivity;
        this.f31662c = switchCompat;
        this.f31663d = datePicker;
        this.f31664e = gregorianCalendar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f31660a, false, 19562, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f31660a, false, 19562, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        FillProfileActivity fillProfileActivity = this.f31661b;
        SwitchCompat switchCompat = this.f31662c;
        DatePicker datePicker = this.f31663d;
        GregorianCalendar gregorianCalendar = this.f31664e;
        if (fillProfileActivity.k.getBirthdayHideLevel() == 1) {
            z = true;
        }
        switchCompat.setChecked(z);
        datePicker.a(gregorianCalendar.getTime());
        datePicker.setEnabled(!z);
    }
}
