package com.ss.android.ugc.aweme.im.service;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.im.service.model.d;
import java.util.Map;

public interface c {
    void downloadPdf(Context context, String str, String str2);

    boolean enableIM();

    boolean enableSendPic();

    void enterAddFriendsActivity(Context context);

    String getAppLanguage();

    int getAssociativeEmoji();

    String getCurrentLocaleLanguage();

    d getIMSetting();

    boolean getIsHotSearchBillboardEnable();

    String getWsUrl();

    int getXPlanStyle();

    void handleXDownload(Activity activity, String str);

    boolean isEnableShowTeenageTip();

    boolean isFFSDKBind();

    boolean isMainPage();

    boolean isXPlanRedPacketOpen();

    void jumpToLivePage(Context context, String str, String str2);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logIMShareHeadShow();

    void makePhoneCall(@NonNull Activity activity, String str, String str2, String str3, String str4);

    void monitorMsgSendStatus(Map<String, String> map);

    void openFFSdkSchema(String str);

    void openUrl(Context context, Uri uri, boolean z);

    void popCaptcha(Activity activity, int i, com.ss.android.ugc.aweme.im.service.a.c cVar);

    void putSecUidToMap(String str, String str2);

    void saveShareCommandToSp(String str);

    void setCurrentLocaleLanguage(String str);

    void shareToTargetChannel(Context context, String str);

    boolean showNewStyle();

    void showNotification(String str, String str2);

    void updateApk(Context context);
}
