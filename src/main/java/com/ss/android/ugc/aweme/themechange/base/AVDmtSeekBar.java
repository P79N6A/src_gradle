package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtSeekBar;", "Lcom/ss/android/ugc/aweme/filter/widget/FilterBeautySeekBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressClipDrawable", "Landroid/graphics/drawable/ClipDrawable;", "init", "", "setProgress", "progress", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtSeekBar extends FilterBeautySeekBar {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f74568b;

    /* renamed from: c  reason: collision with root package name */
    private ClipDrawable f74569c;

    @JvmOverloads
    public AVDmtSeekBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74568b, false, 86804, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74568b, false, 86804, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setProgress(i);
        if (this.f74569c != null) {
            ClipDrawable clipDrawable = this.f74569c;
            if (clipDrawable == null) {
                Intrinsics.throwNpe();
            }
            clipDrawable.setLevel(i * 100);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74568b, false, 86803, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74568b, false, 86803, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.AVDmtView);
            i3 = (int) obtainStyledAttributes.getDimension(24, 0.0f);
            i2 = (int) obtainStyledAttributes.getDimension(31, 0.0f);
            i4 = (int) obtainStyledAttributes.getDimension(30, 0.0f);
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        int i5 = b.f74586b;
        setThumb(bc.a(i5, i5, 0, i2, i4));
        int color = getResources().getColor(C0906R.color.a1w);
        this.f74569c = new ClipDrawable(bc.a(color, color, 0, i3), 3, 1);
        ClipDrawable clipDrawable = this.f74569c;
        if (clipDrawable == null) {
            Intrinsics.throwNpe();
        }
        clipDrawable.setLevel(getProgress() * 100);
        int a2 = b.f74589e.a(false, false, false, false, true);
        Drawable a3 = bc.a(a2, a2, 0, i3);
        Drawable[] drawableArr = new Drawable[2];
        Intrinsics.checkExpressionValueIsNotNull(a3, "bgDrawable");
        drawableArr[0] = a3;
        ClipDrawable clipDrawable2 = this.f74569c;
        if (clipDrawable2 == null) {
            Intrinsics.throwNpe();
        }
        drawableArr[1] = clipDrawable2;
        setProgressDrawable(new LayerDrawable(drawableArr));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtSeekBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
