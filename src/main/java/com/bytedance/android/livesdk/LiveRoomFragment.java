package com.bytedance.android.livesdk;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.ag;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.chatroom.widget.ao;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.b.n;
import com.bytedance.android.livesdk.list.MultiRoomIdListProvider;
import com.bytedance.android.livesdk.live.LiveDetailPagerAdapter;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.android.livesdk.network.LiveNetworkBroadcastReceiver;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.x;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.viewmodel.e;
import com.bytedance.android.livesdk.widget.LiveVerticalViewPager;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.bytedance.android.livesdkapi.depend.d.h;
import com.bytedance.android.livesdkapi.depend.d.i;
import com.bytedance.android.livesdkapi.depend.d.l;
import com.bytedance.android.livesdkapi.depend.d.m;
import com.bytedance.android.livesdkapi.depend.d.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.b;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.service.c;
import com.bytedance.common.utility.Lists;
import com.bytedance.retrofit2.Retrofit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public class LiveRoomFragment extends BaseFragment implements x.a, h, i.a, com.bytedance.android.livesdkapi.view.a {
    private static boolean E = false;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8782a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f8783b = true;
    public static boolean x = true;
    private TelephonyManager A;
    private boolean B;
    private long C = -1;
    private boolean D;
    private boolean F;
    private LiveNetworkBroadcastReceiver G = new LiveNetworkBroadcastReceiver();
    private LiveNetworkBroadcastReceiver.a H = new LiveNetworkBroadcastReceiver.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8785a;

        public final void a(NetworkUtils.h hVar) {
            if (PatchProxy.isSupport(new Object[]{hVar}, this, f8785a, false, 2727, new Class[]{NetworkUtils.h.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hVar}, this, f8785a, false, 2727, new Class[]{NetworkUtils.h.class}, Void.TYPE);
            } else if (!com.bytedance.android.live.uikit.a.a.a() || !NetworkUtils.isMobile(LiveRoomFragment.this.getContext())) {
                if (NetworkUtils.isWifi(LiveRoomFragment.this.getContext())) {
                    LiveRoomFragment.x = true;
                    com.bytedance.android.livesdk.l.a.a aVar = (com.bytedance.android.livesdk.l.a.a) j.q().k().a(com.bytedance.android.livesdk.l.a.a.class);
                    if (LiveRoomFragment.this.f8192e && aVar != null && aVar.b() && !((Boolean) LiveSettingKeys.ENABLE_FLOW_CARD_TIP_NEW_STYLE.a()).booleanValue()) {
                        aVar.a();
                    }
                }
            } else {
                LiveRoomFragment.this.b();
            }
        }
    };
    private int I = -1;
    private com.bytedance.android.livesdk.player.i J;
    private long K = 0;
    private final Runnable L = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8816a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f8816a, false, 2738, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8816a, false, 2738, new Class[0], Void.TYPE);
                return;
            }
            ArrayList arrayList = new ArrayList(100);
            List<Room> d2 = LiveRoomFragment.this.j.d();
            if (d2 != null) {
                ArrayList arrayList2 = new ArrayList(d2);
                if (!Lists.isEmpty(arrayList2)) {
                    try {
                        int currentItem = LiveRoomFragment.this.f8784c.getCurrentItem();
                        if (currentItem >= 0) {
                            if (currentItem < arrayList2.size()) {
                                arrayList.addAll(arrayList2.subList(Math.max(0, currentItem - 50), currentItem));
                                arrayList.addAll(arrayList2.subList(currentItem + 1, Math.min(arrayList2.size(), currentItem + 50)));
                            }
                        }
                        arrayList.addAll(arrayList2);
                    } catch (Throwable unused) {
                    }
                }
            }
            LiveRoomFragment.this.n.a(arrayList);
        }
    };
    private final Handler M = new Handler(Looper.getMainLooper());
    private boolean N = false;
    private d O = new z(this);
    private List<b> P;
    private boolean Q;

    /* renamed from: c  reason: collision with root package name */
    LiveVerticalViewPager f8784c;
    FrameLayout h;
    public ao i;
    public g j;
    public LiveDetailPagerAdapter k;
    public boolean l;
    public Runnable m;
    public RoomStatsViewModel n;
    public OnPageChangeListener o;
    a p;
    public com.bytedance.android.livesdk.overscroll.a q;
    c r;
    com.bytedance.android.livesdk.player.a s;
    f t;
    l u;
    m v;
    Retrofit w;
    public boolean y = true;
    private x z;

    class OnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8822a;

        /* renamed from: b  reason: collision with root package name */
        public i f8823b;

        /* renamed from: c  reason: collision with root package name */
        int f8824c;

        /* renamed from: e  reason: collision with root package name */
        private int f8826e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f8827f;
        private int g;
        private int h;
        private final String i;

        public void onPageScrollStateChanged(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8822a, false, 2749, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8822a, false, 2749, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f8827f = i2;
            if (this.f8823b != null) {
                this.f8823b.a(i2);
            }
        }

        public void onPageSelected(int i2) {
            int i3 = i2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8822a, false, 2748, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8822a, false, 2748, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            i b2 = LiveRoomFragment.this.k.b(i3);
            if (b2 != this.f8823b) {
                com.bytedance.android.livesdk.j.a.a a2 = com.bytedance.android.livesdk.j.a.a.a();
                LiveVerticalViewPager liveVerticalViewPager = LiveRoomFragment.this.f8784c;
                if (PatchProxy.isSupport(new Object[]{liveVerticalViewPager, Integer.valueOf(i2)}, a2, com.bytedance.android.livesdk.j.a.a.f15643a, false, 10915, new Class[]{LiveVerticalViewPager.class, Integer.TYPE}, Void.TYPE)) {
                    com.bytedance.android.livesdk.j.a.a aVar = a2;
                    PatchProxy.accessDispatch(new Object[]{liveVerticalViewPager, Integer.valueOf(i2)}, aVar, com.bytedance.android.livesdk.j.a.a.f15643a, false, 10915, new Class[]{LiveVerticalViewPager.class, Integer.TYPE}, Void.TYPE);
                } else if (!(liveVerticalViewPager == null || i3 == -1)) {
                    JSONObject b3 = a2.b(a2.a(liveVerticalViewPager, "ViewPage#onPageSelected()"));
                    a2.a(b3, "position", i3);
                    a2.a(b3, "description", "room scroll change");
                    com.bytedance.android.livesdk.j.a.a.f15644b.b(com.bytedance.android.livesdk.j.a.b.Page.info, b3);
                }
                this.f8824c = i3;
                this.f8826e = i3;
                if (this.f8823b != null) {
                    this.f8823b.o();
                }
                if (this.f8827f == 0) {
                    a(i3, b2);
                    LiveRoomFragment.this.b(i3);
                }
            }
        }

        OnPageChangeListener(String str) {
            this.i = str;
        }

        /* access modifiers changed from: package-private */
        public void a(int i2, i iVar) {
            int i3 = i2;
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), iVar2}, this, f8822a, false, 2751, new Class[]{Integer.TYPE, i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), iVar2}, this, f8822a, false, 2751, new Class[]{Integer.TYPE, i.class}, Void.TYPE);
                return;
            }
            LiveRoomFragment.this.m();
            if (this.f8823b != null) {
                this.f8823b.d();
                this.f8823b.g().getArguments().remove("live.intent.extra.ENTER_TYPE");
                this.f8823b.g().getArguments().remove("live.intent.extra.PAGE_DELAY_TYPE");
                if (LiveRoomFragment.f8783b) {
                    LiveRoomFragment.f8783b = false;
                    com.bytedance.ies.e.b a2 = com.bytedance.ies.e.b.a(LiveRoomFragment.this.getContext());
                    String o = LiveRoomFragment.this.o();
                    if (a2.a(o, true)) {
                        a2.a(o, (Object) Boolean.FALSE).a();
                    }
                }
            }
            if (iVar2 != null) {
                if (this.f8823b != null) {
                    iVar.g().getArguments().putString("live.intent.extra.ENTER_TYPE", "draw");
                    iVar.g().getArguments().putString("live.intent.extra.PAGE_DELAY_TYPE", "slide");
                    iVar.g().getArguments().putString("enter_live_from_page", this.f8823b.g().getArguments().getString("enter_live_from_page"));
                    iVar.g().getArguments().putInt("current_room_position", i3);
                }
                LiveRoomFragment.this.r.d().a(com.bytedance.android.livesdkapi.depend.d.a.SLIDE);
                iVar.b();
                if (this.f8823b != null) {
                    com.bytedance.android.livesdk.j.b.g a3 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
                    if (a3 != null) {
                        a3.a("action_type", "draw");
                    }
                    if (LiveRoomFragment.this.j instanceof MultiRoomIdListProvider) {
                        long j = LiveRoomFragment.this.j.a(i3).getLong("anchor_id");
                        if (j > 0) {
                            iVar.g().getArguments().putLong("anchor_id", j);
                        }
                    }
                    LiveRoomFragment.this.a(this.i, "draw", iVar2, iVar.g().getArguments());
                    LiveRoomFragment.this.a(this.i, 0, "draw", iVar.g().getArguments(), null);
                    Bundle arguments = iVar.g().getArguments();
                    if (LiveRoomFragment.this.n() && arguments != null) {
                        ((com.bytedance.android.livesdk.live.c.a) LiveRoomFragment.this.j).b(arguments.getLong("live.intent.extra.ROOM_ID", 0));
                    }
                }
            }
            this.f8823b = iVar2;
            this.f8826e = -1;
            LiveRoomFragment.this.i();
            LiveRoomFragment.this.j();
        }

        public void onPageScrolled(int i2, float f2, int i3) {
            PopupWindow.OnDismissListener onDismissListener;
            int i4 = i2;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f8822a, false, 2747, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f8822a, false, 2747, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!(LiveRoomFragment.this.q == null || LiveRoomFragment.this.q.a() == null)) {
                LiveRoomFragment.this.q.a().onPageScrolled(i4, f3, i3);
            }
            if (i4 == this.f8826e && f3 < 1.0E-10f) {
                i b2 = LiveRoomFragment.this.k.b(i4);
                if (b2 != this.f8823b) {
                    a(i4, b2);
                    LiveRoomFragment.this.b(i4);
                }
                if (this.h >= 0 && i4 != this.h) {
                    if (i4 < this.h) {
                        this.g = 0;
                    } else {
                        this.g++;
                    }
                    this.h = i4;
                    if (this.g > 15) {
                        this.h = -1;
                        LiveRoomFragment liveRoomFragment = LiveRoomFragment.this;
                        if (PatchProxy.isSupport(new Object[0], liveRoomFragment, LiveRoomFragment.f8782a, false, 2697, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], liveRoomFragment, LiveRoomFragment.f8782a, false, 2697, new Class[0], Void.TYPE);
                        } else if (liveRoomFragment.p != null) {
                            com.bytedance.ies.e.b a2 = com.bytedance.ies.e.b.a(liveRoomFragment.getContext());
                            if (a2.a("live.pref.PREF_SHOW_DISLIKE_TIPS", true)) {
                                a2.a("live.pref.PREF_SHOW_DISLIKE_TIPS", (Object) Boolean.FALSE).a();
                                View inflate = View.inflate(liveRoomFragment.getContext(), C0906R.layout.alg, null);
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(C0906R.id.f9);
                                ((LinearLayout.LayoutParams) lottieAnimationView.getLayoutParams()).topMargin = (int) ((((float) liveRoomFragment.getActivity().getWindow().getDecorView().getHeight()) / 2.0f) - (((float) liveRoomFragment.getResources().getDimensionPixelSize(C0906R.dimen.n1)) / 2.0f));
                                PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
                                inflate.setOnClickListener(new ad(popupWindow));
                                popupWindow.showAtLocation(liveRoomFragment.getActivity().getWindow().getDecorView(), 51, 0, 0);
                                lottieAnimationView.getClass();
                                if (PatchProxy.isSupport(new Object[]{lottieAnimationView}, null, ae.f9001a, true, 2722, new Class[]{LottieAnimationView.class}, PopupWindow.OnDismissListener.class)) {
                                    onDismissListener = (PopupWindow.OnDismissListener) PatchProxy.accessDispatch(new Object[]{lottieAnimationView}, null, ae.f9001a, true, 2722, new Class[]{LottieAnimationView.class}, PopupWindow.OnDismissListener.class);
                                } else {
                                    onDismissListener = new ae(lottieAnimationView);
                                }
                                popupWindow.setOnDismissListener(onDismissListener);
                                lottieAnimationView.setAnimation("dislike_live_tips.json");
                                lottieAnimationView.loop(true);
                                lottieAnimationView.playAnimation();
                            }
                        }
                    }
                }
            }
        }
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8828a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8829b;

        /* renamed from: c  reason: collision with root package name */
        Disposable f8830c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f8828a, false, 2744, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8828a, false, 2744, new Class[0], Void.TYPE);
                return;
            }
            if (this.f8830c != null) {
                this.f8830c.dispose();
                this.f8830c = null;
            }
        }

        private a(String str) {
            this.f8829b = str;
        }

        /* synthetic */ a(LiveRoomFragment liveRoomFragment, String str, byte b2) {
            this(str);
        }
    }

    public final Fragment d() {
        return this;
    }

    public final l f() {
        return this.u;
    }

    public final m g() {
        return this.v;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8782a, false, 2680, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f8782a, false, 2680, new Class[]{String.class}, Void.TYPE);
            return;
        }
        i e2 = e();
        if (e2 != null) {
            if (TextUtils.equals(str2, "click")) {
                e2.b();
                return;
            }
            if (this.o != null) {
                OnPageChangeListener onPageChangeListener = this.o;
                if (PatchProxy.isSupport(new Object[]{e2}, onPageChangeListener, OnPageChangeListener.f8822a, false, 2750, new Class[]{i.class}, Void.TYPE)) {
                    OnPageChangeListener onPageChangeListener2 = onPageChangeListener;
                    PatchProxy.accessDispatch(new Object[]{e2}, onPageChangeListener2, OnPageChangeListener.f8822a, false, 2750, new Class[]{i.class}, Void.TYPE);
                    return;
                }
                onPageChangeListener.a(onPageChangeListener.f8824c, e2);
            }
        }
    }

    public final boolean a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, this, f8782a, false, 2695, new Class[]{Room.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{room}, this, f8782a, false, 2695, new Class[]{Room.class}, Boolean.TYPE)).booleanValue();
        } else if (this.p == null) {
            return false;
        } else {
            String str = this.p.f8829b;
            if (PatchProxy.isSupport(new Object[]{room, str}, this, f8782a, false, 2698, new Class[]{Room.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{room, str}, this, f8782a, false, 2698, new Class[]{Room.class, String.class}, Void.TYPE);
            } else {
                View inflate = View.inflate(getContext(), C0906R.layout.alh, null);
                View findViewById = inflate.findViewById(C0906R.id.a5_);
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).gravity = 17;
                PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
                inflate.setOnClickListener(new af(popupWindow));
                findViewById.setOnClickListener(new ag(this, room, popupWindow));
                popupWindow.showAtLocation(getActivity().getWindow().getDecorView(), 51, 0, 0);
            }
            return true;
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8782a, false, 2696, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f8782a, false, 2696, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.N = z2;
        l();
    }

    public final void a(String str, long j2, String str2, Bundle bundle, Bundle bundle2) {
        long j3;
        final String str3;
        long j4 = j2;
        Bundle bundle3 = bundle;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j4), str2, bundle3, bundle2}, this, f8782a, false, 2703, new Class[]{String.class, Long.TYPE, String.class, Bundle.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j4), str2, bundle3, bundle2}, this, f8782a, false, 2703, new Class[]{String.class, Long.TYPE, String.class, Bundle.class, Bundle.class}, Void.TYPE);
            return;
        }
        final String string = bundle3.getString("live.intent.extra.REQUEST_ID");
        final String string2 = bundle3.getString("live.intent.extra.LOG_PB");
        final long j5 = bundle3.getLong("live.intent.extra.USER_FROM");
        long j6 = bundle3.getLong("live.intent.extra.ROOM_ID", 0);
        bundle3.getLong("live.intent.extra.USER_ID", 0);
        long j7 = bundle3.getLong("anchor_id", 0);
        final String string3 = bundle3.getString("live.intent.extra.SOURCE_EXTRA");
        final String string4 = bundle3.getString("scene_id");
        Bundle bundle4 = bundle3.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
        if (bundle4 != null) {
            Bundle bundle5 = bundle4.getBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1");
            String str4 = (bundle5 == null || !bundle5.containsKey("subtab")) ? str : (String) bundle5.get("subtab");
            j3 = j7 == 0 ? bundle4.getLong("anchor_id", 0) : j7;
            str3 = str4;
        } else {
            j3 = j7;
            str3 = str;
        }
        AnonymousClass11 r23 = r0;
        final long j8 = j2;
        final String str5 = str2;
        com.bytedance.ies.d.a.b a2 = com.bytedance.ies.d.a.b.a();
        final String str6 = "";
        final Bundle bundle6 = bundle2;
        final Bundle bundle7 = bundle4;
        final long j9 = j6;
        final long j10 = j3;
        AnonymousClass11 r0 = new Callable(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8789a;
            final /* synthetic */ LiveRoomFragment o;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f8789a, false, 2742, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f8789a, false, 2742, new Class[0], Object.class);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("request_id", string);
                    jSONObject.put("log_pb", string2);
                    jSONObject.put("source", j5);
                    jSONObject.put("from_room_id", j8);
                    jSONObject.put("enter_type", str5);
                    if (!str6.equals(str3)) {
                        jSONObject.put("is_fix", str3);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        jSONObject.put("moment_room_source", string3);
                    }
                    if (bundle6 != null) {
                        for (String str : bundle6.keySet()) {
                            jSONObject.put(str, String.valueOf(bundle6.get(str)));
                        }
                    }
                } catch (Exception unused) {
                }
                if (com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class).a().containsKey("video_id")) {
                    jSONObject.put("video_id", com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class).a().get("video_id"));
                }
                HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(j9));
                hashMap.put("anchor_id", String.valueOf(j10));
                hashMap.put("request_id", string);
                hashMap.put("log_pb", string2);
                if (!TextUtils.isEmpty(string3)) {
                    hashMap.put("moment_room_source", string3);
                }
                hashMap.put("is_preview", this.o.getArguments().getString("is_preview", PushConstants.PUSH_TYPE_NOTIFY));
                hashMap.put("is_sale", "unknown");
                hashMap.put("orientation", String.valueOf(this.o.getArguments().getInt("orientation")));
                if (this.o.y) {
                    if (!TextUtils.isEmpty(bundle7.getString("log_pb")) || !com.bytedance.android.live.uikit.a.a.f()) {
                        if (!TextUtils.isEmpty(bundle7.getString("request_id"))) {
                            hashMap.put("request_id", bundle7.getString("request_id"));
                        }
                        hashMap.put("log_pb", bundle7.getString("log_pb"));
                    } else {
                        try {
                            hashMap.put("request_id", new JSONObject(string2).getString("impr_id"));
                            hashMap.put("log_pb", string2);
                        } catch (Exception unused2) {
                        }
                    }
                    this.o.y = false;
                } else {
                    com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
                    if (a2 instanceof n) {
                        n nVar = (n) a2;
                        nVar.f15663e = String.valueOf(j9);
                        nVar.f15664f = TTLiveSDKContext.getHostService().k().b();
                    }
                }
                if (!TextUtils.isEmpty(string4) && "draw".equals(str5)) {
                    hashMap.put("scene_id", string4);
                }
                hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                com.bytedance.android.livesdk.j.a.a().a("rec_live_play", hashMap, new com.bytedance.android.livesdk.j.c.j().b("live_view").g(str5));
                return null;
            }

            {
                this.o = r4;
            }
        };
        a2.a(null, r23, 0);
    }

    public final void a(String str, String str2, i iVar, Bundle bundle) {
        String str3 = str2;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str, str3, iVar, bundle2}, this, f8782a, false, 2704, new Class[]{String.class, String.class, i.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str3, iVar, bundle2}, this, f8782a, false, 2704, new Class[]{String.class, String.class, i.class, Bundle.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.j.b.g a2 = com.bytedance.android.livesdk.j.a.a().a(com.bytedance.android.livesdk.j.c.j.class);
        String string = bundle2.getString("live.intent.extra.REQUEST_ID");
        String string2 = bundle2.getString("live.intent.extra.LOG_PB");
        long j2 = bundle2.getLong("live.intent.extra.ROOM_ID", 0);
        long j3 = bundle2.getLong("anchor_id", 0);
        String str4 = a2.a().get("enter_from");
        String str5 = a2.a().get("source");
        String string3 = bundle2.getString("live.intent.extra.SOURCE_EXTRA");
        boolean z2 = bundle2.getBoolean("live.intent.extra.IS_THIRD_PARTY", false);
        String string4 = bundle2.getString("scene_id");
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(j2));
        hashMap.put("anchor_id", String.valueOf(j3));
        com.bytedance.android.livesdk.j.b.g a3 = com.bytedance.android.livesdk.j.a.a().a(Room.class);
        if (a3 instanceof n) {
            n nVar = (n) a3;
            nVar.f15663e = String.valueOf(j2);
            nVar.f15664f = TTLiveSDKContext.getHostService().k().b();
        }
        String string5 = bundle2.getString("enter_from_merge", "");
        String string6 = bundle2.getString("enter_method", "");
        hashMap.put("request_id", string);
        hashMap.put("log_pb", string2);
        hashMap.put("streaming_type", z2 ? "thirdparty" : "general");
        hashMap.put("action_type", str3);
        hashMap.put("enter_from_merge", string5);
        hashMap.put("enter_method", string6);
        if (!TextUtils.isEmpty(string3)) {
            hashMap.put("moment_room_source", string3);
        }
        if (!TextUtils.isEmpty(string4) && "draw".equals(str3)) {
            hashMap.put("scene_id", string4);
        }
        com.bytedance.android.livesdk.j.a.a().a("live_show", hashMap, new com.bytedance.android.livesdk.j.c.j().a(str4).b("live_view").f("core").c(str5));
    }

    public final boolean n() {
        return this.j instanceof com.bytedance.android.livesdk.live.c.a;
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2689, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2689, new Class[0], Void.TYPE);
            return;
        }
        this.M.removeCallbacks(this.L);
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2690, new Class[0], Void.TYPE);
        } else if (this.m != null && this.f8784c != null) {
            this.f8784c.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8818a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f8818a, false, 2739, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f8818a, false, 2739, new Class[0], Void.TYPE);
                    } else if (LiveRoomFragment.this.m != null) {
                        LiveRoomFragment.this.m.run();
                    }
                }
            });
        }
    }

    private boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2701, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2701, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.r == null) {
            return false;
        } else {
            return this.r.d().b();
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2715, new Class[0], Void.TYPE);
            return;
        }
        if (!E) {
            ai.a(getContext(), (int) C0906R.string.cxo);
            E = true;
        }
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2678, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2678, new Class[0], Boolean.TYPE)).booleanValue();
        }
        i e2 = e();
        if (e2 == null || !e2.i_()) {
            return false;
        }
        return true;
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2681, new Class[0], Void.TYPE);
            return;
        }
        i e2 = e();
        if (e2 != null) {
            e2.c();
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2688, new Class[0], Void.TYPE);
            return;
        }
        q();
        this.M.postDelayed(this.L, 180000);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2702, new Class[0], Void.TYPE);
            return;
        }
        if (this.f8784c != null) {
            LiveVerticalViewPager liveVerticalViewPager = this.f8784c;
            if (!this.B && !this.l && !this.N && !s()) {
                z2 = true;
            }
            liveVerticalViewPager.setEnabled(z2);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2708, new Class[0], Void.TYPE);
            return;
        }
        if (getArguments() != null) {
            getArguments().putString("is_preview", PushConstants.PUSH_TYPE_NOTIFY);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2675, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2672, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.a();
        }
        super.onStop();
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2682, new Class[0], Void.TYPE);
            return;
        }
        i e2 = e();
        if (e2 != null) {
            e2.c();
        }
        try {
            this.f8784c.setAdapter(null);
        } catch (Exception unused) {
        }
        if (this.k != null) {
            this.k.a();
            this.k = null;
        }
        if (this.j != null) {
            this.j.c();
            this.j = null;
        }
    }

    @Nullable
    public final i e() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2679, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2679, new Class[0], i.class);
        } else if (this.k == null || this.k.getCount() == 0) {
            return null;
        } else {
            return this.k.b(this.f8784c.getCurrentItem());
        }
    }

    public final void i() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2686, new Class[0], Void.TYPE);
            return;
        }
        int currentItem = this.f8784c.getCurrentItem();
        if (currentItem >= 0 && this.k != null) {
            int count = this.k.getCount() - currentItem;
            if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2687, new Class[0], Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2687, new Class[0], Integer.TYPE)).intValue();
            } else {
                com.bytedance.android.live.base.model.feed.a aVar = (com.bytedance.android.live.base.model.feed.a) CoreSettingKeys.LIVE_FEED_PRELOAD.a();
                if (aVar != null) {
                    i2 = aVar.f7714c;
                }
                if (i2 <= 0) {
                    i2 = 2;
                }
            }
            if (count <= i2) {
                this.j.b(currentItem);
            }
        }
    }

    public final String o() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2712, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2712, new Class[0], String.class);
        } else if (!n() || this.I == 0) {
            return "live.pref.SHOW_SCROLL_TIPS";
        } else {
            return "live.pref.SHOW_SCROLL_TIPS_" + ((com.bytedance.android.livesdk.live.c.a) this.j).f15807d;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2676, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        r();
        this.F = false;
        this.s.c(false);
        if (com.bytedance.android.live.uikit.a.a.a() && NetworkUtils.isMobile(getContext())) {
            b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2677, new Class[0], Void.TYPE);
        } else if (this.f8192e) {
            if (TTLiveSDKContext.getHostService().b().a().d()) {
                t();
                return;
            }
            com.bytedance.android.livesdk.l.a.a aVar = (com.bytedance.android.livesdk.l.a.a) j.q().k().a(com.bytedance.android.livesdk.l.a.a.class);
            if (aVar != null) {
                if (((Boolean) LiveSettingKeys.ENABLE_FLOW_CARD_TIP_NEW_STYLE.a()).booleanValue()) {
                    if (x) {
                        aVar.a(getContext());
                        x = false;
                    }
                } else if (aVar.c()) {
                    aVar.b(getContext());
                } else {
                    aVar.a(getContext());
                }
            }
        }
    }

    public final boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2694, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2694, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.bytedance.android.live.uikit.a.a.f() || this.j.b() <= 1 || this.l) {
            return false;
        } else {
            String o2 = o();
            com.bytedance.ies.e.b a2 = com.bytedance.ies.e.b.a(getContext());
            if (!a2.a(o2, true)) {
                return false;
            }
            a2.a(o2, (Object) Boolean.FALSE).a();
            if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2700, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2700, new Class[0], Void.TYPE);
            } else {
                if (this.i != null) {
                    this.h.removeView(this.i);
                }
                this.i = new ao(getContext());
                if (com.bytedance.android.live.uikit.a.a.c()) {
                    this.i.a("gesture_slide_up_xg.json", "images");
                } else if (com.bytedance.android.live.uikit.a.a.e()) {
                    this.i.a("gesture_slide_up_tt.json", "tt_images");
                } else {
                    this.i.a("Gesture_SlideUp.json", "images/");
                }
                this.i.setDestText(ac.a((int) C0906R.string.dk1));
                ao aoVar = this.i;
                if (PatchProxy.isSupport(new Object[0], aoVar, ao.f13454a, false, 8009, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aoVar, ao.f13454a, false, 8009, new Class[0], Void.TYPE);
                } else {
                    if (aoVar.f13458e == null) {
                        aoVar.f13458e = new AlphaAnimation(0.0f, 1.0f);
                        aoVar.f13458e.setDuration(160);
                    }
                    if (aoVar.f13459f == null) {
                        aoVar.f13459f = new AlphaAnimation(0.0f, 1.0f);
                        aoVar.f13459f.setDuration(320);
                        aoVar.f13459f.setStartOffset(160);
                    }
                    aoVar.f13456c.clearAnimation();
                    aoVar.f13455b.clearAnimation();
                    aoVar.f13456c.startAnimation(aoVar.f13458e);
                    aoVar.f13455b.startAnimation(aoVar.f13459f);
                }
                this.i.setClickListener(new ao.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8787a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f8787a, false, 2741, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f8787a, false, 2741, new Class[0], Void.TYPE);
                            return;
                        }
                        LiveRoomFragment.this.i.setClickable(false);
                        LiveRoomFragment liveRoomFragment = LiveRoomFragment.this;
                        if (PatchProxy.isSupport(new Object[0], liveRoomFragment, LiveRoomFragment.f8782a, false, 2699, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], liveRoomFragment, LiveRoomFragment.f8782a, false, 2699, new Class[0], Void.TYPE);
                            return;
                        }
                        if (liveRoomFragment.i != null) {
                            ao aoVar = liveRoomFragment.i;
                            if (PatchProxy.isSupport(new Object[0], aoVar, ao.f13454a, false, 8010, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], aoVar, ao.f13454a, false, 8010, new Class[0], Void.TYPE);
                            } else {
                                if (aoVar.g == null) {
                                    aoVar.g = new AlphaAnimation(1.0f, 0.0f);
                                    aoVar.g.setDuration(160);
                                    aoVar.g.setStartOffset(160);
                                    aoVar.g.setAnimationListener(new Animation.AnimationListener() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f13466a;

                                        public final void onAnimationRepeat(Animation animation) {
                                        }

                                        public final void onAnimationStart(Animation animation) {
                                        }

                                        public final void onAnimationEnd(Animation animation) {
                                            if (PatchProxy.isSupport(new Object[]{animation}, this, f13466a, false, 8016, new Class[]{Animation.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{animation}, this, f13466a, false, 8016, new Class[]{Animation.class}, Void.TYPE);
                                                return;
                                            }
                                            ao.this.f13456c.setVisibility(8);
                                            ao.this.f13455b.setVisibility(8);
                                        }
                                    });
                                }
                                if (aoVar.h == null) {
                                    aoVar.h = new AlphaAnimation(1.0f, 0.0f);
                                    aoVar.h.setDuration(320);
                                }
                                aoVar.f13456c.clearAnimation();
                                aoVar.f13455b.clearAnimation();
                                aoVar.f13456c.startAnimation(aoVar.g);
                                aoVar.f13455b.startAnimation(aoVar.h);
                            }
                            liveRoomFragment.h.postDelayed(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f8820a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f8820a, false, 2740, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f8820a, false, 2740, new Class[0], Void.TYPE);
                                    } else if (LiveRoomFragment.this.b_() && LiveRoomFragment.this.i != null) {
                                        LiveRoomFragment.this.h.removeView(LiveRoomFragment.this.i);
                                        LiveRoomFragment.this.i.a();
                                        LiveRoomFragment.this.i = null;
                                    }
                                }
                            }, 320);
                        }
                    }
                });
                this.h.addView(this.i);
            }
            return true;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2674, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        q();
        this.r.d().b(this.O);
        p();
        this.t.a(null);
        if (this.D) {
            this.D = false;
        } else {
            this.r.d().a((Room) null);
        }
        this.r.d().a(getContext());
        if (this.s != null) {
            this.s.a(true, getContext());
            this.s.d(getContext());
        }
        if (!(this.z == null || this.A == null)) {
            this.A.listen(this.z, 0);
            this.z = null;
        }
        this.s.c();
        if (this.C > 0) {
            this.C = 0;
        }
        ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).clearGiftIconBitmapCache();
        if ((getActivity() instanceof com.bytedance.android.livesdkapi.b) && !this.F) {
            getActivity();
        }
        if (com.bytedance.android.live.uikit.a.a.a()) {
            LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver = this.G;
            if (PatchProxy.isSupport(new Object[0], liveNetworkBroadcastReceiver, LiveNetworkBroadcastReceiver.f16727a, false, 12537, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveNetworkBroadcastReceiver, LiveNetworkBroadcastReceiver.f16727a, false, 12537, new Class[0], Void.TYPE);
            } else if (!(liveNetworkBroadcastReceiver.f16728b == null || liveNetworkBroadcastReceiver.f16728b.get() == null)) {
                try {
                    ((Context) liveNetworkBroadcastReceiver.f16728b.get()).unregisterReceiver(liveNetworkBroadcastReceiver);
                } catch (Exception unused) {
                }
            }
            LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver2 = this.G;
            LiveNetworkBroadcastReceiver.a aVar = this.H;
            if (PatchProxy.isSupport(new Object[]{aVar}, liveNetworkBroadcastReceiver2, LiveNetworkBroadcastReceiver.f16727a, false, 12539, new Class[]{LiveNetworkBroadcastReceiver.a.class}, Void.TYPE)) {
                LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver3 = liveNetworkBroadcastReceiver2;
                PatchProxy.accessDispatch(new Object[]{aVar}, liveNetworkBroadcastReceiver3, LiveNetworkBroadcastReceiver.f16727a, false, 12539, new Class[]{LiveNetworkBroadcastReceiver.a.class}, Void.TYPE);
                return;
            }
            for (WeakReference next : liveNetworkBroadcastReceiver2.f16730d) {
                if (next != null && next.get() == aVar) {
                    liveNetworkBroadcastReceiver2.f16730d.remove(next);
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.bytedance.android.live.base.model.feed.FeedItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f8782a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 2671(0xa6f, float:3.743E-42)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f8782a
            r5 = 0
            r6 = 2671(0xa6f, float:3.743E-42)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            android.support.v4.app.FragmentActivity r1 = r14.getActivity()
            if (r1 == 0) goto L_0x0126
            android.support.v4.app.FragmentActivity r1 = r14.getActivity()
            boolean r1 = r1.isFinishing()
            if (r1 == 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r1 = r14.j
            boolean r1 = r1 instanceof com.bytedance.android.livesdkapi.g.i
            if (r1 == 0) goto L_0x0064
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r14.f8784c
            int r0 = r0.getCurrentItem()
            if (r0 < 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r1 = r14.j
            int r1 = r1.b()
            if (r0 >= r1) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r1 = r14.j
            android.os.Bundle r0 = r1.a((int) r0)
            java.lang.String r1 = "live.intent.extra.ROOM_ID"
            r2 = 0
            long r0 = r0.getLong(r1, r2)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r2 = r14.j
            com.bytedance.android.livesdkapi.g.i r2 = (com.bytedance.android.livesdkapi.g.i) r2
            r2.c(r0)
            goto L_0x0126
        L_0x0064:
            int r1 = r14.I
            if (r1 != 0) goto L_0x0126
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_DOUBLE_STEAM_INNER_STYLE
            java.lang.Object r1 = r1.a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != r2) goto L_0x0126
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f8782a
            r6 = 0
            r7 = 2713(0xa99, float:3.802E-42)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x009a
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f8782a
            r6 = 0
            r7 = 2713(0xa99, float:3.802E-42)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0126
        L_0x009a:
            int r1 = r14.I
            if (r1 != 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.f r1 = r14.t
            r3 = 0
            if (r1 == 0) goto L_0x00b2
            com.bytedance.android.livesdkapi.g.f r1 = r14.t
            com.bytedance.android.livesdkapi.g.g r1 = r1.a()
            if (r1 == 0) goto L_0x00b2
            com.bytedance.android.livesdkapi.g.f r1 = r14.t
            com.bytedance.android.livesdkapi.g.g r1 = r1.a()
            goto L_0x00b3
        L_0x00b2:
            r1 = r3
        L_0x00b3:
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r4 = r14.f8784c
            int r4 = r4.getCurrentItem()
            if (r4 <= 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r5 = r14.j
            int r5 = r5.b()
            if (r4 >= r5) goto L_0x0126
            if (r1 == 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r5 = r14.j
            android.os.Bundle r5 = r5.a((int) r0)
            int r5 = r1.a((android.os.Bundle) r5)
            if (r5 < 0) goto L_0x0126
            com.bytedance.android.livesdkapi.g.g r6 = r14.j
            com.bytedance.android.livesdk.live.c.a r6 = (com.bytedance.android.livesdk.live.c.a) r6
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r7[r0] = r8
            com.meituan.robust.ChangeQuickRedirect r9 = com.bytedance.android.livesdk.live.c.a.f15803a
            r10 = 0
            r11 = 10329(0x2859, float:1.4474E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r12[r0] = r8
            java.lang.Class<com.bytedance.android.live.base.model.feed.FeedItem> r13 = com.bytedance.android.live.base.model.feed.FeedItem.class
            r8 = r6
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x010f
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r7[r0] = r3
            com.meituan.robust.ChangeQuickRedirect r9 = com.bytedance.android.livesdk.live.c.a.f15803a
            r10 = 0
            r11 = 10329(0x2859, float:1.4474E-41)
            java.lang.Class[] r12 = new java.lang.Class[r2]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r12[r0] = r2
            java.lang.Class<com.bytedance.android.live.base.model.feed.FeedItem> r13 = com.bytedance.android.live.base.model.feed.FeedItem.class
            r8 = r6
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r7, r8, r9, r10, r11, r12, r13)
            r3 = r0
            com.bytedance.android.live.base.model.feed.FeedItem r3 = (com.bytedance.android.live.base.model.feed.FeedItem) r3
            goto L_0x0123
        L_0x010f:
            java.util.ArrayList<com.bytedance.android.live.base.model.feed.FeedItem> r0 = r6.f15805b
            int r0 = r0.size()
            if (r2 <= r4) goto L_0x0118
            goto L_0x0123
        L_0x0118:
            if (r0 <= r4) goto L_0x0123
            java.util.ArrayList<com.bytedance.android.live.base.model.feed.FeedItem> r0 = r6.f15805b
            java.lang.Object r0 = r0.get(r4)
            r3 = r0
            com.bytedance.android.live.base.model.feed.FeedItem r3 = (com.bytedance.android.live.base.model.feed.FeedItem) r3
        L_0x0123:
            r1.a(r5, r3)
        L_0x0126:
            super.onPause()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.onPause():void");
    }

    public final void a(l lVar) {
        this.u = lVar;
    }

    public final void a(m mVar) {
        this.v = mVar;
    }

    public final void b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8782a, false, 2711, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8782a, false, 2711, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("has_page_slide", true);
        }
        List<Room> d2 = this.j.d();
        if (i3 >= 0 && d2.size() > i3) {
            d2.get(i3).getId();
            if (getActivity() instanceof com.bytedance.android.livesdkapi.depend.d.j) {
                getActivity();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = configuration;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{configuration2}, this, f8782a, false, 2710, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration2}, this, f8782a, false, 2710, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        if (configuration2.orientation != 2) {
            z2 = false;
        }
        this.B = z2;
        l();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f8782a, false, 2669, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f8782a, false, 2669, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        if (getArguments() == null || !getArguments().getBoolean("enter_from_dou_plus", false)) {
            z2 = false;
        }
        bundle2.putBoolean("enter_from_dou_plus", z2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8782a, false, 2706, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8782a, false, 2706, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 0:
                this.s.a(false, getContext());
                return;
            case 1:
                return;
            case 2:
                this.s.a(true, getContext());
                break;
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8782a, false, 2670, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8782a, false, 2670, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            if (com.bytedance.android.live.core.utils.g.a(getActivity())) {
                getActivity().getWindow().setSoftInputMode(48);
            }
            if (PatchProxy.isSupport(new Object[]{1}, this, f8782a, false, 2705, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{1}, this, f8782a, false, 2705, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                this.B = false;
                l();
            }
            getActivity().getWindow().addFlags(SearchJediMixFeedAdapter.f42517f);
        }
        if (!com.bytedance.android.livesdkapi.a.a.f18614b) {
            this.z = new x(this);
            this.A = (TelephonyManager) getActivity().getSystemService("phone");
            if (this.A != null) {
                this.A.listen(this.z, 32);
            }
        }
        if (!(bundle == null || getArguments() == null)) {
            getArguments().putBoolean("enter_from_dou_plus", bundle.getBoolean("enter_from_dou_plus", false));
        }
        a(getArguments());
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f8782a, false, 2693, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f8782a, false, 2693, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.C = j2;
        a(126, "leave for profile");
        this.u.a();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8782a, false, 2667, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8782a, false, 2667, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(null);
        hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        hashMap.put("location", "live detail after super oncreate");
        TTLiveSDKContext.getHostService().d().a("feed_enter_room", hashMap);
        this.J = new com.bytedance.android.livesdk.player.i();
        if (!com.bytedance.android.livesdkapi.a.a.f18614b || com.bytedance.android.livesdkapi.a.a.f18616d || com.bytedance.android.livesdkapi.a.a.f18618f) {
            this.r = TTLiveSDKContext.getLiveService();
            this.t = com.bytedance.android.livesdkapi.g.h.b();
            this.w = j.q().b();
            this.s = j.q().a();
            this.s.b();
            this.r.d().a(this.O);
            if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2709, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2709, new Class[0], Void.TYPE);
            } else {
                this.n = (RoomStatsViewModel) ViewModelProviders.of((Fragment) this, (ViewModelProvider.Factory) new e(this.w)).get(RoomStatsViewModel.class);
                this.n.f15831b.observe(this, new ah(this));
            }
            hashMap.put("time", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            hashMap.put("location", "finish live detail oncreate");
            TTLiveSDKContext.getHostService().d().a("feed_enter_room", hashMap);
            j.q().e().a(false);
            if (PatchProxy.isSupport(new Object[0], this, f8782a, false, 2716, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8782a, false, 2716, new Class[0], Void.TYPE);
            } else {
                if (this.u == null) {
                    this.u = new l() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f8803a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f8803a, false, 2728, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f8803a, false, 2728, new Class[0], Void.TYPE);
                                return;
                            }
                            FragmentActivity activity = LiveRoomFragment.this.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                        }
                    };
                }
                if (this.v == null) {
                    this.v = new m() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f8805a;

                        public final void a() {
                        }

                        public final void a(View view, View view2) {
                            if (PatchProxy.isSupport(new Object[]{view, view2}, this, f8805a, false, 2729, new Class[]{View.class, View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view, view2}, this, f8805a, false, 2729, new Class[]{View.class, View.class}, Void.TYPE);
                                return;
                            }
                            FragmentActivity activity = LiveRoomFragment.this.getActivity();
                            if (PatchProxy.isSupport(new Object[]{activity}, null, ag.f8238a, true, 1280, new Class[]{Activity.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity}, null, ag.f8238a, true, 1280, new Class[]{Activity.class}, Void.TYPE);
                                return;
                            }
                            if (Build.VERSION.SDK_INT >= 21) {
                                ag.a((Activity) activity);
                            }
                        }

                        public final void a(boolean z, View view, View view2, View view3, View view4) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view, view2, view3, view4}, this, f8805a, false, 2730, new Class[]{Boolean.TYPE, View.class, View.class, View.class, View.class}, Void.TYPE)) {
                                Object[] objArr = {Byte.valueOf(z), view, view2, view3, view4};
                                Object[] objArr2 = objArr;
                                PatchProxy.accessDispatch(objArr2, this, f8805a, false, 2730, new Class[]{Boolean.TYPE, View.class, View.class, View.class, View.class}, Void.TYPE);
                                return;
                            }
                            FragmentActivity activity = LiveRoomFragment.this.getActivity();
                            if (activity != null) {
                                Window window = activity.getWindow();
                                if (window != null) {
                                    if (!z) {
                                        activity.getWindow().setFlags(1024, 1024);
                                    } else if (com.bytedance.android.live.core.utils.g.a(activity)) {
                                        window.clearFlags(1024);
                                    }
                                }
                            }
                        }
                    };
                }
            }
            if (com.bytedance.android.live.uikit.a.a.a()) {
                LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver = this.G;
                Context context = getContext();
                if (PatchProxy.isSupport(new Object[]{context}, liveNetworkBroadcastReceiver, LiveNetworkBroadcastReceiver.f16727a, false, 12536, new Class[]{Context.class}, Void.TYPE)) {
                    LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver2 = liveNetworkBroadcastReceiver;
                    PatchProxy.accessDispatch(new Object[]{context}, liveNetworkBroadcastReceiver2, LiveNetworkBroadcastReceiver.f16727a, false, 12536, new Class[]{Context.class}, Void.TYPE);
                } else {
                    liveNetworkBroadcastReceiver.f16728b = new WeakReference<>(context);
                    if (context != null) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        context.registerReceiver(liveNetworkBroadcastReceiver, intentFilter);
                    }
                    liveNetworkBroadcastReceiver.f16729c = NetworkUtils.getNetworkType(context);
                }
                LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver3 = this.G;
                LiveNetworkBroadcastReceiver.a aVar = this.H;
                if (PatchProxy.isSupport(new Object[]{aVar}, liveNetworkBroadcastReceiver3, LiveNetworkBroadcastReceiver.f16727a, false, 12538, new Class[]{LiveNetworkBroadcastReceiver.a.class}, Void.TYPE)) {
                    LiveNetworkBroadcastReceiver liveNetworkBroadcastReceiver4 = liveNetworkBroadcastReceiver3;
                    PatchProxy.accessDispatch(new Object[]{aVar}, liveNetworkBroadcastReceiver4, LiveNetworkBroadcastReceiver.f16727a, false, 12538, new Class[]{LiveNetworkBroadcastReceiver.a.class}, Void.TYPE);
                } else {
                    liveNetworkBroadcastReceiver3.f16730d.add(new WeakReference(aVar));
                }
                if (TTLiveSDKContext.getHostService().b().a().e()) {
                    x = true;
                }
            }
            if (PatchProxy.isSupport(new Object[]{"onCreate"}, this, f8782a, false, 2668, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{"onCreate"}, this, f8782a, false, 2668, new Class[]{String.class}, Void.TYPE);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("page_name", LiveRoomFragment.class.getName());
            com.bytedance.android.livesdk.j.c.b().b("ttlive_page", (Map<String, Object>) hashMap2);
            return;
        }
        if (getActivity() != null) {
            a(122, "app constants is both I18N and vigo");
            this.u.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0549  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.os.Bundle r38) {
        /*
            r37 = this;
            r8 = r37
            r7 = r38
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f8782a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 2683(0xa7b, float:3.76E-42)
            r1 = r37
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f8782a
            r3 = 0
            r4 = 2683(0xa7b, float:3.76E-42)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r37
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            r37.p()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r7
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.rank.a.f16915a
            r14 = 1
            r15 = 12925(0x327d, float:1.8112E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x006b
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r7
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.rank.a.f16915a
            r14 = 1
            r15 = 12925(0x327d, float:1.8112E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0092
        L_0x006b:
            boolean r0 = com.bytedance.android.livesdk.rank.a.f16916b
            if (r0 == 0) goto L_0x0092
            if (r7 == 0) goto L_0x0092
            java.lang.String r0 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r0 = r7.getBundle(r0)
            if (r0 != 0) goto L_0x007d
            com.bytedance.common.utility.Logger.debug()
            goto L_0x0092
        L_0x007d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putAll(r0)
            java.lang.String r2 = "live.intent.extra.BACK_PRE_ROOM_EXTRA"
            r1.remove(r2)
            java.lang.String r2 = "copy_extra"
            r0.putBundle(r2, r1)
            com.bytedance.common.utility.Logger.debug()
        L_0x0092:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            long r0 = r0.b()
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x0121
            com.bytedance.android.livesdk.v.f r2 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdkapi.depend.d.n r2 = r2.g()
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.a()
            if (r2 == 0) goto L_0x0121
            com.bytedance.android.live.base.model.user.User r3 = r2.getOwner()
            if (r3 == 0) goto L_0x0121
            com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
            long r2 = r2.getId()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0121
            android.content.Context r0 = r37.getContext()
            r1 = 2131564004(0x7f0d15e4, float:1.875348E38)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.al.f9017a
            r14 = 1
            r15 = 2752(0xac0, float:3.856E-42)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.widget.Toast> r3 = android.widget.Toast.class
            r2[r10] = r3
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0101
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.al.f9017a
            r14 = 1
            r15 = 2752(0xac0, float:3.856E-42)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.widget.Toast> r2 = android.widget.Toast.class
            r0[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0110
        L_0x0101:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 != r3) goto L_0x010d
            r2 = r0
            android.widget.Toast r2 = (android.widget.Toast) r2
            com.ss.android.ugc.aweme.utils.eq.a(r2)
        L_0x010d:
            r0.show()
        L_0x0110:
            r8.D = r9
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r1 = r8.getString(r1)
            r8.a(r0, r1)
            com.bytedance.android.livesdkapi.depend.d.l r0 = r8.u
            r0.a()
            return
        L_0x0121:
            java.lang.String r0 = "live.intent.extra.ENTER_LIVE_SOURCE"
            java.lang.String r13 = r7.getString(r0)
            java.lang.String r0 = "live.intent.extra.EXTRA_ENTER_FEED_STYLE"
            java.lang.String r14 = r7.getString(r0)
            java.lang.String r0 = "live.intent.extra.FROM_ROOM_ID"
            long r5 = r7.getLong(r0, r11)
            java.lang.String r0 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r0 = r7.getBundle(r0)
            java.lang.String r1 = "live.intent.extra.DISLIKE_ENABLED"
            boolean r15 = r7.getBoolean(r1, r10)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x015a
            java.lang.String r1 = "live.intent.extra.ENTER_LIVE_TIME"
            long r1 = r0.getLong(r1, r11)
            r8.K = r1
            java.lang.String r1 = "enter_from_merge"
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = "enter_method"
            java.lang.String r2 = r0.getString(r2)
            r4 = r0
            r3 = r1
            goto L_0x0162
        L_0x015a:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r4 = r0
            r2 = r1
            r3 = r13
        L_0x0162:
            java.lang.String r0 = "live_cell_position"
            java.lang.String r1 = "live_cell_position"
            java.lang.String r1 = r7.getString(r1)
            r4.putString(r0, r1)
            java.lang.String r0 = "double_stream_feed_url"
            java.lang.String r0 = r7.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r1 = r1 ^ r9
            java.lang.String r11 = "homepage_follow"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x0192
            java.lang.String r11 = "live_cell_cover"
            boolean r11 = r11.equals(r2)
            if (r11 != 0) goto L_0x0190
            java.lang.String r11 = "live_cell"
            boolean r11 = android.text.TextUtils.equals(r11, r2)
            if (r11 == 0) goto L_0x0192
        L_0x0190:
            r11 = 1
            goto L_0x0193
        L_0x0192:
            r11 = 0
        L_0x0193:
            if (r1 == 0) goto L_0x01ab
            com.bytedance.android.live.core.setting.l<java.lang.Integer> r11 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_DOUBLE_STEAM_INNER_STYLE
            java.lang.Object r11 = r11.a()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 == 0) goto L_0x01a5
            r11 = 1
            goto L_0x01a6
        L_0x01a5:
            r11 = 0
        L_0x01a6:
            r12 = r0
            r21 = r3
            r0 = 0
            goto L_0x01f6
        L_0x01ab:
            if (r11 == 0) goto L_0x01c3
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdk.live.model.FeedDraw> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FOLLOW_DRAW_URL
            java.lang.Object r0 = r0.a()
            com.bytedance.android.livesdk.live.model.FeedDraw r0 = (com.bytedance.android.livesdk.live.model.FeedDraw) r0
            java.lang.String r0 = r0.getUrl()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            r11 = r11 ^ r9
            r12 = r0
            r21 = r3
            r0 = 1
            goto L_0x01f6
        L_0x01c3:
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdk.live.model.FeedDraw> r0 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FEED_DRAW
            java.lang.Object r0 = r0.a()
            com.bytedance.android.livesdk.live.model.FeedDraw r0 = (com.bytedance.android.livesdk.live.model.FeedDraw) r0
            java.lang.String r0 = r0.getUrl()
            com.bytedance.android.live.core.setting.l<java.lang.Boolean> r11 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FEED_DRAW_ENABLE
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x01f1
            com.bytedance.android.live.core.setting.l<com.bytedance.android.livesdk.live.model.FeedDraw> r11 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_FEED_DRAW
            java.lang.Object r11 = r11.a()
            com.bytedance.android.livesdk.live.model.FeedDraw r11 = (com.bytedance.android.livesdk.live.model.FeedDraw) r11
            java.lang.String r12 = com.bytedance.android.livesdk.live.model.FeedDraw.conventRequestFrom(r3, r2)
            boolean r11 = r11.isSupportedRequestFrom(r12)
            if (r11 == 0) goto L_0x01f1
            r11 = 1
            goto L_0x01f2
        L_0x01f1:
            r11 = 0
        L_0x01f2:
            r12 = r0
            r21 = r3
            r0 = 2
        L_0x01f6:
            if (r11 == 0) goto L_0x01f9
            goto L_0x01fa
        L_0x01f9:
            r0 = -1
        L_0x01fa:
            r8.I = r0
            r8.l = r10
            java.lang.String r0 = "live.intent.extra.IS_MULTI"
            boolean r0 = r7.getBoolean(r0, r10)
            java.lang.String r3 = "live.intent.extra.POSITION"
            int r3 = r7.getInt(r3, r10)
            if (r3 >= 0) goto L_0x020d
            r3 = 0
        L_0x020d:
            java.lang.String r10 = "live.intent.extra.ENTER_ROOM_IDS"
            long[] r10 = r7.getLongArray(r10)
            if (r11 == 0) goto L_0x022a
            com.bytedance.android.livesdk.live.c.a r0 = new com.bytedance.android.livesdk.live.c.a
            if (r1 == 0) goto L_0x021c
            java.lang.String r1 = "draw"
            goto L_0x021e
        L_0x021c:
            java.lang.String r1 = ""
        L_0x021e:
            r0.<init>(r7, r12, r1)
            r8.j = r0
            r31 = r2
        L_0x0225:
            r11 = r3
            r0 = 2
            r10 = 1
            goto L_0x02e5
        L_0x022a:
            boolean r1 = com.bytedance.android.live.uikit.a.a.f()
            if (r1 == 0) goto L_0x02a7
            android.os.Bundle r1 = r37.getArguments()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r12 = 0
            r11[r12] = r1
            r25 = 0
            com.meituan.robust.ChangeQuickRedirect r26 = com.bytedance.android.livesdk.rank.a.f16915a
            r27 = 1
            r28 = 12923(0x327b, float:1.8109E-41)
            r31 = r2
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r16 = android.os.Bundle.class
            r2[r12] = r16
            java.lang.Class r30 = java.lang.Boolean.TYPE
            r24 = r11
            r29 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r24, r25, r26, r27, r28, r29, r30)
            if (r2 == 0) goto L_0x0279
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r11 = 0
            r2[r11] = r1
            r25 = 0
            com.meituan.robust.ChangeQuickRedirect r26 = com.bytedance.android.livesdk.rank.a.f16915a
            r27 = 1
            r28 = 12923(0x327b, float:1.8109E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.os.Bundle> r12 = android.os.Bundle.class
            r1[r11] = r12
            java.lang.Class r30 = java.lang.Boolean.TYPE
            r24 = r2
            r29 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r24, r25, r26, r27, r28, r29, r30)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x028d
        L_0x0279:
            if (r1 == 0) goto L_0x028c
            java.lang.String r2 = "live.intent.extra.BACK_PRE_ROOM_EXTRA"
            android.os.Bundle r1 = r1.getBundle(r2)
            if (r1 != 0) goto L_0x0284
            goto L_0x028c
        L_0x0284:
            java.lang.String r2 = "can_go_back"
            r11 = 0
            boolean r1 = r1.getBoolean(r2, r11)
            goto L_0x028d
        L_0x028c:
            r1 = 0
        L_0x028d:
            if (r1 != 0) goto L_0x02a9
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.b> r1 = r8.P
            if (r1 == 0) goto L_0x029f
            com.bytedance.android.livesdk.live.c.b r1 = new com.bytedance.android.livesdk.live.c.b
            java.util.List<com.bytedance.android.livesdkapi.depend.model.live.b> r2 = r8.P
            boolean r7 = r8.Q
            r1.<init>(r2, r7)
            r8.j = r1
            goto L_0x02e2
        L_0x029f:
            com.bytedance.android.livesdk.live.c.b r1 = new com.bytedance.android.livesdk.live.c.b
            r1.<init>(r7)
            r8.j = r1
            goto L_0x02e2
        L_0x02a7:
            r31 = r2
        L_0x02a9:
            if (r0 == 0) goto L_0x02b4
            com.bytedance.android.livesdkapi.g.f r1 = r8.t
            com.bytedance.android.livesdkapi.g.g r1 = r1.a()
            r8.j = r1
            goto L_0x02e2
        L_0x02b4:
            if (r10 == 0) goto L_0x02db
            int r1 = r10.length
            if (r1 <= 0) goto L_0x02db
            java.lang.String r0 = "live.intent.extra.ROOM_ID"
            long r0 = r7.getLong(r0)
            r2 = 0
        L_0x02c0:
            int r11 = r10.length
            if (r2 >= r11) goto L_0x02ce
            r11 = r10[r2]
            int r16 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x02cb
            r3 = r2
            goto L_0x02ce
        L_0x02cb:
            int r2 = r2 + 1
            goto L_0x02c0
        L_0x02ce:
            com.bytedance.android.livesdk.list.MultiRoomIdListProvider r0 = new com.bytedance.android.livesdk.list.MultiRoomIdListProvider
            android.arch.lifecycle.Lifecycle r1 = r37.getLifecycle()
            r0.<init>(r1, r10, r7)
            r8.j = r0
            goto L_0x0225
        L_0x02db:
            com.bytedance.android.livesdk.list.c r1 = new com.bytedance.android.livesdk.list.c
            r1.<init>(r7)
            r8.j = r1
        L_0x02e2:
            r10 = r0
            r11 = r3
            r0 = 2
        L_0x02e5:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            r1[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r3 = f8782a
            r7 = 0
            r12 = 2684(0xa7c, float:3.761E-42)
            r32 = r4
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r4[r2] = r0
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r4[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r0 = r1
            r1 = r37
            r17 = r31
            r2 = r3
            r3 = r7
            r22 = r4
            r7 = r32
            r4 = r12
            r33 = r5
            r5 = r22
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x033d
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            r1[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r3 = f8782a
            r4 = 0
            r5 = 2684(0xa7c, float:3.761E-42)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r2] = r0
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r6[r9] = r0
            java.lang.Class r12 = java.lang.Void.TYPE
            r0 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0473
        L_0x033d:
            if (r7 == 0) goto L_0x0473
            com.bytedance.android.livesdk.j.a r0 = com.bytedance.android.livesdk.j.a.a()
            java.lang.Class<com.bytedance.android.livesdk.j.c.j> r1 = com.bytedance.android.livesdk.j.c.j.class
            com.bytedance.android.livesdk.j.b.g r0 = r0.a((java.lang.Class) r1)
            if (r0 == 0) goto L_0x0473
            java.lang.String r1 = "source"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "enter_from"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "enter_from_merge"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "video_id"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "superior_page_from"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "push_type"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "from_room_id"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "enter_method"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "top_message_type"
            r0.a((java.lang.String) r1)
            java.lang.String r1 = "enter_method"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x0392
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "enter_method"
            r7.remove(r2)
            java.lang.String r2 = "enter_method"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x0392:
            java.lang.String r1 = "enter_from_merge"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x03ac
            java.lang.String r1 = "enter_from_merge"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "enter_from_merge"
            r7.remove(r2)
            java.lang.String r2 = "enter_from_merge"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x03ac:
            java.lang.String r1 = "source"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x03ca
            java.lang.String r1 = "source"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "source"
            r7.remove(r2)
            java.lang.String r2 = "source"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x03ca:
            java.lang.String r1 = "enter_from"
            r0.a((java.lang.String) r1, (java.lang.String) r13)
            java.lang.String r1 = "enter_from"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x03e9
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "enter_from"
            r7.remove(r2)
            java.lang.String r2 = "enter_from"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x03e9:
            java.lang.String r1 = "from_room_id"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x0407
            java.lang.String r1 = "from_room_id"
            r2 = 0
            long r4 = r7.getLong(r1, r2)
            java.lang.String r1 = "from_room_id"
            r7.remove(r1)
            java.lang.String r1 = "from_room_id"
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r0.a((java.lang.String) r1, (java.lang.String) r2)
        L_0x0407:
            java.lang.String r1 = "video_id"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x0425
            java.lang.String r1 = "video_id"
            r2 = 0
            long r1 = r7.getLong(r1, r2)
            java.lang.String r3 = "video_id"
            r7.remove(r3)
            java.lang.String r3 = "video_id"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.a((java.lang.String) r3, (java.lang.String) r1)
        L_0x0425:
            java.lang.String r1 = "superior_page_from"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x043f
            java.lang.String r1 = "superior_page_from"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "superior_page_from"
            r7.remove(r2)
            java.lang.String r2 = "superior_page_from"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x043f:
            java.lang.String r1 = "push_type"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x0459
            java.lang.String r1 = "push_type"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "push_type"
            r7.remove(r2)
            java.lang.String r2 = "push_type"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x0459:
            java.lang.String r1 = "top_message_type"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x0473
            java.lang.String r1 = "top_message_type"
            java.lang.String r2 = ""
            java.lang.String r1 = r7.getString(r1, r2)
            java.lang.String r2 = "top_message_type"
            r7.remove(r2)
            java.lang.String r2 = "top_message_type"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x0473:
            r12 = 9
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r9] = r1
            r1 = 2
            r0[r1] = r13
            r16 = 3
            r0[r16] = r14
            java.lang.Long r1 = new java.lang.Long
            r5 = r33
            r1.<init>(r5)
            r18 = 4
            r0[r18] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r19 = 5
            r0[r19] = r1
            r22 = 6
            r0[r22] = r21
            r24 = 7
            r0[r24] = r17
            r25 = 8
            r0[r25] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f8782a
            r3 = 0
            r4 = 2685(0xa7d, float:3.762E-42)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class r26 = java.lang.Integer.TYPE
            r23 = 0
            r1[r23] = r26
            java.lang.Class r26 = java.lang.Boolean.TYPE
            r1[r9] = r26
            java.lang.Class<java.lang.String> r26 = java.lang.String.class
            r20 = 2
            r1[r20] = r26
            java.lang.Class<java.lang.String> r26 = java.lang.String.class
            r1[r16] = r26
            java.lang.Class r26 = java.lang.Long.TYPE
            r1[r18] = r26
            java.lang.Class r26 = java.lang.Boolean.TYPE
            r1[r19] = r26
            java.lang.Class<java.lang.String> r26 = java.lang.String.class
            r1[r22] = r26
            java.lang.Class<java.lang.String> r26 = java.lang.String.class
            r1[r24] = r26
            java.lang.Class<android.os.Bundle> r26 = android.os.Bundle.class
            r1[r25] = r26
            java.lang.Class r26 = java.lang.Void.TYPE
            r27 = r1
            r1 = r37
            r35 = r5
            r5 = r27
            r6 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0549
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r2 = 0
            r0[r2] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r9] = r1
            r1 = 2
            r0[r1] = r13
            r0[r16] = r14
            java.lang.Long r1 = new java.lang.Long
            r5 = r35
            r1.<init>(r5)
            r0[r18] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r15)
            r0[r19] = r1
            r0[r22] = r21
            r0[r24] = r17
            r0[r25] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f8782a
            r3 = 0
            r4 = 2685(0xa7d, float:3.762E-42)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6 = 0
            r5[r6] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r6 = 2
            r5[r6] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r16] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r18] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r19] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r22] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r24] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r25] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r37
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0549:
            r5 = r35
            com.bytedance.android.livesdkapi.g.g r0 = r8.j
            if (r0 != 0) goto L_0x055c
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r1 = "list provider is null"
            r8.a(r0, r1)
            com.bytedance.android.livesdkapi.depend.d.l r0 = r8.u
            r0.a()
            return
        L_0x055c:
            com.bytedance.android.livesdk.LiveRoomFragment$2 r12 = new com.bytedance.android.livesdk.LiveRoomFragment$2
            android.support.v4.app.FragmentManager r2 = r37.getChildFragmentManager()
            com.bytedance.android.livesdkapi.g.g r3 = r8.j
            r0 = r12
            r1 = r37
            r4 = r13
            r24 = r5
            r5 = r21
            r6 = r17
            r16 = r7
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r8.k = r12
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r8.f8784c
            r0.setOffscreenPageLimit(r9)
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r8.f8784c     // Catch:{ Exception -> 0x0581 }
            com.bytedance.android.livesdk.live.LiveDetailPagerAdapter r1 = r8.k     // Catch:{ Exception -> 0x0581 }
            r0.setAdapter(r1)     // Catch:{ Exception -> 0x0581 }
        L_0x0581:
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r8.f8784c
            r1 = 0
            r0.a((int) r11, (boolean) r1)
            com.bytedance.android.livesdk.LiveRoomFragment$OnPageChangeListener r0 = new com.bytedance.android.livesdk.LiveRoomFragment$OnPageChangeListener
            r0.<init>(r13)
            r8.o = r0
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r8.f8784c
            com.bytedance.android.livesdk.LiveRoomFragment$OnPageChangeListener r1 = r8.o
            r0.setOnPageChangeListener(r1)
            boolean r0 = com.bytedance.android.live.uikit.a.a.a()
            r7 = 0
            if (r0 == 0) goto L_0x06b9
            if (r10 == 0) goto L_0x06b9
            android.widget.FrameLayout r0 = r8.h
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r1 = r8.f8784c
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r3[r9] = r1
            r27 = 0
            com.meituan.robust.ChangeQuickRedirect r28 = com.bytedance.android.livesdk.overscroll.f.f16779a
            r29 = 1
            r30 = 12566(0x3116, float:1.7609E-41)
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Class<android.widget.FrameLayout> r2 = android.widget.FrameLayout.class
            r5[r4] = r2
            java.lang.Class<com.bytedance.android.livesdk.widget.LiveVerticalViewPager> r2 = com.bytedance.android.livesdk.widget.LiveVerticalViewPager.class
            r5[r9] = r2
            java.lang.Class<com.bytedance.android.livesdk.overscroll.g> r32 = com.bytedance.android.livesdk.overscroll.g.class
            r26 = r3
            r31 = r5
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r26, r27, r28, r29, r30, r31, r32)
            if (r2 == 0) goto L_0x05f0
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r3[r9] = r1
            r27 = 0
            com.meituan.robust.ChangeQuickRedirect r28 = com.bytedance.android.livesdk.overscroll.f.f16779a
            r29 = 1
            r30 = 12566(0x3116, float:1.7609E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r0[r4] = r1
            java.lang.Class<com.bytedance.android.livesdk.widget.LiveVerticalViewPager> r1 = com.bytedance.android.livesdk.widget.LiveVerticalViewPager.class
            r0[r9] = r1
            java.lang.Class<com.bytedance.android.livesdk.overscroll.g> r32 = com.bytedance.android.livesdk.overscroll.g.class
            r26 = r3
            r31 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r26, r27, r28, r29, r30, r31, r32)
            com.bytedance.android.livesdk.overscroll.g r0 = (com.bytedance.android.livesdk.overscroll.g) r0
            goto L_0x06b2
        L_0x05f0:
            android.content.Context r2 = r0.getContext()
            if (r2 != 0) goto L_0x05f9
            r0 = r7
            goto L_0x06b2
        L_0x05f9:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r5[r10] = r6
            r5[r9] = r2
            r27 = 0
            com.meituan.robust.ChangeQuickRedirect r28 = com.bytedance.android.livesdk.overscroll.f.f16779a
            r29 = 1
            r30 = 12567(0x3117, float:1.761E-41)
            java.lang.Class[] r6 = new java.lang.Class[r4]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r6[r10] = r4
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r6[r9] = r4
            java.lang.Class<android.view.View> r32 = android.view.View.class
            r26 = r5
            r31 = r6
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r26, r27, r28, r29, r30, r31, r32)
            if (r4 == 0) goto L_0x0655
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r5[r10] = r6
            r5[r9] = r2
            r27 = 0
            com.meituan.robust.ChangeQuickRedirect r28 = com.bytedance.android.livesdk.overscroll.f.f16779a
            r29 = 1
            r30 = 12567(0x3117, float:1.761E-41)
            java.lang.Class[] r2 = new java.lang.Class[r4]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r10] = r4
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r2[r9] = r4
            java.lang.Class<android.view.View> r32 = android.view.View.class
            r26 = r5
            r31 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r26, r27, r28, r29, r30, r31, r32)
            android.view.View r2 = (android.view.View) r2
            goto L_0x06a5
        L_0x0655:
            r4 = 1126170624(0x43200000, float:160.0)
            float r4 = com.bytedance.android.livesdk.utils.ak.a(r2, r4)
            int r4 = (int) r4
            int r4 = r4 + 5
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r2)
            android.content.res.Resources r6 = r2.getResources()
            r9 = 2131624092(0x7f0e009c, float:1.8875354E38)
            int r6 = r6.getColor(r9)
            r5.setBackgroundColor(r6)
            r5.setHeight(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r4)
            java.lang.String r4 = "#57ffffff"
            int r4 = android.graphics.Color.parseColor(r4)
            r5.setTextColor(r4)
            r4 = 2131564147(0x7f0d1673, float:1.8753771E38)
            java.lang.String r4 = r2.getString(r4)
            r5.setText(r4)
            int r4 = com.bytedance.android.livesdk.utils.ak.b(r2)
            float r4 = (float) r4
            r5.setTranslationY(r4)
            r4 = 49
            r5.setGravity(r4)
            r4 = 1098907648(0x41800000, float:16.0)
            float r2 = com.bytedance.android.livesdk.utils.ak.a(r2, r4)
            int r2 = (int) r2
            r4 = 0
            r5.setPadding(r4, r2, r4, r4)
            r2 = r5
        L_0x06a5:
            r0.addView(r2, r3)
            com.bytedance.android.livesdk.overscroll.g r0 = new com.bytedance.android.livesdk.overscroll.g
            com.bytedance.android.livesdk.overscroll.adapters.ViewPagerOverScrollDecorAdapter r3 = new com.bytedance.android.livesdk.overscroll.adapters.ViewPagerOverScrollDecorAdapter
            r3.<init>(r1)
            r0.<init>(r3, r7, r2)
        L_0x06b2:
            r8.q = r0
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r8.f8784c
            r0.bringToFront()
        L_0x06b9:
            com.bytedance.android.livesdk.LiveRoomFragment$5 r9 = new com.bytedance.android.livesdk.LiveRoomFragment$5
            r0 = r9
            r1 = r37
            r2 = r14
            r3 = r13
            r4 = r16
            r5 = r24
            r0.<init>(r2, r3, r4, r5)
            r8.m = r9
            r37.r()
            r37.l()
            com.bytedance.android.livesdk.widget.LiveVerticalViewPager r0 = r8.f8784c
            com.bytedance.android.livesdk.LiveRoomFragment$6 r1 = new com.bytedance.android.livesdk.LiveRoomFragment$6
            r1.<init>()
            r0.setOverScrollListener(r1)
            com.bytedance.android.livesdk.LiveRoomFragment$a r0 = r8.p
            if (r0 == 0) goto L_0x06e2
            com.bytedance.android.livesdk.LiveRoomFragment$a r0 = r8.p
            r0.a()
        L_0x06e2:
            if (r15 == 0) goto L_0x06ed
            com.bytedance.android.livesdk.LiveRoomFragment$a r0 = new com.bytedance.android.livesdk.LiveRoomFragment$a
            r1 = 0
            r0.<init>(r8, r13, r1)
            r8.p = r0
            return
        L_0x06ed:
            r8.p = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.LiveRoomFragment.a(android.os.Bundle):void");
    }

    private void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f8782a, false, 2714, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f8782a, false, 2714, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.J != null) {
            this.J.a(i2, str);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8782a, false, 2666, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f8782a, false, 2666, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.aig, viewGroup2, false);
        this.f8784c = (LiveVerticalViewPager) inflate.findViewById(C0906R.id.duu);
        this.h = (FrameLayout) inflate.findViewById(C0906R.id.y9);
        if (com.bytedance.android.live.uikit.a.a.a() || com.bytedance.android.live.uikit.a.a.j()) {
            this.h.setBackgroundColor(getResources().getColor(C0906R.color.sg));
        }
        return inflate;
    }

    public final void a(long j2, String str, Bundle bundle) {
        Bundle bundle2;
        long j3 = j2;
        String str2 = str;
        Bundle bundle3 = bundle;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), str2, bundle3}, this, f8782a, false, 2692, new Class[]{Long.TYPE, String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), str2, bundle3}, this, f8782a, false, 2692, new Class[]{Long.TYPE, String.class, Bundle.class}, Void.TYPE);
            return;
        }
        bundle3.putLong("live.intent.extra.ENTER_LIVE_TIME", this.K);
        Context context = getContext();
        Object[] objArr = {context, new Long(j3), str2, bundle3};
        if (PatchProxy.isSupport(objArr, null, p.f18632a, true, 14938, new Class[]{Context.class, Long.TYPE, String.class, Bundle.class}, Bundle.class)) {
            Object[] objArr2 = {context, new Long(j3), str2, bundle3};
            Object[] objArr3 = objArr2;
            bundle2 = (Bundle) PatchProxy.accessDispatch(objArr3, null, p.f18632a, true, 14938, new Class[]{Context.class, Long.TYPE, String.class, Bundle.class}, Bundle.class);
        } else {
            bundle2 = new Bundle();
            bundle2.putLong("live.intent.extra.ROOM_ID", j3);
            bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE", str2);
            bundle2.putBundle("live.intent.extra.ENTER_LIVE_EXTRA", bundle3);
            if (bundle3 != null) {
                bundle2.putBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA", bundle3.getBundle("live.intent.extra.BACK_PRE_ROOM_EXTRA"));
            }
        }
        if (bundle2 != null) {
            bundle2.putInt("orientation", bundle3.getInt("orientation", 0));
            i e2 = e();
            if (e2 != null) {
                long j4 = e2.g().getArguments().getLong("live.intent.extra.ROOM_ID", 0);
                if (j4 != 0) {
                    bundle2.putLong("live.intent.extra.FROM_ROOM_ID", j4);
                }
                Object obj = e2.g().getArguments().get("live.intent.extra.USER_ID");
                if (obj != null && bundle2.get("live.intent.extra.USER_ID") == null) {
                    bundle2.putString("live.intent.extra.USER_ID", String.valueOf(obj));
                }
                bundle2.putString("enter_live_from_page", e2.g().getArguments().getString("enter_live_from_page"));
            }
            this.F = true;
            bundle2.putInt("live.intent.extra.SCREEN_ORIENTATION", 1);
            TTLiveSDKContext.getHostService().j().a(getContext(), j3, bundle2);
        }
    }
}
