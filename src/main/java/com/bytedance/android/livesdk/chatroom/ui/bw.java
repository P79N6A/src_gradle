package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.interact.c.ec;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.bytedance.android.livesdk.chatroom.ui.LinkInRoomVideoListAdapter;
import com.bytedance.android.livesdk.utils.aa;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.e;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bw extends e implements ec.a, LinkInRoomVideoListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11972a;

    /* renamed from: b  reason: collision with root package name */
    ec f11973b;

    /* renamed from: c  reason: collision with root package name */
    LinkInRoomVideoListAdapter f11974c;

    /* renamed from: d  reason: collision with root package name */
    Room f11975d;

    /* renamed from: e  reason: collision with root package name */
    private long f11976e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f11977f;
    private TextView g;
    private View j;
    private RecyclerView k;
    private m l;
    private ToggleButton m;

    public final int a() {
        return C0906R.layout.agi;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5888, new Class[0], Void.TYPE);
            return;
        }
        f();
        this.f11973b.a(this.f11976e);
        this.f11976e = 0;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5889, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5889, new Class[0], Void.TYPE);
            return;
        }
        f();
        this.f11976e = 0;
        ai.a(getContext(), (int) C0906R.string.d5i);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5890, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5890, new Class[0], Void.TYPE);
            return;
        }
        f();
        if (isShowing()) {
            dismiss();
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5891, new Class[0], Void.TYPE);
            return;
        }
        f();
        this.m.setChecked(true);
        ai.a(getContext(), (int) C0906R.string.d7t);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5898, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null && this.l.isShowing()) {
            this.l.dismiss();
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5899, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f11973b.p = null;
        if (this.l != null && this.l.isShowing()) {
            this.l.dismiss();
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f11972a, false, 5886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11972a, false, 5886, new Class[0], Void.TYPE);
            return;
        }
        this.f11977f.setText(ac.a((int) C0906R.string.d5k, Integer.valueOf(this.f11974c.b())));
        int a2 = 2 - this.f11974c.a();
        if (a2 < 0) {
            a2 = 0;
        }
        this.g.setText(ac.a((int) C0906R.string.d81, Integer.valueOf(a2)));
        if (this.f11974c.getItemCount() > 0) {
            this.j.setVisibility(8);
            this.k.setVisibility(0);
            return;
        }
        this.j.setVisibility(0);
        this.k.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void a(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11972a, false, 5897, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11972a, false, 5897, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.l == null) {
            this.l = new m.a(getContext(), 2).c(i).a(false).a();
        }
        if (!this.l.isShowing()) {
            this.l.show();
        }
    }

    public final void b(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11972a, false, 5895, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11972a, false, 5895, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        f();
        this.f11974c.b(j3);
        g();
    }

    public final void c(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11972a, false, 5887, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11972a, false, 5887, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.i) {
            aa.a(this.f11975d, "click_agree_connection", "agree_connection", true);
            a((int) C0906R.string.d5m);
            if (!this.f11973b.k) {
                this.f11973b.c();
                this.f11976e = j2;
                return;
            }
            this.f11973b.a(j2);
        }
    }

    public final void d(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f11972a, false, 5892, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f11972a, false, 5892, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.i) {
            new m.a(getContext(), 0).c((int) C0906R.string.d4d).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new by(this, j2)).b(1, (int) C0906R.string.cpz, bz.f11984b).c();
        }
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f11972a, false, 5893, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f11972a, false, 5893, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        f();
        this.f11974c.a(j3);
        g();
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11972a, false, 5885, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11972a, false, 5885, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.k = (RecyclerView) findViewById(C0906R.id.ccc);
        this.k.addItemDecoration(new InteractListItemDecoration());
        this.k.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.k.setAdapter(this.f11974c);
        this.m = (ToggleButton) findViewById(C0906R.id.d47);
        this.m.setOnCheckedChangeListener(new bx(this));
        this.f11977f = (TextView) findViewById(C0906R.id.title);
        this.g = (TextView) findViewById(C0906R.id.a3u);
        this.j = findViewById(C0906R.id.a9o);
        g();
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11972a, false, 5896, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11972a, false, 5896, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        f();
        l.a(getContext(), th2, (int) C0906R.string.d5h);
    }

    public final void a(long j2, Throwable th) {
        long j3 = j2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), th2}, this, f11972a, false, 5894, new Class[]{Long.TYPE, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), th2}, this, f11972a, false, 5894, new Class[]{Long.TYPE, Throwable.class}, Void.TYPE);
            return;
        }
        f();
        l.a(getContext(), th2, (int) C0906R.string.d5i);
    }

    public bw(@NonNull Context context, Room room, List<j> list, ec ecVar) {
        super(context);
        this.f11975d = room;
        list = list == null ? new ArrayList<>() : list;
        Iterator<j> it2 = list.iterator();
        while (it2.hasNext()) {
            j next = it2.next();
            if (next == null || next.f11052e == null || 1 == next.i) {
                it2.remove();
            }
        }
        this.f11974c = new LinkInRoomVideoListAdapter(this, list, 0);
        this.f11973b = ecVar;
        this.f11973b.p = this;
    }
}
