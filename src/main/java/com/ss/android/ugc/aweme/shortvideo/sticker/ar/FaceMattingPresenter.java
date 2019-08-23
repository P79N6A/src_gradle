package com.ss.android.ugc.aweme.shortvideo.sticker.ar;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ViewStubCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.c.c;
import com.ss.android.medialib.g;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.model.Face;
import com.ss.android.ugc.aweme.shortvideo.sticker.a.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.m;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectFaceViewModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.dd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FaceMattingPresenter implements LifecycleObserver, m.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3982a;

    /* renamed from: b  reason: collision with root package name */
    public b f3983b;

    /* renamed from: c  reason: collision with root package name */
    AppCompatActivity f3984c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3985d;

    /* renamed from: e  reason: collision with root package name */
    public FaceStickerBean f3986e = FaceStickerBean.NONE;

    /* renamed from: f  reason: collision with root package name */
    public Face f3987f;
    public List<Face> g = new LinkedList();
    private boolean h;
    private boolean i;
    private c j = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69312a;

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69312a, false, 78839, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69312a, false, 78839, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z && FaceMattingPresenter.this.f3987f != null && g.a(FaceMattingPresenter.this.f3987f.path) && g.a(FaceMattingPresenter.this.f3987f.origin_path)) {
                FaceMattingPresenter.this.b().a(FaceMattingPresenter.this.f3987f.path);
            }
        }
    };

    public final void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
    }

    public final void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
    }

    public final void c(@NonNull FaceStickerBean faceStickerBean) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3982a, false, 78830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78830, new Class[0], Void.TYPE);
            return;
        }
        this.f3983b.a(new ArrayList(this.g));
    }

    public final MediaRecordPresenterViewModel b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3982a, false, 78835, new Class[0], MediaRecordPresenterViewModel.class)) {
            return (MediaRecordPresenterViewModel) ViewModelProviders.of((FragmentActivity) this.f3984c).get(MediaRecordPresenterViewModel.class);
        }
        return (MediaRecordPresenterViewModel) PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78835, new Class[0], MediaRecordPresenterViewModel.class);
    }

    /* access modifiers changed from: package-private */
    public EffectFaceViewModel c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3982a, false, 78836, new Class[0], EffectFaceViewModel.class)) {
            return (EffectFaceViewModel) ViewModelProviders.of((FragmentActivity) this.f3984c).get(EffectFaceViewModel.class);
        }
        return (EffectFaceViewModel) PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78836, new Class[0], EffectFaceViewModel.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3982a, false, 78837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78837, new Class[0], Void.TYPE);
            return;
        }
        FaceBeautyInvoker.removeSlamDetectListener(this.j);
        b().f69325b.a((Bitmap) null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3982a, false, 78832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78832, new Class[0], Void.TYPE);
            return;
        }
        this.f3983b.e();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3982a, false, 78834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78834, new Class[0], Void.TYPE);
        } else if (a.H.E().c(this.f3984c) == 0) {
            c().a();
        } else {
            a.H.E().a(this.f3984c, new a(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3982a, false, 78833, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78833, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3987f != null) {
            FaceBeautyInvoker.addSlamDetectListener(this.j);
        }
        if (this.i && this.f3986e != FaceStickerBean.NONE) {
            this.f3983b.a();
            e();
        }
    }

    public static boolean d(FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, null, f3982a, true, 78831, new Class[]{FaceStickerBean.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, null, f3982a, true, 78831, new Class[]{FaceStickerBean.class}, Boolean.TYPE)).booleanValue();
        } else if (faceStickerBean2 == FaceStickerBean.NONE || !faceStickerBean.getTypes().contains("AR") || !faceStickerBean.getTypes().contains("PhotoFace")) {
            return false;
        } else {
            return true;
        }
    }

    public final void b(@NonNull FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3982a, false, 78828, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3982a, false, 78828, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.f3983b.d();
        if (faceStickerBean.getStickerId() == 0 || faceStickerBean.equals(this.f3986e)) {
            this.f3986e = FaceStickerBean.NONE;
        }
        d();
        this.f3983b.b();
    }

    public final void a(@NonNull FaceStickerBean faceStickerBean) {
        MutableLiveData<List<Face>> mutableLiveData;
        LiveData liveData;
        LiveData liveData2;
        MutableLiveData<Bitmap> mutableLiveData2;
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f3982a, false, 78826, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f3982a, false, 78826, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        this.f3983b.d();
        if (!d(faceStickerBean)) {
            this.f3986e = FaceStickerBean.NONE;
            this.f3983b.b();
            this.f3987f = null;
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3982a, false, 78827, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3982a, false, 78827, new Class[0], Void.TYPE);
        } else if (!this.i) {
            EffectFaceViewModel c2 = c();
            if (PatchProxy.isSupport(new Object[0], c2, EffectFaceViewModel.f70251a, false, 79893, new Class[0], MutableLiveData.class)) {
                mutableLiveData = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], c2, EffectFaceViewModel.f70251a, false, 79893, new Class[0], MutableLiveData.class);
            } else {
                if (c2.f70252b == null) {
                    c2.f70256f.start();
                    c2.g = new Handler(c2.f70256f.getLooper());
                    c2.f70252b = new MutableLiveData<>();
                    if (c2.f70254d == null) {
                        c2.f70254d = new MutableLiveData<>();
                    }
                    if (c2.f70253c == null) {
                        c2.f70253c = new MutableLiveData<>();
                    }
                    c2.f70255e = new com.ss.android.ugc.aweme.shortvideo.sticker.a.c();
                    c2.f70255e.f69265d = new c.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f70257a;

                        public final void a(List<Face> list, List<Face> list2, boolean z) {
                            final List<Face> list3 = list;
                            final List<Face> list4 = list2;
                            int i = 0;
                            if (PatchProxy.isSupport(new Object[]{list3, list4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f70257a, false, 79899, new Class[]{List.class, List.class, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{list3, list4, Byte.valueOf(z)}, this, f70257a, false, 79899, new Class[]{List.class, List.class, Boolean.TYPE}, Void.TYPE);
                                return;
                            }
                            StringBuilder sb = new StringBuilder("EffectFaceViewModel onFaceChanged  ");
                            if (list3 != null) {
                                i = list.size();
                            }
                            sb.append(i);
                            final boolean z2 = z;
                            com.ss.android.b.a.a.a.b(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f70259a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f70259a, false, 79900, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f70259a, false, 79900, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (list3 != null) {
                                        EffectFaceViewModel.this.f70252b.setValue(list3);
                                    }
                                    if (list4 != null) {
                                        EffectFaceViewModel.this.f70253c.setValue(list4);
                                    }
                                    EffectFaceViewModel.this.f70254d.setValue(Boolean.valueOf(z2));
                                }
                            });
                        }
                    };
                    com.ss.android.ugc.aweme.shortvideo.sticker.a.c cVar = c2.f70255e;
                    if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69262a, false, 79047, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.shortvideo.sticker.a.c.f69262a, false, 79047, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f69268a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f69268a, false, 79060, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f69268a, false, 79060, new Class[0], Void.TYPE);
                                    return;
                                }
                                List b2 = c.this.f69266e.b();
                                c cVar = c.this;
                                if (PatchProxy.isSupport(new Object[]{b2}, cVar, c.f69262a, false, 79048, new Class[]{List.class}, Void.TYPE)) {
                                    c cVar2 = cVar;
                                    PatchProxy.accessDispatch(new Object[]{b2}, cVar2, c.f69262a, false, 79048, new Class[]{List.class}, Void.TYPE);
                                } else {
                                    dd.a();
                                    HashSet hashSet = new HashSet();
                                    Iterator it2 = b2.iterator();
                                    while (it2.hasNext()) {
                                        Face face = (Face) it2.next();
                                        if (!cVar.a(face)) {
                                            hashSet.add(face.origin_path);
                                            it2.remove();
                                        }
                                    }
                                    if (hashSet.size() > 0) {
                                        cVar.f69266e.a(hashSet);
                                    }
                                }
                                c.this.a(b2, null, c.this.f69264c);
                            }
                        });
                    }
                }
                mutableLiveData = c2.f70252b;
            }
            mutableLiveData.observe(this.f3984c, new Observer<List<Face>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69316a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    List list = (List) obj;
                    if (PatchProxy.isSupport(new Object[]{list}, this, f69316a, false, 78842, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f69316a, false, 78842, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    if (list != null && !list.isEmpty()) {
                        FaceMattingPresenter.this.g.addAll(list);
                        FaceMattingPresenter.this.a();
                    }
                }
            });
            EffectFaceViewModel c3 = c();
            if (PatchProxy.isSupport(new Object[0], c3, EffectFaceViewModel.f70251a, false, 79895, new Class[0], LiveData.class)) {
                liveData = (LiveData) PatchProxy.accessDispatch(new Object[0], c3, EffectFaceViewModel.f70251a, false, 79895, new Class[0], LiveData.class);
            } else {
                if (c3.f70254d == null) {
                    c3.f70254d = new MutableLiveData<>();
                }
                liveData = c3.f70254d;
            }
            liveData.observe(this.f3984c, new Observer<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69318a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.isSupport(new Object[]{bool}, this, f69318a, false, 78843, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, f69318a, false, 78843, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    if (!bool.booleanValue()) {
                        FaceMattingPresenter.this.f3983b.c();
                    }
                }
            });
            EffectFaceViewModel c4 = c();
            if (PatchProxy.isSupport(new Object[0], c4, EffectFaceViewModel.f70251a, false, 79896, new Class[0], LiveData.class)) {
                liveData2 = (LiveData) PatchProxy.accessDispatch(new Object[0], c4, EffectFaceViewModel.f70251a, false, 79896, new Class[0], LiveData.class);
            } else {
                if (c4.f70253c == null) {
                    c4.f70253c = new MutableLiveData<>();
                }
                liveData2 = c4.f70253c;
            }
            liveData2.observe(this.f3984c, new Observer<List<Face>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69320a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    List<Face> list = (List) obj;
                    if (PatchProxy.isSupport(new Object[]{list}, this, f69320a, false, 78844, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f69320a, false, 78844, new Class[]{List.class}, Void.TYPE);
                    } else if (list != null && !list.isEmpty()) {
                        for (Face remove : list) {
                            FaceMattingPresenter.this.g.remove(remove);
                        }
                        FaceMattingPresenter.this.a();
                    }
                }
            });
            MediaRecordPresenterViewModel b2 = b();
            if (PatchProxy.isSupport(new Object[0], b2, MediaRecordPresenterViewModel.f69324a, false, 78847, new Class[0], MutableLiveData.class)) {
                mutableLiveData2 = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], b2, MediaRecordPresenterViewModel.f69324a, false, 78847, new Class[0], MutableLiveData.class);
            } else {
                if (b2.f69327d == null) {
                    b2.f69327d = new MutableLiveData<>();
                }
                mutableLiveData2 = b2.f69327d;
            }
            mutableLiveData2.observe(this.f3984c, new Observer<Bitmap>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69322a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f69322a, false, 78845, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f69322a, false, 78845, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    FaceMattingPresenter.this.b().f69325b.a(bitmap);
                }
            });
            this.i = true;
        }
        if (!this.h) {
            e();
        }
        if (this.f3985d) {
            this.f3983b.a();
        }
        this.f3986e = faceStickerBean2;
    }

    public FaceMattingPresenter(AppCompatActivity appCompatActivity, ViewStubCompat viewStubCompat) {
        this.f3983b = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.a.a(viewStubCompat, new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69314a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f69314a, false, 78841, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69314a, false, 78841, new Class[0], Void.TYPE);
                    return;
                }
                FaceMattingPresenter.this.d();
                FaceMattingPresenter.this.f3987f = null;
                MediaRecordPresenterViewModel b2 = FaceMattingPresenter.this.b();
                if (PatchProxy.isSupport(new Object[0], b2, MediaRecordPresenterViewModel.f69324a, false, 78849, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], b2, MediaRecordPresenterViewModel.f69324a, false, 78849, new Class[0], Void.TYPE);
                    return;
                }
                if (b2.f69326c != null) {
                    b2.f69326c.d();
                }
            }

            public final void a(Face face) {
                if (PatchProxy.isSupport(new Object[]{face}, this, f69314a, false, 78840, new Class[]{Face.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{face}, this, f69314a, false, 78840, new Class[]{Face.class}, Void.TYPE);
                    return;
                }
                FaceMattingPresenter.this.b().a(face.path);
                FaceMattingPresenter.this.f3987f = face;
                r.a("click_prop_pic", (Map) d.a().a("prop_id", String.valueOf(FaceMattingPresenter.this.f3986e.getStickerId())).f34114b);
                FaceMattingPresenter.this.b().b(face.path);
            }
        });
        this.f3984c = appCompatActivity;
        appCompatActivity.getLifecycle().addObserver(this);
    }
}
