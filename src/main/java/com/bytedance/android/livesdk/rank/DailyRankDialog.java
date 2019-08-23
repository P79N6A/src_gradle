package com.bytedance.android.livesdk.rank;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.BaseDialogFragmentV2;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.live.uikit.viewpager.FragmentPagerAdapter;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.detail.b;
import com.bytedance.android.livesdk.chatroom.detail.i;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.d;
import com.bytedance.android.livesdk.chatroom.event.k;
import com.bytedance.android.livesdk.chatroom.event.l;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.f;
import com.bytedance.android.livesdk.rank.a.a;
import com.bytedance.android.livesdk.rank.fragment.TopRankFragment;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.w;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class DailyRankDialog extends BaseDialogFragmentV2 implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16873a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f16874b = "DailyRankDialog";

    /* renamed from: c  reason: collision with root package name */
    final int f16875c = 375;

    /* renamed from: d  reason: collision with root package name */
    public Room f16876d;

    /* renamed from: e  reason: collision with root package name */
    boolean f16877e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16878f = true;
    View g;
    protected LoadingStatusView h;
    public int i;
    public String j = "float";
    public int k;
    private View l;
    private RtlViewPager m;
    private boolean n;
    private com.bytedance.android.livesdk.rank.model.a o;
    private DataCenter p;
    private boolean q;
    private LivePagerSlidingTabStrip r;
    private a.C0117a s;
    private List<TopRankFragment> t;
    private RankPagerAdapter u;
    private boolean v = true;
    private ViewStub w;
    private CompositeDisposable x;
    private boolean y;
    private ViewPager.OnPageChangeListener z = new ViewPager.OnPageChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16879a;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f2, int i2) {
        }

        public void onPageSelected(int i) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f16879a, false, 12956, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f16879a, false, 12956, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (!DailyRankDialog.this.f16878f) {
                DailyRankDialog.this.f16878f = true;
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", "live");
                hashMap.put("event_type", "show");
                hashMap.put("event_page", "live_detail");
                hashMap.put("event_module", "popup");
                hashMap.put("request_id", DailyRankDialog.this.f16876d.getRequestId());
                hashMap.put("log_pb", DailyRankDialog.this.f16876d.getLog_pb());
                hashMap.put("room_id", String.valueOf(DailyRankDialog.this.f16876d.getId()));
                if (i == 0) {
                    str = "hourly";
                } else {
                    str = "regional";
                }
                hashMap.put("type", str);
                com.bytedance.android.livesdk.j.a.a().a("live_rank_show", hashMap, new j().a("live_detail").c("popup").b("live").f("show"), Room.class);
            }
        }
    };

    class RankPagerAdapter extends FragmentPagerAdapter {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f16889d;

        /* renamed from: e  reason: collision with root package name */
        List<TopRankFragment> f16890e;

        public int getCount() {
            if (PatchProxy.isSupport(new Object[0], this, f16889d, false, 12961, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16889d, false, 12961, new Class[0], Integer.TYPE)).intValue();
            } else if (this.f8717b == null) {
                return 0;
            } else {
                return this.f16890e.size();
            }
        }

        public final Fragment a(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f16889d, false, 12960, new Class[]{Integer.TYPE}, Fragment.class)) {
                return this.f16890e.get(i);
            }
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f16889d, false, 12960, new Class[]{Integer.TYPE}, Fragment.class);
        }

        @Nullable
        public CharSequence getPageTitle(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f16889d, false, 12962, new Class[]{Integer.TYPE}, CharSequence.class)) {
                return this.f16890e.get(i).f16957b;
            }
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f16889d, false, 12962, new Class[]{Integer.TYPE}, CharSequence.class);
        }

        RankPagerAdapter(FragmentManager fragmentManager, List<TopRankFragment> list) {
            super(fragmentManager);
            this.f16890e = list;
        }
    }

    public final void a(com.bytedance.android.livesdk.rank.model.a aVar, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i2)}, this, f16873a, false, 12937, new Class[]{com.bytedance.android.livesdk.rank.model.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i2)}, this, f16873a, false, 12937, new Class[]{com.bytedance.android.livesdk.rank.model.a.class, Integer.TYPE}, Void.TYPE);
        } else if (aVar != null && this.t != null) {
            List<TopRankFragment> list = this.t;
            if (i2 == 16) {
                i3 = 1;
            }
            list.get(i3).a(aVar);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f16873a, false, 12942, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f16873a, false, 12942, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.q) {
            this.h.setVisibility(0);
            this.h.d();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        if (PatchProxy.isSupport(new Object[0], this, f16873a, false, 12943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12943, new Class[0], Void.TYPE);
            return;
        }
        this.h.setVisibility(0);
        this.h.b();
        this.s.a();
    }

    public Context getContext() {
        if (!PatchProxy.isSupport(new Object[0], this, f16873a, false, 12948, new Class[0], Context.class)) {
            return super.getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12948, new Class[0], Context.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f16873a, false, 12940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12940, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.x.dispose();
        this.q = false;
        if (this.s != null) {
            this.s.b();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f16873a, false, 12938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12938, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    private void a(a.C0117a aVar) {
        this.s = aVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f16873a, false, 12950, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f16873a, false, 12950, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f16878f = false;
        this.m.setCurrentItem(0);
        super.onDismiss(dialogInterface);
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f16873a, false, 12939, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f16873a, false, 12939, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.x.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16881a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f16881a, false, 12957, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f16881a, false, 12957, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof d) {
                    DailyRankDialog.this.onEvent((d) t);
                } else {
                    if (t instanceof k) {
                        DailyRankDialog.this.onEvent((k) t);
                    }
                }
            }
        }));
    }

    public void onEvent(k kVar) {
        if (PatchProxy.isSupport(new Object[]{kVar}, this, f16873a, false, 12947, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar}, this, f16873a, false, 12947, new Class[]{k.class}, Void.TYPE);
        } else if (kVar != null) {
            if (kVar.f10181a) {
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16873a, false, 12932, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16873a, false, 12932, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.v) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                int a2 = ak.a(getContext());
                window.setGravity(8388629);
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (getContext() != null) {
                    attributes.horizontalMargin = ak.a(getContext(), 8.0f) / ((float) ak.b(getContext()));
                }
                window.setAttributes(attributes);
                window.setLayout(a2, a2 - ((int) ak.a(getContext(), 16.0f)));
            }
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.dimAmount = 0.0f;
            window.setAttributes(attributes2);
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16873a, false, 12931, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16873a, false, 12931, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.v) {
            i2 = C0906R.style.v0;
        } else {
            i2 = C0906R.style.v1;
        }
        setStyle(1, i2);
        f.a(getContext()).a("click_hlbutton", "blank_on", 0, 0);
        f.a(getContext()).a("show_topbillboard", "normal", 0, 0);
        if (this.x != null) {
            this.x.clear();
            this.x.dispose();
        }
        this.x = new CompositeDisposable();
        this.x.clear();
        a(d.class);
        a(k.class);
    }

    private boolean a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16873a, false, 12936, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16873a, false, 12936, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if ((((Integer) LiveSettingKeys.LIVE_DAILY_RANK.a()).intValue() & i3) == i3) {
            return true;
        } else {
            return false;
        }
    }

    public void onEvent(final d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f16873a, false, 12944, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f16873a, false, 12944, new Class[]{d.class}, Void.TYPE);
        } else if (this.q && !this.f16877e) {
            long j2 = dVar.f10164b;
            this.f16877e = true;
            if (!com.bytedance.android.live.uikit.a.a.f() || NetworkUtils.isNetworkAvailable(getContext())) {
                long j3 = 0;
                if (this.n) {
                    if (j2 <= 0 || j2 == this.f16876d.getId()) {
                        com.bytedance.android.livesdk.u.a a2 = com.bytedance.android.livesdk.u.a.a();
                        if (dVar.f10163a != null) {
                            j3 = dVar.f10163a.getId();
                        }
                        a2.a((Object) new UserProfileEvent(j3));
                    } else {
                        ai.a(getContext(), (int) C0906R.string.den);
                    }
                } else if (j2 <= 0 || j2 == this.f16876d.getId()) {
                    if (dVar.f10163a == null) {
                        this.f16877e = false;
                        return;
                    } else if (com.bytedance.android.live.uikit.a.a.f()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("second_enter_room", String.valueOf(dVar.f10163a.getId()));
                        TTLiveSDKContext.getHostService().i().a(h.d(), dVar.f10163a.getId(), bundle);
                    } else {
                        com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(dVar.f10163a.getId()));
                    }
                } else if (com.bytedance.android.live.uikit.a.a.f()) {
                    if (getActivity() != null && getActivity().getRequestedOrientation() == 0) {
                        getActivity().setRequestedOrientation(1);
                    }
                    w.a(this);
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f16873a, false, 12945, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f16873a, false, 12945, new Class[]{d.class}, Void.TYPE);
                    } else if (dVar != null) {
                        new i(new b.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f16886a;

                            public final void a(int i, String str) {
                            }

                            public final void a(@NonNull Room room) {
                                if (PatchProxy.isSupport(new Object[]{room}, this, f16886a, false, 12959, new Class[]{Room.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{room}, this, f16886a, false, 12959, new Class[]{Room.class}, Void.TYPE);
                                    return;
                                }
                                if (room != null) {
                                    DailyRankDialog.this.i = room.getOrientation();
                                    DailyRankDialog.this.a(dVar);
                                }
                            }
                        }, dVar.f10164b).a();
                    }
                    this.f16877e = false;
                    return;
                } else {
                    new m.a(getContext(), 0).a(false).c((CharSequence) getContext().getString(C0906R.string.cvu, new Object[]{dVar.f10163a.getNickName()})).b(0, (int) C0906R.string.cpw, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16883a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16883a, false, 12958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16883a, false, 12958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            dialogInterface.dismiss();
                            DailyRankDialog.this.a(dVar);
                        }
                    }).b(1, (int) C0906R.string.cpv, d.f16949b).a((DialogInterface.OnDismissListener) new e(this)).c();
                    dVar.f10163a.getId();
                    try {
                        new JSONObject().put("enter_type", "click");
                    } catch (Exception unused) {
                    }
                }
                this.f16877e = false;
                return;
            }
            ai.a((int) C0906R.string.d8r);
            this.f16877e = false;
        }
    }

    public final void a(d dVar) {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f16873a, false, 12946, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f16873a, false, 12946, new Class[]{d.class}, Void.TYPE);
        } else if (dVar != null) {
            dismiss();
            Bundle bundle = new Bundle();
            if (dVar.f10165c == 1) {
                str = "hourly_rank";
            } else {
                str = "regional_rank";
            }
            bundle.putString("source", str);
            bundle.putString("enter_from", "live_detail");
            if (dVar.f10165c == 1) {
                str2 = "hourly_rank";
            } else {
                str2 = "regional_rank";
            }
            bundle.putString("source", str2);
            if (dVar.f10163a != null) {
                bundle.putLong("anchor_id", dVar.f10163a.getId());
            }
            g a2 = com.bytedance.android.livesdk.j.a.a().a(j.class);
            if (!(a2 == null || a2.a() == null)) {
                bundle.putString("enter_from_merge", "live_detail");
                if (dVar.f10165c == 1) {
                    str4 = "hourly_rank";
                } else {
                    str4 = "regional_rank";
                }
                bundle.putString("enter_method", str4);
            }
            bundle.putString("starlight_rank", String.valueOf(dVar.f10166d));
            if (com.bytedance.android.live.uikit.a.a.f()) {
                bundle.putInt("orientation", this.i);
            }
            Bundle bundle2 = new Bundle();
            if (dVar.f10165c == 1) {
                str3 = "hourly_rank";
            } else {
                str3 = "regional_rank";
            }
            bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE_V1", str3);
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
            if (dVar.f10163a != null) {
                bundle.putLong("anchor_id", dVar.f10163a.getId());
            }
            a.a(this.p, bundle);
            com.bytedance.android.livesdk.u.a.a().a((Object) new l(dVar.f10164b, "live_detail", bundle));
        }
    }

    public final void a(com.bytedance.android.livesdk.rank.model.a aVar) {
        com.bytedance.android.livesdk.rank.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f16873a, false, 12941, new Class[]{com.bytedance.android.livesdk.rank.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f16873a, false, 12941, new Class[]{com.bytedance.android.livesdk.rank.model.a.class}, Void.TYPE);
            return;
        }
        this.o = aVar2;
        if (this.q) {
            if (PatchProxy.isSupport(new Object[0], this, f16873a, false, 12935, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12935, new Class[0], Void.TYPE);
            } else if (this.o != null) {
                this.t = new ArrayList();
                if (a(1)) {
                    this.t.add(TopRankFragment.a(this.o, this.f16876d, this.n, this.o.g, 1, this.p));
                }
                if (a(2) && !TextUtils.isEmpty(this.o.h)) {
                    this.t.add(TopRankFragment.a(null, this.f16876d, this.n, this.o.h, 2, this.p));
                    this.s.a(16);
                    this.y = true;
                }
                this.m.setVisibility(0);
                this.h.setVisibility(8);
                this.u = new RankPagerAdapter(getChildFragmentManager(), this.t);
                this.m.setAdapter(this.u);
                this.m.addOnPageChangeListener(this.z);
                if (this.t.size() < 2) {
                    this.r.setIndicatorHeight(0);
                } else {
                    this.r.a((int) C0906R.layout.al4, (int) C0906R.id.cz7);
                }
                this.r.setViewPager(this.m);
                if (this.y && this.k == 1) {
                    this.m.setCurrentItem(1);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", "live");
                hashMap.put("event_type", "show");
                hashMap.put("event_page", "live_detail");
                hashMap.put("event_module", "popup");
                hashMap.put("request_id", this.f16876d.getRequestId());
                hashMap.put("log_pb", this.f16876d.getLog_pb());
                hashMap.put("room_id", String.valueOf(this.f16876d.getId()));
                hashMap.put("type", "hourly");
                hashMap.put("click_position", String.valueOf(this.j));
                com.bytedance.android.livesdk.j.a.a().a("live_rank_show", hashMap, new j().a("live_detail").c("popup").b("live").f("show"), Room.class);
            } else {
                throw new IllegalArgumentException("not found DailyRankResult data");
            }
        }
    }

    public void show(FragmentManager fragmentManager, String str) {
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str}, this, f16873a, false, 12949, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str}, this, f16873a, false, 12949, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        this.f16878f = true;
        try {
            Field declaredField = fragmentManager.getClass().getDeclaredField("mAdded");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(fragmentManager);
            if (arrayList != null && arrayList.contains(this)) {
                return;
            }
        } catch (Exception | IllegalAccessException | NoSuchFieldException unused) {
        }
        super.show(fragmentManager, str);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16873a, false, 12933, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16873a, false, 12933, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.l = layoutInflater.inflate(C0906R.layout.aft, viewGroup2, false);
        this.q = true;
        if (this.s != null) {
            this.s.a();
        }
        if (PatchProxy.isSupport(new Object[0], this, f16873a, false, 12934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12934, new Class[0], Void.TYPE);
        } else {
            this.m = (RtlViewPager) this.l.findViewById(C0906R.id.du_);
            this.r = (LivePagerSlidingTabStrip) this.l.findViewById(C0906R.id.bw8);
            this.w = (ViewStub) this.l.findViewById(C0906R.id.zp);
            this.g = this.w.inflate();
            this.g.setOnClickListener(new b(this));
            this.h = (LoadingStatusView) this.l.findViewById(C0906R.id.a2f);
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.a_c, null);
            inflate.setOnClickListener(new c(this));
            this.h.setBuilder(LoadingStatusView.a.a(getContext()).c(inflate).a(getResources().getDimensionPixelSize(C0906R.dimen.ms)));
            this.h.setVisibility(0);
            this.h.b();
            if (PatchProxy.isSupport(new Object[0], this, f16873a, false, 12951, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16873a, false, 12951, new Class[0], Void.TYPE);
            } else {
                if (com.bytedance.android.live.uikit.a.a.f() && this.v && this.p != null && getContext() != null) {
                    int intValue = ((Integer) this.p.get("data_game_hour_rank_dialog_height", 0)).intValue();
                    if (this.f16876d != null) {
                        i2 = this.f16876d.getOrientation();
                    }
                    if (intValue > 0 && i2 == 1) {
                        UIUtils.updateLayout(this.m, -3, intValue + ((int) UIUtils.dip2Px(getContext(), 13.5f)));
                    }
                }
                if (com.bytedance.android.live.uikit.a.a.f() && this.l != null) {
                    View findViewById = this.l.findViewById(C0906R.id.d88);
                    if (!(findViewById == null || this.f16876d == null || this.p == null)) {
                        if (this.n) {
                            if (((com.bytedance.android.livesdkapi.depend.model.live.a) this.p.get("data_live_mode")) == com.bytedance.android.livesdkapi.depend.model.live.a.SCREEN_RECORD) {
                                findViewById.setTag(1);
                            }
                        } else if (this.f16876d.getOrientation() == 1) {
                            findViewById.setTag(1);
                        }
                    }
                }
            }
        }
        return this.l;
    }

    public static DailyRankDialog a(Room room, boolean z2, boolean z3, DataCenter dataCenter, int i2) {
        Room room2 = room;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{room2, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), dataCenter2, Integer.valueOf(i2)}, null, f16873a, true, 12930, new Class[]{Room.class, Boolean.TYPE, Boolean.TYPE, DataCenter.class, Integer.TYPE}, DailyRankDialog.class)) {
            return (DailyRankDialog) PatchProxy.accessDispatch(new Object[]{room2, Byte.valueOf(z2), Byte.valueOf(z3), dataCenter2, Integer.valueOf(i2)}, null, f16873a, true, 12930, new Class[]{Room.class, Boolean.TYPE, Boolean.TYPE, DataCenter.class, Integer.TYPE}, DailyRankDialog.class);
        }
        DailyRankDialog dailyRankDialog = new DailyRankDialog();
        dailyRankDialog.f16876d = room2;
        dailyRankDialog.n = z2;
        dailyRankDialog.v = z3;
        dailyRankDialog.p = dataCenter2;
        dailyRankDialog.k = i2;
        com.bytedance.android.livesdk.rank.c.a aVar = new com.bytedance.android.livesdk.rank.c.a(dailyRankDialog, room.getId(), room.getOwner().getId());
        dailyRankDialog.a((a.C0117a) aVar);
        return dailyRankDialog;
    }
}
