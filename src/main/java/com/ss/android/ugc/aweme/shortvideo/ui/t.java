package com.ss.android.ugc.aweme.shortvideo.ui;

import android.support.annotation.Nullable;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.d;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import com.ss.android.ugc.aweme.setting.serverpush.b.e;
import java.util.HashMap;

public final class t implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70922a;

    /* renamed from: b  reason: collision with root package name */
    SettingItemSwitch f70923b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    HashMap<String, String> f70924c;

    /* renamed from: d  reason: collision with root package name */
    c f70925d;

    /* renamed from: e  reason: collision with root package name */
    private e f70926e = new e();

    public final void d_(Exception exc) {
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f70922a, false, 80283, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f70922a, false, 80283, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f70925d = cVar;
        if (!(this.f70923b == null || this.f70925d == null || this.f70925d.k != d.f63936e)) {
            this.f70923b.setChecked(true);
            this.f70923b.setAlpha(0.66f);
        }
    }

    public t(SettingItemSwitch settingItemSwitch, boolean z, @Nullable HashMap<String, String> hashMap) {
        this.f70923b = settingItemSwitch;
        this.f70924c = hashMap;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70922a, false, 80284, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70922a, false, 80284, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (d.a()) {
            this.f70923b.setVisibility(0);
            this.f70923b.setChecked(z);
            this.f70923b.setOnSettingItemClickListener(new u(this));
            this.f70926e = new e();
            this.f70926e.a(this);
            this.f70926e.a(new Object[0]);
        } else {
            this.f70923b.setVisibility(8);
        }
    }
}
