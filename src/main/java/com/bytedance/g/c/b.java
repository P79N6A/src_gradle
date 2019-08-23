package com.bytedance.g.c;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a$\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0000\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b*\b\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0011\"\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0012\u001a(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0000\u001a1\u0010\u0013\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u0016H\b\u001a1\u0010\u0017\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0016H\b\u001a\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u001a"}, d2 = {"contentToDoc", "Lorg/w3c/dom/Document;", "", "firstString", "Ljavax/xml/xpath/XPath;", "item", "", "expr", "Lkotlin/sequences/Sequence;", "mapText", "Lorg/w3c/dom/Node;", "xpath", "trim", "", "filterNotEmpty", "nodeList", "exprList", "", "(Ljavax/xml/xpath/XPath;Ljava/lang/Object;[Ljava/lang/String;)Lkotlin/sequences/Sequence;", "parseBooleanTo", "", "set", "Lkotlin/Function1;", "parseIntTo", "", "uriToDoc", "vast"}, k = 2, mv = {1, 1, 13})
public final class b {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function1<String, String> {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @NotNull
        public final String invoke(String str) {
            Intrinsics.checkExpressionValueIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            if (str != null) {
                return StringsKt.trim((CharSequence) str).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.bytedance.g.c.b$b  reason: collision with other inner class name */
    static final class C0177b extends Lambda implements Function1<String, Boolean> {
        public static final C0177b INSTANCE = new C0177b();

        C0177b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((String) obj));
        }

        public final boolean invoke(String str) {
            Intrinsics.checkExpressionValueIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            if (str.length() > 0) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lorg/w3c/dom/Node;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function1<Node, String> {
        final /* synthetic */ XPath $xpath;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(XPath xPath) {
            super(1);
            this.$xpath = xPath;
        }

        public final String invoke(@NotNull Node node) {
            Intrinsics.checkParameterIsNotNull(node, AdvanceSetting.NETWORK_TYPE);
            return this.$xpath.evaluate("./text()", node);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "Lorg/w3c/dom/Node;", "expr", "", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function1<String, Sequence<? extends Node>> {
        final /* synthetic */ Object $item;
        final /* synthetic */ XPath $this_nodeList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(XPath xPath, Object obj) {
            super(1);
            this.$this_nodeList = xPath;
            this.$item = obj;
        }

        @NotNull
        public final Sequence<Node> invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "expr");
            Object evaluate = this.$this_nodeList.evaluate(str, this.$item, XPathConstants.NODESET);
            if (!(evaluate instanceof NodeList)) {
                evaluate = null;
            }
            final NodeList nodeList = (NodeList) evaluate;
            if (nodeList == null) {
                return SequencesKt.emptySequence();
            }
            return SequencesKt.map(CollectionsKt.asSequence(RangesKt.until(0, nodeList.getLength())), new Function1<Integer, Node>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }

                public final Node invoke(int i) {
                    return nodeList.item(i);
                }
            });
        }
    }

    @Nullable
    public static final Document b(@NotNull String str) throws com.bytedance.g.a.b {
        Closeable byteArrayInputStream;
        Intrinsics.checkParameterIsNotNull(str, "receiver$0");
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((ByteArrayInputStream) byteArrayInputStream);
            CloseableKt.closeFinally(byteArrayInputStream, null);
            return parse;
        } catch (Throwable th) {
            throw new com.bytedance.g.a.b(th);
        }
    }

    @Nullable
    public static final Document a(@NotNull String str) throws com.bytedance.g.a.a, com.bytedance.g.a.b {
        Intrinsics.checkParameterIsNotNull(str, "receiver$0");
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
        } catch (SAXException e2) {
            throw new com.bytedance.g.a.b((Throwable) e2);
        } catch (Throwable th) {
            throw new com.bytedance.g.a.a(str, th);
        }
    }

    @NotNull
    public static final Sequence<Node> a(@NotNull XPath xPath, @NotNull Object obj, @NotNull Sequence<String> sequence) {
        Intrinsics.checkParameterIsNotNull(xPath, "receiver$0");
        Intrinsics.checkParameterIsNotNull(obj, "item");
        Intrinsics.checkParameterIsNotNull(sequence, "exprList");
        return SequencesKt.flatMap(sequence, new d(xPath, obj));
    }

    @Nullable
    public static final String b(@NotNull XPath xPath, @NotNull Object obj, @NotNull Sequence<String> sequence) {
        Intrinsics.checkParameterIsNotNull(xPath, "receiver$0");
        Intrinsics.checkParameterIsNotNull(obj, "item");
        Intrinsics.checkParameterIsNotNull(sequence, "expr");
        return (String) SequencesKt.firstOrNull(a(a(xPath, obj, sequence), xPath, true, true));
    }

    @Nullable
    public static final String a(@NotNull XPath xPath, @NotNull Object obj, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(xPath, "receiver$0");
        Intrinsics.checkParameterIsNotNull(obj, "item");
        Intrinsics.checkParameterIsNotNull(str, "expr");
        return (String) SequencesKt.firstOrNull(a(a(xPath, obj, str), xPath, true, true));
    }

    @NotNull
    public static final Sequence<Node> a(@NotNull XPath xPath, @NotNull Object obj, @NotNull String... strArr) {
        Intrinsics.checkParameterIsNotNull(xPath, "receiver$0");
        Intrinsics.checkParameterIsNotNull(obj, "item");
        Intrinsics.checkParameterIsNotNull(strArr, "exprList");
        return a(xPath, obj, ArraysKt.asSequence((T[]) strArr));
    }

    /* access modifiers changed from: private */
    @NotNull
    public static Sequence<String> a(@NotNull Sequence<? extends Node> sequence, @NotNull XPath xPath, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(sequence, "receiver$0");
        Intrinsics.checkParameterIsNotNull(xPath, "xpath");
        Sequence<String> map = SequencesKt.map(sequence, new c(xPath));
        if (z) {
            map = SequencesKt.map(map, a.INSTANCE);
        }
        if (z2) {
            return SequencesKt.filter(map, C0177b.INSTANCE);
        }
        return map;
    }
}
