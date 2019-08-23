package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.model.ImageModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53439a;

    private static ImageModel a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, f53439a, true, 55775, new Class[]{UrlModel.class}, ImageModel.class)) {
            return (ImageModel) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f53439a, true, 55775, new Class[]{UrlModel.class}, ImageModel.class);
        } else if (urlModel == null) {
            return null;
        } else {
            ImageModel imageModel = new ImageModel();
            imageModel.width = urlModel.getWidth();
            imageModel.height = urlModel.getHeight();
            imageModel.setUri(urlModel.getUri());
            imageModel.setUrls(urlModel.getUrlList());
            return imageModel;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.bytedance.android.live.base.model.user.User a(com.ss.android.ugc.aweme.profile.model.User r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f53439a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r7[r9] = r3
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r8 = com.bytedance.android.live.base.model.user.User.class
            r3 = 0
            r5 = 1
            r6 = 55774(0xd9de, float:7.8156E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f53439a
            r13 = 1
            r14 = 55774(0xd9de, float:7.8156E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
            r15[r9] = r0
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r16 = com.bytedance.android.live.base.model.user.User.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            return r0
        L_0x0035:
            r2 = 0
            if (r17 != 0) goto L_0x0039
            return r2
        L_0x0039:
            com.bytedance.android.live.base.model.user.User r3 = new com.bytedance.android.live.base.model.user.User
            r3.<init>()
            java.lang.String r4 = r17.getNickname()
            r3.setNickName(r4)
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r17.getAvatarMedium()
            if (r4 != 0) goto L_0x0062
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r17.getAvatarLarger()
            if (r4 != 0) goto L_0x005d
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r17.getAvatarThumb()
            if (r4 != 0) goto L_0x0058
            goto L_0x006a
        L_0x0058:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r17.getAvatarThumb()
            goto L_0x0066
        L_0x005d:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r17.getAvatarLarger()
            goto L_0x0066
        L_0x0062:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r17.getAvatarMedium()
        L_0x0066:
            java.lang.String r2 = r2.getUri()
        L_0x006a:
            r3.setAvatarUrl(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r17.getAvatarThumb()
            com.bytedance.android.live.base.model.ImageModel r2 = a((com.ss.android.ugc.aweme.base.model.UrlModel) r2)
            r3.setAvatarThumb(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r17.getAvatarMedium()
            com.bytedance.android.live.base.model.ImageModel r2 = a((com.ss.android.ugc.aweme.base.model.UrlModel) r2)
            r3.setAvatarMedium(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r17.getAvatarLarger()
            com.bytedance.android.live.base.model.ImageModel r2 = a((com.ss.android.ugc.aweme.base.model.UrlModel) r2)
            r3.setAvatarLarge(r2)
            java.lang.String r2 = r17.getCity()
            r3.setCity(r2)
            java.lang.String r2 = r17.getUid()
            r3.setIdStr(r2)
            java.lang.String r2 = r17.getUid()
            if (r2 != 0) goto L_0x00a5
            java.lang.String r2 = "0"
            goto L_0x00a9
        L_0x00a5:
            java.lang.String r2 = r17.getUid()
        L_0x00a9:
            long r4 = java.lang.Long.parseLong(r2)
            r3.setId(r4)
            java.lang.String r2 = r17.getShortId()
            if (r2 != 0) goto L_0x00b9
            java.lang.String r2 = "0"
            goto L_0x00bd
        L_0x00b9:
            java.lang.String r2 = r17.getShortId()
        L_0x00bd:
            long r4 = java.lang.Long.parseLong(r2)
            r3.setShortId(r4)
            int r2 = r17.getFollowStatus()
            r3.setFollowStatus(r2)
            java.lang.String r2 = r17.getSecUid()
            r3.setSecUid(r2)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.live.c.f36963a
            r13 = 1
            r14 = 28280(0x6e78, float:3.9629E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Boolean.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0107
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.live.c.f36963a
            r13 = 1
            r14 = 28280(0x6e78, float:3.9629E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
        L_0x0100:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            goto L_0x014e
        L_0x0107:
            com.ss.android.ugc.aweme.commerce.live.c$a r5 = com.ss.android.ugc.aweme.commerce.live.c.f36964b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commerce.live.c.a.f36965a
            r13 = 0
            r14 = 28283(0x6e7b, float:3.9633E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r2 = com.ss.android.ugc.aweme.profile.model.User.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r5
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0138
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commerce.live.c.a.f36965a
            r7 = 0
            r8 = 28283(0x6e7b, float:3.9633E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r0[r9] = r1
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r9 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0100
        L_0x0138:
            if (r17 == 0) goto L_0x014d
            boolean r2 = r17.isLiveCommerce()
            if (r2 == 0) goto L_0x014d
            boolean r2 = r17.isWithCommerceEntry()
            if (r2 == 0) goto L_0x014d
            boolean r0 = r17.isWithFusionShopEntry()
            if (r0 == 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r1 = 0
        L_0x014e:
            r3.setWithCommercePermission(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.g.a(com.ss.android.ugc.aweme.profile.model.User):com.bytedance.android.live.base.model.user.User");
    }
}
