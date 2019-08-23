package com.ss.android.ugc.aweme.effectplatform;

import android.arch.lifecycle.Observer;
import android.support.annotation.Keep;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.af;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001,B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002J8\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u00132\u001a\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013H\u0002J\u001a\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0007J.\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u001f2\u001a\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013H\u0002J\u001a\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R2\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011j\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u0001`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyPlatform;", "", "()V", "ALL_GENDER", "", "BOY", "GIRL", "beautyResType", "effectPlatformFileHelper", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatformFileHelper;", "getEffectPlatformFileHelper", "()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatformFileHelper;", "setEffectPlatformFileHelper", "(Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatformFileHelper;)V", "makeupResType", "reshapeResType", "ulikeBeautyDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyPlatform$UlikeBeautyData;", "Lkotlin/collections/ArrayList;", "getUlikeBeautyDataList", "()Ljava/util/ArrayList;", "setUlikeBeautyDataList", "(Ljava/util/ArrayList;)V", "fetchBeautifyInfo", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "fillEffectPath", "effects", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "filterGroup", "dataList", "getResPath", "gender", "resType", "parseExtra", "effect", "recordValues", "ulikeBeautyExtra", "Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyExtra;", "useDownloadUlikeBeauty", "", "UlikeBeautyData", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UlikeBeautyPlatform {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43796a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    static ArrayList<UlikeBeautyData> f43797b = new ArrayList<>();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    static c f43798c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final UlikeBeautyPlatform f43799d = new UlikeBeautyPlatform();

    @Keep
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyPlatform$UlikeBeautyData;", "", "ulikeBeautyExtra", "Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyExtra;", "unzipPath", "", "effectId", "(Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyExtra;Ljava/lang/String;Ljava/lang/String;)V", "getEffectId", "()Ljava/lang/String;", "setEffectId", "(Ljava/lang/String;)V", "getUlikeBeautyExtra", "()Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyExtra;", "setUlikeBeautyExtra", "(Lcom/ss/android/ugc/aweme/effectplatform/UlikeBeautyExtra;)V", "getUnzipPath", "setUnzipPath", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class UlikeBeautyData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private String effectId;
        @Nullable
        private UlikeBeautyExtra ulikeBeautyExtra;
        @Nullable
        private String unzipPath;

        @Nullable
        public final String getEffectId() {
            return this.effectId;
        }

        @Nullable
        public final UlikeBeautyExtra getUlikeBeautyExtra() {
            return this.ulikeBeautyExtra;
        }

        @Nullable
        public final String getUnzipPath() {
            return this.unzipPath;
        }

        public final void setEffectId(@Nullable String str) {
            this.effectId = str;
        }

        public final void setUlikeBeautyExtra(@Nullable UlikeBeautyExtra ulikeBeautyExtra2) {
            this.ulikeBeautyExtra = ulikeBeautyExtra2;
        }

        public final void setUnzipPath(@Nullable String str) {
            this.unzipPath = str;
        }

        public UlikeBeautyData(@Nullable UlikeBeautyExtra ulikeBeautyExtra2, @Nullable String str, @Nullable String str2) {
            this.ulikeBeautyExtra = ulikeBeautyExtra2;
            this.unzipPath = str;
            this.effectId = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "liveDataWrapper", "Lcom/ss/android/ugc/aweme/mvp/model/LiveDataWrapper;", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 1, 15})
    public static final class a<T> implements Observer<com.ss.android.ugc.aweme.w.b.a<CategoryPageModel>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FragmentActivity f43801b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InfoStickerViewModel f43802c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
        @DebugMetadata(b = "UlikeBeautyPlatform.kt", c = {}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$fetchBeautifyInfo$1$1")
        /* renamed from: com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$a$1  reason: invalid class name */
        static final class AnonymousClass1 extends k implements Function2<af, c<? super Unit>, Object> {
            public static ChangeQuickRedirect changeQuickRedirect;
            int label;
            private af p$;
            final /* synthetic */ a this$0;

            {
                this.this$0 = r1;
            }

            @NotNull
            public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
                if (PatchProxy.isSupport(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39025, new Class[]{Object.class, c.class}, c.class)) {
                    return (c) PatchProxy.accessDispatch(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 39025, new Class[]{Object.class, c.class}, c.class);
                }
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                AnonymousClass1 r0 = new AnonymousClass1(this.this$0, aVar, cVar);
                r0.p$ = (af) obj;
                return r0;
            }

            public final Object invoke(Object obj, Object obj2) {
                Object obj3 = obj;
                if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 39026, new Class[]{Object.class, Object.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 39026, new Class[]{Object.class, Object.class}, Object.class);
                }
                return ((AnonymousClass1) create(obj3, (c) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.util.Collection} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.List} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: android.support.v4.app.FragmentActivity} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Removed duplicated region for block: B:124:0x0314  */
            /* JADX WARNING: Removed duplicated region for block: B:125:0x0317  */
            /* JADX WARNING: Removed duplicated region for block: B:127:0x031a  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
            /* JADX WARNING: Removed duplicated region for block: B:154:0x03b1  */
            /* JADX WARNING: Removed duplicated region for block: B:155:0x03ca  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0084 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00f8  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x0199  */
            @org.jetbrains.annotations.Nullable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
                /*
                    r20 = this;
                    r7 = r20
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r21
                    com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    r5[r10] = r1
                    java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                    r3 = 0
                    r4 = 39024(0x9870, float:5.4684E-41)
                    r1 = r20
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0039
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r21
                    com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                    r3 = 0
                    r4 = 39024(0x9870, float:5.4684E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    r5[r10] = r1
                    java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                    r1 = r20
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    java.lang.Object r0 = (java.lang.Object) r0
                    return r0
                L_0x0039:
                    int r0 = r7.label
                    if (r0 != 0) goto L_0x03dc
                    com.ss.android.ugc.aweme.w.b.a r0 = r0
                    M r0 = r0.f76549b
                    com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r0 = (com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel) r0
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform r1 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43799d
                    r2 = 0
                    if (r0 == 0) goto L_0x004f
                    com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r3 = r0.category_effects
                    if (r3 == 0) goto L_0x004f
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r3.effects
                    goto L_0x0050
                L_0x004f:
                    r3 = r2
                L_0x0050:
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r3
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43796a
                    r14 = 0
                    r15 = 39020(0x986c, float:5.4679E-41)
                    java.lang.Class[] r4 = new java.lang.Class[r9]
                    java.lang.Class<java.util.List> r5 = java.util.List.class
                    r4[r10] = r5
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r4 == 0) goto L_0x0084
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r3
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43796a
                    r14 = 0
                    r15 = 39020(0x986c, float:5.4679E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r9]
                    java.lang.Class<java.util.List> r4 = java.util.List.class
                    r3[r10] = r4
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r3
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x00e9
                L_0x0084:
                    if (r3 == 0) goto L_0x00e9
                    boolean r1 = r3.isEmpty()
                    if (r1 == 0) goto L_0x008d
                    goto L_0x00e9
                L_0x008d:
                    java.util.Iterator r1 = r3.iterator()
                L_0x0091:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L_0x00e9
                    java.lang.Object r3 = r1.next()
                    com.ss.android.ugc.effectmanager.effect.model.Effect r3 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r3
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.io.File r5 = com.ss.android.ugc.aweme.effectplatform.EffectPlatform.f3092b
                    java.lang.String r6 = "EffectPlatform.LOCAL_CACHEDIR"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                    java.lang.String r5 = r5.getAbsolutePath()
                    r4.append(r5)
                    java.lang.String r5 = java.io.File.separator
                    r4.append(r5)
                    java.lang.String r5 = r3.id
                    r4.append(r5)
                    java.lang.String r5 = ".zip"
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    r3.zipPath = r4
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.io.File r5 = com.ss.android.ugc.aweme.effectplatform.EffectPlatform.f3092b
                    java.lang.String r6 = "EffectPlatform.LOCAL_CACHEDIR"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                    java.lang.String r5 = r5.getAbsolutePath()
                    r4.append(r5)
                    java.lang.String r5 = java.io.File.separator
                    r4.append(r5)
                    java.lang.String r5 = r3.id
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    r3.unzipPath = r4
                    goto L_0x0091
                L_0x00e9:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    java.lang.String r3 = "categoryPageModel"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                    com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r3 = r0.category_effects
                    r4 = 2
                    if (r3 == 0) goto L_0x0187
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r3.effects
                    if (r3 == 0) goto L_0x0187
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    java.util.Iterator r3 = r3.iterator()
                L_0x0102:
                    boolean r5 = r3.hasNext()
                    if (r5 == 0) goto L_0x0187
                    java.lang.Object r5 = r3.next()
                    com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r5
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform r6 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43799d
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r11[r10] = r5
                    r11[r9] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43796a
                    r14 = 0
                    r15 = 39021(0x986d, float:5.468E-41)
                    java.lang.Class[] r8 = new java.lang.Class[r4]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r12 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r8[r10] = r12
                    java.lang.Class<java.util.ArrayList> r12 = java.util.ArrayList.class
                    r8[r9] = r12
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r6
                    r16 = r8
                    boolean r8 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r8 == 0) goto L_0x0150
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r11[r10] = r5
                    r11[r9] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43796a
                    r14 = 0
                    r15 = 39021(0x986d, float:5.468E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r4]
                    java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r8 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                    r5[r10] = r8
                    java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
                    r5[r9] = r8
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r6
                    r16 = r5
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x0102
                L_0x0150:
                    if (r5 == 0) goto L_0x0155
                    java.lang.String r6 = r5.extra
                    goto L_0x0156
                L_0x0155:
                    r6 = r2
                L_0x0156:
                    java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                    boolean r6 = android.text.TextUtils.isEmpty(r6)
                    if (r6 != 0) goto L_0x0102
                    com.google.gson.Gson r6 = com.ss.android.ugc.aweme.port.in.a.f61120c     // Catch:{ JsonSyntaxException -> 0x0184 }
                    if (r5 == 0) goto L_0x0165
                    java.lang.String r8 = r5.extra     // Catch:{ JsonSyntaxException -> 0x0184 }
                    goto L_0x0166
                L_0x0165:
                    r8 = r2
                L_0x0166:
                    java.lang.Class<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra> r11 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra.class
                    java.lang.Object r6 = r6.fromJson((java.lang.String) r8, (java.lang.Class<T>) r11)     // Catch:{ JsonSyntaxException -> 0x0184 }
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r6 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra) r6     // Catch:{ JsonSyntaxException -> 0x0184 }
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r8 = new com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData
                    if (r5 == 0) goto L_0x0175
                    java.lang.String r11 = r5.unzipPath
                    goto L_0x0176
                L_0x0175:
                    r11 = r2
                L_0x0176:
                    if (r5 == 0) goto L_0x017b
                    java.lang.String r5 = r5.effect_id
                    goto L_0x017c
                L_0x017b:
                    r5 = r2
                L_0x017c:
                    r8.<init>(r6, r11, r5)
                    r1.add(r8)
                    goto L_0x0102
                L_0x0184:
                    goto L_0x0102
                L_0x0187:
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform r3 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43799d
                    java.util.ArrayList r3 = r3.a(r1)
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    java.util.Iterator r5 = r3.iterator()
                L_0x0193:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x0310
                    java.lang.Object r6 = r5.next()
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r6 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r6
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform r8 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43799d
                    if (r6 == 0) goto L_0x01a8
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r6 = r6.getUlikeBeautyExtra()
                    goto L_0x01a9
                L_0x01a8:
                    r6 = r2
                L_0x01a9:
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$a r11 = r7.this$0
                    android.support.v4.app.FragmentActivity r15 = r11.f43801b
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r11[r10] = r6
                    r11[r9] = r15
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43796a
                    r14 = 0
                    r16 = 39022(0x986e, float:5.4681E-41)
                    java.lang.Class[] r12 = new java.lang.Class[r4]
                    java.lang.Class<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra> r17 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra.class
                    r12[r10] = r17
                    java.lang.Class<android.support.v4.app.FragmentActivity> r17 = android.support.v4.app.FragmentActivity.class
                    r12[r9] = r17
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r18 = r12
                    r12 = r8
                    r19 = r15
                    r15 = r16
                    r16 = r18
                    boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r11 == 0) goto L_0x01f3
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r11[r10] = r6
                    r11[r9] = r19
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43796a
                    r14 = 0
                    r15 = 39022(0x986e, float:5.4681E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r4]
                    java.lang.Class<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra> r12 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra.class
                    r6[r10] = r12
                    java.lang.Class<android.support.v4.app.FragmentActivity> r12 = android.support.v4.app.FragmentActivity.class
                    r6[r9] = r12
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r8
                    r16 = r6
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x0193
                L_0x01f3:
                    if (r6 == 0) goto L_0x01fa
                    java.lang.String r8 = r6.getResourceType()
                    goto L_0x01fb
                L_0x01fa:
                    r8 = r2
                L_0x01fb:
                    if (r8 != 0) goto L_0x01fe
                    goto L_0x0193
                L_0x01fe:
                    int r11 = r8.hashCode()
                    r12 = -1082130432(0xffffffffbf800000, float:-1.0)
                    switch(r11) {
                        case 49: goto L_0x02b8;
                        case 50: goto L_0x0261;
                        case 51: goto L_0x0208;
                        default: goto L_0x0207;
                    }
                L_0x0207:
                    goto L_0x0193
                L_0x0208:
                    java.lang.String r11 = "3"
                    boolean r8 = r8.equals(r11)
                    if (r8 == 0) goto L_0x0193
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getLipstickDefault()
                    if (r11 == 0) goto L_0x021f
                    float r11 = r11.floatValue()
                    goto L_0x0221
                L_0x021f:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x0221:
                    r13 = 3
                    com.ss.android.ugc.aweme.shortvideo.c.b.a(r13, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getLipstickMax()
                    if (r11 == 0) goto L_0x0234
                    float r11 = r11.floatValue()
                    goto L_0x0236
                L_0x0234:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x0236:
                    com.ss.android.ugc.aweme.shortvideo.c.b.b(r13, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getBlushDefault()
                    if (r11 == 0) goto L_0x0248
                    float r11 = r11.floatValue()
                    goto L_0x024a
                L_0x0248:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x024a:
                    r13 = 4
                    com.ss.android.ugc.aweme.shortvideo.c.b.a(r13, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r6 = r6.getBlushMax()
                    if (r6 == 0) goto L_0x025c
                    float r12 = r6.floatValue()
                L_0x025c:
                    com.ss.android.ugc.aweme.shortvideo.c.b.b(r13, r8, r12)
                    goto L_0x0193
                L_0x0261:
                    java.lang.String r11 = "2"
                    boolean r8 = r8.equals(r11)
                    if (r8 == 0) goto L_0x0193
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getEyeDefault()
                    if (r11 == 0) goto L_0x0278
                    float r11 = r11.floatValue()
                    goto L_0x027a
                L_0x0278:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x027a:
                    com.ss.android.ugc.aweme.shortvideo.c.b.a(r4, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getEyeMax()
                    if (r11 == 0) goto L_0x028c
                    float r11 = r11.floatValue()
                    goto L_0x028e
                L_0x028c:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x028e:
                    com.ss.android.ugc.aweme.shortvideo.c.b.b(r4, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getFaceDefault()
                    if (r11 == 0) goto L_0x02a0
                    float r11 = r11.floatValue()
                    goto L_0x02a2
                L_0x02a0:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x02a2:
                    com.ss.android.ugc.aweme.shortvideo.c.b.a(r9, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r6 = r6.getFaceMax()
                    if (r6 == 0) goto L_0x02b3
                    float r12 = r6.floatValue()
                L_0x02b3:
                    com.ss.android.ugc.aweme.shortvideo.c.b.b(r9, r8, r12)
                    goto L_0x0193
                L_0x02b8:
                    java.lang.String r11 = "1"
                    boolean r8 = r8.equals(r11)
                    if (r8 == 0) goto L_0x0193
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getSkinDefault()
                    if (r11 == 0) goto L_0x02cf
                    float r11 = r11.floatValue()
                    goto L_0x02d1
                L_0x02cf:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x02d1:
                    com.ss.android.ugc.aweme.shortvideo.c.b.a(r10, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getSkinMax()
                    if (r11 == 0) goto L_0x02e3
                    float r11 = r11.floatValue()
                    goto L_0x02e5
                L_0x02e3:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x02e5:
                    com.ss.android.ugc.aweme.shortvideo.c.b.b(r10, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r11 = r6.getSharpDefault()
                    if (r11 == 0) goto L_0x02f7
                    float r11 = r11.floatValue()
                    goto L_0x02f9
                L_0x02f7:
                    r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                L_0x02f9:
                    r13 = 5
                    com.ss.android.ugc.aweme.shortvideo.c.b.a(r13, r8, r11)
                    java.lang.String r8 = r6.getGender()
                    java.lang.Float r6 = r6.getSharpMax()
                    if (r6 == 0) goto L_0x030b
                    float r12 = r6.floatValue()
                L_0x030b:
                    com.ss.android.ugc.aweme.shortvideo.c.b.b(r13, r8, r12)
                    goto L_0x0193
                L_0x0310:
                    com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r4 = r0.category_effects
                    if (r4 == 0) goto L_0x0317
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = r4.effects
                    goto L_0x0318
                L_0x0317:
                    r4 = r2
                L_0x0318:
                    if (r4 == 0) goto L_0x0394
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$a r4 = r7.this$0
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel r4 = r4.f43802c
                    com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r0 = r0.category_effects
                    if (r0 == 0) goto L_0x038a
                    java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r0 = r0.effects
                    if (r0 == 0) goto L_0x038a
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Collection r5 = (java.util.Collection) r5
                    java.util.Iterator r0 = r0.iterator()
                L_0x0333:
                    boolean r6 = r0.hasNext()
                    if (r6 == 0) goto L_0x0387
                    java.lang.Object r6 = r0.next()
                    r8 = r6
                    com.ss.android.ugc.effectmanager.effect.model.Effect r8 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r8
                    java.util.Iterator r11 = r3.iterator()
                L_0x0344:
                    boolean r12 = r11.hasNext()
                    if (r12 == 0) goto L_0x0373
                    java.lang.Object r12 = r11.next()
                    r13 = r12
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r13 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r13
                    if (r13 == 0) goto L_0x0358
                    java.lang.String r13 = r13.getEffectId()
                    goto L_0x0359
                L_0x0358:
                    r13 = r2
                L_0x0359:
                    java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                    java.lang.String r14 = "effect"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r14)
                    java.lang.String r14 = r8.effect_id
                    java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                    boolean r13 = android.text.TextUtils.equals(r13, r14)
                    java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r13)
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto L_0x0344
                    goto L_0x0374
                L_0x0373:
                    r12 = r2
                L_0x0374:
                    if (r12 == 0) goto L_0x0378
                    r8 = 1
                    goto L_0x0379
                L_0x0378:
                    r8 = 0
                L_0x0379:
                    java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r8)
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L_0x0333
                    r5.add(r6)
                    goto L_0x0333
                L_0x0387:
                    r2 = r5
                    java.util.List r2 = (java.util.List) r2
                L_0x038a:
                    r4.a(r2, r9)
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$a r0 = r7.this$0
                    com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerViewModel r0 = r0.f43802c
                    r0.a((boolean) r9)
                L_0x0394:
                    com.ss.android.ugc.aweme.effectplatform.c r0 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43798c
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.c.f43809a
                    r14 = 0
                    r15 = 38943(0x981f, float:5.4571E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r9]
                    java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
                    r2[r10] = r3
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r2 == 0) goto L_0x03ca
                    java.lang.Object[] r11 = new java.lang.Object[r9]
                    r11[r10] = r1
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.effectplatform.c.f43809a
                    r14 = 0
                    r15 = 38943(0x981f, float:5.4571E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r9]
                    java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
                    r2[r10] = r3
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r0
                    r16 = r2
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x03d7
                L_0x03ca:
                    com.bytedance.keva.Keva r0 = r0.f43811b
                    java.lang.String r2 = "ulike_download_config"
                    com.google.gson.Gson r3 = com.ss.android.ugc.aweme.port.in.a.f61120c
                    java.lang.String r3 = r3.toJson((java.lang.Object) r1)
                    r0.storeString(r2, r3)
                L_0x03d7:
                    com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.f43797b = r1
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L_0x03dc:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.a.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(FragmentActivity fragmentActivity, InfoStickerViewModel infoStickerViewModel) {
            this.f43801b = fragmentActivity;
            this.f43802c = infoStickerViewModel;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            final com.ss.android.ugc.aweme.w.b.a aVar = (com.ss.android.ugc.aweme.w.b.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f43800a, false, 39023, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f43800a, false, 39023, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE);
            } else if (aVar == null || a.C0799a.SUCCESS != aVar.f76550c) {
            } else {
                bk unused = g.a(bd.f83876a, null, null, new AnonymousClass1(this, null), 3);
            }
        }
    }

    private UlikeBeautyPlatform() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0132 A[EDGE_INSN: B:91:0x0132->B:55:0x0132 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x016a A[EDGE_INSN: B:95:0x016a->B:73:0x016a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData> a(java.util.ArrayList<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData> r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f43796a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r7[r9] = r3
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            r5 = 0
            r6 = 39019(0x986b, float:5.4677E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f43796a
            r13 = 0
            r14 = 39019(0x986b, float:5.4677E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            r15[r9] = r0
            java.lang.Class<java.util.ArrayList> r16 = java.util.ArrayList.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            return r0
        L_0x0037:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.ss.android.ugc.aweme.property.a r3 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r4 = com.ss.android.ugc.aweme.property.a.C0682a.UlikeBeautyAbGroup
            int r3 = r3.b(r4)
            r0 = r18
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            java.util.Iterator r0 = r0.iterator()
        L_0x0053:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0081
            java.lang.Object r5 = r0.next()
            r7 = r5
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r7 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r7
            if (r7 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r7 = r7.getUlikeBeautyExtra()
            if (r7 == 0) goto L_0x006d
            java.lang.String r6 = r7.getResourceType()
        L_0x006d:
            java.lang.Object r7 = r4.get(r6)
            if (r7 != 0) goto L_0x007b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r4.put(r6, r7)
        L_0x007b:
            java.util.List r7 = (java.util.List) r7
            r7.add(r5)
            goto L_0x0053
        L_0x0081:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0089:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            boolean r5 = com.ss.android.g.a.b()
            if (r5 == 0) goto L_0x00aa
            java.lang.String r5 = "1"
            java.lang.Object r7 = r4.getKey()
            java.lang.String r7 = (java.lang.String) r7
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r7)
            r5 = r5 ^ r1
            if (r5 != 0) goto L_0x0089
        L_0x00aa:
            java.lang.Object r4 = r4.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r4 = r4.iterator()
        L_0x00bb:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00ea
            java.lang.Object r7 = r4.next()
            r8 = r7
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r8 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r8
            if (r8 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r8 = r8.getUlikeBeautyExtra()
            if (r8 == 0) goto L_0x00d5
            java.lang.String r8 = r8.getGender()
            goto L_0x00d6
        L_0x00d5:
            r8 = r6
        L_0x00d6:
            java.lang.Object r10 = r5.get(r8)
            if (r10 != 0) goto L_0x00e4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r5.put(r8, r10)
        L_0x00e4:
            java.util.List r10 = (java.util.List) r10
            r10.add(r7)
            goto L_0x00bb
        L_0x00ea:
            java.util.Set r4 = r5.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00f2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r7 = r5.getValue()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0108:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0131
            java.lang.Object r8 = r7.next()
            r10 = r8
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r10 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r10
            if (r10 == 0) goto L_0x0128
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r10 = r10.getUlikeBeautyExtra()
            if (r10 == 0) goto L_0x0128
            java.lang.Integer r10 = r10.getAbGroup()
            if (r10 == 0) goto L_0x0128
            int r10 = r10.intValue()
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            if (r10 != r3) goto L_0x012d
            r10 = 1
            goto L_0x012e
        L_0x012d:
            r10 = 0
        L_0x012e:
            if (r10 == 0) goto L_0x0108
            goto L_0x0132
        L_0x0131:
            r8 = r6
        L_0x0132:
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r8 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r8
            if (r8 != 0) goto L_0x016d
            java.lang.Object r5 = r5.getValue()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0140:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0169
            java.lang.Object r7 = r5.next()
            r8 = r7
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r8 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r8
            if (r8 == 0) goto L_0x0160
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r8 = r8.getUlikeBeautyExtra()
            if (r8 == 0) goto L_0x0160
            java.lang.Integer r8 = r8.getAbGroup()
            if (r8 == 0) goto L_0x0160
            int r8 = r8.intValue()
            goto L_0x0161
        L_0x0160:
            r8 = 0
        L_0x0161:
            if (r8 != 0) goto L_0x0165
            r8 = 1
            goto L_0x0166
        L_0x0165:
            r8 = 0
        L_0x0166:
            if (r8 == 0) goto L_0x0140
            goto L_0x016a
        L_0x0169:
            r7 = r6
        L_0x016a:
            r8 = r7
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r8 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r8
        L_0x016d:
            if (r8 == 0) goto L_0x00f2
            r2.add(r8)
            goto L_0x00f2
        L_0x0174:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.a(java.util.ArrayList):java.util.ArrayList");
    }

    @JvmStatic
    public static final boolean a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f43796a, true, 39016, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f43796a, true, 39016, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str3, "gender");
        Intrinsics.checkParameterIsNotNull(str4, "resType");
        if (!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UlikeBeautyDownloadEnable)) {
            return false;
        }
        String b2 = b(str, str2);
        return bm.a(b2 + File.separator + "config.json");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5 A[EDGE_INSN: B:56:0x00c5->B:37:0x00c5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5 A[EDGE_INSN: B:60:0x00f5->B:51:0x00f5 ?: BREAK  , SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f43796a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 39017(0x9869, float:5.4674E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f43796a
            r15 = 1
            r16 = 39017(0x9869, float:5.4674E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0048:
            java.lang.String r2 = "gender"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "resType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            java.util.ArrayList<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData> r2 = f43797b
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.effectplatform.c r2 = f43798c
            java.util.ArrayList r2 = r2.a()
            if (r2 == 0) goto L_0x0066
            f43797b = r2
        L_0x0066:
            java.util.ArrayList<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData> r2 = f43797b
            r3 = 0
            if (r2 != 0) goto L_0x006c
            return r3
        L_0x006c:
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform r2 = f43799d
            java.util.ArrayList<com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData> r4 = f43797b
            if (r4 != 0) goto L_0x0075
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0075:
            java.util.ArrayList r2 = r2.a(r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r4 = r2.iterator()
        L_0x007f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00c4
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r6 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r6
            if (r6 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r7 = r6.getUlikeBeautyExtra()
            if (r7 == 0) goto L_0x0099
            java.lang.String r7 = r7.getResourceType()
            goto L_0x009a
        L_0x0099:
            r7 = r3
        L_0x009a:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8 = r1
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x00c0
            if (r6 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r6 = r6.getUlikeBeautyExtra()
            if (r6 == 0) goto L_0x00b2
            java.lang.String r6 = r6.getGender()
            goto L_0x00b3
        L_0x00b2:
            r6 = r3
        L_0x00b3:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = r0
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 == 0) goto L_0x00c0
            r6 = 1
            goto L_0x00c1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            if (r6 == 0) goto L_0x007f
            goto L_0x00c5
        L_0x00c4:
            r5 = r3
        L_0x00c5:
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r5 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r5
            if (r5 != 0) goto L_0x00f8
            java.util.Iterator r0 = r2.iterator()
        L_0x00cd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00f4
            java.lang.Object r2 = r0.next()
            r4 = r2
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r4 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r4
            if (r4 == 0) goto L_0x00e7
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyExtra r4 = r4.getUlikeBeautyExtra()
            if (r4 == 0) goto L_0x00e7
            java.lang.String r4 = r4.getResourceType()
            goto L_0x00e8
        L_0x00e7:
            r4 = r3
        L_0x00e8:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x00cd
            goto L_0x00f5
        L_0x00f4:
            r2 = r3
        L_0x00f5:
            r5 = r2
            com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform$UlikeBeautyData r5 = (com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.UlikeBeautyData) r5
        L_0x00f8:
            if (r5 == 0) goto L_0x00ff
            java.lang.String r0 = r5.getUnzipPath()
            return r0
        L_0x00ff:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.b(java.lang.String, java.lang.String):java.lang.String");
    }
}
