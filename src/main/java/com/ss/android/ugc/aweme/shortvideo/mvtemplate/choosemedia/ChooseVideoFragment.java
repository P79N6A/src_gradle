package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.mediachoose.w;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPreviewActivity;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 M2\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0002J&\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020'0,H\u0002J\u000e\u0010-\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020'H\u0002J\b\u00103\u001a\u00020'H\u0002J8\u00104\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u000201H\u0002J\u0012\u0010:\u001a\u00020'2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J&\u0010=\u001a\u0004\u0018\u00010\u001a2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0016\u0010B\u001a\u00020'2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010DJ0\u0010F\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u00105\u001a\u0002012\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u000201H\u0002J\u000e\u0010G\u001a\u00020'2\u0006\u0010H\u001a\u00020\u000fJ\u000e\u0010I\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010J\u001a\u00020'2\u0006\u0010K\u001a\u00020\rJ\u000e\u0010L\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ChooseVideoFragment;", "Lcom/ss/android/ugc/aweme/base/fragment/AmeBaseFragment;", "()V", "clickSelectListener", "Landroid/view/View$OnClickListener;", "imageGridView", "Landroid/support/v7/widget/RecyclerView;", "isMultiEnable", "", "isPreviewing", "loadingDialog", "Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;", "mMultiModeChangeCallback", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MvChoosePhotoActivity$MultiModeChangeCallback;", "maxSelectCount", "", "mediaAdapter", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MvImageChooseAdapter;", "minDuration", "", "multiIconSelect", "Landroid/widget/ImageView;", "multiIconUnSelect", "multiTvDes", "Landroid/widget/TextView;", "multiView", "Landroid/view/View;", "noVideoHintTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "onVideoChooseListener", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MvImageChooseAdapter$OnImageChooseListener;", "rootView", "videoLegalChecker", "Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;", "getVideoLegalChecker", "()Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;", "videoLegalChecker$delegate", "Lkotlin/Lazy;", "checkVideo", "", "isForPreview", "mediaModel", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "onSuccess", "Lkotlin/Function0;", "enableMultiVideo", "goPreviewVideoActivity", "view", "path", "", "initData", "initView", "monitorDuration", "checkerType", "status", "errorCode", "costTime", "scene", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "refreshDataList", "mediaModelList", "", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/MvImageChooseAdapter$MyMediaModel;", "resolveImportError", "setMaxSelectCount", "count", "setMinDuration", "setMultiVideoClickCallback", "callback", "setOnVideoChooseListener", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChooseVideoFragment extends AmeBaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68508a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f68509b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ChooseVideoFragment.class), "videoLegalChecker", "getVideoLegalChecker()Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;"))};
    public static final a o = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public MvImageChooseAdapter f68510c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f68511d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f68512e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f68513f;
    DmtTextView g;
    DmtLoadingLayout h;
    public MvChoosePhotoActivity.a i;
    public MvImageChooseAdapter.c j;
    public int k = 12;
    public boolean l = true;
    public boolean m;
    public long n = ff.a();
    private View p;
    private RecyclerView q;
    private View r;
    private final Lazy s = LazyKt.lazy(new f(this));
    private final View.OnClickListener t = new d(this);
    private HashMap u;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/ChooseVideoFragment$Companion;", "", "()V", "NUM_COLUMNS", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "checkerType", "", "costTime", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<String, Long, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.music.b.a.a $mediaModel;
        final /* synthetic */ Function0 $onSuccess;
        final /* synthetic */ String $scene;
        final /* synthetic */ ChooseVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChooseVideoFragment chooseVideoFragment, com.ss.android.ugc.aweme.music.b.a.a aVar, String str, Function0 function0) {
            super(2);
            this.this$0 = chooseVideoFragment;
            this.$mediaModel = aVar;
            this.$scene = str;
            this.$onSuccess = function0;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, ((Number) obj2).longValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 77923, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, changeQuickRedirect, false, 77923, new Class[]{String.class, Long.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "checkerType");
            n.a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            this.this$0.a(this.$mediaModel, str, 0, 0, j, this.$scene);
            if (this.this$0.getActivity() == null || !this.this$0.isViewValid()) {
                this.this$0.m = false;
            } else {
                this.$onSuccess.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "checkerType", "", "costTime", "", "errorCode", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function3<String, Long, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.music.b.a.a $mediaModel;
        final /* synthetic */ String $scene;
        final /* synthetic */ ChooseVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChooseVideoFragment chooseVideoFragment, com.ss.android.ugc.aweme.music.b.a.a aVar, String str) {
            super(3);
            this.this$0 = chooseVideoFragment;
            this.$mediaModel = aVar;
            this.$scene = str;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str, long j, int i) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 77924, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 77924, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "checkerType");
            this.this$0.m = false;
            ChooseVideoFragment chooseVideoFragment = this.this$0;
            com.ss.android.ugc.aweme.music.b.a.a aVar = this.$mediaModel;
            String str3 = this.$scene;
            if (PatchProxy.isSupport(new Object[]{aVar, str2, Integer.valueOf(i), new Long(j2), str3}, chooseVideoFragment, ChooseVideoFragment.f68508a, false, 77919, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
                Object[] objArr = {aVar, str2, Integer.valueOf(i), new Long(j2), str3};
                Object[] objArr2 = objArr;
                ChooseVideoFragment chooseVideoFragment2 = chooseVideoFragment;
                PatchProxy.accessDispatch(objArr2, chooseVideoFragment2, ChooseVideoFragment.f68508a, false, 77919, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, String.class, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            } else if (chooseVideoFragment.getActivity() != null && chooseVideoFragment.isViewValid()) {
                d.a(chooseVideoFragment.getActivity(), i, (int) (chooseVideoFragment.n / 1000));
                n.a("aweme_movie_import_error_rate", 1, com.ss.android.ugc.aweme.app.d.c.a().a("errorCode", String.valueOf(i)).b());
                chooseVideoFragment.a(aVar, str, 1, i, j, str3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseVideoFragment f68515b;

        d(ChooseVideoFragment chooseVideoFragment) {
            this.f68515b = chooseVideoFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68514a, false, 77925, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68514a, false, 77925, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ChooseVideoFragment.a(this.f68515b).a(!ChooseVideoFragment.a(this.f68515b).h);
            if (ChooseVideoFragment.a(this.f68515b).h) {
                ChooseVideoFragment.b(this.f68515b).setVisibility(8);
                ChooseVideoFragment.c(this.f68515b).setVisibility(0);
                ChooseVideoFragment.d(this.f68515b).setVisibility(8);
                this.f68515b.a().a("enter_from_multi");
                MvChoosePhotoActivity.a aVar = this.f68515b.i;
                if (aVar != null) {
                    aVar.a(true);
                }
            } else {
                ChooseVideoFragment.b(this.f68515b).setVisibility(0);
                ChooseVideoFragment.c(this.f68515b).setVisibility(8);
                ChooseVideoFragment.d(this.f68515b).setVisibility(0);
                this.f68515b.a().a("enter_from_single");
                MvChoosePhotoActivity.a aVar2 = this.f68515b.i;
                if (aVar2 != null) {
                    aVar2.a(false);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "item", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "onItemClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements MvImageChooseAdapter.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseVideoFragment f68517b;

        e(ChooseVideoFragment chooseVideoFragment) {
            this.f68517b = chooseVideoFragment;
        }

        public final void a(final View view, final com.ss.android.ugc.aweme.music.b.a.a aVar) {
            if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f68516a, false, 77926, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f68516a, false, 77926, new Class[]{View.class, com.ss.android.ugc.aweme.music.b.a.a.class}, Void.TYPE);
            } else if (aVar != null) {
                if (!ChooseVideoFragment.a(this.f68517b).h) {
                    this.f68517b.a(false, aVar, new Function0<Unit>(this) {
                        public static ChangeQuickRedirect changeQuickRedirect;
                        final /* synthetic */ e this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void invoke() {
                            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77928, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77928, new Class[0], Void.TYPE);
                                return;
                            }
                            MvImageChooseAdapter.c cVar = this.this$0.f68517b.j;
                            if (cVar != null) {
                                cVar.a(aVar);
                            }
                        }
                    });
                } else if (!this.f68517b.m) {
                    this.f68517b.m = true;
                    this.f68517b.a(true, aVar, new Function0<Unit>(this) {
                        public static ChangeQuickRedirect changeQuickRedirect;
                        final /* synthetic */ e this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void invoke() {
                            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77927, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77927, new Class[0], Void.TYPE);
                                return;
                            }
                            ChooseVideoFragment chooseVideoFragment = this.this$0.f68517b;
                            View view = view;
                            Intrinsics.checkExpressionValueIsNotNull(view, NotifyType.VIBRATE);
                            String str = aVar.f56315e;
                            Intrinsics.checkExpressionValueIsNotNull(str, "item.filePath");
                            if (PatchProxy.isSupport(new Object[]{view, str}, chooseVideoFragment, ChooseVideoFragment.f68508a, false, 77917, new Class[]{View.class, String.class}, Void.TYPE)) {
                                ChooseVideoFragment chooseVideoFragment2 = chooseVideoFragment;
                                PatchProxy.accessDispatch(new Object[]{view, str}, chooseVideoFragment2, ChooseVideoFragment.f68508a, false, 77917, new Class[]{View.class, String.class}, Void.TYPE);
                                return;
                            }
                            VideoPreviewActivity.a(chooseVideoFragment.getActivity(), view, str, (((float) UIUtils.getScreenWidth(chooseVideoFragment.getContext())) * 1.0f) / ((float) UIUtils.getScreenHeight(chooseVideoFragment.getContext())));
                            chooseVideoFragment.m = false;
                        }
                    });
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<w> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ChooseVideoFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChooseVideoFragment chooseVideoFragment) {
            super(0);
            this.this$0 = chooseVideoFragment;
        }

        @NotNull
        public final w invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77929, new Class[0], w.class)) {
                return (w) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77929, new Class[0], w.class);
            } else if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoLegalCheckInLocal)) {
                FragmentActivity activity = this.this$0.getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                return new com.ss.android.ugc.aweme.mediachoose.d(activity);
            } else {
                FragmentActivity activity2 = this.this$0.getActivity();
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity2, "activity!!");
                return new com.ss.android.ugc.aweme.mediachoose.a(activity2);
            }
        }
    }

    public final w a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f68508a, false, 77909, new Class[0], w.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f68508a, false, 77909, new Class[0], w.class);
        } else {
            value = this.s.getValue();
        }
        return (w) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f68508a, false, 77922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68508a, false, 77922, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null) {
            this.u.clear();
        }
    }

    public static final /* synthetic */ MvImageChooseAdapter a(ChooseVideoFragment chooseVideoFragment) {
        MvImageChooseAdapter mvImageChooseAdapter = chooseVideoFragment.f68510c;
        if (mvImageChooseAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        return mvImageChooseAdapter;
    }

    public static final /* synthetic */ ImageView b(ChooseVideoFragment chooseVideoFragment) {
        ImageView imageView = chooseVideoFragment.f68512e;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiIconUnSelect");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView c(ChooseVideoFragment chooseVideoFragment) {
        ImageView imageView = chooseVideoFragment.f68511d;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiIconSelect");
        }
        return imageView;
    }

    public static final /* synthetic */ TextView d(ChooseVideoFragment chooseVideoFragment) {
        TextView textView = chooseVideoFragment.f68513f;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("multiTvDes");
        }
        return textView;
    }

    public final void onActivityCreated(@Nullable Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f68508a, false, 77911, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f68508a, false, 77911, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f68508a, false, 77913, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68508a, false, 77913, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridView");
        }
        recyclerView.setLayoutManager(new WrapGridLayoutManager(getActivity(), 4));
        RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridView");
        }
        recyclerView2.addItemDecoration(new GridSpacingItemDecoration(4, (int) UIUtils.dip2Px(getContext(), 1.0f), false));
        MvImageChooseAdapter mvImageChooseAdapter = new MvImageChooseAdapter(getContext(), 4, 1.0d, 1.5f, 0, 1);
        this.f68510c = mvImageChooseAdapter;
        MvImageChooseAdapter mvImageChooseAdapter2 = this.f68510c;
        if (mvImageChooseAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        mvImageChooseAdapter2.a(false);
        MvImageChooseAdapter mvImageChooseAdapter3 = this.f68510c;
        if (mvImageChooseAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        mvImageChooseAdapter3.i = true;
        MvImageChooseAdapter mvImageChooseAdapter4 = this.f68510c;
        if (mvImageChooseAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        mvImageChooseAdapter4.g = this.j;
        MvImageChooseAdapter mvImageChooseAdapter5 = this.f68510c;
        if (mvImageChooseAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        mvImageChooseAdapter5.f68570f = new e(this);
        RecyclerView recyclerView3 = this.q;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageGridView");
        }
        MvImageChooseAdapter mvImageChooseAdapter6 = this.f68510c;
        if (mvImageChooseAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        recyclerView3.setAdapter(mvImageChooseAdapter6);
        MvImageChooseAdapter mvImageChooseAdapter7 = this.f68510c;
        if (mvImageChooseAdapter7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        mvImageChooseAdapter7.f68566b = this.k;
        MvImageChooseAdapter mvImageChooseAdapter8 = this.f68510c;
        if (mvImageChooseAdapter8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaAdapter");
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            str = activity.getString(C0906R.string.ss);
        } else {
            str = null;
        }
        mvImageChooseAdapter8.f68567c = str;
        DmtLoadingLayout dmtLoadingLayout = this.h;
        if (dmtLoadingLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingDialog");
        }
        dmtLoadingLayout.setVisibility(0);
    }

    public final void a(boolean z, com.ss.android.ugc.aweme.music.b.a.a aVar, Function0<Unit> function0) {
        String str;
        long j2;
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aVar2, function02}, this, f68508a, false, 77918, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aVar2, function02}, this, f68508a, false, 77918, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.music.b.a.a.class, Function0.class}, Void.TYPE);
            return;
        }
        if (z) {
            str = "preview";
        } else {
            str = "select";
        }
        if (z) {
            j2 = 0;
        } else {
            j2 = this.n;
        }
        a().a(aVar, j2, -1, new b(this, aVar2, str, function02), new c(this, aVar2, str));
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68508a, false, 77910, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f68508a, false, 77910, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.apt, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…agment, container, false)");
        this.p = inflate;
        if (PatchProxy.isSupport(new Object[0], this, f68508a, false, 77912, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68508a, false, 77912, new Class[0], Void.TYPE);
        } else {
            View view = this.p;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById = view.findViewById(C0906R.id.alh);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.grid)");
            this.q = (RecyclerView) findViewById;
            View view2 = this.p;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById2 = view2.findViewById(C0906R.id.qs);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById<View>(R.id.card_view_multi)");
            this.r = findViewById2;
            View view3 = this.p;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById3 = view3.findViewById(C0906R.id.b3c);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.iv_multi_select)");
            this.f68511d = (ImageView) findViewById3;
            View view4 = this.p;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById4 = view4.findViewById(C0906R.id.b3d);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.iv_multi_unselect)");
            this.f68512e = (ImageView) findViewById4;
            View view5 = this.p;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById5 = view5.findViewById(C0906R.id.dew);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById<TextView>(R.id.tv_multi_des)");
            this.f68513f = (TextView) findViewById5;
            View view6 = this.p;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById6 = view6.findViewById(C0906R.id.dcr);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById<DmtTextView>(R.id.tv_hint)");
            this.g = (DmtTextView) findViewById6;
            View view7 = this.p;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            View findViewById7 = view7.findViewById(C0906R.id.dsb);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.video_loading)");
            this.h = (DmtLoadingLayout) findViewById7;
            View view8 = this.r;
            if (view8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiView");
            }
            if (!this.l) {
                i2 = 8;
            }
            view8.setVisibility(i2);
            ImageView imageView = this.f68511d;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiIconSelect");
            }
            imageView.setOnClickListener(this.t);
            ImageView imageView2 = this.f68512e;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiIconUnSelect");
            }
            imageView2.setOnClickListener(this.t);
            TextView textView = this.f68513f;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("multiTvDes");
            }
            textView.setOnClickListener(this.t);
        }
        View view9 = this.p;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view9;
    }

    public final void a(com.ss.android.ugc.aweme.music.b.a.a aVar, String str, int i2, int i3, long j2, String str2) {
        com.ss.android.ugc.aweme.music.b.a.a aVar2 = aVar;
        String str3 = str;
        long j3 = j2;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aVar2, str3, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j3), str4}, this, f68508a, false, 77920, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, String.class, Integer.TYPE, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str3, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j3), str4}, this, f68508a, false, 77920, new Class[]{com.ss.android.ugc.aweme.music.b.a.a.class, String.class, Integer.TYPE, Integer.TYPE, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j3);
            n.a("aweme_video_import_duration", jSONObject, com.ss.android.ugc.aweme.app.d.c.a().a("status", String.valueOf(i2)).a("scene_name", str4).a("errorCode", Integer.valueOf(i3)).a("type", str3).a("width", Integer.valueOf(aVar2.l)).a("height", Integer.valueOf(aVar2.m)).b());
        } catch (JSONException unused) {
        }
    }
}
