package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class g extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33041a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f33042b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f33043c;

    /* renamed from: d  reason: collision with root package name */
    private int f33044d;

    /* renamed from: e  reason: collision with root package name */
    private String f33045e;

    public g(Context context) {
        this(context, null);
    }

    private g(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        this.f33044d = 2130838750;
        this.f33045e = "TikTok";
        if (PatchProxy.isSupport(new Object[]{context}, this, f33041a, false, 21037, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f33041a, false, 21037, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = View.inflate(context, C0906R.layout.a9o, this);
        this.f33042b = (ImageView) inflate.findViewById(C0906R.id.dm6);
        this.f33043c = (TextView) inflate.findViewById(C0906R.id.dm7);
    }

    public final g a(@DrawableRes int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f33041a, false, 21036, new Class[]{Integer.TYPE, String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f33041a, false, 21036, new Class[]{Integer.TYPE, String.class}, g.class);
        }
        this.f33044d = i;
        this.f33045e = str;
        this.f33042b.setImageResource(this.f33044d);
        this.f33043c.setText(this.f33045e);
        return this;
    }
}
