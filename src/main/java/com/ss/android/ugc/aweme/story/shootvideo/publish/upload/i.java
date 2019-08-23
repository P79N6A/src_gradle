package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.OriginFramesUploader;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.eb;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.hn;
import com.ss.android.ugc.aweme.shortvideo.s;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.api.j;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;

public final class i implements s<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73744a;

    /* renamed from: b  reason: collision with root package name */
    private static j f73745b;

    /* renamed from: c  reason: collision with root package name */
    private Object f73746c;

    public i(Object obj) {
        this.f73746c = obj;
        f73745b = j.a();
    }

    public final void a(hn hnVar) {
        hn hnVar2 = hnVar;
        if (PatchProxy.isSupport(new Object[]{hnVar2}, this, f73744a, false, 85479, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar2}, this, f73744a, false, 85479, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        a.z.a((Context) a.f61119b, hnVar.getCause());
        f73745b.f73751e.f71843e = 3;
        f73745b.f73751e.h = hnVar2;
        f73745b.f73751e.i = System.currentTimeMillis();
        f73745b.b();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73744a, false, 85477, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73744a, false, 85477, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!f73745b.c()) {
            j jVar = f73745b;
            String inputVideoFile = ((cb) this.f73746c).getInputVideoFile();
            Object obj = this.f73746c;
            if (PatchProxy.isSupport(new Object[]{inputVideoFile, obj}, jVar, j.f73747a, false, 85484, new Class[]{String.class, Object.class}, Void.TYPE)) {
                j jVar2 = jVar;
                PatchProxy.accessDispatch(new Object[]{inputVideoFile, obj}, jVar2, j.f73747a, false, 85484, new Class[]{String.class, Object.class}, Void.TYPE);
            } else {
                jVar.f73750d.put(inputVideoFile, obj);
            }
            j jVar3 = f73745b.f73751e;
            jVar3.f71840b = 0;
            jVar3.f71841c = null;
            jVar3.f71842d = null;
            jVar3.f71843e = 0;
            jVar3.f71844f = 0;
            jVar3.g = null;
            jVar3.h = null;
            jVar3.i = 0;
            f73745b.f73751e.f71840b = System.currentTimeMillis();
            f73745b.f73751e.f71843e = 1;
            f73745b.f73751e.f71841c = ((cb) this.f73746c).getInputVideoFile();
        } else {
            f73745b.f73751e.f71843e = 2;
            f73745b.f73751e.f71844f = i;
        }
        f73745b.b();
    }

    public final void a(at atVar) {
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f73744a, false, 85478, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f73744a, false, 85478, new Class[]{at.class}, Void.TYPE);
            return;
        }
        CreateStoryResponse createStoryResponse = (CreateStoryResponse) atVar;
        f73745b.f73751e.f71843e = 4;
        f73745b.f73751e.g = createStoryResponse.story;
        f73745b.b();
        j jVar = f73745b;
        if (PatchProxy.isSupport(new Object[0], jVar, j.f73747a, false, 85485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], jVar, j.f73747a, false, 85485, new Class[0], Void.TYPE);
        } else {
            jVar.f73750d.clear();
        }
        a.z.a(((cb) this.f73746c).getOutputFile(), createStoryResponse.story);
        if (PatchProxy.isSupport(new Object[]{createStoryResponse}, this, f73744a, false, 85481, new Class[]{CreateStoryResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{createStoryResponse}, this, f73744a, false, 85481, new Class[]{CreateStoryResponse.class}, Void.TYPE);
        } else if (createStoryResponse.story != null) {
            String storyId = createStoryResponse.story.getStoryId();
            String str = createStoryResponse.materialId;
            new eb().a(a.f61119b, storyId, str, this.f73746c);
            new OriginFramesUploader().a(a.f61119b, this.f73746c, null, storyId, str);
        }
        LifeStory lifeStory = createStoryResponse.story;
        if (PatchProxy.isSupport(new Object[]{lifeStory}, this, f73744a, false, 85482, new Class[]{LifeStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifeStory}, this, f73744a, false, 85482, new Class[]{LifeStory.class}, Void.TYPE);
        } else if (lifeStory != null && lifeStory.getLifeActivityInfo() != null && lifeStory.getLifeActivityInfo().getCardType() > 0) {
            IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
            if (iAVStoryService != null) {
                iAVStoryService.updateStoryActivityRemainTime();
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73744a, false, 85480, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f73744a, false, 85480, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f73745b.f73751e.f71842d = str2;
        f73745b.b();
    }
}
