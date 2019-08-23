package com.ss.android.ugc.aweme.commerce.service.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 P2\u00020\u0001:\u0001PB±\u0001\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001bJ\u0006\u0010L\u001a\u00020MJ\u0006\u0010N\u001a\u00020MJ\u0006\u0010O\u001a\u00020MR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u0017\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010@\"\u0004\bI\u0010BR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001d\"\u0004\bK\u0010\u001f¨\u0006Q"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "", "context", "Landroid/content/Context;", "author", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "awemeParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/AwemeParams;", "portParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/PortParams;", "enterFrom", "", "enterMethod", "playId", "carrierType", "logParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;", "fragment", "Landroid/support/v4/app/Fragment;", "requestCode", "", "startPreviewTime", "", "promotionSource", "originFeedAwemeId", "action", "userId", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;Lcom/ss/android/ugc/aweme/commerce/service/models/AwemeParams;Lcom/ss/android/ugc/aweme/commerce/service/models/PortParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;Landroid/support/v4/app/Fragment;Ljava/lang/Integer;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getAuthor", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "setAuthor", "(Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;)V", "getAwemeParams", "()Lcom/ss/android/ugc/aweme/commerce/service/models/AwemeParams;", "setAwemeParams", "(Lcom/ss/android/ugc/aweme/commerce/service/models/AwemeParams;)V", "getCarrierType", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getEnterFrom", "setEnterFrom", "getEnterMethod", "setEnterMethod", "getFragment", "()Landroid/support/v4/app/Fragment;", "setFragment", "(Landroid/support/v4/app/Fragment;)V", "getLogParams", "()Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;", "getOriginFeedAwemeId", "setOriginFeedAwemeId", "getPlayId", "setPlayId", "getPortParams", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PortParams;", "setPortParams", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PortParams;)V", "getPromotionSource", "()J", "setPromotionSource", "(J)V", "getRequestCode", "()Ljava/lang/Integer;", "setRequestCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStartPreviewTime", "setStartPreviewTime", "getUserId", "setUserId", "original", "", "shareFromAweme", "shareFromPort", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38219a;
    public static final a r = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Context f38220b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public CommerceUser f38221c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public b f38222d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public l f38223e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38224f;
    @Nullable
    public String g;
    @Nullable
    public String h;
    @NotNull
    public final String i;
    @Nullable
    public final k j;
    @Nullable
    public Fragment k;
    @Nullable
    public Integer l;
    public long m;
    public long n;
    @Nullable
    public String o;
    @Nullable
    public String p;
    @Nullable
    public String q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÇ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010 JÁ\u0001\u0010!\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams$Companion;", "", "()V", "ACTION_OPEN_CART", "", "buildFromAweme", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "context", "Landroid/content/Context;", "author", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "awemeId", "triggerId", "originUserId", "originMediaId", "url", "enterFrom", "enterMethod", "playId", "roomId", "carrierType", "logParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;", "startPreviewTime", "", "promotionSource", "fragment", "Landroid/support/v4/app/Fragment;", "requestCode", "", "originFeedAwemeId", "action", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;JJLandroid/support/v4/app/Fragment;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "buildFromPromotion", "promotionId", "productId", "orderType", "userId", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/support/v4/app/Fragment;Ljava/lang/Integer;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "validParam", "", "field", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38225a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final boolean a(@Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f38225a, false, 29854, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f38225a, false, 29854, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            CharSequence charSequence = str;
            if (TextUtils.isEmpty(charSequence) || TextUtils.equals(PushConstants.PUSH_TYPE_NOTIFY, charSequence)) {
                return false;
            }
            return true;
        }

        @JvmStatic
        @NotNull
        @SuppressLint({"TooManyMethodParam"})
        private n a(@NotNull Context context, @Nullable CommerceUser commerceUser, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull String str8, @Nullable Fragment fragment, @Nullable Integer num, long j, long j2, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
            Context context2 = context;
            String str13 = str;
            String str14 = str2;
            String str15 = str8;
            String str16 = str9;
            Object[] objArr = new Object[18];
            objArr[0] = context2;
            objArr[1] = commerceUser;
            objArr[2] = str13;
            objArr[3] = str14;
            objArr[4] = str3;
            objArr[5] = str4;
            objArr[6] = str5;
            objArr[7] = str6;
            objArr[8] = str7;
            objArr[9] = str15;
            objArr[10] = fragment;
            objArr[11] = num;
            objArr[12] = new Long(j);
            objArr[13] = new Long(j2);
            Object[] objArr2 = objArr;
            String str17 = str9;
            objArr2[14] = str17;
            objArr2[15] = str10;
            objArr2[16] = str11;
            objArr2[17] = str12;
            if (PatchProxy.isSupport(objArr2, this, f38225a, false, 29853, new Class[]{Context.class, CommerceUser.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Fragment.class, Integer.class, Long.TYPE, Long.TYPE, String.class, String.class, String.class, String.class}, n.class)) {
                return (n) PatchProxy.accessDispatch(new Object[]{context2, commerceUser, str13, str14, str3, str4, str5, str6, str7, str15, fragment, num, new Long(j), new Long(j2), str17, str10, str11, str12}, this, f38225a, false, 29853, new Class[]{Context.class, CommerceUser.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Fragment.class, Integer.class, Long.TYPE, Long.TYPE, String.class, String.class, String.class, String.class}, n.class);
            }
            long j3 = j;
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(str13, "promotionId");
            Intrinsics.checkParameterIsNotNull(str14, "productId");
            Intrinsics.checkParameterIsNotNull(str15, "carrierType");
            l lVar = r14;
            l lVar2 = new l(str13, str14, str17);
            n nVar = new n(context, commerceUser, null, lVar, str4, str5, str6, str8, null, fragment, num, j, j2, str10, str11, str12, 256);
            return nVar;
        }

        @JvmStatic
        @NotNull
        @SuppressLint({"TooManyMethodParam"})
        public final n a(@NotNull Context context, @NotNull CommerceUser commerceUser, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String str10, @Nullable k kVar, long j, long j2, @Nullable Fragment fragment, @Nullable Integer num, @Nullable String str11, @Nullable String str12) {
            Context context2 = context;
            CommerceUser commerceUser2 = commerceUser;
            String str13 = str;
            String str14 = str2;
            String str15 = str3;
            String str16 = str4;
            String str17 = str10;
            long j3 = j;
            Object[] objArr = new Object[19];
            objArr[0] = context2;
            objArr[1] = commerceUser2;
            objArr[2] = str13;
            objArr[3] = str14;
            objArr[4] = str15;
            objArr[5] = str16;
            objArr[6] = str5;
            objArr[7] = str6;
            objArr[8] = str7;
            objArr[9] = str8;
            objArr[10] = str9;
            objArr[11] = str17;
            objArr[12] = kVar;
            Object[] objArr2 = objArr;
            objArr2[13] = new Long(j);
            long j4 = j2;
            objArr2[14] = new Long(j4);
            objArr2[15] = fragment;
            objArr2[16] = num;
            objArr2[17] = str11;
            objArr2[18] = str12;
            if (PatchProxy.isSupport(objArr2, this, f38225a, false, 29852, new Class[]{Context.class, CommerceUser.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, k.class, Long.TYPE, Long.TYPE, Fragment.class, Integer.class, String.class, String.class}, n.class)) {
                return (n) PatchProxy.accessDispatch(new Object[]{context2, commerceUser2, str13, str14, str15, str16, str5, str6, str7, str8, str9, str17, kVar, new Long(j), new Long(j4), fragment, num, str11, str12}, this, f38225a, false, 29852, new Class[]{Context.class, CommerceUser.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, k.class, Long.TYPE, Long.TYPE, Fragment.class, Integer.class, String.class, String.class}, n.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(commerceUser2, "author");
            Intrinsics.checkParameterIsNotNull(str13, "awemeId");
            Intrinsics.checkParameterIsNotNull(str14, "triggerId");
            Intrinsics.checkParameterIsNotNull(str17, "carrierType");
            b bVar = r14;
            b bVar2 = new b(str13, str14, str15, str16);
            n nVar = new n(context, commerceUser, bVar, null, str6, str7, str8, str10, kVar, fragment, num, j, j2, str11, str12, null, 32768);
            return nVar;
        }

        public static /* synthetic */ n a(a aVar, Context context, CommerceUser commerceUser, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Fragment fragment, Integer num, long j, long j2, String str9, String str10, String str11, String str12, int i) {
            Integer num2;
            String str13;
            String str14;
            String str15;
            int i2 = i;
            if ((i2 & 2048) != 0) {
                num2 = 0;
            } else {
                num2 = num;
            }
            if ((i2 & 16384) != 0) {
                str13 = "";
            } else {
                str13 = str9;
            }
            if ((32768 & i2) != 0) {
                str14 = null;
            } else {
                str14 = str10;
            }
            if ((i2 & 131072) != 0) {
                str15 = null;
            } else {
                str15 = str12;
            }
            return aVar.a(context, commerceUser, str, str2, str3, str4, str5, str6, null, str8, null, num2, j, j2, str13, str14, null, str15);
        }

        public static /* synthetic */ n a(a aVar, Context context, CommerceUser commerceUser, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, k kVar, long j, long j2, Fragment fragment, Integer num, String str11, String str12, int i) {
            k kVar2;
            Fragment fragment2;
            Integer num2;
            String str13;
            String str14;
            int i2 = i;
            if ((i2 & 4096) != 0) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if ((32768 & i2) != 0) {
                fragment2 = null;
            } else {
                fragment2 = fragment;
            }
            if ((65536 & i2) != 0) {
                num2 = 0;
            } else {
                num2 = num;
            }
            if ((131072 & i2) != 0) {
                str13 = null;
            } else {
                str13 = str11;
            }
            if ((i2 & 262144) != 0) {
                str14 = null;
            } else {
                str14 = str12;
            }
            return aVar.a(context, commerceUser, str, str2, str3, str4, str5, str6, str7, str8, null, str10, kVar2, j, j2, fragment2, num2, str13, str14);
        }
    }

    @JvmStatic
    @NotNull
    @SuppressLint({"TooManyMethodParam"})
    public static final n a(@NotNull Context context, @NotNull CommerceUser commerceUser, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @NotNull String str10, @Nullable k kVar, long j2, long j3, @Nullable Fragment fragment, @Nullable Integer num, @Nullable String str11, @Nullable String str12) {
        Object[] objArr = {context, commerceUser, str, str2, str3, str4, str5, str6, str7, str8, null, str10, kVar, new Long(j2), new Long(j3), null, num, str11, null};
        if (PatchProxy.isSupport(objArr, null, f38219a, true, 29850, new Class[]{Context.class, CommerceUser.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, k.class, Long.TYPE, Long.TYPE, Fragment.class, Integer.class, String.class, String.class}, n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[]{context, commerceUser, str, str2, str3, str4, str5, str6, str7, str8, null, str10, kVar, new Long(j2), new Long(j3), null, num, str11, null}, null, f38219a, true, 29850, new Class[]{Context.class, CommerceUser.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, k.class, Long.TYPE, Long.TYPE, Fragment.class, Integer.class, String.class, String.class}, n.class);
        }
        return r.a(context, commerceUser, str, str2, str3, str4, str5, str6, str7, str8, null, str10, kVar, j2, j3, null, num, str11, null);
    }

    @SuppressLint({"TooManyMethodParam"})
    private n(@Nullable Context context, @Nullable CommerceUser commerceUser, @Nullable b bVar, @Nullable l lVar, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String str4, @Nullable k kVar, @Nullable Fragment fragment, @Nullable Integer num, long j2, long j3, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Intrinsics.checkParameterIsNotNull(str4, "carrierType");
        this.f38220b = context;
        this.f38221c = commerceUser;
        this.f38222d = bVar;
        this.f38223e = lVar;
        this.f38224f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = kVar;
        this.k = fragment;
        this.l = num;
        this.m = j2;
        this.n = j3;
        this.o = str5;
        this.p = str6;
        this.q = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(android.content.Context r23, com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r24, com.ss.android.ugc.aweme.commerce.service.models.b r25, com.ss.android.ugc.aweme.commerce.service.models.l r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, com.ss.android.ugc.aweme.commerce.service.models.k r31, android.support.v4.app.Fragment r32, java.lang.Integer r33, long r34, long r36, java.lang.String r38, java.lang.String r39, java.lang.String r40, int r41) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r25
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r26
        L_0x0013:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r31
        L_0x001b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0021
            r13 = r2
            goto L_0x0023
        L_0x0021:
            r13 = r32
        L_0x0023:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x002e
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14 = r1
            goto L_0x0030
        L_0x002e:
            r14 = r33
        L_0x0030:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0037
            r19 = r2
            goto L_0x0039
        L_0x0037:
            r19 = r38
        L_0x0039:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0040
            r20 = r2
            goto L_0x0042
        L_0x0040:
            r20 = r39
        L_0x0042:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004b
            r21 = r2
            goto L_0x004d
        L_0x004b:
            r21 = r40
        L_0x004d:
            r3 = r22
            r4 = r23
            r5 = r24
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r15 = r34
            r17 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.n.<init>(android.content.Context, com.ss.android.ugc.aweme.commerce.service.models.CommerceUser, com.ss.android.ugc.aweme.commerce.service.models.b, com.ss.android.ugc.aweme.commerce.service.models.l, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.k, android.support.v4.app.Fragment, java.lang.Integer, long, long, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
