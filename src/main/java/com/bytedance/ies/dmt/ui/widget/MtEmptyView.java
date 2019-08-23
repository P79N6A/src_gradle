package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.e;
import com.ss.android.ugc.aweme.C0906R;

public class MtEmptyView extends LinearLayout implements e, e {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f20479a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f20480b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f20481c;

    /* renamed from: d  reason: collision with root package name */
    private DmtTextView f20482d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f20483e;

    /* renamed from: f  reason: collision with root package name */
    private int f20484f = b.a().f20312a;
    private c g;

    private void a() {
        int i;
        int i2;
        int i3;
        if (this.f20479a != null && this.g != null) {
            Resources resources = getResources();
            if (this.f20482d != null) {
                if (this.g.n) {
                    DmtTextView dmtTextView = this.f20482d;
                    if (this.f20484f == 0) {
                        i3 = resources.getColor(C0906R.color.anc);
                    } else {
                        i3 = resources.getColor(C0906R.color.anb);
                    }
                    dmtTextView.setTextColor(i3);
                } else {
                    DmtTextView dmtTextView2 = this.f20482d;
                    if (this.f20484f == 0) {
                        i2 = C0906R.color.an9;
                    } else {
                        i2 = C0906R.color.an8;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            if (this.f20483e != null) {
                DmtTextView dmtTextView3 = this.f20483e;
                if (this.f20484f == 0) {
                    i = resources.getColor(C0906R.color.anc);
                } else {
                    i = resources.getColor(C0906R.color.anb);
                }
                dmtTextView3.setTextColor(i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f20479a = (LinearLayout) findViewById(C0906R.id.b9k);
        this.f20480b = (FrameLayout) findViewById(C0906R.id.b95);
        this.f20481c = (ImageView) findViewById(C0906R.id.b0y);
        this.f20482d = (DmtTextView) findViewById(C0906R.id.dkk);
        this.f20483e = (DmtTextView) findViewById(C0906R.id.dau);
        if (ViewCompat.getLayoutDirection(this) == 1 && Build.VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f20479a.setLayoutDirection(1);
        }
    }

    public MtEmptyView(@NonNull Context context) {
        super(context);
    }

    public static MtEmptyView a(Context context) {
        return (MtEmptyView) LayoutInflater.from(context).inflate(C0906R.layout.a6h, null);
    }

    public void onColorModeChange(int i) {
        if (this.f20484f != i) {
            this.f20484f = i;
            a();
        }
    }

    public void setStatus(c cVar) {
        if (cVar != null) {
            this.g = cVar;
            if (this.g.j) {
                this.f20480b.setVisibility(0);
                this.f20481c.setImageDrawable(this.g.f20487a);
            } else {
                this.f20480b.setVisibility(8);
            }
            if (this.g.k) {
                this.f20482d.setText(this.g.f20488b);
            }
            if (this.g.n) {
                TextViewCompat.setTextAppearance(this.f20482d, C0906R.style.r5);
            }
            if (this.g.l) {
                this.f20483e.setText(this.g.f20489c);
                if (this.g.m) {
                    this.f20483e.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            a();
        }
    }

    public MtEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MtEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
