package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.qrcode.e;

public class SearchScanView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43039a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43040b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f43041c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f43042d;

    /* renamed from: e  reason: collision with root package name */
    private a f43043e;

    public interface a {
        void a(View view);

        void b(View view);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43039a, false, 38076, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43039a, false, 38076, new Class[0], Void.TYPE);
            return;
        }
        this.f43042d.setVisibility(8);
        this.f43041c.setVisibility(0);
        this.f43040b = false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43039a, false, 38075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43039a, false, 38075, new Class[0], Void.TYPE);
            return;
        }
        if (!e.a().b().booleanValue()) {
            this.f43042d.setVisibility(0);
            this.f43041c.setVisibility(8);
            this.f43040b = true;
        }
    }

    public void setOnInternalClickListener(a aVar) {
        this.f43043e = aVar;
    }

    public SearchScanView(@NonNull Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43039a, false, 38077, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43039a, false, 38077, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (this.f43043e != null) {
            int id = view.getId();
            if (id == C0906R.id.di0) {
                this.f43043e.a(view);
                return;
            }
            if (id == C0906R.id.cjk) {
                this.f43043e.b(view);
            }
        }
    }

    public SearchScanView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchScanView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f43039a, false, 38074, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f43039a, false, 38074, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.arp, this, true);
        this.f43041c = (TextView) inflate.findViewById(C0906R.id.di0);
        this.f43042d = (ImageView) inflate.findViewById(C0906R.id.cjk);
        this.f43042d.setOnClickListener(this);
        this.f43041c.setOnClickListener(this);
    }
}
