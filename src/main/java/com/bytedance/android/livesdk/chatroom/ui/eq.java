package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.e;
import com.bytedance.android.livesdk.chatroom.event.ac;
import com.bytedance.android.livesdk.chatroom.model.ad;
import com.bytedance.android.livesdk.chatroom.ui.RoomDecorationListAdapter;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.y;
import com.bytedance.android.livesdkapi.depend.model.live.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import org.json.JSONObject;

public final class eq extends Dialog implements RoomDecorationListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12213a;

    /* renamed from: b  reason: collision with root package name */
    public RoomDecorationListAdapter f12214b;

    /* renamed from: c  reason: collision with root package name */
    boolean f12215c;

    /* renamed from: d  reason: collision with root package name */
    e f12216d = new e();

    /* renamed from: e  reason: collision with root package name */
    private final CompositeDisposable f12217e = new CompositeDisposable();

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f12218f;

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f12213a, false, 6400, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12213a, false, 6400, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f12215c = false;
    }

    public final void onStart() {
        DecorationApi decorationApi;
        if (PatchProxy.isSupport(new Object[0], this, f12213a, false, 6399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12213a, false, 6399, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f12215c = true;
        if (PatchProxy.isSupport(new Object[0], this, f12213a, false, 6402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12213a, false, 6402, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.f12216d;
        if (PatchProxy.isSupport(new Object[0], eVar, e.f10009b, false, 3905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, e.f10009b, false, 3905, new Class[0], Void.TYPE);
        } else {
            eVar.f10010c = SystemClock.uptimeMillis();
        }
        CompositeDisposable compositeDisposable = this.f12217e;
        y d2 = j.q().d();
        if (PatchProxy.isSupport(new Object[0], d2, y.f18599a, false, 2659, new Class[0], DecorationApi.class)) {
            decorationApi = (DecorationApi) PatchProxy.accessDispatch(new Object[0], d2, y.f18599a, false, 2659, new Class[0], DecorationApi.class);
        } else {
            decorationApi = (DecorationApi) d2.a(DecorationApi.class);
        }
        compositeDisposable.add(decorationApi.getRoomDecorationList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new er(this), new es(this)));
    }

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f12213a, false, 6401, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f12213a, false, 6401, new Class[]{c.class}, Void.TYPE);
            return;
        }
        dismiss();
        a.a().a((Object) new ac(cVar2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) throws Exception {
        ad adVar = (ad) dVar.f7871b;
        if (PatchProxy.isSupport(new Object[]{adVar}, this, f12213a, false, 6403, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar}, this, f12213a, false, 6403, new Class[]{ad.class}, Void.TYPE);
            return;
        }
        e eVar = this.f12216d;
        if (PatchProxy.isSupport(new Object[0], eVar, e.f10009b, false, 3907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, e.f10009b, false, 3907, new Class[0], Void.TYPE);
        } else {
            com.bytedance.android.live.core.d.e.a("ttlive_load_decoration_list_all", 0, eVar.a(), new JSONObject());
        }
        if (this.f12215c) {
            if (this.f12214b == null) {
                this.f12214b = new RoomDecorationListAdapter(adVar, this);
                SSGridLayoutManager sSGridLayoutManager = new SSGridLayoutManager(getContext(), 3, 1, false);
                sSGridLayoutManager.setSpanSizeLookup(new RoomDecorationListDialog$1(this));
                this.f12218f.setLayoutManager(sSGridLayoutManager);
                this.f12218f.setAdapter(this.f12214b);
            }
            RoomDecorationListAdapter roomDecorationListAdapter = this.f12214b;
            if (PatchProxy.isSupport(new Object[]{adVar}, roomDecorationListAdapter, RoomDecorationListAdapter.f11747a, false, 6386, new Class[]{ad.class}, Void.TYPE)) {
                RoomDecorationListAdapter roomDecorationListAdapter2 = roomDecorationListAdapter;
                PatchProxy.accessDispatch(new Object[]{adVar}, roomDecorationListAdapter2, RoomDecorationListAdapter.f11747a, false, 6386, new Class[]{ad.class}, Void.TYPE);
                return;
            }
            roomDecorationListAdapter.f11748b.clear();
            roomDecorationListAdapter.a(adVar);
            roomDecorationListAdapter.notifyDataSetChanged();
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12213a, false, 6397, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12213a, false, 6397, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.aha);
        Window window = getWindow();
        if (window != null) {
            if (com.bytedance.android.live.core.utils.ac.f()) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setLayout(com.bytedance.android.live.core.utils.ac.a(392.0f), -1);
                window.setGravity(5);
                if (Build.BRAND.toLowerCase().equals("xiaomi") && g.a(getContext())) {
                    View findViewById = findViewById(C0906R.id.y9);
                    ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).topMargin = com.bytedance.android.live.core.utils.ac.a(40.0f);
                    findViewById.requestLayout();
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f12213a, false, 6398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12213a, false, 6398, new Class[0], Void.TYPE);
            return;
        }
        this.f12218f = (RecyclerView) findViewById(C0906R.id.a2w);
    }

    public eq(@NonNull Context context, @StyleRes int i) {
        super(context, i);
    }
}
