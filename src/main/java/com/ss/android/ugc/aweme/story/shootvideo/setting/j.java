package com.ss.android.ugc.aweme.story.shootvideo.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.d.c;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.ui.Divider;

public final class j extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74153a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f74154b;

    /* renamed from: c  reason: collision with root package name */
    protected ImageView f74155c;

    /* renamed from: d  reason: collision with root package name */
    protected ButtonTitleBar f74156d;

    /* renamed from: e  reason: collision with root package name */
    protected View f74157e;

    /* renamed from: f  reason: collision with root package name */
    protected CommonItemView f74158f;
    protected CommonItemView g;
    protected CommonItemView h;
    protected Divider i;
    a j;

    public interface a {
        void a();

        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74153a, false, 86065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74153a, false, 86065, new Class[0], Void.TYPE);
            return;
        }
        int color = getResources().getColor(C0906R.color.p9);
        int color2 = getResources().getColor(C0906R.color.ajs);
        this.f74156d.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838333));
        this.f74157e.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838333));
        this.f74154b.setTextColor(color);
        this.f74155c.setImageResource(2130841639);
        this.f74158f.getTvwLeft().setTextColor(color);
        this.f74158f.getTvwDesc().setTextColor(color2);
        this.g.getTvwLeft().setTextColor(color);
        this.g.getTvwDesc().setTextColor(color2);
        this.h.getTvwLeft().setTextColor(color);
        this.h.getTvwDesc().setTextColor(color2);
        ((TextView) this.i.findViewById(C0906R.id.ddn)).setTextColor(color2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74153a, false, 86066, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74153a, false, 86066, new Class[0], Void.TYPE);
            return;
        }
        int color = getResources().getColor(C0906R.color.ajg);
        int color2 = getResources().getColor(C0906R.color.al1);
        this.f74156d.setBackgroundColor(getResources().getColor(C0906R.color.p9));
        this.f74157e.setBackgroundColor(getResources().getColor(C0906R.color.p9));
        this.f74154b.setTextColor(color);
        this.f74155c.setImageResource(2130841640);
        this.f74158f.getTvwLeft().setTextColor(color);
        this.f74158f.getTvwDesc().setTextColor(color2);
        this.g.getTvwLeft().setTextColor(color);
        this.g.getTvwDesc().setTextColor(color2);
        this.h.getTvwLeft().setTextColor(color);
        this.h.getTvwDesc().setTextColor(color2);
        ((TextView) this.i.findViewById(C0906R.id.ddn)).setTextColor(getResources().getColor(C0906R.color.am4));
    }

    public final void setStorySettingLayoutItemClick(a aVar) {
        this.j = aVar;
    }

    public j(Context context) {
        this(context, null);
    }

    public final void setChecked(CommonItemView commonItemView) {
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{commonItemView2}, this, f74153a, false, 86068, new Class[]{CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2}, this, f74153a, false, 86068, new Class[]{CommonItemView.class}, Void.TYPE);
            return;
        }
        commonItemView2.setRightIconRes(2130839076);
    }

    public final void setTitle(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74153a, false, 86063, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f74153a, false, 86063, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f74154b.setText(str2);
    }

    public final void onClick(View view) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f74153a, false, 86070, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74153a, false, 86070, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getSettingService();
            if (view.getId() == C0906R.id.aap) {
                i2 = 0;
            } else if (view.getId() != C0906R.id.ais) {
                if (view.getId() == C0906R.id.bu_) {
                    i2 = 3;
                } else {
                    i2 = -1;
                }
            }
            if (this.j != null) {
                this.j.a(i2);
            }
        }
    }

    public final void setTipStr(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f74153a, false, 86064, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f74153a, false, 86064, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((TextView) this.i.findViewById(C0906R.id.ddn)).setText(str2);
    }

    public final void setViewPage(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74153a, false, 86062, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74153a, false, 86062, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
        if (z) {
            this.g.setLeftText(getResources().getString(C0906R.string.aih));
            this.f74158f.setDesc(getResources().getString(C0906R.string.bsz));
            this.g.setDesc(getResources().getString(C0906R.string.ai4));
            this.h.setDesc(getResources().getString(C0906R.string.ce9));
            return;
        }
        this.g.setLeftText(getResources().getString(C0906R.string.cf4));
        this.f74158f.setDesc(getResources().getString(C0906R.string.ce7));
        this.g.setDesc(getResources().getString(C0906R.string.cfv));
        this.h.setDesc(getResources().getString(C0906R.string.cfu));
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74153a, false, 86067, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74153a, false, 86067, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getSettingService();
        if (PatchProxy.isSupport(new Object[0], this, f74153a, false, 86069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74153a, false, 86069, new Class[0], Void.TYPE);
        } else {
            this.g.setRightIconRes(0);
            this.f74158f.setRightIconRes(0);
            this.h.setRightIconRes(0);
        }
        if (i2 == 0) {
            setChecked(this.f74158f);
        } else if (i2 == 1) {
            setChecked(this.g);
        } else {
            if (i2 == 3) {
                setChecked(this.h);
            }
        }
    }

    private j(Context context, AttributeSet attributeSet) {
        super(context, null);
        if (PatchProxy.isSupport(new Object[]{context}, this, f74153a, false, 86061, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74153a, false, 86061, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f74157e = LayoutInflater.from(context).inflate(C0906R.layout.a93, this);
        this.f74154b = (TextView) findViewById(C0906R.id.title);
        this.f74155c = (ImageView) findViewById(C0906R.id.ix);
        this.f74157e = findViewById(C0906R.id.ci6);
        this.f74156d = (ButtonTitleBar) findViewById(C0906R.id.d3v);
        this.f74158f = (CommonItemView) findViewById(C0906R.id.aap);
        this.g = (CommonItemView) findViewById(C0906R.id.ais);
        this.h = (CommonItemView) findViewById(C0906R.id.bu_);
        this.i = (Divider) findViewById(C0906R.id.d39);
        this.f74155c.setOnClickListener(new k(this));
        c.a(this.f74155c);
        this.f74158f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
    }
}
