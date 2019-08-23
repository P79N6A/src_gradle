package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurVideoRecordModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.bj;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.tools.ak;
import com.ss.android.ugc.aweme.tools.al;
import com.ss.android.ugc.aweme.tools.aq;
import com.ss.android.ugc.aweme.tools.av;
import com.ss.android.ugc.aweme.tools.aw;
import com.ss.android.ugc.aweme.tools.ax;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.util.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class eq {

    /* renamed from: a  reason: collision with root package name */
    boolean f67586a = a.M.a(a.C0682a.VideoRecordOpt);

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f67587b;

    eq(final VideoRecordNewActivity videoRecordNewActivity, final ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, final RecordLayout recordLayout) {
        this.f67587b = videoRecordNewActivity;
        recordLayout.setRecordListener(new RecordLayout.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67588a;

            public final void ao_() {
            }

            public final boolean ap_() {
                return false;
            }

            public final void e() {
                if (PatchProxy.isSupport(new Object[0], this, f67588a, false, 74499, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67588a, false, 74499, new Class[0], Void.TYPE);
                    return;
                }
                shortVideoRecordingOperationPanelFragment.q().a((Object) recordLayout, (bc) new aq());
            }

            public final void f() {
                if (PatchProxy.isSupport(new Object[0], this, f67588a, false, 74501, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67588a, false, 74501, new Class[0], Void.TYPE);
                    return;
                }
                recordLayout.setCurrentScaleMode(0);
                shortVideoRecordingOperationPanelFragment.k().a((Object) recordLayout, (bc) new ak());
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f67588a, false, 74496, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67588a, false, 74496, new Class[0], Void.TYPE);
                } else if (eq.this.f67586a && videoRecordNewActivity.al) {
                    recordLayout.b();
                } else if (recordLayout.getMode() == 2) {
                    shortVideoRecordingOperationPanelFragment.q().a((Object) this, (bc) new aw());
                } else {
                    shortVideoRecordingOperationPanelFragment.h();
                }
            }

            public final void d() {
                if (PatchProxy.isSupport(new Object[0], this, f67588a, false, 74498, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67588a, false, 74498, new Class[0], Void.TYPE);
                    return;
                }
                if (eq.this.f67586a) {
                    VideoRecordNewActivity videoRecordNewActivity = videoRecordNewActivity;
                    AnonymousClass1 r9 = new VideoRecordNewActivity.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f67593a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f67593a, false, 74503, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f67593a, false, 74503, new Class[0], Void.TYPE);
                                return;
                            }
                            shortVideoRecordingOperationPanelFragment.k().a((Object) recordLayout, (bc) new ax());
                        }
                    };
                    if (PatchProxy.isSupport(new Object[]{r9}, videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80608, new Class[]{VideoRecordNewActivity.a.class}, Void.TYPE)) {
                        VideoRecordNewActivity videoRecordNewActivity2 = videoRecordNewActivity;
                        PatchProxy.accessDispatch(new Object[]{r9}, videoRecordNewActivity2, VideoRecordNewActivity.f4033b, false, 80608, new Class[]{VideoRecordNewActivity.a.class}, Void.TYPE);
                    } else {
                        videoRecordNewActivity.al = true;
                        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(ShortVideoContextViewModel.class);
                        if (!shortVideoContextViewModel.f()) {
                            if (shortVideoContextViewModel.f65401b.c() && videoRecordNewActivity.q != null) {
                                videoRecordNewActivity.q.e();
                            }
                            c.a("set hasStopped to true");
                            shortVideoContextViewModel.d(true);
                            videoRecordNewActivity.K.a(false);
                            videoRecordNewActivity.af.b().a((Function1<? super Integer, Unit>) new bj<Object,Unit>(videoRecordNewActivity, r9));
                        }
                    }
                } else {
                    ax axVar = new ax();
                    shortVideoRecordingOperationPanelFragment.q().a((Object) recordLayout, (bc) axVar);
                    shortVideoRecordingOperationPanelFragment.k().a((Object) recordLayout, (bc) axVar);
                }
            }

            public final void a(int i) {
                int i2;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f67588a, false, 74497, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f67588a, false, 74497, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (PatchProxy.isSupport(new Object[0], this, f67588a, false, 74502, new Class[0], Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67588a, false, 74502, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i2 = ((CurVideoRecordModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(CurVideoRecordModel.class)).f70250a;
                }
                if (i2 != 1) {
                    shortVideoRecordingOperationPanelFragment.q().a((Object) recordLayout, (bc) new av(i));
                }
            }

            public final void a_(float f2) {
                al alVar;
                float f3 = f2;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f67588a, false, 74500, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f67588a, false, 74500, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                recordLayout.setHasBeenMoveScaled(true);
                float y = recordLayout.getY();
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(y)}, null, al.f74619a, true, 86984, new Class[]{Float.TYPE, Float.TYPE}, al.class)) {
                    alVar = (al) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(y)}, null, al.f74619a, true, 86984, new Class[]{Float.TYPE, Float.TYPE}, al.class);
                } else if (al.f74620b != null) {
                    alVar = al.f74620b;
                    al.f74620b = alVar.f74623e;
                    alVar.f74623e = null;
                    alVar.f74622d = 1;
                    al.f74621c--;
                    alVar.f74624f = f3;
                    alVar.g = y;
                } else {
                    alVar = new al(f3, y);
                }
                shortVideoRecordingOperationPanelFragment.k().a((Object) recordLayout, (bc) alVar);
            }
        });
    }
}
