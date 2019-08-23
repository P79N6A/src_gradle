package com.ss.android.ugc.awemepushlib.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.ss.android.ugc.aweme.app.f;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class c implements com.ss.android.ugc.awemepushapi.c, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int alertType;
    public transient JSONObject appData;
    public String callback;
    public a extra;
    public int filter = 1;
    public boolean functionalPush;
    public int id;
    public int imageType;
    public String imageUrl;
    public int isPing;
    public boolean led;
    public String openUrl;
    public transient JSONObject originData;
    public int pass_through = 1;
    public String postBack;
    public boolean preloadArticle;
    public String rawJson;
    public boolean sound;
    public String soundUrl;
    public String text;
    public String title;
    public boolean useSound;
    public boolean vibrator;

    public static final class a implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean allowBannerDelete = true;
        public String authorId;
        public int badgeCount = -1;
        public String bg_color = "";
        public String challengeId;
        public String extra_text;
        public int floatWindow = -1;
        public long float_window_show_time = 12000;
        public boolean isBannerDeteled;
        public boolean isGroupSummary = true;
        public boolean isZeroVibrate = true;
        public boolean is_notification_top;
        public String largeModeIconUrl;
        public String musicId;
        public int notificaitonPriority = 1;
        public int oppoFloatWindow = -2;
        public int oppo_push_style = 11;
        public String poiId;
        public ArrayList<String> pre_o_urls = new ArrayList<>();
        public String push_user_id;
        public String rawExtra;
        public int redBadgeOnly = -1;
        public String roomId;
        public String soundId;
        public String soundUrl;
        public long stickTopOffset;
        public int stick_top;
        public int style = -1;
        public String tagId;
        public boolean turn_screen_on;
        public boolean useAssetSound;
        public String userId;
        public boolean user_system_style;
        public float volumeFactor = 1.0f;

        public final String toJsonString() {
            return this.rawExtra;
        }

        public final int getPriority() {
            if (this.notificaitonPriority > 2) {
                return 2;
            }
            if (this.notificaitonPriority < -2) {
                return -2;
            }
            return this.notificaitonPriority;
        }

        static a a(String str) {
            boolean z;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90362, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90362, new Class[]{String.class}, a.class);
            }
            a aVar = new a();
            try {
                aVar.rawExtra = str2;
                if (TextUtils.isEmpty(str)) {
                    return aVar;
                }
                JSONObject jSONObject = new JSONObject(str2);
                aVar.soundUrl = jSONObject.optString("surl");
                aVar.soundId = null;
                aVar.badgeCount = jSONObject.optInt("badge", -1);
                aVar.redBadgeOnly = jSONObject.optInt("red_badge_only", -1);
                if (!TextUtils.isEmpty(aVar.soundUrl)) {
                    aVar.soundId = DigestUtils.md5Hex(aVar.soundUrl);
                }
                aVar.volumeFactor = (float) jSONObject.optDouble("vfac", 1.0d);
                aVar.stickTopOffset = jSONObject.optLong("stof");
                if (jSONObject.optInt("sdef") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.useAssetSound = z;
                aVar.redBadgeOnly = jSONObject.optInt("red_badge_only");
                aVar.largeModeIconUrl = jSONObject.optString("large_mode_icon");
                aVar.turn_screen_on = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "turn_screen_on", false);
                aVar.user_system_style = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "use_system_style", true);
                aVar.is_notification_top = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "is_notification_top", false);
                aVar.stick_top = jSONObject.optInt("stick_top", 0);
                aVar.floatWindow = jSONObject.optInt("show_float_window", -1);
                aVar.oppoFloatWindow = jSONObject.optInt("show_float_window", -2);
                aVar.float_window_show_time = jSONObject.optLong("float_window_show_time", 12000);
                aVar.oppo_push_style = jSONObject.optInt("oppo_push_style", 11);
                aVar.isZeroVibrate = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "is_zero_vibrate", true);
                aVar.bg_color = jSONObject.optString("bg_color", "");
                aVar.style = jSONObject.optInt(NotificationStyle.TAG, -1);
                aVar.isGroupSummary = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "is_group_summary", true);
                aVar.extra_text = jSONObject.optString("extra_text");
                aVar.authorId = jSONObject.optString("author_id");
                aVar.roomId = jSONObject.optString("room_id");
                aVar.userId = jSONObject.optString("user_id");
                aVar.musicId = jSONObject.optString("music_id");
                aVar.tagId = jSONObject.optString("tag_id");
                aVar.challengeId = jSONObject.optString("challenge_id");
                aVar.poiId = jSONObject.optString("poi_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("pre_o_urls");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    aVar.pre_o_urls.clear();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.optString(i);
                        if (!TextUtils.isEmpty(optString)) {
                            aVar.pre_o_urls.add(optString);
                        }
                    }
                }
                aVar.push_user_id = jSONObject.optString("push_user_id");
                aVar.allowBannerDelete = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "allow_banner_delete", true);
                aVar.notificaitonPriority = jSONObject.optInt("push_priority", 1);
                return aVar;
            } catch (Throwable unused) {
                return aVar;
            }
        }
    }

    public JSONObject getOriginData() {
        return this.originData;
    }

    public static c from(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 90361, new Class[]{String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 90361, new Class[]{String.class}, c.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            c cVar = new c();
            cVar.rawJson = str2;
            try {
                JSONObject jSONObject = new JSONObject(str2);
                cVar.originData = jSONObject;
                cVar.id = jSONObject.optInt("id", 0);
                cVar.title = jSONObject.optString(PushConstants.TITLE);
                cVar.text = jSONObject.optString("text");
                cVar.pass_through = jSONObject.optInt("pass_through", 1);
                cVar.openUrl = jSONObject.optString(f.f34168b);
                cVar.imageUrl = jSONObject.optString("image_url");
                cVar.callback = jSONObject.optString("callback");
                cVar.isPing = jSONObject.optInt("is_ping", 0);
                cVar.imageType = jSONObject.optInt("image_type");
                cVar.filter = jSONObject.optInt("filter", 1);
                cVar.alertType = jSONObject.optInt("alert_type", 0);
                String optString = jSONObject.optString("extra_str");
                cVar.postBack = jSONObject.optString("post_back");
                cVar.led = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "use_led", false);
                cVar.sound = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "sound", false);
                cVar.vibrator = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "use_vibrator", false);
                cVar.preloadArticle = com.ss.android.ugc.awemepushlib.c.a.a(jSONObject, "preload_article", false);
                cVar.appData = jSONObject.optJSONObject("app_data");
                cVar.extra = a.a(optString);
                if (cVar.extra.style >= 0 && cVar.extra.style <= 8) {
                    cVar.imageType = cVar.extra.style;
                }
                if (!TextUtils.isEmpty(cVar.openUrl)) {
                    try {
                        cVar.functionalPush = PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(Uri.parse(cVar.openUrl).getQueryParameter("functional_push"));
                    } catch (Throwable unused) {
                    }
                }
                return cVar;
            } catch (Throwable unused2) {
                return null;
            }
        }
    }
}
