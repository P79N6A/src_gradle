package com.ss.android.ugc.aweme.im.sdk.videofileplay;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.videofileplay.a.b;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/EncryptedVideoApiManager;", "", "()V", "AWEME_HOST", "", "default", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/EncryptedVideoApi;", "default$annotations", "getDefault", "()Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/EncryptedVideoApi;", "encryptedVideoApi", "getVideoUrl", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/model/VideoUrlResponse;", "tosKey", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52686a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f52687b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static EncryptedVideoApi f52688c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.a$a  reason: collision with other inner class name */
    static final class C0609a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0609a f52689a = new C0609a();

        C0609a() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return null;
        }
    }

    private a() {
    }

    @Nullable
    private static EncryptedVideoApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f52686a, true, 53857, new Class[0], EncryptedVideoApi.class)) {
            return (EncryptedVideoApi) PatchProxy.accessDispatch(new Object[0], null, f52686a, true, 53857, new Class[0], EncryptedVideoApi.class);
        }
        if (f52688c == null) {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            if (iRetrofitService != null) {
                f52688c = (EncryptedVideoApi) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com/").create(EncryptedVideoApi.class);
            }
        }
        return f52688c;
    }

    @NotNull
    public final i<b> a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f52686a, false, 53858, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, this, f52686a, false, 53858, new Class[]{String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "tosKey");
        if (a() != null) {
            EncryptedVideoApi a2 = a();
            if (a2 == null) {
                Intrinsics.throwNpe();
            }
            return a2.getVideoPlayUrl(str2);
        }
        i<b> a3 = i.a((Callable<TResult>) C0609a.f52689a);
        Intrinsics.checkExpressionValueIsNotNull(a3, "Task.callInBackground { null }");
        return a3;
    }
}
