package com.ss.android.ugc.aweme.web;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.e;
import com.ss.android.sdk.c.a;
import com.ss.android.sdk.c.f;
import com.ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeGet;
import com.ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.AppInfoMethod;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.fe.method.CloseMethod;
import com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod;
import com.ss.android.ugc.aweme.fe.method.DarkModeMethod;
import com.ss.android.ugc.aweme.fe.method.DisableGestureClose;
import com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod;
import com.ss.android.ugc.aweme.fe.method.GetMicroAppInfoMethod;
import com.ss.android.ugc.aweme.fe.method.GetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.GetSettingsMethod;
import com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod;
import com.ss.android.ugc.aweme.fe.method.LaunchChatMethod;
import com.ss.android.ugc.aweme.fe.method.MakeCallMethod;
import com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod;
import com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod;
import com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod;
import com.ss.android.ugc.aweme.fe.method.PayMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogV3Method;
import com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.ShareMethod;
import com.ss.android.ugc.aweme.fe.method.ShareRankMethod;
import com.ss.android.ugc.aweme.fe.method.ShowDmtToastMethod;
import com.ss.android.ugc.aweme.fe.method.ShowToastMethod;
import com.ss.android.ugc.aweme.fe.method.UserInfoMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.AsyncAddGoodsMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.AsyncShoppingWindowGoodsMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoBindMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoCouponMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.OpenTaobaoGoodMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod;
import com.ss.android.ugc.aweme.fe.method.douplus.DouplusShowResultMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybrid.monitor.c;
import com.ss.android.ugc.aweme.net.o;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.web.jsbridge.LoginMethod;
import com.ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod;
import com.ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod;
import com.ss.android.ugc.aweme.web.jsbridge.aa;
import com.ss.android.ugc.aweme.web.jsbridge.ad;
import com.ss.android.ugc.aweme.web.jsbridge.ae;
import com.ss.android.ugc.aweme.web.jsbridge.af;
import com.ss.android.ugc.aweme.web.jsbridge.ah;
import com.ss.android.ugc.aweme.web.jsbridge.aj;
import com.ss.android.ugc.aweme.web.jsbridge.al;
import com.ss.android.ugc.aweme.web.jsbridge.b.a;
import com.ss.android.ugc.aweme.web.jsbridge.h;
import com.ss.android.ugc.aweme.web.jsbridge.k;
import com.ss.android.ugc.aweme.web.jsbridge.l;
import com.ss.android.ugc.aweme.web.jsbridge.m;
import com.ss.android.ugc.aweme.web.jsbridge.n;
import com.ss.android.ugc.aweme.web.jsbridge.p;
import com.ss.android.ugc.aweme.web.jsbridge.q;
import com.ss.android.ugc.aweme.web.jsbridge.r;
import com.ss.android.ugc.aweme.web.jsbridge.s;
import com.ss.android.ugc.aweme.web.jsbridge.u;
import com.ss.android.ugc.aweme.web.jsbridge.w;
import com.ss.android.ugc.aweme.web.jsbridge.x;
import com.ss.android.ugc.aweme.web.jsbridge.y;
import com.ss.android.ugc.aweme.web.jsbridge.z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class b extends a implements f {
    public static ChangeQuickRedirect m;
    public com.ss.android.ugc.aweme.hybrid.monitor.f n;
    private IAmeJsMessageHandlerService o = ((IAmeJsMessageHandlerService) ServiceManager.get().getService(IAmeJsMessageHandlerService.class));
    private final a.b p = new a.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76617a;

        public final void a(a.C0802a aVar, a.c cVar) {
            String str;
            String str2;
            String str3;
            int i;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{aVar, cVar}, this, f76617a, false, 89843, new Class[]{a.C0802a.class, a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, cVar}, this, f76617a, false, 89843, new Class[]{a.C0802a.class, a.c.class}, Void.TYPE);
                return;
            }
            if (aVar.f76728b == null) {
                str = "";
            } else {
                str = aVar.f76728b;
            }
            if (aVar.f76727a == null) {
                str2 = "";
            } else {
                str2 = aVar.f76727a;
            }
            if (aVar.f76729c == null) {
                str3 = "";
            } else {
                str3 = aVar.f76729c.toString();
            }
            com.ss.android.ugc.aweme.hybrid.monitor.b bVar = new com.ss.android.ugc.aweme.hybrid.monitor.b(str, str2, str3);
            c cVar2 = null;
            if (cVar.f76731b != null) {
                cVar2 = new c("network_error", cVar.f76731b);
            } else if (cVar.f76730a != null) {
                if (!cVar.f76730a.has("message") || "success".equals(cVar.f76730a.optString("message"))) {
                    if (cVar.f76730a.has("code")) {
                        i = cVar.f76730a.optInt("code");
                    } else if (cVar.f76730a.has("status_code")) {
                        i = cVar.f76730a.optInt("status_code");
                    } else if (cVar.f76730a.has("statusCode")) {
                        i = cVar.f76730a.optInt("statusCode");
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        z = false;
                    }
                }
                if (z) {
                    cVar2 = new c("api_error", new Exception(cVar.f76730a.toString()));
                }
            }
            if (b.this.n != null && b.this.n.f49969c) {
                b.this.n.a(bVar, cVar2);
            }
        }
    };

    public final List<String> c() {
        this.g = f.f76629b;
        return this.g;
    }

    public final List<String> b() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 89830, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, m, false, 89830, new Class[0], List.class);
        }
        super.b();
        if (com.ss.android.g.a.a()) {
            this.f30710e.add("sendLog");
        }
        this.f30710e.add("openSchoolEdit");
        this.f30710e.add("formDialogClose");
        this.f30710e.add("openSchoolEdit");
        this.f30710e.add("orderResult");
        return this.f30710e;
    }

    public final void a(com.ss.android.ugc.aweme.hybrid.monitor.f fVar) {
        this.n = fVar;
    }

    public final boolean c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, m, false, 89839, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, m, false, 89839, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!e.a(str)) {
            return false;
        } else {
            try {
                String a2 = o.a(str);
                if (a2 == null) {
                    return false;
                }
                if (this.o != null && this.o.isSafeDomain(a2)) {
                    return true;
                }
                return super.c(str);
            } catch (Exception unused) {
            }
        }
    }

    public final void b(@NonNull com.ss.android.sdk.c.b bVar) {
        com.ss.android.sdk.c.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89831, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89831, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.registerJavaMethod(bVar2, this.f30709d, e());
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89833, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89833, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
        } else {
            com.bytedance.ies.f.a.a aVar = bVar2.f30719b;
            bVar2.a("close", (d) new CloseMethod(aVar).a(this.f30709d)).a("userInfo", (d) new UserInfoMethod(aVar).a(this.f30709d)).a("darkMode", (d) new DarkModeMethod(aVar).a(this.f30709d)).a("sendLog", (d) new SendLogMethod(aVar).a(this.f30709d)).a("sendLogV3", (d) new SendLogV3Method(aVar).a(this.f30709d)).a("openSchema", (d) new OpenSchemaMethod(aVar).a(this.f30709d)).a("share", (d) new ShareMethod(aVar).a(this.f30709d)).a("showToast", (d) new ShowToastMethod(aVar).a(this.f30709d)).a("openBrowser", (d) new OpenBrowserMethod(aVar).a(this.f30709d)).a("appInfo", (d) new AppInfoMethod(aVar).a(this.f30709d)).a("componentDidMount", (d) new ComponentDidMountMethod(aVar).a(this.f30709d));
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89834, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89834, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
        } else {
            com.bytedance.ies.f.a.a aVar2 = bVar2.f30719b;
            BaseCommonJavaMethod a2 = new JsAppDownloadMethod(aVar2).a(this.f30709d);
            bVar2.a("login", (d) new LoginMethod(aVar2, e())).a("apiParam", (d) new com.ss.android.ugc.aweme.web.jsbridge.b()).a("openAweme", (d) new com.ss.android.ugc.aweme.web.jsbridge.c(this.f30709d, aVar2)).a("openRecord", (d) new ae(this.f30709d, aVar2)).a("bindPhone", (d) new com.ss.android.ugc.aweme.web.jsbridge.d(aVar2, this.f30709d)).a("enterUserFeed", (d) new EnterUserPostFeedsMethod(aVar2).a(this.f30709d)).a("noticePermission", (d) new NoticePermissionMethod(aVar2).a(this.f30709d)).a("fetch", (d) new p(aVar2, this.p)).a("shareMusician", (d) new i()).a("selectLocation", (d) new af(aVar2, this.f30709d)).a("sendEventWithParams", (d) new ah()).a("openSysDialog", (d) new z(this.f30709d, aVar2)).a("uploadFile", (d) new com.ss.android.ugc.aweme.fe.method.e(this.f30709d, aVar2)).a("downloadApp", (d) new com.ss.android.ugc.aweme.web.jsbridge.o(this.f30709d)).a("stickGame", (d) new aj()).a("formDialogClose", (d) new k()).a("dpDisableGestureClose", (d) new DisableGestureClose(aVar2)).a("subscribe_app_ad", (d) a2).a("unsubscribe_app_ad", (d) a2).a("download_app_ad", (d) a2).a("cancel_download_app_ad", (d) a2).a("get_download_pause_task", (d) a2).a("get_downloading_task", (d) a2).a("get_install_status", (d) a2).a("accountLogout", (d) new w()).a("getLinkedEmailResult", (d) new u()).a("downloadCardAD", (d) new q(this.f30709d, aVar2)).a("getCurrentLocation", (d) new s(this.f30709d)).a("launchChat", (d) new LaunchChatMethod().a(this.f30709d)).a("showDmtToast", (d) new ShowDmtToastMethod().a(this.f30709d)).a("receiveCoupon", (d) new ad()).a("getThirdLoginToken", (d) new OpenThirdLoginVerifyMethod(aVar2).a(this.f30709d)).a("scan", (d) new x(this.f30709d)).a("copy", (d) new m(this.f30709d)).a("gallery", (d) new r(this.f30709d)).a("openSchoolEdit", (d) new y(this.f30709d)).a("broadcast", (d) new BroadcastMethod()).a("donation_share", (d) new n(this.f30709d, aVar2)).a("setNativeItem", (d) new SetNativeItemMethod(aVar2)).a("getNativeItem", (d) new GetNativeItemMethod(aVar2)).a("getSettings", (d) new GetSettingsMethod(aVar2)).a("getLinkData", (d) new LinkAuthBridgeGet(aVar2)).a("setLinkData", (d) new LinkAuthBridgeSet(aVar2)).a("captureWebView", (d) new com.ss.android.ugc.aweme.web.jsbridge.e(this.f30709d, aVar2)).a("orderResult", (d) new aa()).a("isAppInstall", (d) new IsAppInstalledMethod(aVar2)).a("shareRank", (d) new ShareRankMethod(aVar2).a(this.f30709d)).a("appSetting", (d) new al(this.f30709d, aVar2)).a("closeKrCopyright", (d) new l()).a("open_long_video", (d) new OpenLongVideoMethod(this.f30709d)).a("miniGamePayResult", (d) new h(this.f30709d)).a("uploadALog", (d) new FeedbackUploadALog(aVar2)).a("monitorLog", (d) new MonitorLogMethod()).a("mpinfo", (d) new GetMicroAppInfoMethod(aVar2)).a("updateNavBar", (d) new UpdateNavBarMethod());
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89835, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89835, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
        } else {
            com.bytedance.ies.f.a.a aVar3 = bVar2.f30719b;
            bVar2.a("makeCall", (d) new MakeCallMethod().a(this.f30709d)).a("launchWXMiniPro", (d) new WXMiniPayMethod(aVar3).a(this.f30709d)).a("pay", (d) new PayMethod(aVar3).a(this.f30709d)).a("asyncAddGoods", (d) new AsyncAddGoodsMethod().a(this.f30709d)).a("asyncShoppingWindowGoods", (d) new AsyncShoppingWindowGoodsMethod().a(this.f30709d)).a("asyncGoodsEditInfo", (d) new AsyncGoodsEditInfoMethod().a(this.f30709d)).a("getGoodsInfo", (d) new GetGoodsInfoMethod(aVar3).a(this.f30709d)).a("jumpTaobaoForBind", (d) new JumpToTaobaoBindMethod(aVar3).a(this.f30709d)).a("jumpTaobaoForCoupon", (d) new JumpToTaobaoCouponMethod().a(this.f30709d)).a("openTaobaoGood", (d) new OpenTaobaoGoodMethod().a(this.f30709d)).a("fetchTaoCommand", (d) new TaoCommandMethod(aVar3).a(this.f30709d));
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89838, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89838, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
        } else if (bVar2 != null) {
            com.ss.android.ugc.aweme.web.jsbridge.a aVar4 = new com.ss.android.ugc.aweme.web.jsbridge.a(this.f30709d);
            if (PatchProxy.isSupport(new Object[]{bVar2}, aVar4, com.ss.android.ugc.aweme.web.jsbridge.a.f76667a, false, 89918, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.web.jsbridge.a aVar5 = aVar4;
                PatchProxy.accessDispatch(new Object[]{bVar2}, aVar5, com.ss.android.ugc.aweme.web.jsbridge.a.f76667a, false, 89918, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar2, "dmtJsBridge");
                d dVar = aVar4;
                bVar2.a("getPageData", dVar).a("cardClick", dVar).a("cardStatus", dVar).a("closeCardDialog", dVar).a("messageTip", dVar).a("sendAdLog", dVar).a("openHalfScreenForm", dVar).a("callNativePhone", dVar).a("download_click", dVar).a("setCard", dVar).a("closeAdModal", dVar).a("setModal", dVar);
            }
            bVar2.a("closeLoading", (d) new CloseWebViewLoadingMethod(bVar2.f30719b));
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89836, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89836, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
        } else {
            IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
            if (iWalletService != null) {
                Map buildJavaMethods = iWalletService.buildJavaMethods(this.f30709d, bVar2.f30719b);
                if (buildJavaMethods != null) {
                    for (Map.Entry entry : buildJavaMethods.entrySet()) {
                        bVar2.a((String) entry.getKey(), (d) entry.getValue());
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89837, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89837, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
        } else {
            bVar2.a("dpShowResult", (d) new DouplusShowResultMethod().a(this.f30709d));
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, m, false, 89832, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, m, false, 89832, new Class[]{com.ss.android.sdk.c.b.class}, Void.TYPE);
            return;
        }
        Map javaMethods = com.ss.android.ugc.aweme.account.c.e().getJavaMethods(this.f30709d, bVar2.f30719b);
        if (javaMethods != null) {
            for (Map.Entry entry2 : javaMethods.entrySet()) {
                bVar2.a((String) entry2.getKey(), (d) entry2.getValue());
            }
        }
    }

    public b(Context context, BaseAppData baseAppData) {
        super(context, baseAppData.c());
    }

    public final void a(long j, String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str2}, this, m, false, 89841, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), str2}, this, m, false, 89841, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        super.a(Long.valueOf(j), str2);
    }
}
