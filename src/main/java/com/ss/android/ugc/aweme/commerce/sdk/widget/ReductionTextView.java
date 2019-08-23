package com.ss.android.ugc.aweme.commerce.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/widget/ReductionTextView;", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "reductions", "", "", "getReductions", "()Ljava/util/List;", "setReductions", "(Ljava/util/List;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class ReductionTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37956a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private List<String> f37957b;

    @Nullable
    public final List<String> getReductions() {
        return this.f37957b;
    }

    public final void setReductions(@Nullable List<String> list) {
        this.f37957b = list;
    }

    public ReductionTextView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i, int i2) {
        String str;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37956a, false, 29651, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f37956a, false, 29651, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        List<String> list = this.f37957b;
        if (list != null) {
            String str2 = "";
            int size = list.size();
            while (i3 < size) {
                if (i3 == 0) {
                    str = list.get(i3);
                } else {
                    str = str2 + "；" + list.get(i3);
                }
                if (getPaint().measureText(str) > ((float) getMeasuredWidth())) {
                    break;
                }
                i3++;
                str2 = str;
            }
            setText(str2);
        }
    }
}
