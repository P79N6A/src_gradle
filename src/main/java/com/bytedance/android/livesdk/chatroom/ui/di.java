package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class di extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12077a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f12078b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f12079c;

    public di(@NonNull Context context) {
        this(context, null);
    }

    public final di a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f12077a, false, 6205, new Class[]{String.class}, di.class)) {
            return (di) PatchProxy.accessDispatch(new Object[]{str}, this, f12077a, false, 6205, new Class[]{String.class}, di.class);
        }
        if (this.f12079c != null) {
            this.f12079c.setText(str);
        }
        return this;
    }

    public final di a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f12077a, false, 6204, new Class[]{Integer.TYPE}, di.class)) {
            return (di) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f12077a, false, 6204, new Class[]{Integer.TYPE}, di.class);
        }
        if (this.f12078b != null) {
            this.f12078b.setImageResource(i);
        }
        return this;
    }

    private di(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private di(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[0], this, f12077a, false, 6202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12077a, false, 6202, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.ala, this, true);
        this.f12078b = (ImageView) findViewById(C0906R.id.bj7);
        this.f12079c = (TextView) findViewById(C0906R.id.bj8);
    }
}
