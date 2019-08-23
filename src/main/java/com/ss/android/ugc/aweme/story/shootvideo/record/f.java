package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.c;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryDefaultViewImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/gesture/defult/IDefaultView;", "provider", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewProvider;", "presenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewProvider;Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;)V", "cameraFocus", "", "e", "Landroid/view/MotionEvent;", "mobCameraDoubleTap", "onScale", "", "scaleGestureDetector", "Landroid/view/ScaleGestureDetector;", "scaleFactor", "", "onScaleBegin", "onScaleEnd", "scrollToFilterViewPager", "fraction", "switchFilter", "velocity", "switchFrontRearCamera", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73930a;

    /* renamed from: b  reason: collision with root package name */
    private final n f73931b;

    /* renamed from: c  reason: collision with root package name */
    private final a f73932c;

    public final void a(float f2) {
    }

    public final void a(float f2, float f3) {
    }

    public final boolean a(@NotNull ScaleGestureDetector scaleGestureDetector) {
        ScaleGestureDetector scaleGestureDetector2 = scaleGestureDetector;
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector2}, this, f73930a, false, 85533, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector2}, this, f73930a, false, 85533, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(scaleGestureDetector2, "scaleGestureDetector");
        return true;
    }

    public final boolean c() {
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73930a, false, 85531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73930a, false, 85531, new Class[0], Void.TYPE);
            return;
        }
        this.f73931b.y();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73930a, false, 85532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73930a, false, 85532, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = (JSONObject) this.f73931b.G().a();
        try {
            jSONObject.put("camera_type", this.f73932c.n().h() ^ 1);
        } catch (JSONException unused) {
        }
        com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
        MobClick jsonObject = MobClick.obtain().setEventName("camera_double_tap").setLabelName("shoot_page").setJsonObject(jSONObject);
        Intrinsics.checkExpressionValueIsNotNull(jsonObject, "MobClick.obtain()\n      …setJsonObject(jsonObject)");
        aVar.onEvent(jsonObject);
    }

    public final void a(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f73930a, false, 85530, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f73930a, false, 85530, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(motionEvent2, "e");
        if (g.b().h()) {
            a aVar = this.f73932c;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(x), Float.valueOf(y)}, aVar, a.k, false, 85782, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(x), Float.valueOf(y)}, aVar2, a.k, false, 85782, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            CameraModule cameraModule = aVar.v;
            if (cameraModule == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraModule");
            }
            cameraModule.a(aVar.G.p().a(), x, y);
        }
    }

    public final void b(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73930a, false, 85535, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73930a, false, 85535, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f73932c.n().e();
        this.f73931b.n().setCurrentScaleMode(0);
    }

    public final boolean b(@NotNull ScaleGestureDetector scaleGestureDetector) {
        ScaleGestureDetector scaleGestureDetector2 = scaleGestureDetector;
        if (PatchProxy.isSupport(new Object[]{scaleGestureDetector2}, this, f73930a, false, 85534, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{scaleGestureDetector2}, this, f73930a, false, 85534, new Class[]{ScaleGestureDetector.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(scaleGestureDetector2, "scaleGestureDetector");
        if (!g.b().h()) {
            return false;
        }
        return this.f73932c.n().a(scaleGestureDetector2);
    }

    public f(@NotNull n nVar, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "provider");
        Intrinsics.checkParameterIsNotNull(aVar, "presenter");
        this.f73931b = nVar;
        this.f73932c = aVar;
    }
}
