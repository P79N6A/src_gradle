package com.ss.android.ugc.aweme.crossplatform.params;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.g.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u001cJ\u0006\u0010\u0019\u001a\u00020\u001cR&\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR&\u0010\r\u001a\u0004\u0018\u00010\u00048F@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\t¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/params/RnInfo;", "", "()V", "bundleName", "", "bundleName$annotations", "getBundleName", "()Ljava/lang/String;", "setBundleName", "(Ljava/lang/String;)V", "bundleUrl", "getBundleUrl", "setBundleUrl", "channelName", "channelName$annotations", "getChannelName", "setChannelName", "dev", "getDev", "setDev", "fallbackUrl", "getFallbackUrl", "setFallbackUrl", "value", "forceH5", "getForceH5", "setForceH5", "isDynamic", "", "()Z", "setDynamic", "(Z)V", "moduleName", "getModuleName", "setModuleName", "rnBundle", "getRnBundle", "setRnBundle", "rnChannel", "getRnChannel", "setRnChannel", "rnSchema", "getRnSchema", "setRnSchema", "sourceUrl", "getSourceUrl", "setSourceUrl", "changeReactId", "", "reactId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40816a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f40817b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f40818c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f40819d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f40820e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f40821f;
    @Nullable
    public String g = PushConstants.PUSH_TYPE_NOTIFY;
    @Nullable
    public String h;
    @Nullable
    public String i;
    @Nullable
    public String j;
    @Nullable
    public String k;
    public boolean l;
    @Nullable
    public String m;

    @Nullable
    public final String b() {
        String str;
        if (!TextUtils.isEmpty(this.f40820e)) {
            str = this.f40820e;
            if (str == null) {
                Intrinsics.throwNpe();
                return str;
            }
        } else {
            str = this.f40819d + ".android.jsbundle";
        }
        return str;
    }

    @Nullable
    public final String a() {
        String str;
        if (!TextUtils.isEmpty(this.f40818c)) {
            str = this.f40818c;
            if (str == null) {
                Intrinsics.throwNpe();
                return str;
            }
        } else {
            str = this.f40817b;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                if (!StringsKt.endsWith$default(str, "_android", false, 2, null)) {
                    str = str + "_android";
                }
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
        }
        return str;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f40816a, false, 34303, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40816a, false, 34303, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!a.a()) {
            return TextUtils.equals(this.g, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else {
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<Boolean> rnFallback = inst.getRnFallback();
            Intrinsics.checkExpressionValueIsNotNull(rnFallback, "SharePrefCache.inst().rnFallback");
            Object c2 = rnFallback.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().rnFallback.cache");
            if (((Boolean) c2).booleanValue()) {
                return true;
            }
            return TextUtils.equals(this.g, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f40816a, false, 34304, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40816a, false, 34304, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, this.i) || !TextUtils.isEmpty(this.j)) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(@Nullable String str) {
        if (str == null) {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        this.g = str;
    }

    public final void b(@NotNull String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f40816a, false, 34302, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f40816a, false, 34302, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "reactId");
        if (this.h != null) {
            Uri parse = Uri.parse(this.h);
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String next : queryParameterNames) {
                if (TextUtils.equals(next, "reactId")) {
                    str2 = str;
                } else {
                    str2 = parse.getQueryParameter(next);
                }
                clearQuery.appendQueryParameter(next, str2);
            }
            this.h = clearQuery.toString();
        }
    }
}
