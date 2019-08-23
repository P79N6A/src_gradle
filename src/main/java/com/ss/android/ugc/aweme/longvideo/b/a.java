package com.ss.android.ugc.aweme.longvideo.b;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.f;
import com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/LongVideoMobUtils;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53876a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0621a f53877b = new C0621a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\tH\u0007J2\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J2\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideo/utils/LongVideoMobUtils$Companion;", "", "()V", "getIsLongItem", "", "activity", "Landroid/content/Context;", "getLongVideoMobViewModel", "Lcom/ss/android/ugc/aweme/longvideo/viewmodel/LongVideoMobViewModel;", "Landroid/support/v4/app/FragmentActivity;", "getParams", "Lcom/ss/android/ugc/aweme/longvideo/LongVideoParams;", "initMobViewModel", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "eventType", "", "pageType", "isLongItem", "initNewMobViewModel", "longVideoPlayActivity", "Lcom/ss/android/ugc/aweme/longvideonew/LongVideoActivity;", "isCanDownloadLongVideo", "", "aweme", "isInLongVideoPage", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.a$a  reason: collision with other inner class name */
    public static final class C0621a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53878a;

        private C0621a() {
        }

        public /* synthetic */ C0621a(byte b2) {
            this();
        }

        @JvmStatic
        public final int a(@Nullable Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f53878a, false, 56741, new Class[]{Context.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f53878a, false, 56741, new Class[]{Context.class}, Integer.TYPE)).intValue();
            }
            if (context2 instanceof FragmentActivity) {
                f fVar = ((LongVideoMobViewModel) ViewModelProviders.of((FragmentActivity) context2).get(LongVideoMobViewModel.class)).f53991a;
                if (fVar != null) {
                    return fVar.f53915c;
                }
            }
            return 0;
        }

        @JvmStatic
        public final boolean b(@Nullable Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f53878a, false, 56742, new Class[]{Context.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f53878a, false, 56742, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (a(context2) == 1 || (context2 instanceof LoftPlayActivity)) {
                return true;
            } else {
                return false;
            }
        }

        @JvmStatic
        @NotNull
        public final LongVideoMobViewModel a(@NotNull FragmentActivity fragmentActivity) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f53878a, false, 56740, new Class[]{FragmentActivity.class}, LongVideoMobViewModel.class)) {
                return (LongVideoMobViewModel) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f53878a, false, 56740, new Class[]{FragmentActivity.class}, LongVideoMobViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(LongVideoMobViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…MobViewModel::class.java)");
            return (LongVideoMobViewModel) viewModel;
        }

        @JvmStatic
        @NotNull
        public final LongVideoMobViewModel a(@NotNull FragmentActivity fragmentActivity, @Nullable Aweme aweme, @NotNull String str, int i, int i2) {
            FragmentActivity fragmentActivity2 = fragmentActivity;
            Aweme aweme2 = aweme;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity2, aweme2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f53878a, false, 56737, new Class[]{FragmentActivity.class, Aweme.class, String.class, Integer.TYPE, Integer.TYPE}, LongVideoMobViewModel.class)) {
                Object[] objArr = {fragmentActivity2, aweme2, str2, Integer.valueOf(i), Integer.valueOf(i2)};
                return (LongVideoMobViewModel) PatchProxy.accessDispatch(objArr, this, f53878a, false, 56737, new Class[]{FragmentActivity.class, Aweme.class, String.class, Integer.TYPE, Integer.TYPE}, LongVideoMobViewModel.class);
            }
            Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(str2, "eventType");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(LongVideoMobViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…MobViewModel::class.java)");
            LongVideoMobViewModel longVideoMobViewModel = (LongVideoMobViewModel) viewModel;
            longVideoMobViewModel.f53992b = aweme2;
            longVideoMobViewModel.f53991a = new f(str2, i, i2);
            return longVideoMobViewModel;
        }
    }

    @JvmStatic
    public static final int a(@Nullable Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f53876a, true, 56734, new Class[]{Context.class}, Integer.TYPE)) {
            return f53877b.a(context2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f53876a, true, 56734, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    @JvmStatic
    public static final boolean b(@Nullable Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f53876a, true, 56735, new Class[]{Context.class}, Boolean.TYPE)) {
            return f53877b.b(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f53876a, true, 56735, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }
}
