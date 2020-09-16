package com.mcd.pojo;

import java.math.BigInteger;
import java.util.List;

public class PurContract {
    private BigInteger poid;
    private List<PurExpectID> purExpectIDS;
    public PurContract(BigInteger poid, List<PurExpectID> purExpectIDS) {
        this.poid = poid;
        this.purExpectIDS = purExpectIDS;
    }

    public BigInteger getPoid() {
        return poid;
    }

    public void setPoid(BigInteger poid) {
        this.poid = poid;
    }

    public List<PurExpectID> getPurExpectIDS() {
        return purExpectIDS;
    }

    public void setPurExpectIDS(List<PurExpectID> purExpectIDS) {
        this.purExpectIDS = purExpectIDS;
    }

    @Override
    public String toString() {
        return "PurContract{" +
                "poid=" + poid +
                ", purExpectIDS=" + purExpectIDS +
                '}';
    }
}
