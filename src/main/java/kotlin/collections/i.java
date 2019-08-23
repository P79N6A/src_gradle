package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003¢\u0006\u0002\u0010\u0004\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0006\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\b\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\n\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\f\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\r0\u0001*\u00020\u000e\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u0010\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0012\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001*\u00020\u0014\u001aU\u0010\u0015\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0016\u001a\u0002H\u00022\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0002\u0010\u001c\u001a9\u0010\u0015\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0016\u001a\u0002H\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0002\u0010\u001d\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010\u0015\u001a\u00020\u000f*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a2\u0010\u001e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\f¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\b¢\u0006\u0004\b#\u0010$\u001a\"\u0010%\u001a\u00020&\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\b¢\u0006\u0004\b'\u0010(\u001a0\u0010)\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\f¢\u0006\u0002\u0010!\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\f\u001a\u0015\u0010)\u001a\u00020\u0005*\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\f\u001a \u0010*\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\b¢\u0006\u0002\u0010$\u001a\r\u0010*\u001a\u00020\u000f*\u00020\u0006H\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\bH\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\nH\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\fH\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\u000eH\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\u0010H\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\u0012H\b\u001a\r\u0010*\u001a\u00020\u000f*\u00020\u0014H\b\u001a \u0010+\u001a\u00020&\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\b¢\u0006\u0002\u0010(\u001a\r\u0010+\u001a\u00020&*\u00020\u0006H\b\u001a\r\u0010+\u001a\u00020&*\u00020\bH\b\u001a\r\u0010+\u001a\u00020&*\u00020\nH\b\u001a\r\u0010+\u001a\u00020&*\u00020\fH\b\u001a\r\u0010+\u001a\u00020&*\u00020\u000eH\b\u001a\r\u0010+\u001a\u00020&*\u00020\u0010H\b\u001a\r\u0010+\u001a\u00020&*\u00020\u0012H\b\u001a\r\u0010+\u001a\u00020&*\u00020\u0014H\b\u001aQ\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007¢\u0006\u0002\u00101\u001a2\u0010,\u001a\u00020\u0006*\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\b*\u00020\b2\u0006\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\n*\u00020\n2\u0006\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\f*\u00020\f2\u0006\u0010-\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\u0010*\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\u0012*\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a2\u0010,\u001a\u00020\u0014*\u00020\u00142\u0006\u0010-\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\b\b\u0002\u00100\u001a\u00020\u000fH\u0007\u001a$\u00102\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\b¢\u0006\u0002\u00103\u001a.\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u00104\u001a\u00020\u000fH\b¢\u0006\u0002\u00105\u001a\r\u00102\u001a\u00020\u0006*\u00020\u0006H\b\u001a\u0015\u00102\u001a\u00020\u0006*\u00020\u00062\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\b*\u00020\bH\b\u001a\u0015\u00102\u001a\u00020\b*\u00020\b2\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\n*\u00020\nH\b\u001a\u0015\u00102\u001a\u00020\n*\u00020\n2\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\f*\u00020\fH\b\u001a\u0015\u00102\u001a\u00020\f*\u00020\f2\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\u000e*\u00020\u000eH\b\u001a\u0015\u00102\u001a\u00020\u000e*\u00020\u000e2\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\u0010*\u00020\u0010H\b\u001a\u0015\u00102\u001a\u00020\u0010*\u00020\u00102\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\u0012*\u00020\u0012H\b\u001a\u0015\u00102\u001a\u00020\u0012*\u00020\u00122\u0006\u00104\u001a\u00020\u000fH\b\u001a\r\u00102\u001a\u00020\u0014*\u00020\u0014H\b\u001a\u0015\u00102\u001a\u00020\u0014*\u00020\u00142\u0006\u00104\u001a\u00020\u000fH\b\u001a6\u00106\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0004\b7\u00108\u001a\"\u00106\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a\"\u00106\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\b¢\u0006\u0002\b7\u001a5\u00109\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0004\b6\u00108\u001a!\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a!\u00109\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0001¢\u0006\u0002\b6\u001a(\u0010:\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010;\u001a\u00020\u000fH\b¢\u0006\u0002\u0010<\u001a\u0015\u0010:\u001a\u00020\u0005*\u00020\u00062\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\u0007*\u00020\b2\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\t*\u00020\n2\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\u000b*\u00020\f2\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\r*\u00020\u000e2\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\u000f*\u00020\u00102\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\u0011*\u00020\u00122\u0006\u0010;\u001a\u00020\u000fH\b\u001a\u0015\u0010:\u001a\u00020\u0013*\u00020\u00142\u0006\u0010;\u001a\u00020\u000fH\b\u001a7\u0010=\u001a\u00020>\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0016\u001a\u0002H\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0002\u0010?\u001a&\u0010=\u001a\u00020>*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\n2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a&\u0010=\u001a\u00020>*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a-\u0010@\u001a\b\u0012\u0004\u0012\u0002HA0\u0001\"\u0004\b\u0000\u0010A*\u0006\u0012\u0002\b\u00030\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HA0C¢\u0006\u0002\u0010D\u001aA\u0010E\u001a\u0002HF\"\u0010\b\u0000\u0010F*\n\u0012\u0006\b\u0000\u0012\u0002HA0G\"\u0004\b\u0001\u0010A*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010-\u001a\u0002HF2\f\u0010B\u001a\b\u0012\u0004\u0012\u0002HA0C¢\u0006\u0002\u0010H\u001a,\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0016\u001a\u0002H\u0002H\u0002¢\u0006\u0002\u0010J\u001a4\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0010K\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\u0002¢\u0006\u0002\u0010L\u001a2\u0010I\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\f\u0010K\u001a\b\u0012\u0004\u0012\u0002H\u00020MH\u0002¢\u0006\u0002\u0010N\u001a\u0015\u0010I\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0005H\u0002\u001a\u0015\u0010I\u001a\u00020\u0006*\u00020\u00062\u0006\u0010K\u001a\u00020\u0006H\u0002\u001a\u001b\u0010I\u001a\u00020\u0006*\u00020\u00062\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050MH\u0002\u001a\u0015\u0010I\u001a\u00020\b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002\u001a\u0015\u0010I\u001a\u00020\b*\u00020\b2\u0006\u0010K\u001a\u00020\bH\u0002\u001a\u001b\u0010I\u001a\u00020\b*\u00020\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070MH\u0002\u001a\u0015\u0010I\u001a\u00020\n*\u00020\n2\u0006\u0010\u0016\u001a\u00020\tH\u0002\u001a\u0015\u0010I\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0002\u001a\u001b\u0010I\u001a\u00020\n*\u00020\n2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\t0MH\u0002\u001a\u0015\u0010I\u001a\u00020\f*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002\u001a\u0015\u0010I\u001a\u00020\f*\u00020\f2\u0006\u0010K\u001a\u00020\fH\u0002\u001a\u001b\u0010I\u001a\u00020\f*\u00020\f2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000b0MH\u0002\u001a\u0015\u0010I\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\rH\u0002\u001a\u0015\u0010I\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010K\u001a\u00020\u000eH\u0002\u001a\u001b\u0010I\u001a\u00020\u000e*\u00020\u000e2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0MH\u0002\u001a\u0015\u0010I\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000fH\u0002\u001a\u0015\u0010I\u001a\u00020\u0010*\u00020\u00102\u0006\u0010K\u001a\u00020\u0010H\u0002\u001a\u001b\u0010I\u001a\u00020\u0010*\u00020\u00102\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000f0MH\u0002\u001a\u0015\u0010I\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0011H\u0002\u001a\u0015\u0010I\u001a\u00020\u0012*\u00020\u00122\u0006\u0010K\u001a\u00020\u0012H\u0002\u001a\u001b\u0010I\u001a\u00020\u0012*\u00020\u00122\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00110MH\u0002\u001a\u0015\u0010I\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0013H\u0002\u001a\u0015\u0010I\u001a\u00020\u0014*\u00020\u00142\u0006\u0010K\u001a\u00020\u0014H\u0002\u001a\u001b\u0010I\u001a\u00020\u0014*\u00020\u00142\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00130MH\u0002\u001a,\u0010O\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0016\u001a\u0002H\u0002H\b¢\u0006\u0002\u0010J\u001a\u001d\u0010P\u001a\u00020>\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003¢\u0006\u0002\u0010Q\u001a*\u0010P\u001a\u00020>\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020R*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003H\b¢\u0006\u0002\u0010S\u001a1\u0010P\u001a\u00020>\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0002\u0010T\u001a\n\u0010P\u001a\u00020>*\u00020\b\u001a\u001e\u0010P\u001a\u00020>*\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a\n\u0010P\u001a\u00020>*\u00020\n\u001a\u001e\u0010P\u001a\u00020>*\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a\n\u0010P\u001a\u00020>*\u00020\f\u001a\u001e\u0010P\u001a\u00020>*\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a\n\u0010P\u001a\u00020>*\u00020\u000e\u001a\u001e\u0010P\u001a\u00020>*\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a\n\u0010P\u001a\u00020>*\u00020\u0010\u001a\u001e\u0010P\u001a\u00020>*\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a\n\u0010P\u001a\u00020>*\u00020\u0012\u001a\u001e\u0010P\u001a\u00020>*\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a\n\u0010P\u001a\u00020>*\u00020\u0014\u001a\u001e\u0010P\u001a\u00020>*\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u001a9\u0010U\u001a\u00020>\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0019¢\u0006\u0002\u0010V\u001aM\u0010U\u001a\u00020>\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0002\u0010W\u001a-\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u00020Y\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020R*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0003¢\u0006\u0002\u0010Z\u001a?\u0010X\u001a\b\u0012\u0004\u0012\u0002H\u00020Y\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u001a\u0010\u0017\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0018j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0019¢\u0006\u0002\u0010[\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050Y*\u00020\u0006\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00070Y*\u00020\b\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\t0Y*\u00020\n\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000b0Y*\u00020\f\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\r0Y*\u00020\u000e\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000f0Y*\u00020\u0010\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00110Y*\u00020\u0012\u001a\u0010\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00130Y*\u00020\u0014\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u0006¢\u0006\u0002\u0010]\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\b¢\u0006\u0002\u0010^\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0\u0003*\u00020\n¢\u0006\u0002\u0010_\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003*\u00020\f¢\u0006\u0002\u0010`\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\r0\u0003*\u00020\u000e¢\u0006\u0002\u0010a\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003*\u00020\u0010¢\u0006\u0002\u0010b\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\u0012¢\u0006\u0002\u0010c\u001a\u0015\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003*\u00020\u0014¢\u0006\u0002\u0010d¨\u0006e"}, d2 = {"asList", "", "T", "", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "binarySearch", "element", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "fromIndex", "toIndex", "([Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;II)I", "([Ljava/lang/Object;Ljava/lang/Object;II)I", "contentDeepEquals", "other", "contentDeepEqualsInline", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepHashCode", "contentDeepHashCodeInline", "([Ljava/lang/Object;)I", "contentDeepToString", "", "contentDeepToStringInline", "([Ljava/lang/Object;)Ljava/lang/String;", "contentEquals", "contentHashCode", "contentToString", "copyInto", "destination", "destinationOffset", "startIndex", "endIndex", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "copyOf", "([Ljava/lang/Object;)[Ljava/lang/Object;", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRange", "copyOfRangeInline", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "copyOfRangeImpl", "elementAt", "index", "([Ljava/lang/Object;I)Ljava/lang/Object;", "fill", "", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "filterIsInstance", "R", "klass", "Ljava/lang/Class;", "([Ljava/lang/Object;Ljava/lang/Class;)Ljava/util/List;", "filterIsInstanceTo", "C", "", "([Ljava/lang/Object;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "plus", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "elements", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "", "([Ljava/lang/Object;Ljava/util/Collection;)[Ljava/lang/Object;", "plusElement", "sort", "([Ljava/lang/Object;)V", "", "([Ljava/lang/Comparable;)V", "([Ljava/lang/Object;II)V", "sortWith", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "toSortedSet", "Ljava/util/SortedSet;", "([Ljava/lang/Comparable;)Ljava/util/SortedSet;", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/SortedSet;", "toTypedArray", "([Z)[Ljava/lang/Boolean;", "([B)[Ljava/lang/Byte;", "([C)[Ljava/lang/Character;", "([D)[Ljava/lang/Double;", "([F)[Ljava/lang/Float;", "([I)[Ljava/lang/Integer;", "([J)[Ljava/lang/Long;", "([S)[Ljava/lang/Short;", "kotlin-stdlib"}, k = 5, mv = {1, 1, 15}, xi = 1, xs = "kotlin/collections/ArraysKt")
public class i extends h {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Byte;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class a extends d<Byte> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte[] f83459b;

        public final int a() {
            return this.f83459b.length;
        }

        public final boolean isEmpty() {
            if (this.f83459b.length == 0) {
                return true;
            }
            return false;
        }

        a(byte[] bArr) {
            this.f83459b = bArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Byte.valueOf(this.f83459b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Byte)) {
                return false;
            }
            return ArraysKt.contains(this.f83459b, ((Number) obj).byteValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83459b, ((Number) obj).byteValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Byte)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83459b, ((Number) obj).byteValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Short;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class b extends d<Short> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ short[] f83460b;

        public final int a() {
            return this.f83460b.length;
        }

        public final boolean isEmpty() {
            if (this.f83460b.length == 0) {
                return true;
            }
            return false;
        }

        b(short[] sArr) {
            this.f83460b = sArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Short.valueOf(this.f83460b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Short)) {
                return false;
            }
            return ArraysKt.contains(this.f83460b, ((Number) obj).shortValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83460b, ((Number) obj).shortValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Short)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83460b, ((Number) obj).shortValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Integer;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class c extends d<Integer> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f83461b;

        public final int a() {
            return this.f83461b.length;
        }

        public final boolean isEmpty() {
            if (this.f83461b.length == 0) {
                return true;
            }
            return false;
        }

        c(int[] iArr) {
            this.f83461b = iArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Integer.valueOf(this.f83461b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return ArraysKt.contains(this.f83461b, ((Number) obj).intValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83461b, ((Number) obj).intValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83461b, ((Number) obj).intValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Long;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class d extends d<Long> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long[] f83462b;

        public final int a() {
            return this.f83462b.length;
        }

        public final boolean isEmpty() {
            if (this.f83462b.length == 0) {
                return true;
            }
            return false;
        }

        d(long[] jArr) {
            this.f83462b = jArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Long.valueOf(this.f83462b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Long)) {
                return false;
            }
            return ArraysKt.contains(this.f83462b, ((Number) obj).longValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83462b, ((Number) obj).longValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Long)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83462b, ((Number) obj).longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$5", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Float;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class e extends d<Float> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float[] f83463b;

        public final int a() {
            return this.f83463b.length;
        }

        public final boolean isEmpty() {
            if (this.f83463b.length == 0) {
                return true;
            }
            return false;
        }

        e(float[] fArr) {
            this.f83463b = fArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Float.valueOf(this.f83463b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Float)) {
                return false;
            }
            return ArraysKt.contains(this.f83463b, ((Number) obj).floatValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83463b, ((Number) obj).floatValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Float)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83463b, ((Number) obj).floatValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$6", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Double;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class f extends d<Double> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ double[] f83464b;

        public final int a() {
            return this.f83464b.length;
        }

        public final boolean isEmpty() {
            if (this.f83464b.length == 0) {
                return true;
            }
            return false;
        }

        f(double[] dArr) {
            this.f83464b = dArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Double.valueOf(this.f83464b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Double)) {
                return false;
            }
            return ArraysKt.contains(this.f83464b, ((Number) obj).doubleValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83464b, ((Number) obj).doubleValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Double)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83464b, ((Number) obj).doubleValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$7", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "element", "get", "index", "(I)Ljava/lang/Boolean;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class g extends d<Boolean> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean[] f83465b;

        public final int a() {
            return this.f83465b.length;
        }

        public final boolean isEmpty() {
            if (this.f83465b.length == 0) {
                return true;
            }
            return false;
        }

        g(boolean[] zArr) {
            this.f83465b = zArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Boolean.valueOf(this.f83465b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return ArraysKt.contains(this.f83465b, ((Boolean) obj).booleanValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83465b, ((Boolean) obj).booleanValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Boolean)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83465b, ((Boolean) obj).booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$8", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Character;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    public static final class h extends d<Character> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ char[] f83466b;

        public final int a() {
            return this.f83466b.length;
        }

        public final boolean isEmpty() {
            if (this.f83466b.length == 0) {
                return true;
            }
            return false;
        }

        h(char[] cArr) {
            this.f83466b = cArr;
        }

        public final /* synthetic */ Object get(int i) {
            return Character.valueOf(this.f83466b[i]);
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Character)) {
                return false;
            }
            return ArraysKt.contains(this.f83466b, ((Character) obj).charValue());
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return ArraysKt.indexOf(this.f83466b, ((Character) obj).charValue());
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            return ArraysKt.lastIndexOf(this.f83466b, ((Character) obj).charValue());
        }
    }

    public static /* synthetic */ boolean[] copyInto$default(boolean[] zArr, boolean[] zArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = zArr.length;
        }
        return ArraysKt.copyInto(zArr, zArr2, i, i2, i3);
    }

    @InlineOnly
    private static final <T> T[] copyOf(@NotNull T[] tArr) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final short[] copyOf(@NotNull short[] sArr) {
        short[] copyOf = Arrays.copyOf(sArr, sArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final long[] copyOf(@NotNull long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final boolean[] copyOf(@NotNull boolean[] zArr) {
        boolean[] copyOf = Arrays.copyOf(zArr, zArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @InlineOnly
    private static final short[] copyOf(@NotNull short[] sArr, int i) {
        short[] copyOf = Arrays.copyOf(sArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final int[] copyOf(@NotNull int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final long[] copyOf(@NotNull long[] jArr, int i) {
        long[] copyOf = Arrays.copyOf(jArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final boolean[] copyOf(@NotNull boolean[] zArr, int i) {
        boolean[] copyOf = Arrays.copyOf(zArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final <T> T[] copyOf(@NotNull T[] tArr, int i) {
        T[] copyOf = Arrays.copyOf(tArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    @JvmName
    private static final short[] copyOfRangeInline(@NotNull short[] sArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(sArr, i, i2);
        }
        if (i2 <= sArr.length) {
            short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + sArr.length);
    }

    @InlineOnly
    @JvmName
    private static final boolean[] copyOfRangeInline(@NotNull boolean[] zArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(zArr, i, i2);
        }
        if (i2 <= zArr.length) {
            boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + zArr.length);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final boolean[] copyOfRange(@NotNull boolean[] zArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, zArr.length);
        boolean[] copyOfRange = Arrays.copyOfRange(zArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, T t) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$plus");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, short s) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$plus");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, length + 1);
        copyOf[length] = s;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] iArr, int i) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$plus");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] jArr, long j) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$plus");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        copyOf[length] = j;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, float f2) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$plus");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        copyOf[length] = f2;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, boolean z) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$plus");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        copyOf[length] = z;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull Collection<? extends T> collection) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, collection.size() + length);
        for (T t : collection) {
            copyOf[length] = t;
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, @NotNull Collection<Short> collection) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = sArr.length;
        short[] copyOf = Arrays.copyOf(sArr, collection.size() + length);
        for (Short shortValue : collection) {
            copyOf[length] = shortValue.shortValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, collection.size() + length);
        for (Integer intValue : collection) {
            copyOf[length] = intValue.intValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] jArr, @NotNull Collection<Long> collection) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, collection.size() + length);
        for (Long longValue : collection) {
            copyOf[length] = longValue.longValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull Collection<Float> collection) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, collection.size() + length);
        for (Float floatValue : collection) {
            copyOf[length] = floatValue.floatValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull Collection<Boolean> collection) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, collection.size() + length);
        for (Boolean booleanValue : collection) {
            copyOf[length] = booleanValue.booleanValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final <T> T[] plus(@NotNull T[] tArr, @NotNull T[] tArr2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final short[] plus(@NotNull short[] sArr, @NotNull short[] sArr2) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(sArr2, "elements");
        int length = sArr.length;
        int length2 = sArr2.length;
        short[] copyOf = Arrays.copyOf(sArr, length + length2);
        System.arraycopy(sArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final int[] plus(@NotNull int[] iArr, @NotNull int[] iArr2) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final long[] plus(@NotNull long[] jArr, @NotNull long[] jArr2) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final float[] plus(@NotNull float[] fArr, @NotNull float[] fArr2) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull double[] dArr2) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final boolean[] plus(@NotNull boolean[] zArr, @NotNull boolean[] zArr2) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    public static final void sort(@NotNull long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$sort");
        if (jArr.length > 1) {
            Arrays.sort(jArr);
        }
    }

    public static final void sort(@NotNull short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$sort");
        if (sArr.length > 1) {
            Arrays.sort(sArr);
        }
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> void sort(@NotNull T[] tArr) {
        if (tArr != null) {
            ArraysKt.sort((T[]) (Object[]) tArr);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    public static final <T> void sort(@NotNull T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$sort");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void sort(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$sort");
        Arrays.sort(tArr, i, i2);
    }

    public static final void sort(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$sort");
        Arrays.sort(sArr, i, i2);
    }

    public static final void sort(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$sort");
        Arrays.sort(iArr, i, i2);
    }

    public static final void sort(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$sort");
        Arrays.sort(jArr, i, i2);
    }

    @NotNull
    public static final SortedSet<Short> toSortedSet(@NotNull short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(sArr, new TreeSet());
    }

    @NotNull
    public static final SortedSet<Boolean> toSortedSet(@NotNull boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(zArr, new TreeSet());
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    @NotNull
    public static final List<Byte> asList(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$asList");
        return new a<>(bArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull char[] cArr) {
        return Arrays.hashCode(cArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull byte[] bArr) {
        String arrays = Arrays.toString(bArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @InlineOnly
    private static final byte[] copyOf(@NotNull byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final void sort(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$sort");
        if (bArr.length > 1) {
            Arrays.sort(bArr);
        }
    }

    @NotNull
    public static final List<Character> asList(@NotNull char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$asList");
        return new h<>(cArr);
    }

    @SinceKotlin
    @InlineOnly
    @JvmName
    private static final <T> int contentDeepHashCodeInline(@NotNull T[] tArr) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.contentDeepHashCode(tArr);
        }
        return Arrays.deepHashCode(tArr);
    }

    @SinceKotlin
    @InlineOnly
    @JvmName
    private static final <T> String contentDeepToStringInline(@NotNull T[] tArr) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.contentDeepToString(tArr);
        }
        String deepToString = Arrays.deepToString(tArr);
        Intrinsics.checkExpressionValueIsNotNull(deepToString, "java.util.Arrays.deepToString(this)");
        return deepToString;
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull char[] cArr) {
        String arrays = Arrays.toString(cArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @NotNull
    public static final SortedSet<Byte> toSortedSet(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(bArr, new TreeSet());
    }

    @NotNull
    public static final Boolean[] toTypedArray(@NotNull boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$toTypedArray");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    @NotNull
    public static final List<Double> asList(@NotNull double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$asList");
        return new f<>(dArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull double[] dArr) {
        String arrays = Arrays.toString(dArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @InlineOnly
    private static final char[] copyOf(@NotNull char[] cArr) {
        char[] copyOf = Arrays.copyOf(cArr, cArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final void sort(@NotNull char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$sort");
        if (cArr.length > 1) {
            Arrays.sort(cArr);
        }
    }

    @NotNull
    public static final SortedSet<Character> toSortedSet(@NotNull char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(cArr, new TreeSet());
    }

    @NotNull
    public static final Byte[] toTypedArray(@NotNull byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$toTypedArray");
        Byte[] bArr2 = new Byte[bArr.length];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    @NotNull
    public static final List<Float> asList(@NotNull float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$asList");
        return new e<>(fArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull float[] fArr) {
        String arrays = Arrays.toString(fArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @NotNull
    public static final SortedSet<Double> toSortedSet(@NotNull double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(dArr, new TreeSet());
    }

    @NotNull
    public static final Character[] toTypedArray(@NotNull char[] cArr) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$toTypedArray");
        Character[] chArr = new Character[cArr.length];
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            chArr[i] = Character.valueOf(cArr[i]);
        }
        return chArr;
    }

    @NotNull
    public static final List<Integer> asList(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$asList");
        return new c<>(iArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull int[] iArr) {
        String arrays = Arrays.toString(iArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @InlineOnly
    private static final double[] copyOf(@NotNull double[] dArr) {
        double[] copyOf = Arrays.copyOf(dArr, dArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final void sort(@NotNull double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$sort");
        if (dArr.length > 1) {
            Arrays.sort(dArr);
        }
    }

    @NotNull
    public static final SortedSet<Float> toSortedSet(@NotNull float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(fArr, new TreeSet());
    }

    @NotNull
    public static final Double[] toTypedArray(@NotNull double[] dArr) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$toTypedArray");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    @NotNull
    public static final List<Long> asList(@NotNull long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$asList");
        return new d<>(jArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final <T> int contentHashCode(@NotNull T[] tArr) {
        return Arrays.hashCode(tArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull long[] jArr) {
        String arrays = Arrays.toString(jArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @NotNull
    public static final SortedSet<Integer> toSortedSet(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(iArr, new TreeSet());
    }

    @NotNull
    public static final Float[] toTypedArray(@NotNull float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$toTypedArray");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    @NotNull
    public static final <T> List<T> asList(@NotNull T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        Intrinsics.checkExpressionValueIsNotNull(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final <T> String contentToString(@NotNull T[] tArr) {
        String arrays = Arrays.toString(tArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @InlineOnly
    private static final float[] copyOf(@NotNull float[] fArr) {
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final void sort(@NotNull float[] fArr) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$sort");
        if (fArr.length > 1) {
            Arrays.sort(fArr);
        }
    }

    @NotNull
    public static final SortedSet<Long> toSortedSet(@NotNull long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(jArr, new TreeSet());
    }

    @NotNull
    public static final Integer[] toTypedArray(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$toTypedArray");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @NotNull
    public static final List<Short> asList(@NotNull short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$asList");
        return new b<>(sArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final int contentHashCode(@NotNull boolean[] zArr) {
        return Arrays.hashCode(zArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull short[] sArr) {
        String arrays = Arrays.toString(sArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull T[] tArr) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toSortedSet");
        return (SortedSet) ArraysKt.toCollection(tArr, new TreeSet());
    }

    @NotNull
    public static final Long[] toTypedArray(@NotNull long[] jArr) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$toTypedArray");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    @NotNull
    public static final List<Boolean> asList(@NotNull boolean[] zArr) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$asList");
        return new g<>(zArr);
    }

    @SinceKotlin
    @InlineOnly
    private static final String contentToString(@NotNull boolean[] zArr) {
        String arrays = Arrays.toString(zArr);
        Intrinsics.checkExpressionValueIsNotNull(arrays, "java.util.Arrays.toString(this)");
        return arrays;
    }

    @InlineOnly
    private static final int[] copyOf(@NotNull int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final void sort(@NotNull int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$sort");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    @NotNull
    public static final Short[] toTypedArray(@NotNull short[] sArr) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$toTypedArray");
        Short[] shArr = new Short[sArr.length];
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            shArr[i] = Short.valueOf(sArr[i]);
        }
        return shArr;
    }

    @InlineOnly
    private static final byte elementAt(@NotNull byte[] bArr, int i) {
        return bArr[i];
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @InlineOnly
    private static final char elementAt(@NotNull char[] cArr, int i) {
        return cArr[i];
    }

    @InlineOnly
    private static final <T> T[] plusElement(@NotNull T[] tArr, T t) {
        return ArraysKt.plus(tArr, t);
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    @InlineOnly
    private static final double elementAt(@NotNull double[] dArr, int i) {
        return dArr[i];
    }

    @SinceKotlin
    @InlineOnly
    @JvmName
    private static final <T> boolean contentDeepEqualsInline(@NotNull T[] tArr, T[] tArr2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.contentDeepEquals(tArr, tArr2);
        }
        return Arrays.deepEquals(tArr, tArr2);
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    @InlineOnly
    private static final byte[] copyOf(@NotNull byte[] bArr, int i) {
        byte[] copyOf = Arrays.copyOf(bArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final float elementAt(@NotNull float[] fArr, int i) {
        return fArr[i];
    }

    @NotNull
    public static final <R> List<R> filterIsInstance(@NotNull Object[] objArr, @NotNull Class<R> cls) {
        Intrinsics.checkParameterIsNotNull(objArr, "$this$filterIsInstance");
        Intrinsics.checkParameterIsNotNull(cls, "klass");
        return (List) ArraysKt.filterIsInstanceTo(objArr, new ArrayList(), cls);
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] bArr, byte b2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$plus");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + 1);
        copyOf[length] = b2;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    public static final <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$sortWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    @InlineOnly
    private static final int elementAt(@NotNull int[] iArr, int i) {
        return iArr[i];
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] bArr, @NotNull Collection<Byte> collection) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, collection.size() + length);
        for (Byte byteValue : collection) {
            copyOf[length] = byteValue.byteValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    @InlineOnly
    private static final char[] copyOf(@NotNull char[] cArr, int i) {
        char[] copyOf = Arrays.copyOf(cArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final long elementAt(@NotNull long[] jArr, int i) {
        return jArr[i];
    }

    @NotNull
    public static final byte[] plus(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    @InlineOnly
    private static final <T> T elementAt(@NotNull T[] tArr, int i) {
        return tArr[i];
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, char c2) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$plus");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, length + 1);
        copyOf[length] = c2;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @SinceKotlin
    @InlineOnly
    private static final <T> boolean contentEquals(@NotNull T[] tArr, T[] tArr2) {
        return Arrays.equals(tArr, tArr2);
    }

    @InlineOnly
    private static final double[] copyOf(@NotNull double[] dArr, int i) {
        double[] copyOf = Arrays.copyOf(dArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @InlineOnly
    private static final short elementAt(@NotNull short[] sArr, int i) {
        return sArr[i];
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull Collection<Character> collection) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = cArr.length;
        char[] copyOf = Arrays.copyOf(cArr, collection.size() + length);
        for (Character charValue : collection) {
            copyOf[length] = charValue.charValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    @InlineOnly
    private static final boolean elementAt(@NotNull boolean[] zArr, int i) {
        return zArr[i];
    }

    @NotNull
    public static final char[] plus(@NotNull char[] cArr, @NotNull char[] cArr2) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(cArr2, "elements");
        int length = cArr.length;
        int length2 = cArr2.length;
        char[] copyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(cArr2, 0, copyOf, length, length2);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @SinceKotlin
    @InlineOnly
    private static final boolean contentEquals(@NotNull boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    @InlineOnly
    private static final float[] copyOf(@NotNull float[] fArr, int i) {
        float[] copyOf = Arrays.copyOf(fArr, i);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, double d2) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$plus");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, length + 1);
        copyOf[length] = d2;
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final double[] plus(@NotNull double[] dArr, @NotNull Collection<Double> collection) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$plus");
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        int length = dArr.length;
        double[] copyOf = Arrays.copyOf(dArr, collection.size() + length);
        for (Double doubleValue : collection) {
            copyOf[length] = doubleValue.doubleValue();
            length++;
        }
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "result");
        return copyOf;
    }

    @NotNull
    public static final <T> SortedSet<T> toSortedSet(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$toSortedSet");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return (SortedSet) ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final byte[] copyOfRange(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void sort(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$sort");
        Arrays.sort(bArr, i, i2);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final char[] copyOfRange(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final byte[] copyOfRangeInline(@NotNull byte[] bArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(bArr, i, i2);
        }
        if (i2 <= bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + bArr.length);
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Object[] objArr, @NotNull C c2, @NotNull Class<R> cls) {
        Intrinsics.checkParameterIsNotNull(objArr, "$this$filterIsInstanceTo");
        Intrinsics.checkParameterIsNotNull(c2, "destination");
        Intrinsics.checkParameterIsNotNull(cls, "klass");
        for (Object obj : objArr) {
            if (cls.isInstance(obj)) {
                c2.add(obj);
            }
        }
        return c2;
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final double[] copyOfRange(@NotNull double[] dArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, dArr.length);
        double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final char[] copyOfRangeInline(@NotNull char[] cArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(cArr, i, i2);
        }
        if (i2 <= cArr.length) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + cArr.length);
    }

    public static final void sort(@NotNull char[] cArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$sort");
        Arrays.sort(cArr, i, i2);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final float[] copyOfRange(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final double[] copyOfRangeInline(@NotNull double[] dArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(dArr, i, i2);
        }
        if (i2 <= dArr.length) {
            double[] copyOfRange = Arrays.copyOfRange(dArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + dArr.length);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final int[] copyOfRange(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, iArr.length);
        int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final float[] copyOfRangeInline(@NotNull float[] fArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(fArr, i, i2);
        }
        if (i2 <= fArr.length) {
            float[] copyOfRange = Arrays.copyOfRange(fArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + fArr.length);
    }

    public static final void sort(@NotNull double[] dArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$sort");
        Arrays.sort(dArr, i, i2);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final long[] copyOfRange(@NotNull long[] jArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, jArr.length);
        long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final int[] copyOfRangeInline(@NotNull int[] iArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(iArr, i, i2);
        }
        if (i2 <= iArr.length) {
            int[] copyOfRange = Arrays.copyOfRange(iArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + iArr.length);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final <T> T[] copyOfRange(@NotNull T[] tArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final long[] copyOfRangeInline(@NotNull long[] jArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(jArr, i, i2);
        }
        if (i2 <= jArr.length) {
            long[] copyOfRange = Arrays.copyOfRange(jArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + jArr.length);
    }

    public static final void sort(@NotNull float[] fArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$sort");
        Arrays.sort(fArr, i, i2);
    }

    @SinceKotlin
    @PublishedApi
    @NotNull
    @JvmName
    public static final short[] copyOfRange(@NotNull short[] sArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$copyOfRangeImpl");
        ArraysKt.copyOfRangeToIndexCheck(i2, sArr.length);
        short[] copyOfRange = Arrays.copyOfRange(sArr, i, i2);
        Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    @InlineOnly
    @JvmName
    private static final <T> T[] copyOfRangeInline(@NotNull T[] tArr, int i, int i2) {
        if (kotlin.internal.b.a(1, 3, 0)) {
            return ArraysKt.copyOfRange(tArr, i, i2);
        }
        if (i2 <= tArr.length) {
            T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
            Intrinsics.checkExpressionValueIsNotNull(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex: " + i2 + ", size: " + tArr.length);
    }

    public static final int binarySearch(@NotNull byte[] bArr, byte b2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$binarySearch");
        return Arrays.binarySearch(bArr, i, i2, b2);
    }

    public static final void fill(@NotNull byte[] bArr, byte b2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$fill");
        Arrays.fill(bArr, i, i2, b2);
    }

    public static final <T> void sortWith(@NotNull T[] tArr, @NotNull Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$sortWith");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        Arrays.sort(tArr, i, i2, comparator);
    }

    public static final int binarySearch(@NotNull char[] cArr, char c2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$binarySearch");
        return Arrays.binarySearch(cArr, i, i2, c2);
    }

    public static final void fill(@NotNull char[] cArr, char c2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$fill");
        Arrays.fill(cArr, i, i2, c2);
    }

    public static final int binarySearch(@NotNull double[] dArr, double d2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$binarySearch");
        return Arrays.binarySearch(dArr, i, i2, d2);
    }

    public static final void fill(@NotNull double[] dArr, double d2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$fill");
        Arrays.fill(dArr, i, i2, d2);
    }

    public static final int binarySearch(@NotNull float[] fArr, float f2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$binarySearch");
        return Arrays.binarySearch(fArr, i, i2, f2);
    }

    public static final void fill(@NotNull float[] fArr, float f2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$fill");
        Arrays.fill(fArr, i, i2, f2);
    }

    public static final int binarySearch(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$binarySearch");
        return Arrays.binarySearch(iArr, i2, i3, i);
    }

    public static final void fill(@NotNull int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$fill");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static final int binarySearch(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$binarySearch");
        return Arrays.binarySearch(jArr, i, i2, j);
    }

    public static final void fill(@NotNull long[] jArr, long j, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$fill");
        Arrays.fill(jArr, i, i2, j);
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$binarySearch");
        return Arrays.binarySearch(tArr, i, i2, t);
    }

    public static final <T> void fill(@NotNull T[] tArr, T t, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$fill");
        Arrays.fill(tArr, i, i2, t);
    }

    public static final void fill(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$fill");
        Arrays.fill(sArr, i, i2, s);
    }

    public static final int binarySearch(@NotNull short[] sArr, short s, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$binarySearch");
        return Arrays.binarySearch(sArr, i, i2, s);
    }

    public static final void fill(@NotNull boolean[] zArr, boolean z, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$fill");
        Arrays.fill(zArr, i, i2, z);
    }

    @NotNull
    @SinceKotlin
    public static final byte[] copyInto(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(bArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static /* synthetic */ void sort$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        ArraysKt.sort(bArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final char[] copyInto(@NotNull char[] cArr, @NotNull char[] cArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(cArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(cArr2, "destination");
        System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
        return cArr2;
    }

    public static /* synthetic */ void sort$default(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        ArraysKt.sort(cArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final double[] copyInto(@NotNull double[] dArr, @NotNull double[] dArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(dArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(dArr2, "destination");
        System.arraycopy(dArr, i2, dArr2, i, i3 - i2);
        return dArr2;
    }

    public static /* synthetic */ void sort$default(double[] dArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = dArr.length;
        }
        ArraysKt.sort(dArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final float[] copyInto(@NotNull float[] fArr, @NotNull float[] fArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(fArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static /* synthetic */ void sort$default(float[] fArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = fArr.length;
        }
        ArraysKt.sort(fArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final int[] copyInto(@NotNull int[] iArr, @NotNull int[] iArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(iArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static /* synthetic */ void sort$default(int[] iArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = iArr.length;
        }
        ArraysKt.sort(iArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final long[] copyInto(@NotNull long[] jArr, @NotNull long[] jArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(jArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static /* synthetic */ void sort$default(long[] jArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = jArr.length;
        }
        ArraysKt.sort(jArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final <T> T[] copyInto(@NotNull T[] tArr, @NotNull T[] tArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ void sort$default(Object[] objArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = objArr.length;
        }
        ArraysKt.sort((T[]) objArr, i, i2);
    }

    public static final <T> int binarySearch(@NotNull T[] tArr, T t, @NotNull Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(tArr, "$this$binarySearch");
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        return Arrays.binarySearch(tArr, i, i2, t, comparator);
    }

    @NotNull
    @SinceKotlin
    public static final short[] copyInto(@NotNull short[] sArr, @NotNull short[] sArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(sArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(sArr2, "destination");
        System.arraycopy(sArr, i2, sArr2, i, i3 - i2);
        return sArr2;
    }

    public static /* synthetic */ void sort$default(short[] sArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = sArr.length;
        }
        ArraysKt.sort(sArr, i, i2);
    }

    @NotNull
    @SinceKotlin
    public static final boolean[] copyInto(@NotNull boolean[] zArr, @NotNull boolean[] zArr2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(zArr, "$this$copyInto");
        Intrinsics.checkParameterIsNotNull(zArr2, "destination");
        System.arraycopy(zArr, i2, zArr2, i, i3 - i2);
        return zArr2;
    }

    public static /* synthetic */ int binarySearch$default(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return ArraysKt.binarySearch(bArr, b2, i, i2);
    }

    public static /* synthetic */ void fill$default(byte[] bArr, byte b2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        ArraysKt.fill(bArr, b2, i, i2);
    }

    public static /* synthetic */ void sortWith$default(Object[] objArr, Comparator comparator, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        ArraysKt.sortWith(objArr, comparator, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(char[] cArr, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        return ArraysKt.binarySearch(cArr, c2, i, i2);
    }

    public static /* synthetic */ void fill$default(char[] cArr, char c2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = cArr.length;
        }
        ArraysKt.fill(cArr, c2, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(double[] dArr, double d2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        return ArraysKt.binarySearch(dArr, d2, i, i2);
    }

    public static /* synthetic */ void fill$default(double[] dArr, double d2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = dArr.length;
        }
        ArraysKt.fill(dArr, d2, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(float[] fArr, float f2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        return ArraysKt.binarySearch(fArr, f2, i, i2);
    }

    public static /* synthetic */ void fill$default(float[] fArr, float f2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = fArr.length;
        }
        ArraysKt.fill(fArr, f2, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return ArraysKt.binarySearch(iArr, i, i2, i3);
    }

    public static /* synthetic */ void fill$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        ArraysKt.fill(iArr, i, i2, i3);
    }

    public static /* synthetic */ int binarySearch$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return ArraysKt.binarySearch(jArr, j, i, i2);
    }

    public static /* synthetic */ void fill$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        ArraysKt.fill(jArr, j, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        return ArraysKt.binarySearch((T[]) objArr, (T) obj, i, i2);
    }

    public static /* synthetic */ void fill$default(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        ArraysKt.fill((T[]) objArr, (T) obj, i, i2);
    }

    public static /* synthetic */ void fill$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        ArraysKt.fill(sArr, s, i, i2);
    }

    public static /* synthetic */ int binarySearch$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return ArraysKt.binarySearch(sArr, s, i, i2);
    }

    public static /* synthetic */ void fill$default(boolean[] zArr, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = zArr.length;
        }
        ArraysKt.fill(zArr, z, i, i2);
    }

    public static /* synthetic */ byte[] copyInto$default(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        return ArraysKt.copyInto(bArr, bArr2, i, i2, i3);
    }

    public static /* synthetic */ char[] copyInto$default(char[] cArr, char[] cArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = cArr.length;
        }
        return ArraysKt.copyInto(cArr, cArr2, i, i2, i3);
    }

    public static /* synthetic */ double[] copyInto$default(double[] dArr, double[] dArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = dArr.length;
        }
        return ArraysKt.copyInto(dArr, dArr2, i, i2, i3);
    }

    public static /* synthetic */ float[] copyInto$default(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        return ArraysKt.copyInto(fArr, fArr2, i, i2, i3);
    }

    public static /* synthetic */ int[] copyInto$default(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        return ArraysKt.copyInto(iArr, iArr2, i, i2, i3);
    }

    public static /* synthetic */ long[] copyInto$default(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        return ArraysKt.copyInto(jArr, jArr2, i, i2, i3);
    }

    public static /* synthetic */ int binarySearch$default(Object[] objArr, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        return ArraysKt.binarySearch(objArr, obj, comparator, i, i2);
    }

    public static /* synthetic */ Object[] copyInto$default(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return ArraysKt.copyInto((T[]) objArr, (T[]) objArr2, i, i2, i3);
    }

    public static /* synthetic */ short[] copyInto$default(short[] sArr, short[] sArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sArr.length;
        }
        return ArraysKt.copyInto(sArr, sArr2, i, i2, i3);
    }
}
