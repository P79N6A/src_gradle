package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.douyin.share.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.ai;

public final class bc implements IShareService.IActionHandler, IShareService.OnShareCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46561a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f46562b = null;

    /* renamed from: c  reason: collision with root package name */
    public Activity f46563c;

    /* renamed from: d  reason: collision with root package name */
    public IShareService.ShareWindow f46564d;

    /* renamed from: e  reason: collision with root package name */
    private b f46565e;

    private String a() {
        if (PatchProxy.isSupport(new Object[0], this, f46561a, false, 43092, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f46561a, false, 43092, new Class[0], String.class);
        }
        AbTestModel d2 = AbTestManager.a().d();
        String str = "";
        if (d2 != null) {
            if (d2.shareButtonStyle == 1) {
                str = "plain";
            } else if (d2.shareButtonStyle == 2) {
                str = "text";
            } else if (d2.shareButtonStyle == 3) {
                str = "num";
            }
        }
        return str;
    }

    public final boolean checkStatus(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f46561a, false, 43085, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f46561a, false, 43085, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (ContextCompat.checkSelfPermission(this.f46563c, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        } else {
            ActivityCompat.requestPermissions(this.f46563c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return false;
        }
    }

    public final void onShareComplete(IShareService.ShareResult shareResult) {
        if (PatchProxy.isSupport(new Object[]{shareResult}, this, f46561a, false, 43089, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult}, this, f46561a, false, 43089, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
        } else if (shareResult != null && shareResult.success) {
            if (TextUtils.equals(shareResult.type, "qq")) {
                a(16, "qq", shareResult);
            } else if (TextUtils.equals(shareResult.type, "qzone")) {
                a(16, "qzone", shareResult);
            } else if (TextUtils.equals(shareResult.type, "weixin")) {
                a(16, "weixin", shareResult);
            } else if (TextUtils.equals(shareResult.type, "weixin_moments")) {
                a(16, "weixin_moments", shareResult);
            } else if (TextUtils.equals(shareResult.type, "weibo")) {
                a(16, "weibo", shareResult);
            } else if (TextUtils.equals(shareResult.type, "toutiao")) {
                a(16, "toutiao", shareResult);
            } else if (TextUtils.equals(shareResult.type, "rocket")) {
                a(16, "rocket", shareResult);
            } else {
                if (TextUtils.equals(shareResult.type, "rocket_space")) {
                    a(16, "rocket_space", shareResult);
                }
            }
        }
    }

    private String a(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f46561a, false, 43091, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f46561a, false, 43091, new Class[]{String.class}, String.class);
        }
        boolean a2 = cg.a(str3, 3);
        boolean z = h.a().f23231a;
        boolean a3 = cg.a(str3, 5);
        if (cg.b(str)) {
            str2 = "shaped_qr_code";
        } else if (a2) {
            str2 = "download_then_share";
        } else if (a3) {
            str2 = "token";
        } else if (!TextUtils.equals(str3, "weixin_moments")) {
            str2 = "normal_share";
        } else if (z) {
            str2 = "system_share";
        } else {
            str2 = "normal_share";
        }
        return str2;
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46561a, false, 43093, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46561a, false, 43093, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f46565e.a(this.f46562b.getAid(), 1, 0);
    }

    private c a(String str, String str2) {
        if (!PatchProxy.isSupport(new Object[]{str, str2}, this, f46561a, false, 43097, new Class[]{String.class, String.class}, c.class)) {
            return new c().a("author_id", aa.a(this.f46562b)).a("city_info", aa.a()).a("distance_info", aa.i(this.f46562b)).a("poi_id", aa.e(this.f46562b)).a("poi_type", aa.h(this.f46562b)).a("style", a()).a("share_mode", a(str2)).a("is_photo", aa.n(this.f46562b)).a("content_type", aa.o(this.f46562b)).a("request_id", aa.c(this.f46562b));
        }
        return (c) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f46561a, false, 43097, new Class[]{String.class, String.class}, c.class);
    }

    public final boolean onAction(IShareService.ShareStruct shareStruct, String str) {
        if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f46561a, false, 43086, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f46561a, false, 43086, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(str, "image")) {
            if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f46561a, false, 43087, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f46561a, false, 43087, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            a.a().a(this.f46562b);
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            Activity activity = this.f46563c;
            a2.a(activity, j.a("aweme://aweme/detail/" + this.f46562b.getAid()).a("profile_enterprise_type", this.f46562b.getEnterpriseType()).a("query_aweme_mode", "from_local").a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").a());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(11);
            return true;
        } else if (!TextUtils.equals(str, "chat_merge")) {
            return false;
        } else {
            if (PatchProxy.isSupport(new Object[]{shareStruct}, this, f46561a, false, 43088, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct}, this, f46561a, false, 43088, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("share_struct", shareStruct);
            if (com.ss.android.ugc.aweme.im.b.d() && com.ss.android.ugc.aweme.im.b.f() == 1) {
                bundle.putInt("key_share_type", 8);
            }
            com.ss.android.ugc.aweme.im.b.a().enterChooseContact(this.f46563c, bundle, null);
            return true;
        }
    }

    public bc(Activity activity, Aweme aweme, IShareService.ShareWindow shareWindow) {
        this.f46563c = activity;
        this.f46565e = new b();
        this.f46564d = shareWindow;
    }

    private void a(int i, String str, IShareService.ShareResult shareResult) {
        String str2 = str;
        IShareService.ShareResult shareResult2 = shareResult;
        if (PatchProxy.isSupport(new Object[]{16, str2, shareResult2}, this, f46561a, false, 43090, new Class[]{Integer.TYPE, String.class, IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{16, str2, shareResult2}, this, f46561a, false, 43090, new Class[]{Integer.TYPE, String.class, IShareService.ShareResult.class}, Void.TYPE);
            return;
        }
        a(16);
        r.onEvent(MobClick.obtain().setEventName("share_video").setLabelName(str2).setValue(aa.m(this.f46562b)).setJsonObject(a(str2, shareResult2.type).b()));
        new ai().a("homepage_fresh").b("homepage_fresh").e(str2).f(this.f46562b).f(a(shareResult2.type)).c("normal_share").e();
    }
}
