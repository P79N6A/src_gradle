package com.ss.android.ugc.aweme.discover.hotspot.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.hotspot.a.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModelMiddlewareBinding;", "Lcom/bytedance/jedi/arch/MiddlewareBinding;", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainViewModel;", "()V", "bind0", "", "target", "binding", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotMainViewModelMiddlewareBinding implements n<HotSpotMainState, HotSpotMainViewModel> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<HotSpotMainState, ListState<Aweme, f>, HotSpotMainState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final HotSpotMainState invoke(@NotNull HotSpotMainState hotSpotMainState, @NotNull ListState<Aweme, f> listState) {
            HotSpotMainState hotSpotMainState2 = hotSpotMainState;
            ListState<Aweme, f> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{hotSpotMainState2, listState2}, this, changeQuickRedirect, false, 36664, new Class[]{HotSpotMainState.class, ListState.class}, HotSpotMainState.class)) {
                return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSpotMainState2, listState2}, this, changeQuickRedirect, false, 36664, new Class[]{HotSpotMainState.class, ListState.class}, HotSpotMainState.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSpotMainState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return HotSpotMainState.copy$default(hotSpotMainState, null, null, null, null, null, false, listState, hotSpotMainState.getStateMap(), 63, null);
        }
    }

    public final void binding(@NotNull HotSpotMainViewModel hotSpotMainViewModel) {
        HotSpotMainViewModel hotSpotMainViewModel2 = hotSpotMainViewModel;
        if (PatchProxy.isSupport(new Object[]{hotSpotMainViewModel2}, this, changeQuickRedirect, false, 36660, new Class[]{HotSpotMainViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSpotMainViewModel2}, this, changeQuickRedirect, false, 36660, new Class[]{HotSpotMainViewModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hotSpotMainViewModel2, "target");
        bind0(hotSpotMainViewModel);
    }

    private final void bind0(HotSpotMainViewModel hotSpotMainViewModel) {
        HotSpotMainViewModel hotSpotMainViewModel2 = hotSpotMainViewModel;
        if (PatchProxy.isSupport(new Object[]{hotSpotMainViewModel2}, this, changeQuickRedirect, false, 36661, new Class[]{HotSpotMainViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSpotMainViewModel2}, this, changeQuickRedirect, false, 36661, new Class[]{HotSpotMainViewModel.class}, Void.TYPE);
            return;
        }
        ListMiddleware<HotSpotMainState, Aweme, f> listMiddleware = hotSpotMainViewModel2.g;
        listMiddleware.a(c.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
        hotSpotMainViewModel2.a(listMiddleware);
    }
}
