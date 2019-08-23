package com.ali.auth.third.core.service.impl;

import android.text.TextUtils;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.cookies.CookieManagerWrapper;
import com.ali.auth.third.core.model.InternalSession;
import com.ali.auth.third.core.model.ResultCode;
import com.ali.auth.third.core.model.Session;
import com.ali.auth.third.core.model.User;
import com.ali.auth.third.core.registry.a;
import com.ali.auth.third.core.service.CredentialService;
import com.ali.auth.third.core.service.RpcService;
import com.ali.auth.third.core.service.StorageService;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.core.util.JSONUtils;
import com.ali.auth.third.core.util.ReflectionUtils;
import com.ali.auth.third.core.util.SystemUtils;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import org.json.JSONObject;

public class CredentialManager implements CredentialService {
    public static final CredentialManager INSTANCE = new CredentialManager();

    /* renamed from: a  reason: collision with root package name */
    private static final String f4949a = "CredentialManager";

    /* renamed from: b  reason: collision with root package name */
    private volatile InternalSession f4950b;
    public String internalSessionStoreKey = "internal_session";

    public CredentialManager() {
        a();
    }

    private Object a(String str, String[] strArr, Object[] objArr) {
        try {
            return ReflectionUtils.newInstance(str, strArr, objArr);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    private void a() {
        if (KernelContext.storageService == null) {
            a(KernelContext.serviceRegistry);
        }
        String value = KernelContext.storageService.getValue("loginEnvironmentIndex", true);
        String valueOf = String.valueOf(KernelContext.getEnvironment().ordinal());
        if (value == null || value.equals(valueOf)) {
            String value2 = KernelContext.storageService.getValue(this.internalSessionStoreKey, true);
            if (TextUtils.isEmpty(value2)) {
                value2 = KernelContext.storageService.getValue(this.internalSessionStoreKey, true);
            }
            if (!TextUtils.isEmpty(value2)) {
                this.f4950b = createInternalSession(value2);
                return;
            }
            this.f4950b = new InternalSession();
            this.f4950b.user = new User();
            return;
        }
        KernelContext.storageService.putValue("loginEnvironmentIndex", valueOf, true);
        KernelContext.storageService.removeValue(this.internalSessionStoreKey, true);
        this.f4950b = new InternalSession();
        this.f4950b.user = new User();
    }

    private void a(InternalSession internalSession) {
        this.f4950b = internalSession;
        KernelContext.storageService.putValue(this.internalSessionStoreKey, SystemUtils.toInternalSessionJSON(internalSession), true);
    }

    private void a(a aVar) {
        boolean z;
        try {
            Class.forName("com.ali.auth.third.securityguard.SecurityGuardWrapper");
            try {
                KernelContext.isMini = false;
                KernelContext.sdkVersion = KernelContext.SDK_VERSION_STD;
            } catch (Throwable unused) {
            }
            z = true;
        } catch (Throwable unused2) {
            z = false;
        }
        try {
            aVar.a(new Class[]{StorageService.class}, a(z ? "com.ali.auth.third.securityguard.SecurityGuardWrapper" : "com.ali.auth.third.core.storage.CommonStorageServiceImpl", null, null), null);
            KernelContext.storageService = (StorageService) aVar.a(StorageService.class, null);
        } catch (NoSuchMethodError unused3) {
        }
    }

    public long adjustSessionExpireTime(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        return currentTimeMillis > j2 ? j > 0 ? j + (currentTimeMillis - j2) : 86400 + currentTimeMillis : j;
    }

    public InternalSession createInternalSession(String str) {
        InternalSession internalSession = new InternalSession();
        try {
            JSONObject jSONObject = new JSONObject(str);
            internalSession.sid = JSONUtils.optString(jSONObject, "sid");
            internalSession.expireIn = (long) JSONUtils.optInteger(jSONObject, "expireIn").intValue();
            User user = new User();
            JSONObject optJSONObject = jSONObject.optJSONObject(AllStoryActivity.f73306b);
            if (optJSONObject != null) {
                user.avatarUrl = optJSONObject.optString("avatarUrl");
                user.userId = optJSONObject.optString("userId");
                user.nick = optJSONObject.optString("nick");
                user.openId = optJSONObject.optString("openId");
                user.openSid = optJSONObject.optString("openSid");
                user.deviceTokenKey = optJSONObject.optString("deviceTokenKey");
                user.deviceTokenSalt = optJSONObject.optString("deviceTokenSalt");
                if (!TextUtils.isEmpty(internalSession.sid) && !TextUtils.isEmpty(user.userId)) {
                    ((RpcService) KernelContext.getService(RpcService.class)).registerSessionInfo(internalSession.sid, user.userId);
                }
            }
            internalSession.user = user;
            internalSession.loginTime = JSONUtils.optLong(jSONObject, "loginTime").longValue();
            internalSession.mobile = JSONUtils.optString(jSONObject, "mobile");
            internalSession.loginId = JSONUtils.optString(jSONObject, "loginId");
            internalSession.autoLoginToken = JSONUtils.optString(jSONObject, "autoLoginToken");
            internalSession.topAccessToken = JSONUtils.optString(jSONObject, "topAccessToken");
            internalSession.topExpireTime = JSONUtils.optString(jSONObject, "topExpireTime");
            internalSession.topAuthCode = JSONUtils.optString(jSONObject, "topAuthCode");
            internalSession.otherInfo = JSONUtils.toMap(jSONObject.optJSONObject("otherInfo"));
        } catch (Exception e2) {
            SDKLogger.e(f4949a, e2.getMessage(), e2);
        }
        return internalSession;
    }

    public InternalSession getInternalSession() {
        return this.f4950b;
    }

    public Session getSession() {
        Session session = new Session();
        session.nick = (this.f4950b == null || this.f4950b.user == null) ? "" : this.f4950b.user.nick;
        session.avatarUrl = (this.f4950b == null || this.f4950b.user == null) ? "" : this.f4950b.user.avatarUrl;
        session.openId = (this.f4950b == null || this.f4950b.user == null) ? "" : this.f4950b.user.openId;
        session.openSid = (this.f4950b == null || this.f4950b.user == null) ? "" : this.f4950b.user.openSid;
        session.topAccessToken = this.f4950b == null ? "" : this.f4950b.topAccessToken;
        session.topAuthCode = this.f4950b == null ? "" : this.f4950b.topAuthCode;
        session.topExpireTime = this.f4950b == null ? "" : this.f4950b.topExpireTime;
        return session;
    }

    public boolean isSessionValid() {
        String str;
        String str2;
        SDKLogger.d(f4949a, "func isSessionValid");
        if (this.f4950b == null) {
            str = f4949a;
            str2 = "isSessionValid()  internalSession is null";
        } else if (this.f4950b.loginTime == 0 || this.f4950b.expireIn == 0) {
            str = f4949a;
            str2 = "isSessionValid()  loginTime is 0 or expireIn is 0";
        } else {
            String str3 = f4949a;
            StringBuilder sb = new StringBuilder("isSessionValid()  ");
            sb.append(System.currentTimeMillis() / 1000 < this.f4950b.expireIn);
            SDKLogger.d(str3, sb.toString());
            return System.currentTimeMillis() / 1000 < this.f4950b.expireIn;
        }
        SDKLogger.d(str, str2);
        return false;
    }

    public ResultCode logout() {
        CookieManagerWrapper.INSTANCE.clearCookies();
        InternalSession internalSession = new InternalSession();
        internalSession.user = new User();
        a(internalSession);
        return ResultCode.SUCCESS;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:4|5|(2:7|8)|12|(1:14)|15|(1:19)|20|21|22|23|(2:27|28)|29|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00e9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void refreshWhenLogin(com.ali.auth.third.core.model.LoginReturnData r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x010a
            java.lang.String r0 = r11.data
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000c
            goto L_0x010a
        L_0x000c:
            com.ali.auth.third.core.model.InternalSession r0 = new com.ali.auth.third.core.model.InternalSession
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = r11.data     // Catch:{ Exception -> 0x00f0 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00f0 }
            java.lang.Class<com.ali.auth.third.core.model.LoginDataModel> r2 = com.ali.auth.third.core.model.LoginDataModel.class
            java.lang.Object r1 = com.ali.auth.third.core.util.JSONUtils.toPOJO(r1, r2)     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.model.LoginDataModel r1 = (com.ali.auth.third.core.model.LoginDataModel) r1     // Catch:{ Exception -> 0x00f0 }
            java.lang.String[] r2 = r1.externalCookies     // Catch:{ Exception -> 0x00f0 }
            r0.externalCookies = r2     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.model.User r2 = new com.ali.auth.third.core.model.User     // Catch:{ Exception -> 0x00f0 }
            r2.<init>()     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r1.userId     // Catch:{ Exception -> 0x00f0 }
            r2.userId = r3     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r1.nick     // Catch:{ Exception -> 0x00f0 }
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r1.nick     // Catch:{ Exception -> 0x003c }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r4)     // Catch:{ Exception -> 0x003c }
            r2.nick = r3     // Catch:{ Exception -> 0x003c }
            goto L_0x0046
        L_0x003c:
            r3 = move-exception
            java.lang.String r4 = f4949a     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r3.getMessage()     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.trace.SDKLogger.e(r4, r5, r3)     // Catch:{ Exception -> 0x00f0 }
        L_0x0046:
            java.lang.String r3 = r1.openId     // Catch:{ Exception -> 0x00f0 }
            r2.openId = r3     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r1.openSid     // Catch:{ Exception -> 0x00f0 }
            r2.openSid = r3     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r1.headPicLink     // Catch:{ Exception -> 0x00f0 }
            r2.avatarUrl = r3     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.model.DeviceTokenRO r3 = r11.deviceToken     // Catch:{ Exception -> 0x00f0 }
            if (r3 == 0) goto L_0x0062
            com.ali.auth.third.core.model.DeviceTokenRO r3 = r11.deviceToken     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r3.salt     // Catch:{ Exception -> 0x00f0 }
            r2.deviceTokenSalt = r3     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.model.DeviceTokenRO r3 = r11.deviceToken     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r3.key     // Catch:{ Exception -> 0x00f0 }
            r2.deviceTokenKey = r3     // Catch:{ Exception -> 0x00f0 }
        L_0x0062:
            java.lang.String r3 = r2.deviceTokenKey     // Catch:{ Exception -> 0x00f0 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00f0 }
            if (r3 != 0) goto L_0x008f
            java.lang.String r3 = r2.deviceTokenSalt     // Catch:{ Exception -> 0x00f0 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00f0 }
            if (r3 != 0) goto L_0x008f
            com.ali.auth.third.core.model.HistoryAccount r3 = new com.ali.auth.third.core.model.HistoryAccount     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r1.userId     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r6 = r2.deviceTokenKey     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r7 = r1.nick     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r8 = r1.phone     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r9 = r1.email     // Catch:{ Exception -> 0x00f0 }
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00f0 }
            java.lang.Class<com.ali.auth.third.core.service.StorageService> r4 = com.ali.auth.third.core.service.StorageService.class
            java.lang.Object r4 = com.ali.auth.third.core.context.KernelContext.getService(r4)     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.service.StorageService r4 = (com.ali.auth.third.core.service.StorageService) r4     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r5 = r2.deviceTokenSalt     // Catch:{ Exception -> 0x00f0 }
            r4.putLoginHistory(r3, r5)     // Catch:{ Exception -> 0x00f0 }
        L_0x008f:
            r0.user = r2     // Catch:{ Exception -> 0x00f0 }
            long r2 = r1.loginTime     // Catch:{ Exception -> 0x00f0 }
            r0.loginTime = r2     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = r1.sid     // Catch:{ Exception -> 0x00f0 }
            r0.sid = r2     // Catch:{ Exception -> 0x00f0 }
            long r2 = r1.expires     // Catch:{ Exception -> 0x00f0 }
            long r4 = r1.loginTime     // Catch:{ Exception -> 0x00f0 }
            long r2 = r10.adjustSessionExpireTime(r2, r4)     // Catch:{ Exception -> 0x00f0 }
            r0.expireIn = r2     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = r1.phone     // Catch:{ Exception -> 0x00f0 }
            r0.mobile = r2     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r11 = r11.showLoginId     // Catch:{ Exception -> 0x00f0 }
            r0.loginId = r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r11 = r1.autoLoginToken     // Catch:{ Exception -> 0x00f0 }
            r0.autoLoginToken = r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r11 = r1.topAccessToken     // Catch:{ Exception -> 0x00f0 }
            r0.topAccessToken = r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r11 = r1.topAuthCode     // Catch:{ Exception -> 0x00f0 }
            r0.topAuthCode = r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r11 = r1.topExpireTime     // Catch:{ Exception -> 0x00f0 }
            r0.topExpireTime = r11     // Catch:{ Exception -> 0x00f0 }
            java.util.Map<java.lang.String, java.lang.Object> r11 = r1.extendAttribute     // Catch:{ Exception -> 0x00f0 }
            r0.otherInfo = r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.Class<com.ali.auth.third.core.service.RpcService> r11 = com.ali.auth.third.core.service.RpcService.class
            java.lang.Object r11 = com.ali.auth.third.core.context.KernelContext.getService(r11)     // Catch:{ Exception -> 0x00f0 }
            com.ali.auth.third.core.service.RpcService r11 = (com.ali.auth.third.core.service.RpcService) r11     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r2 = r1.sid     // Catch:{ Exception -> 0x00f0 }
            java.lang.String r3 = r1.userId     // Catch:{ Exception -> 0x00f0 }
            r11.registerSessionInfo(r2, r3)     // Catch:{ Exception -> 0x00f0 }
            r11 = 0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r1.extendAttribute     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r3 = "ssoDomainList"
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x00e9 }
            if (r2 == 0) goto L_0x00e9
            boolean r3 = r2 instanceof java.util.ArrayList     // Catch:{ Exception -> 0x00e9 }
            if (r3 == 0) goto L_0x00e9
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x00e9 }
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ Exception -> 0x00e9 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x00e9 }
            r11 = r2
        L_0x00e9:
            com.ali.auth.third.core.cookies.CookieManagerWrapper r2 = com.ali.auth.third.core.cookies.CookieManagerWrapper.INSTANCE     // Catch:{ Exception -> 0x00f0 }
            java.lang.String[] r1 = r1.cookies     // Catch:{ Exception -> 0x00f0 }
            r2.injectCookie(r1, r11)     // Catch:{ Exception -> 0x00f0 }
        L_0x00f0:
            java.lang.String r11 = "session"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "session = "
            r1.<init>(r2)
            java.lang.String r2 = r0.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.ali.auth.third.core.trace.SDKLogger.e(r11, r1)
            r10.a((com.ali.auth.third.core.model.InternalSession) r0)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.service.impl.CredentialManager.refreshWhenLogin(com.ali.auth.third.core.model.LoginReturnData):void");
    }
}
