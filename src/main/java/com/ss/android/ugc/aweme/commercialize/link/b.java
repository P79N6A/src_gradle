package com.ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u000e¢\u0006\u0012\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthBridge;", "", "()V", "STATUS_AUTHED", "", "STATUS_DISABLED", "STATUS_ENABLED", "value", "", "linkData", "linkData$annotations", "getLinkData", "()Ljava/lang/String;", "setLinkData", "(Ljava/lang/String;)V", "settingItem", "Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthBridge$SettingItem;", "getSettingItem", "()Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthBridge$SettingItem;", "setSettingItem", "(Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthBridge$SettingItem;)V", "getCommerceAdLinkStatus", "getCommerceAdLinkTags", "SettingItem", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38963a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    static a f38964b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f38965c = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/link/LinkAuthBridge$SettingItem;", "", "linkData", "", "getLinkData", "()Ljava/lang/String;", "setLinkData", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        @NotNull
        String getLinkData();

        void setLinkData(@NotNull String str);
    }

    private b() {
    }

    public static void a(@Nullable a aVar) {
        f38964b = aVar;
    }

    @JvmStatic
    public static final int a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f38963a, true, 30865, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f38963a, true, 30865, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "linkData");
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.optBoolean("link_exit", false)) {
                    return 1;
                }
                if (jSONObject.optBoolean("commerce_ad_link", false)) {
                    return 3;
                }
            } catch (JSONException unused) {
            }
        }
        return 2;
    }

    @JvmStatic
    @Nullable
    public static final String b(@NotNull String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f38963a, true, 30866, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f38963a, true, 30866, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "linkData");
        if (str2.length() <= 0) {
            z = false;
        }
        if (z) {
            try {
                return new JSONObject(str2).optString("commerce_ad_link_tags", null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
