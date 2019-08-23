package com.bytedance.android.live.core.rxutils.rxlifecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.BehaviorSubject;

@RequiresApi(api = 11)
public class BindingFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8114a;

    /* renamed from: b  reason: collision with root package name */
    public final BehaviorSubject<a> f8115b = BehaviorSubject.create();

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 847, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f8115b.onNext(a.DESTROY);
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 846, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f8115b.onNext(a.DESTROY_VIEW);
    }

    public void onDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 848, new Class[0], Void.TYPE);
            return;
        }
        super.onDetach();
        this.f8115b.onNext(a.DETACH);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 844, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.f8115b.onNext(a.PAUSE);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 843, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 843, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f8115b.onNext(a.RESUME);
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 842, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 842, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.f8115b.onNext(a.START);
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f8114a, false, 845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8114a, false, 845, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        this.f8115b.onNext(a.STOP);
    }

    public void onAttach(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f8114a, false, 839, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f8114a, false, 839, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        this.f8115b.onNext(a.ATTACH);
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8114a, false, 840, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8114a, false, 840, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f8115b.onNext(a.CREATE);
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f8114a, false, 838, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8114a, false, 838, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.f8115b.onNext(a.ATTACH);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f8114a, false, 841, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f8114a, false, 841, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        this.f8115b.onNext(a.CREATE_VIEW);
        return null;
    }
}
