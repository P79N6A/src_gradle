package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import android.support.v7.widget.SwitchCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class cj implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62585a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62586b;

    /* renamed from: c  reason: collision with root package name */
    private final User f62587c;

    /* renamed from: d  reason: collision with root package name */
    private final SwitchCompat f62588d;

    /* renamed from: e  reason: collision with root package name */
    private final DatePicker f62589e;

    cj(ProfileEditFragment profileEditFragment, User user, SwitchCompat switchCompat, DatePicker datePicker) {
        this.f62586b = profileEditFragment;
        this.f62587c = user;
        this.f62588d = switchCompat;
        this.f62589e = datePicker;
    }

    public final void onShow(DialogInterface dialogInterface) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f62585a, false, 68738, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f62585a, false, 68738, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        ProfileEditFragment profileEditFragment = this.f62586b;
        User user = this.f62587c;
        SwitchCompat switchCompat = this.f62588d;
        DatePicker datePicker = this.f62589e;
        if (user.getBirthdayHideLevel() == 1) {
            z = true;
        }
        switchCompat.setChecked(z);
        datePicker.a(profileEditFragment.f62139c.getTime());
        datePicker.setEnabled(!z);
    }
}
