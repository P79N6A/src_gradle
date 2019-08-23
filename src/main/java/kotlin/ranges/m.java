package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongProgression;
import kotlin.ranges.LongRange;
import kotlin.ranges.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a'\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007\u001a\u0012\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b\u001a\u0012\u0010\u0000\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t\u001a\u0012\u0010\u0000\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n\u001a'\u0010\u000b\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\u0006\u0010\f\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u0012\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u0012\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a3\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\b\u0010\u0003\u001a\u0004\u0018\u0001H\u00012\b\u0010\f\u001a\u0004\u0018\u0001H\u0001¢\u0006\u0002\u0010\u000e\u001a/\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a-\u0010\r\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\u0002H\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0012¢\u0006\u0002\u0010\u0013\u001a\u001a\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005\u001a\u001a\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006\u001a\u001a\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007\u001a\u001a\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b\u001a\u0018\u0010\r\u001a\u00020\b*\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u001a\u001a\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t\u001a\u0018\u0010\r\u001a\u00020\t*\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u001a\u001a\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\n¢\u0006\u0002\u0010\u0019\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001b\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001c\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001d\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001e\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0002\b\u001f\u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0002\b \u001a \u0010\u0014\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0002\b \u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\u0010\"\u001a\u001c\u0010\u0014\u001a\u00020\u0015*\u00020#2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\n¢\u0006\u0002\u0010$\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010%\u001a\u00020)*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010%\u001a\u00020(*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010%\u001a\u00020&*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\r\u0010*\u001a\u00020\u0018*\u00020\u0016H\b\u001a\u0014\u0010*\u001a\u00020\u0018*\u00020\u00162\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\b*\u00020!H\b\u001a\u0014\u0010*\u001a\u00020\b*\u00020!2\u0006\u0010*\u001a\u00020+H\u0007\u001a\r\u0010*\u001a\u00020\t*\u00020#H\b\u001a\u0014\u0010*\u001a\u00020\t*\u00020#2\u0006\u0010*\u001a\u00020+H\u0007\u001a\n\u0010,\u001a\u00020)*\u00020)\u001a\n\u0010,\u001a\u00020&*\u00020&\u001a\n\u0010,\u001a\u00020(*\u00020(\u001a\u0015\u0010-\u001a\u00020)*\u00020)2\u0006\u0010-\u001a\u00020\bH\u0004\u001a\u0015\u0010-\u001a\u00020&*\u00020&2\u0006\u0010-\u001a\u00020\bH\u0004\u001a\u0015\u0010-\u001a\u00020(*\u00020(2\u0006\u0010-\u001a\u00020\tH\u0004\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\u0006H\u0000¢\u0006\u0002\u0010/\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\u0007H\u0000¢\u0006\u0002\u00100\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\bH\u0000¢\u0006\u0002\u00101\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000¢\u0006\u0002\u00102\u001a\u0013\u0010.\u001a\u0004\u0018\u00010\u0005*\u00020\nH\u0000¢\u0006\u0002\u00103\u001a\u0013\u00104\u001a\u0004\u0018\u00010\b*\u00020\u0006H\u0000¢\u0006\u0002\u00105\u001a\u0013\u00104\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0000¢\u0006\u0002\u00106\u001a\u0013\u00104\u001a\u0004\u0018\u00010\b*\u00020\tH\u0000¢\u0006\u0002\u00107\u001a\u0013\u00108\u001a\u0004\u0018\u00010\t*\u00020\u0006H\u0000¢\u0006\u0002\u00109\u001a\u0013\u00108\u001a\u0004\u0018\u00010\t*\u00020\u0007H\u0000¢\u0006\u0002\u0010:\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0000¢\u0006\u0002\u0010<\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0002\u0010=\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\bH\u0000¢\u0006\u0002\u0010>\u001a\u0013\u0010;\u001a\u0004\u0018\u00010\n*\u00020\tH\u0000¢\u0006\u0002\u0010?\u001a\u0015\u0010@\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\u00052\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010@\u001a\u00020\u0016*\u00020\u00182\u0006\u0010'\u001a\u00020\u0018H\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\b2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\b2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\t2\u0006\u0010'\u001a\u00020\nH\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\u0005H\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\bH\u0004\u001a\u0015\u0010@\u001a\u00020#*\u00020\n2\u0006\u0010'\u001a\u00020\tH\u0004\u001a\u0015\u0010@\u001a\u00020!*\u00020\n2\u0006\u0010'\u001a\u00020\nH\u0004¨\u0006A"}, d2 = {"coerceAtLeast", "T", "", "minimumValue", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "coerceAtMost", "maximumValue", "coerceIn", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "range", "Lkotlin/ranges/ClosedFloatingPointRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedFloatingPointRange;)Ljava/lang/Comparable;", "Lkotlin/ranges/ClosedRange;", "(Ljava/lang/Comparable;Lkotlin/ranges/ClosedRange;)Ljava/lang/Comparable;", "contains", "", "Lkotlin/ranges/CharRange;", "element", "", "(Lkotlin/ranges/CharRange;Ljava/lang/Character;)Z", "value", "byteRangeContains", "doubleRangeContains", "floatRangeContains", "intRangeContains", "longRangeContains", "shortRangeContains", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;Ljava/lang/Integer;)Z", "Lkotlin/ranges/LongRange;", "(Lkotlin/ranges/LongRange;Ljava/lang/Long;)Z", "downTo", "Lkotlin/ranges/IntProgression;", "to", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/CharProgression;", "random", "Lkotlin/random/Random;", "reversed", "step", "toByteExactOrNull", "(D)Ljava/lang/Byte;", "(F)Ljava/lang/Byte;", "(I)Ljava/lang/Byte;", "(J)Ljava/lang/Byte;", "(S)Ljava/lang/Byte;", "toIntExactOrNull", "(D)Ljava/lang/Integer;", "(F)Ljava/lang/Integer;", "(J)Ljava/lang/Integer;", "toLongExactOrNull", "(D)Ljava/lang/Long;", "(F)Ljava/lang/Long;", "toShortExactOrNull", "(D)Ljava/lang/Short;", "(F)Ljava/lang/Short;", "(I)Ljava/lang/Short;", "(J)Ljava/lang/Short;", "until", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/ranges/RangesKt")
public class m extends l {
    public static final byte coerceAtLeast(byte b2, byte b3) {
        return b2 < b3 ? b3 : b2;
    }

    public static final double coerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final float coerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final byte coerceAtMost(byte b2, byte b3) {
        return b2 > b3 ? b3 : b2;
    }

    public static final double coerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static final float coerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @NotNull
    public static final LongProgression downTo(long j, byte b2) {
        return LongProgression.a.a(j, (long) b2, -1);
    }

    @NotNull
    public static final a downTo(char c2, char c3) {
        return a.C0895a.a(c2, c3, -1);
    }

    @NotNull
    public static final LongProgression downTo(long j, int i) {
        return LongProgression.a.a(j, (long) i, -1);
    }

    @NotNull
    public static final LongProgression downTo(int i, long j) {
        return LongProgression.a.a((long) i, j, -1);
    }

    @NotNull
    public static final LongProgression downTo(long j, long j2) {
        return LongProgression.a.a(j, j2, -1);
    }

    @NotNull
    public static final LongProgression downTo(short s, long j) {
        return LongProgression.a.a((long) s, j, -1);
    }

    @NotNull
    public static final LongProgression downTo(long j, short s) {
        return LongProgression.a.a(j, (long) s, -1);
    }

    @NotNull
    public static final LongRange until(long j, byte b2) {
        return new LongRange(j, ((long) b2) - 1);
    }

    @NotNull
    public static final LongRange until(long j, int i) {
        return new LongRange(j, ((long) i) - 1);
    }

    @NotNull
    public static final LongRange until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.a.a();
        }
        return new LongRange((long) i, j - 1);
    }

    @NotNull
    public static final LongRange until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return LongRange.a.a();
        }
        return new LongRange(j, j2 - 1);
    }

    @NotNull
    public static final LongRange until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.a.a();
        }
        return new LongRange((long) s, j - 1);
    }

    @NotNull
    public static final LongRange until(long j, short s) {
        return new LongRange(j, ((long) s) - 1);
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceIn");
        if (t2 == null || t3 == null) {
            if (t2 == null || t.compareTo(t2) >= 0) {
                return (t3 == null || t.compareTo(t3) <= 0) ? t : t3;
            }
            return t2;
        } else if (t2.compareTo(t3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
        } else if (t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 > s3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + s3 + " is less than minimum " + s2 + '.');
        } else if (s < s2) {
            return s2;
        } else {
            return s > s3 ? s3 : s;
        }
    }

    @NotNull
    @SinceKotlin
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull f<T> fVar) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceIn");
        Intrinsics.checkParameterIsNotNull(fVar, "range");
        if (fVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
        } else if (!fVar.a(t, fVar.getStart()) || fVar.a(fVar.getStart(), t)) {
            return (!fVar.a(fVar.getEndInclusive(), t) || fVar.a(t, fVar.getEndInclusive())) ? t : fVar.getEndInclusive();
        } else {
            return fVar.getStart();
        }
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceIn(@NotNull T t, @NotNull g<T> gVar) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceIn");
        Intrinsics.checkParameterIsNotNull(gVar, "range");
        if (gVar instanceof f) {
            return RangesKt.coerceIn(t, (f) gVar);
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (t.compareTo(gVar.getStart()) < 0) {
            return gVar.getStart();
        } else {
            return t.compareTo(gVar.getEndInclusive()) > 0 ? gVar.getEndInclusive() : t;
        }
    }

    @NotNull
    public static final c until(char c2, char c3) {
        if (c3 <= 0) {
            return c.f83630e;
        }
        return new c(c2, (char) (c3 - 1));
    }

    @SinceKotlin
    @InlineOnly
    private static final char random(@NotNull c cVar) {
        return RangesKt.random(cVar, (Random) Random.Default);
    }

    @SinceKotlin
    @InlineOnly
    private static final int random(@NotNull IntRange intRange) {
        return RangesKt.random(intRange, (Random) Random.Default);
    }

    @NotNull
    public static final IntProgression reversed(@NotNull IntProgression intProgression) {
        Intrinsics.checkParameterIsNotNull(intProgression, "$this$reversed");
        return IntProgression.Companion.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    @Nullable
    public static final Byte toByteExactOrNull(double d2) {
        if (d2 < -128.0d || d2 > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) ((int) d2));
    }

    @Nullable
    public static final Integer toIntExactOrNull(double d2) {
        if (d2 < -2.147483648E9d || d2 > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d2);
    }

    @Nullable
    public static final Long toLongExactOrNull(double d2) {
        if (d2 < -9.223372036854776E18d || d2 > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d2);
    }

    @Nullable
    public static final Short toShortExactOrNull(double d2) {
        if (d2 < -32768.0d || d2 > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) ((int) d2));
    }

    @NotNull
    public static final LongProgression reversed(@NotNull LongProgression longProgression) {
        Intrinsics.checkParameterIsNotNull(longProgression, "$this$reversed");
        return LongProgression.a.a(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @Nullable
    public static final Byte toByteExactOrNull(float f2) {
        if (f2 < -128.0f || f2 > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) ((int) f2));
    }

    @Nullable
    public static final Integer toIntExactOrNull(float f2) {
        if (f2 < -2.14748365E9f || f2 > 2.14748365E9f) {
            return null;
        }
        return Integer.valueOf((int) f2);
    }

    @Nullable
    public static final Long toLongExactOrNull(float f2) {
        if (f2 < -9.223372E18f || f2 > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f2);
    }

    @Nullable
    public static final Short toShortExactOrNull(float f2) {
        if (f2 < -32768.0f || f2 > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) ((int) f2));
    }

    @NotNull
    public static final a reversed(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$reversed");
        return a.C0895a.a(aVar.f83624b, aVar.f83623a, -aVar.f83625c);
    }

    @Nullable
    public static final Byte toByteExactOrNull(int i) {
        if (-128 <= i && 127 >= i) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    @Nullable
    public static final Integer toIntExactOrNull(long j) {
        if (-2147483648L <= j && 2147483647L >= j) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    @Nullable
    public static final Short toShortExactOrNull(int i) {
        if (-32768 <= i && 32767 >= i) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @SinceKotlin
    @InlineOnly
    private static final long random(@NotNull LongRange longRange) {
        return RangesKt.random(longRange, (Random) Random.Default);
    }

    @Nullable
    public static final Byte toByteExactOrNull(long j) {
        if (-128 <= j && 127 >= j) {
            return Byte.valueOf((byte) ((int) j));
        }
        return null;
    }

    @Nullable
    public static final Short toShortExactOrNull(long j) {
        if (-32768 <= j && 32767 >= j) {
            return Short.valueOf((short) ((int) j));
        }
        return null;
    }

    @Nullable
    public static final Byte toByteExactOrNull(short s) {
        if (-128 <= s && 127 >= s) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    @NotNull
    public static final IntProgression downTo(byte b2, byte b3) {
        return IntProgression.Companion.fromClosedRange(b2, b3, -1);
    }

    @NotNull
    public static final IntRange until(byte b2, byte b3) {
        return new IntRange(b2, b3 - 1);
    }

    @NotNull
    public static final IntProgression downTo(byte b2, int i) {
        return IntProgression.Companion.fromClosedRange(b2, i, -1);
    }

    @JvmName
    public static final boolean intRangeContains(@NotNull g<Integer> gVar, byte b2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Integer.valueOf(b2));
    }

    @NotNull
    public static final IntRange until(byte b2, short s) {
        return new IntRange(b2, s - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean byteRangeContains(@NotNull g<Byte> gVar, double d2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(d2);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contains(@NotNull IntRange intRange, Integer num) {
        Intrinsics.checkParameterIsNotNull(intRange, "$this$contains");
        if (num == null || !intRange.contains(num.intValue())) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean doubleRangeContains(@NotNull g<Double> gVar, byte b2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Double.valueOf((double) b2));
    }

    @NotNull
    public static final IntProgression downTo(byte b2, short s) {
        return IntProgression.Companion.fromClosedRange(b2, s, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean floatRangeContains(@NotNull g<Float> gVar, byte b2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Float.valueOf((float) b2));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean intRangeContains(@NotNull g<Integer> gVar, double d2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(d2);
        if (intExactOrNull != null) {
            return gVar.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName
    public static final boolean longRangeContains(@NotNull g<Long> gVar, byte b2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Long.valueOf((long) b2));
    }

    @JvmName
    public static final boolean shortRangeContains(@NotNull g<Short> gVar, byte b2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Short.valueOf((short) b2));
    }

    @NotNull
    public static final IntRange until(byte b2, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.a.a();
        }
        return new IntRange(b2, i - 1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean byteRangeContains(@NotNull g<Byte> gVar, float f2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(f2);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contains(@NotNull LongRange longRange, Long l) {
        Intrinsics.checkParameterIsNotNull(longRange, "$this$contains");
        if (l == null || !longRange.contains(l.longValue())) {
            return false;
        }
        return true;
    }

    @JvmName
    public static final boolean doubleRangeContains(@NotNull g<Double> gVar, float f2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Double.valueOf((double) f2));
    }

    @NotNull
    public static final IntProgression downTo(int i, byte b2) {
        return IntProgression.Companion.fromClosedRange(i, b2, -1);
    }

    @JvmName
    public static final boolean floatRangeContains(@NotNull g<Float> gVar, double d2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Float.valueOf((float) d2));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean intRangeContains(@NotNull g<Integer> gVar, float f2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(f2);
        if (intExactOrNull != null) {
            return gVar.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean longRangeContains(@NotNull g<Long> gVar, double d2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Long longExactOrNull = RangesKt.toLongExactOrNull(d2);
        if (longExactOrNull != null) {
            return gVar.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin
    public static final char random(@NotNull c cVar, @NotNull Random random) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            return (char) random.nextInt(cVar.f83623a, cVar.f83624b + 1);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean shortRangeContains(@NotNull g<Short> gVar, double d2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(d2);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final IntProgression step(@NotNull IntProgression intProgression, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(intProgression, "$this$step");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        RangesKt.checkStepIsPositive(z, Integer.valueOf(i));
        IntProgression.Companion companion = IntProgression.Companion;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.fromClosedRange(first, last, i);
    }

    @NotNull
    public static final IntRange until(int i, byte b2) {
        return new IntRange(i, b2 - 1);
    }

    @JvmName
    public static final boolean byteRangeContains(@NotNull g<Byte> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtLeast(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceAtLeast");
        Intrinsics.checkParameterIsNotNull(t2, "minimumValue");
        if (t.compareTo(t2) < 0) {
            return t2;
        }
        return t;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T coerceAtMost(@NotNull T t, @NotNull T t2) {
        Intrinsics.checkParameterIsNotNull(t, "$this$coerceAtMost");
        Intrinsics.checkParameterIsNotNull(t2, "maximumValue");
        if (t.compareTo(t2) > 0) {
            return t2;
        }
        return t;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contains(@NotNull c cVar, Character ch) {
        Intrinsics.checkParameterIsNotNull(cVar, "$this$contains");
        if (ch == null || !cVar.a(ch.charValue())) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean doubleRangeContains(@NotNull g<Double> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Double.valueOf((double) i));
    }

    @NotNull
    public static final IntProgression downTo(int i, int i2) {
        return IntProgression.Companion.fromClosedRange(i, i2, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean floatRangeContains(@NotNull g<Float> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Float.valueOf((float) i));
    }

    @JvmName
    public static final boolean intRangeContains(@NotNull g<Integer> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Integer intExactOrNull = RangesKt.toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return gVar.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean longRangeContains(@NotNull g<Long> gVar, float f2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Long longExactOrNull = RangesKt.toLongExactOrNull(f2);
        if (longExactOrNull != null) {
            return gVar.contains(longExactOrNull);
        }
        return false;
    }

    @SinceKotlin
    public static final int random(@NotNull IntRange intRange, @NotNull Random random) {
        Intrinsics.checkParameterIsNotNull(intRange, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            Intrinsics.checkParameterIsNotNull(random, "$this$nextInt");
            Intrinsics.checkParameterIsNotNull(intRange, "range");
            if (intRange.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + intRange);
            } else if (intRange.getLast() < Integer.MAX_VALUE) {
                return random.nextInt(intRange.getFirst(), intRange.getLast() + 1);
            } else {
                if (intRange.getFirst() > Integer.MIN_VALUE) {
                    return random.nextInt(intRange.getFirst() - 1, intRange.getLast()) + 1;
                }
                return random.nextInt();
            }
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean shortRangeContains(@NotNull g<Short> gVar, float f2) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(f2);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final LongProgression step(@NotNull LongProgression longProgression, long j) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(longProgression, "$this$step");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        RangesKt.checkStepIsPositive(z, Long.valueOf(j));
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j = -j;
        }
        return LongProgression.a.a(first, last, j);
    }

    @NotNull
    public static final IntRange until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return IntRange.a.a();
        }
        return new IntRange(i, i2 - 1);
    }

    @JvmName
    public static final boolean byteRangeContains(@NotNull g<Byte> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean doubleRangeContains(@NotNull g<Double> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Double.valueOf((double) j));
    }

    @NotNull
    public static final IntProgression downTo(int i, short s) {
        return IntProgression.Companion.fromClosedRange(i, s, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean floatRangeContains(@NotNull g<Float> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Float.valueOf((float) j));
    }

    @JvmName
    public static final boolean intRangeContains(@NotNull g<Integer> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Integer.valueOf(s));
    }

    @JvmName
    public static final boolean longRangeContains(@NotNull g<Long> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Long.valueOf((long) i));
    }

    @JvmName
    public static final boolean shortRangeContains(@NotNull g<Short> gVar, int i) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final a step(@NotNull a aVar, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "$this$step");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        RangesKt.checkStepIsPositive(z, Integer.valueOf(i));
        char c2 = aVar.f83623a;
        char c3 = aVar.f83624b;
        if (aVar.f83625c <= 0) {
            i = -i;
        }
        return a.C0895a.a(c2, c3, i);
    }

    @NotNull
    public static final IntRange until(int i, short s) {
        return new IntRange(i, s - 1);
    }

    @JvmName
    public static final boolean byteRangeContains(@NotNull g<Byte> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Byte byteExactOrNull = RangesKt.toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return gVar.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean doubleRangeContains(@NotNull g<Double> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Double.valueOf((double) s));
    }

    @NotNull
    public static final IntProgression downTo(short s, byte b2) {
        return IntProgression.Companion.fromClosedRange(s, b2, -1);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @JvmName
    public static final boolean floatRangeContains(@NotNull g<Float> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Float.valueOf((float) s));
    }

    @JvmName
    public static final boolean longRangeContains(@NotNull g<Long> gVar, short s) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        return gVar.contains(Long.valueOf((long) s));
    }

    @SinceKotlin
    public static final long random(@NotNull LongRange longRange, @NotNull Random random) {
        Intrinsics.checkParameterIsNotNull(longRange, "$this$random");
        Intrinsics.checkParameterIsNotNull(random, "random");
        try {
            Intrinsics.checkParameterIsNotNull(random, "$this$nextLong");
            Intrinsics.checkParameterIsNotNull(longRange, "range");
            if (longRange.isEmpty()) {
                throw new IllegalArgumentException("Cannot get random in empty range: " + longRange);
            } else if (longRange.getLast() < Long.MAX_VALUE) {
                return random.nextLong(longRange.getStart().longValue(), longRange.getEndInclusive().longValue() + 1);
            } else {
                if (longRange.getStart().longValue() > Long.MIN_VALUE) {
                    return random.nextLong(longRange.getStart().longValue() - 1, longRange.getEndInclusive().longValue()) + 1;
                }
                return random.nextLong();
            }
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @JvmName
    public static final boolean shortRangeContains(@NotNull g<Short> gVar, long j) {
        Intrinsics.checkParameterIsNotNull(gVar, "$this$contains");
        Short shortExactOrNull = RangesKt.toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return gVar.contains(shortExactOrNull);
        }
        return false;
    }

    @NotNull
    public static final IntRange until(short s, byte b2) {
        return new IntRange(s, b2 - 1);
    }

    public static final int coerceIn(int i, @NotNull g<Integer> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "range");
        if (gVar instanceof f) {
            return ((Number) RangesKt.coerceIn((T) Integer.valueOf(i), (f) gVar)).intValue();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (i < ((Number) gVar.getStart()).intValue()) {
            return ((Number) gVar.getStart()).intValue();
        } else {
            if (i > ((Number) gVar.getEndInclusive()).intValue()) {
                return ((Number) gVar.getEndInclusive()).intValue();
            }
            return i;
        }
    }

    @NotNull
    public static final IntProgression downTo(short s, int i) {
        return IntProgression.Companion.fromClosedRange(s, i, -1);
    }

    @NotNull
    public static final IntRange until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return IntRange.a.a();
        }
        return new IntRange(s, i - 1);
    }

    @NotNull
    public static final IntProgression downTo(short s, short s2) {
        return IntProgression.Companion.fromClosedRange(s, s2, -1);
    }

    @NotNull
    public static final IntRange until(short s, short s2) {
        return new IntRange(s, s2 - 1);
    }

    public static final long coerceIn(long j, @NotNull g<Long> gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "range");
        if (gVar instanceof f) {
            return ((Number) RangesKt.coerceIn((T) Long.valueOf(j), (f) gVar)).longValue();
        }
        if (gVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + gVar + '.');
        } else if (j < ((Number) gVar.getStart()).longValue()) {
            return ((Number) gVar.getStart()).longValue();
        } else {
            if (j > ((Number) gVar.getEndInclusive()).longValue()) {
                return ((Number) gVar.getEndInclusive()).longValue();
            }
            return j;
        }
    }

    @NotNull
    public static final LongProgression downTo(byte b2, long j) {
        return LongProgression.a.a((long) b2, j, -1);
    }

    @NotNull
    public static final LongRange until(byte b2, long j) {
        if (j <= Long.MIN_VALUE) {
            return LongRange.a.a();
        }
        return new LongRange((long) b2, j - 1);
    }

    public static final byte coerceIn(byte b2, byte b3, byte b4) {
        if (b3 > b4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + b4 + " is less than minimum " + b3 + '.');
        } else if (b2 < b3) {
            return b3;
        } else {
            if (b2 > b4) {
                return b4;
            }
            return b2;
        }
    }

    public static final double coerceIn(double d2, double d3, double d4) {
        if (d3 > d4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
        } else if (d2 < d3) {
            return d3;
        } else {
            if (d2 > d4) {
                return d4;
            }
            return d2;
        }
    }

    public static final float coerceIn(float f2, float f3, float f4) {
        if (f3 > f4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
        } else if (f2 < f3) {
            return f3;
        } else {
            if (f2 > f4) {
                return f4;
            }
            return f2;
        }
    }

    public static final int coerceIn(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final long coerceIn(long j, long j2, long j3) {
        if (j2 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }
}
