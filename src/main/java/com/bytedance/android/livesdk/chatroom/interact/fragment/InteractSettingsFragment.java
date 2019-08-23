package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.interact.c.bg;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.w.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class InteractSettingsFragment extends InteractDialogSettingContract.View implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect j;
    private Switch k;
    private Switch l;
    private View m;

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4598, new Class[0], String.class)) {
            return getString(C0906R.string.d6n);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4598, new Class[0], String.class);
    }

    public final float d() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4599, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, j, false, 4599, new Class[0], Float.TYPE)).floatValue();
        } else if (a.f()) {
            return 160.0f;
        } else {
            return 216.0f;
        }
    }

    public final View e() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4600, new Class[0], View.class)) {
            return this.f10827b.b();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4600, new Class[0], View.class);
    }

    public final void i() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4597, new Class[0], Void.TYPE);
        } else if (this.f8193f) {
            c<Integer> cVar = b.q;
            if (this.l.isChecked()) {
                i = 2;
            } else {
                i = 1;
            }
            cVar.a(Integer.valueOf(i));
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4595, new Class[0], Void.TYPE);
        } else if (this.f8193f) {
            if (!this.k.isChecked()) {
                b.q.a(0);
            } else if (!this.l.isChecked()) {
                b.q.a(1);
            } else {
                b.q.a(2);
            }
        }
    }

    public static InteractSettingsFragment a(b.C0088b bVar) {
        b.C0088b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, j, true, 4592, new Class[]{b.C0088b.class}, InteractSettingsFragment.class)) {
            return (InteractSettingsFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, null, j, true, 4592, new Class[]{b.C0088b.class}, InteractSettingsFragment.class);
        }
        InteractSettingsFragment interactSettingsFragment = new InteractSettingsFragment();
        interactSettingsFragment.h = new bg(interactSettingsFragment);
        interactSettingsFragment.f10827b = bVar2;
        return interactSettingsFragment;
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, j, false, 4594, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, j, false, 4594, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th);
            this.k.setOnCheckedChangeListener(null);
            this.k.setChecked(!this.k.isClickable());
            this.k.setOnCheckedChangeListener(null);
        }
    }

    public final void b(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, j, false, 4596, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, j, false, 4596, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th);
            this.l.setOnCheckedChangeListener(null);
            this.l.setChecked(!this.l.isClickable());
            this.l.setOnCheckedChangeListener(this);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 4601, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, j, false, 4601, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int id = compoundButton.getId();
        if (id == C0906R.id.cy2) {
            View view = this.m;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (!z) {
                this.l.setOnCheckedChangeListener(null);
                this.l.setChecked(false);
                this.l.setOnCheckedChangeListener(this);
            }
            ((InteractDialogSettingContract.a) this.h).a(z);
            return;
        }
        if (id == C0906R.id.cy3) {
            ((InteractDialogSettingContract.a) this.h).b(z);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4593, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ai6, viewGroup2, false);
        this.k = (Switch) inflate.findViewById(C0906R.id.cy2);
        this.l = (Switch) inflate.findViewById(C0906R.id.cy3);
        this.m = inflate.findViewById(C0906R.id.af5);
        int intValue = ((Integer) com.bytedance.android.livesdk.w.b.q.a()).intValue();
        if (intValue == 0) {
            this.k.setChecked(false);
            this.m.setVisibility(8);
        } else if (intValue == 1) {
            this.k.setChecked(true);
        } else if (intValue == 2) {
            this.k.setChecked(true);
            this.l.setChecked(true);
        }
        this.k.setOnCheckedChangeListener(this);
        this.l.setOnCheckedChangeListener(this);
        return inflate;
    }
}
