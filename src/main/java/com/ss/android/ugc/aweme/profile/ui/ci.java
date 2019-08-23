package com.ss.android.ugc.aweme.profile.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final /* synthetic */ class ci implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62581a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileEditFragment f62582b;

    /* renamed from: c  reason: collision with root package name */
    private final DatePicker f62583c;

    /* renamed from: d  reason: collision with root package name */
    private final SwitchCompat f62584d;

    ci(ProfileEditFragment profileEditFragment, DatePicker datePicker, SwitchCompat switchCompat) {
        this.f62582b = profileEditFragment;
        this.f62583c = datePicker;
        this.f62584d = switchCompat;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62581a, false, 68737, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62581a, false, 68737, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ProfileEditFragment profileEditFragment = this.f62582b;
        DatePicker datePicker = this.f62583c;
        SwitchCompat switchCompat = this.f62584d;
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();
        if (Calendar.getInstance().getTimeInMillis() < new GregorianCalendar(year, month - 1, dayOfMonth).getTimeInMillis()) {
            a.c((Context) profileEditFragment.getActivity(), (int) C0906R.string.p8).a();
            return;
        }
        profileEditFragment.j.setBirthday(String.format(Locale.CHINA, "%04d-%02d-%02d", new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}));
        profileEditFragment.j.setBirthdayHideLevel(switchCompat.isChecked() ? 1 : 0);
        profileEditFragment.b();
        Dialog dialog = profileEditFragment.f62140d;
        if (PatchProxy.isSupport(new Object[]{dialog}, null, cm.f62594a, true, 68745, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, cm.f62594a, true, 68745, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }
}
