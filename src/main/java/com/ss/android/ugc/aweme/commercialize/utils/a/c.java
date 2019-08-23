package com.ss.android.ugc.aweme.commercialize.utils.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.im.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.api.e;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/router/IMPage;", "", "()V", "open", "", "context", "Landroid/content/Context;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39657a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f39658b = new c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commercialize/utils/router/IMPage$open$handler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f39660b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.a f39661c;

        public final void handleMessage(@NotNull Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f39659a, false, 32699, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f39659a, false, 32699, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(message, "msg");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                IIMService a2 = b.a(false);
                Context context = this.f39660b;
                Object obj = message.obj;
                if (obj != null) {
                    a2.startChatWithAdLog(context, IMUser.fromUser((User) obj), this.f39661c);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, com.ss.android.ugc.aweme.im.service.model.a aVar, Looper looper) {
            super(looper);
            this.f39660b = context;
            this.f39661c = aVar;
        }
    }

    private c() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Context context, @Nullable Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f39657a, true, 32698, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f39657a, true, 32698, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null || aweme == null || !aweme.isAd()) {
            return false;
        } else {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(awemeRawAd, "aweme.awemeRawAd!!");
            String openUrl = awemeRawAd.getOpenUrl();
            if (!f.b(openUrl)) {
                return false;
            }
            String c2 = f.c(openUrl);
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(awemeRawAd2, "aweme.awemeRawAd!!");
            String logExtra = awemeRawAd2.getLogExtra();
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(awemeRawAd3, "aweme.awemeRawAd!!");
            e.a().a(new a(context2, new com.ss.android.ugc.aweme.im.service.model.a(logExtra, String.valueOf(awemeRawAd3.getCreativeId().longValue())), Looper.getMainLooper()), c2);
            return true;
        }
    }
}
