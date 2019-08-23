package com.ss.android.ugc.aweme.im.service.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@Keep
public class IMConversation extends IMContact {
    public static ChangeQuickRedirect changeQuickRedirect;
    private UrlModel mConversationAvatar;
    private String mConversationId;
    private int mConversationMemberCount;
    private String mConversationName;
    private int mConversationType;

    public UrlModel getConversationAvatar() {
        return this.mConversationAvatar;
    }

    public String getConversationId() {
        return this.mConversationId;
    }

    public int getConversationMemberCount() {
        return this.mConversationMemberCount;
    }

    public String getConversationName() {
        return this.mConversationName;
    }

    public int getConversationType() {
        return this.mConversationType;
    }

    public UrlModel getDisplayAvatar() {
        return this.mConversationAvatar;
    }

    public String getDisplayName() {
        return this.mConversationName;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54418, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54418, new Class[0], Integer.TYPE)).intValue();
        }
        if (getConversationId() != null) {
            i = getConversationId().hashCode();
        }
        return i;
    }

    public void setConversationAvatar(UrlModel urlModel) {
        this.mConversationAvatar = urlModel;
    }

    public void setConversationId(String str) {
        this.mConversationId = str;
    }

    public void setConversationMemberCount(int i) {
        this.mConversationMemberCount = i;
    }

    public void setConversationName(String str) {
        this.mConversationName = str;
    }

    public void setConversationType(int i) {
        this.mConversationType = i;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 54417(0xd491, float:7.6254E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 54417(0xd491, float:7.6254E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            r2 = r17
            if (r2 != r0) goto L_0x0042
            return r1
        L_0x0042:
            boolean r3 = r0 instanceof com.ss.android.ugc.aweme.im.service.model.IMConversation
            if (r3 != 0) goto L_0x0047
            return r9
        L_0x0047:
            com.ss.android.ugc.aweme.im.service.model.IMConversation r0 = (com.ss.android.ugc.aweme.im.service.model.IMConversation) r0
            java.lang.String r3 = r17.getConversationId()
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = r17.getConversationId()
            java.lang.String r0 = r0.getConversationId()
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            java.lang.String r0 = r0.getConversationId()
            if (r0 != 0) goto L_0x0063
            return r1
        L_0x0063:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.model.IMConversation.equals(java.lang.Object):boolean");
    }
}
