package com.ss.android.ugc.aweme.u;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.poi.e.p;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75004a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f75005b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f75006c = "";

    public static String b() {
        return f75005b;
    }

    public static String a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f75004a, true, 58895, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f75004a, true, 58895, new Class[]{String.class, Integer.TYPE}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            return a.a().d(str2 + i).f44615a;
        }
    }

    public static JSONObject a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f75004a, true, 58918, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map2}, null, f75004a, true, 58918, new Class[]{Map.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        if (map2 != null) {
            for (String next : map.keySet()) {
                try {
                    if (TextUtils.equals("log_pb", next)) {
                        jSONObject.put(next, new JSONObject(map2.get(next)));
                    } else {
                        jSONObject.put(next, map2.get(next));
                    }
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f75004a, true, 58897, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75004a, true, 58897, new Class[0], String.class);
        }
        NearbyCities.CityBean b2 = c.b();
        if (b2 == null) {
            NearbyCities.CityBean c2 = c.c();
            if (c2 == null) {
                return "";
            }
            if (c2.code == null) {
                return "";
            }
            return c2.code;
        } else if (b2.code == null) {
            return "";
        } else {
            return b2.code;
        }
    }

    @Deprecated
    public static String c(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getRequestId() != null) {
            return aweme.getRequestId();
        }
        return "";
    }

    public static String a(Music music) {
        if (PatchProxy.isSupport(new Object[]{music}, null, f75004a, true, 58921, new Class[]{Music.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{music}, null, f75004a, true, 58921, new Class[]{Music.class}, String.class);
        } else if (music == null) {
            return "";
        } else {
            return music.getMusicName();
        }
    }

    public static String b(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75004a, true, 58923, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f75004a, true, 58923, new Class[]{User.class}, String.class);
        } else if (user == null) {
            return "";
        } else {
            return user.getUid();
        }
    }

    public static String f(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58917, new Class[]{String.class}, String.class)) {
            return a(str2, 0);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58917, new Class[]{String.class}, String.class);
    }

    public static String m(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58909, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58909, new Class[]{Aweme.class}, String.class);
        } else if (aweme != null) {
            return aweme.getAid();
        } else {
            return "";
        }
    }

    public static String q(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58924, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58924, new Class[]{Aweme.class}, String.class);
        } else if (aweme != null) {
            return aweme.getAuthorUid();
        } else {
            return "";
        }
    }

    public static int b(Music music) {
        if (PatchProxy.isSupport(new Object[]{music}, null, f75004a, true, 58922, new Class[]{Music.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{music}, null, f75004a, true, 58922, new Class[]{Music.class}, Integer.TYPE)).intValue();
        } else if (music == null) {
            return 0;
        } else {
            return music.getUserCount();
        }
    }

    public static boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58914, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58914, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!p.b()) {
            return false;
        } else {
            if ("homepage_fresh".equalsIgnoreCase(str2) || "poi_page".equalsIgnoreCase(str2) || "poi_page_hot".equalsIgnoreCase(str2) || "poi_page_new".equalsIgnoreCase(str2) || "categorized_city_poi".equalsIgnoreCase(str2)) {
                return true;
            }
            return false;
        }
    }

    public static String d(Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58896, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58896, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            if (aweme2 == null || !aweme2.isImage()) {
                return PushConstants.PUSH_TYPE_NOTIFY;
            }
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
    }

    public static String e(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58898, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58898, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getPoiStruct() != null) {
                return aweme.getPoiStruct().getPoiId();
            }
            return "";
        }
    }

    public static String f(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58899, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58899, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getPoiStruct() != null) {
                return aweme.getPoiStruct().getBackendTypeCode();
            }
            return "";
        }
    }

    public static String g(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58900, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58900, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getPoiStruct() != null) {
                return aweme.getPoiStruct().getPoiName();
            }
            return "";
        }
    }

    public static String h(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58901, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58901, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getPoiStruct() != null) {
                return String.valueOf(aweme.getPoiStruct().typeCode);
            }
            return "";
        }
    }

    public static String i(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58905, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58905, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            return b(aweme.getDistance());
        }
    }

    public static Long j(@Nullable Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58906, new Class[]{Aweme.class}, Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58906, new Class[]{Aweme.class}, Long.class);
        }
        long j = 0;
        if (aweme == null) {
            return 0L;
        }
        if (aweme.getAwemeType() == 13) {
            aweme2 = aweme.getForwardItem();
        } else {
            aweme2 = aweme;
        }
        if (aweme2 == null) {
            return 0L;
        }
        if (aweme2.getMusic() != null) {
            j = aweme2.getMusic().getId();
        }
        return Long.valueOf(j);
    }

    public static String k(@Nullable Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58907, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58907, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            if (aweme2 == null) {
                return "";
            }
            if (aweme2.getMusic() == null) {
                return "";
            }
            return aweme2.getMusic().getId();
        }
    }

    public static String l(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58908, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58908, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            int awemeType = aweme.getAwemeType();
            if (awemeType == 2) {
                return "photo";
            }
            if (awemeType != 101) {
                return "video";
            }
            return "live";
        }
    }

    public static String n(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58910, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58910, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.isImage()) {
                return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public static String o(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58911, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58911, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.isImage()) {
                return "photo";
            }
            return "video";
        }
    }

    public static boolean p(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58919, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58919, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || !TextUtils.equals(aweme.getAuthorUid(), d.a().getCurUserId())) {
            return false;
        } else {
            return true;
        }
    }

    public static String r(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58925, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58925, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null || aweme.getAuthor() == null) {
            return "";
        } else {
            return aweme.getAuthor().getSecUid();
        }
    }

    public static String s(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58927, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58927, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getDistributeType() == 1) {
                return "short";
            }
            if (aweme.getDistributeType() == 2) {
                return "long_direct";
            }
            if (aweme.getDistributeType() == 3) {
                return "long_with_short";
            }
            return "";
        }
    }

    public static String a(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58891, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58891, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            if (aweme.getAuthor() != null) {
                return aweme.getAuthor().getUid();
            }
            return "";
        }
    }

    public static String b(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f75004a, true, 58893, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f75004a, true, 58893, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            User author = aweme.getAuthor();
            if (author == null || !author.isLive()) {
                return "";
            }
            return author.roomId;
        }
    }

    public static boolean d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58915, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58915, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if ("homepage_hot".equals(str2) || "homepage_follow".equals(str2) || "rec_follow".equals(str2) || "homepage_fresh".equals(str2) || "general_search".equals(str2) || "search_result".equals(str2) || "search_sug".equals(str2) || "others_homepage".equals(str2) || "find_friends".equals(str2) || "categorized_city_poi".equalsIgnoreCase(str2) || "challenge".equalsIgnoreCase(str2) || "hot_search_video_board".equals(str2) || "homepage_country".equals(str2) || "find_friends".equals(str2) || "homepage_friends".equals(str2) || "personal_homepage".equals(str2) || "playlist".equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean e(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58916, new Class[]{String.class}, Boolean.TYPE)) {
            return "homepage_hot".equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58916, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static String g(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58926, new Class[]{String.class}, String.class)) {
            return ai.a().a(a(str2, 0));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58926, new Class[]{String.class}, String.class);
    }

    public static String b(String str) {
        float f2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58913, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58913, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            if ("<1km".equalsIgnoreCase(str2)) {
                return "type_0_1";
            }
            if (">100km".equalsIgnoreCase(str2)) {
                return "type_20+";
            }
            int indexOf = str2.indexOf("km");
            if (indexOf == -1) {
                return "";
            }
            try {
                f2 = Float.parseFloat(str2.substring(0, indexOf));
            } catch (Exception unused) {
                f2 = 0.0f;
            }
            if (f2 <= 1.0f) {
                return "type_0_1";
            }
            if (f2 > 1.0f && f2 <= 3.0f) {
                return "type_1_3";
            }
            if (f2 > 3.0f && f2 <= 5.0f) {
                return "type_3_5";
            }
            if (f2 > 5.0f && f2 <= 10.0f) {
                return "type_5_10";
            }
            if (f2 > 10.0f && f2 <= 20.0f) {
                return "type_10_20";
            }
            if (f2 > 20.0f) {
                return "type_20+";
            }
            return "";
        }
    }

    public static String a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f75004a, true, 58892, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f75004a, true, 58892, new Class[]{User.class}, String.class);
        } else if (user != null) {
            return user.getUid();
        } else {
            return "";
        }
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75004a, true, 58912, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75004a, true, 58912, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            int indexOf = str2.indexOf("km");
            if (indexOf != -1) {
                return str2.substring(0, indexOf);
            }
            return "";
        }
    }

    public static String a(Aweme aweme, int i) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, null, f75004a, true, 58894, new Class[]{Aweme.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, null, f75004a, true, 58894, new Class[]{Aweme.class, Integer.TYPE}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            return a.a().d(aweme.getAid() + i).f44615a;
        }
    }
}
