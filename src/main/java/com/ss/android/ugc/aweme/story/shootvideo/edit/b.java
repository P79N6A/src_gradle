package com.ss.android.ugc.aweme.story.shootvideo.edit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view.StoryBrushLayout;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view.StoryBrushView;
import com.ss.android.ugc.aweme.story.shootvideo.edit.StoryEditLayout;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;

public final /* synthetic */ class b implements StoryEditLayout.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73471a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73472b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoStoryEditPublishActivity f73473c;

    public b(a aVar, VideoStoryEditPublishActivity videoStoryEditPublishActivity) {
        this.f73472b = aVar;
        this.f73473c = videoStoryEditPublishActivity;
    }

    public final void a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73471a, false, 85240, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73471a, false, 85240, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a aVar = this.f73472b;
        VideoStoryEditPublishActivity videoStoryEditPublishActivity = this.f73473c;
        if (i2 == 1) {
            aVar.b();
            aVar.a("click_button");
        } else if (i2 == 3) {
            if (aVar.m != null) {
                if (aVar.m.a()) {
                    aVar.m.dismiss();
                } else {
                    a aVar2 = aVar.m;
                    p g = aVar.g();
                    if (PatchProxy.isSupport(new Object[]{videoStoryEditPublishActivity, g}, aVar2, a.f73402b, false, 85168, new Class[]{Context.class, p.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{videoStoryEditPublishActivity, g}, aVar2, a.f73402b, false, 85168, new Class[]{Context.class, p.class}, Void.TYPE);
                    } else if (aVar2.f73405e == null) {
                        aVar2.f73405e = g;
                        if (aVar2.f73403c.getBrushView() != null) {
                            View brushView = aVar2.f73403c.getBrushView();
                            aj d2 = aVar2.f73405e.d();
                            ((StoryBrushView) brushView).setStatusBarHeightDelta(false);
                            if (fc.a()) {
                                fb.a(brushView, (Context) videoStoryEditPublishActivity, d2.f77890a, d2.f77891b);
                            } else if (!aVar2.m) {
                                fb.a(brushView, d2.f77890a, d2.f77891b);
                            } else if (Math.abs(fc.a(aVar2.f73403c.getContext()) - d2.f77891b) < 5 || d2.f77891b > fc.a(aVar2.f73403c.getContext())) {
                                fb.a(brushView, d2.f77890a, d2.f77891b);
                            } else {
                                fb.c(brushView, d2.f77890a, d2.f77891b);
                            }
                            ViewGroup.LayoutParams layoutParams = brushView.getLayoutParams();
                            aVar2.f73406f = layoutParams.width;
                            aVar2.g = layoutParams.height;
                        }
                    }
                    a aVar3 = aVar.m;
                    if (PatchProxy.isSupport(new Object[0], aVar3, a.f73402b, false, 85165, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar3, a.f73402b, false, 85165, new Class[0], Void.TYPE);
                    } else {
                        StoryBrushLayout storyBrushLayout = aVar3.f73403c;
                        int i3 = aVar3.h;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, storyBrushLayout, StoryBrushLayout.f73409a, false, 85184, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, storyBrushLayout, StoryBrushLayout.f73409a, false, 85184, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else {
                            if (PatchProxy.isSupport(new Object[0], storyBrushLayout, StoryBrushLayout.f73409a, false, 85182, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], storyBrushLayout, StoryBrushLayout.f73409a, false, 85182, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.story.shootvideo.a.a(storyBrushLayout);
                            }
                            storyBrushLayout.f73412d = false;
                            if (storyBrushLayout.f73413e != null) {
                                storyBrushLayout.f73413e.a();
                            }
                            storyBrushLayout.f73410b.a(false, -1);
                            storyBrushLayout.f73410b.setSelectColorView(i3);
                        }
                        if (aVar3.f73405e != null) {
                            aVar3.f73405e.n.begin2DBrush();
                            aVar3.f73405e.h(aVar3.h);
                            aVar3.f73405e.a(aVar3.i / 720.0f);
                            if (aVar3.f73405e.w() == 0) {
                                aVar3.f73403c.getCancelView().setVisibility(8);
                            } else {
                                aVar3.f73403c.getCancelView().setVisibility(0);
                            }
                        }
                    }
                }
            }
            aVar.b("edit_brush");
        } else {
            if (i2 == 4) {
                if (aVar.f73438c != null) {
                    aVar.f73438c.a();
                    aVar.a(false, false);
                    aVar.b("click_modify_entrance");
                }
            } else if (i2 == 2) {
                if (aVar.g != null) {
                    aVar.g.a();
                }
            } else if (i2 == 5) {
                ((VideoStoryEditPublishActivity) aVar.i).e();
            } else if (i2 == 6) {
                float f2 = 0.5f;
                if (aVar.g() != null) {
                    aVar.g().a(0, 0, aVar.f73437b.f73433d ? 0.0f : 0.5f);
                }
                cb cbVar = aVar.f73440e;
                if (aVar.f73437b.f73433d) {
                    f2 = 0.0f;
                }
                cbVar.voiceVolume = f2;
                aVar.f73440e.musicVolume = aVar.f73440e.voiceVolume;
                com.ss.android.ugc.aweme.utils.a.f75468b.a("mute_microphone", aVar.h().a("to_status", aVar.f73437b.f73433d ? "on" : "off").a("enter_from", "edit_post_page").f34114b);
            }
        }
    }
}
