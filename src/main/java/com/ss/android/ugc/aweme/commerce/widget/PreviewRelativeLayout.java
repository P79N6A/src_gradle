package com.ss.android.ugc.aweme.commerce.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashSet;
import java.util.Set;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001aH\u0002J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\fJ\u000e\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewRelativeLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDeltaY", "", "mDownX", "mDownY", "mInvalidClickViewSet", "", "Landroid/view/View;", "getMInvalidClickViewSet", "()Ljava/util/Set;", "mInvalidClickViewSet$delegate", "Lkotlin/Lazy;", "mListener", "Lcom/ss/android/ugc/aweme/commerce/widget/PreviewRelativeLayout$IPreviewClickListener;", "mMinSlopDistance", "addInvalidClickView", "", "view", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "init", "isValidArea", "downX", "downY", "removeInvalidClickView", "setMinSlopDistance", "minSlopDistance", "setOnPreviewClickListener", "listener", "IPreviewClickListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PreviewRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38370a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f38371b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PreviewRelativeLayout.class), "mInvalidClickViewSet", "getMInvalidClickViewSet()Ljava/util/Set;"))};

    /* renamed from: c  reason: collision with root package name */
    private float f38372c;

    /* renamed from: d  reason: collision with root package name */
    private float f38373d;

    /* renamed from: e  reason: collision with root package name */
    private float f38374e;

    /* renamed from: f  reason: collision with root package name */
    private float f38375f = 1.0f;
    private final Lazy g = LazyKt.lazy(b.INSTANCE);
    private a h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/PreviewRelativeLayout$IPreviewClickListener;", "", "onClick", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Set<View>> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final Set<View> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30206, new Class[0], Set.class)) {
                return new LinkedHashSet<>();
            }
            return (Set) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30206, new Class[0], Set.class);
        }
    }

    private final Set<View> getMInvalidClickViewSet() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f38370a, false, 30197, new Class[0], Set.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f38370a, false, 30197, new Class[0], Set.class);
        } else {
            value = this.g.getValue();
        }
        return (Set) value;
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38370a, false, 30198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38370a, false, 30198, new Class[0], Void.TYPE);
            return;
        }
        setClickable(true);
    }

    public final void setMinSlopDistance(float f2) {
        this.f38375f = f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewRelativeLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        a();
    }

    public final void setOnPreviewClickListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f38370a, false, 30203, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f38370a, false, 30203, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.h = aVar2;
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f38370a, false, 30199, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f38370a, false, 30199, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f38374e = motionEvent.getRawX();
            this.f38373d = motionEvent.getRawY();
        } else if (num != null && num.intValue() == 2) {
            this.f38372c = this.f38373d - motionEvent.getRawY();
        } else if (num != null && num.intValue() == 1) {
            float f2 = this.f38375f;
            float f3 = this.f38372c;
            if (f3 >= 0.0f && f3 <= f2) {
                a aVar = this.h;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attributeSet");
        a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewRelativeLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attributeSet");
        a();
    }
}
