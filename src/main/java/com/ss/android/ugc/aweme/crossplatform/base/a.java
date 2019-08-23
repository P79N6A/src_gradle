package com.ss.android.ugc.aweme.crossplatform.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.params.base.CrossPlatformConstants;
import com.ss.android.ugc.aweme.utils.eb;
import java.net.URLDecoder;
import java.net.URLEncoder;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40714a;

    public static String a(@CrossPlatformConstants.Platform int i) {
        switch (i) {
            case 1:
                return f.f34167a;
            case 2:
                return "react-native";
            case 3:
                return "webview_back";
            default:
                return "unknown";
        }
    }

    public static void a(View view, int i) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, 2130838460}, null, f40714a, true, 34200, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, 2130838460}, null, f40714a, true, 34200, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            view2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = (int) UIUtils.dip2Px(view.getContext(), 44.0f);
            layoutParams.width = (int) UIUtils.dip2Px(view.getContext(), 44.0f);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) UIUtils.dip2Px(view.getContext(), 5.5f);
            view2.setBackgroundResource(2130838460);
        }
    }

    public static boolean a(@Nullable Uri uri, @Nullable Bundle bundle, String str, boolean z) {
        Uri uri2 = uri;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{uri2, bundle, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f40714a, true, 34204, new Class[]{Uri.class, Bundle.class, String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2, bundle, str2, Byte.valueOf(z)}, null, f40714a, true, 34204, new Class[]{Uri.class, Bundle.class, String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (uri2 == null || uri2.getQueryParameter(str2) == null) {
            return bundle != null ? bundle.getBoolean(str, z) : z;
        } else {
            return TextUtils.equals(uri2.getQueryParameter(str2), PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f40714a, true, 34207, new Class[]{String.class}, Boolean.TYPE)) {
            return !StringUtils.isEmpty(str) && PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f40714a, true, 34207, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static int a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f40714a, true, 34196, new Class[]{Activity.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{activity}, null, f40714a, true, 34196, new Class[]{Activity.class}, Integer.TYPE)).intValue();
        } else if (eb.a()) {
            return ImmersionBar.getStatusBarHeight(activity);
        } else {
            return 0;
        }
    }

    public static Uri b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f40714a, true, 34209, new Class[]{String.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{str}, null, f40714a, true, 34209, new Class[]{String.class}, Uri.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            return Uri.parse(str);
        }
    }

    public static Intent a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f40714a, true, 34210, new Class[]{Context.class, String.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f40714a, true, 34210, new Class[]{Context.class, String.class}, Intent.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            if (!str2.startsWith("https://") && !str2.startsWith("http://")) {
                return null;
            }
            try {
                sb.append("aweme://ame/webview/?url=");
                sb.append(URLEncoder.encode(str2, "ISO-8859-1"));
            } catch (Exception unused) {
            }
            return b.a(context2, Uri.parse(sb.toString()));
        }
    }

    public static Intent a(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f40714a, true, 34194, new Class[]{Context.class, Uri.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f40714a, true, 34194, new Class[]{Context.class, Uri.class}, Intent.class);
        } else if (uri2 == null) {
            return null;
        } else {
            try {
                Intent intent = new Intent(context2, CrossPlatformActivity.class);
                String queryParameter = uri2.getQueryParameter(PushConstants.WEB_URL);
                if (StringUtils.isEmpty(queryParameter)) {
                    return null;
                }
                boolean a2 = b.a(uri2.getQueryParameter("no_hw"));
                boolean a3 = b.a(uri2.getQueryParameter("hide_more"));
                boolean a4 = b.a(uri2.getQueryParameter("hide_bar"));
                boolean a5 = b.a(uri2.getQueryParameter("hide_status_bar"));
                boolean a6 = b.a(uri2.getQueryParameter("hide_nav_bar"));
                boolean a7 = b.a(uri2.getQueryParameter("hide_more"));
                if (a4 || a6) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (a5) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = uri2.getQueryParameter("ad_id");
                if (!StringUtils.isEmpty(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                BaseAppData.a();
                String e2 = BaseAppData.e(decode);
                intent.setData(Uri.parse(e2));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (a2) {
                    intent.putExtra("bundle_no_hw_acceleration", true);
                }
                if (a3) {
                    intent.putExtra("hide_more", true);
                }
                if (!a7) {
                    intent.putExtra("hide_more", a7);
                }
                String queryParameter3 = uri2.getQueryParameter(PushConstants.TITLE);
                if (StringUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = Uri.parse(e2).getQueryParameter(PushConstants.TITLE);
                }
                String queryParameter4 = uri2.getQueryParameter("title_extra");
                if (StringUtils.isEmpty(queryParameter4)) {
                    queryParameter4 = queryParameter3;
                }
                if (!StringUtils.isEmpty(queryParameter4)) {
                    intent.putExtra(PushConstants.TITLE, queryParameter4);
                } else {
                    intent.putExtra(PushConstants.TITLE, " ");
                    intent.putExtra("bundle_user_webview_title", true);
                }
                String queryParameter5 = uri2.getQueryParameter("gd_label");
                if (!StringUtils.isEmpty(queryParameter5)) {
                    intent.putExtra("gd_label", queryParameter5);
                }
                String queryParameter6 = uri2.getQueryParameter("gd_ext_json");
                if (!StringUtils.isEmpty(queryParameter6)) {
                    intent.putExtra("gd_ext_json", queryParameter6);
                }
                String queryParameter7 = uri2.getQueryParameter("webview_track_key");
                if (!StringUtils.isEmpty(queryParameter7)) {
                    intent.putExtra("webview_track_key", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("wap_headers");
                if (!StringUtils.isEmpty(queryParameter8)) {
                    intent.putExtra("wap_headers", queryParameter8);
                }
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static String a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f40714a, true, 34195, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f40714a, true, 34195, new Class[]{String.class, Integer.TYPE}, String.class);
        } else if (str2 == null || !e.a(str)) {
            return str2;
        } else {
            try {
                if (!com.ss.android.ugc.aweme.web.f.f76629b.contains(Uri.parse(str).getHost())) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder(str2);
                if (!str2.contains("?")) {
                    sb.append("?");
                } else {
                    sb.append("&");
                }
                sb.append("status_bar_height=" + i);
                return sb.toString();
            } catch (Exception unused) {
                return str2;
            }
        }
    }

    public static int b(@Nullable Uri uri, @Nullable Bundle bundle, @NonNull String str) {
        Uri uri2 = uri;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{uri2, bundle, str2}, null, f40714a, true, 34206, new Class[]{Uri.class, Bundle.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri2, bundle, str2}, null, f40714a, true, 34206, new Class[]{Uri.class, Bundle.class, String.class}, Integer.TYPE)).intValue();
        } else if (uri2 == null) {
            return -1;
        } else {
            String queryParameter = uri2.getQueryParameter(str2);
            if (queryParameter == null) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
                if (bundle != null) {
                    return bundle.getInt(str);
                }
                return -1;
            }
        }
    }

    public static int c(@Nullable Uri uri, @Nullable Bundle bundle, @NonNull String str) {
        Uri uri2 = uri;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{uri2, bundle, str2}, null, f40714a, true, 34208, new Class[]{Uri.class, Bundle.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri2, bundle, str2}, null, f40714a, true, 34208, new Class[]{Uri.class, Bundle.class, String.class}, Integer.TYPE)).intValue();
        }
        int i = -2;
        String str3 = null;
        if (uri2 != null) {
            try {
                if (uri2.getQueryParameter(str2) != null) {
                    str3 = uri2.getQueryParameter(str2);
                }
            } catch (Exception unused) {
            }
        }
        if (!(!TextUtils.isEmpty(str3) || bundle == null || bundle.getString(str) == null)) {
            str3 = bundle.getString(str);
        }
        if (!TextUtils.isEmpty(str3) && !str3.contains("#")) {
            str3 = "#" + str3;
        }
        if (!TextUtils.isEmpty(str3)) {
            i = Color.parseColor(str3);
        }
        return i;
    }

    @Nullable
    public static String a(@Nullable Uri uri, @Nullable Bundle bundle, @NonNull String str) {
        Uri uri2 = uri;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{uri2, bundle, str2}, null, f40714a, true, 34205, new Class[]{Uri.class, Bundle.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri2, bundle, str2}, null, f40714a, true, 34205, new Class[]{Uri.class, Bundle.class, String.class}, String.class);
        } else if (uri2 != null && !TextUtils.isEmpty(uri2.getQueryParameter(str2))) {
            return uri2.getQueryParameter(str2);
        } else {
            if (bundle == null || TextUtils.isEmpty(bundle.getString(str))) {
                return null;
            }
            return bundle.getString(str);
        }
    }
}
