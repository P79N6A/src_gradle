package com.ss.android.ugc.aweme.plugin.ui;

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

public final class c extends ProgressDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59387a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59388b = true;

    /* renamed from: c  reason: collision with root package name */
    CharSequence f59389c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f59390d;

    /* renamed from: e  reason: collision with root package name */
    int f59391e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f59392f;

    public c(Context context) {
        super(context, 3);
    }

    public final void setIndeterminate(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59387a, false, 64716, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59387a, false, 64716, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setIndeterminate(z);
        if (this.f59392f) {
            PluginCircularProgressView pluginCircularProgressView = (PluginCircularProgressView) findViewById(C0906R.id.b2w);
            if (pluginCircularProgressView != null) {
                pluginCircularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(C0906R.id.c7k);
            if (z) {
                i = 4;
            }
            textView.setVisibility(i);
        }
    }

    public final void setMessage(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f59387a, false, 64717, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f59387a, false, 64717, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        super.setMessage(charSequence);
        if (this.f59392f) {
            TextView textView = (TextView) findViewById(C0906R.id.bmn);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f59389c = charSequence;
    }

    public final void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59387a, false, 64715, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59387a, false, 64715, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setProgress(i);
        if (this.f59392f) {
            TextView textView = (TextView) findViewById(C0906R.id.c7k);
            if (textView != null) {
                textView.setText(i + "%");
            }
            PluginCircularProgressView pluginCircularProgressView = (PluginCircularProgressView) findViewById(C0906R.id.b2w);
            if (pluginCircularProgressView != null) {
                pluginCircularProgressView.setProgress((float) i);
            }
        }
        this.f59391e = i;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f59387a, false, 64714, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f59387a, false, 64714, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a78);
        this.f59392f = true;
        setMessage(this.f59389c);
        setIndeterminate(false);
        setProgress(this.f59391e);
        if (this.f59390d != null) {
            Drawable drawable = this.f59390d;
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f59387a, false, 64720, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f59387a, false, 64720, new Class[]{Drawable.class}, Void.TYPE);
                return;
            }
            if (this.f59392f) {
                View findViewById = findViewById(C0906R.id.chu);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(getContext(), 2130838099)}));
                }
            }
            this.f59390d = drawable;
        }
    }
}
