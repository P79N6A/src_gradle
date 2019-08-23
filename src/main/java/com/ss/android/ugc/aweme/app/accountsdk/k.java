package com.ss.android.ugc.aweme.app.accountsdk;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.account.e.a;
import com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.j;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Arrays;

public final class k extends h {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f33734b;

    /* renamed from: c  reason: collision with root package name */
    private String f33735c;

    public k(f fVar) {
        super(fVar);
    }

    public k(String str) {
        super(null);
        this.f33735c = str;
    }

    public final void a(int i, int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f33734b, false, 22998, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f33734b, false, 22998, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        super.a(i, i2, obj);
        if (i == 7 && i2 == 1) {
            if (!ap.b(com.ss.android.ugc.aweme.app.k.g())) {
                if (Arrays.asList(new String[]{"setting", "personal_home", "live", "comment", "post"}).contains(this.f33735c)) {
                    Activity e2 = p.a().e();
                    Intent intent = new Intent(com.ss.android.ugc.aweme.app.k.g(), RequestContactsPermissionAfterBindPhone.class);
                    intent.putExtra("ENTER_REASON", this.f33735c);
                    e2.startActivity(intent);
                }
            }
            d.a().getCurUser().setPhoneBinded(true);
        }
        if (obj2 instanceof j) {
            j jVar = (j) obj2;
            d.a().getCurUser().setBindPhone(jVar.f50722b);
            bg.a(new a(jVar.f50722b, jVar.f50723c));
        }
    }
}
