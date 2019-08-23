package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtAutoRTLImageView;", "Lcom/ss/android/ugc/aweme/views/AutoRTLImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isChangeColor", "", "isOldPanelStyle", "setImageDrawable", "", "drawable", "Landroid/graphics/drawable/Drawable;", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtAutoRTLImageView extends AutoRTLImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74539a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f74540b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f74541c;

    @JvmOverloads
    public AVDmtAutoRTLImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtAutoRTLImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setImageDrawable(@Nullable Drawable drawable) {
        Drawable drawable2;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f74539a, false, 86744, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f74539a, false, 86744, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        if (this.f74541c) {
            drawable2 = b.f74589e.a(drawable, this.f74540b);
        } else {
            drawable2 = drawable;
        }
        super.setImageDrawable(drawable2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtAutoRTLImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f74541c = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f74540b = obtainStyledAttributes.getBoolean(21, false);
            this.f74541c = obtainStyledAttributes.getBoolean(5, true);
        }
        if (this.f74541c) {
            setImageDrawable(b.f74589e.a(getDrawable(), this.f74540b));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtAutoRTLImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
