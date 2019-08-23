package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eh;

public class CommerceTag extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34937a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f34938b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f34939c;

    /* renamed from: d  reason: collision with root package name */
    private View f34940d;

    public CommerceTag(Context context) {
        this(context, null);
    }

    public final void a(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34937a, false, 25009, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34937a, false, 25009, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f34937a, false, 25008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34937a, false, 25008, new Class[0], Void.TYPE);
        } else if (this.f34938b == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a2q, this);
            this.f34938b = (TextView) inflate.findViewById(C0906R.id.cqy);
            this.f34939c = (ImageView) inflate.findViewById(C0906R.id.b4i);
            this.f34940d = inflate.findViewById(C0906R.id.byf);
        }
        String a2 = eh.a(this.f34938b.getPaint(), 200.0f, str);
        this.f34938b.setText(a2);
        this.f34938b.requestLayout();
        if (AbTestManager.a().cl()) {
            this.f34939c.setVisibility(0);
            this.f34940d.setVisibility(8);
            eh.a(this.f34939c, a2.endsWith("…"));
            return;
        }
        this.f34940d.setVisibility(0);
        this.f34939c.setVisibility(8);
    }

    public CommerceTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
