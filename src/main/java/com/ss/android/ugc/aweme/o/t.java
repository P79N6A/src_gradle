package com.ss.android.ugc.aweme.o;

import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.google.common.util.concurrent.q;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.f;
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.commercialize.star.c;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.poi.ui.publish.a;
import com.ss.android.ugc.aweme.poi.ui.publish.k;
import com.ss.android.ugc.aweme.port.in.af;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.f.d;
import com.ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi;
import com.ss.android.ugc.aweme.shortvideo.publish.CreatePhotoApi;
import com.ss.android.ugc.aweme.shortvideo.publish.b;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class t implements af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58328a;

    public final void a(BaseResponse baseResponse, List<InteractStickerStruct> list) {
        BaseResponse baseResponse2 = baseResponse;
        List<InteractStickerStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{baseResponse2, list2}, this, f58328a, false, 54861, new Class[]{BaseResponse.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse2, list2}, this, f58328a, false, 54861, new Class[]{BaseResponse.class, List.class}, Void.TYPE);
            return;
        }
        if (baseResponse2 instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse2;
            if (createAwemeResponse.aweme != null) {
                if (createAwemeResponse.aweme.getInteractStickerStructs() == null) {
                    createAwemeResponse.aweme.setInteractStickerStructs(new ArrayList());
                }
                ArrayList arrayList = new ArrayList(createAwemeResponse.aweme.getInteractStickerStructs());
                if (!CollectionUtils.isEmpty(list)) {
                    arrayList.addAll(list2);
                }
                createAwemeResponse.aweme.setInteractStickerStructs(arrayList);
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58328a, false, 54865, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58328a, false, 54865, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        bg.a(new d(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x020e, code lost:
        if (r1.hasExtra(r4) == false) goto L_0x0211;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@android.support.annotation.NonNull android.support.v4.app.FragmentActivity r29, @android.support.annotation.NonNull android.content.Intent r30, java.lang.Class<? extends android.app.Service> r31, java.lang.String r32, java.lang.String r33) {
        /*
            r28 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            r15 = 2
            r6[r15] = r2
            r12 = 3
            r6[r12] = r3
            r11 = 4
            r6[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r8 = f58328a
            java.lang.Class[] r10 = new java.lang.Class[r5]
            java.lang.Class<android.support.v4.app.FragmentActivity> r7 = android.support.v4.app.FragmentActivity.class
            r10[r13] = r7
            java.lang.Class<android.content.Intent> r7 = android.content.Intent.class
            r10[r14] = r7
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            r10[r15] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r10[r12] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r10[r11] = r7
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r9 = 0
            r17 = 54867(0xd653, float:7.6885E-41)
            r7 = r28
            r18 = r10
            r10 = r17
            r11 = r18
            r12 = r16
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0088
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            r6[r15] = r2
            r7 = 3
            r6[r7] = r3
            r8 = 4
            r6[r8] = r4
            com.meituan.robust.ChangeQuickRedirect r23 = f58328a
            r24 = 0
            r25 = 54867(0xd653, float:7.6885E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.v4.app.FragmentActivity.class
            r0[r13] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r0[r14] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r7] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r8] = r1
            java.lang.Class r27 = java.lang.Boolean.TYPE
            r21 = r6
            r22 = r28
            r26 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0088:
            r7 = 3
            r8 = 4
            java.lang.String r5 = "Tools-Client"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "PublishServiceImpl process publish intent:"
            r6.<init>(r9)
            android.os.Bundle r9 = r30.getExtras()
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.ss.android.ugc.aweme.framework.a.a.a(r8, r5, r6)
            java.lang.String r5 = "aweme"
            java.io.Serializable r5 = r1.getSerializableExtra(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            java.lang.String r6 = "aweme_response"
            java.io.Serializable r6 = r1.getSerializableExtra(r6)
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse r6 = (com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse) r6
            if (r5 == 0) goto L_0x00c1
            java.lang.String r2 = "processPublish.processPublish()"
            com.ss.android.ugc.aweme.util.c.a(r2)
            com.ss.android.ugc.aweme.o.u r2 = new com.ss.android.ugc.aweme.o.u
            r2.<init>(r5, r0, r1)
            com.ss.android.ugc.aweme.base.component.EventActivityComponent.a(r0, r6, r2)
            return r14
        L_0x00c1:
            java.lang.String r5 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            boolean r5 = r1.hasExtra(r5)
            if (r5 == 0) goto L_0x00cf
            java.lang.String r0 = "processPublish. EXTRA_AWEME_DRAFT "
            com.ss.android.ugc.aweme.util.c.a(r0)
            return r14
        L_0x00cf:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.services.IAVService r5 = (com.ss.android.ugc.aweme.services.IAVService) r5
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r5 = r5.avSettingsService()
            boolean r5 = r5.uploadOptimizeForPie()
            if (r5 != 0) goto L_0x016b
            boolean r5 = r1.hasExtra(r3)
            if (r5 != 0) goto L_0x016b
            java.lang.String r5 = "extra_photo_publish_args"
            boolean r5 = r1.hasExtra(r5)
            if (r5 != 0) goto L_0x016b
            boolean r5 = r1.hasExtra(r4)
            if (r5 != 0) goto L_0x016b
            java.lang.Object[] r5 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r18 = f58328a
            r19 = 0
            r20 = 54869(0xd655, float:7.6888E-41)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r5
            r17 = r28
            r21 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x0130
            java.lang.Object[] r5 = new java.lang.Object[r13]
            com.meituan.robust.ChangeQuickRedirect r18 = f58328a
            r19 = 0
            r20 = 54869(0xd655, float:7.6888E-41)
            java.lang.Class[] r6 = new java.lang.Class[r13]
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r5
            r17 = r28
            r21 = r6
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0157
        L_0x0130:
            java.lang.String r5 = android.os.Build.MODEL
            if (r5 == 0) goto L_0x013e
            java.lang.String r5 = android.os.Build.MODEL
            java.lang.String r6 = "SM-J610F"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 != 0) goto L_0x0154
        L_0x013e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.services.IAVService r5 = (com.ss.android.ugc.aweme.services.IAVService) r5
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r5 = r5.avSettingsService()
            boolean r5 = r5.enableUploadFallback()
            if (r5 == 0) goto L_0x0156
        L_0x0154:
            r5 = 1
            goto L_0x0157
        L_0x0156:
            r5 = 0
        L_0x0157:
            if (r5 == 0) goto L_0x016b
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto L_0x016b
            android.os.Bundle r5 = com.ss.android.ugc.aweme.services.publish.Publish.PublishBundle
            if (r5 == 0) goto L_0x016b
            android.os.Bundle r5 = com.ss.android.ugc.aweme.services.publish.Publish.PublishBundle
            r1.putExtras(r5)
            r5 = 0
            com.ss.android.ugc.aweme.services.publish.Publish.PublishBundle = r5
        L_0x016b:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r13] = r1
            r5[r14] = r3
            r5[r15] = r4
            com.meituan.robust.ChangeQuickRedirect r18 = f58328a
            r19 = 0
            r20 = 54868(0xd654, float:7.6886E-41)
            java.lang.Class[] r6 = new java.lang.Class[r7]
            java.lang.Class<android.content.Intent> r8 = android.content.Intent.class
            r6[r13] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r14] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r6[r15] = r8
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r5
            r17 = r28
            r21 = r6
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x01c6
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r13] = r1
            r5[r14] = r3
            r5[r15] = r4
            com.meituan.robust.ChangeQuickRedirect r18 = f58328a
            r19 = 0
            r20 = 54868(0xd654, float:7.6886E-41)
            java.lang.Class[] r3 = new java.lang.Class[r7]
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r3[r13] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r14] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r15] = r4
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r5
            r17 = r28
            r21 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0214
        L_0x01c6:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r6 = com.ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r5 = r5.getService(r6)
            com.ss.android.ugc.aweme.services.IAVService r5 = (com.ss.android.ugc.aweme.services.IAVService) r5
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r5 = r5.avSettingsService()
            boolean r5 = r5.uploadOptimizeForPie()
            if (r5 == 0) goto L_0x01fc
            java.lang.String r5 = "publish_bundle"
            android.os.Bundle r5 = r1.getBundleExtra(r5)
            if (r5 == 0) goto L_0x0211
            java.io.Serializable r3 = r5.getSerializable(r3)
            if (r3 != 0) goto L_0x01f8
            java.lang.String r3 = "extra_photo_publish_args"
            java.io.Serializable r3 = r5.getSerializable(r3)
            if (r3 != 0) goto L_0x01f8
            android.os.Parcelable r3 = r5.getParcelable(r4)
            if (r3 == 0) goto L_0x0211
        L_0x01f8:
            r1.putExtras(r5)
            goto L_0x0213
        L_0x01fc:
            boolean r3 = r1.hasExtra(r3)
            if (r3 != 0) goto L_0x0213
            java.lang.String r3 = "extra_photo_publish_args"
            boolean r3 = r1.hasExtra(r3)
            if (r3 != 0) goto L_0x0213
            boolean r3 = r1.hasExtra(r4)
            if (r3 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r3 = 0
            goto L_0x0214
        L_0x0213:
            r3 = 1
        L_0x0214:
            if (r3 == 0) goto L_0x024a
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0, r2)
            r3.putExtras(r1)
            r0.startService(r3)     // Catch:{ SecurityException -> 0x0232 }
            java.lang.String r2 = "synthetise_only"
            boolean r1 = r1.getBooleanExtra(r2, r13)
            if (r1 != 0) goto L_0x0231
            com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl r1 = new com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl
            r1.<init>(r0)
            r0.bindService(r3, r1, r14)
        L_0x0231:
            return r14
        L_0x0232:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "PublishServiceImpl.processPublish() startService error "
            r0.<init>(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.util.c.a(r0)
            return r13
        L_0x024a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.o.t.a(android.support.v4.app.FragmentActivity, android.content.Intent, java.lang.Class, java.lang.String, java.lang.String):boolean");
    }

    public final void a(AVPublishContentType aVPublishContentType, List<Pair<Class<?>, IAVPublishExtension<?>>> list) {
        List<Pair<Class<?>, IAVPublishExtension<?>>> list2 = list;
        if (PatchProxy.isSupport(new Object[]{aVPublishContentType, list2}, this, f58328a, false, 54872, new Class[]{AVPublishContentType.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVPublishContentType, list2}, this, f58328a, false, 54872, new Class[]{AVPublishContentType.class, List.class}, Void.TYPE);
            return;
        }
        if (AnonymousClass1.f58329a[aVPublishContentType.ordinal()] == 1) {
            a aVar = (a) AVPublishExtensionUtils.findExtension(list2, PoiAndGoodsPublishModel.class);
            c cVar = (c) AVPublishExtensionUtils.findExtension(list2, StarAtlasPublishModel.class);
            aVar.f3764c.n = cVar.f39489b;
            cVar.f39489b.setPoiAndGoodsPublishViewHolder(aVar.f3764c);
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f58328a, false, 54870, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58328a, false, 54870, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return true;
        } else {
            return com.ss.android.ugc.aweme.freeflowcard.a.a.a().c();
        }
    }

    public final List<b> b() {
        if (PatchProxy.isSupport(new Object[0], this, f58328a, false, 54873, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f58328a, false, 54873, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new k());
        arrayList.add(new f());
        arrayList.add(new com.ss.android.ugc.aweme.opensdk.share.d());
        return arrayList;
    }

    public final HashMap<String, String> a(Object obj) {
        String str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f58328a, false, 54862, new Class[]{Object.class}, HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[]{obj2}, this, f58328a, false, 54862, new Class[]{Object.class}, HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (obj2 instanceof BaseShortVideoContext) {
            return hashMap;
        }
        PhotoContext photoContext = (PhotoContext) obj2;
        e a2 = e.a(photoContext);
        if (a2.f39379f != null) {
            hashMap.put("shop_order_share", new Gson().toJson((Object) a2.f39379f.getShopOrderShareStruct()));
        }
        if (e.a(photoContext).f39375b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put("commerce_ad_link", str);
        return hashMap;
    }

    public final List<Pair<Class<?>, IAVPublishExtension<?>>> a(AVPublishContentType aVPublishContentType) {
        if (PatchProxy.isSupport(new Object[]{aVPublishContentType}, this, f58328a, false, 54871, new Class[]{AVPublishContentType.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aVPublishContentType}, this, f58328a, false, 54871, new Class[]{AVPublishContentType.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        switch (aVPublishContentType) {
            case Video:
            case PhotoMovie:
                arrayList.add(Pair.create(StarAtlasPublishModel.class, new c()));
                arrayList.add(Pair.create(PoiAndGoodsPublishModel.class, new a()));
                break;
            case Photo:
                arrayList.add(Pair.create(PoiAndGoodsPublishModel.class, new a()));
                break;
            default:
                throw new IllegalArgumentException("unknown type: " + aVPublishContentType.getContentType());
        }
        return arrayList;
    }

    public final q<? extends at> a(String str, LinkedHashMap<String, String> linkedHashMap) {
        String str2 = str;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (!PatchProxy.isSupport(new Object[]{str2, linkedHashMap2}, this, f58328a, false, 54863, new Class[]{String.class, LinkedHashMap.class}, q.class)) {
            return CreateAwemeApi.f68861a.createAweme(str2, linkedHashMap2);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{str2, linkedHashMap2}, this, f58328a, false, 54863, new Class[]{String.class, LinkedHashMap.class}, q.class);
    }

    public final q<? extends at> b(String str, LinkedHashMap<String, String> linkedHashMap) {
        String str2 = str;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (!PatchProxy.isSupport(new Object[]{str2, linkedHashMap2}, this, f58328a, false, 54864, new Class[]{String.class, LinkedHashMap.class}, q.class)) {
            return CreatePhotoApi.f68862a.createAweme(str2, linkedHashMap2);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{str2, linkedHashMap2}, this, f58328a, false, 54864, new Class[]{String.class, LinkedHashMap.class}, q.class);
    }

    public final void a(BaseResponse baseResponse, int i) {
        BaseResponse baseResponse2 = baseResponse;
        if (PatchProxy.isSupport(new Object[]{baseResponse2, Integer.valueOf(i)}, this, f58328a, false, 54860, new Class[]{BaseResponse.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse2, Integer.valueOf(i)}, this, f58328a, false, 54860, new Class[]{BaseResponse.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (baseResponse2 instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse2;
            if (createAwemeResponse.aweme != null) {
                createAwemeResponse.aweme.getVideo().setVideoLength(i);
            }
        }
    }

    public final void a(SettingItemSwitch settingItemSwitch, boolean z, @Nullable HashMap<String, String> hashMap) {
        SettingItemSwitch settingItemSwitch2 = settingItemSwitch;
        HashMap<String, String> hashMap2 = hashMap;
        if (PatchProxy.isSupport(new Object[]{settingItemSwitch2, Byte.valueOf(z ? (byte) 1 : 0), hashMap2}, this, f58328a, false, 54866, new Class[]{SettingItemSwitch.class, Boolean.TYPE, HashMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{settingItemSwitch2, Byte.valueOf(z), hashMap2}, this, f58328a, false, 54866, new Class[]{SettingItemSwitch.class, Boolean.TYPE, HashMap.class}, Void.TYPE);
            return;
        }
        new com.ss.android.ugc.aweme.shortvideo.ui.t(settingItemSwitch2, z, hashMap2);
    }
}
