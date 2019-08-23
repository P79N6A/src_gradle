package com.bytedance.ies.dmt.ui.common.rebranding;

import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;

public class SampleNiceWidthTextView extends NiceWidthTextView implements b {

    /* renamed from: b  reason: collision with root package name */
    private int f20318b;

    /* renamed from: c  reason: collision with root package name */
    private int f20319c;

    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        a(this);
    }

    public final int a(TextView textView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C0906R.string.ak));
        arrayList.add(Integer.valueOf(C0906R.string.bne));
        arrayList.add(Integer.valueOf(C0906R.string.bgf));
        return c.a(textView, arrayList, (int) UIUtils.dip2Px(getContext(), (float) this.f20318b), (int) UIUtils.dip2Px(getContext(), (float) this.f20319c));
    }
}
