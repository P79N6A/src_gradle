package com.ss.android.ugc.aweme.miniapp.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.miniapp.q;

public final class b extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55962a;

    /* renamed from: b  reason: collision with root package name */
    private DmtTextView f55963b;

    /* renamed from: c  reason: collision with root package name */
    private View f55964c;

    public b(@NonNull Context context) {
        super(context, C0906R.style.su);
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55962a, false, 59621, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55962a, false, 59621, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.ti) {
            dismiss();
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55962a, false, 59619, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55962a, false, 59619, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (q.a().l.a()) {
            setContentView(C0906R.layout.jo);
        } else {
            setContentView(C0906R.layout.jn);
        }
        setCanceledOnTouchOutside(false);
        if (PatchProxy.isSupport(new Object[0], this, f55962a, false, 59620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55962a, false, 59620, new Class[0], Void.TYPE);
            return;
        }
        this.f55963b = (DmtTextView) findViewById(C0906R.id.brp);
        this.f55964c = findViewById(C0906R.id.ti);
        this.f55963b.setTypeface(Typeface.defaultFromStyle(1));
        this.f55964c.setOnClickListener(this);
    }
}
