package com.ss.android.ugc.aweme.commerce.service.models;

import android.annotation.SuppressLint;
import android.support.annotation.Keep;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u000b\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010@\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\tHÖ\u0001J\u0006\u0010D\u001a\u00020\u000bJ\t\u0010E\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001a\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001c\"\u0004\b2\u0010\u001e¨\u0006F"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "Ljava/io/Serializable;", "()V", "avatarMedium", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "uid", "", "nickname", "verifyStatus", "", "isHasOrders", "", "bindPhone", "withCommerceRights", "withShopEntry", "withNewGoods", "withCommerceNewbieTask", "withItemCommerceEntry", "shopMicroApp", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;ZZZZZLjava/lang/String;)V", "getAvatarMedium", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setAvatarMedium", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getBindPhone", "()Ljava/lang/String;", "setBindPhone", "(Ljava/lang/String;)V", "()Z", "setHasOrders", "(Z)V", "getNickname", "setNickname", "getShopMicroApp", "setShopMicroApp", "getUid", "setUid", "getVerifyStatus", "()I", "setVerifyStatus", "(I)V", "getWithCommerceNewbieTask", "setWithCommerceNewbieTask", "getWithCommerceRights", "setWithCommerceRights", "getWithItemCommerceEntry", "setWithItemCommerceEntry", "getWithNewGoods", "setWithNewGoods", "getWithShopEntry", "setWithShopEntry", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "isMe", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class CommerceUser implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private UrlModel avatarMedium;
    @Nullable
    private String bindPhone;
    private boolean isHasOrders;
    @Nullable
    private String nickname;
    @Nullable
    private String shopMicroApp;
    @NotNull
    private String uid;
    private int verifyStatus;
    private boolean withCommerceNewbieTask;
    private boolean withCommerceRights;
    private boolean withItemCommerceEntry;
    private boolean withNewGoods;
    private boolean withShopEntry;

    public static /* synthetic */ CommerceUser copy$default(CommerceUser commerceUser, UrlModel urlModel, String str, String str2, int i, boolean z, String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str4, int i2, Object obj) {
        CommerceUser commerceUser2 = commerceUser;
        int i3 = i2;
        return commerceUser.copy((i3 & 1) != 0 ? commerceUser2.avatarMedium : urlModel, (i3 & 2) != 0 ? commerceUser2.uid : str, (i3 & 4) != 0 ? commerceUser2.nickname : str2, (i3 & 8) != 0 ? commerceUser2.verifyStatus : i, (i3 & 16) != 0 ? commerceUser2.isHasOrders : z, (i3 & 32) != 0 ? commerceUser2.bindPhone : str3, (i3 & 64) != 0 ? commerceUser2.withCommerceRights : z2, (i3 & SearchJediMixFeedAdapter.f42517f) != 0 ? commerceUser2.withShopEntry : z3, (i3 & 256) != 0 ? commerceUser2.withNewGoods : z4, (i3 & 512) != 0 ? commerceUser2.withCommerceNewbieTask : z5, (i3 & 1024) != 0 ? commerceUser2.withItemCommerceEntry : z6, (i3 & 2048) != 0 ? commerceUser2.shopMicroApp : str4);
    }

    @Nullable
    public final UrlModel component1() {
        return this.avatarMedium;
    }

    public final boolean component10() {
        return this.withCommerceNewbieTask;
    }

    public final boolean component11() {
        return this.withItemCommerceEntry;
    }

    @Nullable
    public final String component12() {
        return this.shopMicroApp;
    }

    @NotNull
    public final String component2() {
        return this.uid;
    }

    @Nullable
    public final String component3() {
        return this.nickname;
    }

    public final int component4() {
        return this.verifyStatus;
    }

    public final boolean component5() {
        return this.isHasOrders;
    }

    @Nullable
    public final String component6() {
        return this.bindPhone;
    }

    public final boolean component7() {
        return this.withCommerceRights;
    }

    public final boolean component8() {
        return this.withShopEntry;
    }

    public final boolean component9() {
        return this.withNewGoods;
    }

    @NotNull
    public final CommerceUser copy(@Nullable UrlModel urlModel, @NotNull String str, @Nullable String str2, int i, boolean z, @Nullable String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable String str4) {
        String str5 = str;
        if (PatchProxy.isSupport(new Object[]{urlModel, str5, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str3, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), Byte.valueOf(z4 ? (byte) 1 : 0), Byte.valueOf(z5 ? (byte) 1 : 0), Byte.valueOf(z6 ? (byte) 1 : 0), str4}, this, changeQuickRedirect, false, 29827, new Class[]{UrlModel.class, String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, String.class}, CommerceUser.class)) {
            return (CommerceUser) PatchProxy.accessDispatch(new Object[]{urlModel, str5, str2, Integer.valueOf(i), Byte.valueOf(z), str3, Byte.valueOf(z2), Byte.valueOf(z3), Byte.valueOf(z4), Byte.valueOf(z5), Byte.valueOf(z6), str4}, this, changeQuickRedirect, false, 29827, new Class[]{UrlModel.class, String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, String.class}, CommerceUser.class);
        }
        Intrinsics.checkParameterIsNotNull(str5, "uid");
        CommerceUser commerceUser = new CommerceUser(urlModel, str, str2, i, z, str3, z2, z3, z4, z5, z6, str4);
        return commerceUser;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29830, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29830, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof CommerceUser) {
                CommerceUser commerceUser = (CommerceUser) obj;
                if (Intrinsics.areEqual((Object) this.avatarMedium, (Object) commerceUser.avatarMedium) && Intrinsics.areEqual((Object) this.uid, (Object) commerceUser.uid) && Intrinsics.areEqual((Object) this.nickname, (Object) commerceUser.nickname)) {
                    if (this.verifyStatus == commerceUser.verifyStatus) {
                        if ((this.isHasOrders == commerceUser.isHasOrders) && Intrinsics.areEqual((Object) this.bindPhone, (Object) commerceUser.bindPhone)) {
                            if (this.withCommerceRights == commerceUser.withCommerceRights) {
                                if (this.withShopEntry == commerceUser.withShopEntry) {
                                    if (this.withNewGoods == commerceUser.withNewGoods) {
                                        if (this.withCommerceNewbieTask == commerceUser.withCommerceNewbieTask) {
                                            if (!(this.withItemCommerceEntry == commerceUser.withItemCommerceEntry) || !Intrinsics.areEqual((Object) this.shopMicroApp, (Object) commerceUser.shopMicroApp)) {
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29829, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29829, new Class[0], Integer.TYPE)).intValue();
        }
        UrlModel urlModel = this.avatarMedium;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.uid;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.nickname;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.verifyStatus) * 31;
        boolean z = this.isHasOrders;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.bindPhone;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.withCommerceRights;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.withShopEntry;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.withNewGoods;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.withCommerceNewbieTask;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.withItemCommerceEntry;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        String str4 = this.shopMicroApp;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i7 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29828, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29828, new Class[0], String.class);
        }
        return "CommerceUser(avatarMedium=" + this.avatarMedium + ", uid=" + this.uid + ", nickname=" + this.nickname + ", verifyStatus=" + this.verifyStatus + ", isHasOrders=" + this.isHasOrders + ", bindPhone=" + this.bindPhone + ", withCommerceRights=" + this.withCommerceRights + ", withShopEntry=" + this.withShopEntry + ", withNewGoods=" + this.withNewGoods + ", withCommerceNewbieTask=" + this.withCommerceNewbieTask + ", withItemCommerceEntry=" + this.withItemCommerceEntry + ", shopMicroApp=" + this.shopMicroApp + ")";
    }

    @Nullable
    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    @Nullable
    public final String getBindPhone() {
        return this.bindPhone;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getShopMicroApp() {
        return this.shopMicroApp;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    public final int getVerifyStatus() {
        return this.verifyStatus;
    }

    public final boolean getWithCommerceNewbieTask() {
        return this.withCommerceNewbieTask;
    }

    public final boolean getWithCommerceRights() {
        return this.withCommerceRights;
    }

    public final boolean getWithItemCommerceEntry() {
        return this.withItemCommerceEntry;
    }

    public final boolean getWithNewGoods() {
        return this.withNewGoods;
    }

    public final boolean getWithShopEntry() {
        return this.withShopEntry;
    }

    public final boolean isHasOrders() {
        return this.isHasOrders;
    }

    public CommerceUser() {
        this(null, "", "", 0, false, "", false, false, false, false, false, null, 3584, null);
    }

    public final boolean isMe() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29825, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29825, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String str = this.uid;
        Intrinsics.checkExpressionValueIsNotNull(iUserService, "userService");
        return StringUtils.equal(str, iUserService.getCurrentUserID());
    }

    public final void setAvatarMedium(@Nullable UrlModel urlModel) {
        this.avatarMedium = urlModel;
    }

    public final void setBindPhone(@Nullable String str) {
        this.bindPhone = str;
    }

    public final void setHasOrders(boolean z) {
        this.isHasOrders = z;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setShopMicroApp(@Nullable String str) {
        this.shopMicroApp = str;
    }

    public final void setVerifyStatus(int i) {
        this.verifyStatus = i;
    }

    public final void setWithCommerceNewbieTask(boolean z) {
        this.withCommerceNewbieTask = z;
    }

    public final void setWithCommerceRights(boolean z) {
        this.withCommerceRights = z;
    }

    public final void setWithItemCommerceEntry(boolean z) {
        this.withItemCommerceEntry = z;
    }

    public final void setWithNewGoods(boolean z) {
        this.withNewGoods = z;
    }

    public final void setWithShopEntry(boolean z) {
        this.withShopEntry = z;
    }

    public final void setUid(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 29826, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 29826, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.uid = str2;
    }

    public CommerceUser(@Nullable UrlModel urlModel, @NotNull String str, @Nullable String str2, int i, boolean z, @Nullable String str3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable String str4) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        this.avatarMedium = urlModel;
        this.uid = str;
        this.nickname = str2;
        this.verifyStatus = i;
        this.isHasOrders = z;
        this.bindPhone = str3;
        this.withCommerceRights = z2;
        this.withShopEntry = z3;
        this.withNewGoods = z4;
        this.withCommerceNewbieTask = z5;
        this.withItemCommerceEntry = z6;
        this.shopMicroApp = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CommerceUser(com.ss.android.ugc.aweme.base.model.UrlModel r16, java.lang.String r17, java.lang.String r18, int r19, boolean r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r17
        L_0x000c:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = ""
            r5 = r1
            goto L_0x0016
        L_0x0014:
            r5 = r18
        L_0x0016:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = ""
            r8 = r1
            goto L_0x0020
        L_0x001e:
            r8 = r21
        L_0x0020:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0027
            r9 = 0
            goto L_0x0029
        L_0x0027:
            r9 = r22
        L_0x0029:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002f
            r10 = 0
            goto L_0x0031
        L_0x002f:
            r10 = r23
        L_0x0031:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0037
            r11 = 0
            goto L_0x0039
        L_0x0037:
            r11 = r24
        L_0x0039:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003f
            r12 = 0
            goto L_0x0041
        L_0x003f:
            r12 = r25
        L_0x0041:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0047
            r13 = 0
            goto L_0x0049
        L_0x0047:
            r13 = r26
        L_0x0049:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = ""
            r14 = r0
            goto L_0x0053
        L_0x0051:
            r14 = r27
        L_0x0053:
            r2 = r15
            r3 = r16
            r6 = r19
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.CommerceUser.<init>(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, int, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
