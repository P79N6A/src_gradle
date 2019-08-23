package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.support.v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;

public class MvItemFragmentAdapter extends Fragment implements a {
    public static ChangeQuickRedirect i;

    public final void a(float f2) {
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
    }

    public void a(b bVar) {
    }

    public void a(e eVar) {
    }

    public final void a(String str) {
    }

    public final void b(e eVar) {
    }

    public void b(String str) {
    }

    public final void b(boolean z) {
    }

    public final void c(String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(String str) {
    }

    public final void e(String str) {
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 78147, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 78147, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 78149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 78149, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, i, false, 78148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, i, false, 78148, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, i, false, 78150, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, i, false, 78150, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }
}
