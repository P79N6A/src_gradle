package com.ss.android.ugc.aweme.story.shootvideo.edit;

import a.g;
import a.i;
import android.content.Context;
import android.graphics.PointF;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.ce;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerHelper;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y;
import com.ss.android.ugc.aweme.shortvideo.edit.o;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.InfoStickerModule;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.n;
import com.ss.android.ugc.aweme.shortvideo.view.c;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.story.shootvideo.constants.StoryIntentConstants;
import com.ss.android.ugc.aweme.story.shootvideo.publish.d;
import com.ss.android.ugc.aweme.story.shootvideo.publish.f;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.h;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StoryStickerGestureLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.p;
import dmt.av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class a implements a.C0031a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73436a;
    public com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a A;
    @StoryIntentConstants.MediaType
    public int B;
    public boolean C;
    public ce D;
    public e E;
    private List<InteractStickerStruct> F;
    private boolean G;

    /* renamed from: b  reason: collision with root package name */
    public StoryEditLayout f73437b;

    /* renamed from: c  reason: collision with root package name */
    public o f73438c;

    /* renamed from: d  reason: collision with root package name */
    public VEVideoPublishEditViewModel f73439d;

    /* renamed from: e  reason: collision with root package name */
    public cb f73440e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.a f73441f;
    public b g;
    public InfoStickerHelper h;
    public AppCompatActivity i;
    public ViewGroup j;
    public FrameLayout k;
    public h l;
    public com.ss.android.ugc.aweme.story.shootvideo.brushsticker.a m;
    public com.ss.android.ugc.aweme.story.shootvideo.friends.a n;
    public d o;
    public f p;
    public FrameLayout q;
    public boolean r;
    public View s;
    public StoryStickerGestureLayout t;
    public boolean u = true;
    public p v;
    public boolean w;
    public com.ss.android.ugc.aweme.story.shootvideo.publish.a.b x;
    public boolean y;
    public long z;

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3}, this, f73436a, false, 85210, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str3}, this, f73436a, false, 85210, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.G && com.ss.android.ugc.aweme.g.a.a()) {
            if (com.ss.android.ugc.aweme.video.b.b(str2)) {
                new File(str3).delete();
            }
            com.ss.android.ugc.aweme.video.b.c(str, str2);
        }
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f73436a, false, 85218, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f73436a, false, 85218, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.u = z2;
        if (!z3) {
            if (this.l != null) {
                this.l.b(z2);
            }
            if (this.h != null) {
                this.h.a(z2);
            }
        }
        if (!z2) {
            n();
        }
        this.f73441f.h = z2;
        if (z2) {
            this.f73437b.a();
            this.o.b();
            if (j()) {
                this.s.setVisibility(8);
            } else {
                this.s.setVisibility(0);
            }
        } else {
            this.s.setVisibility(8);
            if (this.l != null) {
                this.l.c();
            }
            if (this.h != null) {
                this.h.f();
            }
            this.f73437b.dismiss();
            this.o.dismiss();
        }
    }

    public final boolean a() {
        if (this.B == 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (this.f73440e.mFromCut || this.f73440e.mFromMultiCut || this.w) {
            return true;
        }
        return false;
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85206, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            SocialModel socialModel = new SocialModel();
            socialModel.friends = this.o.f73705e;
            socialModel.recUsers = this.o.f73706f;
            this.f73440e.socialModel = socialModel;
        }
    }

    private i<Boolean> l() {
        if (!PatchProxy.isSupport(new Object[0], this, f73436a, false, 85207, new Class[0], i.class)) {
            return i.a((Callable<TResult>) new k<TResult>(this), i.f1052b).a((g<TResult, TContinuationResult>) new l<TResult,TContinuationResult>(this), (Executor) i.f1051a);
        }
        return (i) PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85207, new Class[0], i.class);
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85219, new Class[0], Void.TYPE);
            return;
        }
        if (this.A != null) {
            this.A.f();
        }
    }

    private static boolean o() {
        if (PatchProxy.isSupport(new Object[0], null, f73436a, true, 85220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f73436a, true, 85220, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableInfoSticker);
    }

    public final com.ss.android.ugc.aweme.app.d.d h() {
        if (!PatchProxy.isSupport(new Object[0], this, f73436a, false, 85232, new Class[0], com.ss.android.ugc.aweme.app.d.d.class)) {
            return r.a(this.f73440e.mShootWay, this.f73440e.creationId, i(), a(), true);
        }
        return (com.ss.android.ugc.aweme.app.d.d) PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85232, new Class[0], com.ss.android.ugc.aweme.app.d.d.class);
    }

    private boolean m() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85211, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85211, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f73440e.hasInfoStickers()) {
            Iterator<com.ss.android.ugc.aweme.n.b> it2 = this.f73440e.infoStickerModel.stickers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().isAnimate) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z2;
    }

    private boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85237, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85237, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.i.getIntent() == null) {
            return false;
        } else {
            return this.i.getIntent().getBooleanExtra("story_text_record_type", false);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85197, new Class[0], Void.TYPE);
        } else if (this.l != null) {
            if (this.A == null || !this.A.e()) {
                this.l.a(g(), a());
                this.l.b((com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o) null);
                return;
            }
            this.A.f();
        }
    }

    public final p g() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85221, new Class[0], p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85221, new Class[0], p.class);
        } else if (this.v == null) {
            this.v = ((VideoStoryEditPublishActivity) this.i).b();
            return this.v;
        } else {
            aj d2 = this.v.d();
            if (d2.f77890a > 0 && d2.f77891b > 0) {
                return this.v;
            }
            this.v = ((VideoStoryEditPublishActivity) this.i).b();
            return this.v;
        }
    }

    public final boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85236, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85236, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.l != null && this.l.e()) {
            return true;
        } else {
            if (this.h != null && this.h.g()) {
                return true;
            }
            if (this.m != null && this.m.c()) {
                return true;
            }
            if (this.A == null || !this.A.g()) {
                return false;
            }
            return true;
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85199, new Class[0], Void.TYPE);
        } else if (!this.C) {
            this.f73437b.a(false);
        } else if (o()) {
            a(this.q);
            this.f73437b.a(true);
        } else {
            this.f73437b.a(false);
        }
    }

    public final void d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85203, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.story.shootvideo.publish.a.i.f73658a, true, 85452, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.story.shootvideo.publish.a.i.f73658a, true, 85452, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!((Boolean) com.ss.android.ugc.aweme.port.in.a.o.k().a()).booleanValue() && com.ss.android.ugc.aweme.port.in.a.A.a() && ((Integer) com.ss.android.ugc.aweme.port.in.a.o.m().a()).intValue() == 1) {
            z2 = true;
        }
        if (z2) {
            com.ss.android.ugc.aweme.story.shootvideo.publish.a.i iVar = new com.ss.android.ugc.aweme.story.shootvideo.publish.a.i(this.i);
            iVar.f73661d = new i(this);
            iVar.f73659b = this.y;
            iVar.show();
            return;
        }
        e();
    }

    public final void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85204, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.c();
        }
        if (this.A != null) {
            this.A.f();
        }
        this.D.a(w.a(this.v, this.D, this.h, this.l, this.A));
        int i3 = C0906R.string.brl;
        if (TextUtils.equals(this.f73440e.enterFrom, "from_chat")) {
            i3 = C0906R.string.aut;
        }
        c a2 = c.a(this.i, this.i.getString(i3));
        if (a2 != null) {
            a2.setIndeterminate(true);
            long currentTimeMillis = System.currentTimeMillis();
            if (!TextUtils.equals(this.f73440e.enterFrom, "from_chat")) {
                com.ss.android.ugc.aweme.port.in.a.a(this.i.getClass(), com.ss.android.ugc.aweme.port.in.a.f61121d.b());
                com.ss.android.ugc.aweme.y.b.a(false);
                com.ss.android.ugc.aweme.y.b.b();
                com.ss.android.ugc.aweme.story.d.b.a(this.i);
            }
            this.p.a(null);
            k();
            if (this.B == 1 || m()) {
                cb cbVar = this.f73440e;
                if (this.B == 1) {
                    i2 = 7;
                } else {
                    i2 = 9;
                }
                cbVar.videoType = i2;
            } else {
                this.f73440e.videoType = 8;
            }
            this.f73440e.isStoryTextRecord = p();
            ArrayList arrayList = new ArrayList();
            this.f73440e.usePaint = true ^ this.m.b();
            if (this.l != null) {
                this.f73440e.texts = this.l.a();
            }
            if (this.A != null && this.A.g()) {
                this.f73440e.texts = new ArrayList();
                this.f73440e.texts.add("interact_sticker");
            }
            if (this.f73440e.videoType == 8) {
                arrayList.add(l());
            } else {
                String a3 = com.ss.android.ugc.aweme.shortvideo.a.d.a(this.f73440e.mPath);
                if (Lists.notEmpty(this.f73440e.texts)) {
                    arrayList.add(c(a3 + File.separator + "text.png"));
                }
                if (this.f73440e.usePaint) {
                    arrayList.add(d(a3 + File.separator + "paint.png"));
                }
            }
            i.a(Math.max(0, 500 - (System.currentTimeMillis() - currentTimeMillis))).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(this, arrayList, a2));
        }
    }

    public final void f() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f73436a, false, 85216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73436a, false, 85216, new Class[0], Void.TYPE);
            return;
        }
        if (this.h == null) {
            this.h = new InfoStickerHelper(g(), this.t, this.f73440e);
            this.h.f67202b = true;
            this.h.f67203c = a();
            if (this.f73440e.isStoryBoomMode()) {
                ArrayList arrayList = new ArrayList();
                for (String str : this.f73440e.storyBoomModel.getVideoList()) {
                    com.ss.android.ugc.aweme.music.b.a.a aVar = new com.ss.android.ugc.aweme.music.b.a.a(-1);
                    aVar.f56315e = str;
                    aVar.h = (long) this.f73440e.storyBoomModel.getSingleDuration();
                    arrayList.add(aVar);
                }
                this.h.a((FragmentActivity) this.i, (View) this.j, (List<com.ss.android.ugc.aweme.music.b.a.a>) arrayList);
            } else {
                this.h.a((FragmentActivity) this.i, (View) this.j, this.f73440e.getInputVideoFile());
            }
            this.h.a(g(), this.k);
            this.i.getLifecycle().addObserver(this.h);
            this.h.i.f67219d = this.f73439d.s();
            this.h.i.f67217b = this.f73439d.m();
            this.h.i.f67218c = this.f73439d.f();
            InfoStickerHelper infoStickerHelper = this.h;
            if (this.B == 1) {
                z2 = true;
            }
            infoStickerHelper.b(z2);
            this.h.a((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a) new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73454a;

                public final void a(com.ss.android.ugc.aweme.n.b bVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f73454a, false, 85257, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f73454a, false, 85257, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE);
                        return;
                    }
                    if (a.this.f73440e.infoStickerModel == null) {
                        a.this.f73440e.infoStickerModel = new com.ss.android.ugc.aweme.n.a(com.ss.android.ugc.aweme.shortvideo.a.d.a(a.this.f73440e.mPath));
                    }
                    a.this.f73440e.infoStickerModel.addSticker(bVar);
                }

                public final void b(com.ss.android.ugc.aweme.n.b bVar) {
                    com.ss.android.ugc.aweme.n.b bVar2 = bVar;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, this, f73454a, false, 85258, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar2}, this, f73454a, false, 85258, new Class[]{com.ss.android.ugc.aweme.n.b.class}, Void.TYPE);
                        return;
                    }
                    a.this.f73440e.infoStickerModel.removeSticker(bVar2);
                }
            });
            this.f73439d.e().observe(this.i, new d(this));
            this.f73439d.f().observe(this.i, new e(this));
            this.h.w = new InfoStickerHelper.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73456a;

                public final int a(y yVar, boolean z, boolean z2) {
                    return 0;
                }

                public final Float a(float f2) {
                    if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73456a, false, 85261, new Class[]{Float.TYPE}, Float.class)) {
                        return Float.valueOf(f2);
                    }
                    return (Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73456a, false, 85261, new Class[]{Float.TYPE}, Float.class);
                }

                public final PointF a(y yVar, float f2, float f3) {
                    if (!PatchProxy.isSupport(new Object[]{yVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f73456a, false, 85260, new Class[]{y.class, Float.TYPE, Float.TYPE}, PointF.class)) {
                        return new PointF();
                    }
                    return (PointF) PatchProxy.accessDispatch(new Object[]{yVar, Float.valueOf(f2), Float.valueOf(f3)}, this, f73456a, false, 85260, new Class[]{y.class, Float.TYPE, Float.TYPE}, PointF.class);
                }

                public final void a(y yVar, int i, int i2, boolean z, boolean z2) {
                    if (PatchProxy.isSupport(new Object[]{yVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73456a, false, 85259, new Class[]{y.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{yVar, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2)}, this, f73456a, false, 85259, new Class[]{y.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                    } else if (z) {
                        a.this.a(true, true);
                    } else {
                        a.this.a(false, true);
                        if (a.this.l != null) {
                            a.this.l.c();
                        }
                        a.this.h.f();
                    }
                }
            };
            this.h.x = new InfoStickerHelper.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73458a;

                public final void b(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73458a, false, 85263, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73458a, false, 85263, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        if (a.this.l != null) {
                            a.this.l.a(0.3137255f, true);
                        }
                        if (a.this.m != null) {
                            a.this.m.a(1.0f);
                        }
                    } else {
                        if (a.this.l != null) {
                            a.this.l.a(0.3137255f, false);
                        }
                        if (a.this.m != null) {
                            a.this.m.a(0.3137255f);
                        }
                    }
                }

                public final void a(boolean z) {
                    float f2;
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73458a, false, 85262, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73458a, false, 85262, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        a.this.a(false, false);
                        if (a.this.l != null) {
                            h hVar = a.this.l;
                            if (PatchProxy.isSupport(new Object[0], hVar, h.f74197b, false, 86138, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], hVar, h.f74197b, false, 86138, new Class[0], Void.TYPE);
                            } else if (hVar.l != null) {
                                Context context = hVar.f74200e.getContext();
                                int width = hVar.f74200e.getWidth();
                                int height = hVar.f74200e.getHeight();
                                int e2 = (int) (((float) fc.e(context)) - UIUtils.dip2Px(context, 250.0f));
                                float dip2Px = UIUtils.dip2Px(context, 50.0f);
                                float dip2Px2 = UIUtils.dip2Px(context, 250.0f);
                                aj d2 = hVar.l.d();
                                int i = d2.f77891b;
                                int i2 = d2.f77890a;
                                int i3 = width / 2;
                                if (i > i2) {
                                    int i4 = (i3 * i) / i2;
                                    if (i4 < e2) {
                                        e2 = i4;
                                    }
                                    float f3 = (float) i;
                                    ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, (((float) i3) * 1.0f) / ((float) i2), 1.0f, (((float) e2) * 1.0f) / f3, 1, 0.5f, 1, 0.5f - (dip2Px2 / f3));
                                    scaleAnimation.setDuration(300);
                                    scaleAnimation.setFillAfter(true);
                                    hVar.f74199d.startAnimation(scaleAnimation);
                                } else {
                                    float f4 = (((float) e2) - (dip2Px / 2.0f)) / ((float) height);
                                    ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, f4, 1.0f, f4, 1, 0.5f, 1, -1.0f);
                                    scaleAnimation2.setDuration(300);
                                    scaleAnimation2.setFillAfter(true);
                                    hVar.f74199d.startAnimation(scaleAnimation2);
                                }
                            }
                            f2 = 0.3137255f;
                            a.this.l.a(0.3137255f, false);
                        } else {
                            f2 = 0.3137255f;
                        }
                        if (a.this.m != null) {
                            a.this.m.a(f2);
                        }
                    } else {
                        a.this.a(true, false);
                        if (a.this.l != null) {
                            h hVar2 = a.this.l;
                            if (PatchProxy.isSupport(new Object[0], hVar2, h.f74197b, false, 86139, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], hVar2, h.f74197b, false, 86139, new Class[0], Void.TYPE);
                            } else if (hVar2.l != null) {
                                Context context2 = hVar2.f74200e.getContext();
                                int height2 = hVar2.f74200e.getHeight();
                                int width2 = hVar2.f74200e.getWidth();
                                int e3 = (int) (((float) fc.e(context2)) - UIUtils.dip2Px(context2, 250.0f));
                                float dip2Px3 = UIUtils.dip2Px(context2, 50.0f);
                                float dip2Px4 = UIUtils.dip2Px(context2, 250.0f);
                                aj d3 = hVar2.l.d();
                                int i5 = d3.f77891b;
                                int i6 = d3.f77890a;
                                if (i5 > i6) {
                                    int i7 = width2 / 2;
                                    if ((height2 * i7) / width2 < e3) {
                                        e3 = (i7 * i5) / i6;
                                    }
                                    float f5 = (float) i5;
                                    ScaleAnimation scaleAnimation3 = new ScaleAnimation((((float) i7) * 1.0f) / ((float) i6), 1.0f, (((float) e3) * 1.0f) / f5, 1.0f, 1, 0.5f, 1, 0.5f - (dip2Px4 / f5));
                                    scaleAnimation3.setDuration(300);
                                    scaleAnimation3.setFillAfter(true);
                                    hVar2.f74199d.startAnimation(scaleAnimation3);
                                } else {
                                    float f6 = (((float) e3) - (dip2Px3 / 2.0f)) / ((float) height2);
                                    ScaleAnimation scaleAnimation4 = new ScaleAnimation(f6, 1.0f, f6, 1.0f, 1, 0.5f, 1, -1.0f);
                                    scaleAnimation4.setDuration(300);
                                    scaleAnimation4.setFillAfter(true);
                                    hVar2.f74199d.startAnimation(scaleAnimation4);
                                }
                            }
                            a.this.l.a(0.3137255f, true);
                        }
                        if (a.this.m != null) {
                            a.this.m.a(1.0f);
                        }
                    }
                }
            };
            this.h.a((com.ss.android.ugc.aweme.story.shootvideo.a.a) new f(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(boolean z2) {
        if (this.l != null && !z2) {
            this.l.c();
        }
        n();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z2) {
        if (this.h != null && !z2) {
            this.h.f();
        }
        if (this.A != null && !z2) {
            this.A.f();
        }
    }

    private void a(FrameLayout frameLayout) {
        if (PatchProxy.isSupport(new Object[]{frameLayout}, this, f73436a, false, 85217, new Class[]{FrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout}, this, f73436a, false, 85217, new Class[]{FrameLayout.class}, Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = new InfoStickerModule(this.i, this.E, frameLayout, this.f73440e);
            ((InfoStickerModule) this.g).f4002c = true;
            this.g.a(new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73460a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f73460a, false, 85265, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f73460a, false, 85265, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.a(true, false);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f73460a, false, 85266, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f73460a, false, 85266, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.a(false, false);
                }

                public final void a(Effect effect, String str) {
                    if (PatchProxy.isSupport(new Object[]{effect, str}, this, f73460a, false, 85264, new Class[]{Effect.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect, str}, this, f73460a, false, 85264, new Class[]{Effect.class, String.class}, Void.TYPE);
                        return;
                    }
                    a.this.f();
                    if (n.a(effect)) {
                        com.ss.android.ugc.aweme.port.in.a.m.a((ae.b) new q(this, effect), (FragmentActivity) a.this.i, false);
                    } else {
                        a.this.h.a(effect.effect_id, effect.unzipPath, str, effect.effect_type);
                    }
                }
            });
        }
    }

    private i<Boolean> c(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f73436a, false, 85208, new Class[]{String.class}, i.class)) {
            return i.a((Callable<TResult>) new m<TResult>(this), i.f1052b).a((g<TResult, TContinuationResult>) new n<TResult,TContinuationResult>(this, str), (Executor) i.f1051a);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str}, this, f73436a, false, 85208, new Class[]{String.class}, i.class);
    }

    private i<Boolean> d(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f73436a, false, 85209, new Class[]{String.class}, i.class)) {
            return i.a((Callable<TResult>) new o<TResult>(this, str2));
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str2}, this, f73436a, false, 85209, new Class[]{String.class}, i.class);
    }

    public final void a(com.ss.android.ugc.aweme.filter.h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f73436a, false, 85224, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f73436a, false, 85224, new Class[]{com.ss.android.ugc.aweme.filter.h.class}, Void.TYPE);
            return;
        }
        this.f73439d.a(hVar);
        this.f73438c.a(hVar);
        this.f73440e.mSelectedId = hVar.f47602f;
        this.f73440e.mCurFilterLabels = hVar.f47600d;
        this.f73440e.mCurFilterIds = String.valueOf(hVar.f47598b);
        if (PatchProxy.isSupport(new Object[]{hVar, (byte) 0}, this, f73436a, false, 85231, new Class[]{com.ss.android.ugc.aweme.filter.h.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, (byte) 0}, this, f73436a, false, 85231, new Class[]{com.ss.android.ugc.aweme.filter.h.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a("select_filter", h().a("filter_name", hVar.f47600d).a("filter_id", hVar.f47598b).a("enter_method", "slide").a("enter_from", "edit_post_page").f34114b);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73436a, false, 85230, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f73436a, false, 85230, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a(str2, h().f34114b);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73436a, false, 85229, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f73436a, false, 85229, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.a("edit_text", h().a("enter_method", str2).a("enter_from", "edit_post_page").f34114b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: android.view.View} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(com.ss.android.ugc.aweme.shortvideo.view.c r23, a.i r24) throws java.lang.Exception {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            if (r24 == 0) goto L_0x0009
            r24.d()
        L_0x0009:
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.l
            if (r0 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.story.shootvideo.textfont.h r0 = r7.l
            r0.d()
        L_0x0012:
            r9 = 0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f73436a
            r3 = 0
            r4 = 85205(0x14cd5, float:1.19398E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0039
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f73436a
            r3 = 0
            r4 = 85205(0x14cd5, float:1.19398E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x006b
        L_0x0039:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.A
            if (r0 == 0) goto L_0x006b
            java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r0 = r7.F
            if (r0 != 0) goto L_0x0048
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r7.F = r0
        L_0x0048:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r0 = r7.A
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r0.i()
            if (r0 == 0) goto L_0x005b
            java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r0 = r7.F
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a r1 = r7.A
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = r1.i()
            r0.add(r1)
        L_0x005b:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f73440e
            java.lang.String r0 = r0.mainBusinessData
            java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r1 = r7.F
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT
            java.lang.String r0 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((java.lang.String) r0, (java.util.List<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct>) r1, (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d) r2)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f73440e
            r1.mainBusinessData = r0
        L_0x006b:
            com.ss.android.ugc.aweme.story.shootvideo.publish.f r0 = r7.p
            com.ss.android.ugc.aweme.story.shootvideo.publish.d r1 = r7.o
            com.ss.android.ugc.aweme.story.shootvideo.publish.view.PublishBottomLayout r1 = r1.f73703c
            boolean r1 = r1.g
            r23.getClass()
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r8
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.edit.h.f73485a
            r13 = 1
            r14 = 85246(0x14cfe, float:1.19455E-40)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.view.c> r3 = com.ss.android.ugc.aweme.shortvideo.view.c.class
            r15[r9] = r3
            java.lang.Class<java.lang.Runnable> r16 = java.lang.Runnable.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x00aa
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r9] = r8
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.edit.h.f73485a
            r13 = 1
            r14 = 85246(0x14cfe, float:1.19455E-40)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.view.c> r3 = com.ss.android.ugc.aweme.shortvideo.view.c.class
            r15[r9] = r3
            java.lang.Class<java.lang.Runnable> r16 = java.lang.Runnable.class
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            goto L_0x00af
        L_0x00aa:
            com.ss.android.ugc.aweme.story.shootvideo.edit.h r3 = new com.ss.android.ugc.aweme.story.shootvideo.edit.h
            r3.<init>(r8)
        L_0x00af:
            r4 = 2
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Byte r5 = java.lang.Byte.valueOf(r1)
            r10[r9] = r5
            r10[r2] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.publish.f.f73713a
            r13 = 0
            r14 = 85422(0x14dae, float:1.19702E-40)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r15[r9] = r5
            java.lang.Class<java.lang.Runnable> r5 = java.lang.Runnable.class
            r15[r2] = r5
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r8 = 7
            r6 = 9
            r15 = 4
            r14 = 0
            if (r5 == 0) goto L_0x00fe
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r10[r9] = r1
            r10[r2] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.publish.f.f73713a
            r13 = 0
            r1 = 85422(0x14dae, float:1.19702E-40)
            java.lang.Class[] r3 = new java.lang.Class[r4]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Class<java.lang.Runnable> r4 = java.lang.Runnable.class
            r3[r2] = r4
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r5 = r14
            r14 = r1
            r4 = 4
            r15 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02d6
        L_0x00fe:
            r5 = r14
            r4 = 4
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r0.f73714b
            r10.isPrivate = r9
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r0.f73714b
            r10.challenges = r5
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r0.f73714b
            r10.commentSetting = r9
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r0.f73714b
            r10.reactDuetSetting = r9
            com.ss.android.ugc.aweme.account.f r10 = com.ss.android.ugc.aweme.port.in.a.x
            com.ss.android.ugc.aweme.account.model.e r10 = r10.e()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r11 = r0.f73714b
            if (r10 == 0) goto L_0x011f
            java.lang.String r10 = r10.h()
            goto L_0x0121
        L_0x011f:
            java.lang.String r10 = ""
        L_0x0121:
            r11.city = r10
            if (r1 == 0) goto L_0x012e
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r0.f73714b
            com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel r1 = r1.mSaveModel
            com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel r14 = com.ss.android.ugc.aweme.shortvideo.ey.a(r1, r4)
            goto L_0x012f
        L_0x012e:
            r14 = r5
        L_0x012f:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r0.f73714b
            r1.mSaveModel = r14
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r0.f73714b
            java.lang.String r1 = r1.enterFrom
            java.lang.String r10 = "from_chat"
            boolean r1 = android.text.TextUtils.equals(r1, r10)
            if (r1 == 0) goto L_0x01d2
            if (r14 == 0) goto L_0x0144
            r14.setWaterMark(r9)
        L_0x0144:
            com.ss.android.ugc.aweme.story.shootvideo.publish.b r1 = new com.ss.android.ugc.aweme.story.shootvideo.publish.b
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r10 = r0.f73715c
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.f73714b
            r1.<init>(r10, r0)
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r15[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.story.shootvideo.publish.b.f73676a
            r18 = 0
            r19 = 85397(0x14d95, float:1.19667E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Runnable> r10 = java.lang.Runnable.class
            r0[r9] = r10
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x0186
            java.lang.Object[] r15 = new java.lang.Object[r2]
            r15[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.story.shootvideo.publish.b.f73676a
            r18 = 0
            r19 = 85397(0x14d95, float:1.19667E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Runnable> r2 = java.lang.Runnable.class
            r0[r9] = r2
            java.lang.Class r21 = java.lang.Void.TYPE
            r16 = r1
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x02d6
        L_0x0186:
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            r0.element = r2
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r1.f73679d
            int r10 = r10.videoType
            if (r10 == r8) goto L_0x01a9
            com.ss.android.ugc.aweme.shortvideo.edit.cb r10 = r1.f73679d
            int r10 = r10.videoType
            if (r10 != r6) goto L_0x019a
            goto L_0x01a9
        L_0x019a:
            r0.element = r9
            com.ss.android.ugc.aweme.story.shootvideo.publish.upload.f r10 = new com.ss.android.ugc.aweme.story.shootvideo.publish.upload.f
            com.ss.android.ugc.aweme.shortvideo.TTUploaderService r11 = new com.ss.android.ugc.aweme.shortvideo.TTUploaderService
            r11.<init>(r2)
            r10.<init>(r11)
            com.ss.android.ugc.aweme.shortvideo.k r10 = (com.ss.android.ugc.aweme.shortvideo.k) r10
            goto L_0x01b5
        L_0x01a9:
            com.ss.android.ugc.aweme.story.shootvideo.publish.upload.m r10 = new com.ss.android.ugc.aweme.story.shootvideo.publish.upload.m
            com.ss.android.ugc.aweme.shortvideo.TTUploaderService r11 = new com.ss.android.ugc.aweme.shortvideo.TTUploaderService
            r11.<init>(r2)
            r10.<init>(r11)
            com.ss.android.ugc.aweme.shortvideo.k r10 = (com.ss.android.ugc.aweme.shortvideo.k) r10
        L_0x01b5:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r11 = r1.f73679d
            java.lang.String r11 = r11.mPath
            java.lang.String r12 = "mModel.mPath"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r12 = r1.f73679d
            int r12 = r12.videoType
            a.i r2 = r1.a((java.lang.String) r11, (int) r12, (boolean) r2)
            com.ss.android.ugc.aweme.story.shootvideo.publish.b$b r11 = new com.ss.android.ugc.aweme.story.shootvideo.publish.b$b
            r11.<init>(r1, r0, r10, r3)
            a.g r11 = (a.g) r11
            r2.a((a.g<TResult, TContinuationResult>) r11)
            goto L_0x02d6
        L_0x01d2:
            r3.run()
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.publish.f.f73713a
            r13 = 0
            r14 = 85427(0x14db3, float:1.19709E-40)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x01fa
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.publish.f.f73713a
            r13 = 0
            r14 = 85427(0x14db3, float:1.19709E-40)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02d6
        L_0x01fa:
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r1 = r0.f73715c
            if (r1 == 0) goto L_0x02d6
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r1 = r0.f73715c
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x02d6
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r1 = r0.f73715c
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity.f73384b
            r13 = 0
            r14 = 85139(0x14c93, float:1.19305E-40)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r11 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0230
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity.f73384b
            r13 = 0
            r14 = 85139(0x14c93, float:1.19305E-40)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r11 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            r14 = r1
            android.view.View r14 = (android.view.View) r14
            goto L_0x0245
        L_0x0230:
            android.support.v4.app.FragmentManager r1 = r1.getSupportFragmentManager()
            r2 = 2131168176(0x7f070bb0, float:1.7950646E38)
            android.support.v4.app.Fragment r1 = r1.findFragmentById(r2)
            dmt.av.video.VEVideoPublishEditFragment r1 = (dmt.av.video.VEVideoPublishEditFragment) r1
            if (r1 != 0) goto L_0x0241
            r14 = r5
            goto L_0x0245
        L_0x0241:
            android.view.View r14 = r1.getView()
        L_0x0245:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 < r2) goto L_0x02d3
            if (r14 == 0) goto L_0x02d3
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r1 = r0.f73715c
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r1.add(r14)
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r1.width
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r3
            int r10 = r1.height
            float r10 = (float) r10
            float r10 = r10 * r3
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r3 = r0.f73715c
            r11 = 1120403456(0x42c80000, float:100.0)
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r11)
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r11 = r0.f73715c
            r12 = 1126170624(0x43200000, float:160.0)
            float r11 = com.bytedance.common.utility.UIUtils.dip2Px(r11, r12)
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r12 = r0.f73715c
            r13 = 1097859072(0x41700000, float:15.0)
            float r12 = com.bytedance.common.utility.UIUtils.dip2Px(r12, r13)
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r12 = r12 - r1
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r1 = r0.f73715c
            r13 = 1118961664(0x42b20000, float:89.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r13)
            com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity r13 = r0.f73715c
            int r13 = com.ss.android.ugc.aweme.shortvideo.fc.c(r13)
            float r13 = (float) r13
            float r1 = r1 + r13
            float r13 = r3 / r2
            float r15 = r11 / r10
            float r2 = r2 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r2 = r2 - r12
            float r10 = r10 - r11
            float r10 = r10 / r3
            float r10 = r10 - r1
            android.view.ViewPropertyAnimator r1 = r14.animate()
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r13)
            android.view.ViewPropertyAnimator r1 = r1.scaleY(r15)
            float r2 = -r2
            android.view.ViewPropertyAnimator r1 = r1.translationX(r2)
            float r2 = -r10
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            r2 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            com.ss.android.ugc.aweme.story.shootvideo.publish.f$1 r2 = new com.ss.android.ugc.aweme.story.shootvideo.publish.f$1
            r2.<init>(r14)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r2)
            r0.start()
            goto L_0x02d6
        L_0x02d3:
            r0.a()
        L_0x02d6:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f73436a
            r3 = 0
            r10 = 85233(0x14cf1, float:1.19437E-40)
            java.lang.Class[] r11 = new java.lang.Class[r9]
            java.lang.Class r12 = java.lang.Void.TYPE
            r1 = r22
            r13 = 4
            r4 = r10
            r10 = r5
            r5 = r11
            r11 = 9
            r6 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0305
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f73436a
            r3 = 0
            r4 = 85233(0x14cf1, float:1.19437E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r0 = r10
            goto L_0x0400
        L_0x0305:
            com.ss.android.ugc.aweme.utils.a r12 = com.ss.android.ugc.aweme.utils.a.f75468b
            java.lang.String r14 = "publish"
            com.ss.android.ugc.aweme.app.d.d r0 = r22.h()
            java.lang.String r1 = "filter_list"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.mCurFilterLabels
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "filter_id_list"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.mCurFilterIds
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.mShootWay
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "prop_list"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.mStickerID
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "prop_selected_from"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.mPropSource
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "effect_list"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.getEditEffectList()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "info_sticker_list"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            java.lang.String r2 = r2.getInfoStickerList()
            com.ss.android.ugc.aweme.app.d.d r15 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r6 = "story_mode"
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f73436a
            r3 = 0
            r4 = 85234(0x14cf2, float:1.19438E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r1 = r22
            r10 = r6
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0385
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f73436a
            r3 = 0
            r4 = 85234(0x14cf2, float:1.19438E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r22
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x03c7
        L_0x0385:
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f73440e
            if (r1 == 0) goto L_0x03c7
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f73440e
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.getAvetParameter()
            int r1 = r1.getShootMode()
            if (r1 != r11) goto L_0x039a
            java.lang.String r0 = "text"
            goto L_0x03c7
        L_0x039a:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f73440e
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.getAvetParameter()
            int r1 = r1.getShootMode()
            r2 = 6
            if (r1 != r2) goto L_0x03aa
            java.lang.String r0 = "fanfu"
            goto L_0x03c7
        L_0x03aa:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f73440e
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.getAvetParameter()
            int r1 = r1.getShootMode()
            if (r1 != r13) goto L_0x03b9
            java.lang.String r0 = "normal"
            goto L_0x03c7
        L_0x03b9:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f73440e
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.getAvetParameter()
            int r1 = r1.getShootMode()
            if (r1 != r8) goto L_0x03c7
            java.lang.String r0 = "jujiao"
        L_0x03c7:
            com.ss.android.ugc.aweme.app.d.d r0 = r15.a((java.lang.String) r10, (java.lang.String) r0)
            java.lang.String r1 = "story_shoot_entrance"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f73440e
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r2 = r2.getAvetParameter()
            java.lang.String r2 = r2.getStoryShootEntrance()
            com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            r12.a(r14, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r7.f73440e
            java.lang.String r0 = r0.enterFrom
            java.lang.String r1 = "from_chat"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x03ff
            java.lang.String r0 = "im_publish"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "shoot_way"
            java.lang.String r3 = "story"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x03ff:
            r0 = 0
        L_0x0400:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.edit.a.a(com.ss.android.ugc.aweme.shortvideo.view.c, a.i):java.lang.Object");
    }

    public final void a(com.ss.android.ugc.aweme.filter.h hVar, com.ss.android.ugc.aweme.filter.h hVar2, float f2) {
        com.ss.android.ugc.aweme.filter.h hVar3 = hVar;
        com.ss.android.ugc.aweme.filter.h hVar4 = hVar2;
        if (PatchProxy.isSupport(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, f73436a, false, 85223, new Class[]{com.ss.android.ugc.aweme.filter.h.class, com.ss.android.ugc.aweme.filter.h.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar3, hVar4, Float.valueOf(f2)}, this, f73436a, false, 85223, new Class[]{com.ss.android.ugc.aweme.filter.h.class, com.ss.android.ugc.aweme.filter.h.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.a(hVar3.j, hVar4.j, f2, 0.8f);
        }
    }
}
