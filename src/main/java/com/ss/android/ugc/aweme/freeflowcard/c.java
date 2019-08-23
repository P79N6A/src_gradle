package com.ss.android.ugc.aweme.freeflowcard;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.freeflowcard.b.a;
import com.ss.android.ugc.aweme.freeflowcard.b.d;
import com.ss.android.ugc.aweme.freeflowcard.b.e;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48593a;

    /* renamed from: b  reason: collision with root package name */
    public a f48594b;

    /* renamed from: c  reason: collision with root package name */
    public String f48595c;

    /* renamed from: d  reason: collision with root package name */
    private b f48596d;

    /* renamed from: e  reason: collision with root package name */
    private Context f48597e;

    public c(Context context) throws IllegalArgumentException {
        a aVar;
        if (context != null) {
            this.f48597e = context;
            this.f48596d = b.a();
            Resources resources = context.getResources();
            String string = resources.getString(C0906R.string.drf);
            String string2 = resources.getString(C0906R.string.ahv);
            String str = !TextUtils.isEmpty(this.f48596d.f48579d) ? this.f48596d.f48579d : string;
            String str2 = !TextUtils.isEmpty(this.f48596d.f48580e) ? this.f48596d.f48580e : string2;
            int i = this.f48596d.h;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48593a, false, 46031, new Class[]{Integer.TYPE}, a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48593a, false, 46031, new Class[]{Integer.TYPE}, a.class);
            } else {
                aVar = m.a().b() ? new e(this.f48597e) : new com.ss.android.ugc.aweme.freeflowcard.b.c(this.f48597e);
                if (TextUtils.isEmpty(b.a().c())) {
                    aVar = new d(this.f48597e);
                }
            }
            this.f48594b = aVar;
            this.f48594b.a(str);
            this.f48594b.b(str2);
            this.f48594b.i = this.f48596d.c();
            this.f48594b.c(resources.getString(C0906R.string.a1z));
            this.f48594b.d(resources.getString(C0906R.string.ce4));
            this.f48594b.e(this.f48596d.g);
            return;
        }
        throw new IllegalArgumentException("context is empty");
    }
}
