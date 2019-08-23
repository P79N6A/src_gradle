package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Activity;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.sharedpref.f;

public final /* synthetic */ class ak implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70761a;

    /* renamed from: b  reason: collision with root package name */
    private final PermissionSettingItem f70762b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f70763c;

    /* renamed from: d  reason: collision with root package name */
    private final f f70764d;

    /* renamed from: e  reason: collision with root package name */
    private final String f70765e;

    ak(PermissionSettingItem permissionSettingItem, Activity activity, f fVar, String str) {
        this.f70762b = permissionSettingItem;
        this.f70763c = activity;
        this.f70764d = fVar;
        this.f70765e = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70761a, false, 80475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70761a, false, 80475, new Class[0], Void.TYPE);
            return;
        }
        PermissionSettingItem permissionSettingItem = this.f70762b;
        Activity activity = this.f70763c;
        f fVar = this.f70764d;
        String str = this.f70765e;
        if (permissionSettingItem.getVisibility() == 0 && !activity.isFinishing()) {
            View findViewById = permissionSettingItem.findViewById(C0906R.id.c6l);
            if (findViewById != null) {
                b a2 = new b.a(activity).b((int) C0906R.string.aif).c(activity.getResources().getColor(C0906R.color.aik)).a(3000).a(true).a();
                a2.a(findViewById, 48, ((float) (a2.d() - findViewById.getMeasuredWidth())) - UIUtils.dip2Px(activity, 28.0f), (findViewById.getMeasuredWidth() - a2.d()) + ((int) UIUtils.dip2Px(activity, 20.0f)));
                fVar.b(str, true);
            }
        }
    }
}
