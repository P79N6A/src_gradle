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
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.services.IAVService;

public final class e extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74130a;

    /* renamed from: b  reason: collision with root package name */
    CommonItemView f74131b;

    /* renamed from: c  reason: collision with root package name */
    CommonItemView f74132c;

    /* renamed from: d  reason: collision with root package name */
    a f74133d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f74134e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f74135f;
    private CommonItemView g;
    private CommonItemView h;
    private CommonItemView i;
    private ButtonTitleBar j;

    public interface a {
        void a(int i);

        void a(boolean z);
    }

    public final boolean getDoudouPhotoStatus() {
        if (!PatchProxy.isSupport(new Object[0], this, f74130a, false, 86043, new Class[0], Boolean.TYPE)) {
            return this.f74132c.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74130a, false, 86043, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean getSyncDuoshanStatus() {
        if (!PatchProxy.isSupport(new Object[0], this, f74130a, false, 86042, new Class[0], Boolean.TYPE)) {
            return this.f74131b.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74130a, false, 86042, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void setStorySettingViewCallback(a aVar) {
        this.f74133d = aVar;
    }

    public e(Context context) {
        this(context, null);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74130a, false, 86038, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74130a, false, 86038, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            this.g.setRightText(getResources().getString(C0906R.string.eb));
        } else if (i2 == 1) {
            this.g.setRightText(getResources().getString(C0906R.string.aih));
        } else {
            if (i2 == 3) {
                this.g.setRightText(getResources().getString(C0906R.string.bjd));
            }
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74130a, false, 86039, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74130a, false, 86039, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            this.h.setRightText(getResources().getString(C0906R.string.eb));
        } else if (i2 == 1) {
            this.h.setRightText(getResources().getString(C0906R.string.cf4));
        } else {
            if (i2 == 3) {
                this.h.setRightText(getResources().getString(C0906R.string.bjd));
            }
        }
    }

    public final void onClick(View view) {
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f74130a, false, 86045, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74130a, false, 86045, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id != C0906R.id.cmk) {
            if (id == C0906R.id.vg) {
                i2 = 2;
            } else if (id == C0906R.id.anz) {
                i2 = 4;
            } else if (id == C0906R.id.el) {
                i2 = 3;
            } else if (id == C0906R.id.a6u) {
                i2 = 5;
            } else {
                i2 = -1;
            }
        }
        if (this.f74133d != null) {
            this.f74133d.a(i2);
        }
    }

    public final void setBlackTheme(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74130a, false, 86036, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74130a, false, 86036, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setBackgroundColor(getResources().getColor(C0906R.color.p9));
        this.f74134e.setTextColor(getResources().getColor(C0906R.color.ajg));
        this.f74135f.setImageResource(2130839367);
    }

    public final void setWhiteTheme(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74130a, false, 86035, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74130a, false, 86035, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setBackground(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838333));
        this.f74134e.setTextColor(getResources().getColor(C0906R.color.p9));
        if (z) {
            this.f74135f.setImageResource(2130839368);
        } else {
            this.f74135f.setImageResource(2130839375);
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74130a, false, 86037, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74130a, false, 86037, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i2);
        b(i3);
        if (((Boolean) com.ss.android.ugc.aweme.port.in.a.o.k().a()).booleanValue()) {
            this.f74131b.setChecked(true);
        } else {
            this.f74131b.setChecked(false);
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).storySettingService().getStorySettingDoudouSwitch()) {
            this.f74132c.setChecked(true);
        } else {
            this.f74132c.setChecked(false);
        }
    }

    private e(Context context, AttributeSet attributeSet) {
        super(context, null);
        if (PatchProxy.isSupport(new Object[]{context}, this, f74130a, false, 86033, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f74130a, false, 86033, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(C0906R.layout.a99, this);
        if (PatchProxy.isSupport(new Object[0], this, f74130a, false, 86034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74130a, false, 86034, new Class[0], Void.TYPE);
        } else {
            this.f74134e = (TextView) findViewById(C0906R.id.title);
            this.f74135f = (ImageView) findViewById(C0906R.id.ix);
            this.g = (CommonItemView) findViewById(C0906R.id.cmk);
            this.h = (CommonItemView) findViewById(C0906R.id.vg);
            this.i = (CommonItemView) findViewById(C0906R.id.anz);
            this.f74132c = (CommonItemView) findViewById(C0906R.id.a6u);
            this.f74131b = (CommonItemView) findViewById(C0906R.id.el);
            this.j = (ButtonTitleBar) findViewById(C0906R.id.d3v);
            this.f74135f.setOnClickListener(new f(this));
            if (com.ss.android.ugc.aweme.port.in.a.A.a()) {
                this.f74131b.setVisibility(0);
            } else {
                this.f74131b.setVisibility(8);
            }
            if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RemoveStoryStrategy) == 0) {
                this.f74132c.setVisibility(0);
            } else {
                this.f74132c.setVisibility(8);
            }
            this.f74134e.setText(getResources().getString(C0906R.string.c5n));
            this.g.setRightText(getResources().getString(C0906R.string.bsw));
            this.h.setRightText(getResources().getString(C0906R.string.bsw));
            this.f74132c.setChecked(true);
            c.a(this.f74135f);
        }
        if (PatchProxy.isSupport(new Object[0], this, f74130a, false, 86044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74130a, false, 86044, new Class[0], Void.TYPE);
            return;
        }
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.f74131b.setOnClickListener(this);
        this.f74132c.setOnClickListener(this);
    }
}
