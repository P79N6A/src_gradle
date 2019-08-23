package com.bytedance.jedi.arch;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.d;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003JI\u0010\u0010\u001a\u0002H\u0011\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0002\u0010\u0014*\u00020\u0015\"\u0004\b\u0003\u0010\u00112\u0006\u0010\u0016\u001a\u0002H\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00110\u0018H\u0016¢\u0006\u0002\u0010\u0019Jq\u0010\u0010\u001a\u0002H\u0011\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0002\u0010\u0014*\u00020\u0015\"\u000e\b\u0003\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001b0\u0013\"\b\b\u0004\u0010\u001b*\u00020\u0015\"\u0004\b\u0005\u0010\u00112\u0006\u0010\u0016\u001a\u0002H\u00122\u0006\u0010\u001c\u001a\u0002H\u001a2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H\u00110\u001dH\u0016¢\u0006\u0002\u0010\u001eJ\u0001\u0010\u0010\u001a\u0002H\u0011\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0002\u0010\u0014*\u00020\u0015\"\u000e\b\u0003\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001b0\u0013\"\b\b\u0004\u0010\u001b*\u00020\u0015\"\u000e\b\u0005\u0010\u001f*\b\u0012\u0004\u0012\u0002H 0\u0013\"\b\b\u0006\u0010 *\u00020\u0015\"\u0004\b\u0007\u0010\u00112\u0006\u0010\u0016\u001a\u0002H\u00122\u0006\u0010\u001c\u001a\u0002H\u001a2\u0006\u0010!\u001a\u0002H\u001f2\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\u00110\"H\u0016¢\u0006\u0002\u0010#JÁ\u0001\u0010\u0010\u001a\u0002H\u0011\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0002\u0010\u0014*\u00020\u0015\"\u000e\b\u0003\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001b0\u0013\"\b\b\u0004\u0010\u001b*\u00020\u0015\"\u000e\b\u0005\u0010\u001f*\b\u0012\u0004\u0012\u0002H 0\u0013\"\b\b\u0006\u0010 *\u00020\u0015\"\u000e\b\u0007\u0010$*\b\u0012\u0004\u0012\u0002H%0\u0013\"\b\b\b\u0010%*\u00020\u0015\"\u0004\b\t\u0010\u00112\u0006\u0010\u0016\u001a\u0002H\u00122\u0006\u0010\u001c\u001a\u0002H\u001a2\u0006\u0010!\u001a\u0002H\u001f2\u0006\u0010&\u001a\u0002H$2$\u0010\u0017\u001a \u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H\u00110'H\u0016¢\u0006\u0002\u0010(Jé\u0001\u0010\u0010\u001a\u0002H\u0011\"\u000e\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\b\b\u0002\u0010\u0014*\u00020\u0015\"\u000e\b\u0003\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001b0\u0013\"\b\b\u0004\u0010\u001b*\u00020\u0015\"\u000e\b\u0005\u0010\u001f*\b\u0012\u0004\u0012\u0002H 0\u0013\"\b\b\u0006\u0010 *\u00020\u0015\"\u000e\b\u0007\u0010$*\b\u0012\u0004\u0012\u0002H%0\u0013\"\b\b\b\u0010%*\u00020\u0015\"\u000e\b\t\u0010)*\b\u0012\u0004\u0012\u0002H*0\u0013\"\b\b\n\u0010**\u00020\u0015\"\u0004\b\u000b\u0010\u00112\u0006\u0010\u0016\u001a\u0002H\u00122\u0006\u0010\u001c\u001a\u0002H\u001a2\u0006\u0010!\u001a\u0002H\u001f2\u0006\u0010&\u001a\u0002H$2\u0006\u0010+\u001a\u0002H)2*\u0010\u0017\u001a&\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H\u00110,H\u0016¢\u0006\u0002\u0010-Je\u0010.\u001a\u0002H\u0011\"\u0014\b\u0001\u0010/*\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H100\"\b\b\u0002\u00101*\u00020\u0015\"\b\b\u0003\u0010\u0014*\u00020\u0015\"\u0004\b\u0004\u0010\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H1002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H\u00110\u0018H\u0016¢\u0006\u0002\u00103J©\u0001\u0010.\u001a\u0002H\u0011\"\u0014\b\u0001\u0010/*\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H100\"\b\b\u0002\u00101*\u00020\u0015\"\b\b\u0003\u0010\u0014*\u00020\u0015\"\u0014\b\u0004\u00104*\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H500\"\b\b\u0005\u00105*\u00020\u0015\"\b\b\u0006\u0010\u001b*\u00020\u0015\"\u0004\b\u0007\u0010\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H1002\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H5002\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u0002H\u00110\u001dH\u0016¢\u0006\u0002\u00107Jí\u0001\u0010.\u001a\u0002H\u0011\"\u0014\b\u0001\u0010/*\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H100\"\b\b\u0002\u00101*\u00020\u0015\"\b\b\u0003\u0010\u0014*\u00020\u0015\"\u0014\b\u0004\u00104*\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H500\"\b\b\u0005\u00105*\u00020\u0015\"\b\b\u0006\u0010\u001b*\u00020\u0015\"\u0014\b\u0007\u00108*\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H900\"\b\b\b\u00109*\u00020\u0015\"\b\b\t\u0010 *\u00020\u0015\"\u0004\b\n\u0010\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H1002\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H5002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H9002\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u0002H\u00110\"H\u0016¢\u0006\u0002\u0010;J±\u0002\u0010.\u001a\u0002H\u0011\"\u0014\b\u0001\u0010/*\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H100\"\b\b\u0002\u00101*\u00020\u0015\"\b\b\u0003\u0010\u0014*\u00020\u0015\"\u0014\b\u0004\u00104*\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H500\"\b\b\u0005\u00105*\u00020\u0015\"\b\b\u0006\u0010\u001b*\u00020\u0015\"\u0014\b\u0007\u00108*\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H900\"\b\b\b\u00109*\u00020\u0015\"\b\b\t\u0010 *\u00020\u0015\"\u0014\b\n\u0010<*\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H=00\"\b\b\u000b\u0010=*\u00020\u0015\"\b\b\f\u0010%*\u00020\u0015\"\u0004\b\r\u0010\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H1002\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H5002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H9002\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H=002$\u0010\u0017\u001a \u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H\u00110'H\u0016¢\u0006\u0002\u0010?Jõ\u0002\u0010.\u001a\u0002H\u0011\"\u0014\b\u0001\u0010/*\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H100\"\b\b\u0002\u00101*\u00020\u0015\"\b\b\u0003\u0010\u0014*\u00020\u0015\"\u0014\b\u0004\u00104*\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H500\"\b\b\u0005\u00105*\u00020\u0015\"\b\b\u0006\u0010\u001b*\u00020\u0015\"\u0014\b\u0007\u00108*\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H900\"\b\b\b\u00109*\u00020\u0015\"\b\b\t\u0010 *\u00020\u0015\"\u0014\b\n\u0010<*\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H=00\"\b\b\u000b\u0010=*\u00020\u0015\"\b\b\f\u0010%*\u00020\u0015\"\u0014\b\r\u0010@*\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002HA00\"\b\b\u000e\u0010A*\u00020\u0015\"\b\b\u000f\u0010**\u00020\u0015\"\u0004\b\u0010\u0010\u00112\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H1002\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u0002H5002\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H9002\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u0002H%\u0012\u0004\u0012\u0002H=002\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002HA002*\u0010\u0017\u001a&\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u0002H\u00110,H\u0016¢\u0006\u0002\u0010CJ³\u0001\u0010D\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015\"\u0004\b\u0002\u0010G*\b\u0012\u0004\u0012\u0002HF0\u00132\u0018\u0010H\u001a\u0014\u0012\u0004\u0012\u0002HF\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0J0I2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2!\b\u0002\u0010M\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020O\u0018\u00010\u001d¢\u0006\u0002\bP2\u001b\b\u0002\u0010Q\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020O\u0018\u00010\u0018¢\u0006\u0002\bP2!\b\u0002\u0010R\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HG\u0012\u0004\u0012\u00020O\u0018\u00010\u001d¢\u0006\u0002\bPH\u0016Ji\u0010S\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015\"\u0004\b\u0002\u0010T*\b\u0012\u0004\u0012\u0002HF0\u00132\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HT0I2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2\u001d\u0010V\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u00020O0\u001d¢\u0006\u0002\bPH\u0016J\u0001\u0010S\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015\"\u0004\b\u0002\u0010T\"\u0004\b\u0003\u0010W*\b\u0012\u0004\u0012\u0002HF0\u00132\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HT0I2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HW0I2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2#\u0010V\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020O0\"¢\u0006\u0002\bPH\u0016J©\u0001\u0010S\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015\"\u0004\b\u0002\u0010T\"\u0004\b\u0003\u0010W\"\u0004\b\u0004\u0010Y*\b\u0012\u0004\u0012\u0002HF0\u00132\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HT0I2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HW0I2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HY0I2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2)\u0010V\u001a%\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u0002HY\u0012\u0004\u0012\u00020O0'¢\u0006\u0002\bPH\u0016JÉ\u0001\u0010S\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015\"\u0004\b\u0002\u0010T\"\u0004\b\u0003\u0010W\"\u0004\b\u0004\u0010Y\"\u0004\b\u0005\u0010[*\b\u0012\u0004\u0012\u0002HF0\u00132\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HT0I2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HW0I2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HY0I2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002H[0I2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2/\u0010V\u001a+\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u0002HY\u0012\u0004\u0012\u0002H[\u0012\u0004\u0012\u00020O0,¢\u0006\u0002\bPH\u0016Jé\u0001\u0010S\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015\"\u0004\b\u0002\u0010T\"\u0004\b\u0003\u0010W\"\u0004\b\u0004\u0010Y\"\u0004\b\u0005\u0010[\"\u0004\b\u0006\u0010]*\b\u0012\u0004\u0012\u0002HF0\u00132\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HT0I2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HW0I2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002HY0I2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002H[0I2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u0002H]0I2\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r25\u0010V\u001a1\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HT\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u0002HY\u0012\u0004\u0012\u0002H[\u0012\u0004\u0012\u0002H]\u0012\u0004\u0012\u00020O0_¢\u0006\u0002\bPH\u0016JO\u0010`\u001a\u00020E\"\b\b\u0001\u0010F*\u00020\u0015*\b\u0012\u0004\u0012\u0002HF0\u00132\b\b\u0002\u0010K\u001a\u00020\r2\b\b\u0002\u0010L\u001a\u00020\r2\u001d\u0010V\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002HF\u0012\u0004\u0012\u00020O0\u001d¢\u0006\u0002\bPH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006a"}, d2 = {"Lcom/bytedance/jedi/arch/ISubscriber;", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "", "lifecycleOwnerHolder", "Lcom/bytedance/jedi/arch/LifecycleOwnerHolder;", "getLifecycleOwnerHolder", "()Lcom/bytedance/jedi/arch/LifecycleOwnerHolder;", "receiverHolder", "Lcom/bytedance/jedi/arch/ReceiverHolder;", "getReceiverHolder", "()Lcom/bytedance/jedi/arch/ReceiverHolder;", "uniqueOnlyGlobal", "", "getUniqueOnlyGlobal", "()Z", "withState", "R", "VM1", "Lcom/bytedance/jedi/arch/JediViewModel;", "S1", "Lcom/bytedance/jedi/arch/State;", "viewModel1", "block", "Lkotlin/Function1;", "(Lcom/bytedance/jedi/arch/JediViewModel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "VM2", "S2", "viewModel2", "Lkotlin/Function2;", "(Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "VM3", "S3", "viewModel3", "Lkotlin/Function3;", "(Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "VM4", "S4", "viewModel4", "Lkotlin/Function4;", "(Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "VM5", "S5", "viewModel5", "Lkotlin/Function5;", "(Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lcom/bytedance/jedi/arch/JediViewModel;Lkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "withSubstate", "M1", "Lcom/bytedance/jedi/arch/Middleware;", "PROP1", "middleware1", "(Lcom/bytedance/jedi/arch/Middleware;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "M2", "PROP2", "middleware2", "(Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "M3", "PROP3", "middleware3", "(Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "M4", "PROP4", "middleware4", "(Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "M5", "PROP5", "middleware5", "(Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lcom/bytedance/jedi/arch/Middleware;Lkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "asyncSubscribe", "Lio/reactivex/disposables/Disposable;", "S", "T", "prop", "Lkotlin/reflect/KProperty1;", "Lcom/bytedance/jedi/arch/Async;", "uniqueOnly", "force", "onError", "", "", "Lkotlin/ExtensionFunctionType;", "onLoading", "onSuccess", "selectSubscribe", "A", "prop1", "subscriber", "B", "prop2", "C", "prop3", "D", "prop4", "E", "prop5", "Lkotlin/Function6;", "subscribe", "arch_release"}, k = 1, mv = {1, 1, 15})
public interface e<RECEIVER extends d> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\n\b\u0002\u0010\u0005 \u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "it", "", "invoke", "com/bytedance/jedi/arch/ISubscriber$asyncSubscribe$1$1$result$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.arch.e$a$a  reason: collision with other inner class name */
        static final class C0192a extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ Function2 $block;
            final /* synthetic */ r $holder$inlined;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0192a(Function2 function2, r rVar) {
                super(1);
                this.$block = function2;
                this.$holder$inlined = rVar;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
                d e2 = this.$holder$inlined.e();
                if (e2 != null) {
                    this.$block.invoke(e2, th);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\n\b\u0002\u0010\u0005 \u0001*\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "invoke", "com/bytedance/jedi/arch/ISubscriber$asyncSubscribe$1$2$result$1"}, k = 3, mv = {1, 1, 15})
        static final class b extends Lambda implements Function0<Unit> {
            final /* synthetic */ Function1 $block;
            final /* synthetic */ r $holder$inlined;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Function1 function1, r rVar) {
                super(0);
                this.$block = function1;
                this.$holder$inlined = rVar;
            }

            public final void invoke() {
                d e2 = this.$holder$inlined.e();
                if (e2 != null) {
                    this.$block.invoke(e2);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\n\b\u0002\u0010\u0005 \u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0004H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "it", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/ISubscriber$asyncSubscribe$1$3$result$1"}, k = 3, mv = {1, 1, 15})
        static final class c extends Lambda implements Function1<T, Unit> {
            final /* synthetic */ Function2 $block;
            final /* synthetic */ r $holder$inlined;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(Function2 function2, r rVar) {
                super(1);
                this.$block = function2;
                this.$holder$inlined = rVar;
            }

            public final void invoke(T t) {
                d e2 = this.$holder$inlined.e();
                if (e2 != null) {
                    this.$block.invoke(e2, t);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\n\b\u0002\u0010\u0005 \u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0004H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "A", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "it", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/ISubscriber$selectSubscribe$1$1"}, k = 3, mv = {1, 1, 15})
        static final class d extends Lambda implements Function1<A, Unit> {
            final /* synthetic */ boolean $force$inlined;
            final /* synthetic */ r $holder;
            final /* synthetic */ KProperty1 $prop1$inlined;
            final /* synthetic */ Function2 $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ boolean $uniqueOnly$inlined;
            final /* synthetic */ e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(r rVar, e eVar, JediViewModel jediViewModel, KProperty1 kProperty1, boolean z, boolean z2, Function2 function2) {
                super(1);
                this.$holder = rVar;
                this.this$0 = eVar;
                this.$this_selectSubscribe$inlined = jediViewModel;
                this.$prop1$inlined = kProperty1;
                this.$uniqueOnly$inlined = z;
                this.$force$inlined = z2;
                this.$subscriber$inlined = function2;
            }

            public final void invoke(A a2) {
                d e2 = this.$holder.e();
                if (e2 != null) {
                    this.$subscriber$inlined.invoke(e2, a2);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)V", "com/bytedance/jedi/arch/ISubscriber$subscribe$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.arch.e$a$e  reason: collision with other inner class name */
        static final class C0193e extends Lambda implements Function1<S, Unit> {
            final /* synthetic */ boolean $force$inlined;
            final /* synthetic */ r $holder;
            final /* synthetic */ Function2 $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_subscribe$inlined;
            final /* synthetic */ boolean $uniqueOnly$inlined;
            final /* synthetic */ e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0193e(r rVar, e eVar, JediViewModel jediViewModel, boolean z, boolean z2, Function2 function2) {
                super(1);
                this.$holder = rVar;
                this.this$0 = eVar;
                this.$this_subscribe$inlined = jediViewModel;
                this.$uniqueOnly$inlined = z;
                this.$force$inlined = z2;
                this.$subscriber$inlined = function2;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((S) (x) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull S s) {
                Intrinsics.checkParameterIsNotNull(s, AdvanceSetting.NETWORK_TYPE);
                d e2 = this.$holder.e();
                if (e2 != null) {
                    this.$subscriber$inlined.invoke(e2, s);
                }
            }
        }

        public static <RECEIVER extends d, VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
            Intrinsics.checkParameterIsNotNull(vm1, "viewModel1");
            Intrinsics.checkParameterIsNotNull(function1, "block");
            return function1.invoke(vm1.b());
        }

        @NotNull
        public static <RECEIVER extends d, S extends x> Disposable a(e<? extends RECEIVER> eVar, @NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super RECEIVER, ? super S, Unit> function2) {
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$subscribe");
            Intrinsics.checkParameterIsNotNull(function2, "subscriber");
            r b2 = eVar.b();
            LifecycleOwner d2 = eVar.a().d();
            C0193e eVar2 = new C0193e(b2, eVar, jediViewModel, z, z2, function2);
            Function1 function1 = eVar2;
            Intrinsics.checkParameterIsNotNull(function1, "subscriber");
            Observable distinctUntilChanged = jediViewModel.a().a().distinctUntilChanged();
            Intrinsics.checkExpressionValueIsNotNull(distinctUntilChanged, "storeOwner.observable.distinctUntilChanged()");
            return jediViewModel.a(distinctUntilChanged, d2, z, z2, function1);
        }

        @NotNull
        public static <RECEIVER extends d, S extends x, A> Disposable a(e<? extends RECEIVER> eVar, @NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super RECEIVER, ? super A, Unit> function2) {
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$selectSubscribe");
            Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
            Intrinsics.checkParameterIsNotNull(function2, "subscriber");
            r b2 = eVar.b();
            LifecycleOwner d2 = eVar.a().d();
            KProperty1<S, ? extends A> kProperty12 = kProperty1;
            boolean z3 = z;
            boolean z4 = z2;
            d dVar = new d(b2, eVar, jediViewModel, kProperty12, z3, z4, function2);
            return jediViewModel.a(d2, kProperty12, z3, z4, (Function1<? super A, Unit>) dVar);
        }

        @NotNull
        public static <RECEIVER extends d, S extends x, T> Disposable a(e<? extends RECEIVER> eVar, @NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super RECEIVER, ? super Throwable, Unit> function2, @Nullable Function1<? super RECEIVER, Unit> function1, @Nullable Function2<? super RECEIVER, ? super T, Unit> function22) {
            Function1 function12;
            Function0 function0;
            Function1 function13;
            Function2<? super RECEIVER, ? super Throwable, Unit> function23 = function2;
            Function1<? super RECEIVER, Unit> function14 = function1;
            Function2<? super RECEIVER, ? super T, Unit> function24 = function22;
            JediViewModel<S> jediViewModel2 = jediViewModel;
            Intrinsics.checkParameterIsNotNull(jediViewModel, "$this$asyncSubscribe");
            KProperty1<S, ? extends a<? extends T>> kProperty12 = kProperty1;
            Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
            r b2 = eVar.b();
            LifecycleOwner d2 = eVar.a().d();
            if (function23 != null) {
                function12 = new C0192a(function23, b2);
            } else {
                function12 = null;
            }
            if (function14 != null) {
                function0 = new b(function14, b2);
            } else {
                function0 = null;
            }
            if (function24 != null) {
                function13 = new c(function24, b2);
            } else {
                function13 = null;
            }
            return jediViewModel.a(d2, kProperty1, z, z2, function12, function0, function13);
        }

        public static /* synthetic */ Disposable a(e eVar, JediViewModel jediViewModel, KProperty1 kProperty1, boolean z, boolean z2, Function2 function2, Function1 function1, Function2 function22, int i, Object obj) {
            boolean z3;
            Function2 function23;
            Function1 function12;
            Function2 function24;
            if ((i & 2) != 0) {
                z3 = eVar.c();
            } else {
                z3 = z;
            }
            if ((i & 8) != 0) {
                function23 = null;
            } else {
                function23 = function2;
            }
            if ((i & 16) != 0) {
                function12 = null;
            } else {
                function12 = function1;
            }
            if ((i & 32) != 0) {
                function24 = null;
            } else {
                function24 = function22;
            }
            return eVar.a(jediViewModel, kProperty1, z3, false, function23, function12, function24);
        }
    }

    @NotNull
    k a();

    @NotNull
    <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super RECEIVER, ? super A, Unit> function2);

    @NotNull
    <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super RECEIVER, ? super Throwable, Unit> function2, @Nullable Function1<? super RECEIVER, Unit> function1, @Nullable Function2<? super RECEIVER, ? super T, Unit> function22);

    @NotNull
    <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super RECEIVER, ? super S, Unit> function2);

    <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1);

    @NotNull
    r<RECEIVER> b();

    boolean c();
}
