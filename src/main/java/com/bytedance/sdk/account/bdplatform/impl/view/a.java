package com.bytedance.sdk.account.bdplatform.impl.view;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    static Drawable f22318a;

    /* renamed from: b  reason: collision with root package name */
    private Context f22319b;

    /* renamed from: c  reason: collision with root package name */
    private ProgressBar f22320c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f22321d;

    public final void a(String str) {
        this.f22321d.setText(str);
    }

    public a(@NonNull Context context) {
        super(context, C0906R.style.uy);
        this.f22319b = context;
        View inflate = LayoutInflater.from(this.f22319b).inflate(C0906R.layout.go, null);
        this.f22320c = (ProgressBar) inflate.findViewById(C0906R.id.c7p);
        this.f22321d = (TextView) inflate.findViewById(C0906R.id.bj6);
        Drawable drawable = f22318a;
        if (drawable != null) {
            this.f22320c.setIndeterminateDrawable(drawable);
        }
        setContentView(inflate);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(17);
        attributes.width = a(this.f22319b, 144.0f);
        attributes.height = a(this.f22319b, 96.0f);
        window.setAttributes(attributes);
    }

    private static int a(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
