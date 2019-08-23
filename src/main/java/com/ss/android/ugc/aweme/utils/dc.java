package com.ss.android.ugc.aweme.utils;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.regex.Pattern;

public final class dc {

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f75732a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f75733b = {"top", "com.cn", "com", "net", "org", "edu", "gov", "int", "mil", AdvanceSetting.CLEAR_NOTIFICATION, "tel", "biz", "cc", "tv", "info", "name", "hk", "mobi", "asia", "cd", "travel", "pro", "museum", "coop", "aero", "ad", "ae", "af", "ag", "ai", "al", "am", "an", "ao", "aq", "ar", AdvanceSetting.ADVANCE_SETTING, "at", ActVideoSetting.ACT_URL, "aw", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", NotificationStyle.BANNER_IMAGE_URL, "bj", "bm", "bn", "bo", "br", NotificationStyle.BASE_STYLE, "bt", "bv", "bw", "by", "bz", "ca", "cc", "cf", "cg", "ch", "ci", "ck", "cl", "cm", AdvanceSetting.CLEAR_NOTIFICATION, "co", "cq", "cr", "cu", "cv", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "es", "et", "ev", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gh", "gi", "gl", "gm", "gn", "gp", "gr", "gt", "gu", "gw", "gy", "hk", "hm", AdvanceSetting.HEAD_UP_NOTIFICATION, "hr", "ht", "hu", "id", "ie", "il", "in", "io", "iq", "ir", "is", AdvanceSetting.NETWORK_TYPE, "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", AppIconSetting.LARGE_ICON_URL, "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "mg", "mh", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nt", "nu", "nz", "om", "qa", "pa", "pe", "pf", "pg", "ph", PushConstants.URI_PACKAGE_NAME, "pl", "pm", "pn", "pr", "pt", "pw", "py", "re", "ro", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", TimeDisplaySetting.START_SHOW_TIME, "su", "sy", "sz", "tc", TimeDisplaySetting.TIME_DISPLAY, "tf", "tg", "th", "tj", "tk", "tm", "tn", "to", "tp", "tr", PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, "tv", "tw", "tz", "ua", "ug", "uk", "us", "uy", "va", "vc", "ve", "vg", "vn", "vu", "wf", "ws", "ye", "yu", "za", "zm", "zr", "zw"};

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (String append : f75733b) {
            sb.append(append);
            sb.append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        f75732a = Pattern.compile("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\." + sb.toString() + "(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))");
    }
}
