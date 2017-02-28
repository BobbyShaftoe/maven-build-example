package hello;

public class Greeter {
    public String sayHello() {
            return "Hello world!";
    }
    public String sysInfo() {
	    String free_mem     = "Free memory available to JVM: "
			    + Runtime.getRuntime().freeMemory()/1024/1024 + " (MB)";

	    String os_name      = "Operating System: "  + System.getProperty("os.name");
        String os_version   = "Version: "           + System.getProperty("os.version");
        String os_arch      = "Arch: "              + System.getProperty("os.arch");
        String java_version = "Java Version: "      + System.getProperty("java.version");
        String java_vendor  = "Java Vendor: "       + System.getProperty("java.vendor");

        String system_info  = os_name + " " + os_version + "\n" + os_arch + "\n"
                              + java_version + " " + java_vendor + "\n" + free_mem;
	    return system_info;
    }
}

