package com.ss.android.ugc.aweme.miniapp.d;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.IAdEventListener;
import com.ss.android.excitingvideo.IDownloadListener;
import com.ss.android.excitingvideo.IImageLoadFactory;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.excitingvideo.IOpenWebListener;
import com.ss.android.ugc.aweme.miniapp.a.a;
import com.ss.android.ugc.aweme.miniapp.a.b;
import com.ss.android.ugc.aweme.miniapp.a.c;
import com.ss.android.ugc.aweme.miniapp.a.d;
import com.ss.android.ugc.aweme.miniapp.a.e;
import com.ss.android.ugc.aweme.miniapp.pay.a.b;
import com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.download.IDownloadInterface;
import com.tt.miniapphost.entity.AppLaunchInfo;
import com.tt.miniapphost.entity.GamePayResultEntity;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.HostOptionLowPriorityDepend;
import java.util.List;
import org.json.JSONObject;

public final class j extends HostOptionLowPriorityDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55686a;

    public final List<AppLaunchInfo> getAppLaunchInfo() {
        return null;
    }

    @Nullable
    public final IDownloadInterface getIDownloadInterface() {
        return null;
    }

    @Nullable
    public final IAdEventListener getIAdEventListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f55686a, false, 59400, new Class[0], IAdEventListener.class)) {
            return new b();
        }
        return (IAdEventListener) PatchProxy.accessDispatch(new Object[0], this, f55686a, false, 59400, new Class[0], IAdEventListener.class);
    }

    @Nullable
    public final IDownloadListener getIDownloadListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f55686a, false, 59398, new Class[0], IDownloadListener.class)) {
            return new a();
        }
        return (IDownloadListener) PatchProxy.accessDispatch(new Object[0], this, f55686a, false, 59398, new Class[0], IDownloadListener.class);
    }

    @Nullable
    public final IImageLoadFactory getIImageLoadFactory() {
        if (!PatchProxy.isSupport(new Object[0], this, f55686a, false, 59397, new Class[0], IImageLoadFactory.class)) {
            return new d();
        }
        return (IImageLoadFactory) PatchProxy.accessDispatch(new Object[0], this, f55686a, false, 59397, new Class[0], IImageLoadFactory.class);
    }

    @Nullable
    public final INetworkListener getINetworkListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f55686a, false, 59396, new Class[0], INetworkListener.class)) {
            return new c(AppbrandContext.getInst().getApplicationContext());
        }
        return (INetworkListener) PatchProxy.accessDispatch(new Object[0], this, f55686a, false, 59396, new Class[0], INetworkListener.class);
    }

    @Nullable
    public final IOpenWebListener getIOpenWebListener() {
        if (!PatchProxy.isSupport(new Object[0], this, f55686a, false, 59399, new Class[0], IOpenWebListener.class)) {
            return new e();
        }
        return (IOpenWebListener) PatchProxy.accessDispatch(new Object[0], this, f55686a, false, 59399, new Class[0], IOpenWebListener.class);
    }

    public final String replaceProcessName(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f55686a, false, 59401, new Class[]{String.class}, String.class)) {
            return super.replaceProcessName(str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f55686a, false, 59401, new Class[]{String.class}, String.class);
    }

    public final boolean bindPhoneNumber(@NonNull HostOptionLowPriorityDepend.BindPhoneNumberCallback bindPhoneNumberCallback) {
        final HostOptionLowPriorityDepend.BindPhoneNumberCallback bindPhoneNumberCallback2 = bindPhoneNumberCallback;
        if (PatchProxy.isSupport(new Object[]{bindPhoneNumberCallback2}, this, f55686a, false, 59402, new Class[]{HostOptionLowPriorityDepend.BindPhoneNumberCallback.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bindPhoneNumberCallback2}, this, f55686a, false, 59402, new Class[]{HostOptionLowPriorityDepend.BindPhoneNumberCallback.class}, Boolean.TYPE)).booleanValue();
        }
        Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
        if (currentActivity == null) {
            bindPhoneNumberCallback2.onBindPhoneResult(false);
            return true;
        }
        Intent intent = new Intent(currentActivity, MainProcessProxyActivity.class);
        intent.putExtra("proxy_type", 5);
        ProcessUtil.fillCrossProcessCallbackIntent(intent, new IpcCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55687a;

            public final void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55687a, false, 59405, new Class[]{CrossProcessDataEntity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55687a, false, 59405, new Class[]{CrossProcessDataEntity.class}, Void.TYPE);
                    return;
                }
                finishListenIpcCallback();
                if (crossProcessDataEntity == null) {
                    bindPhoneNumberCallback2.onBindPhoneResult(false);
                } else {
                    bindPhoneNumberCallback2.onBindPhoneResult(crossProcessDataEntity.getBoolean("bindPhoneNumberResult"));
                }
            }
        });
        currentActivity.startActivity(intent);
        return true;
    }

    @NonNull
    public final GamePayResultEntity handleActivityGamePayResult(int i, int i2, Intent intent) {
        GamePayResultEntity gamePayResultEntity;
        int i3 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f55686a, false, 59404, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, GamePayResultEntity.class)) {
            return (GamePayResultEntity) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f55686a, false, 59404, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, GamePayResultEntity.class);
        }
        com.ss.android.ugc.aweme.miniapp.pay.a.a a2 = com.ss.android.ugc.aweme.miniapp.pay.a.a.a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59508, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, GamePayResultEntity.class)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent2};
            ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a;
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.miniapp.pay.a.a aVar = a2;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            gamePayResultEntity = (GamePayResultEntity) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, 59508, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, GamePayResultEntity.class);
        } else {
            GamePayResultEntity gamePayResultEntity2 = new GamePayResultEntity();
            if (i == 100) {
                if (i3 != 0) {
                    if (i3 == -1) {
                        gamePayResultEntity2.setShouldHandle(true);
                        if (intent2 != null && intent2.hasExtra("pay_key_result_params")) {
                            com.ss.android.ugc.aweme.miniapp.pay.c cVar = (com.ss.android.ugc.aweme.miniapp.pay.c) intent2.getSerializableExtra("pay_key_result_params");
                            switch (cVar.getCode()) {
                                case 0:
                                    gamePayResultEntity2.setCode(0);
                                    gamePayResultEntity2.setMessage("success");
                                    break;
                                case 1:
                                    gamePayResultEntity2.setCode(-1);
                                    gamePayResultEntity2.setMessage("fail");
                                    break;
                                case 2:
                                    gamePayResultEntity2.setCode(-2);
                                    gamePayResultEntity2.setMessage("cancelled");
                                    break;
                                case 3:
                                    gamePayResultEntity2.setCode(cVar.getCode());
                                    gamePayResultEntity2.setMessage("pay checkout counter trigger fail");
                                    break;
                                case 4:
                                    gamePayResultEntity2.setCode(cVar.getCode());
                                    gamePayResultEntity2.setMessage("pay checkout counter net error");
                                    break;
                                default:
                                    gamePayResultEntity2.setCode(cVar.getCode());
                                    gamePayResultEntity2.setMessage("unknown error");
                                    break;
                            }
                        }
                    }
                } else {
                    gamePayResultEntity2.setShouldHandle(true);
                    gamePayResultEntity2.setCode(-2);
                    gamePayResultEntity2.setMessage("cancelled");
                }
            }
            gamePayResultEntity = gamePayResultEntity2;
        }
        return gamePayResultEntity;
    }

    public final boolean gamePay(@NonNull Activity activity, @NonNull JSONObject jSONObject, String str) {
        com.ss.android.ugc.aweme.miniapp.pay.a.b bVar;
        String str2;
        Activity activity2 = activity;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{activity2, jSONObject2, str}, this, f55686a, false, 59403, new Class[]{Activity.class, JSONObject.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, jSONObject2, str}, this, f55686a, false, 59403, new Class[]{Activity.class, JSONObject.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.miniapp.pay.a.a a2 = com.ss.android.ugc.aweme.miniapp.pay.a.a.a();
        if (PatchProxy.isSupport(new Object[]{activity2, jSONObject2, str}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59505, new Class[]{Activity.class, JSONObject.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, jSONObject2, str}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59505, new Class[]{Activity.class, JSONObject.class, String.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[]{jSONObject2}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59506, new Class[]{JSONObject.class}, com.ss.android.ugc.aweme.miniapp.pay.a.b.class)) {
                bVar = (com.ss.android.ugc.aweme.miniapp.pay.a.b) PatchProxy.accessDispatch(new Object[]{jSONObject2}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59506, new Class[]{JSONObject.class}, com.ss.android.ugc.aweme.miniapp.pay.a.b.class);
            } else {
                String optString = jSONObject2.optString("app_id");
                String optString2 = jSONObject2.optString("trade_no");
                String optString3 = jSONObject2.optString("merchant_id");
                String optString4 = jSONObject2.optString("_mark");
                b.a aVar = new b.a();
                aVar.f55882c = optString;
                aVar.f55883d = optString3;
                aVar.f55881b = optString2;
                aVar.f55884e = optString4;
                if (PatchProxy.isSupport(new Object[0], aVar, b.a.f55880a, false, 59509, new Class[0], com.ss.android.ugc.aweme.miniapp.pay.a.b.class)) {
                    bVar = (com.ss.android.ugc.aweme.miniapp.pay.a.b) PatchProxy.accessDispatch(new Object[0], aVar, b.a.f55880a, false, 59509, new Class[0], com.ss.android.ugc.aweme.miniapp.pay.a.b.class);
                } else {
                    bVar = new com.ss.android.ugc.aweme.miniapp.pay.a.b();
                    bVar.statusBarColor = aVar.j;
                    bVar.loadingBgColor = aVar.k;
                    bVar.appId = aVar.f55882c;
                    bVar.logParams = aVar.g;
                    bVar.merchantId = aVar.f55883d;
                    bVar.orderId = aVar.f55881b;
                    bVar.mark = aVar.f55884e;
                    bVar.statusFontDark = aVar.i;
                    bVar.statusBarHeight = aVar.l;
                    bVar.hideNavbar = aVar.h;
                    bVar.from = aVar.f55885f;
                }
            }
            com.ss.android.ugc.aweme.miniapp.pay.a.b bVar2 = bVar;
            Intent intent = new Intent(activity2, MainProcessProxyActivity.class);
            if (PatchProxy.isSupport(new Object[]{bVar2}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59507, new Class[]{com.ss.android.ugc.aweme.miniapp.pay.a.b.class}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{bVar2}, a2, com.ss.android.ugc.aweme.miniapp.pay.a.a.f55878a, false, 59507, new Class[]{com.ss.android.ugc.aweme.miniapp.pay.a.b.class}, String.class);
            } else {
                str2 = "http://wallet.snssdk.com/douyin/cashdesk?order_id=" + bVar2.getOrderId() + "&app_id=" + bVar2.getAppId() + "&merchant_id=" + bVar2.getMerchantId() + "&_mark=" + bVar2.getMark() + "&_from=" + bVar2.getFrom() + "&_log_params=" + bVar2.getLogParams() + "&hide_nav_bar=" + bVar2.getHideNavbar() + "&status_bar_color=" + bVar2.getStatusBarColor() + "&status_font_dark=" + bVar2.getStatusFontDark();
            }
            intent.putExtra("game_pay_url", str2);
            intent.putExtra("proxy_type", 4);
            activity2.startActivityForResult(intent, 100);
        }
        return true;
    }
}
