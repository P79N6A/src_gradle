package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.h;
import com.ss.android.ugc.aweme.utils.a;
import com.ss.android.ugc.gamora.recorder.RecordCameraViewModel;
import java.lang.reflect.Type;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

public final class t implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70434a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f70435b;

    public t(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f70435b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f70434a, false, 73936, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f70434a, false, 73936, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != h.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70436a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f70436a, false, 73938, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f70436a, false, 73938, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    h hVar = (h) t;
                    VideoRecordNewActivity videoRecordNewActivity = (VideoRecordNewActivity) t.this.f70435b.getActivity();
                    switch (hVar.f74770e) {
                        case 0:
                            float f2 = hVar.f74768c;
                            float f3 = hVar.f74769d;
                            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80597, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                VideoRecordNewActivity videoRecordNewActivity2 = videoRecordNewActivity;
                                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, videoRecordNewActivity2, VideoRecordNewActivity.f4033b, false, 80597, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                                break;
                            } else {
                                if (videoRecordNewActivity.m.a((View) videoRecordNewActivity.x, f2, f3)) {
                                    ((RecordCameraViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(RecordCameraViewModel.class)).f77598a.setValue(new Pair(Integer.valueOf((int) f2), Integer.valueOf((int) f3)));
                                }
                                return;
                            }
                        case 1:
                            hVar.f74771f = videoRecordNewActivity.m.a(hVar.f74767b);
                            break;
                        case 2:
                            t tVar = t.this;
                            if (PatchProxy.isSupport(new Object[]{videoRecordNewActivity}, tVar, t.f70434a, false, 73937, new Class[]{VideoRecordNewActivity.class}, Void.TYPE)) {
                                t tVar2 = tVar;
                                PatchProxy.accessDispatch(new Object[]{videoRecordNewActivity}, tVar2, t.f70434a, false, 73937, new Class[]{VideoRecordNewActivity.class}, Void.TYPE);
                                break;
                            } else {
                                JSONObject i = videoRecordNewActivity.i();
                                try {
                                    i.put("camera_type", videoRecordNewActivity.m.h() ^ 1);
                                } catch (JSONException unused) {
                                }
                                a.f75468b.onEvent(MobClick.obtain().setEventName("camera_double_tap").setLabelName("shoot_page").setJsonObject(i));
                                return;
                            }
                    }
                }
            };
        }
    }
}
