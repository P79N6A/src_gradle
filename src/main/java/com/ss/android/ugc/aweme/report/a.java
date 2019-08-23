package com.ss.android.ugc.aweme.report;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63552a;

    public static void a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f63552a, true, 70688, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, null, f63552a, true, 70688, new Class[]{Map.class}, Void.TYPE);
        } else if (map2 != null) {
            r.a("tip_off", (Map) map2);
        }
    }

    public static String a(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f63552a, true, 70682, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f63552a, true, 70682, new Class[]{Aweme.class}, String.class);
        } else if (aweme.getAwemeType() == 13) {
            return "forward";
        } else {
            if (aweme.getAwemeType() == 2) {
                return "image";
            }
            if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53) {
                return "video";
            }
            if (aweme.getAwemeType() == 34) {
                return "video";
            }
            if (c.u(aweme)) {
                return "douplus";
            }
            if (aweme.isAd()) {
                return "ad";
            }
            return "";
        }
    }

    public static void a(Activity activity, Uri.Builder builder) {
        boolean z;
        String str;
        Activity activity2 = activity;
        Uri.Builder builder2 = builder;
        if (PatchProxy.isSupport(new Object[]{activity2, builder2}, null, f63552a, true, 70687, new Class[]{Activity.class, Uri.Builder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, builder2}, null, f63552a, true, 70687, new Class[]{Activity.class, Uri.Builder.class}, Void.TYPE);
        } else if (activity2 != null) {
            boolean a2 = com.ss.android.g.a.a();
            if (a2 || d.a().isLogin()) {
                User curUser = d.a().getCurUser();
                if (curUser == null || !curUser.isDisciplineMember()) {
                    z = false;
                } else {
                    z = true;
                }
                if (a2) {
                    str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getReportUrl();
                } else {
                    str = "https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html";
                }
                Uri parse = Uri.parse(str);
                builder2.scheme(parse.getScheme());
                builder2.authority(parse.getAuthority());
                builder2.path(parse.getPath());
                if (((Boolean) SharePrefCache.inst().getIsFirstReportVideo().c()).booleanValue() && !z) {
                    builder2.appendQueryParameter("isFirst", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                Intent intent = new Intent(activity2, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", false);
                bundle.putBoolean("hide_nav_bar", true);
                bundle.putString("status_bar_color", activity.getResources().getString(C0906R.color.yx).replace("#", ""));
                intent.putExtras(bundle);
                intent.setData(builder.build());
                activity2.startActivity(intent);
                return;
            }
            e.a(activity2, builder.build().getQueryParameter("report_from"), "report");
        }
    }

    public static void a(Activity activity, String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{activity, str, str2, str3}, null, f63552a, true, 70685, new Class[]{Activity.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, str2, str3};
            PatchProxy.accessDispatch(objArr, null, f63552a, true, 70685, new Class[]{Activity.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        a(activity, str, str2, str3, "", false, null);
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4, boolean z, Map<String, String> map) {
        boolean z2;
        String str5;
        Activity activity2 = activity;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{activity2, str6, str7, str8, str9, Byte.valueOf(z ? (byte) 1 : 0), map2}, null, f63552a, true, 70686, new Class[]{Activity.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str6, str7, str8, str9, Byte.valueOf(z), map2}, null, f63552a, true, 70686, new Class[]{Activity.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Map.class}, Void.TYPE);
        } else if (activity2 != null) {
            boolean a2 = com.ss.android.g.a.a();
            if (a2 || d.a().isLogin()) {
                StringBuilder sb = new StringBuilder();
                User curUser = d.a().getCurUser();
                if (curUser != null) {
                    z2 = curUser.isDisciplineMember();
                } else {
                    z2 = false;
                }
                if (a2) {
                    str5 = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getReportUrl();
                } else {
                    str5 = "https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html";
                }
                try {
                    sb.append(str5);
                    sb.append("?object_id=");
                    sb.append(str7);
                    sb.append("&owner_id=");
                    sb.append(str8);
                    sb.append("&report_type=");
                    sb.append(str6);
                    if (a2) {
                        sb.append("&locale=");
                        sb.append(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
                        if (!TextUtils.isEmpty(str4)) {
                            sb.append("&video_owner_id=");
                            sb.append(str9);
                        }
                    }
                    if (z) {
                        sb.append("&spam=true");
                    }
                    if (((Boolean) SharePrefCache.inst().getIsFirstReportVideo().c()).booleanValue() && !z2) {
                        sb.append("&isFirst=1");
                    }
                    if (map2 != null && !map.isEmpty()) {
                        for (String next : map.keySet()) {
                            sb.append("&");
                            sb.append(next);
                            sb.append("=");
                            sb.append(map2.get(next));
                        }
                    }
                } catch (Exception unused) {
                }
                Intent intent = new Intent(activity2, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", false);
                bundle.putBoolean("hide_nav_bar", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(sb.toString()));
                activity2.startActivity(intent);
                return;
            }
            e.a(activity2, "report", "");
        }
    }
}
