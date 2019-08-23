package com.ss.android.ugc.aweme.story.shootvideo;

import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.cc;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.edit.m;
import com.ss.android.ugc.aweme.shortvideo.edit.o;
import com.ss.android.ugc.aweme.shortvideo.edit.x;
import com.ss.android.ugc.aweme.shortvideo.edit.y;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.gi;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.n;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view.StoryBrushLayout;
import com.ss.android.ugc.aweme.story.shootvideo.brushsticker.view.StoryBrushView;
import com.ss.android.ugc.aweme.story.shootvideo.edit.StoryEditLayout;
import com.ss.android.ugc.aweme.story.shootvideo.edit.a;
import com.ss.android.ugc.aweme.story.shootvideo.edit.c;
import com.ss.android.ugc.aweme.story.shootvideo.edit.r;
import com.ss.android.ugc.aweme.story.shootvideo.friends.a;
import com.ss.android.ugc.aweme.story.shootvideo.friends.view.PublishKnowFriendsLayout;
import com.ss.android.ugc.aweme.story.shootvideo.publish.f;
import com.ss.android.ugc.aweme.story.shootvideo.publish.view.PublishBottomLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.h;
import com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;
import dmt.av.video.VEVideoPublishEditFragment;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.s;
import dmt.av.video.t;
import dmt.av.video.u;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class VideoStoryEditPublishActivity extends AmeActivity implements e, g, com.ss.android.ugc.aweme.shortvideo.ui.g {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f73384b;

    /* renamed from: c  reason: collision with root package name */
    public VEVideoPublishEditViewModel f73385c;

    /* renamed from: d  reason: collision with root package name */
    public cb f73386d;

    /* renamed from: e  reason: collision with root package name */
    public a f73387e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f73388f;
    private boolean g;
    private boolean h = true;
    private RelativeLayout i;
    private PublishBottomLayout j;
    private LinearLayout k;
    private RelativeLayout l;

    public final void a(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
    }

    public final void a(@NonNull b bVar) {
    }

    public final void b(@NonNull com.ss.android.ugc.aweme.base.activity.a aVar) {
    }

    /* access modifiers changed from: package-private */
    public final VideoStoryEditPublishActivity d() {
        return this;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73384b, false, 85148, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73384b, false, 85148, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final boolean O() {
        return this.g;
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [dmt.av.video.u, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    public void onCreate(Bundle bundle) {
        ? r15;
        u uVar;
        cb cbVar;
        cb cbVar2;
        cb cbVar3;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f73384b, false, 85125, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f73384b, false, 85125, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity", "onCreate", true);
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.story.d.b.f72347a, true, 86512, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.story.d.b.f72347a, true, 86512, new Class[]{Activity.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            try {
                Method declaredMethod = Activity.class.getDeclaredMethod("convertFromTranslucent", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this, new Object[0]);
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.framework.a.a.a(th);
            }
        }
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.cz, 0);
        setContentView((int) C0906R.layout.eq);
        if (!fc.a()) {
            v.b((Activity) this);
        } else {
            if (ToolUtils.isFlyme()) {
                StatusBarUtils.setTranslucent(this);
            } else {
                StatusBarUtils.setTransparent(this);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85127, new Class[0], Void.TYPE);
        } else {
            this.f73388f = (ViewGroup) findViewById(C0906R.id.cga);
            this.j = (PublishBottomLayout) findViewById(C0906R.id.c8g);
            this.k = (LinearLayout) findViewById(C0906R.id.b_s);
            this.k.setOnClickListener(new i(this));
        }
        e(true);
        this.f73387e = new a();
        a aVar = this.f73387e;
        ViewGroup viewGroup = this.f73388f;
        if (PatchProxy.isSupport(new Object[]{this, this, viewGroup}, aVar, a.f73436a, false, 85193, new Class[]{VideoStoryEditPublishActivity.class, e.class, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, this, viewGroup}, aVar, a.f73436a, false, 85193, new Class[]{VideoStoryEditPublishActivity.class, e.class, ViewGroup.class}, Void.TYPE);
            r15 = 0;
        } else {
            aVar.i = this;
            aVar.E = this;
            aVar.j = viewGroup;
            aVar.f73439d = (VEVideoPublishEditViewModel) ViewModelProviders.of((FragmentActivity) this).get(VEVideoPublishEditViewModel.class);
            int intExtra = getIntent().getIntExtra("story_mediaType", -1);
            if (intExtra != -1) {
                AVETParameter aVETParameter = (AVETParameter) getIntent().getSerializableExtra("av_et_parameter");
                if (aVETParameter != null && "upload".equals(aVETParameter.getContentSource())) {
                    aVar.w = true;
                }
                aVar.B = intExtra;
                Intent intent = getIntent();
                r15 = 0;
                if (PatchProxy.isSupport(new Object[]{intent}, aVar, a.f73436a, false, 85214, new Class[]{Intent.class}, cb.class)) {
                    cbVar = (cb) PatchProxy.accessDispatch(new Object[]{intent}, aVar, a.f73436a, false, 85214, new Class[]{Intent.class}, cb.class);
                } else {
                    if (aVar.B == 0) {
                        if (PatchProxy.isSupport(new Object[]{intent}, null, l.f73632a, true, 85161, new Class[]{Intent.class}, cb.class)) {
                            cbVar3 = (cb) PatchProxy.accessDispatch(new Object[]{intent}, null, l.f73632a, true, 85161, new Class[]{Intent.class}, cb.class);
                        } else {
                            if (PatchProxy.isSupport(new Object[]{intent}, null, l.f73632a, true, 85162, new Class[]{Intent.class}, cb.class)) {
                                cbVar3 = (cb) PatchProxy.accessDispatch(new Object[]{intent}, null, l.f73632a, true, 85162, new Class[]{Intent.class}, cb.class);
                            } else {
                                cbVar3 = new cb();
                                cbVar3.mWorkspace = (d) intent.getParcelableExtra("workspace");
                                cbVar3.storyFestivalModel = (StoryFestivalModel) intent.getParcelableExtra("story_festival_model");
                                if (cbVar3.mWorkspace == null) {
                                    cbVar3.mWorkspace = d.a();
                                }
                                cbVar3.mOutputFile = cbVar3.mWorkspace.j().getPath();
                                PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photo_model");
                                cbVar3.mShootWay = photoContext.mShootWay;
                                cbVar3.mPath = photoContext.mPhotoLocalPath;
                                cbVar3.mVideoWidth = photoContext.mWidth;
                                cbVar3.mVideoHeight = photoContext.mHeight;
                                cbVar3.challenges = photoContext.challenges;
                                cbVar3.mStickerID = photoContext.mStickers;
                                cbVar3.setAvetParameter(photoContext.getAvetParameter());
                                cbVar3.videoType = 9;
                                cbVar3.md5 = photoContext.md5;
                                cbVar3.enterFrom = intent.getStringExtra("enter_from");
                                cbVar3.creationId = intent.getStringExtra("creation_id");
                                cbVar3.sendToUserHead = (UrlModel) intent.getSerializableExtra("send_to_user_head");
                            }
                            cbVar3.musicVolume = intent.getFloatExtra("music_volume", 0.5f);
                            cbVar3.voiceVolume = cbVar3.isMuted ? 0.0f : intent.getFloatExtra("voice_volume", 0.5f);
                        }
                        aVar.f73440e = cbVar3;
                    } else {
                        if (PatchProxy.isSupport(new Object[]{intent}, null, l.f73632a, true, 85160, new Class[]{Intent.class}, cb.class)) {
                            cbVar2 = (cb) PatchProxy.accessDispatch(new Object[]{intent}, null, l.f73632a, true, 85160, new Class[]{Intent.class}, cb.class);
                        } else {
                            cbVar2 = new cc("VideoStoryPublishEditModelBridge").a(intent);
                            cbVar2.videoType = 7;
                            cbVar2.storyBoomModel = (gi) intent.getParcelableExtra("story_boom_model");
                        }
                        aVar.f73440e = cbVar2;
                    }
                    aVar.f73440e.setNewVersion(3);
                    aVar.f73439d.a(w.a(aVar.f73440e.getFilterIndex()));
                    cbVar = aVar.f73440e;
                }
                aVar.f73440e = cbVar;
                if (aVar.f73440e != null) {
                    aVar.f73440e.mOrigin = aVar.i() ^ true ? 1 : 0;
                }
                if (aVar.f73440e.previewConfigure != null) {
                    aVar.D = new x(aVar.f73440e);
                } else {
                    aVar.D = new y(aVar.f73440e);
                }
                if (PatchProxy.isSupport(new Object[0], aVar, a.f73436a, false, 85195, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f73436a, false, 85195, new Class[0], Void.TYPE);
                } else if (aVar.f73440e != null && aVar.f73440e.isStoryBoomMode()) {
                    aVar.f73440e.mMusicPath = null;
                }
                aVar.p = new f();
                aVar.p.f73714b = aVar.f73440e;
                aVar.p.f73715c = this;
                aVar.f73437b = (StoryEditLayout) aVar.i.findViewById(C0906R.id.a8n);
                StoryEditLayout storyEditLayout = aVar.f73437b;
                boolean z = !aVar.a();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, storyEditLayout, StoryEditLayout.f73430a, false, 85292, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, storyEditLayout, StoryEditLayout.f73430a, false, 85292, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    storyEditLayout.f73432c.setVisibility(z ? 0 : 8);
                }
                aVar.q = (FrameLayout) aVar.i.findViewById(C0906R.id.b8g);
                aVar.t = (StoryStickerGestureLayout) aVar.i.findViewById(C0906R.id.cvh);
                aVar.s = findViewById(C0906R.id.ao6);
                aVar.f73437b.setEditMenuListener(new com.ss.android.ugc.aweme.story.shootvideo.edit.b(aVar, this));
                aVar.s.setOnClickListener(new c(aVar));
                aVar.f73441f = new com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a(aVar.j, aVar.i, aVar.i, (h) aVar.f73439d.k().getValue());
                aVar.f73441f.a(1);
                aVar.f73441f.f74293d = aVar;
                aVar.t.setGestureModule(aVar.f73441f);
                aVar.t.b(new com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73442a;

                    public final boolean a(MotionEvent motionEvent) {
                        boolean z = false;
                        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f73442a, false, 85256, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f73442a, false, 85256, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                        }
                        if (System.currentTimeMillis() - a.this.z > 500) {
                            if (a.this.u) {
                                if (a.this.l != null) {
                                    z = a.this.l.c();
                                }
                                if (!z) {
                                    a.this.b();
                                    a.this.a("click_screen");
                                }
                                return true;
                            }
                            a.this.z = System.currentTimeMillis();
                        }
                        return false;
                    }
                });
                if (PatchProxy.isSupport(new Object[0], aVar, a.f73436a, false, 85213, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f73436a, false, 85213, new Class[0], Void.TYPE);
                } else {
                    h hVar = (h) aVar.f73439d.k().getValue();
                    if (com.ss.android.g.a.b()) {
                        aVar.f73438c = new m(aVar.i, hVar, aVar.f73440e);
                    } else {
                        k kVar = new k(aVar.i, aVar.E, aVar.q, hVar, aVar.f73440e);
                        aVar.f73438c = kVar;
                        ((k) aVar.f73438c).f67451e = true;
                    }
                    aVar.f73438c.a(true);
                    aVar.f73438c.b(true);
                    if (hVar != null) {
                        aVar.f73440e.mCurFilterIds = hVar.f47598b;
                        aVar.f73440e.mCurFilterLabels = hVar.f47599c;
                    }
                    aVar.f73438c.a((o.a) new o.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73452a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f73452a, false, 85286, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73452a, false, 85286, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(true, false);
                        }

                        public final void a(h hVar) {
                            if (PatchProxy.isSupport(new Object[]{hVar}, this, f73452a, false, 85285, new Class[]{h.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{hVar}, this, f73452a, false, 85285, new Class[]{h.class}, Void.TYPE);
                                return;
                            }
                            a.this.f73441f.a(hVar);
                            a.this.f73439d.a(hVar);
                            a.this.f73440e.mSelectedId = hVar.f47602f;
                            a.this.f73440e.mCurFilterLabels = hVar.f47600d;
                            a.this.f73440e.mCurFilterIds = String.valueOf(hVar.f47598b);
                        }
                    });
                }
                aVar.c();
                if (PatchProxy.isSupport(new Object[0], aVar, a.f73436a, false, 85201, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f73436a, false, 85201, new Class[0], Void.TYPE);
                } else {
                    aVar.m = new com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a();
                    com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a aVar2 = aVar.m;
                    ViewGroup viewGroup2 = aVar.j;
                    if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a.f73402b, false, 85163, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a.f73402b, false, 85163, new Class[]{View.class}, Void.TYPE);
                    } else {
                        aVar2.f73403c = (StoryBrushLayout) viewGroup2.findViewById(C0906R.id.nb);
                        aVar2.f73403c.setStoryBrushListener(new a.C0762a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f73407a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f73407a, false, 85174, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f73407a, false, 85174, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (a.this.f73405e != null) {
                                    int undo2DBrush = a.this.f73405e.n.undo2DBrush();
                                    if (a.this.f73403c.getCancelView().getVisibility() == 0 && undo2DBrush == 0) {
                                        a.this.f73403c.getCancelView().setVisibility(8);
                                    }
                                }
                            }

                            public final void a(float f2) {
                                int i = 0;
                                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73407a, false, 85176, new Class[]{Float.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73407a, false, 85176, new Class[]{Float.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (a.this.f73405e != null) {
                                    a.this.f73405e.a(f2 / 720.0f);
                                    a.this.i = f2;
                                }
                                int i2 = (int) f2;
                                if (i2 != 8) {
                                    if (i2 == 16) {
                                        i = 1;
                                    } else if (i2 == 32) {
                                        i = 2;
                                    }
                                }
                                com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                                com.ss.android.ugc.aweme.app.d.d a2 = r.a(a.this.j, a.this.k, a.this.l, a.this.m, true);
                                aVar.a("select_brush_style", a2.a("brush_style", i).f34114b);
                            }

                            public final void a(int i) {
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73407a, false, 85177, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73407a, false, 85177, new Class[]{Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (a.this.f73405e != null) {
                                    a.this.f73405e.h(i);
                                    a.this.h = i;
                                }
                                com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                                com.ss.android.ugc.aweme.app.d.d a2 = r.a(a.this.j, a.this.k, a.this.l, a.this.m, true);
                                aVar.a("select_brush_color", a2.a("color", Integer.toHexString(i)).f34114b);
                            }

                            public final void b(float f2, float f3) {
                                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f73407a, false, 85180, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f73407a, false, 85180, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (a.this.f73405e != null) {
                                    p pVar = a.this.f73405e;
                                    float f4 = f2 / ((float) a.this.f73406f);
                                    float f5 = f3 / ((float) a.this.g);
                                    com.ss.android.vesdk.u uVar = com.ss.android.vesdk.u.Pan;
                                    if (!(pVar.l == 0 || pVar.m == 0)) {
                                        pVar.n.processTouchUpEvent(f4, f5, uVar);
                                    }
                                    if (a.this.f73403c.getCancelView().getVisibility() == 8) {
                                        a.this.f73403c.getCancelView().setVisibility(0);
                                    }
                                }
                            }

                            public final void a(float f2, float f3) {
                                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f73407a, false, 85179, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f73407a, false, 85179, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (a.this.f73405e != null) {
                                    p pVar = a.this.f73405e;
                                    com.ss.android.vesdk.u uVar = com.ss.android.vesdk.u.Pan;
                                    pVar.n.processTouchDownEvent(f2 / ((float) a.this.f73406f), f3 / ((float) a.this.g), uVar);
                                }
                            }

                            public final void a(float f2, float f3, float f4, float f5) {
                                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f73407a, false, 85178, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f73407a, false, 85178, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (a.this.f73405e != null) {
                                    p pVar = a.this.f73405e;
                                    float f6 = f2 / ((float) a.this.f73406f);
                                    float f7 = f3 / ((float) a.this.g);
                                    float f8 = f4 / ((float) a.this.f73406f);
                                    float f9 = f5 / ((float) a.this.g);
                                    if (!(pVar.l == 0 || pVar.m == 0)) {
                                        pVar.n.processPanEvent(f6, f7, f8, f9, 1.0f);
                                    }
                                }
                            }
                        });
                    }
                    com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a aVar3 = aVar.m;
                    String str = aVar.f73440e.mShootWay;
                    String str2 = aVar.f73440e.creationId;
                    boolean i2 = aVar.i();
                    boolean a2 = aVar.a();
                    aVar3.j = str;
                    aVar3.k = str2;
                    aVar3.l = i2;
                    aVar3.m = a2;
                    aVar.m.a((com.ss.android.ugc.aweme.story.shootvideo.a.b) new com.ss.android.ugc.aweme.story.shootvideo.a.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73465a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f73465a, false, 85272, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73465a, false, 85272, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(false, false);
                        }

                        public final void dismiss() {
                            if (PatchProxy.isSupport(new Object[0], this, f73465a, false, 85273, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73465a, false, 85273, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(true, false);
                            a.this.b("brush_complete");
                        }
                    });
                }
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85202, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85202, new Class[0], Void.TYPE);
                } else {
                    aVar.n = new com.ss.android.ugc.aweme.story.shootvideo.friends.a();
                    com.ss.android.ugc.aweme.story.shootvideo.friends.a aVar4 = aVar.n;
                    ViewGroup viewGroup3 = aVar.j;
                    String str3 = aVar.f73440e.creationId;
                    if (PatchProxy.isSupport(new Object[]{viewGroup3, str3}, aVar4, com.ss.android.ugc.aweme.story.shootvideo.friends.a.f73515b, false, 85295, new Class[]{View.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{viewGroup3, str3}, aVar4, com.ss.android.ugc.aweme.story.shootvideo.friends.a.f73515b, false, 85295, new Class[]{View.class, String.class}, Void.TYPE);
                    } else {
                        aVar4.f73517d = viewGroup3.findViewById(C0906R.id.c8j);
                        aVar4.f73517d.setOnClickListener(new com.ss.android.ugc.aweme.story.shootvideo.friends.b(aVar4));
                        aVar4.f73516c = (PublishKnowFriendsLayout) viewGroup3.findViewById(C0906R.id.c8i);
                        aVar4.f73516c.setCreationId(str3);
                    }
                    aVar.n.g = new a.C0763a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73467a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f73467a, false, 85274, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73467a, false, 85274, new Class[0], Void.TYPE);
                                return;
                            }
                            if (fc.a() && a.this.i != null && (a.this.i instanceof VideoStoryEditPublishActivity)) {
                                ((VideoStoryEditPublishActivity) a.this.i).b(false);
                            }
                            a.this.a(false, false);
                            com.ss.android.ugc.aweme.utils.a.f75468b.a("privacy_click", a.this.h().f34114b);
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f73467a, false, 85275, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73467a, false, 85275, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(true, false);
                            if (fc.a() && a.this.i != null && (a.this.i instanceof VideoStoryEditPublishActivity)) {
                                a.this.j.postDelayed(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f73469a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f73469a, false, 85277, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f73469a, false, 85277, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        ((VideoStoryEditPublishActivity) a.this.i).b(true);
                                    }
                                }, 300);
                            }
                        }

                        public final void a(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73467a, false, 85276, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73467a, false, 85276, new Class[]{Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            if (!z) {
                                com.ss.android.ugc.aweme.utils.a.f75468b.a("send_item", a.this.h().f34114b);
                            }
                        }
                    };
                    aVar.o = new com.ss.android.ugc.aweme.story.shootvideo.publish.d();
                    com.ss.android.ugc.aweme.story.shootvideo.publish.d dVar = aVar.o;
                    ViewGroup viewGroup4 = aVar.j;
                    if (PatchProxy.isSupport(new Object[]{viewGroup4}, dVar, com.ss.android.ugc.aweme.story.shootvideo.publish.d.f73702b, false, 85414, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{viewGroup4}, dVar, com.ss.android.ugc.aweme.story.shootvideo.publish.d.f73702b, false, 85414, new Class[]{View.class}, Void.TYPE);
                    } else {
                        dVar.f73703c = (PublishBottomLayout) viewGroup4.findViewById(C0906R.id.c8g);
                        dVar.f73703c.getSelectFriendView().setOnClickListener(new com.ss.android.ugc.aweme.story.shootvideo.publish.e(dVar));
                    }
                    aVar.o.f73704d = aVar.n;
                    aVar.o.f73703c.setCreationId(aVar.f73440e.creationId);
                    aVar.o.f73703c.setEditModel(aVar.f73440e);
                    aVar.o.f73703c.getStartPublishView().setOnClickListener(new ax() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73444a;

                        public final void a(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f73444a, false, 85278, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f73444a, false, 85278, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            if (com.ss.android.ugc.aweme.story.shootvideo.c.a((Activity) a.this.i, "story_publish", (f.a) new f.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f73446a;

                                public final void b() {
                                }

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f73446a, false, 85279, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f73446a, false, 85279, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    a.this.d();
                                }
                            })) {
                                a.this.d();
                            }
                        }
                    });
                }
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85196, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85196, new Class[0], Void.TYPE);
                } else {
                    aVar.x = new com.ss.android.ugc.aweme.story.shootvideo.publish.a.b();
                    aVar.x.a(new com.ss.android.ugc.aweme.story.shootvideo.publish.a.c() {
                        public final void a(com.ss.android.ugc.aweme.story.shootvideo.publish.a.f fVar) {
                            if (fVar != null && fVar.f73647a != null) {
                                a.this.y = fVar.f73647a.f73648a;
                            }
                        }
                    });
                    aVar.x.a(new Object[0]);
                }
                aVar.b("enter_edit_post_page");
            } else {
                throw new IllegalStateException("please pass mediaType");
            }
        }
        this.f73385c = this.f73387e.f73439d;
        this.f73386d = this.f73387e.f73440e;
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85128, new Class[0], Void.TYPE);
        } else if (TextUtils.equals(this.f73386d.enterFrom, "from_chat")) {
            PublishBottomLayout publishBottomLayout = this.j;
            UrlModel sendToUserHead = this.f73386d.getSendToUserHead();
            if (PatchProxy.isSupport(new Object[]{sendToUserHead}, publishBottomLayout, PublishBottomLayout.f73772a, false, 85514, new Class[]{UrlModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sendToUserHead}, publishBottomLayout, PublishBottomLayout.f73772a, false, 85514, new Class[]{UrlModel.class}, Void.TYPE);
            } else {
                publishBottomLayout.f73774c.setVisibility(8);
                publishBottomLayout.f73773b.setVisibility(8);
                publishBottomLayout.f73776e.setVisibility(0);
                com.ss.android.ugc.aweme.base.c.b(publishBottomLayout.f73775d, sendToUserHead);
            }
        }
        this.h = getIntent().getBooleanExtra("back_to_main_after_publish", true);
        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
        int a3 = this.f73387e.D.a();
        if (a3 != 0) {
            com.bytedance.ies.dmt.ui.d.a.b(getApplicationContext(), getString(C0906R.string.bfz, new Object[]{Integer.valueOf(a3)})).a();
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity", "onCreate", false);
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        VEVideoPublishEditFragment vEVideoPublishEditFragment = (VEVideoPublishEditFragment) supportFragmentManager.findFragmentById(C0906R.id.bg2);
        if (vEVideoPublishEditFragment == null) {
            vEVideoPublishEditFragment = VEVideoPublishEditFragment.a((u) r15);
            supportFragmentManager.beginTransaction().add((int) C0906R.id.bg2, (Fragment) vEVideoPublishEditFragment).commit();
            vEVideoPublishEditFragment.f82764e = new VEVideoPublishEditFragment.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73389a;

                public final void a(dmt.av.video.v vVar) {
                    dmt.av.video.v vVar2 = vVar;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{vVar2}, this, f73389a, false, 85155, new Class[]{dmt.av.video.v.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{vVar2}, this, f73389a, false, 85155, new Class[]{dmt.av.video.v.class}, Void.TYPE);
                    } else if (vVar2 != null) {
                        if (vVar2.f83072b != 0) {
                            z = false;
                        }
                        VideoStoryEditPublishActivity.this.a(z);
                    }
                }

                public final void a(dmt.av.video.w wVar) {
                    dmt.av.video.w wVar2 = wVar;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{wVar2}, this, f73389a, false, 85156, new Class[]{dmt.av.video.w.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{wVar2}, this, f73389a, false, 85156, new Class[]{dmt.av.video.w.class}, Void.TYPE);
                    } else if (wVar2 != null) {
                        VideoStoryEditPublishActivity videoStoryEditPublishActivity = VideoStoryEditPublishActivity.this;
                        if (wVar2.g != 0) {
                            z = false;
                        }
                        videoStoryEditPublishActivity.a(z);
                    }
                }
            };
        }
        if (fc.a()) {
            this.i = (RelativeLayout) findViewById(C0906R.id.a06);
            this.l = (RelativeLayout) findViewById(C0906R.id.a07);
            this.i.setVisibility(0);
            this.l.setVisibility(0);
            new cv(this).a(new f(this));
        }
        vEVideoPublishEditFragment.f82763d.r.observe(this, new g(this));
        vEVideoPublishEditFragment.b().observe(this, new h(this));
        com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar5 = this.f73387e;
        if (PatchProxy.isSupport(new Object[0], aVar5, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85215, new Class[0], u.class)) {
            uVar = (u) PatchProxy.accessDispatch(new Object[0], aVar5, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85215, new Class[0], u.class);
        } else {
            u uVar2 = new u();
            if (aVar5.f73440e.previewConfigure != null) {
                uVar2 = aVar5.f73440e.previewConfigure;
                uVar2.mAudioPaths = r15;
            } else {
                if (aVar5.f73440e.isStoryBoomMode()) {
                    gi giVar = aVar5.f73440e.storyBoomModel;
                    uVar2.mAudioPaths = r15;
                    uVar2.mFps = giVar.getFps();
                    uVar2.mVideoPaths = giVar.getVideoList();
                } else {
                    uVar2.mVideoPaths = new String[]{aVar5.f73440e.mPath};
                    String[] strArr = r15;
                    if (aVar5.f73440e.getWavFile() != null) {
                        strArr = new String[]{aVar5.f73440e.getWavFile()};
                    }
                    uVar2.mAudioPaths = strArr;
                    uVar2.mFps = 30;
                }
                if (aVar5.B == 0) {
                    int b2 = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.StoryImagePlayTime);
                    uVar2.mVTrimIn = new int[]{0};
                    uVar2.mVTrimOut = new int[]{b2};
                    aVar5.f73440e.mVideoLength = b2;
                }
            }
            uVar2.canvasWidth = aVar5.D.d();
            uVar2.canvasHeight = aVar5.D.e();
            uVar2.mVolume = aVar5.f73440e.voiceVolume;
            uVar2.mWorkspace = d.a(aVar5.f73440e.mPath);
            uVar = uVar2;
        }
        this.f73385c.a().setValue(uVar);
        if (this.f73386d.isMusic() == 1 && (this.f73386d.recordMode == 0 || this.f73386d.mIsFromDraft)) {
            t tVar = new t();
            tVar.f83064b = this.f73386d.mMusicPath;
            tVar.f83065c = this.f73386d.mMusicStart;
            tVar.f83066d = -1;
            tVar.f83067e = this.f73386d.musicVolume;
            this.f73385c.d().setValue(tVar);
        }
        vEVideoPublishEditFragment.a((LiveData<u>) this.f73385c.a());
        vEVideoPublishEditFragment.b((LiveData<t>) this.f73385c.d());
        vEVideoPublishEditFragment.f82761b = this.f73385c.e();
        vEVideoPublishEditFragment.f82762c = this.f73385c.f();
        vEVideoPublishEditFragment.c(this.f73385c.k());
        vEVideoPublishEditFragment.e((LiveData<dmt.av.video.p>) this.f73385c.l());
        vEVideoPublishEditFragment.d((LiveData<s>) this.f73385c.m());
        vEVideoPublishEditFragment.a(this.f73385c.f82809c);
        vEVideoPublishEditFragment.b(this.f73385c.n());
        vEVideoPublishEditFragment.d(this.f73385c.o());
        vEVideoPublishEditFragment.f((LiveData<dmt.av.video.r>) this.f73385c.p());
        vEVideoPublishEditFragment.e(this.f73385c.q());
        vEVideoPublishEditFragment.f(this.f73385c.r());
        getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73391a;

            /* renamed from: b  reason: collision with root package name */
            boolean f73392b;

            /* renamed from: c  reason: collision with root package name */
            boolean f73393c;

            public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f73391a, false, 85159, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f73391a, false, 85159, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                    return;
                }
                super.onFragmentResumed(fragmentManager, fragment);
                if (VideoStoryEditPublishActivity.this.f73387e != null) {
                    VideoStoryEditPublishActivity.this.f73387e.v = VideoStoryEditPublishActivity.this.b();
                }
            }

            public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment}, this, f73391a, false, 85158, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment}, this, f73391a, false, 85158, new Class[]{FragmentManager.class, Fragment.class}, Void.TYPE);
                    return;
                }
                super.onFragmentStarted(fragmentManager, fragment);
                if (fragment instanceof VEVideoPublishEditFragment) {
                    if (!this.f73392b) {
                        this.f73392b = true;
                    }
                    if (!this.f73393c && VideoStoryEditPublishActivity.this.f73386d.mIsFromDraft && VideoStoryEditPublishActivity.this.f73386d.hasInfoStickers()) {
                        VideoStoryEditPublishActivity.this.f73387e.f();
                        VideoStoryEditPublishActivity.this.f73387e.h.a(VideoStoryEditPublishActivity.this.f73386d.infoStickerModel);
                        this.f73393c = true;
                    }
                }
            }

            public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                Fragment fragment2 = fragment;
                if (PatchProxy.isSupport(new Object[]{fragmentManager, fragment2, bundle}, this, f73391a, false, 85157, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentManager, fragment2, bundle}, this, f73391a, false, 85157, new Class[]{FragmentManager.class, Fragment.class, Bundle.class}, Void.TYPE);
                    return;
                }
                super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
                if (fragment2 instanceof VEVideoPublishEditFragment) {
                    if (fc.a()) {
                        fb.a((View) VideoStoryEditPublishActivity.this.c(), (Context) VideoStoryEditPublishActivity.this.d(), VideoStoryEditPublishActivity.this.f73387e.D.d(), VideoStoryEditPublishActivity.this.f73387e.D.e());
                        VideoStoryEditPublishActivity.this.a();
                    } else if (VideoStoryEditPublishActivity.this.f73387e.B == 0) {
                        fb.c(VideoStoryEditPublishActivity.this.c(), VideoStoryEditPublishActivity.this.f73387e.D.d(), VideoStoryEditPublishActivity.this.f73387e.D.e());
                    } else {
                        fb.b(VideoStoryEditPublishActivity.this.c(), VideoStoryEditPublishActivity.this.f73387e.D.d(), VideoStoryEditPublishActivity.this.f73387e.D.e());
                    }
                }
            }
        }, false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity", "onCreate", false);
    }

    @Nullable
    public final p b() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85137, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85137, new Class[0], p.class);
        }
        VEVideoPublishEditFragment vEVideoPublishEditFragment = (VEVideoPublishEditFragment) getSupportFragmentManager().findFragmentById(C0906R.id.bg2);
        if (vEVideoPublishEditFragment == null) {
            return null;
        }
        return vEVideoPublishEditFragment.f82763d.q;
    }

    public final SurfaceView c() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85138, new Class[0], SurfaceView.class)) {
            return (SurfaceView) PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85138, new Class[0], SurfaceView.class);
        }
        VEVideoPublishEditFragment vEVideoPublishEditFragment = (VEVideoPublishEditFragment) getSupportFragmentManager().findFragmentById(C0906R.id.bg2);
        if (vEVideoPublishEditFragment == null) {
            return null;
        }
        return vEVideoPublishEditFragment.f82765f;
    }

    public final Map f() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85146, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85146, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        if (this.f73386d != null) {
            hashMap.put("creation_id", this.f73386d.creationId);
        }
        return hashMap;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85136, new Class[0], Void.TYPE);
            return;
        }
        e(false);
        super.finish();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85134, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85135, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.f73387e != null) {
            com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar = this.f73387e;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85238, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85238, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().g();
            }
        }
        e(false);
        if (this.h && org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        if (r3 == false) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f73384b
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 85145(0x14c99, float:1.19314E-40)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f73384b
            r5 = 0
            r6 = 85145(0x14c99, float:1.19314E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.story.shootvideo.edit.a r1 = r11.f73387e
            if (r1 == 0) goto L_0x00bd
            com.ss.android.ugc.aweme.story.shootvideo.edit.a r1 = r11.f73387e
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a
            r5 = 0
            r6 = 85227(0x14ceb, float:1.19428E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            r3 = 1
            if (r2 == 0) goto L_0x0058
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a
            r5 = 0
            r6 = 85227(0x14ceb, float:1.19428E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = r0
            goto L_0x00bb
        L_0x0058:
            com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a r2 = r1.m
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a r0 = r1.m
            r0.dismiss()
            goto L_0x00bb
        L_0x0066:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r2 = r1.l
            if (r2 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r2 = r1.l
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.story.shootvideo.textfont.h.f74197b
            r7 = 0
            r8 = 86143(0x1507f, float:1.20712E-40)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r2
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0097
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.story.shootvideo.textfont.h.f74197b
            r7 = 0
            r8 = 86143(0x1507f, float:1.20712E-40)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x00a4
        L_0x0097:
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r4 = r2.o
            if (r4 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout r2 = r2.o
            boolean r2 = r2.h
            if (r2 != 0) goto L_0x00a3
            r2 = 1
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            if (r2 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r1.l
            r0.dismiss()
            goto L_0x00bb
        L_0x00ac:
            com.ss.android.ugc.aweme.story.shootvideo.friends.a r2 = r1.n
            boolean r2 = r2.a()
            if (r2 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.story.shootvideo.friends.a r0 = r1.n
            r0.dismiss()
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 != 0) goto L_0x00c0
        L_0x00bd:
            r11.e()
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity.onBackPressed():void");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85129, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            if (this.f73387e != null) {
                com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar = this.f73387e;
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85239, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85239, new Class[0], Void.TYPE);
                } else {
                    if (aVar.A != null) {
                        aVar.A.a(aVar.a());
                    }
                    if (aVar.l != null) {
                        aVar.l.a(aVar.a());
                    }
                    if (aVar.m != null) {
                        com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a aVar2 = aVar.m;
                        AppCompatActivity appCompatActivity = aVar.i;
                        if (PatchProxy.isSupport(new Object[]{appCompatActivity}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a.f73402b, false, 85172, new Class[]{Context.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a aVar3 = aVar2;
                            PatchProxy.accessDispatch(new Object[]{appCompatActivity}, aVar3, com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a.f73402b, false, 85172, new Class[]{Context.class}, Void.TYPE);
                        } else if (!(aVar2.f73403c.getBrushView() == null || aVar2.f73405e == null)) {
                            View brushView = aVar2.f73403c.getBrushView();
                            aj d2 = aVar2.f73405e.d();
                            ((StoryBrushView) brushView).setStatusBarHeightDelta(false);
                            if (fc.a()) {
                                fb.a(brushView, (Context) appCompatActivity, d2.f77890a, d2.f77891b);
                            } else if (!aVar2.m) {
                                fb.a(brushView, d2.f77890a, d2.f77891b);
                            } else if (d2.f77891b < fc.a(aVar2.f73403c.getContext())) {
                                fb.c(brushView, d2.f77890a, d2.f77891b);
                            } else {
                                fb.a(brushView, d2.f77890a, d2.f77891b);
                            }
                            ViewGroup.LayoutParams layoutParams = aVar2.f73403c.getBrushView().getLayoutParams();
                            aVar2.f73406f = layoutParams.width;
                            aVar2.g = layoutParams.height;
                        }
                    }
                    if (aVar.h != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) aVar.k.getLayoutParams();
                        aVar.h.a(layoutParams2.width, layoutParams2.height, new int[]{layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin});
                    }
                }
            }
            switch (fb.f67663b) {
                case 1:
                    c(true);
                    d(true);
                    return;
                case 2:
                    c(false);
                    d(true);
                    return;
                case 3:
                    c(true);
                    d(false);
                    return;
                case 4:
                    c(true);
                    d(true);
                    return;
                case 5:
                    c(false);
                    d(true);
                    return;
                case 6:
                    c(true);
                    d(false);
                    return;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    c(false);
                    d(false);
                    return;
                default:
                    c(false);
                    d(false);
                    return;
            }
        }
    }

    public final boolean e() {
        MobClick mobClick;
        JSONObject jSONObject;
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85142, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85142, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f73387e != null) {
            com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
            com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar2 = this.f73387e;
            if (PatchProxy.isSupport(new Object[]{"back_to_shoot"}, aVar2, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85225, new Class[]{String.class}, MobClick.class)) {
                com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar3 = aVar2;
                mobClick = (MobClick) PatchProxy.accessDispatch(new Object[]{"back_to_shoot"}, aVar3, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85225, new Class[]{String.class}, MobClick.class);
            } else {
                MobClick eventName = MobClick.obtain().setLabelName("edit_post_page").setEventName("back_to_shoot");
                if (PatchProxy.isSupport(new Object[0], aVar2, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85226, new Class[0], JSONObject.class)) {
                    jSONObject = (JSONObject) PatchProxy.accessDispatch(new Object[0], aVar2, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85226, new Class[0], JSONObject.class);
                } else {
                    jSONObject = com.ss.android.ugc.aweme.app.d.c.a().a("shoot_way", aVar2.f73440e.mShootWay).a("is_photo", Integer.valueOf(aVar2.a() ? 1 : 0)).b();
                }
                mobClick = eventName.setJsonObject(jSONObject);
            }
            aVar.onEvent(mobClick);
        }
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85143, new Class[0], Void.TYPE);
        } else {
            String str = "确定放弃当前视频内容";
            if (this.f73387e != null && this.f73387e.a()) {
                str = "确定放弃当前照片内容";
            }
            new a.C0185a(this).b(str).b(getString(C0906R.string.pm), j.f73629b).a(getString(C0906R.string.p0), (DialogInterface.OnClickListener) new k(this)).a().a();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        com.ss.android.ugc.aweme.framework.a.a.a("receive prepare done event in edit page");
        if (this.f73387e != null) {
            this.f73387e.C = true;
            com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar = this.f73387e;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85200, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85200, new Class[0], Void.TYPE);
            } else if (aVar.C || !com.ss.android.ugc.aweme.g.a.a()) {
                aVar.c();
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85212, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85212, new Class[0], Void.TYPE);
                } else if (aVar.l == null) {
                    aVar.k = (FrameLayout) aVar.i.findViewById(C0906R.id.d1y);
                    aVar.l = new com.ss.android.ugc.aweme.story.shootvideo.textfont.h(aVar.i, aVar.j, aVar.k, false);
                    aVar.l.w = aVar.D;
                    aVar.l.a(aVar.t);
                    aVar.l.a(aVar.f73440e.mShootWay, aVar.f73440e.creationId, aVar.i(), aVar.a());
                    aVar.l.k = new SafeHandler(aVar.i);
                    aVar.l.p = true;
                    if (aVar.i.getIntent() != null) {
                        TextStickerData textStickerData = (TextStickerData) aVar.i.getIntent().getParcelableExtra("text_sticker_data");
                        if (textStickerData != null) {
                            aVar.l.a(aVar.g(), aVar.a());
                            aVar.l.a(textStickerData);
                            aVar.s.setVisibility(8);
                        }
                    }
                    aVar.l.a((com.ss.android.ugc.aweme.story.shootvideo.a.b) new com.ss.android.ugc.aweme.story.shootvideo.a.b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73448a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f73448a, false, 85280, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73448a, false, 85280, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(false, false);
                        }

                        public final void dismiss() {
                            if (PatchProxy.isSupport(new Object[0], this, f73448a, false, 85281, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73448a, false, 85281, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(true, false);
                        }
                    });
                    aVar.l.f74201f = new h.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73450a;

                        public final void b(com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o oVar) {
                            if (PatchProxy.isSupport(new Object[]{oVar}, this, f73450a, false, 85284, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{oVar}, this, f73450a, false, 85284, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.class}, Void.TYPE);
                                return;
                            }
                            a.this.a("click_text");
                        }

                        public final void a(com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o oVar) {
                            if (PatchProxy.isSupport(new Object[]{oVar}, this, f73450a, false, 85283, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{oVar}, this, f73450a, false, 85283, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.class}, Void.TYPE);
                                return;
                            }
                            if (a.this.j()) {
                                a.this.s.setVisibility(8);
                            } else {
                                a.this.s.setVisibility(0);
                            }
                            com.ss.android.ugc.aweme.utils.a.f75468b.a("text_delete", a.this.h().f34114b);
                        }

                        public final void a(com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o oVar, int i, int i2, boolean z, boolean z2, boolean z3) {
                            if (PatchProxy.isSupport(new Object[]{oVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f73450a, false, 85282, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{oVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f73450a, false, 85282, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                            } else if (z) {
                                a.this.a(true, true);
                                a.this.r = false;
                            } else {
                                if (!a.this.r) {
                                    a.this.a(false, true);
                                    if (a.this.h != null) {
                                        a.this.h.f();
                                    }
                                    if (a.this.l != null) {
                                        a.this.l.c();
                                    }
                                }
                                a.this.r = true;
                            }
                        }
                    };
                    aVar.l.i = new com.ss.android.ugc.aweme.story.shootvideo.edit.p(aVar);
                    aVar.l.f().f74163b = aVar.f73439d.s();
                }
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85198, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85198, new Class[0], Void.TYPE);
                } else if (aVar.A == null) {
                    aj d2 = aVar.v.d();
                    aVar.A = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a();
                    aVar.A.o = d2;
                    aVar.A.t = aVar.D;
                    aVar.A.a(aVar.i, aVar.j, aVar.t, (FrameLayout) aVar.i.findViewById(C0906R.id.d1y));
                    aVar.A.l = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.a.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f73463a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f73463a, false, 85269, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73463a, false, 85269, new Class[0], Void.TYPE);
                                return;
                            }
                            com.ss.android.ugc.aweme.port.in.a.m.a((ae.b) null, (FragmentActivity) a.this.i, false);
                        }

                        public final void b() {
                            if (PatchProxy.isSupport(new Object[0], this, f73463a, false, 85271, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f73463a, false, 85271, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.s.setVisibility(8);
                        }

                        public final void a(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73463a, false, 85268, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73463a, false, 85268, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else if (z) {
                                a.this.a(true, true);
                            } else {
                                a.this.a(false, true);
                            }
                        }

                        public final void b(boolean z) {
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73463a, false, 85270, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73463a, false, 85270, new Class[]{Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            if (a.this.l != null && z) {
                                a.this.l.c();
                            }
                            if (a.this.h != null && z) {
                                a.this.h.f();
                            }
                        }
                    };
                }
            } else {
                throw new IllegalStateException("stickers must be inited after veEditor prepared");
            }
        }
    }

    public void onResume() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f73384b, false, 85133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73384b, false, 85133, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity", "onResume", true);
        super.onResume();
        if (this.f73387e != null) {
            com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar = this.f73387e;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85235, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85235, new Class[0], Void.TYPE);
            } else {
                if (aVar.n != null) {
                    com.ss.android.ugc.aweme.story.shootvideo.friends.a aVar2 = aVar.n;
                    if (PatchProxy.isSupport(new Object[0], aVar2, com.ss.android.ugc.aweme.story.shootvideo.friends.a.f73515b, false, 85302, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar2, com.ss.android.ugc.aweme.story.shootvideo.friends.a.f73515b, false, 85302, new Class[0], Void.TYPE);
                    } else if (aVar2.f73516c != null) {
                        aVar2.f73516c.al_();
                    }
                }
                com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.g deleteView = aVar.t.getDeleteView();
                if (deleteView.f74377c || deleteView.f74376b || deleteView.f74378d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (aVar.l != null) {
                        com.ss.android.ugc.aweme.story.shootvideo.textfont.h hVar = aVar.l;
                        if (PatchProxy.isSupport(new Object[0], hVar, com.ss.android.ugc.aweme.story.shootvideo.textfont.h.f74197b, false, 86153, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], hVar, com.ss.android.ugc.aweme.story.shootvideo.textfont.h.f74197b, false, 86153, new Class[0], Void.TYPE);
                        } else if (hVar.g != null) {
                            hVar.g.b();
                        }
                    }
                    if (aVar.h != null) {
                        InfoStickerHelper infoStickerHelper = aVar.h;
                        if (PatchProxy.isSupport(new Object[0], infoStickerHelper, InfoStickerHelper.f67201a, false, 76830, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], infoStickerHelper, InfoStickerHelper.f67201a, false, 76830, new Class[0], Void.TYPE);
                        } else if (infoStickerHelper.n != null) {
                            infoStickerHelper.n.b();
                        }
                    }
                    aVar.a(true, false);
                }
                aVar.r = false;
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity", "onResume", false);
    }

    private void e(boolean z) {
        this.g = z;
    }

    public final boolean a(Effect effect) {
        if (!PatchProxy.isSupport(new Object[]{effect}, this, f73384b, false, 85147, new Class[]{Effect.class}, Boolean.TYPE)) {
            return n.b(effect);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f73384b, false, 85147, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
    }

    private void c(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73384b, false, 85130, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73384b, false, 85130, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        if (z) {
            i2 = fc.c(this);
        }
        layoutParams.topMargin = i2;
        this.l.setLayoutParams(layoutParams);
    }

    private void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73384b, false, 85131, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73384b, false, 85131, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        if (!z) {
            dimensionPixelSize = 0;
        }
        layoutParams.bottomMargin = dimensionPixelSize;
        this.i.setLayoutParams(layoutParams);
    }

    public final void b(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73384b, false, 85132, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73384b, false, 85132, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.i != null) {
            RelativeLayout relativeLayout = this.i;
            if (!z) {
                i2 = 4;
            }
            relativeLayout.setVisibility(i2);
        }
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73384b, false, 85126, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73384b, false, 85126, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar = this.f73387e;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, aVar, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85194, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            com.ss.android.ugc.aweme.story.shootvideo.edit.a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr2, aVar2, com.ss.android.ugc.aweme.story.shootvideo.edit.a.f73436a, false, 85194, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            if (aVar.l != null && !aVar.l.v) {
                aVar.l.b(z2);
            }
            if (aVar.h != null && !aVar.h.h()) {
                aVar.h.a(z2);
            }
            if (aVar.A != null) {
                aVar.A.f67255d = z2;
            }
        }
        if (z2) {
            this.f73385c.s().setValue(Boolean.FALSE);
        }
    }

    public static void a(Object obj, Intent intent, int i2) {
        Object obj2 = obj;
        Intent intent2 = intent;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{obj2, intent2, Integer.valueOf(i2)}, null, f73384b, true, 85124, new Class[]{Object.class, Intent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, intent2, Integer.valueOf(i2)}, null, f73384b, true, 85124, new Class[]{Object.class, Intent.class, Integer.TYPE}, Void.TYPE);
        } else if (obj2 instanceof Fragment) {
            Fragment fragment = (Fragment) obj2;
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent2.setClass(activity, VideoStoryEditPublishActivity.class);
                fragment.startActivityForResult(intent2, i3);
            }
        } else if (obj2 instanceof Activity) {
            Context context = (Context) obj2;
            intent2.setClass(context, VideoStoryEditPublishActivity.class);
            ((Activity) context).startActivityForResult(intent2, i3);
        } else {
            throw new IllegalArgumentException("start activity with a wrong context object");
        }
    }
}
