package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0016\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007\u001a\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0017"}, d2 = {"commonParamBuilder", "Lcom/ss/android/ugc/aweme/app/event/EventMapBuilder;", "shortVideoContext", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", "mobChangeRecordMode", "", "index", "", "mobClickSetting", "mobEnterShootPage", "filterIndex", "mobShotClick", "context", "Landroid/content/Context;", "mobStartRecord", "isPhoto", "", "mobStorySceneEffectChange", "statusName", "", "mobSwitchCamera", "cameraPosition", "mobUploadClick", "tools.story-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73933a;

    @NotNull
    public static final d a(@NotNull fh fhVar) {
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2}, null, f73933a, true, 85549, new Class[]{fh.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{fhVar2}, null, f73933a, true, 85549, new Class[]{fh.class}, d.class);
        }
        Intrinsics.checkParameterIsNotNull(fhVar2, "shortVideoContext");
        d a2 = d.a().a("creation_id", fhVar2.q).a("shoot_way", fhVar2.r);
        Intrinsics.checkExpressionValueIsNotNull(a2, "EventMapBuilder.newBuild…ortVideoContext.shootWay)");
        return a2;
    }

    public static final void a(@Nullable Context context, @NotNull fh fhVar) {
        String str;
        Context context2 = context;
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{context2, fhVar2}, null, f73933a, true, 85542, new Class[]{Context.class, fh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, fhVar2}, null, f73933a, true, 85542, new Class[]{Context.class, fh.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fhVar2, "shortVideoContext");
        String str2 = fhVar2.s;
        if (TextUtils.isEmpty(fhVar2.t)) {
            str = "slide";
        } else {
            str = fhVar2.t;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "slide")) {
            String a2 = a.f61121d.a(context2);
            if (a2 != null) {
                str2 = a2;
            }
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a("shoot", a(fhVar).a("enter_method", str).a("enter_from", str2).a("event_type", fhVar2.u).f34114b);
    }

    public static final void a(@NotNull fh fhVar, int i) {
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2, Integer.valueOf(i)}, null, f73933a, true, 85545, new Class[]{fh.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar2, Integer.valueOf(i)}, null, f73933a, true, 85545, new Class[]{fh.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fhVar2, "shortVideoContext");
        Object service = ServiceManager.get().getService(IAVService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
        h filter = ((IAVService) service).getFilterService().getFilter(i);
        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
        d a2 = a(fhVar);
        Intrinsics.checkExpressionValueIsNotNull(filter, "filterBean");
        aVar.a("enter_video_shoot_page", a2.a("filter_list", filter.f47600d).a("filter_id_list", filter.f47598b).a("content_type", fhVar.d().getContentType()).a("content_source", "shoot").f34114b);
    }

    public static final void a(@NotNull fh fhVar, boolean z) {
        String str;
        String str2;
        fh fhVar2 = fhVar;
        if (PatchProxy.isSupport(new Object[]{fhVar2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f73933a, true, 85544, new Class[]{fh.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fhVar2, Byte.valueOf(z)}, null, f73933a, true, 85544, new Class[]{fh.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fhVar2, "shortVideoContext");
        if (z) {
            str = "photo";
        } else {
            str = "video";
        }
        if (z) {
            str2 = "click";
        } else {
            str2 = "press";
        }
        if (fhVar2.N == 6) {
            str2 = "fanfu";
        } else if (fhVar2.N == 7) {
            str2 = "jujiao";
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a("record_video", a(fhVar).a("record_mode", str2).a("enter_from", "video_shoot_page").a("content_type", str).a("content_source", fhVar.d().getContentSource()).a("camera_type", j.a()).a("camera_level", a.L.b(e.a.RecordCameraCompatLevel)).f34114b);
    }
}
