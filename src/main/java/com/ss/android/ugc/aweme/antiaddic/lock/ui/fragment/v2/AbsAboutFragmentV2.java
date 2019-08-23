package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import a.i;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.ss.android.ugc.aweme.antiaddic.lock.b.a;
import com.ss.android.ugc.aweme.antiaddic.lock.c;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeLockFragmentFactory;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.base.ui.session.b;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbsAboutFragmentV2 extends AmeBaseFragment implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33535a;

    /* renamed from: b  reason: collision with root package name */
    protected Button f33536b;

    /* renamed from: c  reason: collision with root package name */
    protected View f33537c;

    /* renamed from: d  reason: collision with root package name */
    protected DmtTextView f33538d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.antiaddic.lock.a.a f33539e;

    /* renamed from: f  reason: collision with root package name */
    private DmtStatusView f33540f;

    public abstract int a();

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22018, new Class[0], Void.TYPE);
            return;
        }
        if (this.f33540f != null) {
            this.f33540f.b();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22016, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22016, new Class[0], Void.TYPE);
            return;
        }
        h();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22017, new Class[0], Void.TYPE);
            return;
        }
        h();
        c.f33443d.a(getActivity(), b(), false);
    }

    private LiveData<com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a> g() {
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22014, new Class[0], LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22014, new Class[0], LiveData.class);
        } else if (getActivity() == null) {
            return null;
        } else {
            return ((SetLockParamViewModel) ViewModelProviders.of(getActivity()).get(SetLockParamViewModel.class)).f33617a;
        }
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f33535a, false, 22010, new Class[0], Integer.TYPE)) {
            return ((com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a) ((SetLockParamViewModel) ViewModelProviders.of(getActivity()).get(SetLockParamViewModel.class)).f33617a.getValue()).f33619a;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22010, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22015, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22015, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (g() == null) {
            return false;
        } else {
            if (((com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a) g().getValue()).f33620b != null) {
                z = true;
            }
            return z;
        }
    }

    public void c() {
        boolean z;
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22011, new Class[0], Void.TYPE);
        } else if (f()) {
            if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22013, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22013, new Class[0], Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            if (b() == 0) {
                hashMap.put("screen_time_management", String.valueOf(((TimeLockAboutFragmentV2.a) ((TimeLockOptionViewModel) ViewModelProviders.of(getActivity()).get(TimeLockOptionViewModel.class)).f33618a.getValue()).f33584b));
            } else {
                hashMap.put("teen_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (g() != null) {
                q<BaseResponse> a2 = ParentalPlatformApi.a(((com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a) g().getValue()).f33620b.f33621a, hashMap);
                if (a2 != null) {
                    l.a(a2, new k<BaseResponse>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33545a;

                        public final void onFailure(Throwable th) {
                            final Throwable th2 = th;
                            if (PatchProxy.isSupport(new Object[]{th2}, this, f33545a, false, 22025, new Class[]{Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{th2}, this, f33545a, false, 22025, new Class[]{Throwable.class}, Void.TYPE);
                                return;
                            }
                            i.a((Callable<TResult>) new Callable<Object>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f33549a;

                                public final Object call() throws Exception {
                                    if (PatchProxy.isSupport(new Object[0], this, f33549a, false, 22027, new Class[0], Object.class)) {
                                        return PatchProxy.accessDispatch(new Object[0], this, f33549a, false, 22027, new Class[0], Object.class);
                                    }
                                    com.ss.android.ugc.aweme.app.api.a.a.a(AbsAboutFragmentV2.this.getContext(), th2);
                                    return null;
                                }
                            }, i.f1052b);
                        }

                        public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
                            BaseResponse baseResponse = (BaseResponse) obj;
                            if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f33545a, false, 22024, new Class[]{BaseResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f33545a, false, 22024, new Class[]{BaseResponse.class}, Void.TYPE);
                                return;
                            }
                            i.a((Callable<TResult>) new Callable<Object>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f33547a;

                                public final Object call() throws Exception {
                                    if (PatchProxy.isSupport(new Object[0], this, f33547a, false, 22026, new Class[0], Object.class)) {
                                        return PatchProxy.accessDispatch(new Object[0], this, f33547a, false, 22026, new Class[0], Object.class);
                                    }
                                    FragmentActivity activity = AbsAboutFragmentV2.this.getActivity();
                                    int b2 = AbsAboutFragmentV2.this.b();
                                    if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(b2)}, null, d.f33446a, true, 21801, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(b2)}, null, d.f33446a, true, 21801, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE);
                                    } else {
                                        if (b2 == 0) {
                                            com.bytedance.ies.dmt.ui.d.a.a((Context) activity, (int) C0906R.string.cku).a();
                                        } else {
                                            com.bytedance.ies.dmt.ui.d.a.a((Context) activity, (int) C0906R.string.cin).a();
                                        }
                                        d.a(activity, b2);
                                    }
                                    return null;
                                }
                            }, i.f1052b);
                        }
                    });
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22012, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22012, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (c.f33443d.e()) {
                if (!c.f33443d.f()) {
                    fragment = TimeLockFragmentFactory.a(false);
                } else {
                    fragment = TimeLockFragmentFactory.a();
                    b.a().a("TimeLockEnterFragmentV2", Boolean.class).a((LifecycleOwner) fragment).a(this, new a.C0450a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33543a;

                        public final void a(Object obj) {
                            if (PatchProxy.isSupport(new Object[]{obj}, this, f33543a, false, 22023, new Class[]{Object.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{obj}, this, f33543a, false, 22023, new Class[]{Object.class}, Void.TYPE);
                                return;
                            }
                            c.f33443d.a(AbsAboutFragmentV2.this.getActivity(), AbsAboutFragmentV2.this.b(), false);
                        }
                    });
                }
                a(fragment);
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (TimeLockRuler.getUserSetting() == null) {
                    a(TimeLockFragmentFactory.a(false));
                    return;
                }
                if (!com.ss.android.g.a.a()) {
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    if (!userSetting.isContentFilterOn() && !userSetting.isTimeLockOn()) {
                        TimeLockRuler.removeUserSetting();
                        a(TimeLockFragmentFactory.a(false));
                        return;
                    }
                }
                Fragment a3 = TimeLockFragmentFactory.a();
                b.a().a("TimeLockEnterFragmentV2", Boolean.class).a((LifecycleOwner) a3).a(this, new a.C0450a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33541a;

                    public final void a(Object obj) {
                        if (PatchProxy.isSupport(new Object[]{obj}, this, f33541a, false, 22022, new Class[]{Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{obj}, this, f33541a, false, 22022, new Class[]{Object.class}, Void.TYPE);
                            return;
                        }
                        d.a(AbsAboutFragmentV2.this.getActivity(), AbsAboutFragmentV2.this.b(), TimeLockRuler.getUserSetting());
                    }
                });
                a(a3);
            }
        }
    }

    private void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f33535a, false, 22009, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f33535a, false, 22009, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        ((BaseLockActivity) getActivity()).a(fragment2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33535a, false, 22006, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33535a, false, 22006, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f33536b = (Button) view.findViewById(C0906R.id.oe);
        this.f33538d = (DmtTextView) view.findViewById(C0906R.id.d2u);
        this.f33537c = view.findViewById(C0906R.id.ix);
        this.f33537c.setOnClickListener(new a(this));
        if (PatchProxy.isSupport(new Object[]{view}, this, f33535a, false, 22008, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33535a, false, 22008, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f33536b.setOnClickListener(new b(this));
            this.f33540f = (DmtStatusView) view.findViewById(C0906R.id.cvd);
            this.f33540f.setBuilder(DmtStatusView.a.a((Context) getActivity()));
        }
        if (PatchProxy.isSupport(new Object[0], this, f33535a, false, 22007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33535a, false, 22007, new Class[0], Void.TYPE);
            return;
        }
        this.f33539e = new com.ss.android.ugc.aweme.antiaddic.lock.a.a();
        this.f33539e.a((com.ss.android.ugc.aweme.antiaddic.lock.b.a) this);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33535a, false, 22005, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(a(), viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33535a, false, 22005, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
