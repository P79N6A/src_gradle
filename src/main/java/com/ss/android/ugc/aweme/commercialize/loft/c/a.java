package com.ss.android.ugc.aweme.commercialize.loft.c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ¿\u00012\u00020\u00012\u00020\u0002:\u0006¿\u0001À\u0001Á\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020eH\u0002J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\n\u0010\u0001\u001a\u00030\u0001H\u0016J\u001a\u0010\u0001\u001a\u00030\u00012\u0006\u0010+\u001a\u00020)2\u0006\u0010(\u001a\u00020)H\u0002J$\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u00020t2\u0007\u0010\u0001\u001a\u00020)2\u0007\u0010\u0001\u001a\u00020)H\u0002J$\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u00020t2\u0007\u0010\u0001\u001a\u00020)2\u0007\u0010\u0001\u001a\u00020)H\u0002J\u0012\u0010\u0001\u001a\u00020e2\u0007\u0010\u0001\u001a\u00020eH\u0002J\u0007\u0010\u0001\u001a\u00020tJ\u001c\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\u001f\u0010\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010W2\b\u0010¡\u0001\u001a\u00030\u0001H\u0002J'\u0010¢\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010W2\b\u0010¡\u0001\u001a\u00030\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0013\u0010£\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010WJ\n\u0010¤\u0001\u001a\u00030\u0001H\u0002J\n\u0010¥\u0001\u001a\u00030\u0001H\u0002J\n\u0010¦\u0001\u001a\u00030\u0001H\u0002J\u0011\u0010§\u0001\u001a\u00030\u00012\u0007\u0010¨\u0001\u001a\u00020)J\n\u0010©\u0001\u001a\u00030\u0001H\u0002J\n\u0010ª\u0001\u001a\u00030\u0001H\u0002J\n\u0010«\u0001\u001a\u00030\u0001H\u0002J\n\u0010¬\u0001\u001a\u00030\u0001H\u0002J\n\u0010­\u0001\u001a\u00030\u0001H\u0002J\n\u0010®\u0001\u001a\u00030\u0001H\u0016J\n\u0010¯\u0001\u001a\u00030\u0001H\u0016J\b\u0010°\u0001\u001a\u00030\u0001J\n\u0010±\u0001\u001a\u00030\u0001H\u0002J\u001d\u0010²\u0001\u001a\u00030\u00012\u0007\u0010³\u0001\u001a\u00020\u000b2\b\u0010´\u0001\u001a\u00030µ\u0001H\u0002J)\u0010¶\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010W2\b\u0010¡\u0001\u001a\u00030\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\n\u0010·\u0001\u001a\u00030\u0001H\u0002J\u0013\u0010¸\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010WJ\n\u0010¹\u0001\u001a\u00030\u0001H\u0016J\n\u0010º\u0001\u001a\u00030\u0001H\u0016J\u0015\u0010»\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010WH\u0002J\u0015\u0010¼\u0001\u001a\u00030\u00012\t\u0010 \u0001\u001a\u0004\u0018\u00010WH\u0002J\u0013\u0010½\u0001\u001a\u00030\u00012\u0007\u0010 \u0001\u001a\u00020WH\u0002J\b\u0010¾\u0001\u001a\u00030\u0001R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u000f\u001a\u0004\b.\u0010\rR\u001b\u00100\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b1\u0010\rR\u001b\u00103\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b7\u0010\u000f\u001a\u0004\b5\u00106R\u001b\u00108\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b:\u0010\u000f\u001a\u0004\b9\u0010\rR\u001b\u0010;\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b=\u0010\u000f\u001a\u0004\b<\u0010\rR\u001b\u0010>\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b@\u0010\u000f\u001a\u0004\b?\u00106R\u001b\u0010A\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\bC\u0010\u000f\u001a\u0004\bB\u0010\rR\u001b\u0010D\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\bF\u0010\u000f\u001a\u0004\bE\u00106R\u001b\u0010G\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\bI\u0010\u000f\u001a\u0004\bH\u0010\rR\u001b\u0010J\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\bL\u0010\u000f\u001a\u0004\bK\u0010\rR\u001b\u0010M\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\bO\u0010\u000f\u001a\u0004\bN\u0010\rR\u001b\u0010P\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\bR\u0010\u000f\u001a\u0004\bQ\u0010\rR\u001b\u0010S\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\bU\u0010\u000f\u001a\u0004\bT\u0010\rR\u0010\u0010V\u001a\u0004\u0018\u00010WX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010X\u001a\u00020Y8BX\u0002¢\u0006\f\n\u0004\b\\\u0010\u000f\u001a\u0004\bZ\u0010[R\u001b\u0010]\u001a\u00020Y8BX\u0002¢\u0006\f\n\u0004\b_\u0010\u000f\u001a\u0004\b^\u0010[R\u001b\u0010`\u001a\u00020Y8BX\u0002¢\u0006\f\n\u0004\bb\u0010\u000f\u001a\u0004\ba\u0010[R\u000e\u0010c\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010f\u001a\u0004\u0018\u00010WX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010g\u001a\u00020h8BX\u0002¢\u0006\f\n\u0004\bk\u0010\u000f\u001a\u0004\bi\u0010jR\u001c\u0010l\u001a\u0004\u0018\u00010mX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010s\u001a\u00020t8BX\u0002¢\u0006\f\n\u0004\bw\u0010\u000f\u001a\u0004\bu\u0010vR\u0010\u0010x\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010y\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010z\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010{\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010|\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010}\u001a\u00020~8BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010\u000f\u001a\u0005\b\u0010\u0001R\u001f\u0010\u0001\u001a\u00020~8BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\u000f\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020~8BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010\u000f\u001a\u0006\b\u0001\u0010\u0001R\u0010\u0010\u0001\u001a\u00030\u0001X.¢\u0006\u0002\n\u0000¨\u0006Â\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController;", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IRefresh;", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IExpand;", "context", "Landroid/content/Context;", "parentView", "Landroid/view/ViewGroup;", "refreshMode", "", "(Landroid/content/Context;Landroid/view/ViewGroup;Z)V", "background", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getBackground", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "background$delegate", "Lkotlin/Lazy;", "backgroundAlpha", "Landroid/animation/ObjectAnimator;", "bottomLeftBallUp", "bottomLeftBallUpTemp", "bottomRightBallUp", "bottomRightBallUpTemp", "closeListener", "Landroid/view/View$OnClickListener;", "getCloseListener", "()Landroid/view/View$OnClickListener;", "setCloseListener", "(Landroid/view/View$OnClickListener;)V", "getContext", "()Landroid/content/Context;", "value", "Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$ViewState;", "currentState", "setCurrentState", "(Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$ViewState;)V", "elementAnimSet", "Landroid/animation/AnimatorSet;", "elementAnimSetCanceled", "elementTempAnimSet", "elementTempAnimSetCanceled", "goodsBackgroundOffset", "", "goodsBackgroundTranslation", "goodsOffset", "goodsTranslation", "ivBottomLeft", "getIvBottomLeft", "ivBottomLeft$delegate", "ivBottomRight", "getIvBottomRight", "ivBottomRight$delegate", "ivClose", "Landroid/widget/ImageView;", "getIvClose", "()Landroid/widget/ImageView;", "ivClose$delegate", "ivGoods", "getIvGoods", "ivGoods$delegate", "ivGoodsBackground", "getIvGoodsBackground", "ivGoodsBackground$delegate", "ivLoadBlue", "getIvLoadBlue", "ivLoadBlue$delegate", "ivLoadLogo", "getIvLoadLogo", "ivLoadLogo$delegate", "ivLoadRed", "getIvLoadRed", "ivLoadRed$delegate", "ivLoadTitle", "getIvLoadTitle", "ivLoadTitle$delegate", "ivLogo", "getIvLogo", "ivLogo$delegate", "ivTitle", "getIvTitle", "ivTitle$delegate", "ivTopLeft", "getIvTopLeft", "ivTopLeft$delegate", "ivTopRight", "getIvTopRight", "ivTopRight$delegate", "lastLoft", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/Loft;", "llDesc", "Landroid/widget/LinearLayout;", "getLlDesc", "()Landroid/widget/LinearLayout;", "llDesc$delegate", "llLoadDesc", "getLlLoadDesc", "llLoadDesc$delegate", "llLoadState", "getLlLoadState", "llLoadState$delegate", "loadingDistance", "moveDP", "", "nextLoft", "normalLoading", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "getNormalLoading", "()Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "normalLoading$delegate", "openVideoListener", "Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IOpenVideo;", "getOpenVideoListener", "()Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IOpenVideo;", "setOpenVideoListener", "(Lcom/ss/android/ugc/aweme/commercialize/loft/listener/IOpenVideo;)V", "refreshStart", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "rootView$delegate", "stateAnimSet", "topLeftBallUp", "topLeftBallUpTemp", "topRightBallUp", "topRightBallUpTemp", "tvLoadState", "Landroid/widget/TextView;", "getTvLoadState", "()Landroid/widget/TextView;", "tvLoadState$delegate", "tvLoadTime", "getTvLoadTime", "tvLoadTime$delegate", "tvTime", "getTvTime", "tvTime$delegate", "viewType", "Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$ViewType;", "back", "", "cancelRepeatElementAnim", "cancelTempElementAnim", "changeStateAnimation", "nextState", "endBack", "endExpand", "expendedGoodsAnimation", "getRepeatAnimation", "view", "start", "end", "getTempAnimation", "getTextByState", "state", "getView", "initBackground", "startColor", "", "endColor", "initState", "loft", "type", "initView", "initViewWhenClose", "loadingTranslation", "onExpended", "onExpending", "onMove", "move", "onPullDownFirst", "onPullDownSecond", "onPullDownThird", "onRefreshing", "onViewClose", "refreshing", "refreshingBack", "reset", "resetStateSize", "resizeImageWidth", "image", "imageInfo", "Lcom/facebook/imagepipeline/image/ImageInfo;", "saveData", "setLoadingDistance", "startElementAnimation", "startExpand", "startRefresh", "startRepeatElementAnimation", "startTempElementAnim", "updateCurrentLoftUI", "updateLoadUI", "Companion", "ViewState", "ViewType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements com.ss.android.ugc.aweme.commercialize.loft.b.b, com.ss.android.ugc.aweme.commercialize.loft.b.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39158a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f39159b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "rootView", "getRootView()Landroid/view/View;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivClose", "getIvClose()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "background", "getBackground()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivGoodsBackground", "getIvGoodsBackground()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivGoods", "getIvGoods()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "llDesc", "getLlDesc()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivLogo", "getIvLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivTitle", "getIvTitle()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "tvTime", "getTvTime()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivTopLeft", "getIvTopLeft()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivTopRight", "getIvTopRight()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivBottomLeft", "getIvBottomLeft()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivBottomRight", "getIvBottomRight()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "llLoadDesc", "getLlLoadDesc()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivLoadLogo", "getIvLoadLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivLoadTitle", "getIvLoadTitle()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "tvLoadTime", "getTvLoadTime()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "llLoadState", "getLlLoadState()Landroid/widget/LinearLayout;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivLoadBlue", "getIvLoadBlue()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "ivLoadRed", "getIvLoadRed()Landroid/widget/ImageView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "tvLoadState", "getTvLoadState()Landroid/widget/TextView;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "normalLoading", "getNormalLoading()Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;"))};
    public static final C0511a u = new C0511a((byte) 0);
    private final Lazy A = LazyKt.lazy(new x(this));
    private final Lazy B = LazyKt.lazy(new t(this));
    private final Lazy C = LazyKt.lazy(new u(this));
    private final Lazy D = LazyKt.lazy(new af(this));
    private final Lazy E = LazyKt.lazy(new v(this));
    private final Lazy F = LazyKt.lazy(new w(this));
    private final Lazy G = LazyKt.lazy(new k(this));
    private final Lazy H = LazyKt.lazy(new l(this));
    private final Lazy I = LazyKt.lazy(new y(this));
    private final Lazy J = LazyKt.lazy(new q(this));
    private final Lazy K = LazyKt.lazy(new s(this));
    private final Lazy L = LazyKt.lazy(new ae(this));
    private final Lazy M = LazyKt.lazy(new z(this));
    private final Lazy N = LazyKt.lazy(new p(this));
    private final Lazy O = LazyKt.lazy(new r(this));
    private final Lazy P = LazyKt.lazy(new ad(this));
    private final Lazy Q = LazyKt.lazy(new aa(this));
    private com.ss.android.ugc.aweme.commercialize.loft.model.a R;
    private c S;
    private ObjectAnimator T;
    private ObjectAnimator U;
    private ObjectAnimator V;
    private boolean W;
    private AnimatorSet X;
    private ObjectAnimator Y;
    private ObjectAnimator Z;
    private ObjectAnimator aa;
    private ObjectAnimator ab;
    private final boolean ac;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f39160c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.loft.b.c f39161d;

    /* renamed from: e  reason: collision with root package name */
    public float f39162e;

    /* renamed from: f  reason: collision with root package name */
    public float f39163f;
    public com.ss.android.ugc.aweme.commercialize.loft.model.a g;
    public float h;
    public int i;
    public int j;
    public b k = b.CLOSE;
    public boolean l;
    public AnimatorSet m;
    public ObjectAnimator n;
    public ObjectAnimator o;
    public ObjectAnimator p;
    public ObjectAnimator q;
    public AnimatorSet r;
    @NotNull
    public final Context s;
    public final ViewGroup t;
    private final Lazy v = LazyKt.lazy(new ab(this));
    private final Lazy w = LazyKt.lazy(new m(this));
    private final Lazy x = LazyKt.lazy(new d(this));
    private final Lazy y = LazyKt.lazy(new o(this));
    private final Lazy z = LazyKt.lazy(new n(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$Companion;", "", "()V", "BACKGROUND_ANIM_TIME", "", "BIG_END_POSITION", "", "ELEMENT_ANIM_TIME", "GOODS_ANIM_TIME", "GOODS_BACKGROUND_POSITION", "GOODS_POSITON", "LEFT_BOTTOM_START_POSITION", "LEFT_TOP_START_POSITION", "LOADING_ANIMITION_END", "", "LOADING_TEXT_CHANGE", "RIGHT_BOTTOM_START_POSITION", "RIGHT_TOP_START_POSITION", "SMALL_END_POSITION", "STATE_DISCOVER_AMAZING", "STATE_LOOSEN_REFRESH", "STATE_NONE", "STATE_PULL_DOWN_REFRESH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$a  reason: collision with other inner class name */
    public static final class C0511a {
        private C0511a() {
        }

        public /* synthetic */ C0511a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aa extends Lambda implements Function0<DmtLoadingLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final DmtLoadingLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31435, new Class[0], DmtLoadingLayout.class)) {
                return (DmtLoadingLayout) this.this$0.g().findViewById(C0906R.id.brb);
            }
            return (DmtLoadingLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31435, new Class[0], DmtLoadingLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ab extends Lambda implements Function0<View> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final View invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31436, new Class[0], View.class)) {
                return LayoutInflater.from(this.this$0.s).inflate(C0906R.layout.a5u, this.this$0.t, false);
            }
            return (View) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31436, new Class[0], View.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$startTempElementAnim$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ac implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39165b;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
        }

        ac(a aVar) {
            this.f39165b = aVar;
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39164a, false, 31437, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39164a, false, 31437, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.loft.b.c cVar = this.f39165b.f39161d;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ad extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31438, new Class[0], TextView.class)) {
                return (TextView) this.this$0.g().findViewById(C0906R.id.de4);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31438, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ae extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31439, new Class[0], TextView.class)) {
                return (TextView) this.this$0.g().findViewById(C0906R.id.de5);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31439, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class af extends Lambda implements Function0<TextView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final TextView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31440, new Class[0], TextView.class)) {
                return (TextView) this.this$0.g().findViewById(C0906R.id.dkg);
            }
            return (TextView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31440, new Class[0], TextView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$ViewState;", "", "(Ljava/lang/String;I)V", "CLOSE", "PULL_DOWN_FIRST", "PULL_DOWN_SECOND", "PULL_DOWN_THIRD", "TO_REFRESH", "REFRESHING", "REFRESH_BACK", "BACKING", "EXPENDING", "EXPENDED", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum b {
        CLOSE,
        PULL_DOWN_FIRST,
        PULL_DOWN_SECOND,
        PULL_DOWN_THIRD,
        TO_REFRESH,
        REFRESHING,
        REFRESH_BACK,
        BACKING,
        EXPENDING,
        EXPENDED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$ViewType;", "", "(Ljava/lang/String;I)V", "SECOND_LOFT", "DIRECT_OPEN", "VIDEO_PLACEHOLDER", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum c {
        SECOND_LOFT,
        DIRECT_OPEN,
        VIDEO_PLACEHOLDER;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31412, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.ayx);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31412, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$changeStateAnimation$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39167b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39168c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ObjectAnimator f39169d;

        public final void onAnimationCancel(@Nullable Animator animator) {
        }

        public final void onAnimationRepeat(@Nullable Animator animator) {
        }

        public final void onAnimationStart(@Nullable Animator animator) {
        }

        public final void onAnimationEnd(@Nullable Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f39166a, false, 31413, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f39166a, false, 31413, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            this.f39167b.u().setTag(Integer.valueOf(this.f39168c));
            this.f39167b.u().setText(a.a(this.f39168c));
            this.f39167b.r = new AnimatorSet();
            AnimatorSet animatorSet = this.f39167b.r;
            if (animatorSet != null) {
                AnimatorSet.Builder play = animatorSet.play(this.f39169d);
                if (play != null) {
                    play.after(50);
                }
            }
            AnimatorSet animatorSet2 = this.f39167b.r;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(100);
            }
            AnimatorSet animatorSet3 = this.f39167b.r;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }

        e(a aVar, int i, ObjectAnimator objectAnimator) {
            this.f39167b = aVar;
            this.f39168c = i;
            this.f39169d = objectAnimator;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$initView$1$1", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFinalImageSet", "", "id", "", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.loft.model.a f39172c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f39173d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f39174e;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39170a, false, 31414, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39170a, false, 31414, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            } else if (imageInfo != null) {
                this.f39171b.a(this.f39171b.j(), imageInfo);
            }
        }

        f(a aVar, com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2, c cVar, View.OnClickListener onClickListener) {
            this.f39171b = aVar;
            this.f39172c = aVar2;
            this.f39173d = cVar;
            this.f39174e = onClickListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$initView$1$2", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFinalImageSet", "", "id", "", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.loft.model.a f39177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f39178d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f39179e;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39175a, false, 31415, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39175a, false, 31415, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            } else if (imageInfo != null) {
                this.f39176b.a(this.f39176b.k(), imageInfo);
            }
        }

        g(a aVar, com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2, c cVar, View.OnClickListener onClickListener) {
            this.f39176b = aVar;
            this.f39177c = aVar2;
            this.f39178d = cVar;
            this.f39179e = onClickListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$initView$1$3", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFinalImageSet", "", "id", "", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39181b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.loft.model.a f39182c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f39183d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f39184e;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39180a, false, 31416, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39180a, false, 31416, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            } else if (imageInfo != null) {
                this.f39181b.a(this.f39181b.p(), imageInfo);
            }
        }

        h(a aVar, com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2, c cVar, View.OnClickListener onClickListener) {
            this.f39181b = aVar;
            this.f39182c = aVar2;
            this.f39183d = cVar;
            this.f39184e = onClickListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$initView$1$4", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFinalImageSet", "", "id", "", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class i extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.loft.model.a f39187c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f39188d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f39189e;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f39185a, false, 31417, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f39185a, false, 31417, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            } else if (imageInfo != null) {
                this.f39186b.a(this.f39186b.q(), imageInfo);
            }
        }

        i(a aVar, com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2, c cVar, View.OnClickListener onClickListener) {
            this.f39186b = aVar;
            this.f39187c = aVar2;
            this.f39188d = cVar;
            this.f39189e = onClickListener;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/commercialize/loft/view/IntermediateStateViewController$initView$1$5"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39190a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f39191b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.loft.model.a f39192c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f39193d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f39194e;

        j(a aVar, com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2, c cVar, View.OnClickListener onClickListener) {
            this.f39191b = aVar;
            this.f39192c = aVar2;
            this.f39193d = cVar;
            this.f39194e = onClickListener;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39190a, false, 31418, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39190a, false, 31418, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39191b.x();
            this.f39191b.y();
            View.OnClickListener onClickListener = this.f39194e;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31419, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.aza);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31419, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31420, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.azb);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31420, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31421, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.g().findViewById(C0906R.id.azy);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31421, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31422, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b1l);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31422, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31423, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b1m);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31423, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31424, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.g().findViewById(C0906R.id.b2s);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31424, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class q extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31425, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b2t);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31425, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function0<ImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final ImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31426, new Class[0], ImageView.class)) {
                return (ImageView) this.this$0.g().findViewById(C0906R.id.b2u);
            }
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31426, new Class[0], ImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31427, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b2v);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31427, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class t extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31428, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b30);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31428, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31429, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b62);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31429, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class v extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31430, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b66);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31430, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class w extends Lambda implements Function0<RemoteImageView> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final RemoteImageView invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31431, new Class[0], RemoteImageView.class)) {
                return (RemoteImageView) this.this$0.g().findViewById(C0906R.id.b67);
            }
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31431, new Class[0], RemoteImageView.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class x extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31432, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.g().findViewById(C0906R.id.bgb);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31432, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class y extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31433, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.g().findViewById(C0906R.id.bh3);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31433, new Class[0], LinearLayout.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class z extends Lambda implements Function0<LinearLayout> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final LinearLayout invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31434, new Class[0], LinearLayout.class)) {
                return (LinearLayout) this.this$0.g().findViewById(C0906R.id.bh4);
            }
            return (LinearLayout) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31434, new Class[0], LinearLayout.class);
        }
    }

    private final ImageView A() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31353, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31353, new Class[0], ImageView.class);
        } else {
            value = this.w.getValue();
        }
        return (ImageView) value;
    }

    private final RemoteImageView B() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31354, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31354, new Class[0], RemoteImageView.class);
        } else {
            value = this.x.getValue();
        }
        return (RemoteImageView) value;
    }

    private final LinearLayout C() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31357, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31357, new Class[0], LinearLayout.class);
        } else {
            value = this.A.getValue();
        }
        return (LinearLayout) value;
    }

    private final TextView D() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31360, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31360, new Class[0], TextView.class);
        } else {
            value = this.D.getValue();
        }
        return (TextView) value;
    }

    private final LinearLayout E() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31365, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31365, new Class[0], LinearLayout.class);
        } else {
            value = this.I.getValue();
        }
        return (LinearLayout) value;
    }

    private final TextView F() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31368, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31368, new Class[0], TextView.class);
        } else {
            value = this.L.getValue();
        }
        return (TextView) value;
    }

    private final DmtLoadingLayout G() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31373, new Class[0], DmtLoadingLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31373, new Class[0], DmtLoadingLayout.class);
        } else {
            value = this.Q.getValue();
        }
        return (DmtLoadingLayout) value;
    }

    public static int a(int i2) {
        switch (i2) {
            case 1:
                return C0906R.string.b7m;
            case 2:
                return C0906R.string.b7l;
            case 3:
                return C0906R.string.b7k;
            default:
                return C0906R.string.b7m;
        }
    }

    public final void d() {
    }

    public final View g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31352, new Class[0], View.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31352, new Class[0], View.class);
        } else {
            value = this.v.getValue();
        }
        return (View) value;
    }

    public final RemoteImageView h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31355, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31355, new Class[0], RemoteImageView.class);
        } else {
            value = this.y.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31356, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31356, new Class[0], RemoteImageView.class);
        } else {
            value = this.z.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31358, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31358, new Class[0], RemoteImageView.class);
        } else {
            value = this.B.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31359, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31359, new Class[0], RemoteImageView.class);
        } else {
            value = this.C.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31361, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31361, new Class[0], RemoteImageView.class);
        } else {
            value = this.E.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31362, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31362, new Class[0], RemoteImageView.class);
        } else {
            value = this.F.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView n() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31363, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31363, new Class[0], RemoteImageView.class);
        } else {
            value = this.G.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31364, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31364, new Class[0], RemoteImageView.class);
        } else {
            value = this.H.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView p() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31366, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31366, new Class[0], RemoteImageView.class);
        } else {
            value = this.J.getValue();
        }
        return (RemoteImageView) value;
    }

    public final RemoteImageView q() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31367, new Class[0], RemoteImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31367, new Class[0], RemoteImageView.class);
        } else {
            value = this.K.getValue();
        }
        return (RemoteImageView) value;
    }

    public final LinearLayout r() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31369, new Class[0], LinearLayout.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31369, new Class[0], LinearLayout.class);
        } else {
            value = this.M.getValue();
        }
        return (LinearLayout) value;
    }

    public final ImageView s() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31370, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31370, new Class[0], ImageView.class);
        } else {
            value = this.N.getValue();
        }
        return (ImageView) value;
    }

    public final ImageView t() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31371, new Class[0], ImageView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31371, new Class[0], ImageView.class);
        } else {
            value = this.O.getValue();
        }
        return (ImageView) value;
    }

    public final TextView u() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31372, new Class[0], TextView.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31372, new Class[0], TextView.class);
        } else {
            value = this.P.getValue();
        }
        return (TextView) value;
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f39158a, false, 31375, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f39158a, false, 31375, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "startColor");
        Intrinsics.checkParameterIsNotNull(str4, "endColor");
        g().setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str), Color.parseColor(str2)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)) != false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.commercialize.loft.model.a r16, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.commercialize.loft.c.a.c r17, @org.jetbrains.annotations.Nullable android.view.View.OnClickListener r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f39158a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.model.a> r1 = com.ss.android.ugc.aweme.commercialize.loft.model.a.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.c.a$c> r1 = com.ss.android.ugc.aweme.commercialize.loft.c.a.c.class
            r5[r13] = r1
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 31376(0x7a90, float:4.3967E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0051
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f39158a
            r3 = 0
            r4 = 31376(0x7a90, float:4.3967E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.model.a> r1 = com.ss.android.ugc.aweme.commercialize.loft.model.a.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.loft.c.a$c> r1 = com.ss.android.ugc.aweme.commercialize.loft.c.a.c.class
            r5[r13] = r1
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0051:
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            if (r8 != 0) goto L_0x0059
            return
        L_0x0059:
            java.lang.String r0 = r16.getId()
            com.ss.android.ugc.aweme.commercialize.loft.model.a r1 = r7.R
            r2 = 0
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = r1.getId()
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            r0 = r0 ^ r13
            if (r0 != 0) goto L_0x0090
            com.ss.android.ugc.aweme.commercialize.loft.model.b r0 = r16.getAnimationRes()
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r0.getDownloadUrl()
            goto L_0x007b
        L_0x007a:
            r0 = r2
        L_0x007b:
            com.ss.android.ugc.aweme.commercialize.loft.model.a r1 = r7.R
            if (r1 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.commercialize.loft.model.b r1 = r1.getAnimationRes()
            if (r1 == 0) goto L_0x0089
            java.lang.String r2 = r1.getDownloadUrl()
        L_0x0089:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r0 = r0 ^ r13
            if (r0 == 0) goto L_0x01d3
        L_0x0090:
            com.ss.android.ugc.aweme.commercialize.loft.model.b r0 = r16.getAnimationRes()
            if (r0 == 0) goto L_0x01d3
            java.lang.String r1 = r0.getStartColor()
            java.lang.String r2 = r0.getEndColor()
            r15.a((java.lang.String) r1, (java.lang.String) r2)
            int r1 = r16.getStatus()
            int r2 = com.ss.android.ugc.aweme.commercialize.loft.model.h.f39270c
            if (r1 != r2) goto L_0x00b4
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.B()
            java.lang.String r2 = r0.getBackgroundUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
        L_0x00b4:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.B()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.commercialize.loft.c.a$c r1 = com.ss.android.ugc.aweme.commercialize.loft.c.a.c.SECOND_LOFT
            if (r9 != r1) goto L_0x00c8
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.B()
            r2 = 0
            r1.setAlpha(r2)
            goto L_0x00d1
        L_0x00c8:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.B()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
        L_0x00d1:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.h()
            java.lang.String r2 = r0.getGoodsBackgroundUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.h()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.i()
            java.lang.String r2 = r0.getGoodsUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.i()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.j()
            java.lang.String r2 = r0.getLogoLeftUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$f r3 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$f
            r3.<init>(r15, r8, r9, r10)
            com.facebook.drawee.controller.ControllerListener r3 = (com.facebook.drawee.controller.ControllerListener) r3
            com.ss.android.ugc.aweme.commercialize.utils.e.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.k()
            java.lang.String r2 = r0.getLogoRightUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$g r3 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$g
            r3.<init>(r15, r8, r9, r10)
            com.facebook.drawee.controller.ControllerListener r3 = (com.facebook.drawee.controller.ControllerListener) r3
            com.ss.android.ugc.aweme.commercialize.utils.e.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r3)
            android.widget.LinearLayout r1 = r15.C()
            r1.setVisibility(r12)
            android.widget.TextView r1 = r15.D()
            java.lang.String r2 = r0.getTimeDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            android.widget.TextView r1 = r15.D()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.l()
            java.lang.String r2 = r0.getFloatLeftTopUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.l()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.m()
            java.lang.String r2 = r0.getFloatRightTopUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.m()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.n()
            java.lang.String r2 = r0.getFloatLeftBottomUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.n()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.o()
            java.lang.String r2 = r0.getFloatRightBottomUri()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.o()
            r1.setVisibility(r12)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.p()
            java.lang.String r2 = r0.getLogoLeftUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$h r3 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$h
            r3.<init>(r15, r8, r9, r10)
            com.facebook.drawee.controller.ControllerListener r3 = (com.facebook.drawee.controller.ControllerListener) r3
            com.ss.android.ugc.aweme.commercialize.utils.e.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r15.q()
            java.lang.String r2 = r0.getLogoRightUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$i r3 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$i
            r3.<init>(r15, r8, r9, r10)
            com.facebook.drawee.controller.ControllerListener r3 = (com.facebook.drawee.controller.ControllerListener) r3
            com.ss.android.ugc.aweme.commercialize.utils.e.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r2, (com.facebook.drawee.controller.ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) r3)
            android.widget.LinearLayout r1 = r15.E()
            r1.setVisibility(r12)
            android.widget.TextView r1 = r15.F()
            java.lang.String r0 = r0.getTimeDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.TextView r0 = r15.F()
            r0.setVisibility(r12)
            r15.b((int) r13)
            android.widget.LinearLayout r0 = r15.r()
            r0.setVisibility(r12)
            android.widget.ImageView r0 = r15.A()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$j r1 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$j
            r1.<init>(r15, r8, r9, r10)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x01d3:
            int r0 = r16.getStatus()
            com.ss.android.ugc.aweme.commercialize.loft.model.a r1 = r7.R
            if (r1 == 0) goto L_0x01e1
            int r1 = r1.getStatus()
            if (r0 == r1) goto L_0x01e4
        L_0x01e1:
            r15.a((com.ss.android.ugc.aweme.commercialize.loft.model.a) r16)
        L_0x01e4:
            r15.v()
            r15.a((com.ss.android.ugc.aweme.commercialize.loft.model.a) r16, (com.ss.android.ugc.aweme.commercialize.loft.c.a.c) r17)
            r15.b((com.ss.android.ugc.aweme.commercialize.loft.model.a) r16, (com.ss.android.ugc.aweme.commercialize.loft.c.a.c) r17, (android.view.View.OnClickListener) r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.c.a.a(com.ss.android.ugc.aweme.commercialize.loft.model.a, com.ss.android.ugc.aweme.commercialize.loft.c.a$c, android.view.View$OnClickListener):void");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31383, new Class[0], Void.TYPE);
            return;
        }
        a(b.EXPENDING);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31384, new Class[0], Void.TYPE);
            return;
        }
        a(b.EXPENDED);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31386, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.k == b.REFRESHING || this.k == b.REFRESH_BACK || this.k == b.TO_REFRESH)) {
            a(b.TO_REFRESH);
            this.j = this.i;
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31387, new Class[0], Void.TYPE);
            return;
        }
        if (this.k == b.TO_REFRESH) {
            a(b.REFRESHING);
        }
    }

    @NotNull
    public final View w() {
        if (!PatchProxy.isSupport(new Object[0], this, f39158a, false, 31388, new Class[0], View.class)) {
            return g();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31388, new Class[0], View.class);
    }

    public final void x() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31401, new Class[0], Void.TYPE);
        } else if (!this.l) {
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                this.l = true;
                animatorSet.cancel();
                this.m = null;
            }
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31403, new Class[0], Void.TYPE);
        } else if (!this.W) {
            AnimatorSet animatorSet = this.X;
            if (animatorSet != null) {
                this.W = true;
                animatorSet.cancel();
                this.X = null;
            }
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31407, new Class[0], Void.TYPE);
            return;
        }
        this.h = t().getX() - s().getX();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31385, new Class[0], Void.TYPE);
        } else if (this.k == b.REFRESHING) {
            a(b.REFRESH_BACK);
        } else {
            if (!(this.k == b.BACKING || this.k == b.REFRESH_BACK)) {
                a(b.BACKING);
            }
        }
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31378, new Class[0], Void.TYPE);
        } else if (!this.ac) {
            A().setImageResource(2130838312);
            E().setVisibility(8);
            p().setVisibility(8);
            q().setVisibility(8);
            F().setVisibility(8);
            r().setVisibility(8);
            s().setVisibility(8);
            t().setVisibility(8);
            u().setVisibility(8);
            G().setVisibility(8);
        } else {
            A().setImageResource(2130838313);
        }
    }

    private final void a(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39158a, false, 31377, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39158a, false, 31377, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
        } else if (aVar.getStatus() == com.ss.android.ugc.aweme.commercialize.loft.model.h.f39270c) {
            h().setVisibility(0);
            i().setVisibility(0);
            l().setVisibility(0);
            m().setVisibility(0);
            n().setVisibility(0);
            o().setVisibility(0);
        } else {
            h().setVisibility(4);
            i().setVisibility(4);
            l().setVisibility(4);
            m().setVisibility(4);
            n().setVisibility(4);
            o().setVisibility(4);
        }
    }

    private final void b(int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39158a, false, 31406, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39158a, false, 31406, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (u().getTag() instanceof Integer) {
            Object tag = u().getTag();
            if (tag != null) {
                i3 = ((Integer) tag).intValue();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        if ((i3 == 2 && i2 == 3) || (i3 == 3 && i2 == 2)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u(), "alpha", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(u(), "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.r = null;
            }
            this.r = new AnimatorSet();
            AnimatorSet animatorSet2 = this.r;
            if (animatorSet2 != null) {
                animatorSet2.play(ofFloat);
            }
            AnimatorSet animatorSet3 = this.r;
            if (animatorSet3 != null) {
                animatorSet3.setDuration(100);
            }
            AnimatorSet animatorSet4 = this.r;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new e(this, i2, ofFloat2));
            }
            AnimatorSet animatorSet5 = this.r;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        } else {
            AnimatorSet animatorSet6 = this.r;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
                this.r = null;
            }
            u().setTag(Integer.valueOf(i2));
            u().setAlpha(1.0f);
            u().setText(a(i2));
        }
    }

    private final void c(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39158a, false, 31402, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39158a, false, 31402, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && aVar.getStatus() == com.ss.android.ugc.aweme.commercialize.loft.model.h.f39270c) {
            y();
            x();
            this.X = new AnimatorSet();
            this.W = false;
            if (this.Y == null) {
                this.Y = b((View) l(), -87.0f, -80.0f);
            }
            if (this.Z == null) {
                this.Z = b((View) m(), -115.25f, -110.0f);
            }
            if (this.aa == null) {
                this.aa = b((View) n(), 62.75f, 68.0f);
            }
            if (this.ab == null) {
                this.ab = b((View) o(), 14.0f, 21.0f);
            }
            AnimatorSet animatorSet = this.X;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.Y, this.Z, this.aa, this.ab});
            }
            AnimatorSet animatorSet2 = this.X;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(700);
            }
            AnimatorSet animatorSet3 = this.X;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new ac(this));
            }
            AnimatorSet animatorSet4 = this.X;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
    }

    private final void b(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f39158a, false, 31400, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f39158a, false, 31400, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null && aVar.getStatus() == com.ss.android.ugc.aweme.commercialize.loft.model.h.f39270c) {
            y();
            x();
            this.m = new AnimatorSet();
            this.l = false;
            if (this.n == null) {
                this.n = a((View) l(), -80.0f, -100.0f);
            }
            if (this.o == null) {
                this.o = a((View) m(), -110.0f, -125.0f);
            }
            if (this.p == null) {
                this.p = a((View) n(), 68.0f, 53.0f);
            }
            if (this.q == null) {
                this.q = a((View) o(), 21.0f, 1.0f);
            }
            AnimatorSet animatorSet = this.m;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.n, this.o, this.p, this.q});
            }
            AnimatorSet animatorSet2 = this.m;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(2000);
            }
            AnimatorSet animatorSet3 = this.m;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f39158a, false, 31374, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f39158a, false, 31374, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.k = bVar;
        switch (b.f39195a[bVar.ordinal()]) {
            case 1:
                if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31395, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31395, new Class[0], Void.TYPE);
                    break;
                } else {
                    b(1);
                    if (this.m == null) {
                        b(this.R);
                    }
                    return;
                }
            case 2:
                if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31396, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31396, new Class[0], Void.TYPE);
                    break;
                } else {
                    b(2);
                    return;
                }
            case 3:
                if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31397, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31397, new Class[0], Void.TYPE);
                    break;
                } else {
                    com.ss.android.ugc.aweme.commercialize.loft.model.a aVar = this.R;
                    if (aVar != null) {
                        if (aVar.getStatus() == com.ss.android.ugc.aweme.commercialize.loft.model.h.f39270c) {
                            b(3);
                        } else {
                            b(2);
                        }
                    }
                    z();
                    return;
                }
            case 4:
                if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31394, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31394, new Class[0], Void.TYPE);
                    break;
                } else {
                    G().setVisibility(0);
                    r().setVisibility(4);
                    return;
                }
            case 5:
                if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31393, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31393, new Class[0], Void.TYPE);
                    break;
                } else {
                    B().setAlpha(0.0f);
                    E().setVisibility(0);
                    F().setVisibility(0);
                    r().setVisibility(0);
                    G().setVisibility(4);
                    com.ss.android.ugc.aweme.commercialize.loft.model.a aVar2 = this.g;
                    if (aVar2 != null) {
                        c cVar = this.S;
                        if (cVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewType");
                        }
                        a(aVar2, cVar, this.f39160c);
                        this.g = null;
                    }
                    x();
                    return;
                }
            case 6:
                if (PatchProxy.isSupport(new Object[0], this, f39158a, false, 31389, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31389, new Class[0], Void.TYPE);
                    break;
                } else {
                    if (this.T == null) {
                        this.T = ObjectAnimator.ofFloat(B(), "alpha", new float[]{0.0f, 1.0f});
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(this.T);
                    animatorSet.setDuration(200);
                    animatorSet.start();
                    c(this.R);
                    return;
                }
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                if (!PatchProxy.isSupport(new Object[0], this, f39158a, false, 31390, new Class[0], Void.TYPE)) {
                    E().setVisibility(4);
                    F().setVisibility(4);
                    r().setVisibility(4);
                    float f2 = this.f39162e;
                    float f3 = this.f39163f;
                    if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f39158a, false, 31392, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                        if (this.U == null) {
                            this.U = ObjectAnimator.ofFloat(i(), "translationY", new float[]{f2, 0.0f});
                        }
                        if (this.V == null) {
                            this.V = ObjectAnimator.ofFloat(h(), "translationY", new float[]{f3, 0.0f});
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playTogether(new Animator[]{this.U, this.V});
                        animatorSet2.setDuration(500);
                        animatorSet2.start();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f39158a, false, 31392, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                        return;
                    }
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f39158a, false, 31390, new Class[0], Void.TYPE);
                    return;
                }
        }
    }

    public final void a(RemoteImageView remoteImageView, ImageInfo imageInfo) {
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, imageInfo}, this, f39158a, false, 31398, new Class[]{RemoteImageView.class, ImageInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, imageInfo}, this, f39158a, false, 31398, new Class[]{RemoteImageView.class, ImageInfo.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
        layoutParams.width = (layoutParams.height * imageInfo.getWidth()) / imageInfo.getHeight();
        remoteImageView2.setLayoutParams(layoutParams);
    }

    private final void a(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar, c cVar) {
        if (PatchProxy.isSupport(new Object[]{aVar, cVar}, this, f39158a, false, 31379, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, cVar}, this, f39158a, false, 31379, new Class[]{com.ss.android.ugc.aweme.commercialize.loft.model.a.class, c.class}, Void.TYPE);
            return;
        }
        switch (b.f39196b[cVar.ordinal()]) {
            case 1:
                b(aVar);
                return;
            case 2:
                B().setAlpha(1.0f);
                E().setVisibility(4);
                F().setVisibility(4);
                r().setVisibility(4);
                c(aVar);
                return;
            case 3:
                B().setAlpha(1.0f);
                E().setVisibility(4);
                F().setVisibility(4);
                r().setVisibility(4);
                b(aVar);
                break;
        }
    }

    private final void b(com.ss.android.ugc.aweme.commercialize.loft.model.a aVar, c cVar, View.OnClickListener onClickListener) {
        this.R = aVar;
        this.S = cVar;
        this.f39160c = onClickListener;
    }

    private final ObjectAnimator b(View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39158a, false, 31405, new Class[]{View.class, Float.TYPE, Float.TYPE}, ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39158a, false, 31405, new Class[]{View.class, Float.TYPE, Float.TYPE}, ObjectAnimator.class);
        }
        float f4 = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{UIUtils.dip2Px(this.s, f2), UIUtils.dip2Px(this.s, f3)});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ObjectAnimator.ofFloat(v…lationY\", startDb, endDb)");
        return ofFloat;
    }

    public a(@NotNull Context context, @NotNull ViewGroup viewGroup, boolean z2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parentView");
        this.s = context;
        this.t = viewGroup;
        this.ac = z2;
    }

    public final ObjectAnimator a(View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39158a, false, 31404, new Class[]{View.class, Float.TYPE, Float.TYPE}, ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f39158a, false, 31404, new Class[]{View.class, Float.TYPE, Float.TYPE}, ObjectAnimator.class);
        }
        float f4 = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{UIUtils.dip2Px(this.s, f2), UIUtils.dip2Px(this.s, f3)});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }
}
