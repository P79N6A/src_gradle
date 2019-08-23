package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsUriJumper;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f34167a = f34167a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final String f34168b = f34168b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final String f34169c = f34169c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final String f34170d = f34170d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f34171e = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0015J.\u0010\u001a\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004J$\u0010\u001e\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/app/AdsUriJumper$Companion;", "", "()V", "ACTION_INTENT", "", "getACTION_INTENT", "()Ljava/lang/String;", "HOST_WEBVIEW", "getHOST_WEBVIEW", "KEY_IS_FROM_SELF", "getKEY_IS_FROM_SELF", "KEY_OPEN_URL", "getKEY_OPEN_URL", "handleAmeWebViewBrowser", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "handleAmeWebViewBrowserForDeeplink", "needHideMore", "", "url", "optBoolean", "key", "def", "startActivity", "intent", "openUrl", "packname", "startAdsAppActivity", "pkgName", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34172a;

        private a() {
        }

        @NotNull
        private static String a() {
            return f.f34168b;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private boolean a(@Nullable String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2}, this, f34172a, false, 22239, new Class[]{String.class}, Boolean.TYPE)) {
                return a(str2, false);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f34172a, false, 22239, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }

        private boolean b(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f34172a, false, 22241, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f34172a, false, 22241, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
            try {
                Uri parse = Uri.parse(str);
                if (parse == null || !AdsAppBaseActivity.a(parse.getQueryParameter("hide_more"))) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        private boolean a(@Nullable String str, boolean z) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, (byte) 0}, this, f34172a, false, 22240, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, (byte) 0}, this, f34172a, false, 22240, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (StringUtils.isEmpty(str)) {
                return false;
            } else {
                return Intrinsics.areEqual((Object) PushConstants.PUSH_TYPE_THROUGH_MESSAGE, (Object) str2);
            }
        }

        @Nullable
        private Intent b(@Nullable Context context, @Nullable Uri uri) {
            Context context2 = context;
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{context2, uri2}, this, f34172a, false, 22238, new Class[]{Context.class, Uri.class}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, f34172a, false, 22238, new Class[]{Context.class, Uri.class}, Intent.class);
            } else if (uri2 == null) {
                return null;
            } else {
                try {
                    Intent intent = new Intent();
                    intent.setClass(context2, CrossPlatformActivity.class);
                    String queryParameter = uri2.getQueryParameter(PushConstants.WEB_URL);
                    if (StringUtils.isEmpty(queryParameter)) {
                        return null;
                    }
                    boolean a2 = a(uri2.getQueryParameter("rotate"));
                    boolean a3 = a(uri2.getQueryParameter("no_hw"));
                    boolean a4 = a(uri2.getQueryParameter("hide_more"));
                    boolean a5 = a(uri2.getQueryParameter("hide_bar"));
                    boolean a6 = a(uri2.getQueryParameter("hide_status_bar"));
                    boolean a7 = a(uri2.getQueryParameter("hide_nav_bar"));
                    boolean a8 = a(uri2.getQueryParameter("hide_more"));
                    if (a5 || a7) {
                        intent.putExtra("hide_nav_bar", true);
                    }
                    if (a6) {
                        intent.putExtra("hide_status_bar", true);
                    }
                    String queryParameter2 = uri2.getQueryParameter("ad_id");
                    if (!StringUtils.isEmpty(queryParameter2)) {
                        try {
                            intent.putExtra("ad_id", Long.parseLong(queryParameter2));
                        } catch (Exception unused) {
                        }
                    }
                    String queryParameter3 = uri2.getQueryParameter("adinfojson");
                    if (!StringUtils.isEmpty(queryParameter3)) {
                        JSONObject jSONObject = new JSONObject(queryParameter3);
                        String string = jSONObject.getString("cid");
                        String string2 = jSONObject.getString("log_extra");
                        if (!StringUtils.isEmpty(string)) {
                            intent.putExtra("ad_id", Long.parseLong(string));
                        }
                        if (!StringUtils.isEmpty(string2)) {
                            intent.putExtra("bundle_download_app_log_extra", string2);
                        }
                    }
                    String decode = URLDecoder.decode(queryParameter, "UTF-8");
                    intent.setData(Uri.parse(decode));
                    intent.putExtra("swipe_mode", 2);
                    intent.putExtra("show_toolbar", true);
                    if (a2) {
                        intent.putExtra("orientation", 0);
                    }
                    if (a3) {
                        intent.putExtra("bundle_no_hw_acceleration", a3);
                    }
                    if (a4) {
                        intent.putExtra("hide_more", a4);
                    }
                    if (a8) {
                        intent.putExtra("hide_more", a8);
                    }
                    String queryParameter4 = uri2.getQueryParameter(PushConstants.TITLE);
                    if (StringUtils.isEmpty(queryParameter4)) {
                        queryParameter4 = Uri.parse(decode).getQueryParameter(PushConstants.TITLE);
                    }
                    String queryParameter5 = uri2.getQueryParameter("title_extra");
                    if (StringUtils.isEmpty(queryParameter5)) {
                        queryParameter5 = queryParameter4;
                    }
                    if (!StringUtils.isEmpty(queryParameter5)) {
                        intent.putExtra(PushConstants.TITLE, queryParameter5);
                    } else {
                        intent.putExtra(PushConstants.TITLE, " ");
                        intent.putExtra("bundle_user_webview_title", true);
                    }
                    String queryParameter6 = uri2.getQueryParameter("gd_label");
                    if (!StringUtils.isEmpty(queryParameter6)) {
                        intent.putExtra("gd_label", queryParameter6);
                    }
                    String queryParameter7 = uri2.getQueryParameter("gd_ext_json");
                    if (!StringUtils.isEmpty(queryParameter7)) {
                        intent.putExtra("gd_ext_json", queryParameter7);
                    }
                    String queryParameter8 = uri2.getQueryParameter("webview_track_key");
                    if (!StringUtils.isEmpty(queryParameter8)) {
                        intent.putExtra("webview_track_key", queryParameter8);
                    }
                    String queryParameter9 = uri2.getQueryParameter("wap_headers");
                    if (!StringUtils.isEmpty(queryParameter9)) {
                        intent.putExtra("wap_headers", queryParameter9);
                    }
                    intent.putExtra("bundle_auto_play_audio", a(uri2.getQueryParameter("auto_play_bgm")));
                    intent.putExtra("show_load_dialog", a(uri2.getQueryParameter("hide_loading")));
                    return intent;
                } catch (Exception unused2) {
                    return null;
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(39:11|(1:13)(1:14)|(1:16)(1:17)|(1:19)(1:20)|(1:22)(1:23)|(1:25)(1:26)|(1:28)(1:29)|(1:31)(1:32)|(1:34)(1:35)|36|37|38|(1:40)|(1:43)|(1:45)|46|(3:48|49|50)|51|52|(1:54)|(1:56)|(1:58)|(1:60)|61|(1:63)|64|(1:66)|67|(1:69)(1:70)|71|(1:73)|74|(1:76)|77|(1:79)|80|(1:82)|83|84) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0146 A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x014e A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0155 A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x015c A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x016d A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0183 A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x018a A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0190 A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8 A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01b9 A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca A[Catch:{ Exception -> 0x01ff }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01db A[Catch:{ Exception -> 0x01ff }] */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(@org.jetbrains.annotations.NotNull android.content.Context r16, @org.jetbrains.annotations.Nullable android.net.Uri r17) {
            /*
                r15 = this;
                r7 = r16
                r8 = r17
                r9 = 2
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r7
                r11 = 1
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f34172a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r5[r10] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r5[r11] = r1
                java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
                r3 = 0
                r4 = 22242(0x56e2, float:3.1168E-41)
                r1 = r15
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0044
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r7
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f34172a
                r3 = 0
                r4 = 22242(0x56e2, float:3.1168E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r5[r10] = r1
                java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
                r5[r11] = r1
                java.lang.Class<android.content.Intent> r6 = android.content.Intent.class
                r1 = r15
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                android.content.Intent r0 = (android.content.Intent) r0
                return r0
            L_0x0044:
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
                r0 = 0
                if (r8 != 0) goto L_0x004d
                return r0
            L_0x004d:
                android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0200 }
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
                r1.<init>(r7, r2)     // Catch:{ Exception -> 0x0200 }
                java.lang.String r2 = "url"
                java.lang.String r2 = r8.getQueryParameter(r2)     // Catch:{ Exception -> 0x0200 }
                boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0200 }
                if (r3 == 0) goto L_0x0061
                return r0
            L_0x0061:
                java.lang.String r3 = "UTF-8"
                java.lang.String r2 = java.net.URLDecoder.decode(r2, r3)     // Catch:{ Exception -> 0x0200 }
                android.net.Uri r3 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0200 }
                if (r3 != 0) goto L_0x006f
                r4 = 0
                goto L_0x007c
            L_0x006f:
                r4 = r15
                com.ss.android.ugc.aweme.app.f$a r4 = (com.ss.android.ugc.aweme.app.f.a) r4     // Catch:{ Exception -> 0x0200 }
                java.lang.String r5 = "rotate"
                java.lang.String r5 = r3.getQueryParameter(r5)     // Catch:{ Exception -> 0x0200 }
                boolean r4 = r4.a(r5)     // Catch:{ Exception -> 0x0200 }
            L_0x007c:
                if (r3 != 0) goto L_0x0080
                r5 = 0
                goto L_0x008d
            L_0x0080:
                r5 = r15
                com.ss.android.ugc.aweme.app.f$a r5 = (com.ss.android.ugc.aweme.app.f.a) r5     // Catch:{ Exception -> 0x0200 }
                java.lang.String r6 = "no_hw"
                java.lang.String r6 = r3.getQueryParameter(r6)     // Catch:{ Exception -> 0x0200 }
                boolean r5 = r5.a(r6)     // Catch:{ Exception -> 0x0200 }
            L_0x008d:
                if (r3 != 0) goto L_0x0091
                r6 = 0
                goto L_0x009e
            L_0x0091:
                r6 = r15
                com.ss.android.ugc.aweme.app.f$a r6 = (com.ss.android.ugc.aweme.app.f.a) r6     // Catch:{ Exception -> 0x0200 }
                java.lang.String r7 = "hide_more"
                java.lang.String r7 = r3.getQueryParameter(r7)     // Catch:{ Exception -> 0x0200 }
                boolean r6 = r6.a(r7)     // Catch:{ Exception -> 0x0200 }
            L_0x009e:
                if (r3 != 0) goto L_0x00a2
                r7 = 0
                goto L_0x00af
            L_0x00a2:
                r7 = r15
                com.ss.android.ugc.aweme.app.f$a r7 = (com.ss.android.ugc.aweme.app.f.a) r7     // Catch:{ Exception -> 0x0200 }
                java.lang.String r8 = "hide_bar"
                java.lang.String r8 = r3.getQueryParameter(r8)     // Catch:{ Exception -> 0x0200 }
                boolean r7 = r7.a(r8)     // Catch:{ Exception -> 0x0200 }
            L_0x00af:
                if (r3 != 0) goto L_0x00b3
                r8 = 0
                goto L_0x00c0
            L_0x00b3:
                r8 = r15
                com.ss.android.ugc.aweme.app.f$a r8 = (com.ss.android.ugc.aweme.app.f.a) r8     // Catch:{ Exception -> 0x0200 }
                java.lang.String r12 = "hide_status_bar"
                java.lang.String r12 = r3.getQueryParameter(r12)     // Catch:{ Exception -> 0x0200 }
                boolean r8 = r8.a(r12)     // Catch:{ Exception -> 0x0200 }
            L_0x00c0:
                if (r3 != 0) goto L_0x00c4
                r12 = 0
                goto L_0x00d1
            L_0x00c4:
                r12 = r15
                com.ss.android.ugc.aweme.app.f$a r12 = (com.ss.android.ugc.aweme.app.f.a) r12     // Catch:{ Exception -> 0x0200 }
                java.lang.String r13 = "hide_nav_bar"
                java.lang.String r13 = r3.getQueryParameter(r13)     // Catch:{ Exception -> 0x0200 }
                boolean r12 = r12.a(r13)     // Catch:{ Exception -> 0x0200 }
            L_0x00d1:
                if (r3 != 0) goto L_0x00d5
                r13 = 0
                goto L_0x00e2
            L_0x00d5:
                r13 = r15
                com.ss.android.ugc.aweme.app.f$a r13 = (com.ss.android.ugc.aweme.app.f.a) r13     // Catch:{ Exception -> 0x0200 }
                java.lang.String r14 = "hide_more"
                java.lang.String r14 = r3.getQueryParameter(r14)     // Catch:{ Exception -> 0x0200 }
                boolean r13 = r13.a(r14)     // Catch:{ Exception -> 0x0200 }
            L_0x00e2:
                if (r3 == 0) goto L_0x00eb
                java.lang.String r14 = "previous_page"
                java.lang.String r14 = r3.getQueryParameter(r14)     // Catch:{ Exception -> 0x0200 }
                goto L_0x00ec
            L_0x00eb:
                r14 = r0
            L_0x00ec:
                r0 = r15
                com.ss.android.ugc.aweme.app.f$a r0 = (com.ss.android.ugc.aweme.app.f.a) r0     // Catch:{ Exception -> 0x01ff }
                java.lang.String r10 = "url"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r10)     // Catch:{ Exception -> 0x01ff }
                boolean r0 = r0.b(r2)     // Catch:{ Exception -> 0x01ff }
                r0 = r0 | r13
                r10 = r14
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ Exception -> 0x01ff }
                boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x01ff }
                if (r10 != 0) goto L_0x0107
                java.lang.String r10 = "enter_from"
                r1.putExtra(r10, r14)     // Catch:{ Exception -> 0x01ff }
            L_0x0107:
                if (r7 != 0) goto L_0x010b
                if (r12 == 0) goto L_0x0110
            L_0x010b:
                java.lang.String r7 = "hide_nav_bar"
                r1.putExtra(r7, r11)     // Catch:{ Exception -> 0x01ff }
            L_0x0110:
                if (r8 == 0) goto L_0x0117
                java.lang.String r7 = "hide_status_bar"
                r1.putExtra(r7, r11)     // Catch:{ Exception -> 0x01ff }
            L_0x0117:
                java.lang.String r7 = "ad_id"
                java.lang.String r7 = r3.getQueryParameter(r7)     // Catch:{ Exception -> 0x01ff }
                boolean r8 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Exception -> 0x01ff }
                if (r8 != 0) goto L_0x012c
                java.lang.String r8 = "ad_id"
                long r12 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x012c }
                r1.putExtra(r8, r12)     // Catch:{ Exception -> 0x012c }
            L_0x012c:
                com.ss.android.newmedia.BaseAppData.a()     // Catch:{ Exception -> 0x01ff }
                java.lang.String r2 = com.ss.android.newmedia.BaseAppData.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01ff }
                android.net.Uri r7 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x01ff }
                r1.setData(r7)     // Catch:{ Exception -> 0x01ff }
                java.lang.String r7 = "swipe_mode"
                r1.putExtra(r7, r9)     // Catch:{ Exception -> 0x01ff }
                java.lang.String r7 = "show_toolbar"
                r1.putExtra(r7, r11)     // Catch:{ Exception -> 0x01ff }
                if (r4 == 0) goto L_0x014c
                java.lang.String r4 = "orientation"
                r7 = 0
                r1.putExtra(r4, r7)     // Catch:{ Exception -> 0x01ff }
            L_0x014c:
                if (r5 == 0) goto L_0x0153
                java.lang.String r4 = "bundle_no_hw_acceleration"
                r1.putExtra(r4, r5)     // Catch:{ Exception -> 0x01ff }
            L_0x0153:
                if (r6 == 0) goto L_0x015a
                java.lang.String r4 = "hide_more"
                r1.putExtra(r4, r6)     // Catch:{ Exception -> 0x01ff }
            L_0x015a:
                if (r0 != 0) goto L_0x0161
                java.lang.String r4 = "hide_more"
                r1.putExtra(r4, r0)     // Catch:{ Exception -> 0x01ff }
            L_0x0161:
                java.lang.String r0 = "title"
                java.lang.String r0 = r3.getQueryParameter(r0)     // Catch:{ Exception -> 0x01ff }
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ff }
                if (r4 == 0) goto L_0x0177
                android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x01ff }
                java.lang.String r2 = "title"
                java.lang.String r0 = r0.getQueryParameter(r2)     // Catch:{ Exception -> 0x01ff }
            L_0x0177:
                java.lang.String r2 = "title_extra"
                java.lang.String r2 = r3.getQueryParameter(r2)     // Catch:{ Exception -> 0x01ff }
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Exception -> 0x01ff }
                if (r4 != 0) goto L_0x0184
                r0 = r2
            L_0x0184:
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ff }
                if (r2 != 0) goto L_0x0190
                java.lang.String r2 = "title"
                r1.putExtra(r2, r0)     // Catch:{ Exception -> 0x01ff }
                goto L_0x019c
            L_0x0190:
                java.lang.String r0 = "title"
                java.lang.String r2 = " "
                r1.putExtra(r0, r2)     // Catch:{ Exception -> 0x01ff }
                java.lang.String r0 = "bundle_user_webview_title"
                r1.putExtra(r0, r11)     // Catch:{ Exception -> 0x01ff }
            L_0x019c:
                java.lang.String r0 = "gd_label"
                java.lang.String r0 = r3.getQueryParameter(r0)     // Catch:{ Exception -> 0x01ff }
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ff }
                if (r2 != 0) goto L_0x01ad
                java.lang.String r2 = "gd_label"
                r1.putExtra(r2, r0)     // Catch:{ Exception -> 0x01ff }
            L_0x01ad:
                java.lang.String r0 = "gd_ext_json"
                java.lang.String r0 = r3.getQueryParameter(r0)     // Catch:{ Exception -> 0x01ff }
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ff }
                if (r2 != 0) goto L_0x01be
                java.lang.String r2 = "gd_ext_json"
                r1.putExtra(r2, r0)     // Catch:{ Exception -> 0x01ff }
            L_0x01be:
                java.lang.String r0 = "webview_track_key"
                java.lang.String r0 = r3.getQueryParameter(r0)     // Catch:{ Exception -> 0x01ff }
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ff }
                if (r2 != 0) goto L_0x01cf
                java.lang.String r2 = "webview_track_key"
                r1.putExtra(r2, r0)     // Catch:{ Exception -> 0x01ff }
            L_0x01cf:
                java.lang.String r0 = "wap_headers"
                java.lang.String r0 = r3.getQueryParameter(r0)     // Catch:{ Exception -> 0x01ff }
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01ff }
                if (r2 != 0) goto L_0x01e0
                java.lang.String r2 = "wap_headers"
                r1.putExtra(r2, r0)     // Catch:{ Exception -> 0x01ff }
            L_0x01e0:
                java.lang.String r0 = "bundle_auto_play_audio"
                java.lang.String r2 = "auto_play_bgm"
                java.lang.String r2 = r3.getQueryParameter(r2)     // Catch:{ Exception -> 0x01ff }
                boolean r2 = com.ss.android.ugc.aweme.app.AdsAppBaseActivity.a((java.lang.String) r2)     // Catch:{ Exception -> 0x01ff }
                r1.putExtra(r0, r2)     // Catch:{ Exception -> 0x01ff }
                java.lang.String r0 = "show_load_dialog"
                java.lang.String r2 = "hide_loading"
                java.lang.String r2 = r3.getQueryParameter(r2)     // Catch:{ Exception -> 0x01ff }
                boolean r2 = com.ss.android.ugc.aweme.app.AdsAppBaseActivity.a((java.lang.String) r2)     // Catch:{ Exception -> 0x01ff }
                r1.putExtra(r0, r2)     // Catch:{ Exception -> 0x01ff }
                return r1
            L_0x01ff:
                r0 = 0
            L_0x0200:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.f.a.a(android.content.Context, android.net.Uri):android.content.Intent");
        }

        public final boolean a(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            Context context2 = context;
            String str3 = str;
            String str4 = str2;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f34172a, false, 22237, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f34172a, false, 22237, new Class[]{Context.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (context2 == null) {
                return false;
            } else {
                try {
                    if (!StringUtils.isEmpty(str)) {
                        Uri parse = Uri.parse(str);
                        if (e.a(str)) {
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
                            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
                            String scheme = parse.getScheme();
                            e.a aVar = e.f34155e;
                            Intrinsics.checkExpressionValueIsNotNull(scheme, "scheme");
                            boolean a2 = aVar.a(scheme);
                            String host = parse.getHost();
                            if (a2 && Intrinsics.areEqual((Object) f.f34167a, (Object) host)) {
                                Intent b2 = b(context2, parse);
                                if (b2 != null) {
                                    b2.putExtra("swipe_mode", 2);
                                }
                                if (b2 != null) {
                                    context2.startActivity(b2);
                                }
                                return true;
                            } else if (!a2) {
                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                intent2.setData(parse);
                                if (ToolUtils.isInstalledApp(context2, intent2)) {
                                    intent2.putExtra(a(), str3);
                                    context2.startActivity(intent2);
                                    return true;
                                } else if (StringsKt.startsWith$default(scheme, e.a.a(), false, 2, null)) {
                                    Intent intent3 = new Intent(f.f34170d + scheme);
                                    if (ToolUtils.isInstalledApp(context2, intent3)) {
                                        intent3.putExtra(a(), str3);
                                        context2.startActivity(intent3);
                                        return true;
                                    }
                                }
                            } else if (BaseAppData.a() != null) {
                                Intent intent4 = new Intent(context2, AwemeAppData.r());
                                intent4.setData(parse);
                                intent4.putExtra(f.f34169c, true);
                                context2.startActivity(intent4);
                                return true;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.app.AwemeAppData");
                            }
                        }
                    }
                    if (!StringUtils.isEmpty(str2) && ToolUtils.isInstalledApp(context2, str4)) {
                        context2.startActivity(ToolUtils.getLaunchIntentForPackage(context2, str4));
                        return true;
                    }
                } catch (Exception unused2) {
                }
                return z;
            }
        }
    }
}
