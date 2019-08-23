package kotlin.text;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class j implements i {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final g f83770a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    private final Matcher f83771b;

    /* renamed from: c  reason: collision with root package name */
    private final CharSequence f83772c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends kotlin.collections.a<f> implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f83773a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: kotlin.text.j$a$a  reason: collision with other inner class name */
        static final class C0897a extends Lambda implements Function1<Integer, f> {
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0897a(a aVar) {
                super(1);
                this.this$0 = aVar;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            @Nullable
            public final f invoke(int i) {
                a aVar = this.this$0;
                MatchResult c2 = aVar.f83773a.c();
                IntRange until = RangesKt.until(c2.start(i), c2.end(i));
                if (until.getStart().intValue() < 0) {
                    return null;
                }
                String group = aVar.f83773a.c().group(i);
                Intrinsics.checkExpressionValueIsNotNull(group, "matchResult.group(index)");
                return new f(group, until);
            }
        }

        public final boolean isEmpty() {
            return false;
        }

        public final int a() {
            return this.f83773a.c().groupCount() + 1;
        }

        @NotNull
        public final Iterator<f> iterator() {
            return SequencesKt.map(CollectionsKt.asSequence(CollectionsKt.getIndices(this)), new C0897a(this)).iterator();
        }

        a(j jVar) {
            this.f83773a = jVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            boolean z;
            if (obj != null) {
                z = obj instanceof f;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
            return super.contains((f) obj);
        }
    }

    public final MatchResult c() {
        return this.f83771b;
    }

    @NotNull
    public final IntRange a() {
        MatchResult c2 = c();
        return RangesKt.until(c2.start(), c2.end());
    }

    @Nullable
    public final i b() {
        int i;
        int end = c().end();
        if (c().end() == c().start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        if (i2 > this.f83772c.length()) {
            return null;
        }
        Matcher matcher = this.f83771b.pattern().matcher(this.f83772c);
        Intrinsics.checkExpressionValueIsNotNull(matcher, "matcher.pattern().matcher(input)");
        return k.a(matcher, i2, this.f83772c);
    }

    public j(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(matcher, "matcher");
        Intrinsics.checkParameterIsNotNull(charSequence, "input");
        this.f83771b = matcher;
        this.f83772c = charSequence;
    }
}
