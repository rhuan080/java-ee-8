## Configuring EAP 7.2 Standalone Mode

# Configuring outbound-socket-binding
    /socket-binding-group=standard-sockets/remote-destination-outbound-socket-binding=remote-ejb:add(host=localhost,port=8080) 
    
# Configuring remote-outbound-connection

    /subsystem=remoting/remote-outbound-connection=remote-ejb-connector:add(outbound-socket-binding-ref=remote-ejb,protocol=http-remoting)
    
# Building Projects

   mvn clean package
   
# URL to access
