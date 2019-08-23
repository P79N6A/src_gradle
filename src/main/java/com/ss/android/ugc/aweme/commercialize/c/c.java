package com.ss.android.ugc.aweme.commercialize.c;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.a;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class c implements ControllerListener<ImageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38528a;

    /* renamed from: b  reason: collision with root package name */
    private Aweme f38529b;

    public final void onFailure(String str, Throwable th) {
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final void onSubmit(String str, Object obj) {
    }

    public c(Aweme aweme) {
        this.f38529b = aweme;
    }

    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        ImageInfo imageInfo = (ImageInfo) obj;
        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f38528a, false, 30967, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f38528a, false, 30967, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            return;
        }
        if (imageInfo != null) {
            if (imageInfo.getHeight() == 960 && imageInfo.getWidth() == 540) {
                a.a(this.f38529b, 3, 0);
            } else {
                a.a(this.f38529b, 3, 1);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("alarm_reason", "size_alarm");
                    if (this.f38529b != null) {
                        jSONObject.put("group_id", this.f38529b.getAid());
                    }
                } catch (Exception unused) {
                }
                r.onEvent(MobClick.obtain().setEventName("ad_alarm").setLabelName("homepage_hot").setJsonObject(jSONObject));
            }
        }
    }
}
