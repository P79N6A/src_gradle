package com.ss.android.ugc.aweme.account.activity;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31671a;

    /* renamed from: b  reason: collision with root package name */
    private final FillProfileActivity f31672b;

    g(FillProfileActivity fillProfileActivity) {
        this.f31672b = fillProfileActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31671a, false, 19566, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31671a, false, 19566, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FillProfileActivity fillProfileActivity = this.f31672b;
        fillProfileActivity.showProgressDialog(fillProfileActivity.getString(C0906R.string.b73));
        d.a().queryUser(fillProfileActivity.l);
        fillProfileActivity.g.dismiss();
    }
}
