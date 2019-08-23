package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
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
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;", "", "()V", "mVoiceEffectList", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "checkEffectExist", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "clearPreprocessCache", "", "fetchVoiceEffect", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$OnVoiceEffectDownloadListener;", "fetchVoiceEffectList", "onVoiceListLoadListener", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$OnVoiceListLoadListener;", "getPreprocessCache", "", "key", "", "putCache", "value", "trimToSize", "target", "", "Companion", "OnVoiceEffectDownloadListener", "OnVoiceListLoadListener", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67060a;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f67061c = LazyKt.lazy(b.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f67062d = LazyKt.lazy(d.INSTANCE);

    /* renamed from: e  reason: collision with root package name */
    public static final Lazy f67063e = LazyKt.lazy(C0713c.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    public static final a f67064f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public CategoryPageModel f67065b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R!\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$Companion;", "", "()V", "DEFAULT_COUNT", "", "DEFAULT_CURSOR", "DEFAULT_SORTING_POSITION", "DEFAULT_VERSION", "", "VOICE_CATEGORY", "VOICE_PANEL", "instance", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;", "instance$delegate", "Lkotlin/Lazy;", "mCache", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;", "getMCache", "()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;", "mCache$delegate", "mEffectPlatform", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "getMEffectPlatform", "()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "mEffectPlatform$delegate", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67066a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f67067b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mEffectPlatform", "getMEffectPlatform()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;"))};

        @NotNull
        public final c a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f67066a, false, 76607, new Class[0], c.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f67066a, false, 76607, new Class[0], c.class);
            } else {
                value = c.f67061c.getValue();
            }
            return (c) value;
        }

        public final EffectPlatform b() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f67066a, false, 76608, new Class[0], EffectPlatform.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f67066a, false, 76608, new Class[0], EffectPlatform.class);
            } else {
                value = c.f67062d.getValue();
            }
            return (EffectPlatform) value;
        }

        public final f c() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f67066a, false, 76609, new Class[0], f.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f67066a, false, 76609, new Class[0], f.class);
            } else {
                value = c.f67063e.getValue();
            }
            return (f) value;
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<c> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76610, new Class[0], c.class)) {
                return new c((byte) 0);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76610, new Class[0], c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioPreprocessCache;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$c  reason: collision with other inner class name */
    static final class C0713c extends Lambda implements Function0<f> {
        public static final C0713c INSTANCE = new C0713c();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0713c() {
            super(0);
        }

        @NotNull
        public final f invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76611, new Class[0], f.class)) {
                return new f(0, 1);
            }
            return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76611, new Class[0], f.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<EffectPlatform> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(0);
        }

        @NotNull
        public final EffectPlatform invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76612, new Class[0], EffectPlatform.class)) {
                return (EffectPlatform) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76612, new Class[0], EffectPlatform.class);
            }
            EffectPlatform effectPlatform = new EffectPlatform(com.ss.android.ugc.aweme.port.in.a.f61119b, com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
            com.ss.android.ugc.aweme.port.in.a.e();
            return effectPlatform;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$OnVoiceEffectDownloadListener;", "", "onFail", "", "failedEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onStart", "effect", "onSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface e {
        void a(@Nullable Effect effect);

        void a(@Nullable Effect effect, @NotNull com.ss.android.ugc.effectmanager.common.e.c cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$OnVoiceListLoadListener;", "", "onVoiceListLoadFailed", "", "code", "", "msg", "", "onVoiceListLoaded", "model", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "onVoiceListLoading", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface f {
        void a(int i, @NotNull String str);

        void a(@Nullable CategoryPageModel categoryPageModel);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$fetchVoiceEffect$1", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectListener;", "onFail", "", "failedEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onStart", "effect", "onSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67068a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f67069b;

        public final void b(@Nullable Effect effect) {
        }

        g(e eVar) {
            this.f67069b = eVar;
        }

        public final void a(@Nullable Effect effect) {
            Effect effect2 = effect;
            if (PatchProxy.isSupport(new Object[]{effect2}, this, f67068a, false, 76613, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect2}, this, f67068a, false, 76613, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            e eVar = this.f67069b;
            if (eVar != null) {
                eVar.a(effect2);
            }
        }

        public final void a(@Nullable Effect effect, @NotNull com.ss.android.ugc.effectmanager.common.e.c cVar) {
            Effect effect2 = effect;
            com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{effect2, cVar2}, this, f67068a, false, 76614, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect2, cVar2}, this, f67068a, false, 76614, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "e");
            e eVar = this.f67069b;
            if (eVar != null) {
                eVar.a(effect2, cVar2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$fetchVoiceEffectList$1", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchCategoryEffectListener;", "onFail", "", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onSuccess", "response", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements com.ss.android.ugc.effectmanager.effect.b.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f67071b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f67072c;

        public final void a(@Nullable CategoryPageModel categoryPageModel) {
            if (PatchProxy.isSupport(new Object[]{categoryPageModel}, this, f67070a, false, 76615, new Class[]{CategoryPageModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{categoryPageModel}, this, f67070a, false, 76615, new Class[]{CategoryPageModel.class}, Void.TYPE);
                return;
            }
            this.f67071b.f67065b = categoryPageModel;
            f fVar = this.f67072c;
            if (fVar != null) {
                fVar.a(categoryPageModel);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
            if (r0 == null) goto L_0x0046;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.effectmanager.common.e.c r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f67070a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.effectmanager.common.e.c> r3 = com.ss.android.ugc.effectmanager.common.e.c.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 76616(0x12b48, float:1.07362E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0036
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f67070a
                r13 = 0
                r14 = 76616(0x12b48, float:1.07362E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.effectmanager.common.e.c> r0 = com.ss.android.ugc.effectmanager.common.e.c.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0036:
                r1 = r17
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$f r2 = r1.f67072c
                if (r2 == 0) goto L_0x004c
                if (r0 == 0) goto L_0x0040
                int r9 = r0.f77315a
            L_0x0040:
                if (r0 == 0) goto L_0x0046
                java.lang.String r0 = r0.f77316b
                if (r0 != 0) goto L_0x0048
            L_0x0046:
                java.lang.String r0 = ""
            L_0x0048:
                r2.a(r9, r0)
                return
            L_0x004c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.h.a(com.ss.android.ugc.effectmanager.common.e.c):void");
        }

        h(c cVar, f fVar) {
            this.f67071b = cVar;
            this.f67072c = fVar;
        }
    }

    @NotNull
    public static final c a() {
        return PatchProxy.isSupport(new Object[0], null, f67060a, true, 76606, new Class[0], c.class) ? (c) PatchProxy.accessDispatch(new Object[0], null, f67060a, true, 76606, new Class[0], c.class) : f67064f.a();
    }

    private c() {
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(@Nullable f fVar) {
        List<String> list;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f67060a, false, 76599, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f67060a, false, 76599, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (this.f67065b != null) {
            CategoryPageModel categoryPageModel = this.f67065b;
            if (categoryPageModel != null) {
                list = categoryPageModel.url_prefix;
            } else {
                list = null;
            }
            if (!CollectionUtils.isEmpty(list)) {
                fVar2.a(this.f67065b);
                return;
            }
        }
        f67064f.b().a("voicechanger", "all", false, 8, 0, 0, "", new h(this, fVar2));
    }

    public final boolean a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f67060a, false, 76601, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, this, f67060a, false, 76601, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (a.a(effect)) {
            return true;
        } else {
            if (effect2 == null || (!f67064f.b().a(effect2) && effect2.effect_type == 0 && !effect.getTags().contains("hw_beauty"))) {
                return false;
            }
            return true;
        }
    }

    @Nullable
    public final byte[] a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f67060a, false, 76604, new Class[]{String.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{str2}, this, f67060a, false, 76604, new Class[]{String.class}, byte[].class);
        } else if (str2 == null) {
            return null;
        } else {
            f c2 = f67064f.c();
            if (PatchProxy.isSupport(new Object[]{str2}, c2, f.f67075a, false, 76680, new Class[]{String.class}, byte[].class)) {
                return (byte[]) PatchProxy.accessDispatch(new Object[]{str2}, c2, f.f67075a, false, 76680, new Class[]{String.class}, byte[].class);
            } else if (str2 == null) {
                return null;
            } else {
                return (byte[]) c2.f67076b.get(str2);
            }
        }
    }
}
