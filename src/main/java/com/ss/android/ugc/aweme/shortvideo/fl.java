package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.support.v4.os.CancellationSignal;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.common.a.u;
import com.google.common.util.concurrent.l;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.am.a;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.edit.ca;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractionCheckInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.q.b.e;
import com.ss.android.ugc.aweme.shortvideo.q.b.f;
import com.ss.android.ugc.aweme.shortvideo.q.b.i;
import com.ss.android.ugc.aweme.shortvideo.util.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import com.ss.android.ugc.aweme.utils.fb;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.vesdk.VEWatermarkParam;
import dmt.av.video.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fl {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67750a;

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f67751b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0538  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0685  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x06bc  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0702 A[SYNTHETIC, Splitter:B:210:0x0702] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.edit.cb r20, java.util.LinkedHashMap<java.lang.String, java.lang.String> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f67750a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r4 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r8[r10] = r4
            java.lang.Class<java.util.LinkedHashMap> r4 = java.util.LinkedHashMap.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 74635(0x1238b, float:1.04586E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f67750a
            r15 = 0
            r16 = 74635(0x1238b, float:1.04586E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r1 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r0[r10] = r1
            java.lang.Class<java.util.LinkedHashMap> r1 = java.util.LinkedHashMap.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            java.lang.String r3 = r0.musicId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0056
            java.lang.String r3 = "music_id"
            java.lang.String r4 = r0.musicId
            r1.put(r3, r4)
        L_0x0056:
            java.lang.String r3 = "original"
            int r4 = r20.getOriginal()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            java.lang.String r3 = r0.creationId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0072
            java.lang.String r3 = "creation_id"
            java.lang.String r4 = r0.creationId
            r1.put(r3, r4)
        L_0x0072:
            java.lang.String r3 = r20.getSpeed()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0085
            java.lang.String r3 = "speed"
            java.lang.String r4 = r20.getSpeed()
            r1.put(r3, r4)
        L_0x0085:
            java.lang.String r3 = r20.getStickers()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0098
            java.lang.String r3 = "stickers"
            java.lang.String r4 = r20.getStickers()
            r1.put(r3, r4)
        L_0x0098:
            java.lang.String r3 = r20.getFilterName()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ab
            java.lang.String r3 = "filter_name"
            java.lang.String r4 = r20.getFilterName()
            r1.put(r3, r4)
        L_0x00ab:
            java.lang.String r3 = r20.getFilterIds()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00be
            java.lang.String r3 = "filter_id"
            java.lang.String r4 = r20.getFilterIds()
            r1.put(r3, r4)
        L_0x00be:
            java.lang.String r3 = "camera"
            int r4 = r20.getCamera()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            java.lang.String r3 = "prettify"
            int r4 = r20.getPrettify()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r0.mEffectList
            boolean r4 = com.bytedance.common.utility.Lists.notEmpty(r4)
            if (r4 == 0) goto L_0x00ea
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r0.mEffectList
            r3.addAll(r4)
        L_0x00ea:
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = r0.mTimeEffect
            if (r4 == 0) goto L_0x00f3
            com.ss.android.ugc.aweme.effect.EffectPointModel r4 = r0.mTimeEffect
            r3.add(r4)
        L_0x00f3:
            boolean r4 = com.bytedance.common.utility.Lists.notEmpty(r3)
            if (r4 == 0) goto L_0x0197
            java.lang.String r4 = "fx_name"
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38549(0x9695, float:5.4019E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r5[r10] = r6
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x0132
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38549(0x9695, float:5.4019E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r5[r10] = r6
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0148
        L_0x0132:
            com.google.common.a.f r5 = com.ss.android.ugc.aweme.effect.h.f43747b
            java.util.List r5 = com.google.common.collect.az.a(r3, r5)
            com.google.common.a.n r6 = com.ss.android.ugc.aweme.effect.i.f43749b
            java.util.Collection r5 = com.google.common.collect.m.a((java.util.Collection<E>) r5, (com.google.common.a.n<? super E>) r6)
            com.google.common.collect.ar r5 = com.google.common.collect.ar.copyOf((java.util.Collection<? extends E>) r5)
            java.lang.String r6 = ","
            java.lang.String r5 = android.text.TextUtils.join(r6, r5)
        L_0x0148:
            r1.put(r4, r5)
            java.lang.String r4 = "effect_id"
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38548(0x9694, float:5.4017E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            r5[r10] = r6
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x0184
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.effect.e.f43741a
            r15 = 1
            r16 = 38548(0x9694, float:5.4017E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            r3[r10] = r5
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0194
        L_0x0184:
            com.google.common.a.f r5 = com.ss.android.ugc.aweme.effect.g.f43745b
            java.util.List r3 = com.google.common.collect.az.a(r3, r5)
            com.google.common.collect.ar r3 = com.google.common.collect.ar.copyOf((java.util.Collection<? extends E>) r3)
            java.lang.String r5 = ","
            java.lang.String r3 = android.text.TextUtils.join(r5, r3)
        L_0x0194:
            r1.put(r4, r3)
        L_0x0197:
            java.lang.String r3 = r0.mId3Author
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01a6
            java.lang.String r3 = "author"
            java.lang.String r4 = r0.mId3Author
            r1.put(r3, r4)
        L_0x01a6:
            java.lang.String r3 = r0.mId3Title
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01b5
            java.lang.String r3 = "title"
            java.lang.String r4 = r0.mId3Title
            r1.put(r3, r4)
        L_0x01b5:
            java.lang.String r3 = r0.mId3Album
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01c4
            java.lang.String r3 = "album"
            java.lang.String r4 = r0.mId3Album
            r1.put(r3, r4)
        L_0x01c4:
            int r3 = r0.mMusicType
            if (r3 <= 0) goto L_0x01d3
            java.lang.String r3 = "music_type"
            int r4 = r0.mMusicType
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
        L_0x01d3:
            java.lang.String r3 = r20.getDuetFrom()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01e6
            java.lang.String r3 = "duet_from"
            java.lang.String r4 = r20.getDuetFrom()
            r1.put(r3, r4)
        L_0x01e6:
            java.lang.String r3 = r0.shopDraftId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01f5
            java.lang.String r3 = "shop_draft_id"
            java.lang.String r4 = r0.shopDraftId
            r1.put(r3, r4)
        L_0x01f5:
            java.lang.String r3 = "is_upload_audio_track"
            boolean r4 = r20.shouldUploadOriginalSound()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            java.lang.String r3 = "is_multi_video_upload"
            boolean r4 = r0.mIsMultiVideo
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            int r3 = r0.recordMode
            if (r3 != r11) goto L_0x0227
            java.lang.String r3 = "game_type"
            int r4 = r0.recordMode
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            java.lang.String r3 = "game_score"
            int r4 = r0.gameScore
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
        L_0x0227:
            java.lang.String r3 = "use_camera_type"
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.util.j.f71137a
            r15 = 1
            r16 = 80873(0x13be9, float:1.13327E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x0258
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.util.j.f71137a
            r15 = 1
            r16 = 80873(0x13be9, float:1.13327E-40)
            java.lang.Class[] r4 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r4
            java.lang.Object r4 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x0260
        L_0x0258:
            com.ss.android.ugc.aweme.property.e r4 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r5 = com.ss.android.ugc.aweme.property.e.a.RecordUseSuccessCameraType
            int r4 = r4.b(r5)
        L_0x0260:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            com.ss.android.ugc.aweme.property.e r3 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r4 = com.ss.android.ugc.aweme.property.e.a.RecordUseSuccessRecordProfile
            int r3 = r3.b(r4)
            java.lang.String r4 = "h264_high_profile"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r1.put(r4, r3)
            java.lang.String r3 = "camera_compat_level"
            com.ss.android.medialib.camera.g r4 = com.ss.android.medialib.camera.g.b()
            com.ss.android.medialib.camera.IESCameraInterface r5 = r4.f29527c
            boolean r5 = r5 instanceof com.ss.android.medialib.camera.b
            if (r5 == 0) goto L_0x028b
            com.ss.android.medialib.camera.IESCameraInterface r4 = r4.f29527c
            com.ss.android.medialib.camera.b r4 = (com.ss.android.medialib.camera.b) r4
            int r4 = r4.f29488f
            goto L_0x028c
        L_0x028b:
            r4 = 0
        L_0x028c:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r1.put(r3, r4)
            java.lang.String r3 = r0.mEyesLabels
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02a2
            java.lang.String r3 = "eye"
            java.lang.String r4 = r0.mEyesLabels
            r1.put(r3, r4)
        L_0x02a2:
            java.lang.String r3 = r0.mReshapeLabels
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02b1
            java.lang.String r3 = "shape"
            java.lang.String r4 = r0.mReshapeLabels
            r1.put(r3, r4)
        L_0x02b1:
            java.lang.String r3 = r0.mTanningLabels
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02c0
            java.lang.String r3 = "tanning"
            java.lang.String r4 = r0.mTanningLabels
            r1.put(r3, r4)
        L_0x02c0:
            java.lang.String r3 = r0.mSmoothSkinLabels
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x02cf
            java.lang.String r3 = "smooth"
            java.lang.String r4 = r0.mSmoothSkinLabels
            r1.put(r3, r4)
        L_0x02cf:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.cf> r3 = r0.importInfoList
            boolean r3 = com.bytedance.common.utility.Lists.notEmpty(r3)
            if (r3 == 0) goto L_0x0326
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.cf> r4 = r0.importInfoList
            java.util.Iterator r4 = r4.iterator()
        L_0x02e2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x031d
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.shortvideo.cf r5 = (com.ss.android.ugc.aweme.shortvideo.cf) r5
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "h"
            int r8 = r5.getVideoHeight()     // Catch:{ JSONException -> 0x031b }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x031b }
            java.lang.String r7 = "w"
            int r8 = r5.getVideoWidth()     // Catch:{ JSONException -> 0x031b }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x031b }
            java.lang.String r7 = "b"
            int r8 = r5.getBitRate()     // Catch:{ JSONException -> 0x031b }
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x031b }
            java.lang.String r7 = "e"
            java.lang.String r5 = r5.getEncode()     // Catch:{ JSONException -> 0x031b }
            r6.put(r7, r5)     // Catch:{ JSONException -> 0x031b }
            r3.put(r6)     // Catch:{ JSONException -> 0x031b }
            goto L_0x02e2
        L_0x031b:
            goto L_0x02e2
        L_0x031d:
            java.lang.String r4 = "import_video_info"
            java.lang.String r3 = r3.toString()
            r1.put(r4, r3)
        L_0x0326:
            com.ss.android.ugc.aweme.shortvideo.i.i r3 = r20.getReactionParams()
            if (r3 == 0) goto L_0x0412
            com.ss.android.ugc.aweme.shortvideo.i.i r3 = r20.getReactionParams()
            java.lang.String r3 = r3.reactionFromId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0412
            java.lang.String r3 = "react_from"
            com.ss.android.ugc.aweme.shortvideo.i.i r4 = r20.getReactionParams()
            java.lang.String r4 = r4.reactionFromId
            r1.put(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.i.i r3 = r20.getReactionParams()
            java.lang.String r3 = r3.reactionOriginId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x035a
            java.lang.String r3 = "react_origin"
            com.ss.android.ugc.aweme.shortvideo.i.i r4 = r20.getReactionParams()
            java.lang.String r4 = r4.reactionOriginId
            r1.put(r3, r4)
        L_0x035a:
            com.ss.android.ugc.aweme.shortvideo.i.i r3 = r20.getReactionParams()
            java.lang.String r3 = r3.reactionViewId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0371
            java.lang.String r3 = "react_view"
            com.ss.android.ugc.aweme.shortvideo.i.i r4 = r20.getReactionParams()
            java.lang.String r4 = r4.reactionViewId
            r1.put(r3, r4)
        L_0x0371:
            com.google.gson.Gson r3 = com.ss.android.ugc.aweme.port.in.a.f61120c
            com.ss.android.ugc.aweme.shortvideo.i.i r4 = r20.getReactionParams()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.i.k> r4 = r4.windowInfoList
            boolean r4 = com.bytedance.common.utility.Lists.notEmpty(r4)
            if (r4 == 0) goto L_0x0412
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.ss.android.ugc.aweme.shortvideo.i.i r8 = r20.getReactionParams()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.i.k> r8 = r8.windowInfoList
            java.util.Iterator r8 = r8.iterator()
        L_0x039d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x03ee
            java.lang.Object r9 = r8.next()
            com.ss.android.ugc.aweme.shortvideo.i.k r9 = (com.ss.android.ugc.aweme.shortvideo.i.k) r9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r13 = r9.width
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r4.add(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r13 = r9.height
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r5.add(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            float r13 = r9.angle
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r6.add(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            int r9 = r9.type
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r7.add(r9)
            goto L_0x039d
        L_0x03ee:
            java.lang.String r8 = "react_width"
            java.lang.String r4 = r3.toJson((java.lang.Object) r4)
            r1.put(r8, r4)
            java.lang.String r4 = "react_height"
            java.lang.String r5 = r3.toJson((java.lang.Object) r5)
            r1.put(r4, r5)
            java.lang.String r4 = "react_angle"
            java.lang.String r5 = r3.toJson((java.lang.Object) r6)
            r1.put(r4, r5)
            java.lang.String r4 = "react_type"
            java.lang.String r3 = r3.toJson((java.lang.Object) r7)
            r1.put(r4, r3)
        L_0x0412:
            com.ss.android.ugc.aweme.port.in.n r3 = com.ss.android.ugc.aweme.port.in.a.v
            com.ss.android.ugc.aweme.common.w r3 = r3.a((java.lang.Object) r0)
            r4 = 0
            if (r3 == 0) goto L_0x042f
            java.lang.String r5 = r3.mMicroAppInfo     // Catch:{ JsonSyntaxException -> 0x042f }
            if (r5 == 0) goto L_0x042f
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch:{ JsonSyntaxException -> 0x042f }
            r5.<init>()     // Catch:{ JsonSyntaxException -> 0x042f }
            java.lang.String r3 = r3.mMicroAppInfo     // Catch:{ JsonSyntaxException -> 0x042f }
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.q> r6 = com.ss.android.ugc.aweme.shortvideo.edit.q.class
            java.lang.Object r3 = r5.fromJson((java.lang.String) r3, (java.lang.Class<T>) r6)     // Catch:{ JsonSyntaxException -> 0x042f }
            com.ss.android.ugc.aweme.shortvideo.edit.q r3 = (com.ss.android.ugc.aweme.shortvideo.edit.q) r3     // Catch:{ JsonSyntaxException -> 0x042f }
            goto L_0x0430
        L_0x042f:
            r3 = r4
        L_0x0430:
            if (r3 != 0) goto L_0x0434
            com.ss.android.ugc.aweme.shortvideo.edit.q r3 = r0.microAppModel
        L_0x0434:
            if (r3 == 0) goto L_0x04ec
            java.lang.String r5 = "micro_app_id"
            java.lang.String r6 = r3.getAppId()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0447
            java.lang.String r6 = r3.getAppId()
            goto L_0x0449
        L_0x0447:
            java.lang.String r6 = ""
        L_0x0449:
            r1.put(r5, r6)
            java.lang.String r5 = "micro_app_title"
            java.lang.String r6 = r3.getAppTitle()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x045d
            java.lang.String r6 = r3.getAppTitle()
            goto L_0x045f
        L_0x045d:
            java.lang.String r6 = ""
        L_0x045f:
            r1.put(r5, r6)
            java.lang.String r5 = "micro_app_description"
            java.lang.String r6 = r3.getDescription()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0473
            java.lang.String r6 = r3.getDescription()
            goto L_0x0475
        L_0x0473:
            java.lang.String r6 = ""
        L_0x0475:
            r1.put(r5, r6)
            java.lang.String r5 = "micro_app_url"
            java.lang.String r6 = r3.getAppUrl()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0489
            java.lang.String r6 = r3.getAppUrl()
            goto L_0x048b
        L_0x0489:
            java.lang.String r6 = ""
        L_0x048b:
            r1.put(r5, r6)
            java.lang.String r5 = r3.getExtra()     // Catch:{ JSONException -> 0x04eb }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x04eb }
            if (r6 != 0) goto L_0x04d7
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x04eb }
            r6.<init>(r5)     // Catch:{ JSONException -> 0x04eb }
            java.lang.String r5 = "alias_id"
            java.lang.String r5 = r6.optString(r5)     // Catch:{ JSONException -> 0x04eb }
            java.lang.String r7 = "timor_video_source"
            java.lang.String r7 = r6.optString(r7)     // Catch:{ JSONException -> 0x04eb }
            java.lang.String r8 = "micro_app_alias_id"
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x04eb }
            if (r9 != 0) goto L_0x04b2
            goto L_0x04b4
        L_0x04b2:
            java.lang.String r5 = ""
        L_0x04b4:
            r1.put(r8, r5)     // Catch:{ JSONException -> 0x04eb }
            java.lang.String r5 = "timor_video_source"
            r1.put(r5, r7)     // Catch:{ JSONException -> 0x04eb }
            java.lang.String r5 = "timor_card_code"
            java.lang.String r7 = "createChallenge"
            boolean r7 = r6.optBoolean(r7)     // Catch:{ JSONException -> 0x04eb }
            if (r7 == 0) goto L_0x04c9
            java.lang.String r7 = "1"
            goto L_0x04cb
        L_0x04c9:
            java.lang.String r7 = "0"
        L_0x04cb:
            r1.put(r5, r7)     // Catch:{ JSONException -> 0x04eb }
            java.lang.String r5 = "timor_cp_params"
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x04eb }
            r1.put(r5, r6)     // Catch:{ JSONException -> 0x04eb }
        L_0x04d7:
            java.lang.String r5 = r3.getCardImage()     // Catch:{ JSONException -> 0x04eb }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x04eb }
            if (r5 != 0) goto L_0x04ec
            java.lang.String r5 = "timor_card_image"
            java.lang.String r3 = r3.getCardImage()     // Catch:{ JSONException -> 0x04eb }
            r1.put(r5, r3)     // Catch:{ JSONException -> 0x04eb }
            goto L_0x04ec
        L_0x04eb:
        L_0x04ec:
            java.lang.String r3 = r0.microAppId
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x04fb
            java.lang.String r3 = "micro_app_id"
            java.lang.String r5 = r0.microAppId
            r1.put(r3, r5)
        L_0x04fb:
            java.lang.String r3 = "music_begin_time"
            int r5 = r0.mMusicStart
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.put(r3, r5)
            java.lang.String r3 = "music_end_time"
            int r5 = r0.mMusicStart
            int r6 = r0.mVideoLength
            int r5 = r5 + r6
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.put(r3, r5)
            boolean r3 = r20.hasInfoStickers()
            if (r3 == 0) goto L_0x0530
            java.lang.String r3 = "info_sticker"
            com.ss.android.ugc.aweme.n.a r5 = r0.infoStickerModel
            java.lang.String r5 = r5.getInfoStickerIds()
            r1.put(r3, r5)
            java.lang.String r3 = "other_sticker"
            com.ss.android.ugc.aweme.n.a r5 = r0.infoStickerModel
            java.lang.String r5 = r5.getOtherEffect()
            r1.put(r3, r5)
        L_0x0530:
            java.lang.String r3 = r0.mMusicOrigin
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0563
            java.lang.String r3 = "music_selected_from"
            java.lang.String r5 = r0.mMusicOrigin
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.put(r3, r5)
            java.lang.String r3 = "edit_page_recommend"
            java.lang.String r5 = r0.mMusicOrigin
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0563
            java.lang.String r3 = "music_show_rank"
            int r5 = r0.mMusicShowRank
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.put(r3, r5)
            java.lang.String r3 = "music_rec_type"
            int r5 = r0.mMusicRecType
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.put(r3, r5)
        L_0x0563:
            java.lang.String r3 = r0.mainBusinessData
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x05d4
            java.lang.String r3 = r0.mainBusinessData
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[] r5 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[r11]
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r6 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_EDIT
            r5[r10] = r6
            java.util.Collection r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((java.lang.String) r3, (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]) r5)
            boolean r5 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0592
            r5 = r19
            r5.a((com.ss.android.ugc.aweme.shortvideo.edit.cb) r0, (java.util.Collection<com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct>) r3)
            java.lang.String r6 = "interaction_stickers"
            com.ss.android.ugc.aweme.port.in.ab r7 = com.ss.android.ugc.aweme.port.in.a.D
            com.google.gson.Gson r7 = r7.getRetrofitFactoryGson()
            java.lang.String r3 = r7.toJson((java.lang.Object) r3)
            r1.put(r6, r3)
            goto L_0x0594
        L_0x0592:
            r5 = r19
        L_0x0594:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "info_sticker"
            boolean r6 = r1.containsKey(r6)
            if (r6 == 0) goto L_0x05b2
            java.lang.String r6 = "info_sticker"
            java.lang.Object r6 = r1.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x05b2
            r3.append(r6)
        L_0x05b2:
            java.lang.String r6 = r0.mainBusinessData
            java.lang.String r6 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(r6)
            int r7 = r3.length()
            if (r7 != 0) goto L_0x05c2
            r3.append(r6)
            goto L_0x05ca
        L_0x05c2:
            java.lang.String r7 = ","
            r3.append(r7)
            r3.append(r6)
        L_0x05ca:
            java.lang.String r6 = "info_sticker"
            java.lang.String r3 = r3.toString()
            r1.put(r6, r3)
            goto L_0x05d6
        L_0x05d4:
            r5 = r19
        L_0x05d6:
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a
            r15 = 1
            r16 = 76893(0x12c5d, float:1.0775E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r6 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r3[r10] = r6
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x0612
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a
            r15 = 1
            r16 = 76893(0x12c5d, float:1.0775E-40)
            java.lang.Class[] r3 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r4 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r3[r10] = r4
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0683
        L_0x0612:
            if (r0 == 0) goto L_0x0682
            java.lang.String r3 = r0.mainBusinessData
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[] r6 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[r11]
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d r7 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d.TRACK_PAGE_RECORD
            r6[r10] = r7
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r3
            r12[r11] = r6
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a
            r15 = 1
            r16 = 76896(0x12c60, float:1.07754E-40)
            java.lang.Class[] r7 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r10] = r8
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r8 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r7[r11] = r8
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r7
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r7 == 0) goto L_0x0660
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r3
            r12[r11] = r6
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a
            r15 = 1
            r16 = 76896(0x12c60, float:1.07754E-40)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[]> r4 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d[].class
            r3[r11] = r4
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r4 = r3
            java.util.List r4 = (java.util.List) r4
            goto L_0x067a
        L_0x0660:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.c r3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a((java.lang.String) r3)
            if (r3 == 0) goto L_0x067a
            boolean r8 = r3.isEmpty(r6)
            if (r8 == 0) goto L_0x0672
            goto L_0x067a
        L_0x0672:
            java.util.List r3 = r3.getStickerStructsByPage(r6)
            r7.addAll(r3)
            r4 = r7
        L_0x067a:
            boolean r3 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x0682
            r3 = 1
            goto L_0x0683
        L_0x0682:
            r3 = 0
        L_0x0683:
            if (r3 == 0) goto L_0x068d
            java.lang.String r3 = "aweme_type"
            java.lang.String r4 = "54"
            r1.put(r3, r4)
            goto L_0x069a
        L_0x068d:
            boolean r3 = r20.isMvThemeVideoType()
            if (r3 == 0) goto L_0x069a
            java.lang.String r3 = "aweme_type"
            java.lang.String r4 = "53"
            r1.put(r3, r4)
        L_0x069a:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f67750a
            r15 = 0
            r16 = 74637(0x1238d, float:1.04589E-40)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r4 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r3[r10] = r4
            java.lang.Class<java.util.LinkedHashMap> r4 = java.util.LinkedHashMap.class
            r3[r11] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r3 == 0) goto L_0x06dc
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f67750a
            r15 = 0
            r16 = 74637(0x1238d, float:1.04589E-40)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r3 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r2[r10] = r3
            java.lang.Class<java.util.LinkedHashMap> r3 = java.util.LinkedHashMap.class
            r2[r11] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x06fe
        L_0x06dc:
            boolean r2 = r20.isMvThemeVideoType()
            if (r2 == 0) goto L_0x06eb
            com.ss.android.ugc.aweme.x.a r2 = r0.mvCreateVideoData
            int r2 = r2.videoCoverStartTime
            float r2 = (float) r2
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            goto L_0x06ed
        L_0x06eb:
            float r2 = r0.mVideoCoverStartTm
        L_0x06ed:
            java.lang.String r3 = "cover_tsp"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.put(r3, r2)
        L_0x06fe:
            com.ss.android.ugc.aweme.shortvideo.j r2 = r0.uploadMiscInfoStruct
            if (r2 == 0) goto L_0x0719
            com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0719 }
            r2.<init>()     // Catch:{ Exception -> 0x0719 }
            com.ss.android.ugc.aweme.shortvideo.j r0 = r0.uploadMiscInfoStruct     // Catch:{ Exception -> 0x0719 }
            java.lang.String r0 = r2.toJson((java.lang.Object) r0)     // Catch:{ Exception -> 0x0719 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0719 }
            if (r2 != 0) goto L_0x0718
            java.lang.String r2 = "misc_info"
            r1.put(r2, r0)     // Catch:{ Exception -> 0x0719 }
        L_0x0718:
            return
        L_0x0719:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.fl.a(com.ss.android.ugc.aweme.shortvideo.edit.cb, java.util.LinkedHashMap):void");
    }

    static {
        ExecutorService executorService;
        ThreadFactory threadFactory = fm.f67759b;
        if (PatchProxy.isSupport(new Object[]{threadFactory}, null, fn.f67760a, true, 74642, new Class[]{ThreadFactory.class}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{threadFactory}, null, fn.f67760a, true, 74642, new Class[]{ThreadFactory.class}, ExecutorService.class);
        } else {
            executorService = h.a(m.a(p.FIXED).a(1).a(threadFactory).a());
        }
        f67751b = executorService;
    }

    public final ei<SynthetiseResult> a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67750a, false, 74628, new Class[]{Object.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj}, this, f67750a, false, 74628, new Class[]{Object.class}, ei.class);
        }
        return a((cb) obj, new CancellationSignal());
    }

    public final long c(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f67750a, false, 74632, new Class[]{Object.class}, Long.TYPE)) {
            return new File(((cb) obj).mOutputFile).length();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj}, this, f67750a, false, 74632, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final boolean d(Object obj) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67750a, false, 74634, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f67750a, false, 74634, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        cb cbVar = (cb) obj;
        if (!cbVar.isSaveLocal()) {
            return false;
        }
        String localTempPath = cbVar.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = cbVar.isSaveToLocalPathInsteadOfAlbum();
        if (cbVar.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        if (z) {
            str = a.a(com.ss.android.ugc.aweme.port.in.a.f61119b) + new File(localTempPath).getName();
        } else {
            str = com.ss.android.ugc.aweme.port.in.a.v.a((Context) com.ss.android.ugc.aweme.port.in.a.f61119b) + new File(localTempPath).getName();
        }
        b.c(localTempPath, str);
        cbVar.mSaveModel.setLocalFinalPath(str);
        if (z) {
            com.ss.android.ugc.aweme.photo.b.a.a(com.ss.android.ugc.aweme.port.in.a.f61119b, str);
        }
        return true;
    }

    public final Bitmap b(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67750a, false, 74631, new Class[]{Object.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj}, this, f67750a, false, 74631, new Class[]{Object.class}, Bitmap.class);
        }
        cb cbVar = (cb) obj;
        if (PatchProxy.isSupport(new Object[]{cbVar}, this, f67750a, false, 74633, new Class[]{cb.class}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{cbVar}, this, f67750a, false, 74633, new Class[]{cb.class}, Bitmap.class);
        }
        if (cbVar.isMvThemeVideoType()) {
            String str = cbVar.mvCreateVideoData.videoCoverImgPath;
            if (b.b(str)) {
                return g.a(str, 90, 110);
            }
        }
        String validVideoCoverPath = cbVar.getValidVideoCoverPath();
        if (validVideoCoverPath != null) {
            return g.a(validVideoCoverPath, 90, 110);
        }
        fb a2 = fb.a();
        String inputVideoFile = cbVar.getInputVideoFile();
        if (!PatchProxy.isSupport(new Object[]{inputVideoFile, 90, 110, 1}, a2, fb.f75865a, false, 88700, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return ThumbnailUtils.extractThumbnail(ThumbnailUtils.createVideoThumbnail(inputVideoFile, 1), 90, 110, 2);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{inputVideoFile, 90, 110, 1}, a2, fb.f75865a, false, 88700, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Bitmap.class);
    }

    private void a(cb cbVar, Collection<InteractStickerStruct> collection) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2, collection}, this, f67750a, false, 74636, new Class[]{cb.class, Collection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cbVar2, collection}, this, f67750a, false, 74636, new Class[]{cb.class, Collection.class}, Void.TYPE);
        } else if (cbVar2 == null || CollectionUtils.isEmpty(collection)) {
        } else if (ca.b(cbVar)) {
            for (InteractStickerStruct next : collection) {
                List<NormalTrackTimeStamp> list = null;
                try {
                    try {
                        list = (List) com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson().fromJson(next.getTrackList(), new TypeToken<List<NormalTrackTimeStamp>>() {
                        }.getType());
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                if (Lists.notEmpty(list)) {
                    for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                        if (normalTrackTimeStamp != null) {
                            float[] a2 = ca.a(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), cbVar2.mVideoCanvasWidth, cbVar2.mVideoCanvasHeight, cbVar2.mOutVideoWidth, cbVar2.mOutVideoHeight);
                            normalTrackTimeStamp.setX(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.e(a2[0]));
                            normalTrackTimeStamp.setY(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b.e(a2[1]));
                        }
                    }
                    try {
                        next.setTrackList(com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) list));
                    } catch (JsonIOException unused3) {
                    }
                }
            }
        }
    }

    public final ei<SynthetiseResult> a(cb cbVar, CancellationSignal cancellationSignal) {
        final e eVar;
        final cb cbVar2 = cbVar;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        int i = 2;
        if (PatchProxy.isSupport(new Object[]{cbVar2, cancellationSignal2}, this, f67750a, false, 74630, new Class[]{cb.class, CancellationSignal.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{cbVar2, cancellationSignal2}, this, f67750a, false, 74630, new Class[]{cb.class, CancellationSignal.class}, ei.class);
        }
        VEWatermarkParam vEWatermarkParam = null;
        if (cbVar.isSaveLocalWithWaterMark()) {
            int[] a2 = i.a(cbVar);
            if (cbVar2.mSaveModel.getSaveType() == 4) {
                eVar = new f(cbVar.getLocalTempPath(), a2[0], a2[1]);
                String[] a3 = eVar.a(true);
                eVar.a(false);
                vEWatermarkParam = com.ss.android.ugc.aweme.shortvideo.q.b.g.a(cbVar.getLocalTempPath(), a3, a2[0], a2[1], eVar.a());
            } else {
                eVar = new com.ss.android.ugc.aweme.shortvideo.q.b.a(cbVar.getLocalTempPath(), a2[0], a2[1], cbVar2.mSaveModel.getSaveType());
                vEWatermarkParam = com.ss.android.ugc.aweme.shortvideo.q.b.g.a(cbVar.getLocalTempPath(), eVar.a(true), eVar.a(false), a2[0], a2[1], eVar.a());
            }
            if (vEWatermarkParam == null) {
                return new ei<SynthetiseResult>() {
                    {
                        a((Throwable) new gq("add water failed, context is " + cbVar2.mVideoWidth + " " + cbVar2.mVideoHeight + " " + eVar.a(false), new SynthetiseResult()));
                    }
                };
            }
        }
        com.ss.android.ugc.aweme.port.in.a.f();
        if (cbVar2.mSaveModel == null || cbVar2.mSaveModel.getSaveType() != 1) {
            i = 0;
        }
        return new k(i).a(cbVar2, vEWatermarkParam, cancellationSignal2);
    }

    public final ei<SynthetiseResult> a(Object obj, CancellationSignal cancellationSignal) {
        if (PatchProxy.isSupport(new Object[]{obj, cancellationSignal}, this, f67750a, false, 74629, new Class[]{Object.class, CancellationSignal.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, cancellationSignal}, this, f67750a, false, 74629, new Class[]{Object.class, CancellationSignal.class}, ei.class);
        }
        ei<SynthetiseResult> a2 = a((cb) obj, cancellationSignal);
        l.a(a2, new com.google.common.util.concurrent.k<SynthetiseResult>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f67752a;

            public final void onFailure(@NotNull Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f67752a, false, 74641, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f67752a, false, 74641, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                l a2 = l.a();
                a2.a("synthetise failed\n" + u.b(th));
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67752a, false, 74640, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67752a, false, 74640, new Class[]{SynthetiseResult.class}, Void.TYPE);
                    return;
                }
                l a2 = l.a();
                a2.a("synthetise success " + synthetiseResult.outputFile);
                if (synthetiseResult.outputFile != null) {
                    l a3 = l.a();
                    a3.a(" size: " + new File(synthetiseResult.outputFile).length());
                    return;
                }
                l.a().a("output file == null");
            }
        }, com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final void a(BaseShortVideoContext baseShortVideoContext, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        InteractionCheckInfo interactionCheckInfo;
        BaseShortVideoContext baseShortVideoContext2 = baseShortVideoContext;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (PatchProxy.isSupport(new Object[]{baseShortVideoContext2, synthetiseResult2, linkedHashMap2}, this, f67750a, false, 74638, new Class[]{BaseShortVideoContext.class, SynthetiseResult.class, LinkedHashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseShortVideoContext2, synthetiseResult2, linkedHashMap2}, this, f67750a, false, 74638, new Class[]{BaseShortVideoContext.class, SynthetiseResult.class, LinkedHashMap.class}, Void.TYPE);
            return;
        }
        Gson gson = com.ss.android.ugc.aweme.port.in.a.f61120c;
        if (baseShortVideoContext2.challenges != null && !baseShortVideoContext2.challenges.isEmpty()) {
            ArrayList arrayList = new ArrayList(baseShortVideoContext2.challenges.size());
            for (c cid : baseShortVideoContext2.challenges) {
                arrayList.add(cid.getCid());
            }
            linkedHashMap2.put("challenge_list", gson.toJson((Object) arrayList));
        }
        if (baseShortVideoContext2.title != null) {
            linkedHashMap2.put("text", baseShortVideoContext2.title);
        }
        if (baseShortVideoContext2.structList != null && !baseShortVideoContext2.structList.isEmpty()) {
            String json = gson.toJson((Object) baseShortVideoContext2.structList);
            if (json.contains("hashTagName")) {
                json = json.replaceAll("hashTagName", "hashtag_name");
            }
            linkedHashMap2.put("text_extra", json);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.city)) {
            linkedHashMap2.put("city", baseShortVideoContext2.city);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.longitude)) {
            linkedHashMap2.put("longitude", baseShortVideoContext2.longitude);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.latitude)) {
            linkedHashMap2.put("latitude", baseShortVideoContext2.latitude);
        }
        linkedHashMap2.put("is_private", String.valueOf(baseShortVideoContext2.isPrivate));
        linkedHashMap2.put("is_hash_tag", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        if (!TextUtils.isEmpty(baseShortVideoContext2.mSyncPlatforms)) {
            for (int i : com.ss.android.ugc.aweme.shortvideo.api.a.a(baseShortVideoContext2.mSyncPlatforms)) {
                if (i != 100) {
                    switch (i) {
                        case 0:
                            linkedHashMap2.put("sync_to_hotsoon", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                            break;
                        case 1:
                            linkedHashMap2.put("sync_to_toutiao", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                            break;
                    }
                } else {
                    linkedHashMap2.put("sync_to_helo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
            }
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.mShootWay)) {
            linkedHashMap2.put("shoot_way", baseShortVideoContext2.mShootWay);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext2.mPropSource)) {
            linkedHashMap2.put("prop_selected_from", baseShortVideoContext2.mPropSource);
        }
        linkedHashMap2.put("is_hard_code", String.valueOf(synthetiseResult.getReportHardEncode()));
        if (!TextUtils.isEmpty(synthetiseResult2.cpuName)) {
            linkedHashMap2.put("cpu_info", synthetiseResult2.cpuName);
        }
        if (!TextUtils.isEmpty(synthetiseResult2.gpuName)) {
            linkedHashMap2.put("gpu_info", synthetiseResult2.gpuName);
        }
        linkedHashMap2.put("file_fps", String.valueOf(synthetiseResult2.fileFps));
        linkedHashMap2.put("item_comment", String.valueOf(baseShortVideoContext2.commentSetting));
        if (com.ss.android.g.a.a()) {
            linkedHashMap2.put("item_react", String.valueOf(baseShortVideoContext2.reactDuetSetting));
            linkedHashMap2.put("item_duet", String.valueOf(baseShortVideoContext2.reactDuetSetting));
        }
        for (com.ss.android.ugc.aweme.shortvideo.publish.b a2 : com.ss.android.ugc.aweme.port.in.a.t.b()) {
            a2.a(baseShortVideoContext2, linkedHashMap2);
        }
        if (!j.a((Collection<T>) baseShortVideoContext2.arTextList)) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = baseShortVideoContext2.arTextList.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            String jSONArray2 = jSONArray.toString();
            if (!TextUtils.isEmpty(jSONArray2)) {
                linkedHashMap2.put("ar_text", jSONArray2);
            }
        }
        JSONArray jSONArray3 = new JSONArray();
        if (!j.a((Collection<T>) baseShortVideoContext2.messageBubbleTexts)) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator<String> it3 = baseShortVideoContext2.messageBubbleTexts.iterator();
            while (it3.hasNext()) {
                jSONArray4.put(it3.next());
            }
            try {
                jSONArray3.put(new JSONObject().put("type", 1).put("data", jSONArray4));
            } catch (JSONException unused) {
            }
        }
        com.ss.android.ugc.aweme.story.shootvideo.textfont.h.a(baseShortVideoContext2, jSONArray3);
        if (!TextUtils.isEmpty(baseShortVideoContext2.mainBusinessData)) {
            if (!CollectionUtils.isEmpty(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(baseShortVideoContext2.mainBusinessData, d.TRACK_PAGE_EDIT))) {
                InteractStickerStruct a3 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(baseShortVideoContext2.mainBusinessData, 1, d.TRACK_PAGE_EDIT);
                if (!(a3 == null || a3.getVoteStruct() == null)) {
                    try {
                        JSONObject put = new JSONObject().put("type", 3);
                        Gson retrofitFactoryGson = com.ss.android.ugc.aweme.port.in.a.D.getRetrofitFactoryGson();
                        VoteStruct voteStruct = a3.getVoteStruct();
                        if (PatchProxy.isSupport(new Object[]{voteStruct}, null, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a, true, 76900, new Class[]{VoteStruct.class}, InteractionCheckInfo.class)) {
                            interactionCheckInfo = (InteractionCheckInfo) PatchProxy.accessDispatch(new Object[]{voteStruct}, null, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.f67249a, true, 76900, new Class[]{VoteStruct.class}, InteractionCheckInfo.class);
                        } else if (voteStruct == null) {
                            interactionCheckInfo = null;
                        } else {
                            InteractionCheckInfo interactionCheckInfo2 = new InteractionCheckInfo();
                            LinkedList linkedList = new LinkedList();
                            if (voteStruct.getOptions().size() == 2) {
                                linkedList.add(voteStruct.getOptions().get(0).getPostOption());
                                linkedList.add(voteStruct.getOptions().get(1).getPostOption());
                                interactionCheckInfo2.setOptions(linkedList);
                            }
                            interactionCheckInfo2.setQuestion(voteStruct.getQuestion());
                            interactionCheckInfo = interactionCheckInfo2;
                        }
                        jSONArray3.put(put.put("data", new JSONObject(retrofitFactoryGson.toJson((Object) interactionCheckInfo))));
                    } catch (JSONException unused2) {
                    }
                }
            }
        }
        if (jSONArray3.length() != 0) {
            linkedHashMap2.put("sticker_text", jSONArray3.toString());
        }
    }
}
