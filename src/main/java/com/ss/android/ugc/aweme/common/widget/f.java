package com.ss.android.ugc.aweme.common.widget;

import android.text.TextUtils;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.MainTabStrip;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40560a;

    /* renamed from: b  reason: collision with root package name */
    private final MainTabStrip.AnonymousClass6 f40561b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f40562c;

    f(MainTabStrip.AnonymousClass6 r1, TextView textView) {
        this.f40561b = r1;
        this.f40562c = textView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f40560a, false, 33701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40560a, false, 33701, new Class[0], Void.TYPE);
            return;
        }
        MainTabStrip.AnonymousClass6 r0 = this.f40561b;
        TextView textView = this.f40562c;
        if (!TextUtils.isEmpty(MainTabStrip.this.g)) {
            textView.setText(MainTabStrip.this.g);
            textView.requestFocus();
        }
    }
}
