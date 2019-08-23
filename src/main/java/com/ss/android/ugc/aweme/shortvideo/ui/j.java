package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.ui.publish.PoiContext;

public class j extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70900a;

    /* renamed from: b  reason: collision with root package name */
    TextView f70901b;

    /* renamed from: c  reason: collision with root package name */
    TextView f70902c;

    /* renamed from: d  reason: collision with root package name */
    public PoiContext f70903d;

    public j(@NonNull Context context) {
        this(context, null);
    }

    public void setPoiActivity(PoiContext poiContext) {
        if (PatchProxy.isSupport(new Object[]{poiContext}, this, f70900a, false, 80230, new Class[]{PoiContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiContext}, this, f70900a, false, 80230, new Class[]{PoiContext.class}, Void.TYPE);
            return;
        }
        this.f70903d = poiContext;
        this.f70901b.setText(poiContext.mShootPoiName);
        this.f70902c.setText(this.f70903d.mPoiActivity.getTitle());
    }

    public void setSingleLine(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70900a, false, 80229, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70900a, false, 80229, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            ((LinearLayout.LayoutParams) this.f70901b.getLayoutParams()).weight = 1.0f;
            this.f70901b.setSingleLine(true);
            this.f70901b.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private j(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private void a(TextView textView, boolean z) {
        int i;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f70900a, false, 80228, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, Byte.valueOf(z)}, this, f70900a, false, 80228, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            i = ContextCompat.getColor(getContext(), C0906R.color.a08);
        } else {
            i = ContextCompat.getColor(getContext(), C0906R.color.a0b);
        }
        textView2.setTextColor(i);
    }

    private j(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.z7, this);
        this.f70901b = (TextView) findViewById(C0906R.id.c6e);
        this.f70902c = (TextView) findViewById(C0906R.id.c6f);
        a(this.f70901b, true);
        a(this.f70902c, false);
    }
}
