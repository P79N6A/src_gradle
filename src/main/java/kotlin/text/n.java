package kotlin.text;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/text/StringsKt")
public class n {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<String, String> {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "line");
            return str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "line", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<String, String> {
        final /* synthetic */ String $indent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.$indent = str;
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, "line");
            return this.$indent + str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<String, String> {
        final /* synthetic */ String $indent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$indent = str;
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkParameterIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            if (!StringsKt.isBlank(str)) {
                return this.$indent + str;
            } else if (str.length() < this.$indent.length()) {
                return this.$indent;
            } else {
                return str;
            }
        }
    }

    @NotNull
    public static final String trimIndent(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "$this$trimIndent");
        return StringsKt.replaceIndent(str, "");
    }

    private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a.INSTANCE;
        }
        return new b<>(str);
    }

    private static final int indentWidth$StringsKt__IndentKt(@NotNull String str) {
        CharSequence charSequence = str;
        int length = charSequence.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!a.a(charSequence.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    @NotNull
    public static final String trimMargin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$trimMargin");
        Intrinsics.checkParameterIsNotNull(str2, "marginPrefix");
        return StringsKt.replaceIndentByMargin(str, "", str2);
    }

    @NotNull
    public static final String prependIndent(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$prependIndent");
        Intrinsics.checkParameterIsNotNull(str2, "indent");
        return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence(str), new c(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public static final String replaceIndent(@NotNull String str, @NotNull String str2) {
        int i;
        String str3 = str;
        Intrinsics.checkParameterIsNotNull(str3, "$this$replaceIndent");
        Intrinsics.checkParameterIsNotNull(str2, "newIndent");
        List<String> lines = StringsKt.lines(str3);
        Iterable iterable = lines;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!StringsKt.isBlank((String) next)) {
                arrayList.add(next);
            }
        }
        Iterable<String> iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        for (String indentWidth$StringsKt__IndentKt : iterable2) {
            arrayList2.add(Integer.valueOf(indentWidth$StringsKt__IndentKt(indentWidth$StringsKt__IndentKt)));
        }
        Integer num = (Integer) CollectionsKt.min((Iterable<? extends T>) (List) arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * lines.size());
        Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
        int lastIndex = CollectionsKt.getLastIndex(lines);
        Collection arrayList3 = new ArrayList();
        for (Object next2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str4 = (String) next2;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(str4)) {
                str4 = null;
            } else {
                String drop = StringsKt.drop(str4, i);
                if (drop != null) {
                    String str5 = (String) indentFunction$StringsKt__IndentKt.invoke(drop);
                    if (str5 != null) {
                        str4 = str5;
                    }
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) CollectionsKt.joinTo$default((List) arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    @NotNull
    public static final String replaceIndentByMargin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        int i;
        String str4 = str;
        Intrinsics.checkParameterIsNotNull(str4, "$this$replaceIndentByMargin");
        Intrinsics.checkParameterIsNotNull(str2, "newIndent");
        Intrinsics.checkParameterIsNotNull(str3, "marginPrefix");
        if (!StringsKt.isBlank(r6)) {
            List<String> lines = StringsKt.lines(str4);
            int length = str.length() + (str2.length() * lines.size());
            Function1<String, String> indentFunction$StringsKt__IndentKt = getIndentFunction$StringsKt__IndentKt(str2);
            int lastIndex = CollectionsKt.getLastIndex(lines);
            Collection arrayList = new ArrayList();
            int i2 = 0;
            for (Object next : lines) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str5 = (String) next;
                String str6 = null;
                if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(str5)) {
                    str5 = null;
                } else {
                    int length2 = str5.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!a.a(r0.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (StringsKt.startsWith$default(str5, str3, i, false, 4, null)) {
                            int length3 = i5 + str3.length();
                            if (str5 != null) {
                                str6 = str5.substring(length3);
                                Intrinsics.checkExpressionValueIsNotNull(str6, "(this as java.lang.String).substring(startIndex)");
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    }
                    if (str6 != null) {
                        String str7 = (String) indentFunction$StringsKt__IndentKt.invoke(str6);
                        if (str7 != null) {
                            str5 = str7;
                        }
                    }
                }
                if (str5 != null) {
                    arrayList.add(str5);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) CollectionsKt.joinTo$default((List) arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, 124, null)).toString();
            Intrinsics.checkExpressionValueIsNotNull(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    public static /* synthetic */ String prependIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return StringsKt.prependIndent(str, str2);
    }

    public static /* synthetic */ String replaceIndent$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return StringsKt.replaceIndent(str, str2);
    }

    public static /* synthetic */ String trimMargin$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return StringsKt.trimMargin(str, str2);
    }

    private static final String reindent$StringsKt__IndentKt(@NotNull List<String> list, int i, Function1<? super String, String> function1, Function1<? super String, String> function12) {
        int lastIndex = CollectionsKt.getLastIndex(list);
        Collection arrayList = new ArrayList();
        int i2 = 0;
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                if (kotlin.internal.b.a(1, 3, 0)) {
                    CollectionsKt.throwIndexOverflow();
                } else {
                    throw new ArithmeticException("Index overflow has happened.");
                }
            }
            String str = (String) next;
            if ((i2 == 0 || i2 == lastIndex) && StringsKt.isBlank(str)) {
                str = null;
            } else {
                String str2 = (String) function12.invoke(str);
                if (str2 != null) {
                    String str3 = (String) function1.invoke(str2);
                    if (str3 != null) {
                        str = str3;
                    }
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        String sb = ((StringBuilder) CollectionsKt.joinTo$default((List) arrayList, new StringBuilder(i), "\n", null, null, 0, null, null, 124, null)).toString();
        Intrinsics.checkExpressionValueIsNotNull(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    public static /* synthetic */ String replaceIndentByMargin$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return StringsKt.replaceIndentByMargin(str, str2, str3);
    }
}
