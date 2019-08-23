package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;
import com.bytedance.android.live.gift.d;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.event.ab;
import com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.combo.DouyinGiftCombHelper;
import com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.c;
import com.bytedance.android.livesdk.gift.model.a.f;
import com.bytedance.android.livesdk.gift.model.a.g;
import com.bytedance.android.livesdk.gift.model.a.h;
import com.bytedance.android.livesdk.gift.model.a.i;
import com.bytedance.android.livesdk.gift.model.a.j;
import com.bytedance.android.livesdk.gift.model.a.k;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.gift.q;
import com.bytedance.android.livesdk.gift.u;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.utils.eq;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GiftPanelListWidget extends Widget implements AbsGiftAdapter.a, q.a, u.a, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15312a;
    private Disposable A;
    private d B = new d() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15318a;

        public final void a(List<b> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f15318a, false, 10058, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f15318a, false, 10058, new Class[]{List.class}, Void.TYPE);
            } else if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                if (GiftPanelListWidget.this.f15313b.f15265d == GiftDialogViewModel.d.GUEST) {
                    GiftManager.filterInteractNotSupportGift(arrayList, GiftPanelListWidget.this.f15317f);
                } else {
                    GiftManager.filterNotSupportGift(arrayList, GiftPanelListWidget.this.f15317f);
                }
                GiftManager.filterNotDisplayedOnPanel(arrayList);
                GiftPanelListWidget.this.b((List<b>) arrayList);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public GiftDialogViewModel f15313b;

    /* renamed from: c  reason: collision with root package name */
    AbsGiftAdapter f15314c;

    /* renamed from: d  reason: collision with root package name */
    DouyinGiftCombHelper f15315d;

    /* renamed from: e  reason: collision with root package name */
    Handler f15316e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    public boolean f15317f;
    ab g = ab.GIFT;
    int h;
    public int i;
    int j = ((Integer) com.bytedance.android.livesdk.config.a.G.a()).intValue();
    com.bytedance.android.livesdk.gift.model.a.b k;
    List<com.bytedance.android.livesdk.gift.model.a.b> l = new ArrayList();
    private LoadingStatusView m;
    private RecyclerView n;
    private RtlViewPagerShower o;
    private Room p;
    private boolean q;
    private boolean r;
    private int s;
    private View t;
    private boolean u;
    private List<f> v = new ArrayList();
    private List<f> w = new ArrayList();
    private List<h> x = new ArrayList();
    private SparseArray<c> y = new SparseArray<>();
    private b z;

    class GiftSSGridLayoutManager extends SSGridLayoutManager {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f15328b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15329c = true;

        public boolean canScrollHorizontally() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f15328b, false, 10065, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15328b, false, 10065, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (super.canScrollHorizontally() && this.f15329c) {
                z = true;
            }
            return z;
        }

        public boolean canScrollVertically() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f15328b, false, 10066, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15328b, false, 10066, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (super.canScrollVertically() && this.f15329c) {
                z = true;
            }
            return z;
        }

        public GiftSSGridLayoutManager(Context context, int i, int i2, boolean z) {
            super(context, 2, 0, false);
        }
    }

    enum a {
        DATA_TYPE_GIFT,
        DATA_TYPE_PROP,
        DATA_TYPE_BANNER;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public int getLayoutId() {
        return C0906R.layout.ag4;
    }

    /* access modifiers changed from: package-private */
    public void a(ab abVar) {
        if (PatchProxy.isSupport(new Object[]{abVar}, this, f15312a, false, 10029, new Class[]{ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar}, this, f15312a, false, 10029, new Class[]{ab.class}, Void.TYPE);
            return;
        }
        this.f15314c.a();
        switch (abVar) {
            case GIFT:
                d(a());
                return;
            case FANS_CLUB_GIFT:
                d(b());
                return;
            case PROP:
                d(c());
                return;
            default:
                d(a());
                return;
        }
    }

    public final void a(List<Prop> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15312a, false, 10050, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15312a, false, 10050, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f15312a, false, 10038, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f15312a, false, 10038, new Class[]{List.class}, Void.TYPE);
            } else if (list != null && !list.isEmpty()) {
                this.x.clear();
                for (Prop hVar : list) {
                    this.x.add(new h(hVar));
                }
                a(a.DATA_TYPE_PROP);
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.l.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15312a, false, 10051, new Class[]{com.bytedance.android.livesdkapi.l.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15312a, false, 10051, new Class[]{com.bytedance.android.livesdkapi.l.a.class}, Void.TYPE);
            return;
        }
        a(a.DATA_TYPE_PROP);
    }

    private List<com.bytedance.android.livesdk.gift.model.a.b> b() {
        if (PatchProxy.isSupport(new Object[0], this, f15312a, false, 10031, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f15312a, false, 10031, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.w);
        return arrayList;
    }

    private List<com.bytedance.android.livesdk.gift.model.a.b> c() {
        if (PatchProxy.isSupport(new Object[0], this, f15312a, false, 10032, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f15312a, false, 10032, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.z != null) {
            arrayList.add(new j(this.z));
        }
        arrayList.addAll(this.x);
        if (this.k != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                com.bytedance.android.livesdk.gift.model.a.b bVar = (com.bytedance.android.livesdk.gift.model.a.b) it2.next();
                if (bVar.f15095a == this.k.f15095a && bVar.o() == this.k.o()) {
                    bVar.f15096b = true;
                    this.k = bVar;
                    break;
                }
            }
        }
        return arrayList;
    }

    private List<com.bytedance.android.livesdk.gift.model.a.b> a() {
        if (PatchProxy.isSupport(new Object[0], this, f15312a, false, 10030, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f15312a, false, 10030, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.v);
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            if (!arrayList.contains(this.y.valueAt(i2))) {
                if (this.y.keyAt(i2) < 0) {
                    arrayList.add(0, this.y.valueAt(i2));
                } else {
                    arrayList.add(Math.min(arrayList.size(), this.y.keyAt(i2)), this.y.valueAt(i2));
                }
            }
        }
        LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            com.bytedance.android.livesdk.gift.model.a.b bVar = (com.bytedance.android.livesdk.gift.model.a.b) arrayList.get(i3);
            if (bVar.f15095a == 1) {
                longSparseArray.append(bVar.o(), Integer.valueOf(i3 + 1));
            }
        }
        this.f15313b.C = longSparseArray;
        return arrayList;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15312a, false, 10043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15312a, false, 10043, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f15313b != null) {
            this.f15313b.a(this);
        }
        q a2 = q.a();
        if (PatchProxy.isSupport(new Object[]{this}, a2, q.f15399a, false, 9309, new Class[]{q.a.class}, Void.TYPE)) {
            q qVar = a2;
            PatchProxy.accessDispatch(new Object[]{this}, qVar, q.f15399a, false, 9309, new Class[]{q.a.class}, Void.TYPE);
        } else if (a2.f15402c.contains(this)) {
            a2.f15402c.remove(this);
        }
        u a3 = u.a();
        if (PatchProxy.isSupport(new Object[]{this}, a3, u.f15473a, false, 9319, new Class[]{u.a.class}, Void.TYPE)) {
            u uVar = a3;
            PatchProxy.accessDispatch(new Object[]{this}, uVar, u.f15473a, false, 9319, new Class[]{u.a.class}, Void.TYPE);
        } else if (a3.f15477d.contains(this)) {
            a3.f15477d.remove(this);
        }
        if (this.A != null && !this.A.isDisposed()) {
            this.A.dispose();
        }
    }

    /* JADX WARNING: type inference failed for: r6v8, types: [com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r17 = this;
            r7 = r17
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 10025(0x2729, float:1.4048E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10025(0x2729, float:1.4048E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            super.onCreate()
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            if (r0 != 0) goto L_0x002f
            return
        L_0x002f:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.dataCenter
            java.lang.String r1 = "data_gift_dialog_view_model"
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = (com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel) r0
            r7.f15313b = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r0.f15267f
            r7.p = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            boolean r0 = r0.f15264c
            r7.q = r0
            boolean r0 = r7.q
            r9 = 1
            if (r0 == 0) goto L_0x0054
            boolean r0 = com.bytedance.android.live.uikit.a.a.f()
            if (r0 != 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            r7.r = r0
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            boolean r0 = r0.f15263b
            r7.f15317f = r0
            com.bytedance.android.livesdk.gift.q r0 = com.bytedance.android.livesdk.gift.q.a()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.q.f15399a
            r13 = 0
            r14 = 9308(0x245c, float:1.3043E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.gift.q$a> r1 = com.bytedance.android.livesdk.gift.q.a.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x008f
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.q.f15399a
            r13 = 0
            r14 = 9308(0x245c, float:1.3043E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.gift.q$a> r1 = com.bytedance.android.livesdk.gift.q.a.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x009c
        L_0x008f:
            java.util.List<com.bytedance.android.livesdk.gift.q$a> r1 = r0.f15402c
            boolean r1 = r1.contains(r7)
            if (r1 != 0) goto L_0x009c
            java.util.List<com.bytedance.android.livesdk.gift.q$a> r0 = r0.f15402c
            r0.add(r7)
        L_0x009c:
            com.bytedance.android.livesdk.gift.u r0 = com.bytedance.android.livesdk.gift.u.a()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.u.f15473a
            r13 = 0
            r14 = 9318(0x2466, float:1.3057E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.gift.u$a> r1 = com.bytedance.android.livesdk.gift.u.a.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x00ce
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.u.f15473a
            r13 = 0
            r14 = 9318(0x2466, float:1.3057E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.gift.u$a> r1 = com.bytedance.android.livesdk.gift.u.a.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00db
        L_0x00ce:
            java.util.List<com.bytedance.android.livesdk.gift.u$a> r1 = r0.f15477d
            boolean r1 = r1.contains(r7)
            if (r1 != 0) goto L_0x00db
            java.util.List<com.bytedance.android.livesdk.gift.u$a> r0 = r0.f15477d
            r0.add(r7)
        L_0x00db:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10026(0x272a, float:1.405E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0100
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10026(0x272a, float:1.405E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02c2
        L_0x0100:
            android.view.View r0 = r7.contentView
            r1 = 2131170110(0x7f07133e, float:1.795457E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView r0 = (com.bytedance.android.live.uikit.recyclerview.LoadingStatusView) r0
            r7.m = r0
            android.view.View r0 = r7.contentView
            r1 = 2131168048(0x7f070b30, float:1.7950387E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r7.n = r0
            boolean r0 = r7.q
            if (r0 == 0) goto L_0x0128
            com.bytedance.android.livesdk.gift.impl.GiftAdapter r0 = new com.bytedance.android.livesdk.gift.impl.GiftAdapter
            android.content.Context r1 = r7.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.p
            r0.<init>(r1, r2, r7)
            goto L_0x0131
        L_0x0128:
            com.bytedance.android.livesdk.gift.impl.LandGiftAdapter r0 = new com.bytedance.android.livesdk.gift.impl.LandGiftAdapter
            android.content.Context r1 = r7.context
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.p
            r0.<init>(r1, r2, r7)
        L_0x0131:
            r7.f15314c = r0
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r0 = r7.f15314c
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r1 = r7.f15313b
            boolean r1 = r1.i
            r0.f15036e = r1
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r0 = r7.f15314c
            com.bytedance.android.livesdk.gift.panel.widget.w r1 = new com.bytedance.android.livesdk.gift.panel.widget.w
            r1.<init>(r7)
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter$c r0 = r0.f15035d
            r0.f15039b = r1
            android.support.v7.widget.RecyclerView r0 = r7.n
            com.bytedance.android.livesdk.gift.impl.AbsGiftAdapter r1 = r7.f15314c
            r0.setAdapter(r1)
            boolean r0 = r7.q
            if (r0 == 0) goto L_0x015f
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$GiftSSGridLayoutManager r6 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$GiftSSGridLayoutManager
            android.content.Context r2 = r7.context
            r3 = 2
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r17
            r0.<init>(r2, r3, r4, r5)
            goto L_0x0166
        L_0x015f:
            com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager r6 = new com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager
            android.content.Context r0 = r7.context
            r6.<init>(r0, r8, r8)
        L_0x0166:
            android.support.v7.widget.RecyclerView r0 = r7.n
            r0.setLayoutManager(r6)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x0179
            boolean r0 = r7.q
            if (r0 == 0) goto L_0x0179
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$GiftSSGridLayoutManager r6 = (com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.GiftSSGridLayoutManager) r6
            r6.f15329c = r8
        L_0x0179:
            android.support.v7.widget.RecyclerView r0 = r7.n
            r0.setHasFixedSize(r9)
            android.support.v7.widget.RecyclerView r0 = r7.n
            r1 = 16
            r0.setItemViewCacheSize(r1)
            android.view.View r0 = r7.contentView
            r1 = 2131168577(0x7f070d41, float:1.795146E38)
            android.view.View r0 = r0.findViewById(r1)
            r7.t = r0
            boolean r0 = r7.q
            if (r0 == 0) goto L_0x025f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10041(0x2739, float:1.407E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01b9
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10041(0x2739, float:1.407E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x025f
        L_0x01b9:
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$2 r0 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$2
            r0.<init>()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.f18531c
            r13 = 0
            r14 = 14829(0x39ed, float:2.078E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r15[r8] = r2
            java.lang.Class<com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper> r16 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.class
            r11 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x01f8
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.f18531c
            r13 = 0
            r14 = 14829(0x39ed, float:2.078E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r15[r8] = r1
            java.lang.Class<com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper> r16 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.class
            r11 = r0
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper r1 = (com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper) r1
            goto L_0x01ff
        L_0x01f8:
            int r2 = r0.f18534d
            if (r2 <= 0) goto L_0x0257
            r0.f18534d = r1
            r1 = r0
        L_0x01ff:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r10[r8] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.f18531c
            r13 = 0
            r14 = 14830(0x39ee, float:2.0781E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r15[r8] = r3
            java.lang.Class<com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper> r16 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.class
            r11 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x0239
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.f18531c
            r13 = 0
            r14 = 14830(0x39ee, float:2.0781E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r15[r8] = r2
            java.lang.Class<com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper> r16 = com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper.class
            r11 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper r1 = (com.bytedance.android.livesdk.widget.pager.GridPagerSnapHelper) r1
            goto L_0x023f
        L_0x0239:
            int r3 = r1.f18535e
            if (r3 <= 0) goto L_0x024f
            r1.f18535e = r2
        L_0x023f:
            android.support.v7.widget.RecyclerView r1 = r7.n
            r0.a((android.support.v7.widget.RecyclerView) r1)
            android.support.v7.widget.RecyclerView r0 = r7.n
            com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$3 r1 = new com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget$3
            r1.<init>()
            r0.addOnScrollListener(r1)
            goto L_0x025f
        L_0x024f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "column must be greater than zero"
            r0.<init>(r1)
            throw r0
        L_0x0257:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "row must be greater than zero"
            r0.<init>(r1)
            throw r0
        L_0x025f:
            boolean r0 = r7.r
            if (r0 == 0) goto L_0x02a6
            android.view.View r0 = r7.contentView
            r1 = 2131168771(0x7f070e03, float:1.7951853E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r0 = (com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower) r0
            r7.o = r0
            r0 = 2130840744(0x7f020ca8, float:1.7286535E38)
            r1 = 2130840746(0x7f020caa, float:1.728654E38)
            boolean r2 = com.bytedance.android.live.uikit.a.a.j()
            if (r2 == 0) goto L_0x028c
            com.bytedance.android.livesdk.gift.d.d r0 = com.bytedance.android.livesdk.gift.d.e.a()
            int r0 = r0.e()
            com.bytedance.android.livesdk.gift.d.d r1 = com.bytedance.android.livesdk.gift.d.e.a()
            int r1 = r1.f()
        L_0x028c:
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r2 = r7.o
            android.content.Context r3 = r7.context
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r3, (int) r0)
            android.content.Context r3 = r7.context
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r1 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r3, (int) r1)
            r2.f11769b = r0
            r2.f11770c = r1
        L_0x02a6:
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView r0 = r7.m
            android.content.Context r1 = r7.context
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a r1 = com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.a.a((android.content.Context) r1)
            android.content.Context r2 = r7.context
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131427827(0x7f0b01f3, float:1.8477281E38)
            int r2 = r2.getDimensionPixelSize(r3)
            com.bytedance.android.live.uikit.recyclerview.LoadingStatusView$a r1 = r1.a((int) r2)
            r0.setBuilder(r1)
        L_0x02c2:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10027(0x272b, float:1.4051E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02e7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f15312a
            r3 = 0
            r4 = 10027(0x272b, float:1.4051E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x03d3
        L_0x02e7:
            com.bytedance.android.livesdk.gift.GiftManager r10 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            com.bytedance.android.live.gift.d r11 = r7.B
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.p
            long r12 = r0.getId()
            r14 = 3
            boolean r15 = r7.f15317f
            r10.syncGiftList(r11, r12, r14, r15)
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.SHOW_PROP_PACKET
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = com.bytedance.android.live.uikit.a.a.f()
            if (r1 == 0) goto L_0x0311
            if (r0 == 0) goto L_0x0311
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0311
            r0 = 1
            goto L_0x0312
        L_0x0311:
            r0 = 0
        L_0x0312:
            boolean r1 = com.bytedance.android.live.uikit.a.a.b()
            if (r1 != 0) goto L_0x0324
            boolean r1 = com.bytedance.android.live.uikit.a.a.f()
            if (r1 != 0) goto L_0x0324
            boolean r1 = com.bytedance.android.live.uikit.a.a.j()
            if (r1 == 0) goto L_0x0326
        L_0x0324:
            if (r0 == 0) goto L_0x0328
        L_0x0326:
            r0 = 1
            goto L_0x0329
        L_0x0328:
            r0 = 0
        L_0x0329:
            if (r0 == 0) goto L_0x0344
            java.lang.Class<com.bytedance.android.live.e.a> r0 = com.bytedance.android.live.e.a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.utility.b.a(r0)
            com.bytedance.android.live.e.a r0 = (com.bytedance.android.live.e.a) r0
            com.bytedance.android.livesdk.user.e r0 = r0.user()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0344
            com.bytedance.android.livesdk.gift.q r0 = com.bytedance.android.livesdk.gift.q.a()
            r0.b()
        L_0x0344:
            com.bytedance.android.livesdk.gift.GiftManager r0 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            boolean r0 = r0.isGiftListLoaded()
            if (r0 == 0) goto L_0x035b
            com.bytedance.android.live.gift.d r0 = r7.B
            com.bytedance.android.livesdk.gift.GiftManager r1 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            java.util.List r1 = r1.getGiftList()
            r0.a(r1)
        L_0x035b:
            boolean r0 = com.bytedance.android.live.uikit.a.a.d()
            if (r0 == 0) goto L_0x03be
            com.bytedance.android.livesdk.gift.u r0 = com.bytedance.android.livesdk.gift.u.a()
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.u.f15473a
            r13 = 0
            r14 = 9317(0x2465, float:1.3056E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0387
            java.lang.Object[] r10 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.gift.u.f15473a
            r13 = 0
            r14 = 9317(0x2465, float:1.3056E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x03be
        L_0x0387:
            boolean r1 = r0.f15475b
            if (r1 != 0) goto L_0x03be
            r0.f15475b = r9
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Class<com.bytedance.android.livesdkapi.host.h> r3 = com.bytedance.android.livesdkapi.host.h.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.utility.b.a(r3)
            com.bytedance.android.livesdkapi.host.h r3 = (com.bytedance.android.livesdkapi.host.h) r3
            com.bytedance.retrofit2.Retrofit r3 = r3.c()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.TaskGiftApi> r4 = com.bytedance.android.livesdk.chatroom.api.TaskGiftApi.class
            java.lang.Object r3 = r3.create(r4)
            com.bytedance.android.livesdk.chatroom.api.TaskGiftApi r3 = (com.bytedance.android.livesdk.chatroom.api.TaskGiftApi) r3
            io.reactivex.Observable r3 = r3.getHotsoonTaskGift()
            com.bytedance.android.live.core.rxutils.g r4 = com.bytedance.android.live.core.rxutils.i.a()
            io.reactivex.Observable r3 = r3.compose(r4)
            com.bytedance.android.livesdk.gift.v r4 = new com.bytedance.android.livesdk.gift.v
            r4.<init>(r0, r1)
            com.bytedance.android.livesdk.gift.w r1 = new com.bytedance.android.livesdk.gift.w
            r1.<init>(r0)
            r3.subscribe(r4, r1)
        L_0x03be:
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdk.gift.panel.a.a> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_GIFT_PANEL_BANNER_LIST
            java.lang.Object r0 = r0.a()
            if (r0 == 0) goto L_0x03d3
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdk.gift.panel.a.a> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_GIFT_PANEL_BANNER_LIST
            java.lang.Object r0 = r0.a()
            com.bytedance.android.livesdk.gift.panel.a.a r0 = (com.bytedance.android.livesdk.gift.panel.a.a) r0
            java.util.List<com.bytedance.android.livesdk.chatroom.model.e> r0 = r0.f15166a
            r7.c(r0)
        L_0x03d3:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            android.arch.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.o
            com.bytedance.android.livesdk.gift.panel.widget.r r1 = new com.bytedance.android.livesdk.gift.panel.widget.r
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            android.arch.lifecycle.MutableLiveData<com.bytedance.android.livesdk.gift.panel.widget.ab> r0 = r0.j
            com.bytedance.android.livesdk.gift.panel.widget.s r1 = new com.bytedance.android.livesdk.gift.panel.widget.s
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            android.arch.lifecycle.MutableLiveData<com.bytedance.android.livesdk.gift.panel.a.b> r0 = r0.t
            com.bytedance.android.livesdk.gift.panel.widget.t r1 = new com.bytedance.android.livesdk.gift.panel.widget.t
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel r0 = r7.f15313b
            android.arch.lifecycle.MutableLiveData<com.bytedance.android.livesdk.gift.panel.widget.ab> r0 = r0.v
            com.bytedance.android.livesdk.gift.panel.widget.u r1 = new com.bytedance.android.livesdk.gift.panel.widget.u
            r1.<init>(r7)
            r0.observe(r7, r1)
            com.bytedance.android.livesdk.u.a r0 = com.bytedance.android.livesdk.u.a.a()
            java.lang.Class<com.bytedance.android.livesdk.widget.SendGiftAnimationView$a> r1 = com.bytedance.android.livesdk.widget.SendGiftAnimationView.a.class
            io.reactivex.Observable r0 = r0.a((java.lang.Class<T>) r1)
            com.bytedance.android.livesdk.gift.panel.widget.v r1 = new com.bytedance.android.livesdk.gift.panel.widget.v
            r1.<init>(r7)
            io.reactivex.disposables.Disposable r0 = r0.subscribe((io.reactivex.functions.Consumer<? super T>) r1)
            r7.A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget.onCreate():void");
    }

    private static GiftDialogViewModel.c a(com.bytedance.android.livesdk.gift.model.a.a aVar) {
        switch (aVar.f15095a) {
            case 1:
                return GiftDialogViewModel.c.GIFT;
            case 2:
                return GiftDialogViewModel.c.PROP;
            case 4:
                return GiftDialogViewModel.c.TASK_GIFT;
            case 6:
                return GiftDialogViewModel.c.GIFT_AD;
            case e.l /*?: ONE_ARG  (7 int)*/:
                if (!(aVar.f15098d instanceof b)) {
                    return GiftDialogViewModel.c.NORMAL;
                }
                if (((b) aVar.f15098d).f15106e == 5) {
                    return GiftDialogViewModel.c.TASK_GIFT;
                }
                return GiftDialogViewModel.c.GIFT;
            default:
                return GiftDialogViewModel.c.NORMAL;
        }
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.ViewHolder b(com.bytedance.android.livesdk.gift.model.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f15312a, false, 10035, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{bVar}, this, f15312a, false, 10035, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class}, RecyclerView.ViewHolder.class);
        } else if (this.n == null || this.f15314c == null || bVar == null) {
            return null;
        } else {
            com.bytedance.android.livesdk.gift.model.a.b a2 = this.f15314c.a(bVar.o());
            if (a2 == null) {
                return null;
            }
            return this.n.findViewHolderForAdapterPosition(this.f15314c.a(a2));
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f15312a, false, 10024, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f15312a, false, 10024, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 1100) {
            this.f15313b.b();
            this.f15313b.c();
        }
    }

    private void c(List<com.bytedance.android.livesdk.chatroom.model.e> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15312a, false, 10037, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15312a, false, 10037, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && !list.isEmpty()) {
            this.y.clear();
            for (com.bytedance.android.livesdk.chatroom.model.e next : list) {
                this.y.put(next.g, new c(next));
            }
            a(a.DATA_TYPE_BANNER);
        }
    }

    private void d(List<com.bytedance.android.livesdk.gift.model.a.b> list) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{list}, this, f15312a, false, 10040, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15312a, false, 10040, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && this.f15314c != null) {
            this.l = list;
            this.u = !list.isEmpty();
            View view = this.t;
            if (this.u) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
            RecyclerView recyclerView = this.n;
            if (this.u) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            recyclerView.setVisibility(i3);
            if (this.r) {
                RtlViewPagerShower rtlViewPagerShower = this.o;
                if (this.u) {
                    i5 = 0;
                } else {
                    i5 = 8;
                }
                rtlViewPagerShower.setVisibility(i5);
            }
            this.f15314c.a(list);
            if (this.u) {
                i4 = ((list.size() - 1) / 8) + 1;
            } else {
                i4 = 0;
            }
            this.s = i4;
            if (!this.q) {
                this.s = 0;
            }
            this.f15313b.w.postValue(Integer.valueOf(this.s));
            if (this.r) {
                this.o.a(this.s, this.h);
            }
            if (this.k != null) {
                this.k = this.f15314c.a(this.k.o());
            }
        }
    }

    public final void b(List<b> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15312a, false, 10036, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15312a, false, 10036, new Class[]{List.class}, Void.TYPE);
        } else if (!list.isEmpty()) {
            this.w.clear();
            this.v.clear();
            ArrayList<b> arrayList = new ArrayList<>(list);
            List<b> filterFansClubGifts = GiftManager.inst().filterFansClubGifts(arrayList);
            if (!CollectionUtils.isEmpty(filterFansClubGifts)) {
                for (b fVar : filterFansClubGifts) {
                    this.w.add(new f(fVar));
                }
            }
            if (filterFansClubGifts != null) {
                arrayList.removeAll(filterFansClubGifts);
            }
            for (b bVar : arrayList) {
                if (com.bytedance.android.live.uikit.a.a.f()) {
                    this.v.add(new k(bVar));
                } else if (bVar.f15106e == 5) {
                    this.z = bVar;
                } else if (bVar.f15106e == 3) {
                    this.v.add(new i(bVar));
                } else if (bVar.f15106e == 9) {
                    this.v.add(new g(bVar));
                } else {
                    this.v.add(new f(bVar));
                }
            }
            a(a.DATA_TYPE_GIFT);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f15312a, false, 10042, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f15312a, false, 10042, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = i2 / 8;
        if (i3 >= 0 && i3 < this.s) {
            this.h = i3;
            if (this.r) {
                this.o.a(this.h);
            }
            this.f15313b.x.postValue(Integer.valueOf(this.h));
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.model.a.b bVar) {
        boolean z2;
        com.bytedance.android.livesdk.gift.model.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f15312a, false, 10044, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f15312a, false, 10044, new Class[]{com.bytedance.android.livesdk.gift.model.a.b.class}, Void.TYPE);
            return;
        }
        boolean z3 = bVar2 instanceof com.bytedance.android.livesdk.gift.model.a.a;
        if (z3) {
            GiftDialogViewModel giftDialogViewModel = this.f15313b;
            com.bytedance.android.livesdk.gift.model.a.a aVar = (com.bytedance.android.livesdk.gift.model.a.a) bVar2;
            if (PatchProxy.isSupport(new Object[]{aVar}, giftDialogViewModel, GiftDialogViewModel.f15262a, false, 9942, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Boolean.TYPE)) {
                GiftDialogViewModel giftDialogViewModel2 = giftDialogViewModel;
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, giftDialogViewModel2, GiftDialogViewModel.f15262a, false, 9942, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Boolean.TYPE)).booleanValue();
            } else if (giftDialogViewModel.A == null || (!(aVar instanceof h) ? giftDialogViewModel.A.f15133e == aVar.o() : giftDialogViewModel.A.l == aVar.o())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                this.f15313b.b();
                this.f15313b.c();
            }
        }
        if (bVar2 instanceof c) {
            Context context = this.context;
            c cVar = (c) bVar2;
            if (!PatchProxy.isSupport(new Object[]{context, cVar}, null, com.bytedance.android.livesdk.chatroom.c.a.f9857a, true, 4290, new Class[]{Context.class, c.class}, Void.TYPE)) {
                com.bytedance.android.livesdk.chatroom.model.e eVar = (com.bytedance.android.livesdk.chatroom.model.e) cVar.f15098d;
                if (!PatchProxy.isSupport(new Object[]{context, eVar}, null, com.bytedance.android.livesdk.chatroom.c.a.f9857a, true, 4289, new Class[]{Context.class, com.bytedance.android.livesdk.chatroom.model.e.class}, Void.TYPE)) {
                    switch (eVar.f11113f) {
                        case 2:
                            ((com.bytedance.android.live.b.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.b.a.class)).webViewManager().a(context, com.bytedance.android.livesdk.browser.c.c.b(eVar.f11111d).a(eVar.f11109b));
                            break;
                        case 3:
                            com.bytedance.android.livesdkapi.k.a.e eVar2 = new com.bytedance.android.livesdkapi.k.a.e(eVar.f11111d);
                            eVar2.a("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a())));
                            com.bytedance.android.livesdk.u.a.a().a((Object) new aa(eVar2.a(), "banner"));
                            break;
                        default:
                            com.bytedance.android.livesdkapi.k.a.e eVar3 = new com.bytedance.android.livesdkapi.k.a.e(eVar.f11111d);
                            eVar3.a(PushConstants.TITLE, eVar.f11109b);
                            ((com.bytedance.android.livesdk.schema.a.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdk.schema.a.a.class)).a(context, Uri.parse(eVar3.a()));
                            break;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[]{context, eVar}, null, com.bytedance.android.livesdk.chatroom.c.a.f9857a, true, 4289, new Class[]{Context.class, com.bytedance.android.livesdk.chatroom.model.e.class}, Void.TYPE);
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{context, cVar}, null, com.bytedance.android.livesdk.chatroom.c.a.f9857a, true, 4290, new Class[]{Context.class, c.class}, Void.TYPE);
            }
            this.f15313b.r.postValue(Boolean.TRUE);
        } else if (bVar2 instanceof i) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new ab(0));
            this.f15313b.r.postValue(Boolean.TRUE);
        } else {
            if (!(bVar2 instanceof com.bytedance.android.livesdk.gift.model.a.e)) {
                if (bVar2 instanceof k) {
                    com.bytedance.android.livesdk.gift.model.a.a aVar2 = (com.bytedance.android.livesdk.gift.model.a.a) bVar2;
                    a(aVar2, aVar2.f());
                    return;
                }
                com.bytedance.android.livesdk.gift.model.a.a aVar3 = null;
                if (bVar2 instanceof g) {
                    this.f15313b.s.postValue(null);
                    if (this.q) {
                        this.dataCenter.lambda$put$1$DataCenter("cmd_show_gift_relay_dialog", "gift_panel");
                        return;
                    }
                    Toast makeText = Toast.makeText(this.context, this.context.getResources().getString(C0906R.string.cyh), 1);
                    if (PatchProxy.isSupport(new Object[]{makeText}, null, x.f15385a, true, 10067, new Class[]{Toast.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{makeText}, null, x.f15385a, true, 10067, new Class[]{Toast.class}, Void.TYPE);
                    } else {
                        if (Build.VERSION.SDK_INT == 25) {
                            eq.a(makeText);
                        }
                        makeText.show();
                    }
                } else if (z3) {
                    this.k = bVar2;
                    if (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.a()).intValue() == 1 && (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.j())) {
                        a((com.bytedance.android.livesdk.gift.model.a.a) bVar2, false);
                    } else if (com.bytedance.android.live.uikit.a.a.f()) {
                        com.bytedance.android.livesdk.gift.model.a.a aVar4 = (com.bytedance.android.livesdk.gift.model.a.a) bVar2;
                        a(aVar4, aVar4.f());
                    } else {
                        com.bytedance.android.livesdk.gift.model.a.a aVar5 = (com.bytedance.android.livesdk.gift.model.a.a) bVar2;
                        if (PatchProxy.isSupport(new Object[]{aVar5}, this, f15312a, false, 10046, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar5}, this, f15312a, false, 10046, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class}, Void.TYPE);
                            return;
                        }
                        MutableLiveData<com.bytedance.android.livesdk.gift.model.a.a> mutableLiveData = this.f15313b.s;
                        if (aVar5.f15096b) {
                            aVar3 = aVar5;
                        }
                        mutableLiveData.postValue(aVar3);
                        this.f15313b.n.postValue(Boolean.FALSE);
                        if (aVar5.f15096b && aVar5.g()) {
                            new m.a(this.context, 1).c((CharSequence) aVar5.h()).b(2, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f15324a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15324a, false, 10062, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15324a, false, 10062, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    dialogInterface.dismiss();
                                }
                            }).c();
                            Set set = (Set) com.bytedance.android.livesdk.w.b.x.a();
                            set.add(Long.valueOf(aVar5.o()));
                            com.bytedance.android.livesdk.w.b.x.a(set);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f15312a, false, 10039, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f15312a, false, 10039, new Class[]{a.class}, Void.TYPE);
        } else if ((this.v == null || this.v.isEmpty()) && (this.x == null || this.x.isEmpty())) {
            this.m.c();
        } else {
            this.m.setVisibility(8);
            switch (aVar) {
                case DATA_TYPE_BANNER:
                case DATA_TYPE_GIFT:
                    if (this.g == ab.GIFT) {
                        a(ab.GIFT);
                        return;
                    }
                    break;
                case DATA_TYPE_PROP:
                    if (this.g == ab.PROP) {
                        a(ab.PROP);
                    }
                    this.f15313b.k.postValue(Boolean.valueOf(q.a().c()));
                    this.f15313b.l.postValue(Boolean.valueOf(q.a().d()));
                    break;
            }
        }
    }

    private void a(com.bytedance.android.livesdk.gift.model.a.a aVar, boolean z2) {
        com.bytedance.android.livesdk.gift.model.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f15312a, false, 10045, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z2)}, this, f15312a, false, 10045, new Class[]{com.bytedance.android.livesdk.gift.model.a.a.class, Boolean.TYPE}, Void.TYPE);
        } else if (aVar2 != null) {
            this.k = aVar2;
            com.bytedance.android.livesdk.gift.panel.a.c cVar = new com.bytedance.android.livesdk.gift.panel.a.c(a(aVar), aVar.o(), 1, z2);
            this.f15313b.p.postValue(cVar);
        }
    }
}
