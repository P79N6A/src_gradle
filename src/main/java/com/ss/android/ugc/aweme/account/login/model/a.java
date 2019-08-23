package com.ss.android.ugc.aweme.account.login.model;

import android.support.annotation.StringRes;
import com.google.common.collect.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/CountryCode;", "", "nameRes", "", "nameIndex", "", "alpha2", "code", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlpha2", "()Ljava/lang/String;", "getCode", "getNameIndex", "setNameIndex", "(Ljava/lang/String;)V", "getNameRes", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getIntCode", "hashCode", "toString", "Companion", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32258a;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final Lazy f32259f = LazyKt.lazy(b.INSTANCE);
    public static final C0408a g = new C0408a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final int f32260b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f32261c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f32262d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f32263e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/model/CountryCode$Companion;", "", "()V", "countries", "Lcom/google/common/collect/ImmutableList;", "Lcom/ss/android/ugc/aweme/account/login/model/CountryCode;", "countries$annotations", "getCountries", "()Lcom/google/common/collect/ImmutableList;", "countries$delegate", "Lkotlin/Lazy;", "countryCode", "phoneNumber", "Lcom/ss/android/ugc/aweme/account/login/utils/PhoneNumberUtil$PhoneNumber;", "code", "", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.login.model.a$a  reason: collision with other inner class name */
    public static final class C0408a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32264a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f32265b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(C0408a.class), "countries", "getCountries()Lcom/google/common/collect/ImmutableList;"))};

        @NotNull
        public final ai<a> a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f32264a, false, 20283, new Class[0], ai.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f32264a, false, 20283, new Class[0], ai.class);
            } else {
                value = a.f32259f.getValue();
            }
            return (ai) value;
        }

        private C0408a() {
        }

        public /* synthetic */ C0408a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/google/common/collect/ImmutableList;", "Lcom/ss/android/ugc/aweme/account/login/model/CountryCode;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function0<ai<a>> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final ai<a> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 20286, new Class[0], ai.class)) {
                return (ai) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 20286, new Class[0], ai.class);
            }
            a aVar = new a(C0906R.string.b8, "A", "AB", "+7 840");
            a aVar2 = new a(C0906R.string.b8, "A", "AB", "+7 940");
            a aVar3 = new a(C0906R.string.b8, "A", "AB", "+995 44");
            a aVar4 = new a(C0906R.string.ds, "A", "AF", "+93");
            a aVar5 = new a(C0906R.string.dum, "A", "AX", "+358 18");
            a aVar6 = new a(C0906R.string.dy, "A", "AL", "+355");
            a aVar7 = new a(C0906R.string.e0, "A", "DZ", "+213");
            a aVar8 = new a(C0906R.string.f6, "A", "AS", "+1 684");
            a aVar9 = new a(C0906R.string.f7, "A", "AD", "+376");
            a aVar10 = new a(C0906R.string.f8, "A", "AO", "+244");
            return ai.of(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, new a(C0906R.string.f9, "A", "AI", "+1 264"), new a(C0906R.string.fd, "A", "AG", "+1 268"), new a(C0906R.string.fy, "A", "AR", "+54"), new a(C0906R.string.fz, "A", "AM", "+374"), new a(C0906R.string.g2, "A", "AW", "+297"), new a(C0906R.string.g3, "A", "SH", "+247"), new a(C0906R.string.gd, "A", "AU", "+61"), new a(C0906R.string.ge, "A", "AU", "+672"), new a(C0906R.string.gf, "A", "AT", "+43"), new a(C0906R.string.kh, "A", "AZ", "+994"), new a(C0906R.string.kw, "B", "BS", "+1 242"), new a(C0906R.string.kx, "B", "BH", "+973"), new a(C0906R.string.kz, "B", "BD", "+880"), new a(C0906R.string.l2, "B", "BB", "+1 246"), new a(C0906R.string.l3, "B", "AG", "+1 268"), new a(C0906R.string.lr, "B", "BY", "+375"), new a(C0906R.string.ls, "B", "BE", "+32"), new a(C0906R.string.lt, "B", "BZ", "+501"), new a(C0906R.string.lu, "B", "BJ", "+229"), new a(C0906R.string.lv, "B", "BM", "+1 441"), new a(C0906R.string.lx, "B", "BT", "+975"), new a(C0906R.string.o6, "B", "BO", "+591"), new a(C0906R.string.o8, "B", "BA", "+387"), new a(C0906R.string.o9, "B", "BW", "+267"), new a(C0906R.string.oc, "B", "BR", "+55"), new a(C0906R.string.of, "B", "IO", "+246"), new a(C0906R.string.og, "B", "VG", "+1 284"), new a(C0906R.string.ol, "B", "BN", "+673"), new a(C0906R.string.ou, "B", "BG", "+359"), new a(C0906R.string.ov, "B", "BF", "+226"), new a(C0906R.string.ow, "B", "BI", "+257"), new a(C0906R.string.pa, "C", "KH", "+855"), new a(C0906R.string.pf, "C", "CM", "+237"), new a(C0906R.string.f4482pl, "C", "CA", "+1"), new a(C0906R.string.q8, "C", "CV", "+238"), new a(C0906R.string.qe, "C", "BQ", "+599 7"), new a(C0906R.string.r5, "C", "KY", "+1 345"), new a(C0906R.string.r6, "C", "CF", "+236"), new a(C0906R.string.r7, "C", "TD", "+235"), new a(C0906R.string.sm, "C", "CL", "+56"), new a(C0906R.string.sn, "C", "CN", "+86"), new a(C0906R.string.t7, "C", "CX", "+61"), new a(C0906R.string.u1, "C", "CC", "+61"), new a(C0906R.string.ug, "C", "CO", "+57"), new a(C0906R.string.a0p, "C", "KM", "+269"), new a(C0906R.string.a1_, "C", "CG", "+242"), new a(C0906R.string.a1a, "C", "CD", "+243"), new a(C0906R.string.a23, "C", "CK", "+682"), new a(C0906R.string.a2c, "C", "CR", "+506"), new a(C0906R.string.a3d, "C", "HR", "+385"), new a(C0906R.string.a3e, "C", "CU", "+53"), new a(C0906R.string.a3i, "C", "CW", "+599 9"), new a(C0906R.string.a45, "C", "CY", "+357"), new a(C0906R.string.a46, "C", "CZ", "+420"), new a(C0906R.string.a47, "C", "CI", "+225"), new a(C0906R.string.a4w, "D", "DK", "+45"), new a(C0906R.string.a5g, "D", "DG", "+246"), new a(C0906R.string.a66, "D", "DJ", "+253"), new a(C0906R.string.a6a, "D", "DM", "+1 767"), new a(C0906R.string.a6c, "D", "DO", "+1 809"), new a(C0906R.string.a6c, "D", "DO", "+1 829"), new a(C0906R.string.a6c, "D", "DO", "+1 849"), new a(C0906R.string.a_7, "E", "EC", "+593"), new a(C0906R.string.aaa, "E", "EG", "+20"), new a(C0906R.string.aab, "E", "SV", "+503"), new a(C0906R.string.ab9, "E", "GQ", "+240"), new a(C0906R.string.ab_, "E", "ER", "+291"), new a(C0906R.string.abm, "E", "EE", "+372"), new a(C0906R.string.abn, "E", "ET", "+251"), new a(C0906R.string.ad9, "F", "FK", "+500"), new a(C0906R.string.adj, "F", "FO", "+298"), new a(C0906R.string.aen, "F", "FJ", "+679"), new a(C0906R.string.afa, "F", "FI", "+358"), new a(C0906R.string.ahr, "F", "FR", "+33"), new a(C0906R.string.ahw, "F", "GF", "+594"), new a(C0906R.string.ahx, "F", "PF", "+689"), new a(C0906R.string.ail, "G", "GA", "+241"), new a(C0906R.string.aim, "G", "GM", "+220"), new a(C0906R.string.aiy, "G", "GE", "+995"), new a(C0906R.string.aiz, "G", "DE", "+49"), new a(C0906R.string.aj6, "G", "GH", "+233"), new a(C0906R.string.aj7, "G", "GI", "+350"), new a(C0906R.string.aky, "G", "GR", "+30"), new a(C0906R.string.akz, "G", "GL", "+299"), new a(C0906R.string.al0, "G", "GD", "+1 473"), new a(C0906R.string.al1, "G", "GP", "+590"), new a(C0906R.string.al2, "G", "GU", "+1 671"), new a(C0906R.string.al3, "G", "GT", "+502"), new a(C0906R.string.al4, "G", "GG", "+44"), new a(C0906R.string.ala, "G", "GN", "+224"), new a(C0906R.string.alb, "G", "GW", "+245"), new a(C0906R.string.alc, "G", "GY", "+592"), new a(C0906R.string.ald, "H", "HT", "+509"), new a(C0906R.string.amf, "H", "HN", "+504"), new a(C0906R.string.amg, "H", "HK", "+852"), new a(C0906R.string.an3, "H", "HU", "+36"), new a(C0906R.string.anw, "I", "IS", "+354"), new a(C0906R.string.b17, "I", "IN", "+91"), new a(C0906R.string.b18, "I", "ID", "+62"), new a(C0906R.string.b3g, "I", "IR", "+98"), new a(C0906R.string.b3h, "I", "IQ", "+964"), new a(C0906R.string.b3i, "I", "IE", "+353"), new a(C0906R.string.b3o, "I", "IL", "+972"), new a(C0906R.string.b3p, "I", "IT", "+39"), new a(C0906R.string.b3s, "J", "JM", "+1 876"), new a(C0906R.string.b3t, "J", "JP", "+81"), new a(C0906R.string.b3u, "J", "JE", "+44"), new a(C0906R.string.b3z, "J", "JO", "+962"), new a(C0906R.string.b42, "K", "KZ", "+7 6"), new a(C0906R.string.b42, "K", "KZ", "+7 7"), new a(C0906R.string.b43, "K", "KE", "+254"), new a(C0906R.string.b45, "K", "KI", "+686"), new a(C0906R.string.b46, "K", "KW", "+965"), new a(C0906R.string.b47, "K", "KG", "+996"), new a(C0906R.string.b4s, "L", "LA", "+856"), new a(C0906R.string.b52, "L", "LV", "+371"), new a(C0906R.string.b55, "L", "LB", "+961"), new a(C0906R.string.b57, "L", "LS", "+266"), new a(C0906R.string.b5a, "L", "LR", "+231"), new a(C0906R.string.b5b, "L", "LY", "+218"), new a(C0906R.string.b5c, "L", "LI", "+423"), new a(C0906R.string.b5t, "L", "LT", "+370"), new a(C0906R.string.b9g, "L", "LU", "+352"), new a(C0906R.string.b9h, "M", "MO", "+853"), new a(C0906R.string.b9i, "M", "MK", "+389"), new a(C0906R.string.b9j, "M", "MG", "+261"), new a(C0906R.string.b9r, "M", "MW", "+265"), new a(C0906R.string.b9s, "M", "MY", "+60"), new a(C0906R.string.b9t, "M", "MV", "+960"), new a(C0906R.string.b9v, "M", "ML", "+223"), new a(C0906R.string.b9w, "M", "MT", "+356"), new a(C0906R.string.ba0, "M", "MH", "+692"), new a(C0906R.string.ba1, "M", "MQ", "+596"), new a(C0906R.string.bap, "M", "MR", "+222"), new a(C0906R.string.baq, "M", "MU", "+230"), new a(C0906R.string.baw, "M", "YT", "+262"), new a(C0906R.string.bba, "M", "MX", "+52"), new a(C0906R.string.bbh, "M", "FM", "+691"), new a(C0906R.string.bc4, "M", "MD", "+373"), new a(C0906R.string.bc5, "M", "MC", "+377"), new a(C0906R.string.bc7, "M", "MN", "+976"), new a(C0906R.string.bc8, "M", "ME", "+382"), new a(C0906R.string.bc9, "M", "MS", "+1 664"), new a(C0906R.string.bch, "M", "MA", "+212"), new a(C0906R.string.bco, "M", "MZ", "+258"), new a(C0906R.string.bfw, "M", "MM", "+95"), new a(C0906R.string.bfy, "N", "NA", "+264"), new a(C0906R.string.bg0, "N", "NR", "+674"), new a(C0906R.string.bg4, "N", "NP", "+977"), new a(C0906R.string.bg5, "N", "NL", "+31"), new a(C0906R.string.bgn, "N", "NC", "+687"), new a(C0906R.string.bgu, "N", "NZ", "+64"), new a(C0906R.string.bgy, "N", "NI", "+505"), new a(C0906R.string.bh2, "N", "NE", "+227"), new a(C0906R.string.bh3, "N", "NG", "+234"), new a(C0906R.string.bh4, "N", "NU", "+683"), new a(C0906R.string.bia, "N", "NF", "+672"), new a(C0906R.string.bib, "N", "KP", "+850"), new a(C0906R.string.bic, "N", "MP", "+1 670"), new a(C0906R.string.bid, "N", "NO", "+47"), new a(C0906R.string.bji, "O", "OM", "+968"), new a(C0906R.string.bkx, "P", "PK", "+92"), new a(C0906R.string.bky, "P", "PW", "+680"), new a(C0906R.string.bkz, "P", "PS", "+970"), new a(C0906R.string.bl0, "P", "PA", "+507"), new a(C0906R.string.bl1, "P", "PG", "+675"), new a(C0906R.string.bl2, "P", "PY", "+595"), new a(C0906R.string.bma, "P", "PE", "+51"), new a(C0906R.string.bmc, "P", "PH", "+63"), new a(C0906R.string.bms, "P", "PN", "+64"), new a(C0906R.string.bq3, "P", "PL", "+48"), new a(C0906R.string.bq8, "P", "PT", "+351"), new a(C0906R.string.btf, "P", "PR", "+1 787"), new a(C0906R.string.btf, "P", "PR", "+1 939"), new a(C0906R.string.bu6, "Q", "QA", "+974"), new a(C0906R.string.c0q, "R", "RO", "+40"), new a(C0906R.string.c0r, "R", "RU", "+7"), new a(C0906R.string.c0s, "R", "RW", "+250"), new a(C0906R.string.c0t, "R", "SURVEY", "+262"), new a(C0906R.string.c0z, "S", "WS", "+685"), new a(C0906R.string.c10, "S", "SM", "+378"), new a(C0906R.string.c11, "S", "SA", "+966"), new a(C0906R.string.c48, "S", "SN", "+221"), new a(C0906R.string.c49, "S", "RS", "+381"), new a(C0906R.string.c5z, "S", "SC", "+248"), new a(C0906R.string.c8c, "S", "SL", "+232"), new a(C0906R.string.c8m, "S", "SG", "+65"), new a(C0906R.string.c8n, "S", "BQ", "+599 3"), new a(C0906R.string.c8o, "S", "SX", "+1 721"), new a(C0906R.string.c8u, "S", "SK", "+421"), new a(C0906R.string.c8v, "S", "SI", "+386"), new a(C0906R.string.c93, "S", "SB", "+677"), new a(C0906R.string.c94, "S", "SO", "+252"), new a(C0906R.string.c9e, "S", "ZA", "+27"), new a(C0906R.string.c9f, "S", "GS", "+500"), new a(C0906R.string.c9g, "S", "KR", "+82"), new a(C0906R.string.c9h, "S", "!1", "+995 34"), new a(C0906R.string.c9i, "S", "SS", "+211"), new a(C0906R.string.c9k, "S", "ES", "+34"), new a(C0906R.string.c_h, "S", "LK", "+94"), new a(C0906R.string.cc9, "S", "BL", "+590"), new a(C0906R.string.cc_, "S", "SH", "+290"), new a(C0906R.string.cca, "S", "KN", "+1 869"), new a(C0906R.string.ccb, "S", "LC", "+1 758"), new a(C0906R.string.ccc, "S", "MF", "+590"), new a(C0906R.string.ccd, "S", "PM", "+508"), new a(C0906R.string.cce, "S", "VC", "+1 784"), new a(C0906R.string.cgd, "S", "SD", "+249"), new a(C0906R.string.cgp, "S", "SR", "+597"), new a(C0906R.string.cgq, "S", "SJ", "+47 79"), new a(C0906R.string.cgr, "S", "SJ", "+47 79"), new a(C0906R.string.cgs, "S", "SZ", "+268"), new a(C0906R.string.cgt, "S", "SE", "+46"), new a(C0906R.string.ch3, "S", "CH", "+41"), new a(C0906R.string.chg, "S", "SY", "+963"), new a(C0906R.string.chj, "S", "ST", "+239"), new a(C0906R.string.cho, "T", "TW", "+886"), new a(C0906R.string.chp, "T", "TJ", "+992"), new a(C0906R.string.chq, "T", "TZ", "+255"), new a(C0906R.string.ciy, "T", "TH", "+66"), new a(C0906R.string.clb, "T", "TL", "+670"), new a(C0906R.string.cnh, "T", "TG", "+228"), new a(C0906R.string.cni, "T", "TK", "+690"), new a(C0906R.string.cnj, "T", "TO", "+676"), new a(C0906R.string.cog, "T", "TT", "+1 868"), new a(C0906R.string.dm2, "T", "TN", "+216"), new a(C0906R.string.dm3, "T", "TR", "+90"), new a(C0906R.string.dm4, "T", "TM", "+993"), new a(C0906R.string.dm5, "T", "TC", "+1 649"), new a(C0906R.string.dm6, "T", "TV", "+688"), new a(C0906R.string.dme, "U", "VI", "+1 340"), new a(C0906R.string.dmi, "U", "UG", "+256"), new a(C0906R.string.dn5, "U", "UA", "+380"), new a(C0906R.string.dnx, "U", "AE", "+971"), new a(C0906R.string.dny, "U", "UK", "+44"), new a(C0906R.string.dnz, "U", "US", "+1"), new a(C0906R.string.dpd, "U", "UY", "+598"), new a(C0906R.string.dqi, "U", "UZ", "+998"), new a(C0906R.string.dql, "V", "VU", "+678"), new a(C0906R.string.dqm, "V", "VA", "+39 06 698"), new a(C0906R.string.dqm, "V", "VA", "+379"), new a(C0906R.string.dqn, "V", "VE", "+58"), new a(C0906R.string.ds6, "V", "VN", "+84"), new a(C0906R.string.dsy, "W", "WF", "+681"), new a(C0906R.string.duh, "Y", "YE", "+967"), new a(C0906R.string.duj, "Z", "ZM", "+260"), new a(C0906R.string.duk, "Z", "!1", "+255"), new a(C0906R.string.dul, "Z", "ZW", "+263"));
        }
    }

    @NotNull
    public static final ai<a> b() {
        return PatchProxy.isSupport(new Object[0], null, f32258a, true, 20280, new Class[0], ai.class) ? (ai) PatchProxy.accessDispatch(new Object[0], null, f32258a, true, 20280, new Class[0], ai.class) : g.a();
    }

    @NotNull
    public final a a(@StringRes int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, str5, str6}, this, f32258a, false, 20276, new Class[]{Integer.TYPE, String.class, String.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4, str5, str6}, this, f32258a, false, 20276, new Class[]{Integer.TYPE, String.class, String.class, String.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "nameIndex");
        Intrinsics.checkParameterIsNotNull(str5, "alpha2");
        Intrinsics.checkParameterIsNotNull(str6, "code");
        return new a(i, str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f32258a, false, 20279, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f32258a, false, 20279, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!(this.f32260b == aVar.f32260b) || !Intrinsics.areEqual((Object) this.f32261c, (Object) aVar.f32261c) || !Intrinsics.areEqual((Object) this.f32262d, (Object) aVar.f32262d) || !Intrinsics.areEqual((Object) this.f32263e, (Object) aVar.f32263e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f32258a, false, 20278, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32258a, false, 20278, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f32260b * 31;
        String str = this.f32261c;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f32262d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f32263e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f32258a, false, 20277, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32258a, false, 20277, new Class[0], String.class);
        }
        return "CountryCode(nameRes=" + this.f32260b + ", nameIndex=" + this.f32261c + ", alpha2=" + this.f32262d + ", code=" + this.f32263e + ")";
    }

    public final int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f32258a, false, 20274, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32258a, false, 20274, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            i = Integer.parseInt(StringsKt.replace$default(StringsKt.replace$default(this.f32263e, "+", "", false, 4, (Object) null), " ", "", false, 4, (Object) null));
        } catch (NumberFormatException unused) {
            i = 86;
        }
        return i;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f32258a, false, 20275, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f32258a, false, 20275, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f32261c = str2;
    }

    public a(@StringRes int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "nameIndex");
        Intrinsics.checkParameterIsNotNull(str2, "alpha2");
        Intrinsics.checkParameterIsNotNull(str3, "code");
        this.f32260b = i;
        this.f32261c = str;
        this.f32262d = str2;
        this.f32263e = str3;
    }
}
