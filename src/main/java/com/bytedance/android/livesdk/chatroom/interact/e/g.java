package com.bytedance.android.livesdk.chatroom.interact.e;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.interact.aa;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.interact.w;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdk.chatroom.widget.m;
import com.bytedance.android.livesdk.m.f;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.b.a.a.c.d;
import com.bytedance.b.a.a.f.c;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class g implements aa.a, a.C0089a, m.a, d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10909a;

    /* renamed from: b  reason: collision with root package name */
    public Context f10910b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout f10911c;

    /* renamed from: d  reason: collision with root package name */
    TextView f10912d;

    /* renamed from: e  reason: collision with root package name */
    List<m> f10913e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f10914f;
    int g;
    public d h;
    public Room i;
    public boolean j;
    public boolean k;
    public boolean l = true;
    public c m;
    public DataCenter n;
    private FrameLayout o;
    private m p;
    private a q;
    private com.bytedance.android.livesdk.rank.g r;
    private int s;
    private int t;
    private int u;
    private aa v;
    private View.OnLayoutChangeListener w = new View.OnLayoutChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10915a;

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f10915a, false, 5105, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f10915a, false, 5105, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (i4 != i8 && g.this.m != null) {
                g.this.a(g.this.m);
            }
        }
    };
    private View.OnClickListener x = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10917a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10918c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10917a, true, 5107, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10917a, true, 5107, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomVideoWindowManager.java", AnonymousClass2.class);
            f10918c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.wm.LinkInRoomVideoWindowManager$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 96);
        }

        public void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f10917a, false, 5106, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10917a, false, 5106, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10918c, this, this, view));
            if (!g.this.k) {
                if (!TTLiveSDKContext.getHostService().k().c()) {
                    TTLiveSDKContext.getHostService().k().a(g.this.f10910b, i.a().a(ac.a((int) C0906R.string.d5n)).c("interact").a(0).a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<Object>());
                    return;
                } else if (TTLiveSDKContext.getHostService().k().a(h.INTERACT)) {
                    return;
                }
            }
            if (g.this.n != null) {
                g.this.n.lambda$put$1$DataCenter("cmd_interact_state_change", new q(0));
            }
            Room room = g.this.i;
            if (g.this.k) {
                str = "anchor_connection";
            } else {
                str = "guest_connection";
            }
            com.bytedance.android.livesdk.utils.aa.a(room, "click_connection_banner", str, g.this.k);
        }
    };
    private View.OnClickListener y = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10920a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f10921c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f10920a, true, 5109, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f10920a, true, 5109, new Class[0], Void.TYPE);
                return;
            }
            b bVar = new b("LinkInRoomVideoWindowManager.java", AnonymousClass3.class);
            f10921c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.interact.wm.LinkInRoomVideoWindowManager$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 120);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f10920a, false, 5108, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f10920a, false, 5108, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(b.a(f10921c, this, this, view));
            if (!g.this.k) {
                if (!TTLiveSDKContext.getHostService().k().c()) {
                    TTLiveSDKContext.getHostService().k().a(g.this.f10910b, i.a().a(ac.a((int) C0906R.string.d5n)).c("interact").a(0).a()).subscribe((Observer<? super T>) new com.bytedance.android.livesdk.user.g<Object>());
                    return;
                } else if (TTLiveSDKContext.getHostService().k().a(h.INTERACT)) {
                    return;
                }
            }
            com.bytedance.android.livesdk.utils.aa.a(g.this.i, "click_connection_banner", "guest_connection", false);
            if (!g.this.k && ((Integer) e.a().f9041c).intValue() == 0) {
                f.a((Activity) g.this.f10910b).a(new com.bytedance.android.livesdk.m.b.d() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f10923a;

                    public final void a(String... strArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr}, this, f10923a, false, 5110, new Class[]{String[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr}, this, f10923a, false, 5110, new Class[]{String[].class}, Void.TYPE);
                            return;
                        }
                        if (g.this.n != null) {
                            g.this.n.lambda$put$1$DataCenter("cmd_interact_state_change", new q(1));
                        }
                    }

                    public final void b(String... strArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr}, this, f10923a, false, 5111, new Class[]{String[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr}, this, f10923a, false, 5111, new Class[]{String[].class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.android.live.uikit.d.a.a(g.this.f10910b, (int) C0906R.string.d7r);
                    }
                }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
            }
        }
    };

    public final void a(long j2, int i2, boolean z) {
    }

    public final void a(long j2, long j3) {
    }

    public final void b(List<j> list) {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10909a, false, 5087, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10909a, false, 5087, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new w(true));
        this.n.lambda$put$1$DataCenter("cmd_interact_player_view_change", new w(true));
        this.l = z;
        this.j = true;
        this.f10912d = (TextView) LayoutInflater.from(this.f10911c.getContext()).inflate(C0906R.layout.amt, this.f10911c, false);
        this.f10912d.setVisibility(4);
        this.f10911c.addView(this.f10912d);
        this.q.a((a.C0089a) this);
        this.v.a();
        d();
        this.f10911c.addOnLayoutChangeListener(this.w);
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10909a, false, 5091, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10909a, false, 5091, new Class[]{List.class}, Void.TYPE);
        } else if (!this.l) {
            ArrayList arrayList = new ArrayList();
            for (j next : list) {
                Iterator<m> it2 = this.f10913e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    m next2 = it2.next();
                    if (next.f11051d == next2.getPresenter().d()) {
                        arrayList.add(next2);
                        this.f10913e.remove(next2);
                        break;
                    }
                }
            }
            arrayList.addAll(this.f10913e);
            this.f10913e = arrayList;
            b();
            d();
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10909a, false, 5101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10909a, false, 5101, new Class[0], Void.TYPE);
            return;
        }
        int size = this.f10913e.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.f10913e.get(i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mVar.getLayoutParams();
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = ((this.f10914f + this.t) * i2) + this.g;
            layoutParams.rightMargin = this.u;
            layoutParams.width = this.s;
            layoutParams.height = this.t;
            mVar.setLayoutParams(layoutParams);
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f10909a, false, 5102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10909a, false, 5102, new Class[0], Void.TYPE);
            return;
        }
        for (m removeView : this.f10913e) {
            this.f10911c.removeView(removeView);
        }
        this.f10913e.clear();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10909a, false, 5088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10909a, false, 5088, new Class[0], Void.TYPE);
            return;
        }
        this.j = false;
        this.f10911c.removeOnLayoutChangeListener(this.w);
        if (this.r != null && this.r.isShowing()) {
            this.r.dismiss();
        }
        this.v.b();
        this.f10911c.removeAllViews();
        com.bytedance.android.livesdk.u.a.a().a((Object) new w(false));
        this.n.lambda$put$1$DataCenter("cmd_interact_player_view_change", new w(false));
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f10909a, false, 5103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10909a, false, 5103, new Class[0], Void.TYPE);
            return;
        }
        int d2 = this.q.d();
        if (!this.k) {
            if (((Integer) e.a().f9041c).intValue() == 0) {
                this.f10912d.setText(C0906R.string.d4f);
                this.f10912d.setOnClickListener(this.y);
                this.f10912d.setVisibility(0);
            } else if (2 == ((Integer) e.a().f9041c).intValue()) {
                this.f10912d.setText(C0906R.string.d4f);
                this.f10912d.setOnClickListener(this.y);
                this.f10912d.setVisibility(8);
            }
            this.f10911c.post(new h(this));
        }
        this.f10912d.setText(ac.a((int) C0906R.string.d84, Integer.valueOf(d2)));
        this.f10912d.setOnClickListener(this.x);
        this.f10912d.setVisibility(0);
        this.f10911c.post(new h(this));
    }

    public final boolean c(int i2) {
        if (!this.l || i2 != 1) {
            return false;
        }
        return true;
    }

    private void b(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f10909a, false, 5099, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f10909a, false, 5099, new Class[]{m.class}, Void.TYPE);
            return;
        }
        this.f10911c.addView(mVar);
        this.f10913e.add(mVar);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f10909a, false, 5096, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f10909a, false, 5096, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        d();
    }

    public final void c(List<k> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f10909a, false, 5093, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f10909a, false, 5093, new Class[]{List.class}, Void.TYPE);
        } else if (this.j) {
            if (this.r != null && this.r.isShowing()) {
                this.r.dismiss();
            }
            this.r = new com.bytedance.android.livesdk.rank.g(this.f10910b, list);
            this.r.show();
        }
    }

    public final void a(m mVar) {
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f10909a, false, 5100, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f10909a, false, 5100, new Class[]{m.class}, Void.TYPE);
            return;
        }
        if (mVar == this.p) {
            this.p = null;
        }
        this.f10911c.removeView(mVar);
        this.f10913e.remove(mVar);
        b();
        d();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f10909a, false, 5089, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f10909a, false, 5089, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l = z;
        c();
        if (this.o != null) {
            this.o.removeAllViews();
        }
    }

    public final void a(c cVar) {
        long j2;
        int i2;
        int i3;
        int i4;
        Iterator<com.bytedance.b.a.a.f.b> it2;
        int i5;
        c cVar2 = cVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f10909a, false, 5094, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f10909a, false, 5094, new Class[]{c.class}, Void.TYPE);
        } else if (this.l && this.j) {
            this.m = cVar2;
            c();
            List<com.bytedance.b.a.a.f.b> list = cVar2.f19214d;
            if (list == null || list.size() <= 0) {
                d();
                return;
            }
            int width = this.f10911c.getWidth();
            int height = this.f10911c.getHeight();
            int i6 = cVar2.g;
            int i7 = cVar2.f19216f;
            long id = this.i.getOwner().getId();
            Iterator<com.bytedance.b.a.a.f.b> it3 = list.iterator();
            while (it3.hasNext()) {
                com.bytedance.b.a.a.f.b next = it3.next();
                if (next == null || next.f19207c == id) {
                    it2 = it3;
                    i5 = width;
                    i4 = height;
                    i3 = i6;
                    i2 = i7;
                    j2 = id;
                } else {
                    m b2 = b(next.f19207c, z ? 1 : 0, z);
                    if (b2 != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z, z);
                        float f2 = (float) width;
                        float f3 = (float) i6;
                        float f4 = f2 / f3;
                        float f5 = (float) height;
                        float f6 = (float) i7;
                        float f7 = f5 / f6;
                        if (f4 <= f7) {
                            f4 = f7;
                        }
                        float f8 = f3 * f4;
                        float f9 = f6 * f4;
                        double d2 = (double) f8;
                        it2 = it3;
                        i5 = width;
                        double d3 = next.f19208d;
                        Double.isNaN(d2);
                        i4 = height;
                        i3 = i6;
                        double d4 = (double) ((f8 - f2) / 2.0f);
                        Double.isNaN(d4);
                        double d5 = (double) f9;
                        i2 = i7;
                        double d6 = next.f19209e;
                        Double.isNaN(d5);
                        j2 = id;
                        double d7 = (double) ((f9 - f5) / 2.0f);
                        Double.isNaN(d7);
                        double d8 = next.f19210f;
                        Double.isNaN(d2);
                        double d9 = next.g;
                        Double.isNaN(d5);
                        layoutParams.width = (int) ((d2 * d8) + 0.5d);
                        layoutParams.height = (int) ((d5 * d9) + 0.5d);
                        layoutParams.leftMargin = (int) (((d3 * d2) + 0.5d) - d4);
                        layoutParams.topMargin = (int) (((d6 * d5) + 0.5d) - d7);
                        b2.setLayoutParams(layoutParams);
                        b2.getPresenter().a(next.h);
                        b(b2);
                    }
                }
                width = i5;
                it3 = it2;
                height = i4;
                i6 = i3;
                i7 = i2;
                id = j2;
                z = false;
            }
            d();
        }
    }

    private m b(long j2, int i2) {
        long j3 = j2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f10909a, false, 5098, new Class[]{Long.TYPE, Integer.TYPE}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f10909a, false, 5098, new Class[]{Long.TYPE, Integer.TYPE}, m.class);
        }
        for (m next : this.f10913e) {
            if (j3 > 0 && next.getPresenter().c() == j3) {
                return next;
            }
            if (i3 > 0 && next.getPresenter().d() == i3) {
                return next;
            }
        }
        return null;
    }

    public final void a(int i2, SurfaceView surfaceView) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), surfaceView}, this, f10909a, false, 5095, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), surfaceView}, this, f10909a, false, 5095, new Class[]{Integer.TYPE, SurfaceView.class}, Void.TYPE);
        } else if (!this.l && this.j) {
            if (i2 == com.bytedance.android.livesdk.app.dataholder.d.a().f9052f) {
                surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.o.removeAllViews();
                this.o.addView(surfaceView);
                this.o.setVisibility(0);
                return;
            }
            m b2 = b(0, i2);
            if (b2 != null) {
                a(b2);
                z = true;
            }
            m b3 = b(0, i2, true);
            if (b3 != null) {
                if (!this.k && i2 == com.bytedance.android.livesdk.app.dataholder.d.a().h) {
                    if (!z) {
                        b3.a();
                    }
                    this.p = b3;
                }
                if (surfaceView != null) {
                    surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.s, this.t));
                    surfaceView.setZOrderMediaOverlay(true);
                    b3.a(surfaceView);
                }
                b(b3);
                a(this.q.i);
            }
        }
    }

    public final void a(long j2, int i2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f10909a, false, 5092, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f10909a, false, 5092, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.l && this.j) {
            m b2 = b(j2, i2);
            if (b2 != null) {
                if (PatchProxy.isSupport(new Object[0], b2, m.f13507a, false, 7876, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], b2, m.f13507a, false, 7876, new Class[0], Void.TYPE);
                } else {
                    b2.a(2);
                }
                long id = this.i.getOwner().getId();
                if (!(b2.getPresenter() == null || b2.getPresenter().g() == null || b2.getPresenter().c() == id)) {
                    j g2 = b2.getPresenter().g();
                    com.bytedance.android.live.uikit.d.a.a(this.f10910b, this.f10910b.getString(C0906R.string.d5e, new Object[]{g2.f11052e.getNickName()}));
                }
            }
        }
    }

    private m b(long j2, int i2, boolean z) {
        long j3 = j2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f10909a, false, 5097, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2), Byte.valueOf(z)}, this, f10909a, false, 5097, new Class[]{Long.TYPE, Integer.TYPE, Boolean.TYPE}, m.class);
        } else if (j3 <= 0 && i3 <= 0) {
            return null;
        } else {
            m mVar = new m(this.f10910b, this.v.b(j3, i3), this, this.n);
            mVar.f13511e = !z;
            return mVar;
        }
    }

    public g(Room room, boolean z, FrameLayout frameLayout, FrameLayout frameLayout2, com.bytedance.android.livesdk.chatroom.interact.d.a aVar) {
        this.f10910b = frameLayout2.getContext();
        this.i = room;
        this.k = z;
        this.f10911c = frameLayout2;
        this.o = frameLayout;
        this.q = aVar;
        this.h = new d(this);
        this.v = new aa(room, aVar, this);
        Resources resources = this.f10910b.getResources();
        this.s = resources.getDimensionPixelSize(C0906R.dimen.or);
        this.t = resources.getDimensionPixelSize(C0906R.dimen.oq);
        this.f10914f = (int) UIUtils.dip2Px(this.f10910b, 4.0f);
        this.g = (int) UIUtils.dip2Px(this.f10910b, 62.0f);
        this.u = (int) UIUtils.dip2Px(this.f10910b, 12.0f);
    }
}
