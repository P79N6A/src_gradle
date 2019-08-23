package com.ss.android.ugc.aweme.longvideo;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/LongVideoScreenHelper;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "mPlayContainer", "Landroid/widget/LinearLayout;", "(Landroid/content/Context;Landroid/view/View;Landroid/widget/LinearLayout;)V", "SCALE_9_16", "", "mDifHeight", "", "mScreenHeight", "mScreenHeightWithoutStatusBar", "mScreenWidth", "getDifHeight", "width", "height", "getMetrics", "", "resizeOperationPosition", "isLandscape", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53948a;

    /* renamed from: b  reason: collision with root package name */
    public int f53949b;

    /* renamed from: c  reason: collision with root package name */
    private final double f53950c = 0.56d;

    /* renamed from: d  reason: collision with root package name */
    private int f53951d;

    /* renamed from: e  reason: collision with root package name */
    private int f53952e;

    /* renamed from: f  reason: collision with root package name */
    private int f53953f;
    private final LinearLayout g;

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53948a, false, 56658, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53948a, false, 56658, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f53949b != 0) {
            ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.bottomMargin -= this.f53949b;
                } else {
                    layoutParams2.bottomMargin += this.f53949b;
                }
                this.g.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public h(@NotNull final Context context, @NotNull final View view, @NotNull LinearLayout linearLayout) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(linearLayout, "mPlayContainer");
        this.g = linearLayout;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53954a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f53955b;

            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f53954a, false, 56659, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53954a, false, 56659, new Class[0], Void.TYPE);
                    return;
                }
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f53955b.f53949b = this.f53955b.a(context, view.getWidth(), view.getHeight());
                this.f53955b.a(false);
            }

            {
                this.f53955b = r1;
            }
        });
    }

    public final int a(Context context, int i, int i2) {
        double d2;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53948a, false, 56657, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53948a, false, 56657, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i3 == 0 || i4 == 0) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f53948a, false, 56656, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f53948a, false, 56656, new Class[]{Context.class}, Void.TYPE);
            } else if (Build.VERSION.SDK_INT < 17) {
                this.f53953f = UIUtils.getScreenHeight(context);
                this.f53952e = this.f53953f;
                this.f53951d = UIUtils.getScreenWidth(context);
            } else if (context != null) {
                WindowManager windowManager = ((Activity) context).getWindowManager();
                Intrinsics.checkExpressionValueIsNotNull(windowManager, "(context as Activity).windowManager");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                this.f53953f = displayMetrics.heightPixels;
                this.f53952e = displayMetrics.heightPixels + UIUtils.getStatusBarHeight(context);
                this.f53951d = displayMetrics.widthPixels;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
        } else {
            this.f53951d = i3;
            this.f53953f = i4;
        }
        double d3 = (double) this.f53951d;
        double d4 = (double) this.f53953f;
        Double.isNaN(d3);
        Double.isNaN(d4);
        try {
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d3 / d4)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            d2 = Double.parseDouble(format);
        } catch (Throwable unused) {
            d2 = 1.0d;
        }
        if (d2 >= this.f53950c) {
            return 0;
        }
        return (this.f53953f - ((this.f53951d / 9) * 16)) / 2;
    }
}
