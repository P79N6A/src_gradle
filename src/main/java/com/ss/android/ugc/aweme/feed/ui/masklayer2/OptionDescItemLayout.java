package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescItemLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDescView", "Landroid/widget/TextView;", "mIconView", "Landroid/widget/ImageView;", "update", "", "vo", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescVO;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OptionDescItemLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46745a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f46746b = ((TextView) findViewById(C0906R.id.a3m));

    /* renamed from: c  reason: collision with root package name */
    private ImageView f46747c = ((ImageView) findViewById(C0906R.id.aq8));

    public OptionDescItemLayout(@Nullable Context context) {
        super(context);
        View.inflate(getContext(), C0906R.layout.wf, this);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 16.0f);
        setPadding(0, dip2Px, 0, dip2Px);
        setGravity(16);
    }

    public final void a(@NotNull p pVar) {
        if (PatchProxy.isSupport(new Object[]{pVar}, this, f46745a, false, 43470, new Class[]{p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar}, this, f46745a, false, 43470, new Class[]{p.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(pVar, "vo");
        ImageView imageView = this.f46747c;
        if (imageView != null) {
            imageView.setImageResource(pVar.f46790b);
        }
        TextView textView = this.f46746b;
        if (textView != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textView.setText(context.getResources().getText(pVar.f46791c));
        }
    }

    public OptionDescItemLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C0906R.layout.wf, this);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 16.0f);
        setPadding(0, dip2Px, 0, dip2Px);
        setGravity(16);
    }

    public OptionDescItemLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), C0906R.layout.wf, this);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 16.0f);
        setPadding(0, dip2Px, 0, dip2Px);
        setGravity(16);
    }
}
