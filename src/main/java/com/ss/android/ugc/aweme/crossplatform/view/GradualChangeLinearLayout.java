package com.ss.android.ugc.aweme.crossplatform.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0014R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/view/GradualChangeLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initY", "value", "", "isGradualChangeMode", "()Z", "setGradualChangeMode", "(Z)V", "lastY", "space", "Landroid/widget/Space;", "titleBar", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar;", "getTitleBar", "()Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar;", "setTitleBar", "(Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformTitleBar;)V", "titleBarHeight", "webView", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "webViewMove", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "onFinishInflate", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GradualChangeLinearLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41019a;

    /* renamed from: b  reason: collision with root package name */
    public Space f41020b;

    /* renamed from: c  reason: collision with root package name */
    public int f41021c;

    /* renamed from: d  reason: collision with root package name */
    public int f41022d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f41023e;

    /* renamed from: f  reason: collision with root package name */
    private SingleWebView f41024f;
    @Nullable
    private CrossPlatformTitleBar g;
    private int h;
    private int i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/GradualChangeLinearLayout$onFinishInflate$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GradualChangeLinearLayout f41026b;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f41025a, false, 34613, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41025a, false, 34613, new Class[0], Void.TYPE);
                return;
            }
            this.f41026b.f41021c = GradualChangeLinearLayout.a(this.f41026b).getHeight();
            GradualChangeLinearLayout.a(this.f41026b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        a(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f41026b = gradualChangeLinearLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/GradualChangeLinearLayout$onFinishInflate$2", "Lcom/ss/android/ugc/aweme/crossplatform/view/IWebScrollListener;", "onScrollChanged", "", "l", "", "t", "oldl", "oldt", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GradualChangeLinearLayout f41027a;

        b(GradualChangeLinearLayout gradualChangeLinearLayout) {
            this.f41027a = gradualChangeLinearLayout;
        }

        public final void a(int i) {
            this.f41027a.f41022d = i;
        }
    }

    @JvmOverloads
    public GradualChangeLinearLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public GradualChangeLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Nullable
    public final CrossPlatformTitleBar getTitleBar() {
        return this.g;
    }

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f41019a, false, 34609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41019a, false, 34609, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        View findViewById = findViewById(C0906R.id.bpv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.nav_bar_divide)");
        this.f41020b = (Space) findViewById;
        Space space = this.f41020b;
        if (space == null) {
            Intrinsics.throwUninitializedPropertyAccessException("space");
        }
        space.getViewTreeObserver().addOnGlobalLayoutListener(new a(this));
        View findViewById2 = findViewById(C0906R.id.a1o);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.cross_react_view)");
        SingleWebView b2 = ((h) ((CrossPlatformWebView) findViewById2).a(h.class)).b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "crossPlatformWebView.get…Wrap::class.java).webView");
        this.f41024f = b2;
        SingleWebView singleWebView = this.f41024f;
        if (singleWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        singleWebView.setWebScrollListener(new b(this));
    }

    public final void setTitleBar(@Nullable CrossPlatformTitleBar crossPlatformTitleBar) {
        this.g = crossPlatformTitleBar;
    }

    public static final /* synthetic */ Space a(GradualChangeLinearLayout gradualChangeLinearLayout) {
        Space space = gradualChangeLinearLayout.f41020b;
        if (space == null) {
            Intrinsics.throwUninitializedPropertyAccessException("space");
        }
        return space;
    }

    public final void setGradualChangeMode(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41019a, false, 34608, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41019a, false, 34608, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41023e = z;
        Space space = this.f41020b;
        if (space == null) {
            Intrinsics.throwUninitializedPropertyAccessException("space");
        }
        if (space.getHeight() != this.f41021c) {
            Space space2 = this.f41020b;
            if (space2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("space");
            }
            ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
            layoutParams.height = this.f41021c;
            Space space3 = this.f41020b;
            if (space3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("space");
            }
            space3.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f41019a, false, 34610, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f41019a, false, 34610, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f41023e) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getActionMasked());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                this.h = (int) motionEvent.getY();
                this.i = (int) motionEvent.getY();
            } else if (num != null && num.intValue() == 2) {
                int y = (int) motionEvent.getY();
                int i2 = y - this.i;
                Space space = this.f41020b;
                if (space == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("space");
                }
                int height = space.getHeight();
                this.i = y;
                if (height > 0 && i2 < 0) {
                    Space space2 = this.f41020b;
                    if (space2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("space");
                    }
                    ViewGroup.LayoutParams layoutParams = space2.getLayoutParams();
                    layoutParams.height += i2;
                    if (layoutParams.height < 0) {
                        layoutParams.height = 0;
                    }
                    Space space3 = this.f41020b;
                    if (space3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("space");
                    }
                    space3.setLayoutParams(layoutParams);
                    CrossPlatformTitleBar crossPlatformTitleBar = this.g;
                    if (crossPlatformTitleBar != null) {
                        crossPlatformTitleBar.setBackgroundAlpha(((float) layoutParams.height) / ((float) this.f41021c));
                    }
                    return true;
                } else if (height < this.f41021c && this.f41022d == 0 && i2 > 0) {
                    Space space4 = this.f41020b;
                    if (space4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("space");
                    }
                    ViewGroup.LayoutParams layoutParams2 = space4.getLayoutParams();
                    layoutParams2.height += i2;
                    if (layoutParams2.height > this.f41021c) {
                        layoutParams2.height = this.f41021c;
                    }
                    CrossPlatformTitleBar crossPlatformTitleBar2 = this.g;
                    if (crossPlatformTitleBar2 != null) {
                        crossPlatformTitleBar2.setBackgroundAlpha(((float) layoutParams2.height) / ((float) this.f41021c));
                    }
                    Space space5 = this.f41020b;
                    if (space5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("space");
                    }
                    space5.setLayoutParams(layoutParams2);
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GradualChangeLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GradualChangeLinearLayout(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
