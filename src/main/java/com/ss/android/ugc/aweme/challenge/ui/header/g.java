package com.ss.android.ugc.aweme.challenge.ui.header;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.favorites.c.a;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000eJ\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010\u001f\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/CollectButtonBlock;", "Lcom/ss/android/ugc/aweme/favorites/presenter/ICollectActionView;", "container", "Landroid/view/View;", "collectIv", "Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;", "collectTv", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;)V", "mData", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "mHasCollected", "", "mHeaderParam", "Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;", "mPresenter", "Lcom/ss/android/ugc/aweme/favorites/presenter/CollectActionPresenter;", "bindData", "", "data", "headerParam", "onCollectFailed", "e", "Ljava/lang/Exception;", "onCollectSuccess", "response", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "requestCollect", "resetCollectStatus", "sendCollectEvent", "updateCollectIv", "updateCollectTv", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35635a;

    /* renamed from: b  reason: collision with root package name */
    Challenge f35636b;

    /* renamed from: c  reason: collision with root package name */
    j f35637c;

    /* renamed from: d  reason: collision with root package name */
    boolean f35638d;

    /* renamed from: e  reason: collision with root package name */
    private final a f35639e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final CheckableImageView f35640f;
    private final DmtTextView g;

    private final void d() {
        this.f35638d = !this.f35638d;
    }

    public final void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f35635a, false, 26348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35635a, false, 26348, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = this.f35640f;
        if (this.f35638d) {
            i = 2130839385;
        } else {
            i = 2130839386;
        }
        checkableImageView.setImageResource(i);
    }

    public final void b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f35635a, false, 26349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35635a, false, 26349, new Class[0], Void.TYPE);
            return;
        }
        DmtTextView dmtTextView = this.g;
        if (dmtTextView != null) {
            if (this.f35638d) {
                i = C0906R.string.uc;
            } else {
                i = C0906R.string.u2;
            }
            dmtTextView.setText(i);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f35635a, false, 26350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35635a, false, 26350, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f35639e;
        Object[] objArr = new Object[3];
        objArr[0] = 3;
        Challenge challenge = this.f35636b;
        if (challenge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mData");
        }
        objArr[1] = challenge.getCid();
        objArr[2] = Integer.valueOf(true ^ this.f35638d ? 1 : 0);
        aVar.a(objArr);
        d();
        this.f35640f.b();
    }

    public final void a(@Nullable BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f35635a, false, 26352, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f35635a, false, 26352, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        Challenge challenge = this.f35636b;
        if (challenge == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mData");
        }
        challenge.setCollectStatus(this.f35638d ? 1 : 0);
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35635a, false, 26353, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35635a, false, 26353, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        d();
        a();
        b();
    }

    public final void a(@NotNull Challenge challenge, @NotNull j jVar) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{challenge, jVar}, this, f35635a, false, 26347, new Class[]{Challenge.class, j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge, jVar}, this, f35635a, false, 26347, new Class[]{Challenge.class, j.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challenge, "data");
        Intrinsics.checkParameterIsNotNull(jVar, "headerParam");
        this.f35636b = challenge;
        this.f35637c = jVar;
        if (challenge.getCollectStatus() == 1) {
            z = true;
        }
        this.f35638d = z;
        a();
        b();
    }

    public g(@NotNull final View view, @NotNull CheckableImageView checkableImageView, @Nullable DmtTextView dmtTextView) {
        Intrinsics.checkParameterIsNotNull(view, "container");
        Intrinsics.checkParameterIsNotNull(checkableImageView, "collectIv");
        this.f35640f = checkableImageView;
        this.g = dmtTextView;
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35641a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f35642b;

            {
                this.f35642b = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                if (PatchProxy.isSupport(new Object[]{view}, this, f35641a, false, 26354, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f35641a, false, 26354, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                g gVar = this.f35642b;
                if (PatchProxy.isSupport(new Object[0], gVar, g.f35635a, false, 26351, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], gVar, g.f35635a, false, 26351, new Class[0], Void.TYPE);
                } else {
                    if (gVar.f35638d) {
                        str = "cancel_favourite_challenge";
                    } else {
                        str = "favourite_challenge";
                    }
                    d a2 = d.a().a("enter_from", "challenge");
                    Challenge challenge = gVar.f35636b;
                    if (challenge == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mData");
                    }
                    r.a(str, (Map) a2.a("tag_id", challenge.getCid()).f34114b);
                    j jVar = gVar.f35637c;
                    if (jVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderParam");
                    }
                    boolean equals = TextUtils.equals(jVar.f35673e, "search_result");
                    j jVar2 = gVar.f35637c;
                    if (jVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHeaderParam");
                    }
                    boolean equals2 = TextUtils.equals(jVar2.f35673e, "general_search");
                    if ((equals || equals2) && !gVar.f35638d) {
                        j jVar3 = j.f42669b;
                        Challenge challenge2 = gVar.f35636b;
                        if (challenge2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mData");
                        }
                        String cid = challenge2.getCid();
                        Intrinsics.checkExpressionValueIsNotNull(cid, "mData.cid");
                        if (PatchProxy.isSupport(new Object[]{"search_favourite", "challenge", cid, Byte.valueOf(equals ? (byte) 1 : 0)}, jVar3, j.f42668a, false, 36982, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                            j jVar4 = jVar3;
                            PatchProxy.accessDispatch(new Object[]{"search_favourite", "challenge", cid, Byte.valueOf(equals)}, jVar4, j.f42668a, false, 36982, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull("search_favourite", "event");
                            Intrinsics.checkParameterIsNotNull("challenge", "enterFrom");
                            Intrinsics.checkParameterIsNotNull(cid, "tagId");
                            if (equals) {
                                str2 = e.a().a(2);
                            } else {
                                str2 = e.a().a(3);
                            }
                            Map<String, String> map = d.a().a("enter_from", "challenge").a("tag_id", cid).a("log_pb", ai.a().a(str2)).f34114b;
                            Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
                            jVar3.a("search_favourite", map);
                        }
                    }
                }
                IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                if (!a3.isLogin()) {
                    com.ss.android.ugc.aweme.login.e.a(v.c(view), "challenge", "click_favorite_challenge", (Bundle) null, (f) new h(new Function0<Unit>(this.f35642b) {
                        public static ChangeQuickRedirect changeQuickRedirect;

                        public final String getName() {
                            return "requestCollect";
                        }

                        public final KDeclarationContainer getOwner() {
                            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26356, new Class[0], KDeclarationContainer.class)) {
                                return Reflection.getOrCreateKotlinClass(g.class);
                            }
                            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26356, new Class[0], KDeclarationContainer.class);
                        }

                        public final String getSignature() {
                            return "requestCollect()V";
                        }

                        public final void invoke() {
                            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26355, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26355, new Class[0], Void.TYPE);
                                return;
                            }
                            ((g) this.receiver).c();
                        }
                    }));
                } else {
                    this.f35642b.c();
                }
            }
        });
        this.f35640f.setOnStateChangeListener(new CheckableImageView.a(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f35644a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f35645b;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f35644a, false, 26358, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f35644a, false, 26358, new Class[0], Void.TYPE);
                    return;
                }
                this.f35645b.b();
            }

            {
                this.f35645b = r1;
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35644a, false, 26357, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35644a, false, 26357, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 1) {
                    this.f35645b.a();
                }
            }
        });
        this.f35639e.a(this);
    }
}
