package com.ss.android.ugc.aweme.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/eplatform/ESettings;", "", "()V", "DEFAULT_LITE_LINK", "", "getBlockHint", "getBlockList", "", "getBlockMode", "", "getLiteLink", "getRedirectUrl", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f22835a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f22836b = new a();

    private a() {
    }

    @JvmStatic
    @NotNull
    public static final String a() {
        if (PatchProxy.isSupport(new Object[0], null, f22835a, true, 39041, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f22835a, true, 39041, new Class[0], String.class);
        }
        String str = "aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Finsights%2Flite%3Fhide_nav_bar%3D0%26from%3DrnToWeb%26title%3D%25E4%25BC%2581%25E4%25B8%259A%25E5%258F%25B7%25E7%25AE%25A1%25E7%2590%2586&hide_nav_bar=0&from=rnToWeb&title=%E4%BC%81%E4%B8%9A%E5%8F%B7%E7%AE%A1%E7%90%86&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_e_lite%26force_h5%3D1%26hide_nav_bar%3D0%26bundle_url%3D%26title%3D%25E4%25BC%2581%25E4%25B8%259A%25E5%258F%25B7%25E7%25AE%25A1%25E7%2590%2586";
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            EPlatformSettings aG = b2.aG();
            Intrinsics.checkExpressionValueIsNotNull(aG, "SettingsReader.get().ePlatformSettings");
            String liteLink = aG.getLiteLink();
            Intrinsics.checkExpressionValueIsNotNull(liteLink, "SettingsReader.get().ePlatformSettings.liteLink");
            str = liteLink;
        } catch (Exception unused) {
        }
        return str;
    }

    @JvmStatic
    @NotNull
    public static final List<String> b() {
        if (PatchProxy.isSupport(new Object[0], null, f22835a, true, 39042, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f22835a, true, 39042, new Class[0], List.class);
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            EPlatformSettings aG = b2.aG();
            Intrinsics.checkExpressionValueIsNotNull(aG, "SettingsReader.get().ePlatformSettings");
            List<String> jumpBlockList = aG.getJumpBlockList();
            Intrinsics.checkExpressionValueIsNotNull(jumpBlockList, "SettingsReader.get().ePl…ormSettings.jumpBlockList");
            return jumpBlockList;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    @JvmStatic
    @Nullable
    public static final String c() {
        if (PatchProxy.isSupport(new Object[0], null, f22835a, true, 39043, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f22835a, true, 39043, new Class[0], String.class);
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            EPlatformSettings aG = b2.aG();
            Intrinsics.checkExpressionValueIsNotNull(aG, "SettingsReader.get().ePlatformSettings");
            return aG.getBlockHint();
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    @Nullable
    public static final String d() {
        if (PatchProxy.isSupport(new Object[0], null, f22835a, true, 39044, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f22835a, true, 39044, new Class[0], String.class);
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            EPlatformSettings aG = b2.aG();
            Intrinsics.checkExpressionValueIsNotNull(aG, "SettingsReader.get().ePlatformSettings");
            return aG.getJumpRedirectUrl();
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final int e() {
        if (PatchProxy.isSupport(new Object[0], null, f22835a, true, 39045, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f22835a, true, 39045, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            EPlatformSettings aG = b2.aG();
            Intrinsics.checkExpressionValueIsNotNull(aG, "SettingsReader.get().ePlatformSettings");
            Integer blockMode = aG.getBlockMode();
            Intrinsics.checkExpressionValueIsNotNull(blockMode, "SettingsReader.get().ePlatformSettings.blockMode");
            return blockMode.intValue();
        } catch (Exception unused) {
            return 1;
        }
    }
}
