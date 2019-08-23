package android.support.constraint.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

public class ResolutionNode {
    HashSet<ResolutionNode> dependents = new HashSet<>(2);
    int state = 0;

    public void remove(ResolutionDimension resolutionDimension) {
    }

    public void resolve() {
    }

    public boolean isResolved() {
        if (this.state == 1) {
            return true;
        }
        return false;
    }

    public void reset() {
        this.state = 0;
        this.dependents.clear();
    }

    public void didResolve() {
        this.state = 1;
        Iterator<ResolutionNode> it2 = this.dependents.iterator();
        while (it2.hasNext()) {
            it2.next().resolve();
        }
    }

    public void invalidate() {
        this.state = 0;
        Iterator<ResolutionNode> it2 = this.dependents.iterator();
        while (it2.hasNext()) {
            it2.next().invalidate();
        }
    }

    public void invalidateAnchors() {
        if (this instanceof ResolutionAnchor) {
            this.state = 0;
        }
        Iterator<ResolutionNode> it2 = this.dependents.iterator();
        while (it2.hasNext()) {
            it2.next().invalidateAnchors();
        }
    }

    public void addDependent(ResolutionNode resolutionNode) {
        this.dependents.add(resolutionNode);
    }
}
