package com.ss.android.ugc.aweme.property;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.g;

public final class c extends SettingItemSwitch {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63276b;

    /* renamed from: c  reason: collision with root package name */
    a.C0682a f63277c;

    public final void toggle() {
        if (PatchProxy.isSupport(new Object[0], this, f63276b, false, 70202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63276b, false, 70202, new Class[0], Void.TYPE);
            return;
        }
        setChecked(!isChecked());
    }

    public c(Context context) {
        super(context);
    }

    public final void setAVABProperty(@NonNull a.C0682a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f63276b, false, 70200, new Class[]{a.C0682a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f63276b, false, 70200, new Class[]{a.C0682a.class}, Void.TYPE);
        } else if (aVar == null) {
            throw new NullPointerException();
        } else if (aVar.type() == g.b.Boolean) {
            this.f63277c = aVar;
            setChecked(com.ss.android.ugc.aweme.port.in.a.M.a(aVar));
            setStartText(aVar.key());
            setOnSettingItemClickListener(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63278a;

                public final void OnSettingItemClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f63278a, false, 70203, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f63278a, false, 70203, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    c.this.toggle();
                }
            });
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void setChecked(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63276b, false, 70201, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63276b, false, 70201, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setChecked(z);
        com.ss.android.ugc.aweme.port.in.a.M.a(this.f63277c, z);
    }
}
