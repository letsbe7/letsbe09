package com.sjh.spring.letsbe09.srMng.entity

import groovy.transform.ToString

class SrMng {

    String srNo
    String srProgStat
    String srTpSeq
    String regDtm


    @Override
    public String toString() {
        return "SrMng{" +
                "srNo='" + srNo + '\'' +
                ", srProgStat='" + srProgStat + '\'' +
                ", srTpSeq='" + srTpSeq + '\'' +
                ", regDtm='" + regDtm + '\'' +
                '}';
    }
}
