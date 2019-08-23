package com.ss.android.ugc.aweme.services.story;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.publish.a.h;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/services/story/StorySettingServiceImpl;", "Lcom/ss/android/ugc/aweme/services/story/IStorySettingService;", "()V", "getStorySettingDoudouSwitch", "", "loadData", "", "setFirstPublishSuccStatus", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySettingServiceImpl implements IStorySettingService {
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Lazy INSTANCE$delegate = LazyKt.lazy(StorySettingServiceImpl$Companion$INSTANCE$2.INSTANCE);
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/services/story/StorySettingServiceImpl$Companion;", "", "()V", "INSTANCE", "Lcom/ss/android/ugc/aweme/services/story/StorySettingServiceImpl;", "INSTANCE$annotations", "getINSTANCE", "()Lcom/ss/android/ugc/aweme/services/story/StorySettingServiceImpl;", "INSTANCE$delegate", "Lkotlin/Lazy;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/services/story/StorySettingServiceImpl;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        @JvmStatic
        public static /* synthetic */ void INSTANCE$annotations() {
        }

        @NotNull
        public final StorySettingServiceImpl getINSTANCE() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71596, new Class[0], StorySettingServiceImpl.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71596, new Class[0], StorySettingServiceImpl.class);
            } else {
                value = StorySettingServiceImpl.INSTANCE$delegate.getValue();
            }
            return (StorySettingServiceImpl) value;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public static final StorySettingServiceImpl getINSTANCE() {
        return PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 71595, new Class[0], StorySettingServiceImpl.class) ? (StorySettingServiceImpl) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 71595, new Class[0], StorySettingServiceImpl.class) : Companion.getINSTANCE();
    }

    private StorySettingServiceImpl() {
    }

    public final boolean getStorySettingDoudouSwitch() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71593, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71593, new Class[0], Boolean.TYPE)).booleanValue();
        }
        h a2 = h.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "StorySettingManager.getInstance()");
        return a2.d();
    }

    public final void loadData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71592, new Class[0], Void.TYPE);
            return;
        }
        h.a().b();
    }

    public final void setFirstPublishSuccStatus() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71594, new Class[0], Void.TYPE);
            return;
        }
        h.a().c();
    }

    public /* synthetic */ StorySettingServiceImpl(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
