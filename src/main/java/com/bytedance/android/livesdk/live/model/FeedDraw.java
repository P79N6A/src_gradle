package com.bytedance.android.livesdk.live.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

@Keep
public class FeedDraw {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("settings")
    private Map<String, Integer> settings = new HashMap();
    @SerializedName("url")
    private String url;

    public Map<String, Integer> getSettings() {
        return this.settings;
    }

    public String getUrl() {
        return this.url;
    }

    public static FeedDraw defaultInstance() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 10348, new Class[0], FeedDraw.class)) {
            return (FeedDraw) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 10348, new Class[0], FeedDraw.class);
        }
        FeedDraw feedDraw = new FeedDraw();
        if (a.a()) {
            feedDraw.url = "https://" + ((h) b.a(h.class)).b() + "/webcast/feed/?content_type=0&channel_id=25&is_draw=1";
        } else if (a.d()) {
            feedDraw.url = "https://" + ((h) b.a(h.class)).b() + "/webcast/feed/?content_type=0&channel_id=60487708007&is_draw=1";
        } else {
            feedDraw.url = "";
        }
        return feedDraw;
    }

    public static boolean needCollectUnRead(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 10350, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 10350, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!StringUtils.isEmpty(str) && !str2.startsWith("homepage_follow_stream")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSupportedRequestFrom(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 10347, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 10347, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            Integer num = this.settings.get(str2);
            if (num == null || num.intValue() != 1) {
                return false;
            }
            return true;
        }
    }

    public static String conventRequestFrom(@Nullable String str, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, changeQuickRedirect, true, 10349, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, changeQuickRedirect, true, 10349, new Class[]{String.class, String.class}, String.class);
        } else if (a.a()) {
            if (str3 == null) {
                return "";
            }
            if (str3.equals("homepage_hot")) {
                return "homepage_hot_head";
            }
            if (str3.equals("homepage_fresh")) {
                return "homepage_fresh_head";
            }
            if (str3.equals("homepage_follow")) {
                if (str4.equals("live_cell_cover") || str4.equals("live_cell")) {
                    return "homepage_follow_stream";
                }
                return "";
            } else if (str3.equals("others_homepage")) {
                if (str4 == null) {
                    return "";
                }
                if (str4.equals("others_photo")) {
                    return "others_homepage_photo";
                }
                if (str4.equals("video_head")) {
                    return "others_homepage_head";
                }
                return "";
            } else if (str3.equals("general_search")) {
                if (str4 == null) {
                    return "";
                }
                if (str4.equals("others_photo")) {
                    return "general_search_photo";
                }
                if (str4.equals("video_head")) {
                    return "general_search_head";
                }
                return "";
            } else if (str3.equals("live_detail")) {
                return "live_detail_hourly_rank";
            } else {
                if (str3.equals("live_end")) {
                    return "live_end_cover";
                }
                if (str3.equals("push")) {
                    return "push";
                }
                if (str3.equals("h5")) {
                    return "h5";
                }
                return "";
            }
        } else if (!a.d()) {
            return "";
        } else {
            if (str3 == null || str4 == null) {
                return "";
            }
            if (!str3.equals("video") || !str4.equals("video_head")) {
                return "";
            }
            return "homepage_hot_head";
        }
    }
}
