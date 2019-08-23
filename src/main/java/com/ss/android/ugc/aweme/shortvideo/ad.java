package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65455a;

    /* renamed from: b  reason: collision with root package name */
    static final long f65456b = a.L.c(e.a.LongVideoThreshold);

    /* renamed from: c  reason: collision with root package name */
    final com.ss.android.ugc.aweme.ao.a.e f65457c;

    /* renamed from: d  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f65458d;

    /* renamed from: e  reason: collision with root package name */
    RecordToolbarViewModel f65459e;

    public ad(com.ss.android.ugc.aweme.ao.a.e eVar, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65457c = eVar;
        this.f65458d = shortVideoRecordingOperationPanelFragment;
    }

    /* access modifiers changed from: package-private */
    public long a(boolean z, long j) {
        long j2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), new Long(j3)}, this, f65455a, false, 73970, new Class[]{Boolean.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), new Long(j3)}, this, f65455a, false, 73970, new Class[]{Boolean.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        }
        if (z) {
            j2 = f65456b;
        } else {
            j2 = ea.f66827f;
        }
        return Math.min(j2, j3);
    }
}
