package com.bytedance.android.livesdk.effect;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveBeautyFragment extends BaseFragment implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13690a;

    /* renamed from: b  reason: collision with root package name */
    a f13691b;

    /* renamed from: c  reason: collision with root package name */
    SeekBar f13692c;
    boolean h;
    private SeekBar i;
    private SeekBar j;
    private SeekBar k;

    public interface a {
        void a(float f2);

        void b(float f2);

        void c(float f2);

        void d(float f2);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f13690a, false, 8124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13690a, false, 8124, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        b();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13690a, false, 8129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13690a, false, 8129, new Class[0], Void.TYPE);
            return;
        }
        if (!com.bytedance.android.live.uikit.a.a.a()) {
            this.f13692c.setProgress((int) (((Float) b.F.a()).floatValue() * 100.0f));
        }
        this.i.setProgress((int) (((Float) b.G.a()).floatValue() * 100.0f));
        this.j.setProgress((int) (((Float) b.H.a()).floatValue() * 100.0f));
        this.k.setProgress((int) (((Float) b.I.a()).floatValue() * 100.0f));
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f13690a, false, 8128, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f13690a, false, 8128, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        int id = seekBar.getId();
        if (id == C0906R.id.dxk) {
            b.F.a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == C0906R.id.jy) {
            b.G.a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == C0906R.id.kx) {
            b.H.a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == C0906R.id.abg) {
            b.I.a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        }
        Room a2 = TTLiveSDKContext.getLiveService().d().a();
        if (a2 != null) {
            f.a(a2.getId());
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13690a, false, 8123, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13690a, false, 8123, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (com.bytedance.android.livesdkapi.a.a.f18614b) {
            i2 = C0906R.layout.ahx;
        } else if (this.h) {
            i2 = C0906R.layout.ai_;
        } else {
            i2 = C0906R.layout.ai9;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f13690a, false, 8125, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f13690a, false, 8125, new Class[]{View.class}, Void.TYPE);
        } else {
            this.i = (SeekBar) inflate.findViewById(C0906R.id.jy);
            this.j = (SeekBar) inflate.findViewById(C0906R.id.kx);
            this.k = (SeekBar) inflate.findViewById(C0906R.id.abg);
            if (!com.bytedance.android.live.uikit.a.a.a()) {
                this.f13692c = (SeekBar) inflate.findViewById(C0906R.id.dxk);
                this.f13692c.setOnSeekBarChangeListener(this);
            }
            this.i.setOnSeekBarChangeListener(this);
            this.j.setOnSeekBarChangeListener(this);
            this.k.setOnSeekBarChangeListener(this);
            if (com.bytedance.android.livesdkapi.a.a.f18614b) {
                inflate.findViewById(C0906R.id.dxj).setVisibility(8);
            }
        }
        b();
        return inflate;
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f13690a, false, 8127, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i2), Byte.valueOf(z)}, this, f13690a, false, 8127, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int id = seekBar.getId();
        if (id == C0906R.id.dxk) {
            if (this.f13691b != null) {
                this.f13691b.a(((float) i3) / 100.0f);
            }
        } else if (id == C0906R.id.jy) {
            if (this.f13691b != null) {
                this.f13691b.b(((float) i3) / 100.0f);
            }
        } else if (id == C0906R.id.kx) {
            if (this.f13691b != null) {
                this.f13691b.c(((float) i3) / 100.0f);
            }
        } else if (id == C0906R.id.abg && this.f13691b != null) {
            this.f13691b.d(((float) i3) / 100.0f);
        }
    }
}
