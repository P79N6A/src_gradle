package com.ss.android.ugc.aweme.commerce.base;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0014J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0012H$J\b\u0010\u0019\u001a\u00020\u0010H\u0004J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0006H\u0004R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/base/BaseBottomDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "themeResId", "", "(Landroid/content/Context;I)V", "LOADING_VIEW_PADDING_VERTICAL", "getLOADING_VIEW_PADDING_VERTICAL", "()I", "mScreenWidth", "getMScreenWidth", "setMScreenWidth", "(I)V", "addLayoutListener", "", "createErrorView", "Landroid/view/View;", "createLoadingView", "createStateView", "text", "", "getDialogFixHeight", "getRootView", "setDialogFullWidth", "setMaxHeight", "height", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class BaseBottomDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36697a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36698b;

    /* renamed from: c  reason: collision with root package name */
    public int f36699c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/base/BaseBottomDialog$addLayoutListener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseBottomDialog f36701b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f36702c;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f36700a, false, 27922, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36700a, false, 27922, new Class[0], Void.TYPE);
                return;
            }
            this.f36702c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int c2 = this.f36701b.c();
            BaseBottomDialog baseBottomDialog = this.f36701b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(c2)}, baseBottomDialog, BaseBottomDialog.f36697a, false, 27918, new Class[]{Integer.TYPE}, Void.TYPE)) {
                BaseBottomDialog baseBottomDialog2 = baseBottomDialog;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(c2)}, baseBottomDialog2, BaseBottomDialog.f36697a, false, 27918, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            Window window = baseBottomDialog.getWindow();
            if (window == null) {
                Intrinsics.throwNpe();
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = c2;
            window.setAttributes(attributes);
        }

        a(BaseBottomDialog baseBottomDialog, View view) {
            this.f36701b = baseBottomDialog;
            this.f36702c = view;
        }
    }

    @Nullable
    public abstract View a();

    public int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f36697a, false, 27916, new Class[0], Integer.TYPE)) {
            return (int) (((float) UIUtils.getScreenHeight(getContext())) * 0.73f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36697a, false, 27916, new Class[0], Integer.TYPE)).intValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36697a, false, 27915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36697a, false, 27915, new Class[0], Void.TYPE);
            return;
        }
        Window window = getWindow();
        if (window == null) {
            Intrinsics.throwNpe();
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        window.setGravity(80);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setBackgroundDrawableResource(17170445);
        window.setWindowAnimations(C0906R.style.f3);
        if (PatchProxy.isSupport(new Object[0], this, f36697a, false, 27917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36697a, false, 27917, new Class[0], Void.TYPE);
            return;
        }
        View a2 = a();
        if (a2 != null) {
            ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new a(this, a2));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseBottomDialog(@NotNull Context context) {
        this(context, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BaseBottomDialog(@NotNull Context context, int i) {
        super(context, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        this.f36699c = resources.getDisplayMetrics().widthPixels;
        this.f36698b = (int) UIUtils.dip2Px(context, 20.0f);
    }
}
