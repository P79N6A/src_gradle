package com.ss.android.ugc.aweme.shortvideo.festival;

import android.text.DynamicLayout;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67681a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f67682b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67683c;

    /* renamed from: d  reason: collision with root package name */
    private final DynamicLayout f67684d;

    /* renamed from: e  reason: collision with root package name */
    private final SpannableString f67685e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f67686f;
    private final TextView g;
    private final ViewGroup h;
    private final SpannableString i;

    b(TextView textView, int i2, DynamicLayout dynamicLayout, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
        this.f67682b = textView;
        this.f67683c = i2;
        this.f67684d = dynamicLayout;
        this.f67685e = spannableString;
        this.f67686f = imageView;
        this.g = textView2;
        this.h = viewGroup;
        this.i = spannableString2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67681a, false, 77210, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67681a, false, 77210, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.f67682b;
        int i2 = this.f67683c;
        DynamicLayout dynamicLayout = this.f67684d;
        SpannableString spannableString = this.f67685e;
        ImageView imageView = this.f67686f;
        TextView textView2 = this.g;
        ViewGroup viewGroup = this.h;
        SpannableString spannableString2 = this.i;
        int height = textView.getHeight();
        int lineCount = (int) (((float) i2) + (((float) dynamicLayout.getLineCount()) * UIUtils.dip2Px(textView.getContext(), 2.0f)));
        if (height == lineCount) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new c(imageView));
        d dVar = new d(imageView, viewGroup, textView, lineCount, height, spannableString2, spannableString, textView2);
        imageView.setOnClickListener(dVar);
    }
}
