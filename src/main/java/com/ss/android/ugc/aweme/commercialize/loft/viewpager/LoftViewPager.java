package com.ss.android.ugc.aweme.commercialize.loft.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.base.transforms.CubeOutTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/viewpager/LoftViewPager;", "Lcom/bytedance/ies/uikit/viewpager/SSViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mForbidScroll", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "event", "setForbidScroll", "", "forbidScroll", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LoftViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39283a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f39284b;

    public final void setForbidScroll(boolean z) {
        this.f39284b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoftViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOverScrollMode(2);
        setPageTransformer(true, new CubeOutTransformer());
    }

    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39283a, false, 31442, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39283a, false, 31442, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f39284b) {
            return false;
        } else {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39283a, false, 31441, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39283a, false, 31441, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f39284b) {
            return false;
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoftViewPager(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        setOverScrollMode(2);
        setPageTransformer(true, new CubeOutTransformer());
    }
}
