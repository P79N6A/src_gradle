package com.ss.android.ugc.aweme.account.shortvideo.a;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.widget.CircularProgressView;

public class b extends ProgressDialog {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f32761b;

    /* renamed from: a  reason: collision with root package name */
    private boolean f32762a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f32763c = true;

    /* renamed from: d  reason: collision with root package name */
    CharSequence f32764d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f32765e;

    /* renamed from: f  reason: collision with root package name */
    private String f32766f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32761b, false, 20927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32761b, false, 20927, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.c7k);
        if (findViewById != null) {
            if (this.f32763c) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
    }

    public b(Context context) {
        super(context, 3);
    }

    public void setIndeterminate(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32761b, false, 20922, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32761b, false, 20922, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setIndeterminate(z);
        if (this.f32762a) {
            CircularProgressView circularProgressView = (CircularProgressView) findViewById(C0906R.id.b2w);
            if (circularProgressView != null) {
                circularProgressView.setIndeterminate(z);
            }
            TextView textView = (TextView) findViewById(C0906R.id.c7k);
            if (z) {
                i = 4;
            }
            textView.setVisibility(i);
        }
    }

    public void setMessage(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f32761b, false, 20923, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f32761b, false, 20923, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        super.setMessage(charSequence);
        if (this.f32762a) {
            TextView textView = (TextView) findViewById(C0906R.id.bmn);
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
        this.f32764d = charSequence;
    }

    public void setProgress(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f32761b, false, 20920, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f32761b, false, 20920, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setProgress(i);
        TextView textView = (TextView) findViewById(C0906R.id.c7k);
        if (textView != null) {
            textView.setText(i + "%");
        }
        CircularProgressView circularProgressView = (CircularProgressView) findViewById(C0906R.id.b2w);
        if (circularProgressView != null) {
            circularProgressView.setProgress((float) i);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32761b, false, 20919, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32761b, false, 20919, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.a2w);
        this.f32762a = true;
        setMessage(this.f32764d);
        setIndeterminate(false);
        String str = this.f32766f;
        if (PatchProxy.isSupport(new Object[]{str}, this, f32761b, false, 20926, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f32761b, false, 20926, new Class[]{String.class}, Void.TYPE);
        } else {
            if (this.f32762a) {
                TextView textView = (TextView) findViewById(C0906R.id.d36);
                if (textView != null && !StringUtils.isEmpty(str)) {
                    textView.setText(str);
                    UIUtils.setViewVisibility(textView, 0);
                }
            }
            this.f32766f = str;
        }
        if (this.f32765e != null) {
            Drawable drawable = this.f32765e;
            if (PatchProxy.isSupport(new Object[]{drawable}, this, f32761b, false, 20928, new Class[]{Drawable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{drawable}, this, f32761b, false, 20928, new Class[]{Drawable.class}, Void.TYPE);
                return;
            }
            if (this.f32762a) {
                View findViewById = findViewById(C0906R.id.chu);
                if (findViewById != null) {
                    findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, ContextCompat.getDrawable(getContext(), 2130837823)}));
                }
            }
            this.f32765e = drawable;
        }
    }
}
