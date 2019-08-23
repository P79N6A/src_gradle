package com.ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior;", "V", "Landroid/view/View;", "Landroid/support/design/widget/BottomSheetBehavior;", "()V", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mOnTouchEventCallBack", "Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior$OnTouchEventCallBack;", "onTouchEvent", "", "parent", "Landroid/support/design/widget/CoordinatorLayout;", "child", "event", "Landroid/view/MotionEvent;", "(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "setOnTouchEventCallBack", "", "onTouchEventCallBack", "OnTouchEventCallBack", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CustomBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53971a;

    /* renamed from: b  reason: collision with root package name */
    private a f53972b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/view/CustomBottomSheetBehavior$OnTouchEventCallBack;", "", "onTouchEvent", "", "parent", "Landroid/support/design/widget/CoordinatorLayout;", "child", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent);
    }

    public CustomBottomSheetBehavior() {
    }

    public final void a(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f53971a, false, 56783, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f53971a, false, 56783, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "onTouchEventCallBack");
        this.f53972b = aVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBottomSheetBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    public final boolean onTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v, @NotNull MotionEvent motionEvent) {
        CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
        V v2 = v;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{coordinatorLayout2, v2, motionEvent2}, this, f53971a, false, 56782, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{coordinatorLayout2, v2, motionEvent2}, this, f53971a, false, 56782, new Class[]{CoordinatorLayout.class, View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(coordinatorLayout2, "parent");
        Intrinsics.checkParameterIsNotNull(v2, "child");
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        a aVar = this.f53972b;
        if (aVar != null) {
            aVar.a(coordinatorLayout2, v2, motionEvent2);
        }
        return super.onTouchEvent(coordinatorLayout, v, motionEvent);
    }
}
