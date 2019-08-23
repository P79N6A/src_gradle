package com.bytedance.android.livesdk.feed.tab.c;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14436a;

    /* renamed from: b  reason: collision with root package name */
    public CheckedTextView f14437b = ((CheckedTextView) findViewById(C0906R.id.d7m));

    /* renamed from: c  reason: collision with root package name */
    ImageView f14438c = ((ImageView) findViewById(C0906R.id.d7l));

    public a(Context context) {
        super(context);
        inflate(context, C0906R.layout.akb, this);
    }

    public void setText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f14436a, false, 8949, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f14436a, false, 8949, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f14437b.setText(str2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2 = colorStateList;
        if (PatchProxy.isSupport(new Object[]{colorStateList2}, this, f14436a, false, 8947, new Class[]{ColorStateList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorStateList2}, this, f14436a, false, 8947, new Class[]{ColorStateList.class}, Void.TYPE);
            return;
        }
        this.f14437b.setTextColor(colorStateList2);
    }

    public void setChecked(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14436a, false, 8946, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14436a, false, 8946, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14437b.setChecked(z);
        if (z) {
            this.f14437b.setTypeface(Typeface.DEFAULT_BOLD);
            this.f14438c.setVisibility(0);
            return;
        }
        this.f14437b.setTypeface(Typeface.DEFAULT);
        this.f14438c.setVisibility(8);
    }
}
