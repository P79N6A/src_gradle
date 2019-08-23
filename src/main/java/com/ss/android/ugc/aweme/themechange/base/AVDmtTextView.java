package com.ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000bJ\u001a\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000bH\u0016J\u0006\u0010\u001e\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/themechange/base/AVDmtTextView;", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clickStatusTextColor", "isChangeColor", "", "isChangeTextSize", "isClickChangeColor", "isCurSelected", "isOldPanelStyle", "isSelectState", "selectTextColor", "typeFont", "Landroid/graphics/Typeface;", "unSelectTextColor", "changeTextSizeAndBold", "", "clickStatus", "isSelect", "init", "setOldPanelStyle", "oldPanelStyle", "setSelected", "selected", "setTextBold", "tools.avdmtview_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AVDmtTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74573a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f74574b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f74575c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f74576d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f74577e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f74578f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private Typeface k;

    @JvmOverloads
    public AVDmtTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AVDmtTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74573a, false, 86836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74573a, false, 86836, new Class[0], Void.TYPE);
            return;
        }
        if (this.k == null) {
            this.k = b.a().a(c.g);
        }
        setTypeface(this.k);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74573a, false, 86834, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74573a, false, 86834, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            setTextColor(this.g);
        } else if (this.f74575c) {
            setTextColor(this.i);
        }
    }

    public final void setOldPanelStyle(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74573a, false, 86832, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74573a, false, 86832, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f74574b = z;
        this.g = b.f74589e.a(this.f74574b);
        this.h = b.a(this.g);
        if (this.f74578f) {
            i2 = this.g;
        } else {
            i2 = this.h;
        }
        setTextColor(i2);
    }

    public final void setSelected(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74573a, false, 86833, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74573a, false, 86833, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        if (this.f74577e) {
            if (z) {
                i2 = this.g;
            } else {
                i2 = this.h;
            }
            setTextColor(i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AVDmtTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f74575c = true;
        this.f74578f = true;
        this.j = true;
        this.k = b.a().a(c.g);
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f74573a, false, 86831, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f74573a, false, 86831, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f74574b = obtainStyledAttributes.getBoolean(21, false);
            this.f74575c = obtainStyledAttributes.getBoolean(1, true);
            this.f74576d = obtainStyledAttributes.getBoolean(6, false);
            this.f74577e = obtainStyledAttributes.getBoolean(8, false);
            this.f74578f = obtainStyledAttributes.getBoolean(9, true);
            this.j = obtainStyledAttributes.getBoolean(5, true);
            obtainStyledAttributes.recycle();
        }
        this.i = getResources().getColor(C0906R.color.a1w);
        this.g = b.f74589e.a(this.f74574b);
        this.h = b.a(this.g);
        if (this.j) {
            if (this.f74578f) {
                i3 = this.g;
            } else {
                i3 = this.h;
            }
            setTextColor(i3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AVDmtTextView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
