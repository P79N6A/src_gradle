package com.ss.android.ugc.aweme.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.keva.adapter.KevaSpFastAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.sp.SharedPreferencesManager;
import com.ss.android.ugc.aweme.sp.g;
import io.fabric.sdk.android.d;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3834a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3835b;

    /* renamed from: c  reason: collision with root package name */
    public static HashSet<String> f3836c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3837d = {"default_config", "awesome_splash", "splash_ad_sp", "aweme-app", "av_settings", "ab_test_config", "aweme_user", "com.ss.spipe_setting", "SP_EXPERIMENT_CACHE", "SP_CLIENT_EXPOSURE_CACHE", "SP_EXPERIMENT_EXPOSURE_CACHE", "CLIENT_EXPERIMENT_CACHE_TAG", "Agoo_AppStore", "ACCS_SDK", "mipush_extra", "mipush", "umeng_general_config", "is_allow_oppo_push", "push_multi_process_config", "ttnetCookieStore", "traffic_monitor_info", "applog_stats", "umeng_general_config", "wschannel_multi_process_config", "rec_user", "ab_test_mock_config", "ACCS_COOKIE", "ACCS_LOAD_SO", "ACCS_SDK_CHANNEL", "anr_monitor_table", "app_setting", "aweme-abtest-hooker", "gaid_sp_name", "google_ads_flags", "image_opt_table", "key_language_sp_key", "KEY_NEED_UPLOAD_LAUNCHLOG", "mipush_account", "mipush_app_info", "plugin_meta_data", "pref_registered_pkg_names", "push_setting", "ss_app_config", "ss_location", "test_setting", "update_params", "use_https", "XMPushServiceConfig", "MiniAppCookiePersistence", "tma_jssdk_info", "mini_app_storage", "appbrand_file", "mipush_oc", "push_switch", "sync", "httpdns_config_cache", "sp_client_report_status", "effect_setting", "d_permit", "pushservice_umeng_common_config", "umeng_message_state", "Alvin2", "ContextData"};

    /* renamed from: e  reason: collision with root package name */
    private static int f3838e;

    /* renamed from: f  reason: collision with root package name */
    private static List<Class> f3839f;
    private static String[] g = {"LiveWallPaper", "LogpbPreference", "ProfilePreferences", "SelectOldCities", "MusLivePreferences", "IActivityStateSp", "ShowDiscoveryGuideCache", "DeviceSettingSp", "MetricsEventPreference", "StoryFestivalPreloadSp", "OpenGpsPreferences", "IHotSearchWordsCache", "RankSp", "IMPreferences", "IVVSp", "IVerifyActionCache", "PlayerPreferences", "PoiPreferences", "CommercePreferences", "InitialChooseLanguagePreferences", "TabStatusPreference", "IVideoPublishShareCache", "MusProfilePreferences", "MusLivePreferences", "PrivacySettingNotifyPreferences", "ShowXmaxTreeCache", "CleanUpPreferences", "LoftSp"};

    static {
        Class[] clsArr = new Class[2];
        clsArr[0] = d.class;
        clsArr[0] = g.class;
        f3839f = Arrays.asList(clsArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.DataInputStream} */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a0 A[SYNTHETIC, Splitter:B:46:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a7 A[SYNTHETIC, Splitter:B:50:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1 A[SYNTHETIC, Splitter:B:59:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b8 A[SYNTHETIC, Splitter:B:63:0x00b8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f3834a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 54894(0xd66e, float:7.6923E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f3834a
            r13 = 1
            r14 = 54894(0xd66e, float:7.6923E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            java.io.File r2 = r17.getFilesDir()
            boolean r3 = r2.exists()
            if (r3 != 0) goto L_0x003f
            r2.mkdirs()
        L_0x003f:
            java.io.File r2 = new java.io.File
            java.io.File r3 = r17.getFilesDir()
            java.lang.String r4 = "keva_port_batch_master"
            r2.<init>(r3, r4)
            r3 = 0
            boolean r4 = r2.exists()     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            if (r4 == 0) goto L_0x0066
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x009a, all -> 0x0097 }
            int r5 = r4.readInt()     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            r9 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r9 >> 2
            f3838e = r5     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            goto L_0x0067
        L_0x0066:
            r4 = r3
        L_0x0067:
            int r5 = f3838e     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            r6 = 8
            if (r5 >= r6) goto L_0x0085
            boolean r0 = com.ss.android.common.util.ToolUtils.isMainProcess(r17)     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            if (r0 == 0) goto L_0x0085
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0094, all -> 0x0092 }
            int r9 = r9 + r1
            r5.writeInt(r9)     // Catch:{ IOException -> 0x0095, all -> 0x0083 }
            r3 = r5
            goto L_0x0085
        L_0x0083:
            r0 = move-exception
            goto L_0x00ae
        L_0x0085:
            if (r4 == 0) goto L_0x008c
            r4.close()     // Catch:{ Throwable -> 0x008b }
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            if (r3 == 0) goto L_0x00ab
            r3.close()     // Catch:{ Throwable -> 0x0091 }
        L_0x0091:
            return
        L_0x0092:
            r0 = move-exception
            goto L_0x00af
        L_0x0094:
            r5 = r3
        L_0x0095:
            r3 = r4
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            r4 = r3
            goto L_0x00af
        L_0x009a:
            r5 = r3
        L_0x009b:
            r2.delete()     // Catch:{ all -> 0x00ac }
            if (r3 == 0) goto L_0x00a5
            r3.close()     // Catch:{ Throwable -> 0x00a4 }
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            if (r5 == 0) goto L_0x00ab
            r5.close()     // Catch:{ Throwable -> 0x00aa }
        L_0x00aa:
            return
        L_0x00ab:
            return
        L_0x00ac:
            r0 = move-exception
            r4 = r3
        L_0x00ae:
            r3 = r5
        L_0x00af:
            if (r4 == 0) goto L_0x00b6
            r4.close()     // Catch:{ Throwable -> 0x00b5 }
            goto L_0x00b6
        L_0x00b5:
        L_0x00b6:
            if (r3 == 0) goto L_0x00bb
            r3.close()     // Catch:{ Throwable -> 0x00bb }
        L_0x00bb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.q.c.a(android.content.Context):void");
    }

    private static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f3834a, true, 54893, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f3834a, true, 54893, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if ((str.length() & 7) <= f3838e) {
            return true;
        } else {
            return false;
        }
    }

    private static SharedPreferences b(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f3834a, true, 54892, new Class[]{Context.class, String.class}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f3834a, true, 54892, new Class[]{Context.class, String.class}, SharedPreferences.class);
        } else if (context2 == null) {
            return null;
        } else {
            SharedPreferences sharedPreferences = SharedPreferencesManager.getInstance().getSharedPreferences(context2, str2);
            if (sharedPreferences != null) {
                return sharedPreferences;
            }
            return null;
        }
    }

    private static boolean a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f3834a, true, 54889, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str2}, null, f3834a, true, 54889, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!f3835b || f3839f.contains(context.getClass()) || f3836c.contains(str2)) {
            return true;
        } else {
            if (ToolUtils.isMainProcess(context)) {
                return false;
            }
            String curProcessName = ToolUtils.getCurProcessName(context);
            if (curProcessName.startsWith(context.getPackageName() + ":miniapp")) {
                return true;
            }
            a.a(str);
            if (!a.a()) {
                return true;
            }
            throw new RuntimeException("please add " + str2 + " in KevaSpAopHook.IGNORED_LIST[] or using Keva.getRepo, because of this sp used not in main process. Any question you could ask xiaolin.gan.");
        }
    }

    public static SharedPreferences a(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, null, f3834a, true, 54888, new Class[]{Context.class, String.class, Integer.TYPE}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, null, f3834a, true, 54888, new Class[]{Context.class, String.class, Integer.TYPE}, SharedPreferences.class);
        } else if (a(context, str)) {
            return b(context, str, i);
        } else {
            if (a(str) || Keva.isRepoPorted(str)) {
                return KevaSpFastAdapter.getSharedPreferences(context2, str2, true);
            }
            return b(context, str, i);
        }
    }

    private static SharedPreferences b(Context context, String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2, Integer.valueOf(i)}, null, f3834a, true, 54891, new Class[]{Context.class, String.class, Integer.TYPE}, SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context, str2, Integer.valueOf(i)}, null, f3834a, true, 54891, new Class[]{Context.class, String.class, Integer.TYPE}, SharedPreferences.class);
        } else if (TextUtils.equals("plugin_meta_data", str2) || TextUtils.equals("bmd_monitor", str2) || TextUtils.equals("multidex.version", str2)) {
            return context.getSharedPreferences(str, i);
        } else {
            SharedPreferences b2 = b(context, str);
            if (b2 != null) {
                return b2;
            }
            return context.getSharedPreferences(str, i);
        }
    }
}
