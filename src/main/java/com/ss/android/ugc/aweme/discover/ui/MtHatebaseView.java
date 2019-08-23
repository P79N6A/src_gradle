package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TextViewCompat;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.e;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MtHatebaseView extends LinearLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42931a;

    /* renamed from: b  reason: collision with root package name */
    private LinearLayout f42932b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f42933c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f42934d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f42935e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f42936f;
    private int g = b.a().f20312a;
    private ag h;

    private void a() {
        int i;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f42931a, false, 37704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42931a, false, 37704, new Class[0], Void.TYPE);
        } else if (this.f42932b != null && this.h != null) {
            Resources resources = getResources();
            if (this.f42935e != null) {
                if (this.h.g) {
                    DmtTextView dmtTextView = this.f42935e;
                    if (this.g == 0) {
                        i3 = resources.getColor(C0906R.color.anc);
                    } else {
                        i3 = resources.getColor(C0906R.color.anb);
                    }
                    dmtTextView.setTextColor(i3);
                } else {
                    DmtTextView dmtTextView2 = this.f42935e;
                    if (this.g == 0) {
                        i2 = C0906R.color.an9;
                    } else {
                        i2 = C0906R.color.an8;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            if (this.f42936f != null) {
                TextView textView = this.f42936f;
                if (this.g == 0) {
                    i = resources.getColor(C0906R.color.anc);
                } else {
                    i = resources.getColor(C0906R.color.anb);
                }
                textView.setTextColor(i);
            }
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f42931a, false, 37697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42931a, false, 37697, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f42932b = (LinearLayout) findViewById(C0906R.id.b9k);
        this.f42933c = (FrameLayout) findViewById(C0906R.id.b95);
        this.f42934d = (ImageView) findViewById(C0906R.id.b0y);
        this.f42935e = (DmtTextView) findViewById(C0906R.id.dkk);
        this.f42936f = (TextView) findViewById(C0906R.id.dau);
        if (PatchProxy.isSupport(new Object[0], this, f42931a, false, 37699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42931a, false, 37699, new Class[0], Void.TYPE);
            return;
        }
        if (ViewCompat.getLayoutDirection(this) == 1 && Build.VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f42932b.setLayoutDirection(1);
        }
    }

    public MtHatebaseView(@NonNull Context context) {
        super(context);
    }

    public void onColorModeChange(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42931a, false, 37703, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42931a, false, 37703, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != i) {
            this.g = i;
            a();
        }
    }

    public void setStatus(ag agVar) {
        if (PatchProxy.isSupport(new Object[]{agVar}, this, f42931a, false, 37698, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar}, this, f42931a, false, 37698, new Class[]{ag.class}, Void.TYPE);
        } else if (agVar != null) {
            this.h = agVar;
            if (PatchProxy.isSupport(new Object[0], this, f42931a, false, 37700, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42931a, false, 37700, new Class[0], Void.TYPE);
            } else if (this.h.f43111d) {
                this.f42933c.setVisibility(0);
                this.f42934d.setImageDrawable(this.h.f43108a);
            } else {
                this.f42933c.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, f42931a, false, 37701, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42931a, false, 37701, new Class[0], Void.TYPE);
            } else {
                if (this.h.f43112e) {
                    this.f42935e.setText(this.h.f43109b);
                }
                if (this.h.g) {
                    TextViewCompat.setTextAppearance(this.f42935e, C0906R.style.r5);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f42931a, false, 37702, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42931a, false, 37702, new Class[0], Void.TYPE);
            } else if (this.h.f43113f) {
                this.f42936f.setHighlightColor(getResources().getColor(C0906R.color.a7l));
                this.f42936f.setMovementMethod(LinkMovementMethod.getInstance());
                this.f42936f.setText(this.h.f43110c);
            }
            a();
        }
    }

    public MtHatebaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MtHatebaseView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
