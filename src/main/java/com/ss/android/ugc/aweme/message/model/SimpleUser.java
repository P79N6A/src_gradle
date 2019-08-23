package com.ss.android.ugc.aweme.message.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.hitrank.b;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

@Keep
public class SimpleUser implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    static final long serialVersionUID = 42;
    @SerializedName("avatar_thumb")
    UrlModel avatarThumb;
    @SerializedName("follow_status")
    int followStatus;
    @SerializedName("nickname")
    String nickName;
    @SerializedName("signature")
    String signature;
    @SerializedName("hit_task_info")
    b taskInfo;
    private int type;
    @SerializedName("uid")
    String uid;

    public SimpleUser() {
    }

    public UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public int getFollowStatus() {
        return this.followStatus;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getSignature() {
        return this.signature;
    }

    public b getTaskInfo() {
        return this.taskInfo;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58737, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58737, new Class[0], Integer.TYPE)).intValue();
        }
        if (getUid() != null) {
            i = getUid().hashCode();
        }
        return i;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58735, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58735, new Class[0], String.class);
        }
        return "SimpleUser{uid='" + this.uid + '\'' + ", nickName='" + this.nickName + '\'' + ", signature='" + this.signature + '\'' + ", avatarThumb=" + this.avatarThumb + '}';
    }

    public void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public SimpleUser setTaskInfo(b bVar) {
        this.taskInfo = bVar;
        return this;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setFollowStatus(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, changeQuickRedirect, false, 58739, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, changeQuickRedirect, false, 58739, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        this.followStatus = num.intValue();
    }

    public static SimpleUser fromUser(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, changeQuickRedirect, true, 58738, new Class[]{User.class}, SimpleUser.class)) {
            return (SimpleUser) PatchProxy.accessDispatch(new Object[]{user}, null, changeQuickRedirect, true, 58738, new Class[]{User.class}, SimpleUser.class);
        }
        SimpleUser simpleUser = new SimpleUser();
        simpleUser.setNickName(user.getNickname());
        simpleUser.setAvatarThumb(user.getAvatarThumb());
        simpleUser.setSignature(user.getSignature());
        simpleUser.setUid(user.getUid());
        simpleUser.setFollowStatus(user.getFollowStatus());
        return simpleUser;
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
            r6 = 58736(0xe570, float:8.2307E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 58736(0xe570, float:8.2307E-41)
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
            boolean r3 = r0 instanceof com.ss.android.ugc.aweme.message.model.SimpleUser
            if (r3 != 0) goto L_0x0047
            return r9
        L_0x0047:
            com.ss.android.ugc.aweme.message.model.SimpleUser r0 = (com.ss.android.ugc.aweme.message.model.SimpleUser) r0
            java.lang.String r3 = r17.getUid()
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = r17.getUid()
            java.lang.String r0 = r0.getUid()
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L_0x0063
            return r1
        L_0x0063:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.message.model.SimpleUser.equals(java.lang.Object):boolean");
    }

    public SimpleUser(String str, String str2, String str3, UrlModel urlModel, int i) {
        this.uid = str;
        this.nickName = str2;
        this.signature = str3;
        this.avatarThumb = urlModel;
        this.followStatus = i;
    }
}
