package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.k;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent;

public class SystemViewHolder extends BaseViewHolder<SystemContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51152a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f51153b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51152a, false, 51650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51152a, false, 51650, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51153b = (TextView) a((int) C0906R.id.bnw);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f51152a, false, 51649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51152a, false, 51649, new Class[0], Void.TYPE);
            return;
        }
        super.c();
    }

    public SystemViewHolder(View view, int i) {
        super(view);
    }

    public final /* synthetic */ void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        SystemContent systemContent = (SystemContent) baseContent;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, systemContent, Integer.valueOf(i)}, this, f51152a, false, 51651, new Class[]{n.class, n.class, SystemContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, systemContent, Integer.valueOf(i)}, this, f51152a, false, 51651, new Class[]{n.class, n.class, SystemContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar3, nVar4, systemContent, i);
        k.a(systemContent, this.f51153b, this.o, this.h);
    }
}
