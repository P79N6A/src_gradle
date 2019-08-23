package com.ss.android.ugc.aweme.shortvideo.publish;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.dk;
import com.ss.android.ugc.aweme.shortvideo.dl;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.ei;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.fl;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.aweme.utils.ax;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 [2\u00020\u0001:\u0002[\\B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u0018\u0010A\u001a\u00020\u001e2\u0006\u0010>\u001a\u00020B2\b\b\u0001\u0010C\u001a\u00020-J\u000e\u0010D\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u0010\u0010E\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0002J\u000e\u0010F\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\u000e\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020IJ\u000e\u0010J\u001a\u00020=2\u0006\u0010>\u001a\u00020?J\b\u0010K\u001a\u00020-H\u0007J\b\u0010L\u001a\u00020-H\u0007J \u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020-2\b\u0010P\u001a\u0004\u0018\u00010QJ\u0006\u0010R\u001a\u00020=J\u000e\u0010S\u001a\u00020=2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020=2\u0006\u0010W\u001a\u00020UJ\b\u0010X\u001a\u00020=H\u0002J\f\u0010Y\u001a\u00020-*\u00020ZH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u00020\n8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR:\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u0011\u0010&\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\fR \u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u0011\u00104\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b5\u0010\fR\u0010\u00106\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\u00020\n8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u0011\u0010:\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b;\u0010\f¨\u0006]"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement;", "", "fragment", "Landroid/support/v4/app/Fragment;", "model", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Landroid/support/v4/app/Fragment;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "commentItem", "Lcom/bytedance/ies/dmt/ui/widget/setting/SettingItemSwitch;", "commentItemChecked", "", "getCommentItemChecked", "()Z", "setCommentItemChecked", "(Z)V", "commentMobData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getCommentMobData", "()Ljava/util/HashMap;", "setCommentMobData", "(Ljava/util/HashMap;)V", "currentScheme", "Lcom/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$Scheme;", "getCurrentScheme", "()Lcom/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$Scheme;", "enableQuietlySynthetic", "getEnableQuietlySynthetic", "friendsView", "Landroid/view/View;", "getFriendsView", "()Landroid/view/View;", "setFriendsView", "(Landroid/view/View;)V", "hashTagView", "getHashTagView", "setHashTagView", "isSaveLocalEnabled", "needAdjustSyncTitle", "getNeedAdjustSyncTitle", "needUpdatePoi", "getNeedUpdatePoi", "permission", "Landroid/arch/lifecycle/MutableLiveData;", "", "getPermission", "()Landroid/arch/lifecycle/MutableLiveData;", "setPermission", "(Landroid/arch/lifecycle/MutableLiveData;)V", "permissionModule", "Lcom/ss/android/ugc/aweme/shortvideo/PermissionModule;", "preventDownload", "getPreventDownload", "reactDuetItem", "reactDuetItemChecked", "getReactDuetItemChecked", "setReactDuetItemChecked", "showPOISettingItem", "getShowPOISettingItem", "createAdvanceSettingItem", "", "parent", "Landroid/widget/LinearLayout;", "createCommentSettingItem", "createDraftPublishContainer", "Landroid/widget/RelativeLayout;", "anchorBelow", "createPermissionItem", "createReactDuetSettingItem", "createSettingItem", "createSyncViewContainer", "context", "Landroid/content/Context;", "createTitleLayoutExtra", "getPublishBtnText", "getPublishTitle", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onEnterChildrenMode", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "restoreSavedInstanceState", "savedInstanceState", "saveLocal", "toPixel", "", "Companion", "Scheme", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68873a = null;
    @NotNull
    public static final String m = m;
    public static final int n = 1;
    public static final a o = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public MutableLiveData<Integer> f68874b = new MutableLiveData<>();

    /* renamed from: c  reason: collision with root package name */
    public dl f68875c;

    /* renamed from: d  reason: collision with root package name */
    public SettingItemSwitch f68876d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f68877e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, String> f68878f;
    public SettingItemSwitch g;
    public boolean h;
    @NotNull
    public View i;
    @Nullable
    public View j;
    public final Fragment k;
    public final cb l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\t8\u0006XD¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$Companion;", "", "()V", "REQUEST_CODE_ADVANCE_SETTING", "", "REQUEST_CODE_ADVANCE_SETTING$annotations", "getREQUEST_CODE_ADVANCE_SETTING", "()I", "TAG", "", "TAG$annotations", "getTAG", "()Ljava/lang/String;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$Scheme;", "", "(Ljava/lang/String;I)V", "Normal", "EnhanceNone", "EnhanceDownload", "EnhancePrivacy", "EnhanceDownloadPrivacy", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum b {
        Normal,
        EnhanceNone,
        EnhanceDownload,
        EnhancePrivacy,
        EnhanceDownloadPrivacy;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$createAdvanceSettingItem$settingItem$1$1"}, k = 3, mv = {1, 1, 15})
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68880b;

        public c(e eVar) {
            this.f68880b = eVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68879a, false, 78257, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68879a, false, 78257, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Fragment fragment = this.f68880b.k;
            Intent intent = new Intent(this.f68880b.k.getContext(), AdvanceSettingActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("model", this.f68880b.l);
            bundle.putBoolean("comment_item_checked", this.f68880b.a());
            bundle.putBoolean("react_duet_item_checked", this.f68880b.b());
            bundle.putSerializable("mob_data", this.f68880b.f68878f);
            intent.putExtras(bundle);
            fragment.startActivityForResult(intent, e.n);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$createDraftPublishContainer$3$1"}, k = 3, mv = {1, 1, 15})
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68882b;

        public d(e eVar) {
            this.f68882b = eVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68881a, false, 78258, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68881a, false, 78258, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.bytedance.ies.dmt.ui.d.a.a(this.f68882b.k.getContext(), (int) C0906R.string.c1i, 0).a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.e$e  reason: collision with other inner class name */
    public static final class C0724e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f68885c;

        public C0724e(e eVar, View view) {
            this.f68884b = eVar;
            this.f68885c = view;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68883a, false, 78259, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68883a, false, 78259, new Class[0], Void.TYPE);
                return;
            }
            FragmentActivity activity = this.f68884b.k.getActivity();
            if (activity != null) {
                b.a b2 = new b.a(activity).b((int) C0906R.string.c1h);
                FragmentActivity activity2 = this.f68884b.k.getActivity();
                if (activity2 != null) {
                    b2.c(activity2.getResources().getColor(C0906R.color.aik)).a(true).a().a(this.f68885c, 48, UIUtils.dip2Px(this.f68884b.k.getActivity(), 8.0f), -((int) UIUtils.dip2Px(this.f68884b.k.getActivity(), 10.0f)));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$createDraftPublishContainer$5", "Lcom/ss/android/ugc/aweme/utils/DebounceOnClickListener;", "doClick", "", "v", "Landroid/view/View;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends ax {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68886a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68887b;

        public f(e eVar) {
            this.f68887b = eVar;
        }

        public final void a(@NotNull View view) {
            String str;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f68886a, false, 78260, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f68886a, false, 78260, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
            e eVar = this.f68887b;
            if (PatchProxy.isSupport(new Object[0], eVar, e.f68873a, false, 78251, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, e.f68873a, false, 78251, new Class[0], Void.TYPE);
            } else {
                String b2 = fg.b();
                cb cbVar = eVar.l;
                AVUploadSaveModel aVUploadSaveModel = new AVUploadSaveModel();
                aVUploadSaveModel.setSaveType(1);
                aVUploadSaveModel.setLocalTempPath(b2);
                aVUploadSaveModel.setSaveLocal(true);
                aVUploadSaveModel.setWaterMark(true);
                cbVar.mSaveModel = aVUploadSaveModel;
                ei<SynthetiseResult> a2 = new fl().a(eVar.l, new CancellationSignal());
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = new com.ss.android.ugc.aweme.shortvideo.view.d(eVar.k.getContext());
                Window window = dVar.getWindow();
                if (window != null) {
                    window.setDimAmount(0.0f);
                }
                dVar.setCancelable(false);
                dVar.setCanceledOnTouchOutside(false);
                dVar.f71295c = true;
                Context context = eVar.k.getContext();
                if (context != null) {
                    str = context.getString(C0906R.string.a7v);
                } else {
                    str = null;
                }
                dVar.setMessage(str);
                a2.b(new r(dVar, eVar, a2), a.i.f1052b);
                dVar.show();
                a.j jVar = new a.j();
                com.google.common.util.concurrent.l.a(a2, new s(b2, jVar), a.i.f1051a);
                jVar.f1091a.b(t.f68923b, a.i.f1051a).a((a.g<TResult, TContinuationResult>) new u<TResult,TContinuationResult>(eVar, dVar), a.i.f1052b);
            }
            com.ss.android.ugc.aweme.common.r.a("download", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_post_page").a("download_method", "download_before_publish").a("download_type", "self").a("creation_id", this.f68887b.l.creationId).a("local_time_ms", System.currentTimeMillis()).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68889b;

        public g(e eVar) {
            this.f68889b = eVar;
        }

        public final void onClick(View view) {
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f68888a, false, 78261, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68888a, false, 78261, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f68889b.l.creationId).a("enter_from", "video_post_page");
            if (this.f68889b.l.isMvThemeVideoType()) {
                str = "mv";
            } else {
                str = "video";
            }
            com.ss.android.ugc.aweme.common.r.a("click_privacy_setting", (Map) a2.a("content_type", str).a("content_source", this.f68889b.l.getAvetParameter().getContentSource()).a("shoot_way", this.f68889b.l.mShootWay).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$createPermissionItem$2$1", "Lcom/ss/android/ugc/aweme/shortvideo/PermissionDescriptions;", "friendsOnlyMessageId", "", "getType", "selfOnlyMessageId", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements dk {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    public static final class i<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68891b;

        public i(e eVar) {
            this.f68891b = eVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f68890a, false, 78262, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f68890a, false, 78262, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            dl dlVar = this.f68891b.f68875c;
            if (dlVar == null) {
                Intrinsics.throwNpe();
            }
            if (num == null) {
                Intrinsics.throwNpe();
            }
            dlVar.a(num.intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f68893b;

        public j(Function2 function2) {
            this.f68893b = function2;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f68892a, false, 78263, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f68892a, false, 78263, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2 function2 = this.f68893b;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function2.invoke(view2, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f68895b;

        public k(Function2 function2) {
            this.f68895b = function2;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f68894a, false, 78264, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f68894a, false, 78264, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2 function2 = this.f68895b;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function2.invoke(view2, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68896a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f68897b;

        public l(Function2 function2) {
            this.f68897b = function2;
        }

        public final void onClick(View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f68896a, false, 78265, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f68896a, false, 78265, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function2 function2 = this.f68897b;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            function2.invoke(view2, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    public static final class m<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f68899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f68900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f68901d;

        public m(View view, View view2, View view3) {
            this.f68899b = view;
            this.f68900c = view2;
            this.f68901d = view3;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f68898a, false, 78266, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f68898a, false, 78266, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (num == null) {
                Intrinsics.throwNpe();
            }
            if (num != null && num.intValue() == 0) {
                this.f68899b.performClick();
            } else if (num != null && num.intValue() == 2) {
                this.f68900c.performClick();
            } else if (num == null || num.intValue() != 1) {
                throw new IllegalArgumentException("unknown permission " + num);
            } else {
                this.f68901d.performClick();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "p", "", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class n extends Lambda implements Function2<View, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Ref.ObjectRef $lastSelectItem;
        final /* synthetic */ e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(e eVar, Ref.ObjectRef objectRef) {
            super(2);
            this.this$0 = eVar;
            this.$lastSelectItem = objectRef;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view, int i) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, changeQuickRedirect, false, 78267, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, changeQuickRedirect, false, 78267, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
            if (((View) this.$lastSelectItem.element) != view) {
                View view2 = (View) this.$lastSelectItem.element;
                view2.setSelected(false);
                view2.setAlpha(0.5f);
                view.setSelected(true);
                view.setAlpha(1.0f);
                this.$lastSelectItem.element = view;
                this.this$0.f68874b.setValue(Integer.valueOf(i));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "OnSettingItemClick", "com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$createReactDuetSettingItem$1$1"}, k = 3, mv = {1, 1, 15})
    public static final class o implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SettingItemSwitch f68903b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f68904c;

        public o(SettingItemSwitch settingItemSwitch, e eVar) {
            this.f68903b = settingItemSwitch;
            this.f68904c = eVar;
        }

        public final void OnSettingItemClick(View view) {
            int i;
            String str;
            if (PatchProxy.isSupport(new Object[]{view}, this, f68902a, false, 78268, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68902a, false, 78268, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReactDuetSettingChanged, true);
            com.ss.android.ugc.aweme.property.e eVar = com.ss.android.ugc.aweme.port.in.a.L;
            e.a aVar = e.a.ReactDuetSettingCurrent;
            if (this.f68903b.isChecked()) {
                i = com.ss.android.ugc.aweme.setting.l.g;
            } else {
                i = com.ss.android.ugc.aweme.setting.l.f63987f;
            }
            eVar.a(aVar, i);
            this.f68903b.toggle();
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f68904c.l.creationId).a("enter_from", "video_post_page");
            if (this.f68903b.isChecked()) {
                str = "off";
            } else {
                str = "on";
            }
            com.ss.android.ugc.aweme.common.r.a("click_react_duet_control", (Map) a2.a("to_status", str).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DmtTextView f68907c;

        public p(e eVar, DmtTextView dmtTextView) {
            this.f68906b = eVar;
            this.f68907c = dmtTextView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68905a, false, 78269, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68905a, false, 78269, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.port.in.a.m.a(this.f68906b.k.getActivity(), new ae.b(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68908a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p f68909b;

                {
                    this.f68909b = r1;
                }

                public final void a(@Nullable PoiStruct poiStruct, String str) {
                    if (PatchProxy.isSupport(new Object[]{poiStruct, str}, this, f68908a, false, 78270, new Class[]{PoiStruct.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{poiStruct, str}, this, f68908a, false, 78270, new Class[]{PoiStruct.class, String.class}, Void.TYPE);
                    } else if (poiStruct != null) {
                        this.f68909b.f68907c.setText(poiStruct.getPoiName());
                        this.f68909b.f68906b.l.poiId = com.ss.android.ugc.aweme.port.in.a.m.a(poiStruct);
                    } else {
                        this.f68909b.f68907c.setText("");
                        this.f68909b.f68906b.l.poiId = null;
                    }
                }
            });
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class q implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68911b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DmtTextView f68912c;

        public q(e eVar, DmtTextView dmtTextView) {
            this.f68911b = eVar;
            this.f68912c = dmtTextView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68910a, false, 78271, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68910a, false, 78271, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.port.in.a.m.a(this.f68911b.k.getActivity(), new ae.b(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68913a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ q f68914b;

                {
                    this.f68914b = r1;
                }

                public final void a(@Nullable PoiStruct poiStruct, String str) {
                    if (PatchProxy.isSupport(new Object[]{poiStruct, str}, this, f68913a, false, 78272, new Class[]{PoiStruct.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{poiStruct, str}, this, f68913a, false, 78272, new Class[]{PoiStruct.class, String.class}, Void.TYPE);
                    } else if (poiStruct != null) {
                        this.f68914b.f68912c.setText(poiStruct.getPoiName());
                        this.f68914b.f68911b.l.poiId = com.ss.android.ugc.aweme.port.in.a.m.a(poiStruct);
                    } else {
                        this.f68914b.f68912c.setText("");
                        this.f68914b.f68911b.l.poiId = null;
                    }
                }
            });
            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$saveLocal$progressDialog$1$1"}, k = 3, mv = {1, 1, 15})
    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68915a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.view.d f68916b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f68917c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ei f68918d;

        r(com.ss.android.ugc.aweme.shortvideo.view.d dVar, e eVar, ei eiVar) {
            this.f68916b = dVar;
            this.f68917c = eVar;
            this.f68918d = eiVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68915a, false, 78273, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68915a, false, 78273, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.view.d dVar = this.f68916b;
            ei eiVar = this.f68918d;
            Intrinsics.checkExpressionValueIsNotNull(eiVar, "compileFuture");
            dVar.setProgress(eiVar.e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/publish/TTPublishEnhancement$saveLocal$2", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/shortvideo/SynthetiseResult;", "onFailure", "", "t", "", "onSuccess", "result", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class s implements com.google.common.util.concurrent.k<SynthetiseResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f68920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.j f68921c;

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f68919a, false, 78275, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f68919a, false, 78275, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f68921c.a((Exception) th2);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
            if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f68919a, false, 78274, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f68919a, false, 78274, new Class[]{SynthetiseResult.class}, Void.TYPE);
                return;
            }
            File file = new File(this.f68920b);
            if (!file.exists() || file.length() <= 0) {
                a.j jVar = this.f68921c;
                jVar.a((Exception) new FileNotFoundException("temp file not exist: " + this.f68920b));
                return;
            }
            this.f68921c.a(file);
        }

        s(String str, a.j jVar) {
            this.f68920b = str;
            this.f68921c = jVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lbolts/Task;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "it", "then"}, k = 3, mv = {1, 1, 15})
    static final class t<TTaskResult, TContinuationResult> implements a.g<File, a.i<File>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68922a;

        /* renamed from: b  reason: collision with root package name */
        public static final t f68923b = new t();

        t() {
        }

        public final /* synthetic */ Object then(a.i iVar) {
            a.i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f68922a, false, 78276, new Class[]{a.i.class}, a.i.class)) {
                return (a.i) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f68922a, false, 78276, new Class[]{a.i.class}, a.i.class);
            }
            a.j jVar = new a.j();
            Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
            if (iVar.d()) {
                jVar.a(iVar.f());
            } else {
                File file = (File) iVar.e();
                StringBuilder sb = new StringBuilder();
                sb.append(com.ss.android.ugc.aweme.port.in.a.v.a((Context) com.ss.android.ugc.aweme.port.in.a.f61119b));
                Intrinsics.checkExpressionValueIsNotNull(file, "tempFile");
                sb.append(file.getName());
                String sb2 = sb.toString();
                if (com.ss.android.ugc.aweme.video.b.c(file.getAbsolutePath(), sb2)) {
                    com.ss.android.ugc.aweme.video.b.c(file.getAbsolutePath());
                    com.ss.android.ugc.aweme.photo.b.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, sb2);
                    jVar.a(new File(sb2));
                } else {
                    jVar.a((Exception) new RuntimeException("failed to copy file"));
                }
            }
            return jVar.f1091a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/io/File;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class u<TTaskResult, TContinuationResult> implements a.g<File, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68924a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f68925b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.view.d f68926c;

        u(e eVar, com.ss.android.ugc.aweme.shortvideo.view.d dVar) {
            this.f68925b = eVar;
            this.f68926c = dVar;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f68924a, false, 78277, new Class[]{a.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f68924a, false, 78277, new Class[]{a.i.class}, Void.TYPE);
            } else {
                this.f68926c.dismiss();
                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                if (iVar.d()) {
                    com.bytedance.ies.dmt.ui.d.a.a(this.f68925b.k.getContext(), (int) C0906R.string.c16).a();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.a(this.f68925b.k.getContext(), (int) C0906R.string.drm).a();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f68873a, false, 78228, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68873a, false, 78228, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SettingItemSwitch settingItemSwitch = this.f68876d;
        if (settingItemSwitch != null) {
            return settingItemSwitch.b();
        }
        return this.f68877e;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f68873a, false, 78229, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68873a, false, 78229, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SettingItemSwitch settingItemSwitch = this.g;
        if (settingItemSwitch != null) {
            return settingItemSwitch.b();
        }
        return this.h;
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f68873a, false, 78234, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68873a, false, 78234, new Class[0], Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.shortvideo.e b2 = ej.a().b();
        if (b2 != null && b2.isPreventDownload()) {
            z = true;
        }
        return z;
    }

    @NotNull
    public final b c() {
        if (PatchProxy.isSupport(new Object[0], this, f68873a, false, 78232, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f68873a, false, 78232, new Class[0], b.class);
        }
        switch (com.ss.android.ugc.aweme.port.in.a.M.b(a.C0682a.TTPublishEnhancement)) {
            case 0:
                return b.Normal;
            case 1:
                return b.EnhanceNone;
            case 2:
                return b.EnhanceDownload;
            case 3:
                return b.EnhancePrivacy;
            case 4:
                return b.EnhanceDownloadPrivacy;
            default:
                return b.Normal;
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f68873a, false, 78238, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68873a, false, 78238, new Class[0], Boolean.TYPE)).booleanValue();
        }
        switch (f.f68930d[c().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f68873a, false, 78237, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(this.k.getContext(), f2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f68873a, false, 78237, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    @NotNull
    public final LinearLayout a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f68873a, false, 78241, new Class[]{Context.class}, LinearLayout.class)) {
            return (LinearLayout) PatchProxy.accessDispatch(new Object[]{context2}, this, f68873a, false, 78241, new Class[]{Context.class}, LinearLayout.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setId(C0906R.id.cyk);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public e(@NotNull Fragment fragment, @NotNull cb cbVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(cbVar, "model");
        this.k = fragment;
        this.l = cbVar;
        boolean z2 = false;
        if (this.l.commentSetting == 3) {
            z = true;
        } else {
            z = false;
        }
        this.f68877e = z;
        this.h = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.ReactDuetSettingCurrent) == 1 ? true : z2;
    }
}
