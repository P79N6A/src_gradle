package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class n extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f65726b;

    /* renamed from: c  reason: collision with root package name */
    protected EditText f65727c;

    /* renamed from: d  reason: collision with root package name */
    protected View f65728d;

    /* renamed from: e  reason: collision with root package name */
    protected View f65729e;

    /* renamed from: f  reason: collision with root package name */
    protected View f65730f;
    protected InputMethodManager g;
    protected a h;
    protected String i;
    protected int j;
    protected String k;

    public interface a {
        void a(String str);

        void b(String str);
    }

    public void a(int i2) {
    }

    /* access modifiers changed from: package-private */
    public int getLayout() {
        return C0906R.layout.a7w;
    }

    public TextWatcher getTextWatcher() {
        return null;
    }

    public void setHintText(String str) {
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65726b, false, 75164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65726b, false, 75164, new Class[0], Void.TYPE);
            return;
        }
        d();
    }

    /* renamed from: b */
    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f65726b, false, 75168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65726b, false, 75168, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f65727c == null || this.g == null)) {
            this.g.hideSoftInputFromWindow(this.f65727c.getWindowToken(), 0);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f65726b, false, 75169, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65726b, false, 75169, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f65727c == null || this.g == null)) {
            this.f65727c.requestFocus();
            this.g.toggleSoftInput(0, 2);
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f65726b, false, 75171, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65726b, false, 75171, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(8);
    }

    public String getText() {
        if (PatchProxy.isSupport(new Object[0], this, f65726b, false, 75167, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f65726b, false, 75167, new Class[0], String.class);
        } else if (this.f65727c == null || this.f65727c.getEditableText() == null) {
            return null;
        } else {
            return this.f65727c.getEditableText().toString();
        }
    }

    public void setEffectTextChangeListener(a aVar) {
        this.h = aVar;
    }

    public void setMaxTextCount(int i2) {
        this.j = i2;
    }

    public n(Context context) {
        this(context, null);
    }

    public void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f65726b, false, 75165, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f65726b, false, 75165, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setVisibility(8);
        this.f65729e = LayoutInflater.from(context).inflate(getLayout(), this);
        this.f65727c = (EditText) findViewById(C0906R.id.a93);
        TextWatcher textWatcher = getTextWatcher();
        if (textWatcher != null) {
            this.f65727c.addTextChangedListener(textWatcher);
        }
        this.f65728d = findViewById(C0906R.id.cxa);
        this.f65728d.setOnClickListener(new o(this));
        this.f65730f = findViewById(C0906R.id.d3v);
        setOnClickListener(new p(this));
    }

    public void setText(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f65726b, false, 75166, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f65726b, false, 75166, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!(this.f65727c == null || str == null)) {
            this.f65727c.setText(str);
            this.f65727c.setSelection(str.length());
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
        this.g = (InputMethodManager) context.getSystemService("input_method");
        this.i = context.getResources().getString(C0906R.string.bwo);
    }
}
