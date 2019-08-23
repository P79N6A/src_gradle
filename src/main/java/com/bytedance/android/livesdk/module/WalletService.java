package com.bytedance.android.livesdk.module;

import android.app.Activity;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.f.a;
import com.bytedance.android.live.f.b;
import com.bytedance.android.live.f.c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.FirstChargeRewardFragment;
import com.bytedance.android.livesdk.wallet.RechargeDialog;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class WalletService implements b {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WalletService() {
        com.bytedance.android.live.utility.b.a(b.class, this);
    }

    public a walletCenter() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 12520, new Class[0], a.class)) {
            return j.q().n();
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 12520, new Class[0], a.class);
    }

    public void openWallet(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 12525, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 12525, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        TTLiveSDKContext.getHostService().c().a(activity2);
    }

    public int isFirstConsume(i iVar) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 12526, new Class[]{i.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 12526, new Class[]{i.class}, Integer.TYPE)).intValue();
        }
        if (iVar.getUserHonor() == null || iVar.getUserHonor().o() == null || iVar.getUserHonor().o().size() <= 1 || iVar.getUserHonor().o().get(1) == null || iVar.getUserHonor().o().get(1).f7769e != 0) {
            i = 0;
        }
        return i;
    }

    public Fragment getFirstChargeRewardFragment(int i, int i2) {
        Object accessDispatch;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 12524, new Class[]{Integer.TYPE, Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 12524, new Class[]{Integer.TYPE, Integer.TYPE}, Fragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, FirstChargeRewardFragment.f17774a, true, 13950, new Class[]{Integer.TYPE, Integer.TYPE}, FirstChargeRewardFragment.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, null, FirstChargeRewardFragment.f17774a, true, 13950, new Class[]{Integer.TYPE, Integer.TYPE}, FirstChargeRewardFragment.class);
        } else {
            FirstChargeRewardFragment.a aVar = FirstChargeRewardFragment.f17775d;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, aVar, FirstChargeRewardFragment.a.f17780a, false, 13953, new Class[]{Integer.TYPE, Integer.TYPE}, FirstChargeRewardFragment.class)) {
                FirstChargeRewardFragment.a aVar2 = aVar;
                accessDispatch = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, aVar2, FirstChargeRewardFragment.a.f17780a, false, 13953, new Class[]{Integer.TYPE, Integer.TYPE}, FirstChargeRewardFragment.class);
            } else {
                FirstChargeRewardFragment firstChargeRewardFragment = new FirstChargeRewardFragment();
                firstChargeRewardFragment.f17776b = i;
                firstChargeRewardFragment.f17777c = i2;
                return firstChargeRewardFragment;
            }
        }
        return (FirstChargeRewardFragment) accessDispatch;
    }

    public void showRechargeDialogInH5(@NonNull FragmentActivity fragmentActivity, boolean z) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 12521, new Class[]{FragmentActivity.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 12521, new Class[]{FragmentActivity.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, Byte.valueOf(z)}, null, RechargeDialog.f17799a, true, 14068, new Class[]{FragmentActivity.class, Boolean.TYPE}, RechargeDialog.class)) {
            RechargeDialog rechargeDialog = (RechargeDialog) PatchProxy.accessDispatch(new Object[]{fragmentActivity2, Byte.valueOf(z)}, null, RechargeDialog.f17799a, true, 14068, new Class[]{FragmentActivity.class, Boolean.TYPE}, RechargeDialog.class);
        } else {
            RechargeDialog.a(fragmentActivity2, z, "");
        }
    }

    public void showRechargeDialogInH5(@NonNull FragmentActivity fragmentActivity, boolean z, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, Byte.valueOf(z ? (byte) 1 : 0), str}, this, changeQuickRedirect, false, 12522, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, Byte.valueOf(z), str}, this, changeQuickRedirect, false, 12522, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        RechargeDialog.a(fragmentActivity, z, str);
    }

    public void showRechargeDialogInH5(@NonNull FragmentActivity fragmentActivity, boolean z, String str, DataCenter dataCenter, c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, Byte.valueOf(z ? (byte) 1 : 0), str, dataCenter, cVar2}, this, changeQuickRedirect, false, 12523, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class, DataCenter.class, c.class}, Void.TYPE)) {
            Object[] objArr = {fragmentActivity, Byte.valueOf(z), str, dataCenter, cVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 12523, new Class[]{FragmentActivity.class, Boolean.TYPE, String.class, DataCenter.class, c.class}, Void.TYPE);
            return;
        }
        RechargeDialog a2 = RechargeDialog.a(fragmentActivity, z, str, dataCenter);
        if (!(cVar2 == null || a2 == null)) {
            a2.x = cVar2;
        }
    }
}
