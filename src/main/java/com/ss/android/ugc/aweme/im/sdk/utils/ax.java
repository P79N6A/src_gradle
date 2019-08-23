package com.ss.android.ugc.aweme.im.sdk.utils;

import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52521a;

    public static boolean b(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, null, f52521a, true, 53727, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser}, null, f52521a, true, 53727, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser == null || !TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason()) || iMUser.getVerificationType() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean c(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, null, f52521a, true, 53728, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser}, null, f52521a, true, 53728, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser == null || TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason())) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(IMUser iMUser) {
        IMUser iMUser2 = iMUser;
        if (PatchProxy.isSupport(new Object[]{iMUser2}, null, f52521a, true, 53726, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser2}, null, f52521a, true, 53726, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser2 == null || !a.b().isUserVerified(iMUser2)) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(ImageView imageView, a.C0604a aVar) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2, aVar}, null, f52521a, true, 53725, new Class[]{ImageView.class, a.C0604a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, aVar}, null, f52521a, true, 53725, new Class[]{ImageView.class, a.C0604a.class}, Void.TYPE);
            return;
        }
        imageView2.setVisibility(0);
        switch (aVar) {
            case MUSICIAN:
                imageView2.setImageResource(2130840092);
                return;
            case ENTERPRISE:
                imageView2.setImageResource(2130840093);
                return;
            case OTHER:
                imageView2.setImageResource(2130840084);
                return;
            default:
                imageView2.setVisibility(4);
                return;
        }
    }

    public static boolean a(ImageView imageView, IMUser iMUser) {
        ImageView imageView2 = imageView;
        if (PatchProxy.isSupport(new Object[]{imageView2, iMUser}, null, f52521a, true, 53724, new Class[]{ImageView.class, IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageView2, iMUser}, null, f52521a, true, 53724, new Class[]{ImageView.class, IMUser.class}, Boolean.TYPE)).booleanValue();
        }
        imageView2.setVisibility(0);
        if (b(iMUser)) {
            imageView2.setImageResource(2130840092);
        } else if (c(iMUser)) {
            imageView2.setImageResource(2130840093);
        } else if (a(iMUser)) {
            imageView2.setImageResource(2130840084);
        } else {
            imageView2.setVisibility(4);
            return false;
        }
        return true;
    }
}
