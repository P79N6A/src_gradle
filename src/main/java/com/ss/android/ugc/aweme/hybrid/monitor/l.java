package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitIdentifier;", "uri", "Landroid/net/Uri;", "prefix", "", "(Landroid/net/Uri;Ljava/lang/String;)V", "formatData", "Lorg/json/JSONObject;", "getFormatData", "()Lorg/json/JSONObject;", "getPrefix", "()Ljava/lang/String;", "getUri", "()Landroid/net/Uri;", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49983a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Uri f49984b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f49985c;

    @NotNull
    public final JSONObject getFormatData() {
        if (PatchProxy.isSupport(new Object[0], this, f49983a, false, 49923, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f49983a, false, 49923, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(this.f49985c + "host", new Uri.Builder().scheme(this.f49984b.getScheme()).authority(this.f49984b.getAuthority()).build());
        jSONObject.put(this.f49985c + "path", this.f49984b.getPath());
        jSONObject.put(this.f49985c + PushConstants.WEB_URL, new Uri.Builder().scheme(this.f49984b.getScheme()).authority(this.f49984b.getAuthority()).path(this.f49984b.getPath()).build());
        return jSONObject;
    }

    public l(@NotNull Uri uri, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Intrinsics.checkParameterIsNotNull(str, "prefix");
        this.f49984b = uri;
        this.f49985c = str;
    }

    public /* synthetic */ l(Uri uri, String str, int i) {
        this(uri, "");
    }
}
