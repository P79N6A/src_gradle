package com.ss.android.ugc.aweme.qrcode.f;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class a extends ProgressDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63465a;

    /* renamed from: b  reason: collision with root package name */
    CharSequence f63466b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f63467c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f63468d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f63469e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63465a, false, 70624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63465a, false, 70624, new Class[0], Void.TYPE);
            return;
        }
        if (this.f63469e != null) {
            this.f63469e.clearAnimation();
            ((AnimationDrawable) this.f63469e.getDrawable()).start();
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f63465a, false, 70625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63465a, false, 70625, new Class[0], Void.TYPE);
            return;
        }
        if (this.f63469e != null) {
            this.f63469e.clearAnimation();
        }
        super.dismiss();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f63465a, false, 70628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63465a, false, 70628, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        if (isShowing()) {
            dismiss();
        }
    }

    private a(Context context) {
        super(context, 3);
    }

    public void setMessage(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f63465a, false, 70623, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f63465a, false, 70623, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        super.setMessage(charSequence);
        if (this.f63468d) {
            TextView textView = (TextView) findViewById(C0906R.id.bmn);
            if (textView != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(charSequence);
                }
            }
        }
        this.f63466b = charSequence;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63465a, false, 70622, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63465a, false, 70622, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a5o);
        this.f63468d = true;
        this.f63469e = (ImageView) findViewById(C0906R.id.f_);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.0f;
        getWindow().setAttributes(attributes);
        setMessage(this.f63466b);
        setIndeterminate(false);
        if (this.f63467c != null) {
            Drawable drawable = this.f63467c;
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f63465a, false, 70627, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f63465a, false, 70627, new Class[]{Drawable.class}, Void.TYPE);
                return;
            }
            if (this.f63468d) {
                View findViewById = findViewById(C0906R.id.chu);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(getContext(), 2130840612)}));
                }
            }
            this.f63467c = drawable;
        }
    }

    public static a a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f63465a, true, 70626, new Class[]{Context.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f63465a, true, 70626, new Class[]{Context.class, String.class}, a.class);
        }
        a aVar = new a(context2);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
            aVar.show();
        }
        aVar.setMessage(str2);
        aVar.a();
        return aVar;
    }
}
