package com.ss.android.ugc.aweme.commerce.live;

import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.android.livesdkapi.host.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/LivePrepare;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36963a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36964b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/LivePrepare$Companion;", "", "()V", "CODE_FAIL", "", "CODE_SUCCESS", "amICommerceBroadcaster", "", "isUserWithCommercePermission", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "prepareGoodsForLive", "", "activity", "Landroid/app/Activity;", "cardHeight", "next", "Lkotlin/Function1;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36965a;

        private a() {
        }

        @JvmStatic
        public final boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f36965a, false, 28282, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36965a, false, 28282, new Class[0], Boolean.TYPE)).booleanValue();
            }
            l l = h.f().l();
            Intrinsics.checkExpressionValueIsNotNull(l, "TTLiveSDK.hostService().user()");
            i b2 = l.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "TTLiveSDK.hostService().user().curUser");
            return b2.isWithCommercePermission();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
