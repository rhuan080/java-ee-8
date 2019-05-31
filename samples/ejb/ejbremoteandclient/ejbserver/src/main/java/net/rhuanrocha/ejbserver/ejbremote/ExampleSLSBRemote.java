package net.rhuanrocha.ejbserver.ejbremote;



import javax.ejb.Stateless;

@Stateless
public class ExampleSLSBRemote implements StatelessRemote {

    @Override
    public String helloWorld() {
        return "From "+this.getClass().getName()+": Hello World.";
    }
}
