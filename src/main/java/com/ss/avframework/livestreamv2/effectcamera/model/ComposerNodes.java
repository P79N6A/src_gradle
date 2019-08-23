package com.ss.avframework.livestreamv2.effectcamera.model;

import java.util.HashMap;
import java.util.Map;

public class ComposerNodes {
    private int mMode;
    private int mNodeNum;
    private String[] mNodePaths;
    private Map<String, ComposerNode> mNodes = new HashMap();
    private int mOrderType;

    public class ComposerNode {
        public String nodePath = "";
        public String nodeTag = "";
        public float nodeValue;

        public ComposerNode() {
        }
    }

    public int getComposerMode() {
        return this.mMode;
    }

    public Map<String, ComposerNode> getComposerNodes() {
        return this.mNodes;
    }

    public int getComposerNodesNum() {
        return this.mNodeNum;
    }

    public String[] getComposerNodesPaths() {
        return this.mNodePaths;
    }

    public int getComposerOrderType() {
        return this.mOrderType;
    }

    public void setComposerMode(int i, int i2) {
        this.mMode = i;
        this.mOrderType = i2;
    }

    public void setComposerNodes(String[] strArr, int i) {
        this.mNodePaths = strArr;
        this.mNodeNum = i;
    }

    public void setComposerUpdateNodes(String str, String str2, float f2) {
        ComposerNode composerNode = new ComposerNode();
        composerNode.nodePath = str;
        composerNode.nodeTag = str2;
        composerNode.nodeValue = f2;
        this.mNodes.put(str2, composerNode);
    }
}
