package com.bytedance.android.livesdk.chatroom.widget;

import android.content.res.Resources;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class StepPercentSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13414a;

    /* renamed from: b  reason: collision with root package name */
    private a f13415b;

    /* renamed from: c  reason: collision with root package name */
    private int f13416c;

    /* renamed from: d  reason: collision with root package name */
    private int f13417d;

    public interface a {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public int getPercent() {
        return this.f13417d;
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13414a, false, 8019, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13414a, false, 8019, new Class[0], Void.TYPE);
            return;
        }
        setProgress((this.f13417d * 100) / this.f13416c);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13414a, false, 8022, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13414a, false, 8022, new Class[0], Void.TYPE);
            return;
        }
        int progress = (this.f13416c * getProgress()) / 100;
        int i = progress % 10;
        if (i == 0) {
            this.f13417d = progress;
        } else if (i < 5) {
            progress = (progress / 10) * 10;
        } else {
            progress = ((progress / 10) * 10) + 10;
        }
        this.f13417d = progress;
    }

    public void setOnPercentChangeListener(a aVar) {
        this.f13415b = aVar;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (PatchProxy.isSupport(new Object[]{seekBar}, this, f13414a, false, 8018, new Class[]{SeekBar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar}, this, f13414a, false, 8018, new Class[]{SeekBar.class}, Void.TYPE);
            return;
        }
        b();
        a();
    }

    public void setEnabled(boolean z) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13414a, false, 8021, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13414a, false, 8021, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setEnabled(z);
        Resources resources = getResources();
        if (z) {
            i = 2130840780;
        } else {
            i = 2130840781;
        }
        setProgressDrawable(com.ss.android.ugc.bytex.a.a.a.a(resources, i));
        Resources resources2 = getResources();
        if (z) {
            i2 = 2130841560;
        } else {
            i2 = 2130841561;
        }
        setThumb(com.ss.android.ugc.bytex.a.a.a.a(resources2, i2));
    }

    public void setPercent(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13414a, false, 8020, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13414a, false, 8020, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i >= 0 && i <= this.f13416c) {
            this.f13417d = i;
            a();
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f13414a, false, 8017, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{seekBar, Integer.valueOf(i), Byte.valueOf(z)}, this, f13414a, false, 8017, new Class[]{SeekBar.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (this.f13415b != null) {
                b();
            }
        }
    }
}
