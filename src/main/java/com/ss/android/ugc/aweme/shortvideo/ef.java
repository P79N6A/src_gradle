package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.g;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class ef implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67509a;

    /* renamed from: b  reason: collision with root package name */
    public final ShortVideoRecordingOperationPanelFragment f67510b;

    /* renamed from: c  reason: collision with root package name */
    public final VideoRecordNewActivity f67511c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f67512d = (!a.b());

    public ef(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f67510b = shortVideoRecordingOperationPanelFragment;
        this.f67511c = (VideoRecordNewActivity) shortVideoRecordingOperationPanelFragment.getActivity();
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f67509a, false, 74399, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f67509a, false, 74399, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type != g.class) {
            return null;
        } else {
            final bg a2 = bdVar.a((bh) this, type);
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67513a;

                public final void a(Object obj, T t) {
                    Object obj2 = obj;
                    T t2 = t;
                    if (PatchProxy.isSupport(new Object[]{obj2, t2}, this, f67513a, false, 74400, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj2, t2}, this, f67513a, false, 74400, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    if (a2 != null) {
                        a2.a(obj2, t2);
                    }
                    String str = "";
                    g gVar = (g) t2;
                    if (TextUtils.equals((CharSequence) gVar.f74762c, ef.this.f67510b.getResources().getString(C0906R.string.bx9))) {
                        str = "photo";
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ef.this.f67510b.getResources().getString(C0906R.string.bx7))) {
                        str = "press";
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ef.this.f67510b.getResources().getString(C0906R.string.bwu))) {
                        str = "click";
                    } else if (aj.f65581d.a((String) gVar.f74762c)) {
                        aj ajVar = aj.f65581d;
                        String str2 = (String) gVar.f74762c;
                        if (PatchProxy.isSupport(new Object[]{str2}, ajVar, aj.f65578a, false, 73988, new Class[]{String.class}, String.class)) {
                            aj ajVar2 = ajVar;
                            str = (String) PatchProxy.accessDispatch(new Object[]{str2}, ajVar2, aj.f65578a, false, 73988, new Class[]{String.class}, String.class);
                        } else {
                            Intrinsics.checkParameterIsNotNull(str2, "tag");
                            if (Intrinsics.areEqual((Object) str2, (Object) aj.f65579b)) {
                                str = "video_15";
                            } else if (Intrinsics.areEqual((Object) str2, (Object) aj.f65580c)) {
                                str = "video_60";
                            } else {
                                str = "video";
                            }
                        }
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ef.this.f67510b.getResources().getString(C0906R.string.bx3))) {
                        str = "live";
                    } else if (TextUtils.equals((CharSequence) gVar.f74762c, ef.this.f67510b.getResources().getString(C0906R.string.bx5))) {
                        str = "mv";
                    }
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) ef.this.f67511c).get(ShortVideoContextViewModel.class)).f65401b;
                    r.a("change_record_mode", (Map) d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).a("to_status", str).f34114b);
                }
            };
        }
    }
}
