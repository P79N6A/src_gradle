package com.ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61712a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f61713b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f61714c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f61715d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f61716e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f61717f;

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f61712a, false, 67683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61712a, false, 67683, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f61714c = (TextView) findViewById(C0906R.id.title);
        this.f61713b = (TextView) findViewById(C0906R.id.a3u);
    }

    public final void setAnimationEnabled(boolean z) {
        this.f61717f = z;
    }

    public final void setDescription(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61712a, false, 67685, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f61712a, false, 67685, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f61713b.setText(str2);
    }

    public final void setText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61712a, false, 67684, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f61712a, false, 67684, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f61714c.setText(str2);
    }

    public final void setSelected(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61712a, false, 67686, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61712a, false, 67686, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        this.f61715d.cancel();
        this.f61716e.cancel();
        if (z) {
            if (this.f61717f) {
                if (PatchProxy.isSupport(new Object[0], this, f61712a, false, 67690, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61712a, false, 67690, new Class[0], Void.TYPE);
                } else {
                    this.f61713b.setVisibility(0);
                    this.f61715d.start();
                }
            }
        } else if (this.f61717f) {
            if (PatchProxy.isSupport(new Object[0], this, f61712a, false, 67691, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61712a, false, 67691, new Class[0], Void.TYPE);
                return;
            }
            this.f61716e.start();
        }
    }
}
