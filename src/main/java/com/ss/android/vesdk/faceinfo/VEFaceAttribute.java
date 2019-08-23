package com.ss.android.vesdk.faceinfo;

import android.support.annotation.Keep;

@Keep
public class VEFaceAttribute {
    float age;
    float attractive;
    float boyProb;
    float[] expProbs;
    int expType;
    float happyScore;
    float[] racialProbs;
    int racialType;

    public float getAge() {
        return this.age;
    }

    public float getAttractive() {
        return this.attractive;
    }

    public float getBoyProb() {
        return this.boyProb;
    }

    public float[] getExpProbs() {
        return this.expProbs;
    }

    public int getExpType() {
        return this.expType;
    }

    public float getHappyScore() {
        return this.happyScore;
    }

    public int getRacialType() {
        return this.racialType;
    }

    public float[] getRacialrobs() {
        return this.racialProbs;
    }

    public void setAge(float f2) {
        this.age = f2;
    }

    public void setAttractive(float f2) {
        this.attractive = f2;
    }

    public void setBoyProb(float f2) {
        this.boyProb = f2;
    }

    public void setExpProbs(float[] fArr) {
        this.expProbs = fArr;
    }

    public void setExpType(int i) {
        this.expType = i;
    }

    public void setHappyScore(float f2) {
        this.happyScore = f2;
    }

    public void setRacialType(int i) {
        this.racialType = i;
    }

    public void setRacialrobs(float[] fArr) {
        this.racialProbs = fArr;
    }
}
