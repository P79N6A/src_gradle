package com.ss.android.ugc.aweme.profile.presenter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import java.util.List;

public final class v extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61654a;

    /* renamed from: b  reason: collision with root package name */
    public String f61655b;
    private Object[] g;

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f61654a, false, 67598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61654a, false, 67598, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null) {
            int i = ((a) this.f2978e).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (TextUtils.equals(this.f61655b, ((b) this.f2978e).f61593c)) {
                            if (((a) this.f2978e).isDataEmpty()) {
                                ((c) this.f2979f).y_();
                                return;
                            } else {
                                ((c) this.f2979f).a(((a) this.f2978e).getItems(), ((a) this.f2978e).isHasMore());
                                return;
                            }
                        } else if (this.g != null && this.g.length > 2 && (this.g[2] instanceof String) && TextUtils.equals((String) this.g[2], this.f61655b)) {
                            super.a(this.g);
                            return;
                        }
                    case 2:
                        ((c) this.f2979f).c(((a) this.f2978e).getItems(), !((a) this.f2978e).isNewDataEmpty());
                        break;
                }
                return;
            }
            c cVar = (c) this.f2979f;
            List items = ((a) this.f2978e).getItems();
            if (((a) this.f2978e).isHasMore() && !((a) this.f2978e).isNewDataEmpty()) {
                z = true;
            }
            cVar.b(items, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f61654a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 67597(0x1080d, float:9.4724E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f61654a
            r13 = 0
            r14 = 67597(0x1080d, float:9.4724E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            r1 = r17
            r1.g = r0
            boolean r0 = super.a((java.lang.Object[]) r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.v.a(java.lang.Object[]):boolean");
    }
}
