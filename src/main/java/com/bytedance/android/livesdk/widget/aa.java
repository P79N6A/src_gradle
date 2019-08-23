package com.bytedance.android.livesdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.v;
import com.bytedance.android.livesdk.chatroom.model.Game;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.effect.LiveBeautyDialogFragment;
import com.bytedance.android.livesdk.effect.LiveBeautyFragment;
import com.bytedance.android.livesdk.effect.LiveFilterDialogFragment;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.effect.f;
import com.bytedance.android.livesdk.effect.j;
import com.bytedance.android.livesdk.effect.k;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.android.livesdk.game.SelectGameDialogFragment;
import com.bytedance.android.livesdk.sticker.a.c;
import com.bytedance.android.livesdk.sticker.h;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdkapi.depend.model.a.d;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import org.aspectj.lang.a;

public class aa implements View.OnClickListener, j.a {
    private static final /* synthetic */ a.C0900a E;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18400a;
    private View A;
    private Context B;
    private TextView C;
    private LiveFilterAdapter.a D = new LiveFilterAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18406a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18406a, false, 14701, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18406a, false, 14701, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (aa.this.i != null) {
                aa.this.i.b(i);
            }
            b.E.a(Integer.valueOf(i));
            if (aa.this.i != null) {
                float a2 = f.a(j.a().f13785b, i);
                if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.a()).booleanValue()) {
                    float f2 = a2 / 100.0f;
                    if (((Float) b.F.a()).floatValue() > f2) {
                        aa.this.i.a(f2);
                        b.F.a(Float.valueOf(f2));
                    }
                } else if (!Lists.isEmpty(j.a().f13785b) && i >= 0 && i < j.a().f13785b.size()) {
                    com.bytedance.android.livesdk.sticker.b.a b2 = com.bytedance.android.livesdk.v.j.q().p().a().b(h.a("beautyTag", j.a().f13785b.get(i)));
                    if (!(b2 == null || b2.h == null)) {
                        c o = com.bytedance.android.livesdk.v.j.q().o();
                        o.a(com.bytedance.android.livesdk.sticker.c.a.f17264e, b2);
                        Float c2 = o.c(b2.h.f17256b);
                        if (c2 == null) {
                            c2 = Float.valueOf(k.a(b2, b2.h.f17255a));
                        }
                        int i2 = (int) a2;
                        if (c2.floatValue() > k.a(b2, i2)) {
                            o.a(b2.h.f17256b, k.a(b2, i2));
                        }
                    }
                }
            }
            String str = "";
            List<FilterModel> list = j.a().f13785b;
            if (i < list.size()) {
                str = list.get(i).getFilterId();
            }
            aa.this.c();
            HashMap hashMap = new HashMap();
            hashMap.put("filter_id", str);
            com.bytedance.android.livesdk.j.a.a().a("live_take_filter_select", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_take").a("live_take_page").g("click").f("click"));
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public View f18401b;

    /* renamed from: c  reason: collision with root package name */
    public View f18402c;

    /* renamed from: d  reason: collision with root package name */
    public View f18403d;

    /* renamed from: e  reason: collision with root package name */
    public View f18404e;

    /* renamed from: f  reason: collision with root package name */
    public View f18405f;
    public View g;
    CheckedTextView h;
    public d i;
    BaseFragment j;
    com.bytedance.ies.e.b k;
    public Game l;
    public com.bytedance.android.livesdkapi.depend.model.live.a m;
    public int n;
    public Disposable o;
    boolean p = false;
    private View q;
    private View r;
    private View s;
    private ImageView t;
    private TextView u;
    private TextView v;
    private ImageView w;
    private View x;
    private TextView y;
    private LiveBeautyDialogFragment z;

    /* access modifiers changed from: package-private */
    public void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18400a, false, 14687, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18400a, false, 14687, new Class[]{Integer.TYPE}, Void.TYPE);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14671, new Class[0], Void.TYPE);
        } else if (j.a().d()) {
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(8);
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14678, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14678, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) this.f18402c.getTag(C0906R.id.d7u);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f18400a, true, 14688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f18400a, true, 14688, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("StartLiveSetController.java", aa.class);
        E = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.widget.StartLiveSetController", "android.view.View", NotifyType.VIBRATE, "", "void"), 228);
    }

    private boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14685, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14685, new Class[0], Boolean.TYPE)).booleanValue();
        }
        i a2 = TTLiveSDKContext.getHostService().k().a();
        if (com.bytedance.android.livesdkapi.a.a.f18614b || a2 == null || !a2.isEnableShowCommerceSale() || (this.m != com.bytedance.android.livesdkapi.depend.model.live.a.VIDEO && (this.m != com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY || !com.bytedance.android.live.uikit.a.a.a()))) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14667, new Class[0], Void.TYPE);
            return;
        }
        if (this.z == null) {
            this.z = LiveBeautyDialogFragment.a(new LiveBeautyFragment.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18410a;

                public final void a(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14703, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14703, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (aa.this.i != null) {
                        aa.this.i.a(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * f2);
                    }
                }

                public final void b(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14704, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14704, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (aa.this.i != null) {
                        aa.this.i.b(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13830b.f13834a * f2);
                    }
                }

                public final void c(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14705, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14705, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (aa.this.i != null) {
                        aa.this.i.c(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13831c.f13834a * f2);
                    }
                }

                public final void d(float f2) {
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14706, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f18410a, false, 14706, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (aa.this.i != null) {
                        aa.this.i.d(((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13832d.f13834a * f2);
                    }
                }
            }, this.D, true, 0, false);
            this.z.f13685b = new ac(this);
        }
        this.z.show(this.j.getChildFragmentManager(), "beauty_filter_dialog_tag");
        a(8);
        c(8);
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14673, new Class[0], Void.TYPE);
            return;
        }
        Boolean bool = (Boolean) this.f18402c.getTag(C0906R.id.d7u);
        if (bool == null) {
            bool = Boolean.valueOf(this.k.a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
            this.f18402c.setTag(C0906R.id.d7u, bool);
        }
        if (!bool.booleanValue()) {
            this.t.setImageResource(2130841388);
            this.u.setText(C0906R.string.dd1);
            return;
        }
        this.t.setImageResource(2130841386);
        this.u.setText(C0906R.string.dcy);
    }

    @SuppressLint({"CheckResult"})
    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14682, new Class[0], Void.TYPE);
        } else if (this.s != null) {
            i a2 = TTLiveSDKContext.getHostService().k().a();
            if (i()) {
                this.s.setVisibility(0);
                com.bytedance.android.livesdk.commerce.c.a(a2.getId()).subscribe(new am(this), new ad(this));
                return;
            }
            this.s.setVisibility(8);
        }
    }

    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14683, new Class[0], Void.TYPE);
            return;
        }
        this.r.setVisibility(8);
        if (this.s != null) {
            TTLiveSDKContext.getHostService().k();
            if (i()) {
                this.s.setVisibility(0);
                b(this.n);
                if (this.m != com.bytedance.android.livesdkapi.depend.model.live.a.THIRD_PARTY || !com.bytedance.android.live.uikit.a.a.a()) {
                    this.r.setVisibility(0);
                } else {
                    this.r.setVisibility(8);
                }
            } else {
                this.s.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"CheckResult"})
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14681, new Class[0], Void.TYPE);
            return;
        }
        i a2 = TTLiveSDKContext.getHostService().k().a();
        if (a2 != null) {
            com.bytedance.android.livesdkapi.depend.g.a aVar = new com.bytedance.android.livesdkapi.depend.g.a("has_show_commodity_dialog", Boolean.FALSE);
            if (((Boolean) aVar.a()).booleanValue()) {
                com.bytedance.android.livesdk.commerce.c.b(a2.getId()).subscribe(new ai(this), new aj(this));
            } else {
                new b.a(this.j.getActivity()).a((int) C0906R.string.dcl).b((int) C0906R.string.dck).a((int) C0906R.string.dcj, (DialogInterface.OnClickListener) new ak(this, aVar)).b((int) C0906R.string.dci, al.f18438b).a(false).a().show();
            }
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14666, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14666, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.z == null || this.z.getDialog() == null || !this.z.getDialog().isShowing()) {
            return false;
        } else {
            return true;
        }
    }

    public void onEvent(v vVar) {
        if (PatchProxy.isSupport(new Object[]{vVar}, this, f18400a, false, 14679, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar}, this, f18400a, false, 14679, new Class[]{v.class}, Void.TYPE);
        } else if (com.bytedance.android.live.uikit.a.a.a()) {
            h();
        } else {
            g();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18400a, false, 14668, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18400a, false, 14668, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A.setVisibility(i2);
        this.C.setVisibility(i2);
    }

    public void a(Game game) {
        if (PatchProxy.isSupport(new Object[]{game}, this, f18400a, false, 14676, new Class[]{Game.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{game}, this, f18400a, false, 14676, new Class[]{Game.class}, Void.TYPE);
        } else if (game == null) {
            this.x.setVisibility(0);
            this.w.setVisibility(8);
            this.v.setText(C0906R.string.dcw);
        } else {
            this.x.setVisibility(8);
            this.w.setVisibility(0);
            com.bytedance.android.livesdk.chatroom.f.b.a(this.w, game.icon);
            this.v.setText(game.name);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18400a, false, 14684, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18400a, false, 14684, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.s != null) {
            if (i()) {
                this.s.setVisibility(0);
                if (i2 > 0) {
                    this.y.setVisibility(0);
                    this.y.setText(String.valueOf(i2));
                    return;
                }
                this.y.setVisibility(8);
                return;
            }
            this.s.setVisibility(8);
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18400a, false, 14686, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18400a, false, 14686, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2)}, this, f18400a, false, 14670, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18400a, false, 14670, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            c();
        }
    }

    public void onClick(View view) {
        LiveFilterDialogFragment liveFilterDialogFragment;
        if (PatchProxy.isSupport(new Object[]{view}, this, f18400a, false, 14663, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18400a, false, 14663, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(E, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.co7) {
            com.bytedance.android.livesdk.j.a.a().a("live_take_beauty_click", new com.bytedance.android.livesdk.j.c.j().b("live_take").a("live_take_page").f("click"));
            b();
            return;
        }
        if (id == C0906R.id.coa) {
            com.bytedance.android.livesdk.j.a.a().a("live_take_filter_click", new com.bytedance.android.livesdk.j.c.j().b("live_take").a("live_take_page").f("click"));
            if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14669, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14669, new Class[0], Void.TYPE);
            } else if (this.j.isAdded() && this.j.getChildFragmentManager().findFragmentByTag("filter_dialog_tag") == null) {
                String str = "";
                if (this.i != null) {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    liveFilterDialogFragment = LiveFilterDialogFragment.a(this.D, str, true, true);
                } else {
                    liveFilterDialogFragment = LiveFilterDialogFragment.a(this.D, j.a().f13785b, true);
                }
                liveFilterDialogFragment.f13695c = new af(this);
                liveFilterDialogFragment.show(this.j.getChildFragmentManager(), "filter_dialog_tag");
                a(8);
                c(8);
            }
        } else if (id == C0906R.id.cog) {
            if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14672, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14672, new Class[0], Void.TYPE);
            } else {
                Boolean valueOf = Boolean.valueOf(!((Boolean) this.f18402c.getTag(C0906R.id.d7u)).booleanValue());
                this.f18402c.setTag(C0906R.id.d7u, valueOf);
                d();
                this.k.a("hotsoon.pref.LAST_SET_LANDSCAPE", (Object) valueOf).a();
            }
        } else if (id == C0906R.id.cob) {
            if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14675, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14675, new Class[0], Void.TYPE);
            } else {
                SelectGameDialogFragment a2 = SelectGameDialogFragment.a(this.l);
                a2.a((SelectGameDialogFragment.a) new ag(this, a2));
                a2.f14637b = new ah(this);
                a2.show(this.j.getChildFragmentManager(), SelectGameDialogFragment.class.getSimpleName());
                a(8);
            }
        } else if (id == C0906R.id.co8) {
            if (com.bytedance.android.live.uikit.a.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, f18400a, false, 14680, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18400a, false, 14680, new Class[0], Void.TYPE);
                } else {
                    i a3 = TTLiveSDKContext.getHostService().k().a();
                    if (a3 != null) {
                        com.bytedance.android.livesdkapi.d.f n2 = TTLiveSDKContext.getHostService().n();
                        if (n2 != null) {
                            n2.a(this.j.getActivity(), String.valueOf(a3.getId()), new com.bytedance.android.livesdkapi.d.i() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18412a;

                                public final void a(List<? extends com.bytedance.android.livesdkapi.d.a> list) {
                                    if (PatchProxy.isSupport(new Object[]{list}, this, f18412a, false, 14707, new Class[]{List.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{list}, this, f18412a, false, 14707, new Class[]{List.class}, Void.TYPE);
                                        return;
                                    }
                                    if (list != null) {
                                        aa.this.n = list.size();
                                        aa.this.b(aa.this.n);
                                    }
                                }
                            });
                        }
                    }
                }
            } else {
                f();
            }
        }
    }

    public aa(View view, BaseFragment baseFragment, TextView textView) {
        this.C = textView;
        this.A = view;
        this.j = baseFragment;
        this.B = baseFragment.getContext();
        this.k = com.bytedance.ies.e.b.a(this.B);
        this.f18401b = this.A.findViewById(C0906R.id.co7);
        this.f18401b.setOnClickListener(this);
        this.f18402c = this.A.findViewById(C0906R.id.cog);
        this.f18402c.setOnClickListener(this);
        this.f18403d = this.A.findViewById(C0906R.id.coa);
        this.f18403d.setOnClickListener(this);
        this.f18405f = this.A.findViewById(C0906R.id.f4431com);
        this.f18404e = this.A.findViewById(C0906R.id.cob);
        this.f18404e.setOnClickListener(this);
        this.v = (TextView) this.A.findViewById(C0906R.id.coe);
        this.w = (ImageView) this.A.findViewById(C0906R.id.coc);
        this.x = this.A.findViewById(C0906R.id.cod);
        this.g = this.A.findViewById(C0906R.id.col);
        this.r = this.A.findViewById(C0906R.id.cok);
        this.s = this.A.findViewById(C0906R.id.co8);
        this.s.setOnClickListener(this);
        this.h = (CheckedTextView) this.A.findViewById(C0906R.id.xo);
        this.y = (TextView) this.A.findViewById(C0906R.id.d_s);
        if (com.bytedance.android.live.uikit.a.a.a()) {
            this.h.setCheckMarkDrawable(2130841225);
        }
        this.t = (ImageView) this.A.findViewById(C0906R.id.coh);
        this.u = (TextView) this.A.findViewById(C0906R.id.coi);
        this.q = this.A.findViewById(C0906R.id.aw1);
        String a2 = this.k.a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a2)) {
            this.l = Game.fromJson(a2);
        }
        j.a().a((j.a) this);
        j.a().c();
        i a3 = TTLiveSDKContext.getHostService().k().a();
        if (a3 != null) {
            TTLiveSDKContext.getHostService().n().a((com.bytedance.android.livesdkapi.d.i) new ab(this), String.valueOf(a3.getId()));
        }
    }
}
