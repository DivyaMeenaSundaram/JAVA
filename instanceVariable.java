 class instanceVariable 				
{  
    static int m=100;		//static variable  
    void method()  		// instance method
    {     
        System.out.println(instanceVariable.m);	// to call a static variable inside instance method, use classname
    }  
    public static void main(String args[])  //static method
    {  
        instanceVariable obj = new instanceVariable();
        System.out.println(m);	// static variable can be directly called inside a static method
        obj.method();			// calling the instance method within main method
    }  
}

