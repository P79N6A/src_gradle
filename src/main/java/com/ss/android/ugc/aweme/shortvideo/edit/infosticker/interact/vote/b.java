package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.vesdk.p;
import java.io.File;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0015H\u0002J\b\u0010!\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0006\u0010$\u001a\u00020\u0015J\b\u0010%\u001a\u0004\u0018\u00010&J\b\u0010'\u001a\u00020\u0006H\u0014J\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0006\u0010)\u001a\u00020\u000fJ\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010,\u001a\u00020\u000fH\u0016J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020&H\u0002J\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020+H\u0016J\u0006\u00100\u001a\u00020\u0015J\u0012\u00101\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010&H\u0016J\u000e\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0004J\u0010\u00104\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0004H\u0016J\u001a\u00105\u001a\u00020\u00152\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u00020\u000fH\u0016J\u0006\u00109\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VoteStickerController;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/controller/InteractStickerController;", "()V", "ATTR_KEY", "", "HEIGHT_LINE_MARGIN", "", "HEIGHT_LINE_ONE", "HEIGHT_LINE_THREE", "HEIGHT_LINE_TWO", "PATH_KEY_END", "PATH_KEY_START", "PATH_REG", "mStickerId", "mVoteIsShowing", "", "mVoteLayout", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerLayout;", "mVoteStruct", "Lcom/ss/android/ugc/aweme/sticker/data/VoteStruct;", "bindVoteContentView", "", "view", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView;", "bindVoteLayout", "votingStickerLayout", "clickVote", "createNewPathSegment", "createVoteStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VoteStickerView;", "context", "Landroid/content/Context;", "dealWithLayoutDismiss", "dealWithLayoutShow", "dealWithOldPath", "stickerPath", "destory", "getInteractStickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "getInteractType", "getStickerId", "getStickerIsShowing", "getStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/view/InteractStickerBaseView;", "hasStickerInfo", "initVoteViewBySticker", "stickerStruct", "removeStickerView", "resume", "setInteractStickerStruct", "setStickerId", "stickerId", "setStickerPath", "setVEEditor", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "isPhotoType", "showEditVoteLayout", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b {
    public static ChangeQuickRedirect u;
    private final String A = "pi_start";
    private final String B = "pi_end";
    private final String C = (this.A + "(.*?)" + this.B);
    private final int D = 160;
    private final int E = 170;
    private final int F = 190;
    private final int G = 24;
    VoteStruct v;
    public String w;
    public VotingStickerLayout x;
    public boolean y;
    private final String z = "poll_sticker_id";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67370a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f67371b;

        a(b bVar) {
            this.f67371b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67370a, false, 77134, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67370a, false, 77134, new Class[0], Void.TYPE);
                return;
            }
            this.f67371b.j.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "votingStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.b$b  reason: collision with other inner class name */
    public static final class C0714b extends Lambda implements Function1<VotingStickerView, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0714b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VotingStickerView) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable VotingStickerView votingStickerView) {
            VoteStruct voteStruct;
            VotingStickerView votingStickerView2 = votingStickerView;
            if (PatchProxy.isSupport(new Object[]{votingStickerView2}, this, changeQuickRedirect, false, 77135, new Class[]{VotingStickerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{votingStickerView2}, this, changeQuickRedirect, false, 77135, new Class[]{VotingStickerView.class}, Void.TYPE);
                return;
            }
            this.this$0.k();
            b bVar = this.this$0;
            if (PatchProxy.isSupport(new Object[]{votingStickerView2}, bVar, b.u, false, 77120, new Class[]{VotingStickerView.class}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{votingStickerView2}, bVar2, b.u, false, 77120, new Class[]{VotingStickerView.class}, Void.TYPE);
            } else {
                if (bVar.j == null) {
                    bVar.d();
                }
                if (bVar.j instanceof c) {
                    if (votingStickerView2 != null) {
                        voteStruct = votingStickerView.getVoteStruct();
                    } else {
                        voteStruct = null;
                    }
                    bVar.v = voteStruct;
                    if (votingStickerView2 != null) {
                        votingStickerView.b();
                    }
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar = bVar.j;
                    if (cVar != null) {
                        ((c) cVar).a(votingStickerView2);
                        bVar.j.post(new a(bVar));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                    }
                }
            }
            if (this.this$0.j != null && (this.this$0.j instanceof c)) {
                this.this$0.j.post(new Runnable(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f67372a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ C0714b f67373b;

                    {
                        this.f67373b = r1;
                    }

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f67372a, false, 77136, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f67372a, false, 77136, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f67373b.this$0.j.b();
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "votingStickerView", "Lcom/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VotingStickerView;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<VotingStickerView, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VotingStickerLayout $votingStickerLayout;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, VotingStickerLayout votingStickerLayout) {
            super(1);
            this.this$0 = bVar;
            this.$votingStickerLayout = votingStickerLayout;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((VotingStickerView) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable VotingStickerView votingStickerView) {
            if (PatchProxy.isSupport(new Object[]{votingStickerView}, this, changeQuickRedirect, false, 77137, new Class[]{VotingStickerView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{votingStickerView}, this, changeQuickRedirect, false, 77137, new Class[]{VotingStickerView.class}, Void.TYPE);
                return;
            }
            if (this.this$0.j == null || !(this.this$0.j instanceof c)) {
                VotingStickerLayout votingStickerLayout = this.this$0.x;
                if (votingStickerLayout != null) {
                    votingStickerLayout.a();
                }
            } else {
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar = this.this$0.j;
                if (cVar != null) {
                    float b2 = ((c) cVar).b(votingStickerView);
                    VotingStickerLayout votingStickerLayout2 = this.$votingStickerLayout;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.h.f67369f += b2;
                    }
                    VotingStickerLayout votingStickerLayout3 = this.this$0.x;
                    if (votingStickerLayout3 != null) {
                        votingStickerLayout3.a();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67374a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f67375b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InteractStickerStruct f67376c;

        d(b bVar, InteractStickerStruct interactStickerStruct) {
            this.f67375b = bVar;
            this.f67376c = interactStickerStruct;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67374a, false, 77138, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67374a, false, 77138, new Class[0], Void.TYPE);
                return;
            }
            b.super.a(this.f67376c);
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar = this.f67375b.j;
            Intrinsics.checkExpressionValueIsNotNull(cVar, "mStickerView");
            cVar.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/vote/VoteStickerController$showEditVoteLayout$1$1"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67377a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f67378b;

        e(b bVar) {
            this.f67378b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f67377a, false, 77139, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f67377a, false, 77139, new Class[0], Void.TYPE);
                return;
            }
            VotingStickerLayout votingStickerLayout = this.f67378b.x;
            if (votingStickerLayout != null) {
                a aVar = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
                votingStickerLayout.a(null, aVar);
            }
        }
    }

    public final boolean g() {
        if (this.v != null) {
            return true;
        }
        return false;
    }

    private final void m() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 77123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 77123, new Class[0], Void.TYPE);
            return;
        }
        this.y = true;
        if (this.r != null && (this.r instanceof VEVideoPublishEditActivity)) {
            Context context = this.r;
            if (context != null) {
                ((VEVideoPublishEditActivity) context).a(false, false);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
            }
        }
    }

    private final String n() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 77131, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, u, false, 77131, new Class[0], String.class);
        }
        return this.A + UUID.randomUUID().toString() + this.B;
    }

    @Nullable
    public final InteractStickerStruct i() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 77119, new Class[0], InteractStickerStruct.class)) {
            return (InteractStickerStruct) PatchProxy.accessDispatch(new Object[0], this, u, false, 77119, new Class[0], InteractStickerStruct.class);
        }
        InteractStickerStruct a2 = super.a(3);
        if (a2 == null) {
            return null;
        }
        a2.setIndex(3);
        HashMap hashMap = new HashMap();
        hashMap.put(this.z, this.w);
        a2.setAttr(com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().toJson((Object) hashMap));
        a2.setIndex(1);
        a2.setVoteStruct(this.v);
        return a2;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 77122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 77122, new Class[0], Void.TYPE);
        } else if (this.v != null) {
            l();
        } else {
            m();
            VotingStickerLayout votingStickerLayout = this.x;
            if (votingStickerLayout != null) {
                FrameLayout frameLayout = this.f67254c;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mStickerParentLayout");
                FrameLayout frameLayout2 = this.f67254c;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mStickerParentLayout");
                votingStickerLayout.a((float) frameLayout.getHeight(), (float) frameLayout2.getTop());
            }
            VotingStickerLayout votingStickerLayout2 = this.x;
            if (votingStickerLayout2 != null) {
                votingStickerLayout2.post(new e(this));
            }
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 77124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 77124, new Class[0], Void.TYPE);
            return;
        }
        this.y = false;
        if (this.r != null && (this.r instanceof VEVideoPublishEditActivity)) {
            Context context = this.r;
            if (context != null) {
                ((VEVideoPublishEditActivity) context).a(true, false);
                Context context2 = this.r;
                if (context2 != null) {
                    ((VEVideoPublishEditActivity) context2).U();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
            }
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 77125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 77125, new Class[0], Void.TYPE);
            return;
        }
        m();
        VotingStickerLayout votingStickerLayout = this.x;
        if (votingStickerLayout != null) {
            FrameLayout frameLayout = this.f67254c;
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mStickerParentLayout");
            FrameLayout frameLayout2 = this.f67254c;
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mStickerParentLayout");
            votingStickerLayout.a((float) frameLayout.getHeight(), (float) frameLayout2.getTop());
        }
        f();
        if (this.j instanceof c) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar = this.j;
            if (cVar != null) {
                VotingStickerView baseView = ((c) cVar).getBaseView();
                com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar2 = this.j;
                if (cVar2 != null) {
                    ((c) cVar2).i();
                    a aVar = new a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63);
                    aVar.g = baseView.getLastTouchedIndex();
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar3 = this.j;
                    Intrinsics.checkExpressionValueIsNotNull(cVar3, "mStickerView");
                    aVar.f67367d = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.e(cVar3.getRotateAngle());
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar4 = this.j;
                    Intrinsics.checkExpressionValueIsNotNull(cVar4, "mStickerView");
                    View contentView = cVar4.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView, "mStickerView.contentView");
                    aVar.f67365b = contentView.getScaleX();
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar5 = this.j;
                    Intrinsics.checkExpressionValueIsNotNull(cVar5, "mStickerView");
                    View contentView2 = cVar5.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView2, "mStickerView.contentView");
                    aVar.f67366c = contentView2.getScaleY();
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar6 = this.j;
                    Intrinsics.checkExpressionValueIsNotNull(cVar6, "mStickerView");
                    View contentView3 = cVar6.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView3, "mStickerView.contentView");
                    float x2 = contentView3.getX();
                    FrameLayout frameLayout3 = this.f67254c;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mStickerParentLayout");
                    aVar.f67368e = x2 + frameLayout3.getX();
                    com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar7 = this.j;
                    Intrinsics.checkExpressionValueIsNotNull(cVar7, "mStickerView");
                    View contentView4 = cVar7.getContentView();
                    Intrinsics.checkExpressionValueIsNotNull(contentView4, "mStickerView.contentView");
                    float y2 = contentView4.getY();
                    FrameLayout frameLayout4 = this.f67254c;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "mStickerParentLayout");
                    aVar.f67369f = y2 + frameLayout4.getY();
                    VotingStickerLayout votingStickerLayout2 = this.x;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.a(baseView, aVar);
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
            }
        }
    }

    private final void b(InteractStickerStruct interactStickerStruct) {
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, this, u, false, 77127, new Class[]{InteractStickerStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, this, u, false, 77127, new Class[]{InteractStickerStruct.class}, Void.TYPE);
            return;
        }
        this.v = interactStickerStruct.getVoteStruct();
        d();
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar = this.j;
        if (cVar != null) {
            ((c) cVar).a(this.v);
            if (this.l != null) {
                this.l.b();
            }
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar2 = this.j;
            Intrinsics.checkExpressionValueIsNotNull(cVar2, "mStickerView");
            cVar2.setVisibility(4);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VoteStickerView");
    }

    public final void a(@Nullable InteractStickerStruct interactStickerStruct) {
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, this, u, false, 77126, new Class[]{InteractStickerStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, this, u, false, 77126, new Class[]{InteractStickerStruct.class}, Void.TYPE);
            return;
        }
        if (interactStickerStruct != null) {
            b(interactStickerStruct);
        }
        if (this.j != null) {
            this.j.postDelayed(new d(this, interactStickerStruct), 300);
        }
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c a(@NotNull Context context) {
        c cVar;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, u, false, 77116, new Class[]{Context.class}, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c) PatchProxy.accessDispatch(new Object[]{context2}, this, u, false, 77116, new Class[]{Context.class}, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c.class);
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (PatchProxy.isSupport(new Object[]{context2}, this, u, false, 77117, new Class[]{Context.class}, c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[]{context2}, this, u, false, 77117, new Class[]{Context.class}, c.class);
        } else {
            c cVar2 = new c(context2);
            cVar2.setLockMode(true);
            cVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            cVar = cVar2;
        }
        return cVar;
    }

    public final void a(@NotNull String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, u, false, 77129, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, u, false, 77129, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "stickerPath");
        if (!StringUtils.isEmpty(str)) {
            CharSequence charSequence = str;
            if (!StringsKt.contains$default(charSequence, (CharSequence) this.A, false, 2, (Object) null) || !StringsKt.contains$default(charSequence, (CharSequence) this.B, false, 2, (Object) null)) {
                String str3 = File.separator;
                Intrinsics.checkExpressionValueIsNotNull(str3, "File.separator");
                if (StringsKt.endsWith$default(str, str3, false, 2, null)) {
                    super.a(str + n());
                    return;
                }
                super.a(str + n());
            } else {
                if (PatchProxy.isSupport(new Object[]{str}, this, u, false, 77130, new Class[]{String.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{str}, this, u, false, 77130, new Class[]{String.class}, String.class);
                } else {
                    str2 = new Regex(this.C).replace(charSequence, n());
                }
                super.a(str2);
            }
        }
    }

    public final boolean a(@NotNull com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, u, false, 77128, new Class[]{com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, this, u, false, 77128, new Class[]{com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.c.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "view");
        if (cVar2 instanceof c) {
            super.a(cVar);
            this.v = null;
        }
        return false;
    }

    public final void a(@Nullable p pVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{pVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, u, false, 77133, new Class[]{p.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar, Byte.valueOf(z2)}, this, u, false, 77133, new Class[]{p.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(pVar, z2);
        if (pVar != null) {
            float f2 = (float) pVar.d().f77891b;
            FrameLayout frameLayout = this.f67254c;
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mStickerParentLayout");
            if (f2 > UIUtils.dip2Px(frameLayout.getContext(), (float) (this.F + this.G))) {
                VotingStickerLayout votingStickerLayout = this.x;
                if (votingStickerLayout != null) {
                    votingStickerLayout.setMaxLine(3);
                }
            } else {
                FrameLayout frameLayout2 = this.f67254c;
                Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mStickerParentLayout");
                if (f2 > UIUtils.dip2Px(frameLayout2.getContext(), (float) (this.E + this.G))) {
                    VotingStickerLayout votingStickerLayout2 = this.x;
                    if (votingStickerLayout2 != null) {
                        votingStickerLayout2.setMaxLine(2);
                    }
                } else {
                    FrameLayout frameLayout3 = this.f67254c;
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "mStickerParentLayout");
                    if (f2 > UIUtils.dip2Px(frameLayout3.getContext(), (float) (this.D + this.G))) {
                        VotingStickerLayout votingStickerLayout3 = this.x;
                        if (votingStickerLayout3 != null) {
                            votingStickerLayout3.setMaxLine(1);
                        }
                    }
                }
            }
        }
    }
}
