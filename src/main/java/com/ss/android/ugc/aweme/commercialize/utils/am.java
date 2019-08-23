package com.ss.android.ugc.aweme.commercialize.utils;

import android.util.Base64;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.z;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002]^B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\tH\u0007J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u001c\u0010\u001c\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0007J\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J4\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\tH\u0002J=\u0010'\u001a\b\u0012\u0004\u0012\u0002H)0(\"\u0004\b\u0000\u0010)2\b\u0010*\u001a\u0004\u0018\u00010+2\u001c\b\u0004\u0010,\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\f\u0012\n\u0012\u0004\u0012\u0002H)\u0018\u00010(0-H\bJ\u0014\u0010/\u001a\u0004\u0018\u0001002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0014\u00101\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0014\u00102\u001a\u0004\u0018\u0001032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0014\u00104\u001a\u0004\u0018\u0001002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u00104\u001a\u0004\u0018\u0001002\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u00105\u001a\u00020\u0007H\u0007J\u0014\u00106\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u00107\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u00108\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u00109\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010:\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J4\u0010;\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010&\u001a\u00020\tH\u0007J\u001c\u0010<\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010=\u001a\u0004\u0018\u00010>H\u0007J\u0017\u0010?\u001a\u00020!2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070@H\bJ\u001f\u0010?\u001a\u00020!2\u0006\u0010A\u001a\u00020B2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070@H\bJ\u0010\u0010C\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u001c\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010H\u001a\u00020IH\u0002J\u0012\u0010J\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010K\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010L\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\b\u0010M\u001a\u0004\u0018\u00010NH\u0007J\u0018\u0010O\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0012\u0010Q\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u001c\u0010R\u001a\u00020!2\b\u0010S\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\"\u0010R\u001a\u00020!2\u000e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0003J\u0012\u0010T\u001a\u00020!2\b\u0010U\u001a\u0004\u0018\u00010\u0015H\u0007J\u001c\u0010V\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010W\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J*\u0010X\u001a\u00020!2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010Z\u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0007J)\u0010[\u001a\u00020!*\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\u000e\b\u0004\u0010\\\u001a\b\u0012\u0004\u0012\u00020!0@H\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u00158BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006_"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/VastUtils;", "", "()V", "OFFSET_ABSOLUTE", "Lkotlin/text/Regex;", "OFFSET_PERCENTAGE", "TAG", "", "disableOmSdk", "", "getDisableOmSdk", "()Z", "now", "", "getNow", "()J", "click", "Lcom/bytedance/vast/model/VideoClick;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getClick", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)Lcom/bytedance/vast/model/VideoClick;", "Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;", "(Lcom/ss/android/ugc/aweme/feed/model/AwemeRawAd;)Lcom/bytedance/vast/model/VideoClick;", "checkVastAdLoadStatus", "aweme", "loaded", "checkVastAdLoadingStatus", "loading", "checkVastAdProviderType", "providerType", "", "checkVastType", "doLoad", "", "executor", "Ljava/util/concurrent/Executor;", "onFinish", "Ljava/lang/Runnable;", "inlineOnly", "flatMapCreative", "Lkotlin/sequences/Sequence;", "R", "vast", "Lcom/bytedance/vast/model/Vast;", "f", "Lkotlin/Function1;", "Lcom/bytedance/vast/model/Creative;", "getAdChoiceIcon", "Lcom/bytedance/vast/model/Icon;", "getAdSystem", "getAdVerification", "Lcom/bytedance/vast/model/AdVerification;", "getIcon", "name", "getWebUrl", "isLoading", "isOmAd", "isShowVastLabel", "isVastAd", "load", "loadIcon", "avatarView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "logD", "Lkotlin/Function0;", "e", "", "logLoadResult", "mediaFileToBitRate", "Lcom/ss/android/ugc/aweme/feed/model/BitRate;", "m", "Lcom/bytedance/vast/model/MediaFile;", "duration", "", "mobMissingComponents", "mobMissingCriticalComponents", "mobPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "offsetToAbsolute", "offset", "shouldDelete", "track", "url", "trackClick", "ad", "trackEvent", "trackImpr", "trackOffset", "recentCheck", "trackViewable", "runTask", "task", "VastFetcher", "VastListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39706a;

    /* renamed from: b  reason: collision with root package name */
    public static final am f39707b = new am();

    /* renamed from: c  reason: collision with root package name */
    private static final Regex f39708c = new Regex("(\\d+)%");

    /* renamed from: d  reason: collision with root package name */
    private static final Regex f39709d = new Regex("(\\d{2}):(\\d{2}):(\\d{2})");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/VastUtils$VastFetcher;", "Lcom/bytedance/vast/UriFetcher;", "()V", "fetchUri", "Lorg/w3c/dom/Document;", "uri", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class a implements com.bytedance.g.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39710a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f39711b = new a();

        private a() {
        }

        @NotNull
        public final Document a(@Nullable String str) throws com.bytedance.g.a.a, com.bytedance.g.a.b {
            Closeable byteArrayInputStream;
            Throwable th;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f39710a, false, 32645, new Class[]{String.class}, Document.class)) {
                return (Document) PatchProxy.accessDispatch(new Object[]{str2}, this, f39710a, false, 32645, new Class[]{String.class}, Document.class);
            }
            try {
                String a2 = z.a(str);
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                try {
                    Charset charset = Charsets.UTF_8;
                    if (a2 != null) {
                        byte[] bytes = a2.getBytes(charset);
                        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                        byteArrayInputStream = new ByteArrayInputStream(bytes);
                        Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((ByteArrayInputStream) byteArrayInputStream);
                        Intrinsics.checkExpressionValueIsNotNull(parse, "DocumentBuilderFactory.n…cumentBuilder().parse(it)");
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        Intrinsics.checkExpressionValueIsNotNull(parse, "content.byteInputStream(…rse(it)\n                }");
                        return parse;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                } catch (Throwable th2) {
                    throw new com.bytedance.g.a.b(th2);
                }
            } catch (Exception e2) {
                throw new com.bytedance.g.a.a(str2, e2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u0012\u0010 \u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/VastUtils$VastListener;", "Lcom/bytedance/vast/VastParseListener;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "enterDepth", "", "enterTimeStamp", "", "queryWrapperOnce", "Lcom/ss/android/ugc/aweme/commercialize/utils/InMemOnce;", "startAt", "wrapperMismatchOnce", "discardUriTag", "", "tag", "", "enterContent", "content", "wrapper", "enterURI", "uri", "exit", "receiveDoc", "doc", "Lorg/w3c/dom/Document;", "receiveFetchException", "e", "Lcom/bytedance/vast/exception/FetchException;", "receiveInLine", "receiveParseException", "Lcom/bytedance/vast/exception/ParseException;", "receiveWrapper", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class b implements com.bytedance.g.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39712a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final Aweme f39713b;

        /* renamed from: c  reason: collision with root package name */
        private final long f39714c = am.f39707b.a();

        /* renamed from: d  reason: collision with root package name */
        private long f39715d;

        /* renamed from: e  reason: collision with root package name */
        private int f39716e;

        /* renamed from: f  reason: collision with root package name */
        private final aa f39717f = new aa();
        private final aa g = new aa();

        public final void b() {
            this.f39716e--;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f39712a, false, 32648, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39712a, false, 32648, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39713b).a("draw_ad").b("get_inline").a((Object) MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(am.f39707b.a() - this.f39715d)), TuplesKt.to("wrapper_count", Integer.valueOf(this.f39716e - 1)))).b();
        }

        public b(@NotNull Aweme aweme) {
            Intrinsics.checkParameterIsNotNull(aweme, "aweme");
            this.f39713b = aweme;
        }

        public final void a(@Nullable com.bytedance.g.a.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f39712a, false, 32646, new Class[]{com.bytedance.g.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f39712a, false, 32646, new Class[]{com.bytedance.g.a.a.class}, Void.TYPE);
                return;
            }
            String str = null;
            if (aVar.getCause() instanceof com.ss.android.http.a.a.b) {
                d.b b2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39713b).a("draw_ad").b("show_fail");
                Pair[] pairArr = new Pair[2];
                pairArr[0] = TuplesKt.to("error_message", "vast_mediafile_bad_response");
                Throwable cause = aVar.getCause();
                if (cause != null) {
                    str = cause.getMessage();
                }
                pairArr[1] = TuplesKt.to("error_detail", str);
                b2.a((Object) MapsKt.mapOf(pairArr)).b();
                return;
            }
            d.b b3 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39713b).a("draw_ad").b("show_fail");
            Pair[] pairArr2 = new Pair[2];
            pairArr2[0] = TuplesKt.to("error_message", "vast_filtered_others");
            Throwable cause2 = aVar.getCause();
            if (cause2 != null) {
                str = cause2.getMessage();
            }
            pairArr2[1] = TuplesKt.to("error_detail", str);
            b3.a((Object) MapsKt.mapOf(pairArr2)).b();
        }

        public final void a(@Nullable com.bytedance.g.a.b bVar) {
            String str;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f39712a, false, 32647, new Class[]{com.bytedance.g.a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f39712a, false, 32647, new Class[]{com.bytedance.g.a.b.class}, Void.TYPE);
                return;
            }
            d.b b2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39713b).a("draw_ad").b("show_fail");
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("error_message", "vast_xml_format_error");
            Throwable cause = bVar.getCause();
            if (cause != null) {
                str = cause.getMessage();
            } else {
                str = null;
            }
            pairArr[1] = TuplesKt.to("error_detail", str);
            b2.a((Object) MapsKt.mapOf(pairArr)).b();
        }

        public final void a(@Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f39712a, false, 32651, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f39712a, false, 32651, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (this.f39717f.a()) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39713b).a("draw_ad").b("show_fail").a((Object) MapsKt.mapOf(TuplesKt.to("error_message", "vast_wrapper_count_unmatch"))).b();
            }
        }

        public final void b(@Nullable String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f39712a, false, 32650, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f39712a, false, 32650, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f39716e++;
            this.f39715d = am.f39707b.a();
        }

        public final void a(@Nullable String str, int i) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f39712a, false, 32649, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f39712a, false, 32649, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f39716e++;
            this.f39715d = am.f39707b.a();
            if (this.g.a()) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39713b).a("draw_ad").b("query_wrapper").a((Object) MapsKt.mapOf(TuplesKt.to("duration", Long.valueOf(am.f39707b.a() - this.f39714c)))).b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "R", "it", "Lcom/bytedance/vast/model/Creative;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$flatMapCreative$1"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<com.bytedance.g.b.b, Sequence<? extends com.bytedance.g.b.g>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
            if (r0 == null) goto L_0x0047;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.sequences.Sequence<com.bytedance.g.b.g> invoke(com.bytedance.g.b.b r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.b> r3 = com.bytedance.g.b.b.class
                r7[r9] = r3
                java.lang.Class<kotlin.sequences.Sequence> r8 = kotlin.sequences.Sequence.class
                r5 = 0
                r6 = 32652(0x7f8c, float:4.5755E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
                r13 = 0
                r14 = 32652(0x7f8c, float:4.5755E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.b> r0 = com.bytedance.g.b.b.class
                r15[r9] = r0
                java.lang.Class<kotlin.sequences.Sequence> r16 = kotlin.sequences.Sequence.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
                return r0
            L_0x0037:
                if (r0 == 0) goto L_0x0047
                java.util.List<com.bytedance.g.b.g> r0 = r0.clickList
                if (r0 == 0) goto L_0x0044
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
                goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                if (r0 != 0) goto L_0x004b
            L_0x0047:
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
            L_0x004b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.c.invoke(com.bytedance.g.b.b):kotlin.sequences.Sequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$runTask$1"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39718a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f39719b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39720c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f39721d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ OmVast f39722e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f39723f;

        public d(Runnable runnable, Aweme aweme, long j, OmVast omVast, int i) {
            this.f39719b = runnable;
            this.f39720c = aweme;
            this.f39721d = j;
            this.f39722e = omVast;
            this.f39723f = i;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|13|14|(1:16)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0092 */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0098 A[Catch:{ all -> 0x00b8 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f39718a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 32653(0x7f8d, float:4.5757E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f39718a
                r5 = 0
                r6 = 32653(0x7f8d, float:4.5757E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f39720c     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r2)     // Catch:{ all -> 0x00b8 }
                java.lang.String r2 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)     // Catch:{ all -> 0x00b8 }
                java.lang.String r2 = "parse_vast"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)     // Catch:{ all -> 0x00b8 }
                java.lang.String r2 = "duration"
                com.ss.android.ugc.aweme.commercialize.utils.am r3 = com.ss.android.ugc.aweme.commercialize.utils.am.f39707b     // Catch:{ all -> 0x00b8 }
                long r3 = r3.a()     // Catch:{ all -> 0x00b8 }
                long r5 = r9.f39721d     // Catch:{ all -> 0x00b8 }
                r7 = 0
                long r3 = r3 - r5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b8 }
                kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)     // Catch:{ all -> 0x00b8 }
                java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)     // Catch:{ all -> 0x00b8 }
                r1.b()     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39722e     // Catch:{ all -> 0x00b8 }
                r2 = 1
                r1.loaded = r2     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39722e     // Catch:{ all -> 0x00b8 }
                com.bytedance.g.b.f r3 = new com.bytedance.g.b.f     // Catch:{ all -> 0x00b8 }
                r3.<init>()     // Catch:{ all -> 0x00b8 }
                r1.vast = r3     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39722e     // Catch:{ all -> 0x00b8 }
                java.lang.String r1 = r1.vastUrl     // Catch:{ all -> 0x00b8 }
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x00b8 }
                if (r1 == 0) goto L_0x0074
                int r1 = r1.length()     // Catch:{ all -> 0x00b8 }
                if (r1 != 0) goto L_0x0075
            L_0x0074:
                r0 = 1
            L_0x0075:
                if (r0 != 0) goto L_0x00a8
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r9.f39722e     // Catch:{ Exception -> 0x0092 }
                com.bytedance.g.b.f r0 = r0.vast     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39722e     // Catch:{ Exception -> 0x0092 }
                java.lang.String r1 = r1.vastUrl     // Catch:{ Exception -> 0x0092 }
                int r2 = r9.f39723f     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.commercialize.utils.am$a r3 = com.ss.android.ugc.aweme.commercialize.utils.am.a.f39711b     // Catch:{ Exception -> 0x0092 }
                com.bytedance.g.b r3 = (com.bytedance.g.b) r3     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.commercialize.utils.am$b r4 = new com.ss.android.ugc.aweme.commercialize.utils.am$b     // Catch:{ Exception -> 0x0092 }
                com.ss.android.ugc.aweme.feed.model.Aweme r5 = r9.f39720c     // Catch:{ Exception -> 0x0092 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0092 }
                com.bytedance.g.c r4 = (com.bytedance.g.c) r4     // Catch:{ Exception -> 0x0092 }
                r0.parseUri(r1, r2, r3, r4)     // Catch:{ Exception -> 0x0092 }
                goto L_0x00a8
            L_0x0092:
                boolean r0 = com.ss.android.ugc.aweme.g.a.a()     // Catch:{ all -> 0x00b8 }
                if (r0 == 0) goto L_0x00a8
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
                java.lang.String r1 = "parse uri failed: "
                r0.<init>(r1)     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39720c     // Catch:{ all -> 0x00b8 }
                java.lang.String r1 = r1.getDesc()     // Catch:{ all -> 0x00b8 }
                r0.append(r1)     // Catch:{ all -> 0x00b8 }
            L_0x00a8:
                com.ss.android.ugc.aweme.commercialize.utils.am r0 = com.ss.android.ugc.aweme.commercialize.utils.am.f39707b     // Catch:{ all -> 0x00b8 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39720c     // Catch:{ all -> 0x00b8 }
                r0.a((com.ss.android.ugc.aweme.feed.model.Aweme) r1)     // Catch:{ all -> 0x00b8 }
                java.lang.Runnable r0 = r9.f39719b
                if (r0 == 0) goto L_0x00b7
                r0.run()
                return
            L_0x00b7:
                return
            L_0x00b8:
                r0 = move-exception
                java.lang.Runnable r1 = r9.f39719b
                if (r1 == 0) goto L_0x00c0
                r1.run()
            L_0x00c0:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.d.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$runTask$1"}, k = 3, mv = {1, 1, 15})
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39724a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f39725b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39726c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f39727d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.bytedance.g.b.f f39728e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ OmVast f39729f;
        final /* synthetic */ int g;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/feed/model/BitRate;", "it", "Lcom/bytedance/vast/model/MediaFile;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$doLoad$3$bitRateList$1"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<com.bytedance.g.b.d, BitRate> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ double $duration;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(double d2) {
                super(1);
                this.$duration = d2;
            }

            @Nullable
            public final BitRate invoke(com.bytedance.g.b.d dVar) {
                com.bytedance.g.b.d dVar2 = dVar;
                if (!PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 32655, new Class[]{com.bytedance.g.b.d.class}, BitRate.class)) {
                    return am.f39707b.a(dVar2, this.$duration);
                }
                return (BitRate) PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 32655, new Class[]{com.bytedance.g.b.d.class}, BitRate.class);
            }
        }

        public e(Runnable runnable, Aweme aweme, long j, com.bytedance.g.b.f fVar, OmVast omVast, int i) {
            this.f39725b = runnable;
            this.f39726c = aweme;
            this.f39727d = j;
            this.f39728e = fVar;
            this.f39729f = omVast;
            this.g = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0085 A[Catch:{ Exception -> 0x021a, all -> 0x0239 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x009d A[Catch:{ Exception -> 0x021a, all -> 0x0239 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf A[Catch:{ Exception -> 0x021a, all -> 0x0239 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0132 A[Catch:{ Exception -> 0x021a, all -> 0x0239 }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0234  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0238 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f39724a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 32654(0x7f8e, float:4.5758E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0023
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f39724a
                r5 = 0
                r6 = 32654(0x7f8e, float:4.5758E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0023:
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r2)     // Catch:{ all -> 0x0239 }
                java.lang.String r2 = "draw_ad"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0239 }
                java.lang.String r2 = "parse_vast"
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)     // Catch:{ all -> 0x0239 }
                java.lang.String r2 = "duration"
                com.ss.android.ugc.aweme.commercialize.utils.am r3 = com.ss.android.ugc.aweme.commercialize.utils.am.f39707b     // Catch:{ all -> 0x0239 }
                long r3 = r3.a()     // Catch:{ all -> 0x0239 }
                long r5 = r9.f39727d     // Catch:{ all -> 0x0239 }
                r7 = 0
                long r3 = r3 - r5
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0239 }
                kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)     // Catch:{ all -> 0x0239 }
                java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)     // Catch:{ all -> 0x0239 }
                r1.b()     // Catch:{ all -> 0x0239 }
                com.bytedance.g.b.f r1 = r9.f39728e     // Catch:{ Exception -> 0x021a }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r9.f39729f     // Catch:{ Exception -> 0x021a }
                java.lang.String r2 = r2.vastContent     // Catch:{ Exception -> 0x021a }
                int r3 = r9.g     // Catch:{ Exception -> 0x021a }
                com.ss.android.ugc.aweme.commercialize.utils.am$a r4 = com.ss.android.ugc.aweme.commercialize.utils.am.a.f39711b     // Catch:{ Exception -> 0x021a }
                com.bytedance.g.b r4 = (com.bytedance.g.b) r4     // Catch:{ Exception -> 0x021a }
                com.ss.android.ugc.aweme.commercialize.utils.am$b r5 = new com.ss.android.ugc.aweme.commercialize.utils.am$b     // Catch:{ Exception -> 0x021a }
                com.ss.android.ugc.aweme.feed.model.Aweme r6 = r9.f39726c     // Catch:{ Exception -> 0x021a }
                r5.<init>(r6)     // Catch:{ Exception -> 0x021a }
                com.bytedance.g.c r5 = (com.bytedance.g.c) r5     // Catch:{ Exception -> 0x021a }
                r1.parseContent(r2, r3, r4, r5)     // Catch:{ Exception -> 0x021a }
                com.bytedance.g.b.f r1 = r9.f39728e     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = r1.adTitle     // Catch:{ all -> 0x0239 }
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0239 }
                r2 = 1
                if (r1 == 0) goto L_0x0082
                int r1 = r1.length()     // Catch:{ all -> 0x0239 }
                if (r1 != 0) goto L_0x0080
                goto L_0x0082
            L_0x0080:
                r1 = 0
                goto L_0x0083
            L_0x0082:
                r1 = 1
            L_0x0083:
                if (r1 == 0) goto L_0x009d
                boolean r0 = com.ss.android.ugc.aweme.g.a.a()     // Catch:{ all -> 0x0239 }
                if (r0 == 0) goto L_0x0230
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = "empty title: "
                r0.<init>(r1)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = r1.getAid()     // Catch:{ all -> 0x0239 }
                r0.append(r1)     // Catch:{ all -> 0x0239 }
                goto L_0x0230
            L_0x009d:
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39729f     // Catch:{ all -> 0x0239 }
                com.bytedance.g.b.f r3 = r9.f39728e     // Catch:{ all -> 0x0239 }
                r1.vast = r3     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.utils.am r1 = com.ss.android.ugc.aweme.commercialize.utils.am.f39707b     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.bytedance.g.b.g r1 = r1.j(r3)     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x00cc
                java.lang.String r3 = r1.clickThrough     // Catch:{ all -> 0x0239 }
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0239 }
                if (r3 == 0) goto L_0x00bc
                int r3 = r3.length()     // Catch:{ all -> 0x0239 }
                if (r3 != 0) goto L_0x00ba
                goto L_0x00bc
            L_0x00ba:
                r3 = 0
                goto L_0x00bd
            L_0x00bc:
                r3 = 1
            L_0x00bd:
                if (r3 != 0) goto L_0x00cc
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()     // Catch:{ all -> 0x0239 }
                if (r3 == 0) goto L_0x00cc
                java.lang.String r1 = r1.clickThrough     // Catch:{ all -> 0x0239 }
                r3.setWebUrl(r1)     // Catch:{ all -> 0x0239 }
            L_0x00cc:
                com.bytedance.g.b.f r1 = r9.f39728e     // Catch:{ all -> 0x0239 }
                java.util.List<com.bytedance.g.b.b> r1 = r1.creativeList     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x0230
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0239 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0239 }
            L_0x00d8:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0239 }
                r4 = 0
                if (r3 == 0) goto L_0x00f2
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0239 }
                r5 = r3
                com.bytedance.g.b.b r5 = (com.bytedance.g.b.b) r5     // Catch:{ all -> 0x0239 }
                if (r5 == 0) goto L_0x00ee
                boolean r5 = r5.byWrapper     // Catch:{ all -> 0x0239 }
                if (r5 != 0) goto L_0x00ee
                r5 = 1
                goto L_0x00ef
            L_0x00ee:
                r5 = 0
            L_0x00ef:
                if (r5 == 0) goto L_0x00d8
                goto L_0x00f3
            L_0x00f2:
                r3 = r4
            L_0x00f3:
                com.bytedance.g.b.b r3 = (com.bytedance.g.b.b) r3     // Catch:{ all -> 0x0239 }
                if (r3 != 0) goto L_0x00f9
                goto L_0x0230
            L_0x00f9:
                long r5 = r3.getDurationInMs()     // Catch:{ all -> 0x0239 }
                double r5 = (double) r5     // Catch:{ all -> 0x0239 }
                java.util.List<com.bytedance.g.b.d> r1 = r3.mediaFileList     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x0121
                java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0239 }
                kotlin.sequences.Sequence r1 = kotlin.collections.CollectionsKt.asSequence(r1)     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x0121
                com.ss.android.ugc.aweme.commercialize.utils.am$e$a r7 = new com.ss.android.ugc.aweme.commercialize.utils.am$e$a     // Catch:{ all -> 0x0239 }
                r7.<init>(r5)     // Catch:{ all -> 0x0239 }
                kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch:{ all -> 0x0239 }
                kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r1, r7)     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x0121
                kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filterNotNull(r1)     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x0121
                java.util.List r4 = kotlin.sequences.SequencesKt.toList(r1)     // Catch:{ all -> 0x0239 }
            L_0x0121:
                r1 = r4
                java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x012f
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x012d
                goto L_0x012f
            L_0x012d:
                r1 = 0
                goto L_0x0130
            L_0x012f:
                r1 = 1
            L_0x0130:
                if (r1 != 0) goto L_0x0230
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()     // Catch:{ all -> 0x0239 }
                if (r1 != 0) goto L_0x0144
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Video r5 = new com.ss.android.ugc.aweme.feed.model.Video     // Catch:{ all -> 0x0239 }
                r5.<init>()     // Catch:{ all -> 0x0239 }
                r1.setVideo(r5)     // Catch:{ all -> 0x0239 }
            L_0x0144:
                java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.BitRate r0 = (com.ss.android.ugc.aweme.feed.model.BitRate) r0     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getPlayAddr()     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()     // Catch:{ all -> 0x0239 }
                java.lang.String r5 = "aweme.video"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)     // Catch:{ all -> 0x0239 }
                java.lang.String r5 = "url"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r5)     // Catch:{ all -> 0x0239 }
                int r5 = r0.getWidth()     // Catch:{ all -> 0x0239 }
                r1.setWidth(r5)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()     // Catch:{ all -> 0x0239 }
                java.lang.String r5 = "aweme.video"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)     // Catch:{ all -> 0x0239 }
                int r5 = r0.getHeight()     // Catch:{ all -> 0x0239 }
                r1.setHeight(r5)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()     // Catch:{ all -> 0x0239 }
                java.lang.String r5 = "aweme.video"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel     // Catch:{ all -> 0x0239 }
                r5.<init>()     // Catch:{ all -> 0x0239 }
                int r6 = r0.getWidth()     // Catch:{ all -> 0x0239 }
                r5.setWidth(r6)     // Catch:{ all -> 0x0239 }
                int r6 = r0.getHeight()     // Catch:{ all -> 0x0239 }
                r5.setHeight(r6)     // Catch:{ all -> 0x0239 }
                java.lang.String r6 = r0.getUri()     // Catch:{ all -> 0x0239 }
                r5.setUri(r6)     // Catch:{ all -> 0x0239 }
                java.lang.String r6 = r0.getUrlKey()     // Catch:{ all -> 0x0239 }
                r5.setUrlKey(r6)     // Catch:{ all -> 0x0239 }
                java.util.List r0 = r0.getUrlList()     // Catch:{ all -> 0x0239 }
                r5.setUrlList(r0)     // Catch:{ all -> 0x0239 }
                long r6 = r3.getDurationInMs()     // Catch:{ all -> 0x0239 }
                double r6 = (double) r6     // Catch:{ all -> 0x0239 }
                r5.setDuration(r6)     // Catch:{ all -> 0x0239 }
                r1.setPlayAddr(r5)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.a r0 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = "SettingsReader.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ all -> 0x0239 }
                java.lang.Boolean r0 = r0.bv()     // Catch:{ all -> 0x0239 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0239 }
                if (r0 != 0) goto L_0x01d6
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = "aweme.video"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ all -> 0x0239 }
                r0.setBitRate(r4)     // Catch:{ all -> 0x0239 }
            L_0x01d6:
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39729f     // Catch:{ all -> 0x0239 }
                com.bytedance.g.b.f r1 = r1.vast     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = r1.adTitle     // Catch:{ all -> 0x0239 }
                r0.setTitle(r1)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.model.OmVast r1 = r9.f39729f     // Catch:{ all -> 0x0239 }
                com.bytedance.g.b.f r1 = r1.vast     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = r1.description     // Catch:{ all -> 0x0239 }
                r0.setDesc(r1)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.utils.am r0 = com.ss.android.ugc.aweme.commercialize.utils.am.f39707b     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.bytedance.g.b.g r0 = r0.j(r1)     // Catch:{ all -> 0x0239 }
                if (r0 == 0) goto L_0x020e
                java.lang.String r0 = r0.clickThrough     // Catch:{ all -> 0x0239 }
                if (r0 == 0) goto L_0x020e
                r1 = r0
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0239 }
                boolean r1 = kotlin.text.StringsKt.isBlank(r1)     // Catch:{ all -> 0x0239 }
                if (r1 != 0) goto L_0x020e
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()     // Catch:{ all -> 0x0239 }
                if (r1 == 0) goto L_0x020e
                r1.setWebUrl(r0)     // Catch:{ all -> 0x0239 }
            L_0x020e:
                com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r9.f39729f     // Catch:{ all -> 0x0239 }
                r0.loaded = r2     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.commercialize.utils.am r0 = com.ss.android.ugc.aweme.commercialize.utils.am.f39707b     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                r0.a((com.ss.android.ugc.aweme.feed.model.Aweme) r1)     // Catch:{ all -> 0x0239 }
                goto L_0x0230
            L_0x021a:
                boolean r0 = com.ss.android.ugc.aweme.g.a.a()     // Catch:{ all -> 0x0239 }
                if (r0 == 0) goto L_0x0230
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = "parse content failed: "
                r0.<init>(r1)     // Catch:{ all -> 0x0239 }
                com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.f39726c     // Catch:{ all -> 0x0239 }
                java.lang.String r1 = r1.getAid()     // Catch:{ all -> 0x0239 }
                r0.append(r1)     // Catch:{ all -> 0x0239 }
            L_0x0230:
                java.lang.Runnable r0 = r9.f39725b
                if (r0 == 0) goto L_0x0238
                r0.run()
                return
            L_0x0238:
                return
            L_0x0239:
                r0 = move-exception
                java.lang.Runnable r1 = r9.f39725b
                if (r1 == 0) goto L_0x0241
                r1.run()
            L_0x0241:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.e.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/feed/model/BitRate;", "it", "Lcom/bytedance/vast/model/MediaFile;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<com.bytedance.g.b.d, BitRate> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ double $duration;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(double d2) {
            super(1);
            this.$duration = d2;
        }

        @Nullable
        public final BitRate invoke(com.bytedance.g.b.d dVar) {
            com.bytedance.g.b.d dVar2 = dVar;
            if (!PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 32656, new Class[]{com.bytedance.g.b.d.class}, BitRate.class)) {
                return am.f39707b.a(dVar2, this.$duration);
            }
            return (BitRate) PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 32656, new Class[]{com.bytedance.g.b.d.class}, BitRate.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "R", "it", "Lcom/bytedance/vast/model/Creative;", "kotlin.jvm.PlatformType", "invoke", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$flatMapCreative$1"}, k = 3, mv = {1, 1, 15})
    public static final class g extends Lambda implements Function1<com.bytedance.g.b.b, Sequence<? extends com.bytedance.g.b.c>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public g() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
            if (r0 == null) goto L_0x0047;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.sequences.Sequence<com.bytedance.g.b.c> invoke(com.bytedance.g.b.b r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.b> r3 = com.bytedance.g.b.b.class
                r7[r9] = r3
                java.lang.Class<kotlin.sequences.Sequence> r8 = kotlin.sequences.Sequence.class
                r5 = 0
                r6 = 32658(0x7f92, float:4.5764E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
                r13 = 0
                r14 = 32658(0x7f92, float:4.5764E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.b> r0 = com.bytedance.g.b.b.class
                r15[r9] = r0
                java.lang.Class<kotlin.sequences.Sequence> r16 = kotlin.sequences.Sequence.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
                return r0
            L_0x0037:
                if (r0 == 0) goto L_0x0047
                java.util.List<com.bytedance.g.b.c> r0 = r0.iconList
                if (r0 == 0) goto L_0x0044
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
                goto L_0x0045
            L_0x0044:
                r0 = 0
            L_0x0045:
                if (r0 != 0) goto L_0x004b
            L_0x0047:
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
            L_0x004b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.g.invoke(com.bytedance.g.b.b):kotlin.sequences.Sequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f39731b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f39732c;

        h(Aweme aweme, Runnable runnable) {
            this.f39731b = aweme;
            this.f39732c = runnable;
        }

        public final void run() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, f39730a, false, 32659, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f39730a, false, 32659, new Class[0], Void.TYPE);
                return;
            }
            Aweme aweme = this.f39731b;
            if (aweme != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null) {
                        omVast.loading = false;
                    }
                }
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                StringBuilder sb = new StringBuilder("exit loading ");
                Aweme aweme2 = this.f39731b;
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                sb.append(str);
            }
            Runnable runnable = this.f39732c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Lcom/bytedance/vast/model/VideoClick;", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/vast/model/Creative;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<com.bytedance.g.b.b, Sequence<? extends com.bytedance.g.b.g>> {
        public static final i INSTANCE = new i();
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
            if (r0 == null) goto L_0x0048;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.sequences.Sequence<com.bytedance.g.b.g> invoke(@org.jetbrains.annotations.NotNull com.bytedance.g.b.b r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.b> r3 = com.bytedance.g.b.b.class
                r7[r9] = r3
                java.lang.Class<kotlin.sequences.Sequence> r8 = kotlin.sequences.Sequence.class
                r5 = 0
                r6 = 32660(0x7f94, float:4.5766E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
                r13 = 0
                r14 = 32660(0x7f94, float:4.5766E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.b> r0 = com.bytedance.g.b.b.class
                r15[r9] = r0
                java.lang.Class<kotlin.sequences.Sequence> r16 = kotlin.sequences.Sequence.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
                return r0
            L_0x0037:
                java.lang.String r1 = "it"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
                java.util.List<com.bytedance.g.b.g> r0 = r0.clickList
                if (r0 == 0) goto L_0x0048
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
                if (r0 != 0) goto L_0x004c
            L_0x0048:
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
            L_0x004c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.i.invoke(com.bytedance.g.b.b):kotlin.sequences.Sequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/vast/model/VideoClick;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<com.bytedance.g.b.g, String> {
        public static final j INSTANCE = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
            super(1);
        }

        @Nullable
        public final String invoke(com.bytedance.g.b.g gVar) {
            if (gVar != null) {
                return gVar.clickThrough;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/vast/model/VideoClick;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<com.bytedance.g.b.g, Sequence<? extends String>> {
        public static final k INSTANCE = new k();
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
            if (r0 == null) goto L_0x0048;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final kotlin.sequences.Sequence<java.lang.String> invoke(@org.jetbrains.annotations.NotNull com.bytedance.g.b.g r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.g> r3 = com.bytedance.g.b.g.class
                r7[r9] = r3
                java.lang.Class<kotlin.sequences.Sequence> r8 = kotlin.sequences.Sequence.class
                r5 = 0
                r6 = 32661(0x7f95, float:4.5768E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
                r13 = 0
                r14 = 32661(0x7f95, float:4.5768E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.bytedance.g.b.g> r0 = com.bytedance.g.b.g.class
                r15[r9] = r0
                java.lang.Class<kotlin.sequences.Sequence> r16 = kotlin.sequences.Sequence.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
                return r0
            L_0x0037:
                java.lang.String r1 = "it"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
                java.util.Set<java.lang.String> r0 = r0.clickTracking
                if (r0 == 0) goto L_0x0048
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
                if (r0 != 0) goto L_0x004c
            L_0x0048:
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
            L_0x004c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.k.invoke(com.bytedance.g.b.g):kotlin.sequences.Sequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function1<String, Boolean> {
        public static final l INSTANCE = new l();
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 32662, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 32662, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function1<String, Boolean> {
        public static final m INSTANCE = new m();
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 32663, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 32663, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function1<String, String> {
        public static final n INSTANCE = new n();
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 32665, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 32665, new Class[]{String.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, AdvanceSetting.NETWORK_TYPE);
            return StringsKt.replace$default(str, "[ERRORCODE]", PushConstants.PUSH_TYPE_NOTIFY, false, 4, (Object) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¨\u0006\u000b¸\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/commercialize/log/RawURLGetter$submit$1", "Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter$TrackUrlCallback;", "onTrackUrlFinished", "", "status", "", "success", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$$special$$inlined$submit$2", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$$special$$inlined$forEach$lambda$1"}, k = 1, mv = {1, 1, 15})
    public static final class o implements z.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f39734b;

        public o(AwemeRawAd awemeRawAd) {
            this.f39734b = awemeRawAd;
        }

        public final void a(int i, boolean z, @Nullable Exception exc) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f39733a, false, 32666, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), exc}, this, f39733a, false, 32666, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE);
                return;
            }
            if (!z) {
                d.b b2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39734b).a("draw_ad").b("load_failed");
                Pair[] pairArr = new Pair[3];
                pairArr[0] = TuplesKt.to("error_message", "vast_click_tracker_bad_response");
                pairArr[1] = TuplesKt.to("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pairArr[2] = TuplesKt.to("error_detail", str);
                b2.a((Object) MapsKt.mapOf(pairArr)).b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¨\u0006\u000b¸\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/commercialize/log/RawURLGetter$submit$1", "Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter$TrackUrlCallback;", "onTrackUrlFinished", "", "status", "", "success", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$$special$$inlined$submit$3"}, k = 1, mv = {1, 1, 15})
    public static final class p implements z.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39735a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f39736b;

        public p(AwemeRawAd awemeRawAd) {
            this.f39736b = awemeRawAd;
        }

        public final void a(int i, boolean z, @Nullable Exception exc) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f39735a, false, 32667, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), exc}, this, f39735a, false, 32667, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE);
                return;
            }
            if (!z) {
                d.b b2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39736b).a("draw_ad").b("load_failed");
                Pair[] pairArr = new Pair[3];
                pairArr[0] = TuplesKt.to("error_message", "vast_clickthru_bad_response");
                pairArr[1] = TuplesKt.to("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pairArr[2] = TuplesKt.to("error_detail", str);
                b2.a((Object) MapsKt.mapOf(pairArr)).b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class q extends Lambda implements Function1<String, Boolean> {
        public static final q INSTANCE = new q();
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 32668, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 32668, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0016¨\u0006\u000b¸\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/commercialize/log/RawURLGetter$submit$1", "Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter$TrackUrlCallback;", "onTrackUrlFinished", "", "status", "", "success", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "main_douyinCnRelease", "com/ss/android/ugc/aweme/commercialize/utils/VastUtils$$special$$inlined$submit$1"}, k = 1, mv = {1, 1, 15})
    public static final class r implements z.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f39738b;

        public r(Aweme aweme) {
            this.f39738b = aweme;
        }

        public final void a(int i, boolean z, @Nullable Exception exc) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f39737a, false, 32671, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), exc}, this, f39737a, false, 32671, new Class[]{Integer.TYPE, Boolean.TYPE, Exception.class}, Void.TYPE);
                return;
            }
            if (!z) {
                d.b b2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f39738b).a("draw_ad").b("load_failed");
                Pair[] pairArr = new Pair[3];
                pairArr[0] = TuplesKt.to("error_message", "vast_imp_tracker_bad_response");
                pairArr[1] = TuplesKt.to("error_code", Integer.valueOf(i));
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pairArr[2] = TuplesKt.to("error_detail", str);
                b2.a((Object) MapsKt.mapOf(pairArr)).b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function1<String, Boolean> {
        public static final s INSTANCE = new s();
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 32672, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 32672, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }
    }

    private am() {
    }

    @JvmStatic
    public static final boolean a(@Nullable Aweme aweme, @Nullable RemoteImageView remoteImageView) {
        Aweme aweme2 = aweme;
        RemoteImageView remoteImageView2 = remoteImageView;
        if (PatchProxy.isSupport(new Object[]{aweme2, remoteImageView2}, null, f39706a, true, 32614, new Class[]{Aweme.class, RemoteImageView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2, remoteImageView2}, null, f39706a, true, 32614, new Class[]{Aweme.class, RemoteImageView.class}, Boolean.TYPE)).booleanValue();
        } else if (!a(aweme2, 3)) {
            return false;
        } else {
            com.bytedance.g.b.c a2 = PatchProxy.isSupport(new Object[]{aweme2}, null, f39706a, true, 32613, new Class[]{Aweme.class}, com.bytedance.g.b.c.class) ? (com.bytedance.g.b.c) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39706a, true, 32613, new Class[]{Aweme.class}, com.bytedance.g.b.c.class) : a(aweme2, "icon");
            if (a2 == null) {
                return false;
            }
            CharSequence charSequence = a2.staticResource;
            if (charSequence == null || charSequence.length() == 0) {
                return false;
            }
            com.ss.android.ugc.aweme.base.c.a(remoteImageView2, a2.staticResource);
            if (com.ss.android.ugc.aweme.g.a.a()) {
                StringBuilder sb = new StringBuilder("bind avatar: desc=");
                sb.append(aweme2 != null ? aweme.getDesc() : null);
                sb.append(" avatar=");
                sb.append(a2.staticResource);
            }
            return true;
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Aweme aweme, boolean z) {
        if (PatchProxy.isSupport(new Object[]{aweme, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39706a, true, 32626, new Class[]{Aweme.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, Byte.valueOf(z)}, null, f39706a, true, 32626, new Class[]{Aweme.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                return omVast != null && omVast.loaded == z;
            }
        }
    }

    @JvmStatic
    public static final boolean a(@Nullable Aweme aweme, @OmVast.ProviderType int i2) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i2)}, null, f39706a, true, 32627, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i2)}, null, f39706a, true, 32627, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                return omVast != null && omVast.providerType == i2;
            }
        }
    }

    public final BitRate a(com.bytedance.g.b.d dVar, double d2) {
        String str;
        com.bytedance.g.b.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, Double.valueOf(d2)}, this, f39706a, false, 32644, new Class[]{com.bytedance.g.b.d.class, Double.TYPE}, BitRate.class)) {
            return (BitRate) PatchProxy.accessDispatch(new Object[]{dVar2, Double.valueOf(d2)}, this, f39706a, false, 32644, new Class[]{com.bytedance.g.b.d.class, Double.TYPE}, BitRate.class);
        }
        if (dVar2 != null && !(!Intrinsics.areEqual((Object) dVar2.type, (Object) "video/mp4")) && dVar2.width > 0 && dVar2.height > 0) {
            CharSequence charSequence = dVar2.url;
            if (!(charSequence == null || charSequence.length() == 0)) {
                BitRate bitRate = new BitRate();
                bitRate.setH265(0);
                int i2 = dVar2.width;
                if (i2 >= 0 && 540 > i2) {
                    str = "480p";
                    bitRate.setGearName("noraml_480");
                    bitRate.setQualityType(301);
                    bitRate.setBitRate(dVar2.bitRate > 0 ? dVar2.bitRate * 1024 : 600000);
                } else if (540 <= i2 && 720 > i2) {
                    str = "540p";
                    bitRate.setGearName("normal_540");
                    bitRate.setQualityType(201);
                    bitRate.setBitRate(dVar2.bitRate > 0 ? dVar2.bitRate * 1024 : 1350000);
                } else {
                    str = "720p";
                    bitRate.setGearName("normal_720");
                    bitRate.setQualityType(BaseLoginOrRegisterActivity.o);
                    bitRate.setBitRate(dVar2.bitRate > 0 ? dVar2.bitRate * 1024 : 2000000);
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setWidth(dVar2.width);
                urlModel.setHeight(dVar2.height);
                String str2 = dVar2.url;
                Intrinsics.checkExpressionValueIsNotNull(str2, "m.url");
                Charset charset = Charsets.UTF_8;
                if (str2 != null) {
                    byte[] bytes = str2.getBytes(charset);
                    Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                    urlModel.setUri(Base64.encodeToString(bytes, 1));
                    urlModel.setUrlKey(urlModel.getUri() + "_h264_" + str + '_' + bitRate.getBitRate());
                    urlModel.setUrlList(CollectionsKt.mutableListOf(dVar2.url));
                    bitRate.setPlayAddr(urlModel);
                    return bitRate;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return null;
    }

    public final void a(Aweme aweme) {
        String str;
        Integer num;
        String str2;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39706a, false, 32611, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f39706a, false, 32611, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.g.a.a()) {
            if (e(aweme)) {
                str = "vast";
            } else {
                str = f(aweme) ? "omsdk" : "none";
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    num = Integer.valueOf(omVast.providerType);
                    if (num != null && num.intValue() == 2) {
                        str2 = "local";
                    } else {
                        str2 = (num != null && num.intValue() == 3) ? "dsp" : "unknown";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('(');
                    sb.append(str2);
                    sb.append("): ");
                    sb.append(aweme.getDesc());
                }
            }
            num = null;
            if (num != null) {
                str2 = "local";
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('(');
                sb2.append(str2);
                sb2.append("): ");
                sb2.append(aweme.getDesc());
            }
            if (num != null) {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append('(');
                sb22.append(str2);
                sb22.append("): ");
                sb22.append(aweme.getDesc());
            }
            StringBuilder sb222 = new StringBuilder();
            sb222.append(str);
            sb222.append('(');
            sb222.append(str2);
            sb222.append("): ");
            sb222.append(aweme.getDesc());
        }
    }

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f39706a, false, 32603, new Class[0], Long.TYPE)) {
            return System.currentTimeMillis();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f39706a, false, 32603, new Class[0], Long.TYPE)).longValue();
    }

    @JvmStatic
    private static boolean b() {
        Boolean bool;
        if (PatchProxy.isSupport(new Object[0], null, f39706a, true, 32604, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f39706a, true, 32604, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            bool = b2.aV();
            Intrinsics.checkExpressionValueIsNotNull(bool, "SettingsReader.get().disableOmSdk");
        } catch (com.bytedance.ies.a unused) {
            bool = Boolean.TRUE;
        }
        return bool.booleanValue();
    }

    @JvmStatic
    @Nullable
    public static final com.bytedance.g.b.c b(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2}, null, f39706a, true, 32612, new Class[]{Aweme.class}, com.bytedance.g.b.c.class)) {
            return a(aweme2, "AdChoices");
        }
        return (com.bytedance.g.b.c) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39706a, true, 32612, new Class[]{Aweme.class}, com.bytedance.g.b.c.class);
    }

    @JvmStatic
    public static final boolean d(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{aweme2}, null, f39706a, true, 32623, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return a(aweme2, 3);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39706a, true, 32623, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r0 == null) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.g.b.g b(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.AwemeRawAd r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f39706a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r3 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r7[r9] = r3
            java.lang.Class<com.bytedance.g.b.g> r8 = com.bytedance.g.b.g.class
            r5 = 0
            r6 = 32640(0x7f80, float:4.5738E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f39706a
            r13 = 0
            r14 = 32640(0x7f80, float:4.5738E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.AwemeRawAd> r0 = com.ss.android.ugc.aweme.feed.model.AwemeRawAd.class
            r15[r9] = r0
            java.lang.Class<com.bytedance.g.b.g> r16 = com.bytedance.g.b.g.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.bytedance.g.b.g r0 = (com.bytedance.g.b.g) r0
            return r0
        L_0x0035:
            if (r18 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r18.getOmVast()
            if (r0 == 0) goto L_0x0040
            com.bytedance.g.b.f r0 = r0.vast
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x005c
            java.util.List<com.bytedance.g.b.b> r0 = r0.creativeList
            if (r0 == 0) goto L_0x005c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.commercialize.utils.am$c r1 = new com.ss.android.ugc.aweme.commercialize.utils.am$c
            r1.<init>()
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.flatMap(r0, r1)
            if (r0 != 0) goto L_0x0060
        L_0x005c:
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
        L_0x0060:
            java.lang.Object r0 = kotlin.sequences.SequencesKt.firstOrNull(r0)
            com.bytedance.g.b.g r0 = (com.bytedance.g.b.g) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.b(com.ss.android.ugc.aweme.feed.model.AwemeRawAd):com.bytedance.g.b.g");
    }

    @JvmStatic
    public static final void c(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39706a, true, 32620, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39706a, true, 32620, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    com.bytedance.g.b.f fVar = omVast.vast;
                    if (fVar != null) {
                        Set<String> set = fVar.impressionSet;
                        if (set != null) {
                            Sequence asSequence = CollectionsKt.asSequence(set);
                            if (asSequence != null) {
                                Sequence<String> filter = SequencesKt.filter(asSequence, s.INSTANCE);
                                if (filter != null) {
                                    for (String str : filter) {
                                        Intrinsics.checkExpressionValueIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
                                        z.a(str, new r(aweme2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @JvmStatic
    public static final boolean e(@Nullable Aweme aweme) {
        OmVast omVast;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39706a, true, 32624, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39706a, true, 32624, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                omVast = awemeRawAd.getOmVast();
            } else {
                omVast = null;
            }
            if (omVast == null || (k(aweme) != null && !b())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean f(@Nullable Aweme aweme) {
        OmVast omVast;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39706a, true, 32625, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39706a, true, 32625, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                omVast = awemeRawAd.getOmVast();
            } else {
                omVast = null;
            }
            if (omVast == null || k(aweme) == null || b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final boolean g(@Nullable Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39706a, true, 32629, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39706a, true, 32629, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!a(aweme2, false) || !a(aweme2, 3)) {
            return false;
        } else {
            return true;
        }
    }

    @JvmStatic
    @Nullable
    public static final String i(@Nullable Aweme aweme) {
        boolean z;
        Aweme aweme2 = aweme;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39706a, true, 32636, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39706a, true, 32636, new Class[]{Aweme.class}, String.class);
        }
        if (aweme2 != null) {
            com.bytedance.g.b.g j2 = f39707b.j(aweme2);
            if (j2 != null) {
                CharSequence charSequence = j2.clickThrough;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return j2.clickThrough;
                }
                Collection collection = j2.clickTracking;
                if (collection != null && !collection.isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    return null;
                }
                Set<String> set = j2.clickTracking;
                Intrinsics.checkExpressionValueIsNotNull(set, "click.clickTracking");
                return (String) SequencesKt.firstOrNull(SequencesKt.filterNotNull(CollectionsKt.asSequence(set)));
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    private static com.bytedance.g.b.a k(@Nullable Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39706a, true, 32634, new Class[]{Aweme.class}, com.bytedance.g.b.a.class)) {
            return (com.bytedance.g.b.a) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39706a, true, 32634, new Class[]{Aweme.class}, com.bytedance.g.b.a.class);
        } else if (aweme != null && !aweme.isAd()) {
            return null;
        } else {
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null && omVast.providerType == 3) {
                    OmVast omVast2 = awemeRawAd.getOmVast();
                    if (omVast2 != null) {
                        com.bytedance.g.b.f fVar = omVast2.vast;
                        if (fVar != null) {
                            List<com.bytedance.g.b.a> list = fVar.adVerificationList;
                            if (list != null) {
                                return (com.bytedance.g.b.a) CollectionsKt.firstOrNull(list);
                            }
                        }
                    }
                    return null;
                }
            }
            if (awemeRawAd != null) {
                OmVast omVast3 = awemeRawAd.getOmVast();
                if (omVast3 != null) {
                    List<com.bytedance.g.b.a> list2 = omVast3.adVerificationList;
                    if (list2 != null) {
                        return (com.bytedance.g.b.a) CollectionsKt.firstOrNull(list2);
                    }
                }
            }
            return null;
        }
    }

    public final com.bytedance.g.b.g j(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39706a, false, 32639, new Class[]{Aweme.class}, com.bytedance.g.b.g.class)) {
            return (com.bytedance.g.b.g) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39706a, false, 32639, new Class[]{Aweme.class}, com.bytedance.g.b.g.class);
        }
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                return b(awemeRawAd);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r2 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r3 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r1 == null) goto L_0x00e6;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f39706a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 32632(0x7f78, float:4.5727E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39706a
            r13 = 1
            r14 = 32632(0x7f78, float:4.5727E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            boolean r2 = e(r17)
            if (r2 != 0) goto L_0x003e
            boolean r2 = f(r17)
            if (r2 == 0) goto L_0x0171
        L_0x003e:
            if (r0 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r17.getAwemeRawAd()
            if (r2 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.commercialize.model.OmVast r2 = r2.getOmVast()
            if (r2 == 0) goto L_0x0062
            com.bytedance.g.b.f r2 = r2.vast
            if (r2 == 0) goto L_0x0062
            java.util.List<com.bytedance.g.b.b> r2 = r2.creativeList
            if (r2 == 0) goto L_0x0062
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.Sequence r2 = kotlin.collections.CollectionsKt.asSequence(r2)
            if (r2 == 0) goto L_0x0062
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.filterNotNull(r2)
            if (r2 != 0) goto L_0x0066
        L_0x0062:
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.emptySequence()
        L_0x0066:
            if (r0 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r17.getAwemeRawAd()
            if (r3 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.commercialize.model.OmVast r3 = r3.getOmVast()
            if (r3 == 0) goto L_0x008e
            com.bytedance.g.b.f r3 = r3.vast
            if (r3 == 0) goto L_0x008e
            java.util.Set<java.lang.String> r3 = r3.impressionSet
            if (r3 == 0) goto L_0x008e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.sequences.Sequence r3 = kotlin.collections.CollectionsKt.asSequence(r3)
            if (r3 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.commercialize.utils.am$m r4 = com.ss.android.ugc.aweme.commercialize.utils.am.m.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.filter(r3, r4)
            if (r3 != 0) goto L_0x0092
        L_0x008e:
            kotlin.sequences.Sequence r3 = kotlin.sequences.SequencesKt.emptySequence()
        L_0x0092:
            com.ss.android.ugc.aweme.commercialize.utils.am$i r4 = com.ss.android.ugc.aweme.commercialize.utils.am.i.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.flatMap(r2, r4)
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.filterNotNull(r4)
            com.ss.android.ugc.aweme.commercialize.utils.am$k r5 = com.ss.android.ugc.aweme.commercialize.utils.am.k.INSTANCE
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.flatMap(r4, r5)
            com.ss.android.ugc.aweme.commercialize.utils.am$l r5 = com.ss.android.ugc.aweme.commercialize.utils.am.l.INSTANCE
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.filter(r4, r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x00b2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00c5
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.bytedance.g.b.b r6 = (com.bytedance.g.b.b) r6
            boolean r6 = r6.byWrapper
            r6 = r6 ^ r1
            if (r6 == 0) goto L_0x00b2
            goto L_0x00c6
        L_0x00c5:
            r5 = 0
        L_0x00c6:
            com.bytedance.g.b.b r5 = (com.bytedance.g.b.b) r5
            if (r5 == 0) goto L_0x00e6
            java.util.List<com.bytedance.g.b.g> r1 = r5.clickList
            if (r1 == 0) goto L_0x00e6
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.sequences.Sequence r1 = kotlin.collections.CollectionsKt.asSequence(r1)
            if (r1 == 0) goto L_0x00e6
            com.ss.android.ugc.aweme.commercialize.utils.am$j r2 = com.ss.android.ugc.aweme.commercialize.utils.am.j.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r1, r2)
            if (r1 == 0) goto L_0x00e6
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filterNotNull(r1)
            if (r1 != 0) goto L_0x00ea
        L_0x00e6:
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.emptySequence()
        L_0x00ea:
            boolean r2 = kotlin.sequences.SequencesKt.any(r3)
            if (r2 != 0) goto L_0x0117
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.String r3 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.a((java.lang.String) r3)
            java.lang.String r3 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.b((java.lang.String) r3)
            java.lang.String r3 = "error_message"
            java.lang.String r5 = "vast_imp_tracker_missing"
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r5)
            java.util.Map r3 = kotlin.collections.MapsKt.mapOf(r3)
            com.ss.android.ugc.aweme.commercialize.log.d$b r2 = r2.a((java.lang.Object) r3)
            r2.b()
        L_0x0117:
            boolean r1 = kotlin.sequences.SequencesKt.any(r1)
            if (r1 != 0) goto L_0x0144
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.String r2 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r2)
            java.lang.String r2 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r2)
            java.lang.String r2 = "error_message"
            java.lang.String r3 = "vast_clickthru_missing"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r2)
            r1.b()
        L_0x0144:
            boolean r1 = kotlin.sequences.SequencesKt.any(r4)
            if (r1 != 0) goto L_0x0171
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            java.lang.String r1 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.String) r1)
            java.lang.String r1 = "load_failed"
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.b((java.lang.String) r1)
            java.lang.String r1 = "error_message"
            java.lang.String r2 = "vast_click_tracker_missing"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            com.ss.android.ugc.aweme.commercialize.log.d$b r0 = r0.a((java.lang.Object) r1)
            r0.b()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.h(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @JvmStatic
    public static final void a(@Nullable AwemeRawAd awemeRawAd) {
        boolean z;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{awemeRawAd2}, null, f39706a, true, 32621, new Class[]{AwemeRawAd.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeRawAd2}, null, f39706a, true, 32621, new Class[]{AwemeRawAd.class}, Void.TYPE);
        } else if (awemeRawAd2 != null) {
            com.ss.android.ugc.aweme.g.a.a();
            com.bytedance.g.b.g b2 = f39707b.b(awemeRawAd2);
            if (b2 != null) {
                Collection collection = b2.clickTracking;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Set<String> set = b2.clickTracking;
                    Intrinsics.checkExpressionValueIsNotNull(set, "it.clickTracking");
                    for (String str : SequencesKt.filter(CollectionsKt.asSequence(set), q.INSTANCE)) {
                        if (com.ss.android.ugc.aweme.g.a.a()) {
                            new StringBuilder("track click(tracking): ").append(str);
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str, PushConstants.WEB_URL);
                        z.a(str, new o(awemeRawAd2));
                    }
                } else {
                    OmVast omVast = awemeRawAd.getOmVast();
                    if (omVast != null && omVast.providerType == 2) {
                        CharSequence charSequence = b2.clickThrough;
                        if (!(charSequence == null || charSequence.length() == 0)) {
                            z2 = false;
                        }
                        if (!z2) {
                            if (com.ss.android.ugc.aweme.g.a.a()) {
                                new StringBuilder("track click(through): ").append(b2.clickThrough);
                            }
                            String str2 = b2.clickThrough;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "it.clickThrough");
                            z.a(str2, new p(awemeRawAd2));
                        }
                    }
                }
            }
        }
    }

    @JvmStatic
    public static final void a(@Nullable String str, @Nullable Aweme aweme) {
        boolean z;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str, aweme2}, null, f39706a, true, 32617, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme2}, null, f39706a, true, 32617, new Class[]{String.class, Aweme.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a(SequencesKt.sequenceOf(str), aweme2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.bytedance.g.b.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.bytedance.g.b.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.bytedance.g.b.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.bytedance.g.b.c} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095 A[EDGE_INSN: B:29:0x0095->B:26:0x0095 ?: BREAK  , SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.g.b.c a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.feed.model.Aweme r19, @org.jetbrains.annotations.NotNull java.lang.String r20) {
        /*
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f39706a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<com.bytedance.g.b.c> r9 = com.bytedance.g.b.c.class
            r4 = 0
            r6 = 1
            r7 = 32615(0x7f67, float:4.5703E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0044
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f39706a
            r15 = 1
            r16 = 32615(0x7f67, float:4.5703E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.bytedance.g.b.c> r18 = com.bytedance.g.b.c.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.bytedance.g.b.c r0 = (com.bytedance.g.b.c) r0
            return r0
        L_0x0044:
            java.lang.String r2 = "name"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            r2 = 0
            if (r19 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r19.getAwemeRawAd()
            if (r0 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.commercialize.model.OmVast r0 = r0.getOmVast()
            if (r0 == 0) goto L_0x005b
            com.bytedance.g.b.f r0 = r0.vast
            goto L_0x005c
        L_0x005b:
            r0 = r2
        L_0x005c:
            if (r0 == 0) goto L_0x0077
            java.util.List<com.bytedance.g.b.b> r0 = r0.creativeList
            if (r0 == 0) goto L_0x0077
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            if (r0 == 0) goto L_0x0077
            com.ss.android.ugc.aweme.commercialize.utils.am$g r3 = new com.ss.android.ugc.aweme.commercialize.utils.am$g
            r3.<init>()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.flatMap(r0, r3)
            if (r0 != 0) goto L_0x007b
        L_0x0077:
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.emptySequence()
        L_0x007b:
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.bytedance.g.b.c r4 = (com.bytedance.g.b.c) r4
            java.lang.String r4 = r4.program
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
            if (r4 == 0) goto L_0x007f
            r2 = r3
        L_0x0095:
            com.bytedance.g.b.c r2 = (com.bytedance.g.b.c) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):com.bytedance.g.b.c");
    }

    @JvmStatic
    private static final void a(Sequence<String> sequence, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{sequence, aweme}, null, f39706a, true, 32616, new Class[]{Sequence.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sequence, aweme}, null, f39706a, true, 32616, new Class[]{Sequence.class, Aweme.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) null, (Collection<String>) SequencesKt.toMutableList(SequencesKt.map(SequencesKt.filterNotNull(sequence), n.INSTANCE)), false);
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@Nullable Aweme aweme, @Nullable Executor executor, @Nullable Runnable runnable, boolean z) {
        String str;
        Aweme aweme2 = aweme;
        Executor executor2 = executor;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{aweme2, executor2, runnable2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f39706a, true, 32606, new Class[]{Aweme.class, Executor.class, Runnable.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, executor2, runnable2, Byte.valueOf(z)}, null, f39706a, true, 32606, new Class[]{Aweme.class, Executor.class, Runnable.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (aweme2 != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                OmVast omVast = awemeRawAd.getOmVast();
                if (omVast != null) {
                    omVast.loading = true;
                }
            }
        }
        if (com.ss.android.ugc.aweme.g.a.a()) {
            StringBuilder sb = new StringBuilder("enter loading ");
            if (aweme2 != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            sb.append(str);
        }
        f39707b.b(aweme2, executor2, new h(aweme2, runnable2), z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:50|51|52|53|(1:55)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x0133 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x020b A[Catch:{ Exception -> 0x0345, all -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0279 A[Catch:{ Exception -> 0x0345, all -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0139 A[Catch:{ all -> 0x0151 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d9 A[Catch:{ Exception -> 0x0345, all -> 0x035d }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ef A[Catch:{ Exception -> 0x0345, all -> 0x035d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(com.ss.android.ugc.aweme.feed.model.Aweme r18, java.util.concurrent.Executor r19, java.lang.Runnable r20, boolean r21) {
        /*
            r17 = this;
            r0 = r18
            r9 = r19
            r1 = 4
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r3 = 0
            r10[r3] = r0
            r4 = 1
            r10[r4] = r9
            r5 = 2
            r10[r5] = r20
            java.lang.Byte r6 = java.lang.Byte.valueOf(r21)
            r7 = 3
            r10[r7] = r6
            com.meituan.robust.ChangeQuickRedirect r12 = f39706a
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r6 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r15[r3] = r6
            java.lang.Class<java.util.concurrent.Executor> r6 = java.util.concurrent.Executor.class
            r15[r4] = r6
            java.lang.Class<java.lang.Runnable> r6 = java.lang.Runnable.class
            r15[r5] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r15[r7] = r6
            java.lang.Class r16 = java.lang.Void.TYPE
            r13 = 0
            r14 = 32610(0x7f62, float:4.5696E-41)
            r11 = r17
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x0065
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r3] = r0
            r8[r4] = r9
            r8[r5] = r20
            java.lang.Byte r0 = java.lang.Byte.valueOf(r21)
            r8[r7] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = f39706a
            r11 = 0
            r12 = 32610(0x7f62, float:4.5696E-41)
            java.lang.Class[] r13 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r13[r3] = r0
            java.lang.Class<java.util.concurrent.Executor> r0 = java.util.concurrent.Executor.class
            r13[r4] = r0
            java.lang.Class<java.lang.Runnable> r0 = java.lang.Runnable.class
            r13[r5] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r13[r7] = r0
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0065:
            r1 = 0
            if (r0 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r18.getAwemeRawAd()
            if (r6 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.commercialize.model.OmVast r6 = r6.getOmVast()
            r8 = r6
            goto L_0x0075
        L_0x0074:
            r8 = r1
        L_0x0075:
            if (r8 != 0) goto L_0x007b
            r20.run()
            return
        L_0x007b:
            java.util.List<com.bytedance.g.b.a> r6 = r8.adVerificationList
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L_0x008a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r6 = 0
            goto L_0x008b
        L_0x008a:
            r6 = 1
        L_0x008b:
            if (r6 == 0) goto L_0x00c4
            java.lang.String r6 = r8.vastContent
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x009c
            int r6 = r6.length()
            if (r6 != 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r6 = 0
            goto L_0x009d
        L_0x009c:
            r6 = 1
        L_0x009d:
            if (r6 == 0) goto L_0x00c4
            int r6 = r8.providerType
            if (r6 != r5) goto L_0x00c4
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r18.getAwemeRawAd()
            if (r3 == 0) goto L_0x00ac
            r3.setOmVast(r1)
        L_0x00ac:
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()
            if (r1 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "remove empty vast structure: "
            r1.<init>(r3)
            java.lang.String r0 = r18.getDesc()
            r1.append(r0)
        L_0x00c0:
            r20.run()
            return
        L_0x00c4:
            if (r21 == 0) goto L_0x00c8
            r10 = 0
            goto L_0x00cb
        L_0x00c8:
            int r6 = r8.vastWrapperCount
            r10 = r6
        L_0x00cb:
            long r11 = r17.a()
            r8.loaded = r3
            int r6 = r8.providerType
            if (r6 != r5) goto L_0x0169
            if (r9 != 0) goto L_0x0156
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = com.ss.android.ugc.aweme.commercialize.log.d.a()     // Catch:{ all -> 0x0151 }
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.String) r5)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "parse_vast"
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.b((java.lang.String) r5)     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = "duration"
            com.ss.android.ugc.aweme.commercialize.utils.am r6 = f39707b     // Catch:{ all -> 0x0151 }
            long r6 = r6.a()     // Catch:{ all -> 0x0151 }
            r9 = 0
            long r6 = r6 - r11
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0151 }
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r6)     // Catch:{ all -> 0x0151 }
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r5)     // Catch:{ all -> 0x0151 }
            com.ss.android.ugc.aweme.commercialize.log.d$b r1 = r1.a((java.lang.Object) r5)     // Catch:{ all -> 0x0151 }
            r1.b()     // Catch:{ all -> 0x0151 }
            r8.loaded = r4     // Catch:{ all -> 0x0151 }
            com.bytedance.g.b.f r1 = new com.bytedance.g.b.f     // Catch:{ all -> 0x0151 }
            r1.<init>()     // Catch:{ all -> 0x0151 }
            r8.vast = r1     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r8.vastUrl     // Catch:{ all -> 0x0151 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x011d
            int r1 = r1.length()     // Catch:{ all -> 0x0151 }
            if (r1 != 0) goto L_0x011e
        L_0x011d:
            r3 = 1
        L_0x011e:
            if (r3 != 0) goto L_0x0147
            com.bytedance.g.b.f r1 = r8.vast     // Catch:{ Exception -> 0x0133 }
            java.lang.String r3 = r8.vastUrl     // Catch:{ Exception -> 0x0133 }
            com.ss.android.ugc.aweme.commercialize.utils.am$a r4 = com.ss.android.ugc.aweme.commercialize.utils.am.a.f39711b     // Catch:{ Exception -> 0x0133 }
            com.bytedance.g.b r4 = (com.bytedance.g.b) r4     // Catch:{ Exception -> 0x0133 }
            com.ss.android.ugc.aweme.commercialize.utils.am$b r5 = new com.ss.android.ugc.aweme.commercialize.utils.am$b     // Catch:{ Exception -> 0x0133 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0133 }
            com.bytedance.g.c r5 = (com.bytedance.g.c) r5     // Catch:{ Exception -> 0x0133 }
            r1.parseUri(r3, r10, r4, r5)     // Catch:{ Exception -> 0x0133 }
            goto L_0x0147
        L_0x0133:
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()     // Catch:{ all -> 0x0151 }
            if (r1 == 0) goto L_0x0147
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = "parse uri failed: "
            r1.<init>(r3)     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = r18.getDesc()     // Catch:{ all -> 0x0151 }
            r1.append(r3)     // Catch:{ all -> 0x0151 }
        L_0x0147:
            com.ss.android.ugc.aweme.commercialize.utils.am r1 = f39707b     // Catch:{ all -> 0x0151 }
            r1.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0)     // Catch:{ all -> 0x0151 }
            r20.run()
            goto L_0x037b
        L_0x0151:
            r0 = move-exception
            r20.run()
            throw r0
        L_0x0156:
            com.ss.android.ugc.aweme.commercialize.utils.am$d r13 = new com.ss.android.ugc.aweme.commercialize.utils.am$d
            r1 = r13
            r2 = r20
            r3 = r18
            r4 = r11
            r6 = r8
            r7 = r10
            r1.<init>(r2, r3, r4, r6, r7)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            r9.execute(r13)
            return
        L_0x0169:
            int r5 = r8.providerType
            if (r5 != r7) goto L_0x0375
            java.lang.String r5 = r8.vastContent
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x017c
            int r5 = r5.length()
            if (r5 != 0) goto L_0x017a
            goto L_0x017c
        L_0x017a:
            r5 = 0
            goto L_0x017d
        L_0x017c:
            r5 = 1
        L_0x017d:
            if (r5 != 0) goto L_0x0375
            com.bytedance.g.b.f r6 = new com.bytedance.g.b.f
            r6.<init>()
            if (r9 != 0) goto L_0x0362
            com.ss.android.ugc.aweme.commercialize.log.d$b r5 = com.ss.android.ugc.aweme.commercialize.log.d.a()     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.commercialize.log.d$b r5 = r5.b((com.ss.android.ugc.aweme.feed.model.Aweme) r0)     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "draw_ad"
            com.ss.android.ugc.aweme.commercialize.log.d$b r5 = r5.a((java.lang.String) r7)     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "parse_vast"
            com.ss.android.ugc.aweme.commercialize.log.d$b r5 = r5.b((java.lang.String) r7)     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "duration"
            com.ss.android.ugc.aweme.commercialize.utils.am r9 = f39707b     // Catch:{ all -> 0x035d }
            long r13 = r9.a()     // Catch:{ all -> 0x035d }
            r9 = 0
            long r13 = r13 - r11
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x035d }
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r9)     // Catch:{ all -> 0x035d }
            java.util.Map r7 = kotlin.collections.MapsKt.mapOf(r7)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.commercialize.log.d$b r5 = r5.a((java.lang.Object) r7)     // Catch:{ all -> 0x035d }
            r5.b()     // Catch:{ all -> 0x035d }
            java.lang.String r5 = r8.vastContent     // Catch:{ Exception -> 0x0345 }
            com.ss.android.ugc.aweme.commercialize.utils.am$a r7 = com.ss.android.ugc.aweme.commercialize.utils.am.a.f39711b     // Catch:{ Exception -> 0x0345 }
            com.bytedance.g.b r7 = (com.bytedance.g.b) r7     // Catch:{ Exception -> 0x0345 }
            com.ss.android.ugc.aweme.commercialize.utils.am$b r9 = new com.ss.android.ugc.aweme.commercialize.utils.am$b     // Catch:{ Exception -> 0x0345 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0345 }
            com.bytedance.g.c r9 = (com.bytedance.g.c) r9     // Catch:{ Exception -> 0x0345 }
            r6.parseContent(r5, r10, r7, r9)     // Catch:{ Exception -> 0x0345 }
            java.lang.String r5 = r6.adTitle     // Catch:{ all -> 0x035d }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x01d6
            int r5 = r5.length()     // Catch:{ all -> 0x035d }
            if (r5 != 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r5 = 0
            goto L_0x01d7
        L_0x01d6:
            r5 = 1
        L_0x01d7:
            if (r5 == 0) goto L_0x01ef
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()     // Catch:{ all -> 0x035d }
            if (r1 == 0) goto L_0x0359
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035d }
            java.lang.String r3 = "empty title: "
            r1.<init>(r3)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = r18.getAid()     // Catch:{ all -> 0x035d }
            r1.append(r0)     // Catch:{ all -> 0x035d }
            goto L_0x0359
        L_0x01ef:
            r8.vast = r6     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.commercialize.utils.am r5 = f39707b     // Catch:{ all -> 0x035d }
            com.bytedance.g.b.g r5 = r5.j(r0)     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0216
            java.lang.String r7 = r5.clickThrough     // Catch:{ all -> 0x035d }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x035d }
            if (r7 == 0) goto L_0x0208
            int r7 = r7.length()     // Catch:{ all -> 0x035d }
            if (r7 != 0) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r7 = 0
            goto L_0x0209
        L_0x0208:
            r7 = 1
        L_0x0209:
            if (r7 != 0) goto L_0x0216
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r18.getAwemeRawAd()     // Catch:{ all -> 0x035d }
            if (r7 == 0) goto L_0x0216
            java.lang.String r5 = r5.clickThrough     // Catch:{ all -> 0x035d }
            r7.setWebUrl(r5)     // Catch:{ all -> 0x035d }
        L_0x0216:
            java.util.List<com.bytedance.g.b.b> r5 = r6.creativeList     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0359
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x035d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x035d }
        L_0x0220:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x035d }
            if (r6 == 0) goto L_0x0239
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x035d }
            r7 = r6
            com.bytedance.g.b.b r7 = (com.bytedance.g.b.b) r7     // Catch:{ all -> 0x035d }
            if (r7 == 0) goto L_0x0235
            boolean r7 = r7.byWrapper     // Catch:{ all -> 0x035d }
            if (r7 != 0) goto L_0x0235
            r7 = 1
            goto L_0x0236
        L_0x0235:
            r7 = 0
        L_0x0236:
            if (r7 == 0) goto L_0x0220
            goto L_0x023a
        L_0x0239:
            r6 = r1
        L_0x023a:
            com.bytedance.g.b.b r6 = (com.bytedance.g.b.b) r6     // Catch:{ all -> 0x035d }
            if (r6 != 0) goto L_0x0240
            goto L_0x0359
        L_0x0240:
            long r9 = r6.getDurationInMs()     // Catch:{ all -> 0x035d }
            double r9 = (double) r9     // Catch:{ all -> 0x035d }
            java.util.List<com.bytedance.g.b.d> r5 = r6.mediaFileList     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0268
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ all -> 0x035d }
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0268
            com.ss.android.ugc.aweme.commercialize.utils.am$f r7 = new com.ss.android.ugc.aweme.commercialize.utils.am$f     // Catch:{ all -> 0x035d }
            r7.<init>(r9)     // Catch:{ all -> 0x035d }
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7     // Catch:{ all -> 0x035d }
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.map(r5, r7)     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0268
            kotlin.sequences.Sequence r5 = kotlin.sequences.SequencesKt.filterNotNull(r5)     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0268
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r5)     // Catch:{ all -> 0x035d }
        L_0x0268:
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0276
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x035d }
            if (r5 == 0) goto L_0x0274
            goto L_0x0276
        L_0x0274:
            r5 = 0
            goto L_0x0277
        L_0x0276:
            r5 = 1
        L_0x0277:
            if (r5 != 0) goto L_0x0359
            com.ss.android.ugc.aweme.feed.model.Video r5 = r18.getVideo()     // Catch:{ all -> 0x035d }
            if (r5 != 0) goto L_0x0287
            com.ss.android.ugc.aweme.feed.model.Video r5 = new com.ss.android.ugc.aweme.feed.model.Video     // Catch:{ all -> 0x035d }
            r5.<init>()     // Catch:{ all -> 0x035d }
            r0.setVideo(r5)     // Catch:{ all -> 0x035d }
        L_0x0287:
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.feed.model.BitRate r3 = (com.ss.android.ugc.aweme.feed.model.BitRate) r3     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getPlayAddr()     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.feed.model.Video r5 = r18.getVideo()     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r7)     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "url"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r7)     // Catch:{ all -> 0x035d }
            int r7 = r3.getWidth()     // Catch:{ all -> 0x035d }
            r5.setWidth(r7)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.feed.model.Video r5 = r18.getVideo()     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r7)     // Catch:{ all -> 0x035d }
            int r7 = r3.getHeight()     // Catch:{ all -> 0x035d }
            r5.setHeight(r7)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.feed.model.Video r5 = r18.getVideo()     // Catch:{ all -> 0x035d }
            java.lang.String r7 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r7)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r7 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel     // Catch:{ all -> 0x035d }
            r7.<init>()     // Catch:{ all -> 0x035d }
            int r9 = r3.getWidth()     // Catch:{ all -> 0x035d }
            r7.setWidth(r9)     // Catch:{ all -> 0x035d }
            int r9 = r3.getHeight()     // Catch:{ all -> 0x035d }
            r7.setHeight(r9)     // Catch:{ all -> 0x035d }
            java.lang.String r9 = r3.getUri()     // Catch:{ all -> 0x035d }
            r7.setUri(r9)     // Catch:{ all -> 0x035d }
            java.lang.String r9 = r3.getUrlKey()     // Catch:{ all -> 0x035d }
            r7.setUrlKey(r9)     // Catch:{ all -> 0x035d }
            java.util.List r3 = r3.getUrlList()     // Catch:{ all -> 0x035d }
            r7.setUrlList(r3)     // Catch:{ all -> 0x035d }
            long r9 = r6.getDurationInMs()     // Catch:{ all -> 0x035d }
            double r9 = (double) r9     // Catch:{ all -> 0x035d }
            r7.setDuration(r9)     // Catch:{ all -> 0x035d }
            r5.setPlayAddr(r7)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r3 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ all -> 0x035d }
            java.lang.String r5 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)     // Catch:{ all -> 0x035d }
            java.lang.Boolean r3 = r3.bv()     // Catch:{ all -> 0x035d }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x035d }
            if (r3 != 0) goto L_0x0311
            com.ss.android.ugc.aweme.feed.model.Video r3 = r18.getVideo()     // Catch:{ all -> 0x035d }
            java.lang.String r5 = "aweme.video"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)     // Catch:{ all -> 0x035d }
            r3.setBitRate(r1)     // Catch:{ all -> 0x035d }
        L_0x0311:
            com.bytedance.g.b.f r1 = r8.vast     // Catch:{ all -> 0x035d }
            java.lang.String r1 = r1.adTitle     // Catch:{ all -> 0x035d }
            r0.setTitle(r1)     // Catch:{ all -> 0x035d }
            com.bytedance.g.b.f r1 = r8.vast     // Catch:{ all -> 0x035d }
            java.lang.String r1 = r1.description     // Catch:{ all -> 0x035d }
            r0.setDesc(r1)     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.commercialize.utils.am r1 = f39707b     // Catch:{ all -> 0x035d }
            com.bytedance.g.b.g r1 = r1.j(r0)     // Catch:{ all -> 0x035d }
            if (r1 == 0) goto L_0x033d
            java.lang.String r1 = r1.clickThrough     // Catch:{ all -> 0x035d }
            if (r1 == 0) goto L_0x033d
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x035d }
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)     // Catch:{ all -> 0x035d }
            if (r3 != 0) goto L_0x033d
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r18.getAwemeRawAd()     // Catch:{ all -> 0x035d }
            if (r3 == 0) goto L_0x033d
            r3.setWebUrl(r1)     // Catch:{ all -> 0x035d }
        L_0x033d:
            r8.loaded = r4     // Catch:{ all -> 0x035d }
            com.ss.android.ugc.aweme.commercialize.utils.am r1 = f39707b     // Catch:{ all -> 0x035d }
            r1.a((com.ss.android.ugc.aweme.feed.model.Aweme) r0)     // Catch:{ all -> 0x035d }
            goto L_0x0359
        L_0x0345:
            boolean r1 = com.ss.android.ugc.aweme.g.a.a()     // Catch:{ all -> 0x035d }
            if (r1 == 0) goto L_0x0359
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035d }
            java.lang.String r3 = "parse content failed: "
            r1.<init>(r3)     // Catch:{ all -> 0x035d }
            java.lang.String r0 = r18.getAid()     // Catch:{ all -> 0x035d }
            r1.append(r0)     // Catch:{ all -> 0x035d }
        L_0x0359:
            r20.run()
            goto L_0x037b
        L_0x035d:
            r0 = move-exception
            r20.run()
            throw r0
        L_0x0362:
            com.ss.android.ugc.aweme.commercialize.utils.am$e r13 = new com.ss.android.ugc.aweme.commercialize.utils.am$e
            r1 = r13
            r2 = r20
            r3 = r18
            r4 = r11
            r7 = r8
            r8 = r10
            r1.<init>(r2, r3, r4, r6, r7, r8)
            java.lang.Runnable r13 = (java.lang.Runnable) r13
            r9.execute(r13)
            return
        L_0x0375:
            r17.a((com.ss.android.ugc.aweme.feed.model.Aweme) r18)
            r20.run()
        L_0x037b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.am.b(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.concurrent.Executor, java.lang.Runnable, boolean):void");
    }

    public static /* synthetic */ void a(Aweme aweme, Executor executor, Runnable runnable, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            executor = null;
        }
        a(aweme, executor, null, false);
    }
}
