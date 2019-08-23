package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u000fJ \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\tJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "cameraPositionState", "Landroid/arch/lifecycle/MutableLiveData;", "", "effectPlatform", "Lcom/ss/android/ugc/aweme/effectplatform/IEffectPlatform;", "recordEnable", "", "stickers", "Lcom/ss/android/ugc/aweme/mvp/model/LiveDataWrapper;", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getCameraPosition", "Landroid/arch/lifecycle/LiveData;", "getRecordEnable", "getStickers", "getStorySceneStickers", "", "loadCacheFirst", "forceReload", "loadStickerFromCache", "loadNetWorkOnFail", "requestRemoteData", "setRecordEnable", "isEnable", "updateCameraPosition", "position", "Companion", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorySceneViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74040a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f74041e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final MutableLiveData<com.ss.android.ugc.aweme.w.b.a<List<Effect>>> f74042b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<Integer> f74043c = new MutableLiveData<>();

    /* renamed from: d  reason: collision with root package name */
    public final MutableLiveData<Boolean> f74044d = new MutableLiveData<>();

    /* renamed from: f  reason: collision with root package name */
    private g f74045f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel$Companion;", "", "()V", "PANEL_STORY_SCENE", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel$loadStickerFromCache$1", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectChannelListener;", "onFail", "", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onSuccess", "response", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.effectmanager.effect.b.g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StorySceneViewModel f74047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f74048c;

        public final void a(@NotNull com.ss.android.ugc.effectmanager.common.e.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f74046a, false, 85971, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f74046a, false, 85971, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "e");
            if (this.f74048c) {
                this.f74047b.a();
            } else {
                this.f74047b.f74042b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.ERROR, cVar.f77317c));
            }
        }

        public final void a(@NotNull EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f74046a, false, 85970, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f74046a, false, 85970, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(effectChannelResponse2, "response");
            this.f74047b.f74042b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, effectChannelResponse2.allCategoryEffects));
        }

        b(StorySceneViewModel storySceneViewModel, boolean z) {
            this.f74047b = storySceneViewModel;
            this.f74048c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel$requestRemoteData$1", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectChannelListener;", "onFail", "", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onSuccess", "response", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.effectmanager.effect.b.g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StorySceneViewModel f74050b;

        c(StorySceneViewModel storySceneViewModel) {
            this.f74050b = storySceneViewModel;
        }

        public final void a(@NotNull com.ss.android.ugc.effectmanager.common.e.c cVar) {
            com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{cVar2}, this, f74049a, false, 85973, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar2}, this, f74049a, false, 85973, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "e");
            this.f74050b.b(false);
        }

        public final void a(@NotNull EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (PatchProxy.isSupport(new Object[]{effectChannelResponse2}, this, f74049a, false, 85972, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effectChannelResponse2}, this, f74049a, false, 85972, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(effectChannelResponse2, "response");
            com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b.f73856c.a("zoomin", System.currentTimeMillis());
            this.f74050b.f74042b.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, effectChannelResponse2.allCategoryEffects));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74040a, false, 85968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74040a, false, 85968, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f74045f;
        if (gVar != null) {
            gVar.a("zoomin", false, (com.ss.android.ugc.effectmanager.effect.b.g) new c(this));
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74040a, false, 85969, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74040a, false, 85969, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        g gVar = this.f74045f;
        if (gVar != null) {
            gVar.a("zoomin", (com.ss.android.ugc.effectmanager.effect.b.g) new b(this, z));
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74040a, false, 85966, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74040a, false, 85966, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f74043c.setValue(Integer.valueOf(i));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74040a, false, 85967, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74040a, false, 85967, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74044d.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public void a(@NotNull g gVar, boolean z, boolean z2) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f74040a, false, 85965, new Class[]{g.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f74040a, false, 85965, new Class[]{g.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar, "effectPlatform");
        this.f74045f = gVar2;
        if (z) {
            b(true);
            return;
        }
        if (z2) {
            a();
        }
    }
}
