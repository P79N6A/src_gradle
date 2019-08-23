package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.widget.f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/ad/DescTextView;", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dotString", "", "drawableSpan", "value", "moreString", "getMoreString", "()Ljava/lang/String;", "setMoreString", "(Ljava/lang/String;)V", "getDotWidth", "getImageSpanStr", "Landroid/text/SpannableString;", "str", "getLastLineShowText", "text", "width", "getLastLineString", "getNeedLine", "getSpanWidth", "getTopLineText", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DescTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38465a;

    /* renamed from: b  reason: collision with root package name */
    private String f38466b;

    /* renamed from: c  reason: collision with root package name */
    private int f38467c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f38468d;

    @JvmOverloads
    public DescTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public DescTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @NotNull
    public final String getMoreString() {
        return this.f38468d;
    }

    private final int getDotWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, f38465a, false, 30393, new Class[0], Integer.TYPE)) {
            return (int) getPaint().measureText(this.f38466b);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38465a, false, 30393, new Class[0], Integer.TYPE)).intValue();
    }

    private final int getSpanWidth() {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[0], this, f38465a, false, 30390, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38465a, false, 30390, new Class[0], Integer.TYPE)).intValue();
        }
        if (a.a()) {
            drawable = new f(getContext(), C0906R.color.bz, this.f38468d, 2130839479).a();
        } else {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            drawable = new b(context, this.f38467c).getDrawable();
        }
        Intrinsics.checkExpressionValueIsNotNull(drawable, "drawable");
        return drawable.getIntrinsicWidth();
    }

    public final void setMoreString(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f38465a, false, 30388, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f38465a, false, 30388, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.f38468d = str2;
        invalidate();
    }

    private final SpannableString a(String str) {
        ReplacementSpan replacementSpan;
        if (PatchProxy.isSupport(new Object[]{str}, this, f38465a, false, 30395, new Class[]{String.class}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{str}, this, f38465a, false, 30395, new Class[]{String.class}, SpannableString.class);
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(StringsKt.trimEnd((CharSequence) str).toString());
            sb.append(' ');
            String sb2 = sb.toString();
            SpannableString spannableString = new SpannableString(sb2);
            if (a.a()) {
                replacementSpan = new f(getContext(), C0906R.color.bz, this.f38468d, 2130839479);
            } else {
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                replacementSpan = new b(context, this.f38467c);
            }
            d.a(spannableString, replacementSpan, sb2.length() - 1, sb2.length(), 33);
            return spannableString;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    private final String a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f38465a, false, 30396, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f38465a, false, 30396, new Class[]{String.class, Integer.TYPE}, String.class);
        }
        StaticLayout staticLayout = new StaticLayout(str2, getPaint(), i, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
        int lineStart = staticLayout.getLineStart(getMaxLines() - 1);
        int lineEnd = staticLayout.getLineEnd(getMaxLines() - 1);
        if (str2 != null) {
            String substring = str2.substring(lineStart, lineEnd);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        SpannableString spannableString;
        int i5;
        StringBuilder sb;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38465a, false, 30389, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38465a, false, 30389, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        String obj = getText().toString();
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(size)}, this, f38465a, false, 30394, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(size)}, this, f38465a, false, 30394, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            i3 = size;
        } else {
            i3 = size;
            StaticLayout staticLayout = new StaticLayout(obj, getPaint(), size, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            i4 = staticLayout.getLineCount();
        }
        if (i4 < getMaxLines()) {
            spannableString = a(getText().toString());
        } else {
            if (((float) i3) > ((float) getSpanWidth()) + getPaint().measureText(a(getText().toString(), i3))) {
                spannableString = a(getText().toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                String obj2 = getText().toString();
                int i6 = i3;
                if (PatchProxy.isSupport(new Object[]{obj2, Integer.valueOf(i3)}, this, f38465a, false, 30391, new Class[]{String.class, Integer.TYPE}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{obj2, Integer.valueOf(i6)}, this, f38465a, false, 30391, new Class[]{String.class, Integer.TYPE}, String.class);
                    i5 = i6;
                    sb = sb2;
                } else {
                    TextPaint paint = getPaint();
                    i5 = i6;
                    TextPaint textPaint = paint;
                    String str3 = obj2;
                    sb = sb2;
                    StaticLayout staticLayout2 = new StaticLayout(obj2, textPaint, i5, Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                    int lineStart = staticLayout2.getLineStart(getMaxLines() - 1);
                    if (str3 != null) {
                        str = str3.substring(0, lineStart);
                        Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                sb.append(str);
                String obj3 = getText().toString();
                StringBuilder sb3 = sb;
                int i7 = i5;
                if (PatchProxy.isSupport(new Object[]{obj3, Integer.valueOf(i5)}, this, f38465a, false, 30392, new Class[]{String.class, Integer.TYPE}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{obj3, Integer.valueOf(i7)}, this, f38465a, false, 30392, new Class[]{String.class, Integer.TYPE}, String.class);
                } else {
                    StaticLayout staticLayout3 = new StaticLayout(a(obj3, i7), getPaint(), (i7 - getDotWidth()) - getSpanWidth(), Layout.Alignment.ALIGN_CENTER, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
                    int lineStart2 = staticLayout3.getLineStart(0);
                    int lineEnd = staticLayout3.getLineEnd(0);
                    StringBuilder sb4 = new StringBuilder();
                    String a2 = a(obj3, i7);
                    if (a2 != null) {
                        String substring = a2.substring(lineStart2, lineEnd);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb4.append(substring);
                        sb4.append(this.f38466b);
                        str2 = sb4.toString();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                sb3.append(str2);
                spannableString = a(sb3.toString());
            }
        }
        setText(spannableString);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DescTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f38466b = "...";
        if (a.a()) {
            i2 = 2130839479;
        } else {
            i2 = 2130838562;
        }
        this.f38467c = i2;
        this.f38468d = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DescTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
