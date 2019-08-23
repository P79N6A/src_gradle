package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.support.v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;

public class MusVideoChooseFragment extends Fragment implements IVideoChoose {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29726a;

    public Fragment fragment() {
        return null;
    }

    public void loadData() {
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29726a, false, 49949, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29726a, false, 49949, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f29726a, false, 49951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29726a, false, 49951, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f29726a, false, 49950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29726a, false, 49950, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29726a, false, 49952, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29726a, false, 49952, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }
}
