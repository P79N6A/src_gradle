package com.ss.android.ugc.aweme.shortvideo;

import a.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.LogWriter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.scene.b.h;
import com.bytedance.scene.g;
import com.bytedance.scene.i;
import com.bytedance.scene.ui.LifeCycleCompatFragment;
import com.bytedance.scene.ui.ScopeHolderCompatFragment;
import com.bytedance.scene.ui.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.anim.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapterB;
import com.ss.android.ugc.aweme.mediachoose.MediaAdapterB;
import com.ss.android.ugc.aweme.mediachoose.VideoChooseFragmentB;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.ss.android.ugc.aweme.photo.local.MediaChooseFragmentB;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.v;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.l;
import com.ss.android.ugc.aweme.setting.m;
import com.ss.android.ugc.aweme.shortvideo.ar.text.r;
import com.ss.android.ugc.aweme.shortvideo.bh;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.CutMusicModule;
import com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.ss.android.ugc.aweme.shortvideo.local.UploadButton;
import com.ss.android.ugc.aweme.shortvideo.local.a;
import com.ss.android.ugc.aweme.shortvideo.m.b;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarClickListener;
import com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel;
import com.ss.android.ugc.aweme.shortvideo.presenter.f;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.record.n;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.a.a;
import com.ss.android.ugc.aweme.shortvideo.ui.a.b;
import com.ss.android.ugc.aweme.shortvideo.ui.a.c;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout;
import com.ss.android.ugc.aweme.story.widget.TabHost;
import com.ss.android.ugc.aweme.tools.ao;
import com.ss.android.ugc.aweme.tools.ap;
import com.ss.android.ugc.aweme.tools.ar;
import com.ss.android.ugc.aweme.tools.as;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.ay;
import com.ss.android.ugc.aweme.tools.az;
import com.ss.android.ugc.aweme.tools.ba;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.be;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.q;
import com.ss.android.ugc.aweme.tools.u;
import com.ss.android.ugc.aweme.tools.y;
import com.ss.android.ugc.aweme.tools.z;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.RecordBottomTabViewModel;
import com.ss.android.ugc.gamora.recorder.RecordCountDownViewModel;
import com.ss.android.ugc.gamora.recorder.RecordMVViewModel;
import com.ss.android.ugc.gamora.recorder.RecordSpeedGroupViewModel;
import com.ss.android.ugc.gamora.recorder.RecordTitleViewModel;
import com.ss.android.ugc.gamora.recorder.RecordToolbarViewModel;
import com.ss.android.ugc.gamora.recorder.RecordViewModel;
import com.ss.android.ugc.gamora.recorder.j;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"ValidFragment"})
public class PlanC extends ShortVideoRecordingOperationPanelFragment implements View.OnClickListener, bh.a, a, b, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65353a;
    public View A;
    public View B;
    public int C;
    MediaChooseFragmentB D;
    int E;
    public List<com.ss.android.ugc.aweme.music.b.a.a> F;
    public f G;
    public boolean H = true;
    public boolean I;
    public boolean J;
    View K;
    public e L;
    public SafeHandler M = new SafeHandler(this);
    private com.ss.android.ugc.aweme.shortvideo.adapter.c aa;
    private LinearLayout ab;
    private FrameLayout ac;
    private Dialog ad;
    private TouchSensitiveRelativeLayout ae;
    private LinearLayout af;
    private RelativeLayout ag;
    private RelativeLayout ah;
    private View ai;
    private RelativeLayout aj;
    private ImageView ak;
    private View al;
    private View am;
    private ViewGroup an;
    private dmt.av.video.b.a.c ao;
    private MediaAdapterB.b ap = new MediaAdapterB.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65382a;

        public final void a(List<com.ss.android.ugc.aweme.music.b.a.a> list) {
            int i;
            List<com.ss.android.ugc.aweme.music.b.a.a> list2 = list;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f65382a, false, 74358, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2}, this, f65382a, false, 74358, new Class[]{List.class}, Void.TYPE);
                return;
            }
            PlanC.this.F = list2;
            if (list2 == null) {
                i = 0;
            } else {
                i = list.size();
            }
            PlanC planC = PlanC.this;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), (byte) 1}, planC, PlanC.f65353a, false, 74277, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PlanC planC2 = planC;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), (byte) 1}, planC2, PlanC.f65353a, false, 74277, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            MediaChooseFragmentB mediaChooseFragmentB = planC.D;
            Object[] objArr = {Integer.valueOf(i), (byte) 1};
            if (PatchProxy.isSupport(objArr, mediaChooseFragmentB, MediaChooseFragmentB.f58593a, false, 63696, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                Object[] objArr2 = {Integer.valueOf(i), (byte) 1};
                Object[] objArr3 = objArr2;
                MediaChooseFragmentB mediaChooseFragmentB2 = mediaChooseFragmentB;
                PatchProxy.accessDispatch(objArr3, mediaChooseFragmentB2, MediaChooseFragmentB.f58593a, false, 63696, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            VideoChooseFragmentB videoChooseFragmentB = (VideoChooseFragmentB) mediaChooseFragmentB.a((ViewPager) mediaChooseFragmentB.f58594b, 0);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, videoChooseFragmentB, VideoChooseFragmentB.f55222a, false, 58595, new Class[]{Integer.TYPE}, Void.TYPE)) {
                VideoChooseFragmentB videoChooseFragmentB2 = videoChooseFragmentB;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, videoChooseFragmentB2, VideoChooseFragmentB.f55222a, false, 58595, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (i <= 0) {
                videoChooseFragmentB.h.setVisibility(8);
            } else {
                videoChooseFragmentB.h.setVisibility(0);
                if (i == 1) {
                    videoChooseFragmentB.h.setText(String.format(videoChooseFragmentB.getString(C0906R.string.bgx), new Object[]{Integer.valueOf(i)}));
                    videoChooseFragmentB.h.animate().alpha(1.0f).setDuration(200).start();
                } else if (i == 2) {
                    videoChooseFragmentB.h.setText(String.format(videoChooseFragmentB.getString(C0906R.string.bgx), new Object[]{Integer.valueOf(i)}));
                    videoChooseFragmentB.h.animate().alpha(1.0f).setDuration(200).start();
                } else {
                    videoChooseFragmentB.h.setText(String.format(videoChooseFragmentB.getString(C0906R.string.bgx), new Object[]{Integer.valueOf(i)}));
                    videoChooseFragmentB.h.setAlpha(1.0f);
                }
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f65354b = this;

    /* renamed from: c  reason: collision with root package name */
    public bd f65355c;

    /* renamed from: d  reason: collision with root package name */
    n f65356d;

    /* renamed from: e  reason: collision with root package name */
    GoNextFactoryFactory f65357e;

    /* renamed from: f  reason: collision with root package name */
    public RecordLayout f65358f;
    public View g;
    public View h;
    public View i;
    public ImageView j;
    public fh k;
    public com.ss.android.ugc.aweme.shortvideo.local.a l;
    public Intent m;
    UploadButton n;
    FrameLayout o;
    g p;
    RecordViewModel q;
    RecordTitleViewModel r;
    RecordToolbarViewModel s;
    RecordBottomTabViewModel t;
    RecordMVViewModel u;
    RecordCountDownViewModel v;
    RecordSpeedGroupViewModel w;
    public RelativeLayout x;
    public FrameLayout y;
    public boolean z;

    public final bd k() {
        return this.f65355c;
    }

    @NonNull
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gz gzVar;
        com.ss.android.ugc.aweme.shortvideo.adapter.c cVar;
        int i2;
        RecordToolBarModel recordToolBarModel;
        RecordToolBarModel recordToolBarModel2;
        RecordToolBarModel recordToolBarModel3;
        RecordToolBarModel recordToolBarModel4;
        RecordToolBarModel recordToolBarModel5;
        RecordToolBarModel recordToolBarModel6;
        RecordToolBarModel recordToolBarModel7;
        RecordToolBarModel recordToolBarModel8;
        RecordToolBarModel recordToolBarModel9;
        RecordToolBarModel recordToolBarModel10;
        RecordToolBarModel recordToolBarModel11;
        RecordToolBarModel recordToolBarModel12;
        RecordToolBarModel recordToolBarModel13;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f65353a, false, 74273, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f65353a, false, 74273, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        ai.a("planC => onCreateView start");
        this.al = layoutInflater2.inflate(C0906R.layout.qa, viewGroup2, false);
        this.ac = (FrameLayout) this.al;
        this.h = this.al.findViewById(C0906R.id.bnm);
        this.i = this.al.findViewById(C0906R.id.ci4);
        this.f65358f = (RecordLayout) this.al.findViewById(C0906R.id.ca_);
        this.g = this.al.findViewById(C0906R.id.b0g);
        this.g.setOnClickListener(this);
        this.j = (ImageView) this.al.findViewById(C0906R.id.oo);
        this.O = this.al.findViewById(C0906R.id.py);
        this.ab = (LinearLayout) this.al.findViewById(C0906R.id.bqk);
        this.an = (ViewGroup) this.al.findViewById(C0906R.id.a96);
        this.K = this.al.findViewById(C0906R.id.b63);
        this.ae = (TouchSensitiveRelativeLayout) this.al.findViewById(C0906R.id.cg9);
        this.S = (com.ss.android.ugc.aweme.port.internal.b) com.ss.android.ugc.aweme.port.in.a.u.b();
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74302, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, l.f63982a, true, 72057, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, l.f63982a, true, 72057, new Class[0], Void.TYPE);
            } else if (com.ss.android.g.a.a() && !com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactDuetSettingChanged)) {
                i.a(m.f63989b).a(com.ss.android.ugc.aweme.setting.n.f63991b);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74304, new Class[0], Void.TYPE);
        } else {
            fh fhVar = r().f65401b;
            if (fhVar.b() || fhVar.c()) {
                this.r.b(false);
                this.r.a(false);
            } else {
                e b2 = ej.a().b();
                if (b2 != null) {
                    a(b2);
                    this.r.c(new RecordTitleViewModel.k(false));
                    i(127);
                    a(0.5f);
                    if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74337, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74337, new Class[0], Void.TYPE);
                    } else if (this.k != null) {
                        fh fhVar2 = this.k;
                        if (fhVar2.W && !fhVar2.X) {
                            this.k.X = true;
                            this.r.f77610f.setValue(null);
                            this.ae.setNoBlockTouchListener(new dv(this));
                            if ("prop_reuse".equals(this.k.r) || "prop_page".equals(this.k.r)) {
                                e curMusic = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getCurMusic();
                                if (curMusic != null) {
                                    Effect effect = (Effect) this.m.getParcelableExtra("first_sticker");
                                    if (effect != null) {
                                        r.a("prop_music_show", (Map) d.a().a("creation_id", this.k.q).a("shoot_way", this.k.r).a("enter_from", "video_shoot_page").a("music_id", curMusic.getMusicId()).a("prop_id", effect.effect_id).a("group_id", av.INSTANCE.getVideoId()).f34114b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        View view = this.al;
        if (PatchProxy.isSupport(new Object[]{view}, this, f65353a, false, 74313, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65353a, false, 74313, new Class[]{View.class}, Void.TYPE);
        } else if (this.k != null) {
            this.n = (UploadButton) view.findViewById(C0906R.id.pb);
            if (this.k.b() || this.k.c()) {
                this.n.setVisibility(4);
            } else {
                boolean z3 = !"single_song".equals(this.k.r) && !com.ss.android.g.a.a();
                boolean z4 = !com.ss.android.g.a.a() || (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.PhotoMovieEnabled) != 0 && com.ss.android.g.a.a());
                this.E = 4;
                if (z3) {
                    this.E |= 1;
                }
                if (z4) {
                    this.E |= 2;
                }
                if (this.k.am != null) {
                    this.E = 4;
                }
                com.ss.android.ugc.aweme.shortvideo.local.a aVar = new com.ss.android.ugc.aweme.shortvideo.local.a((AmeActivity) getContext(), (com.ss.android.ugc.aweme.base.activity.e) getContext(), this.k, this.n, new a.C0718a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65366a;

                    public final void a(@NonNull PhotoContext photoContext) {
                        if (PatchProxy.isSupport(new Object[]{photoContext}, this, f65366a, false, 74365, new Class[]{PhotoContext.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{photoContext}, this, f65366a, false, 74365, new Class[]{PhotoContext.class}, Void.TYPE);
                        } else if (PlanC.this.getContext() != null) {
                            photoContext.mShootWay = PlanC.this.k.r;
                            photoContext.challenges = ej.a().f67529b;
                            photoContext.mPoiId = PlanC.this.k.D;
                            photoContext.microAppModel = PlanC.this.k.am;
                            photoContext.mFromOtherPlatform = PlanC.this.k.an;
                            r.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
                            com.ss.android.ugc.aweme.tools.a.g.a(r.b(PlanC.this.k), r.a(photoContext), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
                            if (PlanC.this.k.an) {
                                PhotoEditActivity.a(PlanC.this.getActivity(), photoContext, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
                            } else {
                                PhotoEditActivity.a(PlanC.this.getContext(), photoContext);
                            }
                        }
                    }

                    public final void a(@NonNull PhotoMovieContext photoMovieContext, @NonNull List<e> list) {
                        if (PatchProxy.isSupport(new Object[]{photoMovieContext, list}, this, f65366a, false, 74366, new Class[]{PhotoMovieContext.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{photoMovieContext, list}, this, f65366a, false, 74366, new Class[]{PhotoMovieContext.class, List.class}, Void.TYPE);
                        } else if (PlanC.this.getContext() != null) {
                            photoMovieContext.creationId = PlanC.this.k.q;
                            photoMovieContext.draftId = PlanC.this.k.v;
                            photoMovieContext.mShootWay = PlanC.this.k.r;
                            photoMovieContext.poiId = PlanC.this.k.D;
                            photoMovieContext.musicOrigin = PlanC.this.k.i;
                            String stringExtra = PlanC.this.m.getStringExtra("path");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                photoMovieContext.mMusicPath = stringExtra;
                                photoMovieContext.mMusic = ej.a().b();
                            } else if (Lists.notEmpty(list)) {
                                photoMovieContext.mMusic = list.get(0);
                            }
                            photoMovieContext.mFrom = 2;
                            photoMovieContext.challenges = ej.a().f67529b;
                            com.ss.android.ugc.aweme.tools.a.g.a(r.b(PlanC.this.k), r.b((BaseShortVideoContext) photoMovieContext), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.EDIT);
                            v.a(PlanC.this.getContext(), photoMovieContext, list, "upload");
                        }
                    }

                    public final void a(@NonNull String str, boolean z) {
                        int i;
                        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f65366a, false, 74364, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f65366a, false, 74364, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                        } else if (PlanC.this.getContext() != null) {
                            Intent intent = new Intent();
                            intent.putExtra("from_music_detail", "single_song".equals(PlanC.this.k.r));
                            intent.putExtra("creation_id", PlanC.this.k.q);
                            intent.putExtra("shoot_way", PlanC.this.k.r);
                            if (PlanC.this.k.l.e() != null) {
                                intent.putExtra("path", PlanC.this.k.l.e().getAbsolutePath());
                            }
                            List<c> list = ej.a().f67529b;
                            if (list != null && !list.isEmpty()) {
                                intent.putExtra("av_challenge", list.get(0));
                            }
                            intent.putExtra("poi_struct_in_tools_line", PlanC.this.k.D);
                            intent.putExtra("micro_app_info", PlanC.this.k.am);
                            com.ss.android.ugc.aweme.tools.a.g.a(intent, r.b(PlanC.this.k), com.ss.android.ugc.aweme.tools.a.e.RECORD, com.ss.android.ugc.aweme.tools.a.e.CUT);
                            if (PlanC.this.k.an) {
                                i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
                            } else {
                                i = -1;
                            }
                            VECutVideoActivity.f66190b.a(PlanC.this.getActivity(), intent, i);
                        }
                    }
                });
                this.l = aVar;
                this.l.f68332c = this.E;
                this.l.f68333d = true;
                if (c() || (d() && this.n.getVisibility() == 0)) {
                    if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.AmericaRecordUploadGuideShow)) {
                        this.z = true;
                    }
                    a(view);
                    if (c()) {
                        RelativeLayout relativeLayout = this.aj;
                        if (PatchProxy.isSupport(new Object[]{relativeLayout}, this, f65353a, false, 74276, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{relativeLayout}, this, f65353a, false, 74276, new Class[]{View.class}, Void.TYPE);
                        } else if (this.f65354b.getContext() != null) {
                            if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.AmericaRecordUploadGuideShow)) {
                                this.x.setVisibility(8);
                                this.B.setVisibility(8);
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A, "translationY", new float[]{this.A.getY(), (float) fc.e(getActivity())});
                                ofFloat.setDuration(0);
                                ofFloat.start();
                            } else {
                                a(1);
                                this.aj.setVisibility(0);
                                this.x.post(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f65376a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f65376a, false, 74355, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f65376a, false, 74355, new Class[0], Void.TYPE);
                                        } else if (PlanC.this.f65354b.getContext() != null) {
                                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) UIUtils.dip2Px(PlanC.this.f65354b.getContext(), 300.0f), (int) UIUtils.dip2Px(PlanC.this.f65354b.getContext(), 200.0f)});
                                            ofInt.setDuration(500);
                                            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f65378a;

                                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f65378a, false, 74356, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f65378a, false, 74356, new Class[]{ValueAnimator.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    ViewGroup.LayoutParams layoutParams = PlanC.this.x.getLayoutParams();
                                                    if (layoutParams != null) {
                                                        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                                                        PlanC.this.x.setLayoutParams(layoutParams);
                                                    }
                                                }
                                            });
                                            ofInt.addListener(new Animator.AnimatorListener() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f65380a;

                                                public final void onAnimationCancel(Animator animator) {
                                                }

                                                public final void onAnimationRepeat(Animator animator) {
                                                }

                                                public final void onAnimationStart(Animator animator) {
                                                }

                                                public final void onAnimationEnd(Animator animator) {
                                                    if (PatchProxy.isSupport(new Object[]{animator}, this, f65380a, false, 74357, new Class[]{Animator.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{animator}, this, f65380a, false, 74357, new Class[]{Animator.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    if (PlanC.this.f65354b.getContext() != null) {
                                                        PlanC.this.C = (int) UIUtils.dip2Px(PlanC.this.f65354b.getContext(), 200.0f);
                                                    }
                                                }
                                            });
                                            ofInt.start();
                                        }
                                    }
                                });
                                this.x.setOnClickListener(this);
                                this.ak.setOnClickListener(this);
                            }
                        }
                    } else if (d()) {
                        this.z = true;
                        n();
                        this.B.setAlpha(0.0f);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A, "translationY", new float[]{this.A.getY(), (float) fc.e(getActivity())});
                        ofFloat2.setDuration(0);
                        ofFloat2.start();
                    }
                }
                this.n.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65368a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f65368a, false, 74352, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f65368a, false, 74352, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        if (PlanC.this.c() || PlanC.this.d()) {
                            PlanC.this.e();
                        } else {
                            PlanC.this.l.a();
                        }
                        r.a(PlanC.this.getContext(), "upload_click", "shoot_page", PushConstants.PUSH_TYPE_NOTIFY, 0, new t().a("enter_from", PlanC.this.k.r).a());
                        r.a("click_upload_entrance", (Map) d.a().a("creation_id", PlanC.this.k.q).a("shoot_way", PlanC.this.k.r).a("draft_id", PlanC.this.k.v).f34114b);
                    }
                });
            }
        }
        new eq((VideoRecordNewActivity) getActivity(), this, this.f65358f);
        VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) this.al.findViewById(C0906R.id.ajc);
        this.f65358f.setScaleGestureDetector(videoRecordGestureLayout.getScaleGestureDetector());
        this.P = new DefaultGesturePresenter(this.f65354b, new ba(this, this.f65358f, this.ao).f65773c, videoRecordGestureLayout);
        this.P.b(this.K);
        com.ss.android.ugc.aweme.anim.b a2 = com.ss.android.ugc.aweme.anim.b.a();
        Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
        if (PatchProxy.isSupport(new Object[]{application, "anim_video_countdown"}, a2, com.ss.android.ugc.aweme.anim.b.f33331a, false, 21625, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application, "anim_video_countdown"}, a2, com.ss.android.ugc.aweme.anim.b.f33331a, false, 21625, new Class[]{Context.class, String.class}, Void.TYPE);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (a2.f33333c.get("anim_video_countdown") == null) {
                b.AnonymousClass2 r16 = new Runnable(application, "anim_video_countdown", currentTimeMillis) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f33335a;

                    /* renamed from: b */
                    final /* synthetic */ Context f33336b;

                    /* renamed from: c */
                    final /* synthetic */ String f33337c;

                    /* renamed from: d */
                    final /* synthetic */ long f33338d;

                    public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.anim.b.2.run():void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.anim.b.2.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
                com.ss.android.b.a.a.a.a(r16);
            }
        }
        this.j.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65359a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f65359a, false, 74351, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f65359a, false, 74351, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                PlanC.this.k.aa = System.currentTimeMillis();
                com.ss.android.ugc.aweme.shortvideo.util.b.a().b();
                com.ss.android.ugc.aweme.shortvideo.util.b.a().c();
                PlanC.this.f65354b.q().a((Object) PlanC.this.f65358f, (bc) new com.ss.android.ugc.aweme.tools.ax());
                PlanC.this.f65355c.a((Object) PlanC.this.j, (bc) new y("click_next"));
                r.a("av_memory_log", (Map) d.a().a("creation_id", PlanC.this.k.q).a("enter_from", PlanC.this.k.s).a("dalvikPss", aa.a().g).a("nativePss", aa.a().h).a("otherPss", aa.a().j).a("totalPss", aa.a().i).f34114b);
            }
        });
        this.ai = this.al.findViewById(C0906R.id.ko);
        this.ag = (RelativeLayout) this.al.findViewById(C0906R.id.a06);
        this.ah = (RelativeLayout) this.al.findViewById(C0906R.id.a07);
        this.ag.setVisibility(0);
        this.ah.setVisibility(0);
        this.o = (FrameLayout) this.al.findViewById(C0906R.id.cbw);
        if (fc.a()) {
            this.af = (LinearLayout) this.al.findViewById(C0906R.id.xj);
            an_();
        }
        this.Q = new j();
        j jVar = this.Q;
        Intrinsics.checkParameterIsNotNull(this, "<set-?>");
        jVar.k = this;
        j jVar2 = this.Q;
        View view2 = this.i;
        Intrinsics.checkParameterIsNotNull(view2, "<set-?>");
        jVar2.l = view2;
        j jVar3 = this.Q;
        Intrinsics.checkParameterIsNotNull(this, "<set-?>");
        jVar3.m = this;
        j jVar4 = this.Q;
        com.ss.android.ugc.aweme.port.internal.b bVar = this.S;
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        jVar4.n = bVar;
        j jVar5 = this.Q;
        CutMusicModule cutMusicModule = ((VideoRecordNewActivity) getActivity()).o;
        Intrinsics.checkParameterIsNotNull(cutMusicModule, "<set-?>");
        jVar5.o = cutMusicModule;
        AnonymousClass5 r0 = new com.bytedance.scene.navigation.g(j.class) {
            {
                a(false);
                b(false);
            }
        };
        dn dnVar = new dn(this);
        com.bytedance.scene.b.j.a();
        if (com.bytedance.scene.ui.b.f22216a.get(this) == null || !com.bytedance.scene.ui.b.f22216a.get(this).contains("LifeCycleCompatFragment")) {
            HashSet hashSet = com.bytedance.scene.ui.b.f22216a.get(this);
            if (hashSet == null) {
                hashSet = new HashSet();
                com.bytedance.scene.ui.b.f22216a.put(this, hashSet);
            }
            hashSet.add("LifeCycleCompatFragment");
            FragmentManager childFragmentManager = getChildFragmentManager();
            LifeCycleCompatFragment lifeCycleCompatFragment = (LifeCycleCompatFragment) childFragmentManager.findFragmentByTag("LifeCycleCompatFragment");
            if (lifeCycleCompatFragment != null) {
                FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
                beginTransaction.remove(lifeCycleCompatFragment);
                beginTransaction.commitNowAllowingStateLoss();
                childFragmentManager.executePendingTransactions();
                lifeCycleCompatFragment = null;
            }
            if (lifeCycleCompatFragment != null) {
                lifeCycleCompatFragment.f22201b = new i.a(ScopeHolderCompatFragment.a(this, "LifeCycleCompatFragment", false)) {

                    /* renamed from: a */
                    final /* synthetic */ ScopeHolderCompatFragment f22217a;

                    public final com.bytedance.scene.i a(
/*
Method generation error in method: com.bytedance.scene.ui.b.1.a():com.bytedance.scene.i, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.ui.b.1.a():com.bytedance.scene.i, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
            } else {
                lifeCycleCompatFragment = new LifeCycleCompatFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("supportRestore", false);
                lifeCycleCompatFragment.setArguments(bundle2);
                FragmentTransaction beginTransaction2 = childFragmentManager.beginTransaction();
                beginTransaction2.add(C0906R.id.cbw, lifeCycleCompatFragment, "LifeCycleCompatFragment");
                b.AnonymousClass2 r3 = new i.a(ScopeHolderCompatFragment.a(this, "LifeCycleCompatFragment", true)) {

                    /* renamed from: a */
                    final /* synthetic */ ScopeHolderCompatFragment f22218a;

                    public final com.bytedance.scene.i a(
/*
Method generation error in method: com.bytedance.scene.ui.b.2.a():com.bytedance.scene.i, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.ui.b.2.a():com.bytedance.scene.i, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                    
*/
                };
                lifeCycleCompatFragment.f22200a = (com.bytedance.scene.navigation.e) h.a(com.bytedance.scene.navigation.e.class, r0.a());
                lifeCycleCompatFragment.f22201b = r3;
                beginTransaction2.commitNowAllowingStateLoss();
                childFragmentManager.executePendingTransactions();
            }
            b.AnonymousClass3 r02 = new b.a(lifeCycleCompatFragment) {

                /* renamed from: a */
                final /* synthetic */ LifeCycleCompatFragment f22219a;

                public final boolean a(
/*
Method generation error in method: com.bytedance.scene.ui.b.3.a():boolean, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.ui.b.3.a():boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
            lifeCycleCompatFragment.f22202c = new com.bytedance.scene.c(r02) {

                /* renamed from: a */
                final /* synthetic */ a f22220a;

                public final void a(
/*
Method generation error in method: com.bytedance.scene.ui.b.4.a(com.bytedance.scene.navigation.e):void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.scene.ui.b.4.a(com.bytedance.scene.navigation.e):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:416)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
            if (lifeCycleCompatFragment.f22200a != null) {
                lifeCycleCompatFragment.f22202c.a(lifeCycleCompatFragment.f22200a);
            }
            lifeCycleCompatFragment.f22203d = dnVar;
            this.p = r02;
            this.r.f77608d = this.f65355c;
            this.r.h.setValue(Boolean.TRUE);
            RecordToolbarViewModel recordToolbarViewModel = this.s;
            if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74303, new Class[0], gz.class)) {
                gzVar = (gz) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74303, new Class[0], gz.class);
            } else {
                gzVar = new gz(this, new hb(this, ha.a(this.f65354b.getContext())), this.Y);
                if (PatchProxy.isSupport(new Object[0], gzVar, gz.f68031a, false, 74803, new Class[0], com.ss.android.ugc.aweme.shortvideo.adapter.c.class)) {
                    cVar = (com.ss.android.ugc.aweme.shortvideo.adapter.c) PatchProxy.accessDispatch(new Object[0], gzVar, gz.f68031a, false, 74803, new Class[0], com.ss.android.ugc.aweme.shortvideo.adapter.c.class);
                } else {
                    int i3 = 6;
                    if (PatchProxy.isSupport(new Object[0], gzVar, gz.f68031a, false, 74802, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], gzVar, gz.f68031a, false, 74802, new Class[0], Void.TYPE);
                    } else {
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap = gzVar.f68033c;
                        hb hbVar = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar, hb.f68045a, false, 74810, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar, hb.f68045a, false, 74810, new Class[0], RecordToolBarModel.class);
                        } else {
                            RecordToolBarModel recordToolBarModel14 = new RecordToolBarModel(2130839525, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68064a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68064a, false, 74829, new Class[]{RecordToolBarModel.class}, Boolean.TYPE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68064a, false, 74829, new Class[]{RecordToolBarModel.class}, Boolean.TYPE)).booleanValue();
                                    }
                                    com.bytedance.ies.dmt.ui.d.a.c(hb.this.f68046b.getContext(), hb.this.f68046b.getContext().getResources().getString(C0906R.string.bwn)).a();
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68064a, false, 74828, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68064a, false, 74828, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                    } else if (!com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a && System.currentTimeMillis() - hb.this.f68048d >= 100) {
                                        int h = ((VideoRecordNewActivity) hb.this.f68046b.getActivity()).m.h();
                                        if (h == 0) {
                                            com.ss.android.ugc.aweme.tools.v a2 = com.ss.android.ugc.aweme.tools.v.a();
                                            a2.f74943c = false;
                                            hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) a2);
                                        } else if (h == 1) {
                                            com.ss.android.ugc.aweme.tools.v b2 = com.ss.android.ugc.aweme.tools.v.b();
                                            b2.f74943c = false;
                                            hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) b2);
                                        }
                                        ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class);
                                        hb.this.f68048d = System.currentTimeMillis();
                                    }
                                }
                            }, hbVar.f68047c ? C0906R.string.c0b : -1);
                            recordToolBarModel14.onAnimateListener = hc.f68077b;
                            recordToolBarModel = recordToolBarModel14;
                        }
                        linkedHashMap.put(5, recordToolBarModel);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap2 = gzVar.f68033c;
                        hb hbVar2 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar2, hb.f68045a, false, 74809, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel2 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar2, hb.f68045a, false, 74809, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel2 = new RecordToolBarModel(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen) ? 2130839534 : 2130839533, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68049a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    String str;
                                    int i = 0;
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68049a, false, 74824, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68049a, false, 74824, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    bd k = hb.this.f68046b.k();
                                    ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = hb.this.f68046b;
                                    if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                                        i = 8;
                                    }
                                    k.a((Object) shortVideoRecordingOperationPanelFragment, (bc) new as(i));
                                    r.onEvent(MobClick.obtain().setEventName("speed_edit").setLabelName("shoot_page").setJsonObject(hb.this.f68046b.t()));
                                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                    d a2 = d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v);
                                    if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                                        str = "show";
                                    } else {
                                        str = "hide";
                                    }
                                    r.a("edit_speed", (Map) a2.a("to_status", str).f34114b);
                                }
                            }, hbVar2.f68047c ? Boolean.valueOf(com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)).booleanValue() ? C0906R.string.c9m : C0906R.string.c9l : -1);
                        }
                        linkedHashMap2.put(4, recordToolBarModel2);
                        if (com.ss.android.g.a.b()) {
                            LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap3 = gzVar.f68033c;
                            hb hbVar3 = gzVar.f68034d;
                            boolean a3 = fk.a().a();
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(a3 ? (byte) 1 : 0)}, hbVar3, hb.f68045a, false, 74814, new Class[]{Boolean.TYPE}, RecordToolBarModel.class)) {
                                recordToolBarModel13 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(a3)}, hbVar3, hb.f68045a, false, 74814, new Class[]{Boolean.TYPE}, RecordToolBarModel.class);
                            } else {
                                recordToolBarModel13 = new RecordToolBarModel(a3 ? 2130839509 : 2130839508, new RecordToolBarClickListener(a3) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f68072a;

                                    /* renamed from: b  reason: collision with root package name */
                                    boolean f68073b = this.f68074c;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ boolean f68074c;

                                    public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                        return false;
                                    }

                                    public final void onClick(RecordToolBarModel recordToolBarModel) {
                                        if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68072a, false, 74833, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68072a, false, 74833, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                            return;
                                        }
                                        this.f68073b = !this.f68073b;
                                        hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) new com.ss.android.ugc.aweme.tools.d(this.f68073b));
                                        ((RecordToolbarViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(RecordToolbarViewModel.class)).m.setValue(Boolean.valueOf(this.f68073b));
                                    }

                                    {
                                        this.f68074c = r2;
                                    }
                                }, hbVar3.f68047c ? C0906R.string.ll : -1);
                            }
                            linkedHashMap3.put(6, recordToolBarModel13);
                        }
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap4 = gzVar.f68033c;
                        hb hbVar4 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar4, hb.f68045a, false, 74808, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel3 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar4, hb.f68045a, false, 74808, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel3 = new RecordToolBarModel(2130839320, null, hbVar4.f68047c ? C0906R.string.aes : -1);
                        }
                        linkedHashMap4.put(0, recordToolBarModel3);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap5 = gzVar.f68033c;
                        hb hbVar5 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar5, hb.f68045a, false, 74819, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel4 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar5, hb.f68045a, false, 74819, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel4 = new RecordToolBarModel(2130839507, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68060a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.Object} */
                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.ss.android.ugc.aweme.shortvideo.c.n$a} */
                                /* JADX WARNING: Multi-variable type inference failed */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void onClick(com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel r18) {
                                    /*
                                        r17 = this;
                                        r1 = 1
                                        java.lang.Object[] r2 = new java.lang.Object[r1]
                                        r9 = 0
                                        r2[r9] = r18
                                        com.meituan.robust.ChangeQuickRedirect r4 = f68060a
                                        java.lang.Class[] r7 = new java.lang.Class[r1]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel> r3 = com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel.class
                                        r7[r9] = r3
                                        java.lang.Class r8 = java.lang.Void.TYPE
                                        r5 = 0
                                        r6 = 74826(0x1244a, float:1.04854E-40)
                                        r3 = r17
                                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                                        if (r2 == 0) goto L_0x0034
                                        java.lang.Object[] r10 = new java.lang.Object[r1]
                                        r10[r9] = r18
                                        com.meituan.robust.ChangeQuickRedirect r12 = f68060a
                                        r13 = 0
                                        r14 = 74826(0x1244a, float:1.04854E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r1]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel> r0 = com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel.class
                                        r15[r9] = r0
                                        java.lang.Class r16 = java.lang.Void.TYPE
                                        r11 = r17
                                        com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                        return
                                    L_0x0034:
                                        r0 = r17
                                        com.ss.android.ugc.aweme.shortvideo.hb r2 = com.ss.android.ugc.aweme.shortvideo.hb.this
                                        com.ss.android.ugc.aweme.shortvideo.ShortVideoRecordingOperationPanelFragment r2 = r2.f68046b
                                        android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                                        com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = (com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity) r2
                                        com.ss.android.ugc.aweme.shortvideo.c.c r2 = r2.Q
                                        if (r2 != 0) goto L_0x0045
                                        return
                                    L_0x0045:
                                        boolean r3 = r2.g
                                        if (r3 == 0) goto L_0x0252
                                        java.lang.Object[] r10 = new java.lang.Object[r9]
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                                        r13 = 0
                                        r14 = 75201(0x125c1, float:1.05379E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r9]
                                        java.lang.Class r16 = java.lang.Void.TYPE
                                        r11 = r2
                                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                                        if (r3 == 0) goto L_0x006e
                                        java.lang.Object[] r10 = new java.lang.Object[r9]
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                                        r13 = 0
                                        r14 = 75201(0x125c1, float:1.05379E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r9]
                                        java.lang.Class r16 = java.lang.Void.TYPE
                                        r11 = r2
                                        com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                        goto L_0x0255
                                    L_0x006e:
                                        android.widget.FrameLayout r3 = r2.f65867d
                                        r3.removeAllViews()
                                        android.support.v7.app.AppCompatActivity r3 = r2.i
                                        android.widget.FrameLayout r4 = r2.f65867d
                                        r5 = 2
                                        java.lang.Object[] r10 = new java.lang.Object[r5]
                                        r10[r9] = r3
                                        r10[r1] = r4
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                                        r13 = 0
                                        r14 = 75199(0x125bf, float:1.05376E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r5]
                                        java.lang.Class<android.support.v7.app.AppCompatActivity> r6 = android.support.v7.app.AppCompatActivity.class
                                        r15[r9] = r6
                                        java.lang.Class<android.widget.FrameLayout> r6 = android.widget.FrameLayout.class
                                        r15[r1] = r6
                                        java.lang.Class r16 = java.lang.Void.TYPE
                                        r11 = r2
                                        boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                                        if (r6 == 0) goto L_0x00b5
                                        java.lang.Object[] r10 = new java.lang.Object[r5]
                                        r10[r9] = r3
                                        r10[r1] = r4
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                                        r13 = 0
                                        r14 = 75199(0x125bf, float:1.05376E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r5]
                                        java.lang.Class<android.support.v7.app.AppCompatActivity> r3 = android.support.v7.app.AppCompatActivity.class
                                        r15[r9] = r3
                                        java.lang.Class<android.widget.FrameLayout> r3 = android.widget.FrameLayout.class
                                        r15[r1] = r3
                                        java.lang.Class r16 = java.lang.Void.TYPE
                                        r11 = r2
                                        com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                        goto L_0x01e4
                                    L_0x00b5:
                                        android.view.View r5 = r2.f65868e
                                        if (r5 != 0) goto L_0x01e4
                                        android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
                                        r6 = 2131689716(0x7f0f00f4, float:1.9008455E38)
                                        android.view.View r5 = r5.inflate(r6, r4, r9)
                                        r2.f65868e = r5
                                        android.view.View r5 = r2.f65868e
                                        r6 = 2131165586(0x7f070192, float:1.7945393E38)
                                        android.view.View r5 = r5.findViewById(r6)
                                        r2.f65869f = r5
                                        android.view.View r5 = r2.f65868e
                                        r6 = 2131165590(0x7f070196, float:1.7945401E38)
                                        android.view.View r5 = r5.findViewById(r6)
                                        com.ss.android.ugc.aweme.shortvideo.c.f r6 = new com.ss.android.ugc.aweme.shortvideo.c.f
                                        r6.<init>(r2)
                                        r5.setOnClickListener(r6)
                                        com.ss.android.ugc.aweme.shortvideo.c.h r5 = new com.ss.android.ugc.aweme.shortvideo.c.h
                                        android.view.View r6 = r2.f65868e
                                        android.view.View r7 = r2.f65869f
                                        r5.<init>(r4, r6, r7)
                                        r2.k = r5
                                        com.ss.android.ugc.aweme.shortvideo.c.h r4 = r2.k
                                        com.ss.android.ugc.aweme.shortvideo.c.c$2 r5 = new com.ss.android.ugc.aweme.shortvideo.c.c$2
                                        r5.<init>()
                                        r4.a((com.ss.android.ugc.aweme.photomovie.transition.f) r5)
                                        android.arch.lifecycle.ViewModelProvider r3 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r3)
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r4 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                                        android.arch.lifecycle.ViewModel r3 = r3.get(r4)
                                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r3 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r3
                                        com.ss.android.ugc.aweme.shortvideo.fh r3 = r3.f65401b
                                        if (r3 == 0) goto L_0x010d
                                        com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r3 = r3.d()
                                        r2.l = r3
                                    L_0x010d:
                                        com.ss.android.ugc.aweme.shortvideo.c.n$a r3 = new com.ss.android.ugc.aweme.shortvideo.c.n$a
                                        android.view.View r4 = r2.f65868e
                                        r3.<init>(r4)
                                        com.ss.android.ugc.aweme.filter.a r4 = r2.m
                                        r3.f65945c = r4
                                        java.lang.Object[] r10 = new java.lang.Object[r9]
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                                        r13 = 0
                                        r14 = 75200(0x125c0, float:1.05378E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r9]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.m> r16 = com.ss.android.ugc.aweme.shortvideo.c.m.class
                                        r11 = r2
                                        boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                                        if (r4 == 0) goto L_0x013f
                                        java.lang.Object[] r10 = new java.lang.Object[r9]
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.c.f65864a
                                        r13 = 0
                                        r14 = 75200(0x125c0, float:1.05378E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r9]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.m> r16 = com.ss.android.ugc.aweme.shortvideo.c.m.class
                                        r11 = r2
                                        java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                        com.ss.android.ugc.aweme.shortvideo.c.m r4 = (com.ss.android.ugc.aweme.shortvideo.c.m) r4
                                        goto L_0x0163
                                    L_0x013f:
                                        com.ss.android.ugc.aweme.shortvideo.c.m r4 = new com.ss.android.ugc.aweme.shortvideo.c.m
                                        com.ss.android.ugc.aweme.shortvideo.c.i r5 = r2.f65866c
                                        int r11 = r5.e()
                                        com.ss.android.ugc.aweme.shortvideo.c.i r5 = r2.f65866c
                                        int r12 = r5.b()
                                        com.ss.android.ugc.aweme.shortvideo.c.i r5 = r2.f65866c
                                        int r13 = r5.c()
                                        com.ss.android.ugc.aweme.shortvideo.c.i r5 = r2.f65866c
                                        int r14 = r5.g()
                                        com.ss.android.ugc.aweme.shortvideo.c.i r5 = r2.f65866c
                                        int r15 = r5.d()
                                        r10 = r4
                                        r10.<init>(r11, r12, r13, r14, r15)
                                    L_0x0163:
                                        java.lang.Object[] r10 = new java.lang.Object[r1]
                                        r10[r9] = r4
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.n.a.f65943a
                                        r13 = 0
                                        r14 = 75261(0x125fd, float:1.05463E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r1]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.m> r5 = com.ss.android.ugc.aweme.shortvideo.c.m.class
                                        r15[r9] = r5
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.n$a> r16 = com.ss.android.ugc.aweme.shortvideo.c.n.a.class
                                        r11 = r3
                                        boolean r5 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                                        if (r5 == 0) goto L_0x0197
                                        java.lang.Object[] r10 = new java.lang.Object[r1]
                                        r10[r9] = r4
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.n.a.f65943a
                                        r13 = 0
                                        r14 = 75261(0x125fd, float:1.05463E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r1]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.m> r1 = com.ss.android.ugc.aweme.shortvideo.c.m.class
                                        r15[r9] = r1
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.n$a> r16 = com.ss.android.ugc.aweme.shortvideo.c.n.a.class
                                        r11 = r3
                                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                        r3 = r1
                                        com.ss.android.ugc.aweme.shortvideo.c.n$a r3 = (com.ss.android.ugc.aweme.shortvideo.c.n.a) r3
                                        goto L_0x01a0
                                    L_0x0197:
                                        if (r4 != 0) goto L_0x019e
                                        com.ss.android.ugc.aweme.shortvideo.c.m r4 = new com.ss.android.ugc.aweme.shortvideo.c.m
                                        r4.<init>()
                                    L_0x019e:
                                        r3.f65947e = r4
                                    L_0x01a0:
                                        boolean r1 = r2.h
                                        r3.f65946d = r1
                                        com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r2.l
                                        r3.f65948f = r1
                                        java.lang.Object[] r10 = new java.lang.Object[r9]
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.n.a.f65943a
                                        r13 = 0
                                        r14 = 75262(0x125fe, float:1.05465E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r9]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.n> r16 = com.ss.android.ugc.aweme.shortvideo.c.n.class
                                        r11 = r3
                                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                                        if (r1 == 0) goto L_0x01cf
                                        java.lang.Object[] r10 = new java.lang.Object[r9]
                                        com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.shortvideo.c.n.a.f65943a
                                        r13 = 0
                                        r14 = 75262(0x125fe, float:1.05465E-40)
                                        java.lang.Class[] r15 = new java.lang.Class[r9]
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.c.n> r16 = com.ss.android.ugc.aweme.shortvideo.c.n.class
                                        r11 = r3
                                        java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                                        com.ss.android.ugc.aweme.shortvideo.c.n r1 = (com.ss.android.ugc.aweme.shortvideo.c.n) r1
                                        goto L_0x01e2
                                    L_0x01cf:
                                        com.ss.android.ugc.aweme.shortvideo.c.n r1 = new com.ss.android.ugc.aweme.shortvideo.c.n
                                        android.view.View r11 = r3.f65944b
                                        com.ss.android.ugc.aweme.shortvideo.c.m r12 = r3.f65947e
                                        boolean r13 = r3.f65946d
                                        com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r14 = r3.f65948f
                                        r15 = 0
                                        r10 = r1
                                        r10.<init>(r11, r12, r13, r14, r15)
                                        com.ss.android.ugc.aweme.filter.a r3 = r3.f65945c
                                        r1.f65936b = r3
                                    L_0x01e2:
                                        r2.f65865b = r1
                                    L_0x01e4:
                                        android.support.v7.app.AppCompatActivity r1 = r2.i
                                        android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r1)
                                        java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r3 = com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                                        android.arch.lifecycle.ViewModel r1 = r1.get(r3)
                                        com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel r1 = (com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel) r1
                                        com.ss.android.ugc.aweme.shortvideo.fh r1 = r1.f65401b
                                        if (r1 == 0) goto L_0x0235
                                        java.lang.String r3 = "click_beautify_entrance"
                                        com.ss.android.ugc.aweme.app.d.d r4 = com.ss.android.ugc.aweme.app.d.d.a()
                                        java.lang.String r5 = "creation_id"
                                        java.lang.String r6 = r1.q
                                        com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
                                        java.lang.String r5 = "shoot_way"
                                        java.lang.String r6 = r1.r
                                        com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
                                        java.lang.String r5 = "content_source"
                                        com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r6 = r1.d()
                                        java.lang.String r6 = r6.getContentSource()
                                        com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
                                        java.lang.String r5 = "content_type"
                                        com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.d()
                                        java.lang.String r1 = r1.getContentType()
                                        com.ss.android.ugc.aweme.app.d.d r1 = r4.a((java.lang.String) r5, (java.lang.String) r1)
                                        java.lang.String r4 = "enter_from"
                                        java.lang.String r5 = "video_shoot_page"
                                        com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r4, (java.lang.String) r5)
                                        java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                                        com.ss.android.ugc.aweme.common.r.a((java.lang.String) r3, (java.util.Map) r1)
                                    L_0x0235:
                                        r2.g = r9
                                        com.ss.android.ugc.aweme.shortvideo.c.h r1 = r2.k
                                        if (r1 == 0) goto L_0x0245
                                        com.ss.android.ugc.aweme.shortvideo.c.h r1 = r2.k
                                        com.ss.android.ugc.aweme.shortvideo.sticker.c.c r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.c.c
                                        r3.<init>()
                                        r1.a((com.ss.android.ugc.aweme.photomovie.transition.ITransition) r3)
                                    L_0x0245:
                                        com.ss.android.ugc.aweme.shortvideo.c.n r1 = r2.f65865b
                                        r1.a()
                                        com.ss.android.ugc.aweme.base.activity.e r1 = r2.n
                                        com.ss.android.ugc.aweme.base.activity.a r2 = r2.o
                                        r1.a((com.ss.android.ugc.aweme.base.activity.a) r2)
                                        return
                                    L_0x0252:
                                        r2.a()
                                    L_0x0255:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.hb.AnonymousClass3.onClick(com.ss.android.ugc.aweme.shortvideo.model.RecordToolBarModel):void");
                                }
                            }, hbVar5.f68047c ? C0906R.string.aet : -1);
                        }
                        linkedHashMap5.put(13, recordToolBarModel4);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap6 = gzVar.f68033c;
                        hb hbVar6 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar6, hb.f68045a, false, 74811, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel5 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar6, hb.f68045a, false, 74811, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel5 = new RecordToolBarModel(2130839541, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68066a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68066a, false, 74830, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68066a, false, 74830, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                    r.a("count_down", (Map) d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v).f34114b);
                                    ((RecordViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(RecordViewModel.class)).f77636f.setValue(null);
                                }
                            }, hbVar6.f68047c ? C0906R.string.a2g : -1);
                        }
                        linkedHashMap6.put(7, recordToolBarModel5);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap7 = gzVar.f68033c;
                        hb hbVar7 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar7, hb.f68045a, false, 74817, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel6 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar7, hb.f68045a, false, 74817, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel6 = new RecordToolBarModel(com.ss.android.ugc.aweme.port.in.a.L.b(e.a.DefaultMicrophoneState) == 1 ? 2130839528 : 2130839527, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68055a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    int i = 1;
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68055a, false, 74836, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68055a, false, 74836, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    if (recordToolBarModel.enabled) {
                                        if (!hb.this.f68046b.r().f65401b.G) {
                                            i = 2;
                                        }
                                        hb.this.f68046b.k().a((Object) hb.this.f68046b, (bc) new ao(i));
                                    }
                                }
                            }, hbVar7.f68047c ? C0906R.string.bbi : -1);
                        }
                        linkedHashMap7.put(8, recordToolBarModel6);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap8 = gzVar.f68033c;
                        hb hbVar8 = gzVar.f68034d;
                        com.ss.android.ugc.aweme.shortvideo.s.f fVar = gzVar.f68036f;
                        if (PatchProxy.isSupport(new Object[]{fVar}, hbVar8, hb.f68045a, false, 74818, new Class[]{com.ss.android.ugc.aweme.shortvideo.s.f.class}, RecordToolBarModel.class)) {
                            recordToolBarModel7 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{fVar}, hbVar8, hb.f68045a, false, 74818, new Class[]{com.ss.android.ugc.aweme.shortvideo.s.f.class}, RecordToolBarModel.class);
                        } else {
                            recordToolBarModel7 = new RecordToolBarModel(fVar != null && fVar.b() ? 2130839506 : 2130839505, new RecordToolBarClickListener(fVar) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68057a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.s.f f68058b;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    ba baVar;
                                    ba baVar2;
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68057a, false, 74825, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68057a, false, 74825, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                    } else if (!com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a) {
                                        if (this.f68058b.b()) {
                                            bd q = hb.this.f68046b.q();
                                            ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = hb.this.f68046b;
                                            if (PatchProxy.isSupport(new Object[0], null, ba.f74649a, true, 86997, new Class[0], ba.class)) {
                                                baVar2 = (ba) PatchProxy.accessDispatch(new Object[0], null, ba.f74649a, true, 86997, new Class[0], ba.class);
                                            } else {
                                                baVar2 = new ba(false);
                                            }
                                            q.a((Object) shortVideoRecordingOperationPanelFragment, (bc) baVar2);
                                            fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                            r.a("wide_angle", (Map) d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("shoot_way", fhVar.r).a("enter_from", "video_shoot_page").a("to_status", "off").f34114b);
                                            return;
                                        }
                                        bd q2 = hb.this.f68046b.q();
                                        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment2 = hb.this.f68046b;
                                        if (PatchProxy.isSupport(new Object[0], null, ba.f74649a, true, 86996, new Class[0], ba.class)) {
                                            baVar = (ba) PatchProxy.accessDispatch(new Object[0], null, ba.f74649a, true, 86996, new Class[0], ba.class);
                                        } else {
                                            baVar = new ba(true);
                                        }
                                        q2.a((Object) shortVideoRecordingOperationPanelFragment2, (bc) baVar);
                                        fh fhVar2 = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                        r.a("wide_angle", (Map) d.a().a("creation_id", fhVar2.q).a("shoot_way", fhVar2.r).a("shoot_way", fhVar2.r).a("enter_from", "video_shoot_page").a("to_status", "on").f34114b);
                                    }
                                }

                                {
                                    this.f68058b = r2;
                                }
                            }, hbVar8.f68047c ? C0906R.string.dtt : -1);
                        }
                        linkedHashMap8.put(9, recordToolBarModel7);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap9 = gzVar.f68033c;
                        hb hbVar9 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar9, hb.f68045a, false, 74813, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel8 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar9, hb.f68045a, false, 74813, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel8 = new RecordToolBarModel(2130839511, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68070a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68070a, false, 74832, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68070a, false, 74832, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) new q());
                                }
                            }, hbVar9.f68047c ? C0906R.string.a43 : -1);
                        }
                        linkedHashMap9.put(3, recordToolBarModel8);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap10 = gzVar.f68033c;
                        hb hbVar10 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar10, hb.f68045a, false, 74816, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel9 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar10, hb.f68045a, false, 74816, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel9 = new RecordToolBarModel(2130839529, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68053a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68053a, false, 74835, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68053a, false, 74835, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    ((RecordViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(RecordViewModel.class)).f77631a.setValue(Boolean.TRUE);
                                }
                            }, hbVar10.f68047c ? C0906R.string.bca : -1);
                        }
                        linkedHashMap10.put(12, recordToolBarModel9);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap11 = gzVar.f68033c;
                        hb hbVar11 = gzVar.f68034d;
                        boolean z5 = gzVar.f68032b.r().f65401b.V;
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z5 ? (byte) 1 : 0)}, hbVar11, hb.f68045a, false, 74815, new Class[]{Boolean.TYPE}, RecordToolBarModel.class)) {
                            recordToolBarModel10 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z5)}, hbVar11, hb.f68045a, false, 74815, new Class[]{Boolean.TYPE}, RecordToolBarModel.class);
                        } else {
                            recordToolBarModel10 = new RecordToolBarModel(z5 ? 2130839540 : 2130839539, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68051a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68051a, false, 74834, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68051a, false, 74834, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                    ay ayVar = new ay(fhVar.V, fhVar.U);
                                    hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) ayVar);
                                    hb.this.f68046b.k().a((Object) hb.this.f68046b, (bc) ayVar);
                                }
                            }, hbVar11.f68047c ? C0906R.string.a8c : -1);
                        }
                        linkedHashMap11.put(11, recordToolBarModel10);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap12 = gzVar.f68033c;
                        hb hbVar12 = gzVar.f68034d;
                        if (PatchProxy.isSupport(new Object[0], hbVar12, hb.f68045a, false, 74812, new Class[0], RecordToolBarModel.class)) {
                            recordToolBarModel11 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[0], hbVar12, hb.f68045a, false, 74812, new Class[0], RecordToolBarModel.class);
                        } else {
                            recordToolBarModel11 = new RecordToolBarModel(2130839523, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68068a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    int i;
                                    String str;
                                    RecordToolBarModel recordToolBarModel2 = recordToolBarModel;
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel2}, this, f68068a, false, 74831, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel2}, this, f68068a, false, 74831, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                        return;
                                    }
                                    CameraModule cameraModule = ((VideoRecordNewActivity) hb.this.f68046b.getActivity()).m;
                                    if (PatchProxy.isSupport(new Object[0], cameraModule, CameraModule.f3959a, false, 78363, new Class[0], Integer.TYPE)) {
                                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], cameraModule, CameraModule.f3959a, false, 78363, new Class[0], Integer.TYPE)).intValue();
                                    } else {
                                        i = CameraModule.u.get(cameraModule.m);
                                    }
                                    hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) new u(i));
                                    recordToolBarModel.notifyStateChanged();
                                    recordToolBarModel2.resId = CameraModule.t.get(i);
                                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                    d a2 = d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("draft_id", fhVar.v);
                                    if (i == 0) {
                                        str = "off";
                                    } else {
                                        str = "on";
                                    }
                                    r.a("light", (Map) a2.a("to_status", str).f34114b);
                                }
                            }, hbVar12.f68047c ? C0906R.string.afh : -1);
                        }
                        linkedHashMap12.put(10, recordToolBarModel11);
                        LinkedHashMap<Integer, RecordToolBarModel> linkedHashMap13 = gzVar.f68033c;
                        hb hbVar13 = gzVar.f68034d;
                        gzVar.f68032b.s();
                        boolean b3 = com.ss.android.ugc.aweme.shortvideo.l.b.b();
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b3 ? (byte) 1 : 0)}, hbVar13, hb.f68045a, false, 74820, new Class[]{Boolean.TYPE}, RecordToolBarModel.class)) {
                            recordToolBarModel12 = (RecordToolBarModel) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b3)}, hbVar13, hb.f68045a, false, 74820, new Class[]{Boolean.TYPE}, RecordToolBarModel.class);
                        } else {
                            recordToolBarModel12 = new RecordToolBarModel(b3 ? 2130839536 : 2130839535, new RecordToolBarClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68062a;

                                public final boolean disableAction(RecordToolBarModel recordToolBarModel) {
                                    return false;
                                }

                                public final void onClick(RecordToolBarModel recordToolBarModel) {
                                    String str;
                                    if (PatchProxy.isSupport(new Object[]{recordToolBarModel}, this, f68062a, false, 74827, new Class[]{RecordToolBarModel.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{recordToolBarModel}, this, f68062a, false, 74827, new Class[]{RecordToolBarModel.class}, Void.TYPE);
                                    } else if (!com.ss.android.ugc.aweme.shortvideo.transition.a.f70438a) {
                                        boolean z = !com.ss.android.ugc.aweme.shortvideo.l.b.b();
                                        ((RecordToolbarViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(RecordToolbarViewModel.class)).i.setValue(Boolean.valueOf(z));
                                        hb.this.f68046b.q().a((Object) hb.this.f68046b, (bc) new ap(z));
                                        fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(hb.this.f68046b.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                        d a2 = d.a().a("creation_id", fhVar.q).a("shoot_way", fhVar.r).a("enter_from", "video_shoot_page");
                                        if (z) {
                                            str = "on";
                                        } else {
                                            str = "off";
                                        }
                                        r.a("click_anti_shake", (Map) a2.a("to_status", str).a("draft_id", fhVar.v).f34114b);
                                    }
                                }
                            }, hbVar13.f68047c ? C0906R.string.c60 : -1);
                        }
                        linkedHashMap13.put(14, recordToolBarModel12);
                    }
                    fh fhVar3 = gzVar.f68032b.r().f65401b;
                    boolean z6 = new com.ss.android.ugc.aweme.shortvideo.e.d().a() == 1;
                    boolean z7 = gzVar.f68036f != null && gzVar.f68036f.f69149b.b(z6);
                    boolean z8 = fhVar3.c() && com.ss.android.ugc.aweme.port.in.a.L.b(e.a.DefaultMicrophoneState) != 3;
                    boolean z9 = (com.ss.android.ugc.aweme.shortvideo.e.f.a() || com.ss.android.g.a.b()) && !aj.f65581d.d();
                    boolean a4 = fhVar3.a();
                    boolean a5 = gzVar.f68032b.s().a(z6, false);
                    boolean a6 = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.SplitFilterBeauty);
                    if (!com.ss.android.g.a.b()) {
                        i3 = 5;
                    }
                    if (z8) {
                        i3++;
                    }
                    if (gzVar.f68036f != null && gzVar.f68036f.f69149b.c()) {
                        i3++;
                    }
                    if (a4) {
                        i3++;
                    }
                    if (a6) {
                        i3++;
                    }
                    com.ss.android.ugc.aweme.shortvideo.adapter.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.adapter.c(gzVar.f68032b, gzVar.f68033c, z8, a4, z6, z9, z7, a5, a6, i3);
                    gzVar.f68035e = cVar2;
                    com.ss.android.ugc.aweme.shortvideo.adapter.c cVar3 = gzVar.f68035e;
                    if (PatchProxy.isSupport(new Object[0], cVar3, com.ss.android.ugc.aweme.shortvideo.adapter.c.f65502a, false, 74997, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cVar3, com.ss.android.ugc.aweme.shortvideo.adapter.c.f65502a, false, 74997, new Class[0], Void.TYPE);
                    } else {
                        if (!cVar3.g) {
                            i2 = 3;
                            cVar3.f65505d.get(8).status = 3;
                        } else {
                            i2 = 3;
                        }
                        if (cVar3.f65507f) {
                            cVar3.f65505d.get(10).status = i2;
                        }
                        if (!cVar3.i) {
                            cVar3.f65505d.get(11).status = i2;
                        }
                        if (!cVar3.h) {
                            cVar3.f65505d.get(Integer.valueOf(i2)).status = i2;
                        }
                        if (!cVar3.j) {
                            cVar3.f65505d.get(9).status = i2;
                        }
                        if (!cVar3.k) {
                            cVar3.f65505d.get(14).status = i2;
                        }
                        if (!cVar3.l) {
                            cVar3.f65505d.get(13).status = i2;
                        }
                    }
                    gzVar.f68035e.a();
                    cVar = gzVar.f68035e;
                }
                this.aa = cVar;
                if (PatchProxy.isSupport(new Object[0], gzVar, gz.f68031a, false, 74804, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], gzVar, gz.f68031a, false, 74804, new Class[0], Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[0], gzVar, gz.f68031a, false, 74806, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], gzVar, gz.f68031a, false, 74806, new Class[0], Void.TYPE);
                    } else {
                        fh fhVar4 = gzVar.f68032b.r().f65401b;
                        if (fhVar4.b() || fhVar4.c() || fhVar4.f67719b == 1 || fhVar4.f67719b == 2) {
                            gzVar.f68032b.k().a((Object) gzVar, (bc) new az(fhVar4.V, true));
                        }
                    }
                    if (PatchProxy.isSupport(new Object[0], gzVar, gz.f68031a, false, 74805, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], gzVar, gz.f68031a, false, 74805, new Class[0], Void.TYPE);
                    } else if (gzVar.f68036f != null) {
                        com.ss.android.ugc.aweme.shortvideo.s.f fVar2 = gzVar.f68036f;
                        if (PatchProxy.isSupport(new Object[0], fVar2, com.ss.android.ugc.aweme.shortvideo.s.f.f69148a, false, 81268, new Class[0], Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], fVar2, com.ss.android.ugc.aweme.shortvideo.s.f.f69148a, false, 81268, new Class[0], Boolean.TYPE)).booleanValue();
                        } else if (fVar2.f69149b.f69128b && fVar2.b()) {
                            z2 = true;
                        }
                        if (z2) {
                            gzVar.f68032b.k().a((Object) gzVar, (bc) new u(5));
                        }
                    }
                }
            }
            Intrinsics.checkParameterIsNotNull(gzVar, "<set-?>");
            recordToolbarViewModel.f77611a = gzVar;
            RecordToolbarViewModel recordToolbarViewModel2 = this.s;
            com.ss.android.ugc.aweme.shortvideo.adapter.c cVar4 = this.aa;
            Intrinsics.checkParameterIsNotNull(cVar4, "<set-?>");
            recordToolbarViewModel2.f77612b = cVar4;
            this.u.f77601a = this.W;
            this.u.f77602b = this.k;
            this.v.f77599a.observe(this, new Cdo(this));
            this.v.f77600b.observe(this, new dp(this));
            ai.a("planC => onCreateView end");
            return this.al;
        }
        throw new IllegalArgumentException("tag duplicate, use another tag when invoke setupWithActivity for the second time in same Fragment");
    }

    public final void a(FragmentActivity fragmentActivity, MediaRecordPresenter mediaRecordPresenter) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, mediaRecordPresenter}, this, f65353a, false, 74288, new Class[]{FragmentActivity.class, MediaRecordPresenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, mediaRecordPresenter}, this, f65353a, false, 74288, new Class[]{FragmentActivity.class, MediaRecordPresenter.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.ar.text.r a2 = new com.ss.android.ugc.aweme.shortvideo.ar.text.b(fragmentActivity, mediaRecordPresenter, this).a(0);
        a2.g = a(0, mediaRecordPresenter, fragmentActivity);
        com.ss.android.ugc.aweme.shortvideo.ar.text.r a3 = new com.ss.android.ugc.aweme.shortvideo.ar.text.g(fragmentActivity, mediaRecordPresenter, this).a(1);
        a3.g = a(1, mediaRecordPresenter, fragmentActivity);
        this.V = new com.ss.android.ugc.aweme.shortvideo.ar.text.r[2];
        this.V[0] = a2;
        this.V[1] = a3;
        this.U = new com.ss.android.ugc.aweme.shortvideo.ar.text.l(this.V, fragmentActivity, this);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74292, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74292, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.ah == null || this.ag == null)) {
            int i2 = 4;
            this.ah.setVisibility(z2 ? 0 : 4);
            RelativeLayout relativeLayout = this.ag;
            if (z2) {
                i2 = 0;
            }
            relativeLayout.setVisibility(i2);
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f65353a, false, 74299, new Class[0], Boolean.TYPE)) {
            return !j();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74299, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(Boolean bool, String str, e eVar, String str2) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{bool, str, eVar2, str2}, this, f65353a, false, 74306, new Class[]{Boolean.class, String.class, e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool, str, eVar2, str2}, this, f65353a, false, 74306, new Class[]{Boolean.class, String.class, e.class, String.class}, Void.TYPE);
        } else if (bool.booleanValue()) {
            if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74311, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74311, new Class[0], Void.TYPE);
            } else {
                this.r.a(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839503));
                this.r.a(getResources().getText(C0906R.string.sy).toString());
            }
            this.L = null;
        } else {
            if (!TextUtils.isEmpty(str2)) {
                a(eVar2);
                this.r.g.setValue(null);
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65353a, false, 74320, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65353a, false, 74320, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.r.a(str2);
    }

    public final void a(Animation animation) {
        if (PatchProxy.isSupport(new Object[]{animation}, this, f65353a, false, 74329, new Class[]{Animation.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animation}, this, f65353a, false, 74329, new Class[]{Animation.class}, Void.TYPE);
        } else if (this.Q != null && this.Q.b() != null) {
            Intrinsics.checkParameterIsNotNull(animation, "animation");
            TabHost tabHost = ((com.ss.android.ugc.gamora.recorder.d) this.Q.b().a("RecordBottomTabScene")).i;
            if (tabHost == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabHost");
            }
            tabHost.startAnimation(animation);
        }
    }

    public PlanC() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void p() {
        if (isResumed()) {
            h();
            this.f65358f.setVisibility(0);
            this.f65358f.a(1);
            this.f65358f.x = true;
            this.f65358f.a();
        }
    }

    private boolean v() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74283, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74283, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (c() || d()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean c() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74281, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74281, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.AmericaRecordOptim) == 2) {
            z2 = true;
        }
        return z2;
    }

    public final boolean d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74282, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74282, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.AmericaRecordOptim) == 3) {
            z2 = true;
        }
        return z2;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74294, new Class[0], Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.shortvideo.ar.text.r rVar : this.V) {
            if (rVar != null && rVar.n) {
                rVar.e();
                rVar.n = false;
            }
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74336, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.port.in.a.L.a(e.a.AmericaRecordUploadGuideShow)) {
            this.M.post(new du(this));
        }
    }

    public final boolean o() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74340, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74340, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.p.a() || super.o()) {
            return true;
        } else {
            return false;
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74339, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.u.f77606f.setValue(null);
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74334, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.n != null) {
            this.n.c();
        }
    }

    public final void an_() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74289, new Class[0], Void.TYPE);
        } else if (fc.a() && !j()) {
            switch (fb.f67663b) {
                case 1:
                case 4:
                    i(true);
                    j(true);
                    return;
                case 2:
                case 5:
                    i(false);
                    j(true);
                    return;
                case 3:
                case 6:
                    i(true);
                    j(false);
                    return;
                default:
                    i(false);
                    j(false);
                    return;
            }
        }
    }

    public final String l() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74327, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74327, new Class[0], String.class);
        } else if (this.Q == null || this.Q.b() == null) {
            return "";
        } else {
            return (String) ((com.ss.android.ugc.gamora.recorder.d) this.Q.b().a("RecordBottomTabScene")).a();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74330, new Class[0], Void.TYPE);
        } else if (this.Q != null && this.Q.b() != null) {
            TabHost tabHost = ((com.ss.android.ugc.gamora.recorder.d) this.Q.b().a("RecordBottomTabScene")).i;
            if (tabHost == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabHost");
            }
            tabHost.clearAnimation();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74312, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f65355c.a(false);
        if (this.l != null) {
            com.ss.android.ugc.aweme.shortvideo.local.a aVar = this.l;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.local.a.f68330a, false, 77544, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.local.a.f68330a, false, 77544, new Class[0], Void.TYPE);
            } else if (aVar.g != null) {
                aVar.g.a();
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74338, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f65358f.c();
        this.u.f77605e.setValue(null);
        if (this.L != null) {
            ej.a().a(this.L);
        }
    }

    public final void b() {
        ObjectAnimator objectAnimator;
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74280, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.x, "alpha", new float[]{this.x.getAlpha(), 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B, "alpha", new float[]{this.B.getAlpha(), 0.0f});
        if (this.x.getVisibility() == 0) {
            View view = this.A;
            float[] fArr = new float[2];
            fArr[0] = 0.0f;
            int height = this.aj.getHeight();
            if (fc.a()) {
                i3 = fc.d(getActivity());
            } else {
                i3 = 0;
            }
            fArr[1] = (float) (height + i3);
            objectAnimator = ObjectAnimator.ofFloat(view, "translationY", fArr);
        } else {
            View view2 = this.A;
            float[] fArr2 = new float[2];
            fArr2[0] = this.A.getY();
            int height2 = this.aj.getHeight();
            if (fc.a()) {
                i2 = fc.d(getActivity());
            } else {
                i2 = 0;
            }
            fArr2[1] = (float) (height2 + i2);
            objectAnimator = ObjectAnimator.ofFloat(view2, "translationY", fArr2);
        }
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, objectAnimator});
        animatorSet.setDuration(500);
        animatorSet.addListener(new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f65364a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f65364a, false, 74362, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f65364a, false, 74362, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (!PlanC.this.z) {
                    PlanC.this.G.b();
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f65364a, false, 74363, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f65364a, false, 74363, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                PlanC.this.x.setVisibility(8);
                PlanC.this.B.setVisibility(8);
                PlanC.this.a(2);
                PlanC.this.z = true;
                if (PlanC.this.c()) {
                    PlanC.this.n();
                }
            }
        });
        animatorSet.start();
        this.D.a(1);
    }

    public final void e() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74284, new Class[0], Void.TYPE);
        } else if (this.H) {
            if (!this.I) {
                a(this.al);
            }
            a(1);
            this.aj.setVisibility(0);
            this.x.setVisibility(8);
            if (d() || com.ss.android.ugc.aweme.port.in.a.L.a(e.a.AmericaRecordUploadGuideShow)) {
                this.z = true;
            }
            if (!this.J) {
                this.G.a(this.z);
                if (this.k != null) {
                    if (this.z) {
                        this.k.al = "video_shoot_page";
                    } else {
                        this.k.al = "multi_shoot_page";
                    }
                }
            }
            this.z = true;
            a(1);
            this.A.setVisibility(0);
            View view = this.A;
            float[] fArr = new float[2];
            fArr[0] = this.A.getY();
            if (!fc.a() || !fb.a()) {
                f2 = 0.0f;
            } else {
                f2 = (float) fc.c(getActivity());
            }
            fArr[1] = f2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", fArr);
            ofFloat.setDuration(300);
            ofFloat.start();
            this.D.a(2);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74298, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.shortvideo.m.a.a(this.Y)) {
            com.ss.android.ugc.aweme.shortvideo.m.b bVar = new com.ss.android.ugc.aweme.shortvideo.m.b(getActivity());
            ds dsVar = new ds(this);
            if (PatchProxy.isSupport(new Object[]{dsVar}, bVar, com.ss.android.ugc.aweme.shortvideo.m.b.f68366a, false, 78516, new Class[]{b.a.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.m.b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{dsVar}, bVar2, com.ss.android.ugc.aweme.shortvideo.m.b.f68366a, false, 78516, new Class[]{b.a.class}, Void.TYPE);
            } else {
                bVar.a(C0906R.raw.shutter_sound_shoot, bVar.f68368c.getStreamMaxVolume(3), bVar.f68368c.getStreamVolume(3), dsVar);
            }
        } else {
            i();
        }
    }

    public final boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74301, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74301, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.Q == null || this.Q.b() == null) {
            return false;
        } else {
            return TextUtils.equals((CharSequence) ((com.ss.android.ugc.gamora.recorder.d) this.Q.b().a("RecordBottomTabScene")).a(), getString(C0906R.string.bx3));
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74333, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.ad != null && this.ad.isShowing()) {
            Dialog dialog = this.ad;
            if (PatchProxy.isSupport(new Object[]{dialog}, null, dx.f66802a, true, 74367, new Class[]{Dialog.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialog}, null, dx.f66802a, true, 74367, new Class[]{Dialog.class}, Void.TYPE);
            } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                dialog.dismiss();
            } else {
                throw new IllegalStateException("debug check! this method should be called from main thread!");
            }
        }
        if (this.n != null) {
            this.n.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74300, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65356d == null) {
            this.f65356d = this.Q.b().a();
        }
        au auVar = new au(this.f65356d.a());
        q().a((Object) this.f65358f, (bc) auVar);
        this.f65355c.a((Object) this.f65358f, (bc) auVar);
        this.f65355c.a((Object) this.f65354b, (bc) new az(r().f65401b.V, true));
        this.f65355c.a((Object) this.f65354b, (bc) new ao(4));
        q().a((Object) this.f65354b, (bc) new ar(com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.RecordErrorSimulate)));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(boolean z2) {
        this.T = z2;
        if (!j()) {
            d(!z2);
        }
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f65353a, false, 74323, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f65353a, false, 74323, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.r.a(drawable2);
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74307, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74307, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.T || (v() && !this.z)) {
            this.r.c(false);
        } else {
            this.r.c(z2);
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74314, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74314, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q.g.setValue(Integer.valueOf(i2));
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74315, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74315, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.setVisibility(i2);
        }
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74316, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74316, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.setVisibility(i2);
        }
    }

    public final void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74318, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74318, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.setVisibility(i2);
        }
    }

    public final void g(int i2) {
        if (PatchProxy.isSupport(new Object[]{8}, this, f65353a, false, 74319, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{8}, this, f65353a, false, 74319, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r.b(false);
        this.r.a(false);
    }

    public final void h(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.sy)}, this, f65353a, false, 74321, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.sy)}, this, f65353a, false, 74321, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(getResources().getString(C0906R.string.sy));
    }

    public final void i(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74322, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74322, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r.a(i2);
    }

    public final String j(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74326, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74326, new Class[]{Integer.TYPE}, String.class);
        } else if (this.Q == null || this.Q.b() == null) {
            return "";
        } else {
            TabHost tabHost = ((com.ss.android.ugc.gamora.recorder.d) this.Q.b().a("RecordBottomTabScene")).i;
            if (tabHost == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tabHost");
            }
            return (String) tabHost.a(i2);
        }
    }

    public final void k(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74328, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74328, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q.g.setValue(Integer.valueOf(i2));
    }

    private void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65353a, false, 74274, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65353a, false, 74274, new Class[]{View.class}, Void.TYPE);
        } else if (this.k != null) {
            this.I = true;
            this.am = view.findViewById(C0906R.id.bnd);
            this.aj = (RelativeLayout) view.findViewById(C0906R.id.cg8);
            this.A = view.findViewById(C0906R.id.aic);
            this.B = view.findViewById(C0906R.id.aia);
            this.x = (RelativeLayout) view.findViewById(C0906R.id.cff);
            this.ak = (ImageView) view.findViewById(C0906R.id.j5);
            this.y = (FrameLayout) view.findViewById(C0906R.id.aic);
            if (fc.a()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
                layoutParams.topMargin = fc.c(getActivity());
                this.x.setLayoutParams(layoutParams);
            }
            FragmentManager supportFragmentManager = this.f65354b.getActivity().getSupportFragmentManager();
            if (this.D == null) {
                this.D = MediaChooseFragmentB.a((c) null, this.E, (ImageChooseAdapterB.b) null, this.ap);
                this.D.k = new dz(this);
                supportFragmentManager.beginTransaction().replace(C0906R.id.aic, this.D).commitAllowingStateLoss();
                this.D.f58597e = true;
            }
            this.G.a();
        }
    }

    private void i(boolean z2) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74290, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74290, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.O != null && this.ah != null && this.ai != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.topMargin = fc.c(getActivity());
            this.O.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.o.getLayoutParams();
            layoutParams2.topMargin = fc.c(getActivity());
            this.o.setLayoutParams(layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.ah.getLayoutParams();
            if (z2) {
                i2 = fc.c(getActivity());
            } else {
                i2 = 0;
            }
            layoutParams3.topMargin = i2;
            this.ah.setLayoutParams(layoutParams3);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.ai.getLayoutParams();
            if (z2) {
                i3 = fc.c(getActivity());
            }
            layoutParams4.topMargin = i3;
            this.ai.setLayoutParams(layoutParams4);
            this.u.f77603c.setValue(Boolean.valueOf(z2));
        }
    }

    public final void c(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74308, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74308, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f65358f != null) {
            RecordLayout recordLayout = this.f65358f;
            if (!z2) {
                i2 = 4;
            }
            recordLayout.setVisibility(i2);
        }
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74324, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74324, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.r.h.setValue(Boolean.valueOf(z2));
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65353a, false, 74295, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65353a, false, 74295, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        ai.a("PlanC onActivityCreated");
        if (!this.S.a() && com.ss.android.g.a.b()) {
            this.q.g.setValue(4);
        }
        if (PatchProxy.isSupport(new Object[0], this, f65353a, false, 74296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65353a, false, 74296, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a() && !this.k.b() && !this.k.c() && this.W != null) {
            this.M.postDelayed(new dr(this), 500);
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.d("mv_reuse");
        }
    }

    private void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f65353a, false, 74310, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f65353a, false, 74310, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (eVar != null) {
            this.r.a(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839504));
            StringBuilder sb = new StringBuilder(eVar.getName());
            if (eVar.getSinger() != null && !eVar.getSinger().isEmpty()) {
                sb.append("-");
                sb.append(eVar.getSinger());
            }
            this.r.a(sb.toString());
        }
    }

    private void j(boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74291, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74291, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.ae != null && this.f65358f != null && this.ag != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
            int dip2Px = (int) UIUtils.dip2Px(getActivity(), 33.0f);
            MutableLiveData<Integer> mutableLiveData = this.t.f77597a;
            if (z2) {
                i2 = (dimensionPixelSize - ((int) UIUtils.dip2Px(getActivity(), 40.0f))) / 2;
            } else {
                i2 = 0;
            }
            mutableLiveData.setValue(Integer.valueOf(i2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ae.getLayoutParams();
            if (z2) {
                i3 = ((int) UIUtils.dip2Px(getActivity(), 40.0f)) + dip2Px;
            } else {
                i3 = (int) UIUtils.dip2Px(getActivity(), 40.0f);
            }
            layoutParams.bottomMargin = i3;
            this.ae.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f65358f.getLayoutParams();
            if (z2) {
                i4 = ((int) UIUtils.dip2Px(getActivity(), 35.0f)) + dip2Px;
            } else {
                i4 = (int) UIUtils.dip2Px(getActivity(), 35.0f);
            }
            layoutParams2.bottomMargin = i4;
            this.f65358f.setLayoutParams(layoutParams2);
            this.w.f77607a.setValue(Boolean.valueOf(z2));
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.af.getLayoutParams();
            if (z2) {
                i5 = dip2Px + ((int) UIUtils.dip2Px(getActivity(), 150.0f));
            } else {
                i5 = (int) UIUtils.dip2Px(getActivity(), 150.0f);
            }
            layoutParams3.bottomMargin = i5;
            this.af.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.ag.getLayoutParams();
            if (!z2) {
                dimensionPixelSize = 0;
            }
            layoutParams4.bottomMargin = dimensionPixelSize;
            this.ag.setLayoutParams(layoutParams4);
            if (this.S != null) {
                this.S.a(z2);
            }
            this.u.f77604d.setValue(Boolean.valueOf(z2));
        }
    }

    public final void b(int i2) {
        com.ss.android.ugc.aweme.shortvideo.ar.text.n nVar;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74293, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74293, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.shortvideo.ar.text.r rVar : this.V) {
            if (rVar != null) {
                if (rVar.k == i3) {
                    FragmentActivity activity = getActivity();
                    if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), activity}, null, com.ss.android.ugc.aweme.shortvideo.ar.text.n.f65726b, true, 75163, new Class[]{Integer.TYPE, Context.class}, com.ss.android.ugc.aweme.shortvideo.ar.text.n.class)) {
                        switch (i3) {
                            case 0:
                                nVar = new com.ss.android.ugc.aweme.shortvideo.ar.text.a(activity);
                                break;
                            case 1:
                                nVar = new com.ss.android.ugc.aweme.shortvideo.ar.text.f(activity);
                                break;
                            default:
                                nVar = new com.ss.android.ugc.aweme.shortvideo.ar.text.n(activity);
                                break;
                        }
                    } else {
                        nVar = (com.ss.android.ugc.aweme.shortvideo.ar.text.n) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), activity}, null, com.ss.android.ugc.aweme.shortvideo.ar.text.n.f65726b, true, 75163, new Class[]{Integer.TYPE, Context.class}, com.ss.android.ugc.aweme.shortvideo.ar.text.n.class);
                    }
                    rVar.a(nVar);
                    this.ac.addView(nVar);
                    rVar.f();
                    rVar.n = true;
                } else {
                    rVar.e();
                    rVar.n = false;
                }
            }
        }
    }

    public final void d(boolean z2) {
        int i2;
        int i3;
        boolean z3;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74309, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74309, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.X || !z2) {
            super.d(z2);
            if (z2) {
                com.ss.android.ugc.gamora.a.c.a(this.Q.b(), "RecordToolbarScene");
                if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpeedPanelOpen)) {
                    com.ss.android.ugc.gamora.a.c.a(this.Q.b(), "RecordSpeedGroupScene");
                }
            } else {
                com.ss.android.ugc.gamora.a.c.b(this.Q.b(), "RecordToolbarScene");
                com.ss.android.ugc.gamora.a.c.b(this.Q.b(), "RecordSpeedGroupScene");
            }
            ViewGroup viewGroup = this.an;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            viewGroup.setVisibility(i2);
            View view = this.ai;
            if (z2) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view.setVisibility(i3);
            if (!z2) {
                this.r.f77609e.setValue(null);
            }
            if (this.k.n > 0) {
                if (z2) {
                    f(0);
                    e(0);
                    d(8);
                } else {
                    f(8);
                    e(0);
                    d(8);
                }
            } else if (z2) {
                f(8);
                e(8);
                d(0);
            } else {
                f(8);
                e(8);
                d(8);
            }
            if (r().f65401b.b() || r().f65401b.c()) {
                this.r.b(false);
                this.r.a(false);
                d(8);
                if (!z2) {
                    f(4);
                    e(4);
                }
                return;
            }
            if (this.f65354b.getActivity() != null && !TextUtils.equals((CharSequence) ((com.ss.android.ugc.gamora.recorder.d) this.Q.b().a("RecordBottomTabScene")).a(), this.f65354b.getActivity().getResources().getString(C0906R.string.bx9))) {
                RecordTitleViewModel recordTitleViewModel = this.r;
                if (!z2 || (v() && !this.z)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                recordTitleViewModel.a(z3);
                RecordTitleViewModel recordTitleViewModel2 = this.r;
                if (!z2 || (v() && !this.z)) {
                    z4 = false;
                }
                recordTitleViewModel2.b(z4);
            }
        }
    }

    public final void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65353a, false, 74317, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f65353a, false, 74317, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.setSelected(z2);
        }
    }

    public void onClick(View view) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f65353a, false, 74331, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f65353a, false, 74331, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.b0g) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, f65353a, false, 74332, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f65353a, false, 74332, new Class[]{View.class}, Void.TYPE);
            } else {
                if (this.ad == null || !this.ad.isShowing()) {
                    com.ss.android.common.lib.a.a(view.getContext(), "take_video_delete_popup", "show", 0, 0, this.f65354b.t());
                    a.C0185a aVar = new a.C0185a(this.f65354b.getContext());
                    aVar.b(this.f65354b.getResources().getString(C0906R.string.a4q));
                    aVar.a(this.f65354b.getResources().getString(C0906R.string.a4f), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f65372a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65372a, false, 74354, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65372a, false, 74354, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            } else if (!PlanC.this.f65354b.isDetached()) {
                                com.ss.android.common.lib.a.a(PlanC.this.f65354b.getContext(), "take_video_delete_popup", "confirm", 0, 0, PlanC.this.f65354b.t());
                                r.a("delete_clip", (Map) d.a().a("creation_id", PlanC.this.k.q).a("shoot_way", PlanC.this.k.r).a("draft_id", PlanC.this.k.v).f34114b);
                                com.ss.android.ugc.aweme.tools.r rVar = new com.ss.android.ugc.aweme.tools.r();
                                PlanC.this.q().a((Object) view2, (bc) rVar);
                                PlanC.this.k().a((Object) view2, (bc) rVar);
                            }
                        }
                    }).b(this.f65354b.getResources().getString(C0906R.string.pm), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f65370a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65370a, false, 74353, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65370a, false, 74353, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            } else if (!PlanC.this.f65354b.isDetached()) {
                                com.ss.android.common.lib.a.a(PlanC.this.f65354b.getContext(), "take_video_delete_popup", "cancel", 0, 0, PlanC.this.f65354b.t());
                            }
                        }
                    });
                    this.ad = aVar.a().a();
                    if (!fc.a() && !com.ss.android.ugc.aweme.app.a.a.a((Activity) this.f65354b.getActivity())) {
                        com.ss.android.ugc.aweme.base.utils.v.a(this.ad);
                    }
                }
            }
        } else if (id == C0906R.id.j5) {
            this.f65354b.getActivity().finish();
        } else if (id == C0906R.id.cff) {
            b();
        }
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65353a, false, 74325, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65353a, false, 74325, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.r.a(f2);
    }

    @SuppressLint({"RestrictedApi"})
    public void onAttach(Context context) {
        com.ss.android.ugc.aweme.tools.bh bhVar;
        com.ss.android.ugc.aweme.tools.bh bhVar2;
        com.ss.android.ugc.aweme.tools.bh bhVar3;
        com.ss.android.ugc.aweme.tools.bh bhVar4;
        com.ss.android.ugc.aweme.tools.bh bhVar5;
        com.ss.android.ugc.aweme.tools.bh bhVar6;
        if (PatchProxy.isSupport(new Object[]{context}, this, f65353a, false, 74272, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f65353a, false, 74272, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        com.ss.android.ugc.aweme.mediachoose.a.d.a(context.getApplicationContext());
        this.f65357e = new GoNextFactoryFactory(this);
        cd cdVar = new cd(this, this);
        be a2 = new be().a((com.ss.android.ugc.aweme.tools.bh) new bh(this, this)).a((com.ss.android.ugc.aweme.tools.bh) new et(this, this, this)).a((com.ss.android.ugc.aweme.tools.bh) new ct(this)).a((com.ss.android.ugc.aweme.tools.bh) new ew(this)).a((com.ss.android.ugc.aweme.tools.bh) new gf(this)).a((com.ss.android.ugc.aweme.tools.bh) new gh(this, this, this)).a((com.ss.android.ugc.aweme.tools.bh) new br(this)).a((com.ss.android.ugc.aweme.tools.bh) new ed(this, this)).a((com.ss.android.ugc.aweme.tools.bh) new ef(this)).a((com.ss.android.ugc.aweme.tools.bh) new dy(this)).a((com.ss.android.ugc.aweme.tools.bh) new fa(this)).a((com.ss.android.ugc.aweme.tools.bh) new ez(this)).a((com.ss.android.ugc.aweme.tools.bh) new ab(this, this)).a((com.ss.android.ugc.aweme.tools.bh) new es(this)).a((com.ss.android.ugc.aweme.tools.bh) new eu(this, this)).a((com.ss.android.ugc.aweme.tools.bh) new af(this)).a((com.ss.android.ugc.aweme.tools.bh) new v(this));
        GoNextFactoryFactory goNextFactoryFactory = this.f65357e;
        if (PatchProxy.isSupport(new Object[0], goNextFactoryFactory, GoNextFactoryFactory.f65336a, false, 74130, new Class[0], com.ss.android.ugc.aweme.tools.bh.class)) {
            bhVar = (com.ss.android.ugc.aweme.tools.bh) PatchProxy.accessDispatch(new Object[0], goNextFactoryFactory, GoNextFactoryFactory.f65336a, false, 74130, new Class[0], com.ss.android.ugc.aweme.tools.bh.class);
        } else {
            bhVar = new com.ss.android.ugc.aweme.tools.bh() {

                /* renamed from: a */
                public static ChangeQuickRedirect f65346a;

                public final <T extends com.ss.android.ugc.aweme.tools.bc> com.ss.android.ugc.aweme.tools.bg<T> a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory.2.a(com.ss.android.ugc.aweme.tools.bd, java.lang.reflect.Type):com.ss.android.ugc.aweme.tools.bg<T>, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory.2.a(com.ss.android.ugc.aweme.tools.bd, java.lang.reflect.Type):com.ss.android.ugc.aweme.tools.bg<T>, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
        }
        be a3 = a2.a(bhVar);
        GoNextFactoryFactory goNextFactoryFactory2 = this.f65357e;
        if (PatchProxy.isSupport(new Object[0], goNextFactoryFactory2, GoNextFactoryFactory.f65336a, false, 74129, new Class[0], com.ss.android.ugc.aweme.tools.bh.class)) {
            bhVar2 = (com.ss.android.ugc.aweme.tools.bh) PatchProxy.accessDispatch(new Object[0], goNextFactoryFactory2, GoNextFactoryFactory.f65336a, false, 74129, new Class[0], com.ss.android.ugc.aweme.tools.bh.class);
        } else {
            bhVar2 = new com.ss.android.ugc.aweme.tools.bh() {

                /* renamed from: a */
                public static ChangeQuickRedirect f65342a;

                public final <T extends com.ss.android.ugc.aweme.tools.bc> com.ss.android.ugc.aweme.tools.bg<T> a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory.1.a(com.ss.android.ugc.aweme.tools.bd, java.lang.reflect.Type):com.ss.android.ugc.aweme.tools.bg<T>, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory.1.a(com.ss.android.ugc.aweme.tools.bd, java.lang.reflect.Type):com.ss.android.ugc.aweme.tools.bg<T>, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
        }
        be a4 = a3.a(bhVar2).a((com.ss.android.ugc.aweme.tools.bh) new bn(this)).a((com.ss.android.ugc.aweme.tools.bh) new t(this)).a((com.ss.android.ugc.aweme.tools.bh) new dm(this)).a((com.ss.android.ugc.aweme.tools.bh) new y(this)).a((com.ss.android.ugc.aweme.tools.bh) new hp(this, this, this)).a((com.ss.android.ugc.aweme.tools.bh) new bu(this)).a((com.ss.android.ugc.aweme.tools.bh) new fx(this)).a((com.ss.android.ugc.aweme.tools.bh) new ak(this)).a((com.ss.android.ugc.aweme.tools.bh) new ge(this, this)).a((com.ss.android.ugc.aweme.tools.bh) new be(this)).a((com.ss.android.ugc.aweme.tools.bh) new bp(this)).a((com.ss.android.ugc.aweme.tools.bh) new gj(this)).a((com.ss.android.ugc.aweme.tools.bh) new gk(this)).a((com.ss.android.ugc.aweme.tools.bh) new fd(this)).a((com.ss.android.ugc.aweme.tools.bh) new gn(this));
        if (PatchProxy.isSupport(new Object[0], cdVar, cd.f65981a, false, 74192, new Class[0], com.ss.android.ugc.aweme.tools.bh.class)) {
            bhVar3 = (com.ss.android.ugc.aweme.tools.bh) PatchProxy.accessDispatch(new Object[0], cdVar, cd.f65981a, false, 74192, new Class[0], com.ss.android.ugc.aweme.tools.bh.class);
        } else {
            bhVar3 = new com.ss.android.ugc.aweme.tools.bh() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65985a;

                public final <T extends bc> bg<T> a(bd bdVar, Type type) {
                    Type type2 = type;
                    if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65985a, false, 74196, new Class[]{bd.class, Type.class}, bg.class)) {
                        return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65985a, false, 74196, new Class[]{bd.class, Type.class}, bg.class);
                    } else if (type2 != z.class) {
                        return null;
                    } else {
                        return new bg<T>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f65987a;

                            public final void a(Object obj, T t) {
                                if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65987a, false, 74197, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65987a, false, 74197, new Class[]{Object.class, bc.class}, Void.TYPE);
                                    return;
                                }
                                if (cd.this.f65982b == null) {
                                    cd.this.f65982b = com.ss.android.ugc.aweme.shortvideo.view.d.b(cd.this.f65983c.getContext(), cd.this.f65983c.getString(C0906R.string.brl));
                                    cd.this.f65982b.setIndeterminate(true);
                                }
                            }
                        };
                    }
                }
            };
        }
        be a5 = a4.a(bhVar3);
        if (PatchProxy.isSupport(new Object[0], cdVar, cd.f65981a, false, 74193, new Class[0], com.ss.android.ugc.aweme.tools.bh.class)) {
            bhVar4 = (com.ss.android.ugc.aweme.tools.bh) PatchProxy.accessDispatch(new Object[0], cdVar, cd.f65981a, false, 74193, new Class[0], com.ss.android.ugc.aweme.tools.bh.class);
        } else {
            bhVar4 = new com.ss.android.ugc.aweme.tools.bh() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65989a;

                public final <T extends bc> bg<T> a(bd bdVar, Type type) {
                    Type type2 = type;
                    if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65989a, false, 74198, new Class[]{bd.class, Type.class}, bg.class)) {
                        return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65989a, false, 74198, new Class[]{bd.class, Type.class}, bg.class);
                    } else if (type2 != com.ss.android.ugc.aweme.tools.aa.class) {
                        return null;
                    } else {
                        return new bg<T>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f65991a;

                            /* renamed from: b  reason: collision with root package name */
                            RecordLayout f65992b;

                            public final void a(Object obj, T t) {
                                if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65991a, false, 74199, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65991a, false, 74199, new Class[]{Object.class, bc.class}, Void.TYPE);
                                    return;
                                }
                                if (cd.this.f65982b != null) {
                                    cd.this.f65982b.dismiss();
                                    cd.this.f65982b = null;
                                }
                                if (this.f65992b == null) {
                                    this.f65992b = (RecordLayout) cd.this.f65983c.getView().findViewById(C0906R.id.ca_);
                                }
                                fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(cd.this.f65983c.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                                this.f65992b.x = false;
                                Intent intent = new Intent();
                                intent.putExtra("file_path", ((com.ss.android.ugc.aweme.tools.aa) t).f74595a);
                                intent.putExtra("is_huawei_super_slow", true);
                                intent.putExtra("creation_id", fhVar.q);
                                intent.putExtra("poi_struct_in_tools_line", fhVar.D);
                                com.ss.android.ugc.aweme.tools.a.g.a(intent, r.b(fhVar), com.ss.android.ugc.aweme.tools.a.e.CUT, com.ss.android.ugc.aweme.tools.a.e.EDIT);
                                intent.putExtra("shoot_way", fhVar.r);
                                VECutVideoActivity.f66190b.a(cd.this.f65983c.getActivity(), intent);
                            }
                        };
                    }
                }
            };
        }
        be a6 = a5.a(bhVar4);
        if (PatchProxy.isSupport(new Object[0], cdVar, cd.f65981a, false, 74194, new Class[0], com.ss.android.ugc.aweme.tools.bh.class)) {
            bhVar5 = (com.ss.android.ugc.aweme.tools.bh) PatchProxy.accessDispatch(new Object[0], cdVar, cd.f65981a, false, 74194, new Class[0], com.ss.android.ugc.aweme.tools.bh.class);
        } else {
            bhVar5 = new com.ss.android.ugc.aweme.tools.bh() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65994a;

                public final <T extends bc> bg<T> a(bd bdVar, Type type) {
                    if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f65994a, false, 74200, new Class[]{bd.class, Type.class}, bg.class)) {
                        return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f65994a, false, 74200, new Class[]{bd.class, Type.class}, bg.class);
                    } else if (type != com.ss.android.ugc.aweme.tools.g.class) {
                        return null;
                    } else {
                        final bg a2 = bdVar.a((com.ss.android.ugc.aweme.tools.bh) this, type);
                        return new bg<T>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f65996a;

                            /* renamed from: b  reason: collision with root package name */
                            RecordTitleViewModel f65997b;

                            public final void a(Object obj, T t) {
                                if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65996a, false, 74201, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65996a, false, 74201, new Class[]{Object.class, bc.class}, Void.TYPE);
                                    return;
                                }
                                if (a2 != null) {
                                    a2.a(obj, t);
                                }
                                com.ss.android.ugc.aweme.tools.g gVar = (com.ss.android.ugc.aweme.tools.g) t;
                                if (this.f65997b == null) {
                                    this.f65997b = (RecordTitleViewModel) com.ss.android.ugc.gamora.a.a.a(cd.this.f65983c.getActivity()).get(RecordTitleViewModel.class);
                                }
                                if (cd.this.f65983c.getString(C0906R.string.bx1).equals(gVar.f74762c)) {
                                    cd.this.f65983c.d(false);
                                    cd.this.f65984d.k(0);
                                    this.f65997b.c(false);
                                }
                                if (cd.this.f65983c.getString(C0906R.string.bx1).equals(gVar.f74761b)) {
                                    if (!cd.this.f65983c.getString(C0906R.string.bx5).equals(gVar.f74762c)) {
                                        cd.this.f65983c.d(true);
                                    }
                                    this.f65997b.c(true);
                                }
                                if (cd.this.f65982b != null) {
                                    cd.this.f65982b.dismiss();
                                    cd.this.f65982b = null;
                                }
                            }
                        };
                    }
                }
            };
        }
        be a7 = a6.a(bhVar5);
        if (PatchProxy.isSupport(new Object[0], cdVar, cd.f65981a, false, 74195, new Class[0], com.ss.android.ugc.aweme.tools.bh.class)) {
            bhVar6 = (com.ss.android.ugc.aweme.tools.bh) PatchProxy.accessDispatch(new Object[0], cdVar, cd.f65981a, false, 74195, new Class[0], com.ss.android.ugc.aweme.tools.bh.class);
        } else {
            bhVar6 = new com.ss.android.ugc.aweme.tools.bh() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66000a;

                public final <T extends bc> bg<T> a(bd bdVar, Type type) {
                    if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f66000a, false, 74202, new Class[]{bd.class, Type.class}, bg.class)) {
                        return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f66000a, false, 74202, new Class[]{bd.class, Type.class}, bg.class);
                    } else if (type != com.ss.android.ugc.aweme.tools.ax.class) {
                        return null;
                    } else {
                        final bg a2 = bdVar.a((com.ss.android.ugc.aweme.tools.bh) this, type);
                        return new bg<T>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f66002a;

                            /* renamed from: b  reason: collision with root package name */
                            RecordLayout f66003b;

                            public final void a(Object obj, T t) {
                                if (PatchProxy.isSupport(new Object[]{obj, t}, this, f66002a, false, 74203, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{obj, t}, this, f66002a, false, 74203, new Class[]{Object.class, bc.class}, Void.TYPE);
                                    return;
                                }
                                if (cd.this.f65983c.getString(C0906R.string.bx1).equals(cd.this.f65984d.l())) {
                                    if (this.f66003b == null) {
                                        this.f66003b = (RecordLayout) cd.this.f65983c.getView().findViewById(C0906R.id.ca_);
                                    }
                                    this.f66003b.x = false;
                                    if (cd.this.f65982b != null) {
                                        cd.this.f65982b.dismiss();
                                        cd.this.f65982b = null;
                                    }
                                } else if (a2 != null) {
                                    a2.a(obj, t);
                                }
                            }
                        };
                    }
                }
            };
        }
        this.f65355c = a7.a(bhVar6).a(com.ss.android.ugc.aweme.g.a.a()).a(new PrintWriter(new LogWriter("PlanC"))).a();
        this.G = new com.ss.android.ugc.aweme.shortvideo.presenter.e(this, this.k);
        this.q = (RecordViewModel) ViewModelProviders.of(getActivity()).get(RecordViewModel.class);
        this.r = (RecordTitleViewModel) com.ss.android.ugc.gamora.a.a.a(getActivity()).get(RecordTitleViewModel.class);
        this.s = (RecordToolbarViewModel) ViewModelProviders.of(getActivity()).get(RecordToolbarViewModel.class);
        this.t = (RecordBottomTabViewModel) ViewModelProviders.of(getActivity()).get(RecordBottomTabViewModel.class);
        this.u = (RecordMVViewModel) ViewModelProviders.of(getActivity()).get(RecordMVViewModel.class);
        this.v = (RecordCountDownViewModel) ViewModelProviders.of(getActivity()).get(RecordCountDownViewModel.class);
        this.w = (RecordSpeedGroupViewModel) ViewModelProviders.of(getActivity()).get(RecordSpeedGroupViewModel.class);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74275, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65353a, false, 74275, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 1:
                com.ss.android.ugc.gamora.a.c.b(this.Q, "RecordToolbarScene");
                this.r.d(false);
                this.J = true;
                return;
            case 2:
                com.ss.android.ugc.gamora.a.c.a(this.Q, "RecordToolbarScene");
                this.r.d(true);
                this.J = false;
                break;
        }
    }

    @SuppressLint({"ValidFragment"})
    public PlanC(fh fhVar, Intent intent, dmt.av.video.b.a.c cVar) {
        this.k = fhVar;
        this.m = intent;
        this.ao = cVar;
    }

    private r.b a(int i2, MediaRecordPresenter mediaRecordPresenter, FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), mediaRecordPresenter, fragmentActivity}, this, f65353a, false, 74287, new Class[]{Integer.TYPE, MediaRecordPresenter.class, FragmentActivity.class}, r.b.class)) {
            return new dq(this);
        }
        return (r.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), mediaRecordPresenter, fragmentActivity}, this, f65353a, false, 74287, new Class[]{Integer.TYPE, MediaRecordPresenter.class, FragmentActivity.class}, r.b.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f65353a, false, 74305, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f65353a, false, 74305, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        this.S.a(i2, i3, intent2);
    }
}
