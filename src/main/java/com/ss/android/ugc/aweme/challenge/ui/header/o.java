package com.ss.android.ugc.aweme.challenge.ui.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.util.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.ui.i;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020#H\u0002J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002R\u0014\u0010\t\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/ui/header/NormalChallengeDetailHeaderView;", "Lcom/ss/android/ugc/aweme/challenge/ui/header/AbsCommonHeaderView;", "context", "Landroid/content/Context;", "headerParam", "Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/challenge/ui/header/HeaderParam;Landroid/util/AttributeSet;)V", "attrsResId", "", "getAttrsResId", "()I", "buttonResId", "getButtonResId", "layoutResId", "getLayoutResId", "mAnnounceContainer", "Landroid/view/View;", "mAnnounceContent", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mAnnounceDivider", "mAnnounceExpandContainer", "Landroid/view/ViewGroup;", "mAnnounceExpandIv", "Landroid/widget/ImageView;", "mAnnounceExpandTv", "mAnnounceTitle", "mAttrsContainer", "mAttrsFirst", "mAttrsLink", "mButtonContainer", "mCollectButtonBlock", "Lcom/ss/android/ugc/aweme/challenge/ui/header/CollectButtonBlock;", "bindData", "", "data", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "initAttrs", "initButton", "initHeaderElements", "initView", "relayoutButton", "updateAnnouncement", "updateAttrs", "updateButton", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o extends a {
    public static ChangeQuickRedirect g;
    View h;
    View i;
    private DmtTextView j;
    private DmtTextView k;
    private View l;
    private DmtTextView m;
    private ViewGroup n;
    private DmtTextView o;
    private DmtTextView p;
    private ImageView q;
    private View r;
    private g s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final /* synthetic */ class a extends FunctionReference implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(o oVar) {
            super(0, oVar);
        }

        public final String getName() {
            return "relayoutButton";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26418, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(o.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26418, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "relayoutButton()V";
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 26417(0x6731, float:3.7018E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                r5 = 0
                r6 = 26417(0x6731, float:3.7018E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                java.lang.Object r1 = r9.receiver
                com.ss.android.ugc.aweme.challenge.ui.header.o r1 = (com.ss.android.ugc.aweme.challenge.ui.header.o) r1
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.challenge.ui.header.o.g
                r5 = 0
                r6 = 26414(0x672e, float:3.7014E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r1
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0049
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.challenge.ui.header.o.g
                r5 = 0
                r6 = 26414(0x672e, float:3.7014E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0049:
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>()
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                android.view.View r5 = r1.h
                if (r5 != 0) goto L_0x0061
                java.lang.String r6 = "mAttrsContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            L_0x0061:
                r5.getGlobalVisibleRect(r2)
                android.view.View r5 = r1.i
                if (r5 != 0) goto L_0x006d
                java.lang.String r6 = "mButtonContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            L_0x006d:
                r5.getGlobalVisibleRect(r3)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r1.getMAvatar()
                r5.getGlobalVisibleRect(r4)
                int r3 = r3.top
                int r5 = r2.bottom
                int r3 = r3 - r5
                android.view.View r5 = r1.i
                if (r5 != 0) goto L_0x0085
                java.lang.String r6 = "mButtonContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            L_0x0085:
                android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
                if (r5 == 0) goto L_0x00e2
                android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
                r6 = 4620693217682128896(0x4020000000000000, double:8.0)
                int r6 = com.ss.android.ugc.aweme.base.utils.u.a((double) r6)
                r7 = 8
                r8 = 3
                if (r3 < r6) goto L_0x00b8
                int r3 = r4.bottom
                int r2 = r2.bottom
                android.view.View r4 = r1.i
                if (r4 != 0) goto L_0x00a5
                java.lang.String r6 = "mButtonContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            L_0x00a5:
                int r4 = r4.getHeight()
                int r2 = r2 + r4
                if (r3 <= r2) goto L_0x00b8
                r2 = 2131165500(0x7f07013c, float:1.7945219E38)
                r5.addRule(r7, r2)
                r5.addRule(r8, r0)
                r5.topMargin = r0
                goto L_0x00d3
            L_0x00b8:
                android.view.View r2 = r1.h
                if (r2 != 0) goto L_0x00c1
                java.lang.String r3 = "mAttrsContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x00c1:
                int r2 = r2.getId()
                r5.addRule(r8, r2)
                r5.addRule(r7, r0)
                r2 = 4625196817309499392(0x4030000000000000, double:16.0)
                int r0 = com.ss.android.ugc.aweme.base.utils.u.a((double) r2)
                r5.topMargin = r0
            L_0x00d3:
                android.view.View r0 = r1.i
                if (r0 != 0) goto L_0x00dc
                java.lang.String r1 = "mButtonContainer"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x00dc:
                android.view.ViewGroup$LayoutParams r5 = (android.view.ViewGroup.LayoutParams) r5
                r0.setLayoutParams(r5)
                return
            L_0x00e2:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.header.o.a.invoke():void");
        }
    }

    public final int getLayoutResId() {
        return C0906R.layout.h5;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26406, new Class[0], Void.TYPE);
            return;
        }
        l iVar = new i();
        if (PatchProxy.isSupport(new Object[]{iVar}, this, a.f2819a, false, 26313, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, a.f2819a, false, 26313, new Class[]{l.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(iVar, "delegate");
        this.f2822c.add(iVar);
    }

    public final int getAttrsResId() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26404, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 26404, new Class[0], Integer.TYPE)).intValue();
        }
        switch (p.f35678a[getMHeaderParam().f35671c.ordinal()]) {
            case 1:
                return C0906R.layout.gx;
            case 2:
                return C0906R.layout.gx;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getButtonResId() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26405, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 26405, new Class[0], Integer.TYPE)).intValue();
        }
        switch (p.f35679b[getMHeaderParam().f35672d.ordinal()]) {
            case 1:
                return C0906R.layout.gz;
            case 2:
                return C0906R.layout.gz;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26407, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26409, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26409, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.g6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.attrs_container)");
            ViewStub viewStub = (ViewStub) findViewById;
            viewStub.setLayoutResource(getAttrsResId());
            View inflate = viewStub.inflate();
            View findViewById2 = inflate.findViewById(C0906R.id.g9);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "container.findViewById(R.id.attrs_link)");
            this.j = (DmtTextView) findViewById2;
            View findViewById3 = inflate.findViewById(C0906R.id.g7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "container.findViewById(R.id.attrs_first)");
            this.k = (DmtTextView) findViewById3;
            Intrinsics.checkExpressionValueIsNotNull(inflate, "container");
            this.h = inflate;
        }
        if (PatchProxy.isSupport(new Object[0], this, g, false, 26410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 26410, new Class[0], Void.TYPE);
        } else {
            View findViewById4 = findViewById(C0906R.id.pu);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.button_container)");
            ViewStub viewStub2 = (ViewStub) findViewById4;
            viewStub2.setLayoutResource(getButtonResId());
            View inflate2 = viewStub2.inflate();
            View findViewById5 = inflate2.findViewById(C0906R.id.u7);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "container.findViewById(R.id.collect_container)");
            View findViewById6 = inflate2.findViewById(C0906R.id.b01);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "container.findViewById(R.id.iv_collect)");
            this.s = new g(findViewById5, (CheckableImageView) findViewById6, (DmtTextView) inflate2.findViewById(C0906R.id.d_o));
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "container");
            this.i = inflate2;
        }
        super.b();
    }

    public final void a(@NotNull ChallengeDetail challengeDetail) {
        String str;
        if (PatchProxy.isSupport(new Object[]{challengeDetail}, this, g, false, 26408, new Class[]{ChallengeDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challengeDetail}, this, g, false, 26408, new Class[]{ChallengeDetail.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            super.a(challengeDetail);
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26411, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26411, new Class[0], Void.TYPE);
            } else {
                if (!com.ss.android.g.a.a()) {
                    Challenge mChallenge = getMChallenge();
                    DmtTextView dmtTextView = this.j;
                    if (dmtTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAttrsLink");
                    }
                    i.a(mChallenge, dmtTextView);
                }
                DmtTextView dmtTextView2 = this.k;
                if (dmtTextView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAttrsFirst");
                }
                dmtTextView2.setText(getContext().getString(C0906R.string.rp, new Object[]{b.a(getMChallenge().getDisplayCount())}));
            }
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26413, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26413, new Class[0], Void.TYPE);
            } else {
                g gVar = this.s;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCollectButtonBlock");
                }
                gVar.a(getMChallenge(), getMHeaderParam());
                View view = this.i;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mButtonContainer");
                }
                view.post(new q(new a(this)));
            }
            if (PatchProxy.isSupport(new Object[0], this, g, false, 26412, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, g, false, 26412, new Class[0], Void.TYPE);
                return;
            }
            if (com.ss.android.g.a.a()) {
                ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
                String str2 = null;
                if (challengeAnnouncement != null) {
                    str = challengeAnnouncement.getTitle();
                } else {
                    str = null;
                }
                if (challengeAnnouncement != null) {
                    str2 = challengeAnnouncement.getContent();
                }
                int i2 = 8;
                if (challengeAnnouncement != null) {
                    CharSequence charSequence = str;
                    if (!TextUtils.isEmpty(charSequence) && !TextUtils.isEmpty(str2)) {
                        if (this.l == null) {
                            View inflate = ((ViewStub) findViewById(C0906R.id.dvm)).inflate();
                            if (inflate != null) {
                                this.l = (ViewGroup) inflate;
                                View findViewById = findViewById(C0906R.id.rn);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.challenge_announcement_title)");
                                this.m = (DmtTextView) findViewById;
                                View findViewById2 = findViewById(C0906R.id.rk);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.challe…ncement_expand_container)");
                                this.n = (ViewGroup) findViewById2;
                                View findViewById3 = findViewById(C0906R.id.ri);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.challenge_announcement_desc)");
                                this.o = (DmtTextView) findViewById3;
                                View findViewById4 = findViewById(C0906R.id.rj);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.challenge_announcement_expand)");
                                this.p = (DmtTextView) findViewById4;
                                View findViewById5 = findViewById(C0906R.id.rm);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.challe…e_announcement_expand_iv)");
                                this.q = (ImageView) findViewById5;
                                View findViewById6 = findViewById(C0906R.id.bbt);
                                Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.line_divider)");
                                this.r = findViewById6;
                                if (com.ss.android.g.a.c()) {
                                    DmtTextView dmtTextView3 = this.m;
                                    if (dmtTextView3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mAnnounceTitle");
                                    }
                                    dmtTextView3.setTextColor(getResources().getColor(C0906R.color.yn));
                                    View view2 = this.r;
                                    if (view2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mAnnounceDivider");
                                    }
                                    view2.setBackgroundColor(getResources().getColor(C0906R.color.dh));
                                } else if (com.ss.android.g.a.b()) {
                                    ImageView imageView = this.q;
                                    if (imageView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("mAnnounceExpandIv");
                                    }
                                    imageView.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839554));
                                }
                                DmtTextView dmtTextView4 = this.m;
                                if (dmtTextView4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("mAnnounceTitle");
                                }
                                dmtTextView4.setFontType(c.f20595b);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                            }
                        }
                        View view3 = this.r;
                        if (view3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAnnounceDivider");
                        }
                        if (!TextUtils.isEmpty(getMChallenge().getDesc())) {
                            i2 = 0;
                        }
                        view3.setVisibility(i2);
                        DmtTextView dmtTextView5 = this.m;
                        if (dmtTextView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAnnounceTitle");
                        }
                        dmtTextView5.setText(charSequence);
                        View view4 = this.l;
                        if (view4 == null) {
                            Intrinsics.throwNpe();
                        }
                        view4.setVisibility(0);
                        Challenge mChallenge2 = getMChallenge();
                        DmtTextView dmtTextView6 = this.o;
                        if (dmtTextView6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAnnounceContent");
                        }
                        TextView textView = dmtTextView6;
                        ViewGroup viewGroup = this.n;
                        if (viewGroup == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAnnounceExpandContainer");
                        }
                        DmtTextView dmtTextView7 = this.p;
                        if (dmtTextView7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAnnounceExpandTv");
                        }
                        TextView textView2 = dmtTextView7;
                        ImageView imageView2 = this.q;
                        if (imageView2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAnnounceExpandIv");
                        }
                        com.ss.android.ugc.aweme.challenge.ui.b.a(mChallenge2, textView, viewGroup, textView2, imageView2, true);
                    }
                }
                View view5 = this.l;
                if (view5 != null) {
                    view5.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private o(@NotNull Context context, @Nullable j jVar, @Nullable AttributeSet attributeSet) {
        super(context, jVar, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public /* synthetic */ o(Context context, j jVar, AttributeSet attributeSet, int i2) {
        this(context, jVar, null);
    }
}
