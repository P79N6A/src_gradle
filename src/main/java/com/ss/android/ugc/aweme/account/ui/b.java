package com.ss.android.ugc.aweme.account.ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33032a;

    /* renamed from: b  reason: collision with root package name */
    private final AccountManagerActivity f33033b;

    b(AccountManagerActivity accountManagerActivity) {
        this.f33033b = accountManagerActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33032a, false, 21018, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33032a, false, 21018, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AccountManagerActivity accountManagerActivity = this.f33033b;
        accountManagerActivity.startActivity(new Intent(accountManagerActivity, BindMobileActivity.class));
    }
}
