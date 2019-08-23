package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.feed.model.UserStoryDetail;
import com.ss.android.ugc.aweme.story.feed.model.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0012¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/ApiMonitorService;", "Lcom/ss/android/ugc/aweme/services/AbsApiMonitorService;", "()V", "filter", "", "url", "", "body", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public static final Lazy instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0<? extends T>) ApiMonitorService$Companion$instance$2.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/services/ApiMonitorService$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/services/ApiMonitorService;", "getInstance", "()Lcom/ss/android/ugc/aweme/services/ApiMonitorService;", "instance$delegate", "Lkotlin/Lazy;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/services/ApiMonitorService;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public final ApiMonitorService getInstance() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71329, new Class[0], ApiMonitorService.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71329, new Class[0], ApiMonitorService.class);
            } else {
                value = ApiMonitorService.instance$delegate.getValue();
            }
            return (ApiMonitorService) value;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private ApiMonitorService() {
    }

    public /* synthetic */ ApiMonitorService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean filter(@NotNull String str, @NotNull Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, changeQuickRedirect, false, 71328, new Class[]{String.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, changeQuickRedirect, false, 71328, new Class[]{String.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(obj2, "body");
        if (obj.getClass().getName().equals("com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockedStickerListResponse") || (obj2 instanceof a)) {
            return true;
        }
        if (!(obj2 instanceof UserStoryDetail) || ((UserStoryDetail) obj2).getUserStory() == null) {
            return false;
        }
        return true;
    }
}
