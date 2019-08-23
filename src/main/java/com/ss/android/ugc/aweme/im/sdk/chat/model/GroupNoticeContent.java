package com.ss.android.ugc.aweme.im.sdk.chat.model;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.y;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000bJ\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0006\u0010\u001b\u001a\u00020\u0018J\u0010\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000bJ\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u000bJ\u0006\u0010 \u001a\u00020\u000bJ\u0006\u0010!\u001a\u00020\u000bR&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR&\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/GroupNoticeContent;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/BaseContent;", "()V", "activeUsers", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getActiveUsers", "()Ljava/util/List;", "setActiveUsers", "(Ljava/util/List;)V", "hasShow", "", "getHasShow", "()Z", "setHasShow", "(Z)V", "noticeTemplates", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/NoticeTemplate;", "getNoticeTemplates", "setNoticeTemplates", "passiveUsers", "getPassiveUsers", "setPassiveUsers", "getActiveText", "", "filterSelf", "getMsgHint", "getNoticeText", "getPassiveText", "getTemplateText", "isActive", "isDefinedType", "isNormalOrder", "isPassive", "Companion", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupNoticeContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("active_users")
    @Nullable
    private List<? extends IMUser> activeUsers;
    private boolean hasShow;
    @SerializedName("locale_resources")
    @Nullable
    private List<NoticeTemplate> noticeTemplates;
    @SerializedName("passive_users")
    @Nullable
    private List<? extends IMUser> passiveUsers;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/model/GroupNoticeContent$Companion;", "", "()V", "ACTIVE_PLACEHOLDER", "", "KEY_GROUP_NOTICE_SHOW", "LANG_CH", "LANG_EN", "PASSIVE_PLACEHOLDER", "SHOW", "SPACE_COUNT", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final List<IMUser> getActiveUsers() {
        return this.activeUsers;
    }

    public final boolean getHasShow() {
        return this.hasShow;
    }

    @Nullable
    public final List<NoticeTemplate> getNoticeTemplates() {
        return this.noticeTemplates;
    }

    @Nullable
    public final List<IMUser> getPassiveUsers() {
        return this.passiveUsers;
    }

    public final boolean isDefinedType() {
        if (this.type <= 100106) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getMsgHint() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51120, new Class[0], String.class)) {
            return getNoticeText();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51120, new Class[0], String.class);
    }

    public final boolean isActive() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51121, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51121, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User c2 = d.c();
        if (c2 == null) {
            return false;
        }
        List<? extends IMUser> list = this.activeUsers;
        if (list != null) {
            z = list.contains(IMUser.fromUser(c2));
        }
        return z;
    }

    public final boolean isPassive() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51122, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51122, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User c2 = d.c();
        if (c2 == null) {
            return false;
        }
        List<? extends IMUser> list = this.passiveUsers;
        if (list != null) {
            z = list.contains(IMUser.fromUser(c2));
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTemplateText() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 51126(0xc7b6, float:7.1643E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 51126(0xc7b6, float:7.1643E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            boolean r1 = com.ss.android.ugc.aweme.im.sdk.utils.y.c()
            boolean r2 = com.ss.android.ugc.aweme.im.sdk.utils.y.c()
            r3 = 0
            if (r2 == 0) goto L_0x00c5
            java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate> r2 = r11.noticeTemplates
            if (r2 == 0) goto L_0x00c5
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0064
            java.lang.Object r4 = r2.next()
            r5 = r4
            com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate r5 = (com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate) r5
            if (r1 == 0) goto L_0x0057
            java.lang.String r5 = r5.getLanguage()
            java.lang.String r6 = "zh-Hans"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
            goto L_0x0061
        L_0x0057:
            java.lang.String r5 = r5.getLanguage()
            java.lang.String r6 = "en"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
        L_0x0061:
            if (r5 == 0) goto L_0x003d
            goto L_0x0065
        L_0x0064:
            r4 = r3
        L_0x0065:
            com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate r4 = (com.ss.android.ugc.aweme.im.sdk.chat.model.NoticeTemplate) r4
            if (r4 == 0) goto L_0x00c5
            int r1 = r11.type
            r2 = 100106(0x1870a, float:1.40278E-40)
            if (r1 != r2) goto L_0x009f
            boolean r1 = r11.isActive()
            if (r1 == 0) goto L_0x009f
            java.lang.String r5 = r4.getText()
            if (r5 == 0) goto L_0x00b3
            java.lang.String r6 = "{0}"
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            java.lang.String r2 = "GlobalContext.getContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131560537(0x7f0d0859, float:1.874645E38)
            java.lang.String r7 = r1.getString(r2)
            java.lang.String r1 = "GlobalContext.getContext…up_notice_edit_name_host)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r1)
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (boolean) r8, (int) r9, (java.lang.Object) r10)
            goto L_0x00b4
        L_0x009f:
            java.lang.String r4 = r4.getText()
            if (r4 == 0) goto L_0x00b3
            java.lang.String r5 = "{0}"
            java.lang.String r6 = r11.getActiveText(r0)
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r1 = kotlin.text.StringsKt.replace$default((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (int) r8, (java.lang.Object) r9)
            goto L_0x00b4
        L_0x00b3:
            r1 = r3
        L_0x00b4:
            r4 = r1
            if (r4 == 0) goto L_0x00c5
            java.lang.String r5 = "{1}"
            java.lang.String r6 = r11.getPassiveText(r0)
            r7 = 0
            r8 = 4
            r9 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (boolean) r7, (int) r8, (java.lang.Object) r9)
            r3 = r0
        L_0x00c5:
            if (r3 != 0) goto L_0x00c9
            java.lang.String r3 = ""
        L_0x00c9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent.getTemplateText():java.lang.String");
    }

    public final boolean isNormalOrder() {
        Object obj;
        int i;
        int i2;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51123, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51123, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isDefinedType()) {
            boolean c2 = y.c();
            List<NoticeTemplate> list = this.noticeTemplates;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    NoticeTemplate noticeTemplate = (NoticeTemplate) obj;
                    if (c2) {
                        z = Intrinsics.areEqual((Object) noticeTemplate.getLanguage(), (Object) "zh-Hans");
                        continue;
                    } else {
                        z = Intrinsics.areEqual((Object) noticeTemplate.getLanguage(), (Object) "en");
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                NoticeTemplate noticeTemplate2 = (NoticeTemplate) obj;
                if (noticeTemplate2 != null) {
                    String text = noticeTemplate2.getText();
                    if (text != null) {
                        i = StringsKt.indexOf$default((CharSequence) text, "{0}", 0, false, 6, (Object) null);
                    } else {
                        i = 0;
                    }
                    String text2 = noticeTemplate2.getText();
                    if (text2 != null) {
                        i2 = StringsKt.indexOf$default((CharSequence) text2, "{1}", 0, false, 6, (Object) null);
                    } else {
                        i2 = 0;
                    }
                    if (i <= i2) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        } else if (this.type == 100101 || this.type == 100102) {
            return false;
        } else {
            return true;
        }
    }

    @NotNull
    public final String getNoticeText() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51127, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51127, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        int i = this.type;
        switch (i) {
            case 100100:
                if (!isActive()) {
                    if (isPassive()) {
                        if (!TextUtils.isEmpty(getPassiveText$default(this, false, 1, null))) {
                            Context context = GlobalContext.getContext();
                            sb.append(context.getString(C0906R.string.at2, new Object[]{getActiveText$default(this, false, 1, null), ", " + getPassiveText$default(this, false, 1, null)}));
                            break;
                        } else {
                            sb.append(GlobalContext.getContext().getString(C0906R.string.at2, new Object[]{getActiveText$default(this, false, 1, null), getPassiveText$default(this, false, 1, null)}));
                            break;
                        }
                    } else {
                        sb.append(GlobalContext.getContext().getString(C0906R.string.at4, new Object[]{getActiveText$default(this, false, 1, null), getPassiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(GlobalContext.getContext().getString(C0906R.string.at3, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100101:
                if (!isActive()) {
                    if (!isPassive()) {
                        sb.append(GlobalContext.getContext().getString(C0906R.string.at7, new Object[]{getPassiveText$default(this, false, 1, null), getActiveText$default(this, false, 1, null)}));
                        break;
                    } else {
                        sb.append(GlobalContext.getContext().getString(C0906R.string.at5, new Object[]{getActiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(GlobalContext.getContext().getString(C0906R.string.at6, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100102:
                if (!isActive()) {
                    if (!isPassive()) {
                        sb.append(GlobalContext.getContext().getString(C0906R.string.ate, new Object[]{getPassiveText$default(this, false, 1, null), getActiveText$default(this, false, 1, null)}));
                        break;
                    } else {
                        sb.append(GlobalContext.getContext().getString(C0906R.string.atc, new Object[]{getActiveText$default(this, false, 1, null)}));
                        break;
                    }
                } else {
                    sb.append(GlobalContext.getContext().getString(C0906R.string.atd, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
            case 100103:
                sb.append(GlobalContext.getContext().getString(C0906R.string.atg));
                break;
            case 100104:
                if (!isActive()) {
                    if (isPassive()) {
                        sb.append(GlobalContext.getContext().getString(C0906R.string.awr));
                        break;
                    }
                } else {
                    sb.append(GlobalContext.getContext().getString(C0906R.string.atf, new Object[]{getPassiveText$default(this, false, 1, null)}));
                    break;
                }
                break;
            case 100105:
                sb.append(GlobalContext.getContext().getString(C0906R.string.atb, new Object[]{getActiveText$default(this, false, 1, null)}));
                break;
            case 100106:
                sb.append(getTemplateText());
                break;
            default:
                switch (i) {
                    case 100120:
                        sb.append(GlobalContext.getContext().getString(C0906R.string.ath));
                        break;
                    case 100121:
                        sb.append(GlobalContext.getContext().getString(C0906R.string.ata));
                        break;
                    default:
                        sb.append(getTemplateText());
                        break;
                }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    public final void setActiveUsers(@Nullable List<? extends IMUser> list) {
        this.activeUsers = list;
    }

    public final void setHasShow(boolean z) {
        this.hasShow = z;
    }

    public final void setNoticeTemplates(@Nullable List<NoticeTemplate> list) {
        this.noticeTemplates = list;
    }

    public final void setPassiveUsers(@Nullable List<? extends IMUser> list) {
        this.passiveUsers = list;
    }

    @NotNull
    public final String getActiveText(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 51124, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 51124, new Class[]{Boolean.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        User c2 = d.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "AppUtil.getCurrentUser()");
        List<? extends IMUser> list = this.activeUsers;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                IMUser iMUser = (IMUser) next;
                if (!z || (!Intrinsics.areEqual((Object) iMUser.getUid(), (Object) c2.getUid()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            for (IMUser iMUser2 : (List) arrayList) {
                if (!this.hasShow) {
                    IMUser a2 = e.a().a(iMUser2.getUid());
                    if (a2 != null) {
                        iMUser2.setNickName(a2.getNickName());
                        iMUser2.setRemarkName(a2.getRemarkName());
                    }
                }
                String displayName = iMUser2.getDisplayName();
                if (displayName != null) {
                    sb.append(displayName);
                    sb.append("、");
                }
            }
        }
        if (sb.length() > 0) {
            z3 = true;
        }
        if (z3) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "activeText.also {\n      …UNT)\n        }.toString()");
        return sb2;
    }

    @NotNull
    public final String getPassiveText(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 51125, new Class[]{Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 51125, new Class[]{Boolean.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        User c2 = d.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "AppUtil.getCurrentUser()");
        List<? extends IMUser> list = this.passiveUsers;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                IMUser iMUser = (IMUser) next;
                if (!z || (!Intrinsics.areEqual((Object) iMUser.getUid(), (Object) c2.getUid()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            for (IMUser iMUser2 : (List) arrayList) {
                if (!this.hasShow) {
                    IMUser a2 = e.a().a(iMUser2.getUid());
                    if (a2 != null) {
                        iMUser2.setNickName(a2.getNickName());
                        iMUser2.setRemarkName(a2.getRemarkName());
                    }
                }
                String displayName = iMUser2.getDisplayName();
                if (displayName != null) {
                    sb.append(displayName);
                    sb.append("、");
                }
            }
        }
        if (sb.length() > 0) {
            z3 = true;
        }
        if (z3) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "passiveText.also {\n     …UNT)\n        }.toString()");
        return sb2;
    }

    public static /* synthetic */ String getActiveText$default(GroupNoticeContent groupNoticeContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return groupNoticeContent.getActiveText(z);
    }

    public static /* synthetic */ String getPassiveText$default(GroupNoticeContent groupNoticeContent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return groupNoticeContent.getPassiveText(z);
    }
}
