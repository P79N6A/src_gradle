package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"createEmptyView", "Landroid/view/View;", "context", "Landroid/content/Context;", "heightDp", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55328a;

    @NotNull
    public static final View a(@NotNull Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, 96}, null, f55328a, true, 58607, new Class[]{Context.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, 96}, null, f55328a, true, 58607, new Class[]{Context.class, Integer.TYPE}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) UIUtils.dip2Px(context2, 96.0f));
        View view = new View(context2);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }
}
