package com.ss.android.ugc.aweme.fe.registry.rn;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeGet;
import com.ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.ApiParamMethod;
import com.ss.android.ugc.aweme.fe.method.AppInfoMethod;
import com.ss.android.ugc.aweme.fe.method.AppSettingMethod;
import com.ss.android.ugc.aweme.fe.method.BindPhoneMethod;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge;
import com.ss.android.ugc.aweme.fe.method.CloseMethod;
import com.ss.android.ugc.aweme.fe.method.ComponentDidMountMethod;
import com.ss.android.ugc.aweme.fe.method.DarkModeMethod;
import com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod;
import com.ss.android.ugc.aweme.fe.method.GetLocationMethod;
import com.ss.android.ugc.aweme.fe.method.GetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.GetSettingsMethod;
import com.ss.android.ugc.aweme.fe.method.JsAppDownloadMethod;
import com.ss.android.ugc.aweme.fe.method.LaunchChatMethod;
import com.ss.android.ugc.aweme.fe.method.MakeCallMethod;
import com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod;
import com.ss.android.ugc.aweme.fe.method.OpenBrowserMethod;
import com.ss.android.ugc.aweme.fe.method.OpenHalfDialogBridge;
import com.ss.android.ugc.aweme.fe.method.OpenRecordMethod;
import com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod;
import com.ss.android.ugc.aweme.fe.method.PayMethod;
import com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.SelectLocation;
import com.ss.android.ugc.aweme.fe.method.SendLogMethod;
import com.ss.android.ugc.aweme.fe.method.SendLogV3Method;
import com.ss.android.ugc.aweme.fe.method.SetNativeItemMethod;
import com.ss.android.ugc.aweme.fe.method.ShareMethod;
import com.ss.android.ugc.aweme.fe.method.ShareRankMethod;
import com.ss.android.ugc.aweme.fe.method.ShowDmtToastMethod;
import com.ss.android.ugc.aweme.fe.method.ShowToastMethod;
import com.ss.android.ugc.aweme.fe.method.SyncCertificationStatusMethod;
import com.ss.android.ugc.aweme.fe.method.UserInfoMethod;
import com.ss.android.ugc.aweme.fe.method.ZhimaMethod;
import com.ss.android.ugc.aweme.fe.method.auth.AuthMethod;
import com.ss.android.ugc.aweme.fe.method.charge.ChargeMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.AsyncAddGoodsMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.AsyncShoppingWindowGoodsMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.GetGoodsInfoMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoBindMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoCouponMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.OpenTaobaoGoodMethod;
import com.ss.android.ugc.aweme.fe.method.commerce.TaoCommandMethod;
import com.ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import java.lang.ref.WeakReference;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44603a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f44604b;

    /* renamed from: c  reason: collision with root package name */
    private ReactContext f44605c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.framework.bridge.b f44606d = com.ss.android.ugc.aweme.framework.bridge.b.a(this.f44605c);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44603a, false, 39877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44603a, false, 39877, new Class[0], Void.TYPE);
            return;
        }
        ReactContext reactContext = this.f44605c;
        if (PatchProxy.isSupport(new Object[]{reactContext}, null, com.ss.android.ugc.aweme.framework.bridge.b.f48473a, true, 45890, new Class[]{ReactContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reactContext}, null, com.ss.android.ugc.aweme.framework.bridge.b.f48473a, true, 45890, new Class[]{ReactContext.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.bridge.b.f48474b.remove(reactContext);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44603a, false, 39875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44603a, false, 39875, new Class[0], Void.TYPE);
            return;
        }
        this.f44606d.a("sendLogV3", new SendLogMethod());
        this.f44606d.a("apiParam", new ApiParamMethod());
        this.f44606d.a("appSetting", new AppSettingMethod());
        this.f44606d.a("broadcast", new BroadcastMethod());
        this.f44606d.a("setNativeItem", new SetNativeItemMethod());
        this.f44606d.a("getNativeItem", new GetNativeItemMethod());
        this.f44606d.a("charge", new ChargeMethod());
        this.f44606d.a("getLinkData", new LinkAuthBridgeGet(this.f44605c));
        this.f44606d.a("setLinkData", new LinkAuthBridgeSet(this.f44605c));
        this.f44606d.a("isAppInstall", new IsAppInstalledMethod());
        this.f44606d.a("getSettings", new GetSettingsMethod());
        this.f44604b = true;
    }

    public b(ReactContext reactContext) {
        this.f44605c = reactContext;
    }

    public final boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f44603a, false, 39876, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f44603a, false, 39876, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (!this.f44604b) {
            b();
        }
        if (this.f44605c == null) {
            return false;
        }
        BaseCommonJavaMethod a2 = new JsAppDownloadMethod(this.f44605c).a(new WeakReference(context));
        this.f44606d.a("openHalfDialog", new OpenHalfDialogBridge(new WeakReference<>(context), this.f44605c));
        this.f44606d.a("closeHalfDialog", new CloseHalfDialogBridge(this.f44605c));
        this.f44606d.a("bindPhone", new BindPhoneMethod(new WeakReference(context), this.f44605c));
        this.f44606d.a("zmCert", new ZhimaMethod(new WeakReference(context), this.f44605c));
        this.f44606d.a("walletAuth", new AuthMethod(new WeakReference(context), this.f44605c));
        this.f44606d.a("uploadFile", new RnUploadFileMethod(new WeakReference(context), this.f44605c));
        this.f44606d.a("openRecord", new OpenRecordMethod(new WeakReference(context), this.f44605c));
        this.f44606d.a("syncCertificationStatus", new SyncCertificationStatusMethod());
        this.f44606d.a("enterUserFeed", new EnterUserPostFeedsMethod(this.f44605c).a(new WeakReference(context)));
        this.f44606d.a("noticePermission", new NoticePermissionMethod(this.f44605c).a(new WeakReference(context)));
        this.f44606d.a("shareRank", new ShareRankMethod(this.f44605c).a(new WeakReference(context)));
        this.f44606d.a("getCurrentLocation", new GetLocationMethod().a(new WeakReference(context)));
        this.f44606d.a("launchChat", new LaunchChatMethod().a(new WeakReference(context)));
        this.f44606d.a("showDmtToast", new ShowDmtToastMethod().a(new WeakReference(context)));
        this.f44606d.a("showLocationSelect", new SelectLocation(this.f44605c).a(new WeakReference(context)));
        this.f44606d.a("open_long_video", new OpenLongVideoMethod(new WeakReference(context)));
        this.f44606d.a("uploadALog", new FeedbackUploadALog().a(new WeakReference(context)));
        this.f44606d.a("close", new CloseMethod().a(new WeakReference(context)));
        this.f44606d.a("componentDidMount", new ComponentDidMountMethod().a(new WeakReference(context)));
        this.f44606d.a("darkMode", new DarkModeMethod().a(new WeakReference(context)));
        this.f44606d.a("userInfo", new UserInfoMethod().a(new WeakReference(context)));
        this.f44606d.a("sendLog", new SendLogMethod().a(new WeakReference(context)));
        this.f44606d.a("sendLogV3", new SendLogV3Method().a(new WeakReference(context)));
        this.f44606d.a("openSchema", new OpenSchemaMethod().a(new WeakReference(context)));
        this.f44606d.a("showToast", new ShowToastMethod().a(new WeakReference(context)));
        this.f44606d.a("share", new ShareMethod().a(new WeakReference(context)));
        this.f44606d.a("openBrowser", new OpenBrowserMethod().a(new WeakReference(context)));
        this.f44606d.a("appInfo", new AppInfoMethod().a(new WeakReference(context)));
        this.f44606d.a("darkMode", new DarkModeMethod().a(new WeakReference(context)));
        this.f44606d.a("makeCall", new MakeCallMethod().a(new WeakReference(context)));
        this.f44606d.a("pay", new PayMethod().a(new WeakReference(context)));
        this.f44606d.a("launchWXMiniPro", new WXMiniPayMethod().a(new WeakReference(context)));
        this.f44606d.a("cancel_download_app_ad", a2);
        this.f44606d.a("download_app_ad", a2);
        this.f44606d.a("subscribe_app_ad", a2);
        this.f44606d.a("unsubscribe_app_ad", a2);
        this.f44606d.a("get_download_pause_task", a2);
        this.f44606d.a("get_downloading_task", a2);
        this.f44606d.a("get_install_status", a2);
        this.f44606d.a("asyncAddGoods", new AsyncAddGoodsMethod().a(new WeakReference(context)));
        this.f44606d.a("asyncShoppingWindowGoods", new AsyncShoppingWindowGoodsMethod().a(new WeakReference(context)));
        this.f44606d.a("asyncGoodsEditInfo", new AsyncGoodsEditInfoMethod().a(new WeakReference(context)));
        this.f44606d.a("getGoodsInfo", new GetGoodsInfoMethod().a(new WeakReference(context)));
        this.f44606d.a("jumpTaobaoForBind", new JumpToTaobaoBindMethod().a(new WeakReference(context)));
        this.f44606d.a("jumpTaobaoForCoupon", new JumpToTaobaoCouponMethod().a(new WeakReference(context)));
        this.f44606d.a("openTaobaoGood", new OpenTaobaoGoodMethod().a(new WeakReference(context)));
        this.f44606d.a("fetchTaoCommand", new TaoCommandMethod().a(new WeakReference(context)));
        return true;
    }
}
