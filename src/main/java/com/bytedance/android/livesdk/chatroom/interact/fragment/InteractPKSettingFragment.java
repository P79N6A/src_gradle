package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.c.al;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.w.c;
import com.bytedance.android.livesdkapi.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.lang.a;

public class InteractPKSettingFragment extends InteractDialogPKSettingContract.View implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect j;
    private static final /* synthetic */ a.C0900a p;
    private TextView k;
    private Switch l;
    private Switch m;
    private ViewGroup n;
    private d o;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        b.aI.a(((InteractDialogPKSettingContract.a) this.h).e());
        this.f10827b.a();
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 4544, new Class[0], String.class)) {
            return getString(C0906R.string.d6n);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, j, false, 4544, new Class[0], String.class);
    }

    public final float d() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4553, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, j, false, 4553, new Class[0], Float.TYPE)).floatValue();
        } else if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            return 432.0f;
        } else {
            return 216.0f;
        }
    }

    public final void i() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4551, new Class[0], Void.TYPE);
        } else if (this.f8193f) {
            c<Integer> cVar = b.q;
            if (this.m.isChecked()) {
                i = 2;
            } else {
                i = 1;
            }
            cVar.a(Integer.valueOf(i));
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, j, true, 4555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, j, true, 4555, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("InteractPKSettingFragment.java", InteractPKSettingFragment.class);
        p = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKSettingFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 107);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4549, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 4549, new Class[0], Void.TYPE);
        } else if (this.f8193f) {
            if (!this.l.isChecked()) {
                b.q.a(0);
            } else if (!this.m.isChecked()) {
                b.q.a(1);
            } else {
                b.q.a(2);
            }
        }
    }

    public final View e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 4554, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 4554, new Class[0], View.class);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new RelativeLayout.LayoutParams(ac.a(32.0f), ac.a(32.0f)));
        autoRTLImageView.setImageDrawable(ac.c(2130841118));
        autoRTLImageView.setOnClickListener(new f(this));
        return autoRTLImageView;
    }

    public static InteractPKSettingFragment a(b.C0088b bVar) {
        b.C0088b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, j, true, 4542, new Class[]{b.C0088b.class}, InteractPKSettingFragment.class)) {
            return (InteractPKSettingFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, null, j, true, 4542, new Class[]{b.C0088b.class}, InteractPKSettingFragment.class);
        }
        InteractPKSettingFragment interactPKSettingFragment = new InteractPKSettingFragment();
        interactPKSettingFragment.h = new al(interactPKSettingFragment);
        interactPKSettingFragment.f10827b = bVar2;
        return interactPKSettingFragment;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 4545, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 4545, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(p, this, this, view));
        if (view.getId() == C0906R.id.dkg) {
            this.f10827b.a(InteractPKTimeFragment.a(this.f10827b, this, ((InteractDialogPKSettingContract.a) this.h).d()));
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 4547, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 4547, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f8193f) {
            this.k.setText(n.a(getContext().getString(C0906R.string.czl), Integer.valueOf(i)));
        }
    }

    public final void b(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, j, false, 4552, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, j, false, 4552, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th);
            this.m.setOnCheckedChangeListener(null);
            this.m.setChecked(!this.m.isClickable());
            this.m.setOnCheckedChangeListener(this);
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, j, false, 4550, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, j, false, 4550, new Class[]{Throwable.class}, Void.TYPE);
        } else if (this.f8193f) {
            l.a(getContext(), th);
            this.l.setOnCheckedChangeListener(null);
            this.l.setChecked(!this.l.isClickable());
            this.l.setOnCheckedChangeListener(null);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 4546, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, j, false, 4546, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
        } else if (compoundButton.getId() == C0906R.id.cy5) {
            com.bytedance.android.livesdk.w.b.aG.a(Boolean.valueOf(z));
        } else if (compoundButton.getId() == C0906R.id.cy4) {
            com.bytedance.android.livesdk.w.b.aH.a(Boolean.valueOf(z));
        } else if (compoundButton.getId() == C0906R.id.cy2) {
            ViewGroup viewGroup = this.n;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            viewGroup.setVisibility(i);
            if (!z) {
                this.m.setOnCheckedChangeListener(null);
                this.m.setChecked(false);
                this.m.setOnCheckedChangeListener(this);
            }
            ((InteractDialogPKSettingContract.a) this.h).a(z);
        } else {
            if (compoundButton.getId() == C0906R.id.cy3) {
                ((InteractDialogPKSettingContract.a) this.h).b(z);
            }
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, j, false, 4548, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, j, false, 4548, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((InteractDialogPKSettingContract.a) this.h).a(i, i2);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4543, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, j, false, 4543, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ai4, viewGroup2, false);
        this.k = (TextView) inflate.findViewById(C0906R.id.dkg);
        Switch switchR = (Switch) inflate.findViewById(C0906R.id.cy5);
        Switch switchR2 = (Switch) inflate.findViewById(C0906R.id.cy4);
        this.n = (ViewGroup) inflate.findViewById(C0906R.id.af5);
        this.l = (Switch) inflate.findViewById(C0906R.id.cy2);
        this.m = (Switch) inflate.findViewById(C0906R.id.cy3);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            inflate.findViewById(C0906R.id.alt).setVisibility(8);
        }
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            switchR.setOnCheckedChangeListener(this);
            switchR2.setOnCheckedChangeListener(this);
        }
        int intValue = ((Integer) com.bytedance.android.livesdk.w.b.q.a()).intValue();
        if (intValue == 0) {
            this.l.setChecked(false);
            this.n.setVisibility(8);
        } else if (intValue == 1) {
            this.l.setChecked(true);
        } else if (intValue == 2) {
            this.l.setChecked(true);
            this.m.setChecked(true);
        }
        this.l.setOnCheckedChangeListener(this);
        this.m.setOnCheckedChangeListener(this);
        this.o = TTLiveSDKContext.getHostService().b().b();
        if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            switchR.setChecked(((Boolean) com.bytedance.android.livesdk.w.b.aG.a()).booleanValue());
            switchR2.setChecked(((Boolean) com.bytedance.android.livesdk.w.b.aH.a()).booleanValue());
        }
        this.k.setOnClickListener(this);
        this.k.setText(n.a(getContext().getString(C0906R.string.czl), Integer.valueOf(((InteractDialogPKSettingContract.a) this.h).c())));
        ((InteractDialogPKSettingContract.a) this.h).a((String) com.bytedance.android.livesdk.w.b.aI.a());
        return inflate;
    }
}
