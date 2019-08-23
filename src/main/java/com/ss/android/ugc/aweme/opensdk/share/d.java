package com.ss.android.ugc.aweme.opensdk.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0016J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\"\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/opensdk/share/SharePublishServiceExtension;", "Lcom/ss/android/ugc/aweme/shortvideo/publish/IAVPublishServiceExtension;", "()V", "name", "", "getName", "()Ljava/lang/String;", "writeFieldMap", "", "photoContext", "Lcom/ss/android/ugc/aweme/photo/PhotoContext;", "fieldMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "videoContext", "Lcom/ss/android/ugc/aweme/shortvideo/BaseShortVideoContext;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58393a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final String f58394b = "SharePublishServiceExtension";

    public final void a(@NotNull PhotoContext photoContext, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        PhotoContext photoContext2 = photoContext;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{photoContext2, linkedHashMap2}, this, f58393a, false, 63404, new Class[]{PhotoContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext2, linkedHashMap2}, this, f58393a, false, 63404, new Class[]{PhotoContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(photoContext2, "photoContext");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldMap");
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        w a2 = ((IAVServiceProxy) service).getBridgeService().a((Object) photoContext2);
        if (a2 != null) {
            Map map = linkedHashMap2;
            if (a2.mClientKey == null) {
                str = "";
            } else {
                str = a2.mClientKey;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (shareContext?.mClien…e shareContext.mClientKey");
            map.put("open_platform_key", str);
            if (a2.mState == null) {
                str2 = "";
            } else {
                str2 = a2.mState;
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "if (shareContext?.mState… else shareContext.mState");
            map.put("open_platform_share_id", str2);
        }
    }

    public final void a(@NotNull BaseShortVideoContext baseShortVideoContext, @NotNull LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2, linkedHashMap2}, this, f58393a, false, 63403, new Class[]{BaseShortVideoContext.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2, linkedHashMap2}, this, f58393a, false, 63403, new Class[]{BaseShortVideoContext.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseShortVideoContext2, "videoContext");
        Intrinsics.checkParameterIsNotNull(linkedHashMap2, "fieldMap");
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        w a2 = ((IAVServiceProxy) service).getBridgeService().a((Object) baseShortVideoContext2);
        if (a2 != null) {
            Map map = linkedHashMap2;
            if (a2.mClientKey == null) {
                str = "";
            } else {
                str = a2.mClientKey;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (shareContext?.mClien…e shareContext.mClientKey");
            map.put("open_platform_key", str);
            if (a2.mState == null) {
                str2 = "";
            } else {
                str2 = a2.mState;
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "if (shareContext?.mState… else shareContext.mState");
            map.put("open_platform_share_id", str2);
        }
    }
}
