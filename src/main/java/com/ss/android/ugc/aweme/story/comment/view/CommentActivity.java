package com.ss.android.ugc.aweme.story.comment.view;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.base.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.i;
import com.ss.android.ugc.aweme.story.base.b.a;
import com.ss.android.ugc.aweme.story.comment.b.b;
import com.ss.android.ugc.aweme.story.comment.discretescrollview.DiscreteScrollView;
import com.ss.android.ugc.aweme.story.comment.discretescrollview.transform.b;
import com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel;
import com.ss.android.ugc.aweme.story.comment.view.adapter.CommentFragmentPagerAdapter;
import com.ss.android.ugc.aweme.story.comment.view.adapter.VideoListAdapter;
import com.ss.android.ugc.aweme.story.comment.widget.CommentBottomSheetBehavior;
import com.ss.android.ugc.aweme.story.comment.widget.MySnapHelper;
import com.ss.android.ugc.aweme.story.detail.f;
import com.ss.android.ugc.aweme.story.feed.api.StoryApi;
import com.ss.android.ugc.aweme.story.feed.c.g;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.Nullable;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.c;

public class CommentActivity extends AmeActivity implements a, DiscreteScrollView.a, DiscreteScrollView.b, VideoListAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72210a = null;
    public static int i = 0;
    private static int w = -1;
    private boolean A;
    private long B = 0;

    /* renamed from: b  reason: collision with root package name */
    public DiscreteScrollView f72211b;

    /* renamed from: c  reason: collision with root package name */
    public VideoListAdapter f72212c;

    /* renamed from: d  reason: collision with root package name */
    public VideoListItemModel f72213d;

    /* renamed from: e  reason: collision with root package name */
    public CommentBottomSheetBehavior f72214e;

    /* renamed from: f  reason: collision with root package name */
    public ViewPager f72215f;
    public CommentFragmentPagerAdapter g;
    public List<Fragment> h = new ArrayList();
    public ColorDrawable j = new ColorDrawable(-654311424);
    public boolean k = false;
    public boolean l;
    HashMap<String, i> m = new HashMap<>();
    private Context n;
    private ImageView o;
    private ImageView p;
    private DataCenter q;
    private FrameLayout r;
    private int s;
    private String t;
    private String u;
    private String v;
    private String x;
    private int y;
    private int z;

    public final int a() {
        return 0;
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f72210a, false, 82934, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f72210a, false, 82934, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.comment.view.CommentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    private int d() {
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82921, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82921, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82927, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.comment.view.CommentActivity", "onResume", true);
        super.onResume();
        this.B = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.comment.view.CommentActivity", "onResume", false);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82912, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82930, new Class[0], Void.TYPE);
        } else {
            c.a().d(new b(this.m));
            this.m.clear();
        }
        if (this.k) {
            overridePendingTransition(0, C0906R.anim.d6);
        }
    }

    public final void b() {
        Observable observable;
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82933, new Class[0], Void.TYPE);
        } else if (this.A) {
            int currentItem = this.f72211b.getCurrentItem();
            if (!this.l) {
                if (!(currentItem == 0 && currentItem == this.f72211b.getChildCount() - 1)) {
                    if (currentItem == 0 && this.f72212c.f72259d) {
                        VideoListItemModel videoListItemModel = this.f72213d;
                        if (PatchProxy.isSupport(new Object[0], videoListItemModel, VideoListItemModel.f72191d, false, 82879, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], videoListItemModel, VideoListItemModel.f72191d, false, 82879, new Class[0], Void.TYPE);
                        } else {
                            if (videoListItemModel.i) {
                                observable = StoryApi.a(videoListItemModel.h, 0, 5, videoListItemModel.f72192e, VideoListItemModel.e());
                            } else {
                                observable = StoryApi.a(videoListItemModel.f72193f, videoListItemModel.h, 0, 5, VideoListItemModel.e(), 1);
                            }
                            observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<com.ss.android.ugc.aweme.story.feed.model.b>() {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f72198a;

                                public final void onComplete(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onComplete():void, dex: classes5.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onComplete():void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                public final /* synthetic */ void onNext(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onNext(java.lang.Object):void, dex: classes5.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onNext(java.lang.Object):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                public final void onSubscribe(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onSubscribe(io.reactivex.disposables.Disposable):void, dex: classes5.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onSubscribe(io.reactivex.disposables.Disposable):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                                public final void onError(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onError(java.lang.Throwable):void, dex: classes5.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.comment.model.VideoListItemModel.3.onError(java.lang.Throwable):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            });
                        }
                        this.l = true;
                    } else if (currentItem == this.f72212c.getItemCount() - 1 && this.f72212c.f72258c) {
                        this.f72213d.b();
                        this.l = true;
                    }
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82926, new Class[0], Void.TYPE);
            return;
        }
        this.s = 0;
        if (!CollectionUtils.isEmpty(this.f72212c.getData())) {
            ArrayList arrayList = new ArrayList(this.f72212c.getData());
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                } else if (TextUtils.equals(((LifeStory) arrayList.get(i2)).getStoryId(), this.x)) {
                    this.s = i2;
                    break;
                } else {
                    i2++;
                }
            }
            this.f72211b.scrollToPosition(this.s);
            this.f72215f.setCurrentItem(this.s, false);
            r.a("click_view_button", (Map) new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "homepage_story").a("enter_method", this.u).a("author_id", this.v).a("group_id", this.t).f71925b);
        }
    }

    public void onDestroy() {
        VideoListItemModel videoListItemModel;
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82929, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (PatchProxy.isSupport(new Object[]{this}, null, VideoListItemModel.f72191d, true, 82875, new Class[]{FragmentActivity.class}, VideoListItemModel.class)) {
            videoListItemModel = (VideoListItemModel) PatchProxy.accessDispatch(new Object[]{this}, null, VideoListItemModel.f72191d, true, 82875, new Class[]{FragmentActivity.class}, VideoListItemModel.class);
        } else {
            videoListItemModel = (VideoListItemModel) ViewModelProviders.of((FragmentActivity) this).get(VideoListItemModel.class);
        }
        if (PatchProxy.isSupport(new Object[0], videoListItemModel, VideoListItemModel.f72191d, false, 82880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoListItemModel, VideoListItemModel.f72191d, false, 82880, new Class[0], Void.TYPE);
        } else {
            videoListItemModel.j.dispose();
        }
        if (this.y == 6) {
            c.a().d(new com.ss.android.ugc.aweme.story.comment.b.a());
        }
        if (this.h != null) {
            this.h.clear();
            this.h = null;
        }
    }

    public void onPause() {
        com.ss.android.ugc.aweme.story.base.b.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82928, new Class[0], Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.B;
        com.ss.android.ugc.aweme.story.base.b.a a2 = new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "view_board").a("author_id", this.v).a("group_id", this.t);
        if (PatchProxy.isSupport(new Object[]{"duration", new Long(currentTimeMillis)}, a2, com.ss.android.ugc.aweme.story.base.b.a.f71924a, false, 82251, new Class[]{String.class, Long.TYPE}, com.ss.android.ugc.aweme.story.base.b.a.class)) {
            com.ss.android.ugc.aweme.story.base.b.a aVar2 = a2;
            aVar = (com.ss.android.ugc.aweme.story.base.b.a) PatchProxy.accessDispatch(new Object[]{"duration", new Long(currentTimeMillis)}, aVar2, com.ss.android.ugc.aweme.story.base.b.a.f71924a, false, 82251, new Class[]{String.class, Long.TYPE}, com.ss.android.ugc.aweme.story.base.b.a.class);
        } else {
            aVar = a2.a("duration", String.valueOf(currentTimeMillis), a.C0750a.f71926a);
        }
        r.a("close_view", (Map) aVar.f71925b);
        if (currentTimeMillis > 100) {
            this.B = 0;
        }
        super.onPause();
    }

    private void e() {
        boolean z2;
        boolean z3;
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82923, new Class[0], Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        UserStory userStory = f.a().f72430b;
        f.a().f72430b = null;
        if (userStory == null || !g.c(userStory)) {
            if (f.a().f72431c != null && !CollectionUtils.isEmpty(f.a().f72431c.getUserStoryList())) {
                userStory = f.a().f72431c.getUserStoryList().get(0);
            }
            if (userStory == null) {
                return;
            }
        }
        List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
        for (int i2 = 0; i2 < awemeList.size(); i2++) {
            arrayList.add(awemeList.get(i2).getLifeStory());
        }
        this.f72212c.setData(arrayList);
        if (this.A) {
            VideoListAdapter videoListAdapter = this.f72212c;
            if (userStory.getLastPos() < userStory.getTotalCount() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoListAdapter.f72258c = z2;
            VideoListAdapter videoListAdapter2 = this.f72212c;
            if (userStory.getCurPos() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            videoListAdapter2.f72259d = z3;
            this.f72213d.g = userStory.getMaxCursor();
            this.f72213d.h = userStory.getMinCursor();
            if (this.y == 6) {
                this.f72213d.f72192e = userStory.getAwemeList().get(0).getStoryId();
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isHost", true);
            bundle.putString("storyId", ((LifeStory) arrayList.get(i3)).getStoryId());
            bundle.putString("groupId", ((LifeStory) arrayList.get(i3)).getGroupId());
            bundle.putString("log_pb", "");
            bundle.putInt("relationType", 0);
            bundle.putString("previous_page", getIntent().getStringExtra("enterFrom"));
            this.h.add(CommentFragment.a(bundle));
        }
        if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
        c();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82906, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82907, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.story.base.utils.c.a(this, getWindow().getDecorView())) {
            if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82909, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82909, new Class[0], Void.TYPE);
            } else {
                if (Build.VERSION.SDK_INT >= 21) {
                    getWindow().setStatusBarColor(getStatusBarColor());
                } else if (Build.VERSION.SDK_INT >= 19) {
                    StatusBarUtils.setColor(this, getStatusBarColor());
                }
                com.ss.android.ugc.aweme.story.base.utils.i.a((Activity) this);
            }
            this.z = UIUtils.getStatusBarHeight(this.n);
            LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.bic);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(linearLayout.getLayoutParams());
            layoutParams.topMargin += this.z;
            linearLayout.setLayoutParams(layoutParams);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82908, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82908, new Class[0], Void.TYPE);
            } else if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setFlags(1024, 1024);
            } else {
                getWindow().getDecorView().setSystemUiVisibility(1284);
            }
        }
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f72210a, false, 82922, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f72210a, false, 82922, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f72213d = (VideoListItemModel) ViewModelProviders.of((FragmentActivity) this).get(VideoListItemModel.class);
        this.f72213d.i = z2;
        this.f72213d.c().observe(this, new android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.story.feed.model.b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72222a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                boolean z;
                boolean z2;
                boolean z3;
                ArrayList arrayList;
                boolean z4;
                boolean z5;
                boolean z6;
                com.ss.android.ugc.aweme.story.feed.model.b bVar = (com.ss.android.ugc.aweme.story.feed.model.b) obj;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f72222a, false, 82941, new Class[]{com.ss.android.ugc.aweme.story.feed.model.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f72222a, false, 82941, new Class[]{com.ss.android.ugc.aweme.story.feed.model.b.class}, Void.TYPE);
                    return;
                }
                CommentActivity.this.l = false;
                if (bVar != null && bVar.getUserStory() != null && !CollectionUtils.isEmpty(bVar.getUserStory().getAwemeList())) {
                    UserStory userStory = bVar.getUserStory();
                    com.ss.android.ugc.aweme.story.base.c.a.a aVar = (com.ss.android.ugc.aweme.story.base.c.a.a) CommentActivity.this.f72213d.f72128c.getValue();
                    if (aVar == com.ss.android.ugc.aweme.story.base.c.a.a.f71932e) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < userStory.getAwemeList().size(); i++) {
                            arrayList2.add(userStory.getAwemeList().get(i).getLifeStory());
                        }
                        CommentActivity.this.f72212c.setData(arrayList2);
                        VideoListAdapter videoListAdapter = CommentActivity.this.f72212c;
                        if (userStory.getLastPos() < userStory.getTotalCount() - 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        videoListAdapter.f72258c = z5;
                        VideoListAdapter videoListAdapter2 = CommentActivity.this.f72212c;
                        if (userStory.getCurPos() > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        videoListAdapter2.f72259d = z6;
                        CommentActivity.this.f72213d.g = userStory.getMaxCursor();
                        CommentActivity.this.f72213d.h = userStory.getMinCursor();
                    } else if (aVar == com.ss.android.ugc.aweme.story.base.c.a.a.h) {
                        if (CollectionUtils.isEmpty(CommentActivity.this.f72212c.getData())) {
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList(CommentActivity.this.f72212c.getData());
                        }
                        for (int i2 = 0; i2 < userStory.getAwemeList().size(); i2++) {
                            arrayList.add(userStory.getAwemeList().get(i2).getLifeStory());
                        }
                        CommentActivity.this.f72212c.setDataAfterLoadMore(arrayList);
                        VideoListAdapter videoListAdapter3 = CommentActivity.this.f72212c;
                        if (userStory.getLastPos() < userStory.getTotalCount() - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        videoListAdapter3.f72258c = z4;
                        CommentActivity.this.f72213d.g = userStory.getMaxCursor();
                    } else if (aVar == com.ss.android.ugc.aweme.story.base.c.a.a.k) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i3 = 0; i3 < userStory.getAwemeList().size(); i3++) {
                            arrayList3.add(userStory.getAwemeList().get(i3).getLifeStory());
                        }
                        if (!CollectionUtils.isEmpty(CommentActivity.this.f72212c.getData())) {
                            arrayList3.addAll(CommentActivity.this.f72212c.getData());
                        }
                        CommentActivity.this.f72212c.setDataAfterLoadLatest(arrayList3);
                        VideoListAdapter videoListAdapter4 = CommentActivity.this.f72212c;
                        if (userStory.getCurPos() > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        videoListAdapter4.f72259d = z3;
                        CommentActivity.this.f72213d.h = userStory.getMinCursor();
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (int i4 = 0; i4 < userStory.getAwemeList().size(); i4++) {
                            arrayList4.add(userStory.getAwemeList().get(i4).getLifeStory());
                        }
                        CommentActivity.this.f72212c.setData(arrayList4);
                        VideoListAdapter videoListAdapter5 = CommentActivity.this.f72212c;
                        if (userStory.getLastPos() < userStory.getTotalCount() - 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        videoListAdapter5.f72258c = z;
                        VideoListAdapter videoListAdapter6 = CommentActivity.this.f72212c;
                        if (userStory.getCurPos() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        videoListAdapter6.f72259d = z2;
                        CommentActivity.this.f72213d.g = userStory.getMaxCursor();
                        CommentActivity.this.f72213d.h = userStory.getMinCursor();
                    }
                    for (int i5 = 0; i5 < userStory.getAwemeList().size(); i5++) {
                        Bundle bundle = new Bundle();
                        int i6 = CommentActivity.i;
                        CommentActivity.i = i6 + 1;
                        bundle.putInt("pager_num", i6);
                        bundle.putBoolean("isHost", true);
                        bundle.putString("storyId", userStory.getAwemeList().get(i5).getStoryId());
                        bundle.putString("groupId", userStory.getAwemeList().get(i5).getLifeStory().getGroupId());
                        bundle.putString("log_pb", "");
                        bundle.putInt("relationType", userStory.getFriendType());
                        bundle.putString("previous_page", CommentActivity.this.getIntent().getStringExtra("enterFrom"));
                        CommentActivity.this.h.add(CommentFragment.a(bundle));
                    }
                    if (CommentActivity.this.g != null) {
                        CommentActivity.this.g.notifyDataSetChanged();
                    }
                    if (aVar == com.ss.android.ugc.aweme.story.base.c.a.a.f71932e) {
                        CommentActivity.this.c();
                    }
                }
            }
        });
        this.f72213d.f72193f = this.v;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72210a, false, 82931, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72210a, false, 82931, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72215f.setCurrentItem(i2);
        r.a("click_view_button", (Map) new com.ss.android.ugc.aweme.story.base.b.a().a("enter_from", "view_board").a("click_method", "click_video_cover").a("author_id", this.v).a("group_id", ((LifeStory) this.f72212c.getData().get(i2)).getGroupId()).f71925b);
    }

    public void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f72210a, false, 82910, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f72210a, false, 82910, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.comment.view.CommentActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(C0906R.anim.cv, 0);
        this.n = this;
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView((int) C0906R.layout.as);
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82913, new Class[0], Void.TYPE);
        } else {
            this.f72211b = (DiscreteScrollView) findViewById(C0906R.id.vr);
            this.r = (FrameLayout) findViewById(C0906R.id.afy);
            this.f72215f = (ViewPager) findViewById(C0906R.id.v6);
            this.o = (ImageView) findViewById(C0906R.id.ix);
            this.o.setOnClickListener(new a(this));
            com.bytedance.ies.dmt.ui.e.b.a(this.o);
            this.p = (ImageView) findViewById(C0906R.id.cop);
            com.bytedance.ies.dmt.ui.e.b.a(this.p);
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82914, new Class[0], Void.TYPE);
        } else if (getIntent() != null) {
            this.x = getIntent().getStringExtra("storyId");
            this.v = getIntent().getStringExtra("userId");
            this.y = Integer.parseInt(getIntent().getStringExtra("page_type"));
            if (getIntent().getBooleanExtra("enter_type", true)) {
                str = "click_text";
            } else {
                str = "slide_up";
            }
            this.u = str;
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82915, new Class[0], Void.TYPE);
        } else {
            this.q = DataCenter.a(ViewModelProviders.of((FragmentActivity) this), (LifecycleOwner) this);
            this.q.a("viewer_count", (android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new b<com.ss.android.ugc.aweme.arch.widgets.base.a>(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82920, new Class[0], Void.TYPE);
        } else {
            this.f72214e = CommentBottomSheetBehavior.b(findViewById(C0906R.id.b9k));
            this.f72214e.l = new CommentBottomSheetBehavior.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72220a;

                public final void a(@NonNull View view, int i) {
                    if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f72220a, false, 82939, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f72220a, false, 82939, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i == 5) {
                        ColorDrawable colorDrawable = new ColorDrawable(0);
                        if (CommentActivity.this.getWindow() != null) {
                            CommentActivity.this.getWindow().setBackgroundDrawable(colorDrawable);
                            CommentActivity.this.k = false;
                            CommentActivity.this.finish();
                        }
                    }
                }

                public final void a(@NonNull View view, float f2) {
                    if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, f72220a, false, 82940, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, f72220a, false, 82940, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!Float.isNaN(f2)) {
                        ColorDrawable colorDrawable = new ColorDrawable(((Integer) new ArgbEvaluator().evaluate(Math.abs(f2), -654311424, 0)).intValue());
                        if (CommentActivity.this.getWindow() != null) {
                            CommentActivity.this.getWindow().setBackgroundDrawable(colorDrawable);
                        }
                    } else if (CommentActivity.this.getWindow() != null) {
                        CommentActivity.this.getWindow().setBackgroundDrawable(CommentActivity.this.j);
                    }
                }
            };
            this.f72214e.f72312e = true;
            this.f72214e.q = true;
            if (com.ss.android.ugc.aweme.story.base.utils.c.a(this, getWindow().getDecorView())) {
                this.f72214e.a(com.bytedance.ies.dmt.ui.e.a.a(this) + d() + com.ss.android.ugc.aweme.story.base.utils.c.a(this));
            } else {
                this.f72214e.a(com.bytedance.ies.dmt.ui.e.a.a(this) + d());
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82917, new Class[0], Void.TYPE);
        } else {
            new MySnapHelper().attachToRecyclerView(this.f72211b);
            this.f72212c = new VideoListAdapter();
            this.f72212c.f72257b = this;
            this.f72212c.setShowFooter(false);
            this.f72211b.setSlideOnFling(true);
            this.f72211b.setAdapter(this.f72212c);
            DiscreteScrollView discreteScrollView = this.f72211b;
            if (PatchProxy.isSupport(new Object[]{this}, discreteScrollView, DiscreteScrollView.f72156a, false, 82801, new Class[]{DiscreteScrollView.a.class}, Void.TYPE)) {
                DiscreteScrollView discreteScrollView2 = discreteScrollView;
                PatchProxy.accessDispatch(new Object[]{this}, discreteScrollView2, DiscreteScrollView.f72156a, false, 82801, new Class[]{DiscreteScrollView.a.class}, Void.TYPE);
            } else {
                discreteScrollView.f72160d.add(this);
            }
            DiscreteScrollView discreteScrollView3 = this.f72211b;
            if (PatchProxy.isSupport(new Object[]{this}, discreteScrollView3, DiscreteScrollView.f72156a, false, 82799, new Class[]{DiscreteScrollView.b.class}, Void.TYPE)) {
                DiscreteScrollView discreteScrollView4 = discreteScrollView3;
                PatchProxy.accessDispatch(new Object[]{this}, discreteScrollView4, DiscreteScrollView.f72156a, false, 82799, new Class[]{DiscreteScrollView.b.class}, Void.TYPE);
            } else {
                discreteScrollView3.f72159c.add(this);
            }
            this.f72211b.setOverScrollEnabled(false);
            this.f72211b.setItemTransitionTimeMillis(75);
            DiscreteScrollView discreteScrollView5 = this.f72211b;
            b.a aVar = new b.a();
            aVar.f72179a.f72176d = 0.88f;
            aVar.f72179a.f72178f = 0.75f;
            aVar.f72179a.f72177e = aVar.f72180b - aVar.f72179a.f72176d;
            aVar.f72179a.g = aVar.f72181c - aVar.f72179a.f72178f;
            discreteScrollView5.setItemTransformer(aVar.f72179a);
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82918, new Class[0], Void.TYPE);
        } else {
            this.g = new CommentFragmentPagerAdapter(getSupportFragmentManager(), this.h);
            this.f72215f.setAdapter(this.g);
            if (this.f72215f != null) {
                this.f72215f.setOffscreenPageLimit(10);
            }
            this.f72215f.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72216a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageScrolled(int i, float f2, int i2) {
                }

                public void onPageSelected(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72216a, false, 82937, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72216a, false, 82937, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    CommentActivity.this.f72211b.smoothScrollToPosition(i);
                    CommentActivity.this.f72215f.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f72218a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f72218a, false, 82938, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f72218a, false, 82938, new Class[0], Void.TYPE);
                                return;
                            }
                            CommentBottomSheetBehavior commentBottomSheetBehavior = CommentActivity.this.f72214e;
                            if (PatchProxy.isSupport(new Object[0], commentBottomSheetBehavior, CommentBottomSheetBehavior.f72308a, false, 83050, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], commentBottomSheetBehavior, CommentBottomSheetBehavior.f72308a, false, 83050, new Class[0], Void.TYPE);
                                return;
                            }
                            commentBottomSheetBehavior.k = new WeakReference<>(commentBottomSheetBehavior.a((View) commentBottomSheetBehavior.j.get()));
                        }
                    });
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82911, new Class[0], Void.TYPE);
        } else {
            if (this.y == 2 || this.y == 1) {
                this.A = false;
            } else {
                this.A = true;
            }
            if (this.y != 3) {
                if (this.y == 2) {
                    e();
                } else if (this.y == 6) {
                    com.ss.android.ugc.aweme.story.player.c.d().e();
                    a(true);
                    e();
                } else if (this.y == 1) {
                    if (PatchProxy.isSupport(new Object[0], this, f72210a, false, 82924, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72210a, false, 82924, new Class[0], Void.TYPE);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        UserStory userStory = f.a().f72430b;
                        if (userStory != null && !CollectionUtils.isEmpty(userStory.getAwemeList())) {
                            LifeStory lifeStory = userStory.getAwemeList().get(0).getLifeStory();
                            arrayList.add(lifeStory);
                            this.f72212c.setData(arrayList);
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("isHost", true);
                            bundle2.putString("storyId", lifeStory.getStoryId());
                            bundle2.putString("groupId", lifeStory.getGroupId());
                            bundle2.putString("log_pb", "");
                            bundle2.putInt("relationType", 0);
                            bundle2.putString("previous_page", getIntent().getStringExtra("enterFrom"));
                            this.h.add(CommentFragment.a(bundle2));
                            if (this.g != null) {
                                this.g.notifyDataSetChanged();
                            }
                            c();
                        }
                    }
                }
            }
            a(false);
            e();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.story.comment.view.CommentActivity", "onCreate", false);
    }

    public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f72210a, false, 82932, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f72210a, false, 82932, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = i2;
        if (!CollectionUtils.isEmpty(this.f72212c.getData())) {
            this.t = ((LifeStory) this.f72212c.getData().get(this.s)).getGroupId();
            this.f72215f.setCurrentItem(i2);
        }
    }

    public static void a(@NonNull Activity activity, String str, String str2, int i2, boolean z2) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f72210a, true, 82905, new Class[]{Activity.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, Integer.valueOf(i2), Byte.valueOf(z2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f72210a, true, 82905, new Class[]{Activity.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, CommentActivity.class);
        intent.putExtra("storyId", str3);
        intent.putExtra("userId", str4);
        intent.putExtra("page_type", String.valueOf(i2));
        intent.putExtra("enter_type", z2);
        activity2.startActivity(intent);
    }
}
