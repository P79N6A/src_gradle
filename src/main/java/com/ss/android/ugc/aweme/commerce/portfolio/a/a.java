package com.ss.android.ugc.aweme.commerce.portfolio.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/widget/PortfolioBubbleView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "anchorView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "textView", "Landroid/widget/TextView;", "triangle", "getTrianglePivotX", "", "setLocation", "", "setText", "text", "", "callBack", "Lkotlin/Function0;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37041a;

    /* renamed from: b  reason: collision with root package name */
    View f37042b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f37043c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    View f37044d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.portfolio.a.a$a  reason: collision with other inner class name */
    public static final class C0467a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f37046b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f37047c;

        public C0467a(a aVar, Function0 function0) {
            this.f37046b = aVar;
            this.f37047c = function0;
        }

        public final void run() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f37045a, false, 28512, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37045a, false, 28512, new Class[0], Void.TYPE);
                return;
            }
            a aVar = this.f37046b;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f37041a, false, 28508, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f37041a, false, 28508, new Class[0], Void.TYPE);
            } else {
                int[] iArr = new int[2];
                aVar.f37044d.getLocationOnScreen(iArr);
                float screenWidth = (float) ((UIUtils.getScreenWidth(aVar.getContext()) - iArr[0]) - (aVar.f37044d.getWidth() / 2));
                float width = screenWidth - ((float) (aVar.f37043c.getWidth() / 2));
                if (width > UIUtils.dip2Px(aVar.f37044d.getContext(), 15.0f)) {
                    i = (int) width;
                } else {
                    i = (int) UIUtils.dip2Px(aVar.f37044d.getContext(), 15.0f);
                }
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.rightMargin = i;
                    aVar.setLayoutParams(marginLayoutParams);
                    ViewGroup.LayoutParams layoutParams2 = aVar.f37042b.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.rightMargin = (int) ((screenWidth - ((float) i)) - ((float) (aVar.f37042b.getWidth() / 2)));
                        aVar.f37042b.setLayoutParams(marginLayoutParams2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            this.f37047c.invoke();
            this.f37046b.setVisibility(0);
        }
    }

    @NotNull
    public final View getAnchorView() {
        return this.f37044d;
    }

    public final float getTrianglePivotX() {
        if (PatchProxy.isSupport(new Object[0], this, f37041a, false, 28506, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f37041a, false, 28506, new Class[0], Float.TYPE)).floatValue();
        }
        int width = this.f37043c.getWidth();
        ViewGroup.LayoutParams layoutParams = this.f37042b.getLayoutParams();
        if (layoutParams != null) {
            return ((float) ((width - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) - (this.f37042b.getWidth() / 2))) / ((float) this.f37043c.getWidth());
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setAnchorView(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f37041a, false, 28509, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f37041a, false, 28509, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        this.f37044d = view2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull View view) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        this.f37044d = view;
        this.f37042b = new View(context);
        this.f37043c = new TextView(context);
        setGravity(5);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        this.f37042b.setLayoutParams(new LinearLayout.LayoutParams((int) UIUtils.dip2Px(this.f37044d.getContext(), 12.5f), (int) UIUtils.dip2Px(this.f37044d.getContext(), 6.1f)));
        this.f37042b.setBackgroundResource(2130840393);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (int) UIUtils.dip2Px(context, -0.5f);
        this.f37043c.setLayoutParams(layoutParams);
        this.f37043c.setTextColor(-1);
        this.f37043c.setTextSize(1, 13.0f);
        this.f37043c.setBackgroundResource(2130840354);
        addView(this.f37042b);
        addView(this.f37043c);
        setVisibility(4);
    }
}
