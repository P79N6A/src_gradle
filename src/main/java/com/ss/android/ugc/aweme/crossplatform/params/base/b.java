package com.ss.android.ugc.aweme.crossplatform.params.base;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.crossplatform.params.c;
import com.ss.android.ugc.aweme.crossplatform.params.d;
import java.util.Set;

public final class b extends a {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40810a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.crossplatform.params.a f40811b;

        /* renamed from: c  reason: collision with root package name */
        public c f40812c;

        /* renamed from: d  reason: collision with root package name */
        public d f40813d;

        /* renamed from: e  reason: collision with root package name */
        public com.ss.android.ugc.aweme.crossplatform.params.b f40814e;

        a() {
        }

        public final a a() {
            if (PatchProxy.isSupport(new Object[0], this, f40810a, false, 34310, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f40810a, false, 34310, new Class[0], a.class);
            }
            a aVar = new a();
            aVar.f40805a = this.f40811b;
            aVar.f40807c = this.f40812c;
            aVar.f40808d = this.f40813d;
            aVar.f40806b = this.f40814e;
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.b$b  reason: collision with other inner class name */
    public static final class C0526b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40815a;

        @NonNull
        public static a a(@NonNull Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, null, f40815a, true, 34311, new Class[]{Bundle.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f40815a, true, 34311, new Class[]{Bundle.class}, a.class);
            }
            a aVar = new a();
            aVar.f40811b = b(bundle);
            if (aVar.f40811b.f40794b.intValue() == 2) {
                aVar.f40812c = c(bundle);
            }
            aVar.f40814e = a(bundle2, aVar.f40811b);
            aVar.f40813d = b(bundle2, aVar.f40811b);
            return aVar.a();
        }

        private static c c(@NonNull Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, null, f40815a, true, 34313, new Class[]{Bundle.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f40815a, true, 34313, new Class[]{Bundle.class}, c.class);
            }
            c cVar = new c();
            cVar.f40817b = bundle2.getString("channel_name");
            cVar.f40819d = bundle2.getString("bundle_name");
            cVar.f40821f = bundle2.getString("module_name");
            cVar.a(bundle2.getString("force_h5"));
            cVar.h = bundle2.getString("fallback_url");
            cVar.m = bundle2.getString("a_surl");
            cVar.i = bundle2.getString("dev");
            cVar.j = bundle2.getString("rn_bundle_url");
            cVar.k = bundle2.getString("rn_schema");
            cVar.l = TextUtils.equals(bundle2.getString("dynamic"), PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            cVar.f40820e = bundle2.getString("bundle");
            cVar.f40818c = bundle2.getString("channel");
            return cVar;
        }

        private static com.ss.android.ugc.aweme.crossplatform.params.a b(@NonNull Bundle bundle) {
            String str;
            boolean z;
            Bundle bundle2 = bundle;
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{bundle2}, null, f40815a, true, 34312, new Class[]{Bundle.class}, com.ss.android.ugc.aweme.crossplatform.params.a.class)) {
                return (com.ss.android.ugc.aweme.crossplatform.params.a) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f40815a, true, 34312, new Class[]{Bundle.class}, com.ss.android.ugc.aweme.crossplatform.params.a.class);
            }
            com.ss.android.ugc.aweme.crossplatform.params.a aVar = new com.ss.android.ugc.aweme.crossplatform.params.a();
            if (!TextUtils.isEmpty(bundle2.getString("rn_schema"))) {
                i = 2;
            }
            aVar.f40794b = Integer.valueOf(i);
            aVar.f40795c = bundle2;
            String string = bundle2.getString(PushConstants.WEB_URL);
            if (TextUtils.isEmpty(string)) {
                str = "";
            } else {
                str = string.trim();
            }
            aVar.f40796d = str;
            aVar.f40797e = bundle2.getBoolean("safeTemplate", false);
            if (aVar.f40797e && !TextUtils.isEmpty(aVar.f40796d)) {
                Uri parse = Uri.parse(aVar.f40796d);
                String decode = Uri.decode(parse.getQueryParameter("target"));
                if (!TextUtils.isEmpty(decode)) {
                    Uri.Builder buildUpon = parse.buildUpon();
                    Uri parse2 = Uri.parse(decode);
                    Set<String> queryParameterNames = parse2.getQueryParameterNames();
                    if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                        for (String next : queryParameterNames) {
                            if (!"target".equals(next)) {
                                buildUpon.appendQueryParameter(next, parse2.getQueryParameter(next));
                            }
                        }
                    }
                    aVar.f40796d = buildUpon.build().toString();
                }
            }
            if (!TextUtils.isEmpty(aVar.f40796d)) {
                z = com.ss.android.ugc.aweme.crossplatform.base.b.a(Uri.parse(aVar.f40796d).getQueryParameter("auto_play_bgm"));
            } else {
                z = false;
            }
            aVar.h = bundle2.getBoolean("bundle_auto_play_audio", z);
            aVar.f40798f = com.ss.android.ugc.aweme.crossplatform.base.b.a(com.ss.android.ugc.aweme.crossplatform.base.b.b(aVar.f40796d), bundle2, "group_id");
            aVar.g = bundle2.getString("enter_from");
            aVar.j = bundle2.getBoolean("from_notification", false);
            aVar.k = bundle2.getString("aweme_id", "");
            aVar.l = bundle2.getBoolean("control_request_url", false);
            if (!TextUtils.isEmpty(aVar.f40796d)) {
                aVar.m = com.ss.android.ugc.aweme.crossplatform.base.b.a(Uri.parse(aVar.f40796d).getQueryParameter("no_hw"));
            }
            if (!aVar.m) {
                BaseAppData.a();
                aVar.m = false;
            }
            return aVar;
        }

        private static com.ss.android.ugc.aweme.crossplatform.params.b a(Bundle bundle, com.ss.android.ugc.aweme.crossplatform.params.a aVar) {
            Bundle bundle2 = bundle;
            com.ss.android.ugc.aweme.crossplatform.params.a aVar2 = aVar;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{bundle2, aVar2}, null, f40815a, true, 34314, new Class[]{Bundle.class, com.ss.android.ugc.aweme.crossplatform.params.a.class}, com.ss.android.ugc.aweme.crossplatform.params.b.class)) {
                return (com.ss.android.ugc.aweme.crossplatform.params.b) PatchProxy.accessDispatch(new Object[]{bundle2, aVar2}, null, f40815a, true, 34314, new Class[]{Bundle.class, com.ss.android.ugc.aweme.crossplatform.params.a.class}, com.ss.android.ugc.aweme.crossplatform.params.b.class);
            }
            com.ss.android.ugc.aweme.crossplatform.params.b bVar = new com.ss.android.ugc.aweme.crossplatform.params.b();
            bVar.f40800b = bundle2.getLong("ad_id", 0);
            bVar.f40801c = bundle2.getString("ad_type", "");
            bVar.f40802d = bundle2.getInt("ad_system_origin", 0);
            bVar.f40803e = bundle2.getBoolean("bundle_is_from_app_ad", false);
            bVar.f40804f = bundle2.getString("bundle_download_url");
            bVar.t = bundle2.getString("bundle_ad_quick_app_url");
            bVar.g = bundle2.getString("bundle_download_app_name");
            bVar.h = bundle2.getString("aweme_package_name");
            bVar.i = bundle2.getString("bundle_download_app_extra");
            bVar.j = bundle2.getString("bundle_download_app_log_extra");
            bVar.k = bundle2.getString("gd_label");
            bVar.l = bundle2.getString("gd_ext_json");
            bVar.p = bundle2.getBoolean("bundle_forbidden_jump", false);
            bVar.m = bundle2.getBoolean("bundle_disable_download_dialog", true);
            bVar.n = bundle2.getString("aweme_creative_id");
            bVar.o = bundle2.getBoolean("bundle_show_download_status_bar", true);
            if (bVar.f40800b > 0 || !TextUtils.isEmpty(bVar.k)) {
                z = true;
            }
            bVar.q = z;
            bVar.r = bundle2.getString("ad_js_url");
            bVar.s = bundle2.getString("dou_plus_fail_monitor_url");
            bVar.u = bundle2.getString("preload_site_id");
            bVar.v = bundle2.getInt("preload_web_status");
            bVar.w = bundle2.getInt("preload_is_web_url");
            bVar.x = com.ss.android.newmedia.eplatform.a.a(aVar2.f40796d);
            bVar.y = bundle2.getInt("web_type");
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0141  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.ss.android.ugc.aweme.crossplatform.params.d b(android.os.Bundle r19, @android.support.annotation.NonNull com.ss.android.ugc.aweme.crossplatform.params.a r20) {
            /*
                r0 = r19
                r1 = r20
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f40815a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
                r8[r10] = r4
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.params.a> r4 = com.ss.android.ugc.aweme.crossplatform.params.a.class
                r8[r11] = r4
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.params.d> r9 = com.ss.android.ugc.aweme.crossplatform.params.d.class
                r4 = 0
                r6 = 1
                r7 = 34315(0x860b, float:4.8086E-41)
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0048
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                r13 = 0
                com.meituan.robust.ChangeQuickRedirect r14 = f40815a
                r15 = 1
                r16 = 34315(0x860b, float:4.8086E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                r0[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.params.a> r1 = com.ss.android.ugc.aweme.crossplatform.params.a.class
                r0[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.crossplatform.params.d> r18 = com.ss.android.ugc.aweme.crossplatform.params.d.class
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                com.ss.android.ugc.aweme.crossplatform.params.d r0 = (com.ss.android.ugc.aweme.crossplatform.params.d) r0
                return r0
            L_0x0048:
                com.ss.android.ugc.aweme.crossplatform.params.d r3 = new com.ss.android.ugc.aweme.crossplatform.params.d
                r3.<init>()
                java.lang.String r4 = r1.f40796d
                android.net.Uri r4 = com.ss.android.ugc.aweme.crossplatform.base.b.b(r4)
                java.lang.String r5 = "use_ordinary_web"
                boolean r5 = r0.getBoolean(r5, r11)
                if (r5 != 0) goto L_0x005c
                goto L_0x006f
            L_0x005c:
                if (r4 == 0) goto L_0x0074
                java.lang.String r5 = "immersive_mode"
                java.lang.String r5 = r4.getQueryParameter(r5)
                if (r5 == 0) goto L_0x0071
                java.lang.String r6 = "0"
                boolean r5 = android.text.TextUtils.equals(r5, r6)
                if (r5 == 0) goto L_0x006f
                goto L_0x0071
            L_0x006f:
                r5 = 0
                goto L_0x0072
            L_0x0071:
                r5 = 1
            L_0x0072:
                r3.l = r5
            L_0x0074:
                if (r4 == 0) goto L_0x007e
                java.lang.String r5 = "topbar_type"
                java.lang.String r5 = r4.getQueryParameter(r5)
                r3.m = r5
            L_0x007e:
                java.lang.String r5 = "need_bottom_out"
                boolean r5 = r0.getBoolean(r5, r10)
                r3.k = r5
                boolean r5 = com.ss.android.ugc.aweme.g.a.a()
                r3.s = r5
                java.lang.String r5 = "bundle_nav_bar_status_padding"
                boolean r5 = r0.getBoolean(r5, r10)
                r3.n = r5
                java.lang.String r5 = "hide_more"
                boolean r5 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r5, r11)
                r3.f40823b = r5
                java.lang.String r1 = r1.f40796d
                android.net.Uri r1 = com.ss.android.ugc.aweme.crossplatform.base.b.b(r1)
                java.lang.String r5 = "nav_btn_type"
                int r1 = com.ss.android.ugc.aweme.crossplatform.base.b.b(r1, r0, r5)
                r3.z = r1
                java.lang.String r1 = "show_report"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                r3.f40824c = r1
                java.lang.String r1 = "hide_loading"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                if (r1 != 0) goto L_0x00c2
                java.lang.String r1 = "show_load_dialog"
                boolean r1 = r0.getBoolean(r1, r11)
                if (r1 != 0) goto L_0x00c4
            L_0x00c2:
                r3.y = r10
            L_0x00c4:
                java.lang.String r1 = "title"
                java.lang.String r1 = r0.getString(r1)
                r3.f40825d = r1
                java.lang.String r1 = r3.f40825d
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x00dc
                java.lang.String r1 = "bundle_web_title"
                java.lang.String r1 = r0.getString(r1)
                r3.f40825d = r1
            L_0x00dc:
                java.lang.String r1 = r3.f40825d
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 == 0) goto L_0x00ee
                if (r4 == 0) goto L_0x00ee
                java.lang.String r1 = "title"
                java.lang.String r1 = r4.getQueryParameter(r1)
                r3.f40825d = r1
            L_0x00ee:
                java.lang.String r1 = "bundle_user_webview_title"
                boolean r1 = r0.getBoolean(r1, r10)
                r3.u = r1
                java.lang.String r1 = "nav_bar_color"
                int r1 = com.ss.android.ugc.aweme.crossplatform.base.b.c(r4, r0, r1)
                r3.f40826e = r1
                java.lang.String r1 = "loading_bgcolor"
                int r1 = com.ss.android.ugc.aweme.crossplatform.base.b.c(r4, r0, r1)
                r3.f40827f = r1
                java.lang.String r1 = "title_color"
                int r1 = com.ss.android.ugc.aweme.crossplatform.base.b.c(r4, r0, r1)
                r3.g = r1
                java.lang.String r1 = "web_type"
                int r1 = r0.getInt(r1)
                if (r1 != r11) goto L_0x011b
                r3.w = r2
                r3.v = r11
                goto L_0x013c
            L_0x011b:
                if (r4 == 0) goto L_0x013c
                java.lang.String r1 = "disable_pop_gesture"
                java.lang.String r1 = r4.getQueryParameter(r1)
                java.lang.String r5 = "0"
                boolean r5 = android.text.TextUtils.equals(r1, r5)
                if (r5 == 0) goto L_0x0130
                r3.w = r2
                r3.v = r11
                goto L_0x013c
            L_0x0130:
                java.lang.String r2 = "1"
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x013c
                r3.w = r10
                r3.v = r10
            L_0x013c:
                int r1 = r3.f40826e
                r2 = -2
                if (r1 == r2) goto L_0x0145
                int r1 = r3.f40826e
                r3.f40827f = r1
            L_0x0145:
                java.lang.String r1 = "show_closeall"
                boolean r1 = r0.getBoolean(r1, r10)
                r3.h = r1
                java.lang.String r1 = "show_more_button"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                r3.i = r1
                java.lang.String r1 = "copy_link_action"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                r3.j = r1
                java.lang.String r1 = "bundle_webview_background"
                android.content.Context r2 = com.ss.android.ugc.aweme.base.utils.d.a()
                android.content.res.Resources r2 = r2.getResources()
                r5 = 2131624964(0x7f0e0404, float:1.8877123E38)
                int r2 = r2.getColor(r5)
                int r1 = r0.getInt(r1, r2)
                r3.x = r1
                java.lang.String r1 = "should_full_screen"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                r3.o = r1
                java.lang.String r1 = "hide_nav_bar"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                r3.p = r1
                java.lang.String r1 = "hide_status_bar"
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r10)
                r3.q = r1
                java.lang.String r1 = "status_bar_color"
                int r1 = com.ss.android.ugc.aweme.crossplatform.base.b.c(r4, r0, r1)
                r3.r = r1
                java.lang.String r1 = "status_font_dark"
                boolean r2 = com.ss.android.g.a.b()
                boolean r1 = com.ss.android.ugc.aweme.crossplatform.base.b.a(r4, r0, r1, r2)
                r3.f40822a = r1
                java.lang.String r1 = "show_not_official_content_warning"
                boolean r0 = r0.getBoolean(r1, r10)
                r3.t = r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.params.base.b.C0526b.b(android.os.Bundle, com.ss.android.ugc.aweme.crossplatform.params.a):com.ss.android.ugc.aweme.crossplatform.params.d");
        }
    }
}
