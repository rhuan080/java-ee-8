package net.rhuanrocha.ejbserver.ejbremote;

import java.io.Serializable;

@javax.ejb.Remote
public interface StatelessRemote extends Serializable {

    public String helloWorld();


}
