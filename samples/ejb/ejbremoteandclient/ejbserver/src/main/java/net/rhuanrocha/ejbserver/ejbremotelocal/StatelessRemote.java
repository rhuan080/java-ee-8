package net.rhuanrocha.ejbserver.ejbremotelocal;

import java.io.Serializable;

@javax.ejb.Remote
public interface StatelessRemote extends Serializable {

    public String helloWorld();


}
