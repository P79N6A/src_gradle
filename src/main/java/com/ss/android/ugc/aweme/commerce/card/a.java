package com.ss.android.ugc.aweme.commerce.card;

import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36818a;

    /* renamed from: b  reason: collision with root package name */
    private final DmtTextView f36819b;

    a(DmtTextView dmtTextView) {
        this.f36819b = dmtTextView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36818a, false, 28020, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36818a, false, 28020, new Class[0], Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.f36819b;
        if (dmtTextView.getLineCount() > 1 || TextUtils.isEmpty(dmtTextView.getText().toString())) {
            dmtTextView.setVisibility(8);
        }
    }
}
