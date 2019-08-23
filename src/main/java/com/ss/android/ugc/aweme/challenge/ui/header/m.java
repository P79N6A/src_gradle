package com.ss.android.ugc.aweme.challenge.ui.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0002J\b\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020(H\u0002J\u0018\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\fH\u0002J\b\u0010,\u001a\u00020 H\u0002J\b\u0010-\u001a\u00020 H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u000f8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u000f8TX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/LargeChallengeDetailHeaderView;", "Lcom/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView;", "context", "Landroid/content/Context;", "headerParam", "Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;Landroid/util/AttributeSet;)V", "attrsContainer", "Landroid/view/View;", "attrsFirst", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "attrsForth", "attrsResId", "", "getAttrsResId", "()I", "attrsSecond", "attrsThird", "avatarTag", "buttonResId", "getButtonResId", "collectButtonBlock", "Lcom/ss/android/ugc/aweme/challenge/ui/header/CollectButtonBlock;", "layoutResId", "getLayoutResId", "transformContainer", "transformIv", "Lcom/ss/android/ugc/aweme/music/ui/CheckableImageView;", "transformTv", "bindData", "", "data", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "initAttrs", "initButton", "initView", "sendTransformEvent", "event", "", "showAttrs", "index", "attrsTv", "updateAttrs", "updateAvatarTag", "updateCollect", "updateTransform", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m extends a {
    public static ChangeQuickRedirect g;
    private DmtTextView h;
    private View i;
    private DmtTextView j;
    private DmtTextView k;
    private DmtTextView l;
    private DmtTextView m;
    private View n;
    private CheckableImageView o;
    private DmtTextView p;
    private g q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f35674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f35675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ChallengeTransform f35676c;

        a(m mVar, ChallengeTransform challengeTransform) {
            this.f35675b = mVar;
            this.f35676c = challengeTransform;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f35674a, false, 26403, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f35674a, false, 26403, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f35675b.a("challenge_transform_button_click");
            if (b.a(this.f35676c.getAction()) && !g.a(this.f35675b.getContext(), this.f35676c.getAction(), true)) {
                g.a(this.f35675b.getContext(), this.f35676c.getAction(), "");
            }
        }
    }

    public final int getAttrsResId() {
        return C0906R.layout.gw;
    }

    public final int getLayoutResId() {
        return C0906R.layout.h4;
    }

    public final int getButtonResId() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26390, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 26390, new Class[0], Integer.TYPE)).intValue();
        }
        switch (n.f35677a[getMHeaderParam().f35672d.ordinal()]) {
            case 1:
                return C0906R.layout.gy;
            case 2:
                return C0906R.layout.h0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26391, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.f6if);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.avatar_tag)");
        this.h = (DmtTextView) findViewById;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26393, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26393, new Class[0], Void.TYPE);
        } else {
            View findViewById2 = findViewById(C0906R.id.g6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.attrs_container)");
            ViewStub viewStub = (ViewStub) findViewById2;
            viewStub.setLayoutResource(getAttrsResId());
            View inflate = viewStub.inflate();
            Intrinsics.checkExpressionValueIsNotNull(inflate, "containerVs.apply { layo… = attrsResId }.inflate()");
            this.i = inflate;
            View view = this.i;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attrsContainer");
            }
            View findViewById3 = view.findViewById(C0906R.id.g7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "attrsContainer.findViewById(R.id.attrs_first)");
            this.j = (DmtTextView) findViewById3;
            View view2 = this.i;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attrsContainer");
            }
            View findViewById4 = view2.findViewById(C0906R.id.g_);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "attrsContainer.findViewById(R.id.attrs_second)");
            this.k = (DmtTextView) findViewById4;
            View view3 = this.i;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attrsContainer");
            }
            View findViewById5 = view3.findViewById(C0906R.id.ga);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "attrsContainer.findViewById(R.id.attrs_third)");
            this.l = (DmtTextView) findViewById5;
            View view4 = this.i;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("attrsContainer");
            }
            View findViewById6 = view4.findViewById(C0906R.id.g8);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "attrsContainer.findViewById(R.id.attrs_forth)");
            this.m = (DmtTextView) findViewById6;
        }
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26394, new Class[0], Void.TYPE);
        } else {
            View findViewById7 = findViewById(C0906R.id.pu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.button_container)");
            ViewStub viewStub2 = (ViewStub) findViewById7;
            viewStub2.setLayoutResource(getButtonResId());
            View inflate2 = viewStub2.inflate();
            View findViewById8 = inflate2.findViewById(C0906R.id.u7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "container.findViewById(R.id.collect_container)");
            View findViewById9 = inflate2.findViewById(C0906R.id.b01);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "container.findViewById(R.id.iv_collect)");
            this.q = new g(findViewById8, (CheckableImageView) findViewById9, (DmtTextView) inflate2.findViewById(C0906R.id.d_o));
            this.n = inflate2.findViewById(C0906R.id.d6a);
            if (this.n != null) {
                View findViewById10 = inflate2.findViewById(C0906R.id.b68);
                Intrinsics.checkExpressionValueIsNotNull(findViewById10, "container.findViewById(R.id.iv_transform)");
                this.o = (CheckableImageView) findViewById10;
                View findViewById11 = inflate2.findViewById(C0906R.id.dl4);
                Intrinsics.checkExpressionValueIsNotNull(findViewById11, "container.findViewById(R.id.tv_transform)");
                this.p = (DmtTextView) findViewById11;
            }
        }
        super.b();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, g, false, 26400, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, g, false, 26400, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(str2, (Map) d.a().a("challenge_id", getMChallenge().getCid()).a("content_type", getMChallenge().getContentType()).f34114b);
    }

    public final void a(@NotNull ChallengeDetail challengeDetail) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{challengeDetail}, this, g, false, 26392, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeDetail}, this, g, false, 26392, new Class[]{ChallengeDetail.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            super.a(challengeDetail);
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26395, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26395, new Class[0], Void.TYPE);
            } else if (b.a(getMChallenge().getProfileTagUrl())) {
                DmtTextView dmtTextView = this.h;
                if (dmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("avatarTag");
                }
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.h;
                if (dmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("avatarTag");
                }
                dmtTextView2.setText(getMChallenge().getProfileTagUrl());
            } else {
                DmtTextView dmtTextView3 = this.h;
                if (dmtTextView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("avatarTag");
                }
                dmtTextView3.setVisibility(8);
            }
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26396, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26396, new Class[0], Void.TYPE);
            } else {
                Collection attrs = getMChallenge().getAttrs();
                if (attrs == null || attrs.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    View view = this.i;
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("attrsContainer");
                    }
                    view.setVisibility(4);
                } else {
                    DmtTextView dmtTextView4 = this.j;
                    if (dmtTextView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("attrsFirst");
                    }
                    a(0, dmtTextView4);
                    DmtTextView dmtTextView5 = this.k;
                    if (dmtTextView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("attrsSecond");
                    }
                    a(1, dmtTextView5);
                    DmtTextView dmtTextView6 = this.l;
                    if (dmtTextView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("attrsThird");
                    }
                    a(2, dmtTextView6);
                    DmtTextView dmtTextView7 = this.m;
                    if (dmtTextView7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("attrsForth");
                    }
                    a(3, dmtTextView7);
                    View view2 = this.i;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("attrsContainer");
                    }
                    view2.setVisibility(0);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26398, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26398, new Class[0], Void.TYPE);
            } else {
                g gVar = this.q;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("collectButtonBlock");
                }
                gVar.a(getMChallenge(), getMHeaderParam());
            }
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26399, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26399, new Class[0], Void.TYPE);
                return;
            }
            if (this.n != null && a.f2820f.a(getMChallengeDetail())) {
                ChallengeTransform transfrom = getMChallenge().getTransfrom();
                CheckableImageView checkableImageView = this.o;
                if (checkableImageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("transformIv");
                }
                c.b(checkableImageView, transfrom.getIconUrlModel());
                DmtTextView dmtTextView8 = this.p;
                if (dmtTextView8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("transformTv");
                }
                dmtTextView8.setText(transfrom.getText());
                View view3 = this.n;
                if (view3 == null) {
                    Intrinsics.throwNpe();
                }
                view3.setOnClickListener(new a(this, transfrom));
                a("challenge_transform_button_show");
            }
        }
    }

    private final void a(int i2, DmtTextView dmtTextView) {
        DmtTextView dmtTextView2 = dmtTextView;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), dmtTextView2}, this, g, false, 26397, new Class[]{Integer.TYPE, DmtTextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), dmtTextView2}, this, g, false, 26397, new Class[]{Integer.TYPE, DmtTextView.class}, Void.TYPE);
            return;
        }
        List<String> attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i2);
        if (size >= 0) {
            dmtTextView2.setVisibility(0);
            dmtTextView2.setText(attrs.get(size));
            return;
        }
        dmtTextView2.setVisibility(4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private m(@NotNull Context context, @Nullable j jVar, @Nullable AttributeSet attributeSet) {
        super(context, jVar, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public /* synthetic */ m(Context context, j jVar, AttributeSet attributeSet, int i2) {
        this(context, jVar, null);
    }
}
