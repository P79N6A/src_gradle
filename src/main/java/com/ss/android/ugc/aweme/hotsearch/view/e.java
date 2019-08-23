package com.ss.android.ugc.aweme.hotsearch.view;

import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.datepicker.NonRecurrNumberPickerForString;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49885a;

    /* renamed from: b  reason: collision with root package name */
    private final d f49886b;

    e(d dVar) {
        this.f49886b = dVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49885a, false, 49850, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49885a, false, 49850, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d dVar = this.f49886b;
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(dVar.f49876b);
        bottomSheetDialog.setContentView((int) C0906R.layout.k8);
        NonRecurrNumberPickerForString nonRecurrNumberPickerForString = (NonRecurrNumberPickerForString) bottomSheetDialog.findViewById(C0906R.id.by6);
        if (nonRecurrNumberPickerForString != null) {
            nonRecurrNumberPickerForString.setData(dVar.f49878d);
            nonRecurrNumberPickerForString.d(dVar.i);
            bottomSheetDialog.setOnDismissListener(new g(dVar, nonRecurrNumberPickerForString));
            bottomSheetDialog.show();
        }
    }
}
