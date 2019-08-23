package com.ss.android.newmedia.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.g.a;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30130a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f30130a, true, 18628, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f30130a, true, 18628, new Class[0], String.class);
        }
        if (!a.b()) {
            return e.f34153c + com.ss.android.sdk.e.a();
        } else if (TextUtils.isEmpty(a.d())) {
            return "musically";
        } else {
            return a.d();
        }
    }

    public static boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f30130a, true, 18632, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f30130a, true, 18632, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            if (e.f34152b.equals(str2)) {
                return true;
            }
            String a2 = a();
            if (StringUtils.isEmpty(a2) || !a2.equals(str2)) {
                return false;
            }
            return true;
        }
    }

    private static boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f30130a, true, 18634, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f30130a, true, 18634, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str2);
        }
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f30130a, true, 18629, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f30130a, true, 18629, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str)) {
            return str2;
        } else {
            try {
                String scheme = Uri.parse(str).getScheme();
                String a2 = a();
                if (e.f34152b.equals(scheme) || e.f34154d.equals(scheme)) {
                    str2 = str2.replace(scheme, a2);
                }
            } catch (Exception unused) {
            }
            return str2;
        }
    }

    private static Intent a(Context context, Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f30130a, true, 18633, new Class[]{Context.class, Uri.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f30130a, true, 18633, new Class[]{Context.class, Uri.class}, Intent.class);
        } else if (uri2 == null) {
            return null;
        } else {
            try {
                Intent intent = new Intent();
                intent.setClassName(context2, "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
                String queryParameter = uri2.getQueryParameter(PushConstants.WEB_URL);
                if (StringUtils.isEmpty(queryParameter)) {
                    return null;
                }
                if (uri2 == null) {
                    z = false;
                } else {
                    z = c(uri2.getQueryParameter("rotate"));
                }
                if (uri2 == null) {
                    z2 = false;
                } else {
                    z2 = c(uri2.getQueryParameter("no_hw"));
                }
                if (uri2 == null) {
                    z3 = false;
                } else {
                    z3 = c(uri2.getQueryParameter("hide_more"));
                }
                if (uri2 == null) {
                    z4 = false;
                } else {
                    z4 = c(uri2.getQueryParameter("hide_bar"));
                }
                if (uri2 == null) {
                    z5 = false;
                } else {
                    z5 = c(uri2.getQueryParameter("hide_status_bar"));
                }
                if (uri2 == null) {
                    z6 = false;
                } else {
                    z6 = c(uri2.getQueryParameter("hide_nav_bar"));
                }
                if (uri2 == null) {
                    z7 = false;
                } else {
                    z7 = c(uri2.getQueryParameter("hide_more"));
                }
                if (z4 || z6) {
                    intent.putExtra("hide_nav_bar", true);
                }
                if (z5) {
                    intent.putExtra("hide_status_bar", true);
                }
                String queryParameter2 = uri2.getQueryParameter("ad_id");
                if (!StringUtils.isEmpty(queryParameter2)) {
                    try {
                        intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                    } catch (Exception unused) {
                    }
                }
                String queryParameter3 = uri2.getQueryParameter("log_extra");
                if (!StringUtils.isEmpty(queryParameter3)) {
                    intent.putExtra("bundle_download_app_log_extra", queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter("download_url");
                if (!StringUtils.isEmpty(queryParameter4)) {
                    intent.putExtra("bundle_download_url", queryParameter4);
                }
                String decode = URLDecoder.decode(queryParameter, "UTF-8");
                BaseAppData.a();
                String e2 = BaseAppData.e(decode);
                intent.setData(Uri.parse(e2));
                intent.putExtra("swipe_mode", 2);
                intent.putExtra("show_toolbar", true);
                if (z) {
                    intent.putExtra("orientation", 0);
                }
                if (z2) {
                    intent.putExtra("bundle_no_hw_acceleration", z2);
                }
                if (z3) {
                    intent.putExtra("hide_more", z3);
                }
                if (z7) {
                    intent.putExtra("hide_more", z7);
                }
                String queryParameter5 = uri2.getQueryParameter(PushConstants.TITLE);
                if (StringUtils.isEmpty(queryParameter5)) {
                    queryParameter5 = Uri.parse(e2).getQueryParameter(PushConstants.TITLE);
                }
                String queryParameter6 = uri2.getQueryParameter("title_extra");
                if (StringUtils.isEmpty(queryParameter6)) {
                    queryParameter6 = queryParameter5;
                }
                if (!StringUtils.isEmpty(queryParameter6)) {
                    intent.putExtra(PushConstants.TITLE, queryParameter6);
                } else {
                    intent.putExtra(PushConstants.TITLE, " ");
                    intent.putExtra("bundle_user_webview_title", true);
                }
                String queryParameter7 = uri2.getQueryParameter("gd_label");
                if (!StringUtils.isEmpty(queryParameter7)) {
                    intent.putExtra("gd_label", queryParameter7);
                }
                String queryParameter8 = uri2.getQueryParameter("gd_ext_json");
                if (!StringUtils.isEmpty(queryParameter8)) {
                    intent.putExtra("gd_ext_json", queryParameter8);
                }
                String queryParameter9 = uri2.getQueryParameter("webview_track_key");
                if (!StringUtils.isEmpty(queryParameter9)) {
                    intent.putExtra("webview_track_key", queryParameter9);
                }
                String queryParameter10 = uri2.getQueryParameter("wap_headers");
                if (!StringUtils.isEmpty(queryParameter10)) {
                    intent.putExtra("wap_headers", queryParameter10);
                }
                intent.putExtra("bundle_auto_play_audio", c(uri2.getQueryParameter("auto_play_bgm")));
                intent.putExtra("show_load_dialog", c(uri2.getQueryParameter("hide_loading")));
                return intent;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public static boolean a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, str3, null}, null, f30130a, true, 18631, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, null}, null, f30130a, true, 18631, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            try {
                if (!StringUtils.isEmpty(str)) {
                    Uri parse = Uri.parse(str);
                    if (com.ss.android.newmedia.e.a(str)) {
                        try {
                            Intent intent = new Intent(context2, CrossPlatformActivity.class);
                            intent.setData(parse);
                            intent.putExtra("swipe_mode", 2);
                            context2.startActivity(intent);
                            return true;
                        } catch (Exception unused) {
                            z = true;
                        }
                    } else {
                        String scheme = parse.getScheme();
                        boolean b2 = b(scheme);
                        String host = parse.getHost();
                        if (b2 && f.f34167a.equals(host)) {
                            Intent a2 = a(context2, parse);
                            a2.putExtra("swipe_mode", 2);
                            if (a2 != null) {
                                context2.startActivity(a2);
                            }
                            return true;
                        } else if (b2) {
                            Intent intent2 = new Intent();
                            intent2.setClassName(context2, "com.ss.android.ugc.aweme.app.AdsAppActivity");
                            intent2.setData(parse);
                            intent2.putExtra(f.f34169c, true);
                            context2.startActivity(intent2);
                            return true;
                        } else {
                            Intent intent3 = new Intent("android.intent.action.VIEW");
                            intent3.setData(parse);
                            if (ToolUtils.isInstalledApp(context2, intent3)) {
                                intent3.putExtra(f.f34168b, str3);
                                context2.startActivity(intent3);
                                return true;
                            } else if (scheme.startsWith(e.f34153c)) {
                                Intent intent4 = new Intent(f.f34170d + scheme);
                                if (ToolUtils.isInstalledApp(context2, intent4)) {
                                    intent4.putExtra(f.f34168b, str3);
                                    context2.startActivity(intent4);
                                    return true;
                                }
                            }
                        }
                    }
                }
                if (!StringUtils.isEmpty(null) && ToolUtils.isInstalledApp(context2, (String) null)) {
                    context2.startActivity(ToolUtils.getLaunchIntentForPackage(context2, null));
                    return true;
                }
            } catch (Exception unused2) {
            }
            return z;
        }
    }
}
