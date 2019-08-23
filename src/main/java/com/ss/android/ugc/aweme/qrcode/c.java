package com.ss.android.ugc.aweme.qrcode;

import android.support.annotation.IdRes;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63357a;

    public static String a(int i, String str) {
        int i2 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, null, f63357a, true, 70356, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, null, f63357a, true, 70356, new Class[]{Integer.TYPE, String.class}, String.class);
        } else if (i2 == 17) {
            return "sticker_detail";
        } else {
            if (i2 != 23) {
                switch (i2) {
                    case 1:
                        return "video";
                    case 2:
                        break;
                    case 3:
                        return "music";
                    case 4:
                        if (TextUtils.equals(d.a().getCurUserId(), str2)) {
                            return "personal_homepage";
                        }
                        return "others_homepage";
                    case 5:
                        return "live";
                    default:
                        switch (i2) {
                            case e.l:
                                return "poi_page";
                            case 8:
                                return "bodydance_detail";
                            case 9:
                                return "shoot";
                            default:
                                return "text";
                        }
                }
            }
            return "challenge";
        }
    }

    @IdRes
    public static int a(int i, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, null, f63357a, true, 70355, new Class[]{Integer.TYPE, String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, null, f63357a, true, 70355, new Class[]{Integer.TYPE, String.class, String.class}, Integer.TYPE)).intValue();
        } else if (i != 4 || !TextUtils.equals(d.a().getCurUserId(), str3)) {
            return C0906R.string.bua;
        } else {
            if (a.a() || !"navigation_panel".equals(str4)) {
                return C0906R.string.bfu;
            }
            return C0906R.string.bfq;
        }
    }
}
