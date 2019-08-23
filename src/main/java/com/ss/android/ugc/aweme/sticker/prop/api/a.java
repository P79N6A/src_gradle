package com.ss.android.ugc.aweme.sticker.prop.api;

import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.ai;
import com.ss.android.ugc.aweme.sticker.model.e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropServiceImpl;", "Lcom/ss/android/ugc/aweme/port/in/IStickerPropService;", "()V", "stickerPropApi", "Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropApi;", "kotlin.jvm.PlatformType", "getStickerPropApi", "()Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropApi;", "stickerPropApi$delegate", "Lkotlin/Lazy;", "getStickerDetail", "Lcom/ss/android/ugc/aweme/sticker/model/NewFaceStickerListBean;", "stickerIds", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements ai {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71673a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f71674b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "stickerPropApi", "getStickerPropApi()Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropApi;"))};

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f71675c = LazyKt.lazy(C0745a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.a$a  reason: collision with other inner class name */
    static final class C0745a extends Lambda implements Function0<StickerPropApi> {
        public static final C0745a INSTANCE = new C0745a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0745a() {
            super(0);
        }

        public final StickerPropApi invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82004, new Class[0], StickerPropApi.class)) {
                return (StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(StickerPropApi.class);
            }
            return (StickerPropApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82004, new Class[0], StickerPropApi.class);
        }
    }

    @WorkerThread
    @NotNull
    public final e a(@NotNull String str) {
        StickerPropApi stickerPropApi;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f71673a, false, 82003, new Class[]{String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2}, this, f71673a, false, 82003, new Class[]{String.class}, e.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "stickerIds");
        if (PatchProxy.isSupport(new Object[0], this, f71673a, false, 82002, new Class[0], StickerPropApi.class)) {
            stickerPropApi = (StickerPropApi) PatchProxy.accessDispatch(new Object[0], this, f71673a, false, 82002, new Class[0], StickerPropApi.class);
        } else {
            stickerPropApi = (StickerPropApi) this.f71675c.getValue();
        }
        Object body = stickerPropApi.getStickerDetail(str2).execute().body();
        Intrinsics.checkExpressionValueIsNotNull(body, "stickerPropApi.getSticke…ckerIds).execute().body()");
        return (e) body;
    }
}
