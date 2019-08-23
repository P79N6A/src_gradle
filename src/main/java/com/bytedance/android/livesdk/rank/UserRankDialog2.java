package com.bytedance.android.livesdk.rank;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.LiveDialogFragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.setting.f;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.am;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.j.c.c;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.rank.b.a;
import com.bytedance.android.livesdk.rank.fragment.CurrentUserRankListFragment;
import com.bytedance.android.livesdk.rank.fragment.PeriodUserRankListFragment;
import com.bytedance.android.livesdk.rank.fragment.UserRankListFragment;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.d;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;

public class UserRankDialog2 extends LiveDialogFragment implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16901a;

    /* renamed from: b  reason: collision with root package name */
    UserRankListFragment[] f16902b;

    /* renamed from: c  reason: collision with root package name */
    long f16903c;

    /* renamed from: d  reason: collision with root package name */
    boolean f16904d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16905e;

    /* renamed from: f  reason: collision with root package name */
    String f16906f;
    public final CompositeDisposable g = new CompositeDisposable();
    private Room h;
    private boolean i;
    private String[] j;
    private long k;
    private String l = "live_room_rank";
    private Activity m;
    private String n;
    private boolean o;
    private String[] p = {"live_room_rank", "weekly_rank", "totally_rank", "xigua_rank"};
    private DataCenter q;
    private int r;
    private g<i> s = new g<i>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16907a;

        public final void onSubscribe(Disposable disposable) {
            Disposable disposable2 = disposable;
            if (PatchProxy.isSupport(new Object[]{disposable2}, this, f16907a, false, 13000, new Class[]{Disposable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{disposable2}, this, f16907a, false, 13000, new Class[]{Disposable.class}, Void.TYPE);
                return;
            }
            super.onSubscribe(disposable);
            UserRankDialog2.this.g.add(disposable2);
        }

        public final /* synthetic */ void onNext(Object obj) {
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f16907a, false, 13001, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f16907a, false, 13001, new Class[]{i.class}, Void.TYPE);
                return;
            }
            super.onNext(iVar);
            UserRankDialog2 userRankDialog2 = UserRankDialog2.this;
            if (PatchProxy.isSupport(new Object[0], userRankDialog2, UserRankDialog2.f16901a, false, 12999, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], userRankDialog2, UserRankDialog2.f16901a, false, 12999, new Class[0], Void.TYPE);
            } else if (userRankDialog2.isViewValid() && TTLiveSDKContext.getHostService().k().c()) {
                if (userRankDialog2.f16903c > 0) {
                    userRankDialog2.onEvent(new a(userRankDialog2.f16903c));
                    userRankDialog2.f16903c = 0;
                    userRankDialog2.f16904d = true;
                    return;
                }
                for (UserRankListFragment d2 : userRankDialog2.f16902b) {
                    d2.e();
                }
            }
        }
    };

    static class UserRankPagerAdapter extends FragmentPagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final Fragment[] f16913a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f16914b;

        public int getCount() {
            if (this.f16913a != null) {
                return this.f16913a.length;
            }
            return 0;
        }

        public CharSequence getPageTitle(int i) {
            return this.f16914b[i];
        }

        public Fragment getItem(int i) {
            if (this.f16913a == null || i >= this.f16913a.length) {
                return null;
            }
            return this.f16913a[i];
        }

        UserRankPagerAdapter(FragmentManager fragmentManager, Fragment[] fragmentArr, String[] strArr) {
            super(fragmentManager);
            this.f16913a = fragmentArr;
            this.f16914b = strArr;
        }
    }

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f2, int i3) {
    }

    private int a() {
        if (PatchProxy.isSupport(new Object[0], this, f16901a, false, 12990, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f16901a, false, 12990, new Class[0], Integer.TYPE)).intValue();
        }
        String[] stringArray = getResources().getStringArray(C0906R.array.aj);
        if (stringArray != null && this.r < stringArray.length) {
            this.f16906f = stringArray[this.r];
        }
        if (!(this.f16906f == null || this.j == null)) {
            for (int i2 = 0; i2 < this.j.length; i2++) {
                if (this.j[i2] != null && this.j[i2].equals(this.f16906f)) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f16901a, false, 12994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16901a, false, 12994, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.g.dispose();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.k));
        com.bytedance.android.livesdk.j.a.a().a("livesdk_contribution_ranklist_duration", hashMap, Room.class, new j().b("live_interact").a("live_detail").c("popup"), new k());
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16901a, false, 12987, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16901a, false, 12987, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.o) {
            i2 = C0906R.style.v0;
        } else {
            i2 = C0906R.style.v1;
        }
        setStyle(1, i2);
    }

    public void onEvent(am amVar) {
        am amVar2 = amVar;
        if (PatchProxy.isSupport(new Object[]{amVar2}, this, f16901a, false, 12998, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar2}, this, f16901a, false, 12998, new Class[]{am.class}, Void.TYPE);
            return;
        }
        if (isVisible() && amVar2.f10158a == 1) {
            dismiss();
        }
    }

    public void onPageSelected(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16901a, false, 12995, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16901a, false, 12995, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = this.p[i2];
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", this.l);
        com.bytedance.android.livesdk.j.a.a().a("livesdk_contribution_ranklist_show", hashMap, new j().b("live_interact").a("live_detail").c("popup"), new k(), Room.class);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f16901a, false, 12993, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f16901a, false, 12993, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.o) {
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

    public void onEvent(com.bytedance.android.livesdkapi.depend.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f16901a, false, 12997, new Class[]{com.bytedance.android.livesdkapi.depend.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f16901a, false, 12997, new Class[]{com.bytedance.android.livesdkapi.depend.b.a.class}, Void.TYPE);
        } else if (isViewValid() && this.f16904d) {
            for (UserRankListFragment d2 : this.f16902b) {
                d2.e();
            }
        }
    }

    private <T> void a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f16901a, false, 12992, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls}, this, f16901a, false, 12992, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        this.g.add(com.bytedance.android.livesdk.u.a.a().a(cls).subscribe((Consumer<? super T>) new Consumer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16909a;

            public final void accept(T t) throws Exception {
                if (PatchProxy.isSupport(new Object[]{t}, this, f16909a, false, 13002, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f16909a, false, 13002, new Class[]{Object.class}, Void.TYPE);
                } else if (t instanceof a) {
                    UserRankDialog2.this.onEvent((a) t);
                } else if (t instanceof com.bytedance.android.livesdkapi.depend.b.a) {
                    UserRankDialog2.this.onEvent((com.bytedance.android.livesdkapi.depend.b.a) t);
                } else {
                    if (t instanceof am) {
                        UserRankDialog2.this.onEvent((am) t);
                    }
                }
            }
        }));
    }

    public void onEvent(a aVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f16901a, false, 12996, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f16901a, false, 12996, new Class[]{a.class}, Void.TYPE);
        } else if (!TTLiveSDKContext.getHostService().k().c()) {
            this.f16903c = aVar.f16930a;
            TTLiveSDKContext.getHostService().k().a(this.m, com.bytedance.android.livesdk.user.i.a().a(f.a()).b(f.b()).a(0).a()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) this.s);
        } else {
            if (com.bytedance.android.livesdk.utils.j.b(this.q) && this.h != null && aVar.f16930a == this.h.author().getId()) {
                ((com.bytedance.android.livesdkapi.c.a) b.a(com.bytedance.android.livesdkapi.c.a.class)).a(true, "live_ad", "follow", com.bytedance.android.livesdk.utils.j.c(this.q));
            }
            e k2 = TTLiveSDKContext.getHostService().k();
            b.a aVar2 = (b.a) com.bytedance.android.livesdk.user.f.b().a(aVar.f16930a);
            if (this.h != null) {
                str = this.h.getRequestId();
            } else {
                str = "";
            }
            k2.a(((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) ((d.b) aVar2.a(str)).b("live_detail")).c("")).b(0)).d("")).a(this.m)).e("live_detail")).f("follow")).c()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<com.bytedance.android.livesdkapi.depend.model.b.a>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16911a;

                public final void onComplete() {
                }

                public final void onSubscribe(Disposable disposable) {
                }

                public final void onError(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f16911a, false, 13004, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f16911a, false, 13004, new Class[]{Throwable.class}, Void.TYPE);
                    } else if (UserRankDialog2.this.isViewValid()) {
                        if (th instanceof com.bytedance.android.live.a.a.b.a) {
                            com.bytedance.android.live.uikit.d.a.a(UserRankDialog2.this.getContext(), ((com.bytedance.android.live.a.a.b.a) th).getPrompt());
                        } else {
                            com.bytedance.android.live.uikit.d.a.a(UserRankDialog2.this.getContext(), (int) C0906R.string.d35);
                        }
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f16911a, false, 13003, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f16911a, false, 13003, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
                        return;
                    }
                    UserRankDialog2.this.onEvent(new com.bytedance.android.livesdkapi.depend.b.a(aVar));
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
            Object[] objArr = new Object[3];
            objArr[0] = new j().b("live_interact").f("core").a("live_detail").c("popup");
            if (TextUtils.equals(this.l, "live_room_rank")) {
                str2 = "single_room_rank";
            } else {
                str2 = this.l;
            }
            objArr[1] = new c(str2, aVar.f16930a);
            objArr[2] = Room.class;
            a2.a("follow", hashMap, objArr);
        }
    }

    private boolean a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16901a, false, 12991, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16901a, false, 12991, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if ((((Integer) LiveSettingKeys.LIVE_USER_RANK.a()).intValue() & i3) == i3) {
            return true;
        } else {
            return false;
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        long j2;
        long j3;
        ArrayList arrayList;
        long j4;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16901a, false, 12988, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f16901a, false, 12988, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.ahi, viewGroup2, false);
        ViewPager viewPager = (ViewPager) inflate.findViewById(C0906R.id.du_);
        if (PatchProxy.isSupport(new Object[0], this, f16901a, false, 12989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16901a, false, 12989, new Class[0], Void.TYPE);
        } else {
            if (this.h == null) {
                j2 = 0;
            } else {
                j2 = this.h.getId();
            }
            if (this.h == null || this.h.getOwner() == null) {
                j3 = 0;
            } else {
                j3 = this.h.getOwner().getId();
            }
            String[] stringArray = getResources().getStringArray(C0906R.array.aj);
            if (!this.f16905e) {
                ArrayList arrayList2 = new ArrayList(3);
                ArrayList arrayList3 = new ArrayList();
                if (a(1)) {
                    arrayList2.add(CurrentUserRankListFragment.a(j2, j3, this.i));
                    arrayList3.add(stringArray[0]);
                }
                if (a(2)) {
                    if (this.h == null) {
                        j4 = 0;
                    } else {
                        j4 = this.h.getId();
                    }
                    arrayList = arrayList3;
                    arrayList2.add(PeriodUserRankListFragment.a(j4, this.i, j3, 7));
                    arrayList.add(stringArray[1]);
                } else {
                    arrayList = arrayList3;
                }
                if (a(4)) {
                    arrayList2.add(PeriodUserRankListFragment.a(j2, this.i, j3, 9));
                    arrayList.add(stringArray[2]);
                }
                if (!(!com.bytedance.android.live.uikit.a.a.f() || this.q == null || ((Integer) this.q.get("data_xt_broadcast_type", -1)).intValue() == 3)) {
                    com.bytedance.android.livesdk.n.c cVar = (com.bytedance.android.livesdk.n.c) com.bytedance.android.livesdk.v.j.q().k().a(com.bytedance.android.livesdk.n.c.class);
                    if (cVar != null) {
                        this.h.getId();
                        UserRankListFragment e2 = cVar.e();
                        if (e2 != null) {
                            arrayList2.add(e2);
                            arrayList.add(stringArray[3]);
                        }
                    }
                }
                this.f16902b = new UserRankListFragment[arrayList2.size()];
                this.f16902b = (UserRankListFragment[]) arrayList2.toArray(this.f16902b);
                this.j = new String[arrayList.size()];
                this.j = (String[]) arrayList.toArray(this.j);
            } else if (a(1)) {
                this.f16902b = new UserRankListFragment[1];
                this.f16902b[0] = CurrentUserRankListFragment.a(j2, j3, this.i);
                this.j = stringArray;
            }
        }
        if (this.f16902b != null) {
            for (UserRankListFragment userRankListFragment : this.f16902b) {
                userRankListFragment.z = this.q;
                userRankListFragment.A = this.s;
            }
        }
        viewPager.setAdapter(new UserRankPagerAdapter(getChildFragmentManager(), this.f16902b, this.j));
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(a());
        LivePagerSlidingTabStrip livePagerSlidingTabStrip = (LivePagerSlidingTabStrip) inflate.findViewById(C0906R.id.cz6);
        if (this.f16902b == null || this.f16902b.length < 2) {
            livePagerSlidingTabStrip.setIndicatorHeight(0);
            livePagerSlidingTabStrip.setTabBackground(C0906R.color.a7l);
        } else if (com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) {
            livePagerSlidingTabStrip.a((int) C0906R.layout.al4, (int) C0906R.id.cz7);
        } else if (com.bytedance.android.live.uikit.a.a.f()) {
            if (!com.bytedance.android.live.uikit.a.a.c()) {
                if (PatchProxy.isSupport(new Object[]{null, 0}, livePagerSlidingTabStrip, LivePagerSlidingTabStrip.f18241a, false, 14483, new Class[]{Typeface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{null, 0}, livePagerSlidingTabStrip, LivePagerSlidingTabStrip.f18241a, false, 14483, new Class[]{Typeface.class, Integer.TYPE}, Void.TYPE);
                } else {
                    livePagerSlidingTabStrip.h = null;
                    livePagerSlidingTabStrip.i = 0;
                    livePagerSlidingTabStrip.a();
                }
            } else if (getContext() != null) {
                livePagerSlidingTabStrip.setIndicatorBottomMargin((int) UIUtils.dip2Px(getContext(), 6.0f));
            }
            if (com.bytedance.android.live.uikit.a.a.c()) {
                livePagerSlidingTabStrip.setIndicatorRadius((int) UIUtils.dip2Px(getContext(), 2.0f));
            }
        } else {
            livePagerSlidingTabStrip.setIndicatorColorResource(C0906R.color.a_r);
            livePagerSlidingTabStrip.setTextColorResource(C0906R.color.agu);
        }
        livePagerSlidingTabStrip.setViewPager(viewPager);
        a(a.class);
        a(com.bytedance.android.livesdkapi.depend.b.a.class);
        a(am.class);
        this.k = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", this.l);
        com.bytedance.android.livesdk.j.a.a().a("contribution_ranklist_show", hashMap, new j().b("live_interact").a("live_detail").c("popup"), new k(), Room.class);
        return inflate;
    }

    public static UserRankDialog2 a(Activity activity, Room room, boolean z, boolean z2, String str, DataCenter dataCenter) {
        Activity activity2 = activity;
        Room room2 = room;
        String str2 = str;
        DataCenter dataCenter2 = dataCenter;
        if (PatchProxy.isSupport(new Object[]{activity2, room2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), str2, dataCenter2}, null, f16901a, true, 12986, new Class[]{Activity.class, Room.class, Boolean.TYPE, Boolean.TYPE, String.class, DataCenter.class}, UserRankDialog2.class)) {
            Object[] objArr = {activity2, room2, Byte.valueOf(z), Byte.valueOf(z2), str2, dataCenter2};
            return (UserRankDialog2) PatchProxy.accessDispatch(objArr, null, f16901a, true, 12986, new Class[]{Activity.class, Room.class, Boolean.TYPE, Boolean.TYPE, String.class, DataCenter.class}, UserRankDialog2.class);
        } else if (room2 != null) {
            UserRankDialog2 userRankDialog2 = new UserRankDialog2();
            userRankDialog2.m = activity2;
            userRankDialog2.h = room2;
            userRankDialog2.i = z;
            userRankDialog2.n = str2;
            userRankDialog2.o = z2;
            userRankDialog2.q = dataCenter2;
            return userRankDialog2;
        } else {
            throw new IllegalArgumentException("room is null");
        }
    }
}
