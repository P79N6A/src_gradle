package com.ss.android.ugc.aweme.captcha.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi;
import com.ss.android.ugc.aweme.common.a;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class d extends a<c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35262a;

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f35262a, false, 25715, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f35262a, false, 25715, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35263a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f35263a, false, 25716, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f35263a, false, 25716, new Class[0], Object.class);
                    }
                    Boolean bool = (Boolean) objArr[0];
                    if (PatchProxy.isSupport(new Object[]{bool}, null, VerifyCaptchaApi.f35271a, true, 25712, new Class[]{Boolean.class}, c.class)) {
                        return (c) PatchProxy.accessDispatch(new Object[]{bool}, null, VerifyCaptchaApi.f35271a, true, 25712, new Class[]{Boolean.class}, c.class);
                    }
                    i iVar = new i("https://i.snssdk.com/ies/antispam/verification_code/get_pic_code/");
                    iVar.a("refresh", String.valueOf(bool));
                    if (NetworkUtils.isNetworkAvailable(k.a())) {
                        return (c) VerifyCaptchaApi.a((String) ((VerifyCaptchaApi.FetchVerifyPictureApi) com.ss.android.ugc.aweme.app.api.m.a("https://i.snssdk.com").create(VerifyCaptchaApi.FetchVerifyPictureApi.class)).getResult(0, String.valueOf(bool)).execute().body(), iVar.toString(), c.class);
                    }
                    throw new IOException();
                }
            }, 0);
            return true;
        }
    }
}
