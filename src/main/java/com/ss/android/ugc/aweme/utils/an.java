package com.ss.android.ugc.aweme.utils;

import android.support.annotation.IdRes;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000J\f\u0010\n\u001a\b\u0018\u00010\bR\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0018\u00010\bR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/ConstraintLayoutUtil;", "", "constraintLayout", "Landroid/support/constraint/ConstraintLayout;", "(Landroid/support/constraint/ConstraintLayout;)V", "applyConstraintSet", "Landroid/support/constraint/ConstraintSet;", "begin", "Lcom/ss/android/ugc/aweme/utils/ConstraintLayoutUtil$ConstraintBegin;", "resetConstraintSet", "beginWithAnim", "reSet", "", "reSetWidthAnim", "ConstraintBegin", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75512a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintSet f75513b = new ConstraintSet();

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f75514c;

    /* renamed from: d  reason: collision with root package name */
    private a f75515d;

    /* renamed from: e  reason: collision with root package name */
    private final ConstraintSet f75516e = new ConstraintSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\b\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\t\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\n\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u000b\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\f\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\r\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001e\u0010\u000e\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000f\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u000f\u001a\u00060\u0000R\u00020\u00042\f\b\u0001\u0010\u0012\u001a\u00020\u0013\"\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u001c\u0010\u0016\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006J4\u0010\u0018\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006J\u001c\u0010\u001d\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006J\u001c\u0010\u001e\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006J\u001c\u0010\u001f\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006J\u001c\u0010 \u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J\u001c\u0010!\u001a\u00060\u0000R\u00020\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/ConstraintLayoutUtil$ConstraintBegin;", "", "(Lcom/ss/android/ugc/aweme/utils/ConstraintLayoutUtil;)V", "BottomToBottomOf", "Lcom/ss/android/ugc/aweme/utils/ConstraintLayoutUtil;", "startId", "", "endId", "BottomToTopOf", "LeftToLeftOf", "LeftToRightOf", "RightToLeftOf", "RightToRightOf", "TopToBottomOf", "TopToTopOf", "clear", "viewId", "anchor", "viewIds", "", "commit", "", "setHeight", "height", "setMargin", "left", "top", "right", "bottom", "setMarginBottom", "setMarginLeft", "setMarginRight", "setMarginTop", "setWidth", "width", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75517a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f75517a, false, 88106, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75517a, false, 88106, new Class[0], Void.TYPE);
                return;
            }
            an.this.f75513b.applyTo(an.this.f75514c);
        }

        public a() {
        }

        @NotNull
        public final a a(@IdRes int i, @IdRes int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f75517a, false, 88099, new Class[]{Integer.TYPE, Integer.TYPE}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f75517a, false, 88099, new Class[]{Integer.TYPE, Integer.TYPE}, a.class);
            }
            an.this.f75513b.connect(i, 3, i2, 4);
            return this;
        }
    }

    @Nullable
    public final a a() {
        if (PatchProxy.isSupport(new Object[0], this, f75512a, false, 88085, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f75512a, false, 88085, new Class[0], a.class);
        }
        synchronized (a.class) {
            if (this.f75515d == null) {
                this.f75515d = new a();
            }
        }
        this.f75513b.clone(this.f75514c);
        return this.f75515d;
    }

    public an(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkParameterIsNotNull(constraintLayout, "constraintLayout");
        this.f75514c = constraintLayout;
        this.f75516e.clone(this.f75514c);
    }
}
