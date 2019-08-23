package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.support.v4.view.AsyncLayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/view/ViewGroup;", "onInflateFinished"}, k = 3, mv = {1, 1, 15})
final class CameraOptimize__CamereOptimizeKt$addPlaceHolderView$1 implements AsyncLayoutInflater.OnInflateFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70447a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f70448b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ViewGroup f70449c;

    CameraOptimize__CamereOptimizeKt$addPlaceHolderView$1(Context context, ViewGroup viewGroup) {
        this.f70448b = context;
        this.f70449c = viewGroup;
    }

    public final void onInflateFinished(@NotNull View view, int i, @Nullable ViewGroup viewGroup) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), viewGroup}, this, f70447a, false, 80133, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), viewGroup}, this, f70447a, false, 80133, new Class[]{View.class, Integer.TYPE, ViewGroup.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (fc.a()) {
            switch (fb.f67663b) {
                case 1:
                case 2:
                case 4:
                case 5:
                    RecordLayout recordLayout = (RecordLayout) view.findViewById(C0906R.id.ca_);
                    Intrinsics.checkExpressionValueIsNotNull(recordLayout, "recordLayout");
                    ViewGroup.LayoutParams layoutParams = recordLayout.getLayoutParams();
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.bottomMargin = ((int) UIUtils.dip2Px(this.f70448b, 33.0f)) + ((int) UIUtils.dip2Px(this.f70448b, 35.0f));
                        recordLayout.setLayoutParams(layoutParams2);
                        break;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
            }
        }
        this.f70449c.addView(view);
    }
}
