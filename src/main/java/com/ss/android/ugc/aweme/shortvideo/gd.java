package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.i.k;
import com.ss.android.ugc.aweme.shortvideo.record.a.b;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.av;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import dmt.av.video.b.a.c;
import java.lang.reflect.Type;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class gd implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67886a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoRecordNewActivity f67887b;

    /* renamed from: c  reason: collision with root package name */
    public final c f67888c;

    /* renamed from: d  reason: collision with root package name */
    public final fh f67889d;

    public gd(VideoRecordNewActivity videoRecordNewActivity, c cVar) {
        this.f67887b = videoRecordNewActivity;
        this.f67888c = cVar;
        this.f67889d = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(ShortVideoContextViewModel.class)).f65401b;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f67886a, false, 74722, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f67886a, false, 74722, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type != av.class) {
            return null;
        } else {
            final bg a2 = bdVar.a((bh) this, type);
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67890a;

                public final void a(Object obj, T t) {
                    String str;
                    String str2;
                    String str3;
                    k kVar;
                    String str4;
                    long j;
                    Object obj2 = obj;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{obj2, t2}, this, f67890a, false, 74723, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2, t2}, this, f67890a, false, 74723, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (a2 != null) {
                        a2.a(obj2, t2);
                    }
                    if (gd.this.f67887b.f4034c.n < gd.this.f67887b.f4034c.f67720c) {
                        av avVar = (av) t2;
                        JSONObject i = gd.this.f67887b.i();
                        long j2 = 0;
                        try {
                            if (gd.this.f67887b.k.g != null) {
                                j = gd.this.f67887b.k.g.getStickerId();
                            } else {
                                j = 0;
                            }
                            i.put("prop_id", j);
                        } catch (JSONException unused) {
                        }
                        a.a(gd.this.f67887b, "record", "shoot_page", 0, 0, i);
                        boolean z = !com.ss.android.g.a.b();
                        d a2 = d.a().a("creation_id", gd.this.f67889d.q).a("enter_from", "video_shoot_page").a("content_type", gd.this.f67889d.d().getContentType()).a("content_source", gd.this.f67889d.d().getContentSource()).a("shoot_way", gd.this.f67889d.r).a("draft_id", gd.this.f67889d.v);
                        if (gd.this.f67887b.m.h() == 1) {
                            str = "front";
                        } else {
                            str = "back";
                        }
                        d a3 = a2.a("camera", str).a("speed", (Object) am.fromValue((float) gd.this.f67887b.f4035d)).a("filter_name", ((e) gd.this.f67887b.l.c()).e().f47600d).a("filter_id", ((e) gd.this.f67887b.l.c()).e().f47598b);
                        switch (gd.this.f67889d.N) {
                            case 0:
                                str2 = "click";
                                break;
                            case 1:
                                str2 = "press";
                                break;
                            case 8:
                                str2 = "video";
                                break;
                            case 10:
                                str2 = "video_15";
                                break;
                            case 11:
                                str2 = "video_60";
                                break;
                            default:
                                str2 = "";
                                break;
                        }
                        d a4 = a3.a("record_mode", str2);
                        switch (avVar.f74635b) {
                            case 1:
                                str3 = "click";
                                break;
                            case 2:
                                str3 = "press";
                                break;
                            default:
                                str3 = "";
                                break;
                        }
                        d a5 = a4.a("record_type", str3);
                        if (gd.this.f67887b.k.g != null) {
                            j2 = gd.this.f67887b.k.g.getStickerId();
                        }
                        d a6 = a5.a("prop_id", j2);
                        if (gd.this.f67887b.q != null) {
                            b bVar = gd.this.f67887b.q;
                            if (PatchProxy.isSupport(new Object[0], bVar, b.f69060a, false, 78409, new Class[0], k.class)) {
                                kVar = (k) PatchProxy.accessDispatch(new Object[0], bVar, b.f69060a, false, 78409, new Class[0], k.class);
                            } else {
                                bVar.k = bVar.f69062c.a();
                                kVar = new k(bVar.u.convertWidthToDp(bVar.p), bVar.u.convertHeightToDp(bVar.q), (float) (Math.toDegrees((double) bVar.k) % 360.0d), bVar.u.mIsCircle ? 1 : 0);
                            }
                            gd.this.f67889d.E.addReactionWindowInfo(kVar);
                            d a7 = a6.a("height", kVar.height).a("width", kVar.width).a("angle", kVar.angle);
                            if (kVar.type == 1) {
                                str4 = "round";
                            } else {
                                str4 = "square";
                            }
                            a7.a("window_type", str4);
                        }
                        if (z) {
                            a6.a("smooth", ((e) gd.this.f67887b.l.c()).k()).a("shape", ((e) gd.this.f67887b.l.c()).i()).a("eyes", ((e) gd.this.f67887b.l.c()).j()).a("tanning", ((e) gd.this.f67887b.l.c()).d());
                        } else {
                            a6.a("smooth", (int) (f.a(((e) gd.this.f67887b.l.c()).k()) * 100.0f)).a("eyes", (int) (f.b(((e) gd.this.f67887b.l.c()).i()) * 100.0f));
                        }
                        a6.a("camera_type", j.a(gd.this.f67888c.e()));
                        a6.a("camera_level", com.ss.android.ugc.aweme.port.in.a.L.b(e.a.RecordCameraCompatLevel));
                        r.a("record_video", (Map) a6.f34114b);
                    }
                }
            };
        }
    }
}
