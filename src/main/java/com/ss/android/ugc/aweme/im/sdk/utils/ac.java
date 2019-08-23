package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.Context;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/utils/MediaViewSizeHelper;", "", "()V", "MAX_HORIZONTAL_RATIO", "", "MEDIA_VIEW_SIZE_ONE", "", "MEDIA_VIEW_SIZE_THREE", "MEDIA_VIEW_SIZE_TWO", "MID_HORIZONTAL_RATIO", "MID_VERTICAL_RATIO", "MIN_VERTICAL_RATIO", "measure", "", "imageView", "Lcom/facebook/drawee/view/SimpleDraweeView;", "rawWidth", "rawHeight", "(Lcom/facebook/drawee/view/SimpleDraweeView;FF)[Ljava/lang/Integer;", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52462a;

    /* renamed from: b  reason: collision with root package name */
    public static final ac f52463b = new ac();

    /* renamed from: c  reason: collision with root package name */
    private static final int f52464c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f52465d;

    /* renamed from: e  reason: collision with root package name */
    private static final int f52466e;

    private ac() {
    }

    static {
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        f52464c = context.getResources().getDimensionPixelSize(C0906R.dimen.h8);
        Context context2 = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
        f52465d = context2.getResources().getDimensionPixelSize(C0906R.dimen.h_);
        Context context3 = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
        f52466e = context3.getResources().getDimensionPixelSize(C0906R.dimen.h9);
    }

    @JvmStatic
    @NotNull
    public static final Integer[] a(@Nullable SimpleDraweeView simpleDraweeView, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        if (PatchProxy.isSupport(new Object[]{simpleDraweeView, Float.valueOf(f2), Float.valueOf(f3)}, null, f52462a, true, 53650, new Class[]{SimpleDraweeView.class, Float.TYPE, Float.TYPE}, Integer[].class)) {
            return (Integer[]) PatchProxy.accessDispatch(new Object[]{simpleDraweeView, Float.valueOf(f2), Float.valueOf(f3)}, null, f52462a, true, 53650, new Class[]{SimpleDraweeView.class, Float.TYPE, Float.TYPE}, Integer[].class);
        }
        float f8 = f2 / f3;
        if (f8 <= 0.5625f) {
            f5 = (float) f52464c;
            f4 = (float) f52466e;
        } else if (f8 <= 0.5625f || f8 > 0.75f) {
            if (f8 > 0.75f && f8 <= 1.0f) {
                f6 = (float) f52465d;
                f7 = f6 / f8;
                if (f7 > ((float) f52466e)) {
                    f7 = (float) f52466e;
                }
            } else if (f8 > 1.0f && f8 < 1.3333334f) {
                f4 = (float) f52465d;
                f5 = f4 / f8;
                if (f5 > ((float) f52466e)) {
                    f4 = (float) f52466e;
                }
            } else if (f8 < 1.3333334f || f8 >= 1.7777778f) {
                f5 = (float) f52466e;
                f4 = (float) f52464c;
            } else {
                f6 = (float) f52466e;
                f7 = f8 * f6;
                if (f7 > ((float) f52465d)) {
                    f7 = (float) f52465d;
                }
            }
            float f9 = f6;
            f4 = f7;
            f5 = f9;
        } else {
            f4 = (float) f52466e;
            f5 = f8 * f4;
            if (f5 > ((float) f52465d)) {
                f5 = (float) f52465d;
            }
        }
        if (simpleDraweeView != null) {
            GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) simpleDraweeView.getHierarchy();
            Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "imageView.hierarchy");
            genericDraweeHierarchy.setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
        }
        return new Integer[]{Integer.valueOf((int) f5), Integer.valueOf((int) f4)};
    }
}
