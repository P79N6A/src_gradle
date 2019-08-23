package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiRequest;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IJsonFormatable;", "url", "", "method", "body", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "formatData", "Lorg/json/JSONObject;", "getFormatData", "()Lorg/json/JSONObject;", "getMethod", "uri", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri$delegate", "Lkotlin/Lazy;", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49971a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f49972b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "uri", "getUri()Landroid/net/Uri;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f49973c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f49974d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f49975e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f49976f = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new a<Object>(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Uri> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        public final Uri invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 49909, new Class[0], Uri.class)) {
                return Uri.parse(this.this$0.f49973c);
            }
            return (Uri) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 49909, new Class[0], Uri.class);
        }
    }

    @NotNull
    private Uri a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f49971a, false, 49903, new Class[0], Uri.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f49971a, false, 49903, new Class[0], Uri.class);
        } else {
            value = this.f49976f.getValue();
        }
        return (Uri) value;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49971a, false, 49908, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f49971a, false, 49908, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual((Object) this.f49973c, (Object) bVar.f49973c) || !Intrinsics.areEqual((Object) this.f49974d, (Object) bVar.f49974d) || !Intrinsics.areEqual((Object) this.f49975e, (Object) bVar.f49975e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f49971a, false, 49907, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49971a, false, 49907, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f49973c;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f49974d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f49975e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f49971a, false, 49906, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49971a, false, 49906, new Class[0], String.class);
        }
        return "ApiRequest(url=" + this.f49973c + ", method=" + this.f49974d + ", body=" + this.f49975e + ")";
    }

    @NotNull
    public final JSONObject getFormatData() {
        if (PatchProxy.isSupport(new Object[0], this, f49971a, false, 49904, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f49971a, false, 49904, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("host", new Uri.Builder().scheme(a().getScheme()).authority(a().getAuthority()).build());
        jSONObject.put("path", a().getPath());
        jSONObject.put(PushConstants.WEB_URL, new Uri.Builder().scheme(a().getScheme()).authority(a().getAuthority()).path(a().getPath()).build());
        jSONObject.put("params", a().getQuery());
        jSONObject.put("body", this.f49975e);
        jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.f49974d);
        return jSONObject;
    }

    public b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.MZ_PUSH_MESSAGE_METHOD);
        Intrinsics.checkParameterIsNotNull(str3, "body");
        this.f49973c = str;
        this.f49974d = str2;
        this.f49975e = str3;
    }
}
