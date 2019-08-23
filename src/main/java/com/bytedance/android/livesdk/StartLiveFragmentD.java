package com.bytedance.android.livesdk;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.chatroom.api.BannerRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.BroadcastConfigRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.v;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.bytedance.android.livesdk.chatroom.widget.a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.j.d;
import com.bytedance.android.livesdk.live.a;
import com.bytedance.android.livesdk.share.a;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.k;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.viewmodel.StartLiveBannerViewModel;
import com.bytedance.android.livesdk.viewmodel.g;
import com.bytedance.android.livesdk.w.e;
import com.bytedance.android.livesdk.widget.aa;
import com.bytedance.android.livesdk.widget.i;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.a.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.m;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class StartLiveFragmentD extends StartLiveBaseFragment implements a.C0094a, a.C0119a, b.C0135b, WeakHandler.IHandler {
    private static Gson F = com.bytedance.android.live.a.a();
    public static ChangeQuickRedirect u;
    i A;
    BaseDialogFragment B;
    f.a C;
    b.e D;
    com.bytedance.android.live.base.model.c.a E = com.bytedance.android.live.base.model.c.a.defaultOne();
    private WeakHandler G;
    private Room H;
    private boolean I;
    private ImageView J;
    private View K;
    private EditText L;
    private int M;
    private TextView N;
    private View O;
    private View P;
    private View Q;
    private TextView R;
    private View S;
    private com.bytedance.android.livesdk.chatroom.widget.a T;
    private CheckedTextView U;
    private com.bytedance.android.livesdk.share.a V;
    private boolean W;
    private com.bytedance.android.livesdkapi.depend.model.live.a X;
    private com.bytedance.ies.e.b Y;
    private Game Z;
    private int aa = 1;
    private String ab;
    private ProgressDialog ac;
    private String ad;
    private Disposable ae;
    private aa af;
    private Disposable ag;
    private Disposable ah;
    private StartLiveBannerViewModel ai;
    private View.OnClickListener aj = new ax(this);
    View v;
    public View w;
    View x;
    com.bytedance.android.livesdk.popup.a y;
    User z;

    public final Fragment l() {
        return this;
    }

    public final void a(HashMap<String, String> hashMap) {
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, u, false, 2839, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, this, u, false, 2839, new Class[]{HashMap.class}, Void.TYPE);
            return;
        }
        b(hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        a(com.bytedance.android.livesdkapi.depend.model.live.a.valueOf((String) com.bytedance.android.livesdk.w.b.B.a()));
        j.q().e().a(true);
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2822, new Class[0], Void.TYPE);
            return;
        }
        b((HashMap<String, String>) null);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2835, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2835, new Class[0], Void.TYPE);
            return;
        }
        if (this.y != null && this.y.f()) {
            this.y.dismiss();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2837, new Class[0], Void.TYPE);
            return;
        }
        a(this.aa, false);
        h();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2838, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isShowing()) {
            this.k.dismiss();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2810, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!this.i) {
            this.G.removeMessages(2333);
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2818, new Class[0], Void.TYPE);
            return;
        }
        this.f8835b.a((d.a) e.LAST_SHARE_CHANNEL, this.ad);
        com.bytedance.android.livesdk.w.b.r.a(this.ad);
        com.bytedance.android.livesdk.j.a.a().a("live_action", new Object[0]);
        if (this.ac != null && this.ac.isShowing()) {
            this.ac.dismiss();
            this.N.setEnabled(false);
        }
        if (this.H != null) {
            r();
        }
    }

    private int t() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2833, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, u, false, 2833, new Class[0], Integer.TYPE)).intValue();
        }
        ae aeVar = (ae) F.fromJson((String) ((Map) com.bytedance.android.livesdk.w.b.C.a()).get(this.X.name()), ae.class);
        if (aeVar == null) {
            return -1;
        }
        return aeVar.f11091a;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2821, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        this.s.add(this.n);
        this.s.add(this.o);
        this.s.add(this.p);
        this.s.add(this.q);
    }

    public final List<Pair<String, String>> n() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2843, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, u, false, 2843, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        for (FilterModel next : com.bytedance.android.livesdk.effect.j.a().f13785b) {
            arrayList.add(new Pair(next.getName(), next.getFilterPath()));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void o() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2846, new Class[0], Void.TYPE);
            return;
        }
        if (this.x != null && this.x.getVisibility() == 0) {
            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(false, "show_live_dou_plus", "", d.a.a().a("entrance_type", "live_before").a("pay_mode", "dou_not_iap").a("serving_type", "my_group").a("anchor_id", String.valueOf(TTLiveSDKContext.getHostService().k().b())).f15712b);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2808, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!this.i) {
            if (this.I) {
                q();
                this.I = false;
            }
            if (!this.W) {
                if (!com.bytedance.android.livesdk.m.d.a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.af == null || !this.af.a())) {
                    this.w.setVisibility(0);
                    this.w.setOnClickListener(this.aj);
                    o();
                }
            }
            this.w.setVisibility(8);
            o();
        }
    }

    private void r() {
        Class cls;
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2819, new Class[0], Void.TYPE);
            return;
        }
        try {
            Activity activity = this.h;
            if (this.X.isStreamingBackground) {
                cls = TTLiveSDKContext.getHostService().c().a(6);
            } else {
                cls = TTLiveSDKContext.getHostService().c().a(5);
            }
            Intent intent = new Intent(activity, cls);
            if (com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY == this.X || com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD == this.X) {
                com.bytedance.android.livesdk.w.b.U.a(Boolean.FALSE);
            }
            if (com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD == this.X) {
                intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", this.af.e());
            }
            intent.putExtra("data_dou_plus_promote_entry", this.E);
            com.bytedance.android.livesdk.w.b.B.a(this.X.name());
            this.h.startActivity(intent);
            this.H.isDouPlusPromotion = this.E.hasDouPlusEntry;
            TTLiveSDKContext.getLiveService().d().a(this.H);
            TTLiveSDKContext.getHostService().b().a().b(true);
            this.h.finish();
            this.h.overridePendingTransition(0, 0);
            TTLiveSDKContext.getLiveService().i().a();
        } catch (Exception unused) {
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2809, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.af != null) {
            aa aaVar = this.af;
            if (PatchProxy.isSupport(new Object[0], aaVar, aa.f18400a, false, 14665, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aaVar, aa.f18400a, false, 14665, new Class[0], Void.TYPE);
            } else {
                if (aaVar.o != null && !aaVar.o.isDisposed()) {
                    aaVar.o.dispose();
                }
                com.bytedance.android.livesdk.effect.j.a().b((j.a) aaVar);
            }
        }
        if (this.A != null) {
            i iVar = this.A;
            if (PatchProxy.isSupport(new Object[0], iVar, i.f18483a, false, 14412, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], iVar, i.f18483a, false, 14412, new Class[0], Void.TYPE);
                return;
            }
            if (iVar.f18487e != null) {
                iVar.f18487e.c();
                iVar.f18487e = null;
            }
            iVar.f18488f = null;
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2807, new Class[0], Void.TYPE);
            return;
        }
        if (!this.i) {
            if (this.y != null && this.y.f()) {
                this.y.dismiss();
            }
            this.y = null;
            if (this.T != null) {
                com.bytedance.android.livesdk.chatroom.widget.a aVar = this.T;
                if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.widget.a.f13418a, false, 7799, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.widget.a.f13418a, false, 7799, new Class[0], Void.TYPE);
                } else {
                    aVar.r = null;
                    if (aVar.x != null && !aVar.x.isDisposed()) {
                        aVar.x.dispose();
                    }
                }
                this.T = null;
            }
            if (this.k != null && this.k.isShowing()) {
                this.k.dismiss();
            }
            if (this.ae != null && !this.ae.isDisposed()) {
                this.ae.dispose();
            }
            if (this.ag != null && !this.ag.isDisposed()) {
                this.ag.dispose();
            }
            if (this.ah != null && !this.ah.isDisposed()) {
                this.ah.dispose();
            }
            com.bytedance.android.livesdk.v.j.q().f().a(this.D);
            this.f8836c.clear();
        }
        super.onDestroyView();
    }

    public final void m() {
        float f2;
        float f3;
        float f4;
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2840, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            this.j.a(d());
            com.bytedance.android.livesdkapi.depend.model.a.d dVar = this.j;
            if (PatchProxy.isSupport(new Object[0], this, StartLiveBaseFragment.f8834a, false, 2783, new Class[0], Float.TYPE)) {
                f2 = ((Float) PatchProxy.accessDispatch(new Object[0], this, StartLiveBaseFragment.f8834a, false, 2783, new Class[0], Float.TYPE)).floatValue();
            } else {
                f2 = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * ((Float) com.bytedance.android.livesdk.w.b.G.a()).floatValue();
            }
            dVar.b(f2);
            com.bytedance.android.livesdkapi.depend.model.a.d dVar2 = this.j;
            if (PatchProxy.isSupport(new Object[0], this, StartLiveBaseFragment.f8834a, false, 2785, new Class[0], Float.TYPE)) {
                f3 = ((Float) PatchProxy.accessDispatch(new Object[0], this, StartLiveBaseFragment.f8834a, false, 2785, new Class[0], Float.TYPE)).floatValue();
            } else {
                f3 = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * ((Float) com.bytedance.android.livesdk.w.b.H.a()).floatValue();
            }
            dVar2.c(f3);
            com.bytedance.android.livesdkapi.depend.model.a.d dVar3 = this.j;
            if (PatchProxy.isSupport(new Object[0], this, StartLiveBaseFragment.f8834a, false, 2786, new Class[0], Float.TYPE)) {
                f4 = ((Float) PatchProxy.accessDispatch(new Object[0], this, StartLiveBaseFragment.f8834a, false, 2786, new Class[0], Float.TYPE)).floatValue();
            } else {
                f4 = ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * ((Float) com.bytedance.android.livesdk.w.b.I.a()).floatValue();
            }
            dVar3.d(f4);
            this.j.b(((Integer) com.bytedance.android.livesdk.w.b.E.a()).intValue());
        }
    }

    public final void b(String str) {
        this.ad = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.livesdk.x.b.a aVar) throws Exception {
        this.H = aVar.f18598a;
        q();
    }

    public final void c(int i) {
        this.M = 10;
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.a.d dVar) {
        this.j = dVar;
        if (this.af != null) {
            this.af.i = this.j;
        }
    }

    public final void a(com.bytedance.android.livesdkapi.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, u, false, 2842, new Class[]{com.bytedance.android.livesdkapi.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, u, false, 2842, new Class[]{com.bytedance.android.livesdkapi.f.class}, Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.remove(fVar);
        }
    }

    private void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, u, false, 2825, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, u, false, 2825, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    private void b(HashMap<String, String> hashMap) {
        long j;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{hashMap}, this, u, false, 2823, new Class[]{HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, this, u, false, 2823, new Class[]{HashMap.class}, Void.TYPE);
        } else if (TTLiveSDKContext.getHostService().a().k()) {
            ai.a((int) C0906R.string.d_c);
        } else if (h()) {
            com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.x.b.a.class).compose(com.bytedance.android.live.core.rxutils.i.a(this)).subscribe((Consumer<? super T>) new bn<Object>(this));
            if (this.ac == null) {
                this.ac = af.b(getContext(), getResources().getString(C0906R.string.cuj));
            }
            this.o.f18597b = this.X;
            this.p.a(this.Z, this.af, this.X);
            com.bytedance.android.livesdk.x.a.b bVar = this.q;
            String obj = this.L.getText().toString();
            WeakHandler weakHandler = this.G;
            String a2 = this.A.a();
            com.bytedance.android.livesdkapi.depend.model.live.a aVar = this.X;
            int t = t();
            if (this.Z == null) {
                j = 0;
            } else {
                j = this.Z.gameId;
            }
            Long valueOf = Long.valueOf(j);
            if (this.X != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO || this.U == null || !this.U.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            bVar.a(obj, weakHandler, a2, aVar, t, valueOf, z2, this.ac, hashMap);
            this.r.a();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, u, false, 2806, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, u, false, 2806, new Class[]{Bundle.class}, Void.TYPE);
        } else if (!this.i) {
            super.onActivityCreated(bundle);
            this.G = new WeakHandler(this);
            com.bytedance.android.livesdk.j.f.a((Context) this.h);
            this.v.post(new ay(this));
            this.V.a(getActivity(), this);
            this.ag = com.bytedance.android.livesdk.u.a.a().a(com.bytedance.android.livesdk.g.d.class).subscribe((Consumer<? super T>) new bg<Object>(this));
            this.ai = (StartLiveBannerViewModel) ViewModelProviders.of((Fragment) this).get(StartLiveBannerViewModel.class);
            this.ai.f17743b.observe(this, new bh(this));
            ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(TTLiveSDKContext.getHostService().k().a().getSecUid(), 0, "live_before", (c<com.bytedance.android.live.base.model.c.a>) new bi<com.bytedance.android.live.base.model.c.a>(this));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, u, false, 2803, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, u, false, 2803, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        com.bytedance.android.livesdk.effect.a.a();
        if (this.af != null) {
            aa aaVar = this.af;
            if (PatchProxy.isSupport(new Object[0], aaVar, aa.f18400a, false, 14664, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aaVar, aa.f18400a, false, 14664, new Class[0], Void.TYPE);
            } else {
                if (aaVar.o != null && !aaVar.o.isDisposed()) {
                    aaVar.o.dispose();
                }
                aaVar.o = com.bytedance.android.livesdk.u.a.a().a(v.class).subscribe((Consumer<? super T>) new Consumer<v>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f18408a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        v vVar = (v) obj;
                        if (PatchProxy.isSupport(new Object[]{vVar}, this, f18408a, false, 14702, new Class[]{v.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{vVar}, this, f18408a, false, 14702, new Class[]{v.class}, Void.TYPE);
                            return;
                        }
                        aa.this.onEvent(vVar);
                    }
                });
            }
        }
        if (this.Y == null) {
            this.Y = com.bytedance.ies.e.b.a(ac.e());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.bytedance.android.livesdk.g.d dVar) throws Exception {
        if (dVar != null) {
            switch (dVar.f14634a) {
                case 0:
                    s();
                    return;
                case 1:
                    if (this.A != null) {
                        this.A.b();
                        return;
                    }
                    break;
                case 2:
                    boolean z2 = dVar.f14635b;
                    if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 2820, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        this.ah = ((BroadcastConfigRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(BroadcastConfigRetrofitApi.class)).getBroadcastConfig().compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new bl(this, z2), bm.f9265b);
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, u, false, 2820, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, u, false, 2832, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, u, false, 2832, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.Q.setVisibility(i);
        this.O.setVisibility(i);
        this.V.setVisibility(i);
        this.L.setVisibility(i);
        View view = this.x;
        if (i != 0 || !this.E.hasDouPlusEntry) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.A != null) {
            this.A.a(i);
        }
        if (!(this.D == null || this.D.f9317b == null || this.C == null || Lists.isEmpty(this.C.f11118b))) {
            this.D.f9317b.setVisibility(i);
        }
        if (i == 0) {
            if (!this.W) {
                if (!com.bytedance.android.livesdk.m.d.a((Context) getActivity(), "android.permission.ACCESS_FINE_LOCATION") && (this.af == null || !this.af.a())) {
                    this.w.setVisibility(0);
                    this.w.setOnClickListener(this.aj);
                    return;
                }
            }
            this.w.setVisibility(8);
            return;
        }
        this.w.setVisibility(i);
    }

    public final void d(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, u, false, 2836, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, u, false, 2836, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        boolean a2 = a("beauty_filter_dialog_tag");
        boolean a3 = a("filter_dialog_tag");
        if (!a2 && !a3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, com.bytedance.android.livesdk.j.b.f15646a, true, 10866, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, com.bytedance.android.livesdk.j.b.f15646a, true, 10866, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                String str = "";
                List<FilterModel> list = com.bytedance.android.livesdk.effect.j.a().f13785b;
                if (i2 < list.size()) {
                    str = list.get(i2).getFilterId();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", "draw");
                hashMap.put("filter_id", str);
                com.bytedance.android.livesdk.j.a.a().a("live_take_filter_select", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click").a("live_take_page"));
            }
            com.bytedance.android.livesdk.w.b.E.a(Integer.valueOf(i));
            float a4 = com.bytedance.android.livesdk.effect.f.a(com.bytedance.android.livesdk.effect.j.a().f13785b, i2);
            if (d() > (((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * a4) / 100.0f) {
                float f2 = a4 / 100.0f;
                this.j.a(f2);
                com.bytedance.android.livesdk.w.b.F.a(Float.valueOf(f2));
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.a aVar) {
        String str;
        boolean z2;
        com.bytedance.android.livesdkapi.depend.model.live.a aVar2 = aVar;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, u, false, 2834, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, u, false, 2834, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
        } else if (b_()) {
            if (this.v != null) {
                View view = this.v;
                if (aVar2 != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                view.setClickable(z2);
            }
            if (aVar2 != this.X) {
                this.X = aVar2;
                if (!(this.D == null || this.D.f9317b == null)) {
                    this.D.f9317b.setVisibility(4);
                }
                if (this.X == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else if (this.X == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                    str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                } else if (this.X == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                    str = "3";
                } else {
                    str = PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION;
                }
                StartLiveBannerViewModel startLiveBannerViewModel = this.ai;
                if (PatchProxy.isSupport(new Object[]{str}, startLiveBannerViewModel, StartLiveBannerViewModel.f17742a, false, 13876, new Class[]{String.class}, Void.TYPE)) {
                    StartLiveBannerViewModel startLiveBannerViewModel2 = startLiveBannerViewModel;
                    PatchProxy.accessDispatch(new Object[]{str}, startLiveBannerViewModel2, StartLiveBannerViewModel.f17742a, false, 13876, new Class[]{String.class}, Void.TYPE);
                } else if (((Boolean) LiveSettingKeys.LIVE_PAGE_SHOW_BANNER.a()).booleanValue()) {
                    startLiveBannerViewModel.a(((BannerRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(BannerRetrofitApi.class)).queryStartLiveBanner(str, 2).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new com.bytedance.android.livesdk.viewmodel.f(startLiveBannerViewModel), g.f17757b));
                }
                if (this.y != null && this.y.f()) {
                    this.y.dismiss();
                }
                if (this.af != null) {
                    aa aaVar = this.af;
                    if (PatchProxy.isSupport(new Object[]{aVar2}, aaVar, aa.f18400a, false, 14674, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
                        aa aaVar2 = aaVar;
                        PatchProxy.accessDispatch(new Object[]{aVar2}, aaVar2, aa.f18400a, false, 14674, new Class[]{com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
                    } else if (aVar2 != aaVar.m) {
                        aaVar.m = aVar2;
                        switch (aVar) {
                            case VIDEO:
                                aaVar.f18401b.setVisibility(0);
                                aaVar.f18402c.setVisibility(8);
                                aaVar.f18405f.setVisibility(8);
                                aaVar.f18404e.setVisibility(8);
                                aaVar.g.setVisibility(0);
                                aaVar.f18403d.setVisibility(0);
                                break;
                            case AUDIO:
                                aaVar.f18401b.setVisibility(8);
                                aaVar.f18402c.setVisibility(8);
                                aaVar.f18405f.setVisibility(8);
                                aaVar.f18404e.setVisibility(8);
                                aaVar.g.setVisibility(8);
                                aaVar.f18403d.setVisibility(8);
                                break;
                            case THIRD_PARTY:
                                aaVar.f18401b.setVisibility(8);
                                aaVar.f18402c.setVisibility(8);
                                aaVar.f18405f.setVisibility(8);
                                aaVar.f18404e.setVisibility(8);
                                aaVar.g.setVisibility(8);
                                aaVar.f18403d.setVisibility(8);
                                break;
                            case SCREEN_RECORD:
                                aaVar.f18401b.setVisibility(8);
                                aaVar.f18402c.setVisibility(0);
                                aaVar.f18405f.setVisibility(0);
                                aaVar.f18404e.setVisibility(0);
                                aaVar.a(aaVar.l);
                                aaVar.d();
                                aaVar.g.setVisibility(8);
                                aaVar.f18403d.setVisibility(8);
                                break;
                        }
                        if (com.bytedance.android.live.uikit.a.a.a()) {
                            aaVar.h();
                        } else {
                            aaVar.g();
                        }
                    }
                }
                if (this.A != null) {
                    i iVar = this.A;
                    if (aVar2 != iVar.h) {
                        iVar.h = aVar2;
                    }
                }
                if (this.j != null) {
                    com.bytedance.android.livesdkapi.depend.model.a.d dVar = this.j;
                    if (aVar2 == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                        z3 = false;
                    }
                    dVar.a(z3);
                }
                switch (aVar) {
                    case VIDEO:
                        this.J.setVisibility(0);
                        this.K.setVisibility(8);
                        this.N.setText(C0906R.string.cqr);
                        this.R.setText(C0906R.string.d8j);
                        return;
                    case AUDIO:
                        this.J.setVisibility(4);
                        this.K.setVisibility(8);
                        this.N.setText(C0906R.string.cqt);
                        this.R.setText(C0906R.string.d8h);
                        return;
                    case THIRD_PARTY:
                        this.J.setVisibility(4);
                        this.K.setVisibility(0);
                        this.N.setText(C0906R.string.cqu);
                        this.R.setText(C0906R.string.d8i);
                        return;
                    case SCREEN_RECORD:
                        this.J.setVisibility(4);
                        this.K.setVisibility(0);
                        this.N.setText(C0906R.string.cqs);
                        this.R.setText(C0906R.string.d8g);
                        break;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        View view2;
        String str;
        String str2;
        int id = view.getId();
        if (id == C0906R.id.aiw) {
            a(1 - this.aa, true);
            return;
        }
        if (id == C0906R.id.ti) {
            this.ad = null;
            if (this.j != null) {
                this.j.a();
            }
        } else if (id == C0906R.id.aih) {
            if (!k.a(id, 800)) {
                s();
            }
        } else if (id == C0906R.id.djh) {
            if (PatchProxy.isSupport(new Object[0], this, u, false, 2827, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, u, false, 2827, new Class[0], Void.TYPE);
            } else {
                if (this.T == null) {
                    this.T = new com.bytedance.android.livesdk.chatroom.widget.a(getContext(), this.X);
                    this.T.r = this;
                }
                if (this.y == null || !this.y.f()) {
                    if (this.y == null) {
                        com.bytedance.android.livesdk.popup.d a2 = com.bytedance.android.livesdk.popup.d.a(getContext());
                        com.bytedance.android.livesdk.chatroom.widget.a aVar = this.T;
                        if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.widget.a.f13418a, false, 7794, new Class[0], View.class)) {
                            view2 = (View) PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.livesdk.chatroom.widget.a.f13418a, false, 7794, new Class[0], View.class);
                        } else {
                            View inflate = LayoutInflater.from(aVar.w).inflate(C0906R.layout.afm, null);
                            inflate.findViewById(C0906R.id.dru).setOnClickListener(aVar);
                            aVar.f13419b = (ImageView) inflate.findViewById(C0906R.id.ds7);
                            aVar.f13420c = (TextView) inflate.findViewById(C0906R.id.dt1);
                            aVar.f13421d = inflate.findViewById(C0906R.id.dsw);
                            aVar.s = inflate.findViewById(C0906R.id.gd);
                            aVar.s.setOnClickListener(aVar);
                            aVar.f13422e = (ImageView) inflate.findViewById(C0906R.id.gg);
                            aVar.f13423f = (TextView) inflate.findViewById(C0906R.id.gi);
                            aVar.g = inflate.findViewById(C0906R.id.gh);
                            aVar.t = inflate.findViewById(C0906R.id.d2g);
                            aVar.t.setOnClickListener(aVar);
                            aVar.h = (ImageView) inflate.findViewById(C0906R.id.d2h);
                            aVar.i = (TextView) inflate.findViewById(C0906R.id.d2j);
                            aVar.j = inflate.findViewById(C0906R.id.d2i);
                            aVar.u = inflate.findViewById(C0906R.id.cjz);
                            aVar.u.setOnClickListener(aVar);
                            aVar.k = (ImageView) inflate.findViewById(C0906R.id.ck0);
                            aVar.l = (TextView) inflate.findViewById(C0906R.id.ck2);
                            aVar.m = inflate.findViewById(C0906R.id.ck1);
                            aVar.v = new h(aVar.n, aVar.o, aVar.p);
                            aVar.a(aVar.v, false);
                            HashMap hashMap = new HashMap();
                            if (aVar.o) {
                                str = "show";
                            } else {
                                str = "not_show";
                            }
                            hashMap.put("thirdparty_button", str);
                            if (aVar.p) {
                                str2 = "show";
                            } else {
                                str2 = "not_show";
                            }
                            hashMap.put("game_live_button", str2);
                            com.bytedance.android.livesdk.j.a.a().a("live_take_type_click", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live").f("click").a("live_take_page"));
                            aVar.x = ((BroadcastConfigRetrofitApi) com.bytedance.android.livesdk.v.j.q().d().a(BroadcastConfigRetrofitApi.class)).getBroadcastConfig().compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe(new com.bytedance.android.livesdk.chatroom.widget.b(aVar), com.bytedance.android.livesdk.chatroom.widget.c.f13471b);
                            aVar.a(aVar.q);
                            view2 = inflate;
                        }
                        this.y = ((com.bytedance.android.livesdk.popup.d) ((com.bytedance.android.livesdk.popup.d) a2.a(view2, -1, -2)).b(true)).b();
                        com.bytedance.android.livesdk.popup.a aVar2 = this.y;
                        bc bcVar = new bc(this);
                        if (PatchProxy.isSupport(new Object[]{bcVar}, aVar2, com.bytedance.android.livesdk.popup.a.f16841a, false, 12812, new Class[]{PopupWindow.OnDismissListener.class}, com.bytedance.android.livesdk.popup.a.class)) {
                            com.bytedance.android.livesdk.popup.a aVar3 = aVar2;
                            com.bytedance.android.livesdk.popup.a aVar4 = (com.bytedance.android.livesdk.popup.a) PatchProxy.accessDispatch(new Object[]{bcVar}, aVar3, com.bytedance.android.livesdk.popup.a.f16841a, false, 12812, new Class[]{PopupWindow.OnDismissListener.class}, com.bytedance.android.livesdk.popup.a.class);
                        } else {
                            aVar2.i = bcVar;
                            aVar2.a();
                        }
                    }
                    this.y.a(this.v.findViewById(C0906R.id.d63), 2, 0, 0, ac.a(1.0f));
                    b(8);
                    return;
                }
                this.y.dismiss();
            }
        } else if (id == C0906R.id.d89) {
            if (PatchProxy.isSupport(new Object[0], this, u, false, 2828, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, u, false, 2828, new Class[0], Void.TYPE);
            } else {
                long b2 = TTLiveSDKContext.getHostService().k().b();
                if (PatchProxy.isSupport(new Object[]{new Long(b2)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10894, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(b2)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10894, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("event_belong", "live");
                    hashMap2.put("event_type", "click");
                    hashMap2.put("event_page", "live_take_page");
                    hashMap2.put("event_module", "location");
                    hashMap2.put("user_id", String.valueOf(b2));
                    com.bytedance.android.livesdk.j.a.a().a("remind_location_click", hashMap2, new Object[0]);
                }
                if (getActivity() != null) {
                    com.bytedance.android.livesdk.m.f.a(getActivity()).a(bd.f9133b).b(be.f9135b).a(new com.bytedance.android.livesdk.m.b.d() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f8841a;

                        public final void a(String... strArr) {
                            if (PatchProxy.isSupport(new Object[]{strArr}, this, f8841a, false, 2863, new Class[]{String[].class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{strArr}, this, f8841a, false, 2863, new Class[]{String[].class}, Void.TYPE);
                                return;
                            }
                            StartLiveFragmentD.this.w.setVisibility(8);
                            long b2 = TTLiveSDKContext.getHostService().k().b();
                            if (PatchProxy.isSupport(new Object[]{new Long(b2)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10895, new Class[]{Long.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{new Long(b2)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10895, new Class[]{Long.TYPE}, Void.TYPE);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_belong", "live");
                            hashMap.put("event_type", "pv");
                            hashMap.put("event_page", "live_take_page");
                            hashMap.put("enter_from", "live_take_page");
                            hashMap.put("source", "location");
                            hashMap.put("user_id", String.valueOf(b2));
                            hashMap.put("is_success", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                            com.bytedance.android.livesdk.j.a.a().a("location_feedback", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live").f("pv"));
                        }

                        public final void b(String... strArr) {
                            if (PatchProxy.isSupport(new Object[]{strArr}, this, f8841a, false, 2864, new Class[]{String[].class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{strArr}, this, f8841a, false, 2864, new Class[]{String[].class}, Void.TYPE);
                                return;
                            }
                            long b2 = TTLiveSDKContext.getHostService().k().b();
                            if (PatchProxy.isSupport(new Object[]{new Long(b2)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10896, new Class[]{Long.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{new Long(b2)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10896, new Class[]{Long.TYPE}, Void.TYPE);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_belong", "live");
                            hashMap.put("event_type", "pv");
                            hashMap.put("event_page", "live_take_page");
                            hashMap.put("enter_from", "live_take_page");
                            hashMap.put("source", "location");
                            hashMap.put("user_id", String.valueOf(b2));
                            hashMap.put("is_success", PushConstants.PUSH_TYPE_NOTIFY);
                            com.bytedance.android.livesdk.j.a.a().a("location_feedback", hashMap, new Object[0]);
                        }
                    }, "android.permission.ACCESS_FINE_LOCATION");
                }
            }
        } else if (id == C0906R.id.bec) {
            if (PatchProxy.isSupport(new Object[0], this, u, false, 2830, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, u, false, 2830, new Class[0], Void.TYPE);
            } else {
                com.bytedance.android.livesdk.v.j.q().f().a(getContext(), com.bytedance.android.livesdk.browser.c.c.b("https://webcast.amemv.com/falcon/webcast_douyin/page/obs_intro/index.html").a(ac.a((int) C0906R.string.d8x)));
                com.bytedance.android.livesdk.j.a.a().a("game_take_guide", new com.bytedance.android.livesdk.j.c.j().b("live").f("click").a("live_take_page"));
            }
        } else if (id == C0906R.id.cpp) {
            if (PatchProxy.isSupport(new Object[0], this, u, false, 2831, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, u, false, 2831, new Class[0], Void.TYPE);
            } else if (b_()) {
                String secUid = com.bytedance.android.livesdkapi.h.f().l().b().getSecUid();
                ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(false, "click_live_dou_plus", "", d.a.a().a("entrance_type", "live_before").a("pay_mode", "dou_not_iap").a("serving_type", "my_group").a("anchor_id", String.valueOf(TTLiveSDKContext.getHostService().k().a().getId())).f15712b);
                ((com.bytedance.android.livesdkapi.c.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.c.a.class)).a(this.h, secUid, this.E.douPlusEntry);
            }
        }
    }

    public void handleMsg(Message message) {
        byte b2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i;
        Bundle bundle;
        Message message2 = message;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{message2}, this, u, false, 2812, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, u, false, 2812, new Class[]{Message.class}, Void.TYPE);
        } else if (message2.obj instanceof Exception) {
            Exception exc = (Exception) message2.obj;
            if (message2.what == 1) {
                if (b_()) {
                    if (this.ac != null) {
                        this.ac.dismiss();
                    }
                    boolean z3 = exc instanceof com.bytedance.android.live.a.a.b.a;
                    if (z3) {
                        com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc;
                        int errorCode = aVar.getErrorCode();
                        if (errorCode == 10018) {
                            g();
                        } else if (errorCode == 20054) {
                            HashMap hashMap = new HashMap();
                            if (this.X == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            hashMap.put("is_obs", String.valueOf(i));
                            hashMap.put("_param_live_platform", "live");
                            com.bytedance.android.livesdk.j.a.a().a("enter_verify_page", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live"));
                            if (com.bytedance.android.live.uikit.a.a.a()) {
                                m p = ((com.bytedance.android.livesdkapi.service.b) TTLiveSDKContext.getService(com.bytedance.android.livesdkapi.service.b.class)).p();
                                FragmentActivity activity = getActivity();
                                String extra = aVar.getExtra();
                                if (PatchProxy.isSupport(new Object[0], this, u, false, 2813, new Class[0], Bundle.class)) {
                                    bundle = (Bundle) PatchProxy.accessDispatch(new Object[0], this, u, false, 2813, new Class[0], Bundle.class);
                                } else {
                                    bundle = new Bundle();
                                    String str12 = "show";
                                    if (this.X == com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY) {
                                        str12 = "obs";
                                    }
                                    bundle.putString("live_type", str12);
                                }
                                p.a(activity, 109, extra, bundle);
                            } else {
                                ((com.bytedance.android.livesdkapi.service.b) TTLiveSDKContext.getService(com.bytedance.android.livesdkapi.service.b.class)).p().a(getActivity(), 109, aVar.getExtra());
                            }
                        } else if (errorCode == 30011) {
                            if (PatchProxy.isSupport(new Object[0], this, u, false, 2815, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, u, false, 2815, new Class[0], Void.TYPE);
                            } else {
                                new m.a(getContext(), 0).a(true).c((int) C0906R.string.dkb).b(0, (int) C0906R.string.cq_, (DialogInterface.OnClickListener) new bj(this)).b(1, (int) C0906R.string.cpv, bk.f9260b).a().show();
                            }
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                            l.a((Context) this.h, (Throwable) exc, (int) C0906R.string.cuk);
                        } else {
                            Activity activity2 = this.h;
                            String message3 = aVar.getMessage();
                            if (PatchProxy.isSupport(new Object[]{activity2, exc, message3}, null, l.f17618a, true, 13650, new Class[]{Context.class, Throwable.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity2, exc, message3}, null, l.f17618a, true, 13650, new Class[]{Context.class, Throwable.class, String.class}, Void.TYPE);
                            } else if (!(exc == null || activity2 == null)) {
                                if (z3) {
                                    String prompt = aVar.getPrompt();
                                    String alert = aVar.getAlert();
                                    if (!TextUtils.isEmpty(alert)) {
                                        l.a((Context) activity2, alert, activity2.getResources().getString(C0906R.string.crx));
                                    } else if (!TextUtils.isEmpty(prompt)) {
                                        com.bytedance.android.live.uikit.d.a.a((Context) activity2, prompt);
                                    } else {
                                        com.bytedance.android.live.uikit.d.a.a((Context) activity2, message3);
                                    }
                                } else {
                                    com.bytedance.android.live.uikit.d.a.a((Context) activity2, message3);
                                }
                            }
                        }
                    } else {
                        l.a((Context) this.h, (Throwable) exc, (int) C0906R.string.cuk);
                    }
                }
                com.bytedance.android.livesdk.j.f.a((Context) this.h);
                if (this.X != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                    z2 = false;
                }
                com.bytedance.android.livesdk.live.a.a(exc, z2);
            }
        } else {
            if (message2.what == 1) {
                this.H = (Room) message2.obj;
                if (!Room.isValid(this.H)) {
                    if (this.ac != null) {
                        this.ac.dismiss();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("invalid room");
                    l.a((Context) this.h, (Throwable) illegalStateException, (int) C0906R.string.cuk);
                    if (this.X != com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                        z2 = false;
                    }
                    com.bytedance.android.livesdk.live.a.a(illegalStateException, z2);
                    return;
                }
                long id = this.H.getId();
                if (PatchProxy.isSupport(new Object[]{new Long(id)}, this, u, false, 2816, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(id)}, this, u, false, 2816, new Class[]{Long.TYPE}, Void.TYPE);
                } else {
                    String str13 = this.ab;
                    Room room = this.H;
                    com.bytedance.android.livesdkapi.depend.model.live.a aVar2 = this.X;
                    Game game = this.Z;
                    if (PatchProxy.isSupport(new Object[]{str13, room, aVar2, game}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10899, new Class[]{String.class, Room.class, com.bytedance.android.livesdkapi.depend.model.live.a.class, Game.class}, Void.TYPE)) {
                        Object[] objArr = {str13, room, aVar2, game};
                        Object[] objArr2 = objArr;
                        PatchProxy.accessDispatch(objArr2, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10899, new Class[]{String.class, Room.class, com.bytedance.android.livesdkapi.depend.model.live.a.class, Game.class}, Void.TYPE);
                    } else {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("event_belong", "live_take");
                        hashMap2.put("event_type", "click");
                        hashMap2.put("enter_from", str13);
                        hashMap2.put("event_page", "live_take_page");
                        hashMap2.put("room_id", String.valueOf(room.getId()));
                        if (room.isLiveTypeAudio()) {
                            str11 = "voice_live";
                        } else {
                            str11 = "video_live";
                        }
                        hashMap2.put("live_type", str11);
                        hashMap2.put("streaming_type", aVar2.logStreamingType);
                        if (aVar2 == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD && game != null) {
                            hashMap2.put("game_name", game.name);
                        }
                        com.bytedance.android.livesdk.j.a.a().a("live_take", hashMap2, new Object[0]);
                    }
                    if (this.L.getText() != null && !TextUtils.isEmpty(this.L.getText())) {
                        Room room2 = this.H;
                        com.bytedance.android.livesdkapi.depend.model.live.a aVar3 = this.X;
                        if (PatchProxy.isSupport(new Object[]{room2, aVar3}, null, com.bytedance.android.livesdk.j.b.f15646a, true, 10865, new Class[]{Room.class, com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE)) {
                            Object[] objArr3 = {room2, aVar3};
                            Object[] objArr4 = objArr3;
                            PatchProxy.accessDispatch(objArr4, null, com.bytedance.android.livesdk.j.b.f15646a, true, 10865, new Class[]{Room.class, com.bytedance.android.livesdkapi.depend.model.live.a.class}, Void.TYPE);
                        } else {
                            HashMap hashMap3 = new HashMap();
                            if (room2.isLiveTypeAudio()) {
                                str10 = "voice_live";
                            } else {
                                str10 = "video_live";
                            }
                            hashMap3.put("live_type", str10);
                            hashMap3.put("streaming_type", aVar3.logStreamingType);
                            com.bytedance.android.livesdk.j.a.a().a("pm_live_take_title_write", hashMap3, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("other").a("live_take_page"), new com.bytedance.android.livesdk.j.c.k());
                        }
                    }
                    com.bytedance.android.livesdk.effect.f.a(id);
                    com.bytedance.android.livesdkapi.d dVar = this.f8835b;
                    com.bytedance.android.livesdk.w.c<Float> cVar = com.bytedance.android.livesdk.w.b.F;
                    com.bytedance.android.livesdk.w.c<Float> cVar2 = com.bytedance.android.livesdk.w.b.G;
                    Room room3 = this.H;
                    com.bytedance.android.livesdkapi.depend.model.live.a aVar4 = this.X;
                    User user = this.z;
                    int t = t();
                    if (PatchProxy.isSupport(new Object[]{dVar, cVar, cVar2, room3, aVar4, user, Integer.valueOf(t)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10900, new Class[]{com.bytedance.android.livesdkapi.d.class, com.bytedance.android.livesdk.w.c.class, com.bytedance.android.livesdk.w.c.class, Room.class, com.bytedance.android.livesdkapi.depend.model.live.a.class, User.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar, cVar, cVar2, room3, aVar4, user, Integer.valueOf(t)}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10900, new Class[]{com.bytedance.android.livesdkapi.d.class, com.bytedance.android.livesdk.w.c.class, com.bytedance.android.livesdk.w.c.class, Room.class, com.bytedance.android.livesdkapi.depend.model.live.a.class, User.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        float floatValue = ((Float) cVar.a()).floatValue() * 100.0f;
                        float floatValue2 = ((Float) cVar2.a()).floatValue() * 100.0f;
                        float floatValue3 = ((Float) com.bytedance.android.livesdk.w.b.H.a()).floatValue() * 100.0f;
                        float floatValue4 = ((Float) com.bytedance.android.livesdk.w.b.I.a()).floatValue() * 100.0f;
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("event_page", "live_take_page");
                        if (room3.isLiveTypeAudio()) {
                            str3 = "voice_live";
                        } else {
                            str3 = "video_live";
                        }
                        hashMap4.put("live_type", str3);
                        hashMap4.put("streaming_type", aVar4.logStreamingType);
                        hashMap4.put("anchor_id", String.valueOf(user.getId()));
                        if (t == -1) {
                            str4 = PushConstants.PUSH_TYPE_NOTIFY;
                        } else {
                            str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        }
                        hashMap4.put("is_tag", str4);
                        if (aVar4 == com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
                            str5 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str5 = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        hashMap4.put("is_beauty", str5);
                        if (aVar4 != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                            str6 = PushConstants.PUSH_TYPE_NOTIFY;
                        } else {
                            str6 = String.valueOf(floatValue);
                        }
                        hashMap4.put("beauty_white", str6);
                        if (aVar4 != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                            str7 = PushConstants.PUSH_TYPE_NOTIFY;
                        } else {
                            str7 = String.valueOf(floatValue2);
                        }
                        hashMap4.put("beauty_skin", str7);
                        if (aVar4 != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                            str8 = PushConstants.PUSH_TYPE_NOTIFY;
                        } else {
                            str8 = String.valueOf(floatValue3);
                        }
                        hashMap4.put("beauty_bigeye", str8);
                        if (aVar4 != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO) {
                            str9 = PushConstants.PUSH_TYPE_NOTIFY;
                        } else {
                            str9 = String.valueOf(floatValue4);
                        }
                        hashMap4.put("beauty_facethin", str9);
                        com.bytedance.android.livesdk.j.a.a().a("pm_live_take_edit_features", hashMap4, new com.bytedance.android.livesdk.j.c.j().b("live_take").f("click"));
                    }
                    if (this.X == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2)}, null, com.bytedance.android.livesdk.live.a.f15781a, true, 10236, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2)}, null, com.bytedance.android.livesdk.live.a.f15781a, true, 10236, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        long a2 = com.bytedance.android.livesdk.live.a.a();
                        com.bytedance.android.livesdk.j.h a3 = new com.bytedance.android.livesdk.j.h().a("duration", (float) a2).a("errorDomain", (Object) a.C0110a.API.value);
                        if (b2 != 0) {
                            str = "audio";
                        } else {
                            str = "video";
                        }
                        a3.a("mediaType", (Object) str).a("hotsoon_live_start_live_failure_rate", 0);
                        if (PatchProxy.isSupport(new Object[]{new Long(a2), Byte.valueOf(b2)}, null, com.bytedance.android.livesdk.live.b.f15797b, true, 10243, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(a2), Byte.valueOf(b2)}, null, com.bytedance.android.livesdk.live.b.f15797b, true, 10243, new Class[]{Long.TYPE, Boolean.TYPE}, Void.TYPE);
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            if (b2 != 0) {
                                str2 = "audio";
                            } else {
                                str2 = "video";
                            }
                            com.bytedance.android.livesdk.live.b.a(jSONObject, "media_type", str2);
                            com.bytedance.android.live.core.d.e.a("ttlive_create_room_all", 0, a2, jSONObject);
                        }
                    }
                    if (TextUtils.isEmpty(this.ad)) {
                        q();
                    } else {
                        if (PatchProxy.isSupport(new Object[0], this, u, false, 2817, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, u, false, 2817, new Class[0], Void.TYPE);
                        } else {
                            this.H.isDouPlusPromotion = this.E.hasDouPlusEntry;
                            TTLiveSDKContext.getLiveService().d().a(this.H);
                            this.I = com.bytedance.android.livesdk.share.e.a(this.h, this.ad, this.H);
                            com.bytedance.android.livesdk.w.b.r.a(this.ad);
                            String str14 = this.ad;
                            Activity activity3 = this.h;
                            Room room4 = this.H;
                            if (PatchProxy.isSupport(new Object[]{str14, activity3, room4}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10901, new Class[]{String.class, Activity.class, Room.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str14, activity3, room4}, null, com.bytedance.android.livesdk.j.g.f15716a, true, 10901, new Class[]{String.class, Activity.class, Room.class}, Void.TYPE);
                            } else {
                                if (StringUtils.equal(str14, "weixin_moment")) {
                                    str14 = "weixin_moment";
                                }
                                com.bytedance.android.livesdk.j.f.a((Context) activity3).a("share_my_live_share", str14, room4.getId(), 0);
                                HashMap hashMap5 = new HashMap();
                                hashMap5.put("event_belong", "live_interact");
                                hashMap5.put("event_page", "live_take_page");
                                hashMap5.put("room_id", String.valueOf(room4.getId()));
                                hashMap5.put("platform", str14);
                                com.bytedance.android.livesdk.j.a.a().a("live_take_share", hashMap5, new Object[0]);
                            }
                            if (!this.I) {
                                q();
                            } else {
                                int intValue = ((Integer) LiveSettingKeys.START_LIVE_SHARE_TIMEOUT.a()).intValue();
                                if (intValue > 0) {
                                    this.G.sendEmptyMessageDelayed(2333, ((long) intValue) * 1000);
                                }
                            }
                        }
                    }
                }
            } else if (message2.what == 2333) {
                q();
            }
        }
    }

    public final void a(com.bytedance.android.livesdkapi.f fVar, int i) {
        if (PatchProxy.isSupport(new Object[]{fVar, 0}, this, u, false, 2841, new Class[]{com.bytedance.android.livesdkapi.f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, 0}, this, u, false, 2841, new Class[]{com.bytedance.android.livesdkapi.f.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.s != null && !this.s.contains(fVar)) {
            this.s.add(0, fVar);
        }
    }

    private void a(int i, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 2829, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z2)}, this, u, false, 2829, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.core.utils.a.b.b()) {
            com.bytedance.android.live.uikit.d.a.a(ac.e(), (int) C0906R.string.cxg);
        }
        if (z2) {
            if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.livesdk.j.b.f15646a, true, 10867, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.livesdk.j.b.f15646a, true, 10867, new Class[0], Void.TYPE);
            } else {
                com.bytedance.android.livesdk.j.a.a().a("camera_switch", new com.bytedance.android.livesdk.j.c.j().a("live_take_page").b("live").f("click"));
            }
        }
        if (com.bytedance.android.live.core.utils.a.b.b()) {
            com.bytedance.android.live.uikit.d.a.a(ac.e(), (int) C0906R.string.cxg);
        }
        this.aa = i;
        this.j.a(this.aa);
        com.bytedance.android.livesdk.w.b.g.b(Integer.valueOf(i));
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, u, false, 2805, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, u, false, 2805, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        String a2 = this.Y.a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            this.Z = Game.fromJson(a2);
        }
        if (PatchProxy.isSupport(new Object[0], this, u, false, 2814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 2814, new Class[0], Void.TYPE);
        } else {
            this.P = this.v.findViewById(C0906R.id.dji);
            this.R = (TextView) this.v.findViewById(C0906R.id.djh);
            this.R.setOnClickListener(this.aj);
            this.J = (ImageView) this.v.findViewById(C0906R.id.aiw);
            this.J.setOnClickListener(this.aj);
            this.K = this.v.findViewById(C0906R.id.bec);
            this.K.setOnClickListener(this.aj);
            this.S = this.v.findViewById(C0906R.id.ti);
            this.S.setOnClickListener(this.aj);
            this.Q = this.v.findViewById(C0906R.id.cun);
            this.L = (EditText) this.v.findViewById(C0906R.id.bf9);
            this.w = this.v.findViewById(C0906R.id.d89);
            this.O = this.v.findViewById(C0906R.id.diu);
            this.V = (com.bytedance.android.livesdk.share.a) this.v.findViewById(C0906R.id.du2);
            this.U = (CheckedTextView) this.v.findViewById(C0906R.id.xo);
            this.N = (TextView) this.v.findViewById(C0906R.id.aih);
            this.N.setOnClickListener(this.aj);
            this.af = new aa(this.v.findViewById(C0906R.id.co9), this, this.N);
            this.af.i = this.j;
            this.x = this.v.findViewById(C0906R.id.cpp);
            this.x.setOnClickListener(this.aj);
            this.A = new i(this.v, this);
            if (this.M != 0) {
                e(this.M);
            } else {
                e(20);
            }
            if (!this.i) {
                if (this.z.getAvatarMedium() == null) {
                    User user = this.z;
                    if (PatchProxy.isSupport(new Object[]{user}, this, u, false, 2824, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{user}, this, u, false, 2824, new Class[]{com.bytedance.android.live.base.model.user.i.class}, Void.TYPE);
                    } else {
                        this.ae = TTLiveSDKContext.getHostService().k().b(user.getId()).subscribeOn(Schedulers.io()).filter(az.f9079b).observeOn(AndroidSchedulers.mainThread()).subscribe(new ba(this), bb.f9129a);
                    }
                }
                int i2 = 8;
                if (PatchProxy.isSupport(new Object[0], this, u, false, 2826, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, u, false, 2826, new Class[0], Void.TYPE);
                } else {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        int intValue = ((Integer) com.bytedance.android.livesdk.w.b.t.a()).intValue();
                        if (com.bytedance.android.livesdk.m.d.a((Context) activity, "android.permission.ACCESS_FINE_LOCATION")) {
                            this.w.setVisibility(8);
                            com.bytedance.android.livesdk.w.b.t.a(0);
                        } else if (intValue <= 5) {
                            this.w.setVisibility(0);
                            this.w.setOnClickListener(this.aj);
                            com.bytedance.android.livesdk.w.b.t.a(Integer.valueOf(intValue + 1));
                        } else {
                            this.W = true;
                        }
                    }
                }
                TextView textView = this.R;
                if (com.bytedance.android.livesdkapi.a.a.f18615c) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
                View view2 = this.P;
                if (!com.bytedance.android.livesdkapi.a.a.f18615c) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
            }
        }
        f();
        if (this.j != null) {
            this.j.b();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, u, false, 2804, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, u, false, 2804, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        } else if (this.i) {
            return null;
        } else {
            this.v = LayoutInflater.from(getContext()).inflate(C0906R.layout.ail, viewGroup, false);
            this.z = (User) TTLiveSDKContext.getHostService().k().a();
            if (this.z.getId() != ((Long) com.bytedance.android.livesdk.w.b.A.a()).longValue()) {
                com.bytedance.android.livesdk.w.b.A.a(Long.valueOf(this.z.getId()));
                com.bytedance.android.livesdk.w.b.B.a(com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO.name());
            }
            return this.v;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, u, false, 2811, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, u, false, 2811, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (!this.i) {
            if (i3 == 20001 && Build.VERSION.SDK_INT >= 21) {
                if (i4 == -1) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                    if (mediaProjectionManager != null) {
                        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i4, intent2);
                        if (mediaProjection != null) {
                            BgBroadcastServiceImpl.setProjection(mediaProjection);
                            s();
                            return;
                        }
                    }
                }
                ai.a((int) C0906R.string.dk8);
            } else if (i4 != 120) {
                i iVar = this.A;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, iVar, i.f18483a, false, 14411, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
                    Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent2};
                    Object[] objArr2 = objArr;
                    i iVar2 = iVar;
                    ((Boolean) PatchProxy.accessDispatch(objArr2, iVar2, i.f18483a, false, 14411, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
                } else {
                    iVar.f18487e.a(i3, i4, intent2);
                }
            } else if (i3 == 10001) {
                s();
            } else {
                if (i3 == 10002 && this.af != null) {
                    this.af.b();
                }
            }
        }
    }
}
