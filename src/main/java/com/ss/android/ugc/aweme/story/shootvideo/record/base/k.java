package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import a.g;
import a.i;
import android.app.Dialog;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.filter.az;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.GoNextFactoryFactory;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.e.j;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.ft;
import com.ss.android.ugc.aweme.shortvideo.gi;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.j.e;
import com.ss.android.ugc.aweme.shortvideo.record.o;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordViewModel;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.au;
import com.ss.android.ugc.aweme.tools.extract.e;
import com.ss.android.vesdk.p;
import dmt.av.video.b.y;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u0018\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*H\u0016J\b\u0010+\u001a\u00020 H\u0016J\b\u0010,\u001a\u00020-H\u0016J$\u0010.\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010/\u001a\u0004\u0018\u00010&2\u0006\u00100\u001a\u00020\u0012H\u0002J$\u00101\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010/\u001a\u0004\u0018\u00010&2\u0006\u00100\u001a\u00020\u0012H\u0016J\u0012\u00102\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00104\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u00105\u001a\u00020 2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020\u000eH\u0016J\b\u0010:\u001a\u00020 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/StoryRecordController;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "Lcom/ss/android/ugc/aweme/shortvideo/recorder/IMediaConcatViewExtension;", "caller", "Landroid/support/v4/app/Fragment;", "recordModulesPresenter", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;", "extractorSupplier", "Lcom/google/common/base/Supplier;", "Lcom/ss/android/ugc/aweme/tools/extract/Extractor;", "(Landroid/support/v4/app/Fragment;Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/AVRecordModulesPresenter;Lcom/google/common/base/Supplier;)V", "context", "Landroid/content/Context;", "forceClear", "", "mCommitDialog", "Lcom/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog;", "mConcatCount", "", "mConcatFinishedCount", "mVideoConcatTime", "", "recordStateLiveData", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordStateWrapper;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "storyRecordViewModel", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordViewModel;", "buildShootWayExtra", "Lorg/json/JSONObject;", "concatVideo", "", "deleteLastSegment", "endRecord", "forceClearRecord", "generateReverseVideoFile", "videoPath", "", "intent", "Landroid/content/Intent;", "getRecordState", "Landroid/arch/lifecycle/LiveData;", "markRecordIdle", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "onConcatFailed", "audioPath", "statusCode", "onConcatFinished", "setMusic", "musicPath", "startEditPage", "startRecord", "recordingSpeed", "Lcom/ss/android/ugc/aweme/tools/RecordingSpeed;", "stopRecord", "isForce", "updateRecordProgress", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class k implements com.ss.android.ugc.aweme.shortvideo.j.c, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73905a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.view.d f73906b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f73907c = this.k.getContext();

    /* renamed from: d  reason: collision with root package name */
    private long f73908d;

    /* renamed from: e  reason: collision with root package name */
    private int f73909e;

    /* renamed from: f  reason: collision with root package name */
    private int f73910f;
    private final ShortVideoContextViewModel g;
    private final StoryRecordViewModel h;
    private final MutableLiveData<g> i;
    private boolean j;
    private final Fragment k;
    private final a l;
    private final s<com.ss.android.ugc.aweme.tools.extract.e> m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f73912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73913c;

        a(p pVar, String str) {
            this.f73912b = pVar;
            this.f73913c = str;
        }

        public final /* synthetic */ Object call() {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f73911a, false, 85891, new Class[0], Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f73911a, false, 85891, new Class[0], Integer.TYPE)).intValue();
            } else {
                i = this.f73912b.a(new String[]{this.f73913c}, (String[]) null, (String[]) null, p.i.VIDEO_OUT_RATIO_ORIGINAL);
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f73915b;

        b(p pVar) {
            this.f73915b = pVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            int i;
            Integer num;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f73914a, false, 85892, new Class[]{i.class}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{iVar}, this, f73914a, false, 85892, new Class[]{i.class}, Integer.TYPE)).intValue();
            } else {
                if (iVar != null) {
                    num = (Integer) iVar.e();
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    this.f73915b.c(0);
                    i = this.f73915b.m();
                } else {
                    if (iVar != null) {
                        Integer num2 = (Integer) iVar.e();
                        if (num2 != null) {
                            i = num2.intValue();
                        }
                    }
                    i = -1;
                }
            }
            return Integer.valueOf(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements g<Integer, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73916a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f73917b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73918c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f73919d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Intent f73920e;

        c(k kVar, String str, p pVar, Intent intent) {
            this.f73917b = kVar;
            this.f73918c = str;
            this.f73919d = pVar;
            this.f73920e = intent;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f73916a, false, 85893, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f73916a, false, 85893, new Class[]{i.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f73917b.f73906b;
                if (dVar != null) {
                    dVar.dismiss();
                }
                Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                Integer num = (Integer) iVar.e();
                if (num != null && num.intValue() == 0) {
                    gi giVar = new gi();
                    giVar.setOriginVideoPath(this.f73918c);
                    giVar.setReverseVideoPath(this.f73919d.n()[0]);
                    giVar.setSingleDuration(this.f73919d.t());
                    giVar.setTotalDuration(giVar.getSingleDuration() * giVar.getReplayTime() * 2);
                    this.f73920e.putExtra("story_boom_model", giVar);
                }
                this.f73919d.k();
                this.f73917b.a(this.f73920e);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onFinish"}, k = 3, mv = {1, 1, 15})
    static final class d implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f73921a = new d();

        d() {
        }

        public final void a(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<Integer, Unit> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        public final void invoke(Integer num) {
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Integer) obj);
            return Unit.INSTANCE;
        }
    }

    public final void e() {
        this.j = true;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73905a, false, 85881, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73905a, false, 85881, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        MediaRecordPresenter l2 = this.l.l();
        com.ss.android.ugc.aweme.shortvideo.filter.d o = this.l.o();
        fh fhVar = this.g.f65401b;
        if (!this.g.f()) {
            this.g.d(true);
            ((com.ss.android.ugc.aweme.tools.extract.e) this.m.get()).a(false);
            l2.g();
            this.g.a(0);
            long e2 = l2.e() / 1000;
            if (e2 >= 0) {
                fhVar.n += fhVar.m.end(e2);
            }
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
            h e3 = eVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "filterBean");
            if (e3.f47600d != null) {
                fhVar.O.addIndex();
            }
            fhVar.P.addIndex();
            if (0 <= e2 && 10 >= e2) {
                b();
            }
            if (!com.ss.android.g.a.b()) {
                az azVar = fhVar.Q;
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar2 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar2, "filterModule.filterFunc");
                azVar.add(Integer.toString(eVar2.k()));
                az azVar2 = fhVar.T;
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar3 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar3, "filterModule.filterFunc");
                azVar2.add(Integer.toString(eVar3.d()));
                az azVar3 = fhVar.S;
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar4 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar4, "filterModule.filterFunc");
                azVar3.add(Integer.toString(eVar4.j()));
                az azVar4 = fhVar.R;
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar5 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar5, "filterModule.filterFunc");
                azVar4.add(Integer.toString(eVar5.i()));
            } else {
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar6 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar6, "filterModule.filterFunc");
                fhVar.Q.add(Integer.toString((int) (f.a(eVar6.k()) * 100.0f)));
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar7 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar7, "filterModule.filterFunc");
                int b2 = (int) (f.b(eVar7.i()) * 100.0f);
                fhVar.R.add(Integer.toString(b2));
                fhVar.S.add(Integer.toString(b2));
                az azVar5 = fhVar.T;
                com.ss.android.ugc.aweme.shortvideo.filter.e eVar8 = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
                Intrinsics.checkExpressionValueIsNotNull(eVar8, "filterModule.filterFunc");
                azVar5.add(Integer.toString(eVar8.d()));
            }
            this.i.setValue(new g(f.STOP_RECORD, !z));
        }
    }

    @NotNull
    public final LiveData<g> c() {
        return this.i;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f73905a, false, 85884, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73905a, false, 85884, new Class[0], Void.TYPE);
            return;
        }
        this.i.setValue(new g(f.RECORD_IDLE, true));
    }

    @NotNull
    public final MediaRecordPresenter g() {
        if (!PatchProxy.isSupport(new Object[0], this, f73905a, false, 85878, new Class[0], MediaRecordPresenter.class)) {
            return this.l.l();
        }
        return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[0], this, f73905a, false, 85878, new Class[0], MediaRecordPresenter.class);
    }

    private final JSONObject f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f73905a, false, 85888, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f73905a, false, 85888, new Class[0], JSONObject.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("shoot_way", this.g.f65401b.r).a("route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        if (this.g.c()) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        JSONObject b2 = a2.a("is_photo", str).a("position", "shoot_page").b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "builder.build()");
        return b2;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73905a, false, 85883, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73905a, false, 85883, new Class[0], Void.TYPE);
            return;
        }
        fh fhVar = this.g.f65401b;
        ft ftVar = fhVar.m;
        if (!ftVar.isEmpty()) {
            ftVar.removeLast();
            fhVar.n = (long) TimeSpeedModelExtension.calculateRealTime(fhVar.m);
            this.l.l().f();
            ((com.ss.android.ugc.aweme.tools.extract.e) this.m.get()).c();
            fhVar.O.removeLastArray();
            fhVar.P.removeLastArray();
            fhVar.Q.removeLast();
            fhVar.R.removeLast();
            fhVar.T.removeLast();
            fhVar.S.removeLast();
            if (fhVar.E != null) {
                fhVar.E.removeReactionWindowInfo();
            }
        }
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f73905a, false, 85882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73905a, false, 85882, new Class[0], Void.TYPE);
        } else if (!this.g.g()) {
            this.g.e(true);
            Context context = this.f73907c;
            Context context2 = this.f73907c;
            if (context2 != null) {
                str = context2.getString(C0906R.string.c83);
            } else {
                str = null;
            }
            this.f73906b = com.ss.android.ugc.aweme.shortvideo.view.d.b(context, str);
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f73906b;
            if (dVar != null) {
                dVar.setIndeterminate(true);
            }
            if (!com.ss.android.ugc.aweme.app.a.a.a(this.f73907c)) {
                v.a((Dialog) this.f73906b);
            }
            com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
            MobClick jsonObject = MobClick.obtain().setEventName("finish").setLabelName("shoot_page").setJsonObject(f());
            Intrinsics.checkExpressionValueIsNotNull(jsonObject, "MobClick.obtain()\n      …ect(buildShootWayExtra())");
            aVar.onEvent(jsonObject);
            Context context3 = this.f73907c;
            if (context3 != null) {
                if (PatchProxy.isSupport(new Object[]{context3}, this, f73905a, false, 85885, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context3}, this, f73905a, false, 85885, new Class[]{Context.class}, Void.TYPE);
                } else if (this.j) {
                    com.ss.android.ugc.aweme.shortvideo.view.d dVar2 = this.f73906b;
                    if (dVar2 != null) {
                        dVar2.dismiss();
                    }
                    this.g.e(false);
                    this.h.a(true);
                    this.i.setValue(new g(f.CONCAT_FINISH, false));
                } else {
                    this.i.setValue(new g(f.START_CONCAT, true));
                    this.g.f(true);
                    this.f73908d = System.currentTimeMillis();
                    fh fhVar = this.g.f65401b;
                    e.c g2 = this.l.m().g();
                    com.ss.android.ugc.aweme.shortvideo.a.d dVar3 = fhVar.l;
                    Intrinsics.checkExpressionValueIsNotNull(dVar3, "shortVideoContext.mWorkspace");
                    File c2 = dVar3.c();
                    Intrinsics.checkExpressionValueIsNotNull(c2, "shortVideoContext.mWorkspace.concatVideoFile");
                    e.c a2 = g2.a(c2.getPath());
                    com.ss.android.ugc.aweme.shortvideo.a.d dVar4 = fhVar.l;
                    Intrinsics.checkExpressionValueIsNotNull(dVar4, "shortVideoContext.mWorkspace");
                    File d2 = dVar4.d();
                    Intrinsics.checkExpressionValueIsNotNull(d2, "shortVideoContext.mWorkspace.concatAudioFile");
                    e.c a3 = a2.b(d2.getPath()).a((y) new dmt.av.video.b.f(g()));
                    com.ss.android.ugc.aweme.shortvideo.a.d dVar5 = fhVar.l;
                    Intrinsics.checkExpressionValueIsNotNull(dVar5, "shortVideoContext.mWorkspace");
                    File c3 = dVar5.c();
                    Intrinsics.checkExpressionValueIsNotNull(c3, "shortVideoContext.mWorkspace.concatVideoFile");
                    a3.c(j.a(true, false, context3, c3.getPath(), Integer.valueOf((int) fhVar.n), Integer.valueOf(fhVar.j), Integer.valueOf(fhVar.k))).a((com.ss.android.ugc.aweme.shortvideo.j.c) this);
                }
            }
            this.f73909e++;
        }
    }

    public final void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f73905a, false, 85890, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f73905a, false, 85890, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        if (this.g.k()) {
            intent.putExtra("story_mediaType", 1);
            VideoStoryEditPublishActivity.a(this.k, intent, 4);
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).startVideoEditActivity(this.f73907c, intent, 1);
        }
        this.g.e(false);
        this.h.a(true);
    }

    public final void a(@NotNull am amVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{amVar}, this, f73905a, false, 85880, new Class[]{am.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{amVar}, this, f73905a, false, 85880, new Class[]{am.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(amVar, "recordingSpeed");
        this.j = false;
        MediaRecordPresenter l2 = this.l.l();
        StickerModule p = this.l.p();
        com.ss.android.ugc.aweme.shortvideo.filter.d o = this.l.o();
        fh fhVar = this.g.f65401b;
        if (!l2.h() && fhVar != null) {
            ((com.ss.android.ugc.aweme.tools.extract.e) this.m.get()).a((e.a) d.f73921a);
            au auVar = new au(amVar);
            l2.b(f.g());
            this.i.setValue(new g(f.START_RECORD, true));
            y fVar = new dmt.av.video.b.f(l2);
            if (fhVar.o != 1) {
                z = false;
            }
            o.a(fVar, z, auVar.f74633b, e.INSTANCE);
            fhVar.m.begin(auVar.f74633b, p.g, p.x);
            this.g.d(false);
            fhVar.d().setContentSource("shoot");
            fhVar.d().setContentType("video");
            com.ss.android.ugc.aweme.shortvideo.filter.e eVar = (com.ss.android.ugc.aweme.shortvideo.filter.e) o.c();
            Intrinsics.checkExpressionValueIsNotNull(eVar, "filterModule.filterFunc");
            h e2 = eVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "filterBean");
            String str = e2.f47599c;
            String valueOf = String.valueOf(e2.f47598b);
            if (str != null) {
                fhVar.O.add(str);
            }
            fhVar.P.add(valueOf);
        }
    }

    public final void a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73905a, false, 85879, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73905a, false, 85879, new Class[]{String.class}, Void.TYPE);
            return;
        }
        MediaRecordPresenter l2 = this.l.l();
        com.ss.android.ugc.aweme.shortvideo.record.a s = this.l.s();
        fh fhVar = this.g.f65401b;
        if (str != null) {
            Intrinsics.checkExpressionValueIsNotNull(fhVar, "shortVideoContext");
            boolean a2 = fhVar.a();
            fhVar.l.a(new File(str));
            l2.g(true);
            l2.a(str);
            l2.a(0, 0);
            l2.d(1);
            if (!a2) {
                l2.c(this.f73907c, 5, s.a());
            }
        } else {
            l2.a((String) null);
            l2.d(0);
            l2.h(true);
            l2.g(false);
        }
    }

    public k(@NotNull Fragment fragment, @NotNull a aVar, @NotNull s<com.ss.android.ugc.aweme.tools.extract.e> sVar) {
        Intrinsics.checkParameterIsNotNull(fragment, "caller");
        Intrinsics.checkParameterIsNotNull(aVar, "recordModulesPresenter");
        Intrinsics.checkParameterIsNotNull(sVar, "extractorSupplier");
        this.k = fragment;
        this.l = aVar;
        this.m = sVar;
        FragmentActivity activity = this.k.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ca…extViewModel::class.java]");
        this.g = (ShortVideoContextViewModel) viewModel;
        FragmentActivity activity2 = this.k.getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel2 = ViewModelProviders.of(activity2).get(StoryRecordViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(ca…ordViewModel::class.java]");
        this.h = (StoryRecordViewModel) viewModel2;
        this.i = new MutableLiveData<>();
    }

    public final void a(@Nullable String str, @Nullable String str2, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        String str3;
        String str4 = str;
        String str5 = str2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i2)}, this, f73905a, false, 85886, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i2)}, this, f73905a, false, 85886, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (this.j) {
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f73906b;
            if (dVar != null) {
                dVar.dismiss();
            }
            this.g.e(false);
            this.h.a(true);
            this.g.f(false);
            this.i.setValue(new g(f.CONCAT_FINISH, false));
        } else {
            this.g.f(false);
            ShortVideoContextViewModel shortVideoContextViewModel = this.g;
            fh fhVar = shortVideoContextViewModel.f65401b;
            this.f73910f++;
            if (i3 >= 0) {
                n.a("aweme_concat_success_rate", 0, (JSONObject) null);
                this.i.setValue(new g(f.CONCAT_FINISH, true));
                Object obj = this.m.get();
                Intrinsics.checkExpressionValueIsNotNull(obj, "extractorSupplier.get()");
                fhVar.Y = ((com.ss.android.ugc.aweme.tools.extract.e) obj).e();
                com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                Context context = this.f73907c;
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                aVar.a(context, "pv_video_edit", "take_video", 0, 0, f());
                GoNextFactoryFactory.a(this.f73907c, fhVar);
                Intent a2 = GoNextFactoryFactory.a(shortVideoContextViewModel, this.l.n().h());
                n.b("aweme_movie_publish", "aweme_concat_time", (float) (System.currentTimeMillis() - this.f73908d));
                if (shortVideoContextViewModel.d() == 6) {
                    if (str4 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(a2, "intent");
                    if (PatchProxy.isSupport(new Object[]{str4, a2}, this, f73905a, false, 85889, new Class[]{String.class, Intent.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str4, a2}, this, f73905a, false, 85889, new Class[]{String.class, Intent.class}, Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
                        p pVar = new p(com.ss.android.ugc.aweme.shortvideo.a.d.a(str));
                        i.a((Callable<TResult>) new a<TResult>(pVar, str4)).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(pVar)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this, str4, pVar, a2), i.f1052b);
                    }
                } else {
                    com.ss.android.ugc.aweme.shortvideo.view.d dVar2 = this.f73906b;
                    if (dVar2 != null) {
                        dVar2.dismiss();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(a2, "intent");
                    a(a2);
                }
                d();
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.view.d dVar3 = this.f73906b;
            if (dVar3 != null) {
                dVar3.dismiss();
            }
            if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i2)}, this, f73905a, false, 85887, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i2)}, this, f73905a, false, 85887, new Class[]{String.class, String.class, Integer.TYPE}, Void.TYPE);
                z = false;
            } else {
                ShortVideoContextViewModel shortVideoContextViewModel2 = this.g;
                fh fhVar2 = shortVideoContextViewModel2.f65401b;
                if (str4 != null) {
                    z2 = new File(str4).exists();
                } else {
                    z2 = false;
                }
                if (str5 != null) {
                    z3 = new File(str5).exists();
                } else {
                    z3 = false;
                }
                StringBuilder sb = new StringBuilder();
                com.ss.android.ugc.aweme.shortvideo.a.d dVar4 = shortVideoContextViewModel2.f65401b.l;
                Intrinsics.checkExpressionValueIsNotNull(dVar4, "shortVideoContextViewMod…rtVideoContext.mWorkspace");
                sb.append(dVar4.g());
                sb.append("1_frag_v");
                File file = new File(sb.toString());
                n.a("aweme_concat_success_rate", 1, com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", Integer.valueOf(i2)).a("videoPath", str4).a("audioPath", str5).a("videoFileExists", String.valueOf(z2)).a("audioFileExists", String.valueOf(z3)).a("firstSegmentPath", String.valueOf(file.exists())).a("firstSegmentLength", String.valueOf(file.length())).a("hardEncode", String.valueOf(fhVar2.o)).b());
                Context context2 = this.f73907c;
                if (context2 != null) {
                    str3 = context2.getString(C0906R.string.a0u, new Object[]{Integer.valueOf(i2)});
                } else {
                    str3 = null;
                }
                if (i3 == -10021 || i3 == -2000) {
                    Context context3 = this.f73907c;
                    if (context3 != null) {
                        str3 = context3.getString(C0906R.string.a63);
                    } else {
                        str3 = null;
                    }
                }
                com.bytedance.ies.dmt.ui.d.a.b(this.f73907c, str3).a();
                z = false;
                shortVideoContextViewModel2.e(false);
                this.h.a(true);
            }
            this.i.setValue(new g(f.CONCAT_FINISH, z));
        }
    }
}
