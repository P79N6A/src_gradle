package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/VideoBottomButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ivBg", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "textView", "Landroid/widget/TextView;", "init", "", "setBackgroundColor", "color", "", "setBackgroundColors", "colors", "", "setButtonBackground", "urlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setText", "text", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VideoBottomButton extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46327a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f46328b;

    /* renamed from: c  reason: collision with root package name */
    private RemoteImageView f46329c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoBottomButton(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f46327a, false, 43130, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f46327a, false, 43130, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setBackgroundColors(new int[]{i, i});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setBackgroundColors(@org.jetbrains.annotations.NotNull int[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f46327a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 43129(0xa879, float:6.0437E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f46327a
            r13 = 0
            r14 = 43129(0xa879, float:6.0437E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r1 = "colors"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            android.content.Context r2 = r17.getContext()
            r3 = 1082130432(0x40800000, float:4.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            r1.setCornerRadius(r2)
            r1.setColors(r0)
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r1.setOrientation(r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = r17
            r0.setBackground(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.VideoBottomButton.setBackgroundColors(int[]):void");
    }

    public final void setButtonBackground(@Nullable UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, f46327a, false, 43131, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, f46327a, false, 43131, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        RemoteImageView remoteImageView = this.f46329c;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivBg");
        }
        c.b(remoteImageView, urlModel2);
    }

    public final void setText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f46327a, false, 43128, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f46327a, false, 43128, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        TextView textView = this.f46328b;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textView");
        }
        textView.setText(charSequence2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoBottomButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[0], this, f46327a, false, 43127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46327a, false, 43127, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.asc, this, true);
        View findViewById = findViewById(C0906R.id.dkk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.tv_title)");
        this.f46328b = (TextView) findViewById;
        View findViewById2 = findViewById(C0906R.id.azg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.iv_button_bg)");
        this.f46329c = (RemoteImageView) findViewById2;
    }
}
