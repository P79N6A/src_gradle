package com.ss.android.ugc.aweme.commercialize.link;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.commercialize.link.LinkAuthConstants;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u00011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0007J\b\u0010\"\u001a\u00020#H\u0007J\b\u0010$\u001a\u00020#H\u0007J\u001e\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007J\u001b\u0010,\u001a\u00020\u0004*\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020 H\u0002¢\u0006\u0002\u0010.J#\u0010,\u001a\u00020\u0004*\u0004\u0018\u00010 2\u0006\u0010-\u001a\u00020 2\u0006\u0010/\u001a\u00020 H\u0002¢\u0006\u0002\u00100R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\r\u0010\u0006R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuth;", "", "()V", "isCurrentUserEnteredSettingItemBefore", "", "isCurrentUserEnteredSettingItemBefore$annotations", "()Z", "isCurrentUserShownGuide", "isCurrentUserShownGuide$annotations", "isGlobalEnabled", "isGlobalEnabled$annotations", "isQuitTargetUser", "isQuitTargetUser$annotations", "isTargetUser", "isTargetUser$annotations", "publishPage", "Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuth$PageUrl;", "settingItemEnteredUserId", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "", "getSettingItemEnteredUserId", "()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "settingItemEnteredUserId$delegate", "Lkotlin/Lazy;", "settingsPage", "shownGuideUserIdSpCache", "getShownGuideUserIdSpCache", "shownGuideUserIdSpCache$delegate", "uid", "getUid", "()Ljava/lang/String;", "linkAuthStateRepl", "", "enabled", "markEnteredSetting", "", "markGuideShown", "openAuthPage", "activity", "Landroid/app/Activity;", "enterFrom", "updateSettings", "settings", "Lcom/ss/android/ugc/aweme/setting/model/AwemeSettings;", "eq", "x", "(Ljava/lang/Integer;I)Z", "y", "(Ljava/lang/Integer;II)Z", "PageUrl", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38942a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f38943b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "shownGuideUserIdSpCache", "getShownGuideUserIdSpCache()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "settingItemEnteredUserId", "getSettingItemEnteredUserId()Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final a f38944c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final Lazy f38945d = LazyKt.lazy(c.INSTANCE);

    /* renamed from: e  reason: collision with root package name */
    private static final Lazy f38946e = LazyKt.lazy(b.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    private static final C0508a f38947f = new C0508a("ad_link_auth_page_publish", "aweme://webview/?url=https%3A%2F%2Fwww.douyin.com%2Ffalcon%2Frn%2Flink_plan%3Fhide_nav_bar%3D1%26enter_from%3Dpublish&hide_nav_bar=1&enter_from=publish&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_link_plan%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dpublish");
    private static final C0508a g = new C0508a("ad_link_auth_page_settings", "aweme://webview/?url=https%3A%2F%2Fwww.douyin.com%2Ffalcon%2Frn%2Flink_plan%3Fhide_nav_bar%3D1%26enter_from%3Dsettings&hide_nav_bar=1&enter_from=settings&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_link_plan%26bg_theme%3D%2523161823%26hide_nav_bar%3D1%26enter_from%3Dsettings");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuth$PageUrl;", "", "key", "", "default", "(Ljava/lang/String;Ljava/lang/String;)V", "sp", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "get", "open", "", "activity", "Landroid/app/Activity;", "set", "url", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.a$a  reason: collision with other inner class name */
    static final class C0508a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38948a;

        /* renamed from: b  reason: collision with root package name */
        private final an<String> f38949b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38950c;

        @NotNull
        private String a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f38948a, false, 30859, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f38948a, false, 30859, new Class[0], String.class);
            }
            String str = (String) this.f38949b.c();
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                return this.f38950c;
            }
            return str;
        }

        public final void a(@Nullable Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f38948a, false, 30860, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f38948a, false, 30860, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            h a2 = h.a();
            if (a2 != null) {
                a2.a(activity2, a());
            }
        }

        public final void a(@Nullable String str) {
            String str2;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{str}, this, f38948a, false, 30858, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f38948a, false, 30858, new Class[]{String.class}, Void.TYPE);
                return;
            }
            an<String> anVar = this.f38949b;
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (z) {
                str2 = "";
            } else {
                str2 = str;
            }
            anVar.a(str2);
        }

        public C0508a(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "default");
            this.f38950c = str2;
            this.f38949b = new an<>(str, "");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<an<String>> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final an<String> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30861, new Class[0], an.class)) {
                return new an<>("ad_link_auth_setting_item_entered_uid", "");
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30861, new Class[0], an.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/app/SharePrefCacheItem;", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<an<String>> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        @NotNull
        public final an<String> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30862, new Class[0], an.class)) {
                return new an<>("ad_link_auth_guide_shown_uid", "");
            }
            return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30862, new Class[0], an.class);
        }
    }

    private final an<String> g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38942a, false, 30850, new Class[0], an.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f38942a, false, 30850, new Class[0], an.class);
        } else {
            value = f38945d.getValue();
        }
        return (an) value;
    }

    public final an<String> e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38942a, false, 30851, new Class[0], an.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f38942a, false, 30851, new Class[0], an.class);
        } else {
            value = f38946e.getValue();
        }
        return (an) value;
    }

    private a() {
    }

    @JvmStatic
    public static final void f() {
        if (PatchProxy.isSupport(new Object[0], null, f38942a, true, 30853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f38942a, true, 30853, new Class[0], Void.TYPE);
        } else {
            f38944c.g().a(f38944c.d());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String d() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38942a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 30849(0x7881, float:4.3229E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f38942a
            r5 = 0
            r6 = 30849(0x7881, float:4.3229E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.getCurUserId()
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.link.a.d():java.lang.String");
    }

    public static final boolean b() {
        Integer num;
        if (PatchProxy.isSupport(new Object[0], null, f38942a, true, 30846, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f38942a, true, 30846, new Class[0], Boolean.TYPE)).booleanValue();
        }
        a aVar = f38944c;
        IAccountUserService a2 = d.a();
        if (a2 != null) {
            User curUser = a2.getCurUser();
            if (curUser != null) {
                CommercePermissionStruct commercePermission = curUser.getCommercePermission();
                if (commercePermission != null) {
                    num = Integer.valueOf(commercePermission.adLink);
                    return aVar.a(num, 10);
                }
            }
        }
        num = null;
        return aVar.a(num, 10);
    }

    public static final boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f38942a, true, 30847, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f38942a, true, 30847, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return Intrinsics.areEqual((Object) (String) f38944c.g().c(), (Object) f38944c.d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f38942a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = 0
            r4 = 1
            r5 = 30844(0x787c, float:4.3222E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f38942a
            r5 = 1
            r6 = 30844(0x787c, float:4.3222E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            com.ss.android.ugc.aweme.commercialize.link.a r8 = f38944c
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            if (r1 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            if (r1 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct r1 = r1.getCommercePermission()
            if (r1 == 0) goto L_0x0045
            int r1 = r1.adLink
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r9 = r1
            r10 = 3
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r0] = r9
            r11 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1[r11] = r2
            r12 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r13 = 2
            r1[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f38942a
            r4 = 0
            r5 = 30857(0x7889, float:4.324E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r6[r0] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r8
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x00a9
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r0] = r9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f38942a
            r4 = 0
            r5 = 30857(0x7889, float:4.324E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r6[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r8
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00a9:
            if (r9 != 0) goto L_0x00ac
            goto L_0x00b2
        L_0x00ac:
            int r1 = r9.intValue()
            if (r11 == r1) goto L_0x00bd
        L_0x00b2:
            if (r9 != 0) goto L_0x00b5
            goto L_0x00bc
        L_0x00b5:
            int r1 = r9.intValue()
            if (r12 != r1) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            return r0
        L_0x00bd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.link.a.a():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.setting.model.AwemeSettings r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f38942a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings> r3 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 30852(0x7884, float:4.3233E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f38942a
            r13 = 1
            r14 = 30852(0x7884, float:4.3233E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.setting.model.AwemeSettings> r0 = com.ss.android.ugc.aweme.setting.model.AwemeSettings.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            r1 = 0
            if (r0 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$AwemeFEConfigs r0 = r0.feConfigs
            if (r0 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.setting.model.AwemeSettings$LinkPlan r0 = r0.linkPlan
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            com.ss.android.ugc.aweme.commercialize.link.a$a r2 = f38947f
            if (r0 == 0) goto L_0x0044
            java.lang.String r3 = r0.publish
            goto L_0x0045
        L_0x0044:
            r3 = r1
        L_0x0045:
            r2.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.commercialize.link.a$a r2 = g
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r0.settings
        L_0x004e:
            r2.a((java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.link.a.a(com.ss.android.ugc.aweme.setting.model.AwemeSettings):void");
    }

    @JvmStatic
    @SuppressLint({"LogNotTimber"})
    public static final void a(@Nullable Activity activity, @LinkAuthConstants.LinkAuthFrom @Nullable String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f38942a, true, 30855, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f38942a, true, 30855, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -235365105) {
            if (hashCode == 1434631203 && str2.equals("settings")) {
                g.a(activity2);
            }
        } else if (str2.equals("publish")) {
            f38947f.a(activity2);
        }
    }

    public final boolean a(@Nullable Integer num, int i) {
        if (PatchProxy.isSupport(new Object[]{num, Integer.valueOf(i)}, this, f38942a, false, 30856, new Class[]{Integer.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{num, Integer.valueOf(i)}, this, f38942a, false, 30856, new Class[]{Integer.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (num != null && i == num.intValue()) {
            return true;
        } else {
            return false;
        }
    }
}
