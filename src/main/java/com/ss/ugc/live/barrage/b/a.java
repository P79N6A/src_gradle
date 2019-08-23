package com.ss.ugc.live.barrage.b;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.ugc.live.barrage.a;
import com.ss.ugc.live.barrage.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 02\u00020\u0001:\u0002/0B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u0004\u0018\u00010\tJ\b\u0010#\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\u0012\u0010%\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\tH&J\b\u0010&\u001a\u00020\u0019H\u0016J\u001a\u0010'\u001a\u00020\u00192\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u000bH&J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\u0019J\u0006\u0010.\u001a\u00020\u0019R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t0\rj\b\u0012\u0004\u0012\u00020\t`\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u00061"}, d2 = {"Lcom/ss/ugc/live/barrage/controller/AbsBarrageController;", "", "barrageView", "Landroid/view/View;", "(Landroid/view/View;)V", "barrageCallback", "Lcom/ss/ugc/live/barrage/controller/AbsBarrageController$BarrageCallback;", "initialBarrageList", "Ljava/util/LinkedList;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "oldAnimatorValue", "", "prepareBarrageList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "runningBarrageList", "Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList;", "touchBarrage", "valueAnimator", "Landroid/animation/ValueAnimator;", "getValueAnimator", "()Landroid/animation/ValueAnimator;", "valueAnimator$delegate", "Lkotlin/Lazy;", "addBarrage", "", "barrage", "addToFront", "", "draw", "canvas", "Landroid/graphics/Canvas;", "getBarrageSize", "", "getNextPreparedBarrage", "initAnimation", "notifyBuildBitmap", "onAddBarrage", "onClean", "onPlayBarrage", "deltaTime", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setBarrageCallback", "start", "stop", "BarrageCallback", "Companion", "barrage_release"}, k = 1, mv = {1, 1, 15})
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f78695c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "valueAnimator", "getValueAnimator()Landroid/animation/ValueAnimator;"))};
    public static final b j = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private com.ss.ugc.live.barrage.a.a f78696a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f78697b = LazyKt.lazy(new d(this));

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList<com.ss.ugc.live.barrage.a.a> f78698d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<com.ss.ugc.live.barrage.a.a> f78699e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.ugc.live.barrage.a f78700f = new com.ss.ugc.live.barrage.a();
    public float g;
    public C0842a h;
    public final View i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/ugc/live/barrage/controller/AbsBarrageController$BarrageCallback;", "", "onBarrageHide", "", "barrage", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "onBarrageShow", "barrage_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.ugc.live.barrage.b.a$a  reason: collision with other inner class name */
    public interface C0842a {
        void a(@NotNull com.ss.ugc.live.barrage.a.a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/ugc/live/barrage/controller/AbsBarrageController$Companion;", "", "()V", "DURATION", "", "PRE_BUILD_COUNT", "barrage_release"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78702a;

        c(a aVar) {
            this.f78702a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f2 = this.f78702a.g;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f78702a.g = floatValue;
                float f3 = (floatValue - f2) * 1000.0f;
                if (floatValue < f2) {
                    f3 = ((1.0f - f2) + floatValue) * 1000.0f;
                }
                this.f78702a.a(this.f78702a.f78700f, f3);
                if (this.f78702a.f78698d.isEmpty() && this.f78702a.f78699e.isEmpty() && this.f78702a.f78700f.isEmpty()) {
                    this.f78702a.d();
                }
                this.f78702a.f();
                this.f78702a.i.postInvalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<ValueAnimator> {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @NotNull
        public final ValueAnimator invoke() {
            a aVar = this.this$0;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(1000);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new c(aVar));
            return ofFloat;
        }
    }

    private final ValueAnimator g() {
        return (ValueAnimator) this.f78697b.getValue();
    }

    public abstract void a(@NotNull @NonNull com.ss.ugc.live.barrage.a.a aVar);

    public abstract void a(@NotNull @NonNull com.ss.ugc.live.barrage.a aVar, float f2);

    public void a() {
        this.f78698d.clear();
        this.f78699e.clear();
        this.f78700f.clear();
    }

    public int b() {
        return this.f78700f.size() + this.f78699e.size() + this.f78698d.size();
    }

    public final void c() {
        if (!g().isRunning()) {
            g().start();
        }
        f();
    }

    public final void d() {
        if (g().isRunning()) {
            g().cancel();
        }
    }

    @Nullable
    public final com.ss.ugc.live.barrage.a.a e() {
        com.ss.ugc.live.barrage.a.a aVar;
        com.ss.ugc.live.barrage.a.a aVar2 = null;
        try {
            if (this.f78699e.isEmpty()) {
                return null;
            }
            Iterator<com.ss.ugc.live.barrage.a.a> it2 = this.f78699e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it2.next();
                if (aVar.j) {
                    break;
                }
            }
            Collection collection = this.f78699e;
            if (collection != null) {
                TypeIntrinsics.asMutableCollection(collection).remove(aVar);
                aVar2 = aVar;
                return aVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        } catch (Exception unused) {
        }
    }

    public final void f() {
        while (this.f78699e.size() <= 30 && this.f78698d.size() != 0) {
            com.ss.ugc.live.barrage.a.a removeFirst = this.f78698d.removeFirst();
            removeFirst.a((a.C0840a) a.C0840a.c.f78686a);
            this.f78699e.add(removeFirst);
        }
    }

    public a(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "barrageView");
        this.i = view;
        this.f78700f.setOnChangeListener(new a.C0839a(this) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f78701a;

            {
                this.f78701a = r1;
            }

            public final void a(boolean z, @NotNull com.ss.ugc.live.barrage.a.a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "barrage");
                if (!z) {
                    C0842a aVar2 = this.f78701a.h;
                    if (aVar2 != null) {
                        aVar2.a(aVar);
                    }
                }
            }
        });
    }

    public final void a(@NotNull C0842a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "barrageCallback");
        this.h = aVar;
    }

    public final boolean a(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it2 = this.f78700f.iterator();
                while (it2.hasNext()) {
                    com.ss.ugc.live.barrage.a.a aVar = (com.ss.ugc.live.barrage.a.a) it2.next();
                    if (aVar.k.contains(motionEvent.getX(), motionEvent.getY()) && aVar.a(motionEvent)) {
                        this.f78696a = aVar;
                        return true;
                    }
                }
                break;
            case 1:
                com.ss.ugc.live.barrage.a.a aVar2 = this.f78696a;
                if (aVar2 != null) {
                    RectF rectF = aVar2.k;
                    if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        com.ss.ugc.live.barrage.a.a aVar3 = this.f78696a;
                        if (aVar3 != null) {
                            return aVar3.a(motionEvent);
                        }
                        return false;
                    }
                }
                break;
            case 2:
            case 3:
                if (this.f78696a != null) {
                    com.ss.ugc.live.barrage.a.a aVar4 = this.f78696a;
                    if (aVar4 != null) {
                        RectF rectF2 = aVar4.k;
                        if (rectF2 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                            com.ss.ugc.live.barrage.a.a aVar5 = this.f78696a;
                            if (aVar5 != null) {
                                return aVar5.a(motionEvent);
                            }
                            return false;
                        }
                    }
                }
                break;
        }
        return false;
    }

    @JvmOverloads
    public final void a(@NotNull com.ss.ugc.live.barrage.a.a aVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "barrage");
        if (z) {
            this.f78698d.add(0, aVar);
        } else {
            this.f78698d.add(aVar);
        }
        aVar.a((a.C0840a) a.C0840a.b.f78685a);
        a(aVar);
    }
}
