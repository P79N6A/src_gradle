package com.bytedance.android.livesdk.roommanage;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.admin.ui.AdminListAdapter;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.ui.di;
import com.bytedance.android.livesdk.kickout.b;
import com.bytedance.android.livesdk.kickout.ui.BannedListAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17084a;

    /* renamed from: b  reason: collision with root package name */
    int f17085b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17086c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f17087d;

    /* renamed from: e  reason: collision with root package name */
    public LoadingStatusView f17088e;

    /* renamed from: f  reason: collision with root package name */
    public BottomSheetBehavior<View> f17089f;
    public AdminListAdapter g;
    public int h;
    public String i;
    public int j;
    public boolean k;
    public long l;
    public com.bytedance.android.livesdk.kickout.a m;
    public BannedListAdapter n;
    private long o;
    private long p;
    @StringRes
    private int q;
    private String r;
    private TextView s;
    private RecyclerView t;
    private boolean u;
    private CompositeDisposable v;
    private com.bytedance.android.livesdk.admin.c.a w;
    private com.bytedance.android.livesdk.admin.d.a x;
    private b y;
    private LoadMoreRecyclerViewAdapter.a z;

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13124, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f17086c = true;
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13125, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f17086c = false;
        this.v.dispose();
    }

    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13116, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.f17089f != null && com.bytedance.android.live.uikit.a.a.d() && !ac.f()) {
            this.f17089f.setState(3);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13121, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.cst);
            this.f17088e.d();
        } else {
            if (this.m != null) {
                this.m.a(this.l, this.i, this.j, 20);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13119, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getContext())) {
            com.bytedance.android.live.uikit.d.a.a(getContext(), (int) C0906R.string.cst);
        } else {
            this.f17088e.b();
            this.w.a(this.p);
        }
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f17084a, false, 13117, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f17084a, false, 13117, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.v.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f17092a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f17092a, false, 13128, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f17092a, false, 13128, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof com.bytedance.android.livesdk.admin.a.a) {
                    a.this.onEvent((com.bytedance.android.livesdk.admin.a.a) t);
                } else if (t instanceof com.bytedance.android.livesdk.kickout.a.a) {
                    a.this.onEvent((com.bytedance.android.livesdk.kickout.a.a) t);
                } else {
                    if (t instanceof com.bytedance.android.livesdk.kickout.a.b) {
                        a.this.onEvent((com.bytedance.android.livesdk.kickout.a.b) t);
                    }
                }
            }
        }));
    }

    public final void onEvent(com.bytedance.android.livesdk.kickout.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f17084a, false, 13123, new Class[]{com.bytedance.android.livesdk.kickout.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f17084a, false, 13123, new Class[]{com.bytedance.android.livesdk.kickout.a.a.class}, Void.TYPE);
            return;
        }
        if (this.f17086c && aVar != null && !aVar.f15741a && this.n != null) {
            this.n.a(aVar.f15742b);
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.admin.a.a aVar) {
        com.bytedance.android.livesdk.admin.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f17084a, false, 13120, new Class[]{com.bytedance.android.livesdk.admin.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17084a, false, 13120, new Class[]{com.bytedance.android.livesdk.admin.a.a.class}, Void.TYPE);
            return;
        }
        if (this.f17086c && aVar2 != null && !aVar2.f8952a && this.g != null) {
            AdminListAdapter adminListAdapter = this.g;
            long j2 = aVar2.f8953b;
            if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, adminListAdapter, AdminListAdapter.f8977a, false, 3090, new Class[]{Long.TYPE}, Void.TYPE)) {
                int size = adminListAdapter.f8978b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    com.bytedance.android.livesdk.admin.b.b bVar = adminListAdapter.f8978b.get(size);
                    if (bVar != null) {
                        User user = bVar.f8956a;
                        if (user != null && user.getId() == j2) {
                            adminListAdapter.f8978b.remove(size);
                            adminListAdapter.notifyDataSetChanged();
                            break;
                        }
                    }
                    size--;
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, adminListAdapter, AdminListAdapter.f8977a, false, 3090, new Class[]{Long.TYPE}, Void.TYPE);
            }
            this.f17087d.setText(getContext().getString(C0906R.string.cou, new Object[]{Integer.valueOf(this.g.getItemCount()), Integer.valueOf(this.h)}));
        }
    }

    public final void onEvent(com.bytedance.android.livesdk.kickout.a.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f17084a, false, 13122, new Class[]{com.bytedance.android.livesdk.kickout.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f17084a, false, 13122, new Class[]{com.bytedance.android.livesdk.kickout.a.b.class}, Void.TYPE);
            return;
        }
        if (this.f17086c && bVar != null && !bVar.f15743a && this.n != null) {
            this.n.a(bVar.f15744b);
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f17084a, false, 13114, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f17084a, false, 13114, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(C0906R.layout.ahb);
            if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13115, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13115, new Class[0], Void.TYPE);
            } else {
                this.s = (TextView) findViewById(C0906R.id.chq);
                this.f17087d = (TextView) findViewById(C0906R.id.chr);
                this.t = (RecyclerView) findViewById(C0906R.id.cho);
                this.f17088e = (LoadingStatusView) findViewById(C0906R.id.chp);
                this.t.setLayoutManager(new SSLinearLayoutManager(getContext(), 1, false));
                if (1 == this.f17085b) {
                    this.q = C0906R.string.d1j;
                    this.r = getContext().getString(C0906R.string.cot);
                    this.w = new com.bytedance.android.livesdk.admin.c.a(this.x);
                    AdminListAdapter adminListAdapter = new AdminListAdapter(getContext(), this.p, this.o);
                    this.g = adminListAdapter;
                    this.t.setAdapter(this.g);
                    a();
                } else {
                    if (2 == this.f17085b) {
                        this.i = "activity_banned_talk";
                        this.q = C0906R.string.d1o;
                        this.r = getContext().getString(C0906R.string.cpj);
                    } else if (3 == this.f17085b) {
                        this.i = "activity_kick_out";
                        this.q = C0906R.string.d1i;
                        this.r = getContext().getString(C0906R.string.djo);
                    }
                    this.m = new com.bytedance.android.livesdk.kickout.a();
                    this.m.f15728b = this.y;
                    this.n = new BannedListAdapter(getContext(), this.i, this.o);
                    this.t.setAdapter(this.n);
                    this.n.f8578c = this.z;
                    this.j = 0;
                    this.l = this.o;
                    b();
                }
                this.s.setText(this.r);
                if (PatchProxy.isSupport(new Object[0], this, f17084a, false, 13118, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f17084a, false, 13118, new Class[0], Void.TYPE);
                } else {
                    View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a_c, null);
                    inflate.setOnClickListener(new b(this));
                    di a2 = new di(getContext()).a(getContext().getString(this.q));
                    a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    this.f17088e.setBuilder(LoadingStatusView.a.a(getContext()).b((View) a2).c(inflate).a(getContext().getResources().getDimensionPixelSize(C0906R.dimen.ms)));
                }
                a(com.bytedance.android.livesdk.admin.a.a.class);
                a(com.bytedance.android.livesdk.kickout.a.a.class);
                a(com.bytedance.android.livesdk.kickout.a.b.class);
            }
            if (this.u) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else if (com.bytedance.android.live.uikit.a.a.d()) {
                window.addFlags(1024);
                window.setLayout(ac.a(376.0f), -1);
                window.setGravity(8388693);
            } else {
                window.setGravity(5);
                window.setLayout(-2, -1);
            }
            window.setBackgroundDrawableResource(17170445);
            window.setDimAmount(0.0f);
            if (com.bytedance.android.live.uikit.a.a.d() && !ac.f()) {
                this.t.setNestedScrollingEnabled(false);
                this.f17089f = BottomSheetBehavior.from(getWindow().getDecorView().findViewById(C0906R.id.yp));
                this.f17089f.setHideable(false);
                this.f17089f.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f17090a;

                    public final void onSlide(@NonNull View view, float f2) {
                    }

                    public final void onStateChanged(@NonNull View view, int i) {
                        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f17090a, false, 13127, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f17090a, false, 13127, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i != 3) {
                            a.this.f17089f.setState(3);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(@android.support.annotation.NonNull android.content.Context r2, int r3, long r4, long r6, boolean r8) {
        /*
            r1 = this;
            if (r8 == 0) goto L_0x0006
            r0 = 2131493699(0x7f0c0343, float:1.8610886E38)
            goto L_0x0009
        L_0x0006:
            r0 = 2131493695(0x7f0c033f, float:1.8610877E38)
        L_0x0009:
            r1.<init>(r2, r0)
            io.reactivex.disposables.CompositeDisposable r2 = new io.reactivex.disposables.CompositeDisposable
            r2.<init>()
            r1.v = r2
            r2 = 10
            r1.h = r2
            com.bytedance.android.livesdk.roommanage.a$3 r2 = new com.bytedance.android.livesdk.roommanage.a$3
            r2.<init>()
            r1.x = r2
            com.bytedance.android.livesdk.roommanage.a$4 r2 = new com.bytedance.android.livesdk.roommanage.a$4
            r2.<init>()
            r1.y = r2
            com.bytedance.android.livesdk.roommanage.a$5 r2 = new com.bytedance.android.livesdk.roommanage.a$5
            r2.<init>()
            r1.z = r2
            r1.u = r8
            r1.f17085b = r3
            r1.o = r4
            r1.p = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.roommanage.a.<init>(android.content.Context, int, long, long, boolean):void");
    }
}
