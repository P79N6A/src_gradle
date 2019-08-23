package com.huawei.android.pushselfshow.richpush.html;

import android.app.Activity;
import android.content.DialogInterface;
import com.huawei.android.pushagent.utils.a.e;

public class i implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f25345a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25346b;

    i(HtmlViewer htmlViewer, Activity activity) {
        this.f25346b = htmlViewer;
        this.f25345a = activity;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e.a("PushSelfShowLog", "DialogInterface onDismiss,mClickDialogOkBtn:" + this.f25346b.o);
        if (this.f25346b.o) {
            this.f25346b.d(this.f25345a);
            return;
        }
        this.f25346b.l.setEnabled(true);
        boolean unused = this.f25346b.r = false;
    }
}
