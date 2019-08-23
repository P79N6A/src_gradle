package com.ss.android.ugc.aweme.im.sdk.relations;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/FixedSizeLinearLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "mMaxHeight", "getMMaxHeight", "()I", "setMMaxHeight", "(I)V", "mMaxWidth", "getMMaxWidth", "setMMaxWidth", "setMeasuredDimension", "", "widthSize", "heightSize", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FixedSizeLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51972a;

    /* renamed from: b  reason: collision with root package name */
    public int f51973b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f51974c = Integer.MAX_VALUE;

    public final void setMeasuredDimension(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51972a, false, 52646, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f51972a, false, 52646, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i > this.f51973b && i2 > this.f51974c) {
            super.setMeasuredDimension(this.f51973b, this.f51974c);
        } else if (i > this.f51973b && i2 <= this.f51974c) {
            super.setMeasuredDimension(this.f51973b, i2);
        } else if (i > this.f51973b || i2 <= this.f51974c) {
            super.setMeasuredDimension(i, i2);
        } else {
            super.setMeasuredDimension(i, this.f51974c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedSizeLinearLayoutManager(@NotNull Context context, int i, boolean z) {
        super(context, 0, true);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
