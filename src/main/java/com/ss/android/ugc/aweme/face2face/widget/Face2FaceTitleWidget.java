package com.ss.android.ugc.aweme.face2face.widget;

import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceFinishViewModel;

public class Face2FaceTitleWidget implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44141a;

    /* renamed from: b  reason: collision with root package name */
    public FragmentActivity f44142b;

    /* renamed from: c  reason: collision with root package name */
    public NormalTitleBar f44143c;

    public Face2FaceTitleWidget(@NonNull FragmentActivity fragmentActivity, @NonNull NormalTitleBar normalTitleBar) {
        this.f44142b = fragmentActivity;
        this.f44143c = normalTitleBar;
        normalTitleBar.setOnTitleBarClickListener(new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44144a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44144a, false, 39327, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44144a, false, 39327, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                Face2FaceFinishViewModel face2FaceFinishViewModel = (Face2FaceFinishViewModel) ViewModelProviders.of(Face2FaceTitleWidget.this.f44142b).get(Face2FaceFinishViewModel.class);
                Boolean bool = Boolean.TRUE;
                if (PatchProxy.isSupport(new Object[]{bool}, face2FaceFinishViewModel, Face2FaceFinishViewModel.f44107a, false, 39276, new Class[]{Boolean.class}, Void.TYPE)) {
                    Face2FaceFinishViewModel face2FaceFinishViewModel2 = face2FaceFinishViewModel;
                    PatchProxy.accessDispatch(new Object[]{bool}, face2FaceFinishViewModel2, Face2FaceFinishViewModel.f44107a, false, 39276, new Class[]{Boolean.class}, Void.TYPE);
                    return;
                }
                face2FaceFinishViewModel.f44108b.setValue(bool);
            }
        });
        fragmentActivity.getLifecycle().addObserver(this);
    }
}
