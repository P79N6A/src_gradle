package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Looper;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.poi.e.d;
import com.ss.android.ugc.aweme.poi.preview.b.b;
import com.ss.android.ugc.aweme.poi.preview.b.c;
import com.ss.android.ugc.aweme.poi.preview.transfer.h;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class j implements DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, DialogInterface.OnShowListener, h.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60215a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f60216b;

    /* renamed from: c  reason: collision with root package name */
    private Context f60217c;

    /* renamed from: d  reason: collision with root package name */
    private Dialog f60218d;

    /* renamed from: e  reason: collision with root package name */
    private h f60219e;

    /* renamed from: f  reason: collision with root package name */
    private g f60220f;
    private d g;

    public interface a {
        void a(ImageView imageView, int i);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65486, new Class[0], Void.TYPE);
            return;
        }
        this.f60219e = new h(this.f60217c);
        this.f60219e.setOnLayoutResetListener(this);
    }

    private String f() {
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65507, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65507, new Class[0], String.class);
        } else if (this.f60220f == null) {
            return null;
        } else {
            HashMap<String, String> hashMap = this.f60220f.z;
            if (hashMap != null) {
                return hashMap.get("poi_id");
            }
            return null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65497, new Class[0], Void.TYPE);
        } else if (!this.f60216b) {
            this.f60218d.show();
            this.f60216b = true;
        }
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65499, new Class[0], Void.TYPE);
        } else if (this.f60216b) {
            this.f60219e.dismiss(this.f60220f.f60180b);
            this.f60216b = false;
        }
    }

    private void d() {
        boolean z;
        long j;
        c cVar;
        b bVar;
        com.ss.android.ugc.aweme.poi.preview.a.c cVar2;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65489, new Class[0], Void.TYPE);
            return;
        }
        g gVar = this.f60220f;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[0], gVar, g.f60179a, false, 65449, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], gVar, g.f60179a, false, 65449, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (gVar.m == null || gVar.m.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            g gVar2 = this.f60220f;
            if (this.f60220f.f60180b >= 0) {
                i = this.f60220f.f60180b;
            }
            gVar2.f60180b = i;
            g gVar3 = this.f60220f;
            if (this.f60220f.f60181c > 0) {
                i2 = this.f60220f.f60181c;
            }
            gVar3.f60181c = i2;
            g gVar4 = this.f60220f;
            if (this.f60220f.g <= 0) {
                j = 300;
            } else {
                j = this.f60220f.g;
            }
            gVar4.g = j;
            g gVar5 = this.f60220f;
            if (this.f60220f.p == null) {
                cVar = new com.ss.android.ugc.aweme.poi.preview.b.b.a();
            } else {
                cVar = this.f60220f.p;
            }
            gVar5.p = cVar;
            g gVar6 = this.f60220f;
            if (this.f60220f.q == null) {
                bVar = new com.ss.android.ugc.aweme.poi.preview.b.a.a();
            } else {
                bVar = this.f60220f.q;
            }
            gVar6.q = bVar;
            g gVar7 = this.f60220f;
            if (this.f60220f.r == null) {
                cVar2 = new com.ss.android.ugc.aweme.poi.preview.a.a();
            } else {
                cVar2 = this.f60220f.r;
            }
            gVar7.r = cVar2;
            return;
        }
        throw new IllegalArgumentException("the parameter sourceImageList can't be empty");
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65490, new Class[0], Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f60220f.u != null) {
            a((List<ImageView>) arrayList);
        } else if (this.f60220f.t != null) {
            b(arrayList);
        } else if (this.f60220f.v != null) {
            if (PatchProxy.isSupport(new Object[]{arrayList}, this, f60215a, false, 65493, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList}, this, f60215a, false, 65493, new Class[]{List.class}, Void.TYPE);
            } else {
                ViewPager viewPager = this.f60220f.v;
                PagerAdapter adapter = viewPager.getAdapter();
                if (adapter instanceof b) {
                    b bVar = (b) adapter;
                    View a2 = bVar.a();
                    if (a2 != null) {
                        arrayList.add((ImageView) a2.findViewById(this.f60220f.s));
                    } else {
                        arrayList.add(null);
                    }
                    int currentItem = viewPager.getCurrentItem() % bVar.b();
                    a(arrayList, 1, currentItem, currentItem);
                } else {
                    throw new IllegalArgumentException("customized adapter should implement IViewPagerCurrentView");
                }
            }
        } else {
            c(arrayList);
        }
        this.f60220f.l = arrayList;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65502, new Class[0], Void.TYPE);
            return;
        }
        Dialog dialog = this.f60218d;
        if (PatchProxy.isSupport(new Object[]{dialog}, null, k.f60221a, true, 65508, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog}, null, k.f60221a, true, 65508, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            dialog.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        this.f60216b = false;
    }

    public static j a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f60215a, true, 65485, new Class[]{Context.class}, j.class)) {
            return new j(context2);
        }
        return (j) PatchProxy.accessDispatch(new Object[]{context2}, null, f60215a, true, 65485, new Class[]{Context.class}, j.class);
    }

    private j(Context context) {
        this.f60217c = context;
        this.g = new d();
        c();
        if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65487, new Class[0], Void.TYPE);
            return;
        }
        this.f60218d = new AlertDialog.Builder(this.f60217c, 16973840).setView((View) this.f60219e).create();
        this.f60218d.setOnShowListener(this);
        this.f60218d.setOnDismissListener(this);
        this.f60218d.setOnKeyListener(this);
    }

    private void a(List<ImageView> list) {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f60215a, false, 65491, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60215a, false, 65491, new Class[]{List.class}, Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.f60220f.u;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            list.add((ImageView) recyclerView.getChildAt(i3).findViewById(this.f60220f.s));
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        int itemCount = layoutManager.getItemCount();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i2 = gridLayoutManager.findFirstVisibleItemPosition();
            i = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.findFirstVisibleItemPosition();
            i = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            i = 0;
        }
        a(list, itemCount, i2, i);
    }

    private void b(List<ImageView> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f60215a, false, 65492, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f60215a, false, 65492, new Class[]{List.class}, Void.TYPE);
            return;
        }
        AbsListView absListView = this.f60220f.t;
        int childCount = absListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            list.add((ImageView) absListView.getChildAt(i).findViewById(this.f60220f.s));
        }
        a(list, absListView.getCount(), absListView.getFirstVisiblePosition(), absListView.getLastVisiblePosition());
    }

    private void c(List<ImageView> list) {
        List<ImageView> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f60215a, false, 65494, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f60215a, false, 65494, new Class[]{List.class}, Void.TYPE);
            return;
        }
        int size = this.f60220f.m.size();
        for (int i = 0; i < size; i++) {
            list2.add(null);
        }
    }

    public final j a(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f60215a, false, 65496, new Class[]{g.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{gVar}, this, f60215a, false, 65496, new Class[]{g.class}, j.class);
        }
        if (!this.f60216b) {
            this.f60220f = gVar;
            e();
            d();
            this.f60219e.f60196f = gVar;
        }
        return this;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        ao.a aVar;
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f60215a, false, 65504, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f60215a, false, 65504, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.poi.b.d(Boolean.TRUE, f()));
        if (this.g != null) {
            d dVar = this.g;
            Context context = this.f60217c;
            if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65505, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65505, new Class[0], String.class);
            } else {
                if (this.f60220f != null) {
                    HashMap<String, String> hashMap = this.f60220f.z;
                    if (hashMap != null) {
                        str = hashMap.get("enter_from");
                    }
                }
                str = "";
            }
            String str2 = str;
            if (PatchProxy.isSupport(new Object[0], this, f60215a, false, 65506, new Class[0], ao.a.class)) {
                aVar = (ao.a) PatchProxy.accessDispatch(new Object[0], this, f60215a, false, 65506, new Class[0], ao.a.class);
            } else {
                if (this.f60220f != null) {
                    HashMap<String, String> hashMap2 = this.f60220f.z;
                    if (hashMap2 != null) {
                        aVar = new ao.a(hashMap2.get("poi_id"), hashMap2.get("poi_type"), hashMap2.get("page_type"), hashMap2.get("group_id"), hashMap2.get("poi_backend_type"), hashMap2.get("poi_city"));
                    }
                }
                aVar = null;
            }
            dVar.a(context, str2, aVar);
        }
    }

    public void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f60215a, false, 65501, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f60215a, false, 65501, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        h hVar = this.f60219e;
        if (PatchProxy.isSupport(new Object[0], hVar, h.f60191a, false, 65462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], hVar, h.f60191a, false, 65462, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], hVar, h.f60191a, false, 65459, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], hVar, h.f60191a, false, 65459, new Class[0], Void.TYPE);
            } else {
                hVar.f60195e = new TransferAdapter(hVar, hVar.f60196f.m.size(), hVar.f60196f.f60180b);
                hVar.f60195e.f60140b = hVar.h;
                hVar.f60194d = new ViewPager(hVar.f60192b);
                hVar.f60194d.setVisibility(4);
                hVar.f60194d.setOffscreenPageLimit(hVar.f60196f.f60181c + 1);
                hVar.f60194d.setAdapter(hVar.f60195e);
                hVar.f60194d.setCurrentItem(hVar.f60196f.f60180b);
                hVar.addView(hVar.f60194d, new FrameLayout.LayoutParams(-1, -1));
            }
            int i = hVar.f60196f.f60180b;
            if (i < 0) {
                n.a("poi_log", "", com.ss.android.ugc.aweme.app.d.c.a().a("service", "preview").a("status", hVar.f60196f.y).b());
                i = 0;
            }
            hVar.f60193c = hVar.a(i).a(i);
        }
        bg.a(new com.ss.android.ugc.aweme.poi.b.d(Boolean.FALSE, f()));
        if (this.g != null) {
            this.g.a();
        }
    }

    public j(Context context, int i) {
        this.f60217c = context;
        c();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60215a, false, 65488, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60215a, false, 65488, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f60218d = new AlertDialog.Builder(this.f60217c, i).setView((View) this.f60219e).create();
        this.f60218d.setOnShowListener(this);
        this.f60218d.setOnKeyListener(this);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f60215a, false, 65503, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f60215a, false, 65503, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
            dismiss();
        }
        return true;
    }

    private void a(List<ImageView> list, int i, int i2, int i3) {
        List<ImageView> list2 = list;
        int i4 = i;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60215a, false, 65495, new Class[]{List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60215a, false, 65495, new Class[]{List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 > 0) {
            for (int i6 = i2; i6 > 0; i6--) {
                list2.add(0, null);
            }
        }
        if (i5 < i4) {
            for (int i7 = (i4 - 1) - i5; i7 > 0; i7--) {
                list2.add(null);
            }
        }
    }
}
