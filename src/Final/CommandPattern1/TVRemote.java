package Final.CommandPattern1;

public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }
}
