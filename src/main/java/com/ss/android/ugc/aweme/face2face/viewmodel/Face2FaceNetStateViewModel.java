package com.ss.android.ugc.aweme.face2face.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.m;

public class Face2FaceNetStateViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44111a;

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Boolean> f44112b = new MutableLiveData<Boolean>() {
        {
            setValue(Boolean.valueOf(m.a().c()));
        }
    };

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44111a, false, 39282, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44111a, false, 39282, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f44112b.getValue() == null) {
            this.f44112b.setValue(Boolean.valueOf(z));
        } else {
            if (((Boolean) this.f44112b.getValue()).booleanValue() != z) {
                this.f44112b.setValue(Boolean.valueOf(z));
            }
        }
    }
}
