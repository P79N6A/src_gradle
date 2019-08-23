package com.ss.android.ugc.aweme.longvideonew.feature;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u0010\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/feature/LongVideoScreenHelper;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "mPlayContainer", "Landroid/widget/FrameLayout;", "(Landroid/content/Context;Landroid/view/View;Landroid/widget/FrameLayout;)V", "SCALE_9_16", "", "mDifHeight", "", "mScreenHeight", "mScreenHeightWithoutStatusBar", "mScreenWidth", "getDifHeight", "width", "height", "getMetrics", "", "resizeOperationPosition", "isLandscape", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54064a;

    /* renamed from: b  reason: collision with root package name */
    public int f54065b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f54066c;

    /* renamed from: d  reason: collision with root package name */
    public final View f54067d;

    /* renamed from: e  reason: collision with root package name */
    private final double f54068e = 0.56d;

    /* renamed from: f  reason: collision with root package name */
    private int f54069f;
    private int g;
    private int h;
    private final FrameLayout i;

    public final void a(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54064a, false, 56902, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54064a, false, 56902, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f54065b != 0) {
            FrameLayout frameLayout = this.i;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.bottomMargin -= this.f54065b;
                } else {
                    layoutParams2.bottomMargin += this.f54065b;
                }
                this.i.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public a(@Nullable Context context, @Nullable View view, @Nullable FrameLayout frameLayout) {
        this.f54066c = context;
        this.f54067d = view;
        this.i = frameLayout;
        View view2 = this.f54067d;
        if (view2 != null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54070a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f54071b;

                    public final void onGlobalLayout() {
                        if (PatchProxy.isSupport(new Object[0], this, f54070a, false, 56903, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f54070a, false, 56903, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f54071b.f54067d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        this.f54071b.f54065b = this.f54071b.a(this.f54071b.f54066c, this.f54071b.f54067d.getWidth(), this.f54071b.f54067d.getHeight());
                        this.f54071b.a(false);
                    }

                    {
                        this.f54071b = r1;
                    }
                });
            }
        }
    }

    public final int a(Context context, int i2, int i3) {
        double d2;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f54064a, false, 56901, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f54064a, false, 56901, new Class[]{Context.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (i4 == 0 || i5 == 0) {
            if (PatchProxy.isSupport(new Object[]{context}, this, f54064a, false, 56900, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context}, this, f54064a, false, 56900, new Class[]{Context.class}, Void.TYPE);
            } else if (context != null) {
                if (Build.VERSION.SDK_INT >= 17) {
                    WindowManager windowManager = ((Activity) context).getWindowManager();
                    Intrinsics.checkExpressionValueIsNotNull(windowManager, "(context as Activity).windowManager");
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getRealMetrics(displayMetrics);
                    this.h = displayMetrics.heightPixels;
                    this.g = displayMetrics.heightPixels + UIUtils.getStatusBarHeight(context);
                    this.f54069f = displayMetrics.widthPixels;
                } else {
                    this.h = UIUtils.getScreenHeight(context);
                    this.g = this.h;
                    this.f54069f = UIUtils.getScreenWidth(context);
                }
            }
        } else {
            this.f54069f = i4;
            this.h = i5;
        }
        double d3 = (double) this.f54069f;
        double d4 = (double) this.h;
        Double.isNaN(d3);
        Double.isNaN(d4);
        try {
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d3 / d4)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            d2 = Double.parseDouble(format);
        } catch (Throwable unused) {
            d2 = 1.0d;
        }
        if (d2 >= this.f54068e) {
            return 0;
        }
        return (this.h - ((this.f54069f / 9) * 16)) / 2;
    }
}
