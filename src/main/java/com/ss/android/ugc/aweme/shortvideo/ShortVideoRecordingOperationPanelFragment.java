package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.port.internal.b;
import com.ss.android.ugc.aweme.port.internal.c;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ar.text.l;
import com.ss.android.ugc.aweme.shortvideo.ar.text.r;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.j.d;
import com.ss.android.ugc.aweme.shortvideo.s.f;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.an;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bf;
import com.ss.android.ugc.aweme.tools.n;
import com.ss.android.ugc.aweme.tools.v;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.a.a;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import com.ss.android.ugc.gamora.recorder.j;
import org.json.JSONObject;

public class ShortVideoRecordingOperationPanelFragment extends Fragment implements IRecordingOperationPanel, bf {
    public static ChangeQuickRedirect N;
    public View O;
    protected DefaultGesturePresenter P;
    j Q;
    protected cw R;
    b S;
    public boolean T;
    protected l U;
    public r[] V;
    public Effect W;
    public boolean X;
    public f Y;
    public f Z;

    /* renamed from: a  reason: collision with root package name */
    private bd f65417a;

    /* renamed from: b  reason: collision with root package name */
    private ShortVideoContextViewModel f65418b;

    public void a(FragmentActivity fragmentActivity, MediaRecordPresenter mediaRecordPresenter) {
    }

    public void a(boolean z) {
    }

    public void an_() {
    }

    public void b(int i) {
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public void g() {
    }

    public void h() {
    }

    public bd k() {
        return null;
    }

    public boolean o() {
        return false;
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, N, false, 74699, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, N, false, 74699, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, N, false, 74700, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, N, false, 74700, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public RemoteImageView backgroundView() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74695, new Class[0], RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, N, false, 74695, new Class[0], RemoteImageView.class);
        } else if (getView() != null) {
            return (RemoteImageView) getView().findViewById(C0906R.id.cc2);
        } else {
            return null;
        }
    }

    public void closeRecording() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74691, new Class[0], Void.TYPE);
            return;
        }
        q().a((Object) this, (bc) new n());
    }

    public FragmentManager fragmentManager() {
        if (!PatchProxy.isSupport(new Object[0], this, N, false, 74694, new Class[0], FragmentManager.class)) {
            return getFragmentManager();
        }
        return (FragmentManager) PatchProxy.accessDispatch(new Object[0], this, N, false, 74694, new Class[0], FragmentManager.class);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74683, new Class[0], Void.TYPE);
            return;
        }
        FragmentInstrumentation.onPause(this);
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74682, new Class[0], Void.TYPE);
            return;
        }
        FragmentInstrumentation.onResume(this);
        super.onResume();
    }

    public final bd q() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74677, new Class[0], bd.class)) {
            return (bd) PatchProxy.accessDispatch(new Object[0], this, N, false, 74677, new Class[0], bd.class);
        }
        if (this.f65417a == null) {
            this.f65417a = ((bf) getContext()).k();
        }
        return this.f65417a;
    }

    public final com.ss.android.ugc.aweme.shortvideo.l.b s() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74679, new Class[0], com.ss.android.ugc.aweme.shortvideo.l.b.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.l.b) PatchProxy.accessDispatch(new Object[0], this, N, false, 74679, new Class[0], com.ss.android.ugc.aweme.shortvideo.l.b.class);
        } else if (getActivity() instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) getActivity()).m.p;
        } else {
            return null;
        }
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74688, new Class[0], Void.TYPE);
            return;
        }
        if (this.R == null && getActivity() != null) {
            this.R = new cw(this, new View[0]);
        }
    }

    public d videoRecorder() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74692, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, N, false, 74692, new Class[0], d.class);
        } else if (getActivity() instanceof c) {
            return ((c) getActivity()).a();
        } else {
            return null;
        }
    }

    public com.ss.android.ugc.aweme.shortvideo.j.b filterModule() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74693, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.b.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.j.b) PatchProxy.accessDispatch(new Object[0], this, N, false, 74693, new Class[0], com.ss.android.ugc.aweme.shortvideo.j.b.class);
        } else if (!(getActivity() instanceof VideoRecordNewActivity) || !(((VideoRecordNewActivity) getActivity()).l instanceof com.ss.android.ugc.aweme.shortvideo.j.b)) {
            return null;
        } else {
            return (com.ss.android.ugc.aweme.shortvideo.j.b) ((VideoRecordNewActivity) getActivity()).l;
        }
    }

    public int getCameraPos() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74689, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, N, false, 74689, new Class[0], Integer.TYPE)).intValue();
        } else if (Build.VERSION.SDK_INT < 19) {
            return 0;
        } else {
            FragmentActivity activity = getActivity();
            activity.getClass();
            return ((VideoRecordNewActivity) activity).m.h();
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74681, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74686, new Class[0], Void.TYPE);
            return;
        }
        try {
            ((AudioManager) getContext().getSystemService("audio")).requestAudioFocus(null, 3, 2);
        } catch (Throwable unused) {
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74684, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, N, false, 74687, new Class[0], Void.TYPE);
            return;
        }
        try {
            ((AudioManager) getContext().getSystemService("audio")).abandonAudioFocus(null);
        } catch (Throwable unused) {
        }
    }

    public final ShortVideoContextViewModel r() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74678, new Class[0], ShortVideoContextViewModel.class)) {
            return (ShortVideoContextViewModel) PatchProxy.accessDispatch(new Object[0], this, N, false, 74678, new Class[0], ShortVideoContextViewModel.class);
        }
        if (this.f65418b == null) {
            this.f65418b = (ShortVideoContextViewModel) ViewModelProviders.of(getActivity()).get(ShortVideoContextViewModel.class);
        }
        return this.f65418b;
    }

    public JSONObject t() {
        if (PatchProxy.isSupport(new Object[0], this, N, false, 74685, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, N, false, 74685, new Class[0], JSONObject.class);
        } else if (getActivity() instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) getActivity()).i();
        } else {
            return new JSONObject();
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, N, false, 74680, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, N, false, 74680, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, N, false, 74676, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, N, false, 74676, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
    }

    public final void a(am amVar) {
        if (PatchProxy.isSupport(new Object[]{amVar}, this, N, false, 74698, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, N, false, 74698, new Class[]{am.class}, Void.TYPE);
            return;
        }
        an anVar = new an(amVar);
        k().a((Object) this, (bc) anVar);
        q().a((Object) this, (bc) anVar);
    }

    public void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, N, false, 74696, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, N, false, 74696, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.O == null || getActivity() == null)) {
            RecordTitleViewModel recordTitleViewModel = (RecordTitleViewModel) a.a(getActivity()).get(RecordTitleViewModel.class);
            int i = 4;
            if (this.T) {
                this.O.setVisibility(4);
                recordTitleViewModel.e(true);
                return;
            }
            if (z) {
                i = 0;
            }
            this.O.setVisibility(i);
            recordTitleViewModel.e(z);
        }
    }

    public final void h(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, N, false, 74697, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, N, false, 74697, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d(z);
        b(z);
        c(z);
    }

    public void setCameraPos(int i) {
        v vVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, N, false, 74690, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, N, false, 74690, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 1) {
            vVar = v.a();
        } else {
            vVar = v.b();
        }
        q().a((Object) this, (bc) vVar);
    }
}
