package pl.krysinski.devices;

import java.util.List;

public interface Installer {

    boolean installAnnApp(String appName);
    boolean installAnnApp(String appName, String version);
    boolean installAnnApp(String appName, String version, String serverUrl);
    boolean installAnnApp(List<String> appNames);
}
