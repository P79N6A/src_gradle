package com.douyin.share.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.common.utility.StringUtils;
import com.douyin.share.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static String f23139a = "100290348";

    /* renamed from: b  reason: collision with root package name */
    private static int f23140b = 5656;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f23141c;

    public static String a() {
        return f23139a;
    }

    private static int a(boolean z) {
        int i = f23140b + 1;
        f23140b = i;
        if (i > 6656) {
            f23140b = 5656;
        }
        f23141c = z;
        return f23140b;
    }

    static String a(Context context) {
        String a2 = a(context, "com.tencent.mobileqq");
        if (StringUtils.isEmpty(a2)) {
            return a(context, "com.tencent.minihd.qq");
        }
        return a2;
    }

    static int a(String str, String str2) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (i < split.length && i < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i++;
            } catch (NumberFormatException unused) {
                return str.compareTo(str2);
            }
        }
        if (split.length > split2.length) {
            return 1;
        }
        if (split.length < split2.length) {
            return -1;
        }
        return 0;
    }

    private static String a(Context context, String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Activity activity, String str, String str2) {
        if (str2 == null || str2.trim().equals("")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
        if (!StringUtils.isEmpty(str2)) {
            sb.append("&file_data=");
            sb.append(Base64.encodeToString(str2.getBytes(), 2));
        }
        sb.append("&share_id=");
        sb.append(f23139a);
        sb.append("&req_type=" + Base64.encodeToString("5".getBytes(), 2));
        if (!StringUtils.isEmpty(str)) {
            if (str.length() > 20) {
                str = str.substring(0, 20) + "...";
            }
            sb.append("&app_name=");
            sb.append(Base64.encodeToString(str.getBytes(), 2));
        }
        String sb2 = sb.toString();
        Bundle bundle = new Bundle();
        bundle.putString("scheme", sb2);
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("appid", f23139a);
        Intent intent = null;
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(sb2));
            intent2.putExtra("key_request_code", a(false));
            if (activity.getPackageManager().resolveActivity(intent2, 0) != null) {
                intent = intent2;
            }
            if (intent != null) {
                intent.putExtra("key_action", "action_share_qq");
                intent.putExtra("key_params", bundle2);
                intent.putExtra("pkg_name", activity.getPackageName());
                activity.startActivityForResult(intent, f23140b);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        return a(activity, str, str2, str3, str4, str5, str6, i, 0);
    }

    public static boolean b(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        String str9;
        String str10;
        String str11;
        int i2;
        Activity activity2 = activity;
        String a2 = a((Context) activity);
        if (StringUtils.isEmpty(a2)) {
            return false;
        }
        if (StringUtils.isEmpty(str) || a.a(str)) {
            str8 = str;
        } else {
            str8 = "";
        }
        if ((StringUtils.isEmpty(str2) && StringUtils.isEmpty(str3) && StringUtils.isEmpty(str4)) || StringUtils.isEmpty(str8)) {
            return false;
        }
        if (StringUtils.isEmpty(str2) || str2.length() <= 200) {
            str9 = str2;
        } else {
            StringBuilder sb = new StringBuilder();
            String str12 = str2;
            sb.append(str2.substring(0, 200));
            sb.append("...");
            str9 = sb.toString();
        }
        if (StringUtils.isEmpty(str3) || str3.length() <= 600) {
            str10 = str3;
        } else {
            StringBuilder sb2 = new StringBuilder();
            String str13 = str3;
            sb2.append(str3.substring(0, 600));
            sb2.append("...");
            str10 = sb2.toString();
        }
        if (a(a2, "4.6.0") < 0) {
            if (a(a2, "4.5.0") >= 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            return a(activity, str8, str9, str10, str4, str5, str6, str7, i2);
        }
        StringBuilder sb3 = new StringBuilder("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
        if (!StringUtils.isEmpty(str4)) {
            sb3.append("&image_url=");
            sb3.append(Base64.encodeToString(str4.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str5)) {
            sb3.append("&file_data=");
            sb3.append(Base64.encodeToString(str5.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str9)) {
            sb3.append("&title=");
            sb3.append(Base64.encodeToString(str9.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str10)) {
            sb3.append("&description=");
            sb3.append(Base64.encodeToString(str10.getBytes(), 2));
        }
        sb3.append("&share_id=");
        sb3.append(f23139a);
        if (!StringUtils.isEmpty(str8)) {
            sb3.append("&url=");
            sb3.append(Base64.encodeToString(str8.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str6)) {
            if (str6.length() > 20) {
                StringBuilder sb4 = new StringBuilder();
                String str14 = str6;
                sb4.append(str6.substring(0, 20));
                sb4.append("...");
                str11 = sb4.toString();
            } else {
                str11 = str6;
            }
            sb3.append("&app_name=");
            sb3.append(Base64.encodeToString(str11.getBytes(), 2));
        }
        sb3.append("&req_type=" + Base64.encodeToString(String.valueOf(i).getBytes(), 2));
        sb3.append("&cflag=" + Base64.encodeToString(PushConstants.PUSH_TYPE_NOTIFY.getBytes(), 2));
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb3.toString()));
            if (!ToolUtils.isInstalledApp((Context) activity, intent)) {
                return false;
            }
            activity.startActivityForResult(intent, a(true));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        if (!StringUtils.isEmpty(str4) && !a.a(str4)) {
            str4 = "";
        }
        if (!StringUtils.isEmpty(str) && !a.a(str)) {
            str = "";
        }
        if ((StringUtils.isEmpty(str2) && StringUtils.isEmpty(str3) && StringUtils.isEmpty(str4)) || StringUtils.isEmpty(str)) {
            return false;
        }
        if (!StringUtils.isEmpty(str2) && str2.length() > 40) {
            str2 = str2.substring(0, 40) + "...";
        }
        if (!StringUtils.isEmpty(str3) && str3.length() > 80) {
            str3 = str3.substring(0, 80) + "...";
        }
        StringBuilder sb = new StringBuilder("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
        if (!StringUtils.isEmpty(str4)) {
            sb.append("&image_remote_url=");
            sb.append(Base64.encodeToString(str4.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str5)) {
            sb.append("&file_data=");
            sb.append(Base64.encodeToString(str5.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str2)) {
            sb.append("&title=");
            sb.append(Base64.encodeToString(str2.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str3)) {
            sb.append("&description=");
            sb.append(Base64.encodeToString(str3.getBytes(), 2));
        }
        sb.append("&share_id=");
        sb.append(f23139a);
        if (!StringUtils.isEmpty(str)) {
            sb.append("&url=");
            sb.append(Base64.encodeToString(str.getBytes(), 2));
        }
        if (!StringUtils.isEmpty(str6)) {
            if (str6.length() > 20) {
                str6 = str6.substring(0, 20) + "...";
            }
            sb.append("&app_name=");
            sb.append(Base64.encodeToString(str6.getBytes(), 2));
        }
        sb.append("&req_type=" + Base64.encodeToString(String.valueOf(i).getBytes(), 2));
        String sb2 = sb.toString();
        Bundle bundle = new Bundle();
        bundle.putString("scheme", sb2);
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putString("appid", f23139a);
        bundle2.putString("platform", "androidqz");
        bundle2.putString("pf", "openmobile_android");
        Intent intent = null;
        try {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(sb2));
            intent2.putExtra("key_request_code", a(false));
            if (activity.getPackageManager().resolveActivity(intent2, 0) != null) {
                intent = intent2;
            }
            if (intent != null) {
                intent.putExtra("key_action", "action_share_qq");
                intent.putExtra("key_params", bundle2);
                intent.putExtra("pkg_name", activity.getPackageName());
                activity.startActivityForResult(intent, f23140b);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
