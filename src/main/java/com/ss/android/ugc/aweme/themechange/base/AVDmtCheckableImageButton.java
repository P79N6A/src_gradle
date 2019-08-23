package com.ss.android.ugc.aweme.themechange.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.design.widget.CheckableImageButton;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtCheckableImageButton;", "Landroid/support/design/widget/CheckableImageButton;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isChangeColor", "", "selectDrawable", "Landroid/graphics/drawable/Drawable;", "unSelectDrawable", "init", "", "toggle", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtCheckableImageButton extends CheckableImageButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74542a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f74543b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f74544c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f74545d;

    @SuppressLint({"RestrictedApi"})
    public final void toggle() {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[0], this, f74542a, false, 86748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74542a, false, 86748, new Class[0], Void.TYPE);
            return;
        }
        super.toggle();
        if (isChecked()) {
            drawable = this.f74543b;
        } else {
            drawable = this.f74544c;
        }
        setImageDrawable(drawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AVDmtCheckableImageButton(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AVDmtCheckableImageButton(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @SuppressLint({"RestrictedApi"})
    public AVDmtCheckableImageButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f74545d = true;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74542a, false, 86747, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74542a, false, 86747, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            boolean z = obtainStyledAttributes.getBoolean(21, false);
            this.f74545d = obtainStyledAttributes.getBoolean(5, true);
            this.f74543b = obtainStyledAttributes.getDrawable(26);
            this.f74544c = obtainStyledAttributes.getDrawable(33);
            if (this.f74545d) {
                this.f74543b = b.f74589e.a(this.f74543b, z);
                this.f74544c = b.f74589e.a(this.f74544c, z);
            }
            setImageDrawable(this.f74544c);
        }
    }
}
