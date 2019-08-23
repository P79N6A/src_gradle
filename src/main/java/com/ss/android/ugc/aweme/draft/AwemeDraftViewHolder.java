package com.ss.android.ugc.aweme.draft;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.facebook.common.references.CloseableReference;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.a.j;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.cc;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.o.h;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.u.au;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AwemeDraftViewHolder extends AnimatedViewHolder<c> implements LifecycleObserver, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3080a;

    /* renamed from: b  reason: collision with root package name */
    MentionTextView f3081b;

    /* renamed from: c  reason: collision with root package name */
    TextView f3082c;

    /* renamed from: d  reason: collision with root package name */
    ImageView f3083d;

    /* renamed from: e  reason: collision with root package name */
    RemoteImageView f3084e;
    View k;
    ImageView l;
    AppCompatCheckBox m;
    DraftItemView n;
    Space o;
    Space p;
    RelativeLayout q;
    public boolean r;
    b s;
    public Context t;
    com.ss.android.ugc.aweme.shortvideo.view.c u;
    long v;
    private WeakHandler w;
    private com.ss.android.ugc.b.b x;
    private Map<ImageView, CloseableReference<CloseableImage>> y;

    abstract class a implements a.h {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f43392c;

        /* renamed from: d  reason: collision with root package name */
        d f43393d;

        /* renamed from: e  reason: collision with root package name */
        String f43394e;

        a(d dVar, String str) {
            this.f43393d = dVar;
            this.f43394e = str;
        }

        public final void a(String str, int i, String str2, int i2) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f43392c, false, 38392, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f43392c, false, 38392, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            final int i3 = i2;
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43396a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f43396a, false, 38394, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f43396a, false, 38394, new Class[0], Void.TYPE);
                        return;
                    }
                    if (a.this.f43393d != null) {
                        a.this.f43393d.setProgress(i3);
                    }
                }
            });
        }

        public final void a(String str, int i, String str2, Exception exc) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2, exc}, this, f43392c, false, 38393, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, exc}, this, f43392c, false, 38393, new Class[]{String.class, Integer.TYPE, String.class, Exception.class}, Void.TYPE);
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.b(this.f43393d.getContext(), AwemeDraftViewHolder.this.t.getString(C0906R.string.a7h)).a();
            AwemeDraftViewHolder.this.dismiss(this.f43393d);
        }

        public void a(String str, int i, String str2, float[] fArr) {
            String str3 = str;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str2, fArr}, this, f43392c, false, 38391, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str2, fArr}, this, f43392c, false, 38391, new Class[]{String.class, Integer.TYPE, String.class, float[].class}, Void.TYPE);
            } else if (i2 == 3) {
                com.ss.android.ugc.aweme.video.b.c(str3, this.f43394e);
                AwemeDraftViewHolder.this.dismiss(this.f43393d);
            } else {
                if (i2 == 4) {
                    AwemeDraftViewHolder.this.dismiss(this.f43393d);
                }
            }
        }
    }

    public interface b {
        void a(View view, c cVar);
    }

    public final void a() {
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3080a, false, 38369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3080a, false, 38369, new Class[0], Void.TYPE);
            return;
        }
        this.x.a((com.ss.android.ugc.b.a.a) null);
    }

    public final void b() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f3080a, false, 38381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3080a, false, 38381, new Class[0], Void.TYPE);
            return;
        }
        ((c) this.g).l(new SecureRandom().nextInt(Integer.MAX_VALUE));
        if (this.u != null) {
            this.u.dismiss();
            this.u = null;
        }
        a((c) this.g);
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", ((c) this.g).p()).a("shoot_way", ((c) this.g).u()).a("draft_id", ((c) this.g).q()).a("last_save_time", ((c) this.g).D).a("edit_time", System.currentTimeMillis());
        if (((c) this.g).L == 2) {
            a2.a("content_type", "slideshow").a("content_source", "upload");
        } else {
            if (((c) this.g).I()) {
                str = "mv";
            } else {
                str = "video";
            }
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("content_type", str);
            if (((c) this.g).I() || ((c) this.g).l() == 1 || ((c) this.g).l() == 0) {
                str2 = "upload";
            } else {
                str2 = "shoot";
            }
            a3.a("content_source", str2);
        }
        r.a("edit_draft", (Map) a2.f34114b);
        if (((c) this.g).L != 2) {
            au.b("click_draft_button");
            au.a("draft");
            Intent intent = new Intent(this.t, VideoPublishActivity.class);
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra("translation_type", 3);
            intent.putExtra("args", new cc("AwemeDraftViewHolder").a((c) this.g));
            com.ss.android.ugc.aweme.util.c.a("GoPublishActivity from draft");
            intent.putExtra("fromDraft", 1);
            this.t.startActivity(intent);
            ej.a().a(((c) this.g).f43438f);
        } else if (!((Activity) this.t).isFinishing()) {
            com.ss.android.ugc.aweme.port.in.a.s.a(this.t, (c) this.g);
        }
    }

    public void dismiss(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3080a, false, 38377, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3080a, false, 38377, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    private void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3080a, false, 38380, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3080a, false, 38380, new Class[]{c.class}, Void.TYPE);
            return;
        }
        m mVar = (m) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, m.class);
        if (!TextUtils.isEmpty(mVar.b()) && mVar.b().equals(l.a(cVar))) {
            mVar.a((String) null);
            com.ss.android.ugc.aweme.port.in.a.t.a(false);
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f3080a, false, 38367, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f3080a, false, 38367, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        this.t.startActivity((Intent) message.obj);
        if (this.u != null && this.u.isShowing()) {
            this.u.dismiss();
            this.u = null;
        }
    }

    private boolean a(String str) {
        CloseableReference closeableReference;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3080a, false, 38370, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f3080a, false, 38370, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{str2}, null, com.ss.android.ugc.aweme.shortvideo.helper.d.f68124a, true, 77455, new Class[]{String.class}, CloseableReference.class)) {
            closeableReference = (CloseableReference) PatchProxy.accessDispatch(new Object[]{str2}, null, com.ss.android.ugc.aweme.shortvideo.helper.d.f68124a, true, 77455, new Class[]{String.class}, CloseableReference.class);
        } else {
            com.facebook.imagepipeline.cache.m bitmapMemoryCache = Fresco.getImagePipelineFactory().getBitmapMemoryCache();
            com.facebook.imagepipeline.cache.c cVar = new com.facebook.imagepipeline.cache.c("file://" + str2, null, RotationOptions.autoRotate(), ImageDecodeOptions.defaults(), null, null, null);
            closeableReference = bitmapMemoryCache.get(cVar);
        }
        CloseableReference closeableReference2 = closeableReference;
        if (closeableReference2 == null) {
            return false;
        }
        try {
            a((ImageView) this.f3084e, closeableReference2.clone());
            return a((ImageView) this.f3084e, ((com.facebook.imagepipeline.image.a) closeableReference2.get()).getUnderlyingBitmap());
        } finally {
            CloseableReference.closeSafely(closeableReference2);
        }
    }

    public final void a(ImageView imageView, CloseableReference<CloseableImage> closeableReference) {
        ImageView imageView2 = imageView;
        CloseableReference<CloseableImage> closeableReference2 = closeableReference;
        if (PatchProxy.isSupport(new Object[]{imageView2, closeableReference2}, this, f3080a, false, 38374, new Class[]{ImageView.class, CloseableReference.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, closeableReference2}, this, f3080a, false, 38374, new Class[]{ImageView.class, CloseableReference.class}, Void.TYPE);
            return;
        }
        CloseableReference put = this.y.put(imageView2, closeableReference2);
        if (put != null) {
            CloseableReference.closeSafely(put);
        }
    }

    public final boolean a(ImageView imageView, Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{imageView, bitmap}, this, f3080a, false, 38375, new Class[]{ImageView.class, Bitmap.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageView, bitmap}, this, f3080a, false, 38375, new Class[]{ImageView.class, Bitmap.class}, Boolean.TYPE)).booleanValue();
        } else if (bitmap == null || bitmap.isRecycled()) {
            return false;
        } else {
            imageView.setImageBitmap(bitmap);
            return true;
        }
    }

    public final void a(c cVar, int i) {
        boolean z;
        EffectPointModel effectPointModel;
        boolean z2;
        String str;
        final c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i)}, this, f3080a, false, 38371, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i)}, this, f3080a, false, 38371, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
        } else if (cVar2 != null && cVar2.f43435c != null) {
            this.g = cVar2;
            if (this.r) {
                DraftItemView draftItemView = this.n;
                if (PatchProxy.isSupport(new Object[0], draftItemView, DraftItemView.f43415a, false, 38458, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], draftItemView, DraftItemView.f43415a, false, 38458, new Class[0], Void.TYPE);
                } else if (!draftItemView.f43418d) {
                    draftItemView.f43418d = true;
                    draftItemView.f43416b.startScroll(0, 0, -draftItemView.f43417c, 0, 200);
                }
                this.l.animate().alpha(0.0f).setDuration(200).start();
            } else {
                DraftItemView draftItemView2 = this.n;
                if (PatchProxy.isSupport(new Object[0], draftItemView2, DraftItemView.f43415a, false, 38459, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], draftItemView2, DraftItemView.f43415a, false, 38459, new Class[0], Void.TYPE);
                } else if (draftItemView2.f43418d) {
                    draftItemView2.f43418d = false;
                    draftItemView2.f43416b.startScroll(-draftItemView2.f43417c, 0, draftItemView2.f43417c, 0, 200);
                }
                this.l.animate().alpha(1.0f).setDuration(200).start();
                ((c) this.g).w = false;
            }
            com.ss.android.ugc.aweme.common.m mVar = null;
            this.m.setOnCheckedChangeListener(null);
            this.m.setChecked(((c) this.g).w);
            this.m.setOnCheckedChangeListener(new e(this));
            this.f3084e.setTag(cVar.S());
            this.f3084e.setImageResource(2130839300);
            if (((c) this.g).L == 2) {
                if (((c) this.g).f43436d == null) {
                    this.f3084e.setImageURI("");
                } else if (!a(((c) this.g).S())) {
                    ((c) this.g).f43436d.getPhotoMovieCover(new PhotoMovieContext.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f43380a;

                        public final void a(@Nullable Bitmap bitmap, int i, int i2) {
                            final Bitmap bitmap2 = bitmap;
                            if (PatchProxy.isSupport(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43380a, false, 38385, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bitmap2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f43380a, false, 38385, new Class[]{Bitmap.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f43383a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f43383a, false, 38386, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f43383a, false, 38386, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (bitmap2 != null && !bitmap2.isRecycled() && AwemeDraftViewHolder.this.f3084e != null && AwemeDraftViewHolder.this.f3084e.getTag().equals(cVar2.S())) {
                                        AwemeDraftViewHolder.this.a((ImageView) AwemeDraftViewHolder.this.f3084e, bitmap2);
                                        CloseableReference a2 = com.ss.android.ugc.aweme.shortvideo.helper.d.a(bitmap2);
                                        com.ss.android.ugc.aweme.shortvideo.helper.d.a(a2, ((c) AwemeDraftViewHolder.this.g).S());
                                        AwemeDraftViewHolder.this.a((ImageView) AwemeDraftViewHolder.this.f3084e, a2.clone());
                                    }
                                }
                            });
                        }
                    });
                }
            } else if (((c) this.g).I()) {
                String J = ((c) this.g).J();
                if (com.ss.android.ugc.aweme.video.b.b(J)) {
                    com.ss.android.ugc.aweme.base.c.a(this.f3084e, Uri.fromFile(new File(J)).toString());
                }
            } else {
                if (!a(((c) this.g).S() + ((c) this.g).N)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3080a, false, 38373, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3080a, false, 38373, new Class[0], Void.TYPE);
                    } else if (this.g != null) {
                        String f2 = ((c) this.g).f();
                        ArrayList arrayList = new ArrayList();
                        if (((c) this.g).z != null) {
                            arrayList.addAll(((c) this.g).z.getEffectPointModels());
                        }
                        int i2 = ((c) this.g).n;
                        if (i2 != 0) {
                            effectPointModel = new EffectPointModel();
                            effectPointModel.setKey(String.valueOf(i2));
                            effectPointModel.setEndPoint(((c) this.g).G);
                        } else {
                            effectPointModel = null;
                        }
                        if (effectPointModel != null) {
                            arrayList.add(effectPointModel);
                            if (effectPointModel.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                                if (!TextUtils.isEmpty(((c) this.g).p)) {
                                    f2 = ((c) this.g).p;
                                }
                                str = f2;
                                z2 = true;
                                ai.d("AwemeDraftViewHolder SetCoverImage EffectPointModelList:" + arrayList + "\n filterId:" + ((c) this.g).a());
                                if (((c) this.g).L() != null && !((c) this.g).L().f43447d.isEmpty()) {
                                    j jVar = ((c) this.g).L().f43447d.get(0);
                                    mVar = new com.ss.android.ugc.aweme.common.m(jVar.f43459d, jVar.f43460e, jVar.g);
                                }
                                com.ss.android.ugc.aweme.shortvideo.presenter.a.a(str, arrayList, w.a(((c) this.g).l).j, (int) (((c) this.g).N * 1000.0f), z2, ((Integer) ((c) this.g).P().get(0)).intValue(), mVar, new IEffectService.OnVideoCoverCallback() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f43386a;

                                    public final void onGetVideoCoverFailed(int i) {
                                    }

                                    public final void onGetVideoCoverSuccess(@NonNull Bitmap bitmap) {
                                        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f43386a, false, 38387, new Class[]{Bitmap.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f43386a, false, 38387, new Class[]{Bitmap.class}, Void.TYPE);
                                            return;
                                        }
                                        if (AwemeDraftViewHolder.this.f3084e != null) {
                                            AwemeDraftViewHolder.this.a((ImageView) AwemeDraftViewHolder.this.f3084e, bitmap);
                                            CloseableReference a2 = com.ss.android.ugc.aweme.shortvideo.helper.d.a(bitmap);
                                            com.ss.android.ugc.aweme.shortvideo.helper.d.a(a2, ((c) AwemeDraftViewHolder.this.g).S() + ((c) AwemeDraftViewHolder.this.g).N);
                                            AwemeDraftViewHolder.this.a((ImageView) AwemeDraftViewHolder.this.f3084e, a2.clone());
                                        }
                                    }
                                });
                            }
                        }
                        str = f2;
                        z2 = false;
                        ai.d("AwemeDraftViewHolder SetCoverImage EffectPointModelList:" + arrayList + "\n filterId:" + ((c) this.g).a());
                        j jVar2 = ((c) this.g).L().f43447d.get(0);
                        mVar = new com.ss.android.ugc.aweme.common.m(jVar2.f43459d, jVar2.f43460e, jVar2.g);
                        com.ss.android.ugc.aweme.shortvideo.presenter.a.a(str, arrayList, w.a(((c) this.g).l).j, (int) (((c) this.g).N * 1000.0f), z2, ((Integer) ((c) this.g).P().get(0)).intValue(), mVar, new IEffectService.OnVideoCoverCallback() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f43386a;

                            public final void onGetVideoCoverFailed(int i) {
                            }

                            public final void onGetVideoCoverSuccess(@NonNull Bitmap bitmap) {
                                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f43386a, false, 38387, new Class[]{Bitmap.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f43386a, false, 38387, new Class[]{Bitmap.class}, Void.TYPE);
                                    return;
                                }
                                if (AwemeDraftViewHolder.this.f3084e != null) {
                                    AwemeDraftViewHolder.this.a((ImageView) AwemeDraftViewHolder.this.f3084e, bitmap);
                                    CloseableReference a2 = com.ss.android.ugc.aweme.shortvideo.helper.d.a(bitmap);
                                    com.ss.android.ugc.aweme.shortvideo.helper.d.a(a2, ((c) AwemeDraftViewHolder.this.g).S() + ((c) AwemeDraftViewHolder.this.g).N);
                                    AwemeDraftViewHolder.this.a((ImageView) AwemeDraftViewHolder.this.f3084e, a2.clone());
                                }
                            }
                        });
                    }
                }
            }
            this.f3081b.setSpanColor(this.t.getResources().getColor(C0906R.color.zl));
            String str2 = cVar2.f43435c.f43423a;
            if (StringUtils.isEmpty(str2)) {
                this.f3081b.setText(this.t.getText(C0906R.string.a86));
                this.f3081b.setTextColor(this.t.getResources().getColor(C0906R.color.zx));
            } else {
                this.f3081b.setText(str2);
                if (cVar2.f43435c.f43424b != null) {
                    this.f3081b.a((List<TextExtraStruct>) h.a(cVar2.f43435c.f43424b), (MentionTextView.d) new f(true));
                    for (AVTextExtraStruct next : cVar2.f43435c.f43424b) {
                        if (com.ss.android.ugc.aweme.port.in.a.j.e() && next.getType() == 0 && !TextUtils.isEmpty(next.getAwemeId())) {
                            this.f3081b.a(next.getStart(), next.getEnd(), new com.ss.android.ugc.aweme.shortvideo.n.a(this.f3081b.getContext(), this.f3081b, (int) (((float) UIUtils.getScreenWidth(this.f3081b.getContext())) - UIUtils.dip2Px(this.f3081b.getContext(), 112.0f))));
                        }
                    }
                }
                this.f3081b.setTextColor(this.t.getResources().getColor(C0906R.color.zt));
            }
            List<com.ss.android.ugc.aweme.shortvideo.c> list = cVar2.f43435c.f43425c;
            StringBuilder sb = new StringBuilder();
            if (list != null && list.size() > 0) {
                Iterator<com.ss.android.ugc.aweme.shortvideo.c> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.ss.android.ugc.aweme.shortvideo.c next2 = it2.next();
                    if (next2.getChallengeName() == null) {
                        sb = new StringBuilder();
                        break;
                    } else {
                        sb.append(next2.getChallengeName());
                        sb.append(" ");
                    }
                }
            }
            String sb2 = sb.toString();
            if (StringUtils.isEmpty(sb2)) {
                this.f3082c.setText(C0906R.string.a83);
                this.f3083d.setImageResource(2130838890);
                this.f3082c.setTextColor(this.t.getResources().getColor(C0906R.color.a0g));
            } else {
                this.f3082c.setText(sb2);
                this.f3082c.setTextColor(this.t.getResources().getColor(C0906R.color.a0b));
                this.f3083d.setImageResource(2130838889);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3080a, false, 38372, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3080a, false, 38372, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = com.ss.android.ugc.aweme.port.in.a.j.f();
            }
            if (z || com.ss.android.ugc.aweme.i18n.c.a()) {
                this.f3082c.setVisibility(8);
                this.f3083d.setVisibility(8);
            } else {
                this.f3082c.setVisibility(0);
                this.f3083d.setVisibility(0);
            }
            ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.q.getLayoutParams();
            int dip2Px = (int) UIUtils.dip2Px(this.t, 16.0f);
            int dip2Px2 = (int) UIUtils.dip2Px(this.t, 96.0f);
            if (!cVar2.x) {
                this.k.setVisibility(4);
                layoutParams.height = 0;
                layoutParams2.height = dip2Px2 - dip2Px;
            } else {
                this.k.setVisibility(0);
                layoutParams.height = dip2Px;
                layoutParams2.height = dip2Px2;
            }
            this.p.setLayoutParams(layoutParams);
            this.q.setLayoutParams(layoutParams2);
        }
    }

    public AwemeDraftViewHolder(View view, Map<ImageView, CloseableReference<CloseableImage>> map, b bVar) {
        super(view);
        if (PatchProxy.isSupport(new Object[]{view}, this, f3080a, false, 38368, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3080a, false, 38368, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f3081b = (MentionTextView) ViewCompat.requireViewById(view, C0906R.id.ip);
            this.f3082c = (TextView) ViewCompat.requireViewById(view, C0906R.id.ii);
            this.f3083d = (ImageView) ViewCompat.requireViewById(view, C0906R.id.rp);
            this.f3084e = (RemoteImageView) ViewCompat.requireViewById(view, C0906R.id.a1a);
            this.k = ViewCompat.requireViewById(view, C0906R.id.da2);
            this.l = (ImageView) ViewCompat.requireViewById(view, C0906R.id.a7s);
            this.m = (AppCompatCheckBox) ViewCompat.requireViewById(view, C0906R.id.sb);
            this.n = (DraftItemView) ViewCompat.requireViewById(view, C0906R.id.bg2);
            this.o = (Space) ViewCompat.requireViewById(view, C0906R.id.a7r);
            this.p = (Space) ViewCompat.requireViewById(view, C0906R.id.a7q);
            this.q = (RelativeLayout) ViewCompat.requireViewById(view, C0906R.id.a7o);
            this.q.setOnClickListener(new c(this));
            this.q.setOnLongClickListener(new d(this));
        }
        this.s = bVar;
        this.t = view.getContext();
        ((FragmentActivity) this.t).getLifecycle().addObserver(this);
        this.w = new WeakHandler(this);
        this.x = new com.ss.android.ugc.b.b();
        this.y = map;
    }
}
