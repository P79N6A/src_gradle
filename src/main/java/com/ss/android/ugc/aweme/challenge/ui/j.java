package com.ss.android.ugc.aweme.challenge.ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.b.a;
import com.ss.android.ugc.aweme.challenge.b.b;
import kotlin.jvm.internal.Intrinsics;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35687a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f35688b;

    /* renamed from: c  reason: collision with root package name */
    private final SpannableString f35689c;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f35690d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f35691e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f35692f;
    private final boolean g;
    private final SpannableString h;

    j(TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, boolean z, SpannableString spannableString2) {
        this.f35688b = textView;
        this.f35689c = spannableString;
        this.f35690d = imageView;
        this.f35691e = textView2;
        this.f35692f = viewGroup;
        this.g = z;
        this.h = spannableString2;
    }

    public final void run() {
        b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f35687a, false, 26168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35687a, false, 26168, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.f35688b;
        SpannableString spannableString = this.f35689c;
        ImageView imageView = this.f35690d;
        TextView textView2 = this.f35691e;
        ViewGroup viewGroup = this.f35692f;
        boolean z = this.g;
        SpannableString spannableString2 = this.h;
        int height = textView.getHeight();
        a aVar = a.f35354b;
        if (PatchProxy.isSupport(new Object[]{textView, spannableString}, aVar, a.f35353a, false, 25829, new Class[]{TextView.class, CharSequence.class}, b.class)) {
            Object[] objArr = {textView, spannableString};
            a aVar2 = aVar;
            bVar = (b) PatchProxy.accessDispatch(objArr, aVar2, a.f35353a, false, 25829, new Class[]{TextView.class, CharSequence.class}, b.class);
        } else {
            Intrinsics.checkParameterIsNotNull(textView, "protoView");
            Intrinsics.checkParameterIsNotNull(spannableString, "text");
            if (textView.getWidth() <= 0) {
                bVar = new b(null, null, null, 7);
            } else {
                DmtTextView dmtTextView = new DmtTextView(textView.getContext());
                dmtTextView.setTextSize(0, textView.getTextSize());
                dmtTextView.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
                dmtTextView.setTypeface(textView.getTypeface());
                dmtTextView.setIncludeFontPadding(textView.getIncludeFontPadding());
                dmtTextView.setText(spannableString);
                dmtTextView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                bVar = new b(Integer.valueOf(dmtTextView.getMeasuredWidth()), Integer.valueOf(dmtTextView.getMeasuredHeight()), Integer.valueOf(dmtTextView.getLineCount()));
            }
        }
        int intValue = bVar.f35357c.intValue();
        if (height == intValue) {
            textView.setText(spannableString);
            return;
        }
        imageView.setSelected(true);
        textView2.setOnClickListener(new l(imageView));
        m mVar = new m(imageView, viewGroup, textView, intValue, height, z, spannableString2, spannableString, textView2);
        imageView.setOnClickListener(mVar);
    }
}
