package com.bytedance.android.live.core.setting;

import android.content.DialogInterface;
import com.bytedance.android.live.core.setting.SettingFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8173a;

    /* renamed from: b  reason: collision with root package name */
    private final SettingFragment.AnonymousClass1 f8174b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f8175c;

    /* renamed from: d  reason: collision with root package name */
    private final l f8176d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8177e;

    j(SettingFragment.AnonymousClass1 r1, String[] strArr, l lVar, int i) {
        this.f8174b = r1;
        this.f8175c = strArr;
        this.f8176d = lVar;
        this.f8177e = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f8173a, false, 925, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f8173a, false, 925, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SettingFragment.AnonymousClass1 r0 = this.f8174b;
        String[] strArr = this.f8175c;
        l lVar = this.f8176d;
        int i2 = this.f8177e;
        if (i >= 0) {
            if (i == strArr.length) {
                m.a(lVar, null);
            } else {
                m.a(lVar, strArr[i].split(":")[0]);
            }
            r0.notifyItemChanged(i2);
        }
        dialogInterface.dismiss();
    }
}
