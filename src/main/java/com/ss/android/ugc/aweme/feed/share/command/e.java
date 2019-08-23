package com.ss.android.ugc.aweme.feed.share.command;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.option.share.ShareInfoModel;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45946a;

    public static d a(Aweme aweme, Context context) {
        Aweme aweme2 = aweme;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{aweme2, context2}, null, f45946a, true, 42160, new Class[]{Aweme.class, Context.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{aweme2, context2}, null, f45946a, true, 42160, new Class[]{Aweme.class, Context.class}, d.class);
        }
        d dVar = new d();
        if (aweme2 == null) {
            return dVar;
        }
        dVar.f45944e = aweme.getAid();
        dVar.f45940a = 1;
        dVar.f45942c = aweme.getDesc();
        dVar.f45943d = aweme.getAuthor().getNickname();
        dVar.j = i.a(context2, aweme2, "");
        if (aweme.getVideo() != null && !CollectionUtils.isEmpty(aweme.getVideo().getCover().getUrlList())) {
            dVar.f45941b = aweme.getVideo().getCover().getUrlList().get(0);
        }
        if (aweme.isForwardAweme() && aweme.getForwardItem() != null) {
            dVar.f45940a = 19;
            dVar.f45942c = context2.getString(C0906R.string.ahh, new Object[]{aweme.getForwardItem().getAuthor().getNickname(), aweme.getDesc()});
            if (aweme.getForwardItem().getVideo() != null && !CollectionUtils.isEmpty(aweme.getForwardItem().getVideo().getCover().getUrlList())) {
                dVar.f45941b = aweme.getForwardItem().getVideo().getCover().getUrlList().get(0);
            }
        }
        return dVar;
    }

    public static d b(ShareInfoModel shareInfoModel, Context context) {
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        if (PatchProxy.isSupport(new Object[]{shareInfoModel2, context}, null, f45946a, true, 42162, new Class[]{ShareInfoModel.class, Context.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{shareInfoModel2, context}, null, f45946a, true, 42162, new Class[]{ShareInfoModel.class, Context.class}, d.class);
        }
        d dVar = new d();
        if (shareInfoModel2 == null || shareInfoModel2.appInfo == null) {
            return dVar;
        }
        AppInfoEntity appInfoEntity = shareInfoModel2.appInfo;
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        String str = (String) hashMap.get("iid");
        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        String str2 = "";
        if (iMiniAppService.isMicroAppSchema(shareInfoModel2.schema)) {
            str2 = "microapp";
        } else if (iMiniAppService.isMicroGameSchema(shareInfoModel2.schema)) {
            str2 = "microgame";
        }
        String str3 = "snssdk1128://" + str2 + "?&app_id=" + shareInfoModel2.appInfo.appId + "&token=" + shareInfoModel2.token + "&launch_from=" + shareInfoModel2.channel + "&start_page=" + shareInfoModel2.queryString + "&iid=" + str;
        if (iMiniAppService.isMicroAppSchema(shareInfoModel2.schema)) {
            str3 = str3 + "&start_page=" + shareInfoModel2.queryString;
        } else if (iMiniAppService.isMicroGameSchema(shareInfoModel2.schema)) {
            str3 = str3 + "&query=" + shareInfoModel2.queryString;
        }
        try {
            str3 = URLEncoder.encode(str3, "UTF8");
        } catch (UnsupportedEncodingException unused) {
        }
        dVar.f45944e = appInfoEntity.appId;
        dVar.f45945f = "https://a.app.qq.com/o/simple.jsp?pkgname=com.ss.android.ugc.aweme&android_scheme=" + str3;
        dVar.f45940a = 12;
        dVar.i = 13;
        dVar.f45941b = shareInfoModel2.appInfo.icon;
        dVar.f45942c = shareInfoModel2.title;
        dVar.g = shareInfoModel2.channel;
        User curUser = d.a().getCurUser();
        if (curUser == null || TextUtils.isEmpty(curUser.getNickname())) {
            dVar.f45943d = appInfoEntity.appName;
        } else {
            dVar.f45943d = d.a().getCurUser().getNickname();
        }
        dVar.h = 7;
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        if (r8.equals("weixin") != false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.feed.share.command.d a(com.tt.option.share.ShareInfoModel r19, android.content.Context r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f45946a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.tt.option.share.ShareInfoModel> r4 = com.tt.option.share.ShareInfoModel.class
            r8[r10] = r4
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r11] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.share.command.d> r9 = com.ss.android.ugc.aweme.feed.share.command.d.class
            r4 = 0
            r6 = 1
            r7 = 42161(0xa4b1, float:5.908E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f45946a
            r15 = 1
            r16 = 42161(0xa4b1, float:5.908E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.tt.option.share.ShareInfoModel> r1 = com.tt.option.share.ShareInfoModel.class
            r0[r10] = r1
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.share.command.d> r18 = com.ss.android.ugc.aweme.feed.share.command.d.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.feed.share.command.d r0 = (com.ss.android.ugc.aweme.feed.share.command.d) r0
            return r0
        L_0x0048:
            com.tt.miniapphost.entity.AppInfoEntity r3 = r0.appInfo
            int r3 = r3.type
            if (r3 != r2) goto L_0x0050
            r3 = 1
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            com.ss.android.ugc.aweme.feed.share.command.d r4 = new com.ss.android.ugc.aweme.feed.share.command.d
            r4.<init>()
            if (r3 == 0) goto L_0x005b
            java.lang.String r5 = "microgame"
            goto L_0x005d
        L_0x005b:
            java.lang.String r5 = "microapp"
        L_0x005d:
            com.tt.miniapphost.entity.AppInfoEntity r6 = r0.appInfo
            java.lang.String r6 = r6.appId
            r4.f45944e = r6
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.ss.android.common.applog.NetUtil.putCommonParams(r6, r11)
            java.lang.String r7 = "iid"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            java.lang.String r8 = r0.shareType
            if (r8 == 0) goto L_0x00ca
            java.lang.String r8 = r0.shareType
            r9 = -1
            int r12 = r8.hashCode()
            r13 = -929929834(0xffffffffc8926596, float:-299820.7)
            if (r12 == r13) goto L_0x00b0
            r13 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            if (r12 == r13) goto L_0x00a7
            r2 = 3616(0xe20, float:5.067E-42)
            if (r12 == r2) goto L_0x009d
            r2 = 108102557(0x671839d, float:4.5423756E-35)
            if (r12 == r2) goto L_0x0093
            goto L_0x00ba
        L_0x0093:
            java.lang.String r2 = "qzone"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00ba
            r2 = 1
            goto L_0x00bb
        L_0x009d:
            java.lang.String r2 = "qq"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00ba
            r2 = 0
            goto L_0x00bb
        L_0x00a7:
            java.lang.String r10 = "weixin"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00b0:
            java.lang.String r2 = "weixin_moments"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00ba
            r2 = 3
            goto L_0x00bb
        L_0x00ba:
            r2 = -1
        L_0x00bb:
            switch(r2) {
                case 0: goto L_0x00c8;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bf;
                default: goto L_0x00be;
            }
        L_0x00be:
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r7 = "share_moments"
            goto L_0x00ca
        L_0x00c2:
            java.lang.String r7 = "share_wechat"
            goto L_0x00ca
        L_0x00c5:
            java.lang.String r7 = "share_qzone"
            goto L_0x00ca
        L_0x00c8:
            java.lang.String r7 = "share_qq"
        L_0x00ca:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "snssdk1128://"
            r2.<init>(r8)
            r2.append(r5)
            java.lang.String r5 = "?&app_id="
            r2.append(r5)
            com.tt.miniapphost.entity.AppInfoEntity r5 = r0.appInfo
            java.lang.String r5 = r5.appId
            r2.append(r5)
            java.lang.String r5 = "&token="
            r2.append(r5)
            java.lang.String r5 = r0.token
            r2.append(r5)
            java.lang.String r5 = "&launch_from="
            r2.append(r5)
            r2.append(r7)
            java.lang.String r5 = "&iid="
            r2.append(r5)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            if (r3 == 0) goto L_0x0117
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "&query="
            r3.append(r2)
            java.lang.String r2 = r0.queryString
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x012d
        L_0x0117:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "&start_page="
            r3.append(r2)
            java.lang.String r2 = r0.queryString
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x012d:
            java.lang.String r3 = "UTF8"
            java.lang.String r3 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0134 }
            r2 = r3
        L_0x0134:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r0.ugUrl
            r3.append(r5)
            java.lang.String r5 = "&android_scheme="
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r4.f45945f = r2
            r2 = 12
            r4.f45940a = r2
            r4.i = r2
            java.lang.String r2 = r0.imageUrl
            r4.f45941b = r2
            java.lang.String r2 = r0.title
            r4.f45942c = r2
            com.tt.miniapphost.entity.AppInfoEntity r2 = r0.appInfo
            java.lang.String r2 = r2.appName
            r4.f45943d = r2
            java.lang.String r2 = r0.shareType
            r4.g = r2
            r2 = 7
            r4.h = r2
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = com.ss.android.ugc.aweme.feed.share.i.a((android.content.Context) r1, (com.tt.option.share.ShareInfoModel) r0)
            r4.j = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.e.a(com.tt.option.share.ShareInfoModel, android.content.Context):com.ss.android.ugc.aweme.feed.share.command.d");
    }
}
