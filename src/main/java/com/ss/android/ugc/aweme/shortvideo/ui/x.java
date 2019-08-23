package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class x extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70932a;

    /* renamed from: b  reason: collision with root package name */
    TextView f70933b;

    public x(Context context) {
        this(context, null);
    }

    public void setTitle(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f70932a, false, 80323, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f70932a, false, 80323, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f70933b.setText(str2);
    }

    public void setTitle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70932a, false, 80322, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70932a, false, 80322, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70933b.setText(i);
    }

    private x(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private x(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.z8, this);
        this.f70933b = (TextView) findViewById(C0906R.id.c6e);
    }
}
