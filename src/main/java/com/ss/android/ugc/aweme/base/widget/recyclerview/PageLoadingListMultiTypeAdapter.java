package com.ss.android.ugc.aweme.base.widget.recyclerview;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.e;
import com.ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.ss.android.ugc.aweme.base.widget.recyclerview.a.a;
import com.ss.android.ugc.aweme.base.widget.recyclerview.a.b;

public abstract class PageLoadingListMultiTypeAdapter extends MultiTypeAdapter<e> implements b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f35184b;

    /* renamed from: c  reason: collision with root package name */
    public a f35185c;

    /* renamed from: d  reason: collision with root package name */
    private BaseRecyclerView f35186d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView.OnScrollListener f35187e;

    @NonNull
    public final e a() {
        if (!PatchProxy.isSupport(new Object[0], this, f35184b, false, 25585, new Class[0], e.class)) {
            return new com.ss.android.ugc.aweme.base.widget.commonitem.a.b();
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, f35184b, false, 25585, new Class[0], e.class);
    }

    @NonNull
    public e b() {
        if (!PatchProxy.isSupport(new Object[0], this, f35184b, false, 25586, new Class[0], e.class)) {
            return new com.ss.android.ugc.aweme.base.widget.commonitem.a.a("已显示全部内容");
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, f35184b, false, 25586, new Class[0], e.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f35184b, false, 25587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35184b, false, 25587, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f35185c;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f35194a, false, 25608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f35194a, false, 25608, new Class[0], Void.TYPE);
            return;
        }
        if (aVar.f35198e != null) {
            int indexOf = aVar.f35195b.indexOf(aVar.f35198e);
            if (indexOf != -1) {
                aVar.f35195b.remove(indexOf);
                aVar.f35196c.notifyItemRemoved(indexOf);
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f35184b, false, 25594, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35184b, false, 25594, new Class[0], Void.TYPE);
            return;
        }
        BaseRecyclerView baseRecyclerView = this.f35186d;
        if (PatchProxy.isSupport(new Object[0], baseRecyclerView, BaseRecyclerView.f35064a, false, 25382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], baseRecyclerView, BaseRecyclerView.f35064a, false, 25382, new Class[0], Void.TYPE);
            return;
        }
        if (baseRecyclerView.getChildCount() > 0) {
            baseRecyclerView.scrollToPosition(baseRecyclerView.getAdapter().getItemCount() - 1);
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f35184b, false, 25588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35184b, false, 25588, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f35185c;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f35194a, false, 25609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f35194a, false, 25609, new Class[0], Void.TYPE);
            return;
        }
        if (aVar.f35197d) {
            aVar.f35197d = false;
            if (!aVar.f35195b.isEmpty()) {
                if (PatchProxy.isSupport(new Object[0], aVar, a.f35194a, false, 25610, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f35194a, false, 25610, new Class[0], Void.TYPE);
                } else if (aVar.b() != null) {
                    int indexOf = aVar.f35195b.indexOf(aVar.b());
                    if (indexOf != -1) {
                        aVar.f35195b.remove(indexOf);
                        aVar.f35196c.notifyItemRemoved(indexOf);
                    }
                    aVar.f35195b.add(aVar.b());
                    aVar.f35196c.notifyItemInserted(aVar.f35195b.size() - 1);
                }
            }
        }
    }

    @CallSuper
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35184b, false, 25590, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35184b, false, 25590, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (recyclerView instanceof BaseRecyclerView) {
            BaseRecyclerView baseRecyclerView = (BaseRecyclerView) recyclerView;
            this.f35186d = baseRecyclerView;
            super.onAttachedToRecyclerView(recyclerView);
            if (PatchProxy.isSupport(new Object[]{baseRecyclerView}, this, f35184b, false, 25593, new Class[]{BaseRecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseRecyclerView}, this, f35184b, false, 25593, new Class[]{BaseRecyclerView.class}, Void.TYPE);
                return;
            }
            baseRecyclerView.addOnScrollListener(this.f35187e);
        } else {
            throw new IllegalArgumentException("RecyclerView to hold PageLoadingListMultiTypeAdapter must be a " + BaseRecyclerView.class.getName() + " !");
        }
    }

    @CallSuper
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35184b, false, 25591, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35184b, false, 25591, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (recyclerView instanceof BaseRecyclerView) {
            this.f35186d = null;
            super.onDetachedFromRecyclerView(recyclerView);
            BaseRecyclerView baseRecyclerView = (BaseRecyclerView) recyclerView;
            if (PatchProxy.isSupport(new Object[]{baseRecyclerView}, this, f35184b, false, 25592, new Class[]{BaseRecyclerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{baseRecyclerView}, this, f35184b, false, 25592, new Class[]{BaseRecyclerView.class}, Void.TYPE);
                return;
            }
            baseRecyclerView.removeOnScrollListener(this.f35187e);
        } else {
            throw new IllegalArgumentException("RecyclerView to hold PageLoadingListMultiTypeAdapter must be a " + BaseRecyclerView.class.getName() + " !");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PageLoadingListMultiTypeAdapter(android.content.Context r20, java.util.List<com.ss.android.ugc.aweme.base.mvvm.e> r21, java.util.Map<java.lang.Class, java.lang.Class> r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.base.widget.recyclerview.a.a.f35194a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r9[r11] = r5
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
            r5 = 0
            r7 = 1
            r8 = 25611(0x640b, float:3.5889E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x003e
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r11] = r2
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.base.widget.recyclerview.a.a.f35194a
            r15 = 1
            r16 = 25611(0x640b, float:3.5889E-41)
            java.lang.Class[] r2 = new java.lang.Class[r3]
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            r2[r11] = r3
            java.lang.Class<java.util.Map> r18 = java.util.Map.class
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.Map r2 = (java.util.Map) r2
        L_0x003a:
            r3 = r2
            r2 = r20
            goto L_0x005d
        L_0x003e:
            java.lang.Class<com.ss.android.ugc.aweme.base.widget.commonitem.a.b> r3 = com.ss.android.ugc.aweme.base.widget.commonitem.a.b.class
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L_0x004d
            java.lang.Class<com.ss.android.ugc.aweme.base.widget.commonitem.a.b> r3 = com.ss.android.ugc.aweme.base.widget.commonitem.a.b.class
            java.lang.Class<com.ss.android.ugc.aweme.base.widget.commonitem.SimpleLoadMoreProgressBar> r4 = com.ss.android.ugc.aweme.base.widget.commonitem.SimpleLoadMoreProgressBar.class
            r2.put(r3, r4)
        L_0x004d:
            java.lang.Class<com.ss.android.ugc.aweme.base.widget.commonitem.a.a> r3 = com.ss.android.ugc.aweme.base.widget.commonitem.a.a.class
            java.lang.Object r3 = r2.get(r3)
            if (r3 != 0) goto L_0x003a
            java.lang.Class<com.ss.android.ugc.aweme.base.widget.commonitem.a.a> r3 = com.ss.android.ugc.aweme.base.widget.commonitem.a.a.class
            java.lang.Class<com.ss.android.ugc.aweme.base.widget.commonitem.NoMoreTextHintView> r4 = com.ss.android.ugc.aweme.base.widget.commonitem.NoMoreTextHintView.class
            r2.put(r3, r4)
            goto L_0x003a
        L_0x005d:
            r0.<init>(r2, r1, r3)
            com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter$1 r2 = new com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter$1
            r2.<init>()
            r0.f35187e = r2
            com.ss.android.ugc.aweme.base.widget.recyclerview.a.a r2 = new com.ss.android.ugc.aweme.base.widget.recyclerview.a.a
            r2.<init>(r1, r0)
            r0.f35185c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.widget.recyclerview.PageLoadingListMultiTypeAdapter.<init>(android.content.Context, java.util.List, java.util.Map):void");
    }
}
