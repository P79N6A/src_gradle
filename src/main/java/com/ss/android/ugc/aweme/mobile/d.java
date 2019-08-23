package com.ss.android.ugc.aweme.mobile;

import android.content.DialogInterface;
import android.support.v7.widget.SwitchCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;

public final /* synthetic */ class d implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56096a;

    /* renamed from: b  reason: collision with root package name */
    private final EditProfileActivityV2 f56097b;

    /* renamed from: c  reason: collision with root package name */
    private final SwitchCompat f56098c;

    /* renamed from: d  reason: collision with root package name */
    private final DatePicker f56099d;

    d(EditProfileActivityV2 editProfileActivityV2, SwitchCompat switchCompat, DatePicker datePicker) {
        this.f56097b = editProfileActivityV2;
        this.f56098c = switchCompat;
        this.f56099d = datePicker;
    }

    public final void onShow(DialogInterface dialogInterface) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f56096a, false, 59688, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f56096a, false, 59688, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        EditProfileActivityV2 editProfileActivityV2 = this.f56097b;
        SwitchCompat switchCompat = this.f56098c;
        DatePicker datePicker = this.f56099d;
        if (editProfileActivityV2.f56045f == 1) {
            z = true;
        }
        switchCompat.setChecked(z);
        datePicker.a(editProfileActivityV2.l.getTime());
        datePicker.setEnabled(!z);
    }
}
