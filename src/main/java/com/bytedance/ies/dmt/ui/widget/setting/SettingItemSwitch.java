package com.bytedance.ies.dmt.ui.widget.setting;

import android.content.Context;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.bytedance.ies.dmt.ui.common.b;
import com.ss.android.ugc.aweme.C0906R;

public class SettingItemSwitch extends b implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    protected Checkable f20512a;

    /* access modifiers changed from: protected */
    public int getRightLayoutId() {
        return C0906R.layout.apc;
    }

    public final boolean a() {
        return isChecked();
    }

    public final boolean b() {
        return isChecked();
    }

    public boolean isChecked() {
        return this.f20512a.isChecked();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public SettingItemSwitch(Context context) {
        super(context);
    }

    public void setChecked(boolean z) {
        this.f20512a.setChecked(z);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        int i;
        int i2;
        super.a(context);
        this.f20512a = (Checkable) this.f20517f.findViewById(C0906R.id.cew);
        if (b.a(context)) {
            i = C0906R.color.ge;
        } else {
            i = C0906R.color.gf;
        }
        if (b.a(context)) {
            i2 = C0906R.color.gc;
        } else {
            i2 = C0906R.color.gd;
        }
        ((SwitchCompat) this.f20512a).setTrackTintList(AppCompatResources.getColorStateList(getContext(), i));
        ((SwitchCompat) this.f20512a).setThumbTintList(AppCompatResources.getColorStateList(getContext(), i2));
    }

    public SettingItemSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SettingItemSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
