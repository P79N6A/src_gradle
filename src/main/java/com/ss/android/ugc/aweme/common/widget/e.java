package com.ss.android.ugc.aweme.common.widget;

import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40557a;

    /* renamed from: b  reason: collision with root package name */
    private final MainTabStrip f40558b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f40559c;

    e(MainTabStrip mainTabStrip, TextView textView) {
        this.f40558b = mainTabStrip;
        this.f40559c = textView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40557a, false, 33693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40557a, false, 33693, new Class[0], Void.TYPE);
            return;
        }
        MainTabStrip mainTabStrip = this.f40558b;
        TextView textView = this.f40559c;
        if (!TextUtils.isEmpty(mainTabStrip.g)) {
            textView.setText(mainTabStrip.g);
            textView.requestFocus();
        }
    }
}
