package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/widget/HorizontalBusinessComponentLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bind", "", "components", "", "Lcom/ss/android/ugc/aweme/poi/widget/BusinessComponent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HorizontalBusinessComponentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61007a;

    @JvmOverloads
    public HorizontalBusinessComponentLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public HorizontalBusinessComponentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(@Nullable List<e> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61007a, false, 66997, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f61007a, false, 66997, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int i = 0;
        boolean z = false;
        for (e eVar : list) {
            if (i > 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 0.5f), (int) UIUtils.dip2Px(getContext(), 20.0f));
                View view = new View(getContext());
                view.setBackgroundColor(352321535);
                addView(view, layoutParams);
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) UIUtils.dip2Px(getContext(), 68.0f));
            layoutParams2.weight = 1.0f;
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.yj, null);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.bzb);
            ((ImageView) inflate.findViewById(C0906R.id.bza)).setImageResource(eVar.f61073b);
            Intrinsics.checkExpressionValueIsNotNull(textView, "txt");
            textView.setText(eVar.f61072a);
            if (eVar.f61075d != null) {
                inflate.setOnClickListener(eVar.f61075d);
            }
            addView(inflate, layoutParams2);
            i++;
            z = true;
        }
        if (z) {
            setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HorizontalBusinessComponentLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HorizontalBusinessComponentLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
