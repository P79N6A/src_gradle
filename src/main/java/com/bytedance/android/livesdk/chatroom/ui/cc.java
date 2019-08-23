package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.c.es;
import com.bytedance.android.livesdk.chatroom.model.a.j;
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

public final class cc extends e implements es.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11991a;

    /* renamed from: b  reason: collision with root package name */
    public es f11992b;

    /* renamed from: c  reason: collision with root package name */
    Room f11993c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f11994d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f11995e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f11996f;
    private View g;
    private m j;
    private LinkInRoomVideoListAdapter k;

    public final int a() {
        return C0906R.layout.agj;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f11991a, false, 5912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11991a, false, 5912, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f11991a, false, 5907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11991a, false, 5907, new Class[0], Void.TYPE);
            return;
        }
        f();
        dismiss();
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11991a, false, 5913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11991a, false, 5913, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f11992b.k = null;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f11991a, false, 5911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11991a, false, 5911, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new m.a(getContext(), 2).a(false).a();
        }
        if (!this.j.isShowing()) {
            this.j.show();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f11991a, false, 5909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11991a, false, 5909, new Class[0], Void.TYPE);
            return;
        }
        f();
        this.f11994d.setTextColor(getContext().getResources().getColor(C0906R.color.a_w));
        this.f11994d.setText(ac.a((int) C0906R.string.d4f));
        this.f11994d.setBackgroundResource(2130840773);
        this.k.b(TTLiveSDKContext.getHostService().k().b());
        if (this.k.getItemCount() > 0) {
            this.g.setVisibility(8);
            this.f11996f.setVisibility(0);
        } else {
            this.g.setVisibility(0);
            this.f11996f.setVisibility(8);
        }
        this.f11995e.setText(ac.a((int) C0906R.string.d5k, Integer.valueOf(this.k.getItemCount())));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (PatchProxy.isSupport(new Object[0], this, f11991a, false, 5906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11991a, false, 5906, new Class[0], Void.TYPE);
            return;
        }
        if (this.i) {
            int intValue = ((Integer) com.bytedance.android.livesdk.app.dataholder.e.a().f9041c).intValue();
            if (2 == intValue) {
                new m.a(getContext(), 0).c((int) C0906R.string.d6w).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11999a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11999a, false, 5918, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11999a, false, 5918, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                        cc.this.f11992b.g();
                        cc.this.d();
                    }
                }).b(1, (int) C0906R.string.cpz, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f11997a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11997a, false, 5917, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f11997a, false, 5917, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                    }
                }).c();
            } else if (1 == intValue) {
                new m.a(getContext(), 0).c((int) C0906R.string.d6s).b(0, (int) C0906R.string.dg_, (DialogInterface.OnClickListener) new ce(this)).b(1, (int) C0906R.string.cpz, cf.f12006b).c();
            } else {
                dismiss();
                this.f11992b.c();
            }
        }
    }

    public final void a(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11991a, false, 5908, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11991a, false, 5908, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        f();
        l.a(getContext(), th2, (int) C0906R.string.d6x);
    }

    public final void b(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f11991a, false, 5910, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f11991a, false, 5910, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        f();
        l.a(getContext(), th2, (int) C0906R.string.d6t);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11991a, false, 5905, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11991a, false, 5905, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f11996f = (RecyclerView) findViewById(C0906R.id.ccc);
        this.f11996f.addItemDecoration(new InteractListItemDecoration());
        this.f11996f.setLayoutManager(new SSLinearLayoutManager(getContext(), 0, false));
        this.f11996f.setAdapter(this.k);
        this.f11995e = (TextView) findViewById(C0906R.id.title);
        this.f11995e.setText(ac.a((int) C0906R.string.d5k, Integer.valueOf(this.k.getItemCount())));
        this.f11994d = (TextView) findViewById(C0906R.id.a9);
        int intValue = ((Integer) com.bytedance.android.livesdk.app.dataholder.e.a().f9041c).intValue();
        TextView textView = this.f11994d;
        if (intValue != 0) {
            i = -1;
        } else {
            i = -16777216;
        }
        textView.setTextColor(i);
        int i3 = C0906R.string.d4f;
        switch (intValue) {
            case 1:
                i3 = C0906R.string.d4t;
                break;
            case 2:
                i3 = C0906R.string.d51;
                break;
        }
        this.f11994d.setText(i3);
        TextView textView2 = this.f11994d;
        if (intValue != 0) {
            i2 = 2130840774;
        } else {
            i2 = 2130840773;
        }
        textView2.setBackgroundResource(i2);
        this.f11994d.setOnClickListener(new cd(this));
        this.g = findViewById(C0906R.id.a9o);
        if (this.k.getItemCount() > 0) {
            this.g.setVisibility(8);
            this.f11996f.setVisibility(0);
            return;
        }
        this.g.setVisibility(0);
        this.f11996f.setVisibility(8);
    }

    public cc(@NonNull Context context, Room room, List<j> list, es esVar) {
        super(context);
        this.f11993c = room;
        list = list == null ? new ArrayList<>() : list;
        Iterator<j> it2 = list.iterator();
        while (it2.hasNext()) {
            j next = it2.next();
            if (next == null || next.f11052e == null || 1 == next.i) {
                it2.remove();
            }
        }
        this.k = new LinkInRoomVideoListAdapter(null, list, 1);
        this.f11992b = esVar;
        this.f11992b.k = this;
    }
}
