package com.ss.android.ugc.aweme.forward.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.forward.b.c;
import com.ss.android.ugc.aweme.forward.b.f;
import com.ss.android.ugc.aweme.forward.f.b;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.j;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0006\u0010\u001b\u001a\u00020\u0012J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/forward/presenter/StoryPresenter;", "Lcom/ss/android/ugc/aweme/forward/presenter/BaseForwardPresenter;", "view", "Lcom/ss/android/ugc/aweme/forward/contract/IForwardVideoView;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "(Lcom/ss/android/ugc/aweme/forward/contract/IForwardVideoView;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mCoverView", "Landroid/widget/ImageView;", "mOriginAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mPlayer", "Lcom/ss/android/ugc/aweme/video/PlayerManager;", "bind", "", "aweme", "eventType", "tabName", "getPlayer", "isViewValid", "", "sourceId", "onDetach", "onExpandVideo", "onFollowFeedDetailEvent", "event", "Lcom/ss/android/ugc/aweme/newfollow/event/FollowFeedDetailEvent;", "onPause", "showOriginDetail", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n extends b {
    public static ChangeQuickRedirect l;
    private o m;
    private Aweme n;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45494, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (h() || i()) {
            this.f3281b.m();
            return;
        }
        if (this.m != null) {
            g.f().b();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45495, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        c.b bVar = this.f3281b;
        if (bVar != null) {
            ((f) bVar).a(true);
            this.f3281b.m();
            c.b bVar2 = this.f3281b;
            if (bVar2 != null) {
                ((f) bVar2).b(false);
                if (this.m != null) {
                    if (this.f3282c != null) {
                        Aweme aweme = this.f3282c;
                        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
                        if (aweme.getAwemeType() == 13) {
                            g f2 = g.f();
                            Aweme aweme2 = this.f3282c;
                            Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
                            f2.b(aweme2.getForwardItem());
                        } else {
                            Aweme aweme3 = this.f3282c;
                            Intrinsics.checkExpressionValueIsNotNull(aweme3, "mAweme");
                            if (aweme3.getAwemeType() == 0) {
                                g.f().b(this.f3282c);
                            }
                        }
                    }
                    j.a().a(this.m);
                    this.m = null;
                }
                k();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.forward.contract.IForwardVideoView");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.forward.contract.IForwardVideoView");
    }

    public final void g() {
        o oVar;
        o oVar2;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45500, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3282c != null) {
            Aweme aweme = this.f3282c;
            Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
            if (aweme.getForwardItem() != null) {
                d j = j();
                if (j != null) {
                    bo boVar = j.f57413d;
                    if (boVar != null) {
                        boVar.a(256);
                    }
                }
                c.b bVar = this.f3281b;
                Intrinsics.checkExpressionValueIsNotNull(bVar, "mView");
                a b2 = bVar.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "mView.containerProvider");
                String e2 = b2.e();
                Aweme aweme2 = this.f3282c;
                Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
                String a2 = b.a(e2, aweme2.getAid());
                Aweme aweme3 = this.f3282c;
                if (PatchProxy.isSupport(new Object[0], this, l, false, 45497, new Class[0], o.class)) {
                    oVar = (o) PatchProxy.accessDispatch(new Object[0], this, l, false, 45497, new Class[0], o.class);
                } else {
                    if (this.m == null) {
                        d j2 = j();
                        if (j2 == null || j2.i == null) {
                            oVar2 = j.a().b();
                        } else {
                            oVar2 = j2.i;
                        }
                        this.m = oVar2;
                    }
                    oVar = this.m;
                    if (oVar == null) {
                        Intrinsics.throwNpe();
                    }
                }
                com.ss.android.ugc.aweme.forward.f.c.a().a(a2, new b(a2, aweme3, oVar));
                c.b bVar2 = this.f3281b;
                Intrinsics.checkExpressionValueIsNotNull(bVar2, "mView");
                OriginDetailActivity.a(bVar2.c(), this.f3282c, this.f3284e, a2, this.f3285f);
            }
        }
    }

    @Subscribe
    public final void onFollowFeedDetailEvent(@NotNull com.ss.android.ugc.aweme.newfollow.c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, l, false, 45496, new Class[]{com.ss.android.ugc.aweme.newfollow.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, l, false, 45496, new Class[]{com.ss.android.ugc.aweme.newfollow.c.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "event");
        if (this.f3281b != null) {
            c.b bVar2 = this.f3281b;
            Intrinsics.checkExpressionValueIsNotNull(bVar2, "mView");
            if (bVar2.g() && bVar.f57083b != null) {
                Aweme aweme = bVar.f57083b;
                Intrinsics.checkExpressionValueIsNotNull(aweme, "event.aweme");
                String aid = aweme.getAid();
                Aweme aweme2 = this.f3282c;
                Intrinsics.checkExpressionValueIsNotNull(aweme2, "mAweme");
                if (!(!Intrinsics.areEqual((Object) aid, (Object) aweme2.getAid()))) {
                    switch (bVar.f57082a) {
                        case 1:
                            c.b bVar3 = this.f3281b;
                            if (bVar3 != null) {
                                ((f) bVar3).a(bVar.f57084c);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.forward.contract.IForwardVideoView");
                        case 2:
                            a(0);
                            break;
                    }
                }
            }
        }
    }

    public final void a(@NotNull Aweme aweme, @NotNull String str, @NotNull String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, this, l, false, 45493, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, this, l, false, 45493, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
        Intrinsics.checkParameterIsNotNull(str3, "eventType");
        Intrinsics.checkParameterIsNotNull(str4, "tabName");
        super.a(aweme, str, str2);
        this.n = aweme.getForwardItem();
    }
}
