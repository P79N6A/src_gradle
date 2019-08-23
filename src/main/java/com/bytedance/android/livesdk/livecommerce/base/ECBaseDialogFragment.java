package com.bytedance.android.livesdk.livecommerce.base;

import android.app.Dialog;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.livecommerce.dialog.ECBottomDialog;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class ECBaseDialogFragment<VM extends ViewModel> extends BaseDialogFragment implements c {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f15960e;

    /* renamed from: f  reason: collision with root package name */
    public b f15961f;
    protected View g;
    public VM h;

    public abstract int a();

    public void a(Bundle bundle) {
    }

    public void b() {
    }

    public boolean d() {
        return false;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    /* renamed from: c */
    public final ECBottomDialog getDialog() {
        if (!PatchProxy.isSupport(new Object[0], this, f15960e, false, 10449, new Class[0], ECBottomDialog.class)) {
            return (ECBottomDialog) super.getDialog();
        }
        return (ECBottomDialog) PatchProxy.accessDispatch(new Object[0], this, f15960e, false, 10449, new Class[0], ECBottomDialog.class);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f15960e, false, 10452, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15960e, false, 10452, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f15961f != null) {
            this.f15961f.b(this);
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f15960e, false, 10444, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f15960e, false, 10444, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f15961f = bVar;
        if (this.f15961f != null) {
            this.f15961f.a(this);
        }
    }

    public int a(ECBottomDialog eCBottomDialog) {
        if (PatchProxy.isSupport(new Object[]{eCBottomDialog}, this, f15960e, false, 10447, new Class[]{ECBottomDialog.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{eCBottomDialog}, this, f15960e, false, 10447, new Class[]{ECBottomDialog.class}, Integer.TYPE)).intValue();
        }
        if (!PatchProxy.isSupport(new Object[0], eCBottomDialog, ECBottomDialog.f16187a, false, 10664, new Class[0], Integer.TYPE)) {
            return (int) (((float) UIUtils.getScreenHeight(eCBottomDialog.getContext())) * 0.73f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], eCBottomDialog, ECBottomDialog.f16187a, false, 10664, new Class[0], Integer.TYPE)).intValue();
    }

    @NonNull
    public /* synthetic */ Dialog onCreateDialog(@Nullable Bundle bundle) {
        ECBottomDialog eCBottomDialog;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15960e, false, 10448, new Class[]{Bundle.class}, ECBottomDialog.class)) {
            return (ECBottomDialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f15960e, false, 10448, new Class[]{Bundle.class}, ECBottomDialog.class);
        }
        if (d()) {
            FragmentActivity activity = getActivity();
            if (!PatchProxy.isSupport(new Object[]{activity}, null, ECBottomDialog.f16187a, true, 10662, new Class[]{Context.class}, ECBottomDialog.class)) {
                return new ECBottomDialog(activity, C0906R.style.fq);
            }
            eCBottomDialog = (ECBottomDialog) PatchProxy.accessDispatch(new Object[]{activity}, null, ECBottomDialog.f16187a, true, 10662, new Class[]{Context.class}, ECBottomDialog.class);
        } else {
            eCBottomDialog = new ECBottomDialog(getActivity());
        }
        return eCBottomDialog;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        VM vm;
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<String> mutableLiveData2;
        MutableLiveData<Void> mutableLiveData3;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f15960e, false, 10446, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f15960e, false, 10446, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        a(getArguments());
        if (PatchProxy.isSupport(new Object[]{this}, this, f15960e, false, 10450, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, this, f15960e, false, 10450, new Class[]{Fragment.class}, Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[]{this}, this, f15960e, false, 10451, new Class[]{Fragment.class}, ViewModel.class)) {
                vm = (ViewModel) PatchProxy.accessDispatch(new Object[]{this}, this, f15960e, false, 10451, new Class[]{Fragment.class}, ViewModel.class);
            } else {
                Type genericSuperclass = getClass().getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    vm = ViewModelProviders.of((Fragment) this).get((Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
                } else {
                    vm = null;
                }
            }
            this.h = vm;
            if (this.h != null && (this.h instanceof ECBaseViewModel)) {
                ECBaseViewModel eCBaseViewModel = (ECBaseViewModel) this.h;
                eCBaseViewModel.k_().observe(this, new Observer<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15962a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{str}, this, f15962a, false, 10454, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f15962a, false, 10454, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        a.b(ECBaseDialogFragment.this.getContext(), str);
                    }
                });
                eCBaseViewModel.b().observe(this, new Observer<Integer>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15964a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        Integer num = (Integer) obj;
                        if (PatchProxy.isSupport(new Object[]{num}, this, f15964a, false, 10455, new Class[]{Integer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{num}, this, f15964a, false, 10455, new Class[]{Integer.class}, Void.TYPE);
                            return;
                        }
                        Context context = ECBaseDialogFragment.this.getContext();
                        if (context != null) {
                            a.b(context, context.getResources().getString(num.intValue()));
                        }
                    }
                });
                if (PatchProxy.isSupport(new Object[0], eCBaseViewModel, ECBaseViewModel.f15977a, false, 10462, new Class[0], MutableLiveData.class)) {
                    mutableLiveData = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], eCBaseViewModel, ECBaseViewModel.f15977a, false, 10462, new Class[0], MutableLiveData.class);
                } else {
                    if (eCBaseViewModel.f15979c == null) {
                        eCBaseViewModel.f15979c = new MutableLiveData<>();
                    }
                    mutableLiveData = eCBaseViewModel.f15979c;
                }
                mutableLiveData.observe(this, new Observer<String>() {
                    public final /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
                    }
                });
                if (PatchProxy.isSupport(new Object[0], eCBaseViewModel, ECBaseViewModel.f15977a, false, 10463, new Class[0], MutableLiveData.class)) {
                    mutableLiveData2 = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], eCBaseViewModel, ECBaseViewModel.f15977a, false, 10463, new Class[0], MutableLiveData.class);
                } else {
                    if (eCBaseViewModel.f15980d == null) {
                        eCBaseViewModel.f15980d = new MutableLiveData<>();
                    }
                    mutableLiveData2 = eCBaseViewModel.f15980d;
                }
                mutableLiveData2.observe(this, new Observer<String>() {
                    public final /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
                    }
                });
                eCBaseViewModel.c().observe(this, new Observer<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15968a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        Void voidR = (Void) obj;
                        if (PatchProxy.isSupport(new Object[]{voidR}, this, f15968a, false, 10456, new Class[]{Void.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{voidR}, this, f15968a, false, 10456, new Class[]{Void.class}, Void.TYPE);
                            return;
                        }
                        ECBaseDialogFragment.this.e();
                    }
                });
                eCBaseViewModel.d().observe(this, new Observer<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15970a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        Void voidR = (Void) obj;
                        if (PatchProxy.isSupport(new Object[]{voidR}, this, f15970a, false, 10457, new Class[]{Void.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{voidR}, this, f15970a, false, 10457, new Class[]{Void.class}, Void.TYPE);
                            return;
                        }
                        ECBaseDialogFragment.this.f();
                    }
                });
                eCBaseViewModel.e().observe(this, new Observer<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15972a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        Void voidR = (Void) obj;
                        if (PatchProxy.isSupport(new Object[]{voidR}, this, f15972a, false, 10458, new Class[]{Void.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{voidR}, this, f15972a, false, 10458, new Class[]{Void.class}, Void.TYPE);
                            return;
                        }
                        ECBaseDialogFragment.this.g();
                    }
                });
                if (PatchProxy.isSupport(new Object[0], eCBaseViewModel, ECBaseViewModel.f15977a, false, 10467, new Class[0], MutableLiveData.class)) {
                    mutableLiveData3 = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], eCBaseViewModel, ECBaseViewModel.f15977a, false, 10467, new Class[0], MutableLiveData.class);
                } else {
                    if (eCBaseViewModel.f15981e == null) {
                        eCBaseViewModel.f15981e = new MutableLiveData<>();
                    }
                    mutableLiveData3 = eCBaseViewModel.f15981e;
                }
                mutableLiveData3.observe(this, new Observer<Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15974a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        Void voidR = (Void) obj;
                        if (PatchProxy.isSupport(new Object[]{voidR}, this, f15974a, false, 10459, new Class[]{Void.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{voidR}, this, f15974a, false, 10459, new Class[]{Void.class}, Void.TYPE);
                            return;
                        }
                        FragmentActivity activity = this.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                    }
                });
            }
        }
        ECBottomDialog c2 = getDialog();
        int a2 = a(c2);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, c2, ECBottomDialog.f16187a, false, 10663, new Class[]{Integer.TYPE}, Void.TYPE)) {
            ECBottomDialog eCBottomDialog = c2;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, eCBottomDialog, ECBottomDialog.f16187a, false, 10663, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Window window = c2.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = a2;
            window.setAttributes(attributes);
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            window.setBackgroundDrawableResource(17170445);
            window.setWindowAnimations(C0906R.style.fp);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f15960e, false, 10445, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f15960e, false, 10445, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.g = LayoutInflater.from(getActivity()).inflate(a(), null);
        return this.g;
    }
}
