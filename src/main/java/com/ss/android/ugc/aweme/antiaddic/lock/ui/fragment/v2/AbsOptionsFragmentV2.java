package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import a.i;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.BaseLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.d;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class AbsOptionsFragmentV2 extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33552a;

    /* renamed from: b  reason: collision with root package name */
    protected Button f33553b;

    /* renamed from: c  reason: collision with root package name */
    protected Button f33554c;

    /* renamed from: d  reason: collision with root package name */
    protected View f33555d;

    /* renamed from: e  reason: collision with root package name */
    protected TimeLockUserSetting f33556e;

    /* renamed from: f  reason: collision with root package name */
    private DmtStatusView f33557f;

    public abstract int a();

    public final LiveData<a> b() {
        if (PatchProxy.isSupport(new Object[0], this, f33552a, false, 22033, new Class[0], LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[0], this, f33552a, false, 22033, new Class[0], LiveData.class);
        } else if (getActivity() == null) {
            return null;
        } else {
            return ((SetLockParamViewModel) ViewModelProviders.of(getActivity()).get(SetLockParamViewModel.class)).f33617a;
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33552a, false, 22034, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33552a, false, 22034, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (b() == null) {
            return false;
        } else {
            if (((a) b().getValue()).f33620b != null) {
                z = true;
            }
            return z;
        }
    }

    public final void a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, this, f33552a, false, 22030, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2}, this, f33552a, false, 22030, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        ((BaseLockActivity) getActivity()).a(fragment2);
    }

    public final void a(int i) {
        final int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f33552a, false, 22031, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f33552a, false, 22031, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        if (i2 == 1) {
            hashMap.put("teen_mode", PushConstants.PUSH_TYPE_NOTIFY);
        } else {
            hashMap.put("screen_time_management", PushConstants.PUSH_TYPE_NOTIFY);
        }
        if (b() != null) {
            q<BaseResponse> a2 = ParentalPlatformApi.a(((a) b().getValue()).f33620b.f33621a, hashMap);
            if (a2 != null) {
                l.a(a2, new k<BaseResponse>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33562a;

                    public final void onFailure(Throwable th) {
                        final Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{th2}, this, f33562a, false, 22039, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th2}, this, f33562a, false, 22039, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        i.a((Callable<TResult>) new Callable<Object>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33567a;

                            public final Object call() throws Exception {
                                if (PatchProxy.isSupport(new Object[0], this, f33567a, false, 22041, new Class[0], Object.class)) {
                                    return PatchProxy.accessDispatch(new Object[0], this, f33567a, false, 22041, new Class[0], Object.class);
                                }
                                com.ss.android.ugc.aweme.app.api.a.a.a(AbsOptionsFragmentV2.this.getContext(), th2);
                                return null;
                            }
                        }, i.f1052b);
                    }

                    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f33562a, false, 22038, new Class[]{BaseResponse.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f33562a, false, 22038, new Class[]{BaseResponse.class}, Void.TYPE);
                            return;
                        }
                        i.a((Callable<TResult>) new Callable<Object>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33565a;

                            public final Object call() throws Exception {
                                int i;
                                if (PatchProxy.isSupport(new Object[0], this, f33565a, false, 22040, new Class[0], Object.class)) {
                                    return PatchProxy.accessDispatch(new Object[0], this, f33565a, false, 22040, new Class[0], Object.class);
                                }
                                if (i2 == 1) {
                                    i = C0906R.string.bzz;
                                } else {
                                    i = C0906R.string.cke;
                                }
                                String string = d.a().getString(i);
                                if (AbsOptionsFragmentV2.this.getActivity() != null) {
                                    string = AbsOptionsFragmentV2.this.getActivity().getString(i);
                                }
                                com.bytedance.ies.dmt.ui.d.a.a(d.a(), string).a();
                                com.ss.android.ugc.aweme.antiaddic.lock.d.b(AbsOptionsFragmentV2.this.getActivity(), i2);
                                return null;
                            }
                        }, i.f1052b);
                    }
                });
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33552a, false, 22029, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33552a, false, 22029, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f33553b = (Button) view.findViewById(C0906R.id.oe);
        this.f33555d = view.findViewById(C0906R.id.ix);
        this.f33555d.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33558a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f33558a, false, 22036, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f33558a, false, 22036, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                AbsOptionsFragmentV2.this.getActivity().onBackPressed();
            }
        });
        this.f33557f = (DmtStatusView) view.findViewById(C0906R.id.cvd);
        this.f33557f.setBuilder(DmtStatusView.a.a((Context) getActivity()));
        this.f33556e = TimeLockRuler.getUserSetting();
        this.f33554c = (Button) view.findViewById(C0906R.id.od);
        this.f33553b.setOnClickListener(new c(this));
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33552a, false, 22028, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(a(), viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33552a, false, 22028, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
