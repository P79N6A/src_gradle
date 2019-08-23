package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.internal.b;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.v;
import com.ss.android.ugc.aweme.views.LiveButtonView;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;
import com.ss.android.ugc.gamora.recorder.d;

public final class cw {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66710a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f66711b;

    cw(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, View... viewArr) {
        boolean z;
        this.f66711b = shortVideoRecordingOperationPanelFragment;
        final b bVar = shortVideoRecordingOperationPanelFragment.S;
        bVar.a(this.f66711b.getContext(), (LifecycleOwner) shortVideoRecordingOperationPanelFragment, (Fragment) shortVideoRecordingOperationPanelFragment);
        bVar.a(viewArr);
        final RecordViewModel recordViewModel = (RecordViewModel) ViewModelProviders.of(this.f66711b.getActivity()).get(RecordViewModel.class);
        final ShortVideoContextViewModel r = this.f66711b.r();
        final ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment2 = shortVideoRecordingOperationPanelFragment;
        final b bVar2 = bVar;
        AnonymousClass1 r0 = new LiveButtonView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66712a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f66712a, false, 74240, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66712a, false, 74240, new Class[0], Void.TYPE);
                    return;
                }
                if (!r.f65401b.b() && !r.f65401b.c()) {
                    recordViewModel.g.setValue(0);
                    if (bVar2.b() != null) {
                        bVar2.b().setVisibility(0);
                        bVar2.b().postDelayed(new cy(this, recordViewModel), 200);
                    }
                }
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f66712a, false, 74239, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66712a, false, 74239, new Class[0], Void.TYPE);
                    return;
                }
                if (!r.f65401b.b() && !r.f65401b.c()) {
                    d dVar = (d) shortVideoRecordingOperationPanelFragment2.Q.b().a("RecordBottomTabScene");
                    if (cw.this.f66711b.isAdded() && !TextUtils.equals((CharSequence) dVar.a(), cw.this.f66711b.getResources().getString(C0906R.string.bx1))) {
                        cw.this.f66711b.d(true);
                    }
                    recordViewModel.g.setValue(0);
                    if (bVar2.b() != null) {
                        bVar2.b().setVisibility(8);
                    }
                }
            }
        };
        bVar.a((LiveButtonView.a) r0);
        if (bVar.c() != null) {
            bVar.c().setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66718a;

                public final void onClick(View view) {
                    v vVar;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f66718a, false, 74242, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f66718a, false, 74242, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (((VideoRecordNewActivity) cw.this.f66711b.getActivity()).m.h() == 0) {
                        vVar = v.a();
                        bVar.c().setSelected(true);
                    } else {
                        vVar = v.b();
                        bVar.c().setSelected(false);
                    }
                    cw.this.f66711b.q().a((Object) cw.this.f66711b, (bc) vVar);
                }
            });
        }
        CameraModule cameraModule = ((VideoRecordNewActivity) this.f66711b.getActivity()).m;
        if (cameraModule.h() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66710a, false, 74237, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66710a, false, 74237, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            a.u.b(z);
        }
        if (bVar.c() != null) {
            if (cameraModule.h() == 0) {
                bVar.c().setSelected(false);
            } else {
                bVar.c().setSelected(true);
            }
        }
        if (bVar.d() != null) {
            bVar.d().setOnClickListener(new cx(this));
        }
    }
}
