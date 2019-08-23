package com.bytedance.g;

import java.util.Comparator;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\nJ\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\u0018\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010(\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\"\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010-\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010/\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0018\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0012\u001a\u00020\nJ\u0010\u00102\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0011H\u0002J\u0010\u00106\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u00107\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, d2 = {"Lcom/bytedance/vast/VastParser;", "", "vast", "Lcom/bytedance/vast/model/Vast;", "fetcher", "Lcom/bytedance/vast/UriFetcher;", "listener", "Lcom/bytedance/vast/VastParseListener;", "(Lcom/bytedance/vast/model/Vast;Lcom/bytedance/vast/UriFetcher;Lcom/bytedance/vast/VastParseListener;)V", "depth", "", "xpath", "Ljavax/xml/xpath/XPath;", "kotlin.jvm.PlatformType", "chainWrapper", "", "wrapperNode", "Lorg/w3c/dom/Node;", "wrapper", "parseAdContent", "", "adContentNode", "parseAdSystem", "inLineNode", "parseAdTitle", "parseAdVerification", "parseContent", "content", "", "parseCreative", "adContent", "byWrapper", "parseCreativeClickTroughOrTracking", "creativeNode", "creative", "Lcom/bytedance/vast/model/Creative;", "parseCreativeDuration", "parseCreativeIcon", "parseCreativeId", "parseCreativeMediaFile", "parseCreativeTrackingEvents", "parseDescription", "parseDoc", "doc", "Lorg/w3c/dom/Document;", "parseError", "parseImpression", "parseInLine", "parseUri", "uri", "parseVersion", "parseVideoClick", "Lcom/bytedance/vast/model/VideoClick;", "node", "parseViewableImpression", "parseWrapper"}, k = 1, mv = {1, 1, 13})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final XPath f20178a;

    /* renamed from: b  reason: collision with root package name */
    private int f20179b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.g.b.f f20180c;

    /* renamed from: d  reason: collision with root package name */
    private final b f20181d;

    /* renamed from: e  reason: collision with root package name */
    private final c f20182e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 13})
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bytedance.g.b.b) t).byWrapper ? 1 : 0), Integer.valueOf(((com.bytedance.g.b.b) t2).byWrapper ? 1 : 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 13})
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bytedance.g.b.b) t).byWrapper ? 1 : 0), Integer.valueOf(((com.bytedance.g.b.b) t2).byWrapper ? 1 : 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 13})
    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bytedance.g.b.b) t).byWrapper ? 1 : 0), Integer.valueOf(((com.bytedance.g.b.b) t2).byWrapper ? 1 : 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/bytedance/vast/model/VideoClick;", "p1", "Lorg/w3c/dom/Node;", "Lkotlin/ParameterName;", "name", "node", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.g.d$d  reason: collision with other inner class name */
    static final class C0178d extends FunctionReference implements Function1<Node, com.bytedance.g.b.g> {
        C0178d(d dVar) {
            super(1, dVar);
        }

        public final String getName() {
            return "parseVideoClick";
        }

        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(d.class);
        }

        public final String getSignature() {
            return "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/vast/model/VideoClick;";
        }

        @NotNull
        public final com.bytedance.g.b.g invoke(@NotNull Node node) {
            Intrinsics.checkParameterIsNotNull(node, "p1");
            return ((d) this.receiver).a(node);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 13})
    public static final class e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bytedance.g.b.b) t).byWrapper ? 1 : 0), Integer.valueOf(((com.bytedance.g.b.b) t2).byWrapper ? 1 : 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 13})
    public static final class f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bytedance.g.b.b) t).byWrapper ? 1 : 0), Integer.valueOf(((com.bytedance.g.b.b) t2).byWrapper ? 1 : 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 13})
    public static final class g<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((com.bytedance.g.b.b) t).byWrapper ? 1 : 0), Integer.valueOf(((com.bytedance.g.b.b) t2).byWrapper ? 1 : 0));
        }
    }

    @JvmOverloads
    public d(@NotNull com.bytedance.g.b.f fVar) {
        this(fVar, null, null, 6);
    }

    @JvmOverloads
    public d(@NotNull com.bytedance.g.b.f fVar, @Nullable b bVar) {
        this(fVar, bVar, null, 4);
    }

    private final void b(Node node) {
        c(node);
        d(node);
        e(node);
        f(node);
    }

    private final void c(Node node) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath, (Object) node, "./Error");
        XPath xPath2 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
        for (String a3 : com.bytedance.g.c.b.a(a2, xPath2, true, true)) {
            this.f20180c.errorSet = com.bytedance.g.c.a.a(this.f20180c.errorSet, a3);
        }
    }

    private final void d(Node node) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath, (Object) node, "./Impression");
        XPath xPath2 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
        for (String a3 : com.bytedance.g.c.b.a(a2, xPath2, true, true)) {
            this.f20180c.impressionSet = com.bytedance.g.c.a.a(this.f20180c.impressionSet, a3);
        }
    }

    private final void e(Node node) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath, (Object) node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification")) {
            com.bytedance.g.b.a aVar = new com.bytedance.g.b.a();
            String evaluate = this.f20178a.evaluate("./@vendor", node2);
            Intrinsics.checkExpressionValueIsNotNull(evaluate, "xpath.evaluate(\"./@vendor\", verificationNode)");
            if (evaluate != null) {
                aVar.vender = StringsKt.trim((CharSequence) evaluate).toString();
                String evaluate2 = this.f20178a.evaluate("./JavaScriptResource/text()", node2);
                Intrinsics.checkExpressionValueIsNotNull(evaluate2, "xpath.evaluate(\"./JavaSc…ext()\", verificationNode)");
                if (evaluate2 != null) {
                    aVar.javascriptResource = StringsKt.trim((CharSequence) evaluate2).toString();
                    String evaluate3 = this.f20178a.evaluate("./verificationParameters/text()", node2);
                    Intrinsics.checkExpressionValueIsNotNull(evaluate3, "xpath.evaluate(\"./verifi…ext()\", verificationNode)");
                    if (evaluate3 != null) {
                        aVar.verificationParameters = StringsKt.trim((CharSequence) evaluate3).toString();
                        this.f20180c.adVerificationList = com.bytedance.g.c.a.a(this.f20180c.adVerificationList, aVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    private final void f(Node node) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath, (Object) node, "./ViewableImpression")) {
            XPath xPath2 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
            Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath2, (Object) node2, "./Viewable");
            XPath xPath3 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath3, "xpath");
            for (String a3 : com.bytedance.g.c.b.a(a2, xPath3, true, true)) {
                this.f20180c.viewableSet = com.bytedance.g.c.a.a(this.f20180c.viewableSet, a3);
            }
            XPath xPath4 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath4, "xpath");
            Sequence<Node> a4 = com.bytedance.g.c.b.a(xPath4, (Object) node2, "./NotViewable");
            XPath xPath5 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath5, "xpath");
            for (String a5 : com.bytedance.g.c.b.a(a4, xPath5, true, true)) {
                this.f20180c.notViewableSet = com.bytedance.g.c.a.a(this.f20180c.notViewableSet, a5);
            }
            XPath xPath6 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath6, "xpath");
            Sequence<Node> a6 = com.bytedance.g.c.b.a(xPath6, (Object) node2, "./ViewUndetermined");
            XPath xPath7 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath7, "xpath");
            for (String a7 : com.bytedance.g.c.b.a(a6, xPath7, true, true)) {
                this.f20180c.viewUndeterminedSet = com.bytedance.g.c.a.a(this.f20180c.viewUndeterminedSet, a7);
            }
        }
    }

    public final com.bytedance.g.b.g a(Node node) {
        com.bytedance.g.b.g gVar = new com.bytedance.g.b.g();
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        gVar.clickThrough = com.bytedance.g.c.b.b(xPath, node, SequencesKt.sequenceOf("./ClickThrough", "./IconClickThrough"));
        XPath xPath2 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
        Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath2, (Object) node, SequencesKt.sequenceOf("./ClickTracking", "./IconClickTracking"));
        XPath xPath3 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath3, "xpath");
        for (String a3 : com.bytedance.g.c.b.a(a2, xPath3, true, true)) {
            gVar.clickTracking = com.bytedance.g.c.a.a(gVar.clickTracking, a3);
        }
        return gVar;
    }

    private final void b(Node node, com.bytedance.g.b.b bVar) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        bVar.duration = com.bytedance.g.c.b.a(xPath, (Object) node, "./Linear/Duration");
    }

    private final void a(Node node, com.bytedance.g.b.b bVar) {
        String evaluate = this.f20178a.evaluate("./@id", node);
        Intrinsics.checkExpressionValueIsNotNull(evaluate, "xpath.evaluate(\"./@id\", creativeNode)");
        if (evaluate != null) {
            bVar.id = StringsKt.trim((CharSequence) evaluate).toString();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    private final void a(Node node, boolean z) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath, (Object) node, "./Creatives/Creative")) {
            com.bytedance.g.b.b bVar = new com.bytedance.g.b.b();
            bVar.byWrapper = z;
            a(node2, bVar);
            b(node2, bVar);
            c(node2, bVar);
            d(node2, bVar);
            e(node2, bVar);
            f(node2, bVar);
            if (z) {
                this.f20180c.creativeList = com.bytedance.g.c.a.b(this.f20180c.creativeList, bVar);
            } else {
                this.f20180c.creativeList = com.bytedance.g.c.a.a(this.f20180c.creativeList, bVar);
            }
        }
    }

    private final void d(Node node, com.bytedance.g.b.b bVar) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (com.bytedance.g.b.g a2 : SequencesKt.map(com.bytedance.g.c.b.a(xPath, (Object) node, "./Linear/VideoClicks"), new C0178d(this))) {
            bVar.clickList = com.bytedance.g.c.a.a(bVar.clickList, a2);
        }
    }

    private final void c(Node node, com.bytedance.g.b.b bVar) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath, (Object) node, "./Linear/TrackingEvents/Tracking")) {
            com.bytedance.g.b.e eVar = new com.bytedance.g.b.e();
            String evaluate = this.f20178a.evaluate("./@event", node2);
            Intrinsics.checkExpressionValueIsNotNull(evaluate, "xpath.evaluate(\"./@event\", it)");
            if (evaluate != null) {
                eVar.name = StringsKt.trim((CharSequence) evaluate).toString();
                String evaluate2 = this.f20178a.evaluate("./@offset", node2);
                Intrinsics.checkExpressionValueIsNotNull(evaluate2, "xpath.evaluate(\"./@offset\", it)");
                if (evaluate2 != null) {
                    eVar.offset = StringsKt.trim((CharSequence) evaluate2).toString();
                    String evaluate3 = this.f20178a.evaluate("./text()", node2);
                    Intrinsics.checkExpressionValueIsNotNull(evaluate3, "xpath.evaluate(\"./text()\", it)");
                    if (evaluate3 != null) {
                        eVar.url = StringsKt.trim((CharSequence) evaluate3).toString();
                        bVar.trackingEventList = com.bytedance.g.c.a.a(bVar.trackingEventList, eVar);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public final boolean b(@Nullable String str, int i) {
        c cVar = this.f20182e;
        if (cVar != null) {
            cVar.b(str, i);
        }
        this.f20179b++;
        Document document = null;
        if (str != null) {
            try {
                document = com.bytedance.g.c.b.b(str);
            } catch (com.bytedance.g.a.b e2) {
                c cVar2 = this.f20182e;
                if (cVar2 != null) {
                    cVar2.a(e2);
                }
            } catch (Throwable th) {
                c cVar3 = this.f20182e;
                if (cVar3 != null) {
                    cVar3.b();
                }
                this.f20179b--;
                if (this.f20179b == 0) {
                    List<com.bytedance.g.b.b> list = this.f20180c.creativeList;
                    if (list != null && list.size() > 1) {
                        CollectionsKt.sortWith(list, new c());
                    }
                }
                throw th;
            }
        }
        if (document == null) {
            c cVar4 = this.f20182e;
            if (cVar4 != null) {
                cVar4.b();
            }
            this.f20179b--;
            if (this.f20179b == 0) {
                List<com.bytedance.g.b.b> list2 = this.f20180c.creativeList;
                if (list2 != null && list2.size() > 1) {
                    CollectionsKt.sortWith(list2, new a());
                }
            }
            return false;
        }
        boolean a2 = a(document, i, 0);
        c cVar5 = this.f20182e;
        if (cVar5 != null) {
            cVar5.b();
        }
        this.f20179b--;
        if (this.f20179b == 0) {
            List<com.bytedance.g.b.b> list3 = this.f20180c.creativeList;
            if (list3 != null && list3.size() > 1) {
                CollectionsKt.sortWith(list3, new b());
            }
        }
        return a2;
    }

    private final void e(Node node, com.bytedance.g.b.b bVar) {
        boolean z;
        boolean z2;
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath, (Object) node, "./Linear/MediaFiles/MediaFile")) {
            com.bytedance.g.b.d dVar = new com.bytedance.g.b.d();
            String evaluate = this.f20178a.evaluate("./@delivery", node2);
            Intrinsics.checkExpressionValueIsNotNull(evaluate, "xpath.evaluate(\"./@delivery\", mediaFileNode)");
            if (evaluate != null) {
                dVar.delivery = StringsKt.trim((CharSequence) evaluate).toString();
                String evaluate2 = this.f20178a.evaluate("./@type", node2);
                Intrinsics.checkExpressionValueIsNotNull(evaluate2, "xpath.evaluate(\"./@type\", mediaFileNode)");
                if (evaluate2 != null) {
                    dVar.type = StringsKt.trim((CharSequence) evaluate2).toString();
                    String evaluate3 = this.f20178a.evaluate("./text()", node2);
                    Intrinsics.checkExpressionValueIsNotNull(evaluate3, "xpath.evaluate(\"./text()\", mediaFileNode)");
                    if (evaluate3 != null) {
                        dVar.url = StringsKt.trim((CharSequence) evaluate3).toString();
                        XPath xPath2 = this.f20178a;
                        Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
                        String evaluate4 = xPath2.evaluate("./@bitrate", node2);
                        Intrinsics.checkExpressionValueIsNotNull(evaluate4, "evaluate(expr, item)");
                        if (evaluate4 != null) {
                            Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) evaluate4).toString());
                            if (intOrNull != null) {
                                dVar.bitRate = intOrNull.intValue();
                            }
                            XPath xPath3 = this.f20178a;
                            Intrinsics.checkExpressionValueIsNotNull(xPath3, "xpath");
                            String evaluate5 = xPath3.evaluate("./@width", node2);
                            Intrinsics.checkExpressionValueIsNotNull(evaluate5, "evaluate(expr, item)");
                            if (evaluate5 != null) {
                                Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) evaluate5).toString());
                                if (intOrNull2 != null) {
                                    dVar.width = intOrNull2.intValue();
                                }
                                XPath xPath4 = this.f20178a;
                                Intrinsics.checkExpressionValueIsNotNull(xPath4, "xpath");
                                String evaluate6 = xPath4.evaluate("./@height", node2);
                                Intrinsics.checkExpressionValueIsNotNull(evaluate6, "evaluate(expr, item)");
                                if (evaluate6 != null) {
                                    Integer intOrNull3 = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) evaluate6).toString());
                                    if (intOrNull3 != null) {
                                        dVar.height = intOrNull3.intValue();
                                    }
                                    XPath xPath5 = this.f20178a;
                                    Intrinsics.checkExpressionValueIsNotNull(xPath5, "xpath");
                                    String evaluate7 = xPath5.evaluate("./@scalable", node2);
                                    Intrinsics.checkExpressionValueIsNotNull(evaluate7, "evaluate(expr, item)");
                                    if (evaluate7 != null) {
                                        String obj = StringsKt.trim((CharSequence) evaluate7).toString();
                                        if (obj.length() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            dVar.scalable = Boolean.valueOf(StringsKt.equals("true", obj, true));
                                        }
                                        XPath xPath6 = this.f20178a;
                                        Intrinsics.checkExpressionValueIsNotNull(xPath6, "xpath");
                                        String evaluate8 = xPath6.evaluate("./@maintainAspectRatio", node2);
                                        Intrinsics.checkExpressionValueIsNotNull(evaluate8, "evaluate(expr, item)");
                                        if (evaluate8 != null) {
                                            String obj2 = StringsKt.trim((CharSequence) evaluate8).toString();
                                            if (obj2.length() > 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                dVar.maintainAspectRatio = Boolean.valueOf(StringsKt.equals("true", obj2, true));
                                            }
                                            bVar.mediaFileList = com.bytedance.g.c.a.a(bVar.mediaFileList, dVar);
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                                        }
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                                }
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    private final void f(Node node, com.bytedance.g.b.b bVar) {
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath, (Object) node, "./Linear/Icons/Icon")) {
            com.bytedance.g.b.c cVar = new com.bytedance.g.b.c();
            XPath xPath2 = this.f20178a;
            Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
            String evaluate = xPath2.evaluate("./@width", node2);
            Intrinsics.checkExpressionValueIsNotNull(evaluate, "evaluate(expr, item)");
            if (evaluate != null) {
                Integer intOrNull = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) evaluate).toString());
                if (intOrNull != null) {
                    cVar.width = intOrNull.intValue();
                }
                XPath xPath3 = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath3, "xpath");
                String evaluate2 = xPath3.evaluate("./@height", node2);
                Intrinsics.checkExpressionValueIsNotNull(evaluate2, "evaluate(expr, item)");
                if (evaluate2 != null) {
                    Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.trim((CharSequence) evaluate2).toString());
                    if (intOrNull2 != null) {
                        cVar.width = intOrNull2.intValue();
                    }
                    cVar.program = this.f20178a.evaluate("./@program", node2);
                    XPath xPath4 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath4, "xpath");
                    Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath4, (Object) node2, "./StaticResource");
                    XPath xPath5 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath5, "xpath");
                    cVar.staticResource = (String) SequencesKt.firstOrNull(com.bytedance.g.c.b.a(a2, xPath5, true, true));
                    XPath xPath6 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath6, "xpath");
                    Sequence<Node> a3 = com.bytedance.g.c.b.a(xPath6, (Object) node2, "./HTMLResource");
                    XPath xPath7 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath7, "xpath");
                    cVar.htmlResource = (String) SequencesKt.firstOrNull(com.bytedance.g.c.b.a(a3, xPath7, true, true));
                    XPath xPath8 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath8, "xpath");
                    Sequence<Node> a4 = com.bytedance.g.c.b.a(xPath8, (Object) node2, "./IFrameResource");
                    XPath xPath9 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath9, "xpath");
                    cVar.iFrameResource = (String) SequencesKt.firstOrNull(com.bytedance.g.c.b.a(a4, xPath9, true, true));
                    XPath xPath10 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath10, "xpath");
                    Sequence<Node> a5 = com.bytedance.g.c.b.a(xPath10, (Object) node2, "./IconViewTracking");
                    XPath xPath11 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath11, "xpath");
                    cVar.viewTracking = (String) SequencesKt.firstOrNull(com.bytedance.g.c.b.a(a5, xPath11, true, true));
                    XPath xPath12 = this.f20178a;
                    Intrinsics.checkExpressionValueIsNotNull(xPath12, "xpath");
                    for (Node a6 : com.bytedance.g.c.b.a(xPath12, (Object) node2, "./IconClicks")) {
                        cVar.clickList = com.bytedance.g.c.a.a(cVar.clickList, a(a6));
                    }
                    bVar.iconList = com.bytedance.g.c.a.a(bVar.iconList, cVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public final boolean a(@Nullable String str, int i) {
        c cVar = this.f20182e;
        if (cVar != null) {
            cVar.a(str, i);
        }
        this.f20179b++;
        Document document = null;
        try {
            b bVar = this.f20181d;
            if (bVar == null) {
                bVar = a.f20175a;
            }
            document = bVar.a(str);
        } catch (com.bytedance.g.a.a e2) {
            c cVar2 = this.f20182e;
            if (cVar2 != null) {
                cVar2.a(e2);
            }
        } catch (com.bytedance.g.a.b e3) {
            c cVar3 = this.f20182e;
            if (cVar3 != null) {
                cVar3.a(e3);
            }
        } catch (Throwable th) {
            c cVar4 = this.f20182e;
            if (cVar4 != null) {
                cVar4.b();
            }
            this.f20179b--;
            if (this.f20179b == 0) {
                List<com.bytedance.g.b.b> list = this.f20180c.creativeList;
                if (list != null && list.size() > 1) {
                    CollectionsKt.sortWith(list, new g());
                }
            }
            throw th;
        }
        if (document == null) {
            c cVar5 = this.f20182e;
            if (cVar5 != null) {
                cVar5.b();
            }
            this.f20179b--;
            if (this.f20179b == 0) {
                List<com.bytedance.g.b.b> list2 = this.f20180c.creativeList;
                if (list2 != null && list2.size() > 1) {
                    CollectionsKt.sortWith(list2, new e());
                }
            }
            return false;
        }
        boolean a2 = a(document, i, 0);
        c cVar6 = this.f20182e;
        if (cVar6 != null) {
            cVar6.b();
        }
        this.f20179b--;
        if (this.f20179b == 0) {
            List<com.bytedance.g.b.b> list3 = this.f20180c.creativeList;
            if (list3 != null && list3.size() > 1) {
                CollectionsKt.sortWith(list3, new f());
            }
        }
        return a2;
    }

    @JvmOverloads
    public d(@NotNull com.bytedance.g.b.f fVar, @Nullable b bVar, @Nullable c cVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "vast");
        this.f20180c = fVar;
        this.f20181d = bVar;
        this.f20182e = cVar;
        this.f20178a = XPathFactory.newInstance().newXPath();
    }

    private final boolean a(Node node, int i, int i2) {
        if (i < 0) {
            c cVar = this.f20182e;
            if (cVar != null) {
                XPath xPath = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
                Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath, (Object) node, "./VASTAdTagURI");
                XPath xPath2 = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
                for (String a3 : com.bytedance.g.c.b.a(a2, xPath2, true, true)) {
                    cVar.a(a3);
                }
            }
            return false;
        }
        XPath xPath3 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath3, "xpath");
        Sequence<Node> a4 = com.bytedance.g.c.b.a(xPath3, (Object) node, "./VASTAdTagURI");
        XPath xPath4 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath4, "xpath");
        for (String str : com.bytedance.g.c.b.a(a4, xPath4, true, true)) {
            c cVar2 = this.f20182e;
            if (cVar2 != null) {
                cVar2.a(str, i);
            }
            Document document = null;
            try {
                b bVar = this.f20181d;
                if (bVar == null) {
                    bVar = a.f20175a;
                }
                document = bVar.a(str);
            } catch (com.bytedance.g.a.a e2) {
                c cVar3 = this.f20182e;
                if (cVar3 != null) {
                    cVar3.a(e2);
                }
            } catch (com.bytedance.g.a.b e3) {
                c cVar4 = this.f20182e;
                if (cVar4 != null) {
                    cVar4.a(e3);
                }
            } catch (Throwable th) {
                c cVar5 = this.f20182e;
                if (cVar5 != null) {
                    cVar5.b();
                }
                throw th;
            }
            if (document == null) {
                c cVar6 = this.f20182e;
                if (cVar6 != null) {
                    cVar6.b();
                }
                return false;
            } else if (!a(document, i, i2 + 1)) {
                c cVar7 = this.f20182e;
                if (cVar7 != null) {
                    cVar7.b();
                }
                return false;
            } else {
                c cVar8 = this.f20182e;
                if (cVar8 != null) {
                    cVar8.b();
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean a(Document document, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = i - 1;
        CharSequence charSequence = this.f20180c.version;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f20180c.version = this.f20178a.evaluate("/VAST/@version", document);
        }
        XPath xPath = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath, "xpath");
        for (Node node : com.bytedance.g.c.b.a(xPath, (Object) document, "/VAST/Ad/InLine")) {
            c cVar = this.f20182e;
            if (cVar != null) {
                cVar.a();
            }
            CharSequence charSequence2 = this.f20180c.adSystem;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                com.bytedance.g.b.f fVar = this.f20180c;
                XPath xPath2 = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath2, "xpath");
                Sequence<Node> a2 = com.bytedance.g.c.b.a(xPath2, (Object) node, "./AdSystem");
                XPath xPath3 = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath3, "xpath");
                fVar.adSystem = (String) SequencesKt.firstOrNull(com.bytedance.g.c.b.a(a2, xPath3, true, true));
            }
            CharSequence charSequence3 = this.f20180c.adTitle;
            if (charSequence3 == null || charSequence3.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                com.bytedance.g.b.f fVar2 = this.f20180c;
                XPath xPath4 = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath4, "xpath");
                Sequence<Node> a3 = com.bytedance.g.c.b.a(xPath4, (Object) node, "./AdTitle");
                XPath xPath5 = this.f20178a;
                Intrinsics.checkExpressionValueIsNotNull(xPath5, "xpath");
                fVar2.adTitle = (String) SequencesKt.firstOrNull(com.bytedance.g.c.b.a(a3, xPath5, true, true));
            }
            String evaluate = this.f20178a.evaluate("./Description/text()", node);
            Intrinsics.checkExpressionValueIsNotNull(evaluate, "xpath.evaluate(\"./Description/text()\", inLineNode)");
            if (evaluate != null) {
                String obj = StringsKt.trim((CharSequence) evaluate).toString();
                if (obj.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.f20180c.description = obj;
                }
                a(node, false);
                b(node);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        XPath xPath6 = this.f20178a;
        Intrinsics.checkExpressionValueIsNotNull(xPath6, "xpath");
        for (Node node2 : com.bytedance.g.c.b.a(xPath6, (Object) document, "/VAST/Ad/Wrapper")) {
            a(node2, true);
            b(node2);
            if (!a(node2, i3, i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    private /* synthetic */ d(com.bytedance.g.b.f fVar, b bVar, c cVar, int i) {
        this(fVar, (i & 2) != 0 ? null : bVar, null);
    }
}
