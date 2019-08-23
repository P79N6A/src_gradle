package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commerce.CommerceInfo;
import com.ss.android.ugc.aweme.commerce.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.model.h;
import com.ss.android.ugc.aweme.commercialize.model.i;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39774a;

    public static String a(int i) {
        switch (i) {
            case 1:
                return "reviewing";
            case 2:
                return "review_reject";
            case 3:
                return "advertiser_confirming";
            case 4:
                return "advertiser_reject";
            default:
                return "";
        }
    }

    private static boolean i(i iVar) {
        return iVar == null;
    }

    public static void a(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, null, f39774a, true, 32219, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, null, f39774a, true, 32219, new Class[]{FeedItemList.class}, Void.TYPE);
        } else if (feedItemList2 != null && !CollectionUtils.isEmpty(feedItemList2.items)) {
            for (int size = feedItemList2.items.size() - 1; size >= 0; size--) {
                Aweme aweme = feedItemList2.items.get(size);
                if (aweme != null && aweme.isAd()) {
                    if (!aweme.getAwemeRawAd().checkHide("feed_download_ad")) {
                        break;
                    }
                    feedItemList2.items.remove(size);
                }
            }
        }
    }

    public static boolean a(CardStruct cardStruct) {
        if (PatchProxy.isSupport(new Object[]{cardStruct}, null, f39774a, true, 32243, new Class[]{CardStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cardStruct}, null, f39774a, true, 32243, new Class[]{CardStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (cardStruct == null) {
            return false;
        } else {
            return cardStruct.getCardType() == 8 || cardStruct.getCardType() == 9;
        }
    }

    public static boolean a(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, null, f39774a, true, 32270, new Class[]{Challenge.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{challenge}, null, f39774a, true, 32270, new Class[]{Challenge.class}, Boolean.TYPE)).booleanValue();
        } else if (challenge == null) {
            return false;
        } else {
            ChallengeDisclaimer challengeDisclaimer = challenge.getChallengeDisclaimer();
            return challengeDisclaimer != null && !TextUtils.isEmpty(challengeDisclaimer.getTitle()) && !TextUtils.isEmpty(challengeDisclaimer.getContent());
        }
    }

    public static boolean a(UrlModel urlModel) {
        if (!PatchProxy.isSupport(new Object[]{urlModel}, null, f39774a, true, 32283, new Class[]{UrlModel.class}, Boolean.TYPE)) {
            return urlModel != null && !CollectionUtils.isEmpty(urlModel.getUrlList()) && !TextUtils.isEmpty(urlModel.getUrlList().get(0));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f39774a, true, 32283, new Class[]{UrlModel.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean b(User user) {
        if (!PatchProxy.isSupport(new Object[]{user}, null, f39774a, true, 32302, new Class[]{User.class}, Boolean.TYPE)) {
            return user != null && user.getQuickShopInfo() != null && !TextUtils.isEmpty(user.getQuickShopInfo().getQuickShopUrl()) && user.getQuickShopInfo().isWithTextEntry();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f39774a, true, 32302, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f39774a, true, 32304, new Class[]{String.class}, Boolean.TYPE)) {
            return !TextUtils.isEmpty(str) && str2.startsWith("sslocal://showcaseh5") && str2.contains("url=");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f39774a, true, 32304, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f39774a, true, 32306, new Class[]{String.class}, Boolean.TYPE)) {
            return str2 != null && str2.contains("__back_url__");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f39774a, true, 32306, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static String U(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32295, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32295, new Class[]{Aweme.class}, String.class);
        }
        AwemeSplashInfo V = V(aweme);
        if (V == null) {
            return null;
        }
        return V.getAwesomeSplashId();
    }

    public static AwemeSplashInfo V(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32296, new Class[]{Aweme.class}, AwemeSplashInfo.class)) {
            return (AwemeSplashInfo) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32296, new Class[]{Aweme.class}, AwemeSplashInfo.class);
        }
        AwemeRawAd P = P(aweme);
        if (P == null) {
            return null;
        }
        return P.getSplashInfo();
    }

    public static boolean o(Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32244, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return a(n(aweme));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32244, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean p(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32246, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32246, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (m(aweme) != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean v(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32252, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32252, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (w(aweme) != null) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32257, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32257, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getButtonStyle() != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean B(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32258, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32258, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null || !aweme.getAwemeRawAd().getShowAvatarLink() || !H(aweme)) {
            return false;
        } else {
            return true;
        }
    }

    public static String C(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32259, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32259, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null || aweme.getAwemeRawAd() == null) {
            return o.a().getString(C0906R.color.ry);
        } else {
            String learnMoreBgColor = aweme.getAwemeRawAd().getLearnMoreBgColor();
            if (TextUtils.isEmpty(learnMoreBgColor)) {
                return o.a().getString(C0906R.color.ry);
            }
            return learnMoreBgColor;
        }
    }

    public static String D(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32260, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32260, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            return aweme.getAwemeRawAd().getButtonText();
        }
    }

    public static boolean E(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32261, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32261, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd()) {
            return false;
        } else {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (TextUtils.isEmpty(awemeRawAd.getWebUrl())) {
                return false;
            }
            if (awemeRawAd.getAnimationType() == 1 || awemeRawAd.getAnimationType() == 2) {
                return true;
            }
            return false;
        }
    }

    public static boolean G(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32265, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32265, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd()) {
            return false;
        } else {
            User author = aweme.getAuthor();
            if (author == null || !author.isAdFake()) {
                return false;
            }
            if (F(aweme).booleanValue() || aweme.getAwemeRawAd().isAllowDspAutoJump()) {
                return true;
            }
            return false;
        }
    }

    public static boolean H(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32266, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32266, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            User author = aweme.getAuthor();
            if (author == null) {
                return true;
            }
            return author.isAdFake();
        }
    }

    public static Bundle J(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32268, new Class[]{Aweme.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32268, new Class[]{Aweme.class}, Bundle.class);
        }
        Bundle I = I(aweme);
        CardStruct n = n(aweme);
        if (n != null && !TextUtils.isEmpty(n.getCardUrl()) && a(n)) {
            I.putString(PushConstants.WEB_URL, Uri.parse(n.getCardUrl()).buildUpon().appendQueryParameter("type", PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION).toString());
            I.putBoolean("use_css_injection", false);
        }
        I.putBoolean("show_load_dialog", true);
        return I;
    }

    public static Bundle K(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32269, new Class[]{Aweme.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32269, new Class[]{Aweme.class}, Bundle.class);
        }
        Bundle I = I(aweme);
        CardStruct q = q(aweme);
        if (q != null && !TextUtils.isEmpty(q.getCardUrl())) {
            I.putString(PushConstants.WEB_URL, q.getCardUrl());
            I.putBoolean("use_css_injection", false);
        }
        if (n.a(aweme)) {
            I.putBoolean("show_load_dialog", true);
        }
        return I;
    }

    public static boolean L(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32274, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32274, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeType() != 34) {
            return false;
        } else {
            return true;
        }
    }

    public static String M(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32285, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32285, new Class[]{Aweme.class}, String.class);
        }
        AwemeRawAd P = P(aweme);
        if (P == null) {
            return "";
        }
        Music music = P.getMusic();
        if (music == null) {
            return "";
        }
        String musicName = music.getMusicName();
        if (TextUtils.isEmpty(musicName)) {
            musicName = "";
        }
        return musicName;
    }

    public static String N(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32286, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32286, new Class[]{Aweme.class}, String.class);
        }
        AwemeRawAd P = P(aweme);
        if (P == null) {
            return "";
        }
        AwemeTextLabelModel label = P.getLabel();
        if (label == null) {
            return "";
        }
        String labelName = label.getLabelName();
        if (TextUtils.isEmpty(labelName)) {
            labelName = "";
        }
        return labelName;
    }

    public static int O(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32287, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32287, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        }
        AwemeRawAd P = P(aweme);
        if (P == null) {
            return 2;
        }
        return P.getShowMaskTimes();
    }

    public static AwemeRawAd P(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32288, new Class[]{Aweme.class}, AwemeRawAd.class)) {
            return (AwemeRawAd) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32288, new Class[]{Aweme.class}, AwemeRawAd.class);
        } else if (aweme != null && aweme.isAd()) {
            return aweme.getAwemeRawAd();
        } else {
            return null;
        }
    }

    public static boolean Q(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32289, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32289, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        AwemeSplashInfo V = V(aweme);
        if (V != null && !TextUtils.isEmpty(V.getAwesomeSplashId())) {
            return true;
        }
        return false;
    }

    public static boolean R(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32290, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32290, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        AwemeSplashInfo V = V(aweme);
        if (V == null) {
            return false;
        }
        return V.isShown();
    }

    public static boolean S(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32292, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32292, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        AwemeSplashInfo V = V(aweme);
        if (V == null) {
            return false;
        }
        return V.adCardShownOnce;
    }

    public static float T(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32294, new Class[]{Aweme.class}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32294, new Class[]{Aweme.class}, Float.TYPE)).floatValue();
        }
        AwemeSplashInfo V = V(aweme);
        if (V == null) {
            return 0.0f;
        }
        return V.getSplashShowTime();
    }

    public static boolean W(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32297, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32297, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        AwemeSplashInfo V = V(aweme);
        if (V != null && ((long) V.getEndTime()) >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    public static boolean X(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32308, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32308, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        } else {
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            String openUrl = aweme.getAwemeRawAd().getOpenUrl();
            String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
            if (iMiniAppService.isAppBrandSchema(openUrl) || iMiniAppService.isAppBrandSchema(microAppUrl)) {
                return true;
            }
            return false;
        }
    }

    public static boolean Y(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32312, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32312, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!t(aweme) || !aweme.getAwemeRawAd().isContextTrackSent()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean Z(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32314, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32314, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme != null && aweme.isAd() && !u(aweme)) {
            return true;
        } else {
            return false;
        }
    }

    public static e a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f39774a, true, 32300, new Class[]{User.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{user}, null, f39774a, true, 32300, new Class[]{User.class}, e.class);
        } else if (user == null) {
            return null;
        } else {
            CommerceInfo commerceInfo = user.getCommerceInfo();
            if (commerceInfo == null) {
                return null;
            }
            return commerceInfo.getSmartPhone();
        }
    }

    private static String aa(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32229, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32229, new Class[]{Aweme.class}, String.class);
        }
        String str = "";
        if (aweme != null && aweme.isAd()) {
            str = aweme.getAwemeRawAd().getType();
        }
        return str;
    }

    public static int b(List<DiscoverItemData> list) {
        List<DiscoverItemData> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f39774a, true, 32305, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2}, null, f39774a, true, 32305, new Class[]{List.class}, Integer.TYPE)).intValue();
        } else if (list2 == null) {
            return 0;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list2.get(i).getType() == 5) {
                    return i;
                }
            }
            return 0;
        }
    }

    public static String c(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32277, new Class[]{i.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32277, new Class[]{i.class}, String.class);
        } else if (i(iVar)) {
            return "";
        } else {
            return iVar.getId();
        }
    }

    public static String d(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32278, new Class[]{i.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32278, new Class[]{i.class}, String.class);
        } else if (i(iVar)) {
            return "";
        } else {
            if (iVar.getSourceUrl() == null) {
                return "";
            }
            if (CollectionUtils.isEmpty(iVar.getSourceUrl().getUrlList())) {
                return "";
            }
            return iVar.getSourceUrl().getUrlList().get(0);
        }
    }

    public static UrlModel e(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32279, new Class[]{i.class}, UrlModel.class)) {
            return (UrlModel) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32279, new Class[]{i.class}, UrlModel.class);
        } else if (i(iVar)) {
            return new UrlModel();
        } else {
            return iVar.getSourceUrl();
        }
    }

    public static String f(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32280, new Class[]{i.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32280, new Class[]{i.class}, String.class);
        } else if (i(iVar)) {
            return "";
        } else {
            return iVar.getOpenUrl();
        }
    }

    public static String g(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32281, new Class[]{i.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32281, new Class[]{i.class}, String.class);
        } else if (i(iVar)) {
            return "";
        } else {
            return iVar.getWebUrl();
        }
    }

    public static String h(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32282, new Class[]{i.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32282, new Class[]{i.class}, String.class);
        } else if (i(iVar)) {
            return "";
        } else {
            return iVar.getWebTitle();
        }
    }

    public static boolean i(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32236, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32236, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            SpecialSticker specialSticker = aweme.getSpecialSticker();
            if (specialSticker == null || specialSticker.getStickerType() != 2) {
                return false;
            }
            return true;
        }
    }

    public static boolean j(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32238, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32238, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        CardStruct m = m(aweme);
        CardStruct n = n(aweme);
        if ((m == null || m.getCardType() != 1) && (n == null || !a(n))) {
            return false;
        }
        return true;
    }

    public static boolean k(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32239, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32239, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || (!l(aweme) && !p(aweme) && !aweme.isShowCommerceCard() && n(aweme) == null)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean l(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32240, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32240, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getAnimationType() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static CardStruct m(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32241, new Class[]{Aweme.class}, CardStruct.class)) {
            return (CardStruct) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32241, new Class[]{Aweme.class}, CardStruct.class);
        } else if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null) {
            return null;
        } else {
            return aweme.getAwemeRawAd().getDefaultCardInfo();
        }
    }

    public static CardStruct n(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32242, new Class[]{Aweme.class}, CardStruct.class)) {
            return (CardStruct) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32242, new Class[]{Aweme.class}, CardStruct.class);
        }
        AwemeRawAd P = P(aweme);
        if (P == null) {
            return null;
        }
        Map<String, CardStruct> cardInfos = P.getCardInfos();
        if (cardInfos == null) {
            return null;
        }
        return cardInfos.get(PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION);
    }

    public static CardStruct q(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32247, new Class[]{Aweme.class}, CardStruct.class)) {
            return (CardStruct) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32247, new Class[]{Aweme.class}, CardStruct.class);
        } else if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            return null;
        } else {
            return aweme.getAwemeRawAd().getCardInfos().get("5");
        }
    }

    public static int r(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32248, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32248, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme == null || !aweme.isAd()) {
            return 0;
        } else {
            return aweme.getAwemeRawAd().getInteractionSeconds();
        }
    }

    public static boolean s(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32249, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32249, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd()) {
            return false;
        } else {
            return aweme.getAwemeRawAd().isShowAdAfterInteraction();
        }
    }

    public static boolean t(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32250, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32250, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean u(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32251, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32251, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static h w(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32253, new Class[]{Aweme.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32253, new Class[]{Aweme.class}, h.class);
        } else if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        } else {
            return aweme.getAwemeRawAd().getDouPlusLinkData();
        }
    }

    public static boolean x(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32254, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32254, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getSystemOrigin() != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean y(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32255, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32255, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (a.a() || aweme == null || !aweme.isAd() || !TextUtils.equals(aweme.getAwemeRawAd().getType(), PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean z(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32256, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32256, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getButtonStyle() != 1) {
            return false;
        } else {
            return true;
        }
    }

    public static Boolean F(Aweme aweme) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32264, new Class[]{Aweme.class}, Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32264, new Class[]{Aweme.class}, Boolean.class);
        } else if (aweme == null) {
            return Boolean.FALSE;
        } else {
            if (!aweme.isAd()) {
                return Boolean.FALSE;
            }
            String openUrl = aweme.getAwemeRawAd().getOpenUrl();
            if (TextUtils.isEmpty(openUrl)) {
                return Boolean.FALSE;
            }
            Uri parse = Uri.parse(openUrl);
            if (parse.getScheme() == null) {
                return Boolean.FALSE;
            }
            String lowerCase = parse.getScheme().toLowerCase();
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            if ((com.ss.android.ugc.aweme.app.e.f34152b.equals(lowerCase) || com.ss.android.ugc.aweme.app.e.f34154d.equals(lowerCase)) && !iMiniAppService.isAppBrandSchema(parse.toString())) {
                return Boolean.TRUE;
            }
            if (!a.a() || !g.c(openUrl)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public static String a(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32275, new Class[]{i.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32275, new Class[]{i.class}, String.class);
        } else if (i(iVar)) {
            return "";
        } else {
            return iVar.getSourceType();
        }
    }

    public static String b(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, null, f39774a, true, 32271, new Class[]{Challenge.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{challenge}, null, f39774a, true, 32271, new Class[]{Challenge.class}, String.class);
        } else if (!a(challenge)) {
            return "";
        } else {
            return challenge.getChallengeDisclaimer().getTitle();
        }
    }

    public static String c(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, null, f39774a, true, 32272, new Class[]{Challenge.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{challenge}, null, f39774a, true, 32272, new Class[]{Challenge.class}, String.class);
        } else if (!a(challenge)) {
            return "";
        } else {
            return challenge.getChallengeDisclaimer().getContent();
        }
    }

    public static String d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32225, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32225, new Class[]{Aweme.class}, String.class);
        }
        String str = "";
        if (aweme != null && aweme.isAd()) {
            str = aweme.getAwemeRawAd().getWebTitle();
        }
        return str;
    }

    public static String e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32230, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32230, new Class[]{Aweme.class}, String.class);
        }
        String str = "";
        if (aweme != null && aweme.isAd()) {
            str = aweme.getAwemeRawAd().getPackageName();
        }
        return str;
    }

    public static boolean f(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32232, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32232, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        User curUser = d.a().getCurUser();
        if (curUser == null || !curUser.isWithDouplusEntry()) {
            return false;
        }
        return true;
    }

    public static boolean g(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32234, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32234, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !aweme.isAd()) {
            return false;
        } else {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (!TextUtils.equals(awemeRawAd.getType(), "redpacket")) {
                return false;
            }
            UrlModel redImageUrl = awemeRawAd.getRedImageUrl();
            if (redImageUrl == null || CollectionUtils.isEmpty(redImageUrl.getUrlList())) {
                return false;
            }
            return true;
        }
    }

    public static boolean h(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32235, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32235, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getActivityPendant() == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.commerce.service.models.e activityPendant = aweme.getActivityPendant();
            UrlModel image = activityPendant.getImage();
            if (image == null || CollectionUtils.isEmpty(image.getUrlList())) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis < activityPendant.getStartTime() || currentTimeMillis > activityPendant.getEndTime()) {
                return false;
            }
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f2, code lost:
        if (android.text.TextUtils.isEmpty(r8) == false) goto L_0x012a;
     */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle I(com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f39774a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r7[r9] = r3
            java.lang.Class<android.os.Bundle> r8 = android.os.Bundle.class
            r3 = 0
            r5 = 1
            r6 = 32267(0x7e0b, float:4.5216E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0033
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39774a
            r13 = 1
            r14 = 32267(0x7e0b, float:4.5216E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r0
            java.lang.Class<android.os.Bundle> r16 = android.os.Bundle.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        L_0x0033:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            if (r17 != 0) goto L_0x003b
            return r2
        L_0x003b:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r17.getAwemeRawAd()
            if (r3 != 0) goto L_0x0042
            return r2
        L_0x0042:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r17.getAwemeRawAd()
            java.lang.Long r3 = r3.getCreativeId()
            long r3 = r3.longValue()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r17.getAwemeRawAd()
            java.lang.String r5 = r5.getLogExtra()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r17.getAwemeRawAd()
            java.lang.String r6 = r6.getDownloadUrl()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r17.getAwemeRawAd()
            java.lang.String r7 = r7.getQuickAppUrl()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39774a
            r13 = 1
            r14 = 32226(0x7de2, float:4.5158E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r8
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x0098
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39774a
            r13 = 1
            r14 = 32226(0x7de2, float:4.5158E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r8
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x012a
        L_0x0098:
            boolean r8 = p(r17)
            if (r8 == 0) goto L_0x00f5
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39774a
            r13 = 1
            r14 = 32227(0x7de3, float:4.516E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r8
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r8 == 0) goto L_0x00cf
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39774a
            r13 = 1
            r14 = 32227(0x7de3, float:4.516E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r8
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r8 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00ee
        L_0x00cf:
            r8 = 0
            if (r17 == 0) goto L_0x00ee
            boolean r10 = r17.isAd()
            if (r10 == 0) goto L_0x00ee
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r10 = r17.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.CardStruct r10 = r10.getDefaultCardInfo()
            if (r10 == 0) goto L_0x00ee
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r8 = r17.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.CardStruct r8 = r8.getDefaultCardInfo()
            java.lang.String r8 = r8.getCardUrl()
        L_0x00ee:
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto L_0x00f5
            goto L_0x012a
        L_0x00f5:
            java.lang.String r8 = aa(r17)
            java.lang.String r10 = "form"
            boolean r8 = android.text.TextUtils.equals(r8, r10)
            if (r8 == 0) goto L_0x0106
            java.lang.String r8 = b((com.ss.android.ugc.aweme.feed.model.Aweme) r17)
            goto L_0x012a
        L_0x0106:
            java.lang.String r8 = aa(r17)
            java.lang.String r10 = "app"
            boolean r8 = android.text.TextUtils.equals(r8, r10)
            if (r8 == 0) goto L_0x0117
            java.lang.String r8 = a((com.ss.android.ugc.aweme.feed.model.Aweme) r17)
            goto L_0x012a
        L_0x0117:
            java.lang.String r8 = aa(r17)
            java.lang.String r10 = "web"
            boolean r8 = android.text.TextUtils.equals(r8, r10)
            if (r8 == 0) goto L_0x0128
            java.lang.String r8 = c((com.ss.android.ugc.aweme.feed.model.Aweme) r17)
            goto L_0x012a
        L_0x0128:
            java.lang.String r8 = ""
        L_0x012a:
            com.ss.android.ugc.aweme.feed.model.CardStruct r10 = m(r17)
            boolean r10 = a((com.ss.android.ugc.aweme.feed.model.CardStruct) r10)
            if (r10 == 0) goto L_0x0148
            android.net.Uri r8 = android.net.Uri.parse(r8)
            android.net.Uri$Builder r8 = r8.buildUpon()
            java.lang.String r10 = "type"
            java.lang.String r11 = "3"
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r10, r11)
            java.lang.String r8 = r8.toString()
        L_0x0148:
            java.lang.String r10 = "url"
            r2.putString(r10, r8)
            java.lang.String r8 = "ad_id"
            r2.putLong(r8, r3)
            java.lang.String r3 = "ad_type"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r17.getAwemeRawAd()
            java.lang.String r4 = r4.getType()
            r2.putString(r3, r4)
            java.lang.String r3 = "ad_system_origin"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r17.getAwemeRawAd()
            int r4 = r4.getSystemOrigin()
            r2.putInt(r3, r4)
            java.lang.String r3 = "aweme_id"
            java.lang.String r4 = r17.getAid()
            r2.putString(r3, r4)
            java.lang.String r3 = "show_load_dialog"
            r2.putBoolean(r3, r9)
            java.lang.String r3 = "bundle_download_app_log_extra"
            r2.putString(r3, r5)
            java.lang.String r3 = "bundle_download_url"
            r2.putString(r3, r6)
            java.lang.String r3 = "bundle_ad_quick_app_url"
            r2.putString(r3, r7)
            java.lang.String r3 = "bundle_forbidden_jump"
            r2.putBoolean(r3, r1)
            java.lang.String r1 = "bundle_show_download_status_bar"
            r2.putBoolean(r1, r9)
            java.lang.String r1 = "SM-G9550"
            java.lang.String r3 = android.os.Build.MODEL
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 == 0) goto L_0x01ab
            java.lang.String r1 = "samsung"
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r3 = r3.toLowerCase()
            boolean r1 = android.text.TextUtils.equals(r1, r3)
            if (r1 != 0) goto L_0x01b0
        L_0x01ab:
            java.lang.String r1 = "bundle_fix_webview"
            r2.putBoolean(r1, r9)
        L_0x01b0:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r17.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.feed.b.c r1 = r1.getPreloadData()
            if (r1 == 0) goto L_0x01c3
            java.lang.String r3 = "preload_site_id"
            java.lang.String r1 = r1.getSiteId()
            r2.putString(r3, r1)
        L_0x01c3:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r17.getAwemeRawAd()
            int r0 = r0.getPreloadWeb()
            java.lang.String r1 = "preload_web_status"
            r2.putInt(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.c.I(com.ss.android.ugc.aweme.feed.model.Aweme):android.os.Bundle");
    }

    public static String a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32222, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32222, new Class[]{Aweme.class}, String.class);
        }
        String str = "";
        if (aweme != null && aweme.isAd()) {
            str = aweme.getAwemeRawAd().getDownloadUrl();
        }
        return str;
    }

    public static String b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32223, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32223, new Class[]{Aweme.class}, String.class);
        }
        String str = "";
        if (aweme != null && aweme.isAd()) {
            str = aweme.getAwemeRawAd().getFormUrl();
        }
        return str;
    }

    public static String c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39774a, true, 32224, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39774a, true, 32224, new Class[]{Aweme.class}, String.class);
        }
        String str = "";
        if (aweme != null && aweme.isAd()) {
            str = aweme.getAwemeRawAd().getWebUrl();
        }
        return str;
    }

    public static boolean d(Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, null, f39774a, true, 32273, new Class[]{Challenge.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{challenge}, null, f39774a, true, 32273, new Class[]{Challenge.class}, Boolean.TYPE)).booleanValue();
        } else if (challenge != null && !TextUtils.isEmpty(challenge.getLinkText()) && !TextUtils.isEmpty(challenge.getLinkAction())) {
            return true;
        } else {
            return false;
        }
    }

    public static void b(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, null, f39774a, true, 32221, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, null, f39774a, true, 32221, new Class[]{FeedItemList.class}, Void.TYPE);
        } else if (feedItemList2 != null && !CollectionUtils.isEmpty(feedItemList2.items)) {
            int size = feedItemList2.items.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = feedItemList2.items.get(i);
                if (t(aweme)) {
                    Context applicationContext = k.a().getApplicationContext();
                    if (PatchProxy.isSupport(new Object[]{applicationContext, aweme}, null, g.f39316a, true, 31516, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{applicationContext, aweme}, null, g.f39316a, true, 31516, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                    } else {
                        JSONObject f2 = g.f(applicationContext, aweme, "receive_ad");
                        if (PatchProxy.isSupport(new Object[]{applicationContext, "receive", aweme, f2}, null, g.f39316a, true, 31706, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE)) {
                            Object[] objArr = {applicationContext, "receive", aweme, f2};
                            Object[] objArr2 = objArr;
                            PatchProxy.accessDispatch(objArr2, null, g.f39316a, true, 31706, new Class[]{Context.class, String.class, Aweme.class, JSONObject.class}, Void.TYPE);
                        } else if (g.S(applicationContext, aweme)) {
                            g.a(applicationContext, "receive_ad", "receive", f2, aweme.getAwemeRawAd());
                        }
                    }
                }
            }
        }
    }

    public static boolean c(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f39774a, true, 32303, new Class[]{User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, null, f39774a, true, 32303, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || user.getQuickShopInfo() == null || TextUtils.isEmpty(user.getQuickShopInfo().getQuickShopUrl()) || user.getQuickShopInfo().getSecondFloorInfo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public static List<Aweme> a(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f39774a, true, 32220, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f39774a, true, 32220, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (Aweme next : list) {
            if (next != null && !next.isAd()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static boolean b(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f39774a, true, 32276, new Class[]{i.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iVar}, null, f39774a, true, 32276, new Class[]{i.class}, Boolean.TYPE)).booleanValue();
        }
        String a2 = a(iVar);
        if (TextUtils.equals(a2, "web") || TextUtils.equals(a2, "gif") || TextUtils.equals(a2, "webp")) {
            return true;
        }
        return false;
    }

    public static String a(String str, String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2}, null, f39774a, true, 32307, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str2}, null, f39774a, true, 32307, new Class[]{String.class, String.class}, String.class);
        }
        if (b(str)) {
            str3 = str3.replace("__back_url__", Uri.encode(str2));
        }
        return str3;
    }
}
