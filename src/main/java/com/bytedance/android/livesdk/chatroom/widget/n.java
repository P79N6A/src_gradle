package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.floatwindow.i;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.widget.e;
import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class n extends e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13522a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13523b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13524c;

    /* renamed from: d  reason: collision with root package name */
    private ToggleButton f13525d;

    /* renamed from: e  reason: collision with root package name */
    private ToggleButton f13526e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13527f;

    public final int a() {
        return C0906R.layout.ags;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13522a, false, 7902, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13522a, false, 7902, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null && !ac.f()) {
            getWindow().setLayout(ac.a(376.0f), ac.a(230.0f));
            getWindow().setGravity(8388693);
        }
        this.f13525d = (ToggleButton) findViewById(C0906R.id.d4_);
        this.f13526e = (ToggleButton) findViewById(C0906R.id.d4a);
        this.f13525d.setChecked(this.f13523b);
        this.f13526e.setChecked(this.f13524c);
        this.f13525d.setOnCheckedChangeListener(this);
        this.f13526e.setOnCheckedChangeListener(this);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f13522a, false, 7903, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f13522a, false, 7903, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int id = compoundButton.getId();
        if (id == C0906R.id.d4_) {
            this.f13523b = z;
            b.X.a(Boolean.valueOf(this.f13523b));
        } else if (id == C0906R.id.d4a) {
            this.f13524c = z;
            b.Y.a(Boolean.valueOf(this.f13524c));
        }
        if (z && !i.a(getContext())) {
            new m.a(getContext(), 0).d((int) C0906R.string.dja).c((int) C0906R.string.d93).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13530a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13530a, false, 7905, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13530a, false, 7905, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    i.b(n.this.getContext());
                    dialogInterface.dismiss();
                }
            }).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13528a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13528a, false, 7904, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13528a, false, 7904, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    dialogInterface.dismiss();
                }
            }).a().show();
        }
    }

    public n(@NonNull Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        this.f13523b = z;
        this.f13524c = z2;
        this.f13527f = z3;
    }
}
