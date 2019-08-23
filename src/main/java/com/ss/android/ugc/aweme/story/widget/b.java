package com.ss.android.ugc.aweme.story.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class b extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74477a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f74478b = "b";

    /* renamed from: c  reason: collision with root package name */
    TextView f74479c;

    /* renamed from: d  reason: collision with root package name */
    TextView f74480d;

    /* renamed from: e  reason: collision with root package name */
    public float f74481e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f74482f;
    private a g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74487a;

        /* renamed from: b  reason: collision with root package name */
        CharSequence f74488b;

        /* renamed from: c  reason: collision with root package name */
        CharSequence f74489c;

        /* renamed from: d  reason: collision with root package name */
        boolean f74490d;

        public final void run() {
            float f2;
            TextView textView;
            TextView textView2;
            float f3;
            if (PatchProxy.isSupport(new Object[0], this, f74487a, false, 86645, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74487a, false, 86645, new Class[0], Void.TYPE);
            } else if (b.this.f74479c != null && b.this.f74480d != null) {
                b.this.animate().cancel();
                b.this.f74479c.animate().cancel();
                b.this.f74480d.animate().cancel();
                b.this.removeCallbacks(b.this.f74482f);
                b.this.setAlpha(1.0f);
                b.this.setVisibility(0);
                if (this.f74490d) {
                    f2 = b.this.f74481e;
                } else {
                    f2 = 0.0f;
                }
                if (this.f74490d) {
                    textView = b.this.f74479c;
                } else {
                    textView = b.this.f74480d;
                }
                if (this.f74490d) {
                    textView2 = b.this.f74480d;
                } else {
                    textView2 = b.this.f74479c;
                }
                if (this.f74490d) {
                    f3 = 0.0f;
                } else {
                    f3 = b.this.f74481e;
                }
                textView.setTranslationX(f3);
                textView2.setTranslationX(f3);
                textView.setAlpha(1.0f);
                textView2.setAlpha(0.0f);
                textView.setText(this.f74488b);
                textView2.setText(this.f74489c);
                textView.animate().translationX(f2).alpha(0.0f).withEndAction(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f74492a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f74492a, false, 86646, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f74492a, false, 86646, new Class[0], Void.TYPE);
                            return;
                        }
                        b.this.postDelayed(b.this.f74482f, 600);
                    }
                }).setDuration(300).start();
                textView2.animate().translationX(f2).alpha(1.0f).setDuration(300).start();
            }
        }

        public a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.f74488b = charSequence;
            this.f74489c = charSequence2;
            this.f74490d = z;
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f74477a, false, 86639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74477a, false, 86639, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
    }

    public b(Context context) {
        this(context, null);
    }

    public void setVisibility(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74477a, false, 86641, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74477a, false, 86641, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setVisibility(i);
    }

    private b(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f74482f = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74483a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f74483a, false, 86643, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74483a, false, 86643, new Class[0], Void.TYPE);
                    return;
                }
                b.this.animate().alpha(0.0f).withEndAction(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f74485a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f74485a, false, 86644, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f74485a, false, 86644, new Class[0], Void.TYPE);
                            return;
                        }
                        b.this.setVisibility(8);
                    }
                }).setDuration(300).start();
            }
        };
        if (PatchProxy.isSupport(new Object[]{context}, this, f74477a, false, 86638, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74477a, false, 86638, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        inflate(getContext(), C0906R.layout.a8z, this);
        this.f74479c = (TextView) findViewById(C0906R.id.aem);
        this.f74480d = (TextView) findViewById(C0906R.id.cmd);
        this.f74479c.setAlpha(1.0f);
        this.f74480d.setAlpha(1.0f);
        this.f74480d.setVisibility(0);
        this.f74479c.setVisibility(0);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        CharSequence charSequence3 = charSequence;
        CharSequence charSequence4 = charSequence2;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{charSequence3, charSequence4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74477a, false, 86642, new Class[]{CharSequence.class, CharSequence.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence3, charSequence4, Byte.valueOf(z)}, this, f74477a, false, 86642, new Class[]{CharSequence.class, CharSequence.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a aVar = new a(charSequence, charSequence4, z);
        if (this.f74481e == 0.0f) {
            z2 = false;
        }
        if (z2) {
            aVar.run();
        } else {
            this.g = aVar;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f74477a, false, 86640, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f74477a, false, 86640, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!(this.f74479c == null || this.f74480d == null)) {
            this.f74481e = this.f74479c.getX() - this.f74480d.getX();
        }
        if (this.g != null) {
            this.g.run();
            this.g = null;
        }
    }
}
