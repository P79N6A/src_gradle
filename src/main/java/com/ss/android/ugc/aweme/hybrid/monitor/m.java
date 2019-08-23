package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/PageIdentifier;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitIdentifier;", "referrerUri", "Landroid/net/Uri;", "pageUri", "(Landroid/net/Uri;Landroid/net/Uri;)V", "formatData", "Lorg/json/JSONObject;", "getFormatData", "()Lorg/json/JSONObject;", "pageIdentifier", "Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;", "getPageIdentifier", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;", "setPageIdentifier", "(Lcom/ss/android/ugc/aweme/hybrid/monitor/Identifier;)V", "value", "getPageUri", "()Landroid/net/Uri;", "setPageUri", "(Landroid/net/Uri;)V", "referrerIdentifier", "getReferrerIdentifier", "getReferrerUri", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49986a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final l f49987b = new l(this.f49990e, "referrer_");
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public l f49988c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public Uri f49989d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Uri f49990e;

    @NotNull
    public final JSONObject getFormatData() {
        if (PatchProxy.isSupport(new Object[0], this, f49986a, false, 49926, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f49986a, false, 49926, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        d.a(jSONObject, this.f49988c.getFormatData());
        d.a(jSONObject, this.f49987b.getFormatData());
        return jSONObject;
    }

    public m(@NotNull Uri uri, @NotNull Uri uri2) {
        Intrinsics.checkParameterIsNotNull(uri, "referrerUri");
        Intrinsics.checkParameterIsNotNull(uri2, "pageUri");
        this.f49990e = uri;
        this.f49988c = new l(uri2, "page_");
        this.f49989d = uri2;
    }
}
