package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.hotspot.j;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.hotsearch.a.d;
import com.ss.android.ugc.bytex.a.a.a;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\nR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/widget/HotSearchTitleTextView;", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hotSearchItem", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "isInSpot", "", "()Z", "setInSpot", "(Z)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setHotSearchItem", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSearchTitleTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43304a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43305b;

    /* renamed from: c  reason: collision with root package name */
    private HotSearchItem f43306c;

    @JvmOverloads
    public HotSearchTitleTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HotSearchTitleTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setInSpot(boolean z) {
        this.f43305b = z;
    }

    public final void setHotSearchItem(@NotNull HotSearchItem hotSearchItem) {
        float f2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        HotSearchItem hotSearchItem2 = hotSearchItem;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem2}, this, f43304a, false, 38257, new Class[]{HotSearchItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchItem2}, this, f43304a, false, 38257, new Class[]{HotSearchItem.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hotSearchItem2, "item");
        this.f43306c = hotSearchItem2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (hotSearchItem.getType() == 1) {
            spannableStringBuilder.append("#");
            String word = hotSearchItem.getWord();
            if (word == null) {
                Intrinsics.throwNpe();
            }
            CharSequence charSequence = word;
            int length = charSequence.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (charSequence.charAt(i2) <= ' ') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z3 = true;
                } else {
                    i3++;
                }
            }
            spannableStringBuilder.append(charSequence.subSequence(i3, length + 1).toString());
        } else if (hotSearchItem.getType() == 0) {
            String word2 = hotSearchItem.getWord();
            if (word2 == null) {
                Intrinsics.throwNpe();
            }
            CharSequence charSequence2 = word2;
            int length2 = charSequence2.length() - 1;
            int i4 = 0;
            boolean z4 = false;
            while (i4 <= length2) {
                if (!z4) {
                    i = i4;
                } else {
                    i = length2;
                }
                if (charSequence2.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z4) {
                    if (!z) {
                        break;
                    }
                    length2--;
                } else if (!z) {
                    z4 = true;
                } else {
                    i4++;
                }
            }
            spannableStringBuilder.append(charSequence2.subSequence(i4, length2 + 1).toString());
            Drawable drawable = null;
            if (!this.f43305b) {
                switch (hotSearchItem.getLabel()) {
                    case 1:
                        drawable = a.a(getResources(), 2130838989);
                        break;
                    case 2:
                        drawable = a.a(getResources(), 2130838988);
                        break;
                    case 3:
                        drawable = a.a(getResources(), 2130838987);
                        break;
                }
            } else {
                j.a aVar = j.f42447b;
                int label = hotSearchItem.getLabel();
                Context context = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(label), context}, aVar, j.a.f42448a, false, 36564, new Class[]{Integer.TYPE, Context.class}, Drawable.class)) {
                    drawable = (Drawable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(label), context}, aVar, j.a.f42448a, false, 36564, new Class[]{Integer.TYPE, Context.class}, Drawable.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(context, "context");
                    if (label > 0 && label <= d.f49650a.length) {
                        drawable = a.a(context.getResources(), j.f42446a[label - 1]);
                    }
                }
            }
            if (drawable != null) {
                if (this.f43305b) {
                    f2 = 16.0f;
                } else {
                    f2 = 13.0f;
                }
                drawable.setBounds(0, 0, (int) UIUtils.dip2Px(getContext(), f2), (int) UIUtils.dip2Px(getContext(), f2));
                com.bytedance.ies.dmt.ui.common.a aVar2 = new com.bytedance.ies.dmt.ui.common.a(drawable);
                spannableStringBuilder.append(" *");
                spannableStringBuilder.setSpan(aVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        setText(spannableStringBuilder);
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43304a, false, 38256, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43304a, false, 38256, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        Intrinsics.checkExpressionValueIsNotNull(layout, "layout");
        if (layout.getEllipsisCount(layout.getLineCount() - 1) > 0 && this.f43306c != null) {
            HotSearchItem hotSearchItem = this.f43306c;
            if (hotSearchItem == null) {
                Intrinsics.throwNpe();
            }
            if (hotSearchItem.getType() == 0) {
                CharSequence text = getText();
                HotSearchItem hotSearchItem2 = this.f43306c;
                if (hotSearchItem2 == null) {
                    Intrinsics.throwNpe();
                }
                if (!TextUtils.equals(text, hotSearchItem2.getWord())) {
                    HotSearchItem hotSearchItem3 = this.f43306c;
                    if (hotSearchItem3 == null) {
                        Intrinsics.throwNpe();
                    }
                    setText(hotSearchItem3.getWord());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HotSearchTitleTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HotSearchTitleTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
