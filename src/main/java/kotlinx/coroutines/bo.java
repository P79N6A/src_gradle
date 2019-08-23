package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006¥\u0001¦\u0001§\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u0002002\n\u00101\u001a\u0006\u0012\u0002\b\u000302H\u0002J\u000e\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u0002J\u0015\u00105\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u0004\u0018\u00010\nH@ø\u0001\u0000¢\u0006\u0002\u00107J\b\u00109\u001a\u00020:H\u0016J\u0012\u00109\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010=\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010>\u001a\u00020\u00062\u0006\u0010;\u001a\u00020'H\u0002J\u0010\u0010?\u001a\u00020\u00062\u0006\u0010;\u001a\u00020'H\u0016J*\u0010@\u001a\u00020:2\u0006\u0010#\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0006H\u0002J\"\u0010E\u001a\u00020:2\u0006\u0010#\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010J\u001a\u00020'2\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010K\u001a\u00020LH\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010#\u001a\u00020+H\u0002J\n\u0010N\u001a\u00060Oj\u0002`PJ\b\u0010Q\u001a\u00020'H\u0016J\u000f\u0010R\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\bSJ\n\u0010T\u001a\u0004\u0018\u00010'H\u0004J\b\u0010U\u001a\u0004\u0018\u00010'J \u0010V\u001a\u0004\u0018\u00010'2\u0006\u0010#\u001a\u00020F2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020'0XH\u0002J\u0012\u0010Y\u001a\u0004\u0018\u0001002\u0006\u0010#\u001a\u00020+H\u0002J\u0010\u0010Z\u001a\u00020:2\u0006\u0010[\u001a\u00020'H\u0014J\u0015\u0010\\\u001a\u00020:2\u0006\u0010[\u001a\u00020'H\u0010¢\u0006\u0002\b]J\u0017\u0010^\u001a\u00020:2\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0002\b`J?\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u00062'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010'¢\u0006\f\bg\u0012\b\bh\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020:0fj\u0002`iJ/\u0010a\u001a\u00020b2'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010'¢\u0006\f\bg\u0012\b\bh\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020:0fj\u0002`iJ\u0011\u0010j\u001a\u00020:H@ø\u0001\u0000¢\u0006\u0002\u00107J\b\u0010k\u001a\u00020\u0006H\u0002J\u0011\u0010l\u001a\u00020:H@ø\u0001\u0000¢\u0006\u0002\u00107J\u001f\u0010m\u001a\u00020n2\u0014\u0010o\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020:0fH\bJ\u0012\u0010p\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\nH\u0002J\u0017\u0010q\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\brJ\u001f\u0010s\u001a\u00020\u00062\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0000¢\u0006\u0002\btJ=\u0010u\u001a\u0006\u0012\u0002\b\u0003022'\u0010e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010'¢\u0006\f\bg\u0012\b\bh\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020:0fj\u0002`i2\u0006\u0010c\u001a\u00020\u0006H\u0002J\r\u0010v\u001a\u00020wH\u0010¢\u0006\u0002\bxJ\u0018\u0010y\u001a\u00020:2\u0006\u0010/\u001a\u0002002\u0006\u0010;\u001a\u00020'H\u0002J+\u0010z\u001a\u00020:\"\u000e\b\u0000\u0010{\u0018\u0001*\u0006\u0012\u0002\b\u0003022\u0006\u0010/\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010'H\bJ\u0012\u0010|\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010'H\u0014J'\u0010}\u001a\u00020:2\b\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0006H\u0010¢\u0006\u0002\b~J\u000e\u0010\u001a\u00020:H\u0010¢\u0006\u0003\b\u0001J\u0010\u0010\u0001\u001a\u00020:2\u0007\u0010\u0001\u001a\u00020\u0003J\u0012\u0010\u0001\u001a\u00020:2\u0007\u0010#\u001a\u00030\u0001H\u0002J\u0015\u0010\u0001\u001a\u00020:2\n\u0010#\u001a\u0006\u0012\u0002\b\u000302H\u0002JH\u0010\u0001\u001a\u00020:\"\u0005\b\u0000\u0010\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u0003H\u00010\u00012\u001e\u0010o\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0fø\u0001\u0000¢\u0006\u0003\u0010\u0001JZ\u0010\u0001\u001a\u00020:\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u0003H\u00010\u00012%\u0010o\u001a!\b\u0001\u0012\u0004\u0012\u0002H{\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020:2\n\u00101\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0003\b\u0001JZ\u0010\u0001\u001a\u00020:\"\u0004\b\u0000\u0010{\"\u0005\b\u0001\u0010\u00012\u000f\u0010\u0001\u001a\n\u0012\u0005\u0012\u0003H\u00010\u00012%\u0010o\u001a!\b\u0001\u0012\u0004\u0012\u0002H{\u0012\f\u0012\n\u0012\u0005\u0012\u0003H\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0007\u0010\u0001\u001a\u00020\u0006J\u0013\u0010\u0001\u001a\u00020C2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002J\u0013\u0010\u0001\u001a\u00020w2\b\u0010#\u001a\u0004\u0018\u00010\nH\u0002J \u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020'2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020'0XH\u0002J\t\u0010\u0001\u001a\u00020wH\u0007J\t\u0010\u0001\u001a\u00020wH\u0016J#\u0010\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J#\u0010\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020+2\b\u0010A\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J\u001a\u0010\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020+2\u0007\u0010\u0001\u001a\u00020'H\u0002J%\u0010\u0001\u001a\u00020C2\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010I\u001a\u0004\u0018\u00010\n2\u0006\u0010B\u001a\u00020CH\u0002J$\u0010\u0001\u001a\u00020\u00062\u0006\u0010#\u001a\u00020F2\u0006\u00104\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\nH\u0010J\u0010\u0010 \u0001\u001a\u0004\u0018\u00010H*\u00030¡\u0001H\u0002J\u0017\u0010¢\u0001\u001a\u00020:*\u0002002\b\u0010;\u001a\u0004\u0018\u00010'H\u0002J\u001a\u0010£\u0001\u001a\u00060Oj\u0002`P*\u00020'2\u0007\u0010¤\u0001\u001a\u00020wH\u0002R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068TX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0015\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068PX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010\n8@X\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\u00020\u0006*\u00020+8BX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010,\u0002\u0004\n\u0002\b\u0019¨\u0006¨\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/selects/SelectClause0;", "active", "", "(Z)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "cancelsParent", "getCancelsParent", "()Z", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "handlesException", "getHandlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parentHandle", "Lkotlinx/coroutines/ChildHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "attachChild", "child", "awaitInternal", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "", "cause", "cancelImpl", "cancelMakeCompleting", "cancelParent", "childCancelled", "completeStateFinalization", "update", "mode", "", "suppressed", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "createJobCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "firstChild", "getCancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionCause", "getCompletionExceptionOrNull", "getFinalRootCause", "exceptions", "", "getOrPromoteCancellingList", "handleJobException", "exception", "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJobInternal", "parent", "initParentJobInternal$kotlinx_coroutines_core", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", "T", "onCancellation", "onCompletionInternal", "onCompletionInternal$kotlinx_coroutines_core", "onStartInternal", "onStartInternal$kotlinx_coroutines_core", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectClause0", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "registerSelectClause1Internal", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "removeNode", "removeNode$kotlinx_coroutines_core", "selectAwaitCompletion", "selectAwaitCompletion$kotlinx_coroutines_core", "start", "startInternal", "stateString", "suppressExceptions", "rootCause", "toDebugString", "toString", "tryFinalizeFinishingState", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", "message", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
@Deprecated(level = kotlin.a.ERROR, message = "This is internal API and may be removed in the future releases")
public class bo implements bk, bw, r {

    /* renamed from: d  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f4368d = AtomicReferenceFieldUpdater.newUpdater(bo.class, Object.class, "_state");
    private volatile Object _state;
    volatile p parentHandle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "delegate", "Lkotlin/coroutines/Continuation;", "job", "Lkotlinx/coroutines/JobSupport;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/JobSupport;)V", "getContinuationCancellationCause", "", "parent", "Lkotlinx/coroutines/Job;", "nameString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    static final class a<T> extends l<T> {

        /* renamed from: a  reason: collision with root package name */
        private final bo f83885a;

        /* access modifiers changed from: protected */
        @NotNull
        public final String c() {
            return "AwaitContinuation";
        }

        @NotNull
        public final Throwable a(@NotNull bk bkVar) {
            Intrinsics.checkParameterIsNotNull(bkVar, "parent");
            Object n = this.f83885a.n();
            if (n instanceof c) {
                Throwable th = ((c) n).rootCause;
                if (th != null) {
                    return th;
                }
            }
            if (n instanceof u) {
                return ((u) n).f83971b;
            }
            return bkVar.k();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@NotNull kotlin.coroutines.c<? super T> cVar, @NotNull bo boVar) {
            super(cVar, 1);
            Intrinsics.checkParameterIsNotNull(cVar, "delegate");
            Intrinsics.checkParameterIsNotNull(boVar, "job");
            this.f83885a = boVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/JobSupport;", "state", "Lkotlinx/coroutines/JobSupport$Finishing;", "child", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "", "(Lkotlinx/coroutines/JobSupport;Lkotlinx/coroutines/JobSupport$Finishing;Lkotlinx/coroutines/ChildHandleNode;Ljava/lang/Object;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    static final class b extends bn<bk> {

        /* renamed from: a  reason: collision with root package name */
        private final bo f83886a;

        /* renamed from: e  reason: collision with root package name */
        private final c f83887e;

        /* renamed from: f  reason: collision with root package name */
        private final q f83888f;
        private final Object g;

        @NotNull
        public final String toString() {
            return "ChildCompletion[" + this.f83888f + ", " + this.g + ']';
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void a(@Nullable Throwable th) {
            boolean z;
            bo boVar = this.f83886a;
            c cVar = this.f83887e;
            q qVar = this.f83888f;
            Object obj = this.g;
            if (boVar.n() == cVar) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                q a2 = bo.a((i) qVar);
                if (a2 == null || !boVar.a(cVar, a2, obj)) {
                    boVar.a(cVar, obj, 0);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(@NotNull bo boVar, @NotNull c cVar, @NotNull q qVar, @Nullable Object obj) {
            super(qVar.f83965a);
            Intrinsics.checkParameterIsNotNull(boVar, "parent");
            Intrinsics.checkParameterIsNotNull(cVar, "state");
            Intrinsics.checkParameterIsNotNull(qVar, "child");
            this.f83886a = boVar;
            this.f83887e = cVar;
            this.f83888f = qVar;
            this.g = obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0018\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0016j\b\u0012\u0004\u0012\u00020\t`\u0017H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "_exceptionsHolder", "isActive", "()Z", "isCancelling", "isSealed", "getList", "()Lkotlinx/coroutines/NodeList;", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sealLocked", "", "proposedException", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    static final class c implements bf {
        volatile Object _exceptionsHolder;
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final bt f83889a;
        @JvmField
        public volatile boolean isCompleting = false;
        @Nullable
        @JvmField
        public volatile Throwable rootCause;

        @NotNull
        public final bt au_() {
            return this.f83889a;
        }

        static ArrayList<Throwable> e() {
            return new ArrayList<>(4);
        }

        public final boolean b() {
            if (this.rootCause == null) {
                return true;
            }
            return false;
        }

        public final boolean d() {
            if (this.rootCause != null) {
                return true;
            }
            return false;
        }

        public final boolean c() {
            if (this._exceptionsHolder == bp.f83893a) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + this.isCompleting + ", rootCause=" + this.rootCause + ", exceptions=" + this._exceptionsHolder + ", list=" + au_() + ']';
        }

        public final void a(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> e2 = e();
                        e2.add(obj);
                        e2.add(th);
                        this._exceptionsHolder = e2;
                    }
                } else if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                } else if (obj != null) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
            }
        }

        public c(@NotNull bt btVar, boolean z, @Nullable Throwable th) {
            Intrinsics.checkParameterIsNotNull(btVar, "list");
            this.f83889a = btVar;
            this.rootCause = th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static final class d extends i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f83890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bo f83891b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f83892c;

        public final /* synthetic */ Object a(Object obj) {
            boolean z;
            Intrinsics.checkParameterIsNotNull((i) obj, "affected");
            if (this.f83891b.n() == this.f83892c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return h.f83924a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(i iVar, i iVar2, bo boVar, Object obj) {
            super(iVar2);
            this.f83890a = iVar;
            this.f83891b = boVar;
            this.f83892c = obj;
        }
    }

    public void a(@Nullable Object obj, int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    public void c(@NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "exception");
    }

    public void e() {
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(c cVar, Object obj, int i) {
        ArrayList<Throwable> arrayList;
        Throwable a2;
        boolean z = false;
        if (!(n() == cVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!cVar.c())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (cVar.isCompleting) {
            Throwable th = null;
            u uVar = (u) (!(obj instanceof u) ? null : obj);
            if (uVar != null) {
                th = uVar.f83971b;
            }
            synchronized (cVar) {
                Object obj2 = cVar._exceptionsHolder;
                if (obj2 == null) {
                    arrayList = c.e();
                } else if (obj2 instanceof Throwable) {
                    ArrayList<Throwable> e2 = c.e();
                    e2.add(obj2);
                    arrayList = e2;
                } else if (!(obj2 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj2).toString());
                } else if (obj2 != null) {
                    arrayList = (ArrayList) obj2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
                }
                Throwable th2 = cVar.rootCause;
                if (th2 != null) {
                    arrayList.add(0, th2);
                }
                if (th != null && (!Intrinsics.areEqual((Object) th, (Object) th2))) {
                    arrayList.add(th);
                }
                cVar._exceptionsHolder = bp.f83893a;
                List list = arrayList;
                a2 = a(cVar, list);
                if (a2 != null && (a(a2, list) || a2 != cVar.rootCause)) {
                    z = true;
                }
            }
            if (!(a2 == null || a2 == th)) {
                obj = new u(a2);
            }
            if (a2 != null && !d(a2)) {
                c(a2);
            }
            if (f4368d.compareAndSet(this, cVar, bp.a(obj))) {
                a(cVar, obj, i, z);
                return true;
            }
            throw new IllegalArgumentException(("Unexpected state: " + this._state + ", expected: " + cVar + ", update: " + obj).toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static boolean a(Throwable th, List<? extends Throwable> list) {
        boolean z = false;
        if (list.size() <= 1) {
            return false;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Intrinsics.checkExpressionValueIsNotNull(newSetFromMap, "Collections.newSetFromMa…ityHashMap(expectedSize))");
        for (Throwable a2 : list) {
            Throwable a3 = s.a(a2);
            if (a3 != th && !(a3 instanceof CancellationException) && newSetFromMap.add(a3)) {
                kotlin.b.a(th, a3);
                z = true;
            }
        }
        return z;
    }

    private final boolean a(bf bfVar, Object obj, int i) {
        if ((bfVar instanceof ax) || (bfVar instanceof bn)) {
            if (!(!(obj instanceof u))) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!f4368d.compareAndSet(this, bfVar, bp.a(obj))) {
                return false;
            } else {
                a(bfVar, obj, i, false);
                return true;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj) {
        if (obj instanceof ax) {
            if (((ax) obj).b()) {
                return 0;
            }
            if (!f4368d.compareAndSet(this, obj, bp.f83895c)) {
                return -1;
            }
            e();
            return 1;
        } else if (!(obj instanceof be)) {
            return 0;
        } else {
            if (!f4368d.compareAndSet(this, obj, ((be) obj).au_())) {
                return -1;
            }
            e();
            return 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(c cVar, q qVar, Object obj) {
        while (bk.a.a(qVar.f83965a, false, false, new b(this, cVar, qVar, obj), 1, null) == bu.f83898a) {
            qVar = a((i) qVar);
            if (qVar == null) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final p a(@NotNull r rVar) {
        Intrinsics.checkParameterIsNotNull(rVar, "child");
        av a2 = bk.a.a(this, true, false, new q(this, rVar), 2, null);
        if (a2 != null) {
            return (p) a2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    private final void a(bt btVar, Throwable th) {
        Object e2 = btVar.e();
        if (e2 != null) {
            Throwable th2 = null;
            for (i iVar = (i) e2; !Intrinsics.areEqual((Object) iVar, (Object) btVar); iVar = iVar.f()) {
                if (iVar instanceof bm) {
                    bn bnVar = (bn) iVar;
                    try {
                        bnVar.a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            kotlin.b.a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        th2 = new y("Exception in completion handler " + bnVar + " for " + this, th3);
                    }
                }
            }
            if (th2 != null) {
                a(th2);
            }
            d(th);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: type inference failed for: r4v10, types: [kotlinx.coroutines.be] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.av a(boolean r8, boolean r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            java.lang.Object r2 = r7.n()
            boolean r3 = r2 instanceof kotlinx.coroutines.ax
            if (r3 == 0) goto L_0x0045
            r3 = r2
            kotlinx.coroutines.ax r3 = (kotlinx.coroutines.ax) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0029
            if (r1 != 0) goto L_0x001e
            kotlinx.coroutines.bn r1 = r7.a((kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) r10, (boolean) r8)
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f4368d
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0007
            kotlinx.coroutines.av r1 = (kotlinx.coroutines.av) r1
            return r1
        L_0x0029:
            kotlinx.coroutines.bt r2 = new kotlinx.coroutines.bt
            r2.<init>()
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x0037
            kotlinx.coroutines.bf r2 = (kotlinx.coroutines.bf) r2
            goto L_0x003f
        L_0x0037:
            kotlinx.coroutines.be r4 = new kotlinx.coroutines.be
            r4.<init>(r2)
            r2 = r4
            kotlinx.coroutines.bf r2 = (kotlinx.coroutines.bf) r2
        L_0x003f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f4368d
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0007
        L_0x0045:
            boolean r3 = r2 instanceof kotlinx.coroutines.bf
            if (r3 == 0) goto L_0x00b4
            r3 = r2
            kotlinx.coroutines.bf r3 = (kotlinx.coroutines.bf) r3
            kotlinx.coroutines.bt r3 = r3.au_()
            if (r3 != 0) goto L_0x0062
            if (r2 == 0) goto L_0x005a
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.bn) r2
            r7.a((kotlinx.coroutines.bn<?>) r2)
            goto L_0x0007
        L_0x005a:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x0062:
            kotlinx.coroutines.bu r4 = kotlinx.coroutines.bu.f83898a
            kotlinx.coroutines.av r4 = (kotlinx.coroutines.av) r4
            if (r8 == 0) goto L_0x009c
            boolean r5 = r2 instanceof kotlinx.coroutines.bo.c
            if (r5 == 0) goto L_0x009c
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.bo$c r5 = (kotlinx.coroutines.bo.c) r5     // Catch:{ all -> 0x0099 }
            java.lang.Throwable r5 = r5.rootCause     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x007f
            boolean r6 = r10 instanceof kotlinx.coroutines.q     // Catch:{ all -> 0x0099 }
            if (r6 == 0) goto L_0x0097
            r6 = r2
            kotlinx.coroutines.bo$c r6 = (kotlinx.coroutines.bo.c) r6     // Catch:{ all -> 0x0099 }
            boolean r6 = r6.isCompleting     // Catch:{ all -> 0x0099 }
            if (r6 != 0) goto L_0x0097
        L_0x007f:
            if (r1 != 0) goto L_0x0085
            kotlinx.coroutines.bn r1 = r7.a((kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) r10, (boolean) r8)     // Catch:{ all -> 0x0099 }
        L_0x0085:
            boolean r4 = r7.a((java.lang.Object) r2, (kotlinx.coroutines.bt) r3, (kotlinx.coroutines.bn<?>) r1)     // Catch:{ all -> 0x0099 }
            if (r4 != 0) goto L_0x008e
            monitor-exit(r2)
            goto L_0x0007
        L_0x008e:
            if (r5 != 0) goto L_0x0094
            kotlinx.coroutines.av r1 = (kotlinx.coroutines.av) r1     // Catch:{ all -> 0x0099 }
            monitor-exit(r2)
            return r1
        L_0x0094:
            r4 = r1
            kotlinx.coroutines.av r4 = (kotlinx.coroutines.av) r4     // Catch:{ all -> 0x0099 }
        L_0x0097:
            monitor-exit(r2)
            goto L_0x009d
        L_0x0099:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x009c:
            r5 = r0
        L_0x009d:
            if (r5 == 0) goto L_0x00a5
            if (r9 == 0) goto L_0x00a4
            r10.invoke(r5)
        L_0x00a4:
            return r4
        L_0x00a5:
            if (r1 != 0) goto L_0x00ab
            kotlinx.coroutines.bn r1 = r7.a((kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) r10, (boolean) r8)
        L_0x00ab:
            boolean r2 = r7.a((java.lang.Object) r2, (kotlinx.coroutines.bt) r3, (kotlinx.coroutines.bn<?>) r1)
            if (r2 == 0) goto L_0x0007
            kotlinx.coroutines.av r1 = (kotlinx.coroutines.av) r1
            return r1
        L_0x00b4:
            if (r9 == 0) goto L_0x00c4
            boolean r8 = r2 instanceof kotlinx.coroutines.u
            if (r8 != 0) goto L_0x00bb
            r2 = r0
        L_0x00bb:
            kotlinx.coroutines.u r2 = (kotlinx.coroutines.u) r2
            if (r2 == 0) goto L_0x00c1
            java.lang.Throwable r0 = r2.f83971b
        L_0x00c1:
            r10.invoke(r0)
        L_0x00c4:
            kotlinx.coroutines.bu r8 = kotlinx.coroutines.bu.f83898a
            kotlinx.coroutines.av r8 = (kotlinx.coroutines.av) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.a(boolean, boolean, kotlin.jvm.functions.Function1):kotlinx.coroutines.av");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0009 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(java.lang.Object r2, kotlinx.coroutines.bt r3, kotlinx.coroutines.bn<?> r4) {
        /*
            r1 = this;
            kotlinx.coroutines.bo$d r0 = new kotlinx.coroutines.bo$d
            kotlinx.coroutines.internal.i r4 = (kotlinx.coroutines.internal.i) r4
            r0.<init>(r4, r4, r1, r2)
            kotlinx.coroutines.internal.i$a r0 = (kotlinx.coroutines.internal.i.a) r0
        L_0x0009:
            java.lang.Object r2 = r3.g()
            if (r2 == 0) goto L_0x001d
            kotlinx.coroutines.internal.i r2 = (kotlinx.coroutines.internal.i) r2
            int r2 = r2.a(r4, r3, r0)
            switch(r2) {
                case 1: goto L_0x001b;
                case 2: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0009
        L_0x0019:
            r2 = 0
            return r2
        L_0x001b:
            r2 = 1
            return r2
        L_0x001d:
            kotlin.TypeCastException r2 = new kotlin.TypeCastException
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.a(java.lang.Object, kotlinx.coroutines.bt, kotlinx.coroutines.bn):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.Nullable java.lang.Object r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.n()
            int r0 = r2.a((java.lang.Object) r0, (java.lang.Object) r3, (int) r4)
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x001b;
                case 2: goto L_0x0019;
                case 3: goto L_0x0000;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            throw r3
        L_0x0019:
            r3 = 0
            return r3
        L_0x001b:
            r3 = 1
            return r3
        L_0x001d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " is already complete or completing, but is being completed with "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r3 = e(r3)
            r4.<init>(r0, r3)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.a(java.lang.Object, int):boolean");
    }

    @NotNull
    public String g() {
        return ai.b(this);
    }

    @NotNull
    public final e.c<?> getKey() {
        return bk.f4367c;
    }

    public final void m() {
        b((Throwable) null);
    }

    private final bl c() {
        return new bl("Job was cancelled", null, this);
    }

    public final boolean i() {
        if (!(n() instanceof bf)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object n() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).b(this);
        }
    }

    public boolean b() {
        Object n = n();
        if (!(n instanceof bf) || !((bf) n).b()) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        Object n = n();
        if ((n instanceof u) || ((n instanceof c) && ((c) n).d())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.n()
            int r0 = r1.a((java.lang.Object) r0)
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0000
        L_0x000c:
            r0 = 1
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.l():boolean");
    }

    @NotNull
    public String toString() {
        return (g() + '{' + f(n()) + '}') + '@' + ai.a((Object) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != null) goto L_0x0051;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException k() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.n()
            boolean r1 = r0 instanceof kotlinx.coroutines.bo.c
            if (r1 == 0) goto L_0x0031
            kotlinx.coroutines.bo$c r0 = (kotlinx.coroutines.bo.c) r0
            java.lang.Throwable r0 = r0.rootCause
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = "Job is cancelling"
            java.util.concurrent.CancellationException r0 = r4.a((java.lang.Throwable) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x0017
            goto L_0x0051
        L_0x0017:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is still new or active: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0031:
            boolean r1 = r0 instanceof kotlinx.coroutines.bf
            if (r1 != 0) goto L_0x0052
            boolean r1 = r0 instanceof kotlinx.coroutines.u
            if (r1 == 0) goto L_0x0044
            kotlinx.coroutines.u r0 = (kotlinx.coroutines.u) r0
            java.lang.Throwable r0 = r0.f83971b
            java.lang.String r1 = "Job was cancelled"
            java.util.concurrent.CancellationException r0 = r4.a((java.lang.Throwable) r0, (java.lang.String) r1)
            return r0
        L_0x0044:
            kotlinx.coroutines.bl r0 = new kotlinx.coroutines.bl
            java.lang.String r1 = "Job has completed normally"
            r2 = 0
            r3 = r4
            kotlinx.coroutines.bk r3 = (kotlinx.coroutines.bk) r3
            r0.<init>(r1, r2, r3)
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
        L_0x0051:
            return r0
        L_0x0052:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Job is still new or active: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.k():java.util.concurrent.CancellationException");
    }

    @NotNull
    public final Throwable o() {
        Throwable th;
        Object n = n();
        if (n instanceof c) {
            th = ((c) n).rootCause;
        } else if (n instanceof bf) {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + n).toString());
        } else if (n instanceof u) {
            th = ((u) n).f83971b;
        } else {
            th = null;
        }
        if (th != null && (th instanceof CancellationException)) {
            return th;
        }
        return new bl("Parent job is " + f(n), th, this);
    }

    public void a(@NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "exception");
        throw th;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(Object obj) {
        return d(obj);
    }

    public bo(boolean z) {
        ax axVar;
        if (z) {
            axVar = bp.f83895c;
        } else {
            axVar = bp.f83894b;
        }
        this._state = axVar;
    }

    private static Throwable e(@Nullable Object obj) {
        if (!(obj instanceof u)) {
            obj = null;
        }
        u uVar = (u) obj;
        if (uVar != null) {
            return uVar.f83971b;
        }
        return null;
    }

    public final void a(@NotNull bw bwVar) {
        Intrinsics.checkParameterIsNotNull(bwVar, "parentJob");
        b((Object) bwVar);
    }

    public final boolean b(@Nullable Throwable th) {
        if (b((Object) th)) {
            return true;
        }
        return false;
    }

    private final boolean d(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!h()) {
            return false;
        }
        p pVar = this.parentHandle;
        if (pVar == null || !pVar.b(th)) {
            return false;
        }
        return true;
    }

    @Nullable
    public <E extends e.b> E get(@NotNull e.c<E> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        return e.b.a.a((e.b) this, cVar);
    }

    @NotNull
    public e minusKey(@NotNull e.c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        return e.b.a.b(this, cVar);
    }

    @NotNull
    public e plus(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        return e.b.a.a((e.b) this, eVar);
    }

    private final bt a(bf bfVar) {
        bt au_ = bfVar.au_();
        if (au_ != null) {
            return au_;
        }
        if (bfVar instanceof ax) {
            return new bt();
        }
        if (bfVar instanceof bn) {
            a((bn) bfVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + bfVar).toString());
    }

    private final Throwable c(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof Throwable;
        } else {
            z = true;
        }
        if (z) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return c();
        } else if (obj != null) {
            return ((bw) obj).o();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private static String f(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.isCompleting) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof bf) {
            if (((bf) obj).b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof u) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r9 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        a(((kotlinx.coroutines.bo.c) r2).au_(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean d(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r8.n()
            boolean r3 = r2 instanceof kotlinx.coroutines.bo.c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x004a
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.bo$c r3 = (kotlinx.coroutines.bo.c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.c()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r5
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.bo$c r3 = (kotlinx.coroutines.bo.c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.d()     // Catch:{ all -> 0x0047 }
            if (r9 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x002f
        L_0x0023:
            if (r1 != 0) goto L_0x0029
            java.lang.Throwable r1 = r8.c((java.lang.Object) r9)     // Catch:{ all -> 0x0047 }
        L_0x0029:
            r9 = r2
            kotlinx.coroutines.bo$c r9 = (kotlinx.coroutines.bo.c) r9     // Catch:{ all -> 0x0047 }
            r9.a(r1)     // Catch:{ all -> 0x0047 }
        L_0x002f:
            r9 = r2
            kotlinx.coroutines.bo$c r9 = (kotlinx.coroutines.bo.c) r9     // Catch:{ all -> 0x0047 }
            java.lang.Throwable r9 = r9.rootCause     // Catch:{ all -> 0x0047 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r9 = r0
        L_0x003a:
            monitor-exit(r2)
            if (r9 == 0) goto L_0x0046
            kotlinx.coroutines.bo$c r2 = (kotlinx.coroutines.bo.c) r2
            kotlinx.coroutines.bt r0 = r2.au_()
            r8.a((kotlinx.coroutines.bt) r0, (java.lang.Throwable) r9)
        L_0x0046:
            return r4
        L_0x0047:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L_0x004a:
            boolean r3 = r2 instanceof kotlinx.coroutines.bf
            if (r3 == 0) goto L_0x00d9
            if (r1 != 0) goto L_0x0054
            java.lang.Throwable r1 = r8.c((java.lang.Object) r9)
        L_0x0054:
            r3 = r2
            kotlinx.coroutines.bf r3 = (kotlinx.coroutines.bf) r3
            boolean r6 = r3.b()
            if (r6 == 0) goto L_0x00a4
            boolean r2 = r3 instanceof kotlinx.coroutines.bo.c
            if (r2 != 0) goto L_0x0063
            r2 = 1
            goto L_0x0064
        L_0x0063:
            r2 = 0
        L_0x0064:
            if (r2 == 0) goto L_0x0096
            boolean r2 = r3.b()
            if (r2 == 0) goto L_0x0088
            kotlinx.coroutines.bt r2 = r8.a((kotlinx.coroutines.bf) r3)
            if (r2 != 0) goto L_0x0073
            goto L_0x0085
        L_0x0073:
            kotlinx.coroutines.bo$c r6 = new kotlinx.coroutines.bo$c
            r6.<init>(r2, r5, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f4368d
            boolean r3 = r7.compareAndSet(r8, r3, r6)
            if (r3 != 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            r8.a((kotlinx.coroutines.bt) r2, (java.lang.Throwable) r1)
            r5 = 1
        L_0x0085:
            if (r5 == 0) goto L_0x0002
            return r4
        L_0x0088:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x0096:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00a4:
            kotlinx.coroutines.u r3 = new kotlinx.coroutines.u
            r3.<init>(r1)
            int r3 = r8.a((java.lang.Object) r2, (java.lang.Object) r3, (int) r5)
            switch(r3) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00be;
                case 2: goto L_0x00be;
                case 3: goto L_0x0002;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00be:
            return r4
        L_0x00bf:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot happen in "
            r9.<init>(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00d9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.d(java.lang.Object):boolean");
    }

    static q a(@NotNull i iVar) {
        while (iVar.d()) {
            iVar = iVar.h();
        }
        while (true) {
            iVar = iVar.f();
            if (!iVar.d()) {
                if (iVar instanceof q) {
                    return (q) iVar;
                }
                if (iVar instanceof bt) {
                    return null;
                }
            }
        }
    }

    private final void a(bn<?> bnVar) {
        bnVar.a(new bt());
        f4368d.compareAndSet(this, bnVar, bnVar.f());
    }

    private final CancellationException a(@NotNull Throwable th, String str) {
        Throwable th2;
        if (!(th instanceof CancellationException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            return new bl(str, th, this);
        }
        return cancellationException;
    }

    public <R> R fold(R r, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "operation");
        Intrinsics.checkParameterIsNotNull(function2, "operation");
        return e.b.a.a(this, r, function2);
    }

    private final Throwable a(c cVar, List<? extends Throwable> list) {
        Object obj;
        boolean z;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                th = (Throwable) list.get(0);
            }
            return th;
        } else if (cVar.d()) {
            return c();
        } else {
            return null;
        }
    }

    private final void b(@NotNull bt btVar, Throwable th) {
        Object e2 = btVar.e();
        if (e2 != null) {
            Throwable th2 = null;
            for (i iVar = (i) e2; !Intrinsics.areEqual((Object) iVar, (Object) btVar); iVar = iVar.f()) {
                if (iVar instanceof bn) {
                    bn bnVar = (bn) iVar;
                    try {
                        bnVar.a(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            kotlin.b.a(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        th2 = new y("Exception in completion handler " + bnVar + " for " + this, th3);
                    }
                }
            }
            if (th2 != null) {
                a(th2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.bn<?> a(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0037
            boolean r6 = r5 instanceof kotlinx.coroutines.bm
            if (r6 != 0) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r2 = r5
        L_0x000b:
            kotlinx.coroutines.bm r2 = (kotlinx.coroutines.bm) r2
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.bk r6 = r2.f83884b
            r3 = r4
            kotlinx.coroutines.bo r3 = (kotlinx.coroutines.bo) r3
            if (r6 != r3) goto L_0x0017
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x002c
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.bn) r2
            return r2
        L_0x001e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x002c:
            kotlinx.coroutines.bi r6 = new kotlinx.coroutines.bi
            r0 = r4
            kotlinx.coroutines.bk r0 = (kotlinx.coroutines.bk) r0
            r6.<init>(r0, r5)
            kotlinx.coroutines.bn r6 = (kotlinx.coroutines.bn) r6
            return r6
        L_0x0037:
            boolean r6 = r5 instanceof kotlinx.coroutines.bn
            if (r6 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r5
        L_0x003d:
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.bn) r2
            if (r2 == 0) goto L_0x0060
            J r6 = r2.f83884b
            r3 = r4
            kotlinx.coroutines.bo r3 = (kotlinx.coroutines.bo) r3
            if (r6 != r3) goto L_0x004d
            boolean r6 = r2 instanceof kotlinx.coroutines.bm
            if (r6 != 0) goto L_0x004d
            r0 = 1
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            if (r2 != 0) goto L_0x006b
            goto L_0x0060
        L_0x0052:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L_0x0060:
            kotlinx.coroutines.bj r6 = new kotlinx.coroutines.bj
            r0 = r4
            kotlinx.coroutines.bk r0 = (kotlinx.coroutines.bk) r0
            r6.<init>(r0, r5)
            r2 = r6
            kotlinx.coroutines.bn r2 = (kotlinx.coroutines.bn) r2
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.a(kotlin.jvm.functions.Function1, boolean):kotlinx.coroutines.bn");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        if (r1 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007c, code lost:
        if ((r0 instanceof kotlinx.coroutines.q) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x007e, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0080, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0081, code lost:
        r9 = (kotlinx.coroutines.q) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0083, code lost:
        if (r9 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0085, code lost:
        r9 = r0.au_();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0089, code lost:
        if (r9 == null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008b, code lost:
        r6 = a((kotlinx.coroutines.internal.i) r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0092, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0093, code lost:
        if (r6 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0099, code lost:
        if (a(r5, r6, r10) == false) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x009c, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x009d, code lost:
        a(r5, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00a0, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(java.lang.Object r9, java.lang.Object r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.bf
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r9 instanceof kotlinx.coroutines.ax
            r2 = 3
            r3 = 1
            if (r0 != 0) goto L_0x0010
            boolean r0 = r9 instanceof kotlinx.coroutines.bn
            if (r0 == 0) goto L_0x0022
        L_0x0010:
            boolean r0 = r9 instanceof kotlinx.coroutines.q
            if (r0 != 0) goto L_0x0022
            boolean r0 = r10 instanceof kotlinx.coroutines.u
            if (r0 != 0) goto L_0x0022
            kotlinx.coroutines.bf r9 = (kotlinx.coroutines.bf) r9
            boolean r9 = r8.a((kotlinx.coroutines.bf) r9, (java.lang.Object) r10, (int) r11)
            if (r9 != 0) goto L_0x0021
            return r2
        L_0x0021:
            return r3
        L_0x0022:
            r0 = r9
            kotlinx.coroutines.bf r0 = (kotlinx.coroutines.bf) r0
            kotlinx.coroutines.bt r4 = r8.a((kotlinx.coroutines.bf) r0)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            boolean r5 = r9 instanceof kotlinx.coroutines.bo.c
            r6 = 0
            if (r5 != 0) goto L_0x0033
            r5 = r6
            goto L_0x0034
        L_0x0033:
            r5 = r9
        L_0x0034:
            kotlinx.coroutines.bo$c r5 = (kotlinx.coroutines.bo.c) r5
            if (r5 != 0) goto L_0x003d
            kotlinx.coroutines.bo$c r5 = new kotlinx.coroutines.bo$c
            r5.<init>(r4, r1, r6)
        L_0x003d:
            monitor-enter(r5)
            boolean r7 = r5.isCompleting     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x0044
            monitor-exit(r5)
            return r1
        L_0x0044:
            r5.isCompleting = r3     // Catch:{ all -> 0x00af }
            if (r5 == r9) goto L_0x0052
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f4368d     // Catch:{ all -> 0x00af }
            boolean r9 = r1.compareAndSet(r8, r9, r5)     // Catch:{ all -> 0x00af }
            if (r9 != 0) goto L_0x0052
            monitor-exit(r5)
            return r2
        L_0x0052:
            boolean r9 = r5.c()     // Catch:{ all -> 0x00af }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x00a1
            boolean r9 = r5.d()     // Catch:{ all -> 0x00af }
            boolean r1 = r10 instanceof kotlinx.coroutines.u     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x0063
            r1 = r6
            goto L_0x0064
        L_0x0063:
            r1 = r10
        L_0x0064:
            kotlinx.coroutines.u r1 = (kotlinx.coroutines.u) r1     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x006d
            java.lang.Throwable r1 = r1.f83971b     // Catch:{ all -> 0x00af }
            r5.a(r1)     // Catch:{ all -> 0x00af }
        L_0x006d:
            java.lang.Throwable r1 = r5.rootCause     // Catch:{ all -> 0x00af }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = r6
        L_0x0074:
            monitor-exit(r5)
            if (r1 == 0) goto L_0x007a
            r8.a((kotlinx.coroutines.bt) r4, (java.lang.Throwable) r1)
        L_0x007a:
            boolean r9 = r0 instanceof kotlinx.coroutines.q
            if (r9 != 0) goto L_0x0080
            r9 = r6
            goto L_0x0081
        L_0x0080:
            r9 = r0
        L_0x0081:
            kotlinx.coroutines.q r9 = (kotlinx.coroutines.q) r9
            if (r9 != 0) goto L_0x0092
            kotlinx.coroutines.bt r9 = r0.au_()
            if (r9 == 0) goto L_0x0093
            kotlinx.coroutines.internal.i r9 = (kotlinx.coroutines.internal.i) r9
            kotlinx.coroutines.q r6 = a((kotlinx.coroutines.internal.i) r9)
            goto L_0x0093
        L_0x0092:
            r6 = r9
        L_0x0093:
            if (r6 == 0) goto L_0x009d
            boolean r9 = r8.a((kotlinx.coroutines.bo.c) r5, (kotlinx.coroutines.q) r6, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x009d
            r9 = 2
            return r9
        L_0x009d:
            r8.a((kotlinx.coroutines.bo.c) r5, (java.lang.Object) r10, (int) r11)
            return r3
        L_0x00a1:
            java.lang.String r9 = "Failed requirement."
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00af }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00af }
            r10.<init>(r9)     // Catch:{ all -> 0x00af }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ all -> 0x00af }
            throw r10     // Catch:{ all -> 0x00af }
        L_0x00af:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.bo.a(java.lang.Object, java.lang.Object, int):int");
    }

    private final void a(bf bfVar, Object obj, int i, boolean z) {
        Object obj2;
        p pVar = this.parentHandle;
        if (pVar != null) {
            pVar.a();
            this.parentHandle = bu.f83898a;
        }
        Throwable th = null;
        if (!(obj instanceof u)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        u uVar = (u) obj2;
        if (uVar != null) {
            th = uVar.f83971b;
        }
        if (bfVar instanceof bn) {
            try {
                ((bn) bfVar).a(th);
            } catch (Throwable th2) {
                a((Throwable) new y("Exception in completion handler " + bfVar + " for " + this, th2));
            }
        } else {
            bt au_ = bfVar.au_();
            if (au_ != null) {
                b(au_, th);
            }
        }
        a(obj, i, z);
    }
}
