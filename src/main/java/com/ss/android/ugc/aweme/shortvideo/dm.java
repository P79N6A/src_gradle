package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.af;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class dm implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66778a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f66779b;

    public dm(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f66779b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f66778a, false, 74270, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f66778a, false, 74270, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != af.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66780a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f66780a, false, 74271, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f66780a, false, 74271, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) dm.this.f66779b.getActivity();
                    videoRecordNewActivity.m.e();
                    af afVar = (af) t;
                    c a2 = c.a();
                    switch (afVar.f74612d) {
                        case 0:
                            if (afVar.f74610b && TextUtils.equals((CharSequence) afVar.f74611c, videoRecordNewActivity.getResources().getString(C0906R.string.bwu))) {
                                a2.a("enter_from", "click");
                                a2.a("zoom_method", "pinch");
                                break;
                            } else {
                                return;
                            }
                            break;
                        case 1:
                        case 2:
                            if (TextUtils.equals((CharSequence) afVar.f74611c, videoRecordNewActivity.getResources().getString(C0906R.string.bx7))) {
                                a2.a("enter_from", "long_press");
                                a2.a("zoom_method", "pinch");
                                break;
                            }
                            break;
                    }
                    r.onEvent(MobClick.obtain().setEventName("zoom").setLabelName("shoot_page").setJsonObject(a2.b()));
                }
            };
        }
    }
}
