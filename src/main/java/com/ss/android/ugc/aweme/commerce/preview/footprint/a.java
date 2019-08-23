package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"backAlpha", "", "backScaleXY", "helperAlpha", "helperScaleXY", "mainAlpha", "mainScaleXY", "animateBack", "", "view", "Landroid/view/View;", "animateMain", "scale", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37445a;

    public static final void a(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f37445a, true, 28909, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f37445a, true, 28909, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        view2.setAlpha(0.34f);
        view2.setScaleX(0.75510204f);
        view2.setScaleY(0.75510204f);
    }

    public static final void a(float f2, @NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), view2}, null, f37445a, true, 28908, new Class[]{Float.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), view2}, null, f37445a, true, 28908, new Class[]{Float.TYPE, View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        float f3 = 1.0f - (f2 * 0.24489796f);
        view2.setAlpha(1.0f - (0.65999997f * f2));
        view2.setScaleX(f3);
        view2.setScaleY(f3);
    }
}
