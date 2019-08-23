package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/views/WorkaroundRemoteImageView;", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleRes", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maybeOverrideVisibilityHandling", "", "onAttachedToWindow", "onDetachedFromWindow", "onFinishTemporaryDetach", "onStartTemporaryDetach", "onVisibilityAggregated", "isVisible", "", "setVisibility", "visibility", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class WorkaroundRemoteImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76427a;

    @JvmOverloads
    public WorkaroundRemoteImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public WorkaroundRemoteImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f76427a, false, 89679, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76427a, false, 89679, new Class[0], Void.TYPE);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f76427a, false, 89673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76427a, false, 89673, new Class[0], Void.TYPE);
            return;
        }
        b();
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f76427a, false, 89674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76427a, false, 89674, new Class[0], Void.TYPE);
            return;
        }
        b();
        super.onDetachedFromWindow();
    }

    public final void onFinishTemporaryDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f76427a, false, 89676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76427a, false, 89676, new Class[0], Void.TYPE);
            return;
        }
        b();
        super.onFinishTemporaryDetach();
    }

    public final void onStartTemporaryDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f76427a, false, 89675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76427a, false, 89675, new Class[0], Void.TYPE);
            return;
        }
        b();
        super.onStartTemporaryDetach();
    }

    public final void onVisibilityAggregated(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76427a, false, 89678, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76427a, false, 89678, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onVisibilityAggregated(z);
        b();
    }

    public final void setVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76427a, false, 89677, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76427a, false, 89677, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b();
        super.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WorkaroundRemoteImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkaroundRemoteImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
