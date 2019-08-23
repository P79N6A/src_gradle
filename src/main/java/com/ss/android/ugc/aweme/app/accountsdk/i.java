package com.ss.android.ugc.aweme.app.accountsdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.d.a.a;
import com.ss.android.ugc.aweme.d.a.d;

public final class i implements IAccountService.f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33732a;

    public final boolean a(int i, @Nullable Object obj) {
        int i2;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj2}, this, f33732a, false, 22996, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj2}, this, f33732a, false, 22996, new Class[]{Integer.TYPE, Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (i == 2 && (obj2 instanceof String)) {
            String str = (String) obj2;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1530308138) {
                if (hashCode != -791575966) {
                    if (hashCode == -471473230 && str.equals("sina_weibo")) {
                        c2 = 2;
                    }
                } else if (str.equals("weixin")) {
                    c2 = 1;
                }
            } else if (str.equals("qzone_sns")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    i2 = 4;
                    break;
                case 1:
                    i2 = 5;
                    break;
                case 2:
                    i2 = 6;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            d a2 = a.a().a(i2);
            if (a2 != null && a2.f41067b == 1) {
                Activity e2 = p.a().e();
                Intent intent = new Intent(e2, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", true);
                intent.putExtra("hide_status_bar", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(a2.f41068c));
                e2.startActivity(intent);
                com.ss.android.ugc.aweme.account.login.loginlog.a.a().a("", "", false, str, "", "goes to CrossPlatformActivity");
                return true;
            }
        }
        return false;
    }
}
