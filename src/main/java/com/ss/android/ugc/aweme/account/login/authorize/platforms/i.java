package com.ss.android.ugc.aweme.account.login.authorize.platforms;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.BasePlatformAuthorize;
import com.ss.android.ugc.aweme.account.login.authorize.platforms.f;
import com.ss.android.ugc.aweme.w;
import com.ss.android.ugc.aweme.wxapi.WXEntryActivity;
import com.tencent.mm.opensdk.modelmsg.SendAuth;

public final class i extends BasePlatformAuthorize implements WXEntryActivity.a {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32175c;

    public final boolean b(int i, String str) {
        return false;
    }

    @NonNull
    public final String c() {
        return "weixin";
    }

    @NonNull
    public final String d() {
        return "";
    }

    @NonNull
    public final String e() {
        return "微信";
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f32175c, false, 20189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32175c, false, 20189, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        WXEntryActivity.a(null);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f32175c, false, 20192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32175c, false, 20192, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32175c, false, 20188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32175c, false, 20188, new Class[0], Void.TYPE);
            return;
        }
        if (!w.d().isWXAppInstalled()) {
            a.b((Context) w.b(), "您还未安装微信客户端").a();
            a();
        }
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "diandi_wx_login";
        w.d().sendReq(req);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f32175c, false, 20190, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f32175c, false, 20190, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(new f.a().c(str2).d("weixin").a());
    }

    public final void c(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f32175c, false, 20191, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f32175c, false, 20191, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(i, str);
    }

    public i(@NonNull Activity activity, @NonNull b bVar, @BasePlatformAuthorize.AuthorizeType int i) {
        super(activity, bVar, i);
        WXEntryActivity.a(this);
    }
}
