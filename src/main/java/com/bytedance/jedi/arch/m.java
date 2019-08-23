package com.bytedance.jedi.arch;

import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.RestrictTo;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005Jt\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0002\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001b0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010#2\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020!\u0018\u00010\u001fH\u0004J9\u0010%\u001a\u00020!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\u001d\u0010\b\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\nJ#\u0010'\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0002\b(J@\u0010)\u001a\u00020\u0018\"\u0004\b\u0002\u0010*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u00020!0\u001fH\u0004J`\u0010)\u001a\u00020\u0018\"\u0004\b\u0002\u0010*\"\u0004\b\u0003\u0010-2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020!0\tH\u0004J\u0001\u0010)\u001a\u00020\u0018\"\u0004\b\u0002\u0010*\"\u0004\b\u0003\u0010-\"\u0004\b\u0004\u0010/2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H/0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u001e\u0010,\u001a\u001a\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u00020!01H\u0004J \u0001\u0010)\u001a\u00020\u0018\"\u0004\b\u0002\u0010*\"\u0004\b\u0003\u0010-\"\u0004\b\u0004\u0010/\"\u0004\b\u0005\u001022\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H/0\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H20\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2$\u0010,\u001a \u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u00020!04H\u0004JÀ\u0001\u0010)\u001a\u00020\u0018\"\u0004\b\u0002\u0010*\"\u0004\b\u0003\u0010-\"\u0004\b\u0004\u0010/\"\u0004\b\u0005\u00102\"\u0004\b\u0006\u001052\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H/0\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H20\f2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H50\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2*\u0010,\u001a&\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020!07H\u0004J!\u00108\u001a\u00020!2\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0002\b\nH\u0004J!\u0010:\u001a\u00020!2\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u001f¢\u0006\u0002\b\nH\u0004J&\u0010;\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020!0\u001fH\u0004J\"\u0010<\u001a\u00020!2\u0018\u0010=\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020!0\tH\u0004J\u001c\u0010>\u001a\u00020!2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020!0\u001fH\u0004J±\u0001\u0010\u0017\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@\"\u0004\b\u0003\u0010\u0019*\b\u0012\u0004\u0012\u0002H?0A2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001b0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d2!\b\u0002\u0010\u001e\u001a\u001b\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\t¢\u0006\u0002\b\n2\u001b\b\u0002\u0010\"\u001a\u0015\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u00020!\u0018\u00010\u001f¢\u0006\u0002\b\n2!\b\u0002\u0010$\u001a\u001b\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020!\u0018\u00010\t¢\u0006\u0002\b\nJ\f\u0010C\u001a\u00020\u0018*\u00020\u0018H\u0004J/\u0010D\u001a\u00020\u0018*\u00020E2#\u0010F\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\nJW\u0010D\u001a\u00020\u0018\"\u0004\b\u0002\u0010\u0019\"\u0004\b\u0003\u0010G*\b\u0012\u0004\u0012\u0002H\u00190H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002HG0\u001f2#\u0010F\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0\u001b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\nH\u0004J=\u0010D\u001a\u00020\u0018\"\u0004\b\u0002\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190H2#\u0010F\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\nH\u0004JW\u0010D\u001a\u00020\u0018\"\u0004\b\u0002\u0010\u0019\"\u0004\b\u0003\u0010G*\b\u0012\u0004\u0012\u0002H\u00190J2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002HG0\u001f2#\u0010F\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002HG0\u001b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\nH\u0004J=\u0010D\u001a\u00020\u0018\"\u0004\b\u0002\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190J2#\u0010F\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\nH\u0004Jg\u0010)\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@\"\u0004\b\u0003\u0010**\b\u0012\u0004\u0012\u0002H?0A2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d2\u001d\u0010,\u001a\u0019\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u00020!0\t¢\u0006\u0002\b\nJ\u0001\u0010)\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@\"\u0004\b\u0003\u0010*\"\u0004\b\u0004\u0010-*\b\u0012\u0004\u0012\u0002H?0A2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d2#\u0010,\u001a\u001f\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u00020!01¢\u0006\u0002\b\nJ§\u0001\u0010)\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@\"\u0004\b\u0003\u0010*\"\u0004\b\u0004\u0010-\"\u0004\b\u0005\u0010/*\b\u0012\u0004\u0012\u0002H?0A2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H/0\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d2)\u0010,\u001a%\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u00020!04¢\u0006\u0002\b\nJÇ\u0001\u0010)\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@\"\u0004\b\u0003\u0010*\"\u0004\b\u0004\u0010-\"\u0004\b\u0005\u0010/\"\u0004\b\u0006\u00102*\b\u0012\u0004\u0012\u0002H?0A2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H/0\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H20\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d2/\u0010,\u001a+\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u00020!07¢\u0006\u0002\b\nJç\u0001\u0010)\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@\"\u0004\b\u0003\u0010*\"\u0004\b\u0004\u0010-\"\u0004\b\u0005\u0010/\"\u0004\b\u0006\u00102\"\u0004\b\u0007\u00105*\b\u0012\u0004\u0012\u0002H?0A2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H*0\f2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H-0\f2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H/0\f2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H20\f2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H50\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d25\u0010,\u001a1\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H-\u0012\u0004\u0012\u0002H/\u0012\u0004\u0012\u0002H2\u0012\u0004\u0012\u0002H5\u0012\u0004\u0012\u00020!0K¢\u0006\u0002\b\nJM\u0010;\u001a\u00020\u0018\"\b\b\u0002\u0010?*\u00020@*\b\u0012\u0004\u0012\u0002H?0A2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010B\u001a\u00020\u001d2\u001d\u0010,\u001a\u0019\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020!0\t¢\u0006\u0002\b\nR\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R%\u0010\b\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\b\nX.¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006L"}, d2 = {"Lcom/bytedance/jedi/arch/Middleware;", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "mainStateReducer", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "substate", "Lkotlin/reflect/KProperty1;", "getSubstate$arch_release", "()Lkotlin/reflect/KProperty1;", "setSubstate$arch_release", "(Lkotlin/reflect/KProperty1;)V", "viewModel", "Lcom/bytedance/jedi/arch/JediViewModel;", "getViewModel$arch_release", "()Lcom/bytedance/jedi/arch/JediViewModel;", "setViewModel$arch_release", "(Lcom/bytedance/jedi/arch/JediViewModel;)V", "asyncSubscribe", "Lio/reactivex/disposables/Disposable;", "T", "prop", "Lcom/bytedance/jedi/arch/Async;", "uniqueOnly", "", "onError", "Lkotlin/Function1;", "", "", "onLoading", "Lkotlin/Function0;", "onSuccess", "inject", "subState", "prepare", "prepare$arch_release", "selectSubscribe", "A", "prop1", "subscriber", "B", "prop2", "C", "prop3", "Lkotlin/Function3;", "D", "prop4", "Lkotlin/Function4;", "E", "prop5", "Lkotlin/Function5;", "setState", "reducer", "setSubstate", "subscribe", "withState", "block", "withSubstate", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/bytedance/jedi/arch/ISubscriber;", "force", "disposeOnClear", "execute", "Lio/reactivex/Completable;", "stateReducer", "V", "Lio/reactivex/Observable;", "mapper", "Lio/reactivex/Single;", "Lkotlin/Function6;", "arch_release"}, k = 1, mv = {1, 1, 15})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class m<S extends x, PROP extends x> {

    /* renamed from: a  reason: collision with root package name */
    CompositeDisposable f21395a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public JediViewModel<S> f21396b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public KProperty1<S, ? extends PROP> f21397c;

    /* renamed from: d  reason: collision with root package name */
    public Function2<? super S, ? super PROP, ? extends S> f21398d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "T", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "", "invoke", "com/bytedance/jedi/arch/Middleware$asyncSubscribe$1$1$result$1"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Function2 $block;
        final /* synthetic */ r $holder$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Function2 function2, r rVar) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\u0007*\u00020\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "T", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "invoke", "com/bytedance/jedi/arch/Middleware$asyncSubscribe$1$2$result$1"}, k = 3, mv = {1, 1, 15})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u0002H\u0004H\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "T", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/Middleware$asyncSubscribe$1$3$result$1"}, k = 3, mv = {1, 1, 15})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\b\b\u0001\u0010\u0002*\u00020\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "T", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<T, T> {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u0005\"\b\b\u0003\u0010\u0001*\u00020\u0005*\u0002H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "PROP", "T", "V", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lcom/bytedance/jedi/arch/State;"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<PROP, PROP> {
        final /* synthetic */ Function2 $stateReducer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Function2 function2) {
            super(1);
            this.$stateReducer = function2;
        }

        @NotNull
        public final PROP invoke(@NotNull PROP prop) {
            Intrinsics.checkParameterIsNotNull(prop, "$receiver");
            return (x) this.$stateReducer.invoke(prop, new l());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0005\"\b\b\u0003\u0010\u0006*\u00020\u00052\u0006\u0010\u0007\u001a\u0002H\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/Async;", "V", "T", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "apply", "(Ljava/lang/Object;)Lcom/bytedance/jedi/arch/Async;"}, k = 3, mv = {1, 1, 15})
    static final class f<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f21399a;

        f(Function1 function1) {
            this.f21399a = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new aa(this.f21399a.invoke(obj));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0005\"\b\b\u0003\u0010\u0006*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/Fail;", "V", "T", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
    static final class g<T, R> implements Function<Throwable, a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f21400a = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            return new c(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u0005\"\b\b\u0003\u0010\u0006*\u00020\u00052\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0003 \t*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\b0\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "T", "V", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "asyncData", "Lcom/bytedance/jedi/arch/Async;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Consumer<a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f21401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f21402b;

        h(m mVar, Function2 function2) {
            this.f21401a = mVar;
            this.f21402b = function2;
        }

        public final /* synthetic */ void accept(Object obj) {
            final a aVar = (a) obj;
            this.f21401a.b(new Function1<PROP, PROP>(this) {
                final /* synthetic */ h this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final PROP invoke(@NotNull PROP prop) {
                    Intrinsics.checkParameterIsNotNull(prop, "$receiver");
                    Function2 function2 = this.this$0.f21402b;
                    a aVar = aVar;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "asyncData");
                    return (x) function2.invoke(prop, aVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u0002H\u0004H\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "A", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/Middleware$selectSubscribe$1$1"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<A, Unit> {
        final /* synthetic */ boolean $force$inlined;
        final /* synthetic */ r $holder;
        final /* synthetic */ KProperty1 $prop1$inlined;
        final /* synthetic */ Function2 $subscriber$inlined;
        final /* synthetic */ e $this_selectSubscribe$inlined;
        final /* synthetic */ boolean $uniqueOnly$inlined;
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(r rVar, m mVar, e eVar, KProperty1 kProperty1, boolean z, boolean z2, Function2 function2) {
            super(1);
            this.$holder = rVar;
            this.this$0 = mVar;
            this.$this_selectSubscribe$inlined = eVar;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0002*\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lcom/bytedance/jedi/arch/State;"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<S, S> {
        final /* synthetic */ Function1 $reducer;
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m mVar, Function1 function1) {
            super(1);
            this.this$0 = mVar;
            this.$reducer = function1;
        }

        @NotNull
        public final S invoke(@NotNull S s) {
            Intrinsics.checkParameterIsNotNull(s, "$receiver");
            Function2<? super S, ? super PROP, ? extends S> function2 = this.this$0.f21398d;
            if (function2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainStateReducer");
            }
            return (x) function2.invoke(s, this.$reducer.invoke(this.this$0.a().invoke(s)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)V"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<S, Unit> {
        final /* synthetic */ Function2 $block;
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(m mVar, Function2 function2) {
            super(1);
            this.this$0 = mVar;
            this.$block = function2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S) (x) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull S s) {
            Intrinsics.checkParameterIsNotNull(s, AdvanceSetting.NETWORK_TYPE);
            this.$block.invoke(s, this.this$0.a().invoke(s));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "PROP", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)V"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function1<S, Unit> {
        final /* synthetic */ Function1 $block;
        final /* synthetic */ m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m mVar, Function1 function1) {
            super(1);
            this.this$0 = mVar;
            this.$block = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((S) (x) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull S s) {
            Intrinsics.checkParameterIsNotNull(s, AdvanceSetting.NETWORK_TYPE);
            this.$block.invoke(this.this$0.a().invoke(s));
        }
    }

    @NotNull
    public final KProperty1<S, PROP> a() {
        KProperty1<S, ? extends PROP> kProperty1 = this.f21397c;
        if (kProperty1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("substate");
        }
        return kProperty1;
    }

    public final void a(@NotNull Function1<? super PROP, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        JediViewModel<S> jediViewModel = this.f21396b;
        if (jediViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        jediViewModel.d(new l(this, function1));
    }

    public final void b(@NotNull Function1<? super PROP, ? extends PROP> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "reducer");
        JediViewModel<S> jediViewModel = this.f21396b;
        if (jediViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        jediViewModel.e(new j(this, function1));
    }

    /* access modifiers changed from: protected */
    public final void a(@NotNull Function2<? super S, ? super PROP, Unit> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "block");
        JediViewModel<S> jediViewModel = this.f21396b;
        if (jediViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        jediViewModel.d(new k(this, function2));
    }

    @NotNull
    public final <T> Disposable a(@NotNull Observable<T> observable, @NotNull Function2<? super PROP, ? super a<? extends T>, ? extends PROP> function2) {
        Intrinsics.checkParameterIsNotNull(observable, "$this$execute");
        Intrinsics.checkParameterIsNotNull(function2, "stateReducer");
        Function1 function1 = d.INSTANCE;
        Intrinsics.checkParameterIsNotNull(observable, "$this$execute");
        Intrinsics.checkParameterIsNotNull(function1, "mapper");
        Intrinsics.checkParameterIsNotNull(function2, "stateReducer");
        b(new e(function2));
        Disposable subscribe = observable.map(new f(function1)).onErrorReturn(g.f21400a).subscribe((Consumer<? super T>) new h<Object>(this, function2));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "map {\n            val su…ateReducer(asyncData) } }");
        Intrinsics.checkParameterIsNotNull(subscribe, "$this$disposeOnClear");
        CompositeDisposable compositeDisposable = this.f21395a;
        if (compositeDisposable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("disposables");
        }
        compositeDisposable.add(subscribe);
        return subscribe;
    }

    public final void a(@NotNull KProperty1<S, ? extends PROP> kProperty1, @NotNull Function2<? super S, ? super PROP, ? extends S> function2) {
        Intrinsics.checkParameterIsNotNull(kProperty1, "subState");
        Intrinsics.checkParameterIsNotNull(function2, "mainStateReducer");
        this.f21397c = kProperty1;
        this.f21398d = function2;
    }

    @NotNull
    public final <RECEIVER extends d, A> Disposable a(@NotNull e<? extends RECEIVER> eVar, @NotNull KProperty1<PROP, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super RECEIVER, ? super A, Unit> function2) {
        e<? extends RECEIVER> eVar2 = eVar;
        Intrinsics.checkParameterIsNotNull(eVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(function2, "subscriber");
        r b2 = eVar.b();
        JediViewModel<S> jediViewModel = this.f21396b;
        if (jediViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LifecycleOwner d2 = eVar.a().d();
        KProperty1<S, ? extends PROP> kProperty12 = this.f21397c;
        if (kProperty12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("substate");
        }
        boolean z3 = z;
        boolean z4 = z2;
        i iVar = new i(b2, this, eVar, kProperty1, z3, z4, function2);
        return jediViewModel.a(d2, kProperty1, kProperty12, z3, z4, (Function1<? super A, Unit>) iVar);
    }

    @NotNull
    public final <RECEIVER extends d, T> Disposable a(@NotNull e<? extends RECEIVER> eVar, @NotNull KProperty1<PROP, ? extends a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super RECEIVER, ? super Throwable, Unit> function2, @Nullable Function1<? super RECEIVER, Unit> function1, @Nullable Function2<? super RECEIVER, ? super T, Unit> function22) {
        Intrinsics.checkParameterIsNotNull(eVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop");
        r b2 = eVar.b();
        JediViewModel<S> jediViewModel = this.f21396b;
        if (jediViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        LifecycleOwner d2 = eVar.a().d();
        KProperty1<S, ? extends PROP> kProperty12 = this.f21397c;
        if (kProperty12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("substate");
        }
        Function1 cVar = new c(function22, b2);
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(kProperty12, "subprop");
        return jediViewModel.a(d2, kProperty1, kProperty12, z, z2, (Function1<? super A, Unit>) new JediViewModel.g<Object,Unit>(cVar, new a(function2, b2), new b(function1, b2)));
    }
}
