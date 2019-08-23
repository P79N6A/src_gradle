package com.ss.android.ugc.aweme.detail.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 32\u00020\u0001:\u0006123456B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020(0,j\u0002`-H\u0002J\u001a\u0010.\u001a\u00020(2\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020(0,j\u0002`-H\u0016J\u001a\u0010/\u001a\u00020(2\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020(0,j\u0002`-H\u0016J\u001a\u00100\u001a\u00020(2\u0010\u0010+\u001a\f\u0012\u0004\u0012\u00020(0,j\u0002`-H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl;", "Lcom/ss/android/ugc/aweme/detail/IDetailRecordButtonReversibleAnimator;", "context", "Landroid/content/Context;", "viewGroup", "Landroid/view/ViewGroup;", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "getSize", "Lkotlin/reflect/KFunction1;", "", "Lkotlin/ParameterName;", "name", "p0", "imgSizeAnimationState", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;", "getImgSizeAnimationState", "()Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;", "imgSizeAnimationState$delegate", "Lkotlin/Lazy;", "recordTitleView", "Landroid/widget/TextView;", "recordVideoImageView", "Landroid/widget/ImageView;", "tracker", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationTracker;", "valueAnimator", "Landroid/animation/ValueAnimator;", "vgMarginAnimationState", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;", "getVgMarginAnimationState", "()Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;", "vgMarginAnimationState$delegate", "vgSizeAnimationState", "getVgSizeAnimationState", "vgSizeAnimationState$delegate", "getViewGroup", "()Landroid/view/ViewGroup;", "animate", "", "endCursor", "", "callback", "Lkotlin/Function0;", "Lcom/ss/android/ugc/aweme/detail/AnimationCallback;", "reverse", "start", "stop", "AnimationState", "AnimationTracker", "Companion", "IntAnimationState", "Size", "SizeAnimationState", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements com.ss.android.ugc.aweme.detail.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41120a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f41121b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(f.class), "vgSizeAnimationState", "getVgSizeAnimationState()Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(f.class), "vgMarginAnimationState", "getVgMarginAnimationState()Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(f.class), "imgSizeAnimationState", "getImgSizeAnimationState()Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;"))};
    @NotNull
    public static final Function1<View, Function2<g, g, Unit>> i = e.INSTANCE;
    @NotNull
    public static final Function1<View, Function2<Integer, Integer, Unit>> j = d.INSTANCE;
    @Deprecated
    public static final c k = new c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f41122c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f41123d;

    /* renamed from: e  reason: collision with root package name */
    public final b f41124e = new b(0.0f, 1);

    /* renamed from: f  reason: collision with root package name */
    public final kotlin.reflect.d<Integer> f41125f = new k(this.g.getResources());
    @NotNull
    public final Context g;
    @NotNull
    public final ViewGroup h;
    private ValueAnimator l;
    private final Lazy m = LazyKt.lazy(new n(this));
    private final Lazy n = LazyKt.lazy(new m(this));
    private final Lazy o = LazyKt.lazy(new l(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BE\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012$\b\u0002\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\b\u0012\b\b\u0002\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR(\u0010\t\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00008F@FX\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR6\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00028\u0000`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationState;", "T", "", "begin", "end", "onCurrentChanged", "Lkotlin/Function2;", "", "Lcom/ss/android/ugc/aweme/detail/animator/ValueChangeCallback;", "current", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "getBegin", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", "getCurrent", "setCurrent", "(Ljava/lang/Object;)V", "getEnd", "getOnCurrentChanged", "()Lkotlin/jvm/functions/Function2;", "setOnCurrentChanged", "(Lkotlin/jvm/functions/Function2;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41126a;

        /* renamed from: b  reason: collision with root package name */
        public T f41127b;

        /* renamed from: c  reason: collision with root package name */
        public final T f41128c;

        /* renamed from: d  reason: collision with root package name */
        public final T f41129d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public Function2<? super T, ? super T, Unit> f41130e;

        public final void a(T t) {
            if (PatchProxy.isSupport(new Object[]{t}, this, f41126a, false, 34695, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{t}, this, f41126a, false, 34695, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            this.f41130e.invoke(this.f41127b, t);
            this.f41127b = t;
        }

        public a(T t, T t2, @NotNull Function2<? super T, ? super T, Unit> function2, T t3) {
            Intrinsics.checkParameterIsNotNull(function2, "onCurrentChanged");
            this.f41128c = t;
            this.f41129d = t2;
            this.f41130e = function2;
            this.f41127b = t3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R3\u0010\u0005\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\u0003`\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationTracker;", "", "cursor", "", "(F)V", "callbackList", "", "Lkotlin/Function2;", "", "Lcom/ss/android/ugc/aweme/detail/animator/ValueChangeCallback;", "getCallbackList", "()Ljava/util/List;", "value", "getCursor", "()F", "setCursor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41131a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final List<Function2<Float, Float, Unit>> f41132b;

        /* renamed from: c  reason: collision with root package name */
        public float f41133c;

        public b() {
            this(0.0f, 1);
        }

        private b(float f2) {
            this.f41132b = new ArrayList();
            this.f41133c = f2;
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f41131a, false, 34697, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f41131a, false, 34697, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            for (Function2 invoke : this.f41132b) {
                invoke.invoke(Float.valueOf(this.f41133c), Float.valueOf(f2));
            }
            this.f41133c = f2;
        }

        public /* synthetic */ b(float f2, int i) {
            this(0.0f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R9\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\b\u0012\u0004\u0012\u00020\u0007`\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR9\u0010\f\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006j\b\u0012\u0004\u0012\u00020\r`\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Companion;", "", "()V", "createMarginBottomChangedCallback", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/Function2;", "", "", "Lcom/ss/android/ugc/aweme/detail/animator/ValueChangeCallback;", "getCreateMarginBottomChangedCallback", "()Lkotlin/jvm/functions/Function1;", "createSizeChangedCallback", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Size;", "getCreateSizeChangedCallback", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class c {
        private c() {
        }

        @NotNull
        public static Function1<View, Function2<g, g, Unit>> a() {
            return f.i;
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Function2;", "", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<View, Function2<? super Integer, ? super Integer, ? extends Unit>> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        @NotNull
        public final Function2<Integer, Integer, Unit> invoke(@NotNull View view) {
            final View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 34698, new Class[]{View.class}, Function2.class)) {
                return (Function2) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 34698, new Class[]{View.class}, Function2.class);
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            return new Function2<Integer, Integer, Unit>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 34699, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 34699, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    View view = view2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.bottomMargin = i2;
                        view.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Function2;", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Size;", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<View, Function2<? super g, ? super g, ? extends Unit>> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        @NotNull
        public final Function2<g, g, Unit> invoke(@NotNull View view) {
            final View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 34700, new Class[]{View.class}, Function2.class)) {
                return (Function2) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 34700, new Class[]{View.class}, Function2.class);
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            return new Function2<g, g, Unit>() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((g) obj, (g) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull g gVar, @NotNull g gVar2) {
                    g gVar3 = gVar;
                    g gVar4 = gVar2;
                    if (PatchProxy.isSupport(new Object[]{gVar3, gVar4}, this, changeQuickRedirect, false, 34701, new Class[]{g.class, g.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{gVar3, gVar4}, this, changeQuickRedirect, false, 34701, new Class[]{g.class, g.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(gVar3, "before");
                    Intrinsics.checkParameterIsNotNull(gVar4, "after");
                    View view = view2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = gVar4.f41135b;
                    layoutParams.height = gVar4.f41136c;
                    view.setLayoutParams(layoutParams);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationState;", "", "begin", "end", "onCurrentChanged", "Lkotlin/Function2;", "", "Lcom/ss/android/ugc/aweme/detail/animator/ValueChangeCallback;", "tracker", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationTracker;", "(IILkotlin/jvm/functions/Function2;Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationTracker;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.detail.a.f$f  reason: collision with other inner class name */
    static final class C0529f extends a<Integer> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0529f(int i, int i2, @NotNull Function2<? super Integer, ? super Integer, Unit> function2, @NotNull b bVar) {
            super(Integer.valueOf(i), Integer.valueOf(i2), function2, Integer.valueOf(i));
            Intrinsics.checkParameterIsNotNull(function2, "onCurrentChanged");
            Intrinsics.checkParameterIsNotNull(bVar, "tracker");
            bVar.f41132b.add(new Function2<Float, Float, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ C0529f this$0;

                {
                    this.this$0 = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2, float f3) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 34702, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 34702, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    this.this$0.a(Integer.valueOf(((int) (((float) (((Number) this.this$0.f41129d).intValue() - ((Number) this.this$0.f41128c).intValue())) * f3)) + ((Number) this.this$0.f41128c).intValue()));
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0011\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0002J\u0011\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0002J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\rH\u0002J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Size;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "div", "", "equals", "", "other", "hashCode", "minus", "decrement", "plus", "increment", "times", "mul", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41134a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41135b;

        /* renamed from: c  reason: collision with root package name */
        public final int f41136c;

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    if (this.f41135b == gVar.f41135b) {
                        if (this.f41136c == gVar.f41136c) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f41135b * 31) + this.f41136c;
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f41134a, false, 34708, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f41134a, false, 34708, new Class[0], String.class);
            }
            return "Size(width=" + this.f41135b + ", height=" + this.f41136c + ")";
        }

        public g(int i, int i2) {
            this.f41135b = i;
            this.f41136c = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationState;", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Size;", "begin", "end", "onCurrentChanged", "Lkotlin/Function2;", "", "Lcom/ss/android/ugc/aweme/detail/animator/ValueChangeCallback;", "tracker", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationTracker;", "(Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Size;Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$Size;Lkotlin/jvm/functions/Function2;Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$AnimationTracker;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class h extends a<g> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(@NotNull g gVar, @NotNull g gVar2, @NotNull Function2<? super g, ? super g, Unit> function2, @NotNull b bVar) {
            super(gVar, gVar2, function2, gVar);
            Intrinsics.checkParameterIsNotNull(gVar, "begin");
            Intrinsics.checkParameterIsNotNull(gVar2, "end");
            Intrinsics.checkParameterIsNotNull(function2, "onCurrentChanged");
            Intrinsics.checkParameterIsNotNull(bVar, "tracker");
            bVar.f41132b.add(new Function2<Float, Float, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ h this$0;

                {
                    this.this$0 = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2, float f3) {
                    g gVar;
                    g gVar2;
                    g gVar3;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 34709, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, changeQuickRedirect, false, 34709, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    h hVar = this.this$0;
                    g gVar4 = (g) this.this$0.f41129d;
                    g gVar5 = (g) this.this$0.f41128c;
                    if (PatchProxy.isSupport(new Object[]{gVar5}, gVar4, g.f41134a, false, 34704, new Class[]{g.class}, g.class)) {
                        g gVar6 = gVar4;
                        gVar = (g) PatchProxy.accessDispatch(new Object[]{gVar5}, gVar6, g.f41134a, false, 34704, new Class[]{g.class}, g.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(gVar5, "decrement");
                        gVar = new g(gVar4.f41135b - gVar5.f41135b, gVar4.f41136c - gVar5.f41136c);
                    }
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f3)}, gVar, g.f41134a, false, 34705, new Class[]{Float.TYPE}, g.class)) {
                        g gVar7 = gVar;
                        gVar2 = (g) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f3)}, gVar7, g.f41134a, false, 34705, new Class[]{Float.TYPE}, g.class);
                    } else {
                        gVar2 = new g((int) (((float) gVar.f41135b) * f3), (int) (((float) gVar.f41136c) * f3));
                    }
                    g gVar8 = (g) this.this$0.f41128c;
                    if (PatchProxy.isSupport(new Object[]{gVar8}, gVar2, g.f41134a, false, 34703, new Class[]{g.class}, g.class)) {
                        g gVar9 = gVar2;
                        gVar3 = (g) PatchProxy.accessDispatch(new Object[]{gVar8}, gVar9, g.f41134a, false, 34703, new Class[]{g.class}, g.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(gVar8, "increment");
                        gVar3 = new g(gVar2.f41135b + gVar8.f41135b, gVar2.f41136c + gVar8.f41136c);
                    }
                    hVar.a(gVar3);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$animate$2$1"}, k = 3, mv = {1, 1, 15})
    static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f41138b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f41139c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f41140d;

        i(f fVar, Function0 function0, float f2) {
            this.f41138b = fVar;
            this.f41139c = function0;
            this.f41140d = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f41137a, false, 34710, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f41137a, false, 34710, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            b bVar = this.f41138b.f41124e;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                bVar.a(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$animate$2$2", "Landroid/animation/Animator$AnimatorListener;", "truncateAt", "Landroid/text/TextUtils$TruncateAt;", "getTruncateAt", "()Landroid/text/TextUtils$TruncateAt;", "setTruncateAt", "(Landroid/text/TextUtils$TruncateAt;)V", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41141a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public TextUtils.TruncateAt f41142b = TextUtils.TruncateAt.END;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f41143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f41144d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function0 f41145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f41146f;

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationCancel(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f41141a, false, 34713, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f41141a, false, 34713, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f41144d.f41123d.setEllipsize(this.f41142b);
            this.f41143c.removeAllUpdateListeners();
            this.f41143c.removeListener(this);
            this.f41145e.invoke();
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f41141a, false, 34714, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f41141a, false, 34714, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f41144d.f41123d.setEllipsize(this.f41142b);
            this.f41143c.removeAllUpdateListeners();
            this.f41143c.removeListener(this);
            this.f41144d.f41124e.a(this.f41146f);
            this.f41145e.invoke();
        }

        public final void onAnimationStart(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f41141a, false, 34712, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f41141a, false, 34712, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            TextUtils.TruncateAt ellipsize = this.f41144d.f41123d.getEllipsize();
            Intrinsics.checkExpressionValueIsNotNull(ellipsize, "recordTitleView.ellipsize");
            this.f41142b = ellipsize;
            this.f41144d.f41123d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }

        j(ValueAnimator valueAnimator, f fVar, Function0 function0, float f2) {
            this.f41143c = valueAnimator;
            this.f41144d = fVar;
            this.f41145e = function0;
            this.f41146f = f2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "p1", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class k extends FunctionReference implements Function1<Integer, Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k(Resources resources) {
            super(1, resources);
        }

        public final String getName() {
            return "getDimensionPixelSize";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34716, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(Resources.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34716, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "getDimensionPixelSize(I)I";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(invoke(((Number) obj).intValue()));
        }

        public final int invoke(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 34715, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return ((Resources) this.receiver).getDimensionPixelSize(i);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 34715, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<h> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @NotNull
        public final h invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34717, new Class[0], h.class)) {
                return new h(new g(this.this$0.f41122c.getMeasuredWidth(), this.this$0.f41122c.getMeasuredHeight()), new g(((Number) ((Function1) this.this$0.f41125f).invoke(Integer.valueOf(C0906R.dimen.jz))).intValue(), ((Number) ((Function1) this.this$0.f41125f).invoke(Integer.valueOf(C0906R.dimen.jz))).intValue()), (Function2) c.a().invoke(this.this$0.f41122c), this.this$0.f41124e);
            }
            return (h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34717, new Class[0], h.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$IntAnimationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<C0529f> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @NotNull
        public final C0529f invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34718, new Class[0], C0529f.class)) {
                return (C0529f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34718, new Class[0], C0529f.class);
            }
            ViewGroup.LayoutParams layoutParams = this.this$0.h.getLayoutParams();
            if (layoutParams != null) {
                return new C0529f(((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((Number) ((Function1) this.this$0.f41125f).invoke(Integer.valueOf(C0906R.dimen.k2))).intValue(), (Function2) f.j.invoke(this.this$0.h), this.this$0.f41124e);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/detail/animator/DetailRecordButtonScaleInAnimatorImpl$SizeAnimationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<h> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        @NotNull
        public final h invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34719, new Class[0], h.class)) {
                return new h(new g(this.this$0.h.getMeasuredWidth(), this.this$0.h.getMeasuredHeight()), new g(((Number) ((Function1) this.this$0.f41125f).invoke(Integer.valueOf(C0906R.dimen.k3))).intValue(), ((Number) ((Function1) this.this$0.f41125f).invoke(Integer.valueOf(C0906R.dimen.k1))).intValue()), (Function2) c.a().invoke(this.this$0.h), this.this$0.f41124e);
            }
            return (h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34719, new Class[0], h.class);
        }
    }

    public final void a(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f41120a, false, 34692, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f41120a, false, 34692, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        a(1.0f, function02);
    }

    public final void b(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f41120a, false, 34693, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f41120a, false, 34693, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.pause();
        }
        function0.invoke();
    }

    public final void c(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f41120a, false, 34694, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function02}, this, f41120a, false, 34694, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function02, "callback");
        a(0.0f, function02);
    }

    public f(@NotNull Context context, @NotNull ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "viewGroup");
        this.g = context;
        this.h = viewGroup;
        View findViewById = this.h.findViewById(C0906R.id.cuu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.viewGroup.findViewB…d.start_record_video_img)");
        this.f41122c = (ImageView) findViewById;
        View findViewById2 = this.h.findViewById(C0906R.id.cut);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "this.viewGroup.findViewB…(R.id.start_record_title)");
        this.f41123d = (TextView) findViewById2;
    }

    private final void a(float f2, Function0<Unit> function0) {
        Object value;
        Object value2;
        Object value3;
        float f3 = f2;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), function02}, this, f41120a, false, 34691, new Class[]{Float.TYPE, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), function02}, this, f41120a, false, 34691, new Class[]{Float.TYPE, Function0.class}, Void.TYPE);
            return;
        }
        float f4 = this.f41124e.f41133c;
        if (f4 != f3) {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                if (PatchProxy.isSupport(new Object[0], this, f41120a, false, 34688, new Class[0], h.class)) {
                    value = PatchProxy.accessDispatch(new Object[0], this, f41120a, false, 34688, new Class[0], h.class);
                } else {
                    value = this.m.getValue();
                }
                h hVar = (h) value;
                if (PatchProxy.isSupport(new Object[0], this, f41120a, false, 34690, new Class[0], h.class)) {
                    value2 = PatchProxy.accessDispatch(new Object[0], this, f41120a, false, 34690, new Class[0], h.class);
                } else {
                    value2 = this.o.getValue();
                }
                h hVar2 = (h) value2;
                if (PatchProxy.isSupport(new Object[0], this, f41120a, false, 34689, new Class[0], C0529f.class)) {
                    value3 = PatchProxy.accessDispatch(new Object[0], this, f41120a, false, 34689, new Class[0], C0529f.class);
                } else {
                    value3 = this.n.getValue();
                }
                C0529f fVar = (C0529f) value3;
                this.l = ValueAnimator.ofFloat(new float[]{f4, f3});
                ValueAnimator valueAnimator2 = this.l;
                if (valueAnimator2 != null) {
                    valueAnimator2.setRepeatCount(0);
                    valueAnimator2.setDuration(300);
                    valueAnimator2.setStartDelay(300);
                    valueAnimator2.setInterpolator(new AccelerateDecelerateInterpolator());
                    valueAnimator2.addUpdateListener(new i(this, function02, f2));
                    valueAnimator2.addListener(new j(valueAnimator2, this, function02, f2));
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }
}
