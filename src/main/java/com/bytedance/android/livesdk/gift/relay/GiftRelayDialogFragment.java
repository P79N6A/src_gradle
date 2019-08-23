package com.bytedance.android.livesdk.gift.relay;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LiveDialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.f.b;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.relay.a.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.d;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GiftRelayDialogFragment extends LiveDialogFragment implements View.OnClickListener, a.C0132a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15413a;
    private View A;
    private Disposable B;
    private c C;
    private String D;
    private String E;
    private TextView F;
    private View G;
    private BaseDialogFragment H;
    private g<i> I = new g<i>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15419a;

        public final /* synthetic */ void onNext(Object obj) {
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f15419a, false, 10119, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f15419a, false, 10119, new Class[]{i.class}, Void.TYPE);
                return;
            }
            super.onNext(iVar);
            ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().e();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public boolean f15414b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f15415c;

    /* renamed from: d  reason: collision with root package name */
    public DataCenter f15416d;

    /* renamed from: e  reason: collision with root package name */
    public Room f15417e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15418f;
    public boolean g;
    public boolean h;
    RecyclerView i;
    GiftRelayAdapter j;
    TextView k;
    boolean l;
    SpecialCombView m;
    ObjectAnimator n;
    a o;
    int p = ((Integer) com.bytedance.android.livesdk.config.a.G.a()).intValue();
    com.bytedance.android.livesdk.gift.model.i q;
    private View r;
    private View s;
    private TextView t;
    private TextView u;
    private View v;
    private TextView w;
    private TextView x;
    private Disposable y;
    private View z;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10098, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().e();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10104, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            ((b) com.bytedance.android.live.utility.b.a(b.class)).showRechargeDialogInH5(getActivity(), this.g, "click", this.f15416d, null);
        }
    }

    public void dismissAllowingStateLoss() {
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10100, new Class[0], Void.TYPE);
            return;
        }
        super.dismissAllowingStateLoss();
        if (!(!this.f15414b || this.f15416d == null || this.f15417e == null)) {
            this.f15416d.lambda$put$1$DataCenter("cmd_send_gift", this.f15417e.getOwner());
            this.f15414b = false;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10099, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.y != null && !this.y.isDisposed()) {
            this.y.dispose();
        }
        if (this.B != null && !this.B.isDisposed()) {
            this.B.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10103, new Class[0], Void.TYPE);
        } else if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
            ((ab) ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(this.f15415c, com.bytedance.android.livesdk.user.i.a().a()).as(e.a((Fragment) this))).a((Observer<? super T>) this.I);
        } else if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a(h.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.a()).intValue() == 1) {
                b();
            } else {
                ((b) com.bytedance.android.live.utility.b.a(b.class)).openWallet(this.f15415c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f15413a, false, 10095, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f15413a, false, 10095, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        TextView textView = this.w;
        if (!((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
            j3 = 0;
        }
        textView.setText(String.valueOf(j3));
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15413a, false, 10089, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15413a, false, 10089, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.h) {
            i2 = C0906R.style.vw;
        } else {
            i2 = C0906R.style.vv;
        }
        setStyle(1, i2);
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f15413a, false, 10112, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f15413a, false, 10112, new Class[]{String.class}, Void.TYPE);
        } else if (str != null && !str.isEmpty()) {
            try {
                if (new URI(str).getHost() != null) {
                    if (this.H != null) {
                        this.H.dismissAllowingStateLoss();
                        this.H = null;
                    }
                    if (getContext() != null) {
                        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                        int i2 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
                        double d2 = (double) i2;
                        Double.isNaN(d2);
                        this.H = ((com.bytedance.android.live.b.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.b.a.class)).webViewManager().a(com.bytedance.android.livesdk.browser.c.c.a(str).a(i2).b((int) (d2 * 1.4d)).e(80));
                        if (this.H != null) {
                            BaseDialogFragment.a((FragmentActivity) getContext(), (DialogFragment) this.H);
                        }
                    }
                }
            } catch (URISyntaxException unused) {
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15413a, false, 10091, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15413a, false, 10091, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f15418f || (!this.g && !com.bytedance.android.live.core.utils.g.a(getContext()))) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
            if (this.f15418f) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.h) {
                window.setLayout(-1, -2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = ac.c();
                attributes.height = ac.b() - ac.d();
                window.setAttributes(attributes);
            } else {
                window.setLayout(-1, -1);
            }
        }
        this.o = new a(this);
    }

    public void onClick(View view) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f15413a, false, 10101, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15413a, false, 10101, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            int id = view.getId();
            if (id == C0906R.id.aka) {
                if (this.F.getVisibility() == 0 && this.G.getVisibility() == 0) {
                    this.F.setVisibility(8);
                    this.G.setVisibility(8);
                    return;
                }
                this.f15414b = false;
                dismissAllowingStateLoss();
            } else if (id == C0906R.id.s2) {
                a();
            } else {
                if (id == C0906R.id.cnn || id == C0906R.id.co2) {
                    if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10105, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10105, new Class[0], Void.TYPE);
                    } else if (!(this.j == null || this.j.f15409c == null)) {
                        c.a aVar = this.j.f15409c;
                        if (this.C != null) {
                            j2 = this.C.f15438c;
                        } else {
                            j2 = 0;
                        }
                        long j3 = j2;
                        int i2 = aVar.f15442b;
                        com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(j3);
                        if (findGiftById != null) {
                            if (!((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().b(findGiftById.f15107f) && !((d) com.bytedance.android.live.utility.b.a(d.class)).f()) {
                                a();
                            } else if (!this.l) {
                                this.l = true;
                                long uptimeMillis = SystemClock.uptimeMillis();
                                long j4 = j3;
                                Observable compose = ((GiftRetrofitApi) ((com.bytedance.android.livesdkapi.host.h) com.bytedance.android.live.utility.b.a(com.bytedance.android.livesdkapi.host.h.class)).c().create(GiftRetrofitApi.class)).send(j4, this.f15417e.getId(), this.f15417e.getOwnerUserId(), i2).compose(com.bytedance.android.live.core.rxutils.i.a());
                                d dVar = new d(this, j3, uptimeMillis);
                                this.B = compose.subscribe(dVar, new e(this, j4), new f(this));
                            }
                        }
                    }
                } else if (id == C0906R.id.akm || id == C0906R.id.akp) {
                    a(this.E);
                } else if (id == C0906R.id.ak5) {
                    dismissAllowingStateLoss();
                } else if (id == C0906R.id.akj || id == C0906R.id.akk) {
                    a(this.D);
                }
            }
        }
    }

    public final void a(Message message) {
        String str;
        if (PatchProxy.isSupport(new Object[]{message}, this, f15413a, false, 10110, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f15413a, false, 10110, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 0) {
            this.k.setVisibility(0);
            this.m.setVisibility(8);
            if (this.n != null && this.n.isStarted()) {
                this.n.cancel();
            }
            if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10108, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10108, new Class[0], Void.TYPE);
            } else if (this.q != null) {
                com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(this.q.f15133e);
                if (findGiftById != null) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(this.q.t)) {
                        hashMap.put("request_page", this.q.t);
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(Long.valueOf(this.q.f15133e), Integer.valueOf(this.q.h));
                    hashMap.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
                    hashMap.put("gift_cnt", String.valueOf(this.q.h));
                    hashMap.put("money", String.valueOf(this.q.h * findGiftById.f15107f));
                    hashMap.put("gift_type", "endless_gift");
                    com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                    Object[] objArr = new Object[4];
                    j jVar = new j();
                    if (this.g) {
                        str = "live_take_detail";
                    } else {
                        str = "live_detail";
                    }
                    objArr[0] = jVar.a(str).c("bottom_tab").b("live_interact").f("other");
                    objArr[1] = Room.class;
                    objArr[2] = this.q;
                    objArr[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
                    a2.a("send_gift", hashMap, objArr);
                    this.q = null;
                }
            }
        }
    }

    public final void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f15413a, false, 10111, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f15413a, false, 10111, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
        } else if (j4 == 1) {
            this.t.setText(this.f15415c.getResources().getString(C0906R.string.cyd));
            TextView textView = this.u;
            textView.setText(this.f15415c.getResources().getString(C0906R.string.cy_, new Object[]{String.valueOf(j2)}) + " ");
        } else if (j4 > 100 || j4 < 1) {
            this.t.setText(this.f15415c.getResources().getString(C0906R.string.cyd));
            TextView textView2 = this.u;
            textView2.setText(this.f15415c.getResources().getString(C0906R.string.cyf) + " ");
        } else {
            this.t.setText(this.f15415c.getResources().getString(C0906R.string.cye, new Object[]{String.valueOf(j3)}));
            TextView textView3 = this.u;
            Resources resources = this.f15415c.getResources();
            textView3.setText(resources.getString(C0906R.string.cy_, new Object[]{String.valueOf(j2) + " "}));
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f15413a, false, 10092, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f15413a, false, 10092, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10093, new Class[0], Void.TYPE);
        } else {
            View view2 = getView();
            if (view2 != null) {
                this.r = view2.findViewById(C0906R.id.aka);
                this.s = view2.findViewById(C0906R.id.akp);
                this.i = (RecyclerView) view2.findViewById(C0906R.id.bcl);
                this.w = (TextView) view2.findViewById(C0906R.id.db0);
                this.x = (TextView) view2.findViewById(C0906R.id.s2);
                this.k = (TextView) view2.findViewById(C0906R.id.cnn);
                this.z = view2.findViewById(C0906R.id.ak5);
                this.A = view2.findViewById(C0906R.id.akm);
                this.t = (TextView) view2.findViewById(C0906R.id.akj);
                this.u = (TextView) view2.findViewById(C0906R.id.akk);
                this.v = view2.findViewById(C0906R.id.akl);
                this.m = (SpecialCombView) view2.findViewById(C0906R.id.co2);
                this.m.setCountDownTime(this.p);
                this.F = (TextView) view2.findViewById(C0906R.id.akn);
                this.G = view2.findViewById(C0906R.id.ako);
                this.r.setOnClickListener(this);
                this.s.setOnClickListener(this);
                this.x.setOnClickListener(this);
                this.k.setOnClickListener(this);
                this.z.setOnClickListener(this);
                this.A.setOnClickListener(this);
                this.m.setOnClickListener(this);
                this.t.setOnClickListener(this);
                this.u.setOnClickListener(this);
                View view3 = this.z;
                if (this.f15414b) {
                    i2 = 2130841066;
                } else {
                    i2 = 2130841068;
                }
                view3.setBackgroundResource(i2);
                if (this.f15416d != null) {
                    boolean booleanValue = ((Boolean) this.f15416d.get("data_is_gift_relay_showing", Boolean.FALSE)).booleanValue();
                    TextView textView = this.k;
                    Resources resources = this.f15415c.getResources();
                    if (booleanValue) {
                        i3 = C0906R.string.cy8;
                    } else {
                        i3 = C0906R.string.dk5;
                    }
                    textView.setText(resources.getString(i3));
                }
                this.C = GiftManager.inst().getGiftRelayInfo(0);
                this.j = new GiftRelayAdapter(this.f15415c, this.C);
                this.i.setAdapter(this.j);
                if (this.C != null) {
                    GiftRelayAdapter giftRelayAdapter = this.j;
                    List<c.a> list = this.C.f15439d;
                    if (PatchProxy.isSupport(new Object[]{list}, giftRelayAdapter, GiftRelayAdapter.f15407a, false, 10085, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, giftRelayAdapter, GiftRelayAdapter.f15407a, false, 10085, new Class[]{List.class}, Void.TYPE);
                    } else if (list != null && !list.isEmpty()) {
                        giftRelayAdapter.f15408b.clear();
                        giftRelayAdapter.f15408b.addAll(list);
                        if (giftRelayAdapter.f15409c == null) {
                            for (c.a aVar : giftRelayAdapter.f15408b) {
                                aVar.f15445e = false;
                            }
                        }
                        giftRelayAdapter.notifyDataSetChanged();
                    }
                    String str = this.C.f15440e;
                    if (PatchProxy.isSupport(new Object[]{str}, this, f15413a, false, 10097, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f15413a, false, 10097, new Class[]{String.class}, Void.TYPE);
                    } else if (str != null && !str.isEmpty() && com.ss.android.ugc.aweme.q.c.a(this.f15415c, "live_sp_gift_relay", 0).getBoolean("show_tips", true)) {
                        com.ss.android.ugc.aweme.q.c.a(this.f15415c, "live_sp_gift_relay", 0).edit().putBoolean("show_tips", false).apply();
                        this.F.setVisibility(0);
                        this.G.setVisibility(0);
                        StringBuilder sb = new StringBuilder();
                        ArrayList<String> arrayList = new ArrayList<>();
                        String str2 = "";
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = false;
                        for (int i4 = 0; i4 < str.length(); i4++) {
                            char charAt = str.charAt(i4);
                            if (charAt == '<') {
                                if (!str2.isEmpty()) {
                                    arrayList.add(str2);
                                    str2 = "";
                                }
                                z2 = false;
                                z3 = false;
                                z4 = true;
                            } else if (charAt == '>') {
                                z2 = true;
                                z4 = false;
                            } else if (z2 && z3) {
                                str2 = str2 + charAt;
                                sb.append(charAt);
                            } else if (!z4) {
                                sb.append(charAt);
                            } else if (charAt == '#') {
                                z3 = true;
                            }
                        }
                        String sb2 = sb.toString();
                        SpannableString spannableString = new SpannableString(sb2);
                        for (String str3 : arrayList) {
                            if (str3 != null && !str3.isEmpty()) {
                                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#F5A60A"));
                                int indexOf = sb2.indexOf(str3);
                                int length = str3.length() + indexOf;
                                if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(indexOf), Integer.valueOf(length), 34}, null, g.f15459a, true, 10120, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(indexOf), Integer.valueOf(length), 34}, null, g.f15459a, true, 10120, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                } else {
                                    spannableString.setSpan(foregroundColorSpan, indexOf, length, 34);
                                }
                            }
                        }
                        this.F.setText(spannableString);
                    }
                    this.E = this.C.f15436a;
                    if (this.E == null || this.E.isEmpty()) {
                        this.A.setVisibility(8);
                    }
                    this.D = this.C.f15437b;
                    if (this.D == null || this.D.isEmpty()) {
                        this.v.setVisibility(8);
                    }
                }
                this.i.setLayoutManager(new LinearLayoutManager(this.f15415c, 0, false));
                this.j.f15410d = new a(this);
                Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(this.f15415c.getResources(), 2130841132);
                a2.setBounds(new Rect(0, 0, (int) ak.a(this.f15415c, 16.0f), (int) UIUtils.dip2Px(this.f15415c, 16.0f)));
                if (com.bytedance.android.live.uikit.d.c.a(this.f15415c)) {
                    this.w.setCompoundDrawables(null, null, a2, null);
                } else {
                    this.w.setCompoundDrawables(a2, null, null, null);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f15413a, false, 10094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15413a, false, 10094, new Class[0], Void.TYPE);
            return;
        }
        a((long) ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().b());
        this.y = ((b) com.bytedance.android.live.utility.b.a(b.class)).walletCenter().a().subscribe((Consumer<? super T>) new b<Object>(this));
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f15413a, false, 10090, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.aga, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f15413a, false, 10090, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
