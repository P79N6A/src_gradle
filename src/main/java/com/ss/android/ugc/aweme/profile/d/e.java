package com.ss.android.ugc.aweme.profile.d;

import android.text.DynamicLayout;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61392a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f61393b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61394c;

    /* renamed from: d  reason: collision with root package name */
    private final DynamicLayout f61395d;

    /* renamed from: e  reason: collision with root package name */
    private final SpannableString f61396e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f61397f;
    private final TextView g;
    private final ViewGroup h;
    private final boolean i;
    private final SpannableString j;

    public e(TextView textView, int i2, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f61393b = textView;
        this.f61394c = i2;
        this.f61395d = dynamicLayout;
        this.f61396e = spannableString;
        this.f61397f = imageView;
        this.g = textView2;
        this.h = viewGroup;
        this.i = z;
        this.j = spannableString2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f61392a, false, 69896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61392a, false, 69896, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.f61393b;
        int i2 = this.f61394c;
        DynamicLayout dynamicLayout = this.f61395d;
        SpannableString spannableString = this.f61396e;
        ImageView imageView = this.f61397f;
        TextView textView2 = this.g;
        ViewGroup viewGroup = this.h;
        boolean z = this.i;
        SpannableString spannableString2 = this.j;
        int height = textView.getHeight();
        int lineCount = (int) (((float) i2) + (((float) dynamicLayout.getLineCount()) * UIUtils.dip2Px(textView.getContext(), 2.0f)));
        if (height == lineCount) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new f(imageView));
        g gVar = new g(imageView, viewGroup, textView, lineCount, height, z, spannableString2);
        imageView.setOnClickListener(gVar);
    }
}
