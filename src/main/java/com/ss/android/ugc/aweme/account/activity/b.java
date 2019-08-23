package com.ss.android.ugc.aweme.account.activity;

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

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31656a;

    /* renamed from: b  reason: collision with root package name */
    private final FillProfileActivity f31657b;

    /* renamed from: c  reason: collision with root package name */
    private final DatePicker f31658c;

    /* renamed from: d  reason: collision with root package name */
    private final SwitchCompat f31659d;

    b(FillProfileActivity fillProfileActivity, DatePicker datePicker, SwitchCompat switchCompat) {
        this.f31657b = fillProfileActivity;
        this.f31658c = datePicker;
        this.f31659d = switchCompat;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f31656a, false, 19561, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f31656a, false, 19561, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FillProfileActivity fillProfileActivity = this.f31657b;
        DatePicker datePicker = this.f31658c;
        SwitchCompat switchCompat = this.f31659d;
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();
        if (Calendar.getInstance().getTimeInMillis() < new GregorianCalendar(year, month - 1, dayOfMonth).getTimeInMillis()) {
            a.c((Context) fillProfileActivity, (int) C0906R.string.p8).a();
            return;
        }
        fillProfileActivity.j.f61673c = String.format(Locale.CHINA, "%04d-%02d-%02d", new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)});
        fillProfileActivity.j.f61674d = switchCompat.isChecked() ? 1 : 0;
        fillProfileActivity.a(fillProfileActivity.j);
        Dialog dialog = fillProfileActivity.h;
        if (PatchProxy.isSupport(new Object[]{dialog}, null, h.f31673a, true, 19574, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, h.f31673a, true, 19574, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }
}
