package com.bytedance.android.livesdk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.livesdk.chatroom.api.BanUserInfoApi;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdk.x.a.a;
import com.bytedance.android.livesdk.x.a.b;
import com.bytedance.android.livesdk.x.a.c;
import com.bytedance.android.livesdkapi.d;
import com.bytedance.android.livesdkapi.depend.model.a.e;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.host.i;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class StartLiveBaseFragment extends BaseFragment implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8834a;

    /* renamed from: b  reason: collision with root package name */
    protected d f8835b = TTLiveSDKContext.getHostService().b().b();

    /* renamed from: c  reason: collision with root package name */
    protected final CompositeDisposable f8836c = new CompositeDisposable();
    protected Activity h;
    protected boolean i = false;
    protected com.bytedance.android.livesdkapi.depend.model.a.d j;
    protected m k;
    public int l = 0;
    public int m = 0;
    protected a n;
    protected com.bytedance.android.livesdk.x.a.d o;
    protected c p;
    protected b q;
    protected com.bytedance.android.livesdk.x.a r;
    protected ArrayList<f> s = new ArrayList<>();
    public Handler t = new Handler(Looper.getMainLooper());
    private final List<Object> u = new ArrayList();

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f8834a, false, 2780, new Class[0], String.class)) {
            return s.INST.getBeautyFilePath();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2780, new Class[0], String.class);
    }

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f8834a, false, 2781, new Class[0], String.class)) {
            return s.INST.getFaceReshapeFilePath();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2781, new Class[0], String.class);
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, f8834a, false, 2787, new Class[0], Integer.TYPE)) {
            return ((Integer) com.bytedance.android.livesdk.w.b.g.b()).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2787, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8834a, false, 2779, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2779, new Class[0], Void.TYPE);
            return;
        }
        this.u.clear();
        super.onDestroy();
        b("onDestroy");
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8834a, false, 2778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2778, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        b("onPause");
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8834a, false, 2777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2777, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        b("onResume");
    }

    public final float d() {
        if (!PatchProxy.isSupport(new Object[0], this, f8834a, false, 2782, new Class[0], Float.TYPE)) {
            return ((com.bytedance.android.livesdk.effect.model.a) LiveSettingKeys.LIVE_BEAUTY_PARAM.a()).f13829a.f13834a * ((Float) com.bytedance.android.livesdk.w.b.F.a()).floatValue();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2782, new Class[0], Float.TYPE)).floatValue();
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f8834a, false, 2790, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2790, new Class[0], Void.TYPE);
            return;
        }
        this.n = new a();
        this.o = new com.bytedance.android.livesdk.x.a.d();
        this.p = new c();
        this.q = new b();
        this.r = new com.bytedance.android.livesdk.x.a(0, this.s, new f.b(getContext(), this));
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f8834a, false, 2791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2791, new Class[0], Void.TYPE);
            return;
        }
        i a2 = TTLiveSDKContext.getHostService().k().a();
        if (this.h != null && a2 != null) {
            this.f8836c.add(((BanUserInfoApi) j.q().d().a(BanUserInfoApi.class)).getBanUserInfo().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ar(this), as.f9065b));
        }
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f8834a, false, 2792, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f8834a, false, 2792, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean a2 = com.bytedance.android.livesdk.o.a.a(com.bytedance.android.livesdkapi.j.a.LiveResource);
        if (a2) {
            com.bytedance.android.livesdkapi.j.a.LiveResource.load(getContext(), !com.bytedance.android.live.uikit.a.a.f());
            s.INST.loadResources();
            m();
        } else if (!NetworkUtils.isNetworkAvailable(this.h)) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.h, (int) C0906R.string.csv);
            return false;
        } else if (NetworkUtils.getNetworkType(this.h) == NetworkUtils.NetworkType.MOBILE_2G) {
            com.bytedance.android.live.uikit.d.a.a((Context) this.h, (int) C0906R.string.dg1);
            return false;
        } else {
            com.bytedance.android.livesdkapi.j.a.LiveResource.checkInstall(this.h, new i.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8837a;

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a() {
                    if (!s.INST.isLoadedRes()) {
                        if (StartLiveBaseFragment.this.j != null) {
                            StartLiveBaseFragment.this.j.a();
                        } else if (StartLiveBaseFragment.this.getActivity() != null) {
                            StartLiveBaseFragment.this.getActivity().finish();
                        }
                    }
                }

                public final void b(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f8837a, false, 2797, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f8837a, false, 2797, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    StartLiveBaseFragment.this.t.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f8839a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f8839a, false, 2800, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f8839a, false, 2800, new Class[0], Void.TYPE);
                                return;
                            }
                            if (StartLiveBaseFragment.this.m < 2) {
                                StartLiveBaseFragment.this.h();
                                StartLiveBaseFragment.this.m++;
                            }
                        }
                    });
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ void a(Boolean bool) {
                    if (bool == null || !bool.booleanValue()) {
                        if (StartLiveBaseFragment.this.l > 3) {
                            if (StartLiveBaseFragment.this.b_()) {
                                ai.a((int) C0906R.string.dco);
                            }
                            if (StartLiveBaseFragment.this.k != null && StartLiveBaseFragment.this.k.isShowing()) {
                                StartLiveBaseFragment.this.k.dismiss();
                                return;
                            }
                        } else {
                            s.INST.loadResources();
                            StartLiveBaseFragment.this.l++;
                        }
                        return;
                    }
                    if (StartLiveBaseFragment.this.k != null && StartLiveBaseFragment.this.k.isShowing()) {
                        StartLiveBaseFragment.this.k.dismiss();
                    }
                    StartLiveBaseFragment.this.m();
                }

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f8837a, false, 2796, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f8837a, false, 2796, new Class[]{String.class}, Void.TYPE);
                    } else if (!NetworkUtils.isNetworkAvailable(StartLiveBaseFragment.this.h)) {
                        com.bytedance.android.live.uikit.d.a.a((Context) StartLiveBaseFragment.this.h, (int) C0906R.string.csv);
                    } else if (NetworkUtils.getNetworkType(StartLiveBaseFragment.this.h) == NetworkUtils.NetworkType.MOBILE_2G) {
                        com.bytedance.android.live.uikit.d.a.a((Context) StartLiveBaseFragment.this.h, (int) C0906R.string.dg1);
                    } else {
                        if (TTLiveSDKContext.getHostService().e() != null) {
                            TTLiveSDKContext.getHostService().e();
                            TTLiveSDKContext.getHostService().e().b(com.bytedance.android.livesdkapi.j.a.LiveResource.getPackageName());
                        }
                        com.bytedance.android.livesdkapi.j.a.LiveResource.load(StartLiveBaseFragment.this.h, !com.bytedance.android.live.uikit.a.a.f());
                        if (StartLiveBaseFragment.this.getContext() != null && !s.INST.isLoadedRes()) {
                            if (TTLiveSDKContext.getHostService().e() != null) {
                                TTLiveSDKContext.getHostService().e();
                                TTLiveSDKContext.getHostService().e().b(com.bytedance.android.livesdkapi.j.a.LiveResource.getPackageName());
                            }
                            if (StartLiveBaseFragment.this.k == null) {
                                StartLiveBaseFragment.this.k = new m.a(StartLiveBaseFragment.this.getContext(), 2).a((DialogInterface.OnDismissListener) new au(this)).c();
                            }
                            s.INST.isLoadedRes.observe(StartLiveBaseFragment.this, new av(this));
                        }
                    }
                }
            });
        }
        return a2;
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f8834a, false, 2773, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8834a, false, 2773, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.h = (Activity) context;
    }

    private void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8834a, false, 2776, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f8834a, false, 2776, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", "StartLiveFragment:" + str2);
        com.bytedance.android.livesdk.j.c.b().b("ttlive_page", (Map<String, Object>) hashMap);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8834a, false, 2788, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8834a, false, 2788, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.w.b.g.b(Integer.valueOf(i2));
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8834a, false, 2775, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8834a, false, 2775, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        if (TTLiveSDKContext.getHostService() == null || TTLiveSDKContext.getHostService().k() == null) {
            ai.a((int) C0906R.string.cw6);
            getActivity().finish();
            this.i = true;
        }
        super.onCreate(bundle);
        b("onCreate");
    }

    public final boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8834a, false, 2789, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f8834a, false, 2789, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!isAdded()) {
            return false;
        } else {
            Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(str2);
            if (findFragmentByTag != null && (findFragmentByTag instanceof DialogFragment)) {
                DialogFragment dialogFragment = (DialogFragment) findFragmentByTag;
                if (dialogFragment.getDialog() == null || !dialogFragment.getDialog().isShowing()) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f8834a, false, 2774, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f8834a, false, 2774, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        Iterator<Object> it2 = this.u.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        super.onActivityResult(i2, i3, intent);
    }
}
