package com.ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.widget.CircularProgressView;
import com.ss.android.ugc.aweme.share.d;
import org.jetbrains.annotations.NotNull;

public class PublishDialogFragment extends Fragment implements s<CreateAwemeResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65389a;

    /* renamed from: b  reason: collision with root package name */
    protected CircularProgressView f65390b;

    /* renamed from: c  reason: collision with root package name */
    protected TextView f65391c;

    public final void a(String str) {
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65389a, false, 74422, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65389a, false, 74422, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74424, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74423, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65389a, false, 74425, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65389a, false, 74425, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74417, new Class[0], Void.TYPE);
            return;
        }
        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74413, new Class[0], Void.TYPE);
            return;
        }
        getFragmentManager().beginTransaction().show(this).commitAllowingStateLoss();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74414, new Class[0], Void.TYPE);
            return;
        }
        getFragmentManager().beginTransaction().hide(this).commitAllowingStateLoss();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74416, new Class[0], Void.TYPE);
            return;
        }
        getFragmentManager().beginTransaction().remove(this).commit();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f65389a, false, 74421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65389a, false, 74421, new Class[0], Void.TYPE);
            return;
        }
        c();
        super.onDestroy();
    }

    public final /* synthetic */ void a(at atVar) {
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) atVar;
        if (PatchProxy.isSupport(new Object[]{createAwemeResponse}, this, f65389a, false, 74419, new Class[]{CreateAwemeResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{createAwemeResponse}, this, f65389a, false, 74419, new Class[]{CreateAwemeResponse.class}, Void.TYPE);
            return;
        }
        new d();
        c();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65389a, false, 74418, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65389a, false, 74418, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65389a, false, 74412, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65389a, false, 74412, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65390b.setProgress((float) i);
        TextView textView = this.f65391c;
        textView.setText(i + "%");
    }

    public final void a(hn hnVar) {
        if (PatchProxy.isSupport(new Object[]{hnVar}, this, f65389a, false, 74420, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar}, this, f65389a, false, 74420, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        c();
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f65389a, false, 74411, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f65389a, false, 74411, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f65390b = (CircularProgressView) view.findViewById(C0906R.id.b2w);
        this.f65390b.setIndeterminate(false);
        this.f65391c = (TextView) view.findViewById(C0906R.id.c7k);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f65389a, false, 74410, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.a2v, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f65389a, false, 74410, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
