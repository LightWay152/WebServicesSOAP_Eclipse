
/**
 * CalculatingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice.soap.tutorial;

    /**
     *  CalculatingServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculatingServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculatingServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalculatingServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for mul method
            * override this method for handling normal response from mul operation
            */
           public void receiveResultmul(
                    webservice.soap.tutorial.CalculatingServiceStub.MulResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mul operation
           */
            public void receiveErrormul(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for add method
            * override this method for handling normal response from add operation
            */
           public void receiveResultadd(
                    webservice.soap.tutorial.CalculatingServiceStub.AddResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add operation
           */
            public void receiveErroradd(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for div method
            * override this method for handling normal response from div operation
            */
           public void receiveResultdiv(
                    webservice.soap.tutorial.CalculatingServiceStub.DivResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from div operation
           */
            public void receiveErrordiv(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for sub method
            * override this method for handling normal response from sub operation
            */
           public void receiveResultsub(
                    webservice.soap.tutorial.CalculatingServiceStub.SubResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from sub operation
           */
            public void receiveErrorsub(java.lang.Exception e) {
            }
                


    }
    