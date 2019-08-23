package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44950a;

    /* renamed from: b  reason: collision with root package name */
    final DataCenter f44951b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f44952c;

    /* renamed from: d  reason: collision with root package name */
    private final TagLayout f44953d;

    static boolean a(int i) {
        return i == 7;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44950a, false, 40551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44950a, false, 40551, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44950a, false, 40552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44950a, false, 40552, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44952c != null && this.f44952c.getRelationLabel() != null && this.f44952c.getRelationLabel().getType() == 1 && !TextUtils.isEmpty(this.f44952c.getRelationLabel().getLabelInfo())) {
            l lVar = new l(this);
            if (this.f44953d != null) {
                this.f44953d.a(this.f44952c.getForwardItem(), this.f44952c.getRelationLabel().getLabelInfo(), new TagLayout.a(7, 20), lVar);
            }
        }
    }

    k(DataCenter dataCenter, TagLayout tagLayout) {
        this.f44951b = dataCenter;
        this.f44953d = tagLayout;
    }
}
