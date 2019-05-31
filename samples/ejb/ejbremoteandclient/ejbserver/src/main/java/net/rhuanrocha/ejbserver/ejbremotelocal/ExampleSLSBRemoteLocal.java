package net.rhuanrocha.ejbserver.ejbremotelocal;

import javax.ejb.Stateless;

@Stateless
public class ExampleSLSBRemoteLocal implements StatelessRemote, StatelessLocal {


    @Override
    public String helloWorld() {
        return "From "+this.getClass().getName()+": Hello World.";
    }
}
