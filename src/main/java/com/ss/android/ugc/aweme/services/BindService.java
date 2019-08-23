package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.fragment.LiveBindPhoneFragment;
import com.ss.android.ugc.aweme.account.ui.AccountManagerActivity;
import com.ss.android.ugc.aweme.account.ui.BindMobileActivity;
import com.ss.android.ugc.aweme.account.ui.ModifyMobileActivity;
import com.ss.android.ugc.aweme.y;

public class BindService extends BaseBindService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private y mBindResult;
    private LifecycleOwner mLifecycleOwner;
    private IAccountService.h mResult;

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71367, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.mLifecycleOwner != null) {
            this.mLifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mLifecycleOwner = null;
        this.mResult = null;
    }

    public void setAuthorzieBindResult(y yVar) {
        this.mBindResult = yVar;
    }

    public Fragment createLiveBindPhoneFragment(@Nullable IAccountService.h hVar) {
        LiveBindPhoneFragment liveBindPhoneFragment;
        IAccountService.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, changeQuickRedirect, false, 71364, new Class[]{IAccountService.h.class}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{hVar2}, this, changeQuickRedirect, false, 71364, new Class[]{IAccountService.h.class}, Fragment.class);
        }
        this.mResult = hVar2;
        if (PatchProxy.isSupport(new Object[0], null, LiveBindPhoneFragment.f31914d, true, 19914, new Class[0], LiveBindPhoneFragment.class)) {
            liveBindPhoneFragment = (LiveBindPhoneFragment) PatchProxy.accessDispatch(new Object[0], null, LiveBindPhoneFragment.f31914d, true, 19914, new Class[0], LiveBindPhoneFragment.class);
        } else {
            liveBindPhoneFragment = new LiveBindPhoneFragment();
        }
        liveBindPhoneFragment.getLifecycle().addObserver(this);
        this.mLifecycleOwner = liveBindPhoneFragment;
        return liveBindPhoneFragment;
    }

    public void showThirdPartyAccountManagerActivity(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71363, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71363, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        activity2.startActivity(new Intent(activity2, AccountManagerActivity.class));
    }

    public void returnAuthorizeResult(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71365, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, changeQuickRedirect, false, 71365, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mBindResult != null) {
            this.mBindResult.a(str, z);
        }
    }

    public void returnResult(int i, int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71366, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, changeQuickRedirect, false, 71366, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        super.returnResult(i, i2, obj);
        if (this.mResult != null) {
            int i3 = i;
            int i4 = i2;
            this.mResult.a(i, i2, obj2);
        }
    }

    public void bindMobile(Activity activity, String str, Bundle bundle, @Nullable IAccountService.h hVar) {
        Activity activity2 = activity;
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, bundle2, hVar}, this, changeQuickRedirect, false, 71361, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str2, bundle2, hVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71361, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        super.bindMobile(activity, str, bundle, hVar);
        Intent intent = new Intent(activity2, BindMobileActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ENTER_REASON", str2);
        }
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        activity2.startActivity(intent);
    }

    public void modifyMobile(Activity activity, String str, Bundle bundle, @Nullable IAccountService.h hVar) {
        Activity activity2 = activity;
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, bundle2, hVar}, this, changeQuickRedirect, false, 71362, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str2, bundle2, hVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71362, new Class[]{Activity.class, String.class, Bundle.class, IAccountService.h.class}, Void.TYPE);
            return;
        }
        super.modifyMobile(activity, str, bundle, hVar);
        Intent intent = new Intent(activity2, ModifyMobileActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ENTER_REASON", str2);
        }
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        activity2.startActivity(intent);
    }
}
