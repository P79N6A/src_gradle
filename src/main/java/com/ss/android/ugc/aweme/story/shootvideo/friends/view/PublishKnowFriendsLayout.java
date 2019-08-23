package com.ss.android.ugc.aweme.story.shootvideo.friends.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.c;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a.k;
import com.ss.android.ugc.aweme.story.shootvideo.friends.adapter.a;
import java.util.ArrayList;
import java.util.List;

public class PublishKnowFriendsLayout extends d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73587a;
    private c j;
    private boolean k;

    public final void a(k kVar, boolean z) {
    }

    public int getLayoutType() {
        return 1;
    }

    public final void al_() {
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85343, new Class[0], Void.TYPE);
            return;
        }
        if (this.f73603f != null) {
            this.f73603f.a(this.f73603f.f73561b);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85334, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.j = new c();
        this.j.a(this);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85335, new Class[0], Void.TYPE);
            return;
        }
        h();
    }

    public String getTitleStr() {
        if (!PatchProxy.isSupport(new Object[0], this, f73587a, false, 85336, new Class[0], String.class)) {
            return getResources().getString(C0906R.string.cfo);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85336, new Class[0], String.class);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85339, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        this.j.a(true);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85342, new Class[0], Void.TYPE);
            return;
        }
        this.j.a(false);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85337, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85337, new Class[0], Void.TYPE);
            return;
        }
        List<k> list = this.f73603f.f73561b;
        if (!com.bytedance.framwork.core.c.a.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (k next : list) {
                if (next.f73552b) {
                    arrayList.add(next);
                }
            }
            if (this.g != null) {
                this.g.a(arrayList);
            }
            return;
        }
        if (this.g != null) {
            this.g.a(null);
        }
    }

    public final void h() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f73587a, false, 85338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73587a, false, 85338, new Class[0], Void.TYPE);
        } else if (!this.k) {
            this.k = true;
            b bVar = new b(this.f73600c);
            addView(bVar);
            bVar.setSelectFriendListener(this);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (k next : this.f73603f.f73561b) {
                if (!next.f73554d) {
                    arrayList.add(next);
                    if (next.f73552b) {
                        i++;
                    }
                } else {
                    arrayList2.add(next);
                }
            }
            bVar.a((List<k>) arrayList, this.h);
            bVar.c((View) bVar);
            postDelayed(new a(this, arrayList2), 500);
            this.h -= i;
        }
    }

    public PublishKnowFriendsLayout(@NonNull Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(List list) {
        this.f73603f.a(list);
        this.k = false;
    }

    public final void a(List<k> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f73587a, false, 85340, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f73587a, false, 85340, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null) {
            this.f73603f.f73561b.addAll(list);
            this.f73603f.notifyDataSetChanged();
            this.h += list.size();
        }
    }

    public final void b(List<k> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f73587a, false, 85341, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f73587a, false, 85341, new Class[]{List.class}, Void.TYPE);
            return;
        }
        List<k> list2 = this.f73603f.f73561b;
        if (list != null) {
            this.h = list.size();
        } else {
            this.h = 0;
        }
        ArrayList<k> arrayList = new ArrayList<>();
        for (k next : list2) {
            if (next.f73554d) {
                next.f73552b = false;
                arrayList.add(next);
            }
        }
        if (this.h > 0) {
            ArrayList<k> arrayList2 = new ArrayList<>();
            ArrayList<k> arrayList3 = new ArrayList<>();
            for (k next2 : list) {
                if (next2.f73554d) {
                    arrayList2.add(next2);
                } else {
                    arrayList3.add(next2);
                }
            }
            if (arrayList2.size() > 0) {
                for (k kVar : arrayList) {
                    for (k kVar2 : arrayList2) {
                        if (kVar.f73551a.getUid().equals(kVar2.f73551a.getUid())) {
                            kVar.f73552b = true;
                        }
                    }
                }
            }
            if (arrayList3.size() > 0) {
                for (k kVar3 : arrayList3) {
                    kVar3.f73552b = true;
                    arrayList.add(kVar3);
                }
            }
        }
        this.f73603f.a(arrayList);
    }

    public PublishKnowFriendsLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
