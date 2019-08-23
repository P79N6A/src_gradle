package com.ss.android.ugc.aweme.common.widget;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;

public class a extends ProgressDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40515a;

    /* renamed from: b  reason: collision with root package name */
    CharSequence f40516b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f40517c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40518d;

    /* renamed from: e  reason: collision with root package name */
    private AnimationImageView f40519e;

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f40515a, false, 33570, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40515a, false, 33570, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40519e.isAnimating()) {
            this.f40519e.cancelAnimation();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    private a(Context context) {
        super(context, 3);
    }

    public void setMessage(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f40515a, false, 33568, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f40515a, false, 33568, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        super.setMessage(charSequence);
        if (this.f40518d) {
            TextView textView = (TextView) findViewById(C0906R.id.bmn);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f40516b = charSequence;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f40515a, false, 33567, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f40515a, false, 33567, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a2u);
        this.f40518d = true;
        this.f40519e = (AnimationImageView) findViewById(C0906R.id.f_);
        setMessage(this.f40516b);
        setIndeterminate(false);
        if (this.f40517c != null) {
            Drawable drawable = this.f40517c;
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f40515a, false, 33572, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f40515a, false, 33572, new Class[]{Drawable.class}, Void.TYPE);
                return;
            }
            if (this.f40518d) {
                View findViewById = findViewById(C0906R.id.chu);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(getContext(), 2130837823)}));
                }
            }
            this.f40517c = drawable;
        }
    }

    public static a a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f40515a, true, 33571, new Class[]{Context.class, String.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f40515a, true, 33571, new Class[]{Context.class, String.class, String.class}, a.class);
        }
        a aVar = new a(context2);
        aVar.setCancelable(false);
        aVar.setIndeterminate(false);
        aVar.setMax(100);
        if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
            aVar.show();
        }
        aVar.setMessage(str3);
        if (PatchProxy.isSupport(new Object[]{str4}, aVar, f40515a, false, 33569, new Class[]{String.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{str4}, aVar2, f40515a, false, 33569, new Class[]{String.class}, Void.TYPE);
        } else {
            aVar.f40519e.setAnimation(str4);
            aVar.f40519e.playAnimation();
            aVar.f40519e.loop(true);
        }
        return aVar;
    }
}
