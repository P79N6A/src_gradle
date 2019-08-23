package com.ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.toutiao.proxyserver.a.c;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u00103\u001a\u00020\nH\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000e¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/video/preload/RequestInfo;", "", "()V", "requestModel", "Lcom/toutiao/proxyserver/bean/RequestModel;", "(Lcom/toutiao/proxyserver/bean/RequestModel;)V", "cdnLog", "Lcom/ss/ttvideoengine/utils/DataLoaderCDNLog;", "(Lcom/ss/ttvideoengine/utils/DataLoaderCDNLog;)V", "dnsAddr", "", "getDnsAddr", "()Ljava/lang/String;", "setDnsAddr", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "finalUrl", "getFinalUrl", "setFinalUrl", "headers", "", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "hostName", "getHostName", "setHostName", "key", "getKey", "setKey", "localIp", "getLocalIp", "setLocalIp", "originUrl", "getOriginUrl", "setOriginUrl", "remoteIp", "getRemoteIp", "setRemoteIp", "size", "getSize", "setSize", "userAgent", "getUserAgent", "setUserAgent", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76208a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f76209b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f76210c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f76211d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f76212e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f76213f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @Nullable
    public String i;
    public long j;
    public long k;
    @Nullable
    public Map<String, String> l;

    public e() {
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f76208a, false, 89163, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76208a, false, 89163, new Class[0], String.class);
        }
        return "RequestInfo(key=" + this.f76209b + ", hostName=" + this.f76210c + ", dnsAddr=" + this.f76211d + ", originUrl=" + this.f76212e + ", finalUrl=" + this.f76213f + ", localIp=" + this.g + ", remoteIp=" + this.h + ", userAgent=" + this.i + ", duration=" + this.j + ", size=" + this.k + ", headers=" + this.l + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(@NotNull c cVar) {
        this();
        Intrinsics.checkParameterIsNotNull(cVar, "requestModel");
        this.f76209b = cVar.f80003b;
        this.f76210c = cVar.f80004c;
        this.f76211d = cVar.f80005d;
        this.f76212e = cVar.f80006e;
        this.f76213f = cVar.f80007f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = (long) cVar.k;
        this.l = cVar.l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(@NotNull DataLoaderCDNLog dataLoaderCDNLog) {
        this();
        Intrinsics.checkParameterIsNotNull(dataLoaderCDNLog, "cdnLog");
        this.f76209b = dataLoaderCDNLog.fileKey;
        this.f76210c = dataLoaderCDNLog.host;
        this.f76213f = dataLoaderCDNLog.url;
        this.h = dataLoaderCDNLog.serverIp;
        this.k = dataLoaderCDNLog.contentLength;
        this.j = dataLoaderCDNLog.reqEndT - dataLoaderCDNLog.reqStartT;
        this.l = new HashMap();
        if (!TextUtils.isEmpty(dataLoaderCDNLog.xCache)) {
            Map<String, String> map = this.l;
            if (map != null) {
                ((HashMap) map).put(com.ss.android.ugc.aweme.player.a.c.g, dataLoaderCDNLog.xCache);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            }
        }
        if (!TextUtils.isEmpty(dataLoaderCDNLog.xMCache)) {
            Map<String, String> map2 = this.l;
            if (map2 != null) {
                ((HashMap) map2).put(com.ss.android.ugc.aweme.player.a.c.h, dataLoaderCDNLog.xMCache);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
        }
    }
}
