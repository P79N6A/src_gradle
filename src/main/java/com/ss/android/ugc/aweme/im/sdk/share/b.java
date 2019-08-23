package com.ss.android.ugc.aweme.im.sdk.share;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.OnlyPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SelfStoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareCouponContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareGoodWindowContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMiniAppContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareMusicContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareRankingListContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.ShareWebContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryReplyContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.android.ugc.aweme.im.sdk.d.d;
import com.ss.android.ugc.aweme.im.sdk.utils.ba;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52398a;

    public interface a {
        void onShare(String str);
    }

    public static boolean a(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (!PatchProxy.isSupport(new Object[]{shareStruct2}, null, f52398a, true, 53215, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
            return TextUtils.equals("aweme", shareStruct2.itemType);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, f52398a, true, 53215, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
    }

    public static void a(List<String> list, String str, BaseContent baseContent) {
        List<String> list2 = list;
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{list2, str, baseContent2}, null, f52398a, true, 53224, new Class[]{List.class, String.class, BaseContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str, baseContent2}, null, f52398a, true, 53224, new Class[]{List.class, String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        z.a().a(list.size());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent2);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        ba.a().b(list2, (List<BaseContent>) arrayList);
    }

    @NonNull
    private static ShareAwemeContent c(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, f52398a, true, 53214, new Class[]{IShareService.ShareStruct.class}, ShareAwemeContent.class)) {
            return (ShareAwemeContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, f52398a, true, 53214, new Class[]{IShareService.ShareStruct.class}, ShareAwemeContent.class);
        } else if (shareStruct2.awemeType == 2) {
            return SharePictureContent.fromShareStruct(shareStruct);
        } else {
            return ShareAwemeContent.fromShareStruct(shareStruct);
        }
    }

    public static BaseContent b(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, f52398a, true, 53216, new Class[]{IShareService.ShareStruct.class}, BaseContent.class)) {
            return (BaseContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, f52398a, true, 53216, new Class[]{IShareService.ShareStruct.class}, BaseContent.class);
        } else if (TextUtils.equals("aweme", shareStruct2.itemType)) {
            return c(shareStruct);
        } else {
            if (TextUtils.equals("poi", shareStruct2.itemType)) {
                return SharePoiContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("music", shareStruct2.itemType)) {
                return ShareMusicContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("challenge", shareStruct2.itemType)) {
                return ShareChallengeContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("ranking", shareStruct2.itemType)) {
                return ShareRankingListContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("game", shareStruct2.itemType)) {
                return ShareMiniAppContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals(AllStoryActivity.f73306b, shareStruct2.itemType)) {
                return ShareUserContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("web", shareStruct2.itemType)) {
                return ShareWebContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("live", shareStruct2.itemType)) {
                return ShareLiveContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("story_reply", shareStruct2.itemType)) {
                return StoryReplyContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("story_self_reply", shareStruct2.itemType)) {
                return SelfStoryReplyContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("coupon", shareStruct2.itemType)) {
                return ShareCouponContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("good", shareStruct2.itemType)) {
                return ShareGoodContent.fromShareStruct(shareStruct);
            }
            if (TextUtils.equals("good_window", shareStruct2.itemType)) {
                return ShareGoodWindowContent.fromShareStruct(shareStruct);
            }
            return null;
        }
    }

    public static void a(IShareService.ShareStruct shareStruct, IMContact iMContact, boolean z) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, iMContact, Byte.valueOf(z ? (byte) 1 : 0)}, null, f52398a, true, 53225, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, iMContact, Byte.valueOf(z)}, null, f52398a, true, 53225, new Class[]{IShareService.ShareStruct.class, IMContact.class, Boolean.TYPE}, Void.TYPE);
        } else if (TextUtils.equals(shareStruct2.itemType, "game")) {
            UIUtils.displayToast(GlobalContext.getContext(), (int) C0906R.string.axi);
        } else {
            String str = "";
            if (shareStruct2.extraParams != null && shareStruct2.extraParams.containsKey("aid")) {
                str = shareStruct2.extraParams.get("aid");
            }
            String str2 = str;
            c a2 = c.a();
            g gVar = new g(iMContact, z, shareStruct2.itemType, shareStruct2.enterFrom, str2);
            a2.d(gVar);
        }
    }

    public static void a(IMUser iMUser, String str, BaseContent baseContent) {
        BaseContent baseContent2 = baseContent;
        if (PatchProxy.isSupport(new Object[]{iMUser, str, baseContent2}, null, f52398a, true, 53220, new Class[]{IMUser.class, String.class, BaseContent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser, str, baseContent2}, null, f52398a, true, 53220, new Class[]{IMUser.class, String.class, BaseContent.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent2);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        ba.a().b(iMUser.getUid(), (List<BaseContent>) arrayList);
    }

    public static void a(Context context, IMContact iMContact, IShareService.ShareStruct shareStruct, BaseContent baseContent, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
        Context context2 = context;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        BaseContent baseContent2 = baseContent;
        com.ss.android.ugc.aweme.base.a<Boolean> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, iMContact, shareStruct2, baseContent2, aVar2}, null, f52398a, true, 53221, new Class[]{Context.class, IMContact.class, IShareService.ShareStruct.class, BaseContent.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            Object[] objArr = {context2, iMContact, shareStruct2, baseContent2, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52398a, true, 53221, new Class[]{Context.class, IMContact.class, IShareService.ShareStruct.class, BaseContent.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
            return;
        }
        a(context2, Collections.singletonList(iMContact), shareStruct2, baseContent2, aVar2);
    }

    public static void a(Context context, List<IMContact> list, IShareService.ShareStruct shareStruct, BaseContent baseContent, com.ss.android.ugc.aweme.base.a<Boolean> aVar) {
        String str;
        List<IMContact> list2 = list;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        com.ss.android.ugc.aweme.base.a<Boolean> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context, list2, shareStruct2, baseContent, aVar2}, null, f52398a, true, 53222, new Class[]{Context.class, List.class, IShareService.ShareStruct.class, BaseContent.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            Object[] objArr = {context, list2, shareStruct2, baseContent, aVar2};
            PatchProxy.accessDispatch(objArr, null, f52398a, true, 53222, new Class[]{Context.class, List.class, IShareService.ShareStruct.class, BaseContent.class, com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
        } else if (shareStruct2 != null) {
            if (shareStruct2.extraParams == null) {
                str = "";
            } else {
                str = shareStruct2.extraParams.get("multi_share_msg");
            }
            String str2 = str;
            final Context context2 = context;
            final List<IMContact> list3 = list;
            final IShareService.ShareStruct shareStruct3 = shareStruct;
            final BaseContent baseContent2 = baseContent;
            final com.ss.android.ugc.aweme.base.a<Boolean> aVar3 = aVar;
            AnonymousClass2 r0 = new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52403a;

                public final void onShare(final String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f52403a, false, 53229, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f52403a, false, 53229, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    new com.ss.android.ugc.aweme.im.sdk.a.b(context2, new com.ss.android.ugc.aweme.im.sdk.a.c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52409a;

                        public final void sendMsg() {
                            boolean z;
                            if (PatchProxy.isSupport(new Object[0], this, f52409a, false, 53230, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f52409a, false, 53230, new Class[0], Void.TYPE);
                                return;
                            }
                            List list = list3;
                            String str = str;
                            IShareService.ShareStruct shareStruct = shareStruct3;
                            BaseContent baseContent = baseContent2;
                            if (PatchProxy.isSupport(new Object[]{list, str, shareStruct, baseContent}, null, b.f52398a, true, 53223, new Class[]{List.class, String.class, IShareService.ShareStruct.class, BaseContent.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{list, str, shareStruct, baseContent}, null, b.f52398a, true, 53223, new Class[]{List.class, String.class, IShareService.ShareStruct.class, BaseContent.class}, Void.TYPE);
                            } else {
                                if (baseContent instanceof TextContent) {
                                    baseContent = TextContent.obtain((TextContent) baseContent);
                                } else if (baseContent == null) {
                                    baseContent = b.b(shareStruct);
                                }
                                if (baseContent instanceof StoryPictureContent) {
                                    ((StoryPictureContent) baseContent).setMassMsg(1);
                                } else if (baseContent instanceof StoryVideoContent) {
                                    ((StoryVideoContent) baseContent).setMassMsg(1);
                                }
                                if (list != null && !list.isEmpty()) {
                                    List a2 = d.a((IMContact[]) list.toArray(new IMContact[0]));
                                    if (a2.size() > 1) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    String a3 = s.a().a(baseContent);
                                    if (!TextUtils.isEmpty(a3)) {
                                        s a4 = s.a();
                                        AnonymousClass3 r9 = new x(baseContent, a2, str, shareStruct, list, z) {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f52412a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ BaseContent f52413b;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ List f52414c;

                                            /* renamed from: d  reason: collision with root package name */
                                            final /* synthetic */ String f52415d;

                                            /* renamed from: e  reason: collision with root package name */
                                            final /* synthetic */ IShareService.ShareStruct f52416e;

                                            /* renamed from: f  reason: collision with root package name */
                                            final /* synthetic */ List f52417f;
                                            final /* synthetic */ boolean g;

                                            public final void a() {
                                            }

                                            public final void a(double d2) {
                                            }

                                            public final void a(Throwable th) {
                                            }

                                            public final void a(String str) {
                                                if (PatchProxy.isSupport(new Object[]{str}, this, f52412a, false, 53232, new Class[]{String.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{str}, this, f52412a, false, 53232, new Class[]{String.class}, Void.TYPE);
                                                    return;
                                                }
                                                b.a(this.f52414c, this.f52415d, this.f52413b);
                                                b.a(this.f52416e, (IMContact) this.f52417f.get(0), this.g);
                                            }

                                            public final void a(String str, UrlModel urlModel) {
                                                if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f52412a, false, 53231, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f52412a, false, 53231, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                                                    return;
                                                }
                                                if (this.f52413b instanceof SharePoiContent) {
                                                    ((SharePoiContent) this.f52413b).setMapUrl(urlModel);
                                                } else if (this.f52413b instanceof OnlyPictureContent) {
                                                    ((OnlyPictureContent) this.f52413b).setUrl(urlModel);
                                                } else if (this.f52413b instanceof StoryPictureContent) {
                                                    ((StoryPictureContent) this.f52413b).setUrl((com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a) urlModel);
                                                }
                                                b.a(this.f52414c, this.f52415d, this.f52413b);
                                                b.a(this.f52416e, (IMContact) this.f52417f.get(0), this.g);
                                            }

                                            {
                                                this.f52413b = r1;
                                                this.f52414c = r2;
                                                this.f52415d = r3;
                                                this.f52416e = r4;
                                                this.f52417f = r5;
                                                this.g = r6;
                                            }
                                        };
                                        a4.a(a3, baseContent, r9);
                                    } else {
                                        b.a(a2, str, baseContent);
                                        b.a(shareStruct, (IMContact) list.get(0), z);
                                    }
                                }
                            }
                            if (aVar3 != null) {
                                aVar3.run(Boolean.TRUE);
                            }
                        }
                    }).sendMsg();
                }
            };
            a(context, shareStruct, (IMContact[]) list2.toArray(new IMContact[0]), str2, r0, new c(aVar2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r27, com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r28, com.ss.android.ugc.aweme.im.service.model.IMContact[] r29, java.lang.String r30, com.ss.android.ugc.aweme.im.sdk.share.b.a r31, com.ss.android.ugc.aweme.im.sdk.share.b.a r32) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = 6
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = 0
            r7[r14] = r0
            r15 = 1
            r7[r15] = r1
            r16 = 2
            r7[r16] = r2
            r17 = 3
            r7[r17] = r3
            r18 = 4
            r7[r18] = r4
            r19 = 5
            r7[r19] = r5
            com.meituan.robust.ChangeQuickRedirect r9 = f52398a
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r12[r14] = r8
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r8 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r12[r15] = r8
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r8 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r12[r16] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r17] = r8
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.b$a> r8 = com.ss.android.ugc.aweme.im.sdk.share.b.a.class
            r12[r18] = r8
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.b$a> r8 = com.ss.android.ugc.aweme.im.sdk.share.b.a.class
            r12[r19] = r8
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = 0
            r10 = 1
            r11 = 53218(0xcfe2, float:7.4574E-41)
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x0089
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r14] = r0
            r7[r15] = r1
            r7[r16] = r2
            r7[r17] = r3
            r7[r18] = r4
            r7[r19] = r5
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = f52398a
            r23 = 1
            r24 = 53218(0xcfe2, float:7.4574E-41)
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r0[r15] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r0[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r17] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.b$a> r1 = com.ss.android.ugc.aweme.im.sdk.share.b.a.class
            r0[r18] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.share.b$a> r1 = com.ss.android.ugc.aweme.im.sdk.share.b.a.class
            r0[r19] = r1
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r7
            r25 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0089:
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r6 = new com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a
            r6.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r6.a((com.ss.android.ugc.aweme.im.service.model.IMContact[]) r2)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r0.a((com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct) r1)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r0.a((com.ss.android.ugc.aweme.im.sdk.share.b.a) r5)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r0.b((com.ss.android.ugc.aweme.im.sdk.share.b.a) r4)
            r1 = 416(0x1a0, float:5.83E-43)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r0.a((int) r1)
            r1 = 335(0x14f, float:4.7E-43)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r0.b((int) r1)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog$a r0 = r0.a((java.lang.String) r3)
            com.ss.android.ugc.aweme.im.sdk.widget.ImShareDialog r0 = r0.a()
            r0.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.b.a(android.content.Context, com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, com.ss.android.ugc.aweme.im.service.model.IMContact[], java.lang.String, com.ss.android.ugc.aweme.im.sdk.share.b$a, com.ss.android.ugc.aweme.im.sdk.share.b$a):void");
    }
}
