package com.ss.android.ugc.aweme.captcha.c;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.captcha.ui.CaptchaDialogFragment;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35281a;

    public static boolean a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f35281a, true, 25767, new Class[]{Exception.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{exc2}, null, f35281a, true, 25767, new Class[]{Exception.class}, Boolean.TYPE)).booleanValue();
        } else if (!(exc2 instanceof a) || ((a) exc2).getErrorCode() != 2155) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(FragmentManager fragmentManager, a aVar, com.ss.android.ugc.aweme.captcha.b bVar) {
        FragmentManager fragmentManager2 = fragmentManager;
        com.ss.android.ugc.aweme.captcha.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, aVar, bVar2}, null, f35281a, true, 25766, new Class[]{FragmentManager.class, a.class, com.ss.android.ugc.aweme.captcha.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, aVar, bVar2}, null, f35281a, true, 25766, new Class[]{FragmentManager.class, a.class, com.ss.android.ugc.aweme.captcha.b.class}, Void.TYPE);
        } else if (fragmentManager2 != null) {
            String str = "";
            if (aVar != null) {
                str = aVar.getErrorMsg();
            }
            CaptchaDialogFragment captchaDialogFragment = (CaptchaDialogFragment) fragmentManager2.findFragmentByTag("captcha");
            if (captchaDialogFragment == null) {
                captchaDialogFragment = new CaptchaDialogFragment();
            }
            if (!captchaDialogFragment.k) {
                Bundle bundle = new Bundle();
                bundle.putString(PushConstants.TITLE, str);
                captchaDialogFragment.setArguments(bundle);
                captchaDialogFragment.f35287f = bVar2;
                captchaDialogFragment.show(fragmentManager2, "captcha");
            }
        }
    }
}
