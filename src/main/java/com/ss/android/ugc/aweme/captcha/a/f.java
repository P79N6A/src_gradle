package com.ss.android.ugc.aweme.captcha.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi;
import com.ss.android.ugc.aweme.common.a;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class f extends a<e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35267a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35267a, false, 25717, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f35267a, false, 25717, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35268a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f35268a, false, 25718, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f35268a, false, 25718, new Class[0], Object.class);
                    }
                    String a2 = com.ss.android.ugc.aweme.captcha.c.a.a((String) objArr[0]);
                    if (PatchProxy.isSupport(new Object[]{a2}, null, VerifyCaptchaApi.f35271a, true, 25714, new Class[]{String.class}, e.class)) {
                        return (e) PatchProxy.accessDispatch(new Object[]{a2}, null, VerifyCaptchaApi.f35271a, true, 25714, new Class[]{String.class}, e.class);
                    } else if (NetworkUtils.isNetworkAvailable(k.a())) {
                        return (e) VerifyCaptchaApi.a((String) ((VerifyCaptchaApi.CaptchaApi) com.ss.android.ugc.aweme.app.api.m.a("https://i.snssdk.com").create(VerifyCaptchaApi.CaptchaApi.class)).getResult(0, a2).execute().body(), "https://i.snssdk.com/ies/antispam/verification_code/verify_pic_code/", e.class);
                    } else {
                        throw new IOException();
                    }
                }
            }, 0);
            return true;
        }
    }
}
