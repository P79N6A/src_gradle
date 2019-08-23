package com.yqritc.scalablevideoview;

import android.graphics.Matrix;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private e f82614a;

    /* renamed from: b  reason: collision with root package name */
    private e f82615b;

    /* renamed from: com.yqritc.scalablevideoview.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f82616a = new int[b.values().length];

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f82617b = new int[a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(70:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(71:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(72:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|(2:33|34)|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(73:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(74:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(76:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|(3:87|88|90)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(78:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Can't wrap try/catch for region: R(79:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Can't wrap try/catch for region: R(81:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|90) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0081 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0191 */
        static {
            /*
                com.yqritc.scalablevideoview.a[] r0 = com.yqritc.scalablevideoview.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f82617b = r0
                r0 = 1
                int[] r1 = f82617b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yqritc.scalablevideoview.a r2 = com.yqritc.scalablevideoview.a.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f82617b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yqritc.scalablevideoview.a r3 = com.yqritc.scalablevideoview.a.LEFT_CENTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f82617b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yqritc.scalablevideoview.a r4 = com.yqritc.scalablevideoview.a.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f82617b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.yqritc.scalablevideoview.a r5 = com.yqritc.scalablevideoview.a.CENTER_TOP     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f82617b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.yqritc.scalablevideoview.a r6 = com.yqritc.scalablevideoview.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                r5 = 6
                int[] r6 = f82617b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.yqritc.scalablevideoview.a r7 = com.yqritc.scalablevideoview.a.CENTER_BOTTOM     // Catch:{ NoSuchFieldError -> 0x004b }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                r6 = 7
                int[] r7 = f82617b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.yqritc.scalablevideoview.a r8 = com.yqritc.scalablevideoview.a.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                r7 = 8
                int[] r8 = f82617b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.yqritc.scalablevideoview.a r9 = com.yqritc.scalablevideoview.a.RIGHT_CENTER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                r8 = 9
                int[] r9 = f82617b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.yqritc.scalablevideoview.a r10 = com.yqritc.scalablevideoview.a.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x006e }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.yqritc.scalablevideoview.b[] r9 = com.yqritc.scalablevideoview.b.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f82616a = r9
                int[] r9 = f82616a     // Catch:{ NoSuchFieldError -> 0x0081 }
                com.yqritc.scalablevideoview.b r10 = com.yqritc.scalablevideoview.b.NONE     // Catch:{ NoSuchFieldError -> 0x0081 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0081 }
                r9[r10] = r0     // Catch:{ NoSuchFieldError -> 0x0081 }
            L_0x0081:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x008b }
                com.yqritc.scalablevideoview.b r9 = com.yqritc.scalablevideoview.b.FIT_XY     // Catch:{ NoSuchFieldError -> 0x008b }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x008b }
                r0[r9] = r1     // Catch:{ NoSuchFieldError -> 0x008b }
            L_0x008b:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0095 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x009f }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.FIT_START     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.FIT_END     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.LEFT_TOP     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00bd }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.LEFT_CENTER     // Catch:{ NoSuchFieldError -> 0x00bd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bd }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00bd }
            L_0x00bd:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.LEFT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00d1 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER_TOP     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00dd }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00e9 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER_BOTTOM     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x00f5 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.RIGHT_TOP     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0101 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.RIGHT_CENTER     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x010d }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.RIGHT_BOTTOM     // Catch:{ NoSuchFieldError -> 0x010d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0119 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.LEFT_TOP_CROP     // Catch:{ NoSuchFieldError -> 0x0119 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0119 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0119 }
            L_0x0119:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0125 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.LEFT_CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0131 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.LEFT_BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x0131 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0131 }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0131 }
            L_0x0131:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x013d }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER_TOP_CROP     // Catch:{ NoSuchFieldError -> 0x013d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x013d }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x013d }
            L_0x013d:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0149 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0149 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0149 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0149 }
            L_0x0149:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0155 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER_BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x0155 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0155 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0155 }
            L_0x0155:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0161 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.RIGHT_TOP_CROP     // Catch:{ NoSuchFieldError -> 0x0161 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0161 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0161 }
            L_0x0161:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x016d }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.RIGHT_CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x016d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x016d }
            L_0x016d:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0179 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.RIGHT_BOTTOM_CROP     // Catch:{ NoSuchFieldError -> 0x0179 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0179 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0179 }
            L_0x0179:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0185 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.START_INSIDE     // Catch:{ NoSuchFieldError -> 0x0185 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0185 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0185 }
            L_0x0185:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x0191 }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0191 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0191 }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0191 }
            L_0x0191:
                int[] r0 = f82616a     // Catch:{ NoSuchFieldError -> 0x019d }
                com.yqritc.scalablevideoview.b r1 = com.yqritc.scalablevideoview.b.END_INSIDE     // Catch:{ NoSuchFieldError -> 0x019d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x019d }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x019d }
            L_0x019d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yqritc.scalablevideoview.d.AnonymousClass1.<clinit>():void");
        }
    }

    private Matrix c() {
        return a(a.LEFT_TOP);
    }

    private Matrix d() {
        return a(a.CENTER);
    }

    private Matrix e() {
        return a(a.RIGHT_BOTTOM);
    }

    private Matrix b() {
        return a(1.0f, 1.0f, a.LEFT_TOP);
    }

    private Matrix a() {
        return a(((float) this.f82615b.f82618a) / ((float) this.f82614a.f82618a), ((float) this.f82615b.f82619b) / ((float) this.f82614a.f82619b), a.LEFT_TOP);
    }

    private Matrix f() {
        if (this.f82615b.f82619b > this.f82614a.f82618a || this.f82615b.f82619b > this.f82614a.f82619b) {
            return c();
        }
        return b(a.LEFT_TOP);
    }

    private Matrix g() {
        if (this.f82615b.f82619b > this.f82614a.f82618a || this.f82615b.f82619b > this.f82614a.f82619b) {
            return d();
        }
        return b(a.CENTER);
    }

    private Matrix h() {
        if (this.f82615b.f82619b > this.f82614a.f82618a || this.f82615b.f82619b > this.f82614a.f82619b) {
            return e();
        }
        return b(a.RIGHT_BOTTOM);
    }

    private Matrix b(a aVar) {
        return a(((float) this.f82615b.f82618a) / ((float) this.f82614a.f82618a), ((float) this.f82615b.f82619b) / ((float) this.f82614a.f82619b), aVar);
    }

    private Matrix a(a aVar) {
        float f2 = ((float) this.f82614a.f82618a) / ((float) this.f82615b.f82618a);
        float f3 = ((float) this.f82614a.f82619b) / ((float) this.f82615b.f82619b);
        float min = Math.min(f2, f3);
        return a(min / f2, min / f3, aVar);
    }

    private Matrix c(a aVar) {
        float f2 = ((float) this.f82614a.f82618a) / ((float) this.f82615b.f82618a);
        float f3 = ((float) this.f82614a.f82619b) / ((float) this.f82615b.f82619b);
        float max = Math.max(f2, f3);
        return a(max / f2, max / f3, aVar);
    }

    public final Matrix a(b bVar) {
        switch (AnonymousClass1.f82616a[bVar.ordinal()]) {
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return d();
            case 4:
                return c();
            case 5:
                return e();
            case 6:
                return b(a.LEFT_TOP);
            case e.l:
                return b(a.LEFT_CENTER);
            case 8:
                return b(a.LEFT_BOTTOM);
            case 9:
                return b(a.CENTER_TOP);
            case 10:
                return b(a.CENTER);
            case 11:
                return b(a.CENTER_BOTTOM);
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return b(a.RIGHT_TOP);
            case 13:
                return b(a.RIGHT_CENTER);
            case 14:
                return b(a.RIGHT_BOTTOM);
            case 15:
                return c(a.LEFT_TOP);
            case SearchJediMixFeedAdapter.f42514c:
                return c(a.LEFT_CENTER);
            case 17:
                return c(a.LEFT_BOTTOM);
            case 18:
                return c(a.CENTER_TOP);
            case 19:
                return c(a.CENTER);
            case 20:
                return c(a.CENTER_BOTTOM);
            case 21:
                return c(a.RIGHT_TOP);
            case 22:
                return c(a.RIGHT_CENTER);
            case 23:
                return c(a.RIGHT_BOTTOM);
            case 24:
                return f();
            case 25:
                return g();
            case 26:
                return h();
            default:
                return null;
        }
    }

    public d(e eVar, e eVar2) {
        this.f82614a = eVar;
        this.f82615b = eVar2;
    }

    private Matrix a(float f2, float f3, a aVar) {
        switch (AnonymousClass1.f82617b[aVar.ordinal()]) {
            case 1:
                return a(f2, f3, 0.0f, 0.0f);
            case 2:
                return a(f2, f3, 0.0f, ((float) this.f82614a.f82619b) / 2.0f);
            case 3:
                return a(f2, f3, 0.0f, (float) this.f82614a.f82619b);
            case 4:
                return a(f2, f3, ((float) this.f82614a.f82618a) / 2.0f, 0.0f);
            case 5:
                return a(f2, f3, ((float) this.f82614a.f82618a) / 2.0f, ((float) this.f82614a.f82619b) / 2.0f);
            case 6:
                return a(f2, f3, ((float) this.f82614a.f82618a) / 2.0f, (float) this.f82614a.f82619b);
            case e.l:
                return a(f2, f3, (float) this.f82614a.f82618a, 0.0f);
            case 8:
                return a(f2, f3, (float) this.f82614a.f82618a, ((float) this.f82614a.f82619b) / 2.0f);
            case 9:
                return a(f2, f3, (float) this.f82614a.f82618a, (float) this.f82614a.f82619b);
            default:
                throw new IllegalArgumentException("Illegal PivotPoint");
        }
    }

    private static Matrix a(float f2, float f3, float f4, float f5) {
        Matrix matrix = new Matrix();
        matrix.setScale(f2, f3, f4, f5);
        return matrix;
    }
}
