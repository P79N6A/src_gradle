package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.commercialize.api.d;
import com.ss.android.ugc.aweme.commercialize.b.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.utils.bg;

public class PrivateShareTopItemView extends LinearLayout implements View.OnClickListener, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39951a;

    /* renamed from: b  reason: collision with root package name */
    private Aweme f39952b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39953c;

    /* renamed from: d  reason: collision with root package name */
    private View.OnClickListener f39954d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f39955e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f39956f;

    public Aweme getData() {
        return this.f39952b;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f39951a, false, 32920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39951a, false, 32920, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f39952b == null || this.f39953c == this.f39952b.isTop())) {
            bg.a(new g(1));
        }
        super.onDetachedFromWindow();
    }

    private void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f39951a, false, 32916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39951a, false, 32916, new Class[0], Void.TYPE);
            return;
        }
        setSelected(!this.f39952b.isTop());
        if (!this.f39952b.isTop()) {
            i = C0906R.string.cnz;
        } else {
            i = C0906R.string.bi5;
        }
        setText(i);
    }

    public void setItemOnClickListener(View.OnClickListener onClickListener) {
        this.f39954d = onClickListener;
    }

    public PrivateShareTopItemView(Context context) {
        this(context, null);
    }

    public void setData(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39951a, false, 32915, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f39951a, false, 32915, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.f39952b = aweme;
        this.f39953c = aweme.isTop();
        a();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39951a, false, 32919, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39951a, false, 32919, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d.a(this, this.f39952b.getAid(), !this.f39952b.isTop());
    }

    public void setBackground(@DrawableRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f39951a, false, 32913, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f39951a, false, 32913, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f39955e.setImageResource(i);
    }

    public void setText(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f39951a, false, 32914, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f39951a, false, 32914, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f39956f.setText(i);
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f39951a, false, 32918, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f39951a, false, 32918, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a(getContext(), exc2, C0906R.string.bgf);
        this.f39954d.onClick(null);
    }

    public PrivateShareTopItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(String str, Object obj) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f39951a, false, 32917, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f39951a, false, 32917, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.f39952b.setIsTop(this.f39952b.isTop() ^ true ? 1 : 0);
        a();
        Context context = getContext();
        if (this.f39952b.isTop()) {
            str2 = getContext().getString(C0906R.string.co5);
        } else {
            str2 = getContext().getString(C0906R.string.co1);
        }
        com.bytedance.ies.dmt.ui.d.a.a(context, str2).a();
        this.f39954d.onClick(null);
    }

    public PrivateShareTopItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0906R.layout.abx, this);
        this.f39955e = (ImageView) findViewById(C0906R.id.cp6);
        this.f39956f = (TextView) findViewById(C0906R.id.cp7);
        setBackground(2130837943);
        setOnClickListener(this);
    }
}
