package com.ss.ugc.live.barrage.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u000201B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H&J\u0012\u0010'\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010(\u001a\u00020\u001fH\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\b\u0010+\u001a\u00020\u001fH\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "", "()V", "isReadyDraw", "", "()Z", "setReadyDraw", "(Z)V", "onClickListener", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$OnClickListener;", "getOnClickListener", "()Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$OnClickListener;", "setOnClickListener", "(Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$OnClickListener;)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "rect", "Landroid/graphics/RectF;", "getRect", "()Landroid/graphics/RectF;", "state", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "getState", "()Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "setState", "(Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;)V", "buildComplete", "", "draw", "canvas", "Landroid/graphics/Canvas;", "matrix", "Landroid/graphics/Matrix;", "getBitmap", "Landroid/graphics/Bitmap;", "onChangeState", "onClick", "onHide", "onInitialized", "onPrepared", "onShow", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "BarrageState", "OnClickListener", "barrage_release"}, k = 1, mv = {1, 1, 15})
public abstract class a {
    static final /* synthetic */ KProperty[] h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "paint", "getPaint()Landroid/graphics/Paint;"))};
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final Lazy f78683a = LazyKt.lazy(c.INSTANCE);
    @Nullable
    public b i;
    public boolean j;
    @NotNull
    public final RectF k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    @Nullable
    public volatile C0840a l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "", "()V", "Hide", "Initial", "Prepare", "Show", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Initial;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Prepare;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Show;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Hide;", "barrage_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.ugc.live.barrage.a.a$a  reason: collision with other inner class name */
    public static abstract class C0840a {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Hide;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "()V", "barrage_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.ugc.live.barrage.a.a$a$a  reason: collision with other inner class name */
        public static final class C0841a extends C0840a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0841a f78684a = new C0841a();

            private C0841a() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Initial;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "()V", "barrage_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.ugc.live.barrage.a.a$a$b */
        public static final class b extends C0840a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f78685a = new b();

            private b() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Prepare;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "()V", "barrage_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.ugc.live.barrage.a.a$a$c */
        public static final class c extends C0840a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f78686a = new c();

            private c() {
                super((byte) 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState$Show;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$BarrageState;", "()V", "barrage_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.ugc.live.barrage.a.a$a$d */
        public static final class d extends C0840a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f78687a = new d();

            private d() {
                super((byte) 0);
            }
        }

        private C0840a() {
        }

        public /* synthetic */ C0840a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/ugc/live/barrage/barrage/AbsBarrage$OnClickListener;", "", "onClick", "", "barrage", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "barrage_release"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull a aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Paint;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Paint> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        @NotNull
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setDither(true);
            paint.setAntiAlias(true);
            return paint;
        }
    }

    @NotNull
    public final Paint a() {
        return (Paint) this.f78683a.getValue();
    }

    @Nullable
    public abstract Bitmap b();

    public void c() {
    }

    public void d() {
    }

    public final void e() {
        this.j = true;
    }

    public final void a(@Nullable C0840a aVar) {
        this.l = aVar;
        b(aVar);
    }

    public final boolean a(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                return true;
            case 1:
                b bVar = this.i;
                if (bVar != null) {
                    bVar.a(this);
                }
                return true;
            default:
                return false;
        }
    }

    private final void b(C0840a aVar) {
        if (!Intrinsics.areEqual((Object) aVar, (Object) C0840a.b.f78685a)) {
            if (Intrinsics.areEqual((Object) aVar, (Object) C0840a.c.f78686a)) {
                c();
            } else if (!Intrinsics.areEqual((Object) aVar, (Object) C0840a.d.f78687a) && Intrinsics.areEqual((Object) aVar, (Object) C0840a.C0841a.f78684a)) {
                d();
            }
        }
    }

    public void a(@NotNull Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        if (!(!Intrinsics.areEqual((Object) this.l, (Object) C0840a.d.f78687a))) {
            Bitmap b2 = b();
            if (b2 != null && !b2.isRecycled()) {
                canvas.drawBitmap(b(), this.k.left, this.k.top, a());
            }
        }
    }
}
