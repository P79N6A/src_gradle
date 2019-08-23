package com.ss.android.ugc.aweme.antiaddic.lock;

import com.bytedance.keva.Keva;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004J\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004J\u0006\u0010&\u001a\u00020\u0004J\u0006\u0010'\u001a\u00020(J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0013J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020-J\u0006\u0010.\u001a\u00020-J\b\u0010/\u001a\u00020\u001fH\u0002J\u0006\u00100\u001a\u00020-R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R*\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00138F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformConfig;", "", "()V", "CHILD_DEFAULT_URL_D", "", "CHILD_DEFAULT_URL_M", "CHILD_DEFAULT_URL_T", "KEY_CHAT_SETTING_OPEN_EVERYONE", "KEY_PARENTAL_GUARDIAN_ENTRANCE", "KEY_PARENTAL_GUARDIAN_MODE", "KEY_SCREEN_TIME_MANAGEMENT", "KEY_TEEN_MODE", "KEY_VALIAD", "PARENT_DEFAULT_URL_D", "PARENT_DEFAULT_URL_M", "PARENT_DEFAULT_URL_T", "REPO_NAME", "SCAN_CODE", "cachedPushSetting", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "getCachedPushSetting", "()Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "setCachedPushSetting", "(Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;)V", "keva", "Lcom/bytedance/keva/Keva;", "value", "pushSettings", "getPushSettings", "setPushSettings", "cachePushSetting", "", "cache", "getChildScheme", "getDefaultChildScheme", "getDefaultParentScheme", "getParenPasswordById", "uid", "getParentScheme", "getRole", "Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformConfig$Role;", "setting", "getTimeLockTimeInMin", "", "isTeenagerLockEnabled", "", "isTimeLockEnabled", "loadCache", "showChatLockEntrance", "Role", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33435a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f33436b;

    /* renamed from: c  reason: collision with root package name */
    private static final Keva f33437c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private static c f33438d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private static c f33439e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ParentalPlatformConfig$Role;", "", "(Ljava/lang/String;I)V", "PARENT", "CHILD", "NONE", "CLOSE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum a {
        PARENT,
        CHILD,
        NONE,
        CLOSE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    private b() {
    }

    @Nullable
    public static c a() {
        if (f33438d == null) {
            return f33439e;
        }
        return f33438d;
    }

    public final boolean c() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f33435a, false, 21730, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33435a, false, 21730, new Class[0], Boolean.TYPE)).booleanValue();
        }
        c a2 = a();
        if (a2 != null) {
            i = a2.C;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f33435a, false, 21736, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f33435a, false, 21736, new Class[0], String.class);
        } else if (!com.ss.android.g.a.a()) {
            return "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fguardian_child_d%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_guardian_child_d%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1";
        } else {
            if (com.ss.android.g.a.c()) {
                return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
            }
            return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Frn%2Fguardian_child_m%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
    }

    @NotNull
    public final String e() {
        if (PatchProxy.isSupport(new Object[0], this, f33435a, false, 21738, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f33435a, false, 21738, new Class[0], String.class);
        } else if (!com.ss.android.g.a.a()) {
            return "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fguardian_parent_d%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Dfe_app_rn_patch%26bundle_name%3Dfe_app_rn%26module_name%3Dpage_guardian_parent_d%26bg_theme%3D%2523161823%26loading_bgcolor%3D%2523161823%26hide_nav_bar%3D1";
        } else {
            if (com.ss.android.g.a.c()) {
                return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Fguardian_parent_t%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
            }
            return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Frn%2Fguardian_parent_m%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1";
        }
    }

    static {
        b bVar = new b();
        f33436b = bVar;
        Keva repoSync = Keva.getRepoSync("repo_parental_platform", 0);
        Intrinsics.checkExpressionValueIsNotNull(repoSync, "Keva.getRepoSync(REPO_NA…ants.MODE_SINGLE_PROCESS)");
        f33437c = repoSync;
        if (PatchProxy.isSupport(new Object[0], bVar, f33435a, false, 21740, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, f33435a, false, 21740, new Class[0], Void.TYPE);
            return;
        }
        if (f33437c.getBoolean("valid", false)) {
            c cVar = new c();
            cVar.C = f33437c.getInt("teen_mode", 0);
            cVar.t = f33437c.getBoolean("chatSettingOpenEveryone", false);
            cVar.E = f33437c.getInt("parentalGuardianMode", 0);
            cVar.D = f33437c.getInt("screenTimeManagement", 0);
            cVar.F = f33437c.getInt("parentalGuardianEntrance", 0);
            f33439e = cVar;
        }
    }

    @NotNull
    public final a b() {
        if (PatchProxy.isSupport(new Object[0], this, f33435a, false, 21729, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f33435a, false, 21729, new Class[0], a.class);
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (!a2.isLogin() || a() == null) {
            return a.CLOSE;
        }
        return b(a());
    }

    @NotNull
    public static a b(@Nullable c cVar) {
        if (cVar == null) {
            return a.CLOSE;
        }
        switch (cVar.E) {
            case 0:
                return a.CLOSE;
            case 1:
                return a.NONE;
            case 2:
                return a.CHILD;
            case 3:
                return a.PARENT;
            default:
                return a.CLOSE;
        }
    }

    public final void a(@Nullable c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f33435a, false, 21728, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f33435a, false, 21728, new Class[]{c.class}, Void.TYPE);
            return;
        }
        f33438d = cVar2;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f33435a, false, 21739, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f33435a, false, 21739, new Class[]{c.class}, Void.TYPE);
            return;
        }
        f33439e = cVar2;
        if (cVar2 == null) {
            f33437c.storeBoolean("valid", false);
            return;
        }
        f33437c.storeBoolean("valid", true);
        f33437c.storeInt("teen_mode", cVar2.C);
        f33437c.storeBoolean("chatSettingOpenEveryone", cVar2.t);
        f33437c.storeInt("parentalGuardianMode", cVar2.E);
        f33437c.storeInt("screenTimeManagement", cVar2.D);
        f33437c.storeInt("parentalGuardianEntrance", cVar2.F);
    }
}
