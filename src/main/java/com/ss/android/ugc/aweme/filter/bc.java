package com.ss.android.ugc.aweme.filter;

import com.google.gson.annotations.SerializedName;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.port.in.y;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\"\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bR\u001e\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001e\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001e\u0010\u0015\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0016\u0010\u0017\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0016\u0010\u0019\u001a\u00020\n8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u001e\u0010\u001b\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\rR\u0016\u0010\u001d\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0010R\u0016\u0010\u001f\u001a\u00020\n8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/UpdateFilterBoxBody;", "", "filterIds", "", "", "Lcom/ss/android/ugc/aweme/filter/FilterId;", "type", "Lcom/ss/android/ugc/aweme/filter/Type;", "(Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "accessKey", "", "kotlin.jvm.PlatformType", "getAccessKey", "()Ljava/lang/String;", "aid", "getAid", "()I", "appVersion", "getAppVersion", "channel", "getChannel", "deviceId", "getDeviceId", "effectIds", "getEffectIds", "panel", "getPanel", "region", "getRegion", "removeType", "getRemoveType", "sdkVersion", "getSdkVersion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class bc {
    @SerializedName("type")

    /* renamed from: a  reason: collision with root package name */
    public final int f47562a;
    @SerializedName("effect_ids")
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f47563b;
    @SerializedName("device_id")

    /* renamed from: c  reason: collision with root package name */
    public final String f47564c;
    @SerializedName("aid")

    /* renamed from: d  reason: collision with root package name */
    public final int f47565d;
    @SerializedName("panel")
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f47566e;
    @SerializedName("sdk_version")
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final String f47567f;
    @SerializedName("channel")
    public final String g;
    @SerializedName("region")
    public final String h;
    @SerializedName("access_key")
    public final String i;
    @SerializedName("app_version")
    public final String j;

    private bc(Set<Integer> set, int i2) {
        this.f47562a = i2;
        this.f47563b = CollectionsKt.joinToString$default(set, ",", null, null, 0, null, null, 62, null);
        this.f47564c = AppLog.getServerDeviceId();
        String str = EffectPlatform.f3094d;
        Intrinsics.checkExpressionValueIsNotNull(str, "EffectPlatform.APP_ID");
        this.f47565d = Integer.parseInt(str);
        this.f47566e = "colorfilternew";
        this.f47567f = "4.9.0";
        this.g = EffectPlatform.d();
        y yVar = a.h;
        Intrinsics.checkExpressionValueIsNotNull(yVar, "AVEnv.LOCATION_SERVICE");
        this.h = yVar.c();
        this.i = a.g();
        m mVar = a.f61121d;
        Intrinsics.checkExpressionValueIsNotNull(mVar, "AVEnv.APPLICATION_SERVICE");
        this.j = mVar.d();
    }

    public /* synthetic */ bc(Set set, int i2, byte b2) {
        this(set, i2);
    }
}
