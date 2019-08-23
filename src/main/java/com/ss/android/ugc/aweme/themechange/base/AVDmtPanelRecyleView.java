package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtPanelRecyleView;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "firstItemMargin", "itemMargin", "lastItemMargin", "init", "", "setSecondPanel", "isSecondPanel", "", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtPanelRecyleView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74562a;

    /* renamed from: b  reason: collision with root package name */
    public int f74563b;

    /* renamed from: c  reason: collision with root package name */
    public int f74564c;

    /* renamed from: d  reason: collision with root package name */
    public int f74565d;

    @JvmOverloads
    public AVDmtPanelRecyleView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtPanelRecyleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setSecondPanel(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74562a, false, 86797, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74562a, false, 86797, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            int a2 = b.f74589e.a(false, z, false, false, false);
            setBackground(bc.a(a2, a2, 0, 0));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtPanelRecyleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74562a, false, 86796, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74562a, false, 86796, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            boolean z = obtainStyledAttributes.getBoolean(5, false);
            this.f74563b = (int) obtainStyledAttributes.getDimension(17, 0.0f);
            this.f74564c = (int) obtainStyledAttributes.getDimension(3, 0.0f);
            this.f74565d = (int) obtainStyledAttributes.getDimension(19, 0.0f);
            boolean z2 = obtainStyledAttributes.getBoolean(18, true);
            int dip2Px = (int) UIUtils.dip2Px(context, 2.0f);
            if (z2) {
                if (this.f74563b > 0) {
                    this.f74563b -= dip2Px * 2;
                }
                if (this.f74564c > 0) {
                    this.f74564c -= dip2Px;
                }
                if (this.f74565d > 0) {
                    this.f74565d -= dip2Px;
                }
            }
            if (z) {
                Drawable a2 = b.f74589e.a(context, attributeSet);
                if (a2 != null) {
                    setBackground(a2);
                }
            }
            addItemDecoration(new AVDmtPanelRecyleView$init$1(this));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtPanelRecyleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
