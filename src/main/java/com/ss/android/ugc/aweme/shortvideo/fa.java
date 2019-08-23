package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.al;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class fa implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67658a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f67659b;

    public fa(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67659b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67658a, false, 74528, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67658a, false, 74528, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 == al.class) {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67660a;

                public final void a(Object obj, T t) {
                    float f2;
                    float f3;
                    boolean z;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67660a, false, 74529, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67660a, false, 74529, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) fa.this.f67659b.getActivity();
                    al alVar = (al) t;
                    float f4 = alVar.f74624f + 100.0f;
                    videoRecordNewActivity.m.n = false;
                    if (f4 >= 0.0f) {
                        if (a.b()) {
                            f2 = alVar.g - UIUtils.dip2Px(videoRecordNewActivity, 225.0f);
                            f3 = (f4 - UIUtils.dip2Px(videoRecordNewActivity, 35.0f)) / f2;
                        } else {
                            f2 = alVar.g - UIUtils.dip2Px(videoRecordNewActivity, 210.0f);
                            f3 = (f4 - UIUtils.dip2Px(videoRecordNewActivity, 20.0f)) / f2;
                        }
                        if (((double) f3) > 0.98d) {
                            f3 = 1.0f;
                        }
                        videoRecordNewActivity.m.a(f3, f2);
                        if (PatchProxy.isSupport(new Object[0], alVar, al.f74619a, false, 86985, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], alVar, al.f74619a, false, 86985, new Class[0], Void.TYPE);
                            return;
                        }
                        if ((alVar.f74622d & 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            alVar.f74622d = 0;
                            alVar.g = 0.0f;
                            alVar.f74624f = 0.0f;
                            if (al.f74621c < 20) {
                                alVar.f74623e = al.f74620b;
                                al.f74620b = alVar;
                                al.f74621c++;
                            }
                        }
                    }
                }
            };
        } else {
            return null;
        }
    }
}
