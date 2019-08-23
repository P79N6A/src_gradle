package com.bytedance.android.livesdk.chatroom.a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends Dialog implements CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9700a;

    /* renamed from: b  reason: collision with root package name */
    private final C0078a f9701b;

    /* renamed from: c  reason: collision with root package name */
    private View f9702c;

    /* renamed from: d  reason: collision with root package name */
    private View f9703d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f9704e;

    /* renamed from: f  reason: collision with root package name */
    private View f9705f;
    private TextView g;
    private View h;
    private TextView i;
    private ToggleButton j;
    private SeekBar k;
    private SeekBar l;
    private TextView m;
    private TextView n;
    private TextView o;
    private View p;
    private View.OnClickListener q = new b(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a$a  reason: collision with other inner class name */
    public interface C0078a {
        void a(boolean z);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9700a, false, 3920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9700a, false, 3920, new Class[0], Void.TYPE);
            return;
        }
        this.f9703d.setAlpha(1.0f);
        this.f9704e.setAlpha(1.0f);
        this.f9705f.setAlpha(1.0f);
        this.g.setAlpha(1.0f);
        this.h.setAlpha(1.0f);
        this.i.setAlpha(1.0f);
        this.j.setAlpha(1.0f);
        this.k.setAlpha(1.0f);
        this.l.setAlpha(1.0f);
        this.m.setAlpha(1.0f);
        this.n.setAlpha(1.0f);
        this.o.setAlpha(1.0f);
        this.p.setVisibility(8);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9700a, false, 3921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9700a, false, 3921, new Class[0], Void.TYPE);
            return;
        }
        this.f9703d.setAlpha(0.64f);
        this.f9704e.setAlpha(0.64f);
        this.f9705f.setAlpha(0.64f);
        this.g.setAlpha(0.64f);
        this.h.setAlpha(0.64f);
        this.i.setAlpha(0.64f);
        this.j.setAlpha(0.64f);
        this.k.setAlpha(0.64f);
        this.l.setAlpha(0.64f);
        this.m.setAlpha(0.64f);
        this.n.setAlpha(0.64f);
        this.o.setAlpha(0.64f);
        this.p.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9700a, false, 3917, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9700a, false, 3917, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        View view = this.f9703d;
        if (i2 == 0) {
            i3 = 2130841107;
        } else {
            i3 = 2130841108;
        }
        view.setBackgroundResource(i3);
        TextView textView = this.f9704e;
        Resources resources = getContext().getResources();
        boolean f2 = com.bytedance.android.live.uikit.a.a.f();
        int i8 = C0906R.color.a7v;
        if (f2) {
            if (i2 == 0) {
                i4 = C0906R.color.a7x;
            } else {
                i4 = C0906R.color.a7y;
            }
        } else if (i2 == 0) {
            i4 = C0906R.color.a7w;
        } else {
            i4 = C0906R.color.a7v;
        }
        textView.setTextColor(resources.getColor(i4));
        View view2 = this.f9705f;
        if (i2 == 1) {
            i5 = 2130841104;
        } else {
            i5 = 2130841105;
        }
        view2.setBackgroundResource(i5);
        TextView textView2 = this.g;
        Resources resources2 = getContext().getResources();
        if (com.bytedance.android.live.uikit.a.a.f()) {
            if (i2 == 1) {
                i6 = C0906R.color.a7x;
            } else {
                i6 = C0906R.color.a7y;
            }
        } else if (i2 == 1) {
            i6 = C0906R.color.a7w;
        } else {
            i6 = C0906R.color.a7v;
        }
        textView2.setTextColor(resources2.getColor(i6));
        View view3 = this.h;
        if (i2 == 2) {
            i7 = 2130841102;
        } else {
            i7 = 2130841103;
        }
        view3.setBackgroundResource(i7);
        TextView textView3 = this.i;
        Resources resources3 = getContext().getResources();
        if (com.bytedance.android.live.uikit.a.a.f()) {
            if (i2 == 2) {
                i8 = C0906R.color.a7x;
            } else {
                i8 = C0906R.color.a7y;
            }
        } else if (i2 == 2) {
            i8 = C0906R.color.a7w;
        }
        textView3.setTextColor(resources3.getColor(i8));
    }

    public final void onCreate(Bundle bundle) {
        int i2;
        boolean z = true;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9700a, false, 3915, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9700a, false, 3915, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f9702c = LayoutInflater.from(getContext()).inflate(C0906R.layout.at5, null);
        setContentView(this.f9702c);
        if (getWindow() != null) {
            if (com.bytedance.android.live.uikit.a.a.a()) {
                i2 = 248;
            } else {
                i2 = 256;
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                i2 = 248;
            }
            getWindow().setLayout((int) UIUtils.dip2Px(getContext(), (float) i2), -1);
            getWindow().setGravity(8388613);
            if (com.bytedance.android.live.uikit.a.a.a()) {
                getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f9700a, false, 3916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9700a, false, 3916, new Class[0], Void.TYPE);
            return;
        }
        this.f9703d = this.f9702c.findViewById(C0906R.id.az4);
        this.f9704e = (TextView) this.f9702c.findViewById(C0906R.id.d9k);
        this.f9705f = this.f9702c.findViewById(C0906R.id.az3);
        this.g = (TextView) this.f9702c.findViewById(C0906R.id.d9j);
        this.h = this.f9702c.findViewById(C0906R.id.az2);
        this.i = (TextView) this.f9702c.findViewById(C0906R.id.d9i);
        this.k = (SeekBar) this.f9702c.findViewById(C0906R.id.em);
        this.l = (SeekBar) this.f9702c.findViewById(C0906R.id.crq);
        this.k.setOnSeekBarChangeListener(this);
        this.l.setOnSeekBarChangeListener(this);
        this.o = (TextView) this.f9702c.findViewById(C0906R.id.d94);
        this.n = (TextView) this.f9702c.findViewById(C0906R.id.dj5);
        this.m = (TextView) this.f9702c.findViewById(C0906R.id.dgf);
        this.p = this.f9702c.findViewById(C0906R.id.bnf);
        this.p.setOnClickListener(c.f9719b);
        this.j = (ToggleButton) this.f9702c.findViewById(C0906R.id.d49);
        this.f9703d.setOnClickListener(this.q);
        this.f9704e.setOnClickListener(this.q);
        this.f9705f.setOnClickListener(this.q);
        this.g.setOnClickListener(this.q);
        this.h.setOnClickListener(this.q);
        this.i.setOnClickListener(this.q);
        if (!((Boolean) b.P.a()).booleanValue() || ((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.a()).intValue() != 1) {
            z = false;
        }
        this.j.setChecked(z);
        View view = this.p;
        if (z) {
            i3 = 8;
        }
        view.setVisibility(i3);
        this.l.setProgress((int) (((Float) b.N.a()).floatValue() * 100.0f));
        this.k.setProgress((int) (((Float) b.M.a()).floatValue() * 100.0f));
        a(((Integer) b.O.a()).intValue());
        this.j.setOnCheckedChangeListener(this);
        if (z) {
            a();
        } else {
            b();
        }
    }

    public a(@NonNull Context context, @NonNull C0078a aVar) {
        super(context, C0906R.style.vd);
        this.f9701b = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f9700a, false, 3918, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f9700a, false, 3918, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (compoundButton.getId() == C0906R.id.d49) {
            if (((Integer) LiveSettingKeys.BAN_BARRAGE_SWITCH_SET.a()).intValue() != 1) {
                this.j.setChecked(false);
                ai.a((int) C0906R.string.d0b);
                return;
            }
            if (z) {
                a();
            } else {
                b();
            }
            b.P.a(Boolean.valueOf(z));
            this.f9701b.a(z);
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f9700a, false, 3919, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f9700a, false, 3919, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (seekBar.getId() == C0906R.id.em) {
            b.M.a(Float.valueOf(((float) i3) / 100.0f));
        } else {
            if (seekBar.getId() == C0906R.id.crq) {
                b.N.a(Float.valueOf(((float) i3) / 100.0f));
            }
        }
    }
}
