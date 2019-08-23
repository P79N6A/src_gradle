package com.ss.android.ugc.aweme.follow;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010\u0012\u001a\u00020\u00102\r\u0010\u0013\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u0014¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u001a\u0010\u001a\u001a\u00020\u00102\r\u0010\u0013\u001a\t\u0018\u00010\u0004¢\u0006\u0002\b\u001b¢\u0006\u0002\u0010\u0015J\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000b\u0010\u0002R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000e\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/FollowFeedTriggerViewModel;", "Landroid/arch/lifecycle/ViewModel;", "()V", "enterMethod", "", "enterMethod$annotations", "getEnterMethod", "()I", "setEnterMethod", "(I)V", "loadMoreType", "loadMoreType$annotations", "Ljava/lang/Integer;", "refreshType", "refreshType$annotations", "resetLoadMoreType", "", "resetRefreshType", "sendPageLoadMoreEvent", "type", "Lcom/ss/android/ugc/aweme/feed/param/IFollowFeedFetchTrigger$ILoadMoreType;", "(Ljava/lang/Integer;)V", "sendPageLoadMoreResponseEvent", "isSuccess", "", "noMoreContent", "sendPageRefreshEvent", "Lcom/ss/android/ugc/aweme/feed/param/IFollowFeedFetchTrigger$IRefreshType;", "sendPageRefreshResponseEvent", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowFeedTriggerViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47718a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f47719c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f47720b = 1;

    /* renamed from: d  reason: collision with root package name */
    private Integer f47721d = 3;

    /* renamed from: e  reason: collision with root package name */
    private Integer f47722e = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/FollowFeedTriggerViewModel$Companion;", "", "()V", "getViewModel", "Lcom/ss/android/ugc/aweme/follow/FollowFeedTriggerViewModel;", "activity", "Landroid/support/v4/app/FragmentActivity;", "tag", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47723a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FollowFeedTriggerViewModel a(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f47723a, false, 44576, new Class[]{FragmentActivity.class}, FollowFeedTriggerViewModel.class)) {
                return (FollowFeedTriggerViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f47723a, false, 44576, new Class[]{FragmentActivity.class}, FollowFeedTriggerViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get("tag_follow_feed_trigger", FollowFeedTriggerViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders\n     …gerViewModel::class.java]");
            return (FollowFeedTriggerViewModel) viewModel;
        }
    }

    @JvmStatic
    @NotNull
    public static final FollowFeedTriggerViewModel a(@NotNull FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity2}, null, f47718a, true, 44574, new Class[]{FragmentActivity.class}, FollowFeedTriggerViewModel.class)) {
            return f47719c.a(fragmentActivity2);
        }
        return (FollowFeedTriggerViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, null, f47718a, true, 44574, new Class[]{FragmentActivity.class}, FollowFeedTriggerViewModel.class);
    }

    private final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47718a, false, 44568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47718a, false, 44568, new Class[0], Void.TYPE);
            return;
        }
        this.f47722e = 4;
    }

    private final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47718a, false, 44567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47718a, false, 44567, new Class[0], Void.TYPE);
            return;
        }
        this.f47721d = 3;
    }

    public final void b(@Nullable Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f47718a, false, 44570, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f47718a, false, 44570, new Class[]{Integer.class}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.f47722e = num;
            com.ss.android.ugc.aweme.newfollow.g.a.d(com.ss.android.ugc.aweme.newfollow.g.a.b(this.f47722e));
        }
    }

    public final void a(@Nullable Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f47718a, false, 44569, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f47718a, false, 44569, new Class[]{Integer.class}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            if (num != null && num.intValue() == 3) {
                Integer num2 = this.f47721d;
                if (num2 == null || num2.intValue() != 3) {
                    return;
                }
            }
            this.f47721d = num;
            com.ss.android.ugc.aweme.newfollow.g.a.d(com.ss.android.ugc.aweme.newfollow.g.a.a(this.f47721d));
        }
    }

    public final void b(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f47718a, false, 44572, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f47718a, false, 44572, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(com.ss.android.ugc.aweme.newfollow.g.a.b(this.f47722e), z, z2);
            b();
        }
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f47718a, false, 44571, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f47718a, false, 44571, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(com.ss.android.ugc.aweme.newfollow.g.a.a(this.f47721d), z, z2);
            a();
        }
    }
}
