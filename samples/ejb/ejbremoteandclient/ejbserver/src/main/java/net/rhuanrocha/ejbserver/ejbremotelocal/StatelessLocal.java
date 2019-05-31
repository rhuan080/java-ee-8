package net.rhuanrocha.ejbserver.ejbremotelocal;

import java.io.Serializable;

@javax.ejb.Local
public interface StatelessLocal extends Serializable {

    public String helloWorld();
}
