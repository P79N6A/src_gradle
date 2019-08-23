package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a&\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"updateLayoutForFullScreen", "", "view", "Landroid/view/View;", "canvasWidth", "", "canvasHeight", "updateLayoutForOldScreenPlan", "isPhotoType", "", "updateStickerParentLayout", "parentView", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67436a;

    @NotNull
    public static final int[] a(@NotNull View view, int i, int i2) {
        int i3;
        View view2 = view;
        int i4 = i;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67436a, true, 76885, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67436a, true, 76885, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, int[].class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        int a2 = fb.a(view2, view.getContext(), i4, i5);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        double d2 = (double) (i4 * 16);
        double d3 = (double) i5;
        Double.isNaN(d3);
        if (d2 > d3 * 9.01d) {
            return new int[]{0, (((fc.e(view.getContext()) - fb.a(view.getContext(), a2)) - layoutParams.height) / 2) + fb.b(view.getContext(), a2)};
        }
        int b2 = (fc.b(view.getContext()) - layoutParams.width) >> 1;
        if (fb.a()) {
            i3 = fb.f67664c;
        } else {
            i3 = 0;
        }
        return new int[]{b2, i3};
    }

    @NotNull
    public static final int[] a(@NotNull View view, int i, int i2, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, null, f67436a, true, 76884, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, null, f67436a, true, 76884, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, int[].class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "parentView");
        if (fc.a()) {
            return a(view, i, i2);
        }
        return a(z, view2, i, i2);
    }

    @NotNull
    private static int[] a(boolean z, @NotNull View view, int i, int i2) {
        View view2 = view;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67436a, true, 76886, new Class[]{Boolean.TYPE, View.class, Integer.TYPE, Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), view2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f67436a, true, 76886, new Class[]{Boolean.TYPE, View.class, Integer.TYPE, Integer.TYPE}, int[].class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        if (!z) {
            fb.a(view, i, i2);
        } else if (Math.abs(fc.a(view.getContext()) - i4) < 5 || i4 > fc.a(view.getContext())) {
            fb.a(view, i, i2);
        } else {
            fb.c(view, i, i2);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int b2 = (fc.b(view.getContext()) - layoutParams.width) >> 1;
        int e2 = (fc.e(view.getContext()) - layoutParams.height) >> 1;
        if (i3 > i4) {
            b2 = 0;
        } else if (i3 < i4) {
            e2 = 0;
        }
        return new int[]{b2, e2};
    }
}
