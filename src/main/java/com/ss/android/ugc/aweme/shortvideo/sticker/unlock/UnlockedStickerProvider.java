package com.ss.android.ugc.aweme.shortvideo.sticker.unlock;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider;", "", "()V", "API_URL_PREFIX_SI", "", "sStickerAPI", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider$UnlockedStickerListApi;", "getSStickerAPI", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider$UnlockedStickerListApi;", "sStickerAPI$delegate", "Lkotlin/Lazy;", "fetchUnlockedStickers", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerListResponse;", "activityId", "UnlockedStickerListApi", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UnlockedStickerProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70193a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f70194b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(UnlockedStickerProvider.class), "sStickerAPI", "getSStickerAPI()Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider$UnlockedStickerListApi;"))};

    /* renamed from: c  reason: collision with root package name */
    static final Lazy f70195c = LazyKt.lazy(a.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    public static final UnlockedStickerProvider f70196d = new UnlockedStickerProvider();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider$UnlockedStickerListApi;", "", "getUnlockedStickers", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerListResponse;", "userId", "", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface UnlockedStickerListApi {
        @NotNull
        @GET(a = "https://aweme.snssdk.com/aweme/v1/ug/stickers/unlocked/")
        q<UnlockedStickerListResponse> getUnlockedStickers(@NotNull @Query(a = "events_ids") List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider$UnlockedStickerListApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<UnlockedStickerListApi> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final UnlockedStickerListApi invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 79876, new Class[0], UnlockedStickerListApi.class)) {
                return (UnlockedStickerListApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(UnlockedStickerListApi.class);
            }
            return (UnlockedStickerListApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 79876, new Class[0], UnlockedStickerListApi.class);
        }
    }

    private UnlockedStickerProvider() {
    }
}
