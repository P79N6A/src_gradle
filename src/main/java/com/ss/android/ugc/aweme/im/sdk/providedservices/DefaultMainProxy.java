package com.ss.android.ugc.aweme.im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.a.d;
import com.ss.android.ugc.aweme.im.service.c;
import java.util.Locale;
import java.util.Map;

public class DefaultMainProxy implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void downloadPdf(Context context, String str, String str2) {
    }

    public boolean enableIM() {
        return true;
    }

    public boolean enableSendPic() {
        return false;
    }

    public void enterAddFriendsActivity(Context context) {
    }

    public void enterNotificationDetail(Context context, int i, int i2, String str) {
    }

    public String getAppLanguage() {
        return null;
    }

    public int getAssociativeEmoji() {
        return 0;
    }

    public Locale getCountryLocale() {
        return null;
    }

    public boolean getIsHotSearchBillboardEnable() {
        return true;
    }

    public String getSessionId() {
        return "";
    }

    public String getWsUrl() {
        return null;
    }

    public int getXPlanStyle() {
        return 0;
    }

    public void handleXDownload(Activity activity, String str) {
    }

    public boolean isEnableShowTeenageTip() {
        return false;
    }

    public boolean isFFSDKBind() {
        return false;
    }

    public boolean isMainPage() {
        return false;
    }

    public boolean isXPlanRedPacketOpen() {
        return false;
    }

    public void jumpToLivePage(Context context, String str, String str2) {
    }

    public void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
    }

    public void logIMShareHeadShow() {
    }

    public void makePhoneCall(@NonNull Activity activity, String str, String str2, String str3, String str4) {
    }

    public void monitorMsgSendStatus(Map<String, String> map) {
    }

    public void openFFSdkSchema(String str) {
    }

    public void openUrl(Context context, Uri uri, boolean z) {
    }

    public void popCaptcha(Activity activity, int i, com.ss.android.ugc.aweme.im.service.a.c cVar) {
    }

    public void postNotificationIndicator(int i, int i2) {
    }

    public void putSecUidToMap(String str, String str2) {
    }

    public void saveShareCommandToSp(String str) {
    }

    public void setCurrentLocaleLanguage(String str) {
    }

    public void shareToTargetChannel(Context context, String str) {
    }

    public boolean showNewStyle() {
        return false;
    }

    public void showNotification(String str, String str2) {
    }

    public void unSubscribeSession(int i, @NonNull d dVar) {
    }

    public void updateApk(Context context) {
    }

    public String getCurrentLocaleLanguage() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52556, new Class[0], String.class)) {
            return Locale.CHINESE.getLanguage();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52556, new Class[0], String.class);
    }

    public com.ss.android.ugc.aweme.im.service.model.d getIMSetting() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 52555, new Class[0], com.ss.android.ugc.aweme.im.service.model.d.class)) {
            return com.ss.android.ugc.aweme.im.service.model.d.a();
        }
        return (com.ss.android.ugc.aweme.im.service.model.d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 52555, new Class[0], com.ss.android.ugc.aweme.im.service.model.d.class);
    }
}
