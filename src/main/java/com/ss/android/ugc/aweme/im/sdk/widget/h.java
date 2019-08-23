package com.ss.android.ugc.aweme.im.sdk.widget;

import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.framework.e.b;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52855a;

    /* renamed from: b  reason: collision with root package name */
    private final ImShareDialog f52856b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f52857c;

    h(ImShareDialog imShareDialog, TextView textView) {
        this.f52856b = imShareDialog;
        this.f52857c = textView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f52855a, false, 54108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52855a, false, 54108, new Class[0], Void.TYPE);
            return;
        }
        ImShareDialog imShareDialog = this.f52856b;
        TextView textView = this.f52857c;
        if (textView.getWidth() > b.a(imShareDialog.getContext(), 90.0f)) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = b.a(GlobalContext.getContext(), 90.0f);
            textView.setLayoutParams(layoutParams);
        }
    }
}
