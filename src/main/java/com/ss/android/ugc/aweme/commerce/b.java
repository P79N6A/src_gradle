package com.ss.android.ugc.aweme.commerce;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/CommerceMediator;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36688a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36689b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/CommerceMediator$Companion;", "", "()V", "feedbackQueryAweme", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "originType", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36690a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "call", "com/ss/android/ugc/aweme/commerce/CommerceMediator$Companion$feedbackQueryAweme$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.b$a$a  reason: collision with other inner class name */
        public static final class C0461a<V> implements Callable<TResult> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36694a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Aweme f36695b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f36696c;

            public C0461a(Aweme aweme, String str) {
                this.f36695b = aweme;
                this.f36696c = str;
            }

            public final /* synthetic */ Object call() {
                if (PatchProxy.isSupport(new Object[0], this, f36694a, false, 27892, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f36694a, false, 27892, new Class[0], Void.TYPE);
                } else {
                    Aweme a2 = DetailApi.a(this.f36695b.getAid(), this.f36696c);
                    Intrinsics.checkExpressionValueIsNotNull(a2, "DetailApi.queryAweme(aweme.aid, originType)");
                    com.ss.android.ugc.aweme.feed.a.a().a(this.f36695b.getAid(), a2.getRawPromotion());
                }
                return Unit.INSTANCE;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
