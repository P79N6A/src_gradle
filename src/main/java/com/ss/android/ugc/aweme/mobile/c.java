package com.ss.android.ugc.aweme.mobile;

import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56092a;

    /* renamed from: b  reason: collision with root package name */
    private final EditProfileActivityV2 f56093b;

    /* renamed from: c  reason: collision with root package name */
    private final DatePicker f56094c;

    /* renamed from: d  reason: collision with root package name */
    private final SwitchCompat f56095d;

    c(EditProfileActivityV2 editProfileActivityV2, DatePicker datePicker, SwitchCompat switchCompat) {
        this.f56093b = editProfileActivityV2;
        this.f56094c = datePicker;
        this.f56095d = switchCompat;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f56092a, false, 59687, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56092a, false, 59687, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        EditProfileActivityV2 editProfileActivityV2 = this.f56093b;
        DatePicker datePicker = this.f56094c;
        SwitchCompat switchCompat = this.f56095d;
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();
        int i = month - 1;
        if (Calendar.getInstance().getTimeInMillis() < new GregorianCalendar(year, i, dayOfMonth).getTimeInMillis()) {
            a.c((Context) editProfileActivityV2, (int) C0906R.string.p8).a();
            return;
        }
        editProfileActivityV2.f56045f = switchCompat.isChecked() ? 1 : 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59658, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59658, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(year, i, dayOfMonth);
            if (Calendar.getInstance().getTimeInMillis() >= gregorianCalendar.getTimeInMillis()) {
                editProfileActivityV2.l = gregorianCalendar;
                String str = year + "年" + month + "月" + dayOfMonth + "日";
                editProfileActivityV2.n = String.format(Locale.US, "%d-%02d-%02d", new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)});
                TextView textView = editProfileActivityV2.txtBirthday;
                if (editProfileActivityV2.f56045f == 1) {
                    str = editProfileActivityV2.getString(C0906R.string.n7);
                }
                textView.setText(str);
                editProfileActivityV2.txtBirthday.setTextColor(editProfileActivityV2.getResources().getColor(C0906R.color.zt));
            }
        }
        Dialog dialog = editProfileActivityV2.m;
        if (PatchProxy.isSupport(new Object[]{dialog}, null, e.f56100a, true, 59694, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, e.f56100a, true, 59694, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        editProfileActivityV2.a();
    }
}
