package com.ss.android.ugc.awemepushlib.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.awemepushlib.interaction.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76959a;

    public static Intent a(Context context, c cVar) {
        if (PatchProxy.isSupport(new Object[]{context, cVar}, null, f76959a, true, 90359, new Class[]{Context.class, c.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context, cVar}, null, f76959a, true, 90359, new Class[]{Context.class, c.class}, Intent.class);
        }
        Intent intent = null;
        if (!StringUtils.isEmpty(cVar.openUrl)) {
            Uri parse = Uri.parse(cVar.openUrl);
            String scheme = parse.getScheme();
            if (e.f34152b.equals(scheme)) {
                cVar.openUrl = j.a().tryConvertScheme(cVar.openUrl);
                parse = Uri.parse(cVar.openUrl);
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            if (j.a().isSelfScheme(scheme)) {
                intent2.putExtra(f.f34169c, true);
            }
            if (cVar.extra.pre_o_urls.size() > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it2 = cVar.extra.pre_o_urls.iterator();
                while (it2.hasNext()) {
                    arrayList.add(j.a().tryConvertScheme(it2.next()));
                }
                intent2.putExtra("pre_o_urls", arrayList);
            }
            if (!TextUtils.isEmpty(cVar.extra.push_user_id)) {
                intent2.putExtra("push_user_id", cVar.extra.push_user_id);
            }
            intent2.setData(parse);
            j.a().interceptAppNotifyUrl(cVar.openUrl, cVar.preloadArticle);
            intent = intent2;
        } else if (cVar.appData != null) {
            int optInt = cVar.appData.optInt("t", 0);
            int optInt2 = cVar.appData.optInt("p", 0);
            long optLong = cVar.appData.optLong("uid", 0);
            if (optInt == 1) {
                intent = a(context, optInt2, optLong);
            }
            if (intent == null) {
                intent = j.a().getAppNotifyIntent(context, optInt, optInt2, cVar.appData, cVar.preloadArticle);
            }
            if (intent != null && StringUtils.isEmpty(intent.getDataString())) {
                intent.setData(Uri.parse("ssnotify://common/" + optInt + optInt2 + optLong));
            }
        }
        if (intent == null) {
            intent = ToolUtils.getLaunchIntentForPackage(context, context.getPackageName());
        }
        return intent;
    }

    private static Intent a(Context context, int i, long j) {
        Context context2 = context;
        int i2 = i;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), new Long(j2)}, null, f76959a, true, 90360, new Class[]{Context.class, Integer.TYPE, Long.TYPE}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), new Long(j2)}, null, f76959a, true, 90360, new Class[]{Context.class, Integer.TYPE, Long.TYPE}, Intent.class);
        }
        Intent intent = null;
        if (i2 != 1) {
            switch (i2) {
                case 3:
                    intent = j.a().getProfileAddFriendIntent(context2);
                    intent.addFlags(536870912);
                    intent.putExtra("from_notification", true);
                    break;
                case 4:
                    if (j2 > 0) {
                        intent = j.a().getUserProfileIntent(context, j, "", "", "");
                        intent.putExtra("from_notification", true);
                        break;
                    }
                    break;
            }
        } else {
            intent = j.a().getProfileFanFriendIntent(context2);
            intent.addFlags(536870912);
            intent.putExtra("from_notification", true);
        }
        return intent;
    }

    @NonNull
    public static Map<String, String> a(c cVar, int i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f76959a, true, 90358, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i), Byte.valueOf(z)}, null, f76959a, true, 90358, new Class[]{c.class, Integer.TYPE, Boolean.TYPE}, Map.class);
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("rule_id", String.valueOf(cVar2.id));
            if (!TextUtils.isEmpty(cVar2.openUrl)) {
                Uri parse = Uri.parse(cVar2.openUrl);
                if (parse != null) {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("push_id"))) {
                        hashMap.put("rule_id", parse.getQueryParameter("push_id"));
                    }
                    if (!TextUtils.isEmpty(parse.getQueryParameter("gd_label"))) {
                        hashMap.put("push_label", parse.getQueryParameter("gd_label"));
                    }
                    String host = parse.getHost();
                    if ("detail".equals(host) && !TextUtils.isEmpty(parse.getQueryParameter("id"))) {
                        hashMap.put("group_id", parse.getQueryParameter("id"));
                    } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(parse.getLastPathSegment())) {
                        hashMap.put("group_id", parse.getLastPathSegment());
                    }
                    String path = parse.getPath();
                    if ("challenge".equals(host) && !TextUtils.isEmpty(path) && path.contains("detail")) {
                        hashMap.put("tag_id", parse.getLastPathSegment());
                    }
                }
            }
            String str6 = "unknown";
            switch (i) {
                case 1:
                    str6 = "MI";
                    break;
                case 2:
                    str6 = "MYSELF";
                    break;
                case 3:
                    str6 = "IXINTUI";
                    break;
                case 4:
                    str6 = "GETUI";
                    break;
                case 5:
                    str6 = "GCM";
                    break;
                case 6:
                    str6 = "UMENG";
                    break;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    str6 = "HW";
                    break;
                case 8:
                    str6 = "MZ";
                    break;
                case 9:
                    str6 = "ALIYUN";
                    break;
                case 10:
                    str6 = "OPPO";
                    break;
            }
            hashMap.put("push_channel", str6);
            if (cVar2.extra.turn_screen_on) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            hashMap.put("push_delay", str);
            hashMap.put("post_back", cVar2.postBack);
            if (z) {
                str2 = "notify";
            } else {
                str2 = "alert";
            }
            hashMap.put("click_position", str2);
            if (cVar2.extra.style == 5) {
                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str3 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            hashMap.put("mediastyle", str3);
            if (TextUtils.isEmpty(cVar2.extra.bg_color)) {
                str4 = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            hashMap.put("colorized", str4);
            if (cVar2.extra.isBannerDeteled) {
                str5 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str5 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            hashMap.put("is_banner_deleted", str5);
            if (cVar2.extra != null) {
                if (!TextUtils.isEmpty(cVar2.extra.authorId)) {
                    hashMap.put("author_id", cVar2.extra.authorId);
                }
                if (!TextUtils.isEmpty(cVar2.extra.roomId)) {
                    hashMap.put("room_id", cVar2.extra.roomId);
                }
                if (!TextUtils.isEmpty(cVar2.extra.userId)) {
                    hashMap.put("user_id", cVar2.extra.userId);
                }
                if (!TextUtils.isEmpty(cVar2.extra.musicId)) {
                    hashMap.put("music_id", cVar2.extra.musicId);
                }
                if (!TextUtils.isEmpty(cVar2.extra.challengeId)) {
                    hashMap.put("tag_id", cVar2.extra.challengeId);
                }
                if (!TextUtils.isEmpty(cVar2.extra.tagId)) {
                    hashMap.put("tag_id", cVar2.extra.tagId);
                }
                if (!TextUtils.isEmpty(cVar2.extra.poiId)) {
                    hashMap.put("poi_id", cVar2.extra.poiId);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
