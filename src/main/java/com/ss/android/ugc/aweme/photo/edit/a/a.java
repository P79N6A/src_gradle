package com.ss.android.ugc.aweme.photo.edit.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.b.c;
import com.ss.android.medialib.b.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.PhotoView;
import com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.n;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Map;
import org.json.JSONObject;

public final class a implements d.a, n.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58523a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.photo.edit.b.a f58524b;

    /* renamed from: c  reason: collision with root package name */
    public PhotoContext f58525c;

    /* renamed from: d  reason: collision with root package name */
    public n f58526d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f58527e;

    public final int b() {
        if (this.f58525c == null) {
            return 720;
        }
        return this.f58525c.mWidth;
    }

    public final int c() {
        if (this.f58525c == null) {
            return 1280;
        }
        return this.f58525c.mHeight;
    }

    public JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f58523a, false, 63640, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f58523a, false, 63640, new Class[0], JSONObject.class);
        }
        String str = "upload";
        if (this.f58525c.mPhotoFrom == 1) {
            str = "direct_shoot";
        }
        return new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a("shoot_way", str).a("position", "mid_page").a();
    }

    public a(com.ss.android.ugc.aweme.photo.edit.b.a aVar) {
        this.f58524b = aVar;
    }

    public final void a(h hVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f58523a, false, 63643, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f58523a, false, 63643, new Class[]{h.class}, Void.TYPE);
            return;
        }
        this.f58527e = false;
        this.f58525c.mFilterName = hVar.f47600d;
        this.f58525c.mFilterId = hVar.f47598b;
        this.f58525c.mFilterIndex = hVar.f47602f;
        this.f58524b.b().a(this.f58525c);
        r.onEvent(MobClick.obtain().setEventName("filter_slide").setLabelName("slide").setJsonObject(a()));
        EffectCategoryResponse b2 = com.ss.android.ugc.aweme.port.in.a.d().b(hVar);
        if (b2 == null) {
            str = "";
        } else {
            str = b2.name;
        }
        r.a("select_filter", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f58525c.creationId).a("shoot_way", this.f58525c.mShootWay).a("draft_id", this.f58525c.draftId).a("enter_method", "slide").a("enter_from", "video_shoot_page").a("filter_name", hVar.f47600d).a("filter_id", hVar.f47598b).a("tab_name", str).f34114b);
    }

    @WorkerThread
    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58523a, false, 63641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58523a, false, 63641, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.b(new b(this));
        g.a(com.ss.android.ugc.aweme.shortvideo.r.b(this.f58525c), com.ss.android.ugc.aweme.shortvideo.r.a(this.f58525c), e.EDIT, e.PUBLISH);
        if (z) {
            Activity activity = (Activity) this.f58524b;
            PhotoContext photoContext = this.f58525c;
            if (PatchProxy.isSupport(new Object[]{activity, photoContext, 1}, null, PhotoPublishActivity.f58634a, true, 63722, new Class[]{Activity.class, PhotoContext.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, photoContext, 1}, null, PhotoPublishActivity.f58634a, true, 63722, new Class[]{Activity.class, PhotoContext.class, Integer.TYPE}, Void.TYPE);
            } else {
                Intent intent = new Intent();
                intent.setClass(activity, PhotoPublishActivity.class);
                intent.putExtra("photo_model", photoContext);
                activity.startActivityForResult(intent, 1);
            }
        } else {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58528a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f58528a, false, 63646, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58528a, false, 63646, new Class[0], Void.TYPE);
                        return;
                    }
                    if (a.this.f58524b != null) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) (Activity) a.this.f58524b, (int) C0906R.string.b0u, 0).a();
                    }
                }
            });
        }
    }

    public final void a(PhotoContext photoContext, int i) {
        if (PatchProxy.isSupport(new Object[]{photoContext, Integer.valueOf(i)}, this, f58523a, false, 63644, new Class[]{PhotoContext.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext, Integer.valueOf(i)}, this, f58523a, false, 63644, new Class[]{PhotoContext.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58525c = photoContext;
        h a2 = w.a(this.f58525c.mFilterIndex);
        this.f58526d.a(a2, false);
        this.f58525c.mFilterId = a2.f47598b;
        this.f58525c.mFilterName = a2.f47600d;
        this.f58525c.defaultSelectStickerPoi = photoContext.defaultSelectStickerPoi;
        if (this.f58527e && i == 1) {
            this.f58527e = false;
        }
        if (!this.f58527e) {
            this.f58524b.b().a(photoContext);
        }
    }

    public final void a(h hVar, h hVar2, float f2) {
        h hVar3 = hVar;
        h hVar4 = hVar2;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, f58523a, false, 63642, new Class[]{h.class, h.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, f58523a, false, 63642, new Class[]{h.class, h.class, Float.TYPE}, Void.TYPE);
            return;
        }
        PhotoView b2 = this.f58524b.b();
        String str = hVar3.j;
        String str2 = hVar4.j;
        if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, b2, d.m, false, 17434, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PhotoView photoView = b2;
            PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, photoView, d.m, false, 17434, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        c cVar = b2.n;
        Object[] objArr = {str, str2, Float.valueOf(f2)};
        if (PatchProxy.isSupport(objArr, cVar, c.f29385a, false, 17417, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, cVar, c.f29385a, false, 17417, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
        } else {
            if (cVar.f29386b.a()) {
                cVar.f29386b.a(str, str2, f3, cVar.f29390f.f29392b);
            }
            cVar.f29390f.f29391a = str;
            cVar.f29390f.f29393c = str2;
            cVar.f29390f.f29394d = f3;
        }
        b2.a();
    }
}
