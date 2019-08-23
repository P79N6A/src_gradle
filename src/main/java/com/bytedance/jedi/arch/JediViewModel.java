package com.bytedance.jedi.arch;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.CallSuper;
import android.support.annotation.RestrictTo;
import com.bytedance.jedi.arch.x;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005Jt\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\"\u0018\u00010 H\u0004J\u0001\u0010&\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u00192\b\u0010'\u001a\u0004\u0018\u00010(2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\"\u0018\u00010 H\u0000¢\u0006\u0002\b*J1\u0010+\u001a\u00020\"\"\u0004\b\u0001\u0010,\"\u0014\b\u0002\u0010-*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0.2\u0006\u0010/\u001a\u0002H-H\u0007¢\u0006\u0002\u00100J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0002J\r\u00103\u001a\u00028\u0000H$¢\u0006\u0002\u0010\u0010J\u001f\u00104\u001a\u00020\"2\u0017\u00105\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b6J«\u0001\u00107\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u0019\"\b\b\u0002\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u0002H,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c0\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010$2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\"\u0018\u00010 H\u0000¢\u0006\u0002\b9J÷\u0001\u0010:\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\u0004\b\u0004\u0010>\"\u0004\b\u0005\u0010?\"\b\b\u0006\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H>0\u001b2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H?0\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2*\u0010D\u001a&\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u00020\"0EH\u0000¢\u0006\u0002\bFJ×\u0001\u0010:\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\u0004\b\u0004\u0010>\"\b\b\u0005\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H>0\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2$\u0010D\u001a \u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u00020\"0GH\u0000¢\u0006\u0002\bFJ·\u0001\u0010:\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\b\b\u0004\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u001e\u0010D\u001a\u001a\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u00020\"0HH\u0000¢\u0006\u0002\bFJ\u0001\u0010:\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\b\b\u0003\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u00020\"0IH\u0000¢\u0006\u0002\bFJw\u0010:\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\b\b\u0002\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\"0 H\u0000¢\u0006\u0002\bFJ]\u0010J\u001a\u00020\u0018\"\b\b\u0001\u0010,*\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u0002H,\u0012\u0004\u0012\u00020\"0 H\u0000¢\u0006\u0002\bKJ\b\u0010L\u001a\u00020\"H\u0015J\b\u0010M\u001a\u00020\"H\u0014J@\u0010N\u001a\u00020\u0018\"\u0004\b\u0001\u0010;2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\"0 H\u0004J`\u0010N\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u00020\"0IH\u0004J\u0001\u0010N\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u001e\u0010D\u001a\u001a\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u00020\"0HH\u0004J \u0001\u0010N\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\u0004\b\u0004\u0010>2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H>0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2$\u0010D\u001a \u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u00020\"0GH\u0004JÀ\u0001\u0010N\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\u0004\b\u0004\u0010>\"\u0004\b\u0005\u0010?2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H>0\u001b2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H?0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2*\u0010D\u001a&\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u00020\"0EH\u0004JY\u0010O\u001a\u00020\u0018\"\u0004\b\u0001\u0010;2\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u00020\"0 H\u0000¢\u0006\u0002\bPJy\u0010O\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<2\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u00020\"0IH\u0000¢\u0006\u0002\bPJ\u0001\u0010O\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=2\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u001e\u0010D\u001a\u001a\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u00020\"0HH\u0000¢\u0006\u0002\bPJ¹\u0001\u0010O\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\u0004\b\u0004\u0010>2\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H>0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2$\u0010D\u001a \u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u00020\"0GH\u0000¢\u0006\u0002\bPJÙ\u0001\u0010O\u001a\u00020\u0018\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010<\"\u0004\b\u0003\u0010=\"\u0004\b\u0004\u0010>\"\u0004\b\u0005\u0010?2\b\u0010'\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H;0\u001b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H<0\u001b2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H=0\u001b2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H>0\u001b2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H?0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2*\u0010D\u001a&\u0012\u0004\u0012\u0002H;\u0012\u0004\u0012\u0002H<\u0012\u0004\u0012\u0002H=\u0012\u0004\u0012\u0002H>\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u00020\"0EH\u0000¢\u0006\u0002\bPJ!\u0010Q\u001a\u00020\"2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b6H\u0004J&\u0010S\u001a\u00020\"2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000 ¢\u0006\u0002\b6H\u0000¢\u0006\u0002\bTJ&\u0010U\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0 H\u0004J?\u0010V\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0 H\u0000¢\u0006\u0002\bWJ\u001c\u0010X\u001a\u00020\"2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0 H\u0004J!\u0010Z\u001a\u00020\"2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0 H\u0000¢\u0006\u0002\b[J\f\u0010\\\u001a\u00020\u0018*\u00020\u0018H\u0004J/\u0010]\u001a\u00020\u0018*\u00020^2#\u0010_\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001c\u0012\u0004\u0012\u00028\u00000I¢\u0006\u0002\b6JW\u0010]\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u0019\"\u0004\b\u0002\u0010`*\b\u0012\u0004\u0012\u0002H\u00190a2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H`0 2#\u0010_\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H`0\u001c\u0012\u0004\u0012\u00028\u00000I¢\u0006\u0002\b6H\u0004J=\u0010]\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190a2#\u0010_\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c\u0012\u0004\u0012\u00028\u00000I¢\u0006\u0002\b6H\u0004JW\u0010]\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u0019\"\u0004\b\u0002\u0010`*\b\u0012\u0004\u0012\u0002H\u00190c2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H`0 2#\u0010_\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H`0\u001c\u0012\u0004\u0012\u00028\u00000I¢\u0006\u0002\b6H\u0004J=\u0010]\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190c2#\u0010_\u001a\u001f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u001c\u0012\u0004\u0012\u00028\u00000I¢\u0006\u0002\b6H\u0004JL\u0010d\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00190a2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010)\u001a\u00020\u001e2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u00020\"0 H\u0002J7\u0010f\u001a\b\u0012\u0004\u0012\u0002H,0a\"\b\b\u0001\u0010,*\u00020\u0002*\b\u0012\u0004\u0012\u00028\u00000a2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H,0\u001bH\bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006g"}, d2 = {"Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "Landroid/arch/lifecycle/ViewModel;", "Lcom/bytedance/jedi/arch/ViewModelInitializer;", "()V", "bindingFactory", "Lcom/bytedance/jedi/arch/MiddlewareBindingFactory;", "getBindingFactory", "()Lcom/bytedance/jedi/arch/MiddlewareBindingFactory;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "initialState", "Lcom/bytedance/jedi/arch/State;", "state", "getState$arch_release", "()Lcom/bytedance/jedi/arch/State;", "storeOwner", "Lcom/bytedance/jedi/arch/StoreOwner;", "getStoreOwner", "()Lcom/bytedance/jedi/arch/StoreOwner;", "storeOwner$delegate", "Lkotlin/Lazy;", "asyncSubscribe", "Lio/reactivex/disposables/Disposable;", "T", "prop1", "Lkotlin/reflect/KProperty1;", "Lcom/bytedance/jedi/arch/Async;", "uniqueOnly", "", "onError", "Lkotlin/Function1;", "", "", "onLoading", "Lkotlin/Function0;", "onSuccess", "asyncSubscribeInternal", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "force", "asyncSubscribeInternal$arch_release", "bindMiddleware", "PROP", "MW", "Lcom/bytedance/jedi/arch/Middleware;", "middleware", "(Lcom/bytedance/jedi/arch/Middleware;)V", "createStore", "Lcom/bytedance/jedi/arch/Store;", "defaultState", "initialize", "argsAcceptor", "Lkotlin/ExtensionFunctionType;", "middlewareAsyncSubscribeInternal", "subprop", "middlewareAsyncSubscribeInternal$arch_release", "middlewareSelectSubscribeInternal", "A", "B", "C", "D", "E", "prop2", "prop3", "prop4", "prop5", "subscriber", "Lkotlin/Function5;", "middlewareSelectSubscribeInternal$arch_release", "Lkotlin/Function4;", "Lkotlin/Function3;", "Lkotlin/Function2;", "middlewareSubscribeInternal", "middlewareSubscribeInternal$arch_release", "onCleared", "onStart", "selectSubscribe", "selectSubscribeInternal", "selectSubscribeInternal$arch_release", "setState", "reducer", "setStateInternal", "setStateInternal$arch_release", "subscribe", "subscribeInternal", "subscribeInternal$arch_release", "withState", "block", "withStateInternal", "withStateInternal$arch_release", "disposeOnClear", "execute", "Lio/reactivex/Completable;", "stateReducer", "V", "Lio/reactivex/Observable;", "mapper", "Lio/reactivex/Single;", "lifecycleAwareSubscribe", "lifecycleOwner", "middlewareComposer", "arch_release"}, k = 1, mv = {1, 1, 15})
public abstract class JediViewModel<S extends x> extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2280a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JediViewModel.class), "storeOwner", "getStoreOwner()Lcom/bytedance/jedi/arch/StoreOwner;"))};

    /* renamed from: b  reason: collision with root package name */
    S f2281b;
    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: c  reason: collision with root package name */
    public final o f2282c = new p();

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f2283d = LazyKt.lazy(new m(this));

    /* renamed from: e  reason: collision with root package name */
    private final CompositeDisposable f2284e = new CompositeDisposable();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "S", "Lcom/bytedance/jedi/arch/State;", "it", "Lcom/bytedance/jedi/arch/Async;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<a<? extends T>, Unit> {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function0 $onLoading;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Function1 function1, Function1 function12, Function0 function0) {
            super(1);
            this.$onSuccess = function1;
            this.$onError = function12;
            this.$onLoading = function0;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a<? extends T> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
            if (aVar instanceof aa) {
                Function1 function1 = this.$onSuccess;
                if (function1 != null) {
                    function1.invoke(((aa) aVar).a());
                }
            } else if (aVar instanceof c) {
                Function1 function12 = this.$onError;
                if (function12 != null) {
                    function12.invoke(((c) aVar).f21347a);
                }
            } else if (aVar instanceof l) {
                Function0 function0 = this.$onLoading;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "T", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<T, T> {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0001*\u00020\u0004*\u0002H\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "S", "T", "V", "Lcom/bytedance/jedi/arch/State;", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lcom/bytedance/jedi/arch/State;"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<S, S> {
        final /* synthetic */ Function2 $stateReducer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Function2 function2) {
            super(1);
            this.$stateReducer = function2;
        }

        @NotNull
        public final S invoke(@NotNull S s) {
            Intrinsics.checkParameterIsNotNull(s, "$receiver");
            return (x) this.$stateReducer.invoke(s, new l());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/Success;", "V", "T", "S", "Lcom/bytedance/jedi/arch/State;", "it", "apply", "(Ljava/lang/Object;)Lcom/bytedance/jedi/arch/Success;"}, k = 3, mv = {1, 1, 15})
    static final class d<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f21333a;

        d(Function1 function1) {
            this.f21333a = function1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new aa(this.f21333a.invoke(obj));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/Fail;", "V", "T", "S", "Lcom/bytedance/jedi/arch/State;", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
    static final class e<T, R> implements Function<Throwable, a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f21334a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            return new c(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u0002H\u0003 \b*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "T", "V", "S", "Lcom/bytedance/jedi/arch/State;", "asyncData", "Lcom/bytedance/jedi/arch/Async;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class f<T> implements Consumer<a<? extends V>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f21335a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f21336b;

        f(JediViewModel jediViewModel, Function2 function2) {
            this.f21335a = jediViewModel;
            this.f21336b = function2;
        }

        public final /* synthetic */ void accept(Object obj) {
            final a aVar = (a) obj;
            this.f21335a.c(new Function1<S, S>(this) {
                final /* synthetic */ f this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final S invoke(@NotNull S s) {
                    Intrinsics.checkParameterIsNotNull(s, "$receiver");
                    Function2 function2 = this.this$0.f21336b;
                    a aVar = aVar;
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "asyncData");
                    return (x) function2.invoke(s, aVar);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "PROP", "Lcom/bytedance/jedi/arch/State;", "S", "it", "Lcom/bytedance/jedi/arch/Async;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<a<? extends T>, Unit> {
        final /* synthetic */ Function1 $onError;
        final /* synthetic */ Function0 $onLoading;
        final /* synthetic */ Function1 $onSuccess;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Function1 function1, Function1 function12, Function0 function0) {
            super(1);
            this.$onSuccess = function1;
            this.$onError = function12;
            this.$onLoading = function0;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a<? extends T> aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
            if (aVar instanceof aa) {
                Function1 function1 = this.$onSuccess;
                if (function1 != null) {
                    function1.invoke(((aa) aVar).a());
                }
            } else if (aVar instanceof c) {
                Function1 function12 = this.$onError;
                if (function12 != null) {
                    function12.invoke(((c) aVar).f21347a);
                }
            } else if (aVar instanceof l) {
                Function0 function0 = this.$onLoading;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "PROP", "Lcom/bytedance/jedi/arch/State;", "S", "it", "apply", "(Lcom/bytedance/jedi/arch/State;)Lcom/bytedance/jedi/arch/State;"}, k = 3, mv = {1, 1, 15})
    public static final class h<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KProperty1 f21337a;

        public h(KProperty1 kProperty1) {
            this.f21337a = kProperty1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            x xVar = (x) obj;
            Intrinsics.checkParameterIsNotNull(xVar, AdvanceSetting.NETWORK_TYPE);
            return (x) this.f21337a.invoke(xVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/Tuple1;", "A", "PROP", "Lcom/bytedance/jedi/arch/State;", "S", "it", "apply", "(Lcom/bytedance/jedi/arch/State;)Lcom/bytedance/jedi/arch/Tuple1;"}, k = 3, mv = {1, 1, 15})
    static final class i<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KProperty1 f21338a;

        i(KProperty1 kProperty1) {
            this.f21338a = kProperty1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            x xVar = (x) obj;
            Intrinsics.checkParameterIsNotNull(xVar, AdvanceSetting.NETWORK_TYPE);
            return new ab(this.f21338a.invoke(xVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00042\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \b*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "A", "PROP", "Lcom/bytedance/jedi/arch/State;", "S", "<name for destructuring parameter 0>", "Lcom/bytedance/jedi/arch/Tuple1;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<ab<A>, Unit> {
        final /* synthetic */ Function1 $subscriber;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(Function1 function1) {
            super(1);
            this.$subscriber = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ab) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(ab<A> abVar) {
            this.$subscriber.invoke(abVar.f21343a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/Tuple1;", "A", "S", "Lcom/bytedance/jedi/arch/State;", "it", "apply", "(Lcom/bytedance/jedi/arch/State;)Lcom/bytedance/jedi/arch/Tuple1;"}, k = 3, mv = {1, 1, 15})
    static final class k<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KProperty1 f21339a;

        k(KProperty1 kProperty1) {
            this.f21339a = kProperty1;
        }

        public final /* synthetic */ Object apply(Object obj) {
            x xVar = (x) obj;
            Intrinsics.checkParameterIsNotNull(xVar, AdvanceSetting.NETWORK_TYPE);
            return new ab(this.f21339a.get(xVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0007*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "A", "S", "Lcom/bytedance/jedi/arch/State;", "<name for destructuring parameter 0>", "Lcom/bytedance/jedi/arch/Tuple1;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function1<ab<A>, Unit> {
        final /* synthetic */ Function1 $subscriber;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(Function1 function1) {
            super(1);
            this.$subscriber = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ab) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(ab<A> abVar) {
            this.$subscriber.invoke(abVar.f21343a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/StoreOwner;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<z<S>> {
        final /* synthetic */ JediViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(JediViewModel jediViewModel) {
            super(0);
            this.this$0 = jediViewModel;
        }

        @NotNull
        public final z<S> invoke() {
            JediViewModel jediViewModel = this.this$0;
            if (jediViewModel.f2281b != null) {
                Function2<? super JediViewModel<x>, ? super x, ? extends y<x>> function2 = g.f21389a;
                if (jediViewModel != null) {
                    JediViewModel jediViewModel2 = jediViewModel;
                    S s = jediViewModel.f2281b;
                    if (s == null) {
                        Intrinsics.throwNpe();
                    }
                    Object invoke = function2.invoke(jediViewModel2, s);
                    if (invoke != null) {
                        return new z<>((y) invoke);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.Store<S>");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.JediViewModel<com.bytedance.jedi.arch.State>");
            }
            throw new IllegalStateException("Cannot visit store before ViewModel is initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final z<S> a() {
        return (z) this.f2283d.getValue();
    }

    /* access modifiers changed from: protected */
    @NotNull
    public abstract S c();

    /* access modifiers changed from: protected */
    public void d() {
    }

    public final void a(@NotNull Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "argsAcceptor");
        if (this.f2281b == null) {
            this.f2281b = (x) function1.invoke(c());
            d();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final <PROP, MW extends m<S, PROP>> void a(@NotNull MW mw) {
        Intrinsics.checkParameterIsNotNull(mw, "middleware");
        CompositeDisposable compositeDisposable = this.f2284e;
        Intrinsics.checkParameterIsNotNull(compositeDisposable, "disposables");
        Intrinsics.checkParameterIsNotNull(this, "viewModel");
        mw.f21395a = compositeDisposable;
        mw.f21396b = this;
    }

    @NotNull
    public final S b() {
        return (x) a().b();
    }

    @CallSuper
    public void onCleared() {
        this.f2284e.dispose();
        a().d();
    }

    public final void c(@NotNull Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "reducer");
        e(function1);
    }

    public final void d(@NotNull Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        a().a(function1);
    }

    public final void e(@NotNull Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "reducer");
        a().b(function1);
    }

    public final void b(@NotNull Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        d(function1);
    }

    @NotNull
    public final Disposable a(@NotNull Disposable disposable) {
        Intrinsics.checkParameterIsNotNull(disposable, "$this$disposeOnClear");
        this.f2284e.add(disposable);
        return disposable;
    }

    @NotNull
    public final <T> Disposable a(@NotNull Single<T> single, @NotNull Function2<? super S, ? super a<? extends T>, ? extends S> function2) {
        Intrinsics.checkParameterIsNotNull(single, "$this$execute");
        Intrinsics.checkParameterIsNotNull(function2, "stateReducer");
        Observable observable = single.toObservable();
        Intrinsics.checkExpressionValueIsNotNull(observable, "toObservable()");
        Function1 function1 = b.INSTANCE;
        Intrinsics.checkParameterIsNotNull(observable, "$this$execute");
        Intrinsics.checkParameterIsNotNull(function1, "mapper");
        Intrinsics.checkParameterIsNotNull(function2, "stateReducer");
        c(new c(function2));
        Disposable subscribe = observable.map(new d(function1)).onErrorReturn(e.f21334a).subscribe((Consumer<? super T>) new f<Object>(this, function2));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "map<Async<V>> { Success(…ateReducer(asyncData) } }");
        return a(subscribe);
    }

    @NotNull
    public final <A> Disposable a(@Nullable LifecycleOwner lifecycleOwner, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function1<? super A, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        Observable distinctUntilChanged = a().a().map(new k(kProperty1)).distinctUntilChanged();
        Intrinsics.checkExpressionValueIsNotNull(distinctUntilChanged, "storeOwner.observable\n  …  .distinctUntilChanged()");
        return a(distinctUntilChanged, lifecycleOwner, z, z2, (Function1<? super T, Unit>) new l<Object,Unit>(function1));
    }

    /* access modifiers changed from: package-private */
    public final <T> Disposable a(@NotNull Observable<T> observable, LifecycleOwner lifecycleOwner, boolean z, boolean z2, Function1<? super T, Unit> function1) {
        Object obj;
        if (lifecycleOwner == null) {
            Observable observeOn = observable.observeOn(w.a());
            if (function1 != null) {
                obj = new i(function1);
            } else {
                obj = function1;
            }
            Disposable subscribe = observeOn.subscribe((Consumer) obj);
            Intrinsics.checkExpressionValueIsNotNull(subscribe, "observeOn(SMART_MAIN)\n  …   .subscribe(subscriber)");
            return a(subscribe);
        }
        Observer subscribeWith = observable.observeOn(w.a()).subscribeWith(new LifecycleAwareObserver(lifecycleOwner, !z, z2, function1));
        Intrinsics.checkExpressionValueIsNotNull(subscribeWith, "observeOn(SMART_MAIN)\n  …          )\n            )");
        return a((Disposable) subscribeWith);
    }

    public static /* synthetic */ Disposable a(JediViewModel jediViewModel, KProperty1 kProperty1, boolean z, Function1 function1, int i2, Object obj) {
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return jediViewModel.a((LifecycleOwner) null, kProperty1, true, false, function1);
    }

    @NotNull
    public final <A, PROP extends x> Disposable a(@Nullable LifecycleOwner lifecycleOwner, @NotNull KProperty1<PROP, ? extends A> kProperty1, @NotNull KProperty1<S, ? extends PROP> kProperty12, boolean z, boolean z2, @NotNull Function1<? super A, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        Intrinsics.checkParameterIsNotNull(kProperty12, "subprop");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        Observable distinctUntilChanged = a().a().map(new h(kProperty12)).distinctUntilChanged();
        Intrinsics.checkExpressionValueIsNotNull(distinctUntilChanged, "map { subprop(it) }.distinctUntilChanged()");
        Observable distinctUntilChanged2 = distinctUntilChanged.map(new i(kProperty1)).distinctUntilChanged();
        Intrinsics.checkExpressionValueIsNotNull(distinctUntilChanged2, "storeOwner.observable\n  … }.distinctUntilChanged()");
        return a(distinctUntilChanged2, lifecycleOwner, z, z2, (Function1<? super T, Unit>) new j<Object,Unit>(function1));
    }

    @NotNull
    public final <T> Disposable a(@Nullable LifecycleOwner lifecycleOwner, @NotNull KProperty1<S, ? extends a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Function0<Unit> function0, @Nullable Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        return a(lifecycleOwner, kProperty1, z, z2, (Function1<? super A, Unit>) new a<Object,Unit>(function12, function1, function0));
    }

    public static /* synthetic */ Disposable a(JediViewModel jediViewModel, KProperty1 kProperty1, boolean z, Function1 function1, Function0 function0, Function1 function12, int i2, Object obj) {
        boolean z2;
        Function1 function13;
        Function0 function02;
        Function1 function14;
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i2 & 4) != 0) {
            function13 = null;
        } else {
            function13 = function1;
        }
        if ((i2 & 8) != 0) {
            function02 = null;
        } else {
            function02 = function0;
        }
        if ((i2 & 16) != 0) {
            function14 = null;
        } else {
            function14 = function12;
        }
        Intrinsics.checkParameterIsNotNull(kProperty1, "prop1");
        return jediViewModel.a(null, kProperty1, z2, false, function13, function02, function14);
    }
}
