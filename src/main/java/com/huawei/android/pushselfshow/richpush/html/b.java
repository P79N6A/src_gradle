package com.huawei.android.pushselfshow.richpush.html;

import android.content.DialogInterface;
import com.huawei.android.pushagent.utils.a.h;

public class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f25336a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25337b;

    b(HtmlViewer htmlViewer, h hVar) {
        this.f25337b = htmlViewer;
        this.f25336a = hVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f25336a.a("isFirstCollect", true);
        this.f25337b.a(this.f25337b.f25260d);
    }
}
