package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.interact.adapter.LinkInRoomAudioWaitingListAdapter;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.message.model.al;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ab;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.e;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.f.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bn extends e implements LinkInRoomAudioWaitingListAdapter.a, cy.a, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11941a;

    /* renamed from: b  reason: collision with root package name */
    cy f11942b;

    /* renamed from: c  reason: collision with root package name */
    LinkInRoomAudioWaitingListAdapter f11943c;

    /* renamed from: d  reason: collision with root package name */
    Room f11944d;

    /* renamed from: e  reason: collision with root package name */
    boolean f11945e;

    /* renamed from: f  reason: collision with root package name */
    boolean f11946f;
    RecyclerView g;
    private long j;
    private boolean k;
    private final CompositeDisposable l = new CompositeDisposable();
    private TextView m;
    private TextView n;
    private View o;
    private m p;
    private ToggleButton q;

    public final int a() {
        return C0906R.layout.ah6;
    }

    public final void onPointerCaptureChanged(boolean z) {
    }

    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, @Nullable Menu menu, int i) {
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5851, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null && this.p.isShowing()) {
            this.p.dismiss();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5843, new Class[0], Void.TYPE);
            return;
        }
        g();
        this.f11942b.a(this.j);
        this.j = 0;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5844, new Class[0], Void.TYPE);
            return;
        }
        g();
        this.q.setChecked(true);
        ai.a(getContext(), (int) C0906R.string.d7t);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5845, new Class[0], Void.TYPE);
            return;
        }
        g();
        dismiss();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5846, new Class[0], Void.TYPE);
            return;
        }
        g();
        this.q.setChecked(true);
        ai.a(getContext(), (int) C0906R.string.d7t);
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5855, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.k = true;
        ab.a().addMessageListener(a.LINK_MIC.getIntType(), this);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5840, new Class[0], Void.TYPE);
            return;
        }
        this.m.setText(ac.a((int) C0906R.string.d5k, Integer.valueOf(this.f11943c.b())));
        int a2 = 8 - this.f11943c.a();
        if (a2 < 0) {
            a2 = 0;
        }
        this.n.setText(ac.a((int) C0906R.string.d81, Integer.valueOf(a2)));
        if (this.f11943c.getItemCount() > 0) {
            this.o.setVisibility(8);
            this.g.setVisibility(0);
            return;
        }
        this.o.setVisibility(0);
        this.g.setVisibility(8);
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11941a, false, 5856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11941a, false, 5856, new Class[0], Void.TYPE);
            return;
        }
        this.k = false;
        if (ab.a() != null) {
            ab.a().removeMessageListener(this);
        }
        this.f11942b.t = null;
        this.l.clear();
        if (this.p != null && this.p.isShowing()) {
            this.p.dismiss();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public List<j> a(List<j> list) {
        List<j> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f11941a, false, 5854, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f11941a, false, 5854, new Class[]{List.class}, List.class);
        }
        if (list == null) {
            list2 = new ArrayList<>();
        } else {
            list2 = list;
        }
        Iterator<j> it2 = list2.iterator();
        while (it2.hasNext()) {
            j next = it2.next();
            if (next == null || next.f11052e == null || 1 == next.i) {
                it2.remove();
            }
        }
        return list2;
    }

    public final void b(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11941a, false, 5842, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11941a, false, 5842, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        new m.a(getContext()).c((int) C0906R.string.d_s).a(false).b(0, (int) C0906R.string.cqy, (DialogInterface.OnClickListener) new bp(this, j3)).b(1, (int) C0906R.string.cpz, bq.f11953b).c();
    }

    public final void c(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11941a, false, 5847, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11941a, false, 5847, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        g();
        this.f11943c.a(j3);
        f();
    }

    public final void d(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11941a, false, 5849, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11941a, false, 5849, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        g();
        this.f11943c.b(j3);
        f();
    }

    /* access modifiers changed from: package-private */
    public void a(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11941a, false, 5852, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11941a, false, 5852, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.p == null) {
            this.p = new m.a(getContext(), 2).c(i).a(false).a();
        }
        if (!this.p.isShowing()) {
            this.p.show();
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11941a, false, 5839, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11941a, false, 5839, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.g = (RecyclerView) findViewById(C0906R.id.ccc);
        this.g.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.g.setAdapter(this.f11943c);
        this.q = (ToggleButton) findViewById(C0906R.id.d47);
        this.q.setOnCheckedChangeListener(new bo(this));
        this.m = (TextView) findViewById(C0906R.id.title);
        this.n = (TextView) findViewById(C0906R.id.a3u);
        this.o = findViewById(C0906R.id.a9o);
        f();
    }

    public final void onMessage(IMessage iMessage) {
        if (PatchProxy.isSupport(new Object[]{iMessage}, this, f11941a, false, 5853, new Class[]{IMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMessage}, this, f11941a, false, 5853, new Class[]{IMessage.class}, Void.TYPE);
        } else if (this.k) {
            al alVar = (al) iMessage;
            if (alVar.f16462b != null && alVar.f16462b.f16463a == 7 && !this.f11945e) {
                this.f11945e = true;
                this.l.add(com.bytedance.android.livesdk.v.j.q().d().a().getList(this.f11944d.getId(), 4).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new br(this), new bs(this)));
            }
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11941a, false, 5841, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11941a, false, 5841, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.k) {
            aa.a(this.f11944d, "click_agree_connection", "agree_connection", true);
            a((int) C0906R.string.d5m);
            if (!this.f11942b.h) {
                this.f11942b.m();
                this.j = j2;
                return;
            }
            this.f11942b.a(j2);
        }
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11941a, false, 5850, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11941a, false, 5850, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        g();
        l.a(getContext(), th2, (int) C0906R.string.d5h);
    }

    public final void a(long j2, Throwable th) {
        long j3 = j2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), th2}, this, f11941a, false, 5848, new Class[]{Long.TYPE, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), th2}, this, f11941a, false, 5848, new Class[]{Long.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        g();
        l.a(getContext(), th2, (int) C0906R.string.d5i);
    }

    public bn(@NonNull Context context, boolean z, Room room, List<j> list, cy cyVar) {
        super(context);
        this.f11946f = z;
        this.f11944d = room;
        this.f11943c = new LinkInRoomAudioWaitingListAdapter(this, a(list), z);
        this.f11942b = cyVar;
        this.f11942b.t = this;
    }
}
