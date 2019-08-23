package com.ss.android.ugc.aweme.challenge.ui;

import android.text.DynamicLayout;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35588a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f35589b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35590c;

    /* renamed from: d  reason: collision with root package name */
    private final DynamicLayout f35591d;

    /* renamed from: e  reason: collision with root package name */
    private final SpannableString f35592e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f35593f;
    private final TextView g;
    private final ViewGroup h;
    private final boolean i;
    private final SpannableString j;

    c(TextView textView, int i2, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f35589b = textView;
        this.f35590c = i2;
        this.f35591d = dynamicLayout;
        this.f35592e = spannableString;
        this.f35593f = imageView;
        this.g = textView2;
        this.h = viewGroup;
        this.i = z;
        this.j = spannableString2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f35588a, false, 26002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35588a, false, 26002, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.f35589b;
        int i2 = this.f35590c;
        DynamicLayout dynamicLayout = this.f35591d;
        SpannableString spannableString = this.f35592e;
        ImageView imageView = this.f35593f;
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
        textView2.setOnClickListener(new d(imageView));
        e eVar = new e(imageView, viewGroup, textView, lineCount, height, z, spannableString2, spannableString, textView2);
        imageView.setOnClickListener(eVar);
    }
}
