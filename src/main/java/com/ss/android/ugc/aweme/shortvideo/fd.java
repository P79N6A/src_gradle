package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.ao;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import java.lang.reflect.Type;
import java.util.Map;

public final class fd implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67667a;

    /* renamed from: b  reason: collision with root package name */
    ShortVideoRecordingOperationPanelFragment f67668b;

    /* renamed from: c  reason: collision with root package name */
    public RecordToolbarViewModel f67669c;

    public fd(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67668b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67667a, false, 74558, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67667a, false, 74558, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ao.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67670a;

                public final void a(Object obj, T t) {
                    String str;
                    String str2;
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f67670a, false, 74559, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f67670a, false, 74559, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ao aoVar = (ao) t;
                    if (fd.this.f67669c == null) {
                        fd.this.f67669c = (RecordToolbarViewModel) ViewModelProviders.of(fd.this.f67668b.getActivity()).get(RecordToolbarViewModel.class);
                    }
                    fh fhVar = fd.this.f67668b.r().f65401b;
                    if (fhVar.c()) {
                        switch (aoVar.f74627a) {
                            case 1:
                                fhVar.G = false;
                                a.c((Context) fd.this.f67668b.getActivity(), (int) C0906R.string.bvq, 1).a();
                                d a2 = d.a().a("content_type", "video").a("creation_id", fhVar.q).a("to_status", "on").a("shoot_way", "react").a("draft_id", fhVar.v).a("enter_from", "video_shoot_page");
                                if (fhVar.K) {
                                    str = "click_draft";
                                } else {
                                    str = "";
                                }
                                r.a("mute_microphone", (Map) a2.a("enter_method", str).f34114b);
                                break;
                            case 2:
                                fhVar.G = true;
                                d a3 = d.a().a("content_type", "video").a("creation_id", fhVar.q).a("to_status", "off").a("shoot_way", "react").a("draft_id", fhVar.v).a("enter_from", "video_shoot_page");
                                if (fhVar.K) {
                                    str2 = "click_draft";
                                } else {
                                    str2 = "";
                                }
                                r.a("mute_microphone", (Map) a3.a("enter_method", str2).f34114b);
                                break;
                        }
                        fd.this.f67669c.j.setValue(aoVar);
                    }
                }
            };
        }
    }
}
