package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0014J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0014J(\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0014J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/PoiInteractStickerView;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/view/BaseInteractStickerView;", "type", "", "context", "Landroid/content/Context;", "contentView", "Landroid/view/View;", "stickerStruct", "Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;", "interactStickerParams", "Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;", "(ILandroid/content/Context;Landroid/view/View;Lcom/ss/android/ugc/aweme/sticker/data/InteractStickerStruct;Lcom/ss/android/ugc/aweme/sticker/InteractStickerParams;)V", "presenter", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/presenter/PoiStickerPresenter;", "view", "consumeClickEvent", "", "curPts", "", "pointX", "", "pointY", "poiPopListener", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/interfaces/IPoiPopListener;", "createBubbleView", "getStickerType", "getView", "mobClick", "", "needConsumeClickEvent", "onClickPop", "updateInteractStickerParams", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends a {
    public static ChangeQuickRedirect j;
    private View k;
    private final c l;

    public final int c() {
        return 1;
    }

    @NotNull
    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 79673, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, j, false, 79673, new Class[0], View.class);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.g);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        DmtTextView dmtTextView = new DmtTextView(this.g);
        dmtTextView.setTextColor(this.g.getResources().getColor(C0906R.color.a08));
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.g.getString(C0906R.string.c3i));
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

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018d, code lost:
        if (r3 == null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01dc, code lost:
        if (r3 == null) goto L_0x01de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r23 = this;
            r7 = r23
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = j
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 79672(0x13738, float:1.11644E-40)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = j
            r3 = 0
            r4 = 79672(0x13738, float:1.11644E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.ss.android.ugc.aweme.sticker.d r0 = r7.i
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r0.f71637f
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 1
            if (r0 == 0) goto L_0x003f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = 0
            goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            if (r0 != 0) goto L_0x012f
            android.content.Context r9 = r7.g
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r0 = r7.l
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = r0.g
            java.lang.String r0 = r0.getPoiId()
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0053
            java.lang.String r3 = r3.f71637f
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            com.ss.android.ugc.aweme.sticker.d r4 = r7.i
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r4.g
            r13 = r4
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            com.ss.android.ugc.aweme.sticker.d r4 = r7.i
            if (r4 == 0) goto L_0x0068
            long r4 = r4.h
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            java.lang.String r14 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.sticker.d r4 = r7.i
            if (r4 == 0) goto L_0x0078
            long r4 = r4.i
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0079
        L_0x0078:
            r4 = 0
        L_0x0079:
            if (r4 != 0) goto L_0x007e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x007e:
            long r4 = r4.longValue()
            r6 = 6
            java.lang.Object[] r15 = new java.lang.Object[r6]
            r15[r8] = r9
            r15[r2] = r0
            r10 = 2
            r15[r10] = r3
            r11 = 3
            r15[r11] = r13
            r12 = 4
            r15[r12] = r14
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r22 = 5
            r15[r22] = r1
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.commercialize.log.w.f39352a
            r18 = 1
            r19 = 31804(0x7c3c, float:4.4567E-41)
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class<android.content.Context> r20 = android.content.Context.class
            r1[r8] = r20
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r1[r2] = r20
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r1[r10] = r20
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r1[r11] = r20
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r1[r12] = r20
            java.lang.Class r20 = java.lang.Long.TYPE
            r1[r22] = r20
            java.lang.Class r21 = java.lang.Void.TYPE
            r20 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r1 == 0) goto L_0x0104
            java.lang.Object[] r15 = new java.lang.Object[r6]
            r15[r8] = r9
            r15[r2] = r0
            r15[r10] = r3
            r15[r11] = r13
            r15[r12] = r14
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            r15[r22] = r0
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.commercialize.log.w.f39352a
            r18 = 1
            r19 = 31804(0x7c3c, float:4.4567E-41)
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r22] = r1
            java.lang.Class r21 = java.lang.Void.TYPE
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x012f
        L_0x0104:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r1)
            java.lang.String r1 = "cid"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r1)
            r1 = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x011b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            if (r2 != 0) goto L_0x012f
            java.lang.String r10 = "draw_ad"
            java.lang.String r11 = "poi_sticker_click"
            java.lang.String r1 = "ad poi click event"
            org.json.JSONObject r1 = com.ss.android.ugc.aweme.commercialize.log.w.a(r9, r3, r1)
            org.json.JSONObject r12 = com.ss.android.ugc.aweme.commercialize.log.w.a(r1, r0)
            r15 = r4
            com.ss.android.ugc.aweme.commercialize.log.w.a(r9, r10, r11, r12, r13, r14, r15)
        L_0x012f:
            java.lang.String r0 = "poi_prop_click"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0142
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0142
            java.lang.String r3 = r3.f71629d
            goto L_0x0143
        L_0x0142:
            r3 = 0
        L_0x0143:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0154
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0154
            java.lang.String r3 = r3.f71628c
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0166
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0166
            java.lang.String r3 = r3.f71630e
            goto L_0x0167
        L_0x0166:
            r3 = 0
        L_0x0167:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0178
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0178
            java.lang.String r3 = r3.f71627b
            goto L_0x0179
        L_0x0178:
            r3 = 0
        L_0x0179:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r23.d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3)
            if (r3 == 0) goto L_0x018f
            java.lang.String r3 = r3.getPoiStickerId()
            if (r3 != 0) goto L_0x0191
        L_0x018f:
            java.lang.String r3 = ""
        L_0x0191:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r3 = r7.l
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r3.g
            java.lang.String r3 = r3.getPoiId()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "poi_type"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r3 = r7.l
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r3.g
            long r3 = r3.poiType
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (long) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            java.lang.String r0 = "poi_sticker_toast_show"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x01c7
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x01c7
            java.lang.String r3 = r3.f71627b
            goto L_0x01c8
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r23.d()
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c((com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct) r3)
            if (r3 == 0) goto L_0x01de
            java.lang.String r3 = r3.getPoiStickerId()
            if (r3 != 0) goto L_0x01e0
        L_0x01de:
            java.lang.String r3 = ""
        L_0x01e0:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x01f1
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x01f1
            java.lang.String r3 = r3.f71629d
            goto L_0x01f2
        L_0x01f1:
            r3 = 0
        L_0x01f2:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0203
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0203
            java.lang.String r3 = r3.f71630e
            goto L_0x0204
        L_0x0203:
            r3 = 0
        L_0x0204:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r3 = r7.i
            if (r3 == 0) goto L_0x0215
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0215
            java.lang.String r3 = r3.f71628c
            goto L_0x0216
        L_0x0215:
            r3 = 0
        L_0x0216:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "poi_id"
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r3 = r7.l
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r3.g
            java.lang.String r3 = r3.getPoiId()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e.e():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x025f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r25 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = j
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 79674(0x1373a, float:1.11647E-40)
            r2 = r25
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = j
            r5 = 0
            r6 = 79674(0x1373a, float:1.11647E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0027:
            r1 = r25
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c r9 = r1.l
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c.f69947f
            r5 = 0
            r6 = 79609(0x136f9, float:1.11556E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004f
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.e.c.f69947f
            r5 = 0
            r6 = 79609(0x136f9, float:1.11556E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x004f:
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r9.g
            java.lang.String r2 = r2.getPoiId()
            if (r2 == 0) goto L_0x027f
            com.ss.android.ugc.aweme.sticker.d r2 = r9.f69944e
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = r2.f71637f
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4 = 1
            if (r2 == 0) goto L_0x006d
            int r2 = r2.length()
            if (r2 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r2 = 0
            goto L_0x006e
        L_0x006d:
            r2 = 1
        L_0x006e:
            if (r2 != 0) goto L_0x0160
            android.content.Context r10 = r9.f69941b
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r9.g
            java.lang.String r2 = r2.getPoiId()
            com.ss.android.ugc.aweme.sticker.d r5 = r9.f69944e
            if (r5 == 0) goto L_0x007f
            java.lang.String r5 = r5.f71637f
            goto L_0x0080
        L_0x007f:
            r5 = 0
        L_0x0080:
            com.ss.android.ugc.aweme.sticker.d r6 = r9.f69944e
            if (r6 == 0) goto L_0x0088
            java.lang.String r6 = r6.g
            r14 = r6
            goto L_0x0089
        L_0x0088:
            r14 = 0
        L_0x0089:
            com.ss.android.ugc.aweme.sticker.d r6 = r9.f69944e
            if (r6 == 0) goto L_0x0094
            long r6 = r6.h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x0095
        L_0x0094:
            r6 = 0
        L_0x0095:
            java.lang.String r15 = java.lang.String.valueOf(r6)
            com.ss.android.ugc.aweme.sticker.d r6 = r9.f69944e
            if (r6 == 0) goto L_0x00a4
            long r6 = r6.i
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x00a5
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            if (r6 != 0) goto L_0x00aa
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00aa:
            long r6 = r6.longValue()
            r8 = 6
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r0] = r10
            r11[r4] = r2
            r12 = 2
            r11[r12] = r5
            r13 = 3
            r11[r13] = r14
            r23 = 4
            r11[r23] = r15
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r6)
            r24 = 5
            r11[r24] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.commercialize.log.w.f39352a
            r19 = 1
            r20 = 31805(0x7c3d, float:4.4568E-41)
            java.lang.Class[] r3 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r16 = android.content.Context.class
            r3[r0] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r3[r4] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r3[r12] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r3[r13] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r3[r23] = r16
            java.lang.Class r16 = java.lang.Long.TYPE
            r3[r24] = r16
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r11
            r21 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x0135
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r0] = r10
            r3[r4] = r2
            r3[r12] = r5
            r3[r13] = r14
            r3[r23] = r15
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r6)
            r3[r24] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.commercialize.log.w.f39352a
            r19 = 1
            r20 = 31805(0x7c3d, float:4.4568E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r2[r0] = r5
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r4] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r12] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r13] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r23] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r2[r24] = r0
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r3
            r21 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0160
        L_0x0135:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r3)
            java.lang.String r3 = "cid"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r3)
            r3 = r5
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x014a
            int r3 = r3.length()
            if (r3 != 0) goto L_0x014b
        L_0x014a:
            r0 = 1
        L_0x014b:
            if (r0 != 0) goto L_0x0160
            java.lang.String r11 = "draw_ad"
            java.lang.String r12 = "poi_sticker_jump"
            java.lang.String r0 = "ad poi jump event"
            org.json.JSONObject r0 = com.ss.android.ugc.aweme.commercialize.log.w.a(r10, r5, r0)
            org.json.JSONObject r13 = com.ss.android.ugc.aweme.commercialize.log.w.a(r0, r2)
            r16 = r6
            com.ss.android.ugc.aweme.commercialize.log.w.a(r10, r11, r12, r13, r14, r15, r16)
        L_0x0160:
            java.lang.String r0 = "poi_prop_label_click"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "group_id"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.f69944e
            if (r4 == 0) goto L_0x0173
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x0173
            java.lang.String r4 = r4.f71629d
            goto L_0x0174
        L_0x0173:
            r4 = 0
        L_0x0174:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "author_id"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.f69944e
            if (r4 == 0) goto L_0x0185
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x0185
            java.lang.String r4 = r4.f71628c
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.f69944e
            if (r4 == 0) goto L_0x0197
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x0197
            java.lang.String r4 = r4.f71630e
            goto L_0x0198
        L_0x0197:
            r4 = 0
        L_0x0198:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "enter_from"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.f69944e
            if (r4 == 0) goto L_0x01a9
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x01a9
            java.lang.String r4 = r4.f71627b
            goto L_0x01aa
        L_0x01a9:
            r4 = 0
        L_0x01aa:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.sticker.d r4 = r9.f69944e
            if (r4 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.sticker.c r4 = r4.n
            if (r4 == 0) goto L_0x01bb
            java.lang.String r4 = r4.f71626a
            goto L_0x01bc
        L_0x01bb:
            r4 = 0
        L_0x01bc:
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "poi_id"
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.g
            java.lang.String r4 = r4.getPoiId()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "poi_type"
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r9.g
            long r4 = r4.poiType
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (long) r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r2)
            android.content.Context r0 = r9.f69941b
            com.ss.android.ugc.aweme.poi.model.l$a r2 = new com.ss.android.ugc.aweme.poi.model.l$a
            r2.<init>()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r9.g
            java.lang.String r3 = r3.getPoiId()
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.c(r3)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r9.g
            java.lang.String r3 = r3.poiName
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.g(r3)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r9.g
            java.lang.String r3 = r3.typeCode
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.f(r3)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r9.g
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.a((com.ss.android.ugc.aweme.poi.model.PoiStruct) r3)
            java.lang.String r3 = "click_poi_prop"
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.j(r3)
            com.ss.android.ugc.aweme.sticker.d r3 = r9.f69944e
            if (r3 == 0) goto L_0x0213
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0213
            java.lang.String r3 = r3.f71627b
            goto L_0x0214
        L_0x0213:
            r3 = 0
        L_0x0214:
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.i(r3)
            java.lang.String r3 = "0"
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.o(r3)
            java.lang.String r3 = "click_poi_prop"
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.l(r3)
            com.ss.android.ugc.aweme.sticker.d r3 = r9.f69944e
            if (r3 == 0) goto L_0x022f
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x022f
            java.lang.String r3 = r3.f71629d
            goto L_0x0230
        L_0x022f:
            r3 = 0
        L_0x0230:
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.k(r3)
            com.ss.android.ugc.aweme.sticker.d r3 = r9.f69944e
            if (r3 == 0) goto L_0x023f
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x023f
            java.lang.String r3 = r3.f71628c
            goto L_0x0240
        L_0x023f:
            r3 = 0
        L_0x0240:
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.h(r3)
            com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r9.g
            int r3 = r3.getPoiSubTitleType()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.r(r3)
            com.ss.android.ugc.aweme.app.AwemeAppData r3 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            java.lang.String r4 = "AwemeAppData.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r3 = r3.ap
            if (r3 == 0) goto L_0x0262
            java.lang.String r3 = "auto"
            goto L_0x0264
        L_0x0262:
            java.lang.String r3 = "normal"
        L_0x0264:
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.t(r3)
            com.ss.android.ugc.aweme.sticker.d r3 = r9.f69944e
            if (r3 == 0) goto L_0x0273
            com.ss.android.ugc.aweme.sticker.c r3 = r3.n
            if (r3 == 0) goto L_0x0273
            java.lang.String r3 = r3.f71630e
            goto L_0x0274
        L_0x0273:
            r3 = 0
        L_0x0274:
            com.ss.android.ugc.aweme.poi.model.l$a r2 = r2.n(r3)
            com.ss.android.ugc.aweme.poi.model.l r2 = r2.a()
            com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity.a(r0, r2)
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.e.g():void");
    }

    public final void a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, j, false, 79671, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, j, false, 79671, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "interactStickerParams");
        super.a(dVar);
        this.l.a(dVar2);
    }

    @Nullable
    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 79668, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 79668, new Class[]{Integer.TYPE}, View.class);
        } else if (a.a(this.g)) {
            if (this.k == null) {
                this.k = new f(this.g);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                View view = this.k;
                if (view == null) {
                    Intrinsics.throwNpe();
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.k;
                if (view2 != null) {
                    ((f) view2).setPoints(this.l.h);
                    View view3 = this.k;
                    if (view3 == null) {
                        Intrinsics.throwNpe();
                    }
                    view3.postInvalidate();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PoiStickerFeedView");
                }
            }
            return this.k;
        } else {
            if (this.k == null) {
                this.k = new FrameLayout(this.g);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                View view4 = this.k;
                if (view4 != null) {
                    view4.setLayoutParams(layoutParams2);
                }
            }
            return this.k;
        }
    }

    public final boolean a(long j2, int i, float f2, float f3) {
        long j3 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 79669, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return this.l.a(j2, i, f2, f3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3)}, this, j, false, 79669, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i, @NotNull Context context, @NotNull View view, @NotNull InteractStickerStruct interactStickerStruct, @Nullable d dVar) {
        super(i, context, view, interactStickerStruct, dVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        Intrinsics.checkParameterIsNotNull(interactStickerStruct, "stickerStruct");
        this.l = new c(context, this, interactStickerStruct, dVar);
    }

    public final boolean a(long j2, int i, float f2, float f3, @NotNull com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar) {
        long j3 = j2;
        com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2}, this, j, false, 79670, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Boolean.TYPE)) {
            Object[] objArr = {new Long(j3), Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), eVar2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, j, false, 79670, new Class[]{Long.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.e.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "poiPopListener");
        return this.l.a(j2, i, f2, f3, eVar);
    }
}
