package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.widget.Space;
import android.support.v7.gridlayout.R$styleable;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GridLayout extends ViewGroup {
    private static final int ALIGNMENT_MODE = 0;
    public static final Alignment BASELINE = new Alignment() {
        /* access modifiers changed from: package-private */
        public final String getDebugString() {
            return "BASELINE";
        }

        /* access modifiers changed from: package-private */
        public final int getGravityOffset(View view, int i) {
            return 0;
        }

        public final Bounds getBounds() {
            return new Bounds() {
                private int size;

                /* access modifiers changed from: protected */
                public void reset() {
                    super.reset();
                    this.size = Integer.MIN_VALUE;
                }

                /* access modifiers changed from: protected */
                public int size(boolean z) {
                    return Math.max(super.size(z), this.size);
                }

                /* access modifiers changed from: protected */
                public void include(int i, int i2) {
                    super.include(i, i2);
                    this.size = Math.max(this.size, i + i2);
                }

                /* access modifiers changed from: protected */
                public int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
                    return Math.max(0, super.getOffset(gridLayout, view, alignment, i, z));
                }
            };
        }

        public final int getAlignmentValue(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                baseline = Integer.MIN_VALUE;
            }
            return baseline;
        }
    };
    public static final Alignment BOTTOM = TRAILING;
    public static final Alignment CENTER = new Alignment() {
        public final int getAlignmentValue(View view, int i, int i2) {
            return i >> 1;
        }

        /* access modifiers changed from: package-private */
        public final String getDebugString() {
            return "CENTER";
        }

        /* access modifiers changed from: package-private */
        public final int getGravityOffset(View view, int i) {
            return i >> 1;
        }
    };
    private static final int COLUMN_COUNT = 1;
    private static final int COLUMN_ORDER_PRESERVED = 2;
    public static final Alignment END = TRAILING;
    public static final Alignment FILL = new Alignment() {
        public final int getAlignmentValue(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final String getDebugString() {
            return "FILL";
        }

        /* access modifiers changed from: package-private */
        public final int getGravityOffset(View view, int i) {
            return 0;
        }

        public final int getSizeInCell(View view, int i, int i2) {
            return i2;
        }
    };
    private static final Alignment LEADING = new Alignment() {
        public final int getAlignmentValue(View view, int i, int i2) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public final String getDebugString() {
            return "LEADING";
        }

        /* access modifiers changed from: package-private */
        public final int getGravityOffset(View view, int i) {
            return 0;
        }
    };
    public static final Alignment LEFT = createSwitchingAlignment(START, END);
    static final Printer LOG_PRINTER = new LogPrinter(3, GridLayout.class.getName());
    static final Printer NO_PRINTER = new Printer() {
        public final void println(String str) {
        }
    };
    private static final int ORIENTATION = 3;
    public static final Alignment RIGHT = createSwitchingAlignment(END, START);
    private static final int ROW_COUNT = 4;
    private static final int ROW_ORDER_PRESERVED = 5;
    public static final Alignment START = LEADING;
    public static final Alignment TOP = LEADING;
    private static final Alignment TRAILING = new Alignment() {
        public final int getAlignmentValue(View view, int i, int i2) {
            return i;
        }

        /* access modifiers changed from: package-private */
        public final String getDebugString() {
            return "TRAILING";
        }

        /* access modifiers changed from: package-private */
        public final int getGravityOffset(View view, int i) {
            return i;
        }
    };
    static final Alignment UNDEFINED_ALIGNMENT = new Alignment() {
        public final int getAlignmentValue(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public final String getDebugString() {
            return "UNDEFINED";
        }

        /* access modifiers changed from: package-private */
        public final int getGravityOffset(View view, int i) {
            return Integer.MIN_VALUE;
        }
    };
    private static final int USE_DEFAULT_MARGINS = 6;
    int mAlignmentMode;
    int mDefaultGap;
    final Axis mHorizontalAxis;
    int mLastLayoutParamsHashCode;
    int mOrientation;
    Printer mPrinter;
    boolean mUseDefaultMargins;
    final Axis mVerticalAxis;

    public static abstract class Alignment {
        /* access modifiers changed from: package-private */
        public abstract int getAlignmentValue(View view, int i, int i2);

        /* access modifiers changed from: package-private */
        public abstract String getDebugString();

        /* access modifiers changed from: package-private */
        public abstract int getGravityOffset(View view, int i);

        /* access modifiers changed from: package-private */
        public int getSizeInCell(View view, int i, int i2) {
            return i;
        }

        Alignment() {
        }

        /* access modifiers changed from: package-private */
        public Bounds getBounds() {
            return new Bounds();
        }

        public String toString() {
            return "Alignment:" + getDebugString();
        }
    }

    static final class Arc {
        public final Interval span;
        public boolean valid = true;
        public final MutableInt value;

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.span);
            sb.append(" ");
            if (!this.valid) {
                str = "+>";
            } else {
                str = "->";
            }
            sb.append(str);
            sb.append(" ");
            sb.append(this.value);
            return sb.toString();
        }

        public Arc(Interval interval, MutableInt mutableInt) {
            this.span = interval;
            this.value = mutableInt;
        }
    }

    static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        public final PackedMap<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance(this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance(this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            return new PackedMap<>(objArr, objArr2);
        }

        private Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static <K, V> Assoc<K, V> of(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public final void put(K k, V v) {
            add(Pair.create(k, v));
        }
    }

    final class Axis {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        public Arc[] arcs;
        public boolean arcsValid;
        PackedMap<Interval, MutableInt> backwardLinks;
        public boolean backwardLinksValid;
        public int definedCount = Integer.MIN_VALUE;
        public int[] deltas;
        PackedMap<Interval, MutableInt> forwardLinks;
        public boolean forwardLinksValid;
        PackedMap<Spec, Bounds> groupBounds;
        public boolean groupBoundsValid;
        public boolean hasWeights;
        public boolean hasWeightsValid;
        public final boolean horizontal;
        public int[] leadingMargins;
        public boolean leadingMarginsValid;
        public int[] locations;
        public boolean locationsValid;
        private int maxIndex = Integer.MIN_VALUE;
        boolean orderPreserved = true;
        private MutableInt parentMax = new MutableInt(-100000);
        private MutableInt parentMin = new MutableInt(0);
        public int[] trailingMargins;
        public boolean trailingMarginsValid;

        static {
            Class<GridLayout> cls = GridLayout.class;
        }

        public final boolean isOrderPreserved() {
            return this.orderPreserved;
        }

        private void computeArcs() {
            getForwardLinks();
            getBackwardLinks();
        }

        private boolean hasWeights() {
            if (!this.hasWeightsValid) {
                this.hasWeights = computeHasWeights();
                this.hasWeightsValid = true;
            }
            return this.hasWeights;
        }

        public final int getCount() {
            return Math.max(this.definedCount, getMaxIndex());
        }

        public final void invalidateValues() {
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
        }

        private PackedMap<Interval, MutableInt> getBackwardLinks() {
            if (this.backwardLinks == null) {
                this.backwardLinks = createLinks(false);
            }
            if (!this.backwardLinksValid) {
                computeLinks(this.backwardLinks, false);
                this.backwardLinksValid = true;
            }
            return this.backwardLinks;
        }

        private PackedMap<Interval, MutableInt> getForwardLinks() {
            if (this.forwardLinks == null) {
                this.forwardLinks = createLinks(true);
            }
            if (!this.forwardLinksValid) {
                computeLinks(this.forwardLinks, true);
                this.forwardLinksValid = true;
            }
            return this.forwardLinks;
        }

        private int getMaxIndex() {
            if (this.maxIndex == Integer.MIN_VALUE) {
                this.maxIndex = Math.max(0, calculateMaxIndex());
            }
            return this.maxIndex;
        }

        public final Arc[] getArcs() {
            if (this.arcs == null) {
                this.arcs = createArcs();
            }
            if (!this.arcsValid) {
                computeArcs();
                this.arcsValid = true;
            }
            return this.arcs;
        }

        public final int[] getDeltas() {
            if (this.deltas == null) {
                this.deltas = new int[GridLayout.this.getChildCount()];
            }
            return this.deltas;
        }

        public final PackedMap<Spec, Bounds> getGroupBounds() {
            if (this.groupBounds == null) {
                this.groupBounds = createGroupBounds();
            }
            if (!this.groupBoundsValid) {
                computeGroupBounds();
                this.groupBoundsValid = true;
            }
            return this.groupBounds;
        }

        public final int[] getLeadingMargins() {
            if (this.leadingMargins == null) {
                this.leadingMargins = new int[(getCount() + 1)];
            }
            if (!this.leadingMarginsValid) {
                computeMargins(true);
                this.leadingMarginsValid = true;
            }
            return this.leadingMargins;
        }

        public final int[] getLocations() {
            if (this.locations == null) {
                this.locations = new int[(getCount() + 1)];
            }
            if (!this.locationsValid) {
                computeLocations(this.locations);
                this.locationsValid = true;
            }
            return this.locations;
        }

        public final int[] getTrailingMargins() {
            if (this.trailingMargins == null) {
                this.trailingMargins = new int[(getCount() + 1)];
            }
            if (!this.trailingMarginsValid) {
                computeMargins(false);
                this.trailingMarginsValid = true;
            }
            return this.trailingMargins;
        }

        public final void invalidateStructure() {
            this.maxIndex = Integer.MIN_VALUE;
            this.groupBounds = null;
            this.forwardLinks = null;
            this.backwardLinks = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            this.deltas = null;
            this.hasWeightsValid = false;
            invalidateValues();
        }

        private int calculateMaxIndex() {
            Spec spec;
            int childCount = GridLayout.this.getChildCount();
            int i = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i2));
                if (this.horizontal) {
                    spec = layoutParams.columnSpec;
                } else {
                    spec = layoutParams.rowSpec;
                }
                Interval interval = spec.span;
                i = Math.max(Math.max(Math.max(i, interval.min), interval.max), interval.size());
            }
            if (i == -1) {
                return Integer.MIN_VALUE;
            }
            return i;
        }

        private float calculateTotalWeight() {
            Spec spec;
            int childCount = GridLayout.this.getChildCount();
            float f2 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    if (this.horizontal) {
                        spec = layoutParams.columnSpec;
                    } else {
                        spec = layoutParams.rowSpec;
                    }
                    f2 += spec.weight;
                }
            }
            return f2;
        }

        private boolean computeHasWeights() {
            Spec spec;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    if (this.horizontal) {
                        spec = layoutParams.columnSpec;
                    } else {
                        spec = layoutParams.rowSpec;
                    }
                    if (spec.weight != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private PackedMap<Spec, Bounds> createGroupBounds() {
            Spec spec;
            Assoc<K, V> of = Assoc.of(Spec.class, Bounds.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(GridLayout.this.getChildAt(i));
                if (this.horizontal) {
                    spec = layoutParams.columnSpec;
                } else {
                    spec = layoutParams.rowSpec;
                }
                of.put(spec, spec.getAbsoluteAlignment(this.horizontal).getBounds());
            }
            return of.pack();
        }

        private void computeGroupBounds() {
            Spec spec;
            int i;
            Bounds[] boundsArr = (Bounds[]) this.groupBounds.values;
            for (Bounds reset : boundsArr) {
                reset.reset();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                if (this.horizontal) {
                    spec = layoutParams.columnSpec;
                } else {
                    spec = layoutParams.rowSpec;
                }
                Spec spec2 = spec;
                int measurementIncludingMargin = GridLayout.this.getMeasurementIncludingMargin(childAt, this.horizontal);
                if (spec2.weight == 0.0f) {
                    i = 0;
                } else {
                    i = getDeltas()[i2];
                }
                ((Bounds) this.groupBounds.getValue(i2)).include(GridLayout.this, childAt, spec2, this, measurementIncludingMargin + i);
            }
        }

        private Arc[] createArcs() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            addComponentSizes(arrayList, getForwardLinks());
            addComponentSizes(arrayList2, getBackwardLinks());
            if (this.orderPreserved) {
                int i = 0;
                while (i < getCount()) {
                    int i2 = i + 1;
                    include(arrayList, new Interval(i, i2), new MutableInt(0));
                    i = i2;
                }
            }
            int count = getCount();
            include(arrayList, new Interval(0, count), this.parentMin, false);
            include(arrayList2, new Interval(count, 0), this.parentMax, false);
            return (Arc[]) GridLayout.append(topologicalSort((List<Arc>) arrayList), topologicalSort((List<Arc>) arrayList2));
        }

        private void init(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private int size(int[] iArr) {
            return iArr[getCount()];
        }

        public final void layout(int i) {
            setParentConstraints(i, i);
            getLocations();
        }

        public final void setOrderPreserved(boolean z) {
            this.orderPreserved = z;
            invalidateStructure();
        }

        private boolean solve(int[] iArr) {
            return solve(getArcs(), iArr);
        }

        private Arc[] topologicalSort(final Arc[] arcArr) {
            return new Object() {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                Arc[][] arcsByVertex = Axis.this.groupArcsByFirstVertex(arcArr);
                int cursor = (this.result.length - 1);
                Arc[] result = new Arc[arcArr.length];
                int[] visited = new int[(Axis.this.getCount() + 1)];

                static {
                    Class<GridLayout> cls = GridLayout.class;
                }

                /* access modifiers changed from: package-private */
                public Arc[] sort() {
                    int length = this.arcsByVertex.length;
                    for (int i = 0; i < length; i++) {
                        walk(i);
                    }
                    return this.result;
                }

                /* access modifiers changed from: package-private */
                public void walk(int i) {
                    int i2;
                    switch (this.visited[i]) {
                        case 0:
                            this.visited[i] = 1;
                            for (Arc arc : this.arcsByVertex[i]) {
                                walk(arc.span.max);
                                Arc[] arcArr = this.result;
                                this.cursor = this.cursor - 1;
                                arcArr[i2] = arc;
                            }
                            this.visited[i] = 2;
                            return;
                        default:
                            return;
                    }
                }
            }.sort();
        }

        private void computeLocations(int[] iArr) {
            if (!hasWeights()) {
                solve(iArr);
            } else {
                solveAndDistributeSpace(iArr);
            }
            if (!this.orderPreserved) {
                int i = iArr[0];
                int length = iArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = iArr[i2] - i;
                }
            }
        }

        private Arc[] topologicalSort(List<Arc> list) {
            return topologicalSort((Arc[]) list.toArray(new Arc[list.size()]));
        }

        private PackedMap<Interval, MutableInt> createLinks(boolean z) {
            Interval interval;
            Assoc<K, V> of = Assoc.of(Interval.class, MutableInt.class);
            Spec[] specArr = (Spec[]) getGroupBounds().keys;
            int length = specArr.length;
            for (int i = 0; i < length; i++) {
                if (z) {
                    interval = specArr[i].span;
                } else {
                    interval = specArr[i].span.inverse();
                }
                of.put(interval, new MutableInt());
            }
            return of.pack();
        }

        public final int getMeasure(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return getMeasure(0, size);
            }
            if (mode == 0) {
                return getMeasure(0, 100000);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return getMeasure(size, size);
        }

        public final void setCount(int i) {
            String str;
            if (i != Integer.MIN_VALUE && i < getMaxIndex()) {
                StringBuilder sb = new StringBuilder();
                if (this.horizontal) {
                    str = "column";
                } else {
                    str = "row";
                }
                sb.append(str);
                sb.append("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child");
                GridLayout.handleInvalidParams(sb.toString());
            }
            this.definedCount = i;
        }

        private String arcsToString(List<Arc> list) {
            String str;
            StringBuilder sb;
            if (this.horizontal) {
                str = "x";
            } else {
                str = "y";
            }
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Arc next : list) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                int i = next.span.min;
                int i2 = next.span.max;
                int i3 = next.value.value;
                if (i < i2) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i);
                    sb.append(">=");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i2);
                    sb.append("<=");
                    i3 = -i3;
                }
                sb.append(i3);
                sb2.append(sb.toString());
            }
            return sb2.toString();
        }

        private void computeMargins(boolean z) {
            int[] iArr;
            Spec spec;
            int i;
            if (z) {
                iArr = this.leadingMargins;
            } else {
                iArr = this.trailingMargins;
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    if (this.horizontal) {
                        spec = layoutParams.columnSpec;
                    } else {
                        spec = layoutParams.rowSpec;
                    }
                    Interval interval = spec.span;
                    if (z) {
                        i = interval.min;
                    } else {
                        i = interval.max;
                    }
                    iArr[i] = Math.max(iArr[i], GridLayout.this.getMargin1(childAt, this.horizontal, z));
                }
            }
        }

        private void solveAndDistributeSpace(int[] iArr) {
            Arrays.fill(getDeltas(), 0);
            solve(iArr);
            int childCount = (this.parentMin.value * GridLayout.this.getChildCount()) + 1;
            if (childCount >= 2) {
                float calculateTotalWeight = calculateTotalWeight();
                int i = -1;
                int i2 = childCount;
                int i3 = 0;
                boolean z = true;
                while (i3 < i2) {
                    int i4 = (int) ((((long) i3) + ((long) i2)) / 2);
                    invalidateValues();
                    shareOutDelta(i4, calculateTotalWeight);
                    boolean solve = solve(getArcs(), iArr, false);
                    if (solve) {
                        i3 = i4 + 1;
                        i = i4;
                    } else {
                        i2 = i4;
                    }
                    z = solve;
                }
                if (i > 0 && !z) {
                    invalidateValues();
                    shareOutDelta(i, calculateTotalWeight);
                    solve(iArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final Arc[][] groupArcsByFirstVertex(Arc[] arcArr) {
            int count = getCount() + 1;
            Arc[][] arcArr2 = new Arc[count][];
            int[] iArr = new int[count];
            for (Arc arc : arcArr) {
                int i = arc.span.min;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < count; i2++) {
                arcArr2[i2] = new Arc[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (Arc arc2 : arcArr) {
                int i3 = arc2.span.min;
                Arc[] arcArr3 = arcArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                arcArr3[i4] = arc2;
            }
            return arcArr2;
        }

        private boolean solve(Arc[] arcArr, int[] iArr) {
            return solve(arcArr, iArr, true);
        }

        private int getMeasure(int i, int i2) {
            setParentConstraints(i, i2);
            return size(getLocations());
        }

        private void setParentConstraints(int i, int i2) {
            this.parentMin.value = i;
            this.parentMax.value = -i2;
            this.locationsValid = false;
        }

        private void addComponentSizes(List<Arc> list, PackedMap<Interval, MutableInt> packedMap) {
            for (int i = 0; i < ((Interval[]) packedMap.keys).length; i++) {
                include(list, ((Interval[]) packedMap.keys)[i], ((MutableInt[]) packedMap.values)[i], false);
            }
        }

        private boolean relax(int[] iArr, Arc arc) {
            if (!arc.valid) {
                return false;
            }
            Interval interval = arc.span;
            int i = interval.min;
            int i2 = interval.max;
            int i3 = iArr[i] + arc.value.value;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        Axis(boolean z) {
            this.horizontal = z;
        }

        private void computeLinks(PackedMap<Interval, MutableInt> packedMap, boolean z) {
            MutableInt[] mutableIntArr = (MutableInt[]) packedMap.values;
            for (MutableInt reset : mutableIntArr) {
                reset.reset();
            }
            Bounds[] boundsArr = (Bounds[]) getGroupBounds().values;
            for (int i = 0; i < boundsArr.length; i++) {
                int size = boundsArr[i].size(z);
                MutableInt mutableInt = (MutableInt) packedMap.getValue(i);
                int i2 = mutableInt.value;
                if (!z) {
                    size = -size;
                }
                mutableInt.value = Math.max(i2, size);
            }
        }

        private void shareOutDelta(int i, float f2) {
            Spec spec;
            Arrays.fill(this.deltas, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = GridLayout.this.getLayoutParams(childAt);
                    if (this.horizontal) {
                        spec = layoutParams.columnSpec;
                    } else {
                        spec = layoutParams.rowSpec;
                    }
                    float f3 = spec.weight;
                    if (f3 != 0.0f) {
                        int round = Math.round((((float) i) * f3) / f2);
                        this.deltas[i2] = round;
                        i -= round;
                        f2 -= f3;
                    }
                }
            }
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt) {
            include(list, interval, mutableInt, true);
        }

        private void logError(String str, Arc[] arcArr, boolean[] zArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arcArr.length; i++) {
                Arc arc = arcArr[i];
                if (zArr[i]) {
                    arrayList.add(arc);
                }
                if (!arc.valid) {
                    arrayList2.add(arc);
                }
            }
            Printer printer = GridLayout.this.mPrinter;
            printer.println(str + " constraints: " + arcsToString(arrayList) + " are inconsistent; permanently removing: " + arcsToString(arrayList2) + ". ");
        }

        private boolean solve(Arc[] arcArr, int[] iArr, boolean z) {
            String str;
            if (this.horizontal) {
                str = "horizontal";
            } else {
                str = "vertical";
            }
            int count = getCount() + 1;
            boolean[] zArr = null;
            for (int i = 0; i < arcArr.length; i++) {
                init(iArr);
                for (int i2 = 0; i2 < count; i2++) {
                    boolean z2 = false;
                    for (Arc relax : arcArr) {
                        z2 |= relax(iArr, relax);
                    }
                    if (!z2) {
                        if (zArr != null) {
                            logError(str, arcArr, zArr);
                        }
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[arcArr.length];
                for (int i3 = 0; i3 < count; i3++) {
                    int length = arcArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        zArr2[i4] = zArr2[i4] | relax(iArr, arcArr[i4]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= arcArr.length) {
                        break;
                    }
                    if (zArr2[i5]) {
                        Arc arc = arcArr[i5];
                        if (arc.span.min >= arc.span.max) {
                            arc.valid = false;
                            break;
                        }
                    }
                    i5++;
                }
            }
            return true;
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.size() != 0) {
                if (z) {
                    for (Arc arc : list) {
                        if (arc.span.equals(interval)) {
                            return;
                        }
                    }
                }
                list.add(new Arc(interval, mutableInt));
            }
        }
    }

    static class Bounds {
        public int after;
        public int before;
        public int flexibility;

        Bounds() {
            reset();
        }

        /* access modifiers changed from: protected */
        public void reset() {
            this.before = Integer.MIN_VALUE;
            this.after = Integer.MIN_VALUE;
            this.flexibility = 2;
        }

        public String toString() {
            return "Bounds{before=" + this.before + ", after=" + this.after + '}';
        }

        /* access modifiers changed from: protected */
        public int size(boolean z) {
            if (z || !GridLayout.canStretch(this.flexibility)) {
                return this.before + this.after;
            }
            return 100000;
        }

        /* access modifiers changed from: protected */
        public void include(int i, int i2) {
            this.before = Math.max(this.before, i);
            this.after = Math.max(this.after, i2);
        }

        /* access modifiers changed from: protected */
        public int getOffset(GridLayout gridLayout, View view, Alignment alignment, int i, boolean z) {
            return this.before - alignment.getAlignmentValue(view, i, ViewGroupCompat.getLayoutMode(gridLayout));
        }

        /* access modifiers changed from: protected */
        public final void include(GridLayout gridLayout, View view, Spec spec, Axis axis, int i) {
            this.flexibility &= spec.getFlexibility();
            int alignmentValue = spec.getAbsoluteAlignment(axis.horizontal).getAlignmentValue(view, i, ViewGroupCompat.getLayoutMode(gridLayout));
            include(alignmentValue, i - alignmentValue);
        }
    }

    static final class Interval {
        public final int max;
        public final int min;

        public final int hashCode() {
            return (this.min * 31) + this.max;
        }

        /* access modifiers changed from: package-private */
        public final int size() {
            return this.max - this.min;
        }

        /* access modifiers changed from: package-private */
        public final Interval inverse() {
            return new Interval(this.max, this.min);
        }

        public final String toString() {
            return "[" + this.min + ", " + this.max + "]";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Interval interval = (Interval) obj;
            if (this.max == interval.max && this.min == interval.min) {
                return true;
            }
            return false;
        }

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int BOTTOM_MARGIN = 6;
        private static final int COLUMN = 7;
        private static final int COLUMN_SPAN = 8;
        private static final int COLUMN_WEIGHT = 9;
        private static final Interval DEFAULT_SPAN;
        private static final int DEFAULT_SPAN_SIZE;
        private static final int GRAVITY = 10;
        private static final int LEFT_MARGIN = 3;
        private static final int MARGIN = 2;
        private static final int RIGHT_MARGIN = 5;
        private static final int ROW = 11;
        private static final int ROW_SPAN = 12;
        private static final int ROW_WEIGHT = 13;
        private static final int TOP_MARGIN = 4;
        public Spec columnSpec;
        public Spec rowSpec;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public LayoutParams() {
            /*
                r1 = this;
                android.support.v7.widget.GridLayout$Spec r0 = android.support.v7.widget.GridLayout.Spec.UNDEFINED
                r1.<init>((android.support.v7.widget.GridLayout.Spec) r0, (android.support.v7.widget.GridLayout.Spec) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayout.LayoutParams.<init>():void");
        }

        public int hashCode() {
            return (this.rowSpec.hashCode() * 31) + this.columnSpec.hashCode();
        }

        static {
            Interval interval = new Interval(Integer.MIN_VALUE, -2147483647);
            DEFAULT_SPAN = interval;
            DEFAULT_SPAN_SIZE = interval.size();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
        }

        /* access modifiers changed from: package-private */
        public final void setColumnSpecSpan(Interval interval) {
            this.columnSpec = this.columnSpec.copyWriteSpan(interval);
        }

        /* access modifiers changed from: package-private */
        public final void setRowSpecSpan(Interval interval) {
            this.rowSpec = this.rowSpec.copyWriteSpan(interval);
        }

        public void setGravity(int i) {
            this.rowSpec = this.rowSpec.copyWriteAlignment(GridLayout.getAlignment(i, false));
            this.columnSpec = this.columnSpec.copyWriteAlignment(GridLayout.getAlignment(i, true));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            if (this.columnSpec.equals(layoutParams.columnSpec) && this.rowSpec.equals(layoutParams.rowSpec)) {
                return true;
            }
            return false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            this.rowSpec = layoutParams.rowSpec;
            this.columnSpec = layoutParams.columnSpec;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            reInitSuper(context, attributeSet);
            init(context, attributeSet);
        }

        private void reInitSuper(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridLayout_Layout);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(MARGIN, Integer.MIN_VALUE);
                this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(LEFT_MARGIN, dimensionPixelSize);
                this.topMargin = obtainStyledAttributes.getDimensionPixelSize(TOP_MARGIN, dimensionPixelSize);
                this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(RIGHT_MARGIN, dimensionPixelSize);
                this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(BOTTOM_MARGIN, dimensionPixelSize);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private void init(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes.getInt(GRAVITY, 0);
                this.columnSpec = GridLayout.spec(obtainStyledAttributes.getInt(COLUMN, Integer.MIN_VALUE), obtainStyledAttributes.getInt(COLUMN_SPAN, DEFAULT_SPAN_SIZE), GridLayout.getAlignment(i, true), obtainStyledAttributes.getFloat(COLUMN_WEIGHT, 0.0f));
                this.rowSpec = GridLayout.spec(obtainStyledAttributes.getInt(ROW, Integer.MIN_VALUE), obtainStyledAttributes.getInt(ROW_SPAN, DEFAULT_SPAN_SIZE), GridLayout.getAlignment(i, false), obtainStyledAttributes.getFloat(ROW_WEIGHT, 0.0f));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public LayoutParams(Spec spec, Spec spec2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, spec, spec2);
        }

        /* access modifiers changed from: protected */
        public void setBaseAttributes(TypedArray typedArray, int i, int i2) {
            this.width = typedArray.getLayoutDimension(i, -2);
            this.height = typedArray.getLayoutDimension(i2, -2);
        }

        private LayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Spec spec, Spec spec2) {
            super(i, i2);
            this.rowSpec = Spec.UNDEFINED;
            this.columnSpec = Spec.UNDEFINED;
            setMargins(i3, i4, i5, i6);
            this.rowSpec = spec;
            this.columnSpec = spec2;
        }
    }

    static final class MutableInt {
        public int value;

        public MutableInt() {
            reset();
        }

        public final void reset() {
            this.value = Integer.MIN_VALUE;
        }

        public final String toString() {
            return Integer.toString(this.value);
        }

        public MutableInt(int i) {
            this.value = i;
        }
    }

    static final class PackedMap<K, V> {
        public final int[] index;
        public final K[] keys;
        public final V[] values;

        public final V getValue(int i) {
            return this.values[this.index[i]];
        }

        private static <K> int[] createIndex(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        PackedMap(K[] kArr, V[] vArr) {
            this.index = createIndex(kArr);
            this.keys = compact(kArr, this.index);
            this.values = compact(vArr, this.index);
        }

        private static <K> K[] compact(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.max2(iArr, -1) + 1);
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }
    }

    public static class Spec {
        static final Spec UNDEFINED = GridLayout.spec(Integer.MIN_VALUE);
        final Alignment alignment;
        final Interval span;
        final boolean startDefined;
        final float weight;

        public int hashCode() {
            return (this.span.hashCode() * 31) + this.alignment.hashCode();
        }

        /* access modifiers changed from: package-private */
        public final int getFlexibility() {
            if (this.alignment == GridLayout.UNDEFINED_ALIGNMENT && this.weight == 0.0f) {
                return 0;
            }
            return 2;
        }

        /* access modifiers changed from: package-private */
        public final Spec copyWriteAlignment(Alignment alignment2) {
            return new Spec(this.startDefined, this.span, alignment2, this.weight);
        }

        /* access modifiers changed from: package-private */
        public final Spec copyWriteSpan(Interval interval) {
            return new Spec(this.startDefined, interval, this.alignment, this.weight);
        }

        public Alignment getAbsoluteAlignment(boolean z) {
            if (this.alignment != GridLayout.UNDEFINED_ALIGNMENT) {
                return this.alignment;
            }
            if (this.weight != 0.0f) {
                return GridLayout.FILL;
            }
            if (z) {
                return GridLayout.START;
            }
            return GridLayout.BASELINE;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Spec spec = (Spec) obj;
            if (this.alignment.equals(spec.alignment) && this.span.equals(spec.span)) {
                return true;
            }
            return false;
        }

        private Spec(boolean z, Interval interval, Alignment alignment2, float f2) {
            this.startDefined = z;
            this.span = interval;
            this.alignment = alignment2;
            this.weight = f2;
        }

        Spec(boolean z, int i, int i2, Alignment alignment2, float f2) {
            this(z, new Interval(i, i2 + i), alignment2, f2);
        }
    }

    static boolean canStretch(int i) {
        return (i & 2) != 0;
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public Printer getPrinter() {
        return this.mPrinter;
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public int getColumnCount() {
        return this.mHorizontalAxis.getCount();
    }

    public int getRowCount() {
        return this.mVerticalAxis.getCount();
    }

    public boolean isColumnOrderPreserved() {
        return this.mHorizontalAxis.isOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return this.mVerticalAxis.isOrderPreserved();
    }

    public void requestLayout() {
        super.requestLayout();
        invalidateStructure();
    }

    private boolean isLayoutRtlCompat() {
        if (ViewCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        if (this.mHorizontalAxis != null) {
            this.mHorizontalAxis.invalidateStructure();
        }
        if (this.mVerticalAxis != null) {
            this.mVerticalAxis.invalidateStructure();
        }
        invalidateValues();
    }

    private void invalidateValues() {
        if (this.mHorizontalAxis != null && this.mVerticalAxis != null) {
            this.mHorizontalAxis.invalidateValues();
            this.mVerticalAxis.invalidateValues();
        }
    }

    private int computeLayoutParamsHashCode() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = (i * 31) + ((LayoutParams) childAt.getLayoutParams()).hashCode();
            }
        }
        return i;
    }

    private void consistencyCheck() {
        while (this.mLastLayoutParamsHashCode != 0) {
            if (this.mLastLayoutParamsHashCode != computeLayoutParamsHashCode()) {
                this.mPrinter.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                invalidateStructure();
            } else {
                return;
            }
        }
        validateLayoutParams();
        this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
    }

    private void validateLayoutParams() {
        boolean z;
        Axis axis;
        int i;
        Spec spec;
        Spec spec2;
        if (this.mOrientation == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            axis = this.mHorizontalAxis;
        } else {
            axis = this.mVerticalAxis;
        }
        if (axis.definedCount != Integer.MIN_VALUE) {
            i = axis.definedCount;
        } else {
            i = 0;
        }
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
            if (z) {
                spec = layoutParams.rowSpec;
            } else {
                spec = layoutParams.columnSpec;
            }
            Interval interval = spec.span;
            boolean z2 = spec.startDefined;
            int size = interval.size();
            if (z2) {
                i3 = interval.min;
            }
            if (z) {
                spec2 = layoutParams.columnSpec;
            } else {
                spec2 = layoutParams.rowSpec;
            }
            Interval interval2 = spec2.span;
            boolean z3 = spec2.startDefined;
            int clip = clip(interval2, z3, i);
            if (z3) {
                i2 = interval2.min;
            }
            if (i != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i5 = i2 + clip;
                        if (fits(iArr, i3, i2, i5)) {
                            break;
                        } else if (z3) {
                            i3++;
                        } else if (i5 <= i) {
                            i2++;
                        } else {
                            i3++;
                            i2 = 0;
                        }
                    }
                }
                procrusteanFill(iArr, i2, i2 + clip, i3 + size);
            }
            if (z) {
                setCellGroup(layoutParams, i3, size, i2, clip);
            } else {
                setCellGroup(layoutParams, i2, clip, i3, size);
            }
            i2 += clip;
        }
    }

    public GridLayout(Context context) {
        this(context, null);
    }

    public static Spec spec(int i) {
        return spec(i, 1);
    }

    /* access modifiers changed from: package-private */
    public final LayoutParams getLayoutParams(View view) {
        return (LayoutParams) view.getLayoutParams();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = NO_PRINTER;
        }
        this.mPrinter = printer;
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams)) {
            return false;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        checkLayoutParams(layoutParams2, true);
        checkLayoutParams(layoutParams2, false);
        return true;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.mHorizontalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.mVerticalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    private static Alignment createSwitchingAlignment(final Alignment alignment, final Alignment alignment2) {
        return new Alignment() {
            /* access modifiers changed from: package-private */
            public final String getDebugString() {
                return "SWITCHING[L:" + alignment.getDebugString() + ", R:" + alignment2.getDebugString() + "]";
            }

            /* access modifiers changed from: package-private */
            public final int getGravityOffset(View view, int i) {
                Alignment alignment;
                boolean z = true;
                if (ViewCompat.getLayoutDirection(view) != 1) {
                    z = false;
                }
                if (!z) {
                    alignment = alignment;
                } else {
                    alignment = alignment2;
                }
                return alignment.getGravityOffset(view, i);
            }

            public final int getAlignmentValue(View view, int i, int i2) {
                Alignment alignment;
                boolean z = true;
                if (ViewCompat.getLayoutDirection(view) != 1) {
                    z = false;
                }
                if (!z) {
                    alignment = alignment;
                } else {
                    alignment = alignment2;
                }
                return alignment.getAlignmentValue(view, i, i2);
            }
        };
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static int adjust(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    private int getMeasurement(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int getTotalMargin(View view, boolean z) {
        return getMargin(view, z, true) + getMargin(view, z, false);
    }

    static int max2(int[] iArr, int i) {
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        return i;
    }

    public static Spec spec(int i, float f2) {
        return spec(i, 1, f2);
    }

    static <T> T[] append(T[] tArr, T[] tArr2) {
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static Spec spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    /* access modifiers changed from: package-private */
    public final int getMeasurementIncludingMargin(View view, boolean z) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return getMeasurement(view, z) + getTotalMargin(view, z);
    }

    private void checkLayoutParams(LayoutParams layoutParams, boolean z) {
        String str;
        Spec spec;
        Axis axis;
        if (z) {
            str = "column";
        } else {
            str = "row";
        }
        if (z) {
            spec = layoutParams.columnSpec;
        } else {
            spec = layoutParams.rowSpec;
        }
        Interval interval = spec.span;
        if (interval.min != Integer.MIN_VALUE && interval.min < 0) {
            handleInvalidParams(str + " indices must be positive");
        }
        if (z) {
            axis = this.mHorizontalAxis;
        } else {
            axis = this.mVerticalAxis;
        }
        int i = axis.definedCount;
        if (i != Integer.MIN_VALUE) {
            if (interval.max > i) {
                handleInvalidParams(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (interval.size() > i) {
                handleInvalidParams(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    static Alignment getAlignment(int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = 7;
        } else {
            i2 = SearchJediMixFeedAdapter.f42516e;
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        int i4 = (i & i2) >> i3;
        if (i4 == 1) {
            return CENTER;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 == 7) {
                    return FILL;
                }
                if (i4 == 8388611) {
                    return START;
                }
                if (i4 != 8388613) {
                    return UNDEFINED_ALIGNMENT;
                }
                return END;
            } else if (z) {
                return RIGHT;
            } else {
                return BOTTOM;
            }
        } else if (z) {
            return LEFT;
        } else {
            return TOP;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        consistencyCheck();
        invalidateValues();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int adjust = adjust(i, -paddingLeft);
        int adjust2 = adjust(i2, -paddingTop);
        measureChildrenWithMargins(adjust, adjust2, true);
        if (this.mOrientation == 0) {
            int measure = this.mHorizontalAxis.getMeasure(adjust);
            measureChildrenWithMargins(adjust, adjust2, false);
            int i5 = measure;
            i3 = this.mVerticalAxis.getMeasure(adjust2);
            i4 = i5;
        } else {
            i3 = this.mVerticalAxis.getMeasure(adjust2);
            measureChildrenWithMargins(adjust, adjust2, false);
            i4 = this.mHorizontalAxis.getMeasure(adjust);
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i4 + paddingLeft, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(i3 + paddingTop, getSuggestedMinimumHeight()), i2, 0));
    }

    public static Spec spec(int i, Alignment alignment) {
        return spec(i, 1, alignment);
    }

    private static int clip(Interval interval, boolean z, int i) {
        int i2;
        int size = interval.size();
        if (i == 0) {
            return size;
        }
        if (z) {
            i2 = Math.min(interval.min, i);
        } else {
            i2 = 0;
        }
        return Math.min(size, i - i2);
    }

    private int getDefaultMargin(View view, boolean z, boolean z2) {
        if (view.getClass() == Space.class || view.getClass() == android.widget.Space.class) {
            return 0;
        }
        return this.mDefaultGap / 2;
    }

    /* access modifiers changed from: package-private */
    public int getMargin1(View view, boolean z, boolean z2) {
        int i;
        LayoutParams layoutParams = getLayoutParams(view);
        if (z) {
            if (z2) {
                i = layoutParams.leftMargin;
            } else {
                i = layoutParams.rightMargin;
            }
        } else if (z2) {
            i = layoutParams.topMargin;
        } else {
            i = layoutParams.bottomMargin;
        }
        if (i == Integer.MIN_VALUE) {
            return getDefaultMargin(view, layoutParams, z, z2);
        }
        return i;
    }

    private int getMargin(View view, boolean z, boolean z2) {
        Axis axis;
        int[] iArr;
        Spec spec;
        int i;
        if (this.mAlignmentMode == 1) {
            return getMargin1(view, z, z2);
        }
        if (z) {
            axis = this.mHorizontalAxis;
        } else {
            axis = this.mVerticalAxis;
        }
        if (z2) {
            iArr = axis.getLeadingMargins();
        } else {
            iArr = axis.getTrailingMargins();
        }
        LayoutParams layoutParams = getLayoutParams(view);
        if (z) {
            spec = layoutParams.columnSpec;
        } else {
            spec = layoutParams.rowSpec;
        }
        if (z2) {
            i = spec.span.min;
        } else {
            i = spec.span.max;
        }
        return iArr[i];
    }

    public static Spec spec(int i, int i2, float f2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT, f2);
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHorizontalAxis = new Axis(true);
        this.mVerticalAxis = new Axis(false);
        this.mOrientation = 0;
        this.mUseDefaultMargins = false;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.mPrinter = LOG_PRINTER;
        this.mDefaultGap = context.getResources().getDimensionPixelOffset(C0906R.dimen.df);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridLayout);
        try {
            setRowCount(obtainStyledAttributes.getInt(ROW_COUNT, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(COLUMN_COUNT, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(ORIENTATION, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(USE_DEFAULT_MARGINS, false));
            setAlignmentMode(obtainStyledAttributes.getInt(ALIGNMENT_MODE, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(ROW_ORDER_PRESERVED, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(COLUMN_ORDER_PRESERVED, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void measureChildrenWithMargins(int i, int i2, boolean z) {
        boolean z2;
        Spec spec;
        Axis axis;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = getLayoutParams(childAt);
                if (z) {
                    measureChildWithMargins2(childAt, i, i2, layoutParams.width, layoutParams.height);
                } else {
                    if (this.mOrientation == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        spec = layoutParams.columnSpec;
                    } else {
                        spec = layoutParams.rowSpec;
                    }
                    if (spec.getAbsoluteAlignment(z2) == FILL) {
                        Interval interval = spec.span;
                        if (z2) {
                            axis = this.mHorizontalAxis;
                        } else {
                            axis = this.mVerticalAxis;
                        }
                        int[] locations = axis.getLocations();
                        int totalMargin = (locations[interval.max] - locations[interval.min]) - getTotalMargin(childAt, z2);
                        if (z2) {
                            measureChildWithMargins2(childAt, i, i2, totalMargin, layoutParams.height);
                        } else {
                            measureChildWithMargins2(childAt, i, i2, layoutParams.width, totalMargin);
                        }
                    }
                }
            }
        }
    }

    public static Spec spec(int i, int i2, Alignment alignment) {
        return spec(i, i2, alignment, 0.0f);
    }

    public static Spec spec(int i, Alignment alignment, float f2) {
        return spec(i, 1, alignment, f2);
    }

    private int getDefaultMargin(View view, boolean z, boolean z2, boolean z3) {
        return getDefaultMargin(view, z2, z3);
    }

    private static void procrusteanFill(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    private static boolean fits(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return false;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return false;
            }
            i2++;
        }
        return true;
    }

    private int getDefaultMargin(View view, LayoutParams layoutParams, boolean z, boolean z2) {
        Spec spec;
        Axis axis;
        boolean z3;
        boolean z4 = false;
        if (!this.mUseDefaultMargins) {
            return 0;
        }
        if (z) {
            spec = layoutParams.columnSpec;
        } else {
            spec = layoutParams.rowSpec;
        }
        if (z) {
            axis = this.mHorizontalAxis;
        } else {
            axis = this.mVerticalAxis;
        }
        Interval interval = spec.span;
        if (!z || !isLayoutRtlCompat()) {
            z3 = z2;
        } else if (!z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 ? interval.max == axis.getCount() : interval.min == 0) {
            z4 = true;
        }
        return getDefaultMargin(view, z4, z, z2);
    }

    public static Spec spec(int i, int i2, Alignment alignment, float f2) {
        boolean z;
        if (i != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        Spec spec = new Spec(z, i, i2, alignment, f2);
        return spec;
    }

    private void measureChildWithMargins2(View view, int i, int i2, int i3, int i4) {
        view.measure(getChildMeasureSpec(i, getTotalMargin(view, true), i3), getChildMeasureSpec(i2, getTotalMargin(view, false), i4));
    }

    private static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setRowSpecSpan(new Interval(i, i2 + i));
        layoutParams.setColumnSpecSpan(new Interval(i3, i4 + i3));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int[] iArr;
        int[] iArr2;
        int i5;
        GridLayout gridLayout = this;
        consistencyCheck();
        int i6 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        gridLayout.mHorizontalAxis.layout((i6 - paddingLeft) - paddingRight);
        gridLayout.mVerticalAxis.layout(((i4 - i2) - paddingTop) - paddingBottom);
        int[] locations = gridLayout.mHorizontalAxis.getLocations();
        int[] locations2 = gridLayout.mVerticalAxis.getLocations();
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = gridLayout.getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = gridLayout.getLayoutParams(childAt);
                Spec spec = layoutParams.columnSpec;
                Spec spec2 = layoutParams.rowSpec;
                Interval interval = spec.span;
                Interval interval2 = spec2.span;
                int i8 = locations[interval.min];
                int i9 = locations2[interval2.min];
                int i10 = locations[interval.max] - i8;
                int i11 = locations2[interval2.max] - i9;
                int measurement = gridLayout.getMeasurement(childAt, true);
                int measurement2 = gridLayout.getMeasurement(childAt, z2);
                Alignment absoluteAlignment = spec.getAbsoluteAlignment(true);
                Alignment absoluteAlignment2 = spec2.getAbsoluteAlignment(z2);
                Bounds bounds = (Bounds) gridLayout.mHorizontalAxis.getGroupBounds().getValue(i7);
                Bounds bounds2 = (Bounds) gridLayout.mVerticalAxis.getGroupBounds().getValue(i7);
                int i12 = measurement2;
                iArr2 = locations;
                int gravityOffset = absoluteAlignment.getGravityOffset(childAt, i10 - bounds.size(true));
                int gravityOffset2 = absoluteAlignment2.getGravityOffset(childAt, i11 - bounds2.size(true));
                int margin = gridLayout.getMargin(childAt, true, true);
                int margin2 = gridLayout.getMargin(childAt, false, true);
                int margin3 = gridLayout.getMargin(childAt, true, false);
                int i13 = margin + margin3;
                int margin4 = margin2 + gridLayout.getMargin(childAt, false, false);
                Alignment alignment = absoluteAlignment2;
                Bounds bounds3 = bounds;
                Alignment alignment2 = absoluteAlignment;
                Alignment alignment3 = alignment;
                int i14 = i12;
                View view = childAt;
                int offset = bounds3.getOffset(this, childAt, alignment2, measurement + i13, true);
                int i15 = i14;
                View view2 = view;
                iArr = locations2;
                int offset2 = bounds2.getOffset(this, view2, alignment3, i15 + margin4, false);
                int sizeInCell = alignment2.getSizeInCell(view2, measurement, i10 - i13);
                int sizeInCell2 = alignment3.getSizeInCell(view2, i15, i11 - margin4);
                int i16 = i8 + gravityOffset + offset;
                if (!isLayoutRtlCompat()) {
                    i5 = paddingLeft + margin + i16;
                } else {
                    i5 = (((i6 - sizeInCell) - paddingRight) - margin3) - i16;
                }
                int i17 = i5;
                int i18 = paddingTop + i9 + gravityOffset2 + offset2 + margin2;
                if (!(sizeInCell == view2.getMeasuredWidth() && sizeInCell2 == view2.getMeasuredHeight())) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(sizeInCell, 1073741824), View.MeasureSpec.makeMeasureSpec(sizeInCell2, 1073741824));
                }
                view2.layout(i17, i18, sizeInCell + i17, sizeInCell2 + i18);
            } else {
                iArr2 = locations;
                iArr = locations2;
            }
            i7++;
            locations = iArr2;
            locations2 = iArr;
            gridLayout = this;
            z2 = false;
        }
    }

    private void drawLine(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (isLayoutRtlCompat()) {
            int width = getWidth();
            canvas.drawLine((float) (width - i5), (float) i6, (float) (width - i7), (float) i8, paint);
            return;
        }
        canvas.drawLine((float) i5, (float) i6, (float) i7, (float) i8, paint);
    }
}
