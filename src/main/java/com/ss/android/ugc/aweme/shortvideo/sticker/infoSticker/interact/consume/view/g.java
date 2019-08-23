package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0007H\u0014J\b\u0010!\u001a\u00020\u0003H\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010#\u001a\u00020$H\u0014J(\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010&\u001a\u00020$H\u0014J\b\u0010'\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteInteractStickerView;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "type", "", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "iVoteDetailSaveData", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "(ILandroid/content/Context;Landroid/view/View;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;)V", "dialogFragment", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment;", "getIVoteDetailSaveData", "()Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IVoteDetailSaveData;", "presenter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/VoteStickerPresenter;", "view", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteStickerView;", "consumeClickEvent", "", "curPts", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "createBubbleView", "getStickerType", "getView", "mobClick", "", "needConsumeClickEvent", "onClickPop", "openDetail", "updateInteractStickerParams", "updateStickerStruct", "struct", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends a {
    public static ChangeQuickRedirect j;
    public h k;
    public final e l;
    @NotNull
    public final com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g m;
    private VoteBottomSheetDialogFragment n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f70035b;

        a(g gVar) {
            this.f70035b = gVar;
        }

        public final void run() {
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, f70034a, false, 79702, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70034a, false, 79702, new Class[0], Void.TYPE);
                return;
            }
            e eVar = this.f70035b.l;
            h hVar = this.f70035b.k;
            if (hVar == null) {
                Intrinsics.throwNpe();
            }
            View voteView = hVar.getVoteView();
            List a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(this.f70035b.f70008d);
            if (a2 != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a2.get(0);
                if (normalTrackTimeStamp != null) {
                    Float scale = normalTrackTimeStamp.getScale();
                    if (scale != null) {
                        f2 = scale.floatValue();
                        eVar.a(voteView, f2);
                    }
                }
            }
            f2 = 1.0f;
            eVar.a(voteView, f2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteInteractStickerView$openDetail$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/VoteBottomSheetDialogFragment$OnDismissListener;", "onDismiss", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements VoteBottomSheetDialogFragment.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f70037b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f70036a, false, 79703, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70036a, false, 79703, new Class[0], Void.TYPE);
            }
        }

        b(g gVar) {
            this.f70037b = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f70039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f70040c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f70041d;

        c(g gVar, h hVar, d dVar) {
            this.f70039b = gVar;
            this.f70040c = hVar;
            this.f70041d = dVar;
        }

        public final void run() {
            VoteStruct voteStruct;
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, f70038a, false, 79704, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70038a, false, 79704, new Class[0], Void.TYPE);
                return;
            }
            h hVar = this.f70040c;
            InteractStickerStruct interactStickerStruct = this.f70039b.f70008d;
            if (interactStickerStruct != null) {
                voteStruct = interactStickerStruct.getVoteStruct();
            } else {
                voteStruct = null;
            }
            VoteStruct voteStruct2 = voteStruct;
            boolean g = ex.g(this.f70041d.f71634c);
            String str = this.f70041d.f71635d;
            if (str == null) {
                str = "";
            }
            hVar.a(voteStruct2, g, str, this.f70041d.m, this.f70039b.d());
            e eVar = this.f70039b.l;
            View voteView = this.f70040c.getVoteView();
            List a2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a(this.f70039b.f70008d);
            if (a2 != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) a2.get(0);
                if (normalTrackTimeStamp != null) {
                    Float scale = normalTrackTimeStamp.getScale();
                    if (scale != null) {
                        f2 = scale.floatValue();
                        eVar.a(voteView, f2);
                        this.f70040c.postInvalidate();
                    }
                }
            }
            f2 = 1.0f;
            eVar.a(voteView, f2);
            this.f70040c.postInvalidate();
        }
    }

    public final int c() {
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (r3 == null) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79693(0x1374d, float:1.11674E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 79693(0x1374d, float:1.11674E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r0 = "poll_prop_click"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            r4 = 0
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.f71629d
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = r3.f71628c
            goto L_0x004c
        L_0x004b:
            r3 = r4
        L_0x004c:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.f71630e
            goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x006e
            java.lang.String r4 = r3.f71627b
        L_0x006e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r9.d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3)
            if (r3 == 0) goto L_0x0084
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0086
        L_0x0084:
            java.lang.String r3 = ""
        L_0x0086:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.e():void");
    }

    @NotNull
    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 79694, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 79694, new Class[0], View.class);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.g);
        dmtTextView.setTextColor(this.g.getResources().getColor(C0906R.color.ao4));
        dmtTextView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) UIUtils.dip2Px(this.g, 1.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.g.getString(C0906R.string.c3k));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.g);
        autoRTLImageView.setImageResource(2130840351);
        linearLayout.addView(dmtTextView);
        linearLayout.addView(autoRTLImageView);
        return linearLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (r3 == null) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79695(0x1374f, float:1.11676E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 79695(0x1374f, float:1.11676E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r0 = "poll_prop_label_click"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            r4 = 0
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.f71629d
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = r3.f71628c
            goto L_0x004c
        L_0x004b:
            r3 = r4
        L_0x004c:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.f71630e
            goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x006e
            java.lang.String r4 = r3.f71627b
        L_0x006e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r9.d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3)
            if (r3 == 0) goto L_0x0084
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0086
        L_0x0084:
            java.lang.String r3 = ""
        L_0x0086:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r3 == null) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79696(0x13750, float:1.11678E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 79696(0x13750, float:1.11678E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.String r0 = "enter_poll_detail"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            r4 = 0
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0039
            java.lang.String r3 = r3.f71629d
            goto L_0x003a
        L_0x0039:
            r3 = r4
        L_0x003a:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x004b
            java.lang.String r3 = r3.f71628c
            goto L_0x004c
        L_0x004b:
            r3 = r4
        L_0x004c:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.f71630e
            goto L_0x005e
        L_0x005d:
            r3 = r4
        L_0x005e:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r9.i
            if (r3 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x006f
            java.lang.String r3 = r3.f71627b
            goto L_0x0070
        L_0x006f:
            r3 = r4
        L_0x0070:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r9.d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3)
            if (r3 == 0) goto L_0x0086
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x0088
        L_0x0086:
            java.lang.String r3 = ""
        L_0x0088:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            if (r0 != 0) goto L_0x00a5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$a r0 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.h
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r1 = r9.f70008d
            if (r1 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r1.getVoteStruct()
        L_0x009f:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r0.a(r4)
            r9.n = r0
        L_0x00a5:
            android.content.Context r0 = r9.g
            if (r0 == 0) goto L_0x0117
            android.support.v4.app.FragmentActivity r0 = (android.support.v4.app.FragmentActivity) r0
            android.support.v4.app.FragmentManager r0 = r0.getSupportFragmentManager()
            r0.executePendingTransactions()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            r1 = 1
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r0.isAdded()
            if (r0 == r1) goto L_0x00c8
        L_0x00bd:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.isVisible()
            if (r0 == r1) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            return
        L_0x00c9:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r0.isRemoving()
            if (r0 != r1) goto L_0x00d4
            return
        L_0x00d4:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            if (r0 == 0) goto L_0x00dc
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g r1 = r9.m
            r0.g = r1
        L_0x00dc:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            if (r0 == 0) goto L_0x00fd
            android.content.Context r1 = r9.g
            if (r1 == 0) goto L_0x00f5
            android.support.v4.app.FragmentActivity r1 = (android.support.v4.app.FragmentActivity) r1
            android.support.v4.app.FragmentManager r1 = r1.getSupportFragmentManager()
            java.lang.String r2 = "(context as FragmentActi…y).supportFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = "VoteBottomSheetDialogFragment"
            r0.show(r1, r2)
            goto L_0x00fd
        L_0x00f5:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment r0 = r9.n
            if (r0 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$b
            r1.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment$b r1 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteBottomSheetDialogFragment.b) r1
            r0.f69996f = r1
        L_0x010a:
            com.ss.android.ugc.aweme.sticker.d r0 = r9.i
            if (r0 == 0) goto L_0x0116
            com.ss.android.ugc.aweme.sticker.a.c r0 = r0.m
            if (r0 == 0) goto L_0x0116
            r0.a()
            return
        L_0x0116:
            return
        L_0x0117:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.h():void");
    }

    public final void a(@NotNull d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, j, false, 79697, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, j, false, 79697, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar, "interactStickerParams");
        super.a(dVar);
        this.l.a(dVar);
        h d2 = a(c());
        if (d2 != null) {
            d2.post(new c(this, d2, dVar));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r0 == null) goto L_0x00bb;
     */
    @org.jetbrains.annotations.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h a(int r14) {
        /*
            r13 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = j
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h> r6 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.class
            r3 = 0
            r4 = 79699(0x13753, float:1.11682E-40)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = j
            r3 = 0
            r4 = 79699(0x13753, float:1.11682E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h> r6 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h.class
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = (com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h) r0
            return r0
        L_0x003d:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            if (r0 != 0) goto L_0x0094
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h
            android.content.Context r1 = r13.g
            r0.<init>(r1)
            r13.k = r0
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.sticker.d r1 = r13.i
            r0.setInteractStickerParams(r1)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r13.k
            if (r1 == 0) goto L_0x0062
            android.view.ViewGroup$LayoutParams r0 = (android.view.ViewGroup.LayoutParams) r0
            r1.setLayoutParams(r0)
        L_0x0062:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            if (r0 == 0) goto L_0x0070
            android.widget.FrameLayout r0 = r0.getVoteView()
            if (r0 == 0) goto L_0x0070
            r1 = 4
            r0.setVisibility(r1)
        L_0x0070:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            if (r0 == 0) goto L_0x007d
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.e r1 = r13.l
            float[] r1 = r1.a()
            r0.setPoints(r1)
        L_0x007d:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            if (r0 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$a r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g$a
            r1.<init>(r13)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
            goto L_0x0094
        L_0x008c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.VoteStickerView"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r7 = r13.k
            if (r7 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r0 = r13.f70008d
            r1 = 0
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r0.getVoteStruct()
            r8 = r0
            goto L_0x00a4
        L_0x00a3:
            r8 = r1
        L_0x00a4:
            com.ss.android.ugc.aweme.sticker.d r0 = r13.i
            if (r0 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f71634c
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            boolean r9 = com.ss.android.ugc.aweme.utils.ex.g(r0)
            com.ss.android.ugc.aweme.sticker.d r0 = r13.i
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = r0.f71635d
            if (r0 != 0) goto L_0x00b9
            goto L_0x00bb
        L_0x00b9:
            r10 = r0
            goto L_0x00be
        L_0x00bb:
            java.lang.String r0 = ""
            goto L_0x00b9
        L_0x00be:
            com.ss.android.ugc.aweme.sticker.d r0 = r13.i
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.sticker.a.c r0 = r0.m
            r11 = r0
            goto L_0x00c7
        L_0x00c6:
            r11 = r1
        L_0x00c7:
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r12 = r13.d()
            r7.a((com.ss.android.ugc.aweme.sticker.data.VoteStruct) r8, (boolean) r9, (java.lang.String) r10, (com.ss.android.ugc.aweme.sticker.a.c) r11, (com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r12)
        L_0x00ce:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            if (r0 == 0) goto L_0x00d5
            r0.postInvalidate()
        L_0x00d5:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r13.k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g.a(int):com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h");
    }

    public final void a(@Nullable InteractStickerStruct interactStickerStruct) {
        if (PatchProxy.isSupport(new Object[]{interactStickerStruct}, this, j, false, 79698, new Class[]{InteractStickerStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{interactStickerStruct}, this, j, false, 79698, new Class[]{InteractStickerStruct.class}, Void.TYPE);
            return;
        }
        super.a(interactStickerStruct);
        a(c());
    }

    public final boolean a(long j2, int i, float f2, float f3) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 79700, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return this.l.a(j2, i, f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 79700, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean a(long j2, int i, float f2, float f3, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar) {
        long j3 = j2;
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, j, false, 79701, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Boolean.TYPE)) {
            Object[] objArr = {new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, j, false, 79701, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        return this.l.a(j2, i, f2, f3, eVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(int i, @NotNull Context context, @NotNull View view, @NotNull InteractStickerStruct interactStickerStruct, @Nullable d dVar, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.g gVar) {
        super(i, context, view, interactStickerStruct, dVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
        Intrinsics.checkParameterIsNotNull(gVar, "iVoteDetailSaveData");
        this.m = gVar;
        this.l = new e(context, this, interactStickerStruct, dVar);
        if (dVar != null && dVar.f71636e) {
            h();
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).prefetchTypeface(context);
    }
}
