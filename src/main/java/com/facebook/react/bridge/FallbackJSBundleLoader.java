package com.facebook.react.bridge;

import com.facebook.common.logging.FLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public final class FallbackJSBundleLoader extends JSBundleLoader {
    private Stack<JSBundleLoader> mLoaders = new Stack<>();
    private final ArrayList<Exception> mRecoveredErrors = new ArrayList<>();

    private JSBundleLoader getDelegateLoader() {
        if (!this.mLoaders.empty()) {
            return this.mLoaders.peek();
        }
        Throwable runtimeException = new RuntimeException("No fallback options available");
        Iterator<Exception> it2 = this.mRecoveredErrors.iterator();
        Throwable th = runtimeException;
        while (it2.hasNext()) {
            th.initCause(it2.next());
            while (th.getCause() != null) {
                th = th.getCause();
            }
        }
        throw runtimeException;
    }

    public FallbackJSBundleLoader(List<JSBundleLoader> list) {
        ListIterator<JSBundleLoader> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            this.mLoaders.push(listIterator.previous());
        }
    }

    public final String loadScript(CatalystInstanceImpl catalystInstanceImpl) {
        while (true) {
            try {
                return getDelegateLoader().loadScript(catalystInstanceImpl);
            } catch (Exception e2) {
                if (e2.getMessage() == null || !e2.getMessage().startsWith("facebook::react::Recoverable")) {
                    throw e2;
                }
                this.mLoaders.pop();
                this.mRecoveredErrors.add(e2);
                FLog.wtf("FallbackJSBundleLoader", "Falling back from recoverable error", (Throwable) e2);
            }
        }
        throw e2;
    }
}
