package com.ss.android.ugc.aweme.account.login.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32653a;

    /* renamed from: b  reason: collision with root package name */
    private final PhonePassLoginView f32654b;

    /* renamed from: c  reason: collision with root package name */
    private final View f32655c;

    x(PhonePassLoginView phonePassLoginView, View view) {
        this.f32654b = phonePassLoginView;
        this.f32655c = view;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f32653a, false, 20733, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f32653a, false, 20733, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhonePassLoginView phonePassLoginView = this.f32654b;
        View view2 = this.f32655c;
        if (!(view.getTag() instanceof Boolean) || !((Boolean) view.getTag()).booleanValue()) {
            if (!phonePassLoginView.f32555e) {
                phonePassLoginView.c();
            }
            if (view2.getVisibility() == 0) {
                phonePassLoginView.a(!phonePassLoginView.f32555e);
            }
            return;
        }
        view.setTag(Boolean.FALSE);
    }
}
