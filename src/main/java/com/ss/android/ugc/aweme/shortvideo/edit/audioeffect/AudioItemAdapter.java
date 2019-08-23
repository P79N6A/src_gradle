package com.ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import a.i;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.UiThread;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bm;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.p;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.h;
import dmt.av.video.j;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000eH\u0003J\b\u0010%\u001a\u00020\u0015H\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\b\u0010'\u001a\u00020\u000eH\u0016J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0011H\u0002J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0011H\u0002J\u0010\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u0018H\u0016J\u0018\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0010\u00101\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0010\u00102\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0018\u00103\u001a\u00020\u00022\u0006\u00104\u001a\u0002052\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0018\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0018\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001a2\b\b\u0002\u0010;\u001a\u00020\u0015J\u0010\u0010<\u001a\u00020\u001e2\b\u0010=\u001a\u0004\u0018\u00010\u0013J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010?\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\u0015H\u0002J\u0012\u0010@\u001a\u00020\u001e2\b\b\u0002\u0010;\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemViewHolder$OnItemClickListener;", "context", "Landroid/support/v7/app/AppCompatActivity;", "mVEEditor", "Lcom/ss/android/vesdk/VEEditor;", "mModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "mInitialParam", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;", "(Landroid/support/v7/app/AppCompatActivity;Lcom/ss/android/vesdk/VEEditor;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectParam;)V", "mCurrentIndex", "", "mEffects", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "mHintCallback", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/IAudioEffectHintCallback;", "mIsClicked", "", "mOnItemClickListener", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "mVoicePageModel", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "viewModel", "Ldmt/av/video/VEVideoPublishEditViewModel;", "applyAudioEffect", "", "effectTag", "", "effectLocalPath", "changeDownloadState", "position", "state", "checkInitialParam", "clearAudioEffectInVEModel", "getItemCount", "isDefaultEffect", "effect", "isNonDefaultEffect", "mobClickEvent", "effectInList", "onAttachedToRecyclerView", "recyclerView", "onBindViewHolder", "viewHolder", "onClearAudioEffect", "onClickAudioEffect", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "onItemClick", "view", "Landroid/view/View;", "setData", "model", "fromNet", "setHintCallback", "callback", "setSelectedPosition", "setupBeforeUserInteract", "setupInitialIndex", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AudioItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AudioItemViewHolder.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67005a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f67006b;

    /* renamed from: c  reason: collision with root package name */
    public CategoryPageModel f67007c;

    /* renamed from: d  reason: collision with root package name */
    public g f67008d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatActivity f67009e;

    /* renamed from: f  reason: collision with root package name */
    final cb f67010f;
    private int g;
    private List<? extends Effect> h;
    private RecyclerView i;
    private AudioItemViewHolder.b j = new AudioItemViewHolder.b(this) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioItemAdapter f67012b;

        {
            this.f67012b = r1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x011c, code lost:
            if (r5 == null) goto L_0x011e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x012c, code lost:
            if (r5 == null) goto L_0x012e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0144, code lost:
            if (r5 == null) goto L_0x0146;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x015c, code lost:
            if (r5 == null) goto L_0x015e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
            if (r5 == null) goto L_0x0176;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.NotNull android.view.View r21, int r22) {
            /*
                r20 = this;
                r7 = r20
                r8 = r21
                r9 = r22
                r10 = 2
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r11 = 0
                r0[r11] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r12 = 1
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f67011a
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 76660(0x12b74, float:1.07424E-40)
                r1 = r20
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004f
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f67011a
                r3 = 0
                r4 = 76660(0x12b74, float:1.07424E-40)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r20
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x004f:
                java.lang.String r0 = "view"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter r0 = r7.f67012b
                r0.f67006b = r12
                if (r9 != 0) goto L_0x0060
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter r0 = r7.f67012b
                r0.a((int) r9)
                return
            L_0x0060:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter r0 = r7.f67012b
                java.lang.Object[] r13 = new java.lang.Object[r12]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r13[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.f67005a
                r16 = 0
                r17 = 76643(0x12b63, float:1.074E-40)
                java.lang.Class[] r1 = new java.lang.Class[r12]
                java.lang.Class r2 = java.lang.Integer.TYPE
                r1[r11] = r2
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r0
                r18 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r1 == 0) goto L_0x009f
                java.lang.Object[] r8 = new java.lang.Object[r12]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r8[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.f67005a
                r1 = 0
                r2 = 76643(0x12b63, float:1.074E-40)
                java.lang.Class[] r13 = new java.lang.Class[r12]
                java.lang.Class r3 = java.lang.Integer.TYPE
                r13[r11] = r3
                java.lang.Class r14 = java.lang.Void.TYPE
                r9 = r0
                r11 = r1
                r12 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                return
            L_0x009f:
                com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r1 = r0.f67007c
                if (r1 == 0) goto L_0x021e
                com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r1 = r1.category_effects
                if (r1 == 0) goto L_0x021e
                java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = r1.effects
                if (r1 == 0) goto L_0x021e
                int r2 = r9 + -1
                java.lang.Object r1 = r1.get(r2)
                com.ss.android.ugc.effectmanager.effect.model.Effect r1 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r1
                if (r1 != 0) goto L_0x00b7
                goto L_0x021e
            L_0x00b7:
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.f67005a
                r16 = 0
                r17 = 76645(0x12b65, float:1.07403E-40)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r2[r11] = r3
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r0
                r18 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r2 == 0) goto L_0x00ee
                java.lang.Object[] r13 = new java.lang.Object[r12]
                r13[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.f67005a
                r16 = 0
                r17 = 76645(0x12b65, float:1.07403E-40)
                java.lang.Class[] r2 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r2[r11] = r3
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r0
                r18 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                goto L_0x018b
            L_0x00ee:
                java.lang.String r2 = "select_voice_effect"
                com.ss.android.ugc.aweme.app.d.d r3 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r4 = "enter_from"
                java.lang.String r5 = "video_edit_page"
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "effect_name"
                java.lang.String r5 = r1.name
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "effect_id"
                java.lang.String r5 = r1.effect_id
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r0.f67010f
                if (r5 == 0) goto L_0x011e
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r5.getAvetParameter()
                if (r5 == 0) goto L_0x011e
                java.lang.String r5 = r5.getShootWay()
                if (r5 != 0) goto L_0x0120
            L_0x011e:
                java.lang.String r5 = ""
            L_0x0120:
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r0.f67010f
                if (r5 == 0) goto L_0x012e
                java.lang.String r5 = r5.creationId
                if (r5 != 0) goto L_0x0130
            L_0x012e:
                java.lang.String r5 = ""
            L_0x0130:
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "content_source"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r0.f67010f
                if (r5 == 0) goto L_0x0146
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r5.getAvetParameter()
                if (r5 == 0) goto L_0x0146
                java.lang.String r5 = r5.getContentSource()
                if (r5 != 0) goto L_0x0148
            L_0x0146:
                java.lang.String r5 = ""
            L_0x0148:
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "shoot_entrance"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r0.f67010f
                if (r5 == 0) goto L_0x015e
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r5.getAvetParameter()
                if (r5 == 0) goto L_0x015e
                java.lang.String r5 = r5.getStoryShootEntrance()
                if (r5 != 0) goto L_0x0160
            L_0x015e:
                java.lang.String r5 = ""
            L_0x0160:
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "content_type"
                com.ss.android.ugc.aweme.shortvideo.edit.cb r5 = r0.f67010f
                if (r5 == 0) goto L_0x0176
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r5.getAvetParameter()
                if (r5 == 0) goto L_0x0176
                java.lang.String r5 = r5.getContentType()
                if (r5 != 0) goto L_0x0178
            L_0x0176:
                java.lang.String r5 = ""
            L_0x0178:
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "local_time_ms"
                long r5 = java.lang.System.currentTimeMillis()
                com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (long) r5)
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
            L_0x018b:
                java.lang.String r2 = r1.unzipPath
                if (r2 != 0) goto L_0x0191
                java.lang.String r2 = ""
            L_0x0191:
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a r3 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.f67064f
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c r3 = r3.a()
                boolean r3 = r3.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r1)
                if (r3 == 0) goto L_0x01b0
                java.lang.String r3 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.b(r1)
                r0.a((java.lang.String) r3, (java.lang.String) r2)
                r0.b(r9)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.g r0 = r0.f67008d
                if (r0 == 0) goto L_0x01af
                r0.a(r1)
                goto L_0x021d
            L_0x01af:
                return
            L_0x01b0:
                r0.a((int) r9, (int) r10)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a r2 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.f67064f
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c r2 = r2.a()
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter$a r3 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter$a
                r3.<init>(r0, r1, r9)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e r3 = (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.e) r3
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r11] = r1
                r13[r12] = r3
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.f67060a
                r16 = 0
                r17 = 76600(0x12b38, float:1.0734E-40)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r4 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r0[r11] = r4
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e> r4 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.e.class
                r0[r12] = r4
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r2
                r18 = r0
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r0 == 0) goto L_0x0202
                java.lang.Object[] r13 = new java.lang.Object[r10]
                r13[r11] = r1
                r13[r12] = r3
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.f67060a
                r16 = 0
                r17 = 76600(0x12b38, float:1.0734E-40)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.Effect> r1 = com.ss.android.ugc.effectmanager.effect.model.Effect.class
                r0[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$e> r1 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.e.class
                r0[r12] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r2
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x0202:
                java.lang.String r0 = "effect"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a r0 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.f67064f
                com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = r0.b()
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$g r2 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$g
                r2.<init>(r3)
                com.ss.android.ugc.effectmanager.effect.b.i r2 = (com.ss.android.ugc.effectmanager.effect.b.i) r2
                com.ss.android.ugc.aweme.effectplatform.k r2 = com.ss.android.ugc.aweme.effectplatform.k.a((com.ss.android.ugc.effectmanager.effect.b.i) r2)
                com.ss.android.ugc.effectmanager.effect.b.i r2 = (com.ss.android.ugc.effectmanager.effect.b.i) r2
                r0.a((com.ss.android.ugc.effectmanager.effect.model.Effect) r1, (com.ss.android.ugc.effectmanager.effect.b.i) r2)
            L_0x021d:
                return
            L_0x021e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.AnonymousClass1.a(android.view.View, int):void");
        }
    };
    private final VEVideoPublishEditViewModel k;
    private final p l;
    private final AudioEffectParam m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioItemAdapter$onClickAudioEffect$1", "Lcom/ss/android/ugc/aweme/shortvideo/edit/audioeffect/AudioEffectManager$OnVoiceEffectDownloadListener;", "onFail", "", "failedEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onStart", "effect", "onSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements c.e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AudioItemAdapter f67014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f67015c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f67016d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter$a$a  reason: collision with other inner class name */
        static final class C0712a<V> implements Callable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67017a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f67018b;

            C0712a(a aVar) {
                this.f67018b = aVar;
            }

            public final /* synthetic */ Object call() {
                if (PatchProxy.isSupport(new Object[0], this, f67017a, false, 76663, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f67017a, false, 76663, new Class[0], Void.TYPE);
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f67018b.f67014b.f67009e, (int) C0906R.string.jd).a();
                    this.f67018b.f67014b.a(this.f67018b.f67016d, 3);
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "call", "()Lkotlin/Unit;"}, k = 3, mv = {1, 1, 15})
        static final class b<V> implements Callable<Object> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67019a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f67020b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Effect f67021c;

            b(a aVar, Effect effect) {
                this.f67020b = aVar;
                this.f67021c = effect;
            }

            public final /* synthetic */ Object call() {
                if (PatchProxy.isSupport(new Object[0], this, f67019a, false, 76664, new Class[0], Unit.class)) {
                    return (Unit) PatchProxy.accessDispatch(new Object[0], this, f67019a, false, 76664, new Class[0], Unit.class);
                }
                CategoryPageModel categoryPageModel = this.f67020b.f67014b.f67007c;
                if (categoryPageModel != null) {
                    CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
                    if (categoryEffectModel != null) {
                        List<Effect> list = categoryEffectModel.effects;
                        if (list != null) {
                            list.set(this.f67020b.f67016d - 1, this.f67021c);
                        }
                    }
                }
                this.f67020b.f67014b.a(this.f67020b.f67016d, 1);
                this.f67020b.f67014b.b(this.f67020b.f67016d);
                g gVar = this.f67020b.f67014b.f67008d;
                if (gVar == null) {
                    return null;
                }
                gVar.a(this.f67020b.f67015c);
                return Unit.INSTANCE;
            }
        }

        public final void a(@Nullable Effect effect) {
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{effect}, this, f67013a, false, 76661, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect}, this, f67013a, false, 76661, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            String str3 = null;
            if (effect != null) {
                str = effect.effect_id;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f67015c.effect_id)) {
                i.a((Callable<TResult>) new b<TResult>(this, effect), i.f1052b);
                AudioItemAdapter audioItemAdapter = this.f67014b;
                if (effect != null) {
                    str2 = a.b(effect);
                } else {
                    str2 = null;
                }
                if (effect != null) {
                    str3 = effect.unzipPath;
                }
                audioItemAdapter.a(str2, str3);
            }
        }

        public final void a(@Nullable Effect effect, @NotNull com.ss.android.ugc.effectmanager.common.e.c cVar) {
            String str;
            if (PatchProxy.isSupport(new Object[]{effect, cVar}, this, f67013a, false, 76662, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect, cVar}, this, f67013a, false, 76662, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "e");
            if (effect != null) {
                str = effect.effect_id;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f67015c.effect_id)) {
                i.a((Callable<TResult>) new C0712a<TResult>(this), i.f1052b);
            }
        }

        a(AudioItemAdapter audioItemAdapter, Effect effect, int i) {
            this.f67014b = audioItemAdapter;
            this.f67015c = effect;
            this.f67016d = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r7 = r16
            r11 = r18
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r17
            r15 = 1
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f67005a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 76646(0x12b66, float:1.07404E-40)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r17
            r0[r15] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f67005a
            r3 = 0
            r4 = 76646(0x12b66, float:1.07404E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            com.ss.android.vesdk.p r0 = r7.l
            if (r0 == 0) goto L_0x00ea
            if (r11 == 0) goto L_0x00ea
            r0 = r11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 == 0) goto L_0x00ea
            dmt.av.video.VEVideoPublishEditViewModel r0 = r7.k
            android.arch.lifecycle.MutableLiveData r0 = r0.q()
            java.lang.String r1 = "viewModel.reverseLiveData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x006e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x006e:
            java.lang.String r1 = "viewModel.reverseLiveData.value ?: false"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.booleanValue()
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r7.f67010f
            if (r1 == 0) goto L_0x007e
            boolean r1 = r1.isFastImport
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            if (r0 == 0) goto L_0x008e
            if (r1 == 0) goto L_0x008e
            com.ss.android.vesdk.p r2 = r7.l
            if (r2 == 0) goto L_0x008e
            com.ss.android.vesdk.runtime.b r2 = r2.f78038b
            if (r2 == 0) goto L_0x008e
            int r2 = r2.i
            goto L_0x0094
        L_0x008e:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r2 = r7.f67010f
            int r2 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.a((com.ss.android.ugc.aweme.shortvideo.edit.cb) r2)
        L_0x0094:
            r9 = r2
            if (r0 == 0) goto L_0x00a4
            if (r1 == 0) goto L_0x00a4
            com.ss.android.vesdk.p r0 = r7.l
            if (r0 == 0) goto L_0x00a4
            com.ss.android.vesdk.runtime.b r0 = r0.f78038b
            if (r0 == 0) goto L_0x00a4
            int r0 = r0.h
            r10 = r0
        L_0x00a4:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam
            if (r17 != 0) goto L_0x00ac
            java.lang.String r1 = ""
            r12 = r1
            goto L_0x00ae
        L_0x00ac:
            r12 = r17
        L_0x00ae:
            r13 = 0
            com.ss.android.vesdk.p r1 = r7.l
            if (r1 == 0) goto L_0x00bc
            int r1 = r1.t()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            int r14 = r1.intValue()
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c$a r1 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c.f67064f
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c r1 = r1.a()
            byte[] r1 = r1.a((java.lang.String) r11)
            r8 = r0
            r11 = r18
            r2 = 1
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.setShowErrorToast(r2)
            dmt.av.video.VEVideoPublishEditViewModel r1 = r7.k
            dmt.av.video.h r1 = r1.b()
            java.lang.String r3 = "viewModel.audioEffectOpLiveData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            dmt.av.video.j$a r3 = dmt.av.video.j.g
            dmt.av.video.j r0 = r3.a(r2, r0)
            r1.setValue(r0)
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.a(java.lang.String, java.lang.String):void");
    }

    public final int getItemCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f67005a, false, 76656, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f67005a, false, 76656, new Class[0], Integer.TYPE)).intValue();
        }
        CategoryPageModel categoryPageModel = this.f67007c;
        if (categoryPageModel != null) {
            CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
            if (categoryEffectModel != null) {
                List<Effect> list = categoryEffectModel.effects;
                if (list != null) {
                    i2 = list.size();
                }
            }
        }
        return i2 + 1;
    }

    public final void b(int i2) {
        RecyclerView.ViewHolder viewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67005a, false, 76659, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67005a, false, 76659, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int itemCount = getItemCount();
        int i3 = this.g;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i3 >= 0 && itemCount > i3) {
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(this.g);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof AudioItemViewHolder) {
                ((AudioItemViewHolder) viewHolder).a(false);
            } else {
                notifyItemChanged(this.g);
            }
        }
        this.g = i2;
        if (this.g < getItemCount()) {
            RecyclerView recyclerView2 = this.i;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.findViewHolderForAdapterPosition(this.g);
            }
            if (viewHolder2 instanceof AudioItemViewHolder) {
                ((AudioItemViewHolder) viewHolder2).a(true);
            }
        }
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f67005a, false, 76653, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f67005a, false, 76653, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.i = recyclerView2;
    }

    public final void a(int i2) {
        j jVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67005a, false, 76644, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67005a, false, 76644, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i2);
        h<j> b2 = this.k.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "viewModel.audioEffectOpLiveData");
        j.a aVar = j.g;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, aVar, j.a.f83010a, false, 91965, new Class[]{Boolean.TYPE}, j.class)) {
            j.a aVar2 = aVar;
            jVar = (j) PatchProxy.accessDispatch(new Object[]{(byte) 1}, aVar2, j.a.f83010a, false, 91965, new Class[]{Boolean.TYPE}, j.class);
        } else {
            jVar = new j("clear", true, (AudioEffectParam) null, 4);
        }
        b2.setValue(jVar);
    }

    private final void a(boolean z) {
        String str;
        boolean z2;
        boolean z3;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f67005a, false, 76649, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67005a, false, 76649, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.m == null) {
            b(0);
        } else {
            int i2 = -1;
            List<? extends Effect> list = this.h;
            if (list != null) {
                int i3 = 0;
                int i4 = -1;
                for (Object next : list) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Effect effect = (Effect) next;
                    String str5 = null;
                    if (effect != null) {
                        str = effect.unzipPath;
                    } else {
                        str = null;
                    }
                    if (str != null && bm.a(effect.unzipPath)) {
                        if (PatchProxy.isSupport(new Object[]{effect}, this, f67005a, false, 76650, new Class[]{Effect.class}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f67005a, false, 76650, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            AudioEffectParam audioEffectParam = this.m;
                            if (audioEffectParam != null) {
                                str3 = audioEffectParam.getEffectTag();
                            } else {
                                str3 = null;
                            }
                            if (a.a(effect, str3)) {
                                CharSequence charSequence = effect.unzipPath;
                                AudioEffectParam audioEffectParam2 = this.m;
                                if (audioEffectParam2 != null) {
                                    str4 = audioEffectParam2.getEffectPath();
                                } else {
                                    str4 = null;
                                }
                                if (TextUtils.equals(charSequence, str4)) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        if (!z2) {
                            if (PatchProxy.isSupport(new Object[]{effect}, this, f67005a, false, 76651, new Class[]{Effect.class}, Boolean.TYPE)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{effect}, this, f67005a, false, 76651, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                AudioEffectParam audioEffectParam3 = this.m;
                                if (audioEffectParam3 != null) {
                                    str2 = audioEffectParam3.getEffectTag();
                                } else {
                                    str2 = null;
                                }
                                if (!a.a(effect, str2)) {
                                    CharSequence charSequence2 = effect.unzipPath;
                                    AudioEffectParam audioEffectParam4 = this.m;
                                    if (audioEffectParam4 != null) {
                                        str5 = audioEffectParam4.getEffectPath();
                                    }
                                    if (TextUtils.equals(charSequence2, str5)) {
                                        z3 = true;
                                    }
                                }
                                z3 = false;
                            }
                            if (!z3) {
                            }
                        }
                        i4 = i3;
                    }
                    i3 = i5;
                }
                i2 = i4;
            }
            this.g = i2 + 1;
            if (this.g > 0) {
                b(this.g);
                return;
            }
            if (z) {
                a(this.g);
            }
        }
    }

    @UiThread
    public final void a(int i2, int i3) {
        RecyclerView.ViewHolder viewHolder;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67005a, false, 76658, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67005a, false, 76658, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int itemCount = getItemCount();
        if (i4 >= 0) {
            if (itemCount > i4) {
                RecyclerView recyclerView = this.i;
                if (recyclerView != null) {
                    viewHolder = recyclerView.findViewHolderForAdapterPosition(i4);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof AudioItemViewHolder) {
                    ((AudioItemViewHolder) viewHolder).a(i3);
                    return;
                }
                notifyItemChanged(i2);
            }
        }
    }

    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i2) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f67005a, false, 76655, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f67005a, false, 76655, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
        AudioItemViewHolder.a aVar = AudioItemViewHolder.f67023f;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(from, "LayoutInflater.from(viewGroup.context)");
        if (PatchProxy.isSupport(new Object[]{from, viewGroup2}, aVar, AudioItemViewHolder.a.f67030a, false, 76676, new Class[]{LayoutInflater.class, ViewGroup.class}, FrameLayout.class)) {
            AudioItemViewHolder.a aVar2 = aVar;
            obj = PatchProxy.accessDispatch(new Object[]{from, viewGroup2}, aVar2, AudioItemViewHolder.a.f67030a, false, 76676, new Class[]{LayoutInflater.class, ViewGroup.class}, FrameLayout.class);
        } else {
            Intrinsics.checkParameterIsNotNull(from, "inflater");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            obj = from.inflate(C0906R.layout.fp, viewGroup2, false);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
        }
        return new AudioItemViewHolder((FrameLayout) obj, this);
    }

    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i2) {
        Effect effect;
        List<String> list;
        boolean z;
        int i3;
        String str;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i4 = i2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f67005a, false, 76657, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f67005a, false, 76657, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "viewHolder");
        if (viewHolder2 instanceof AudioItemViewHolder) {
            Drawable drawable = null;
            if (i4 > 0) {
                List<? extends Effect> list2 = this.h;
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                effect = (Effect) list2.get(i4 - 1);
            } else {
                effect = null;
            }
            AudioItemViewHolder audioItemViewHolder = (AudioItemViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[]{effect}, audioItemViewHolder, AudioItemViewHolder.f67022a, false, 76666, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect}, audioItemViewHolder, AudioItemViewHolder.f67022a, false, 76666, new Class[]{Effect.class}, Void.TYPE);
            } else if (audioItemViewHolder.a()) {
                if (PatchProxy.isSupport(new Object[0], audioItemViewHolder, AudioItemViewHolder.f67022a, false, 76668, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], audioItemViewHolder, AudioItemViewHolder.f67022a, false, 76668, new Class[0], Void.TYPE);
                } else {
                    AVDmtImageTextView aVDmtImageTextView = audioItemViewHolder.f67025c;
                    if (aVDmtImageTextView != null) {
                        AVDmtImageTextView aVDmtImageTextView2 = audioItemViewHolder.f67025c;
                        if (aVDmtImageTextView2 != null) {
                            Context context = aVDmtImageTextView2.getContext();
                            if (context != null) {
                                str = context.getString(C0906R.string.bi9);
                                aVDmtImageTextView.setText(str);
                            }
                        }
                        str = null;
                        aVDmtImageTextView.setText(str);
                    }
                    AVDmtImageTextView aVDmtImageTextView3 = audioItemViewHolder.f67025c;
                    if (aVDmtImageTextView3 != null) {
                        AVDmtImageTextView aVDmtImageTextView4 = audioItemViewHolder.f67025c;
                        if (aVDmtImageTextView4 != null) {
                            Context context2 = aVDmtImageTextView4.getContext();
                            if (context2 != null) {
                                Resources resources = context2.getResources();
                                if (resources != null) {
                                    drawable = com.ss.android.ugc.bytex.a.a.a.a(resources, 2130839436);
                                }
                            }
                        }
                        aVDmtImageTextView3.a(drawable);
                    }
                    ImageView imageView = audioItemViewHolder.f67024b;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    audioItemViewHolder.a(false);
                    audioItemViewHolder.a(1);
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{effect}, audioItemViewHolder, AudioItemViewHolder.f67022a, false, 76667, new Class[]{Effect.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{effect}, audioItemViewHolder, AudioItemViewHolder.f67022a, false, 76667, new Class[]{Effect.class}, Void.TYPE);
                } else if (effect != null) {
                    AVDmtImageTextView aVDmtImageTextView5 = audioItemViewHolder.f67025c;
                    if (aVDmtImageTextView5 != null) {
                        aVDmtImageTextView5.setText(effect.name);
                    }
                    UrlModel urlModel = effect.icon_url;
                    if (urlModel != null) {
                        list = urlModel.url_list;
                    } else {
                        list = null;
                    }
                    Collection collection = list;
                    if (collection == null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (a.a(effect)) {
                            if (list == null) {
                                Intrinsics.throwNpe();
                            }
                            String str2 = list.get(0);
                            Intrinsics.checkExpressionValueIsNotNull(str2, "iconUrlList!![0]");
                            Integer intOrNull = StringsKt.toIntOrNull(str2);
                            if (intOrNull != null) {
                                i3 = intOrNull.intValue();
                            } else {
                                i3 = 0;
                            }
                            AVDmtImageTextView aVDmtImageTextView6 = audioItemViewHolder.f67025c;
                            if (aVDmtImageTextView6 != null) {
                                AVDmtImageTextView aVDmtImageTextView7 = audioItemViewHolder.f67025c;
                                if (aVDmtImageTextView7 != null) {
                                    Context context3 = aVDmtImageTextView7.getContext();
                                    if (context3 != null) {
                                        Resources resources2 = context3.getResources();
                                        if (resources2 != null) {
                                            drawable = com.ss.android.ugc.bytex.a.a.a.a(resources2, i3);
                                        }
                                    }
                                }
                                aVDmtImageTextView6.a(drawable);
                            }
                        } else {
                            AVDmtImageTextView aVDmtImageTextView8 = audioItemViewHolder.f67025c;
                            if (aVDmtImageTextView8 != null) {
                                if (list == null) {
                                    Intrinsics.throwNpe();
                                }
                                aVDmtImageTextView8.a(list.get(0));
                            }
                        }
                    }
                    audioItemViewHolder.a(false);
                    audioItemViewHolder.a(c.f67064f.a().a(effect) ? 1 : 0);
                }
            }
            if (i4 == this.g) {
                z2 = true;
            }
            audioItemViewHolder.a(z2);
        }
    }

    public final void a(@NotNull View view, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i2)}, this, f67005a, false, 76654, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i2)}, this, f67005a, false, 76654, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        AudioItemViewHolder.b bVar = this.j;
        if (bVar != null) {
            bVar.a(view2, i2);
        }
    }

    public final void a(@NotNull CategoryPageModel categoryPageModel, boolean z) {
        String str;
        Integer num;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{categoryPageModel, Byte.valueOf(z ? (byte) 1 : 0)}, this, f67005a, false, 76647, new Class[]{CategoryPageModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryPageModel, Byte.valueOf(z)}, this, f67005a, false, 76647, new Class[]{CategoryPageModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(categoryPageModel, "model");
        if (!Intrinsics.areEqual((Object) categoryPageModel, (Object) this.f67007c)) {
            CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
            if (categoryEffectModel != null) {
                List<Effect> list = categoryEffectModel.effects;
                if (list != null) {
                    this.h = list;
                    this.f67007c = categoryPageModel;
                    notifyDataSetChanged();
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, this, f67005a, false, 76648, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f67005a, false, 76648, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (!this.f67006b) {
                        AudioEffectParam audioEffectParam = this.m;
                        String str2 = null;
                        if (audioEffectParam != null) {
                            str = audioEffectParam.getEffectPath();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            if (PatchProxy.isSupport(new Object[0], this, f67005a, false, 76652, new Class[0], Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67005a, false, 76652, new Class[0], Boolean.TYPE)).booleanValue();
                            } else if (this.l != null) {
                                AudioEffectParam audioEffectParam2 = this.m;
                                if (audioEffectParam2 != null) {
                                    num = Integer.valueOf(audioEffectParam2.getTrackType());
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    AudioEffectParam audioEffectParam3 = this.m;
                                    if (audioEffectParam3 != null) {
                                        str2 = audioEffectParam3.getEffectPath();
                                    }
                                    if (!TextUtils.isEmpty(str2)) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                a(z);
                            }
                        }
                    }
                }
            }
        }
    }

    public AudioItemAdapter(@NotNull AppCompatActivity appCompatActivity, @Nullable p pVar, @Nullable cb cbVar, @Nullable AudioEffectParam audioEffectParam) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        this.f67009e = appCompatActivity;
        this.l = pVar;
        this.f67010f = cbVar;
        this.m = audioEffectParam;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.f67009e).get(VEVideoPublishEditViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(co…ditViewModel::class.java)");
        this.k = (VEVideoPublishEditViewModel) viewModel;
    }
}
