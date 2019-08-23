package com.ss.android.ugc.aweme.im;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.ies.uikit.base.IComponent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.sdk.b.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.utils.af;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.FindFriendsJediFragment;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.im.service.model.d;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.message.d.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sec.g;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.update.h;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.aweme.utils.j;
import com.tt.miniapphost.process.HostProcessBridge;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class c implements com.ss.android.ugc.aweme.im.service.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50056a;

    public final boolean isXPlanRedPacketOpen() {
        return false;
    }

    public final void monitorMsgSendStatus(Map<String, String> map) {
    }

    public final boolean showNewStyle() {
        return true;
    }

    public final void showNotification(String str, String str2) {
    }

    public final boolean enableIM() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50053, new Class[0], Boolean.TYPE)) {
            return b.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50053, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String getAppLanguage() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50067, new Class[0], String.class)) {
            return Locale.CHINESE.getLanguage();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50067, new Class[0], String.class);
    }

    public final int getAssociativeEmoji() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50077, new Class[0], Integer.TYPE)) {
            return AbTestManager.a().d().mAssociativeEmoji;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50077, new Class[0], Integer.TYPE)).intValue();
    }

    public final String getCurrentLocaleLanguage() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50068, new Class[0], String.class)) {
            return (String) SharePrefCache.inst().getCurrentLocaleLanguage().c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50068, new Class[0], String.class);
    }

    public final d getIMSetting() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50056, new Class[0], d.class)) {
            return SettingsManagerProxy.inst().getCommonSettingsWatcher().a();
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50056, new Class[0], d.class);
    }

    public final boolean getIsHotSearchBillboardEnable() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50058, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.discover.helper.d.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50058, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String getWsUrl() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50064, new Class[0], String.class)) {
            return f.d().e();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50064, new Class[0], String.class);
    }

    public final int getXPlanStyle() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50076, new Class[0], Integer.TYPE)) {
            return AbTestManager.a().d().mXPlanStyle;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50076, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean isEnableShowTeenageTip() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50078, new Class[0], Boolean.TYPE)) {
            return TimeLockRuler.isEnableShowTeenageTip(C0906R.string.cif);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50078, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean isFFSDKBind() {
        if (!PatchProxy.isSupport(new Object[0], this, f50056a, false, 50072, new Class[0], Boolean.TYPE)) {
            return b.a().a("flipchat");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50072, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean enableSendPic() {
        if (PatchProxy.isSupport(new Object[0], this, f50056a, false, 50054, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50054, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (((Integer) SharePrefCache.inst().getCanImSendPic().c()).intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isMainPage() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f50056a, false, 50073, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50073, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Activity a2 = a.b().a();
        if (TextUtils.equals(a2.getClass().getName(), MainActivity.class.getName())) {
            z = ((MainActivity) a2).isMainPageVisible();
        }
        return z;
    }

    public final void logIMShareHeadShow() {
        if (PatchProxy.isSupport(new Object[0], this, f50056a, false, 50081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50056a, false, 50081, new Class[0], Void.TYPE);
            return;
        }
        String curProcessName = ToolUtils.getCurProcessName(GlobalContext.getContext());
        if (!TextUtils.isEmpty(curProcessName) && curProcessName.contains(":miniapp")) {
            HostProcessBridge.logEvent("im_share_head_show", null);
        } else if (PatchProxy.isSupport(new Object[0], null, f.f50065a, true, 50106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f.f50065a, true, 50106, new Class[0], Void.TYPE);
        } else {
            r.a("im_share_head_show", (Map) null);
        }
    }

    public final void openFFSdkSchema(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f50056a, false, 50071, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f50056a, false, 50071, new Class[]{String.class}, Void.TYPE);
            return;
        }
        FusionFuelSdk.openSchema(GlobalContext.getContext(), str2);
    }

    public final void saveShareCommandToSp(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f50056a, false, 50061, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f50056a, false, 50061, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Context context = GlobalContext.getContext();
        if (context != null) {
            com.ss.android.ugc.aweme.share.a.f.a(context, str2);
        }
    }

    public final void setCurrentLocaleLanguage(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f50056a, false, 50069, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f50056a, false, 50069, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SharePrefCache.inst().setCurrentLocaleLanguage(str2);
    }

    public final void enterAddFriendsActivity(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f50056a, false, 50082, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f50056a, false, 50082, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(FindFriendsJediFragment.a(context2, 0, 4, "message"));
    }

    public final void updateApk(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f50056a, false, 50063, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f50056a, false, 50063, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof IComponent) {
            new h(context2, (IComponent) context2).a();
        }
    }

    public final void putSecUidToMap(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f50056a, false, 50074, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f50056a, false, 50074, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        dr.a().a(str3, str4);
    }

    public final void shareToTargetChannel(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f50056a, false, 50060, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f50056a, false, 50060, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        cg.a(com.ss.android.ugc.aweme.feed.share.f.a().a(str2), context2);
    }

    public final void handleXDownload(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, f50056a, false, 50075, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f50056a, false, 50075, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity2, str2, (byte) 0}, null, j.f75899a, true, 87889, new Class[]{Activity.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2, (byte) 0}, null, j.f75899a, true, 87889, new Class[]{Activity.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        j.a(activity2, str2, false, GlobalContext.getContext().getString(C0906R.string.azs));
    }

    public final void downloadPdf(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f50056a, false, 50083, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f50056a, false, 50083, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ac.b.a(com.ss.android.ad.smartphone.c.f.a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new d(context2, str3, str4));
    }

    public final void jumpToLivePage(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str2}, this, f50056a, false, 50066, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str2}, this, f50056a, false, 50066, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        User user = new User();
        user.setUid(str3);
        user.setBroadcasterRoomId(Long.parseLong(str2));
        c.a aVar = new c.a(context2, user);
        aVar.b("chat");
        aVar.c("live_cover");
        com.ss.android.ugc.aweme.story.live.c.a().a(aVar);
    }

    public final void popCaptcha(Activity activity, int i, com.ss.android.ugc.aweme.im.service.a.c cVar) {
        Activity activity2 = activity;
        final com.ss.android.ugc.aweme.im.service.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), cVar2}, this, f50056a, false, 50079, new Class[]{Activity.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), cVar2}, this, f50056a, false, 50079, new Class[]{Activity.class, Integer.TYPE, com.ss.android.ugc.aweme.im.service.a.c.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.sec.a.a(i, activity2, new g() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50057a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50057a, false, 50085, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50057a, false, 50085, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (cVar2 != null) {
                    cVar2.a();
                }
            }

            public final void a(boolean z, @NotNull String str) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str}, this, f50057a, false, 50086, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str}, this, f50057a, false, 50086, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                    return;
                }
                if (cVar2 != null) {
                    cVar2.a(z, str);
                }
            }
        });
    }

    public final void openUrl(Context context, Uri uri, boolean z) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50056a, false, 50065, new Class[]{Context.class, Uri.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2, Byte.valueOf(z)}, this, f50056a, false, 50065, new Class[]{Context.class, Uri.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(uri2);
        if (z) {
            intent.putExtra("safeTemplate", true);
        }
        intent.putExtra("enter_from", "chat");
        intent.putExtra("hide_more", false);
        intent.putExtra("bundle_user_webview_title", false);
        context2.startActivity(intent);
    }

    public final void makePhoneCall(@NonNull Activity activity, String str, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{activity, str, str2, str3, str4}, this, f50056a, false, 50080, new Class[]{Activity.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, str2, str3, str4};
            PatchProxy.accessDispatch(objArr, this, f50056a, false, 50080, new Class[]{Activity.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        af.a().a(activity, str, str2, str3, str4);
    }

    public final void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{context, str, str2, Byte.valueOf(z ? (byte) 1 : 0), str3, str4}, this, f50056a, false, 50059, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, Byte.valueOf(z), str3, str4};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f50056a, false, 50059, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).jumpToMiniApp(context, str, str2, z, str3, str4);
    }
}
