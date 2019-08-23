package com.ss.android.ugc.aweme.shortvideo.ui;

import a.i;
import a.j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.app.d.h;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.privacysetting.IAVPrivacySettingService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.setting.l;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.bw;
import com.ss.android.ugc.aweme.shortvideo.da;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.dk;
import com.ss.android.ugc.aweme.shortvideo.dl;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.cc;
import com.ss.android.ugc.aweme.shortvideo.edit.cd;
import com.ss.android.ugc.aweme.shortvideo.edit.cg;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.ek;
import com.ss.android.ugc.aweme.shortvideo.ey;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.gy;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.e;
import com.ss.android.ugc.aweme.shortvideo.publish.f;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.util.aa;
import com.ss.android.ugc.aweme.shortvideo.util.ab;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.shortvideo.view.c;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tencent.bugly.CrashModule;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

public class VideoPublishFragment extends Fragment implements af.a, da {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70600a;
    private long A;
    private CheckBox B;
    private FrameLayout C;
    private i<Void> D;
    private List<Pair<Class<?>, IAVPublishExtension<?>>> E = a.t.a(AVPublishContentType.Video);
    private boolean F;
    private boolean G;
    private w H;
    private int I = -1;

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f70601b;

    /* renamed from: c  reason: collision with root package name */
    View f70602c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.publish.a f70603d = new com.ss.android.ugc.aweme.shortvideo.publish.a();

    /* renamed from: e  reason: collision with root package name */
    e f70604e;

    /* renamed from: f  reason: collision with root package name */
    gy f70605f;
    LinearLayout g;
    bw h;
    RemoteImageView i;
    View j;
    View k;
    ek l;
    d m;
    cb n;
    public boolean o;
    public boolean p;
    public boolean q;
    public VideoCoverBitmapHolder r;
    public Bitmap s;
    c t;
    LinkedHashMap<String, Object> u = new LinkedHashMap<>();
    View.OnTouchListener v = new ag(this);
    private View w;
    private View x;
    private HashTagMentionEditText y;
    private int z;

    public final void e() {
        this.o = true;
    }

    public void onHiddenChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70600a, false, 80465, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f70600a, false, 80465, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z2);
        FragmentInstrumentation.onHiddenChanged(this, z2);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80467, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80466, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70600a, false, 80468, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f70600a, false, 80468, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        FragmentInstrumentation.setUserVisibleHint(this, z2);
    }

    private void a(View view, Bundle bundle) {
        View view2;
        View view3;
        char c2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        int i2;
        View view4 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view4, bundle2}, this, f70600a, false, 80423, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view4, bundle2}, this, f70600a, false, 80423, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        String str2 = this.n.mPath;
        if (this.n.mTimeEffect != null) {
            str2 = this.n.mTimeEffect.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE) ? this.n.mReversePath : this.n.mPath;
        }
        String str3 = str2;
        this.f70604e = new e(this, this.n);
        e eVar = this.f70604e;
        LinearLayout linearLayout = (LinearLayout) view4.findViewById(C0906R.id.b7t);
        if (!PatchProxy.isSupport(new Object[]{linearLayout}, eVar, e.f68873a, false, 78239, new Class[]{LinearLayout.class}, Void.TYPE)) {
            Intrinsics.checkParameterIsNotNull(linearLayout, "parent");
            String str4 = null;
            switch (f.f68931e[eVar.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    DmtTextView dmtTextView = new DmtTextView(linearLayout.getContext(), null, C0906R.style.sa);
                    dmtTextView.setId(C0906R.id.g2);
                    dmtTextView.setBackgroundResource(2130838133);
                    dmtTextView.setCompoundDrawablesWithIntrinsicBounds(2130839785, 0, 0, 0);
                    dmtTextView.setCompoundDrawablePadding(eVar.a(2.0f));
                    dmtTextView.setGravity(16);
                    dmtTextView.setPadding(eVar.a(6.0f), eVar.a(5.5f), eVar.a(8.0f), eVar.a(6.0f));
                    dmtTextView.setText(C0906R.string.cnx);
                    dmtTextView.setTextColor(ContextCompat.getColor(linearLayout.getContext(), C0906R.color.zt));
                    eVar.i = dmtTextView;
                    View view5 = eVar.i;
                    if (view5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hashTagView");
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.rightMargin = eVar.a(8.0f);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams.setMarginEnd(eVar.a(8.0f));
                    }
                    linearLayout.addView(view5, layoutParams);
                    DmtTextView dmtTextView2 = new DmtTextView(linearLayout.getContext(), null, C0906R.style.sa);
                    dmtTextView2.setId(C0906R.id.g1);
                    dmtTextView2.setBackgroundResource(2130838133);
                    dmtTextView2.setCompoundDrawablesWithIntrinsicBounds(2130839786, 0, 0, 0);
                    dmtTextView2.setCompoundDrawablePadding(eVar.a(2.0f));
                    dmtTextView2.setGravity(16);
                    dmtTextView2.setPadding(eVar.a(6.0f), eVar.a(5.5f), eVar.a(8.0f), eVar.a(6.0f));
                    dmtTextView2.setText(C0906R.string.cnw);
                    dmtTextView2.setTextColor(ContextCompat.getColor(linearLayout.getContext(), C0906R.color.zt));
                    eVar.j = dmtTextView2;
                    linearLayout.addView(eVar.j, new LinearLayout.LayoutParams(-2, -2));
                    break;
                case 4:
                case 5:
                    ImageView imageView = new ImageView(linearLayout.getContext());
                    imageView.setId(C0906R.id.g2);
                    imageView.setImageResource(2130838946);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    eVar.i = imageView;
                    View view6 = eVar.i;
                    if (view6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("hashTagView");
                    }
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(eVar.a(20.0f), eVar.a(20.0f));
                    layoutParams2.rightMargin = eVar.a(32.0f);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginEnd(eVar.a(32.0f));
                    }
                    linearLayout.addView(view6, layoutParams2);
                    ImageView imageView2 = new ImageView(linearLayout.getContext());
                    imageView2.setId(C0906R.id.g4);
                    imageView2.setImageResource(2130838785);
                    imageView2.setScaleType(ImageView.ScaleType.CENTER);
                    View view7 = imageView2;
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(eVar.a(20.0f), eVar.a(20.0f));
                    layoutParams3.rightMargin = eVar.a(4.5f);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams3.setMarginEnd(eVar.a(4.5f));
                    }
                    linearLayout.addView(view7, layoutParams3);
                    DmtTextView dmtTextView3 = new DmtTextView(linearLayout.getContext(), null, C0906R.style.sa);
                    dmtTextView3.setGravity(16);
                    dmtTextView3.setTextSize(15.0f);
                    dmtTextView3.setTextColor(ContextCompat.getColor(linearLayout.getContext(), C0906R.color.zt));
                    dmtTextView3.setSingleLine(true);
                    dmtTextView3.setEllipsize(TextUtils.TruncateAt.END);
                    PoiStruct b2 = a.m.b(eVar.l.poiId);
                    if (b2 != null) {
                        str4 = b2.getPoiName();
                    }
                    dmtTextView3.setText(str4);
                    linearLayout.addView(dmtTextView3, new LinearLayout.LayoutParams(-2, -2));
                    imageView2.setOnClickListener(new e.p(eVar, dmtTextView3));
                    dmtTextView3.setOnClickListener(new e.q(eVar, dmtTextView3));
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[]{linearLayout}, eVar, e.f68873a, false, 78239, new Class[]{LinearLayout.class}, Void.TYPE);
        }
        this.f70601b = (RelativeLayout) view4.findViewById(C0906R.id.ma);
        e eVar2 = this.f70604e;
        RelativeLayout relativeLayout = this.f70601b;
        if (PatchProxy.isSupport(new Object[]{relativeLayout, Integer.valueOf(C0906R.id.ag4)}, eVar2, e.f68873a, false, 78246, new Class[]{RelativeLayout.class, Integer.TYPE}, View.class)) {
            view2 = (View) PatchProxy.accessDispatch(new Object[]{relativeLayout, Integer.valueOf(C0906R.id.ag4)}, eVar2, e.f68873a, false, 78246, new Class[]{RelativeLayout.class, Integer.TYPE}, View.class);
        } else {
            Intrinsics.checkParameterIsNotNull(relativeLayout, "parent");
            switch (f.k[eVar2.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    View inflate = LayoutInflater.from(relativeLayout.getContext()).inflate(C0906R.layout.a9x, relativeLayout, false);
                    if (inflate != null) {
                        View view8 = (LinearLayout) inflate;
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams4.addRule(3, C0906R.id.ag4);
                        int a2 = eVar2.a(16.0f);
                        layoutParams4.leftMargin = a2;
                        layoutParams4.rightMargin = a2;
                        layoutParams4.topMargin = a2;
                        layoutParams4.bottomMargin = a2;
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams4.setMarginStart(a2);
                            layoutParams4.setMarginEnd(a2);
                        }
                        relativeLayout.addView(view8, layoutParams4);
                        view2 = view8;
                        break;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                case 4:
                case 5:
                    View inflate2 = LayoutInflater.from(relativeLayout.getContext()).inflate(C0906R.layout.a9y, relativeLayout, false);
                    if (inflate2 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) inflate2;
                        View view9 = linearLayout2;
                        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams5.addRule(3, C0906R.id.ag4);
                        int a3 = eVar2.a(16.0f);
                        layoutParams5.leftMargin = a3;
                        layoutParams5.rightMargin = a3;
                        layoutParams5.topMargin = a3;
                        layoutParams5.bottomMargin = a3;
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams5.setMarginStart(a3);
                            layoutParams5.setMarginEnd(a3);
                        }
                        relativeLayout.addView(view9, layoutParams5);
                        View findViewById = linearLayout2.findViewById(C0906R.id.a73);
                        if (eVar2.d()) {
                            findViewById.setAlpha(0.5f);
                            findViewById.setOnClickListener(new e.d(eVar2));
                        } else {
                            if (!a.L.a(e.a.SaveVideoDirectly)) {
                                findViewById.post(new e.C0724e(eVar2, findViewById));
                                a.L.a(e.a.SaveVideoDirectly, true);
                            }
                            findViewById.setOnClickListener(new e.f(eVar2));
                        }
                        view2 = view9;
                        break;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        this.f70602c = view2;
        this.g = (LinearLayout) view4.findViewById(C0906R.id.b_k);
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80462, new Class[0], Void.TYPE);
        } else if (this.n != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("creation_id", this.n.creationId);
            hashMap.put("enter_from", "video_post_page");
            hashMap.put("content_type", "video");
            hashMap.put("shoot_way", this.n.mShootWay);
            this.f70604e.f68878f = hashMap;
        }
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar3 = this.f70604e;
        if (PatchProxy.isSupport(new Object[0], eVar3, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78230, new Class[0], View.class)) {
            view3 = (View) PatchProxy.accessDispatch(new Object[0], eVar3, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78230, new Class[0], View.class);
        } else {
            view3 = eVar3.i;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("hashTagView");
            }
        }
        this.w = view3;
        this.x = this.f70604e.j;
        this.y = (HashTagMentionEditText) view4.findViewById(C0906R.id.a92);
        this.y.requestFocus();
        this.f70605f = gy.a(this, this.y, this.w, this.x, 0);
        this.h = bw.a(this.f70605f, view4);
        this.f70605f.a();
        this.i = (RemoteImageView) view4.findViewById(C0906R.id.ar7);
        this.i.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d(str3);
        this.i.setOnClickListener(new bz(600) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70609a;

            public final void a(@NotNull View view) {
                Bitmap bitmap;
                String str;
                if (PatchProxy.isSupport(new Object[]{view}, this, f70609a, false, 80487, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f70609a, false, 80487, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (VideoPublishFragment.this.n.mEffectList != null) {
                    arrayList.addAll(VideoPublishFragment.this.n.mEffectList);
                }
                if (VideoPublishFragment.this.n.mTimeEffect != null) {
                    arrayList.add(VideoPublishFragment.this.n.mTimeEffect);
                    VideoPublishFragment.this.n.mTimeEffect.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                VideoPublishFragment.this.r = new VideoCoverBitmapHolder();
                VideoPublishFragment.this.getLifecycle().addObserver(VideoPublishFragment.this.r);
                if (VideoPublishFragment.this.s != null) {
                    bitmap = VideoPublishFragment.this.s;
                } else {
                    bitmap = VideoPublishFragment.this.i.getDrawingCache();
                }
                VideoCoverBitmapHolder.f4018a = bitmap;
                FragmentActivity activity = VideoPublishFragment.this.getActivity();
                RemoteImageView remoteImageView = VideoPublishFragment.this.i;
                cb cbVar = VideoPublishFragment.this.n;
                if (PatchProxy.isSupport(new Object[]{activity, remoteImageView, cbVar}, null, VEVideoPublishPreviewActivity.f70555a, true, 80340, new Class[]{Activity.class, ImageView.class, cb.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity, remoteImageView, cbVar}, null, VEVideoPublishPreviewActivity.f70555a, true, 80340, new Class[]{Activity.class, ImageView.class, cb.class}, Void.TYPE);
                } else {
                    Intent intent = new Intent(activity, VEVideoPublishPreviewActivity.class);
                    intent.putExtra("args", cbVar);
                    ViewCompat.setTransitionName(remoteImageView, "transition_img_name");
                    activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(activity, remoteImageView, "transition_img_name").toBundle());
                }
                VideoPublishFragment.this.p = true;
                r.onEvent(MobClick.obtain().setEventName("preview_cover").setLabelName("edit_page"));
                VideoPublishFragment videoPublishFragment = VideoPublishFragment.this;
                if (PatchProxy.isSupport(new Object[0], videoPublishFragment, VideoPublishFragment.f70600a, false, 80463, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], videoPublishFragment, VideoPublishFragment.f70600a, false, 80463, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", videoPublishFragment.n.creationId).a("enter_from", "video_post_page").a("shoot_way", videoPublishFragment.n.mShootWay).a("shoot_entrance", videoPublishFragment.k()).a("content_source", b.a(videoPublishFragment.n));
                if (videoPublishFragment.n.isMvThemeVideoType()) {
                    str = "mv";
                } else {
                    str = "video";
                }
                r.a("click_preview_entrance", (Map) a2.a("content_type", str).a("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).f34114b);
            }
        });
        if (PatchProxy.isSupport(new Object[]{view4}, this, f70600a, false, 80426, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view4}, this, f70600a, false, 80426, new Class[]{View.class}, Void.TYPE);
        } else {
            view4.findViewById(C0906R.id.sm).setOnClickListener(new bz(600) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70617a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f70617a, false, 80492, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f70617a, false, 80492, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (PatchProxy.isSupport(new Object[0], this, f70617a, false, 80493, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f70617a, false, 80493, new Class[0], Void.TYPE);
                    } else {
                        r.a("click_cover_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", VideoPublishFragment.this.n.creationId).a("enter_from", "video_post_page").a("shoot_way", VideoPublishFragment.this.n.mShootWay).a("shoot_entrance", VideoPublishFragment.this.k()).a("content_type", VideoPublishFragment.this.n.getAvetParameter().getContentType()).a("content_source", VideoPublishFragment.this.n.getAvetParameter().getContentSource()).f34114b);
                        VideoPublishFragment.this.q = true;
                    }
                    FragmentActivity activity = VideoPublishFragment.this.getActivity();
                    cb cbVar = VideoPublishFragment.this.n;
                    if (PatchProxy.isSupport(new Object[]{activity, cbVar, 4}, null, ChooseCoverActivity.f71226a, true, 81081, new Class[]{Activity.class, cb.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity, cbVar, 4}, null, ChooseCoverActivity.f71226a, true, 81081, new Class[]{Activity.class, cb.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    Intent intent = new Intent(activity, ChooseCoverActivity.class);
                    intent.addFlags(603979776);
                    intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", cbVar);
                    activity.startActivityForResult(intent, 4);
                    activity.overridePendingTransition(C0906R.anim.r, C0906R.anim.s);
                }
            });
        }
        DmtTextView dmtTextView4 = (DmtTextView) this.f70602c.findViewById(C0906R.id.c8x);
        boolean a4 = a.M.a(a.C0682a.UseNewPublishShareDescription);
        if (com.ss.android.g.a.c() && a4 && dmtTextView4 != null) {
            dmtTextView4.setText(C0906R.string.c7d);
        }
        this.j = this.f70602c.findViewById(C0906R.id.c8h);
        this.j.setOnClickListener(new ax(1000) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70611a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f70611a, false, 80488, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f70611a, false, 80488, new Class[]{View.class}, Void.TYPE);
                } else if (!com.ss.android.ugc.aweme.port.in.a.x.c()) {
                    VideoPublishFragment.this.g();
                } else if (com.ss.android.ugc.aweme.port.in.a.x.b()) {
                    com.bytedance.ies.dmt.ui.d.a.c(VideoPublishFragment.this.getContext(), (int) C0906R.string.chy).a();
                } else {
                    VideoPublishFragment.this.f70605f.b("publish");
                    if (VideoPublishFragment.this.b()) {
                        org.greenrobot.eventbus.c.a().d(new h(true));
                    }
                    if (((Integer) VideoPublishFragment.this.f70604e.f68874b.getValue()).intValue() == 1) {
                        VideoPublishFragment.this.h();
                    } else {
                        com.ss.android.ugc.aweme.port.in.a.f61121d.a(VideoPublishFragment.this.getContext(), (m.a) new m.a() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f70613a;

                            public final void a() {
                                if (PatchProxy.isSupport(new Object[0], this, f70613a, false, 80490, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f70613a, false, 80490, new Class[0], Void.TYPE);
                                    return;
                                }
                                com.bytedance.ies.dmt.ui.d.a.c(VideoPublishFragment.this.getContext().getApplicationContext(), VideoPublishFragment.this.getString(C0906R.string.mm), 1, 2).a();
                                VideoPublishFragment.this.a(false);
                                if (VideoPublishFragment.this.b()) {
                                    org.greenrobot.eventbus.c.a().d(new h(false));
                                }
                            }

                            public final void a(boolean z) {
                                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70613a, false, 80489, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70613a, false, 80489, new Class[]{Boolean.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (z) {
                                    VideoPublishFragment.this.f70604e.f68874b.setValue(1);
                                }
                                VideoPublishFragment.this.h();
                            }
                        });
                    }
                }
            }
        });
        this.k = this.f70602c.findViewById(C0906R.id.a7p);
        this.k.setOnClickListener(new ax(1000) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70615a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f70615a, false, 80491, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f70615a, false, 80491, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                VideoPublishFragment.this.a(true);
            }
        });
        List list = this.n.challenges;
        if (list != null && !list.isEmpty()) {
            this.f70603d.f68864b = (com.ss.android.ugc.aweme.shortvideo.c) list.get(0);
        }
        com.ss.android.ugc.aweme.port.in.a.o.a().a(Boolean.valueOf(this.n.isPrivate == 1));
        this.f70604e.f68874b.setValue(Integer.valueOf(this.n.isPrivate));
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80458, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.c()) {
            int b3 = com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.DefaultPublishPrivacyType);
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(b3)}, this, f70600a, false, 80459, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                i2 = ((Integer) this.f70604e.f68874b.getValue()).intValue();
                switch (b3) {
                    case 0:
                        i2 = 0;
                        break;
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = ((IPublishPermissionCache) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, IPublishPermissionCache.class)).getPublishPermission(0);
                        break;
                }
            } else {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(b3)}, this, f70600a, false, 80459, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
            }
            this.f70604e.f68874b.setValue(Integer.valueOf(i2));
        }
        this.f70605f.a(this.n.title);
        gy gyVar = this.f70605f;
        String str5 = this.n.creationId;
        if (PatchProxy.isSupport(new Object[]{str5}, gyVar, gy.f68017a, false, 74777, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5}, gyVar, gy.f68017a, false, 74777, new Class[]{String.class}, Void.TYPE);
        } else {
            gyVar.h = str5;
            if (gyVar.f68019c != null) {
                gyVar.f68019c.setCreationId(str5);
            }
        }
        this.f70605f.b(this.n.structList);
        this.f70605f.a(this.n.challenges);
        if (this.n.mentionUserModel != null) {
            List<User> transform = this.n.mentionUserModel.transform();
            if (transform != null && !transform.isEmpty()) {
                for (User user : transform) {
                    if (PatchProxy.isSupport(new Object[]{user}, this, f70600a, false, 80450, new Class[]{User.class}, Boolean.TYPE)) {
                        ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f70600a, false, 80450, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
                    } else if (user != null) {
                        gy gyVar2 = this.f70605f;
                        if (PatchProxy.isSupport(new Object[]{user}, gyVar2, gy.f68017a, false, 74793, new Class[]{User.class}, Boolean.TYPE)) {
                            ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, gyVar2, gy.f68017a, false, 74793, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
                        } else if (com.ss.android.g.a.b()) {
                            HashTagMentionEditText hashTagMentionEditText = gyVar2.f68019c;
                            if (TextUtils.isEmpty(user.getUniqueId())) {
                                str = user.getShortId();
                            } else {
                                str = user.getUniqueId();
                            }
                            hashTagMentionEditText.a(0, str, user.getUid());
                        } else {
                            gyVar2.f68019c.a(0, user.getNickname(), user.getUid());
                        }
                    }
                }
            }
        }
        this.f70605f.f68019c.a(true);
        if (bundle2 != null) {
            this.f70603d.f68864b = (com.ss.android.ugc.aweme.shortvideo.c) bundle2.getSerializable("challenge");
            com.ss.android.ugc.aweme.shortvideo.publish.e eVar4 = this.f70604e;
            if (PatchProxy.isSupport(new Object[]{bundle2}, eVar4, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78247, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle2}, eVar4, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78247, new Class[]{Bundle.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(bundle2, "savedInstanceState");
                eVar4.f68874b.setValue(Integer.valueOf(bundle2.getInt("permission")));
            }
            this.o = bundle2.getBoolean("contentModified");
        }
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
            IAVPublishExtension iAVPublishExtension = (IAVPublishExtension) pair.second;
            LinearLayout linearLayout3 = this.g;
            AVPublishContentType aVPublishContentType = AVPublishContentType.Video;
            PublishOutput a5 = cd.a(this.n);
            String str6 = this.n.poiData;
            com.ss.android.ugc.aweme.draft.a.d dVar = this.n.defaultSelectStickerPoi;
            String str7 = this.n.poiId;
            boolean b4 = b();
            String str8 = this.n.commerceData;
            com.ss.android.ugc.aweme.shortvideo.publish.e eVar5 = this.f70604e;
            if (PatchProxy.isSupport(new Object[0], eVar5, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78243, new Class[0], Boolean.TYPE)) {
                z5 = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar5, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78243, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                switch (f.h[eVar5.c().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        z5 = true;
                        break;
                    case 4:
                    case 5:
                        z5 = false;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            ExtensionMisc extensionMisc = new ExtensionMisc(str6, dVar, str7, b4, str8, this, z5);
            iAVPublishExtension.onCreate(this, linearLayout3, bundle, aVPublishContentType, a5, extensionMisc, new an(this));
        }
        com.ss.android.ugc.aweme.port.in.a.t.a(AVPublishContentType.Video, this.E);
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar6 = this.f70604e;
        LinearLayout linearLayout4 = this.g;
        if (!PatchProxy.isSupport(new Object[]{linearLayout4}, eVar6, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78240, new Class[]{LinearLayout.class}, Void.TYPE)) {
            Intrinsics.checkParameterIsNotNull(linearLayout4, "parent");
            switch (f.f68932f[eVar6.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    View inflate3 = LayoutInflater.from(linearLayout4.getContext()).inflate(C0906R.layout.a73, linearLayout4, false);
                    if (inflate3 != null) {
                        PermissionSettingItem permissionSettingItem = (PermissionSettingItem) inflate3;
                        linearLayout4.addView(permissionSettingItem, new LinearLayout.LayoutParams(-1, eVar6.a(52.0f)));
                        permissionSettingItem.a(new e.g(eVar6));
                        dl a6 = dl.a(eVar6.k, permissionSettingItem, 0);
                        a6.a((dk) new e.h());
                        eVar6.f68875c = a6;
                        a(permissionSettingItem, (Activity) eVar6.k.getActivity());
                        eVar6.f68874b.observe(eVar6.k, new e.i(eVar6));
                        break;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem");
                    }
                case 4:
                case 5:
                    View inflate4 = LayoutInflater.from(linearLayout4.getContext()).inflate(C0906R.layout.a74, linearLayout4, false);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                    int a7 = eVar6.a(16.0f);
                    layoutParams6.setMargins(a7, a7, a7, a7);
                    linearLayout4.addView(inflate4, layoutParams6);
                    T findViewById2 = inflate4.findViewById(C0906R.id.bxb);
                    View findViewById3 = inflate4.findViewById(C0906R.id.bx_);
                    View findViewById4 = inflate4.findViewById(C0906R.id.bxa);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = findViewById2;
                    Function2 nVar = new e.n(eVar6, objectRef);
                    Intrinsics.checkExpressionValueIsNotNull(findViewById2, "publicItem");
                    findViewById2.setSelected(true);
                    findViewById2.setOnClickListener(new e.j(nVar));
                    findViewById3.setOnClickListener(new e.k(nVar));
                    findViewById4.setOnClickListener(new e.l(nVar));
                    eVar6.f68874b.observe(eVar6.k, new e.m(findViewById2, findViewById3, findViewById4));
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[]{linearLayout4}, eVar6, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78240, new Class[]{LinearLayout.class}, Void.TYPE);
        }
        switch (this.f70604e.c()) {
            case EnhancePrivacy:
            case EnhanceDownloadPrivacy:
                View view10 = new View(this.g.getContext());
                view10.setBackgroundColor(Color.parseColor("#14ffffff"));
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, (int) UIUtils.dip2Px(this.g.getContext(), 0.5f));
                int dip2Px = (int) UIUtils.dip2Px(this.g.getContext(), 16.0f);
                layoutParams7.leftMargin = dip2Px;
                layoutParams7.rightMargin = dip2Px;
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams7.setMarginStart(dip2Px);
                    layoutParams7.setMarginEnd(dip2Px);
                }
                this.g.addView(view10, layoutParams7);
                this.g.addView(this.f70604e.a(this.g.getContext()), new ViewGroup.LayoutParams(-1, -2));
                c2 = 0;
                break;
            default:
                c2 = 0;
                this.f70601b.addView(this.f70604e.a(this.f70601b.getContext()), 0, new RelativeLayout.LayoutParams(-1, -2));
                ((RelativeLayout.LayoutParams) this.f70601b.findViewById(C0906R.id.ag4).getLayoutParams()).addRule(3, C0906R.id.cyk);
                break;
        }
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar7 = this.f70604e;
        LinearLayout linearLayout5 = this.g;
        Object[] objArr = new Object[1];
        objArr[c2] = linearLayout5;
        ChangeQuickRedirect changeQuickRedirect = com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a;
        Class[] clsArr = new Class[1];
        clsArr[c2] = LinearLayout.class;
        if (!PatchProxy.isSupport(objArr, eVar7, changeQuickRedirect, false, 78244, clsArr, Void.TYPE)) {
            Intrinsics.checkParameterIsNotNull(linearLayout5, "parent");
            switch (f.i[eVar7.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (PatchProxy.isSupport(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78252, new Class[]{LinearLayout.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78252, new Class[]{LinearLayout.class}, Void.TYPE);
                    } else {
                        View inflate5 = LayoutInflater.from(linearLayout5.getContext()).inflate(C0906R.layout.a1y, linearLayout5, false);
                        if (inflate5 != null) {
                            eVar7.f68876d = (SettingItemSwitch) inflate5;
                            linearLayout5.addView(eVar7.f68876d, new LinearLayout.LayoutParams(-1, eVar7.a(52.0f)));
                            com.ss.android.ugc.aweme.port.in.a.t.a(eVar7.f68876d, eVar7.l.commentSetting == 3, eVar7.f68878f);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch");
                        }
                    }
                    if (PatchProxy.isSupport(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78253, new Class[]{LinearLayout.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78253, new Class[]{LinearLayout.class}, Void.TYPE);
                        break;
                    } else {
                        View inflate6 = LayoutInflater.from(linearLayout5.getContext()).inflate(C0906R.layout.a7v, linearLayout5, false);
                        if (inflate6 != null) {
                            SettingItemSwitch settingItemSwitch = (SettingItemSwitch) inflate6;
                            if (!l.a() || !l.a(eVar7.l)) {
                                settingItemSwitch.setVisibility(8);
                            } else {
                                settingItemSwitch.setVisibility(0);
                                settingItemSwitch.setChecked(eVar7.b());
                                settingItemSwitch.setOnSettingItemClickListener(new e.o(settingItemSwitch, eVar7));
                            }
                            eVar7.g = settingItemSwitch;
                            linearLayout5.addView(eVar7.g, new LinearLayout.LayoutParams(-1, eVar7.a(52.0f)));
                            break;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch");
                        }
                    }
                    break;
                case 4:
                case 5:
                    if (!PatchProxy.isSupport(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78254, new Class[]{LinearLayout.class}, Void.TYPE)) {
                        View inflate7 = LayoutInflater.from(linearLayout5.getContext()).inflate(C0906R.layout.a1g, linearLayout5, false);
                        inflate7.setOnClickListener(new e.c(eVar7));
                        linearLayout5.addView(inflate7, new LinearLayout.LayoutParams(-1, eVar7.a(52.0f)));
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78254, new Class[]{LinearLayout.class}, Void.TYPE);
                        break;
                    }
            }
        } else {
            PatchProxy.accessDispatch(new Object[]{linearLayout5}, eVar7, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78244, new Class[]{LinearLayout.class}, Void.TYPE);
        }
        this.m = new d(this);
        this.m.a(this.g);
        this.l = ek.a((Fragment) this, view);
        am.a aVar = this.l.f67535b;
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar8 = this.f70604e;
        if (PatchProxy.isSupport(new Object[0], eVar8, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78245, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar8, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78245, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            switch (f.j[eVar8.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    z2 = true;
                    break;
                case 4:
                case 5:
                    z2 = false;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        aVar.a(z2);
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar9 = this.f70604e;
        if (PatchProxy.isSupport(new Object[0], eVar9, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78242, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar9, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78242, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            switch (f.g[eVar9.c().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    z3 = false;
                    break;
                case 4:
                case 5:
                    z3 = true;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (z3) {
            this.l.f67535b.a(15.0f);
            this.l.f67535b.b(Color.parseColor("#e6ffffff"));
            this.l.f67535b.c((int) UIUtils.dip2Px(getActivity(), 36.0f));
        }
        if (this.f70604e.d()) {
            this.l.f67535b.a(1, false);
            this.l.f67535b.a(1, (am.b) new ao(this));
        }
        this.l.a(this.n.mShootWay);
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80425, new Class[0], Void.TYPE);
        } else {
            boolean a8 = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.UseNewPublishShareDescription);
            if (com.ss.android.g.a.c() && a8) {
                this.l.f67535b.a(getString(C0906R.string.c7h));
            }
            try {
                z4 = g.b().bb().booleanValue() && !a8;
            } catch (com.bytedance.ies.a unused) {
                z4 = !a8;
            }
            if (com.ss.android.g.a.a() && z4) {
                this.l.f67535b.a(getString(C0906R.string.c64));
            }
        }
        ek ekVar = this.l;
        cb cbVar = this.n;
        if (PatchProxy.isSupport(new Object[]{cbVar}, ekVar, ek.f67534a, false, 74454, new Class[]{cb.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cbVar}, ekVar, ek.f67534a, false, 74454, new Class[]{cb.class}, Void.TYPE);
        } else if (cbVar != null) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("creation_id", cbVar.creationId);
            hashMap2.put("enter_from", "video_post_page");
            hashMap2.put("content_type", "video");
            hashMap2.put("shoot_way", cbVar.mShootWay);
            ekVar.f67535b.d().setTag(hashMap2);
        }
        this.f70604e.f68874b.observe(this, new ap(this));
        this.f70605f.a((da) this);
        this.B = (CheckBox) view4.findViewById(C0906R.id.sd);
        this.C = (FrameLayout) view4.findViewById(C0906R.id.ag4);
        if (com.ss.android.ugc.aweme.i18n.c.a() || !com.ss.android.ugc.aweme.property.f.p()) {
            this.C.setVisibility(8);
        } else {
            this.B.setChecked(((Boolean) com.ss.android.ugc.aweme.port.in.a.o.b().a()).booleanValue());
            this.B.setOnCheckedChangeListener(aq.f70777b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80424, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
            if (e2 != null && e2.d()) {
                this.l.f67535b.d().setVisibility(8);
            }
        }
        a(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011a A[LOOP:0: B:27:0x0114->B:29:0x011a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r11) {
        /*
            r10 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70600a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 80432(0x13a30, float:1.12709E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70600a
            r3 = 0
            r4 = 80432(0x13a30, float:1.12709E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            com.ss.android.ugc.aweme.account.f r0 = com.ss.android.ugc.aweme.port.in.a.x
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0046
            r10.g()
            return
        L_0x0046:
            r0 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r10.n     // Catch:{ JSONException -> 0x0062 }
            java.lang.String r2 = r2.commerceData     // Catch:{ JSONException -> 0x0062 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0062 }
            if (r2 != 0) goto L_0x0062
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0062 }
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r10.n     // Catch:{ JSONException -> 0x0062 }
            java.lang.String r3 = r3.commerceData     // Catch:{ JSONException -> 0x0062 }
            r2.<init>(r3)     // Catch:{ JSONException -> 0x0062 }
            java.lang.String r3 = "star_atlas_order_id"
            long r2 = r2.getLong(r3)     // Catch:{ JSONException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            r2 = r0
        L_0x0063:
            java.lang.String r4 = "save_draft"
            com.ss.android.ugc.aweme.app.d.d r5 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r6 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r9 = r10.n
            java.lang.String r9 = r9.creationId
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (java.lang.String) r9)
            java.lang.String r6 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r9 = r10.n
            java.lang.String r9 = r9.mShootWay
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (java.lang.String) r9)
            java.lang.String r6 = "draft_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r9 = r10.n
            int r9 = r9.draftId
            com.ss.android.ugc.aweme.app.d.d r5 = r5.a((java.lang.String) r6, (int) r9)
            java.lang.String r6 = "task_id"
            com.ss.android.ugc.aweme.app.d.d r2 = r5.a((java.lang.String) r6, (long) r2)
            java.lang.String r3 = "enter_from"
            java.lang.String r5 = "video_post_page"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r5)
            java.lang.String r3 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r10.n
            java.lang.String r5 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a((com.ss.android.ugc.aweme.shortvideo.edit.cb) r5)
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r5)
            java.lang.String r3 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r10.n
            boolean r5 = r5.isMvThemeVideoType()
            if (r5 == 0) goto L_0x00ae
            java.lang.String r5 = "mv"
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r5 = "video"
        L_0x00b0:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r4, (java.util.Map) r2)
            java.lang.String r2 = "save_draft"
            r10.b((java.lang.String) r2)
            boolean r2 = com.ss.android.g.a.b()
            if (r2 == 0) goto L_0x0108
            java.lang.String r2 = "drafts"
            com.ss.android.ugc.aweme.app.d.d r3 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = com.ss.android.ugc.aweme.u.aj.f75034a
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r10.n
            java.lang.String r5 = r5.mShootWay
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = "click_next_button"
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r10.n
            java.lang.String r5 = com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b.a((com.ss.android.ugc.aweme.shortvideo.edit.cb) r5)
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r10.n
            boolean r5 = r5.isMvThemeVideoType()
            if (r5 == 0) goto L_0x00fd
            java.lang.String r5 = "mv"
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r5 = "video"
        L_0x00ff:
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
        L_0x0108:
            r10.n()
            r10.d()
            java.util.List<android.support.v4.util.Pair<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r2 = r10.E
            java.util.Iterator r2 = r2.iterator()
        L_0x0114:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x012e
            java.lang.Object r3 = r2.next()
            android.support.v4.util.Pair r3 = (android.support.v4.util.Pair) r3
            S r3 = r3.second
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r3 = (com.ss.android.ugc.aweme.services.publish.IAVPublishExtension) r3
            com.ss.android.ugc.aweme.shortvideo.edit.cb r4 = r10.n
            com.ss.android.ugc.aweme.services.publish.PublishOutput r4 = com.ss.android.ugc.aweme.shortvideo.edit.cd.a(r4)
            r3.onSaveDraft(r4)
            goto L_0x0114
        L_0x012e:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r10.n
            com.ss.android.ugc.aweme.draft.a.c r2 = r10.a((com.ss.android.ugc.aweme.shortvideo.edit.cb) r2)
            com.ss.android.ugc.aweme.draft.l r3 = com.ss.android.ugc.aweme.draft.l.a()
            long r3 = r3.c((com.ss.android.ugc.aweme.draft.a.c) r2)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.services.IAVService r5 = (com.ss.android.ugc.aweme.services.IAVService) r5
            com.ss.android.ugc.aweme.services.draft.IDraftService r5 = r5.draftService()
            r5.notifyDraftUpdate(r2)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 < 0) goto L_0x0180
            r10.a((com.ss.android.ugc.aweme.draft.a.c) r2)
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "publish"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "save"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.common.t r1 = new com.ss.android.ugc.aweme.common.t
            r1.<init>()
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r10.n
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.common.t r1 = r1.a(r2, r3)
            org.json.JSONObject r1 = r1.a()
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
        L_0x0180:
            if (r11 == 0) goto L_0x0192
            android.app.Application r0 = com.ss.android.ugc.aweme.port.in.a.f61119b
            r1 = 2131562196(0x7f0d0ed4, float:1.8749814E38)
            java.lang.String r1 = r10.getString(r1)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (java.lang.String) r1, (int) r7, (int) r7)
            r0.a()
        L_0x0192:
            boolean r0 = r10.F
            if (r0 != 0) goto L_0x01ce
            android.content.Intent r0 = new android.content.Intent
            android.support.v4.app.FragmentActivity r1 = r10.getActivity()
            com.ss.android.ugc.aweme.port.in.m r2 = com.ss.android.ugc.aweme.port.in.a.f61121d
            java.lang.Class r2 = r2.a()
            r0.<init>(r1, r2)
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            r0.putExtra(r1, r7)
            com.ss.android.ugc.aweme.common.w r1 = r10.H
            if (r1 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r10.n
            boolean r1 = r1.mIsFromDraft
            if (r1 != 0) goto L_0x01bb
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG"
            com.ss.android.ugc.aweme.common.w r2 = r10.H
            r0.putExtra(r1, r2)
        L_0x01bb:
            r1 = 335544320(0x14000000, float:6.4623485E-27)
            r0.setFlags(r1)
            r10.startActivity(r0)
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            r1 = 2130968594(0x7f040012, float:1.7545846E38)
            r0.overridePendingTransition(r8, r1)
            return
        L_0x01ce:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "publish result"
            java.lang.String r2 = "PublishActivity success"
            r0.putExtra(r1, r2)
            android.support.v4.app.FragmentActivity r1 = r10.getActivity()
            r2 = -1
            r1.setResult(r2, r0)
            android.support.v4.app.FragmentActivity r0 = r10.getActivity()
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishFragment.a(boolean):void");
    }

    public final String a() {
        if (this.n == null) {
            return null;
        }
        return this.n.commerceData;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean l() {
        com.bytedance.ies.dmt.ui.d.a.a(getContext(), (int) C0906R.string.c1i, 0).a();
        return false;
    }

    public final String k() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80464, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80464, new Class[0], String.class);
        } else if (this.n.getAvetParameter() != null) {
            return this.n.getAvetParameter().getStoryShootEntrance();
        } else {
            return "";
        }
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80456, new Class[0], Void.TYPE);
            return;
        }
        this.n.mainBusinessData = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e.updateSDKShareContextWhenSaveOrPost(this.n.mIsFromDraft, this.n.mainBusinessData);
        this.H = (w) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e.getShareContext(this.n.mainBusinessData), w.class);
    }

    public final boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80455, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80455, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.n != null && (!TextUtils.isEmpty(this.n.microAppId) || this.n.microAppModel != null)) {
            z2 = true;
        }
        return z2;
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80430, new Class[0], Void.TYPE);
            return;
        }
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
            ((IAVPublishExtension) pair.second).onBackPressed(cd.a(this.n));
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80433, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.b()) {
            IAVPrivacySettingService iAVPrivacySettingService = com.ss.android.ugc.aweme.port.in.a.G;
            if (iAVPrivacySettingService.needShowPrivacyConfirmationDialog(getActivity()).booleanValue()) {
                iAVPrivacySettingService.showPrivacyConfirmationDialog(getActivity(), new as(this));
                return;
            }
        }
        i();
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80434, new Class[0], Void.TYPE);
            return;
        }
        bi a2 = bi.a();
        this.u.put("vesdk", Integer.valueOf(this.n.getNewVersion()));
        this.u.put("quiet synthetic", Boolean.valueOf(com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.QuietlySynthetic)));
        a2.a("errorDesc", com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) this.u));
        if (!new File(this.n.getInputVideoFile()).exists()) {
            a2.a("fileInfo", this.n.getInputVideoFile());
            n.a("service_video_publish_file_exist", -1, a2.b());
        }
        if (!new File(this.n.mOutPutWavFile).exists()) {
            a2.a("fileInfo", this.n.mOutPutWavFile);
            n.a("service_video_publish_file_exist", -1, a2.b());
        }
    }

    public final void g() {
        Bundle bundle;
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80431, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity().getIntent().getBooleanExtra("is_from_sys_share", false)) {
            r.a("login_notify", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").f34114b);
        }
        String string = getString(C0906R.string.bq9);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(getContext());
        com.ss.android.ugc.aweme.account.f fVar = com.ss.android.ugc.aweme.port.in.a.x;
        if (com.ss.android.ugc.aweme.i18n.c.a()) {
            bundle = null;
        } else {
            bundle = ad.a().a("login_title", string).f75487b;
        }
        fVar.a((Fragment) this, "video_edit_page", "click_shoot", bundle, (f.a) null);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80444, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.G = true;
            if (!this.F) {
                getActivity().finish();
            }
            com.ss.android.ugc.aweme.port.in.a.f61121d.a(getActivity(), this.n.mStickerID);
            for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
                ((IAVPublishExtension) pair.second).onPublish(cd.a(this.n));
            }
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().startPublish(getActivity(), b(false));
            if (this.n.isSaveLocal()) {
                r.a("download", (Map) new com.ss.android.ugc.aweme.app.d.d().a("scene_id", (int) CrashModule.MODULE_ID).a("group_id", "").a("enter_from", "video_post_page").a("download_type", "self").a("download_method", "download_with_publish").f34114b);
            }
            b("publish");
            r.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit"));
        }
    }

    public void onDestroyView() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80440, new Class[0], Void.TYPE);
            return;
        }
        if (this.D != null) {
            try {
                this.D.g();
            } catch (InterruptedException unused) {
            }
        }
        a(getView(), (View.OnTouchListener) null);
        if (!this.G) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().cancelSynthetise(getContext());
        }
        super.onDestroyView();
        if (this.l != null) {
            this.l.c();
        } else {
            StringBuilder sb = new StringBuilder("syncModule is null and the fragment's view is null?:->");
            if (getView() == null) {
                z2 = true;
            }
            sb.append(z2);
            com.ss.android.ugc.aweme.util.c.a(sb.toString());
        }
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
            ((IAVPublishExtension) pair.second).onDestroy();
        }
        aa.a().c();
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80421, new Class[0], Void.TYPE);
            return;
        }
        final j jVar = new j();
        this.t = c.a(getActivity(), getString(C0906R.string.bzn));
        ai.d("VideoPublish prepareEffectPlatformImpl:" + this.t);
        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
        if (this.n.mEffectList == null || this.n.mEffectList.isEmpty()) {
            ai.d("ignore fetch specialfilter because of empty effects");
            jVar.a(null);
        } else {
            HashSet hashSet = new HashSet();
            Iterator<EffectPointModel> it2 = this.n.mEffectList.iterator();
            while (it2.hasNext()) {
                EffectPointModel next = it2.next();
                if (!com.ss.android.ugc.aweme.video.b.b(next.getResDir())) {
                    hashSet.add(next.getKey());
                }
            }
            if (!hashSet.isEmpty()) {
                EffectPlatform effectPlatform = new EffectPlatform(getActivity(), com.ss.android.ugc.aweme.port.in.a.h.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
                effectPlatform.a((LifecycleOwner) this);
                effectPlatform.a((List<String>) new ArrayList<String>(hashSet), (String) null, true, (com.ss.android.ugc.effectmanager.effect.b.h) new com.ss.android.ugc.effectmanager.effect.b.h() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70606a;

                    public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f70606a, false, 80486, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f70606a, false, 80486, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                            return;
                        }
                        ai.b("uniformFetchList fail : " + cVar.toString());
                        jVar.a(null);
                    }

                    public final void a(List<Effect> list) {
                        if (PatchProxy.isSupport(new Object[]{list}, this, f70606a, false, 80485, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list}, this, f70606a, false, 80485, new Class[]{List.class}, Void.TYPE);
                            return;
                        }
                        ai.d("uniformFetchList onSuccess");
                        jVar.a(null);
                    }
                });
            } else {
                ai.d("All effects needn't download");
                jVar.a(null);
            }
        }
        i.b((Collection<? extends i<?>>) az.a((E[]) new i[]{i.a(null), jVar.f1091a})).a((a.g<TResult, TContinuationResult>) new am<TResult,TContinuationResult>(this), i.f1052b);
    }

    public final void d() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80429, new Class[0], Void.TYPE);
            return;
        }
        this.f70605f.b();
        this.f70605f.f68019c.d();
        this.n.title = this.f70605f.c();
        List<AVTextExtraStruct> d2 = this.f70605f.d();
        if (d2 != null) {
            this.n.structList = d2;
        }
        this.n.isPrivate = ((Integer) this.f70604e.f68874b.getValue()).intValue();
        if (this.f70603d.a() != null) {
            this.n.challenges = Collections.singletonList(this.f70603d.f68864b);
        } else {
            this.n.challenges = null;
        }
        if (this.f70604e.e()) {
            this.n.poiId = ((PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.E, PoiAndGoodsPublishModel.class)).getPoiContext();
        }
        cb cbVar = this.n;
        if (this.f70604e.a()) {
            i2 = 3;
        }
        cbVar.commentSetting = i2;
    }

    public final void i() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        Object obj2;
        String str7;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80435, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80435, new Class[0], Void.TYPE);
            return;
        }
        m();
        n();
        PoiAndGoodsPublishModel poiAndGoodsPublishModel = (PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.E, PoiAndGoodsPublishModel.class);
        if (TextUtils.isEmpty(this.n.musicId)) {
            str = "";
        } else {
            str = this.n.musicId;
        }
        if (TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.shortvideo.e b2 = ej.a().b();
            if (b2 == null) {
                str = "";
            } else {
                str = b2.getMusicId();
            }
        }
        if (this.n != null && !TextUtils.isEmpty(str) && "edit_page_recommend".equals(this.n.mMusicOrigin) && 1 == this.n.comFrom) {
            r.a("jarvis_item_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("item_id", str).a("channel_id", ab.a()).a("req_id", this.n.aiMusicLogPbImprId).f34114b);
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("music_id", str).a("filter_list", this.n.mCurFilterLabels).a("filter_id_list", this.n.mCurFilterIds).a("creation_id", this.n.creationId).a("shoot_way", this.n.mShootWay).a("privacy_status", Publish.a(((Integer) this.f70604e.f68874b.getValue()).intValue())).a("draft_id", this.n.draftId);
        if (this.n.mMusicOrigin == null) {
            str2 = "original";
        } else {
            str2 = this.n.mMusicOrigin;
        }
        com.ss.android.ugc.aweme.app.d.d a3 = a2.a("music_selected_from", str2).a("content_source", b.a(this.n));
        if (this.n.isMvThemeVideoType()) {
            str3 = "mv";
        } else {
            str3 = "video";
        }
        com.ss.android.ugc.aweme.app.d.d a4 = a3.a("content_type", str3).a("prop_list", this.n.mStickerID).a("prop_selected_from", this.n.mPropSource).a("effect_list", this.n.getEditEffectList()).a("info_sticker_list", this.n.getInfoStickerList()).a("enter_from", "video_post_page").a("camera_type", com.ss.android.ugc.aweme.shortvideo.util.j.a()).a("camera_level", com.ss.android.ugc.aweme.port.in.a.L.b(e.a.RecordCameraCompatLevel));
        if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.CurrentWideMode) == 1) {
            str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str4 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        com.ss.android.ugc.aweme.app.d.d a5 = a4.a("is_wide_angle", str4);
        if (new com.ss.android.ugc.aweme.shortvideo.e.d().a() == 0) {
            str5 = "front";
        } else {
            str5 = "back";
        }
        com.ss.android.ugc.aweme.app.d.d a6 = a5.a("camera_front_back", str5);
        if (com.ss.android.ugc.aweme.shortvideo.l.b.b()) {
            str6 = "on";
        } else {
            str6 = "off";
        }
        com.ss.android.ugc.aweme.app.d.d a7 = a6.a("is_anti_shake", str6).a("share_to", c(this.l.a()));
        if (this.n.mMusicPath == null) {
            obj = "";
        } else {
            obj = Integer.valueOf((int) (this.n.musicVolume * 100.0f));
        }
        com.ss.android.ugc.aweme.app.d.d a8 = a7.a("music_volume", obj).a("has_text", this.n.hasText() ? 1 : 0);
        if (this.n.getWavFile() == null) {
            obj2 = "";
        } else {
            obj2 = Integer.valueOf((int) (this.n.voiceVolume * 100.0f));
        }
        com.ss.android.ugc.aweme.app.d.d a9 = a8.a("origin_volume", obj2).a("fast_import_fail", this.n.fastImportErrorCode).a("fast_import", this.n.isFastImport ? 1 : 0);
        if (this.I >= 0) {
            a9.a("music_rec_type", this.I);
        }
        if (this.n.mMusicShowRank > 0) {
            a9.a("music_show_rank", this.n.mMusicShowRank);
        }
        Map<String, String> map = a9.f34114b;
        if (poiAndGoodsPublishModel.getMobParams() != null) {
            map.putAll(poiAndGoodsPublishModel.getMobParams());
        }
        r.a("publish", (Map) map);
        n.a("aweme_publish_stay_time", com.ss.android.ugc.aweme.app.d.c.a().a("stay_time", Long.valueOf(System.currentTimeMillis() - this.A)).b());
        this.f70605f.b();
        this.n.title = this.f70605f.c();
        if (this.f70605f.d() != null) {
            this.n.structList = this.f70605f.d();
        }
        if (!TextUtils.isEmpty(poiAndGoodsPublishModel.getGoodsDraftId())) {
            this.n.shopDraftId = poiAndGoodsPublishModel.getGoodsDraftId();
        }
        if (this.f70604e.e()) {
            this.n.poiId = poiAndGoodsPublishModel.getPoiContext();
        }
        this.n.latitude = poiAndGoodsPublishModel.getLatitude();
        this.n.longitude = poiAndGoodsPublishModel.getLongitude();
        this.n.isPrivate = ((Integer) this.f70604e.f68874b.getValue()).intValue();
        if (TextUtils.isEmpty(this.n.mOutputFile)) {
            com.ss.android.ugc.aweme.shortvideo.a.d a10 = com.ss.android.ugc.aweme.shortvideo.a.c.f65441b.a(this.n);
            this.n.mOutputFile = a10.j().getPath();
        }
        com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
        cb cbVar = this.n;
        if (e2 != null) {
            str7 = e2.h();
        } else {
            str7 = "";
        }
        cbVar.city = str7;
        cb cbVar2 = this.n;
        if (this.f70604e.a()) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        cbVar2.commentSetting = i2;
        this.n.reactDuetSetting = this.f70604e.b() ? 1 : 0;
        this.n.challenges = null;
        this.n.mSaveModel = ey.a(this.n.mSaveModel, this.l.b());
        if (this.n.mSaveModel != null) {
            this.n.mSaveModel.setSaveToAlbum(this.m.a());
            this.n.mSaveModel.setSaveToAppPathInsteadOfAlbum(this.m.f68868c);
            this.n.mSaveModel.setEnableSilentEnhancement(d.b());
        }
        com.ss.android.ugc.aweme.draft.a.c a11 = a(this.n);
        com.ss.android.ugc.aweme.draft.l.a().c(a11);
        a(a11);
        int b3 = com.ss.android.ugc.aweme.shortvideo.util.am.a().b();
        if (this.n != null && this.n.reactionParams == null) {
            com.ss.android.ugc.aweme.shortvideo.util.am.a().a(b3 + 1);
        } else if (b3 < 3) {
            com.ss.android.ugc.aweme.shortvideo.util.am.a().a(0);
        }
        if (Build.VERSION.SDK_INT < 18 || com.ss.android.ugc.aweme.port.in.a.j.a() || com.ss.android.g.a.b() || com.ss.android.ugc.aweme.port.in.a.j.b()) {
            j();
            return;
        }
        ((ViewGroup) getActivity().getWindow().getDecorView()).getOverlay().add(this.i);
        float dip2Px = UIUtils.dip2Px(getActivity(), 76.0f) / ((float) this.i.getMeasuredWidth());
        this.i.animate().translationY((-this.i.getY()) + ((float) p.c())).translationX(-UIUtils.dip2Px(getActivity(), 5.0f)).scaleX(dip2Px).scaleY(UIUtils.dip2Px(getActivity(), 96.0f) / ((float) this.i.getMeasuredHeight())).alpha(0.0f).setDuration(1000).setListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f70619a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f70619a, false, 80495, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f70619a, false, 80495, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                VideoPublishFragment.this.j();
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f70619a, false, 80494, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f70619a, false, 80494, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                VideoPublishFragment.this.getActivity().findViewById(16908290).setVisibility(4);
            }
        }).start();
    }

    public final void a(String str) {
        if (this.n != null) {
            this.n.commerceData = str;
        }
    }

    private com.ss.android.ugc.aweme.draft.a.c a(cb cbVar) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{cbVar}, this, f70600a, false, 80443, new Class[]{cb.class}, com.ss.android.ugc.aweme.draft.a.c.class)) {
            return (com.ss.android.ugc.aweme.draft.a.c) PatchProxy.accessDispatch(new Object[]{cbVar}, this, f70600a, false, 80443, new Class[]{cb.class}, com.ss.android.ugc.aweme.draft.a.c.class);
        }
        ah.a<Boolean> a2 = com.ss.android.ugc.aweme.port.in.a.o.a();
        if (this.n.isPrivate() != 1) {
            z2 = false;
        }
        a2.a(Boolean.valueOf(z2));
        cbVar.mSyncPlatforms = this.l.a();
        this.l.a(cbVar.mSyncPlatforms, 0);
        com.ss.android.ugc.aweme.draft.a.c a3 = new cc("VideoPublishFragment").a(cbVar);
        a3.f43438f = ej.a().b();
        a3.D = System.currentTimeMillis();
        return a3;
    }

    private String c(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f70600a, false, 80436, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, f70600a, false, 80436, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            try {
                String[] split = str3.split(";");
                StringBuilder sb = new StringBuilder();
                for (String parseInt : split) {
                    int parseInt2 = Integer.parseInt(parseInt);
                    switch (parseInt2) {
                        case 1:
                            str2 = "local";
                            break;
                        case 2:
                            str2 = "instagram";
                            break;
                        case 3:
                            str2 = "instagram_story";
                            break;
                        default:
                            switch (parseInt2) {
                                case 100:
                                    str2 = "helo";
                                    break;
                                case BaseLoginOrRegisterActivity.o:
                                    str2 = "twitter";
                                    break;
                                default:
                                    str2 = "";
                                    break;
                            }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(str2);
                        sb.append(",");
                    }
                }
                String sb2 = sb.toString();
                if (sb2.endsWith(",")) {
                    sb2 = sb2.substring(0, sb2.length() - 1);
                }
                return sb2;
            } catch (Exception unused) {
                return "";
            }
        }
    }

    private void d(String str) {
        boolean z2;
        com.ss.android.ugc.aweme.common.m mVar;
        if (PatchProxy.isSupport(new Object[]{str}, this, f70600a, false, 80448, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f70600a, false, 80448, new Class[]{String.class}, Void.TYPE);
        } else if (this.n.isMvThemeVideoType()) {
            String str2 = this.n.mvCreateVideoData.videoCoverImgPath;
            if (com.ss.android.ugc.aweme.video.b.b(str2)) {
                com.ss.android.ugc.aweme.base.c.a(this.i, Uri.fromFile(new File(str2)).toString());
            }
        } else {
            ArrayList arrayList = new ArrayList();
            if (this.n.mEffectList != null) {
                arrayList.addAll(this.n.mEffectList);
            }
            if (this.n.mTimeEffect != null) {
                arrayList.add(this.n.mTimeEffect);
                if (this.n.mTimeEffect.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                    z2 = true;
                    if (this.n.previewConfigure != null || this.n.previewConfigure.getVideoSegments().isEmpty()) {
                        mVar = null;
                    } else {
                        VEVideoSegment vEVideoSegment = this.n.previewConfigure.getVideoSegments().get(0);
                        mVar = new com.ss.android.ugc.aweme.common.m(vEVideoSegment.start, vEVideoSegment.getEnd(), vEVideoSegment.speed);
                    }
                    com.ss.android.ugc.aweme.shortvideo.presenter.a.a(str, arrayList, com.ss.android.ugc.aweme.filter.w.a(this.n.getFilterIndex()).j, (int) (this.n.mVideoCoverStartTm * 1000.0f), z2, this.n.getVideoRotateArray().get(0).intValue(), mVar, this.n.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f70621a;

                        public final void onGetVideoCoverFailed(int i) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70621a, false, 80497, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70621a, false, 80497, new Class[]{Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.bld);
                        }

                        public final void onGetVideoCoverSuccess(@NonNull Bitmap bitmap) {
                            if (PatchProxy.isSupport(new Object[]{bitmap}, this, f70621a, false, 80496, new Class[]{Bitmap.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{bitmap}, this, f70621a, false, 80496, new Class[]{Bitmap.class}, Void.TYPE);
                                return;
                            }
                            if (!(VideoPublishFragment.this.i == null || VideoPublishFragment.this.getContext() == null)) {
                                RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(VideoPublishFragment.this.getResources(), bitmap);
                                create.setCornerRadius(UIUtils.dip2Px(GlobalContext.getContext(), 4.0f));
                                VideoPublishFragment.this.i.setImageDrawable(create);
                                VideoPublishFragment.this.s = bitmap;
                            }
                        }
                    });
                }
            }
            z2 = false;
            if (this.n.previewConfigure != null) {
            }
            mVar = null;
            com.ss.android.ugc.aweme.shortvideo.presenter.a.a(str, arrayList, com.ss.android.ugc.aweme.filter.w.a(this.n.getFilterIndex()).j, (int) (this.n.mVideoCoverStartTm * 1000.0f), z2, this.n.getVideoRotateArray().get(0).intValue(), mVar, this.n.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70621a;

                public final void onGetVideoCoverFailed(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70621a, false, 80497, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70621a, false, 80497, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.bld);
                }

                public final void onGetVideoCoverSuccess(@NonNull Bitmap bitmap) {
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f70621a, false, 80496, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f70621a, false, 80496, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    if (!(VideoPublishFragment.this.i == null || VideoPublishFragment.this.getContext() == null)) {
                        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(VideoPublishFragment.this.getResources(), bitmap);
                        create.setCornerRadius(UIUtils.dip2Px(GlobalContext.getContext(), 4.0f));
                        VideoPublishFragment.this.i.setImageDrawable(create);
                        VideoPublishFragment.this.s = bitmap;
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final Bundle b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70600a, false, 80445, new Class[]{Boolean.TYPE}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f70600a, false, 80445, new Class[]{Boolean.TYPE}, Bundle.class);
        }
        this.n.mSaveModel = ey.a(this.n.mSaveModel, this.l.b(), z2);
        com.ss.android.ugc.aweme.tools.a.g.a(com.ss.android.ugc.aweme.shortvideo.r.a((BaseShortVideoContext) this.n), com.ss.android.ugc.aweme.shortvideo.r.b((BaseShortVideoContext) this.n), com.ss.android.ugc.aweme.tools.a.e.PUBLISH, com.ss.android.ugc.aweme.tools.a.e.SEND_REQUEST);
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", this.n);
        bundle.putString("shoot_way", this.n.mShootWay);
        bundle.putBoolean("enter_record_from_other_platform", this.F);
        bundle.putBoolean("parallel_synthesize_upload", com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableParallelSynthesizeUpload));
        com.ss.android.ugc.aweme.util.c.a("VideoPublishService.createBundleParams()  bundle=" + bundle);
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        r.a("av_video_memory", (Map) a2.a("log", "VideoPublishService.createBundleParams()  bundle=" + bundle).f34114b);
        com.ss.android.ugc.aweme.services.publish.Publish.PublishBundle = bundle;
        return bundle;
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f70600a, false, 80447, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f70600a, false, 80447, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar = this.f70604e;
        if (PatchProxy.isSupport(new Object[]{bundle2}, eVar, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78250, new Class[]{Bundle.class}, Void.TYPE)) {
            Object[] objArr = {bundle2};
            com.ss.android.ugc.aweme.shortvideo.publish.e eVar2 = eVar;
            PatchProxy.accessDispatch(objArr, eVar2, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78250, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(bundle2, "outState");
            dl dlVar = eVar.f68875c;
            if (dlVar != null) {
                dlVar.a(bundle2);
            } else {
                Object value = eVar.f68874b.getValue();
                if (value == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(value, "permission.value!!");
                bundle2.putInt("permission", ((Number) value).intValue());
            }
        }
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
            ((IAVPublishExtension) pair.second).onSaveInstanceState(bundle2);
        }
        bundle2.putSerializable("challenge", this.f70603d.f68864b);
        bundle2.putBoolean("contentModified", this.o);
    }

    private void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f70600a, false, 80427, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f70600a, false, 80427, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.port.in.a.x.a()) {
            for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
                ((IAVPublishExtension) pair.second).onEnterChildrenMode();
            }
            com.ss.android.ugc.aweme.shortvideo.publish.e eVar = this.f70604e;
            if (PatchProxy.isSupport(new Object[0], eVar, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78249, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78249, new Class[0], Void.TYPE);
            } else {
                SettingItemSwitch settingItemSwitch = eVar.f68876d;
                if (settingItemSwitch != null) {
                    settingItemSwitch.setVisibility(8);
                }
                SettingItemSwitch settingItemSwitch2 = eVar.g;
                if (settingItemSwitch2 != null) {
                    settingItemSwitch2.setVisibility(8);
                }
                dl dlVar = eVar.f68875c;
                if (dlVar != null) {
                    if (PatchProxy.isSupport(new Object[]{8}, dlVar, dl.f66767a, false, 74265, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        dl dlVar2 = dlVar;
                        PatchProxy.accessDispatch(new Object[]{8}, dlVar2, dl.f66767a, false, 74265, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        dlVar.f66770d.setVisibility(8);
                    }
                }
            }
            if (this.w != null) {
                this.w.setVisibility(8);
            }
            if (this.x != null) {
                this.x.setVisibility(8);
            }
            this.f70602c.setVisibility(8);
            View findViewById = view2.findViewById(C0906R.id.sg);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new ar(this));
            if (!(this.l == null || this.l.f67535b == null)) {
                this.l.f67535b.d().setVisibility(8);
                d dVar = this.m;
                if (PatchProxy.isSupport(new Object[0], dVar, d.f68865a, false, 78222, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dVar, d.f68865a, false, 78222, new Class[0], Void.TYPE);
                } else {
                    SettingItemSwitch settingItemSwitch3 = dVar.f68867b;
                    if (settingItemSwitch3 != null) {
                        settingItemSwitch3.setChecked(false);
                    }
                    SettingItemSwitch settingItemSwitch4 = dVar.f68867b;
                    if (settingItemSwitch4 != null) {
                        settingItemSwitch4.setVisibility(8);
                    }
                }
            }
            this.y.setHint(C0906R.string.sl);
            this.y.setMentionTextColor(ContextCompat.getColor(getContext(), C0906R.color.zt));
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f70600a, false, 80437, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f70600a, false, 80437, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a("leave_post_page", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", "video_post_page").a("shoot_way", this.n.mShootWay).a("creation_id", this.n.creationId).a("leave_action", str).a("is_enter_cover", this.q ? 1 : 0).a("is_enter_preview", this.p ? 1 : 0).a("is_content_modified", this.o ? 1 : 0).a("duration", System.currentTimeMillis() - this.A).f34114b);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        i<Void> iVar;
        dj djVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f70600a, false, 80438, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f70600a, false, 80438, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.A = System.currentTimeMillis();
        this.G = false;
        if (this.D == null) {
            iVar = i.a(null);
        } else {
            iVar = this.D;
        }
        iVar.c(new at(this), i.f1052b);
        if (bundle == null) {
            int i2 = this.n.mVideoWidth;
            int i3 = this.n.mVideoHeight;
            float e2 = com.ss.android.ugc.aweme.property.f.e();
            boolean a2 = com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SyntheticHardCode);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(e2), Float.valueOf(0.0f), Byte.valueOf(a2 ? (byte) 1 : 0)}, null, dj.f66761a, true, 74256, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, dj.class)) {
                djVar = (dj) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Float.valueOf(e2), Float.valueOf(0.0f), Byte.valueOf(a2)}, null, dj.f66761a, true, 74256, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE}, dj.class);
            } else {
                djVar = new dj(i2, i3, e2, 0.0f, a2);
            }
            if (PatchProxy.isSupport(new Object[0], djVar, dj.f66761a, false, 74257, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], djVar, dj.f66761a, false, 74257, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.app.d.c a3 = com.ss.android.ugc.aweme.app.d.c.a();
            n.a("aweme_video_record_info", a3.a("resolution", djVar.f66762b + "*" + djVar.f66763c).a("bitrate", Long.valueOf(new BigDecimal((double) djVar.f66764d).longValue())).a("frame_rate", Long.valueOf(new BigDecimal((double) djVar.f66765e).longValue())).a("is_hardcode", Boolean.valueOf(djVar.f66766f)).b());
        }
    }

    private void a(com.ss.android.ugc.aweme.draft.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f70600a, false, 80441, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f70600a, false, 80441, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
            return;
        }
        i.b((Callable<TResult>) new aj<TResult>(this, cVar)).a((a.g<TResult, TContinuationResult>) new ai<TResult,TContinuationResult>(this), (Executor) i.f1051a);
    }

    private void a(View view, View.OnTouchListener onTouchListener) {
        View view2 = view;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view2, onTouchListener2}, this, f70600a, false, 80449, new Class[]{View.class, View.OnTouchListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, onTouchListener2}, this, f70600a, false, 80449, new Class[]{View.class, View.OnTouchListener.class}, Void.TYPE);
        } else if (view.getId() != C0906R.id.g2) {
            if (!(view2 instanceof EditText)) {
                view.setOnTouchListener(onTouchListener);
            }
            if (view2 instanceof ViewGroup) {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    if (i2 >= viewGroup.getChildCount()) {
                        break;
                    }
                    a(viewGroup.getChildAt(i2), onTouchListener2);
                    i2++;
                }
            }
        }
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        boolean z2;
        String str;
        boolean z3;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f70600a, false, 80419, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f70600a, false, 80419, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        a(view2, this.v);
        Bundle arguments = getArguments();
        this.I = arguments.getInt("music_rec_type", -1);
        this.n = (cb) arguments.getSerializable("args");
        this.F = arguments.getBoolean("enter_record_from_other_platform", false);
        ai.d("VideoPublishFragment filter_id_list:" + this.n.mCurFilterIds + " prop_list:" + this.n.mStickerID + " effect_list:" + this.n.getEditEffectList() + " info_sticker_list:" + this.n.getInfoStickerList());
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80451, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80451, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (TextUtils.isEmpty(this.n.mOutPutWavFile) && this.n.mVideoLength <= 0) {
                cb cbVar = this.n;
                if (PatchProxy.isSupport(new Object[0], null, ff.f67712a, true, 74563, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], null, ff.f67712a, true, 74563, new Class[0], String.class);
                } else {
                    str = ff.a("-mix-concat-a");
                }
                cbVar.mOutPutWavFile = str;
                if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80452, new Class[0], Boolean.TYPE)) {
                    z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80452, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    int[] a2 = FFMpegManager.a().a(this.n.mPath);
                    if (a2[0] != 0) {
                        UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.bld);
                        FFMpegManager.a().b();
                        z3 = false;
                    } else {
                        this.z = a2[1];
                        this.n.mVideoLength = this.z;
                        FFMpegManager.a().b();
                        z3 = true;
                    }
                }
                if (!z3) {
                    z2 = false;
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80454, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80454, new Class[0], Void.TYPE);
                    } else if (this.n.mMusicPath != null) {
                        FFMpegManager.a().a(this.n.mMusicPath, this.n.mOutPutWavFile, (long) this.n.mMusicStart, (long) this.z);
                    } else {
                        FFMpegManager.a().a(this.n.mWavFile, this.n.mOutPutWavFile, 0, (long) this.z);
                    }
                }
            }
            z2 = true;
        }
        if (!z2) {
            getActivity().finish();
            return;
        }
        a(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f70600a, false, 80420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70600a, false, 80420, new Class[0], Void.TYPE);
        } else if (this.n.mIsFromDraft) {
            if (this.D != null) {
                this.D.a((a.g<TResult, TContinuationResult>) new ah<TResult,TContinuationResult>(this), i.f1052b);
            } else {
                c();
            }
        }
        cg.a((Activity) getActivity());
        this.h.a(this, true, bw.f65842b);
    }

    public static void a(PermissionSettingItem permissionSettingItem, Activity activity) {
        String str;
        PermissionSettingItem permissionSettingItem2 = permissionSettingItem;
        Activity activity2 = activity;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{permissionSettingItem2, activity2}, null, f70600a, true, 80457, new Class[]{PermissionSettingItem.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{permissionSettingItem2, activity2}, null, f70600a, true, 80457, new Class[]{PermissionSettingItem.class, Activity.class}, Void.TYPE);
        } else if (permissionSettingItem2 != null && permissionSettingItem.getVisibility() == 0 && activity2 != null) {
            if (!com.ss.android.g.a.c() || !com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.CanShowPublishFriendGuide)) {
                z2 = false;
            }
            if (z2) {
                com.ss.android.ugc.aweme.base.sharedpref.f a2 = com.ss.android.ugc.aweme.base.sharedpref.d.a(com.ss.android.ugc.aweme.port.in.a.f61119b, com.ss.android.ugc.aweme.port.in.a.o.d());
                com.ss.android.ugc.aweme.account.model.e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
                if (e2 == null || TextUtils.isEmpty(e2.c())) {
                    str = "friends_only_uid_none";
                } else {
                    str = "friends_only_uid_" + e2.c();
                }
                if (!a2.a(str, false)) {
                    permissionSettingItem2.postDelayed(new ak(permissionSettingItem2, activity2, a2, str), 500);
                }
            }
        }
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f70600a, false, 80418, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f70600a, false, 80418, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.r8, viewGroup2, false);
        aa.a().a(getActivity(), (ViewGroup) inflate.findViewById(C0906R.id.a8m));
        return inflate;
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4;
        String str;
        int i5 = i2;
        int i6 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f70600a, false, 80446, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f70600a, false, 80446, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.E) {
            ((IAVPublishExtension) pair.second).onActivityResult(i5, i6, intent2);
        }
        this.l.a(i5, i6, intent2);
        com.ss.android.ugc.aweme.shortvideo.publish.e eVar = this.f70604e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, eVar, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78248, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.shortvideo.publish.e eVar2 = eVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, eVar2, com.ss.android.ugc.aweme.shortvideo.publish.e.f68873a, false, 78248, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (i5 == com.ss.android.ugc.aweme.shortvideo.publish.e.n) {
            if (i6 == -1 && intent2 != null) {
                eVar.f68877e = intent2.getBooleanExtra("comment_item_checked", false);
                eVar.h = intent2.getBooleanExtra("react_duet_item_checked", false);
            }
        } else if (i5 == 2 && i6 == -1 && intent2 != null) {
            eVar.f68874b.setValue(Integer.valueOf(intent2.getIntExtra("extra.PERMISSION", 0)));
        }
        if (i5 == 1) {
            if (i6 != -1) {
                this.f70603d.f68864b = null;
            } else if (intent2 != null) {
                this.f70603d.f68864b = (com.ss.android.ugc.aweme.shortvideo.c) intent2.getSerializableExtra("challenge");
            }
            this.o = true;
        }
        if (i5 == 2 && i6 == -1 && intent2 != null) {
            int intExtra = intent2.getIntExtra("extra.PERMISSION", 0);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra)}, this, f70600a, false, 80460, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra)}, this, f70600a, false, 80460, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.DefaultPublishPrivacyType) == 3) {
                ((IPublishPermissionCache) com.ss.android.ugc.aweme.common.g.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, IPublishPermissionCache.class)).setPublishPermission(intExtra);
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra)}, this, f70600a, false, 80461, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra)}, this, f70600a, false, 80461, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                String str2 = "public";
                switch (intExtra) {
                    case 0:
                        str2 = "public";
                        break;
                    case 1:
                        str2 = PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
                        break;
                    case 2:
                        str2 = "friends";
                        break;
                }
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.n.creationId).a("shoot_way", this.n.mShootWay).a("content_source", b.a(this.n));
                if (this.n.isMvThemeVideoType()) {
                    str = "mv";
                } else {
                    str = "video";
                }
                r.a("select_privacy_setting", (Map) a2.a("content_type", str).a("enter_from", "video_post_page").a("to_status", str2).f34114b);
            }
            this.o = true;
            r.onEvent(MobClick.obtain().setEventName("scope_control").setLabelName("edit_page").setJsonObject(new t().a("to_status", Publish.a(intExtra)).a()));
        }
        if (i5 == 3) {
            i4 = -1;
            if (i6 == -1) {
                this.f70605f.a(intent2);
                this.o = true;
            }
        } else {
            i4 = -1;
        }
        if (i5 == 4 && i6 == i4 && intent2 != null && intent2.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT") != null) {
            this.n = (cb) intent2.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
            String str3 = this.n.mPath;
            if (this.n.mTimeEffect != null) {
                if (this.n.mTimeEffect.getKey().equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                    str3 = this.n.mReversePath;
                } else {
                    str3 = this.n.mPath;
                }
            }
            d(str3);
        }
    }
}
