package kotlin.text;

import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.m;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a4\u0010 \u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a4\u0010&\u001a\u0002H!\"\f\b\u0000\u0010\"*\u00020\u0002*\u0002H!\"\u0004\b\u0001\u0010!*\u0002H\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$H\b¢\u0006\u0002\u0010%\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b)\u001a&\u0010'\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010+\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010+\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010.\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010/\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u00100\u001a\u00020\r*\u00020\u0002H\b\u001a \u00101\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00102\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00103\u001a\u000204*\u00020\u0002H\u0002\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00105\u001a\u00020\u0006*\u00020\u00022\u0006\u0010*\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u00106\u001a\u00020\u0006*\u00020\u00022\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u00106\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u0002\u001a\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u0002\u001a\u0015\u0010;\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u0010<\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010=\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u00022\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001a\u001c\u0010@\u001a\u00020\n*\u00020\n2\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020\u0011\u001aG\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0004\bE\u0010F\u001a=\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000108*\u00020\u00022\u0006\u0010B\u001a\u00020-2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\bE\u001a4\u0010G\u001a\u00020\r*\u00020\u00022\u0006\u0010H\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010J\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u0002\u001a\u0012\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002\u001a\u001a\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006\u001a\u0012\u0010L\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001H\b\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002\u001a\u001a\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010R\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00020SH\b\u001a\u001d\u0010Q\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010V\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010X\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Y\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a$\u0010Z\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010U\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001d\u0010[\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010U\u001a\u00020\nH\b\u001a\"\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002\u001a\u001a\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002\u001a%\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010U\u001a\u00020\u0002H\b\u001a\u001d\u0010\\\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u0002H\b\u001a=\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010^\u001a0\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010P\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0002¢\u0006\u0002\b_\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00020\n0:*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010D\u001a\u00020\u0006H\b\u001a=\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\u0012\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0C\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006¢\u0006\u0002\u0010a\u001a0\u0010`\u001a\b\u0012\u0004\u0012\u00020\n08*\u00020\u00022\n\u0010B\u001a\u00020-\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\u0006\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010b\u001a\u00020\r*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u001d\u0010c\u001a\u00020\u0002*\u00020\n2\u0006\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\b\u001a\u001f\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u0006H\b\u001a\u0012\u0010f\u001a\u00020\n*\u00020\u00022\u0006\u0010M\u001a\u00020\u0001\u001a\u0012\u0010f\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0001\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010g\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010h\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010i\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u00112\b\b\u0002\u0010W\u001a\u00020\n\u001a\u001c\u0010j\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\n2\b\b\u0002\u0010W\u001a\u00020\n\u001a\n\u0010k\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010k\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010k\u001a\u00020\n*\u00020\nH\b\u001a!\u0010k\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010k\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010m\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010m\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010m\u001a\u00020\n*\u00020\nH\b\u001a!\u0010m\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010m\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\n\u0010n\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010n\u001a\u00020\u0002*\u00020\u00022\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\u0002*\u00020\u00022\n\u0010,\u001a\u00020-\"\u00020\u0011\u001a\r\u0010n\u001a\u00020\n*\u00020\nH\b\u001a!\u0010n\u001a\u00020\n*\u00020\n2\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0SH\b\u001a\u0016\u0010n\u001a\u00020\n*\u00020\n2\n\u0010,\u001a\u00020-\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006o"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/text/StringsKt")
public class v extends u {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/text/StringsKt__StringsKt$iterator$1", "Lkotlin/collections/CharIterator;", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CharSequence f83776a;

        /* renamed from: b  reason: collision with root package name */
        private int f83777b;

        public final char a() {
            CharSequence charSequence = this.f83776a;
            int i = this.f83777b;
            this.f83777b = i + 1;
            return charSequence.charAt(i);
        }

        public final boolean hasNext() {
            if (this.f83777b < this.f83776a.length()) {
                return true;
            }
            return false;
        }

        a(CharSequence charSequence) {
            this.f83776a = charSequence;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
        final /* synthetic */ char[] $delimiters;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z) {
            super(2);
            this.$delimiters = cArr;
            this.$ignoreCase = z;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CharSequence) obj, ((Number) obj2).intValue());
        }

        @Nullable
        public final Pair<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
            Intrinsics.checkParameterIsNotNull(charSequence, "$receiver");
            int indexOfAny = StringsKt.indexOfAny(charSequence, this.$delimiters, i, this.$ignoreCase);
            if (indexOfAny < 0) {
                return null;
            }
            return TuplesKt.to(Integer.valueOf(indexOfAny), 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List $delimitersList;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(List list, boolean z) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CharSequence) obj, ((Number) obj2).intValue());
        }

        @Nullable
        public final Pair<Integer, Integer> invoke(@NotNull CharSequence charSequence, int i) {
            Intrinsics.checkParameterIsNotNull(charSequence, "$receiver");
            Pair<Integer, String> findAnyOf$StringsKt__StringsKt = v.findAnyOf$StringsKt__StringsKt(charSequence, this.$delimitersList, i, this.$ignoreCase, false);
            if (findAnyOf$StringsKt__StringsKt != null) {
                return TuplesKt.to(findAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(((String) findAnyOf$StringsKt__StringsKt.getSecond()).length()));
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<IntRange, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @NotNull
        public final String invoke(@NotNull IntRange intRange) {
            Intrinsics.checkParameterIsNotNull(intRange, AdvanceSetting.NETWORK_TYPE);
            return StringsKt.substring(this.$this_splitToSequence, intRange);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<IntRange, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        @NotNull
        public final String invoke(@NotNull IntRange intRange) {
            Intrinsics.checkParameterIsNotNull(intRange, AdvanceSetting.NETWORK_TYPE);
            return StringsKt.substring(this.$this_splitToSequence, intRange);
        }
    }

    @InlineOnly
    private static final String orEmpty(@Nullable String str) {
        return str == null ? "" : str;
    }

    public static final int getLastIndex(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    @InlineOnly
    private static final boolean isEmpty(@NotNull CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isNotBlank(@NotNull CharSequence charSequence) {
        if (!StringsKt.isBlank(charSequence)) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isNotEmpty(@NotNull CharSequence charSequence) {
        if (charSequence.length() > 0) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isNullOrBlank(@Nullable CharSequence charSequence) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            return true;
        }
        return false;
    }

    @InlineOnly
    private static final boolean isNullOrEmpty(@Nullable CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final m iterator(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$iterator");
        return new a(charSequence);
    }

    @NotNull
    public static final List<String> lines(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lines");
        return SequencesKt.toList(StringsKt.lineSequence(charSequence));
    }

    @NotNull
    public static final IntRange getIndices(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indices");
        return new IntRange(0, charSequence.length() - 1);
    }

    @InlineOnly
    private static final String trim(@NotNull String str) {
        if (str != null) {
            return StringsKt.trim((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @InlineOnly
    private static final String trimEnd(@NotNull String str) {
        if (str != null) {
            return StringsKt.trimEnd((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @InlineOnly
    private static final String trimStart(@NotNull String str) {
        if (str != null) {
            return StringsKt.trimStart((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final Sequence<String> lineSequence(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lineSequence");
        return StringsKt.splitToSequence$default(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence) {
        int i;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean a2 = a.a(charSequence.charAt(i));
            if (z) {
                if (!a2) {
                    break;
                }
                length--;
            } else if (!a2) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trimEnd");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (a.a(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trimStart");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!a.a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final boolean matches(@NotNull CharSequence charSequence, Regex regex) {
        return regex.matches(charSequence);
    }

    @InlineOnly
    private static final boolean contains(@NotNull CharSequence charSequence, Regex regex) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$contains");
        return regex.containsMatchIn(charSequence);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.SinceKotlin
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <C extends java.lang.CharSequence & R, R> R ifBlank(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
        /*
            boolean r0 = kotlin.text.StringsKt.isBlank(r1)
            if (r0 == 0) goto L_0x000a
            java.lang.Object r1 = r2.invoke()
        L_0x000a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.v.ifBlank(java.lang.CharSequence, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.lang.CharSequence] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.SinceKotlin
    @kotlin.internal.InlineOnly
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <C extends java.lang.CharSequence & R, R> R ifEmpty(C r1, kotlin.jvm.functions.Function0<? extends R> r2) {
        /*
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.invoke()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.v.ifEmpty(java.lang.CharSequence, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$removeSurrounding");
        Intrinsics.checkParameterIsNotNull(charSequence2, "delimiter");
        return StringsKt.removeSurrounding(charSequence, charSequence2, charSequence2);
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String str, @NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(str, "$this$removeSurrounding");
        Intrinsics.checkParameterIsNotNull(charSequence, "delimiter");
        return StringsKt.removeSurrounding(str, charSequence, charSequence);
    }

    public static final boolean hasSurrogatePairAt(@NotNull CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$hasSurrogatePairAt");
        int length = charSequence.length() - 2;
        if (i >= 0 && length >= i && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1))) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final CharSequence removePrefix(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$removePrefix");
        Intrinsics.checkParameterIsNotNull(charSequence2, "prefix");
        if (StringsKt.startsWith$default(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence charSequence, @NotNull IntRange intRange) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$removeRange");
        Intrinsics.checkParameterIsNotNull(intRange, "range");
        return StringsKt.removeRange(charSequence, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final CharSequence removeSuffix(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$removeSuffix");
        Intrinsics.checkParameterIsNotNull(charSequence2, "suffix");
        if (StringsKt.endsWith$default(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @NotNull
    public static final CharSequence subSequence(@NotNull CharSequence charSequence, @NotNull IntRange intRange) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$subSequence");
        Intrinsics.checkParameterIsNotNull(intRange, "range");
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
    }

    @NotNull
    public static final String substring(@NotNull CharSequence charSequence, @NotNull IntRange intRange) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$substring");
        Intrinsics.checkParameterIsNotNull(intRange, "range");
        return charSequence.subSequence(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1).toString();
    }

    @NotNull
    public static final String removePrefix(@NotNull String str, @NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(str, "$this$removePrefix");
        Intrinsics.checkParameterIsNotNull(charSequence, "prefix");
        if (!StringsKt.startsWith$default((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @NotNull
    public static final String removeSuffix(@NotNull String str, @NotNull CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(str, "$this$removeSuffix");
        Intrinsics.checkParameterIsNotNull(charSequence, "suffix");
        if (!StringsKt.endsWith$default((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substring(@NotNull String str, @NotNull IntRange intRange) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substring");
        Intrinsics.checkParameterIsNotNull(intRange, "range");
        String substring = str.substring(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        int i;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trim");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean booleanValue = ((Boolean) function1.invoke(Character.valueOf(charSequence.charAt(i)))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (!booleanValue) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trimEnd");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (((Boolean) function1.invoke(Character.valueOf(charSequence.charAt(length)))).booleanValue());
        return charSequence.subSequence(0, length + 1);
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence, @NotNull Function1<? super Character, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trimStart");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!((Boolean) function1.invoke(Character.valueOf(charSequence.charAt(i)))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final String removeRange(@NotNull String str, IntRange intRange) {
        if (str != null) {
            return StringsKt.removeRange((CharSequence) str, intRange).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @NotNull
    public static final CharSequence trim(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        int i;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trim");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean contains = ArraysKt.contains(cArr, charSequence.charAt(i));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (!contains) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    @NotNull
    public static final CharSequence trimEnd(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trimEnd");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (ArraysKt.contains(cArr, charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1);
    }

    @NotNull
    public static final CharSequence trimStart(@NotNull CharSequence charSequence, @NotNull char... cArr) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$trimStart");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!ArraysKt.contains(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @NotNull
    public static final String trim(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "$this$trim");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        CharSequence charSequence = str;
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean booleanValue = ((Boolean) function1.invoke(Character.valueOf(charSequence.charAt(i)))).booleanValue();
            if (z) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (!booleanValue) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1).toString();
    }

    @NotNull
    public static final String trimEnd(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(str, "$this$trimEnd");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        CharSequence charSequence2 = str;
        int length = charSequence2.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!((Boolean) function1.invoke(Character.valueOf(charSequence2.charAt(length)))).booleanValue()) {
                    charSequence = charSequence2.subSequence(0, length + 1);
                    break;
                }
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    public static final String trimStart(@NotNull String str, @NotNull Function1<? super Character, Boolean> function1) {
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(str, "$this$trimStart");
        Intrinsics.checkParameterIsNotNull(function1, "predicate");
        CharSequence charSequence2 = str;
        int length = charSequence2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!((Boolean) function1.invoke(Character.valueOf(charSequence2.charAt(i)))).booleanValue()) {
                charSequence = charSequence2.subSequence(i, charSequence2.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    public static final String trim(@NotNull String str, @NotNull char... cArr) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "$this$trim");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        CharSequence charSequence = str;
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean contains = ArraysKt.contains(cArr, charSequence.charAt(i));
            if (z) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (!contains) {
                z = true;
            } else {
                i2++;
            }
        }
        return charSequence.subSequence(i2, length + 1).toString();
    }

    @NotNull
    public static final String trimEnd(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(str, "$this$trimEnd");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        CharSequence charSequence2 = str;
        int length = charSequence2.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!ArraysKt.contains(cArr, charSequence2.charAt(length))) {
                    charSequence = charSequence2.subSequence(0, length + 1);
                    break;
                }
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    @NotNull
    public static final String trimStart(@NotNull String str, @NotNull char... cArr) {
        CharSequence charSequence;
        Intrinsics.checkParameterIsNotNull(str, "$this$trimStart");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        CharSequence charSequence2 = str;
        int length = charSequence2.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequence = "";
                break;
            } else if (!ArraysKt.contains(cArr, charSequence2.charAt(i))) {
                charSequence = charSequence2.subSequence(i, charSequence2.length());
                break;
            } else {
                i++;
            }
        }
        return charSequence.toString();
    }

    @InlineOnly
    private static final String replace(@NotNull CharSequence charSequence, Regex regex, String str) {
        return regex.replace(charSequence, str);
    }

    @InlineOnly
    private static final String replaceFirst(@NotNull CharSequence charSequence, Regex regex, String str) {
        return regex.replaceFirst(charSequence, str);
    }

    @InlineOnly
    private static final List<String> split(@NotNull CharSequence charSequence, Regex regex, int i) {
        return regex.split(charSequence, i);
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InlineOnly
    private static final CharSequence subSequence(@NotNull String str, int i, int i2) {
        return str.subSequence(i, i2);
    }

    @NotNull
    public static final String padEnd(@NotNull String str, int i, char c2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$padEnd");
        return StringsKt.padEnd((CharSequence) str, i, c2).toString();
    }

    @NotNull
    public static final String padStart(@NotNull String str, int i, char c2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$padStart");
        return StringsKt.padStart((CharSequence) str, i, c2).toString();
    }

    @InlineOnly
    private static final String replace(@NotNull CharSequence charSequence, Regex regex, Function1<? super i, ? extends CharSequence> function1) {
        return regex.replace(charSequence, function1);
    }

    @InlineOnly
    private static final String substring(@NotNull CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    public static final boolean contains(@NotNull CharSequence charSequence, char c2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$contains");
        if (StringsKt.indexOf$default(charSequence, c2, 0, z, 2, (Object) null) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean endsWith(@NotNull CharSequence charSequence, char c2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$endsWith");
        if (charSequence.length() <= 0 || !a.a(charSequence.charAt(StringsKt.getLastIndex(charSequence)), c2, z)) {
            return false;
        }
        return true;
    }

    @InlineOnly
    private static final String removeRange(@NotNull String str, int i, int i2) {
        if (str != null) {
            return StringsKt.removeRange((CharSequence) str, i, i2).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence, char c2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$startsWith");
        if (charSequence.length() <= 0 || !a.a(charSequence.charAt(0), c2, z)) {
            return false;
        }
        return true;
    }

    public static final boolean contains(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$contains");
        Intrinsics.checkParameterIsNotNull(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (StringsKt.indexOf$default(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
            return false;
        }
        if (indexOf$StringsKt__StringsKt$default(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean endsWith(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$endsWith");
        Intrinsics.checkParameterIsNotNull(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.endsWith$default((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return StringsKt.regionMatchesImpl(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence charSequence, @NotNull IntRange intRange, @NotNull CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$replaceRange");
        Intrinsics.checkParameterIsNotNull(intRange, "range");
        Intrinsics.checkParameterIsNotNull(charSequence2, "replacement");
        return StringsKt.replaceRange(charSequence, intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1, charSequence2);
    }

    @NotNull
    public static final String substringAfter(@NotNull String str, char c2, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringAfter");
        Intrinsics.checkParameterIsNotNull(str2, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str2;
        }
        String substring = str.substring(indexOf$default + 1, str.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substringAfterLast(@NotNull String str, char c2, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringAfterLast");
        Intrinsics.checkParameterIsNotNull(str2, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf$default + 1, str.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substringBefore(@NotNull String str, char c2, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringBefore");
        Intrinsics.checkParameterIsNotNull(str2, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str2;
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String str, char c2, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringBeforeLast");
        Intrinsics.checkParameterIsNotNull(str2, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str2;
        }
        String substring = str.substring(0, lastIndexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String commonPrefixWith(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$commonPrefixWith");
        Intrinsics.checkParameterIsNotNull(charSequence2, "other");
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && a.a(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (StringsKt.hasSurrogatePairAt(charSequence, i2) || StringsKt.hasSurrogatePairAt(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    @NotNull
    public static final String commonSuffixWith(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$commonSuffixWith");
        Intrinsics.checkParameterIsNotNull(charSequence2, "other");
        int length = charSequence.length();
        int min = Math.min(length, charSequence2.length());
        int i = 0;
        while (i < min && a.a(charSequence.charAt((length - i) - 1), charSequence2.charAt((r1 - i) - 1), z)) {
            i++;
        }
        if (StringsKt.hasSurrogatePairAt(charSequence, (length - i) - 1) || StringsKt.hasSurrogatePairAt(charSequence2, (r1 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    @NotNull
    public static final CharSequence padEnd(@NotNull CharSequence charSequence, int i, char c2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$padEnd");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append(charSequence);
            int length = i - charSequence.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append(c2);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return sb;
        }
    }

    @NotNull
    public static final CharSequence padStart(@NotNull CharSequence charSequence, int i, char c2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$padStart");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append(c2);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    @NotNull
    public static final CharSequence removeRange(@NotNull CharSequence charSequence, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$removeRange");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
            sb.append(charSequence, 0, i);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
    }

    @NotNull
    public static final CharSequence removeSurrounding(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$removeSurrounding");
        Intrinsics.checkParameterIsNotNull(charSequence2, "prefix");
        Intrinsics.checkParameterIsNotNull(charSequence3, "suffix");
        if (charSequence.length() < charSequence2.length() + charSequence3.length() || !StringsKt.startsWith$default(charSequence, charSequence2, false, 2, (Object) null) || !StringsKt.endsWith$default(charSequence, charSequence3, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length());
        }
        return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.startsWith$default((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return StringsKt.regionMatchesImpl(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    @NotNull
    public static final String substringAfter(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringAfter");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        String substring = str.substring(indexOf$default + str2.length(), str.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substringAfterLast(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringAfterLast");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        String substring = str.substring(lastIndexOf$default + str2.length(), str.length());
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substringBefore(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringBefore");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        String substring = str.substring(0, indexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String substringBeforeLast(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$substringBeforeLast");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        String substring = str.substring(0, lastIndexOf$default);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public static final String removeSurrounding(@NotNull String str, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(str, "$this$removeSurrounding");
        Intrinsics.checkParameterIsNotNull(charSequence, "prefix");
        Intrinsics.checkParameterIsNotNull(charSequence2, "suffix");
        if (str.length() >= charSequence.length() + charSequence2.length()) {
            CharSequence charSequence3 = str;
            if (StringsKt.startsWith$default(charSequence3, charSequence, false, 2, (Object) null) && StringsKt.endsWith$default(charSequence3, charSequence2, false, 2, (Object) null)) {
                String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    @InlineOnly
    private static final String replaceRange(@NotNull String str, IntRange intRange, CharSequence charSequence) {
        if (str != null) {
            return StringsKt.replaceRange((CharSequence) str, intRange, charSequence).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @Nullable
    public static final Pair<Integer, String> findAnyOf(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$findAnyOf");
        Intrinsics.checkParameterIsNotNull(collection, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, false);
    }

    @Nullable
    public static final Pair<Integer, String> findLastAnyOf(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$findLastAnyOf");
        Intrinsics.checkParameterIsNotNull(collection, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, true);
    }

    public static final int indexOf(@NotNull CharSequence charSequence, char c2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c2, i);
        }
        return StringsKt.indexOfAny(charSequence, new char[]{c2}, i, z);
    }

    public static final int indexOfAny(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indexOfAny");
        Intrinsics.checkParameterIsNotNull(collection, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, false);
        if (findAnyOf$StringsKt__StringsKt != null) {
            Integer num = (Integer) findAnyOf$StringsKt__StringsKt.getFirst();
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    public static final int lastIndexOf(@NotNull CharSequence charSequence, char c2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastIndexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c2, i);
        }
        return StringsKt.lastIndexOfAny(charSequence, new char[]{c2}, i, z);
    }

    public static final int lastIndexOfAny(@NotNull CharSequence charSequence, @NotNull Collection<String> collection, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastIndexOfAny");
        Intrinsics.checkParameterIsNotNull(collection, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, collection, i, z, true);
        if (findAnyOf$StringsKt__StringsKt != null) {
            Integer num = (Integer) findAnyOf$StringsKt__StringsKt.getFirst();
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    @InlineOnly
    private static final String replaceRange(@NotNull String str, int i, int i2, CharSequence charSequence) {
        if (str != null) {
            return StringsKt.replaceRange((CharSequence) str, i, i2, charSequence).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final int indexOf(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indexOf");
        Intrinsics.checkParameterIsNotNull(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return indexOf$StringsKt__StringsKt$default(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    public static final int lastIndexOf(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastIndexOf");
        Intrinsics.checkParameterIsNotNull(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return indexOf$StringsKt__StringsKt(charSequence, str, i, 0, z, true);
    }

    @NotNull
    public static final String replaceAfter(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceAfter");
        Intrinsics.checkParameterIsNotNull(str2, "replacement");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        CharSequence charSequence = str;
        int indexOf$default = StringsKt.indexOf$default(charSequence, c2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        return StringsKt.replaceRange(charSequence, indexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceAfterLast");
        Intrinsics.checkParameterIsNotNull(str2, "replacement");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        CharSequence charSequence = str;
        int lastIndexOf$default = StringsKt.lastIndexOf$default(charSequence, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        return StringsKt.replaceRange(charSequence, lastIndexOf$default + 1, str.length(), (CharSequence) str2).toString();
    }

    @NotNull
    public static final String replaceBefore(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceBefore");
        Intrinsics.checkParameterIsNotNull(str2, "replacement");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        CharSequence charSequence = str;
        int indexOf$default = StringsKt.indexOf$default(charSequence, c2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str3;
        }
        return StringsKt.replaceRange(charSequence, 0, indexOf$default, (CharSequence) str2).toString();
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String str, char c2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceBeforeLast");
        Intrinsics.checkParameterIsNotNull(str2, "replacement");
        Intrinsics.checkParameterIsNotNull(str3, "missingDelimiterValue");
        CharSequence charSequence = str;
        int lastIndexOf$default = StringsKt.lastIndexOf$default(charSequence, c2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str3;
        }
        return StringsKt.replaceRange(charSequence, 0, lastIndexOf$default, (CharSequence) str2).toString();
    }

    @NotNull
    public static final Sequence<String> splitToSequence(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$splitToSequence");
        Intrinsics.checkParameterIsNotNull(cArr, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0, z, i, 2, (Object) null), new e(charSequence));
    }

    public static final boolean startsWith(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$startsWith");
        Intrinsics.checkParameterIsNotNull(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsKt.startsWith$default((String) charSequence, (String) charSequence2, i, false, 4, null);
        }
        return StringsKt.regionMatchesImpl(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    public static final int indexOfAny(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$indexOfAny");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int coerceAtLeast = RangesKt.coerceAtLeast(i, 0);
            int lastIndex = StringsKt.getLastIndex(charSequence);
            if (coerceAtLeast <= lastIndex) {
                while (true) {
                    char charAt = charSequence.charAt(coerceAtLeast);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (a.a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (coerceAtLeast == lastIndex) {
                            break;
                        }
                        coerceAtLeast++;
                    } else {
                        return coerceAtLeast;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(ArraysKt.single(cArr), i);
    }

    public static final int lastIndexOfAny(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$lastIndexOfAny");
        Intrinsics.checkParameterIsNotNull(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int coerceAtMost = RangesKt.coerceAtMost(i, StringsKt.getLastIndex(charSequence)); coerceAtMost >= 0; coerceAtMost--) {
                char charAt = charSequence.charAt(coerceAtMost);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (a.a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return coerceAtMost;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(ArraysKt.single(cArr), i);
    }

    @NotNull
    public static final String replaceAfter(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceAfter");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "replacement");
        Intrinsics.checkParameterIsNotNull(str4, "missingDelimiterValue");
        CharSequence charSequence = str;
        int indexOf$default = StringsKt.indexOf$default(charSequence, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str4;
        }
        return StringsKt.replaceRange(charSequence, indexOf$default + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @NotNull
    public static final String replaceAfterLast(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceAfterLast");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "replacement");
        Intrinsics.checkParameterIsNotNull(str4, "missingDelimiterValue");
        CharSequence charSequence = str;
        int lastIndexOf$default = StringsKt.lastIndexOf$default(charSequence, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str4;
        }
        return StringsKt.replaceRange(charSequence, lastIndexOf$default + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @NotNull
    public static final String replaceBefore(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceBefore");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "replacement");
        Intrinsics.checkParameterIsNotNull(str4, "missingDelimiterValue");
        CharSequence charSequence = str;
        int indexOf$default = StringsKt.indexOf$default(charSequence, str2, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return str4;
        }
        return StringsKt.replaceRange(charSequence, 0, indexOf$default, (CharSequence) str3).toString();
    }

    @NotNull
    public static final String replaceBeforeLast(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "$this$replaceBeforeLast");
        Intrinsics.checkParameterIsNotNull(str2, "delimiter");
        Intrinsics.checkParameterIsNotNull(str3, "replacement");
        Intrinsics.checkParameterIsNotNull(str4, "missingDelimiterValue");
        CharSequence charSequence = str;
        int lastIndexOf$default = StringsKt.lastIndexOf$default(charSequence, str2, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return str4;
        }
        return StringsKt.replaceRange(charSequence, 0, lastIndexOf$default, (CharSequence) str3).toString();
    }

    @NotNull
    public static final CharSequence replaceRange(@NotNull CharSequence charSequence, int i, int i2, @NotNull CharSequence charSequence2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$replaceRange");
        Intrinsics.checkParameterIsNotNull(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    @NotNull
    public static final List<String> split(@NotNull CharSequence charSequence, @NotNull char[] cArr, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$split");
        Intrinsics.checkParameterIsNotNull(cArr, "delimiters");
        if (cArr.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<IntRange> asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, cArr, 0, z, i, 2, (Object) null));
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        for (IntRange substring : asIterable) {
            arrayList.add(StringsKt.substring(charSequence, substring));
        }
        return (List) arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(@NotNull CharSequence charSequence, String str, boolean z, int i) {
        boolean z2;
        boolean z3;
        int i2 = 0;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int indexOf = StringsKt.indexOf(charSequence, str, 0, z);
            if (indexOf == -1 || i == 1) {
                return CollectionsKt.listOf(charSequence.toString());
            }
            if (i > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i3 = 10;
            if (z3) {
                i3 = RangesKt.coerceAtMost(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, indexOf).toString());
                i2 = str.length() + indexOf;
                if (z3 && arrayList.size() == i - 1) {
                    break;
                }
                indexOf = StringsKt.indexOf(charSequence, str, i2, z);
            } while (indexOf != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    @NotNull
    public static final Sequence<String> splitToSequence(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$splitToSequence");
        Intrinsics.checkParameterIsNotNull(strArr, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, strArr, 0, z, i, 2, (Object) null), new d(charSequence));
    }

    @NotNull
    public static final List<String> split(@NotNull CharSequence charSequence, @NotNull String[] strArr, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$split");
        Intrinsics.checkParameterIsNotNull(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return split$StringsKt__StringsKt(charSequence, str, z, i);
            }
        }
        Iterable<IntRange> asIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, strArr, 0, z, i, 2, (Object) null));
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asIterable, 10));
        for (IntRange substring : asIterable) {
            arrayList.add(StringsKt.substring(charSequence, substring));
        }
        return (List) arrayList;
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.commonPrefixWith(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.commonSuffixWith(charSequence, charSequence2, z);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.contains(charSequence, c2, z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.endsWith(charSequence, c2, z);
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padEnd(charSequence, i, c2);
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padStart(charSequence, i, c2);
    }

    static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.startsWith(charSequence, c2, z);
    }

    public static /* synthetic */ String substringAfter$default(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringAfter(str, c2, str2);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringAfterLast(str, c2, str2);
    }

    public static /* synthetic */ String substringBefore$default(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringBefore(str, c2, str2);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c2, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return StringsKt.substringBeforeLast(str, c2, str2);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.contains(charSequence, charSequence2, z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.endsWith(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String padEnd$default(String str, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padEnd(str, i, c2);
    }

    public static /* synthetic */ String padStart$default(String str, int i, char c2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c2 = ' ';
        }
        return StringsKt.padStart(str, i, c2);
    }

    static /* synthetic */ String substring$default(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return charSequence.subSequence(i, i2).toString();
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return StringsKt.substringBeforeLast(str, str2, str3);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(@NotNull CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        boolean z2;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new d<>(charSequence, i, i2, new b(cArr, z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, z);
    }

    private static final Sequence<IntRange> rangesDelimitedBy$StringsKt__StringsKt(@NotNull CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        boolean z2;
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return new d<>(charSequence, i, i2, new c(ArraysKt.asList((T[]) strArr), z));
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i2 + '.').toString());
    }

    public static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(@NotNull CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        IntProgression intProgression;
        Object obj;
        Object obj2;
        int i2;
        if (z || collection.size() != 1) {
            if (!z2) {
                intProgression = new IntRange(RangesKt.coerceAtLeast(i, 0), charSequence.length());
            } else {
                intProgression = RangesKt.downTo(RangesKt.coerceAtMost(i, StringsKt.getLastIndex(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int first = intProgression.getFirst();
                int last = intProgression.getLast();
                int step = intProgression.getStep();
                if (step < 0 ? first >= last : first <= last) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            String str = (String) obj2;
                            if (StringsKt.regionMatches(str, 0, (String) charSequence, first, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (first == last) {
                                break;
                            }
                            first += step;
                        } else {
                            return TuplesKt.to(Integer.valueOf(first), str2);
                        }
                    }
                }
            } else {
                int first2 = intProgression.getFirst();
                int last2 = intProgression.getLast();
                int step2 = intProgression.getStep();
                if (step2 < 0 ? first2 >= last2 : first2 <= last2) {
                    while (true) {
                        Iterator it3 = collection.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            String str3 = (String) obj;
                            if (StringsKt.regionMatchesImpl(str3, 0, charSequence, first2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (first2 == last2) {
                                break;
                            }
                            first2 += step2;
                        } else {
                            return TuplesKt.to(Integer.valueOf(first2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) CollectionsKt.single((Iterable<? extends T>) collection);
        if (!z2) {
            i2 = StringsKt.indexOf$default(charSequence, str5, i, false, 4, (Object) null);
        } else {
            i2 = StringsKt.lastIndexOf$default(charSequence, str5, i, false, 4, (Object) null);
        }
        if (i2 < 0) {
            return null;
        }
        return TuplesKt.to(Integer.valueOf(i2), str5);
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.findAnyOf(charSequence, collection, i, z);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOf(charSequence, c2, i, z);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOfAny(charSequence, collection, i, z);
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceAfter(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceAfterLast(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceBefore(str, c2, str2, str3);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c2, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return StringsKt.replaceBeforeLast(str, c2, str2, str3);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return StringsKt.splitToSequence(charSequence, cArr, z, i);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.findLastAnyOf(charSequence, collection, i, z);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOf(charSequence, str, i, z);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.indexOfAny(charSequence, cArr, i, z);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOf(charSequence, c2, i, z);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, collection, i, z);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceAfterLast(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return StringsKt.replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return StringsKt.split(charSequence, cArr, z, i);
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return StringsKt.splitToSequence(charSequence, strArr, z, i);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.startsWith(charSequence, charSequence2, i, z);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOf(charSequence, str, i, z);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = StringsKt.getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return StringsKt.lastIndexOfAny(charSequence, cArr, i, z);
    }

    public static final boolean regionMatchesImpl(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        Intrinsics.checkParameterIsNotNull(charSequence, "$this$regionMatchesImpl");
        Intrinsics.checkParameterIsNotNull(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!a.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return StringsKt.split(charSequence, strArr, z, i);
    }

    private static final int indexOf$StringsKt__StringsKt(@NotNull CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntProgression intProgression;
        if (!z2) {
            intProgression = new IntRange(RangesKt.coerceAtLeast(i, 0), RangesKt.coerceAtMost(i2, charSequence.length()));
        } else {
            intProgression = RangesKt.downTo(RangesKt.coerceAtMost(i, StringsKt.getLastIndex(charSequence)), RangesKt.coerceAtLeast(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = intProgression.getFirst();
            int last = intProgression.getLast();
            int step = intProgression.getStep();
            if (step < 0 ? first >= last : first <= last) {
                while (true) {
                    if (!StringsKt.regionMatchesImpl(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return first;
                    }
                }
            }
        } else {
            int first2 = intProgression.getFirst();
            int last2 = intProgression.getLast();
            int step2 = intProgression.getStep();
            if (step2 < 0 ? first2 >= last2 : first2 <= last2) {
                while (true) {
                    if (!StringsKt.regionMatches((String) charSequence2, 0, (String) charSequence, first2, charSequence2.length(), z)) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return first2;
                    }
                }
            }
        }
        return -1;
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i, z, i2);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i, z, i2);
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        boolean z3;
        if ((i3 & 16) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i, i2, z, z3);
    }
}
