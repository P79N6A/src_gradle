package com.ss.android.ugc.aweme.account.activity;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31667a;

    /* renamed from: b  reason: collision with root package name */
    private final FillProfileActivity f31668b;

    e(FillProfileActivity fillProfileActivity) {
        this.f31668b = fillProfileActivity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f31667a, false, 19564, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f31667a, false, 19564, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        FillProfileActivity fillProfileActivity = this.f31668b;
        fillProfileActivity.a(fillProfileActivity.f31609b.i(fillProfileActivity.f31609b.getCurrentNumber()));
    }
}
