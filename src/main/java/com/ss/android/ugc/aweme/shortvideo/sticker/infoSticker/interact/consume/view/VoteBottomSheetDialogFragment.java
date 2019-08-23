package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.BottomSheetUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.aweme.views.ChallengeViewPager;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 12\u00020\u0001:\u000212B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\u0012\u0010!\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\u0012\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001eH\u0002J\u0018\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/dialog/ViewPagerBottomSheetDialogFragment;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/adapter/VoteViewPagerAdapter;", "dismissListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$OnDismissListener;", "getDismissListener", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$OnDismissListener;", "setDismissListener", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$OnDismissListener;)V", "iVoteDetailSaveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "getIVoteDetailSaveData", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "setIVoteDetailSaveData", "(Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;)V", "ivClose", "Landroid/widget/ImageView;", "rootView", "Landroid/view/View;", "tabLayout", "Landroid/support/design/widget/TabLayout;", "tvTitle", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "viewPager", "Lcom/ss/android/ugc/aweme/views/ChallengeViewPager;", "voteData", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "setupTabLayout", "show", "manager", "Landroid/support/v4/app/FragmentManager;", "tag", "", "Companion", "OnDismissListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteBottomSheetDialogFragment extends ViewPagerBottomSheetDialogFragment {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f69992b;
    public static final a h = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    TabLayout f69993c;

    /* renamed from: d  reason: collision with root package name */
    public ChallengeViewPager f69994d;

    /* renamed from: e  reason: collision with root package name */
    VoteStruct f69995e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public b f69996f;
    @Nullable
    public g g;
    private View i;
    private VoteViewPagerAdapter j;
    private DmtTextView k;
    private ImageView l;
    private HashMap m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment;", "voteStruct", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69997a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @Nullable
        public final VoteBottomSheetDialogFragment a(@Nullable VoteStruct voteStruct) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{voteStruct}, this, f69997a, false, 79687, new Class[]{VoteStruct.class}, VoteBottomSheetDialogFragment.class)) {
                return (VoteBottomSheetDialogFragment) PatchProxy.accessDispatch(new Object[]{voteStruct}, this, f69997a, false, 79687, new Class[]{VoteStruct.class}, VoteBottomSheetDialogFragment.class);
            }
            if (voteStruct != null) {
                List<VoteStruct.OptionsBean> options = voteStruct.getOptions();
                if (options != null) {
                    i = options.size();
                }
                if (i >= 2) {
                    VoteBottomSheetDialogFragment voteBottomSheetDialogFragment = new VoteBottomSheetDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("key_vote", voteStruct);
                    voteBottomSheetDialogFragment.setArguments(bundle);
                    return voteBottomSheetDialogFragment;
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$OnDismissListener;", "", "onDismiss", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, k = 3, mv = {1, 1, 15})
    static final class c implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteBottomSheetDialogFragment f69999b;

        c(VoteBottomSheetDialogFragment voteBottomSheetDialogFragment) {
            this.f69999b = voteBottomSheetDialogFragment;
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f69998a, false, 79688, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f69998a, false, 79688, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            BottomSheetUtils.a(this.f69999b.f69994d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteBottomSheetDialogFragment f70001b;

        d(VoteBottomSheetDialogFragment voteBottomSheetDialogFragment) {
            this.f70001b = voteBottomSheetDialogFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ed, code lost:
            if (r5 == null) goto L_0x00ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x013b, code lost:
            if (r5 == null) goto L_0x013d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0183  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f70000a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 79689(0x13749, float:1.11668E-40)
                r2 = r12
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f70000a
                r5 = 0
                r6 = 79689(0x13749, float:1.11668E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r12
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r9 = r12.f70001b
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.f69992b
                r5 = 0
                r6 = 79681(0x13741, float:1.11657E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x004b
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.f69992b
                r5 = 0
                r6 = 79681(0x13741, float:1.11657E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x004b:
                android.content.Context r2 = r9.getContext()
                if (r2 == 0) goto L_0x0193
                android.support.design.widget.TabLayout r2 = r9.f69993c
                if (r2 == 0) goto L_0x005c
                com.ss.android.ugc.aweme.views.ChallengeViewPager r3 = r9.f69994d
                android.support.v4.view.ViewPager r3 = (android.support.v4.view.ViewPager) r3
                r2.setupWithViewPager(r3)
            L_0x005c:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i
                android.content.Context r3 = r9.getContext()
                r4 = 1
                r2.<init>(r3, r4)
                android.widget.TableLayout$LayoutParams r3 = new android.widget.TableLayout$LayoutParams
                r5 = -1
                r3.<init>(r5, r5)
                android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
                r2.setLayoutParams(r3)
                r2.setPadding(r0, r0, r0, r0)
                android.support.design.widget.TabLayout r3 = r9.f69993c
                if (r3 != 0) goto L_0x007b
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x007b:
                android.support.design.widget.TabLayout$Tab r3 = r3.getTabAt(r0)
                if (r3 == 0) goto L_0x0086
                android.view.View r2 = (android.view.View) r2
                r3.setCustomView((android.view.View) r2)
            L_0x0086:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i
                android.content.Context r3 = r9.getContext()
                r2.<init>(r3, r0)
                android.widget.TableLayout$LayoutParams r3 = new android.widget.TableLayout$LayoutParams
                r3.<init>(r5, r5)
                android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
                r2.setLayoutParams(r3)
                r2.setPadding(r0, r0, r0, r0)
                android.support.design.widget.TabLayout r3 = r9.f69993c
                if (r3 != 0) goto L_0x00a3
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00a3:
                android.support.design.widget.TabLayout$Tab r3 = r3.getTabAt(r4)
                if (r3 == 0) goto L_0x00ae
                android.view.View r2 = (android.view.View) r2
                r3.setCustomView((android.view.View) r2)
            L_0x00ae:
                android.support.design.widget.TabLayout r2 = r9.f69993c
                if (r2 != 0) goto L_0x00b5
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00b5:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$f r3 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$f
                r3.<init>()
                android.support.design.widget.TabLayout$BaseOnTabSelectedListener r3 = (android.support.design.widget.TabLayout.BaseOnTabSelectedListener) r3
                r2.addOnTabSelectedListener(r3)
                android.support.design.widget.TabLayout r2 = r9.f69993c
                if (r2 != 0) goto L_0x00c6
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00c6:
                android.support.design.widget.TabLayout$Tab r2 = r2.getTabAt(r0)
                r3 = 0
                if (r2 == 0) goto L_0x00d2
                android.view.View r2 = r2.getCustomView()
                goto L_0x00d3
            L_0x00d2:
                r2 = r3
            L_0x00d3:
                if (r2 == 0) goto L_0x018b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i) r2
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r9.f69995e
                if (r5 == 0) goto L_0x00ef
                java.util.List r5 = r5.getOptions()
                if (r5 == 0) goto L_0x00ef
                java.lang.Object r5 = r5.get(r0)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
                if (r5 == 0) goto L_0x00ef
                java.lang.String r5 = r5.getOptionText()
                if (r5 != 0) goto L_0x00f1
            L_0x00ef:
                java.lang.String r5 = ""
            L_0x00f1:
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r9.f69995e
                r7 = 0
                if (r6 == 0) goto L_0x010a
                java.util.List r6 = r6.getOptions()
                if (r6 == 0) goto L_0x010a
                java.lang.Object r6 = r6.get(r0)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r6 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r6
                if (r6 == 0) goto L_0x010a
                long r10 = r6.getVoteCount()
                goto L_0x010b
            L_0x010a:
                r10 = r7
            L_0x010b:
                r2.a(r5, r10)
                android.support.design.widget.TabLayout r2 = r9.f69993c
                if (r2 != 0) goto L_0x0115
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0115:
                android.support.design.widget.TabLayout$Tab r2 = r2.getTabAt(r4)
                if (r2 == 0) goto L_0x0120
                android.view.View r2 = r2.getCustomView()
                goto L_0x0121
            L_0x0120:
                r2 = r3
            L_0x0121:
                if (r2 == 0) goto L_0x0183
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i) r2
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r5 = r9.f69995e
                if (r5 == 0) goto L_0x013d
                java.util.List r5 = r5.getOptions()
                if (r5 == 0) goto L_0x013d
                java.lang.Object r5 = r5.get(r4)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
                if (r5 == 0) goto L_0x013d
                java.lang.String r5 = r5.getOptionText()
                if (r5 != 0) goto L_0x013f
            L_0x013d:
                java.lang.String r5 = ""
            L_0x013f:
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r6 = r9.f69995e
                if (r6 == 0) goto L_0x0155
                java.util.List r6 = r6.getOptions()
                if (r6 == 0) goto L_0x0155
                java.lang.Object r6 = r6.get(r4)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r6 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r6
                if (r6 == 0) goto L_0x0155
                long r7 = r6.getVoteCount()
            L_0x0155:
                r2.a(r5, r7)
                android.support.design.widget.TabLayout r2 = r9.f69993c
                if (r2 != 0) goto L_0x015f
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x015f:
                android.support.design.widget.TabLayout$Tab r2 = r2.getTabAt(r4)
                if (r2 == 0) goto L_0x0169
                android.view.View r3 = r2.getCustomView()
            L_0x0169:
                if (r3 == 0) goto L_0x017b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i r3 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.i) r3
                r3.setSelect(r0)
                android.support.design.widget.TabLayout r2 = r9.f69993c
                if (r2 != 0) goto L_0x0177
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0177:
                r2.setSelectedTabIndicatorHeight(r0)
                goto L_0x0193
            L_0x017b:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
                r0.<init>(r2)
                throw r0
            L_0x0183:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
                r0.<init>(r2)
                throw r0
            L_0x018b:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteTabView"
                r0.<init>(r2)
                throw r0
            L_0x0193:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.d.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70002a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VoteBottomSheetDialogFragment f70003b;

        e(VoteBottomSheetDialogFragment voteBottomSheetDialogFragment) {
            this.f70003b = voteBottomSheetDialogFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f70002a, false, 79690, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f70002a, false, 79690, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f70003b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$setupTabLayout$1", "Landroid/support/design/widget/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Landroid/support/design/widget/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements TabLayout.OnTabSelectedListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70004a;

        public final void onTabReselected(@Nullable TabLayout.Tab tab) {
        }

        f() {
        }

        public final void onTabSelected(@Nullable TabLayout.Tab tab) {
            View view;
            if (PatchProxy.isSupport(new Object[]{tab}, this, f70004a, false, 79692, new Class[]{TabLayout.Tab.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tab}, this, f70004a, false, 79692, new Class[]{TabLayout.Tab.class}, Void.TYPE);
                return;
            }
            if (tab != null) {
                view = tab.getCustomView();
            } else {
                view = null;
            }
            i iVar = (i) view;
            if (iVar != null) {
                iVar.setSelect(true);
            }
        }

        public final void onTabUnselected(@Nullable TabLayout.Tab tab) {
            View view;
            if (PatchProxy.isSupport(new Object[]{tab}, this, f70004a, false, 79691, new Class[]{TabLayout.Tab.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tab}, this, f70004a, false, 79691, new Class[]{TabLayout.Tab.class}, Void.TYPE);
                return;
            }
            if (tab != null) {
                view = tab.getCustomView();
            } else {
                view = null;
            }
            i iVar = (i) view;
            if (iVar != null) {
                iVar.setSelect(false);
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f69992b, false, 79685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69992b, false, 79685, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.clear();
        }
    }

    @SuppressLint({"useChinaStyleVersion"})
    public final void onCreate(@Nullable Bundle bundle) {
        Serializable serializable;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69992b, false, 79679, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69992b, false, 79679, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(0, C0906R.style.ff);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_vote");
        } else {
            serializable = null;
        }
        this.f69995e = (VoteStruct) serializable;
    }

    @NotNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69992b, false, 79682, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f69992b, false, 79682, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkExpressionValueIsNotNull(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.setOnShowListener(new c(this));
        return onCreateDialog;
    }

    public final void onDismiss(@Nullable DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f69992b, false, 79683, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f69992b, false, 79683, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        b bVar = this.f69996f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void show(@NotNull FragmentManager fragmentManager, @NotNull String str) {
        FragmentManager fragmentManager2 = fragmentManager;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentManager2, str2}, this, f69992b, false, 79678, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager2, str2}, this, f69992b, false, 79678, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fragmentManager2, "manager");
        Intrinsics.checkParameterIsNotNull(str2, "tag");
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01aa  */
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint({"SetTextI18n"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(@org.jetbrains.annotations.NotNull android.view.LayoutInflater r15, @org.jetbrains.annotations.Nullable android.view.ViewGroup r16, @org.jetbrains.annotations.Nullable android.os.Bundle r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            r13 = 2
            r0[r13] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f69992b
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 79680(0x13740, float:1.11655E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            r0[r13] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f69992b
            r3 = 0
            r4 = 79680(0x13740, float:1.11655E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.LayoutInflater> r1 = android.view.LayoutInflater.class
            r5[r11] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r12] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x0053:
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
            r0 = 2131691576(0x7f0f0838, float:1.9012228E38)
            android.view.View r0 = r15.inflate(r0, r9, r11)
            java.lang.String r1 = "inflater.inflate(R.layou…dialog, container, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.i = r0
            android.view.View r0 = r7.i
            if (r0 != 0) goto L_0x006f
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x006f:
            r1 = 2131170252(0x7f0713cc, float:1.7954857E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.design.widget.TabLayout r0 = (android.support.design.widget.TabLayout) r0
            r7.f69993c = r0
            android.view.View r0 = r7.i
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0083:
            r1 = 2131171459(0x7f071883, float:1.7957305E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.views.ChallengeViewPager r0 = (com.ss.android.ugc.aweme.views.ChallengeViewPager) r0
            r7.f69994d = r0
            android.view.View r0 = r7.i
            if (r0 != 0) goto L_0x0097
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0097:
            r1 = 2131170404(0x7f071464, float:1.7955165E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            r7.k = r0
            android.view.View r0 = r7.i
            if (r0 != 0) goto L_0x00ab
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00ab:
            r1 = 2131167543(0x7f070937, float:1.7949363E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.l = r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter
            android.support.v4.app.FragmentManager r1 = r14.getChildFragmentManager()
            java.lang.String r2 = "childFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r0.<init>(r1)
            r7.j = r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r0 = r7.j
            if (r0 != 0) goto L_0x00cd
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00cd:
            java.util.List<android.support.v4.app.Fragment> r0 = r0.f69854b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$a r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.f69963d
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r7.f69995e
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r1 = r1.a(r11, r2)
            r0.add(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r0 = r7.j
            if (r0 != 0) goto L_0x00e1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00e1:
            java.util.List<android.support.v4.app.Fragment> r0 = r0.f69854b
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment$a r1 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment.f69963d
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r7.f69995e
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r1 = r1.a(r12, r2)
            r0.add(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r0 = r7.j
            if (r0 != 0) goto L_0x00f5
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00f5:
            java.util.List<android.support.v4.app.Fragment> r0 = r0.f69854b
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x01b8
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r1 = r7.g
            r0.f69965c = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r0 = r7.j
            if (r0 != 0) goto L_0x010a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x010a:
            java.util.List<android.support.v4.app.Fragment> r0 = r0.f69854b
            java.lang.Object r0 = r0.get(r12)
            if (r0 == 0) goto L_0x01b0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment) r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r1 = r7.g
            r0.f69965c = r1
            com.ss.android.ugc.aweme.views.ChallengeViewPager r0 = r7.f69994d
            if (r0 == 0) goto L_0x011f
            r0.setPagingEnable(r11)
        L_0x011f:
            com.ss.android.ugc.aweme.views.ChallengeViewPager r0 = r7.f69994d
            if (r0 == 0) goto L_0x012a
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteViewPagerAdapter r1 = r7.j
            android.support.v4.view.PagerAdapter r1 = (android.support.v4.view.PagerAdapter) r1
            r0.setAdapter(r1)
        L_0x012a:
            android.support.design.widget.TabLayout r0 = r7.f69993c
            if (r0 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$d r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$d
            r1.<init>(r14)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
        L_0x0138:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r7.f69995e
            r1 = 0
            if (r0 == 0) goto L_0x0151
            java.util.List r0 = r0.getOptions()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
            if (r0 == 0) goto L_0x0151
            long r3 = r0.getVoteCount()
            goto L_0x0152
        L_0x0151:
            r3 = r1
        L_0x0152:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r7.f69995e
            if (r0 == 0) goto L_0x0168
            java.util.List r0 = r0.getOptions()
            if (r0 == 0) goto L_0x0168
            java.lang.Object r0 = r0.get(r12)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
            if (r0 == 0) goto L_0x0168
            long r1 = r0.getVoteCount()
        L_0x0168:
            r0 = 0
            long r3 = r3 + r1
            java.lang.String r0 = com.ss.android.ugc.aweme.i18n.b.a(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.k
            if (r1 == 0) goto L_0x0198
            android.content.res.Resources r2 = r14.getResources()
            r3 = 2131564621(0x7f0d184d, float:1.8754732E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "resources.getString(R.string.vote_total)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r12)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x0198:
            android.widget.ImageView r0 = r7.l
            if (r0 == 0) goto L_0x01a6
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$e r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$e
            r1.<init>(r14)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x01a6:
            android.view.View r0 = r7.i
            if (r0 != 0) goto L_0x01af
            java.lang.String r1 = "rootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01af:
            return r0
        L_0x01b0:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment"
            r0.<init>(r1)
            throw r0
        L_0x01b8:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.VoteDetailFragment"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
